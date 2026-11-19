; FUN_0088c464 @ 0088c464
0088c464	sub sp,sp,#0x70
0088c468	stp x29,x30,[sp, #0x30]
0088c46c	stp x24,x23,[sp, #0x40]
0088c470	stp x22,x21,[sp, #0x50]
0088c474	stp x20,x19,[sp, #0x60]
0088c478	add x29,sp,#0x30
0088c47c	mrs x22,tpidr_el0
0088c480	ldr x8,[x22, #0x28]
0088c484	stur x8,[x29, #-0x8]
0088c488	ldrb w8,[x1, #0x31]
0088c48c	tbz w8,#0x0,0x0088c4c0
0088c490	mov w8,wzr
0088c494	ldr x9,[x22, #0x28]
0088c498	ldur x10,[x29, #-0x8]
0088c49c	cmp x9,x10
0088c4a0	b.ne 0x0088c638
0088c4a4	mov w0,w8
0088c4a8	ldp x20,x19,[sp, #0x60]
0088c4ac	ldp x22,x21,[sp, #0x50]
0088c4b0	ldp x24,x23,[sp, #0x40]
0088c4b4	ldp x29,x30,[sp, #0x30]
0088c4b8	add sp,sp,#0x70
0088c4bc	ret
0088c4c0	ldr x8,[x0, #0xc18]
0088c4c4	ldr x9,[x0, #0xc20]
0088c4c8	cmp x8,x9
0088c4cc	mov w8,wzr
0088c4d0	b.eq 0x0088c494
0088c4d4	ldr x10,[x0, #0x138]
0088c4d8	cbz x10,0x0088c494
0088c4dc	lsl w8,w1,#0x3
0088c4e0	mov x11,#0x2d69
0088c4e4	lsr x10,x1,#0x20
0088c4e8	movk x11,#0xeb38, LSL #16
0088c4ec	add x8,x8,#0x8
0088c4f0	movk x11,#0xea08, LSL #32
0088c4f4	eor x8,x8,x10
0088c4f8	movk x11,#0x9ddf, LSL #48
0088c4fc	mul x8,x8,x11
0088c500	eor x10,x10,x8, LSR #0x2f
0088c504	eor x8,x10,x8
0088c508	mov x10,#0x959d
0088c50c	mul x8,x8,x11
0088c510	movk x10,#0xb8f4, LSL #16
0088c514	movk x10,#0xd34f, LSL #32
0088c518	movk x10,#0x949d, LSL #48
0088c51c	eor x8,x8,x8, LSR #0x2f
0088c520	mul x8,x8,x10
0088c524	ldrb w10,[x0, #0x140]
0088c528	lsr x11,x8,x10
0088c52c	ldr x10,[x0, #0x128]
0088c530	lsr x12,x11,#0x6
0088c534	ldr x12,[x10, x12, LSL #0x3]
0088c538	lsr x12,x12,x11
0088c53c	tbz w12,#0x0,0x0088c490
0088c540	ldr x13,[x0, #0x130]
0088c544	ldr x12,[x0, #0x110]
0088c548	mov w14,#0x28
0088c54c	sub x13,x13,#0x1
0088c550	mul x15,x11,x14
0088c554	ldr x15,[x12, x15#0x0]
0088c558	cmp x15,x1
0088c55c	b.eq 0x0088c57c
0088c560	add x11,x11,#0x1
0088c564	and x11,x11,x13
0088c568	lsr x15,x11,#0x6
0088c56c	ldr x15,[x10, x15, LSL #0x3]
0088c570	lsr x15,x15,x11
0088c574	tbnz w15,#0x0,0x0088c550
0088c578	b 0x0088c490
0088c57c	ldr x10,[x0, #0xc8]
0088c580	cbz x10,0x0088c5e4
0088c584	ldrb w10,[x0, #0xd0]
0088c588	lsr x10,x8,x10
0088c58c	ldr x8,[x0, #0xb8]
0088c590	lsr x11,x10,#0x6
0088c594	ldr x11,[x8, x11, LSL #0x3]
0088c598	lsr x11,x11,x10
0088c59c	tbz w11,#0x0,0x0088c5e4
0088c5a0	ldr x12,[x0, #0xc0]
0088c5a4	ldr x11,[x0, #0xa0]
0088c5a8	mov w13,#0x18
0088c5ac	sub x12,x12,#0x1
0088c5b0	madd x14,x10,x13,x11
0088c5b4	ldr x15,[x14]
0088c5b8	cmp x15,x1
0088c5bc	b.eq 0x0088c5dc
0088c5c0	add x10,x10,#0x1
0088c5c4	and x10,x10,x12
0088c5c8	lsr x14,x10,#0x6
0088c5cc	ldr x14,[x8, x14, LSL #0x3]
0088c5d0	lsr x14,x14,x10
0088c5d4	tbnz w14,#0x0,0x0088c5b0
0088c5d8	b 0x0088c5e4
0088c5dc	ldrb w8,[x14, #0xa]
0088c5e0	tbnz w8,#0x0,0x0088c490
0088c5e4	ldp q1,q0,[x9, #-0x20]!
0088c5e8	ldr x8,[x0]
0088c5ec	str x9,[x0, #0xc20]
0088c5f0	mov x21,x0
0088c5f4	mov x23,sp
0088c5f8	mov x24,x2
0088c5fc	stp q1,q0,[sp]
0088c600	mov x0,x8
0088c604	ldr x19,[sp, #0x10]
0088c608	ldrb w20,[sp, #0x18]
0088c60c	bl 0x008769d0
0088c610	mov w4,w0
0088c614	orr x2,x23,#0x4
0088c618	mov x0,x21
0088c61c	mov x1,x19
0088c620	mov w3,w20
0088c624	bl 0x00887138
0088c628	ldrb w8,[sp]
0088c62c	strb w8,[x24]
0088c630	mov w8,#0x1
0088c634	b 0x0088c494
0088c638	bl 0x00c2fec0
