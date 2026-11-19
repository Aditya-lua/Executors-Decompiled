; BN_CTX_new_ex @ 00a03a00
00a03a00	str x19,[sp, #-0x20]!
00a03a04	adrp x1,0x2c7000
00a03a08	mov x19,x0
00a03a0c	add x1,x1,#0x763
00a03a10	mov w0,#0x48
00a03a14	mov w2,#0x7a
00a03a18	stp x29,x30,[sp, #0x10]
00a03a1c	add x29,sp,#0x10
00a03a20	bl 0x00c34250
00a03a24	cbz x0,0x00a03a3c
00a03a28	movi v0.2D,#0x0
00a03a2c	stp q0,q0,[x0, #0x10]
00a03a30	str q0,[x0]
00a03a34	str x19,[x0, #0x40]
00a03a38	b 0x00a03a70
00a03a3c	bl 0x00c342a0
00a03a40	adrp x0,0x2c7000
00a03a44	adrp x2,0x2d5000
00a03a48	add x0,x0,#0x763
00a03a4c	add x2,x2,#0xad9
00a03a50	mov w1,#0x7b
00a03a54	bl 0x00c342b0
00a03a58	mov w1,#0x100
00a03a5c	orr w0,wzr,#0x3
00a03a60	movk w1,#0xc, LSL #16
00a03a64	mov x2,xzr
00a03a68	bl 0x00c342c0
00a03a6c	mov x0,xzr
00a03a70	ldp x29,x30,[sp, #0x10]
00a03a74	ldr x19,[sp], #0x20
00a03a78	ret
