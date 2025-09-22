package com.gamewerks.blocky.engine;

import java.util.Random;

import com.gamewerks.blocky.util.Constants;
import com.gamewerks.blocky.util.Position;

public class BlockyGame {
    private static final int LOCK_DELAY_LIMIT = 15;
    
    private Board board;
    private Piece activePiece;
    private Direction movement;
    
    private int lockCounter;

    public PieceKind[] pieces = PieceKind.ALL;
    public int pieceKindCounter;
    
    public BlockyGame() {
        board = new Board();
        movement = Direction.NONE;
        lockCounter = 0;
        pieceKindCounter = 0;
        trySpawnBlock();
    }
    
    private void trySpawnBlock() {
        if (activePiece == null) {
            activePiece = new Piece(getPieceKind(pieces), new Position(1, Constants.BOARD_WIDTH / 2 - 2)); //Constants.BOARD_HEIGHT - 1
            if (board.collides(activePiece)) {
                System.exit(0);
            }
        }
    }
    
    private void processMovement() {
        Position nextPos;
        switch(movement) {
        case NONE:
            nextPos = activePiece.getPosition();
            break;
        case LEFT:
            nextPos = activePiece.getPosition().add(0, -1);
            break;
        case RIGHT:
            nextPos = activePiece.getPosition().add(0, 1);
            break;
        default:
            throw new IllegalStateException("Unrecognized direction: " + movement.name());
        }
        if (!board.collides(activePiece.getLayout(), nextPos)) {
            activePiece.moveTo(nextPos);
        }
    }
    
    private void processGravity() {
        Position nextPos = activePiece.getPosition().add(1, 0);
        if (!board.collides(activePiece.getLayout(), nextPos)) {
            lockCounter = 0;
            activePiece.moveTo(nextPos);
        } else {
            if (lockCounter < LOCK_DELAY_LIMIT) {
                lockCounter += 1;
            } else {
                board.addToWell(activePiece);
                lockCounter = 0;
                activePiece = null;
            }
        }
    }
    
    private void processClearedLines() {
        board.deleteRows(board.getCompletedRows());
    }
    
    public void step() {
        trySpawnBlock();
        processGravity();
        processClearedLines();
    }
    
    public boolean[][] getWell() {
        return board.getWell();
    }
    
    public Piece getActivePiece() { return activePiece; }
    public void setDirection(Direction movement) { 
        this.movement = movement;
        processMovement();     
    } 

    /**
     * uses durstenfeld's fisher-yates alg to shuffle piece kinds in place
     * @param pieces
     */
    public void shuffle(PieceKind[] pieces) {
        //int cur = currentPiece.kind.ordinal();
        for (int i = 6; i > 0; i--) {
            Random rand = new Random();
            int j = rand.nextInt(i+1);
            PieceKind temp = pieces[i];

            pieces[i] = pieces[j];
            pieces[j] = temp;
        }
    }

    public PieceKind getPieceKind(PieceKind[] pieces) {
        if (pieceKindCounter % 7 == 0) {
            shuffle(pieces);
            pieceKindCounter = 0; // how do we reset this index globally?
            return pieces[0];
        } else {
            pieceKindCounter++;
            return pieces[pieceKindCounter];
        }
    }

    public void rotatePiece(boolean dir) { activePiece.rotate(dir); }
}
