; ZSTD_decompress @ 00bb0e10
00bb0e10	stp x29,x30,[sp, #-0x40]!
00bb0e14	stp x24,x23,[sp, #0x10]
00bb0e18	stp x22,x21,[sp, #0x20]
00bb0e1c	stp x20,x19,[sp, #0x30]
00bb0e20	mov x29,sp
00bb0e24	mov x22,x0
00bb0e28	mov w0,#0x76e8
00bb0e2c	mov x19,x3
00bb0e30	movk w0,#0x1, LSL #16
00bb0e34	mov x20,x2
00bb0e38	mov x21,x1
00bb0e3c	bl 0x00c308d0
00bb0e40	cbz x0,0x00bb0f1c
00bb0e44	fmov d0,xzr
00bb0e48	movi v2.2D,#0x0
00bb0e4c	mov w8,#0x76d8
00bb0e50	movk w8,#0x1, LSL #16
00bb0e54	mov w9,#0x75e0
00bb0e58	mov w10,#0x761c
00bb0e5c	add x24,x0,x9
00bb0e60	str xzr,[x0, x8#0x0]
00bb0e64	add x8,x0,x10
00bb0e68	mov v1.16B,v0.16B
00bb0e6c	mov w9,#0x75b0
00bb0e70	str wzr,[x8, #0x10]
00bb0e74	str xzr,[x0, #0x75d8]
00bb0e78	mov x23,x0
00bb0e7c	str xzr,[x0, #0x74d8]
00bb0e80	mov v1.D[0x1],v0.D[0x0]
00bb0e84	mov v0.D[0x1],v2.D[0x0]
00bb0e88	str xzr,[x0, #0x7648]
00bb0e8c	str xzr,[x0, #0x75b0]
00bb0e90	str wzr,[x24, #0x1c]
00bb0e94	str wzr,[x24, #0x38]
00bb0e98	str q1,[x8]
00bb0e9c	add x8,x0,x9
00bb0ea0	stur q1,[x8, #0x8]
00bb0ea4	mov w8,#0x1
00bb0ea8	movi v1.2D,#0x0
00bb0eac	str w8,[x24]
00bb0eb0	mov w8,#0x7608
00bb0eb4	str q0,[x0,x8]
00bb0eb8	mov w8,#0x1
00bb0ebc	movk w8,#0x800, LSL #16
00bb0ec0	str x8,[x0, #0x7638]
00bb0ec4	str d1,[x0, #0x7598]
00bb0ec8	mov x0,xzr
00bb0ecc	stur d1,[x24, #0x8c]
00bb0ed0	bl 0x00c435b0
00bb0ed4	movi v0.2D,#0x0
00bb0ed8	mov w8,#0x75e8
00bb0edc	mov x0,x23
00bb0ee0	mov x1,x22
00bb0ee4	mov x2,x21
00bb0ee8	mov x3,x20
00bb0eec	mov x4,x19
00bb0ef0	mov x5,xzr
00bb0ef4	mov x6,xzr
00bb0ef8	mov x7,xzr
00bb0efc	str wzr,[x24, #0x20]
00bb0f00	str q0,[x23,x8]
00bb0f04	bl 0x00bb0774
00bb0f08	mov x19,x0
00bb0f0c	mov x0,x23
00bb0f10	bl 0x00c435e0
00bb0f14	mov x0,x19
00bb0f18	b 0x00bb0f20
00bb0f1c	mov x0,#-0x40
00bb0f20	ldp x20,x19,[sp, #0x30]
00bb0f24	ldp x22,x21,[sp, #0x20]
00bb0f28	ldp x24,x23,[sp, #0x10]
00bb0f2c	ldp x29,x30,[sp], #0x40
00bb0f30	ret
