; ossl_provider_new @ 00aa2d78
00aa2d78	stp x24,x23,[sp, #-0x40]!
00aa2d7c	mov x23,x2
00aa2d80	adrp x2,0xc6d000
00aa2d84	stp x20,x19,[sp, #0x20]
00aa2d88	mov x20,x1
00aa2d8c	add x2,x2,#0x4c8
00aa2d90	mov w1,#0x1
00aa2d94	stp x22,x21,[sp, #0x10]
00aa2d98	stp x29,x30,[sp, #0x30]
00aa2d9c	add x29,sp,#0x30
00aa2da0	mov x19,x0
00aa2da4	bl 0x00c3b520
00aa2da8	cbz x0,0x00aa2dbc
00aa2dac	cbz x23,0x00aa2df8
00aa2db0	mov x24,xzr
00aa2db4	mov x22,xzr
00aa2db8	b 0x00aa2ea0
00aa2dbc	bl 0x00c342a0
00aa2dc0	adrp x0,0x2aa000
00aa2dc4	adrp x2,0x2bb000
00aa2dc8	add x0,x0,#0x4b5
00aa2dcc	add x2,x2,#0xf7d
00aa2dd0	mov w1,#0x156
00aa2dd4	bl 0x00c342b0
00aa2dd8	mov w8,#0x100
00aa2ddc	movk w8,#0xc, LSL #16
00aa2de0	add w1,w8,#0x3
00aa2de4	orr w0,wzr,#0xf
00aa2de8	mov x2,xzr
00aa2dec	bl 0x00c342c0
00aa2df0	mov x20,xzr
00aa2df4	b 0x00aa2efc
00aa2df8	adrp x8,0xcb5000
00aa2dfc	ldr x8,[x8, #0x6a8]
00aa2e00	mov x21,x0
00aa2e04	ldr x0,[x8]
00aa2e08	cbz x0,0x00aa2e28
00aa2e0c	add x24,x8,#0x18
00aa2e10	mov x1,x20
00aa2e14	bl 0x00c301f0
00aa2e18	cbz w0,0x00aa2e78
00aa2e1c	ldr x0,[x24, #0x10]
00aa2e20	add x24,x24,#0x28
00aa2e24	cbnz x0,0x00aa2e10
00aa2e28	ldr x0,[x21, #0x20]
00aa2e2c	bl 0x00c35680
00aa2e30	cbz w0,0x00aa2df0
00aa2e34	ldr x22,[x21, #0x38]
00aa2e38	cbz x22,0x00aa2e84
00aa2e3c	ldr x8,[x21, #0x30]
00aa2e40	mov x23,xzr
00aa2e44	add x24,x8,#0x10
00aa2e48	ldur x0,[x24, #-0x10]
00aa2e4c	mov x1,x20
00aa2e50	bl 0x00c301f0
00aa2e54	cbz w0,0x00aa2e90
00aa2e58	add x23,x23,#0x1
00aa2e5c	cmp x23,x22
00aa2e60	add x24,x24,#0x28
00aa2e64	b.cc 0x00aa2e48
00aa2e68	mov x24,xzr
00aa2e6c	mov x23,xzr
00aa2e70	mov x22,xzr
00aa2e74	b 0x00aa2e98
00aa2e78	ldp x22,x23,[x24, #-0x10]
00aa2e7c	ldr x24,[x24]
00aa2e80	b 0x00aa2ea0
00aa2e84	mov x24,xzr
00aa2e88	mov x23,xzr
00aa2e8c	b 0x00aa2e98
00aa2e90	ldp x22,x23,[x24, #-0x8]
00aa2e94	ldr x24,[x24, #0x8]
00aa2e98	ldr x0,[x21, #0x20]
00aa2e9c	bl 0x00c35690
00aa2ea0	mov x0,x20
00aa2ea4	mov x1,x23
00aa2ea8	mov x2,x24
00aa2eac	bl 0x00aa2f50
00aa2eb0	mov x20,x0
00aa2eb4	cbz x0,0x00aa2efc
00aa2eb8	ldr x0,[x20, #0x30]
00aa2ebc	adrp x1,0x2aa000
00aa2ec0	add x1,x1,#0x4b5
00aa2ec4	mov w2,#0x2ed
00aa2ec8	bl 0x00c32310
00aa2ecc	str xzr,[x20, #0x30]
00aa2ed0	cbz x22,0x00aa2ef0
00aa2ed4	adrp x1,0x2aa000
00aa2ed8	add x1,x1,#0x4b5
00aa2edc	mov w2,#0x2f1
00aa2ee0	mov x0,x22
00aa2ee4	bl 0x00c34600
00aa2ee8	str x0,[x20, #0x30]
00aa2eec	cbz x0,0x00aa2f14
00aa2ef0	str x19,[x20, #0x50]
00aa2ef4	bl 0x00c3be00
00aa2ef8	str w0,[x20, #0x60]
00aa2efc	mov x0,x20
00aa2f00	ldp x29,x30,[sp, #0x30]
00aa2f04	ldp x20,x19,[sp, #0x20]
00aa2f08	ldp x22,x21,[sp, #0x10]
00aa2f0c	ldp x24,x23,[sp], #0x40
00aa2f10	ret
00aa2f14	bl 0x00c342a0
00aa2f18	adrp x0,0x2aa000
00aa2f1c	adrp x2,0x2d6000
00aa2f20	add x0,x0,#0x4b5
00aa2f24	add x2,x2,#0x33
00aa2f28	mov w1,#0x2f3
00aa2f2c	bl 0x00c342b0
00aa2f30	mov w1,#0x100
00aa2f34	orr w0,wzr,#0xf
00aa2f38	movk w1,#0xc, LSL #16
00aa2f3c	mov x2,xzr
00aa2f40	bl 0x00c342c0
00aa2f44	mov x0,x20
00aa2f48	bl 0x00aa2c44
00aa2f4c	b 0x00aa2df0
