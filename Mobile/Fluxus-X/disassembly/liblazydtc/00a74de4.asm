; EVP_PKEY_meth_new @ 00a74de4
00a74de4	stp x20,x19,[sp, #-0x20]!
00a74de8	mov w19,w1
00a74dec	adrp x1,0x2c3000
00a74df0	mov w20,w0
00a74df4	add x1,x1,#0xa9f
00a74df8	mov w0,#0x100
00a74dfc	mov w2,#0x82
00a74e00	stp x29,x30,[sp, #0x10]
00a74e04	add x29,sp,#0x10
00a74e08	bl 0x00c34250
00a74e0c	cbz x0,0x00a74e1c
00a74e10	orr w8,w19,#0x1
00a74e14	stp w20,w8,[x0]
00a74e18	b 0x00a74e50
00a74e1c	bl 0x00c342a0
00a74e20	adrp x0,0x2c3000
00a74e24	adrp x2,0x2a0000
00a74e28	add x0,x0,#0xa9f
00a74e2c	add x2,x2,#0x36b
00a74e30	mov w1,#0x84
00a74e34	bl 0x00c342b0
00a74e38	mov w1,#0x100
00a74e3c	orr w0,wzr,#0x6
00a74e40	movk w1,#0xc, LSL #16
00a74e44	mov x2,xzr
00a74e48	bl 0x00c342c0
00a74e4c	mov x0,xzr
00a74e50	ldp x29,x30,[sp, #0x10]
00a74e54	ldp x20,x19,[sp], #0x20
00a74e58	ret
