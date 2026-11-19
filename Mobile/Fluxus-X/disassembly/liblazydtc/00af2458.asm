; X509_load_cert_crl_file_ex @ 00af2458
00af2458	str x23,[sp, #-0x40]!
00af245c	stp x22,x21,[sp, #0x10]
00af2460	stp x20,x19,[sp, #0x20]
00af2464	mov x19,x4
00af2468	mov x21,x3
00af246c	cmp w2,#0x1
00af2470	mov x20,x0
00af2474	stp x29,x30,[sp, #0x30]
00af2478	add x29,sp,#0x30
00af247c	b.ne 0x00af257c
00af2480	adrp x8,0x2c8000
00af2484	add x8,x8,#0xcc8
00af2488	mov x0,x1
00af248c	mov x1,x8
00af2490	bl 0x00c387e0
00af2494	cbz x0,0x00af259c
00af2498	adrp x3,0x2ab000
00af249c	add x3,x3,#0x32c
00af24a0	mov x1,xzr
00af24a4	mov x2,xzr
00af24a8	mov x4,x21
00af24ac	mov x5,x19
00af24b0	mov x22,x0
00af24b4	bl 0x00c3f180
00af24b8	mov x19,x0
00af24bc	mov x0,x22
00af24c0	bl 0x00c31a40
00af24c4	cbz x19,0x00af25c8
00af24c8	mov x0,x19
00af24cc	bl 0x00c325e0
00af24d0	cmp w0,#0x1
00af24d4	b.lt 0x00af2538
00af24d8	mov w21,wzr
00af24dc	mov w22,wzr
00af24e0	mov x0,x19
00af24e4	mov w1,w22
00af24e8	bl 0x00c32610
00af24ec	ldr x1,[x0]
00af24f0	mov x23,x0
00af24f4	cbz x1,0x00af2508
00af24f8	ldr x0,[x20, #0x18]
00af24fc	bl 0x00c31a80
00af2500	cbz w0,0x00af2568
00af2504	add w21,w21,#0x1
00af2508	ldr x1,[x23, #0x8]
00af250c	cbz x1,0x00af2520
00af2510	ldr x0,[x20, #0x18]
00af2514	bl 0x00c32bf0
00af2518	cbz w0,0x00af2568
00af251c	add w21,w21,#0x1
00af2520	mov x0,x19
00af2524	add w22,w22,#0x1
00af2528	bl 0x00c325e0
00af252c	cmp w22,w0
00af2530	b.lt 0x00af24e0
00af2534	cbnz w21,0x00af2568
00af2538	bl 0x00c342a0
00af253c	adrp x0,0x2dc000
00af2540	adrp x2,0x2b2000
00af2544	add x0,x0,#0xa05
00af2548	add x2,x2,#0xbeb
00af254c	mov w1,#0xfb
00af2550	bl 0x00c342b0
00af2554	mov w0,#0xb
00af2558	mov w1,#0x88
00af255c	mov x2,xzr
00af2560	bl 0x00c342c0
00af2564	mov w21,wzr
00af2568	adrp x1,0xcb4000
00af256c	ldr x1,[x1, #0xe80]
00af2570	mov x0,x19
00af2574	bl 0x00c32600
00af2578	b 0x00af2600
00af257c	mov x0,x20
00af2580	mov x3,x21
00af2584	mov x4,x19
00af2588	ldp x29,x30,[sp, #0x30]
00af258c	ldp x20,x19,[sp, #0x20]
00af2590	ldp x22,x21,[sp, #0x10]
00af2594	ldr x23,[sp], #0x40
00af2598	b 0x00af1fe8
00af259c	bl 0x00c342a0
00af25a0	adrp x0,0x2dc000
00af25a4	adrp x2,0x2b2000
00af25a8	add x0,x0,#0xa05
00af25ac	add x2,x2,#0xbeb
00af25b0	mov w1,#0xe4
00af25b4	bl 0x00c342b0
00af25b8	mov w1,#0x2
00af25bc	mov w0,#0xb
00af25c0	movk w1,#0x8, LSL #16
00af25c4	b 0x00af25f4
00af25c8	bl 0x00c342a0
00af25cc	adrp x0,0x2dc000
00af25d0	adrp x2,0x2b2000
00af25d4	add x0,x0,#0xa05
00af25d8	add x2,x2,#0xbeb
00af25dc	mov w1,#0xea
00af25e0	bl 0x00c342b0
00af25e4	mov w8,#0x2
00af25e8	movk w8,#0x8, LSL #16
00af25ec	add w1,w8,#0x7
00af25f0	mov w0,#0xb
00af25f4	mov x2,xzr
00af25f8	bl 0x00c342c0
00af25fc	mov w21,wzr
00af2600	mov w0,w21
00af2604	ldp x29,x30,[sp, #0x30]
00af2608	ldp x20,x19,[sp, #0x20]
00af260c	ldp x22,x21,[sp, #0x10]
00af2610	ldr x23,[sp], #0x40
00af2614	ret
