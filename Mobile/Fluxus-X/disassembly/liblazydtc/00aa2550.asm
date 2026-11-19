; FUN_00aa2550 @ 00aa2550
00aa2550	stp x28,x27,[sp, #-0x60]!
00aa2554	stp x26,x25,[sp, #0x10]
00aa2558	stp x24,x23,[sp, #0x20]
00aa255c	stp x22,x21,[sp, #0x30]
00aa2560	stp x20,x19,[sp, #0x40]
00aa2564	stp x29,x30,[sp, #0x50]
00aa2568	add x29,sp,#0x50
00aa256c	sub sp,sp,#0x210
00aa2570	mov x20,x1
00aa2574	mov x21,x0
00aa2578	mov x0,x4
00aa257c	mov x1,x3
00aa2580	mov x19,x5
00aa2584	mov x22,x4
00aa2588	mov x25,x3
00aa258c	mov x24,x2
00aa2590	bl 0x00c394b0
00aa2594	cbz x0,0x00aa26b0
00aa2598	mov x23,x0
00aa259c	mov x0,x19
00aa25a0	bl 0x00c325e0
00aa25a4	cmp w0,#0x1
00aa25a8	b.lt 0x00aa25d8
00aa25ac	mov w26,wzr
00aa25b0	mov x0,x19
00aa25b4	mov w1,w26
00aa25b8	bl 0x00c32610
00aa25bc	cmp x0,x25
00aa25c0	b.eq 0x00aa26e0
00aa25c4	mov x0,x19
00aa25c8	add w26,w26,#0x1
00aa25cc	bl 0x00c325e0
00aa25d0	cmp w26,w0
00aa25d4	b.lt 0x00aa25b0
00aa25d8	mov x0,x19
00aa25dc	mov x1,x25
00aa25e0	bl 0x00c347a0
00aa25e4	cbz w0,0x00aa270c
00aa25e8	cbz x24,0x00aa261c
00aa25ec	add x0,sp,#0x8
00aa25f0	mov w2,#0x200
00aa25f4	mov x1,x24
00aa25f8	bl 0x00c387f0
00aa25fc	adrp x1,0x2ab000
00aa2600	add x1,x1,#0x502
00aa2604	add x0,sp,#0x8
00aa2608	mov w2,#0x200
00aa260c	bl 0x00c395d0
00aa2610	add x0,sp,#0x8
00aa2614	bl 0x00c2ff50
00aa2618	mov x24,x0
00aa261c	mov x0,x23
00aa2620	bl 0x00c325e0
00aa2624	cmp w0,#0x1
00aa2628	b.lt 0x00aa26a0
00aa262c	mov w25,wzr
00aa2630	add x27,sp,#0x8
00aa2634	mov x0,x23
00aa2638	mov w1,w25
00aa263c	bl 0x00c32610
00aa2640	mov x26,x0
00aa2644	ldr x0,[x0, #0x8]
00aa2648	bl 0x00c2ff50
00aa264c	add x8,x0,x24
00aa2650	cmp x8,#0x200
00aa2654	b.cs 0x00aa2760
00aa2658	strb wzr,[x27, x24]
00aa265c	ldr x1,[x26, #0x8]
00aa2660	add x0,sp,#0x8
00aa2664	mov w2,#0x200
00aa2668	bl 0x00c395d0
00aa266c	ldr x3,[x26, #0x10]
00aa2670	add x2,sp,#0x8
00aa2674	mov x0,x21
00aa2678	mov x1,x20
00aa267c	mov x4,x22
00aa2680	mov x5,x19
00aa2684	bl 0x00aa2550
00aa2688	tbnz w0,#0x1f,0x00aa2770
00aa268c	mov x0,x23
00aa2690	add w25,w25,#0x1
00aa2694	bl 0x00c325e0
00aa2698	cmp w25,w0
00aa269c	b.lt 0x00aa2634
00aa26a0	mov x0,x19
00aa26a4	bl 0x00c325f0
00aa26a8	mov w26,#0x1
00aa26ac	b 0x00aa2710
00aa26b0	cbz x21,0x00aa2734
00aa26b4	mov x0,x21
00aa26b8	mov x1,x24
00aa26bc	mov x2,x25
00aa26c0	add sp,sp,#0x210
00aa26c4	ldp x29,x30,[sp, #0x50]
00aa26c8	ldp x20,x19,[sp, #0x40]
00aa26cc	ldp x22,x21,[sp, #0x30]
00aa26d0	ldp x24,x23,[sp, #0x20]
00aa26d4	ldp x26,x25,[sp, #0x10]
00aa26d8	ldp x28,x27,[sp], #0x60
00aa26dc	b 0x00c3eba0
00aa26e0	bl 0x00c342a0
00aa26e4	adrp x0,0x2c9000
00aa26e8	adrp x2,0x2a6000
00aa26ec	add x0,x0,#0xdb4
00aa26f0	add x2,x2,#0x3c2
00aa26f4	mov w1,#0x6a
00aa26f8	bl 0x00c342b0
00aa26fc	orr w0,wzr,#0xe
00aa2700	orr w1,wzr,#0x7e
00aa2704	mov x2,xzr
00aa2708	bl 0x00c342c0
00aa270c	mov w26,#0xffffffff
00aa2710	mov w0,w26
00aa2714	add sp,sp,#0x210
00aa2718	ldp x29,x30,[sp, #0x50]
00aa271c	ldp x20,x19,[sp, #0x40]
00aa2720	ldp x22,x21,[sp, #0x30]
00aa2724	ldp x24,x23,[sp, #0x20]
00aa2728	ldp x26,x25,[sp, #0x10]
00aa272c	ldp x28,x27,[sp], #0x60
00aa2730	ret
00aa2734	mov x0,x20
00aa2738	mov x1,x24
00aa273c	mov x2,x25
00aa2740	add sp,sp,#0x210
00aa2744	ldp x29,x30,[sp, #0x50]
00aa2748	ldp x20,x19,[sp, #0x40]
00aa274c	ldp x22,x21,[sp, #0x30]
00aa2750	ldp x24,x23,[sp, #0x20]
00aa2754	ldp x26,x25,[sp, #0x10]
00aa2758	ldp x28,x27,[sp], #0x60
00aa275c	b 0x00c3ebb0
00aa2760	mov x0,x19
00aa2764	bl 0x00c325f0
00aa2768	mov w26,#0xffffffff
00aa276c	b 0x00aa2710
00aa2770	mov w26,w0
00aa2774	mov x0,x19
00aa2778	bl 0x00c325f0
00aa277c	b 0x00aa2710
