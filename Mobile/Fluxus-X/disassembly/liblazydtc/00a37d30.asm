; ossl_ec_GFp_nist_group_set_curve @ 00a37d30
00a37d30	stp x24,x23,[sp, #-0x40]!
00a37d34	stp x22,x21,[sp, #0x10]
00a37d38	stp x20,x19,[sp, #0x20]
00a37d3c	mov x19,x4
00a37d40	mov x21,x3
00a37d44	mov x22,x2
00a37d48	mov x23,x1
00a37d4c	mov x24,x0
00a37d50	mov x20,xzr
00a37d54	stp x29,x30,[sp, #0x30]
00a37d58	add x29,sp,#0x30
00a37d5c	cbnz x4,0x00a37d74
00a37d60	ldr x0,[x24, #0xa8]
00a37d64	bl 0x00c38a60
00a37d68	mov x19,x0
00a37d6c	mov x20,x0
00a37d70	cbz x0,0x00a37e18
00a37d74	mov x0,x19
00a37d78	bl 0x00c38a90
00a37d7c	bl 0x00c390a0
00a37d80	mov x1,x23
00a37d84	bl 0x00c369c0
00a37d88	cbz w0,0x00a37e00
00a37d8c	bl 0x00c390b0
00a37d90	mov x1,x23
00a37d94	bl 0x00c369c0
00a37d98	cbz w0,0x00a37e0c
00a37d9c	bl 0x00c390c0
00a37da0	mov x1,x23
00a37da4	bl 0x00c369c0
00a37da8	cbz w0,0x00a37e20
00a37dac	bl 0x00c390d0
00a37db0	mov x1,x23
00a37db4	bl 0x00c369c0
00a37db8	cbz w0,0x00a37e2c
00a37dbc	bl 0x00c390e0
00a37dc0	mov x1,x23
00a37dc4	bl 0x00c369c0
00a37dc8	cbz w0,0x00a37e38
00a37dcc	bl 0x00c342a0
00a37dd0	adrp x0,0x2d3000
00a37dd4	adrp x2,0x2a2000
00a37dd8	add x0,x0,#0xa4b
00a37ddc	add x2,x2,#0x285
00a37de0	mov w1,#0x74
00a37de4	bl 0x00c342b0
00a37de8	mov w0,#0x10
00a37dec	mov w1,#0x87
00a37df0	mov x2,xzr
00a37df4	bl 0x00c342c0
00a37df8	mov w21,wzr
00a37dfc	b 0x00a37e60
00a37e00	adrp x8,0xcb5000
00a37e04	ldr x8,[x8, #0x420]
00a37e08	b 0x00a37e40
00a37e0c	adrp x8,0xcb5000
00a37e10	ldr x8,[x8, #0x428]
00a37e14	b 0x00a37e40
00a37e18	mov w21,wzr
00a37e1c	b 0x00a37e70
00a37e20	adrp x8,0xcb5000
00a37e24	ldr x8,[x8, #0x430]
00a37e28	b 0x00a37e40
00a37e2c	adrp x8,0xcb5000
00a37e30	ldr x8,[x8, #0x438]
00a37e34	b 0x00a37e40
00a37e38	adrp x8,0xcb5000
00a37e3c	ldr x8,[x8, #0x440]
00a37e40	mov x0,x24
00a37e44	mov x1,x23
00a37e48	mov x2,x22
00a37e4c	mov x3,x21
00a37e50	mov x4,x19
00a37e54	str x8,[x24, #0x88]
00a37e58	bl 0x00c3b210
00a37e5c	mov w21,w0
00a37e60	mov x0,x19
00a37e64	bl 0x00c38a20
00a37e68	mov x0,x20
00a37e6c	bl 0x00c38a30
00a37e70	mov w0,w21
00a37e74	ldp x29,x30,[sp, #0x30]
00a37e78	ldp x20,x19,[sp, #0x20]
00a37e7c	ldp x22,x21,[sp, #0x10]
00a37e80	ldp x24,x23,[sp], #0x40
00a37e84	ret
