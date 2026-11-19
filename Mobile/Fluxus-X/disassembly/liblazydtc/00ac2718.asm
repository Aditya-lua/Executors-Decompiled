; PKCS7_ctrl @ 00ac2718
00ac2718	str x21,[sp, #-0x30]!
00ac271c	stp x20,x19,[sp, #0x10]
00ac2720	stp x29,x30,[sp, #0x20]
00ac2724	mov x19,x0
00ac2728	ldr x0,[x0, #0x18]
00ac272c	add x29,sp,#0x20
00ac2730	mov x20,x2
00ac2734	mov w21,w1
00ac2738	bl 0x00c37750
00ac273c	cmp w21,#0x2
00ac2740	b.eq 0x00ac279c
00ac2744	cmp w21,#0x1
00ac2748	b.ne 0x00ac27c4
00ac274c	cmp w0,#0x16
00ac2750	b.ne 0x00ac27ec
00ac2754	lsl x8,x20,#0x20
00ac2758	str w20,[x19, #0x14]
00ac275c	cbz x8,0x00ac2834
00ac2760	ldr x8,[x19, #0x20]
00ac2764	sxtw x20,w20
00ac2768	ldr x8,[x8, #0x28]
00ac276c	ldr x0,[x8, #0x18]
00ac2770	bl 0x00c37750
00ac2774	cmp w0,#0x15
00ac2778	b.ne 0x00ac2838
00ac277c	ldr x8,[x19, #0x20]
00ac2780	ldr x8,[x8, #0x28]
00ac2784	ldr x0,[x8, #0x20]
00ac2788	bl 0x00c35530
00ac278c	ldr x8,[x19, #0x20]
00ac2790	ldr x8,[x8, #0x28]
00ac2794	str xzr,[x8, #0x20]
00ac2798	b 0x00ac2838
00ac279c	cmp w0,#0x16
00ac27a0	b.ne 0x00ac2808
00ac27a4	ldr x8,[x19, #0x20]
00ac27a8	cbz x8,0x00ac284c
00ac27ac	ldr x8,[x8, #0x28]
00ac27b0	ldr x8,[x8, #0x20]
00ac27b4	cmp x8,#0x0
00ac27b8	cset w20,eq
00ac27bc	str w20,[x19, #0x14]
00ac27c0	b 0x00ac2838
00ac27c4	bl 0x00c342a0
00ac27c8	adrp x0,0x2ce000
00ac27cc	adrp x2,0x2ac000
00ac27d0	add x0,x0,#0x1ca
00ac27d4	add x2,x2,#0x70f
00ac27d8	orr w1,wzr,#0x3c
00ac27dc	bl 0x00c342b0
00ac27e0	mov w0,#0x21
00ac27e4	mov w1,#0x6e
00ac27e8	b 0x00ac282c
00ac27ec	bl 0x00c342a0
00ac27f0	adrp x0,0x2ce000
00ac27f4	adrp x2,0x2ac000
00ac27f8	add x0,x0,#0x1ca
00ac27fc	add x2,x2,#0x70f
00ac2800	mov w1,#0x28
00ac2804	b 0x00ac2820
00ac2808	bl 0x00c342a0
00ac280c	adrp x0,0x2ce000
00ac2810	adrp x2,0x2ac000
00ac2814	add x0,x0,#0x1ca
00ac2818	add x2,x2,#0x70f
00ac281c	mov w1,#0x36
00ac2820	bl 0x00c342b0
00ac2824	mov w0,#0x21
00ac2828	mov w1,#0x68
00ac282c	mov x2,xzr
00ac2830	bl 0x00c342c0
00ac2834	mov x20,xzr
00ac2838	mov x0,x20
00ac283c	ldp x29,x30,[sp, #0x20]
00ac2840	ldp x20,x19,[sp, #0x10]
00ac2844	ldr x21,[sp], #0x30
00ac2848	ret
00ac284c	mov w20,#0x1
00ac2850	str w20,[x19, #0x14]
00ac2854	b 0x00ac2838
