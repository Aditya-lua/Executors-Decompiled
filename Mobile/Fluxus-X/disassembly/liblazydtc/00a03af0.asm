; BN_CTX_secure_new_ex @ 00a03af0
00a03af0	str x19,[sp, #-0x20]!
00a03af4	adrp x1,0x2c7000
00a03af8	mov x19,x0
00a03afc	add x1,x1,#0x763
00a03b00	mov w0,#0x48
00a03b04	mov w2,#0x7a
00a03b08	stp x29,x30,[sp, #0x10]
00a03b0c	add x29,sp,#0x10
00a03b10	bl 0x00c34250
00a03b14	cbz x0,0x00a03b34
00a03b18	movi v0.2D,#0x0
00a03b1c	mov w8,#0x8
00a03b20	str x19,[x0, #0x40]
00a03b24	stp q0,q0,[x0, #0x10]
00a03b28	str q0,[x0]
00a03b2c	str w8,[x0, #0x3c]
00a03b30	b 0x00a03b68
00a03b34	bl 0x00c342a0
00a03b38	adrp x0,0x2c7000
00a03b3c	adrp x2,0x2d5000
00a03b40	add x0,x0,#0x763
00a03b44	add x2,x2,#0xad9
00a03b48	mov w1,#0x7b
00a03b4c	bl 0x00c342b0
00a03b50	mov w1,#0x100
00a03b54	orr w0,wzr,#0x3
00a03b58	movk w1,#0xc, LSL #16
00a03b5c	mov x2,xzr
00a03b60	bl 0x00c342c0
00a03b64	mov x0,xzr
00a03b68	ldp x29,x30,[sp, #0x10]
00a03b6c	ldr x19,[sp], #0x20
00a03b70	ret
