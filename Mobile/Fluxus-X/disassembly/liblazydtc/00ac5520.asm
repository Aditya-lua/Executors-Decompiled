; ossl_sa_doall_arg @ 00ac5520
00ac5520	cbz x0,0x00ac562c
00ac5524	sub sp,sp,#0x130
00ac5528	stp x28,x27,[sp, #0xd0]
00ac552c	stp x26,x25,[sp, #0xe0]
00ac5530	stp x24,x23,[sp, #0xf0]
00ac5534	stp x22,x21,[sp, #0x100]
00ac5538	stp x20,x19,[sp, #0x110]
00ac553c	stp x29,x30,[sp, #0x120]
00ac5540	str wzr,[sp, #0x88]
00ac5544	ldr x9,[x0, #0x18]
00ac5548	mov x19,x2
00ac554c	mov x20,x1
00ac5550	mov x21,x0
00ac5554	mov w27,wzr
00ac5558	mov x22,xzr
00ac555c	mov w8,wzr
00ac5560	add x23,sp,#0x8
00ac5564	add x24,sp,#0x88
00ac5568	add x29,sp,#0x120
00ac556c	str x9,[sp, #0x8]
00ac5570	b 0x00ac5580
00ac5574	sub x8,x25,#0x1
00ac5578	ldr w27,[x24, x8, LSL #0x2]
00ac557c	lsr x22,x22,#0x4
00ac5580	ldr x26,[x23, w8, SXTW #0x3]
00ac5584	sxtw x25,w8
00ac5588	b 0x00ac5598
00ac558c	mov x0,x22
00ac5590	mov x2,x19
00ac5594	blr x20
00ac5598	sxtw x8,w27
00ac559c	cmp w8,#0x10
00ac55a0	b.lt 0x00ac55b4
00ac55a4	b 0x00ac55ec
00ac55a8	add x8,x8,#0x1
00ac55ac	cmp w8,#0x10
00ac55b0	b.ge 0x00ac55ec
00ac55b4	add w9,w8,#0x1
00ac55b8	str w9,[x24, x25, LSL #0x2]
00ac55bc	cbz x26,0x00ac55a8
00ac55c0	ldr x1,[x26, x8, LSL #0x3]
00ac55c4	cbz x1,0x00ac55a8
00ac55c8	ldr w9,[x21]
00ac55cc	and x10,x22,#-0x10
00ac55d0	orr x22,x10,x8
00ac55d4	sub w9,w9,#0x1
00ac55d8	cmp w25,w9
00ac55dc	b.lt 0x00ac55f8
00ac55e0	add x27,x8,#0x1
00ac55e4	cbnz x20,0x00ac558c
00ac55e8	b 0x00ac5598
00ac55ec	cmp w25,#0x1
00ac55f0	b.ge 0x00ac5574
00ac55f4	b 0x00ac5610
00ac55f8	add x8,x25,#0x1
00ac55fc	mov w27,wzr
00ac5600	str wzr,[x24, x8, LSL #0x2]
00ac5604	str x1,[x23, x8, LSL #0x3]
00ac5608	lsl x22,x22,#0x4
00ac560c	b 0x00ac5580
00ac5610	ldp x29,x30,[sp, #0x120]
00ac5614	ldp x20,x19,[sp, #0x110]
00ac5618	ldp x22,x21,[sp, #0x100]
00ac561c	ldp x24,x23,[sp, #0xf0]
00ac5620	ldp x26,x25,[sp, #0xe0]
00ac5624	ldp x28,x27,[sp, #0xd0]
00ac5628	add sp,sp,#0x130
00ac562c	ret
