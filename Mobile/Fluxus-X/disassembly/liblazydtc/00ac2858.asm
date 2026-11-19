; PKCS7_content_new @ 00ac2858
00ac2858	str x21,[sp, #-0x30]!
00ac285c	stp x20,x19,[sp, #0x10]
00ac2860	stp x29,x30,[sp, #0x20]
00ac2864	add x29,sp,#0x20
00ac2868	mov w21,w1
00ac286c	mov x20,x0
00ac2870	bl 0x00c3f590
00ac2874	mov x19,x0
00ac2878	cbz x0,0x00ac28a4
00ac287c	mov x0,x19
00ac2880	mov w1,w21
00ac2884	bl 0x00ac28c0
00ac2888	cbz w0,0x00ac28a4
00ac288c	mov x0,x20
00ac2890	mov x1,x19
00ac2894	bl 0x00ac2a54
00ac2898	cbz w0,0x00ac28a4
00ac289c	mov w0,#0x1
00ac28a0	b 0x00ac28b0
00ac28a4	mov x0,x19
00ac28a8	bl 0x00c3f560
00ac28ac	mov w0,wzr
00ac28b0	ldp x29,x30,[sp, #0x20]
00ac28b4	ldp x20,x19,[sp, #0x10]
00ac28b8	ldr x21,[sp], #0x30
00ac28bc	ret
