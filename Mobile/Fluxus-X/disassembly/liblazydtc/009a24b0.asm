; ix::WebSocketPerMessageDeflateCompressor::compressData<ix::IXWebSocketSendData,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>> @ 009a24b0
009a24b0	str x25,[sp, #-0x50]!
009a24b4	stp x24,x23,[sp, #0x10]
009a24b8	stp x22,x21,[sp, #0x20]
009a24bc	stp x20,x19,[sp, #0x30]
009a24c0	stp x29,x30,[sp, #0x40]
009a24c4	add x29,sp,#0x40
009a24c8	ldrb w8,[x2]
009a24cc	mov x19,x2
009a24d0	mov x20,x0
009a24d4	tbnz w8,#0x0,0x009a2620
009a24d8	strh wzr,[x19]
009a24dc	ldr x8,[x1]
009a24e0	cbz x8,0x009a2634
009a24e4	ldr x9,[x1, #0x8]
009a24e8	cbz x9,0x009a2634
009a24ec	mov w10,#0x4008
009a24f0	mov w12,#0x4028
009a24f4	mov w11,#0x4010
009a24f8	add x21,x20,#0x4
009a24fc	add x23,x19,#0x1
009a2500	add x22,x20,x10
009a2504	add x24,x20,x12
009a2508	mov w25,#0x4000
009a250c	str w9,[x20, x11#0x0]
009a2510	str x8,[x20, #0x4008]
009a2514	str w25,[x24]
009a2518	ldr w1,[x20]
009a251c	mov x0,x22
009a2520	str x21,[x20, #0x4020]
009a2524	bl 0x00c33270
009a2528	ldr w8,[x24]
009a252c	ldrb w9,[x19]
009a2530	ldp x10,x11,[x19, #0x8]
009a2534	mov x0,x19
009a2538	sub x8,x25,x8
009a253c	lsr w12,w9,#0x1
009a2540	tst w9,#0x1
009a2544	csel x9,x23,x11,eq
009a2548	csel x10,x12,x10,eq
009a254c	add x8,x20,x8
009a2550	add x1,x9,x10
009a2554	add x3,x8,#0x4
009a2558	mov x2,x21
009a255c	bl 0x00c33d40
009a2560	ldr w8,[x24]
009a2564	cbz w8,0x009a2514
009a2568	adrp x11,0xd21000
009a256c	add x11,x11,#0x850
009a2570	ldrb w13,[x11]
009a2574	ldrb w8,[x19]
009a2578	ldr x10,[x11, #0x8]
009a257c	ldr x9,[x19, #0x8]
009a2580	lsr w14,w13,#0x1
009a2584	tst w13,#0x1
009a2588	lsr w12,w8,#0x1
009a258c	csel x14,x14,x10,eq
009a2590	tst w8,#0x1
009a2594	csel x10,x12,x9,eq
009a2598	cmp x14,x10
009a259c	b.hi 0x009a264c
009a25a0	ldr x9,[x19, #0x10]
009a25a4	ldr x15,[x11, #0x10]
009a25a8	tst w8,#0x1
009a25ac	csel x12,x23,x9,eq
009a25b0	tst w13,#0x1
009a25b4	add x14,x12,x10
009a25b8	csinc x13,x15,x11,ne
009a25bc	ldurb w11,[x14, #-0x1]
009a25c0	ldrb w15,[x13, #0x3]
009a25c4	cmp w11,w15
009a25c8	b.ne 0x009a264c
009a25cc	ldurb w11,[x14, #-0x2]
009a25d0	ldrb w14,[x13, #0x2]
009a25d4	cmp w11,w14
009a25d8	b.ne 0x009a264c
009a25dc	add x11,x12,x10
009a25e0	ldurb w11,[x11, #-0x3]
009a25e4	ldrb w14,[x13, #0x1]
009a25e8	cmp w11,w14
009a25ec	b.ne 0x009a264c
009a25f0	sub x11,x10,#0x4
009a25f4	ldrb w12,[x12, x11]
009a25f8	ldrb w13,[x13]
009a25fc	cmp w12,w13
009a2600	b.ne 0x009a264c
009a2604	cmp x10,#0x3
009a2608	b.hi 0x009a2668
009a260c	orr x1,xzr,#-0x4
009a2610	mov x0,x19
009a2614	mov w2,wzr
009a2618	bl 0x00c30250
009a261c	b 0x009a264c
009a2620	ldr x8,[x19, #0x10]
009a2624	strb wzr,[x8]
009a2628	str xzr,[x19, #0x8]
009a262c	ldr x8,[x1]
009a2630	cbnz x8,0x009a24e4
009a2634	mov w1,#0x2
009a2638	mov x0,x19
009a263c	bl 0x00c30150
009a2640	mov x0,x19
009a2644	mov w1,wzr
009a2648	bl 0x00c30150
009a264c	ldp x29,x30,[sp, #0x40]
009a2650	ldp x20,x19,[sp, #0x30]
009a2654	ldp x22,x21,[sp, #0x20]
009a2658	ldp x24,x23,[sp, #0x10]
009a265c	mov w0,#0x1
009a2660	ldr x25,[sp], #0x50
009a2664	ret
009a2668	tbnz w8,#0x0,0x009a2680
009a266c	add x8,x19,x11
009a2670	lsl w9,w11,#0x1
009a2674	strb wzr,[x8, #0x1]
009a2678	strb w9,[x19]
009a267c	b 0x009a264c
009a2680	strb wzr,[x9, x11]
009a2684	str x11,[x19, #0x8]
009a2688	b 0x009a264c
