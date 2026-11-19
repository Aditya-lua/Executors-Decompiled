; ZSTD_initStaticDCtx @ 00bafa34
00bafa34	mov w8,#0x76e8
00bafa38	mov x2,xzr
00bafa3c	movk w8,#0x1, LSL #16
00bafa40	cmp x1,x8
00bafa44	b.cc 0x00bafadc
00bafa48	and x8,x0,#0x7
00bafa4c	cbnz x8,0x00bafadc
00bafa50	fmov d0,xzr
00bafa54	movi v2.2D,#0x0
00bafa58	mov w8,#0x76d8
00bafa5c	movi v1.2D,#0x0
00bafa60	movk w8,#0x1, LSL #16
00bafa64	mov w10,#0x761c
00bafa68	mov w9,#0x75e0
00bafa6c	str xzr,[x0, x8#0x0]
00bafa70	add x8,x0,x10
00bafa74	mov v3.16B,v0.16B
00bafa78	add x9,x0,x9
00bafa7c	str wzr,[x8, #0x10]
00bafa80	mov w10,#0x75e8
00bafa84	mov x2,x0
00bafa88	str xzr,[x0, #0x74d8]
00bafa8c	str q1,[x8]
00bafa90	mov w8,#0x1
00bafa94	mov v3.D[0x1],v0.D[0x0]
00bafa98	mov v0.D[0x1],v2.D[0x0]
00bafa9c	str w8,[x9]
00bafaa0	mov w8,#0x7608
00bafaa4	str xzr,[x0, #0x7648]
00bafaa8	stur d1,[x9, #0x1c]
00bafaac	str q0,[x0,x8]
00bafab0	mov w8,#0x1
00bafab4	movk w8,#0x800, LSL #16
00bafab8	str q3,[x0,x10]
00bafabc	str x8,[x0, #0x7638]
00bafac0	add x8,x0,#0x17, LSL #12
00bafac4	add x8,x8,#0x6e8
00bafac8	stur d1,[x9, #0x8c]
00bafacc	str d1,[x0, #0x7598]
00bafad0	str wzr,[x9, #0x38]
00bafad4	str x1,[x0, #0x75d8]
00bafad8	str x8,[x0, #0x7620]
00bafadc	mov x0,x2
00bafae0	ret
