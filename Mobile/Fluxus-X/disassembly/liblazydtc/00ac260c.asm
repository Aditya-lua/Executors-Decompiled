; PKCS7_add0_attrib_signing_time @ 00ac260c
00ac260c	stp x20,x19,[sp, #-0x20]!
00ac2610	mov x3,x1
00ac2614	mov x19,x0
00ac2618	mov x20,xzr
00ac261c	stp x29,x30,[sp, #0x10]
00ac2620	add x29,sp,#0x10
00ac2624	cbnz x1,0x00ac263c
00ac2628	mov x0,xzr
00ac262c	bl 0x00c3f800
00ac2630	mov x3,x0
00ac2634	mov x20,x0
00ac2638	cbz x0,0x00ac2664
00ac263c	mov w1,#0x34
00ac2640	mov w2,#0x17
00ac2644	mov x0,x19
00ac2648	bl 0x00c3f760
00ac264c	cbz w0,0x00ac2658
00ac2650	mov w0,#0x1
00ac2654	b 0x00ac2698
00ac2658	mov x0,x20
00ac265c	bl 0x00c37930
00ac2660	b 0x00ac2694
00ac2664	bl 0x00c342a0
00ac2668	adrp x0,0x2b8000
00ac266c	adrp x2,0x2b6000
00ac2670	add x0,x0,#0x597
00ac2674	add x2,x2,#0x351
00ac2678	mov w1,#0x69
00ac267c	bl 0x00c342b0
00ac2680	mov w1,#0x100
00ac2684	mov w0,#0x21
00ac2688	movk w1,#0xc, LSL #16
00ac268c	mov x2,xzr
00ac2690	bl 0x00c342c0
00ac2694	mov w0,wzr
00ac2698	ldp x29,x30,[sp, #0x10]
00ac269c	ldp x20,x19,[sp], #0x20
00ac26a0	ret
