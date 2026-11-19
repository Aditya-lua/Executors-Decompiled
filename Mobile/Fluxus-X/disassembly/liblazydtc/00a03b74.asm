; BN_CTX_secure_new @ 00a03b74
00a03b74	stp x29,x30,[sp, #-0x10]!
00a03b78	adrp x1,0x2c7000
00a03b7c	add x1,x1,#0x763
00a03b80	mov w0,#0x48
00a03b84	mov w2,#0x7a
00a03b88	mov x29,sp
00a03b8c	bl 0x00c34250
00a03b90	cbz x0,0x00a03bb4
00a03b94	movi v0.2D,#0x0
00a03b98	mov w8,#0x8
00a03b9c	str xzr,[x0, #0x40]
00a03ba0	stp q0,q0,[x0, #0x10]
00a03ba4	str q0,[x0]
00a03ba8	str w8,[x0, #0x3c]
00a03bac	ldp x29,x30,[sp], #0x10
00a03bb0	ret
00a03bb4	bl 0x00c342a0
00a03bb8	adrp x0,0x2c7000
00a03bbc	adrp x2,0x2d5000
00a03bc0	add x0,x0,#0x763
00a03bc4	add x2,x2,#0xad9
00a03bc8	mov w1,#0x7b
00a03bcc	bl 0x00c342b0
00a03bd0	mov w1,#0x100
00a03bd4	orr w0,wzr,#0x3
00a03bd8	movk w1,#0xc, LSL #16
00a03bdc	mov x2,xzr
00a03be0	bl 0x00c342c0
00a03be4	mov x0,xzr
00a03be8	ldp x29,x30,[sp], #0x10
00a03bec	ret
