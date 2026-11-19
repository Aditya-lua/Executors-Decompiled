; ZSTD_XXH64_reset @ 00bc1f64
00bc1f64	adrp x9,0x29c000
00bc1f68	dup v1.2D,x1
00bc1f6c	movi v0.2D,#0x0
00bc1f70	ldr q2,[x9, #0xc10]
00bc1f74	mov x9,#0x3579
00bc1f78	mov x8,x0
00bc1f7c	movk x9,#0x7a14, LSL #16
00bc1f80	mov w0,wzr
00bc1f84	str xzr,[x8, #0x50]
00bc1f88	add v1.2D,v1.2D,v2.2D
00bc1f8c	movk x9,#0x864e, LSL #32
00bc1f90	movk x9,#0x61c8, LSL #48
00bc1f94	stp q0,q0,[x8]
00bc1f98	add x9,x1,x9
00bc1f9c	stp q0,q0,[x8, #0x30]
00bc1fa0	str q0,[x8, #0x20]
00bc1fa4	stur q1,[x8, #0x8]
00bc1fa8	stp x1,x9,[x8, #0x18]
00bc1fac	ret
