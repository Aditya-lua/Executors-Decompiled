; ZSTD_createDStream_advanced @ 00bb1f0c
00bb1f0c	stp x29,x30,[sp, #-0x30]!
00bb1f10	str x21,[sp, #0x10]
00bb1f14	stp x20,x19,[sp, #0x20]
00bb1f18	mov x29,sp
00bb1f1c	ldp x20,x21,[x0]
00bb1f20	cmp x20,#0x0
00bb1f24	cset w8,eq
00bb1f28	cmp x21,#0x0
00bb1f2c	cset w9,eq
00bb1f30	eor w8,w8,w9
00bb1f34	tbz w8,#0x0,0x00bb1f40
00bb1f38	mov x0,xzr
00bb1f3c	b 0x00bb1fe4
00bb1f40	ldr x19,[x0, #0x10]
00bb1f44	cbz x20,0x00bb1ff4
00bb1f48	mov w1,#0x76e8
00bb1f4c	mov x0,x19
00bb1f50	movk w1,#0x1, LSL #16
00bb1f54	blr x20
00bb1f58	cbz x0,0x00bb1fe4
00bb1f5c	fmov d0,xzr
00bb1f60	mov w9,#0x75e8
00bb1f64	mov w8,#0x75e0
00bb1f68	movi v2.2D,#0x0
00bb1f6c	add x8,x0,x8
00bb1f70	mov w10,#0x761c
00bb1f74	add x10,x0,x10
00bb1f78	str x20,[x0, #0x75b0]
00bb1f7c	mov v1.16B,v0.16B
00bb1f80	str x21,[x0, #0x75b8]
00bb1f84	str x19,[x0, #0x75c0]
00bb1f88	str xzr,[x0, #0x75d8]
00bb1f8c	mov v1.D[0x1],v0.D[0x0]
00bb1f90	str xzr,[x0, #0x74d8]
00bb1f94	stur d2,[x8, #0x1c]
00bb1f98	str xzr,[x0, #0x7648]
00bb1f9c	str q1,[x0,x9]
00bb1fa0	movi v1.2D,#0x0
00bb1fa4	mov w9,#0x76d8
00bb1fa8	movk w9,#0x1, LSL #16
00bb1fac	str q2,[x10]
00bb1fb0	str xzr,[x0, x9#0x0]
00bb1fb4	mov w9,#0x1
00bb1fb8	str w9,[x8]
00bb1fbc	mov w9,#0x7608
00bb1fc0	mov v0.D[0x1],v1.D[0x0]
00bb1fc4	str wzr,[x10, #0x10]
00bb1fc8	stur d2,[x8, #0x8c]
00bb1fcc	str d2,[x0, #0x7598]
00bb1fd0	str q0,[x0,x9]
00bb1fd4	mov w9,#0x1
00bb1fd8	movk w9,#0x800, LSL #16
00bb1fdc	str wzr,[x8, #0x38]
00bb1fe0	str x9,[x0, #0x7638]
00bb1fe4	ldp x20,x19,[sp, #0x20]
00bb1fe8	ldr x21,[sp, #0x10]
00bb1fec	ldp x29,x30,[sp], #0x30
00bb1ff0	ret
00bb1ff4	mov w0,#0x76e8
00bb1ff8	movk w0,#0x1, LSL #16
00bb1ffc	bl 0x00c308d0
00bb2000	cbnz x0,0x00bb1f5c
00bb2004	b 0x00bb1fe4
