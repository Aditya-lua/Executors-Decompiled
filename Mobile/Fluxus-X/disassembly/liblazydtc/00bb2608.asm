; ZSTD_initDStream @ 00bb2608
00bb2608	stp x29,x30,[sp, #-0x20]!
00bb260c	stp x20,x19,[sp, #0x10]
00bb2610	mov x29,sp
00bb2614	mov x19,x0
00bb2618	add x20,x0,#0x7, LSL #12
00bb261c	ldr x0,[x0, #0x75e8]
00bb2620	mov w8,#0x1
00bb2624	str wzr,[x20, #0x61c]
00bb2628	str wzr,[x20, #0x66c]
00bb262c	str w8,[x20, #0x5e0]
00bb2630	bl 0x00c435b0
00bb2634	ldr w8,[x20, #0x598]
00bb2638	movi v0.2D,#0x0
00bb263c	str wzr,[x20, #0x600]
00bb2640	cmp w8,#0x0
00bb2644	mov w8,#0x5
00bb2648	csinc x0,x8,xzr,eq
00bb264c	mov w8,#0x75e8
00bb2650	str q0,[x19,x8]
00bb2654	ldp x20,x19,[sp, #0x10]
00bb2658	ldp x29,x30,[sp], #0x20
00bb265c	ret
