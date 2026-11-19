; FUN_00b4c3b0 @ 00b4c3b0
00b4c3b0	cbz x0,0x00b4c414
00b4c3b4	stp x20,x19,[sp, #-0x20]!
00b4c3b8	stp x29,x30,[sp, #0x10]
00b4c3bc	mov x19,x0
00b4c3c0	ldr x0,[x0, #0x50]
00b4c3c4	adrp x20,0x2b0000
00b4c3c8	add x20,x20,#0xe65
00b4c3cc	mov w2,#0x31f
00b4c3d0	mov x1,x20
00b4c3d4	add x29,sp,#0x10
00b4c3d8	bl 0x00c32310
00b4c3dc	ldr x0,[x19, #0x58]
00b4c3e0	mov w2,#0x320
00b4c3e4	mov x1,x20
00b4c3e8	bl 0x00c32310
00b4c3ec	ldp x0,x1,[x19, #0x28]
00b4c3f0	mov w3,#0x321
00b4c3f4	mov x2,x20
00b4c3f8	bl 0x00c345e0
00b4c3fc	ldp x29,x30,[sp, #0x10]
00b4c400	mov w2,#0x322
00b4c404	mov x0,x19
00b4c408	mov x1,x20
00b4c40c	ldp x20,x19,[sp], #0x20
00b4c410	b 0x00c32310
00b4c414	ret
