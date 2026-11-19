; ASN1_item_i2d_fp @ 00ab9d28
00ab9d28	stp x22,x21,[sp, #-0x30]!
00ab9d2c	stp x20,x19,[sp, #0x10]
00ab9d30	stp x29,x30,[sp, #0x20]
00ab9d34	add x29,sp,#0x20
00ab9d38	mov x19,x2
00ab9d3c	mov x22,x1
00ab9d40	mov x20,x0
00ab9d44	bl 0x00c32270
00ab9d48	bl 0x00c32240
00ab9d4c	cbz x0,0x00ab9d88
00ab9d50	mov w1,#0x6a
00ab9d54	mov x2,xzr
00ab9d58	mov x3,x22
00ab9d5c	mov x21,x0
00ab9d60	bl 0x00c321a0
00ab9d64	mov x0,x20
00ab9d68	mov x1,x21
00ab9d6c	mov x2,x19
00ab9d70	bl 0x00ab9dcc
00ab9d74	mov w19,w0
00ab9d78	mov x0,x21
00ab9d7c	bl 0x00c31a40
00ab9d80	mov w0,w19
00ab9d84	b 0x00ab9dbc
00ab9d88	bl 0x00c342a0
00ab9d8c	adrp x0,0x2d0000
00ab9d90	adrp x2,0x2a2000
00ab9d94	add x0,x0,#0x263
00ab9d98	add x2,x2,#0xb6d
00ab9d9c	mov w1,#0x4d
00ab9da0	bl 0x00c342b0
00ab9da4	mov w1,#0x7
00ab9da8	mov w0,#0xd
00ab9dac	movk w1,#0x8, LSL #16
00ab9db0	mov x2,xzr
00ab9db4	bl 0x00c342c0
00ab9db8	mov w0,wzr
00ab9dbc	ldp x29,x30,[sp, #0x20]
00ab9dc0	ldp x20,x19,[sp, #0x10]
00ab9dc4	ldp x22,x21,[sp], #0x30
00ab9dc8	ret
