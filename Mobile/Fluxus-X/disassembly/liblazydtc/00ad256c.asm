; FUN_00ad256c @ 00ad256c
00ad256c	sub sp,sp,#0xf0
00ad2570	stp x24,x23,[sp, #0xb0]
00ad2574	stp x22,x21,[sp, #0xc0]
00ad2578	stp x20,x19,[sp, #0xd0]
00ad257c	stp x29,x30,[sp, #0xe0]
00ad2580	add x29,sp,#0xe0
00ad2584	cbz x0,0x00ad25d4
00ad2588	mov x22,x4
00ad258c	cbz x4,0x00ad25d4
00ad2590	ldr w8,[x0]
00ad2594	mov x19,x0
00ad2598	tst w8,w2
00ad259c	b.eq 0x00ad25d4
00ad25a0	mov x20,x6
00ad25a4	mov x21,x5
00ad25a8	mov x23,x3
00ad25ac	cmn w1,#0x1
00ad25b0	b.eq 0x00ad2608
00ad25b4	mov w0,w1
00ad25b8	bl 0x00c37d50
00ad25bc	mov x1,x0
00ad25c0	mov x0,x19
00ad25c4	bl 0x00c3dc40
00ad25c8	cbnz w0,0x00ad261c
00ad25cc	mov w0,#0xffffffff
00ad25d0	b 0x00ad26b4
00ad25d4	bl 0x00c342a0
00ad25d8	adrp x0,0x2b0000
00ad25dc	adrp x2,0x2b2000
00ad25e0	add x0,x0,#0x862
00ad25e4	add x2,x2,#0xb15
00ad25e8	mov w1,#0x37c
00ad25ec	bl 0x00c342b0
00ad25f0	orr w0,wzr,#0x6
00ad25f4	mov w1,#0x93
00ad25f8	mov x2,xzr
00ad25fc	bl 0x00c342c0
00ad2600	orr w0,wzr,#0xfffffffe
00ad2604	b 0x00ad26b4
00ad2608	adrp x1,0x2db000
00ad260c	add x1,x1,#0x996
00ad2610	mov x0,x19
00ad2614	bl 0x00c3dc40
00ad2618	cbz w0,0x00ad26cc
00ad261c	add x8,sp,#0x30
00ad2620	add x24,x8,#0x28
00ad2624	add x8,sp,#0x8
00ad2628	mov x0,x23
00ad262c	mov x1,x22
00ad2630	mov x2,xzr
00ad2634	bl 0x00c36280
00ad2638	ldr x8,[sp, #0x28]
00ad263c	ldur q0,[sp, #0x18]
00ad2640	ldur q1,[sp, #0x8]
00ad2644	str x8,[sp, #0x50]
00ad2648	stp q1,q0,[sp, #0x30]
00ad264c	cbz x20,0x00ad268c
00ad2650	ldr x8,[x19, #0x20]
00ad2654	cbz x8,0x00ad268c
00ad2658	add x8,sp,#0x30
00ad265c	add x22,x8,#0x50
00ad2660	add x8,sp,#0x8
00ad2664	mov x0,x21
00ad2668	mov x1,x20
00ad266c	mov x2,xzr
00ad2670	bl 0x00c36280
00ad2674	ldr x8,[sp, #0x28]
00ad2678	ldur q0,[sp, #0x8]
00ad267c	ldur q1,[sp, #0x18]
00ad2680	str x8,[x24, #0x20]
00ad2684	stp q0,q1,[x24]
00ad2688	mov x24,x22
00ad268c	add x8,sp,#0x8
00ad2690	bl 0x00c34c40
00ad2694	ldr x8,[sp, #0x28]
00ad2698	ldur q0,[sp, #0x8]
00ad269c	ldur q1,[sp, #0x18]
00ad26a0	add x1,sp,#0x30
00ad26a4	mov x0,x19
00ad26a8	str x8,[x24, #0x20]
00ad26ac	stp q0,q1,[x24]
00ad26b0	bl 0x00c3c120
00ad26b4	ldp x29,x30,[sp, #0xe0]
00ad26b8	ldp x20,x19,[sp, #0xd0]
00ad26bc	ldp x22,x21,[sp, #0xc0]
00ad26c0	ldp x24,x23,[sp, #0xb0]
00ad26c4	add sp,sp,#0xf0
00ad26c8	ret
00ad26cc	adrp x1,0x2b9000
00ad26d0	add x1,x1,#0x9cf
00ad26d4	b 0x00ad25c0
