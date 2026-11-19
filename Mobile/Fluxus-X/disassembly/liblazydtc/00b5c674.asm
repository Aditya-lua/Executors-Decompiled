; FUN_00b5c674 @ 00b5c674
00b5c674	stp x20,x19,[sp, #-0x20]!
00b5c678	stp x29,x30,[sp, #0x10]
00b5c67c	add x29,sp,#0x10
00b5c680	cbz x0,0x00b5c6d0
00b5c684	mov x20,x1
00b5c688	adrp x1,0x2ca000
00b5c68c	mov x19,x0
00b5c690	add x1,x1,#0x1b4
00b5c694	mov x0,x20
00b5c698	bl 0x00c3e8c0
00b5c69c	cbz x0,0x00b5c6ac
00b5c6a0	ldp x1,x2,[x19, #0x150]
00b5c6a4	bl 0x00c3dab0
00b5c6a8	cbz w0,0x00b5c6d0
00b5c6ac	adrp x1,0x29d000
00b5c6b0	add x1,x1,#0xe2e
00b5c6b4	mov x0,x20
00b5c6b8	bl 0x00c3e8c0
00b5c6bc	cbz x0,0x00b5c6cc
00b5c6c0	add x1,x19,#0x19
00b5c6c4	bl 0x00c3dad0
00b5c6c8	cbz w0,0x00b5c6d0
00b5c6cc	mov w0,#0x1
00b5c6d0	ldp x29,x30,[sp, #0x10]
00b5c6d4	ldp x20,x19,[sp], #0x20
00b5c6d8	ret
