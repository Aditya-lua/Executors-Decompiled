; FUN_00ad2770 @ 00ad2770
00ad2770	sub sp,sp,#0xb0
00ad2774	stp x22,x21,[sp, #0x80]
00ad2778	stp x20,x19,[sp, #0x90]
00ad277c	stp x29,x30,[sp, #0xa0]
00ad2780	add x29,sp,#0xa0
00ad2784	cbz x0,0x00ad27d0
00ad2788	mov x21,x4
00ad278c	cbz x4,0x00ad27d0
00ad2790	ldr w8,[x0]
00ad2794	mov x19,x0
00ad2798	tst w8,w2
00ad279c	b.eq 0x00ad27d0
00ad27a0	mov x20,x5
00ad27a4	mov x22,x3
00ad27a8	cmn w1,#0x1
00ad27ac	b.eq 0x00ad2804
00ad27b0	mov w0,w1
00ad27b4	bl 0x00c37d50
00ad27b8	mov x1,x0
00ad27bc	mov x0,x19
00ad27c0	bl 0x00c3dc40
00ad27c4	cbnz w0,0x00ad2818
00ad27c8	mov w0,#0xffffffff
00ad27cc	b 0x00ad286c
00ad27d0	bl 0x00c342a0
00ad27d4	adrp x0,0x2b0000
00ad27d8	adrp x2,0x2c2000
00ad27dc	add x0,x0,#0x862
00ad27e0	add x2,x2,#0x393
00ad27e4	mov w1,#0x3a4
00ad27e8	bl 0x00c342b0
00ad27ec	orr w0,wzr,#0x6
00ad27f0	mov w1,#0x93
00ad27f4	mov x2,xzr
00ad27f8	bl 0x00c342c0
00ad27fc	orr w0,wzr,#0xfffffffe
00ad2800	b 0x00ad286c
00ad2804	adrp x1,0x2db000
00ad2808	add x1,x1,#0x996
00ad280c	mov x0,x19
00ad2810	bl 0x00c3dc40
00ad2814	cbz w0,0x00ad2880
00ad2818	add x8,sp,#0x8
00ad281c	mov x0,x22
00ad2820	mov x1,x21
00ad2824	mov x2,x20
00ad2828	bl 0x00c36280
00ad282c	ldr x8,[sp, #0x28]
00ad2830	ldur q0,[sp, #0x18]
00ad2834	ldur q1,[sp, #0x8]
00ad2838	str x8,[sp, #0x50]
00ad283c	add x8,sp,#0x8
00ad2840	stp q1,q0,[sp, #0x30]
00ad2844	bl 0x00c34c40
00ad2848	ldr x8,[sp, #0x28]
00ad284c	ldur q0,[sp, #0x18]
00ad2850	ldur q1,[sp, #0x8]
00ad2854	add x1,sp,#0x30
00ad2858	mov x0,x19
00ad285c	str x8,[sp, #0x78]
00ad2860	stur q0,[sp, #0x68]
00ad2864	stur q1,[sp, #0x58]
00ad2868	bl 0x00c3c110
00ad286c	ldp x29,x30,[sp, #0xa0]
00ad2870	ldp x20,x19,[sp, #0x90]
00ad2874	ldp x22,x21,[sp, #0x80]
00ad2878	add sp,sp,#0xb0
00ad287c	ret
00ad2880	adrp x1,0x2b9000
00ad2884	add x1,x1,#0x9cf
00ad2888	b 0x00ad27bc
