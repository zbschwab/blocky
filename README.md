# Blocky Game

_(Gamewerks corporation internal code—do not share!)_

## Credits

Primary developers: _Z Schwab, Reo Saito_

### Resources Used

+ _Original project code from CSC-207 course at <osera.cs.grinnell.edu/ttap/data-structures-labs/the-worlds-best-internship.html>_
+ _`shuffle` method uses the non-naive implementation of the Fisher-Yates shuffle algorithm from Donald Knuth_
+ _Compiled with openjdk 17.0.16 2025-07-15_
+ _written in the Java programming language_

## Changelog

commit 66631eb4c8f6ff3381fba7797268e604cc4d7bee
Author: reocraft <reocraft.creeper@gmail.com>
Date:   Mon Sep 22 00:08:03 2025 -0500

    Blocks go down properly and stack properly

commit 2afa1d281a0224c0ce269f15868c97fe6e7fc6d8
Author: Z Schwab <schwabz@grinnell.edu>
Date:   Sun Sep 21 19:13:23 2025 -0500

    first try at cycling piece types

commit 8ffe77afa0bc57a6843ed821a5989584c48c5a4f
Author: Z Schwab <schwabz@grinnell.edu>
Date:   Sun Sep 21 18:02:42 2025 -0500

    checkpoint

commit a48ac9a0f72e0a67cd49230ced9ba172071f65ae
Author: Z Schwab <schwabz@grinnell.edu>
Date:   Sun Sep 21 17:28:37 2025 -0500

    changed from - to + for getting  inside of the collides method, allowing us to set 0 as the position of activePiece in trySpawnBlock()

commit 86af0d58cf10c4743e8178140cf530d865c0cb08
Author: Z Schwab <schwabz@grinnell.edu>
Date:   Sun Sep 21 16:26:38 2025 -0500

    fixed right movement

commit 5f1d8612bca8962002b587e2dbc2aa8dff5ea17c
Author: Z Schwab <schwabz@grinnell.edu>
Date:   Sun Sep 21 16:19:33 2025 -0500

    called processMovement

commit 3d86a187e6ee14590b5628fd2e42c8a8160d1be4
Author: Z Schwab <schwabz@grinnell.edu>
Date:   Sun Sep 21 15:48:07 2025 -0500

    changed List type to Integer, deleted unecessary casting in deleteRows

commit 89dcffa6f14d371741d227d335aa113837cbbd2f
Author: Z Schwab <schwabz@grinnell.edu>
Date:   Sat Sep 20 16:25:01 2025 -0500

    wrote shuffle method

commit edd5c47065156eae7002f0f71012e31bbb42baf1
Author: Z Schwab <schwabz@grinnell.edu>
Date:   Sat Sep 20 15:34:51 2025 -0500

    initial commit

commit 590e00e09ef20cd4cae0a07a6c8f3142ec7f4aa1
Author: Z Schwab <schwabz@grinnell.edu>
Date:   Fri Sep 19 18:24:22 2025 -0500

    project notes

commit 09089e021b17fdbd9b45039588099dc7d281510f
Author: Z Schwab <schwabz@grinnell.edu>
Date:   Fri Sep 19 18:04:17 2025 -0500

    changed index bound from 5 to 4

commit 638aa214c4f3cc9146ddcc8c5969acb8852a98b0
Author: Z Schwab <schwabz@grinnell.edu>
Date:   Fri Sep 19 12:54:57 2025 -0500

    meant to commit all HashMap typechanges earlier, oops

commit c9323717ef9b72a8885c95939c79d208101fb0d9
Author: Z Schwab <schwabz@grinnell.edu>
Date:   Fri Sep 19 12:52:45 2025 -0500

    properly referenced KeyEvent statics

commit fec95f40346f81d58f0d20383e515398b632f983
Author: Z Schwab <schwabz@grinnell.edu>
Date:   Fri Sep 19 12:26:06 2025 -0500

    added type def to other instances of HasMap

commit a015ba8856b288ec588a215e51955c71bc2b9493
Author: Z Schwab <schwabz@grinnell.edu>
Date:   Fri Sep 19 12:24:08 2025 -0500

    gave List type <Board>

commit 0abc5c3188a9ebef85b8dab09d72d007a5cfbffb
Author: Z Schwab <schwabz@grinnell.edu>
Date:   Thu Sep 18 20:16:46 2025 -0500

    added type to HashMap declaration

commit d28fd22324f7d20d6a4087e8ea5e20ffaf2003ab
Author: Z Schwab <schwabz@grinnell.edu>
Date:   Thu Sep 18 19:40:27 2025 -0500

    switched java version to 17

commit afe5fb01903e400af8fa786f1a8c10dfa900169f
Author: Peter-Michael Osera <osera@cs.grinnell.edu>
Date:   Wed Feb 5 20:51:21 2025 -0600

    Update pom.xml to handle Java versioning

commit 21efa1b57d4ebede094644493aa2c7559c71883b
Author: Peter-Michael Osera <osera@cs.grinnell.edu>
Date:   Wed Feb 5 09:17:30 2025 -0600

    hey is this how I use git, what is a commit?

commit 567a65a7ce173cf4c0a232aad9c22ab38ca66331
Author: Peter-Michael Osera <osera@cs.grinnell.edu>
Date:   Wed Feb 5 09:13:20 2025 -0600

    initial commit

