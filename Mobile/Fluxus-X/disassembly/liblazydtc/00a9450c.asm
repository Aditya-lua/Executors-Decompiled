; FUN_00a9450c @ 00a9450c
00a9450c	sub sp,sp,#0x80
00a94510	stp x20,x19,[sp, #0x60]
00a94514	mov x20,x1
00a94518	mov w1,#0x2000
00a9451c	stp x28,x27,[sp, #0x20]
00a94520	stp x26,x25,[sp, #0x30]
00a94524	stp x24,x23,[sp, #0x40]
00a94528	stp x22,x21,[sp, #0x50]
00a9452c	stp x29,x30,[sp, #0x70]
00a94530	add x29,sp,#0x70
00a94534	mov x22,x3
00a94538	mov x19,x2
00a9453c	mov x21,x0
00a94540	bl 0x00c3cce0
00a94544	lsl x8,x22,#0x3
00a94548	cmp w0,#0x0
00a9454c	csel x26,x8,x22,eq
00a94550	cbz x26,0x00a94618
00a94554	mov x27,xzr
00a94558	add x8,x21,#0x28
00a9455c	str x8,[sp, #0x10]
00a94560	lsr x28,x27,#0x3
00a94564	ldrb w8,[x19, x28]
00a94568	mov x22,x19
00a9456c	and w19,w27,#0x7
00a94570	eor w9,w19,#0x7
00a94574	mov w10,#0x1
00a94578	lsl w9,w10,w9
00a9457c	tst w9,w8
00a94580	orr w8,wzr,#0xffffff80
00a94584	csel w8,wzr,w8,eq
00a94588	mov x0,x21
00a9458c	strb w8,[sp, #0x1c]
00a94590	bl 0x00c3cea0
00a94594	mov x23,x0
00a94598	mov x0,x21
00a9459c	bl 0x00c3cea0
00a945a0	add x24,x0,#0x80
00a945a4	mov x0,x21
00a945a8	bl 0x00c3cea0
00a945ac	add x25,x0,#0x100
00a945b0	mov x0,x21
00a945b4	bl 0x00c3cec0
00a945b8	ldr x7,[sp, #0x10]
00a945bc	mov w8,w0
00a945c0	add x0,sp,#0x1c
00a945c4	add x1,sp,#0x18
00a945c8	mov w2,#0x1
00a945cc	mov w3,#0x1
00a945d0	mov x4,x23
00a945d4	mov x5,x24
00a945d8	mov x6,x25
00a945dc	str w8,[sp]
00a945e0	bl 0x00c399b0
00a945e4	ldrb w9,[sp, #0x18]
00a945e8	ldrb w8,[x20, x28]
00a945ec	orr w10,wzr,#0xffffff7f
00a945f0	asr w10,w10,w19
00a945f4	and w9,w9,#0x80
00a945f8	add x27,x27,#0x1
00a945fc	and w8,w10,w8
00a94600	lsr w9,w9,w19
00a94604	mov x19,x22
00a94608	orr w8,w9,w8
00a9460c	cmp x26,x27
00a94610	strb w8,[x20, x28]
00a94614	b.ne 0x00a94560
00a94618	ldp x29,x30,[sp, #0x70]
00a9461c	ldp x20,x19,[sp, #0x60]
00a94620	ldp x22,x21,[sp, #0x50]
00a94624	ldp x24,x23,[sp, #0x40]
00a94628	ldp x26,x25,[sp, #0x30]
00a9462c	ldp x28,x27,[sp, #0x20]
00a94630	mov w0,#0x1
00a94634	add sp,sp,#0x80
00a94638	ret
