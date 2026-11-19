; PKCS7_simple_smimecap @ 00ac248c
00ac248c	stp x22,x21,[sp, #-0x30]!
00ac2490	stp x20,x19,[sp, #0x10]
00ac2494	stp x29,x30,[sp, #0x20]
00ac2498	add x29,sp,#0x20
00ac249c	mov w22,w2
00ac24a0	mov w21,w1
00ac24a4	mov x20,x0
00ac24a8	bl 0x00c38250
00ac24ac	cbz x0,0x00ac2524
00ac24b0	mov x19,x0
00ac24b4	ldr x0,[x0]
00ac24b8	bl 0x00c37660
00ac24bc	mov w0,w21
00ac24c0	bl 0x00c37740
00ac24c4	cmp w22,#0x1
00ac24c8	str x0,[x19]
00ac24cc	b.lt 0x00ac250c
00ac24d0	bl 0x00c37a40
00ac24d4	str x0,[x19, #0x8]
00ac24d8	cbz x0,0x00ac2558
00ac24dc	bl 0x00c37f30
00ac24e0	mov x21,x0
00ac24e4	cbz x0,0x00ac255c
00ac24e8	sxtw x1,w22
00ac24ec	mov x0,x21
00ac24f0	bl 0x00c375b0
00ac24f4	cbz w0,0x00ac255c
00ac24f8	ldr x8,[x19, #0x8]
00ac24fc	mov w9,#0x2
00ac2500	str x21,[x8, #0x8]
00ac2504	ldr x8,[x19, #0x8]
00ac2508	str w9,[x8]
00ac250c	mov x0,x20
00ac2510	mov x1,x19
00ac2514	bl 0x00c347a0
00ac2518	cbz w0,0x00ac2558
00ac251c	mov w0,#0x1
00ac2520	b 0x00ac25a0
00ac2524	bl 0x00c342a0
00ac2528	adrp x0,0x2b8000
00ac252c	adrp x2,0x2a8000
00ac2530	add x0,x0,#0x597
00ac2534	add x2,x2,#0x73d
00ac2538	orr w1,wzr,#0x3c
00ac253c	bl 0x00c342b0
00ac2540	mov w1,#0x100
00ac2544	mov w0,#0x21
00ac2548	movk w1,#0xc, LSL #16
00ac254c	mov x2,xzr
00ac2550	bl 0x00c342c0
00ac2554	b 0x00ac259c
00ac2558	mov x21,xzr
00ac255c	bl 0x00c342a0
00ac2560	adrp x0,0x2b8000
00ac2564	adrp x2,0x2a8000
00ac2568	add x0,x0,#0x597
00ac256c	add x2,x2,#0x73d
00ac2570	mov w1,#0x54
00ac2574	bl 0x00c342b0
00ac2578	mov w1,#0x100
00ac257c	mov w0,#0x21
00ac2580	movk w1,#0xc, LSL #16
00ac2584	mov x2,xzr
00ac2588	bl 0x00c342c0
00ac258c	mov x0,x21
00ac2590	bl 0x00c37c30
00ac2594	mov x0,x19
00ac2598	bl 0x00c38240
00ac259c	mov w0,wzr
00ac25a0	ldp x29,x30,[sp, #0x20]
00ac25a4	ldp x20,x19,[sp, #0x10]
00ac25a8	ldp x22,x21,[sp], #0x30
00ac25ac	ret
