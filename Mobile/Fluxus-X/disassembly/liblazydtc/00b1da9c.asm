; i2d_DSA_PUBKEY @ 00b1da9c
00b1da9c	str x21,[sp, #-0x30]!
00b1daa0	stp x20,x19,[sp, #0x10]
00b1daa4	stp x29,x30,[sp, #0x20]
00b1daa8	add x29,sp,#0x20
00b1daac	cbz x0,0x00b1db28
00b1dab0	mov x19,x1
00b1dab4	mov x21,x0
00b1dab8	bl 0x00c36450
00b1dabc	cbz x0,0x00b1daf4
00b1dac0	mov w1,#0x74
00b1dac4	mov x2,x21
00b1dac8	mov x20,x0
00b1dacc	bl 0x00c39b70
00b1dad0	mov x0,x20
00b1dad4	mov x1,x19
00b1dad8	bl 0x00b1d40c
00b1dadc	mov w19,w0
00b1dae0	mov x0,x20
00b1dae4	str xzr,[x20, #0x20]
00b1dae8	bl 0x00c32450
00b1daec	mov w0,w19
00b1daf0	b 0x00b1db28
00b1daf4	bl 0x00c342a0
00b1daf8	adrp x0,0x2bc000
00b1dafc	adrp x2,0x2be000
00b1db00	add x0,x0,#0x79f
00b1db04	add x2,x2,#0x68b
00b1db08	mov w1,#0x30c
00b1db0c	bl 0x00c342b0
00b1db10	mov w1,#0x100
00b1db14	mov w0,#0xd
00b1db18	movk w1,#0xc, LSL #16
00b1db1c	mov x2,xzr
00b1db20	bl 0x00c342c0
00b1db24	mov w0,#0xffffffff
00b1db28	ldp x29,x30,[sp, #0x20]
00b1db2c	ldp x20,x19,[sp, #0x10]
00b1db30	ldr x21,[sp], #0x30
00b1db34	ret
