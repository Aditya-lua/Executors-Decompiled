; EVP_EncodeBlock @ 00a59d2c
00a59d2c	cmp w2,#0x1
00a59d30	mov x8,x0
00a59d34	b.lt 0x00a59dbc
00a59d38	adrp x9,0x2c0000
00a59d3c	mov x0,xzr
00a59d40	add x10,x1,#0x1
00a59d44	add x9,x9,#0xfc9
00a59d48	ldurb w12,[x10, #-0x1]
00a59d4c	cmp w2,#0x2
00a59d50	lsl x11,x12,#0x10
00a59d54	b.le 0x00a59dc8
00a59d58	ldrb w13,[x10]
00a59d5c	ldrb w14,[x10, #0x1]
00a59d60	lsr x12,x12,#0x2
00a59d64	ldrb w12,[x9, x12]
00a59d68	lsl w15,w13,#0x8
00a59d6c	orr w11,w15,w11
00a59d70	and x15,x14,#0x3f
00a59d74	ubfx x11,x11,#0xc,#0x6
00a59d78	bfm w14,w13,#0x18,#0x7
00a59d7c	ubfx x14,x14,#0x6,#0x6
00a59d80	ldrb w15,[x9, x15]
00a59d84	ldrb w11,[x9, x11]
00a59d88	ldrb w14,[x9, x14]
00a59d8c	add x13,x8,x0
00a59d90	subs w2,w2,#0x3
00a59d94	add x0,x0,#0x4
00a59d98	add x10,x10,#0x3
00a59d9c	strb w12,[x13]
00a59da0	strb w15,[x13, #0x3]
00a59da4	strb w11,[x13, #0x1]
00a59da8	strb w14,[x13, #0x2]
00a59dac	b.ne 0x00a59d48
00a59db0	add x8,x8,x0
00a59db4	strb wzr,[x8]
00a59db8	ret
00a59dbc	mov w0,wzr
00a59dc0	strb wzr,[x8]
00a59dc4	ret
00a59dc8	b.ne 0x00a59dd4
00a59dcc	ldrb w10,[x10]
00a59dd0	orr x11,x11,x10, LSL #0x8
00a59dd4	ubfx x12,x11,#0xc,#0x6
00a59dd8	ubfx x10,x11,#0x12,#0x6
00a59ddc	ldrb w12,[x9, x12]
00a59de0	ldrb w13,[x9, x10]
00a59de4	add x8,x8,x0
00a59de8	mov w10,#0x3d
00a59dec	cmp w2,#0x1
00a59df0	strb w12,[x8, #0x1]
00a59df4	mov w12,#0x3d
00a59df8	strb w13,[x8]
00a59dfc	b.eq 0x00a59e08
00a59e00	ubfx x11,x11,#0x6,#0x6
00a59e04	ldrb w12,[x9, x11]
00a59e08	add w0,w0,#0x4
00a59e0c	strb w12,[x8, #0x2]
00a59e10	strb w10,[x8, #0x3]
00a59e14	strb wzr,[x8, #0x4]!
00a59e18	ret
