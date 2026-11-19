; a2i_ASN1_STRING @ 00ab25e0
00ab25e0	sub sp,sp,#0x80
00ab25e4	stp x22,x21,[sp, #0x50]
00ab25e8	stp x20,x19,[sp, #0x60]
00ab25ec	mov x21,x2
00ab25f0	mov x19,x1
00ab25f4	mov x1,x2
00ab25f8	mov w2,w3
00ab25fc	stp x28,x27,[sp, #0x20]
00ab2600	stp x26,x25,[sp, #0x30]
00ab2604	stp x24,x23,[sp, #0x40]
00ab2608	stp x29,x30,[sp, #0x70]
00ab260c	add x29,sp,#0x70
00ab2610	mov x23,x0
00ab2614	str w3,[sp, #0x1c]
00ab2618	bl 0x00c38470
00ab261c	cmp w0,#0x1
00ab2620	b.lt 0x00ab27d8
00ab2624	mov w24,wzr
00ab2628	mov w25,wzr
00ab262c	mov x22,xzr
00ab2630	add x8,x21,#0x1
00ab2634	stp x19,x8,[sp, #0x8]
00ab2638	sxtw x11,w0
00ab263c	sub x9,x11,#0x1
00ab2640	add x8,x21,x9
00ab2644	ldrb w10,[x8]
00ab2648	cmp w10,#0xa
00ab264c	b.ne 0x00ab2674
00ab2650	strb wzr,[x8]
00ab2654	cbz w9,0x00ab27f4
00ab2658	sub x27,x11,#0x2
00ab265c	add x8,x21,x27
00ab2660	ldrb w10,[x8]
00ab2664	cmp w10,#0xd
00ab2668	b.eq 0x00ab2684
00ab266c	mov w27,w9
00ab2670	b 0x00ab2694
00ab2674	mov w27,w9
00ab2678	mov w9,w0
00ab267c	cmp w10,#0xd
00ab2680	b.ne 0x00ab266c
00ab2684	strb wzr,[x8]
00ab2688	cbz w27,0x00ab27f4
00ab268c	sub w8,w27,#0x1
00ab2690	add x8,x21,w8, SXTW 
00ab2694	ldrb w28,[x8]
00ab2698	sxtw x8,w27
00ab269c	cmp w28,#0x5c
00ab26a0	cset w20,eq
00ab26a4	cmp w27,#0x2
00ab26a8	b.lt 0x00ab27f0
00ab26ac	sub x19,x8,#0x1
00ab26b0	ldrb w0,[x21, x19]
00ab26b4	mov w1,#0x10
00ab26b8	bl 0x00c377c0
00ab26bc	cbz w0,0x00ab26cc
00ab26c0	subs x19,x19,#0x1
00ab26c4	b.gt 0x00ab26b0
00ab26c8	b 0x00ab26d0
00ab26cc	mov w27,w19
00ab26d0	cmp w27,#0x2
00ab26d4	strb wzr,[x21, w27, SXTW ]
00ab26d8	b.lt 0x00ab27f4
00ab26dc	sub w19,w27,w20
00ab26e0	tbnz w19,#0x0,0x00ab282c
00ab26e4	cmp w19,#0x0
00ab26e8	cinc w8,w19,lt
00ab26ec	asr w20,w8,#0x1
00ab26f0	add w27,w20,w25
00ab26f4	cmp w27,w24
00ab26f8	b.le 0x00ab2720
00ab26fc	add w24,w25,w20, LSL #0x1
00ab2700	adrp x2,0x2d0000
00ab2704	mov w3,#0x64
00ab2708	mov x0,x22
00ab270c	mov x1,x24
00ab2710	add x2,x2,#0x1f2
00ab2714	bl 0x00c356f0
00ab2718	cbz x0,0x00ab286c
00ab271c	mov x22,x0
00ab2720	cmp w19,#0x2
00ab2724	b.lt 0x00ab2778
00ab2728	ldr x19,[sp, #0x10]
00ab272c	mov x26,xzr
00ab2730	sxtw x20,w20
00ab2734	add x25,x22,w25, SXTW 
00ab2738	ldurb w0,[x19, #-0x1]
00ab273c	bl 0x00c3e840
00ab2740	tbnz w0,#0x1f,0x00ab27a0
00ab2744	ldrb w8,[x25, x26]
00ab2748	orr w8,w0,w8, LSL #0x4
00ab274c	strb w8,[x25, x26]
00ab2750	ldrb w0,[x19]
00ab2754	bl 0x00c3e840
00ab2758	tbnz w0,#0x1f,0x00ab27a0
00ab275c	ldrb w8,[x25, x26]
00ab2760	add x19,x19,#0x2
00ab2764	orr w8,w0,w8, LSL #0x4
00ab2768	strb w8,[x25, x26]
00ab276c	add x26,x26,#0x1
00ab2770	cmp x26,x20
00ab2774	b.lt 0x00ab2738
00ab2778	cmp w28,#0x5c
00ab277c	b.ne 0x00ab2864
00ab2780	ldr w2,[sp, #0x1c]
00ab2784	mov x0,x23
00ab2788	mov x1,x21
00ab278c	bl 0x00c38470
00ab2790	cmp w0,#0x1
00ab2794	mov w25,w27
00ab2798	b.ge 0x00ab2638
00ab279c	b 0x00ab27f4
00ab27a0	bl 0x00c342a0
00ab27a4	adrp x20,0x2d0000
00ab27a8	add x20,x20,#0x1f2
00ab27ac	adrp x2,0x2d4000
00ab27b0	add x2,x2,#0x269
00ab27b4	mov w1,#0x71
00ab27b8	mov x0,x20
00ab27bc	bl 0x00c342b0
00ab27c0	mov w0,#0xd
00ab27c4	mov w1,#0x8d
00ab27c8	mov x2,xzr
00ab27cc	bl 0x00c342c0
00ab27d0	mov w2,#0x72
00ab27d4	b 0x00ab28a4
00ab27d8	mov x22,xzr
00ab27dc	mov w27,wzr
00ab27e0	str w27,[x19]
00ab27e4	str x22,[x19, #0x8]
00ab27e8	mov w0,#0x1
00ab27ec	b 0x00ab28b4
00ab27f0	strb wzr,[x21, x8]
00ab27f4	bl 0x00c342a0
00ab27f8	adrp x20,0x2d0000
00ab27fc	add x20,x20,#0x1f2
00ab2800	adrp x2,0x2d4000
00ab2804	add x2,x2,#0x269
00ab2808	mov w1,#0x84
00ab280c	mov x0,x20
00ab2810	bl 0x00c342b0
00ab2814	mov w0,#0xd
00ab2818	mov w1,#0x96
00ab281c	mov x2,xzr
00ab2820	bl 0x00c342c0
00ab2824	mov w2,#0x85
00ab2828	b 0x00ab28a4
00ab282c	bl 0x00c342a0
00ab2830	adrp x20,0x2d0000
00ab2834	add x20,x20,#0x1f2
00ab2838	adrp x2,0x2d4000
00ab283c	add x2,x2,#0x269
00ab2840	mov w1,#0x5e
00ab2844	mov x0,x20
00ab2848	bl 0x00c342b0
00ab284c	mov w0,#0xd
00ab2850	mov w1,#0x91
00ab2854	mov x2,xzr
00ab2858	bl 0x00c342c0
00ab285c	mov w2,#0x5f
00ab2860	b 0x00ab28a4
00ab2864	ldr x19,[sp, #0x8]
00ab2868	b 0x00ab27e0
00ab286c	bl 0x00c342a0
00ab2870	adrp x20,0x2d0000
00ab2874	add x20,x20,#0x1f2
00ab2878	adrp x2,0x2d4000
00ab287c	add x2,x2,#0x269
00ab2880	mov w1,#0x66
00ab2884	mov x0,x20
00ab2888	bl 0x00c342b0
00ab288c	mov w1,#0x100
00ab2890	mov w0,#0xd
00ab2894	movk w1,#0xc, LSL #16
00ab2898	mov x2,xzr
00ab289c	bl 0x00c342c0
00ab28a0	mov w2,#0x67
00ab28a4	mov x0,x22
00ab28a8	mov x1,x20
00ab28ac	bl 0x00c32310
00ab28b0	mov w0,wzr
00ab28b4	ldp x29,x30,[sp, #0x70]
00ab28b8	ldp x20,x19,[sp, #0x60]
00ab28bc	ldp x22,x21,[sp, #0x50]
00ab28c0	ldp x24,x23,[sp, #0x40]
00ab28c4	ldp x26,x25,[sp, #0x30]
00ab28c8	ldp x28,x27,[sp, #0x20]
00ab28cc	add sp,sp,#0x80
00ab28d0	ret
