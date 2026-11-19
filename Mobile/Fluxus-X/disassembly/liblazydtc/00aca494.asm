; FUN_00aca494 @ 00aca494
00aca494	stp x29,x30,[sp, #-0x10]!
00aca498	mov x0,xzr
00aca49c	mov x29,sp
00aca4a0	bl 0x00c3f920
00aca4a4	cbz x0,0x00aca4b4
00aca4a8	bl 0x00c3d1a0
00aca4ac	cmp w0,#0x1
00aca4b0	cset w0,eq
00aca4b4	ldp x29,x30,[sp], #0x10
00aca4b8	ret
