; BN_CTX_new @ 00a03a7c
00a03a7c	stp x29,x30,[sp, #-0x10]!
00a03a80	adrp x1,0x2c7000
00a03a84	add x1,x1,#0x763
00a03a88	mov w0,#0x48
00a03a8c	mov w2,#0x7a
00a03a90	mov x29,sp
00a03a94	bl 0x00c34250
00a03a98	cbz x0,0x00a03ab4
00a03a9c	movi v0.2D,#0x0
00a03aa0	stp q0,q0,[x0, #0x10]
00a03aa4	str q0,[x0]
00a03aa8	str xzr,[x0, #0x40]
00a03aac	ldp x29,x30,[sp], #0x10
00a03ab0	ret
00a03ab4	bl 0x00c342a0
00a03ab8	adrp x0,0x2c7000
00a03abc	adrp x2,0x2d5000
00a03ac0	add x0,x0,#0x763
00a03ac4	add x2,x2,#0xad9
00a03ac8	mov w1,#0x7b
00a03acc	bl 0x00c342b0
00a03ad0	mov w1,#0x100
00a03ad4	orr w0,wzr,#0x3
00a03ad8	movk w1,#0xc, LSL #16
00a03adc	mov x2,xzr
00a03ae0	bl 0x00c342c0
00a03ae4	mov x0,xzr
00a03ae8	ldp x29,x30,[sp], #0x10
00a03aec	ret
