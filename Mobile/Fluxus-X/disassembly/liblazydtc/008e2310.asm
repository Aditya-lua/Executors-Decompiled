; blake3_compress_xof_portable @ 008e2310
008e2310	sub sp,sp,#0xb0
008e2314	stp x29,x30,[sp, #0x50]
008e2318	stp x28,x27,[sp, #0x60]
008e231c	stp x26,x25,[sp, #0x70]
008e2320	stp x24,x23,[sp, #0x80]
008e2324	stp x22,x21,[sp, #0x90]
008e2328	stp x20,x19,[sp, #0xa0]
008e232c	ldp w13,w12,[x1]
008e2330	ldp w14,w19,[x0]
008e2334	ldp w7,w20,[x0, #0x10]
008e2338	ldp w9,w11,[x1, #0x8]
008e233c	add w6,w14,w13
008e2340	lsr x24,x3,#0x20
008e2344	and w2,w2,#0xff
008e2348	add w21,w6,w7
008e234c	stp w12,w13,[sp, #0x44]
008e2350	eor w6,w21,w3
008e2354	add w3,w19,w9
008e2358	mov w19,#0xe667
008e235c	ror w6,w6,#0x10
008e2360	movk w19,#0x6a09, LSL #16
008e2364	add w25,w3,w20
008e2368	ldp w28,w10,[x1, #0x18]
008e236c	add w3,w6,w19
008e2370	eor w19,w25,w24
008e2374	and w24,w4,#0xff
008e2378	ldp w22,w23,[x0, #0x8]
008e237c	eor w7,w3,w7
008e2380	ror w19,w19,#0x10
008e2384	add w21,w21,w12
008e2388	ldp w26,w27,[x0, #0x18]
008e238c	ror w4,w7,#0xc
008e2390	mov w7,#0xae85
008e2394	add w23,w23,w28
008e2398	ldp w8,w16,[x1, #0x10]
008e239c	movk w7,#0xbb67, LSL #16
008e23a0	add w23,w23,w27
008e23a4	mov w13,w9
008e23a8	add w7,w19,w7
008e23ac	str w9,[sp, #0x24]
008e23b0	mov w14,w11
008e23b4	eor w20,w7,w20
008e23b8	stp w8,w28,[sp, #0x34]
008e23bc	add w28,w21,w4
008e23c0	ror w29,w20,#0xc
008e23c4	add w20,w22,w8
008e23c8	eor w21,w23,w24
008e23cc	add w22,w25,w11
008e23d0	add w24,w20,w26
008e23d4	ror w25,w21,#0x10
008e23d8	mov w21,#0xf53a
008e23dc	add w20,w22,w29
008e23e0	eor w2,w24,w2
008e23e4	movk w21,#0xa54f, LSL #16
008e23e8	eor w19,w20,w19
008e23ec	ror w30,w2,#0x10
008e23f0	add w2,w25,w21
008e23f4	mov w21,#0xf372
008e23f8	ror w19,w19,#0x8
008e23fc	movk w21,#0x3c6e, LSL #16
008e2400	eor w22,w2,w27
008e2404	add w23,w23,w10
008e2408	add w27,w30,w21
008e240c	ror w21,w22,#0xc
008e2410	add w22,w19,w7
008e2414	eor w7,w27,w26
008e2418	eor w26,w22,w29
008e241c	eor w6,w28,w6
008e2420	ldp w17,w15,[x1, #0x20]
008e2424	ror w29,w7,#0xc
008e2428	add w7,w23,w21
008e242c	add w23,w24,w16
008e2430	eor w25,w7,w25
008e2434	ror w8,w26,#0x7
008e2438	str w10,[sp, #0x4c]
008e243c	add w24,w23,w29
008e2440	ror w9,w25,#0x8
008e2444	ror w25,w6,#0x8
008e2448	add w23,w28,w17
008e244c	eor w6,w24,w30
008e2450	str w17,[sp, #0x3c]
008e2454	add w28,w23,w8
008e2458	ror w30,w6,#0x8
008e245c	add w23,w25,w3
008e2460	ldp w17,w10,[x1, #0x34]
008e2464	eor w6,w28,w9
008e2468	eor w4,w23,w4
008e246c	add w12,w9,w2
008e2470	ror w11,w6,#0x10
008e2474	add w6,w30,w27
008e2478	ror w27,w4,#0x7
008e247c	add w4,w7,w10
008e2480	str w16,[sp, #0x20]
008e2484	eor w29,w6,w29
008e2488	add w26,w11,w6
008e248c	add w9,w4,w27
008e2490	str w10,[sp, #0x18]
008e2494	eor w8,w26,w8
008e2498	eor w30,w9,w30
008e249c	ldr w3,[x1, #0x30]
008e24a0	ldp w4,w16,[x1, #0x28]
008e24a4	ror w10,w8,#0xc
008e24a8	ror w30,w30,#0x10
008e24ac	add w28,w28,w15
008e24b0	eor w21,w12,w21
008e24b4	ror w29,w29,#0x7
008e24b8	ldr w6,[x1, #0x3c]
008e24bc	add w28,w28,w10
008e24c0	ror w21,w21,#0x7
008e24c4	add w20,w20,w4
008e24c8	add w22,w30,w22
008e24cc	eor w11,w28,w11
008e24d0	add w20,w20,w29
008e24d4	add w24,w24,w3
008e24d8	eor w27,w22,w27
008e24dc	ror w11,w11,#0x8
008e24e0	eor w25,w20,w25
008e24e4	add w24,w24,w21
008e24e8	ror w27,w27,#0xc
008e24ec	ror w25,w25,#0x10
008e24f0	eor w8,w24,w19
008e24f4	add w9,w9,w6
008e24f8	add w19,w11,w26
008e24fc	ror w26,w8,#0x10
008e2500	add w8,w9,w27
008e2504	add w12,w25,w12
008e2508	eor w9,w8,w30
008e250c	eor w10,w19,w10
008e2510	eor w29,w12,w29
008e2514	add w30,w26,w23
008e2518	ror w9,w9,#0x8
008e251c	ror w23,w10,#0x7
008e2520	ror w10,w29,#0xc
008e2524	eor w21,w30,w21
008e2528	add w20,w20,w16
008e252c	ror w21,w21,#0xc
008e2530	add w22,w9,w22
008e2534	add w20,w20,w10
008e2538	add w24,w24,w17
008e253c	eor w27,w22,w27
008e2540	eor w25,w20,w25
008e2544	add w24,w24,w21
008e2548	ror w27,w27,#0x7
008e254c	ror w29,w25,#0x8
008e2550	eor w25,w24,w26
008e2554	add w26,w28,w13
008e2558	ror w28,w25,#0x8
008e255c	add w25,w26,w27
008e2560	add w20,w20,w14
008e2564	eor w26,w25,w29
008e2568	mov w1,w14
008e256c	str w14,[sp, #0x30]
008e2570	add w12,w29,w12
008e2574	add w20,w20,w23
008e2578	add w29,w28,w30
008e257c	ror w30,w26,#0x10
008e2580	eor w26,w20,w28
008e2584	eor w21,w29,w21
008e2588	ldp w14,w2,[sp, #0x34]
008e258c	ror w28,w26,#0x10
008e2590	ror w21,w21,#0x7
008e2594	add w26,w30,w29
008e2598	eor w10,w12,w10
008e259c	eor w27,w26,w27
008e25a0	ldr w7,[sp, #0x4c]
008e25a4	add w8,w8,w14
008e25a8	ror w10,w10,#0x7
008e25ac	add w29,w28,w22
008e25b0	ror w22,w27,#0xc
008e25b4	add w27,w8,w21
008e25b8	eor w23,w29,w23
008e25bc	add w8,w24,w7
008e25c0	eor w11,w27,w11
008e25c4	ror w23,w23,#0xc
008e25c8	add w24,w8,w10
008e25cc	ror w8,w11,#0x10
008e25d0	add w20,w20,w4
008e25d4	eor w9,w24,w9
008e25d8	add w13,w20,w23
008e25dc	add w25,w25,w2
008e25e0	ror w9,w9,#0x10
008e25e4	add w20,w8,w12
008e25e8	eor w28,w13,w28
008e25ec	eor w21,w20,w21
008e25f0	add w12,w25,w22
008e25f4	ror w28,w28,#0x8
008e25f8	add w19,w9,w19
008e25fc	ror w25,w21,#0xc
008e2600	add w27,w27,w17
008e2604	eor w10,w19,w10
008e2608	add w21,w28,w29
008e260c	eor w30,w12,w30
008e2610	ror w11,w10,#0xc
008e2614	add w29,w27,w25
008e2618	ldr w10,[sp, #0x48]
008e261c	eor w8,w29,w8
008e2620	eor w23,w21,w23
008e2624	ror w27,w30,#0x8
008e2628	add w24,w24,w10
008e262c	ror w10,w8,#0x8
008e2630	ldr w8,[sp, #0x44]
008e2634	ror w23,w23,#0x7
008e2638	add w24,w24,w11
008e263c	add w29,w29,w6
008e2640	add w12,w12,w8
008e2644	eor w9,w24,w9
008e2648	str w6,[sp, #0xc]
008e264c	add w12,w12,w23
008e2650	ror w30,w9,#0x8
008e2654	add w9,w27,w26
008e2658	eor w8,w12,w10
008e265c	eor w22,w9,w22
008e2660	add w12,w12,w16
008e2664	ror w8,w8,#0x10
008e2668	add w19,w30,w19
008e266c	ror w22,w22,#0x7
008e2670	eor w11,w19,w11
008e2674	add w10,w10,w20
008e2678	mov w6,w16
008e267c	add w26,w8,w19
008e2680	add w19,w29,w22
008e2684	eor w25,w10,w25
008e2688	eor w23,w26,w23
008e268c	eor w20,w19,w30
008e2690	ror w11,w11,#0x7
008e2694	ror w23,w23,#0xc
008e2698	ror w29,w20,#0x10
008e269c	ror w25,w25,#0x7
008e26a0	str w16,[sp, #0x8]
008e26a4	ldr w16,[sp, #0x3c]
008e26a8	add w12,w12,w23
008e26ac	str w17,[sp, #0x40]
008e26b0	ldr w17,[sp, #0x20]
008e26b4	eor w8,w12,w8
008e26b8	str x0,[sp, #0x10]
008e26bc	mov w0,w3
008e26c0	ror w20,w8,#0x8
008e26c4	add w8,w13,w3
008e26c8	add w13,w29,w21
008e26cc	add w8,w8,w11
008e26d0	add w21,w24,w15
008e26d4	eor w22,w13,w22
008e26d8	eor w24,w8,w27
008e26dc	add w27,w21,w25
008e26e0	ror w30,w22,#0xc
008e26e4	ror w24,w24,#0x10
008e26e8	eor w21,w27,w28
008e26ec	add w22,w19,w16
008e26f0	add w19,w20,w26
008e26f4	ror w26,w21,#0x10
008e26f8	add w22,w22,w30
008e26fc	add w10,w24,w10
008e2700	eor w21,w22,w29
008e2704	ldr w3,[sp, #0x18]
008e2708	eor w11,w10,w11
008e270c	add w9,w26,w9
008e2710	ror w21,w21,#0x8
008e2714	ror w11,w11,#0xc
008e2718	eor w25,w9,w25
008e271c	add w8,w8,w17
008e2720	ror w28,w25,#0xc
008e2724	add w13,w21,w13
008e2728	add w25,w27,w3
008e272c	add w8,w8,w11
008e2730	eor w23,w19,w23
008e2734	eor w27,w13,w30
008e2738	eor w29,w8,w24
008e273c	add w24,w25,w28
008e2740	ror w23,w23,#0x7
008e2744	ror w27,w27,#0x7
008e2748	eor w25,w24,w26
008e274c	ror w29,w29,#0x8
008e2750	add w12,w12,w1
008e2754	ror w26,w25,#0x8
008e2758	add w8,w8,w4
008e275c	add w25,w12,w27
008e2760	add w8,w8,w23
008e2764	add w10,w29,w10
008e2768	eor w12,w25,w29
008e276c	add w9,w26,w9
008e2770	eor w26,w8,w26
008e2774	ror w12,w12,#0x10
008e2778	eor w28,w9,w28
008e277c	ror w29,w26,#0x10
008e2780	ror w28,w28,#0x7
008e2784	eor w11,w10,w11
008e2788	add w22,w22,w7
008e278c	add w26,w12,w9
008e2790	add w13,w29,w13
008e2794	ldr w1,[sp, #0x40]
008e2798	ror w11,w11,#0x7
008e279c	eor w9,w26,w27
008e27a0	eor w23,w13,w23
008e27a4	add w27,w22,w28
008e27a8	ror w23,w23,#0xc
008e27ac	add w22,w24,w1
008e27b0	eor w20,w27,w20
008e27b4	add w8,w8,w0
008e27b8	add w24,w22,w11
008e27bc	ror w30,w20,#0x10
008e27c0	ror w9,w9,#0xc
008e27c4	add w22,w8,w23
008e27c8	eor w8,w24,w21
008e27cc	add w25,w25,w14
008e27d0	eor w21,w22,w29
008e27d4	ror w8,w8,#0x10
008e27d8	add w20,w30,w10
008e27dc	add w10,w25,w9
008e27e0	ror w21,w21,#0x8
008e27e4	eor w25,w20,w28
008e27e8	mov w7,w14
008e27ec	add w28,w8,w19
008e27f0	ror w25,w25,#0xc
008e27f4	ldr w14,[sp, #0x24]
008e27f8	add w19,w21,w13
008e27fc	eor w11,w28,w11
008e2800	add w13,w27,w3
008e2804	eor w23,w19,w23
008e2808	ror w11,w11,#0xc
008e280c	add w13,w13,w25
008e2810	ror w29,w23,#0x7
008e2814	add w23,w24,w14
008e2818	eor w27,w13,w30
008e281c	eor w12,w10,w12
008e2820	add w24,w23,w11
008e2824	ror w30,w27,#0x8
008e2828	add w10,w10,w2
008e282c	ror w27,w12,#0x8
008e2830	eor w8,w24,w8
008e2834	add w10,w10,w29
008e2838	ror w8,w8,#0x8
008e283c	add w13,w13,w16
008e2840	eor w12,w10,w30
008e2844	add w23,w27,w26
008e2848	add w10,w10,w17
008e284c	ror w12,w12,#0x10
008e2850	eor w9,w23,w9
008e2854	add w28,w8,w28
008e2858	ror w9,w9,#0x7
008e285c	eor w11,w28,w11
008e2860	mov w16,w17
008e2864	add w26,w12,w28
008e2868	ror w11,w11,#0x7
008e286c	mov w2,w1
008e2870	eor w29,w26,w29
008e2874	add w13,w13,w9
008e2878	str w15,[sp, #0x1c]
008e287c	ror w28,w29,#0xc
008e2880	eor w8,w13,w8
008e2884	add w29,w30,w20
008e2888	ror w8,w8,#0x10
008e288c	eor w20,w29,w25
008e2890	str w4,[sp, #0x28]
008e2894	add w10,w10,w28
008e2898	ror w25,w20,#0x7
008e289c	str w0,[sp, #0x2c]
008e28a0	eor w12,w10,w12
008e28a4	add w30,w8,w19
008e28a8	add w19,w24,w6
008e28ac	ror w20,w12,#0x8
008e28b0	add w12,w22,w15
008e28b4	eor w9,w30,w9
008e28b8	ldp w14,w17,[sp, #0x44]
008e28bc	add w12,w12,w11
008e28c0	add w24,w19,w25
008e28c4	ror w9,w9,#0xc
008e28c8	eor w22,w12,w27
008e28cc	eor w21,w24,w21
008e28d0	add w19,w20,w26
008e28d4	ror w27,w22,#0x10
008e28d8	add w13,w13,w14
008e28dc	ror w26,w21,#0x10
008e28e0	add w22,w13,w9
008e28e4	eor w13,w19,w28
008e28e8	ldr w6,[sp, #0xc]
008e28ec	add w28,w27,w29
008e28f0	eor w8,w22,w8
008e28f4	add w29,w26,w23
008e28f8	eor w11,w28,w11
008e28fc	ror w21,w8,#0x8
008e2900	ror w23,w13,#0x7
008e2904	ror w8,w11,#0xc
008e2908	eor w11,w29,w25
008e290c	add w12,w12,w17
008e2910	ror w11,w11,#0xc
008e2914	add w13,w21,w30
008e2918	add w24,w24,w6
008e291c	add w12,w12,w8
008e2920	eor w9,w13,w9
008e2924	add w10,w10,w4
008e2928	eor w25,w12,w27
008e292c	add w24,w24,w11
008e2930	ror w9,w9,#0x7
008e2934	ror w27,w25,#0x8
008e2938	eor w25,w24,w26
008e293c	add w22,w22,w1
008e2940	ror w26,w25,#0x8
008e2944	add w25,w10,w9
008e2948	add w10,w12,w0
008e294c	add w10,w10,w23
008e2950	add w12,w27,w28
008e2954	eor w27,w25,w27
008e2958	add w28,w26,w29
008e295c	eor w26,w10,w26
008e2960	ror w27,w27,#0x10
008e2964	eor w11,w28,w11
008e2968	ror w29,w26,#0x10
008e296c	eor w8,w12,w8
008e2970	ror w11,w11,#0x7
008e2974	ror w8,w8,#0x7
008e2978	add w26,w27,w28
008e297c	add w13,w29,w13
008e2980	add w10,w10,w15
008e2984	eor w9,w26,w9
008e2988	eor w23,w13,w23
008e298c	add w28,w22,w11
008e2990	add w22,w24,w3
008e2994	ror w23,w23,#0xc
008e2998	eor w20,w28,w20
008e299c	add w24,w22,w8
008e29a0	ror w30,w20,#0x10
008e29a4	ldr w1,[sp, #0x4c]
008e29a8	ror w9,w9,#0xc
008e29ac	add w22,w10,w23
008e29b0	eor w10,w24,w21
008e29b4	ldr w15,[sp, #0x30]
008e29b8	eor w21,w22,w29
008e29bc	ror w10,w10,#0x10
008e29c0	add w20,w30,w12
008e29c4	add w25,w25,w1
008e29c8	ror w21,w21,#0x8
008e29cc	eor w11,w20,w11
008e29d0	add w12,w25,w9
008e29d4	add w29,w10,w19
008e29d8	ror w25,w11,#0xc
008e29dc	add w19,w21,w13
008e29e0	eor w8,w29,w8
008e29e4	add w11,w28,w6
008e29e8	eor w13,w19,w23
008e29ec	ror w8,w8,#0xc
008e29f0	add w11,w11,w25
008e29f4	eor w27,w12,w27
008e29f8	ror w13,w13,#0x7
008e29fc	add w23,w24,w15
008e2a00	eor w28,w11,w30
008e2a04	add w24,w23,w8
008e2a08	add w12,w12,w7
008e2a0c	ror w28,w28,#0x8
008e2a10	ror w27,w27,#0x8
008e2a14	eor w10,w24,w10
008e2a18	add w12,w12,w13
008e2a1c	ror w10,w10,#0x8
008e2a20	add w11,w11,w14
008e2a24	eor w30,w12,w28
008e2a28	add w23,w27,w26
008e2a2c	mov w4,w3
008e2a30	ror w30,w30,#0x10
008e2a34	eor w9,w23,w9
008e2a38	add w29,w10,w29
008e2a3c	ror w9,w9,#0x7
008e2a40	eor w8,w29,w8
008e2a44	add w28,w28,w20
008e2a48	add w26,w30,w29
008e2a4c	ldr w3,[sp, #0x8]
008e2a50	add w12,w12,w17
008e2a54	eor w13,w26,w13
008e2a58	add w11,w11,w9
008e2a5c	eor w20,w28,w25
008e2a60	ror w13,w13,#0xc
008e2a64	eor w10,w11,w10
008e2a68	ror w8,w8,#0x7
008e2a6c	ror w10,w10,#0x10
008e2a70	ror w25,w20,#0x7
008e2a74	add w22,w22,w3
008e2a78	add w12,w12,w13
008e2a7c	ldr w14,[sp, #0x24]
008e2a80	mov w7,w4
008e2a84	eor w20,w12,w30
008e2a88	add w29,w10,w19
008e2a8c	add w30,w22,w8
008e2a90	add w19,w24,w16
008e2a94	ror w20,w20,#0x8
008e2a98	eor w9,w29,w9
008e2a9c	ldp w17,w15,[sp, #0x38]
008e2aa0	eor w22,w30,w27
008e2aa4	add w24,w19,w25
008e2aa8	ror w9,w9,#0xc
008e2aac	ror w27,w22,#0x10
008e2ab0	eor w21,w24,w21
008e2ab4	add w19,w20,w26
008e2ab8	add w11,w11,w17
008e2abc	ror w26,w21,#0x10
008e2ac0	add w24,w24,w15
008e2ac4	add w22,w11,w9
008e2ac8	eor w11,w19,w13
008e2acc	add w13,w27,w28
008e2ad0	eor w10,w22,w10
008e2ad4	eor w8,w13,w8
008e2ad8	add w28,w26,w23
008e2adc	ror w21,w10,#0x8
008e2ae0	ror w8,w8,#0xc
008e2ae4	eor w10,w28,w25
008e2ae8	ror w23,w11,#0x7
008e2aec	add w11,w30,w14
008e2af0	ror w10,w10,#0xc
008e2af4	add w29,w21,w29
008e2af8	add w11,w11,w8
008e2afc	ldr w16,[sp, #0x1c]
008e2b00	eor w9,w29,w9
008e2b04	eor w25,w11,w27
008e2b08	add w24,w24,w10
008e2b0c	ror w9,w9,#0x7
008e2b10	ror w27,w25,#0x8
008e2b14	eor w25,w24,w26
008e2b18	add w12,w12,w0
008e2b1c	ror w26,w25,#0x8
008e2b20	add w11,w11,w16
008e2b24	add w25,w12,w9
008e2b28	add w11,w11,w23
008e2b2c	add w12,w27,w13
008e2b30	eor w13,w25,w27
008e2b34	add w27,w26,w28
008e2b38	eor w26,w11,w26
008e2b3c	ror w13,w13,#0x10
008e2b40	eor w10,w27,w10
008e2b44	ror w28,w26,#0x10
008e2b48	ror w10,w10,#0x7
008e2b4c	eor w8,w12,w8
008e2b50	add w22,w22,w4
008e2b54	add w26,w13,w27
008e2b58	add w27,w28,w29
008e2b5c	ror w8,w8,#0x7
008e2b60	eor w23,w27,w23
008e2b64	add w29,w22,w10
008e2b68	add w22,w24,w6
008e2b6c	ror w23,w23,#0xc
008e2b70	eor w20,w29,w20
008e2b74	add w11,w11,w3
008e2b78	add w24,w22,w8
008e2b7c	ror w30,w20,#0x10
008e2b80	eor w9,w26,w9
008e2b84	add w22,w11,w23
008e2b88	eor w11,w24,w21
008e2b8c	ror w9,w9,#0xc
008e2b90	eor w21,w22,w28
008e2b94	ror w11,w11,#0x10
008e2b98	add w20,w30,w12
008e2b9c	add w25,w25,w2
008e2ba0	ror w21,w21,#0x8
008e2ba4	eor w10,w20,w10
008e2ba8	add w12,w25,w9
008e2bac	add w28,w11,w19
008e2bb0	ror w25,w10,#0xc
008e2bb4	add w19,w21,w27
008e2bb8	eor w8,w28,w8
008e2bbc	add w10,w29,w15
008e2bc0	mov w4,w15
008e2bc4	ldr w15,[sp, #0x28]
008e2bc8	eor w23,w19,w23
008e2bcc	ror w8,w8,#0xc
008e2bd0	add w10,w10,w25
008e2bd4	ror w29,w23,#0x7
008e2bd8	add w23,w24,w15
008e2bdc	eor w27,w10,w30
008e2be0	eor w13,w12,w13
008e2be4	add w24,w23,w8
008e2be8	ror w30,w27,#0x8
008e2bec	add w12,w12,w1
008e2bf0	eor w11,w24,w11
008e2bf4	add w12,w12,w29
008e2bf8	ror w27,w13,#0x8
008e2bfc	ror w11,w11,#0x8
008e2c00	eor w13,w12,w30
008e2c04	add w10,w10,w17
008e2c08	ror w13,w13,#0x10
008e2c0c	add w23,w27,w26
008e2c10	add w12,w12,w14
008e2c14	add w28,w11,w28
008e2c18	eor w9,w23,w9
008e2c1c	ldr w15,[sp, #0x20]
008e2c20	add w26,w13,w28
008e2c24	ror w9,w9,#0x7
008e2c28	eor w8,w28,w8
008e2c2c	eor w29,w26,w29
008e2c30	ror w8,w8,#0x7
008e2c34	ldr w17,[sp, #0x48]
008e2c38	ror w28,w29,#0xc
008e2c3c	add w10,w10,w9
008e2c40	add w29,w30,w20
008e2c44	eor w11,w10,w11
008e2c48	eor w20,w29,w25
008e2c4c	mov w2,w14
008e2c50	add w12,w12,w28
008e2c54	ror w11,w11,#0x10
008e2c58	ror w25,w20,#0x7
008e2c5c	eor w13,w12,w13
008e2c60	ldr w14,[sp, #0x44]
008e2c64	add w12,w12,w16
008e2c68	ror w20,w13,#0x8
008e2c6c	add w13,w22,w15
008e2c70	add w30,w11,w19
008e2c74	add w13,w13,w8
008e2c78	add w19,w24,w17
008e2c7c	eor w9,w30,w9
008e2c80	ldp w1,w0,[sp, #0x30]
008e2c84	eor w22,w13,w27
008e2c88	add w24,w19,w25
008e2c8c	ror w9,w9,#0xc
008e2c90	ror w27,w22,#0x10
008e2c94	eor w21,w24,w21
008e2c98	add w19,w20,w26
008e2c9c	add w10,w10,w0
008e2ca0	ror w26,w21,#0x10
008e2ca4	add w24,w24,w14
008e2ca8	add w22,w10,w9
008e2cac	eor w10,w19,w28
008e2cb0	add w28,w27,w29
008e2cb4	eor w8,w28,w8
008e2cb8	add w29,w26,w23
008e2cbc	eor w11,w22,w11
008e2cc0	ror w23,w10,#0x7
008e2cc4	ror w8,w8,#0xc
008e2cc8	eor w10,w29,w25
008e2ccc	ror w21,w11,#0x8
008e2cd0	add w11,w13,w1
008e2cd4	ror w10,w10,#0xc
008e2cd8	add w11,w11,w8
008e2cdc	add w22,w22,w6
008e2ce0	ldr w16,[sp, #0x2c]
008e2ce4	add w13,w21,w30
008e2ce8	eor w25,w11,w27
008e2cec	add w24,w24,w10
008e2cf0	eor w9,w13,w9
008e2cf4	ror w27,w25,#0x8
008e2cf8	eor w25,w24,w26
008e2cfc	ror w9,w9,#0x7
008e2d00	ror w26,w25,#0x8
008e2d04	add w11,w11,w3
008e2d08	add w11,w11,w23
008e2d0c	add w25,w12,w9
008e2d10	add w12,w27,w28
008e2d14	add w28,w26,w29
008e2d18	eor w26,w11,w26
008e2d1c	eor w27,w25,w27
008e2d20	eor w10,w28,w10
008e2d24	ror w29,w26,#0x10
008e2d28	ror w27,w27,#0x10
008e2d2c	ror w10,w10,#0x7
008e2d30	eor w8,w12,w8
008e2d34	add w11,w11,w15
008e2d38	add w13,w29,w13
008e2d3c	ror w8,w8,#0x7
008e2d40	add w26,w27,w28
008e2d44	eor w23,w13,w23
008e2d48	add w28,w22,w10
008e2d4c	add w22,w24,w4
008e2d50	ror w23,w23,#0xc
008e2d54	eor w20,w28,w20
008e2d58	add w30,w22,w8
008e2d5c	ror w20,w20,#0x10
008e2d60	eor w21,w30,w21
008e2d64	eor w9,w26,w9
008e2d68	add w11,w11,w23
008e2d6c	add w22,w25,w7
008e2d70	ror w9,w9,#0xc
008e2d74	eor w25,w11,w29
008e2d78	ror w29,w21,#0x10
008e2d7c	add w24,w20,w12
008e2d80	ror w21,w25,#0x8
008e2d84	eor w10,w24,w10
008e2d88	add w12,w22,w9
008e2d8c	add w19,w29,w19
008e2d90	ror w25,w10,#0xc
008e2d94	add w10,w28,w14
008e2d98	add w22,w21,w13
008e2d9c	eor w8,w19,w8
008e2da0	eor w27,w12,w27
008e2da4	eor w13,w22,w23
008e2da8	ror w8,w8,#0xc
008e2dac	add w10,w10,w25
008e2db0	add w23,w30,w16
008e2db4	ldr w16,[sp, #0x40]
008e2db8	ror w13,w13,#0x7
008e2dbc	eor w20,w10,w20
008e2dc0	add w28,w23,w8
008e2dc4	ror w27,w27,#0x8
008e2dc8	ror w20,w20,#0x8
008e2dcc	add w12,w12,w16
008e2dd0	eor w23,w28,w29
008e2dd4	add w12,w12,w13
008e2dd8	ror w29,w23,#0x8
008e2ddc	add w23,w27,w26
008e2de0	eor w30,w12,w20
008e2de4	eor w9,w23,w9
008e2de8	add w10,w10,w0
008e2dec	ror w30,w30,#0x10
008e2df0	add w26,w29,w19
008e2df4	ror w9,w9,#0x7
008e2df8	add w24,w20,w24
008e2dfc	eor w8,w26,w8
008e2e00	add w28,w28,w2
008e2e04	add w19,w30,w26
008e2e08	add w10,w10,w9
008e2e0c	ror w8,w8,#0x7
008e2e10	eor w13,w19,w13
008e2e14	eor w20,w10,w29
008e2e18	add w11,w11,w17
008e2e1c	ror w26,w13,#0xc
008e2e20	eor w13,w24,w25
008e2e24	ror w25,w20,#0x10
008e2e28	ror w13,w13,#0x7
008e2e2c	add w12,w12,w1
008e2e30	add w11,w11,w8
008e2e34	add w29,w25,w22
008e2e38	add w12,w12,w26
008e2e3c	mov w16,w17
008e2e40	add w28,w28,w13
008e2e44	eor w9,w29,w9
008e2e48	eor w22,w11,w27
008e2e4c	eor w21,w28,w21
008e2e50	ldr w17,[sp, #0x4c]
008e2e54	eor w20,w12,w30
008e2e58	ror w27,w21,#0x10
008e2e5c	ror w9,w9,#0xc
008e2e60	ror w30,w22,#0x10
008e2e64	add w10,w10,w17
008e2e68	ror w20,w20,#0x8
008e2e6c	ldr w4,[sp, #0x28]
008e2e70	add w7,w27,w23
008e2e74	add w22,w10,w9
008e2e78	add w10,w30,w24
008e2e7c	eor w13,w7,w13
008e2e80	eor w23,w10,w8
008e2e84	ldr w8,[sp, #0x38]
008e2e88	eor w21,w22,w25
008e2e8c	ror w13,w13,#0xc
008e2e90	add w0,w20,w19
008e2e94	ror w21,w21,#0x8
008e2e98	add w19,w28,w8
008e2e9c	ror w25,w23,#0xc
008e2ea0	add w23,w19,w13
008e2ea4	add w11,w11,w4
008e2ea8	add w12,w12,w3
008e2eac	add w24,w21,w29
008e2eb0	eor w19,w23,w27
008e2eb4	add w11,w11,w25
008e2eb8	eor w9,w24,w9
008e2ebc	ror w28,w19,#0x8
008e2ec0	eor w27,w11,w30
008e2ec4	ror w19,w9,#0x7
008e2ec8	add w9,w11,w15
008e2ecc	eor w11,w0,w26
008e2ed0	ror w17,w27,#0x8
008e2ed4	ror w11,w11,#0x7
008e2ed8	add w7,w28,w7
008e2edc	add w12,w12,w19
008e2ee0	eor w13,w7,w13
008e2ee4	ldr w15,[sp, #0x3c]
008e2ee8	add w10,w17,w10
008e2eec	eor w17,w12,w17
008e2ef0	add w26,w12,w6
008e2ef4	ror w12,w13,#0x7
008e2ef8	add w9,w9,w11
008e2efc	add w15,w22,w15
008e2f00	eor w13,w9,w28
008e2f04	add w9,w9,w16
008e2f08	eor w16,w10,w25
008e2f0c	ror w13,w13,#0x10
008e2f10	add w15,w15,w12
008e2f14	ror w22,w17,#0x10
008e2f18	eor w17,w15,w20
008e2f1c	ror w16,w16,#0x7
008e2f20	add w20,w23,w14
008e2f24	add w23,w13,w24
008e2f28	ror w24,w17,#0x10
008e2f2c	ldr w14,[sp, #0x1c]
008e2f30	eor w11,w23,w11
008e2f34	add w6,w22,w7
008e2f38	add w17,w20,w16
008e2f3c	ror w11,w11,#0xc
008e2f40	add w10,w24,w10
008e2f44	eor w7,w17,w21
008e2f48	add w14,w17,w14
008e2f4c	eor w17,w6,w19
008e2f50	eor w19,w10,w12
008e2f54	add w12,w9,w11
008e2f58	ror w9,w7,#0x10
008e2f5c	ror w19,w19,#0xc
008e2f60	add w15,w15,w8
008e2f64	eor w13,w12,w13
008e2f68	ror w20,w17,#0xc
008e2f6c	ror w21,w13,#0x8
008e2f70	add w8,w9,w0
008e2f74	add w17,w15,w19
008e2f78	eor w16,w8,w16
008e2f7c	eor w24,w17,w24
008e2f80	ldr w0,[sp, #0x18]
008e2f84	add w13,w21,w23
008e2f88	ror w7,w16,#0xc
008e2f8c	ror w23,w24,#0x8
008e2f90	add w15,w26,w20
008e2f94	eor w11,w13,w11
008e2f98	add w12,w12,w2
008e2f9c	eor w16,w15,w22
008e2fa0	add w3,w15,w0
008e2fa4	ror w15,w11,#0x7
008e2fa8	add w11,w14,w7
008e2fac	add w14,w23,w10
008e2fb0	ror w16,w16,#0x8
008e2fb4	eor w10,w14,w19
008e2fb8	eor w9,w11,w9
008e2fbc	add w11,w11,w1
008e2fc0	ror w10,w10,#0x7
008e2fc4	add w3,w3,w15
008e2fc8	add w6,w16,w6
008e2fcc	ror w9,w9,#0x8
008e2fd0	eor w19,w3,w23
008e2fd4	add w4,w3,w4
008e2fd8	eor w3,w6,w20
008e2fdc	add w11,w11,w10
008e2fe0	ldr w0,[sp, #0x4c]
008e2fe4	ror w3,w3,#0x7
008e2fe8	eor w20,w11,w21
008e2fec	add w8,w9,w8
008e2ff0	add w17,w17,w0
008e2ff4	ror w20,w20,#0x10
008e2ff8	eor w7,w8,w7
008e2ffc	add w17,w17,w3
008e3000	ror w7,w7,#0x7
008e3004	ror w19,w19,#0x10
008e3008	add w6,w20,w6
008e300c	eor w9,w17,w9
008e3010	ldr w0,[sp, #0x34]
008e3014	eor w10,w6,w10
008e3018	ror w9,w9,#0x10
008e301c	add w22,w12,w7
008e3020	ror w12,w10,#0xc
008e3024	add w11,w11,w0
008e3028	add w21,w19,w8
008e302c	eor w10,w22,w16
008e3030	add w13,w9,w13
008e3034	eor w8,w21,w15
008e3038	ror w15,w10,#0x10
008e303c	add w16,w11,w12
008e3040	eor w10,w13,w3
008e3044	ror w3,w8,#0xc
008e3048	eor w8,w16,w20
008e304c	ror w20,w10,#0xc
008e3050	ldr w10,[sp, #0x40]
008e3054	add w23,w15,w14
008e3058	ror w8,w8,#0x8
008e305c	eor w11,w23,w7
008e3060	add w14,w4,w3
008e3064	add w10,w17,w10
008e3068	ror w17,w11,#0xc
008e306c	add w11,w8,w6
008e3070	add w1,w10,w20
008e3074	ldr w10,[sp, #0x2c]
008e3078	eor w2,w11,w14
008e307c	eor w9,w1,w9
008e3080	eor w14,w14,w19
008e3084	lsr w6,w2,#0x10
008e3088	add w10,w22,w10
008e308c	ror w9,w9,#0x8
008e3090	strb w2,[x5]
008e3094	add w4,w10,w17
008e3098	lsr w10,w2,#0x8
008e309c	lsr w2,w2,#0x18
008e30a0	add w13,w9,w13
008e30a4	strb w6,[x5, #0x2]
008e30a8	eor w15,w4,w15
008e30ac	strb w10,[x5, #0x1]
008e30b0	eor w7,w13,w4
008e30b4	ror w10,w14,#0x8
008e30b8	lsr w6,w7,#0x8
008e30bc	strb w2,[x5, #0x3]
008e30c0	lsr w2,w7,#0x10
008e30c4	add w14,w10,w21
008e30c8	ror w15,w15,#0x8
008e30cc	lsr w4,w7,#0x18
008e30d0	strb w6,[x5, #0x5]
008e30d4	eor w6,w14,w16
008e30d8	eor w12,w11,w12
008e30dc	strb w2,[x5, #0x6]
008e30e0	lsr w2,w6,#0x8
008e30e4	add w16,w15,w23
008e30e8	strb w4,[x5, #0x7]
008e30ec	lsr w4,w6,#0x18
008e30f0	eor w1,w16,w1
008e30f4	strb w2,[x5, #0x9]
008e30f8	lsr w2,w6,#0x10
008e30fc	eor w17,w16,w17
008e3100	strb w4,[x5, #0xb]
008e3104	eor w4,w13,w20
008e3108	eor w17,w9,w17, ROR #0x7
008e310c	strb w2,[x5, #0xa]
008e3110	lsr w2,w1,#0x8
008e3114	eor w4,w15,w4, ROR #0x7
008e3118	strb w1,[x5, #0xc]
008e311c	eor w12,w10,w12, ROR #0x7
008e3120	strb w2,[x5, #0xd]
008e3124	lsr w2,w1,#0x10
008e3128	lsr w1,w1,#0x18
008e312c	strb w17,[x5, #0x18]
008e3130	ldp x20,x19,[sp, #0xa0]
008e3134	strb w2,[x5, #0xe]
008e3138	lsr w2,w4,#0x8
008e313c	strb w1,[x5, #0xf]
008e3140	eor w1,w14,w3
008e3144	lsr w3,w4,#0x18
008e3148	strb w2,[x5, #0x11]
008e314c	lsr w2,w4,#0x10
008e3150	eor w1,w8,w1, ROR #0x7
008e3154	strb w12,[x5, #0x1c]
008e3158	ldp x22,x21,[sp, #0x90]
008e315c	strb w2,[x5, #0x12]
008e3160	lsr w2,w1,#0x8
008e3164	strb w1,[x5, #0x14]
008e3168	ldp x24,x23,[sp, #0x80]
008e316c	strb w2,[x5, #0x15]
008e3170	lsr w2,w1,#0x10
008e3174	lsr w1,w1,#0x18
008e3178	strb w7,[x5, #0x4]
008e317c	ldp x26,x25,[sp, #0x70]
008e3180	strb w2,[x5, #0x16]
008e3184	lsr w2,w17,#0x8
008e3188	strb w1,[x5, #0x17]
008e318c	lsr w1,w17,#0x10
008e3190	lsr w17,w17,#0x18
008e3194	strb w6,[x5, #0x8]
008e3198	ldp x28,x27,[sp, #0x60]
008e319c	strb w17,[x5, #0x1b]
008e31a0	lsr w17,w12,#0x10
008e31a4	strb w1,[x5, #0x1a]
008e31a8	lsr w1,w12,#0x8
008e31ac	lsr w12,w12,#0x18
008e31b0	strb w17,[x5, #0x1e]
008e31b4	ldr x17,[sp, #0x10]
008e31b8	strb w4,[x5, #0x10]
008e31bc	ldp x29,x30,[sp, #0x50]
008e31c0	strb w3,[x5, #0x13]
008e31c4	strb w2,[x5, #0x19]
008e31c8	strb w1,[x5, #0x1d]
008e31cc	strb w12,[x5, #0x1f]
008e31d0	ldr w12,[x17]
008e31d4	eor w11,w11,w12
008e31d8	str w11,[x5, #0x20]
008e31dc	ldr w11,[x17, #0x4]
008e31e0	eor w11,w13,w11
008e31e4	str w11,[x5, #0x24]
008e31e8	ldr w11,[x17, #0x8]
008e31ec	eor w11,w14,w11
008e31f0	str w11,[x5, #0x28]
008e31f4	ldr w11,[x17, #0xc]
008e31f8	eor w11,w16,w11
008e31fc	str w11,[x5, #0x2c]
008e3200	ldr w11,[x17, #0x10]
008e3204	eor w11,w15,w11
008e3208	str w11,[x5, #0x30]
008e320c	ldr w11,[x17, #0x14]
008e3210	eor w8,w8,w11
008e3214	str w8,[x5, #0x34]
008e3218	ldr w8,[x17, #0x18]
008e321c	eor w8,w9,w8
008e3220	str w8,[x5, #0x38]
008e3224	ldr w8,[x17, #0x1c]
008e3228	eor w8,w10,w8
008e322c	str w8,[x5, #0x3c]
008e3230	add sp,sp,#0xb0
008e3234	ret
