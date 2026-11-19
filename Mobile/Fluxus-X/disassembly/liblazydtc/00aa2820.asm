; ossl_provider_disable_fallback_loading @ 00aa2820
00aa2820	str x19,[sp, #-0x20]!
00aa2824	adrp x2,0xc6d000
00aa2828	add x2,x2,#0x4c8
00aa282c	mov w1,#0x1
00aa2830	stp x29,x30,[sp, #0x10]
00aa2834	add x29,sp,#0x10
00aa2838	bl 0x00c3b520
00aa283c	cbz x0,0x00aa286c
00aa2840	mov x19,x0
00aa2844	ldr x0,[x0, #0x20]
00aa2848	bl 0x00c356a0
00aa284c	cbz w0,0x00aa28a0
00aa2850	ldrb w8,[x19, #0x48]
00aa2854	ldr x0,[x19, #0x20]
00aa2858	and w8,w8,#0xfe
00aa285c	strb w8,[x19, #0x48]
00aa2860	bl 0x00c35690
00aa2864	mov w0,#0x1
00aa2868	b 0x00aa28a0
00aa286c	bl 0x00c342a0
00aa2870	adrp x0,0x2aa000
00aa2874	adrp x2,0x2bb000
00aa2878	add x0,x0,#0x4b5
00aa287c	add x2,x2,#0xf7d
00aa2880	mov w1,#0x156
00aa2884	bl 0x00c342b0
00aa2888	mov w1,#0x103
00aa288c	orr w0,wzr,#0xf
00aa2890	movk w1,#0xc, LSL #16
00aa2894	mov x2,xzr
00aa2898	bl 0x00c342c0
00aa289c	mov w0,wzr
00aa28a0	ldp x29,x30,[sp, #0x10]
00aa28a4	ldr x19,[sp], #0x20
00aa28a8	ret
