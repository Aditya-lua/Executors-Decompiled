; OSSL_STORE_LOADER_get0_provider @ 00aeb48c
00aeb48c	cbz x0,0x00aeb498
00aeb490	ldr x0,[x0, #0x60]
00aeb494	ret
00aeb498	stp x29,x30,[sp, #-0x10]!
00aeb49c	mov x29,sp
00aeb4a0	bl 0x00c342a0
00aeb4a4	adrp x0,0x2d0000
00aeb4a8	adrp x2,0x2a6000
00aeb4ac	add x0,x0,#0x406
00aeb4b0	add x2,x2,#0x7b9
00aeb4b4	orr w1,wzr,#0x1c0
00aeb4b8	bl 0x00c342b0
00aeb4bc	mov w1,#0x102
00aeb4c0	mov w0,#0x2c
00aeb4c4	movk w1,#0xc, LSL #16
00aeb4c8	mov x2,xzr
00aeb4cc	bl 0x00c342c0
00aeb4d0	mov x0,xzr
00aeb4d4	ldp x29,x30,[sp], #0x10
00aeb4d8	ret
