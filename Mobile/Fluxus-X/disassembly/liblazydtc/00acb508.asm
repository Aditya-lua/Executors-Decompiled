; RC2_cfb64_encrypt @ 00acb508
00acb508	sub sp,sp,#0x60
00acb50c	stp x24,x23,[sp, #0x20]
00acb510	stp x22,x21,[sp, #0x30]
00acb514	stp x20,x19,[sp, #0x40]
00acb518	stp x29,x30,[sp, #0x50]
00acb51c	str x25,[sp, #0x10]
00acb520	ldr w25,[x5]
00acb524	mov x19,x5
00acb528	mov x20,x4
00acb52c	mov x21,x3
00acb530	mov x22,x2
00acb534	mov x23,x1
00acb538	mov x24,x0
00acb53c	add x29,sp,#0x50
00acb540	cbz w6,0x00acb604
00acb544	cbz x22,0x00acb6c0
00acb548	cbnz w25,0x00acb5d8
00acb54c	ldrb w8,[x20]
00acb550	ldrb w9,[x20, #0x1]
00acb554	ldrb w10,[x20, #0x2]
00acb558	ldrb w11,[x20, #0x3]
00acb55c	mov x0,sp
00acb560	bfm x8,x9,#0x38,#0x7
00acb564	bfm x8,x10,#0x30,#0x7
00acb568	bfm x8,x11,#0x28,#0x7
00acb56c	str x8,[sp]
00acb570	ldrb w8,[x20, #0x4]
00acb574	ldrb w9,[x20, #0x5]
00acb578	ldrb w10,[x20, #0x6]
00acb57c	ldrb w11,[x20, #0x7]
00acb580	mov x1,x21
00acb584	bfm x8,x9,#0x38,#0x7
00acb588	bfm x8,x10,#0x30,#0x7
00acb58c	bfm x8,x11,#0x28,#0x7
00acb590	str x8,[sp, #0x8]
00acb594	bl 0x00c3f9f0
00acb598	ldr x8,[sp]
00acb59c	lsr x9,x8,#0x8
00acb5a0	strb w8,[x20]
00acb5a4	strb w9,[x20, #0x1]
00acb5a8	lsr x9,x8,#0x10
00acb5ac	lsr x8,x8,#0x18
00acb5b0	strb w9,[x20, #0x2]
00acb5b4	strb w8,[x20, #0x3]
00acb5b8	ldr x8,[sp, #0x8]
00acb5bc	lsr x9,x8,#0x8
00acb5c0	strb w8,[x20, #0x4]
00acb5c4	strb w9,[x20, #0x5]
00acb5c8	lsr x9,x8,#0x10
00acb5cc	lsr x8,x8,#0x18
00acb5d0	strb w9,[x20, #0x6]
00acb5d4	strb w8,[x20, #0x7]
00acb5d8	sxtw x9,w25
00acb5dc	ldrb w8,[x24], #0x1
00acb5e0	ldrb w10,[x20, x9]
00acb5e4	add w11,w25,#0x1
00acb5e8	subs x22,x22,#0x1
00acb5ec	and w25,w11,#0x7
00acb5f0	eor w8,w10,w8
00acb5f4	strb w8,[x23], #0x1
00acb5f8	strb w8,[x20, x9]
00acb5fc	b.ne 0x00acb548
00acb600	b 0x00acb6c0
00acb604	cbz x22,0x00acb6c0
00acb608	cbnz w25,0x00acb698
00acb60c	ldrb w8,[x20]
00acb610	ldrb w9,[x20, #0x1]
00acb614	ldrb w10,[x20, #0x2]
00acb618	ldrb w11,[x20, #0x3]
00acb61c	mov x0,sp
00acb620	bfm x8,x9,#0x38,#0x7
00acb624	bfm x8,x10,#0x30,#0x7
00acb628	bfm x8,x11,#0x28,#0x7
00acb62c	str x8,[sp]
00acb630	ldrb w8,[x20, #0x4]
00acb634	ldrb w9,[x20, #0x5]
00acb638	ldrb w10,[x20, #0x6]
00acb63c	ldrb w11,[x20, #0x7]
00acb640	mov x1,x21
00acb644	bfm x8,x9,#0x38,#0x7
00acb648	bfm x8,x10,#0x30,#0x7
00acb64c	bfm x8,x11,#0x28,#0x7
00acb650	str x8,[sp, #0x8]
00acb654	bl 0x00c3f9f0
00acb658	ldr x8,[sp]
00acb65c	lsr x9,x8,#0x8
00acb660	strb w8,[x20]
00acb664	strb w9,[x20, #0x1]
00acb668	lsr x9,x8,#0x10
00acb66c	lsr x8,x8,#0x18
00acb670	strb w9,[x20, #0x2]
00acb674	strb w8,[x20, #0x3]
00acb678	ldr x8,[sp, #0x8]
00acb67c	lsr x9,x8,#0x8
00acb680	strb w8,[x20, #0x4]
00acb684	strb w9,[x20, #0x5]
00acb688	lsr x9,x8,#0x10
00acb68c	lsr x8,x8,#0x18
00acb690	strb w9,[x20, #0x6]
00acb694	strb w8,[x20, #0x7]
00acb698	sxtw x9,w25
00acb69c	ldrb w8,[x24], #0x1
00acb6a0	ldrb w10,[x20, x9]
00acb6a4	add w11,w25,#0x1
00acb6a8	subs x22,x22,#0x1
00acb6ac	strb w8,[x20, x9]
00acb6b0	eor w8,w10,w8
00acb6b4	strb w8,[x23], #0x1
00acb6b8	and w25,w11,#0x7
00acb6bc	b.ne 0x00acb608
00acb6c0	str w25,[x19]
00acb6c4	ldp x29,x30,[sp, #0x50]
00acb6c8	ldp x20,x19,[sp, #0x40]
00acb6cc	ldp x22,x21,[sp, #0x30]
00acb6d0	ldp x24,x23,[sp, #0x20]
00acb6d4	ldr x25,[sp, #0x10]
00acb6d8	add sp,sp,#0x60
00acb6dc	ret
