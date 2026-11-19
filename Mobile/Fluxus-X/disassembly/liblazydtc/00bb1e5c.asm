; ZSTD_initStaticDStream @ 00bb1e5c
00bb1e5c	mov w8,#0x76e8
00bb1e60	mov x2,xzr
00bb1e64	movk w8,#0x1, LSL #16
00bb1e68	cmp x1,x8
00bb1e6c	b.cc 0x00bb1f04
00bb1e70	and x8,x0,#0x7
00bb1e74	cbnz x8,0x00bb1f04
00bb1e78	fmov d0,xzr
00bb1e7c	movi v2.2D,#0x0
00bb1e80	mov w8,#0x76d8
00bb1e84	movi v1.2D,#0x0
00bb1e88	movk w8,#0x1, LSL #16
00bb1e8c	mov w10,#0x761c
00bb1e90	mov w9,#0x75e0
00bb1e94	str xzr,[x0, x8#0x0]
00bb1e98	add x8,x0,x10
00bb1e9c	mov v3.16B,v0.16B
00bb1ea0	add x9,x0,x9
00bb1ea4	str wzr,[x8, #0x10]
00bb1ea8	mov w10,#0x75e8
00bb1eac	mov x2,x0
00bb1eb0	str xzr,[x0, #0x74d8]
00bb1eb4	str q1,[x8]
00bb1eb8	mov w8,#0x1
00bb1ebc	mov v3.D[0x1],v0.D[0x0]
00bb1ec0	mov v0.D[0x1],v2.D[0x0]
00bb1ec4	str w8,[x9]
00bb1ec8	mov w8,#0x7608
00bb1ecc	str xzr,[x0, #0x7648]
00bb1ed0	stur d1,[x9, #0x1c]
00bb1ed4	str q0,[x0,x8]
00bb1ed8	mov w8,#0x1
00bb1edc	movk w8,#0x800, LSL #16
00bb1ee0	str q3,[x0,x10]
00bb1ee4	str x8,[x0, #0x7638]
00bb1ee8	add x8,x0,#0x17, LSL #12
00bb1eec	add x8,x8,#0x6e8
00bb1ef0	stur d1,[x9, #0x8c]
00bb1ef4	str d1,[x0, #0x7598]
00bb1ef8	str wzr,[x9, #0x38]
00bb1efc	str x1,[x0, #0x75d8]
00bb1f00	str x8,[x0, #0x7620]
00bb1f04	mov x0,x2
00bb1f08	ret
