; ix::WebSocketPerMessageDeflateCompressor::compressData<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::vector<unsigned_char,std::__ndk1::allocator<unsigned_char>>> @ 009a2690
009a2690	stp x24,x23,[sp, #-0x40]!
009a2694	stp x22,x21,[sp, #0x10]
009a2698	stp x20,x19,[sp, #0x20]
009a269c	stp x29,x30,[sp, #0x30]
009a26a0	add x29,sp,#0x30
009a26a4	ldr x20,[x2]
009a26a8	mov x19,x2
009a26ac	mov x21,x0
009a26b0	str x20,[x2, #0x8]
009a26b4	ldrb w8,[x1]
009a26b8	ldr x9,[x1, #0x8]
009a26bc	lsr w10,w8,#0x1
009a26c0	tst w8,#0x1
009a26c4	csel x8,x10,x9,eq
009a26c8	cbz x8,0x009a27d4
009a26cc	mov w10,#0x4010
009a26d0	str w8,[x21, x10#0x0]
009a26d4	ldrb w8,[x1]
009a26d8	ldr x10,[x1, #0x10]
009a26dc	mov w9,#0x4008
009a26e0	mov w11,#0x4028
009a26e4	tst w8,#0x1
009a26e8	add x20,x21,#0x4
009a26ec	add x22,x21,x9
009a26f0	add x23,x21,x11
009a26f4	csinc x8,x10,x1,ne
009a26f8	mov w24,#0x4000
009a26fc	str x8,[x21, #0x4008]
009a2700	str w24,[x23]
009a2704	ldr w1,[x21]
009a2708	mov x0,x22
009a270c	str x20,[x21, #0x4020]
009a2710	bl 0x00c33270
009a2714	ldr w8,[x23]
009a2718	ldr x1,[x19, #0x8]
009a271c	mov x0,x19
009a2720	mov x2,x20
009a2724	sub x8,x24,x8
009a2728	add x8,x21,x8
009a272c	add x3,x8,#0x4
009a2730	bl 0x00c335c0
009a2734	ldr w8,[x23]
009a2738	cbz w8,0x009a2700
009a273c	adrp x10,0xd21000
009a2740	add x10,x10,#0x850
009a2744	ldrb w11,[x10]
009a2748	ldr x8,[x10, #0x8]
009a274c	ldp x9,x12,[x19]
009a2750	lsr w13,w11,#0x1
009a2754	tst w11,#0x1
009a2758	csel x13,x13,x8,eq
009a275c	sub x8,x12,x9
009a2760	cmp x13,x8
009a2764	b.hi 0x009a2910
009a2768	ldr x13,[x10, #0x10]
009a276c	tst w11,#0x1
009a2770	add x12,x9,x8
009a2774	ldurb w14,[x12, #-0x1]
009a2778	csinc x10,x13,x10,ne
009a277c	ldrb w11,[x10, #0x3]
009a2780	cmp w14,w11
009a2784	b.ne 0x009a2910
009a2788	ldurb w11,[x12, #-0x2]
009a278c	ldrb w12,[x10, #0x2]
009a2790	cmp w11,w12
009a2794	b.ne 0x009a2910
009a2798	add x9,x9,x8
009a279c	ldurb w11,[x9, #-0x3]
009a27a0	ldrb w12,[x10, #0x1]
009a27a4	cmp w11,w12
009a27a8	b.ne 0x009a2910
009a27ac	ldrb w11,[x9, #-0x4]!
009a27b0	ldrb w10,[x10]
009a27b4	cmp w11,w10
009a27b8	b.ne 0x009a2910
009a27bc	cmp x8,#0x3
009a27c0	b.hi 0x009a2928
009a27c4	orr x1,xzr,#-0x4
009a27c8	mov x0,x19
009a27cc	bl 0x00c33330
009a27d0	b 0x009a2910
009a27d4	ldr x8,[x19, #0x10]
009a27d8	subs x21,x8,x20
009a27dc	b.eq 0x009a27f8
009a27e0	mov w8,#0x2
009a27e4	strb w8,[x20]
009a27e8	ldr x8,[x19, #0x8]
009a27ec	add x24,x8,#0x1
009a27f0	str x24,[x19, #0x8]
009a27f4	b 0x009a2874
009a27f8	adds x8,x21,#0x1
009a27fc	b.mi 0x009a2930
009a2800	orr x9,xzr,#0x3ffffffffffffffe
009a2804	cmp x21,x9
009a2808	b.hi 0x009a2824
009a280c	lsl x9,x21,#0x1
009a2810	cmp x9,x8
009a2814	csel x23,x8,x9,cc
009a2818	cbnz x23,0x009a2828
009a281c	mov x22,xzr
009a2820	b 0x009a2834
009a2824	orr x23,xzr,#0x7fffffffffffffff
009a2828	mov x0,x23
009a282c	bl 0x00c2fed0
009a2830	mov x22,x0
009a2834	add x24,x22,x21
009a2838	mov w8,#0x2
009a283c	add x23,x22,x23
009a2840	cmp x21,#0x1
009a2844	strb w8,[x24], #0x1
009a2848	b.lt 0x009a285c
009a284c	mov x0,x22
009a2850	mov x1,x20
009a2854	mov x2,x21
009a2858	bl 0x00c2ffd0
009a285c	stp x22,x24,[x19]
009a2860	str x23,[x19, #0x10]
009a2864	cbz x20,0x009a2874
009a2868	mov x0,x20
009a286c	bl 0x00c301d0
009a2870	ldr x24,[x19, #0x8]
009a2874	ldr x8,[x19, #0x10]
009a2878	cmp x24,x8
009a287c	b.eq 0x009a2894
009a2880	strb wzr,[x24]
009a2884	ldr x8,[x19, #0x8]
009a2888	add x8,x8,#0x1
009a288c	str x8,[x19, #0x8]
009a2890	b 0x009a2910
009a2894	ldr x20,[x19]
009a2898	sub x21,x8,x20
009a289c	adds x8,x21,#0x1
009a28a0	b.mi 0x009a2930
009a28a4	orr x9,xzr,#0x3ffffffffffffffe
009a28a8	cmp x21,x9
009a28ac	b.hi 0x009a28c8
009a28b0	lsl x9,x21,#0x1
009a28b4	cmp x9,x8
009a28b8	csel x23,x8,x9,cc
009a28bc	cbnz x23,0x009a28cc
009a28c0	mov x22,xzr
009a28c4	b 0x009a28d8
009a28c8	orr x23,xzr,#0x7fffffffffffffff
009a28cc	mov x0,x23
009a28d0	bl 0x00c2fed0
009a28d4	mov x22,x0
009a28d8	add x24,x22,x21
009a28dc	add x23,x22,x23
009a28e0	cmp x21,#0x1
009a28e4	strb wzr,[x24], #0x1
009a28e8	b.lt 0x009a28fc
009a28ec	mov x0,x22
009a28f0	mov x1,x20
009a28f4	mov x2,x21
009a28f8	bl 0x00c2ffd0
009a28fc	stp x22,x24,[x19]
009a2900	str x23,[x19, #0x10]
009a2904	cbz x20,0x009a2910
009a2908	mov x0,x20
009a290c	bl 0x00c301d0
009a2910	ldp x29,x30,[sp, #0x30]
009a2914	ldp x20,x19,[sp, #0x20]
009a2918	ldp x22,x21,[sp, #0x10]
009a291c	mov w0,#0x1
009a2920	ldp x24,x23,[sp], #0x40
009a2924	ret
009a2928	str x9,[x19, #0x8]
009a292c	b 0x009a2910
009a2930	mov x0,x19
009a2934	bl 0x00c30bd0
