; ZSTD_createDStream @ 00bb1db8
00bb1db8	stp x29,x30,[sp, #-0x10]!
00bb1dbc	mov x29,sp
00bb1dc0	mov w0,#0x76e8
00bb1dc4	movk w0,#0x1, LSL #16
00bb1dc8	bl 0x00c308d0
00bb1dcc	cbz x0,0x00bb1e54
00bb1dd0	fmov d0,xzr
00bb1dd4	movi v1.2D,#0x0
00bb1dd8	mov w8,#0x76d8
00bb1ddc	movk w8,#0x1, LSL #16
00bb1de0	mov w9,#0x75e0
00bb1de4	mov w10,#0x75e8
00bb1de8	str xzr,[x0, x8#0x0]
00bb1dec	mov w8,#0x761c
00bb1df0	add x9,x0,x9
00bb1df4	mov v2.16B,v0.16B
00bb1df8	add x8,x0,x8
00bb1dfc	str xzr,[x0, #0x75d8]
00bb1e00	str q1,[x8]
00bb1e04	str wzr,[x8, #0x10]
00bb1e08	mov w8,#0x1
00bb1e0c	mov v2.D[0x1],v0.D[0x0]
00bb1e10	fmov d0,d0
00bb1e14	str w8,[x9]
00bb1e18	mov w8,#0x7608
00bb1e1c	str xzr,[x0, #0x74d8]
00bb1e20	str xzr,[x0, #0x7648]
00bb1e24	str q0,[x0,x8]
00bb1e28	mov w8,#0x1
00bb1e2c	movk w8,#0x800, LSL #16
00bb1e30	stur d1,[x9, #0x1c]
00bb1e34	str q2,[x0,x10]
00bb1e38	str xzr,[x0, #0x75b0]
00bb1e3c	str xzr,[x0, #0x75c0]
00bb1e40	str xzr,[x0, #0x75b8]
00bb1e44	str x8,[x0, #0x7638]
00bb1e48	stur d1,[x9, #0x8c]
00bb1e4c	str d1,[x0, #0x7598]
00bb1e50	str wzr,[x9, #0x38]
00bb1e54	ldp x29,x30,[sp], #0x10
00bb1e58	ret
