; ZSTD_DCtx_refDDict @ 00bb2660
00bb2660	sub sp,sp,#0x90
00bb2664	stp x29,x30,[sp, #0x30]
00bb2668	stp x28,x27,[sp, #0x40]
00bb266c	stp x26,x25,[sp, #0x50]
00bb2670	stp x24,x23,[sp, #0x60]
00bb2674	stp x22,x21,[sp, #0x70]
00bb2678	stp x20,x19,[sp, #0x80]
00bb267c	add x29,sp,#0x30
00bb2680	mrs x25,tpidr_el0
00bb2684	add x20,x0,#0x7, LSL #12
00bb2688	ldr x8,[x25, #0x28]
00bb268c	stur x8,[x29, #-0x8]
00bb2690	ldr w8,[x20, #0x61c]
00bb2694	cbz w8,0x00bb26a0
00bb2698	mov x0,#-0x3c
00bb269c	b 0x00bb273c
00bb26a0	mov x21,x0
00bb26a4	ldr x0,[x0, #0x75e8]
00bb26a8	mov x19,x1
00bb26ac	bl 0x00c435b0
00bb26b0	movi v0.2D,#0x0
00bb26b4	mov w8,#0x75e8
00bb26b8	str wzr,[x20, #0x600]
00bb26bc	str q0,[x21,x8]
00bb26c0	cbz x19,0x00bb2738
00bb26c4	ldr w8,[x20, #0x610]
00bb26c8	mov w9,#0xffffffff
00bb26cc	str x19,[x21, #0x75f0]
00bb26d0	str w9,[x20, #0x600]
00bb26d4	cmp w8,#0x1
00bb26d8	b.ne 0x00bb2738
00bb26dc	ldr x20,[x21, #0x7608]
00bb26e0	cbz x20,0x00bb276c
00bb26e4	mov x28,x20
00bb26e8	ldr x8,[x28, #0x10]!
00bb26ec	ldur x24,[x28, #-0x8]
00bb26f0	cmp x24,x8, LSL #0x2
00bb26f4	b.hi 0x00bb2940
00bb26f8	ldr x8,[x21, #0x75b0]
00bb26fc	ldr x27,[x21, #0x75b8]
00bb2700	lsl x22,x24,#0x4
00bb2704	ldr x0,[x21, #0x75c0]
00bb2708	str x0,[sp, #0x10]
00bb270c	cbz x8,0x00bb2828
00bb2710	mov x1,x22
00bb2714	blr x8
00bb2718	cbz x0,0x00bb2918
00bb271c	mov w1,wzr
00bb2720	mov x2,x22
00bb2724	mov x23,x0
00bb2728	str x27,[sp, #0x8]
00bb272c	bl 0x00c301c0
00bb2730	ldr x22,[x20, #0x8]
00bb2734	b 0x00bb2844
00bb2738	mov x0,xzr
00bb273c	ldr x8,[x25, #0x28]
00bb2740	ldur x9,[x29, #-0x8]
00bb2744	cmp x8,x9
00bb2748	b.ne 0x00bb29e4
00bb274c	ldp x20,x19,[sp, #0x80]
00bb2750	ldp x22,x21,[sp, #0x70]
00bb2754	ldp x24,x23,[sp, #0x60]
00bb2758	ldp x26,x25,[sp, #0x50]
00bb275c	ldp x28,x27,[sp, #0x40]
00bb2760	ldp x29,x30,[sp, #0x30]
00bb2764	add sp,sp,#0x90
00bb2768	ret
00bb276c	ldr x24,[x21, #0x75b0]
00bb2770	ldr x23,[x21, #0x75b8]
00bb2774	ldr x22,[x21, #0x75c0]
00bb2778	cbz x24,0x00bb27ec
00bb277c	mov x0,x22
00bb2780	mov w1,#0x18
00bb2784	blr x24
00bb2788	cbz x0,0x00bb29d8
00bb278c	mov x20,x0
00bb2790	mov x0,x22
00bb2794	mov w1,#0x200
00bb2798	blr x24
00bb279c	cbz x0,0x00bb2920
00bb27a0	movi v0.2D,#0x0
00bb27a4	stp q0,q0,[x0]
00bb27a8	stp q0,q0,[x0, #0x20]
00bb27ac	stp q0,q0,[x0, #0x40]
00bb27b0	stp q0,q0,[x0, #0x60]
00bb27b4	stp q0,q0,[x0, #0x80]
00bb27b8	stp q0,q0,[x0, #0xa0]
00bb27bc	stp q0,q0,[x0, #0xc0]
00bb27c0	stp q0,q0,[x0, #0xe0]
00bb27c4	stp q0,q0,[x0, #0x100]
00bb27c8	stp q0,q0,[x0, #0x120]
00bb27cc	stp q0,q0,[x0, #0x140]
00bb27d0	stp q0,q0,[x0, #0x160]
00bb27d4	stp q0,q0,[x0, #0x180]
00bb27d8	stp q0,q0,[x0, #0x1a0]
00bb27dc	stp q0,q0,[x0, #0x1c0]
00bb27e0	stp q0,q0,[x0, #0x1e0]
00bb27e4	str x0,[x20]
00bb27e8	b 0x00bb2810
00bb27ec	mov w0,#0x18
00bb27f0	bl 0x00c308d0
00bb27f4	cbz x0,0x00bb29d8
00bb27f8	mov x20,x0
00bb27fc	mov w0,#0x1
00bb2800	mov w1,#0x200
00bb2804	bl 0x00c30a30
00bb2808	str x0,[x20]
00bb280c	cbz x0,0x00bb2924
00bb2810	adrp x8,0x29c000
00bb2814	add x28,x20,#0x10
00bb2818	ldr q0,[x8, #0x500]
00bb281c	stur q0,[x20, #0x8]
00bb2820	str x20,[x21, #0x7608]
00bb2824	b 0x00bb2940
00bb2828	mov w0,#0x1
00bb282c	mov x1,x22
00bb2830	bl 0x00c30a30
00bb2834	cbz x0,0x00bb2918
00bb2838	mov x23,x0
00bb283c	str x27,[sp, #0x8]
00bb2840	mov x22,x24
00bb2844	lsl x8,x24,#0x1
00bb2848	ldr x9,[x20]
00bb284c	str xzr,[x20, #0x10]
00bb2850	str x9,[sp, #0x18]
00bb2854	stp x23,x8,[x20]
00bb2858	cbz x22,0x00bb28fc
00bb285c	mov x27,xzr
00bb2860	b 0x00bb2880
00bb2864	ldr x9,[x28]
00bb2868	str x23,[x8, x21, LSL #0x3]
00bb286c	add x8,x9,#0x1
00bb2870	str x8,[x28]
00bb2874	add x27,x27,#0x1
00bb2878	cmp x27,x22
00bb287c	b.eq 0x00bb28fc
00bb2880	ldr x8,[sp, #0x18]
00bb2884	ldr x23,[x8, x27, LSL #0x3]
00bb2888	cbz x23,0x00bb2874
00bb288c	mov x0,x23
00bb2890	bl 0x00c435d0
00bb2894	mov w24,w0
00bb2898	stur w0,[x29, #-0xc]
00bb289c	sub x0,x29,#0xc
00bb28a0	mov w1,#0x4
00bb28a4	mov x2,xzr
00bb28a8	bl 0x00c436b0
00bb28ac	ldp x8,x9,[x20, #0x8]
00bb28b0	cmp x9,x8
00bb28b4	b.eq 0x00bb296c
00bb28b8	sub x26,x8,#0x1
00bb28bc	ldr x8,[x20]
00bb28c0	and x21,x26,x0
00bb28c4	ldr x0,[x8, x21, LSL #0x3]
00bb28c8	cbz x0,0x00bb2868
00bb28cc	bl 0x00c435d0
00bb28d0	cmp w0,w24
00bb28d4	b.eq 0x00bb28f0
00bb28d8	and x9,x21,x26
00bb28dc	ldr x8,[x20]
00bb28e0	add x21,x9,#0x1
00bb28e4	ldr x0,[x8, x21, LSL #0x3]
00bb28e8	cbnz x0,0x00bb28cc
00bb28ec	b 0x00bb2864
00bb28f0	ldr x8,[x20]
00bb28f4	str x23,[x8, x21, LSL #0x3]
00bb28f8	b 0x00bb2874
00bb28fc	ldr x8,[sp, #0x18]
00bb2900	cbz x8,0x00bb2940
00bb2904	ldr x8,[sp, #0x8]
00bb2908	cbz x8,0x00bb2938
00bb290c	ldp x0,x1,[sp, #0x10]
00bb2910	blr x8
00bb2914	b 0x00bb2940
00bb2918	mov x0,#-0x40
00bb291c	b 0x00bb273c
00bb2920	str xzr,[x20]
00bb2924	cbz x23,0x00bb29d0
00bb2928	mov x0,x22
00bb292c	mov x1,x20
00bb2930	blr x23
00bb2934	b 0x00bb29d8
00bb2938	ldr x0,[sp, #0x18]
00bb293c	bl 0x00c30960
00bb2940	mov x0,x19
00bb2944	bl 0x00c435d0
00bb2948	mov w21,w0
00bb294c	stur w0,[x29, #-0xc]
00bb2950	sub x0,x29,#0xc
00bb2954	mov w1,#0x4
00bb2958	mov x2,xzr
00bb295c	bl 0x00c436b0
00bb2960	ldp x8,x9,[x20, #0x8]
00bb2964	cmp x9,x8
00bb2968	b.ne 0x00bb2974
00bb296c	mov x0,#-0x1
00bb2970	b 0x00bb273c
00bb2974	sub x23,x8,#0x1
00bb2978	ldr x8,[x20]
00bb297c	and x22,x23,x0
00bb2980	ldr x0,[x8, x22, LSL #0x3]
00bb2984	cbz x0,0x00bb29ac
00bb2988	bl 0x00c435d0
00bb298c	cmp w0,w21
00bb2990	b.eq 0x00bb29c0
00bb2994	and x9,x22,x23
00bb2998	ldr x8,[x20]
00bb299c	add x22,x9,#0x1
00bb29a0	ldr x0,[x8, x22, LSL #0x3]
00bb29a4	cbnz x0,0x00bb2988
00bb29a8	ldr x9,[x28]
00bb29ac	mov x0,xzr
00bb29b0	str x19,[x8, x22, LSL #0x3]
00bb29b4	add x8,x9,#0x1
00bb29b8	str x8,[x28]
00bb29bc	b 0x00bb273c
00bb29c0	ldr x8,[x20]
00bb29c4	mov x0,xzr
00bb29c8	str x19,[x8, x22, LSL #0x3]
00bb29cc	b 0x00bb273c
00bb29d0	mov x0,x20
00bb29d4	bl 0x00c30960
00bb29d8	str xzr,[x21, #0x7608]
00bb29dc	mov x0,#-0x40
00bb29e0	b 0x00bb273c
00bb29e4	bl 0x00c2fec0
