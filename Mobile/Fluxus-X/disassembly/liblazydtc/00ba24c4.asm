; psa_save_persistent_key @ 00ba24c4
00ba24c4	sub sp,sp,#0x60
00ba24c8	str x25,[sp, #0x10]
00ba24cc	stp x24,x23,[sp, #0x20]
00ba24d0	stp x22,x21,[sp, #0x30]
00ba24d4	stp x20,x19,[sp, #0x40]
00ba24d8	stp x29,x30,[sp, #0x50]
00ba24dc	add x29,sp,#0x50
00ba24e0	mrs x25,tpidr_el0
00ba24e4	ldr x8,[x25, #0x28]
00ba24e8	mov x23,x2
00ba24ec	mov x24,x1
00ba24f0	mov x22,x0
00ba24f4	mov w21,#0xffffff79
00ba24f8	str x8,[sp, #0x8]
00ba24fc	cbz x1,0x00ba25f8
00ba2500	cbz x23,0x00ba25f8
00ba2504	lsr x8,x23,#0xd
00ba2508	cbz x8,0x00ba2514
00ba250c	mov w21,#0xffffff72
00ba2510	b 0x00ba25f8
00ba2514	add x19,x23,#0x24
00ba2518	mov w0,#0x1
00ba251c	mov x1,x19
00ba2520	bl 0x00c30a30
00ba2524	mov x20,x0
00ba2528	cbz x0,0x00ba25b0
00ba252c	mov x8,#0x5350
00ba2530	movk x8,#0x41, LSL #16
00ba2534	movk x8,#0x454b, LSL #32
00ba2538	movk x8,#0x59, LSL #48
00ba253c	str x8,[x20]
00ba2540	ldr w8,[x22, #0x4]
00ba2544	add x0,x20,#0x24
00ba2548	mov x1,x24
00ba254c	mov x2,x23
00ba2550	str w8,[x20, #0xc]
00ba2554	ldrh w8,[x22]
00ba2558	strh w8,[x20, #0x10]
00ba255c	ldrh w8,[x22, #0x2]
00ba2560	strh w8,[x20, #0x12]
00ba2564	ldr x8,[x22, #0x8]
00ba2568	stur x8,[x20, #0x14]
00ba256c	ldr w8,[x22, #0x10]
00ba2570	stp w8,w23,[x20, #0x1c]
00ba2574	bl 0x00c2ffd0
00ba2578	ldr w22,[x22, #0x14]
00ba257c	mov x1,sp
00ba2580	mov x0,x22
00ba2584	bl 0x00c43270
00ba2588	cmn w0,#0x8c
00ba258c	b.ne 0x00ba25b8
00ba2590	mov x0,x22
00ba2594	mov w1,w19
00ba2598	mov x2,x20
00ba259c	mov w3,wzr
00ba25a0	bl 0x00c43290
00ba25a4	cbz w0,0x00ba25c0
00ba25a8	mov w21,#0xffffff67
00ba25ac	b 0x00ba25ec
00ba25b0	mov w21,#0xffffff73
00ba25b4	b 0x00ba25f8
00ba25b8	mov w21,#0xffffff75
00ba25bc	b 0x00ba25ec
00ba25c0	mov x1,sp
00ba25c4	mov x0,x22
00ba25c8	bl 0x00c43270
00ba25cc	mov w21,w0
00ba25d0	cbnz w0,0x00ba25e4
00ba25d4	ldr w8,[sp]
00ba25d8	cmp x19,x8
00ba25dc	b.eq 0x00ba25ec
00ba25e0	mov w21,#0xffffff67
00ba25e4	mov x0,x22
00ba25e8	bl 0x00c43280
00ba25ec	mov x0,x20
00ba25f0	mov x1,x19
00ba25f4	bl 0x00c42230
00ba25f8	ldr x8,[x25, #0x28]
00ba25fc	ldr x9,[sp, #0x8]
00ba2600	cmp x8,x9
00ba2604	b.ne 0x00ba2628
00ba2608	mov w0,w21
00ba260c	ldp x29,x30,[sp, #0x50]
00ba2610	ldp x20,x19,[sp, #0x40]
00ba2614	ldp x22,x21,[sp, #0x30]
00ba2618	ldp x24,x23,[sp, #0x20]
00ba261c	ldr x25,[sp, #0x10]
00ba2620	add sp,sp,#0x60
00ba2624	ret
00ba2628	bl 0x00c2fec0
