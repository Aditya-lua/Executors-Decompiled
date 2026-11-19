; cpr::Session::PutAsync @ 008f261c
008f261c	sub sp,sp,#0x70
008f2620	stp x26,x25,[sp, #0x20]
008f2624	stp x24,x23,[sp, #0x30]
008f2628	stp x22,x21,[sp, #0x40]
008f262c	stp x20,x19,[sp, #0x50]
008f2630	stp x29,x30,[sp, #0x60]
008f2634	add x29,sp,#0x60
008f2638	mrs x24,tpidr_el0
008f263c	mov x20,x8
008f2640	ldr x8,[x24, #0x28]
008f2644	str x8,[sp, #0x18]
008f2648	mov x8,sp
008f264c	bl 0x00c31300
008f2650	bl 0x00c30d70
008f2654	add x8,x0,#0x20
008f2658	ldar w8,[x8]
008f265c	mov x21,x0
008f2660	cbnz w8,0x008f2670
008f2664	mov x0,x21
008f2668	mov x1,xzr
008f266c	bl 0x00c31330
008f2670	add x8,x21,#0x30
008f2674	ldar x8,[x8]
008f2678	cbnz x8,0x008f2698
008f267c	add x8,x21,#0x28
008f2680	ldar x8,[x8]
008f2684	ldr x9,[x21, #0x10]
008f2688	cmp x8,x9
008f268c	b.cs 0x008f2698
008f2690	mov x0,x21
008f2694	bl 0x00c31320
008f2698	ldp x23,x22,[sp]
008f269c	stp xzr,xzr,[sp]
008f26a0	orr w0,wzr,#0x60
008f26a4	bl 0x00c2fed0
008f26a8	str xzr,[x0, #0x10]
008f26ac	adrp x8,0xcb4000
008f26b0	ldr x8,[x8, #0xd50]
008f26b4	adrp x9,0xc4e000
008f26b8	add x9,x9,#0xf18
008f26bc	mov x25,x0
008f26c0	mov x26,x0
008f26c4	add x8,x8,#0x10
008f26c8	add x9,x9,#0x10
008f26cc	mov x19,x0
008f26d0	str xzr,[x25, #0x8]!
008f26d4	str x8,[x0]
008f26d8	str x9,[x26, #0x20]!
008f26dc	str x26,[x0, #0x40]
008f26e0	stp x23,x22,[x0, #0x28]
008f26e4	mov w0,#0x188
008f26e8	bl 0x00c2fed0
008f26ec	mov x23,x0
008f26f0	add x0,x0,#0x8
008f26f4	mov w2,#0x6c
008f26f8	mov w1,wzr
008f26fc	bl 0x00c301c0
008f2700	adrp x8,0xcb4000
008f2704	ldr x8,[x8, #0xd40]
008f2708	str x23,[x19, #0x50]
008f270c	add x8,x8,#0x10
008f2710	str x8,[x23]
008f2714	add x0,sp,#0x10
008f2718	mov x1,x23
008f271c	bl 0x00c316e0
008f2720	add x22,x21,#0xa8
008f2724	mov x0,x22
008f2728	bl 0x00c2ff10
008f272c	ldxr x8,[x25]
008f2730	add x8,x8,#0x1
008f2734	stxr w9,x8,[x25]
008f2738	cbnz w9,0x008f272c
008f273c	ldp x9,x10,[x21, #0x80]
008f2740	ldp x12,x8,[x21, #0x98]
008f2744	mov w11,#0x55
008f2748	subs x13,x10,x9
008f274c	asr x13,x13,#0x3
008f2750	mul x11,x13,x11
008f2754	sub x11,x11,#0x1
008f2758	csel x13,xzr,x11,eq
008f275c	add x11,x8,x12
008f2760	cmp x13,x11
008f2764	b.ne 0x008f277c
008f2768	add x0,x21,#0x78
008f276c	bl 0x00c31620
008f2770	ldp x11,x8,[x21, #0x98]
008f2774	ldp x9,x10,[x21, #0x80]
008f2778	add x11,x11,x8
008f277c	cmp x10,x9
008f2780	b.eq 0x008f27ac
008f2784	orr x10,xzr,#-0x3f3f3f3f3f3f3f40
008f2788	movk x10,#0xc0c1
008f278c	umulh x10,x11,x10
008f2790	lsr x10,x10,#0x6
008f2794	ldr x9,[x9, x10, LSL #0x3]
008f2798	mov w12,#0x55
008f279c	msub x10,x10,x12,x11
008f27a0	orr w11,wzr,#0x30
008f27a4	madd x9,x10,x11,x9
008f27a8	b 0x008f27b0
008f27ac	mov x9,xzr
008f27b0	adrp x10,0xc4e000
008f27b4	add x10,x10,#0xf78
008f27b8	add x8,x8,#0x1
008f27bc	add x10,x10,#0x10
008f27c0	mov x0,x22
008f27c4	stp x26,x19,[x9, #0x8]
008f27c8	str x9,[x9, #0x20]
008f27cc	str x10,[x9]
008f27d0	str x8,[x21, #0xa0]
008f27d4	bl 0x00c2ff20
008f27d8	add x0,x21,#0xd0
008f27dc	bl 0x00c315f0
008f27e0	ldr x21,[sp, #0x10]
008f27e4	ldaxr x8,[x25]
008f27e8	sub x9,x8,#0x1
008f27ec	stlxr w10,x9,[x25]
008f27f0	cbnz w10,0x008f27e4
008f27f4	cbnz x8,0x008f2810
008f27f8	ldr x8,[x19]
008f27fc	mov x0,x19
008f2800	ldr x8,[x8, #0x10]
008f2804	blr x8
008f2808	mov x0,x19
008f280c	bl 0x00c2ff00
008f2810	ldr x19,[sp, #0x8]
008f2814	stp xzr,xzr,[x20, #0x8]
008f2818	str x21,[x20]
008f281c	cbz x19,0x008f2850
008f2820	add x8,x19,#0x8
008f2824	ldaxr x9,[x8]
008f2828	sub x10,x9,#0x1
008f282c	stlxr w11,x10,[x8]
008f2830	cbnz w11,0x008f2824
008f2834	cbnz x9,0x008f2850
008f2838	ldr x8,[x19]
008f283c	mov x0,x19
008f2840	ldr x8,[x8, #0x10]
008f2844	blr x8
008f2848	mov x0,x19
008f284c	bl 0x00c2ff00
008f2850	ldr x8,[x24, #0x28]
008f2854	ldr x9,[sp, #0x18]
008f2858	cmp x8,x9
008f285c	b.ne 0x008f287c
008f2860	ldp x29,x30,[sp, #0x60]
008f2864	ldp x20,x19,[sp, #0x50]
008f2868	ldp x22,x21,[sp, #0x40]
008f286c	ldp x24,x23,[sp, #0x30]
008f2870	ldp x26,x25,[sp, #0x20]
008f2874	add sp,sp,#0x70
008f2878	ret
008f287c	bl 0x00c2fec0
