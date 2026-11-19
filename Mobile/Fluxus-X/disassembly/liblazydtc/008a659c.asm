; FUN_008a659c @ 008a659c
008a659c	stp x29,x30,[sp, #-0x20]!
008a65a0	stp x20,x19,[sp, #0x10]
008a65a4	mov x29,sp
008a65a8	mov x20,x1
008a65ac	mov x19,x0
008a65b0	bl 0x008a6cb0
008a65b4	ldr x8,[x20]
008a65b8	mov x11,#0x2d69
008a65bc	movk x11,#0xeb38, LSL #16
008a65c0	lsl w9,w8,#0x3
008a65c4	lsr x10,x8,#0x20
008a65c8	movk x11,#0xea08, LSL #32
008a65cc	movk x11,#0x9ddf, LSL #48
008a65d0	add x9,x9,#0x8
008a65d4	eor x9,x9,x10
008a65d8	mul x9,x9,x11
008a65dc	eor x10,x10,x9, LSR #0x2f
008a65e0	eor x9,x10,x9
008a65e4	mov x10,#0x959d
008a65e8	mul x9,x9,x11
008a65ec	movk x10,#0xb8f4, LSL #16
008a65f0	ldr x11,[x19, #0x18]
008a65f4	movk x10,#0xd34f, LSL #32
008a65f8	movk x10,#0x949d, LSL #48
008a65fc	eor x9,x9,x9, LSR #0x2f
008a6600	mul x9,x9,x10
008a6604	ldrb w10,[x19, #0x30]
008a6608	lsr x9,x9,x10
008a660c	mov w10,#0x1
008a6610	lsr x12,x9,#0x6
008a6614	lsl x14,x10,x9
008a6618	ldr x10,[x19]
008a661c	ldr x13,[x11, x12, LSL #0x3]
008a6620	tst x14,x13
008a6624	b.eq 0x008a6660
008a6628	ldr x12,[x19, #0x20]
008a662c	mov w16,#0x1
008a6630	sub x15,x12,#0x1
008a6634	lsl x12,x9,#0x4
008a6638	ldr x12,[x10, x12#0x0]
008a663c	cmp x12,x8
008a6640	b.eq 0x008a667c
008a6644	add x9,x9,#0x1
008a6648	and x9,x9,x15
008a664c	lsr x12,x9,#0x6
008a6650	lsl x14,x16,x9
008a6654	ldr x13,[x11, x12, LSL #0x3]
008a6658	tst x13,x14
008a665c	b.ne 0x008a6634
008a6660	orr x13,x13,x14
008a6664	str x13,[x11, x12, LSL #0x3]
008a6668	add x11,x10,x9, LSL #0x4
008a666c	ldr x12,[x19, #0x28]
008a6670	stp x8,xzr,[x11]
008a6674	add x8,x12,#0x1
008a6678	str x8,[x19, #0x28]
008a667c	add x8,x10,x9, LSL #0x4
008a6680	add x0,x8,#0x8
008a6684	ldp x20,x19,[sp, #0x10]
008a6688	ldp x29,x30,[sp], #0x20
008a668c	ret
