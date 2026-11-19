; ix::WebSocketPerMessageDeflateCompressor::compressData<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>> @ 009a22bc
009a22bc	str x25,[sp, #-0x50]!
009a22c0	stp x24,x23,[sp, #0x10]
009a22c4	stp x22,x21,[sp, #0x20]
009a22c8	stp x20,x19,[sp, #0x30]
009a22cc	stp x29,x30,[sp, #0x40]
009a22d0	add x29,sp,#0x40
009a22d4	ldrb w8,[x2]
009a22d8	mov x19,x2
009a22dc	mov x20,x0
009a22e0	tbnz w8,#0x0,0x009a22ec
009a22e4	strh wzr,[x19]
009a22e8	b 0x009a22f8
009a22ec	ldr x8,[x19, #0x10]
009a22f0	strb wzr,[x8]
009a22f4	str xzr,[x19, #0x8]
009a22f8	ldrb w8,[x1]
009a22fc	ldr x9,[x1, #0x8]
009a2300	lsr w10,w8,#0x1
009a2304	tst w8,#0x1
009a2308	csel x8,x10,x9,eq
009a230c	cbz x8,0x009a2454
009a2310	mov w10,#0x4010
009a2314	str w8,[x20, x10#0x0]
009a2318	ldrb w8,[x1]
009a231c	ldr x10,[x1, #0x10]
009a2320	mov w9,#0x4008
009a2324	mov w11,#0x4028
009a2328	tst w8,#0x1
009a232c	add x21,x20,#0x4
009a2330	add x23,x19,#0x1
009a2334	add x22,x20,x9
009a2338	add x24,x20,x11
009a233c	csinc x8,x10,x1,ne
009a2340	mov w25,#0x4000
009a2344	str x8,[x20, #0x4008]
009a2348	str w25,[x24]
009a234c	ldr w1,[x20]
009a2350	mov x0,x22
009a2354	str x21,[x20, #0x4020]
009a2358	bl 0x00c33270
009a235c	ldr w8,[x24]
009a2360	ldrb w9,[x19]
009a2364	ldp x10,x11,[x19, #0x8]
009a2368	mov x0,x19
009a236c	sub x8,x25,x8
009a2370	lsr w12,w9,#0x1
009a2374	tst w9,#0x1
009a2378	csel x9,x23,x11,eq
009a237c	csel x10,x12,x10,eq
009a2380	add x8,x20,x8
009a2384	add x1,x9,x10
009a2388	add x3,x8,#0x4
009a238c	mov x2,x21
009a2390	bl 0x00c33d40
009a2394	ldr w8,[x24]
009a2398	cbz w8,0x009a2348
009a239c	adrp x11,0xd21000
009a23a0	add x11,x11,#0x850
009a23a4	ldrb w13,[x11]
009a23a8	ldrb w8,[x19]
009a23ac	ldr x10,[x11, #0x8]
009a23b0	ldr x9,[x19, #0x8]
009a23b4	lsr w14,w13,#0x1
009a23b8	tst w13,#0x1
009a23bc	lsr w12,w8,#0x1
009a23c0	csel x14,x14,x10,eq
009a23c4	tst w8,#0x1
009a23c8	csel x10,x12,x9,eq
009a23cc	cmp x14,x10
009a23d0	b.hi 0x009a246c
009a23d4	ldr x9,[x19, #0x10]
009a23d8	ldr x15,[x11, #0x10]
009a23dc	tst w8,#0x1
009a23e0	csel x12,x23,x9,eq
009a23e4	tst w13,#0x1
009a23e8	add x14,x12,x10
009a23ec	csinc x13,x15,x11,ne
009a23f0	ldurb w11,[x14, #-0x1]
009a23f4	ldrb w15,[x13, #0x3]
009a23f8	cmp w11,w15
009a23fc	b.ne 0x009a246c
009a2400	ldurb w11,[x14, #-0x2]
009a2404	ldrb w14,[x13, #0x2]
009a2408	cmp w11,w14
009a240c	b.ne 0x009a246c
009a2410	add x11,x12,x10
009a2414	ldurb w11,[x11, #-0x3]
009a2418	ldrb w14,[x13, #0x1]
009a241c	cmp w11,w14
009a2420	b.ne 0x009a246c
009a2424	sub x11,x10,#0x4
009a2428	ldrb w12,[x12, x11]
009a242c	ldrb w13,[x13]
009a2430	cmp w12,w13
009a2434	b.ne 0x009a246c
009a2438	cmp x10,#0x3
009a243c	b.hi 0x009a2488
009a2440	orr x1,xzr,#-0x4
009a2444	mov x0,x19
009a2448	mov w2,wzr
009a244c	bl 0x00c30250
009a2450	b 0x009a246c
009a2454	mov w1,#0x2
009a2458	mov x0,x19
009a245c	bl 0x00c30150
009a2460	mov x0,x19
009a2464	mov w1,wzr
009a2468	bl 0x00c30150
009a246c	ldp x29,x30,[sp, #0x40]
009a2470	ldp x20,x19,[sp, #0x30]
009a2474	ldp x22,x21,[sp, #0x20]
009a2478	ldp x24,x23,[sp, #0x10]
009a247c	mov w0,#0x1
009a2480	ldr x25,[sp], #0x50
009a2484	ret
009a2488	tbnz w8,#0x0,0x009a24a0
009a248c	add x8,x19,x11
009a2490	lsl w9,w11,#0x1
009a2494	strb wzr,[x8, #0x1]
009a2498	strb w9,[x19]
009a249c	b 0x009a246c
009a24a0	strb wzr,[x9, x11]
009a24a4	str x11,[x19, #0x8]
009a24a8	b 0x009a246c
