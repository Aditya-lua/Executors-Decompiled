; FUN_0089a584 @ 0089a584
0089a584	stp x29,x30,[sp, #-0x20]!
0089a588	stp x20,x19,[sp, #0x10]
0089a58c	mov x29,sp
0089a590	mov x20,x1
0089a594	mov x19,x0
0089a598	bl 0x0089a9a8
0089a59c	ldr x8,[x20]
0089a5a0	mov x11,#0x2d69
0089a5a4	movk x11,#0xeb38, LSL #16
0089a5a8	lsl w9,w8,#0x3
0089a5ac	lsr x10,x8,#0x20
0089a5b0	movk x11,#0xea08, LSL #32
0089a5b4	movk x11,#0x9ddf, LSL #48
0089a5b8	add x9,x9,#0x8
0089a5bc	eor x9,x9,x10
0089a5c0	mul x9,x9,x11
0089a5c4	eor x10,x10,x9, LSR #0x2f
0089a5c8	eor x9,x10,x9
0089a5cc	mov x10,#0x959d
0089a5d0	mul x9,x9,x11
0089a5d4	movk x10,#0xb8f4, LSL #16
0089a5d8	ldr x11,[x19, #0x18]
0089a5dc	movk x10,#0xd34f, LSL #32
0089a5e0	movk x10,#0x949d, LSL #48
0089a5e4	eor x9,x9,x9, LSR #0x2f
0089a5e8	mul x9,x9,x10
0089a5ec	ldrb w10,[x19, #0x30]
0089a5f0	lsr x9,x9,x10
0089a5f4	mov w10,#0x1
0089a5f8	lsr x12,x9,#0x6
0089a5fc	lsl x14,x10,x9
0089a600	ldr x10,[x19]
0089a604	ldr x13,[x11, x12, LSL #0x3]
0089a608	tst x14,x13
0089a60c	b.eq 0x0089a648
0089a610	ldr x12,[x19, #0x20]
0089a614	mov w16,#0x1
0089a618	sub x15,x12,#0x1
0089a61c	lsl x12,x9,#0x4
0089a620	ldr x12,[x10, x12#0x0]
0089a624	cmp x12,x8
0089a628	b.eq 0x0089a66c
0089a62c	add x9,x9,#0x1
0089a630	and x9,x9,x15
0089a634	lsr x12,x9,#0x6
0089a638	lsl x14,x16,x9
0089a63c	ldr x13,[x11, x12, LSL #0x3]
0089a640	tst x13,x14
0089a644	b.ne 0x0089a61c
0089a648	add x10,x10,x9, LSL #0x4
0089a64c	orr x13,x13,x14
0089a650	str x13,[x11, x12, LSL #0x3]
0089a654	strb wzr,[x10, #0x8]
0089a658	ldr x11,[x19, #0x28]
0089a65c	str x8,[x10]
0089a660	ldr x10,[x19]
0089a664	add x8,x11,#0x1
0089a668	str x8,[x19, #0x28]
0089a66c	add x8,x10,x9, LSL #0x4
0089a670	add x0,x8,#0x8
0089a674	ldp x20,x19,[sp, #0x10]
0089a678	ldp x29,x30,[sp], #0x20
0089a67c	ret
