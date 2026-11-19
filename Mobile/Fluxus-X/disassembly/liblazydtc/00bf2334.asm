; std::__ndk1::money_put<wchar_t,std::__ndk1::ostreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>::do_put @ 00bf2334
00bf2334	paciasp
00bf2338	stp x29,x30,[sp, #-0x60]!
00bf233c	stp x28,x27,[sp, #0x10]
00bf2340	stp x26,x25,[sp, #0x20]
00bf2344	stp x24,x23,[sp, #0x30]
00bf2348	stp x22,x21,[sp, #0x40]
00bf234c	stp x20,x19,[sp, #0x50]
00bf2350	mov x29,sp
00bf2354	sub sp,sp,#0x460
00bf2358	mov w25,w2
00bf235c	mov x21,x1
00bf2360	sub x8,x29,#0x6c
00bf2364	adrp x2,0x2be000
00bf2368	add x2,x2,#0xc54
00bf236c	sub x0,x29,#0x6c
00bf2370	mov w1,#0x64
00bf2374	mov w27,w4
00bf2378	mov x22,x3
00bf237c	stur x8,[x29, #-0x78]
00bf2380	str q0,[sp, #0x40]
00bf2384	bl 0x00c31ed0
00bf2388	cmp w0,#0x64
00bf238c	b.cc 0x00bf23e8
00bf2390	adrp x8,0xd27000
00bf2394	add x8,x8,#0xf8
00bf2398	adrp x19,0xd27000
00bf239c	ldarb w8,[x8]
00bf23a0	tbz w8,#0x0,0x00bf26dc
00bf23a4	ldr x1,[x19, #0xf0]
00bf23a8	ldr q0,[sp, #0x40]
00bf23ac	adrp x2,0x2be000
00bf23b0	add x2,x2,#0xc54
00bf23b4	sub x0,x29,#0x78
00bf23b8	mov x19,xzr
00bf23bc	bl 0x00c0cdd4
00bf23c0	mov w28,w0
00bf23c4	cmn w0,#0x1
00bf23c8	b.eq 0x00bf2714
00bf23cc	sbfiz x0,x28,#0x2,#0x20
00bf23d0	ldur x19,[x29, #-0x78]
00bf23d4	bl 0x00c308d0
00bf23d8	cbz x0,0x00bf271c
00bf23dc	mov x20,x0
00bf23e0	mov x24,x0
00bf23e4	b 0x00bf23f8
00bf23e8	mov w28,w0
00bf23ec	mov x20,xzr
00bf23f0	mov x19,xzr
00bf23f4	add x24,sp,#0x258
00bf23f8	add x8,sp,#0x250
00bf23fc	mov x0,x22
00bf2400	stp x21,x19,[sp, #0x38]
00bf2404	bl 0x00c30070
00bf2408	adrp x23,0xcb5000
00bf240c	ldr x23,[x23, #0xb98]
00bf2410	ldr x21,[sp, #0x250]
00bf2414	str x23,[sp, #0x210]
00bf2418	ldar x8,[x23]
00bf241c	cmn x8,#0x1
00bf2420	b.eq 0x00bf244c
00bf2424	add x8,sp,#0x210
00bf2428	add x9,sp,#0x60
00bf242c	str x8,[sp, #0x60]
00bf2430	str x9,[sp, #0x228]
00bf2434	adrp x0,0xcb5000
00bf2438	nop
00bf243c	adr x2,0xc0bab0
00bf2440	ldr x0,[x0, #0xb98]
00bf2444	add x1,sp,#0x228
00bf2448	bl 0x00c305d0
00bf244c	ldp x8,x10,[x21, #0x10]
00bf2450	ldrsw x9,[x23, #0x8]
00bf2454	sub x9,x9,#0x1
00bf2458	sub x10,x10,x8
00bf245c	cmp x9,x10, ASR #0x3
00bf2460	b.cs 0x00bf26d8
00bf2464	ldr x26,[x8, x9, LSL #0x3]
00bf2468	cbz x26,0x00bf26d8
00bf246c	ldr x8,[x26]
00bf2470	ldur x1,[x29, #-0x78]
00bf2474	sxtw x21,w28
00bf2478	ldr x8,[x8, #0x60]
00bf247c	add x2,x1,x21
00bf2480	mov x0,x26
00bf2484	mov x3,x24
00bf2488	blr x8
00bf248c	mov w19,w27
00bf2490	cmp w28,#0x1
00bf2494	b.lt 0x00bf24ac
00bf2498	ldur x8,[x29, #-0x78]
00bf249c	ldrb w8,[x8]
00bf24a0	cmp w8,#0x2d
00bf24a4	cset w27,eq
00bf24a8	b 0x00bf24b0
00bf24ac	mov w27,wzr
00bf24b0	str xzr,[sp, #0x230]
00bf24b4	str xzr,[sp, #0x228]
00bf24b8	str xzr,[sp, #0x238]
00bf24bc	str xzr,[sp, #0x218]
00bf24c0	str xzr,[sp, #0x210]
00bf24c4	str xzr,[sp, #0x220]
00bf24c8	stp xzr,xzr,[sp, #0x1f8]
00bf24cc	str xzr,[sp, #0x208]
00bf24d0	add x8,sp,#0x1f4
00bf24d4	add x9,sp,#0x1f8
00bf24d8	and w0,w25,#0x1
00bf24dc	add x2,sp,#0x250
00bf24e0	add x3,sp,#0x24c
00bf24e4	add x4,sp,#0x248
00bf24e8	add x5,sp,#0x244
00bf24ec	add x6,sp,#0x228
00bf24f0	add x7,sp,#0x210
00bf24f4	mov w1,w27
00bf24f8	stp x9,x8,[sp]
00bf24fc	bl 0x00c44260
00bf2500	ldrsw x23,[sp, #0x1f4]
00bf2504	cmp w28,w23
00bf2508	b.le 0x00bf255c
00bf250c	ldrb w8,[sp, #0x1f8]
00bf2510	ldrb w9,[sp, #0x210]
00bf2514	ldr x10,[sp, #0x200]
00bf2518	lsr x11,x8,#0x1
00bf251c	tst w8,#0x1
00bf2520	ldr x8,[sp, #0x218]
00bf2524	lsr x12,x9,#0x1
00bf2528	csel x10,x11,x10,eq
00bf252c	sub x11,x21,x23
00bf2530	tst w9,#0x1
00bf2534	csel x8,x12,x8,eq
00bf2538	add x9,x23,x11, LSL #0x1
00bf253c	add x8,x10,x8
00bf2540	add x8,x9,x8
00bf2544	add x8,x8,#0x1
00bf2548	cmp x8,#0x65
00bf254c	b.cs 0x00bf2598
00bf2550	mov x25,xzr
00bf2554	add x28,sp,#0x60
00bf2558	b 0x00bf25ac
00bf255c	ldrb w8,[sp, #0x1f8]
00bf2560	ldrb w9,[sp, #0x210]
00bf2564	ldr x10,[sp, #0x200]
00bf2568	lsr x11,x8,#0x1
00bf256c	tst w8,#0x1
00bf2570	ldr x8,[sp, #0x218]
00bf2574	lsr x12,x9,#0x1
00bf2578	csel x10,x11,x10,eq
00bf257c	tst w9,#0x1
00bf2580	csel x8,x12,x8,eq
00bf2584	add x9,x23,x10
00bf2588	add x8,x9,x8
00bf258c	add x8,x8,#0x2
00bf2590	cmp x8,#0x65
00bf2594	b.cc 0x00bf2550
00bf2598	lsl x0,x8,#0x2
00bf259c	bl 0x00c308d0
00bf25a0	mov x25,x0
00bf25a4	mov x28,x0
00bf25a8	cbz x0,0x00bf2720
00bf25ac	ldr w3,[x22, #0x8]
00bf25b0	ldr w8,[sp, #0x248]
00bf25b4	add x5,x24,x21, LSL #0x2
00bf25b8	ldr w9,[sp, #0x244]
00bf25bc	add x10,sp,#0x1f8
00bf25c0	add x11,sp,#0x210
00bf25c4	add x1,sp,#0x58
00bf25c8	stp x11,x10,[sp, #0x20]
00bf25cc	add x10,sp,#0x228
00bf25d0	add x2,sp,#0x50
00bf25d4	str x10,[sp, #0x18]
00bf25d8	add x10,sp,#0x24c
00bf25dc	mov x0,x28
00bf25e0	mov x4,x24
00bf25e4	mov x6,x26
00bf25e8	mov w7,w27
00bf25ec	str w23,[sp, #0x30]
00bf25f0	str w9,[sp, #0x10]
00bf25f4	str w8,[sp, #0x8]
00bf25f8	str x10,[sp]
00bf25fc	bl 0x00c44270
00bf2600	ldp x3,x2,[sp, #0x50]
00bf2604	ldr x0,[sp, #0x38]
00bf2608	mov x1,x28
00bf260c	mov x4,x22
00bf2610	mov w5,w19
00bf2614	bl 0x00be6bec
00bf2618	mov x21,x0
00bf261c	cbz x25,0x00bf2628
00bf2620	mov x0,x25
00bf2624	bl 0x00c30960
00bf2628	ldrb w8,[sp, #0x1f8]
00bf262c	ldr x19,[sp, #0x40]
00bf2630	tbnz w8,#0x0,0x00bf269c
00bf2634	ldrb w8,[sp, #0x210]
00bf2638	tbnz w8,#0x0,0x00bf26b8
00bf263c	ldrb w8,[sp, #0x228]
00bf2640	tbz w8,#0x0,0x00bf2654
00bf2644	ldr x8,[sp, #0x228]
00bf2648	ldr x0,[sp, #0x238]
00bf264c	and x1,x8,#-0x2
00bf2650	bl 0x00c2fe80
00bf2654	add x0,sp,#0x250
00bf2658	bl 0x00c30090
00bf265c	cbz x20,0x00bf2668
00bf2660	mov x0,x20
00bf2664	bl 0x00c30960
00bf2668	cbz x19,0x00bf2674
00bf266c	mov x0,x19
00bf2670	bl 0x00c30960
00bf2674	mov x0,x21
00bf2678	add sp,sp,#0x460
00bf267c	ldp x20,x19,[sp, #0x50]
00bf2680	ldp x22,x21,[sp, #0x40]
00bf2684	ldp x24,x23,[sp, #0x30]
00bf2688	ldp x26,x25,[sp, #0x20]
00bf268c	ldp x28,x27,[sp, #0x10]
00bf2690	ldp x29,x30,[sp], #0x60
00bf2694	autiasp
00bf2698	ret
00bf269c	ldr x8,[sp, #0x1f8]
00bf26a0	ldr x0,[sp, #0x208]
00bf26a4	lsl x8,x8,#0x2
00bf26a8	and x1,x8,#-0x8
00bf26ac	bl 0x00c2fe80
00bf26b0	ldrb w8,[sp, #0x210]
00bf26b4	tbz w8,#0x0,0x00bf263c
00bf26b8	ldr x8,[sp, #0x210]
00bf26bc	ldr x0,[sp, #0x220]
00bf26c0	lsl x8,x8,#0x2
00bf26c4	and x1,x8,#-0x8
00bf26c8	bl 0x00c2fe80
00bf26cc	ldrb w8,[sp, #0x228]
00bf26d0	tbnz w8,#0x0,0x00bf2644
00bf26d4	b 0x00bf2654
00bf26d8	bl 0x00bd8968
00bf26dc	adrp x0,0xd27000
00bf26e0	add x0,x0,#0xf8
00bf26e4	bl 0x00c2fe90
00bf26e8	cbz w0,0x00bf23a4
00bf26ec	adrp x1,0x2c6000
00bf26f0	add x1,x1,#0xbfc
00bf26f4	mov w0,#0x1fbf
00bf26f8	mov x2,xzr
00bf26fc	bl 0x00c43890
00bf2700	str x0,[x19, #0xf0]
00bf2704	adrp x0,0xd27000
00bf2708	add x0,x0,#0xf8
00bf270c	bl 0x00c2fea0
00bf2710	b 0x00bf23a4
00bf2714	mov x19,xzr
00bf2718	bl 0x00c43cc0
00bf271c	bl 0x00c43cc0
00bf2720	bl 0x00c43cc0
00bf2724	mov x21,x0
00bf2728	adrp x0,0xd27000
00bf272c	add x0,x0,#0xf8
00bf2730	bl 0x00c2feb0
00bf2734	mov x0,x21
00bf2738	bl 0x00c2c090
