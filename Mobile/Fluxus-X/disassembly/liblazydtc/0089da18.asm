; FUN_0089da18 @ 0089da18
0089da18	ldr x8,[x0, #0x28]
0089da1c	cbz x8,0x0089dac8
0089da20	ldr x8,[x1]
0089da24	mov x11,#0x2d69
0089da28	movk x11,#0xeb38, LSL #16
0089da2c	lsl w9,w8,#0x3
0089da30	lsr x10,x8,#0x20
0089da34	movk x11,#0xea08, LSL #32
0089da38	movk x11,#0x9ddf, LSL #48
0089da3c	add x9,x9,#0x8
0089da40	eor x9,x9,x10
0089da44	mul x9,x9,x11
0089da48	eor x10,x10,x9, LSR #0x2f
0089da4c	eor x9,x10,x9
0089da50	mov x10,#0x959d
0089da54	mul x9,x9,x11
0089da58	movk x10,#0xb8f4, LSL #16
0089da5c	movk x10,#0xd34f, LSL #32
0089da60	movk x10,#0x949d, LSL #48
0089da64	eor x9,x9,x9, LSR #0x2f
0089da68	mul x9,x9,x10
0089da6c	ldrb w10,[x0, #0x30]
0089da70	lsr x9,x9,x10
0089da74	ldr x10,[x0, #0x18]
0089da78	lsr x11,x9,#0x6
0089da7c	ldr x11,[x10, x11, LSL #0x3]
0089da80	lsr x11,x11,x9
0089da84	tbz w11,#0x0,0x0089dabc
0089da88	ldr x12,[x0, #0x20]
0089da8c	ldr x11,[x0]
0089da90	sub x12,x12,#0x1
0089da94	lsl x13,x9,#0x4
0089da98	ldr x13,[x11, x13#0x0]
0089da9c	cmp x13,x8
0089daa0	b.eq 0x0089dac4
0089daa4	add x9,x9,#0x1
0089daa8	and x9,x9,x12
0089daac	lsr x13,x9,#0x6
0089dab0	ldr x13,[x10, x13, LSL #0x3]
0089dab4	lsr x13,x13,x9
0089dab8	tbnz w13,#0x0,0x0089da94
0089dabc	mov x8,xzr
0089dac0	b 0x0089dac8
0089dac4	add x8,x11,x9, LSL #0x4
0089dac8	add x9,x8,#0x8
0089dacc	cmp x8,#0x0
0089dad0	csel x0,xzr,x9,eq
0089dad4	ret
