; cpr::Session::PostAsync @ 008f2234
008f2234	sub sp,sp,#0x70
008f2238	stp x26,x25,[sp, #0x20]
008f223c	stp x24,x23,[sp, #0x30]
008f2240	stp x22,x21,[sp, #0x40]
008f2244	stp x20,x19,[sp, #0x50]
008f2248	stp x29,x30,[sp, #0x60]
008f224c	add x29,sp,#0x60
008f2250	mrs x24,tpidr_el0
008f2254	mov x20,x8
008f2258	ldr x8,[x24, #0x28]
008f225c	str x8,[sp, #0x18]
008f2260	mov x8,sp
008f2264	bl 0x00c31300
008f2268	bl 0x00c30d70
008f226c	add x8,x0,#0x20
008f2270	ldar w8,[x8]
008f2274	mov x21,x0
008f2278	cbnz w8,0x008f2288
008f227c	mov x0,x21
008f2280	mov x1,xzr
008f2284	bl 0x00c31330
008f2288	add x8,x21,#0x30
008f228c	ldar x8,[x8]
008f2290	cbnz x8,0x008f22b0
008f2294	add x8,x21,#0x28
008f2298	ldar x8,[x8]
008f229c	ldr x9,[x21, #0x10]
008f22a0	cmp x8,x9
008f22a4	b.cs 0x008f22b0
008f22a8	mov x0,x21
008f22ac	bl 0x00c31320
008f22b0	ldp x23,x22,[sp]
008f22b4	stp xzr,xzr,[sp]
008f22b8	orr w0,wzr,#0x60
008f22bc	bl 0x00c2fed0
008f22c0	str xzr,[x0, #0x10]
008f22c4	adrp x8,0xcb4000
008f22c8	ldr x8,[x8, #0xd50]
008f22cc	adrp x9,0xc4e000
008f22d0	add x9,x9,#0xe38
008f22d4	mov x25,x0
008f22d8	mov x26,x0
008f22dc	add x8,x8,#0x10
008f22e0	add x9,x9,#0x10
008f22e4	mov x19,x0
008f22e8	str xzr,[x25, #0x8]!
008f22ec	str x8,[x0]
008f22f0	str x9,[x26, #0x20]!
008f22f4	str x26,[x0, #0x40]
008f22f8	stp x23,x22,[x0, #0x28]
008f22fc	mov w0,#0x188
008f2300	bl 0x00c2fed0
008f2304	mov x23,x0
008f2308	add x0,x0,#0x8
008f230c	mov w2,#0x6c
008f2310	mov w1,wzr
008f2314	bl 0x00c301c0
008f2318	adrp x8,0xcb4000
008f231c	ldr x8,[x8, #0xd40]
008f2320	str x23,[x19, #0x50]
008f2324	add x8,x8,#0x10
008f2328	str x8,[x23]
008f232c	add x0,sp,#0x10
008f2330	mov x1,x23
008f2334	bl 0x00c316e0
008f2338	add x22,x21,#0xa8
008f233c	mov x0,x22
008f2340	bl 0x00c2ff10
008f2344	ldxr x8,[x25]
008f2348	add x8,x8,#0x1
008f234c	stxr w9,x8,[x25]
008f2350	cbnz w9,0x008f2344
008f2354	ldp x9,x10,[x21, #0x80]
008f2358	ldp x12,x8,[x21, #0x98]
008f235c	mov w11,#0x55
008f2360	subs x13,x10,x9
008f2364	asr x13,x13,#0x3
008f2368	mul x11,x13,x11
008f236c	sub x11,x11,#0x1
008f2370	csel x13,xzr,x11,eq
008f2374	add x11,x8,x12
008f2378	cmp x13,x11
008f237c	b.ne 0x008f2394
008f2380	add x0,x21,#0x78
008f2384	bl 0x00c31620
008f2388	ldp x11,x8,[x21, #0x98]
008f238c	ldp x9,x10,[x21, #0x80]
008f2390	add x11,x11,x8
008f2394	cmp x10,x9
008f2398	b.eq 0x008f23c4
008f239c	orr x10,xzr,#-0x3f3f3f3f3f3f3f40
008f23a0	movk x10,#0xc0c1
008f23a4	umulh x10,x11,x10
008f23a8	lsr x10,x10,#0x6
008f23ac	ldr x9,[x9, x10, LSL #0x3]
008f23b0	mov w12,#0x55
008f23b4	msub x10,x10,x12,x11
008f23b8	orr w11,wzr,#0x30
008f23bc	madd x9,x10,x11,x9
008f23c0	b 0x008f23c8
008f23c4	mov x9,xzr
008f23c8	adrp x10,0xc4e000
008f23cc	add x10,x10,#0xe98
008f23d0	add x8,x8,#0x1
008f23d4	add x10,x10,#0x10
008f23d8	mov x0,x22
008f23dc	stp x26,x19,[x9, #0x8]
008f23e0	str x9,[x9, #0x20]
008f23e4	str x10,[x9]
008f23e8	str x8,[x21, #0xa0]
008f23ec	bl 0x00c2ff20
008f23f0	add x0,x21,#0xd0
008f23f4	bl 0x00c315f0
008f23f8	ldr x21,[sp, #0x10]
008f23fc	ldaxr x8,[x25]
008f2400	sub x9,x8,#0x1
008f2404	stlxr w10,x9,[x25]
008f2408	cbnz w10,0x008f23fc
008f240c	cbnz x8,0x008f2428
008f2410	ldr x8,[x19]
008f2414	mov x0,x19
008f2418	ldr x8,[x8, #0x10]
008f241c	blr x8
008f2420	mov x0,x19
008f2424	bl 0x00c2ff00
008f2428	ldr x19,[sp, #0x8]
008f242c	stp xzr,xzr,[x20, #0x8]
008f2430	str x21,[x20]
008f2434	cbz x19,0x008f2468
008f2438	add x8,x19,#0x8
008f243c	ldaxr x9,[x8]
008f2440	sub x10,x9,#0x1
008f2444	stlxr w11,x10,[x8]
008f2448	cbnz w11,0x008f243c
008f244c	cbnz x9,0x008f2468
008f2450	ldr x8,[x19]
008f2454	mov x0,x19
008f2458	ldr x8,[x8, #0x10]
008f245c	blr x8
008f2460	mov x0,x19
008f2464	bl 0x00c2ff00
008f2468	ldr x8,[x24, #0x28]
008f246c	ldr x9,[sp, #0x18]
008f2470	cmp x8,x9
008f2474	b.ne 0x008f2494
008f2478	ldp x29,x30,[sp, #0x60]
008f247c	ldp x20,x19,[sp, #0x50]
008f2480	ldp x22,x21,[sp, #0x40]
008f2484	ldp x24,x23,[sp, #0x30]
008f2488	ldp x26,x25,[sp, #0x20]
008f248c	add sp,sp,#0x70
008f2490	ret
008f2494	bl 0x00c2fec0
