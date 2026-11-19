; FUN_008b25f4 @ 008b25f4
008b25f4	sub sp,sp,#0x70
008b25f8	stp x29,x30,[sp, #0x10]
008b25fc	stp x28,x27,[sp, #0x20]
008b2600	stp x26,x25,[sp, #0x30]
008b2604	stp x24,x23,[sp, #0x40]
008b2608	stp x22,x21,[sp, #0x50]
008b260c	stp x20,x19,[sp, #0x60]
008b2610	add x29,sp,#0x10
008b2614	ldrb w8,[x2, #0x69]
008b2618	mov x20,x2
008b261c	tbz w8,#0x0,0x008b2a44
008b2620	ldr w8,[x20, #0x58]
008b2624	mov x21,x1
008b2628	str x0,[sp, #0x8]
008b262c	cbz w8,0x008b268c
008b2630	mov x23,xzr
008b2634	b 0x008b2648
008b2638	ldr w8,[x20, #0x58]
008b263c	add x23,x23,#0x1
008b2640	cmp x23,x8
008b2644	b.cs 0x008b268c
008b2648	ldr x9,[x20, #0x40]
008b264c	ldr x22,[x9, x23, LSL #0x3]
008b2650	cbz x22,0x008b263c
008b2654	ldr x0,[x21, #0x38]
008b2658	mov x1,x22
008b265c	bl 0x008bb440
008b2660	ldr w8,[x0, #0xc]
008b2664	cbz w8,0x008b2638
008b2668	ldr x8,[x20, #0x10]
008b266c	ldr x9,[x21, #0x10]
008b2670	adrp x1,0x2b6000
008b2674	add x1,x1,#0xd6b
008b2678	ldr x0,[sp, #0x8]
008b267c	add x2,x22,#0x18
008b2680	add x3,x8,#0x18
008b2684	add x4,x9,#0x18
008b2688	bl 0x008b39cc
008b268c	ldr x25,[sp, #0x8]
008b2690	ldr x19,[x21, #0x10]
008b2694	mov w1,#0x70
008b2698	ldrb w23,[x21, #0x69]
008b269c	mov w3,#0xb
008b26a0	mov w4,wzr
008b26a4	ldrb w2,[x25, #0x4]
008b26a8	mov x0,x25
008b26ac	mov w24,#0xb
008b26b0	bl 0x008b78d0
008b26b4	ldr x9,[x25, #0x60]
008b26b8	mov w10,#0x558c
008b26bc	ldrb w2,[x25, #0x4]
008b26c0	mov x22,x0
008b26c4	strb w24,[x0]
008b26c8	ldrb w11,[x9, #0x2]
008b26cc	ldr w8,[x9, x10#0x0]
008b26d0	strb w2,[x0, #0x1]
008b26d4	str x19,[x0, #0x10]
008b26d8	and w11,w11,#0x3
008b26dc	strb w11,[x0, #0x2]
008b26e0	cbz w8,0x008b26ec
008b26e4	add w11,w8,#0x1
008b26e8	str w11,[x9, x10#0x0]
008b26ec	movi v0.2D,#0x0
008b26f0	strb wzr,[x22, #0x68]
008b26f4	ldr x19,[sp, #0x8]
008b26f8	strb w23,[x22, #0x69]
008b26fc	mov w23,wzr
008b2700	str w8,[x22, #0x18]
008b2704	strb wzr,[x22, #0x6a]
008b2708	stur q0,[x22, #0x28]
008b270c	stur q0,[x22, #0x38]
008b2710	stur q0,[x22, #0x48]
008b2714	stur q0,[x22, #0x58]
008b2718	ldrb w9,[x20, #0x68]
008b271c	ldr w10,[x20, #0x5c]
008b2720	ldr w25,[x20, #0x58]
008b2724	str x20,[x22, #0x20]
008b2728	sub w24,w10,w9
008b272c	cmp w25,w24
008b2730	b.cs 0x008b2764
008b2734	ldr x8,[x20, #0x40]
008b2738	ldr x0,[x21, #0x38]
008b273c	ldr x1,[x8, x25, LSL #0x3]
008b2740	bl 0x008bb440
008b2744	ldr w8,[x0, #0xc]
008b2748	add x25,x25,#0x1
008b274c	cmp w8,#0x0
008b2750	cinc w23,w23,eq
008b2754	cmp x25,x24
008b2758	b.cc 0x008b2734
008b275c	ldr w25,[x20, #0x58]
008b2760	ldrb w2,[x22, #0x1]
008b2764	ldr w8,[x21, #0x5c]
008b2768	ldrb w9,[x21, #0x68]
008b276c	mov x0,x19
008b2770	add w8,w8,w25
008b2774	add w27,w8,w23
008b2778	sub w8,w27,w9
008b277c	ubfiz x1,x8,#0x3,#0x20
008b2780	bl 0x008b7610
008b2784	ldr w8,[x21, #0x60]
008b2788	ldr w9,[x20, #0x60]
008b278c	mov w1,wzr
008b2790	ldrb w10,[x21, #0x68]
008b2794	str x0,[x22, #0x40]
008b2798	mov x0,x19
008b279c	add w8,w8,w9
008b27a0	str w27,[x22, #0x5c]
008b27a4	add w8,w8,w10
008b27a8	sub w2,w27,w8
008b27ac	bl 0x008bae54
008b27b0	ldrb w9,[x20, #0x6a]
008b27b4	ldr w8,[x20, #0x58]
008b27b8	str x0,[x22, #0x38]
008b27bc	strb w9,[x22, #0x6a]
008b27c0	cbz w8,0x008b2810
008b27c4	mov x25,xzr
008b27c8	mov w26,#0x3
008b27cc	b 0x008b27dc
008b27d0	add x25,x25,#0x1
008b27d4	cmp x25,w8, UXTW 
008b27d8	b.cs 0x008b2814
008b27dc	ldr x9,[x20, #0x40]
008b27e0	ldr x2,[x9, x25, LSL #0x3]
008b27e4	ldr x9,[x22, #0x40]
008b27e8	str x2,[x9, x25, LSL #0x3]
008b27ec	cbz x2,0x008b27d0
008b27f0	ldr x1,[x22, #0x38]
008b27f4	mov x0,x19
008b27f8	bl 0x008bce4c
008b27fc	ucvtf d0,w25
008b2800	str w26,[x0, #0xc]
008b2804	str d0,[x0]
008b2808	ldr w8,[x20, #0x58]
008b280c	b 0x008b27d0
008b2810	mov w25,wzr
008b2814	ldr w9,[x21, #0x58]
008b2818	cbz w9,0x008b2884
008b281c	str w27,[sp, #0x4]
008b2820	mov x27,xzr
008b2824	mov w28,w25
008b2828	mov w26,#0x3
008b282c	b 0x008b283c
008b2830	add x27,x27,#0x1
008b2834	cmp x27,x9
008b2838	b.cs 0x008b2874
008b283c	ldr x8,[x21, #0x40]
008b2840	add x19,x28,x27
008b2844	ldr x2,[x8, x27, LSL #0x3]
008b2848	ldr x8,[x22, #0x40]
008b284c	str x2,[x8, w19, UXTW #0x3]
008b2850	cbz x2,0x008b2830
008b2854	ldr x1,[x22, #0x38]
008b2858	ldr x0,[sp, #0x8]
008b285c	bl 0x008bce4c
008b2860	ucvtf d0,w19
008b2864	str w26,[x0, #0xc]
008b2868	str d0,[x0]
008b286c	ldr w9,[x21, #0x58]
008b2870	b 0x008b2830
008b2874	ldr w8,[x20, #0x58]
008b2878	add w25,w25,w27
008b287c	ldr x19,[sp, #0x8]
008b2880	ldr w27,[sp, #0x4]
008b2884	ldp w10,w11,[x21, #0x60]
008b2888	ldr w9,[x20, #0x60]
008b288c	sub w12,w27,w25
008b2890	ldrb w2,[x22, #0x1]
008b2894	ubfiz x1,x12,#0x4,#0x20
008b2898	mov x0,x19
008b289c	add w9,w9,w10
008b28a0	add w8,w8,w11
008b28a4	stp w9,w8,[x22, #0x60]
008b28a8	bl 0x008b7610
008b28ac	ldp w10,w9,[x21, #0x58]
008b28b0	ldrb w8,[x21, #0x68]
008b28b4	str w25,[x22, #0x58]
008b28b8	mov w26,wzr
008b28bc	ldr w27,[x20, #0x58]
008b28c0	add w11,w9,w23
008b28c4	add w10,w10,w8
008b28c8	strb w8,[x22, #0x68]
008b28cc	sub w10,w11,w10
008b28d0	cmp w27,w24
008b28d4	add x10,x0,w10, UXTW  #0x4
008b28d8	stp x0,x10,[x22, #0x28]
008b28dc	b.cs 0x008b295c
008b28e0	mov w28,#0x3
008b28e4	b 0x008b28f4
008b28e8	add x27,x27,#0x1
008b28ec	cmp x27,x24
008b28f0	b.cs 0x008b2954
008b28f4	ldr x8,[x20, #0x40]
008b28f8	ldr x0,[x21, #0x38]
008b28fc	ldr x23,[x8, x27, LSL #0x3]
008b2900	mov x1,x23
008b2904	bl 0x008bb440
008b2908	ldr w8,[x0, #0xc]
008b290c	cbnz w8,0x008b28e8
008b2910	ldr w8,[x20, #0x58]
008b2914	ldr x9,[x20, #0x28]
008b2918	mov x0,x19
008b291c	ldr x10,[x22, #0x28]
008b2920	mov x2,x23
008b2924	sub w8,w27,w8
008b2928	ldr q0,[x9,w8, uxtw #4]
008b292c	str q0,[x10,w26, uxtw #4]
008b2930	ldp x1,x8,[x22, #0x38]
008b2934	str x23,[x8, w25, UXTW #0x3]
008b2938	bl 0x008bce4c
008b293c	ucvtf d0,w25
008b2940	add w25,w25,#0x1
008b2944	add w26,w26,#0x1
008b2948	str w28,[x0, #0xc]
008b294c	str d0,[x0]
008b2950	b 0x008b28e8
008b2954	ldr w9,[x21, #0x5c]
008b2958	ldrb w8,[x21, #0x68]
008b295c	ldr w23,[x21, #0x58]
008b2960	sub w24,w9,w8
008b2964	cmp w23,w24
008b2968	b.cs 0x008b29c4
008b296c	mov w27,#0x3
008b2970	ldr w8,[x21, #0x58]
008b2974	ldr x9,[x21, #0x28]
008b2978	mov x0,x19
008b297c	ldr x10,[x21, #0x40]
008b2980	ldr x11,[x22, #0x28]
008b2984	sub w8,w23,w8
008b2988	ldr q0,[x9,w8, uxtw #4]
008b298c	ldr x2,[x10, x23, LSL #0x3]
008b2990	str q0,[x11,w26, uxtw #4]
008b2994	ldp x1,x8,[x22, #0x38]
008b2998	str x2,[x8, w25, UXTW #0x3]
008b299c	bl 0x008bce4c
008b29a0	ucvtf d0,w25
008b29a4	add x23,x23,#0x1
008b29a8	add w25,w25,#0x1
008b29ac	cmp x23,x24
008b29b0	add w26,w26,#0x1
008b29b4	str w27,[x0, #0xc]
008b29b8	str d0,[x0]
008b29bc	b.cc 0x008b2970
008b29c0	ldrb w8,[x21, #0x68]
008b29c4	cbz w8,0x008b29f4
008b29c8	mov x8,xzr
008b29cc	mov x9,xzr
008b29d0	ldr x10,[x21, #0x30]
008b29d4	ldr x11,[x22, #0x30]
008b29d8	add x9,x9,#0x1
008b29dc	ldr q0,[x10,x8]
008b29e0	str q0,[x11,x8]
008b29e4	add x8,x8,#0x10
008b29e8	ldrb w10,[x21, #0x68]
008b29ec	cmp x9,x10
008b29f0	b.cc 0x008b29d0
008b29f4	ldr x1,[x20, #0x50]
008b29f8	cbz x1,0x008b2a08
008b29fc	mov x0,x19
008b2a00	bl 0x008bd16c
008b2a04	str x0,[x22, #0x50]
008b2a08	mov x0,x19
008b2a0c	bl 0x008aa2b8
008b2a10	mov x2,x0
008b2a14	mov x0,x19
008b2a18	mov x1,x22
008b2a1c	bl 0x008b24c4
008b2a20	mov x0,x22
008b2a24	ldp x20,x19,[sp, #0x60]
008b2a28	ldp x22,x21,[sp, #0x50]
008b2a2c	ldp x24,x23,[sp, #0x40]
008b2a30	ldp x26,x25,[sp, #0x30]
008b2a34	ldp x28,x27,[sp, #0x20]
008b2a38	ldp x29,x30,[sp, #0x10]
008b2a3c	add sp,sp,#0x70
008b2a40	ret
008b2a44	ldr x8,[x20, #0x10]
008b2a48	adrp x1,0x2be000
008b2a4c	add x1,x1,#0xf9a
008b2a50	add x2,x8,#0x18
008b2a54	bl 0x008b39cc
