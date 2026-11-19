; FUN_00be24e0 @ 00be24e0
00be24e0	paciasp
00be24e4	stp x29,x30,[sp, #-0x60]!
00be24e8	stp x28,x27,[sp, #0x10]
00be24ec	stp x26,x25,[sp, #0x20]
00be24f0	stp x24,x23,[sp, #0x30]
00be24f4	stp x22,x21,[sp, #0x40]
00be24f8	stp x20,x19,[sp, #0x50]
00be24fc	mov x29,sp
00be2500	sub sp,sp,#0x1a0
00be2504	mov x0,x3
00be2508	mov x20,x2
00be250c	mov x21,x1
00be2510	sub x8,x29,#0x98
00be2514	sub x1,x29,#0x78
00be2518	sub x2,x29,#0x7c
00be251c	sub x3,x29,#0x80
00be2520	stp x5,x4,[sp, #0x20]
00be2524	sub x25,x29,#0xb8
00be2528	bl 0x00c44130
00be252c	stp xzr,xzr,[x25, #0x8]
00be2530	str xzr,[x25, #0x18]
00be2534	sub x0,x29,#0xb0
00be2538	mov w1,#0x16
00be253c	mov w2,wzr
00be2540	sub x19,x29,#0xb0
00be2544	bl 0x00c30250
00be2548	ldurb w8,[x29, #-0xb0]
00be254c	ldr x9,[x25, #0x18]
00be2550	mov w26,wzr
00be2554	add x27,sp,#0x48
00be2558	mov w10,#0x1
00be255c	orr x28,x19,#0x1
00be2560	tst w8,#0x1
00be2564	mov w8,#0x45
00be2568	add x22,sp,#0x3c
00be256c	csinc x23,x9,x19,ne
00be2570	add x19,sp,#0x40
00be2574	str wzr,[sp, #0x3c]
00be2578	str x27,[sp, #0x40]
00be257c	strb w10,[sp, #0x38]
00be2580	strb w8,[sp, #0x34]
00be2584	str x23,[x25]
00be2588	b 0x00be2594
00be258c	add x8,x8,#0x4
00be2590	str x8,[x21, #0x18]
00be2594	cbz x21,0x00be25ac
00be2598	ldp x8,x9,[x21, #0x18]
00be259c	cmp x8,x9
00be25a0	b.eq 0x00be25bc
00be25a4	ldr w0,[x8]
00be25a8	b 0x00be25cc
00be25ac	mov w24,#0x1
00be25b0	cbnz x20,0x00be25dc
00be25b4	tbz w24,#0x0,0x00be2614
00be25b8	b 0x00be27e4
00be25bc	ldr x8,[x21]
00be25c0	ldr x8,[x8, #0x48]
00be25c4	mov x0,x21
00be25c8	blr x8
00be25cc	cmn w0,#0x1
00be25d0	cset w24,eq
00be25d4	csel x21,xzr,x21,eq
00be25d8	cbz x20,0x00be25b4
00be25dc	ldp x8,x9,[x20, #0x18]
00be25e0	cmp x8,x9
00be25e4	b.eq 0x00be25f0
00be25e8	ldr w0,[x8]
00be25ec	b 0x00be2600
00be25f0	ldr x8,[x20]
00be25f4	ldr x8,[x8, #0x48]
00be25f8	mov x0,x20
00be25fc	blr x8
00be2600	cmn w0,#0x1
00be2604	cset w8,eq
00be2608	csel x20,xzr,x20,eq
00be260c	cmp w24,w8
00be2610	b.eq 0x00be27e4
00be2614	ldurb w8,[x29, #-0xb0]
00be2618	ldr x9,[x25, #0x10]
00be261c	ldr x11,[x25]
00be2620	lsr x10,x8,#0x1
00be2624	tst w8,#0x1
00be2628	csel x24,x10,x9,eq
00be262c	add x9,x23,x24
00be2630	cmp x11,x9
00be2634	b.ne 0x00be26f0
00be2638	cmp x24,#0x1
00be263c	b.lt 0x00be2654
00be2640	sub x0,x29,#0xb0
00be2644	mov x1,x24
00be2648	mov w2,wzr
00be264c	bl 0x00c30250
00be2650	b 0x00be2678
00be2654	lsl x9,x24,#0x1
00be2658	tbnz w8,#0x0,0x00be266c
00be265c	lsl w8,w9,#0x1
00be2660	sturb w8,[x29, #-0xb0]
00be2664	mov x8,x28
00be2668	b 0x00be2674
00be266c	ldr x8,[x25, #0x18]
00be2670	str x9,[x25, #0x10]
00be2674	strb wzr,[x8, x9]
00be2678	ldp x9,x10,[x25, #0x8]
00be267c	ldurb w8,[x29, #-0xb0]
00be2680	tst w8,#0x1
00be2684	mov w8,#0x16
00be2688	and x11,x9,#-0x2
00be268c	ubfx x12,x9,#0x1,#0x7
00be2690	sub x11,x11,#0x1
00be2694	csel x8,x8,x11,eq
00be2698	tst x9,#0x1
00be269c	csel x10,x12,x10,eq
00be26a0	subs x1,x8,x10
00be26a4	b.ls 0x00be26b8
00be26a8	sub x0,x29,#0xb0
00be26ac	mov w2,wzr
00be26b0	bl 0x00c30250
00be26b4	b 0x00be26d8
00be26b8	tbnz w9,#0x0,0x00be26cc
00be26bc	lsl w9,w8,#0x1
00be26c0	sturb w9,[x29, #-0xb0]
00be26c4	mov x9,x28
00be26c8	b 0x00be26d4
00be26cc	ldr x9,[x25, #0x18]
00be26d0	str x8,[x25, #0x10]
00be26d4	strb wzr,[x9, x8]
00be26d8	ldurb w8,[x29, #-0xb0]
00be26dc	ldr x9,[x25, #0x18]
00be26e0	tst w8,#0x1
00be26e4	csel x23,x28,x9,eq
00be26e8	add x8,x23,x24
00be26ec	str x8,[x25]
00be26f0	ldp x8,x9,[x21, #0x18]
00be26f4	cmp x8,x9
00be26f8	b.eq 0x00be2704
00be26fc	ldr w0,[x8]
00be2700	b 0x00be2714
00be2704	ldr x8,[x21]
00be2708	ldr x8,[x8, #0x48]
00be270c	mov x0,x21
00be2710	blr x8
00be2714	ldp w6,w5,[x29, #-0x80]
00be2718	add x1,sp,#0x38
00be271c	sub x8,x29,#0x78
00be2720	add x2,sp,#0x34
00be2724	sub x4,x29,#0xb8
00be2728	sub x7,x29,#0x98
00be272c	mov x3,x23
00be2730	stp x22,x8,[sp, #0x10]
00be2734	stp x27,x19,[sp]
00be2738	bl 0x00c44140
00be273c	cbnz w0,0x00be27e4
00be2740	tbz w26,#0x0,0x00be274c
00be2744	mov w26,#0x1
00be2748	b 0x00be27ac
00be274c	ldr x8,[x25]
00be2750	sub x9,x8,x23
00be2754	cmp x9,#0x1
00be2758	b.lt 0x00be27a8
00be275c	ldrb w8,[x23]
00be2760	cmp w8,#0x2b
00be2764	b.eq 0x00be2770
00be2768	cmp w8,#0x2d
00be276c	b.ne 0x00be27cc
00be2770	cmp x9,#0x1
00be2774	b.eq 0x00be27a8
00be2778	cmp w8,#0x2d
00be277c	b.eq 0x00be2788
00be2780	cmp w8,#0x2b
00be2784	b.ne 0x00be27a8
00be2788	ldrb w8,[x23, #0x1]
00be278c	mov w26,#0x1
00be2790	cmp w8,#0x2e
00be2794	b.eq 0x00be27ac
00be2798	sub w8,w8,#0x30
00be279c	cmp w8,#0x9
00be27a0	b.ls 0x00be27ac
00be27a4	b 0x00be27e4
00be27a8	mov w26,wzr
00be27ac	ldp x8,x9,[x21, #0x18]
00be27b0	cmp x8,x9
00be27b4	b.ne 0x00be258c
00be27b8	ldr x8,[x21]
00be27bc	ldr x8,[x8, #0x50]
00be27c0	mov x0,x21
00be27c4	blr x8
00be27c8	b 0x00be2594
00be27cc	cmp w8,#0x2e
00be27d0	mov w26,#0x1
00be27d4	b.eq 0x00be27ac
00be27d8	sub w8,w8,#0x30
00be27dc	cmp w8,#0xa
00be27e0	b.cc 0x00be27ac
00be27e4	ldurb w8,[x29, #-0x98]
00be27e8	ldr x9,[x25, #0x28]
00be27ec	ldr x22,[sp, #0x28]
00be27f0	lsr x10,x8,#0x1
00be27f4	tst w8,#0x1
00be27f8	csel x8,x10,x9,eq
00be27fc	cbz x8,0x00be282c
00be2800	ldrb w8,[sp, #0x38]
00be2804	cmp w8,#0x1
00be2808	b.ne 0x00be282c
00be280c	ldr x8,[sp, #0x40]
00be2810	add x9,sp,#0x48
00be2814	sub x9,x8,x9
00be2818	cmp x9,#0x9f
00be281c	b.gt 0x00be282c
00be2820	ldr w9,[sp, #0x3c]
00be2824	str w9,[x8], #0x4
00be2828	str x8,[sp, #0x40]
00be282c	ldr x1,[x25]
00be2830	mov x0,x23
00be2834	mov x2,x22
00be2838	bl 0x00c0c96c
00be283c	ldurb w10,[x29, #-0x98]
00be2840	ldr x12,[sp, #0x40]
00be2844	add x11,sp,#0x48
00be2848	ldr x8,[x25, #0x28]
00be284c	lsr x9,x10,#0x1
00be2850	ands w13,w10,#0x1
00be2854	sub x11,x12,x11
00be2858	csel x8,x9,x8,eq
00be285c	ldr x9,[sp, #0x20]
00be2860	cmp x11,#0x5
00be2864	str q0,[x9]
00be2868	b.lt 0x00be29c8
00be286c	cbz x8,0x00be29c8
00be2870	sub x8,x12,#0x4
00be2874	add x9,sp,#0x48
00be2878	cmp x9,x8
00be287c	cset w11,cc
00be2880	cmp x9,x12
00be2884	b.eq 0x00be2934
00be2888	cbz w11,0x00be2934
00be288c	add x10,sp,#0x48
00be2890	sub x14,x12,#0x8
00be2894	add x11,x10,#0x4
00be2898	cmp x14,x11
00be289c	csel x13,x14,x11,hi
00be28a0	sub x13,x13,#0x4
00be28a4	cmp x13,x10
00be28a8	cinc x15,x10,ne
00be28ac	cmp x13,x10
00be28b0	sub x15,x13,x15
00be28b4	lsr x15,x15,#0x3
00be28b8	cinc x13,x15,ne
00be28bc	cmp x13,#0x13
00be28c0	b.cc 0x00be2908
00be28c4	cmp x14,x11
00be28c8	csel x14,x14,x11,hi
00be28cc	sub x14,x14,#0x4
00be28d0	cmp x14,x10
00be28d4	cinc x15,x10,ne
00be28d8	cmp x14,x10
00be28dc	sub x15,x14,x15
00be28e0	lsr x15,x15,#0x3
00be28e4	cinc x14,x15,ne
00be28e8	cmp x10,x12
00be28ec	b.cs 0x00be2aa8
00be28f0	lsl x14,x14,#0x2
00be28f4	sub x15,x12,x14
00be28f8	add x11,x11,x14
00be28fc	sub x14,x15,#0x4
00be2900	cmp x14,x11
00be2904	b.cs 0x00be2aa8
00be2908	mov x11,x8
00be290c	add x10,x10,#0x4
00be2910	ldr w12,[x11]
00be2914	ldur w13,[x10, #-0x4]
00be2918	stur w12,[x10, #-0x4]
00be291c	str w13,[x11], #-0x4
00be2920	cmp x10,x11
00be2924	add x10,x10,#0x4
00be2928	b.cc 0x00be2910
00be292c	ldurb w10,[x29, #-0x98]
00be2930	and w13,w10,#0x1
00be2934	ldr x11,[x25, #0x30]
00be2938	cmp w13,#0x0
00be293c	sub x12,x29,#0x98
00be2940	csinc x11,x11,x12,ne
00be2944	cmp x9,x8
00be2948	b.cs 0x00be29a0
00be294c	lsr w9,w10,#0x1
00be2950	ldr x10,[x25, #0x28]
00be2954	cmp w13,#0x0
00be2958	csel x9,x9,x10,eq
00be295c	add x10,sp,#0x48
00be2960	add x9,x11,x9
00be2964	b 0x00be2980
00be2968	sub x12,x9,x11
00be296c	add x10,x10,#0x4
00be2970	cmp x12,#0x1
00be2974	cinc x11,x11,gt
00be2978	cmp x10,x8
00be297c	b.cs 0x00be29a0
00be2980	ldrb w12,[x11]
00be2984	cbz w12,0x00be2968
00be2988	cmp w12,#0xff
00be298c	b.eq 0x00be2968
00be2990	ldr w13,[x10]
00be2994	cmp w13,w12
00be2998	b.eq 0x00be2968
00be299c	b 0x00be29c0
00be29a0	ldrb w9,[x11]
00be29a4	cbz w9,0x00be29c8
00be29a8	cmp w9,#0xff
00be29ac	b.eq 0x00be29c8
00be29b0	ldr w8,[x8]
00be29b4	sub w8,w8,#0x1
00be29b8	cmp w8,w9
00be29bc	b.cc 0x00be29c8
00be29c0	mov w8,#0x4
00be29c4	str w8,[x22]
00be29c8	cbz x21,0x00be29e0
00be29cc	ldp x8,x9,[x21, #0x18]
00be29d0	cmp x8,x9
00be29d4	b.eq 0x00be29f0
00be29d8	ldr w0,[x8]
00be29dc	b 0x00be2a00
00be29e0	mov w19,#0x1
00be29e4	cbnz x20,0x00be2a10
00be29e8	tbnz w19,#0x0,0x00be2a44
00be29ec	b 0x00be2a50
00be29f0	ldr x8,[x21]
00be29f4	ldr x8,[x8, #0x48]
00be29f8	mov x0,x21
00be29fc	blr x8
00be2a00	cmn w0,#0x1
00be2a04	cset w19,eq
00be2a08	csel x21,xzr,x21,eq
00be2a0c	cbz x20,0x00be29e8
00be2a10	ldp x8,x9,[x20, #0x18]
00be2a14	cmp x8,x9
00be2a18	b.eq 0x00be2a24
00be2a1c	ldr w0,[x8]
00be2a20	b 0x00be2a34
00be2a24	ldr x8,[x20]
00be2a28	ldr x8,[x8, #0x48]
00be2a2c	mov x0,x20
00be2a30	blr x8
00be2a34	cmn w0,#0x1
00be2a38	cset w8,eq
00be2a3c	eor w8,w19,w8
00be2a40	tbnz w8,#0x0,0x00be2a50
00be2a44	ldr w8,[x22]
00be2a48	orr w8,w8,#0x2
00be2a4c	str w8,[x22]
00be2a50	ldurb w8,[x29, #-0xb0]
00be2a54	tbz w8,#0x0,0x00be2a68
00be2a58	ldr x8,[x25, #0x8]
00be2a5c	ldr x0,[x25, #0x18]
00be2a60	and x1,x8,#-0x2
00be2a64	bl 0x00c2fe80
00be2a68	ldurb w8,[x29, #-0x98]
00be2a6c	tbz w8,#0x0,0x00be2a80
00be2a70	ldr x8,[x25, #0x20]
00be2a74	ldr x0,[x25, #0x30]
00be2a78	and x1,x8,#-0x2
00be2a7c	bl 0x00c2fe80
00be2a80	mov x0,x21
00be2a84	add sp,sp,#0x1a0
00be2a88	ldp x20,x19,[sp, #0x50]
00be2a8c	ldp x22,x21,[sp, #0x40]
00be2a90	ldp x24,x23,[sp, #0x30]
00be2a94	ldp x26,x25,[sp, #0x20]
00be2a98	ldp x28,x27,[sp, #0x10]
00be2a9c	ldp x29,x30,[sp], #0x60
00be2aa0	autiasp
00be2aa4	ret
00be2aa8	add x13,x13,#0x1
00be2aac	add x15,sp,#0x48
00be2ab0	sub x12,x12,#0x10
00be2ab4	and x14,x13,#0x7ffffffffffffff8
00be2ab8	lsl x10,x14,#0x2
00be2abc	mov x16,x14
00be2ac0	sub x11,x8,x10
00be2ac4	add x10,x15,x10
00be2ac8	add x15,x15,#0x10
00be2acc	ldp q1,q0,[x12, #-0x10]
00be2ad0	sub x16,x16,#0x8
00be2ad4	ldp q2,q3,[x15, #-0x10]
00be2ad8	rev64 v0.4S,v0.4S
00be2adc	rev64 v1.4S,v1.4S
00be2ae0	rev64 v2.4S,v2.4S
00be2ae4	rev64 v3.4S,v3.4S
00be2ae8	ext v0.16B,v0.16B,v0.16B,0x8
00be2aec	ext v1.16B,v1.16B,v1.16B,0x8
00be2af0	ext v2.16B,v2.16B,v2.16B,0x8
00be2af4	ext v3.16B,v3.16B,v3.16B,0x8
00be2af8	stp q0,q1,[x15, #-0x10]
00be2afc	add x15,x15,#0x20
00be2b00	stp q3,q2,[x12, #-0x10]
00be2b04	sub x12,x12,#0x20
00be2b08	cbnz x16,0x00be2acc
00be2b0c	cmp x13,x14
00be2b10	b.eq 0x00be292c
00be2b14	b 0x00be290c
