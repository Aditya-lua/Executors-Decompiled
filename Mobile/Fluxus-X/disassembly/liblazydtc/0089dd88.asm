; FUN_0089dd88 @ 0089dd88
0089dd88	stp x29,x30,[sp, #-0x30]!
0089dd8c	str x21,[sp, #0x10]
0089dd90	stp x20,x19,[sp, #0x20]
0089dd94	mov x29,sp
0089dd98	ldp x9,x8,[x0, #0x20]
0089dd9c	mov x21,#0x7c15
0089dda0	movk x21,#0x7f4a, LSL #16
0089dda4	mov x20,x1
0089dda8	mov x19,x0
0089ddac	movk x21,#0x79b9, LSL #32
0089ddb0	add x10,x9,x9, LSL #0x1
0089ddb4	movk x21,#0x9e37, LSL #48
0089ddb8	cmp x8,x10, LSR #0x2
0089ddbc	b.cc 0x0089de30
0089ddc0	cbz x8,0x0089de24
0089ddc4	ldr x8,[x20]
0089ddc8	ldrb w11,[x19, #0x30]
0089ddcc	lsr x10,x8,#0x4
0089ddd0	eor x10,x10,x8, LSR #0x9
0089ddd4	mul x10,x10,x21
0089ddd8	lsr x11,x10,x11
0089dddc	ldr x10,[x19, #0x18]
0089dde0	lsr x12,x11,#0x6
0089dde4	ldr x12,[x10, x12, LSL #0x3]
0089dde8	lsr x12,x12,x11
0089ddec	tbz w12,#0x0,0x0089de24
0089ddf0	ldr x12,[x19]
0089ddf4	sub x13,x9,#0x1
0089ddf8	mov w14,#0x30
0089ddfc	mul x15,x11,x14
0089de00	ldr x15,[x12, x15#0x0]
0089de04	cmp x15,x8
0089de08	b.eq 0x0089de30
0089de0c	add x11,x11,#0x1
0089de10	and x11,x11,x13
0089de14	lsr x15,x11,#0x6
0089de18	ldr x15,[x10, x15, LSL #0x3]
0089de1c	lsr x15,x15,x11
0089de20	tbnz w15,#0x0,0x0089ddfc
0089de24	mov x0,x19
0089de28	bl 0x0089f75c
0089de2c	ldr x9,[x19, #0x20]
0089de30	ldr x10,[x20]
0089de34	ldrb w11,[x19, #0x30]
0089de38	ldr x12,[x19, #0x18]
0089de3c	lsr x8,x10,#0x4
0089de40	eor x8,x8,x10, LSR #0x9
0089de44	mul x8,x8,x21
0089de48	lsr x8,x8,x11
0089de4c	mov w11,#0x1
0089de50	lsr x13,x8,#0x6
0089de54	lsl x15,x11,x8
0089de58	ldr x11,[x19]
0089de5c	ldr x14,[x12, x13, LSL #0x3]
0089de60	tst x15,x14
0089de64	b.eq 0x0089dea0
0089de68	sub x9,x9,#0x1
0089de6c	mov w16,#0x30
0089de70	mov w17,#0x1
0089de74	mul x13,x8,x16
0089de78	ldr x13,[x11, x13#0x0]
0089de7c	cmp x13,x10
0089de80	b.eq 0x0089ded4
0089de84	add x8,x8,#0x1
0089de88	and x8,x8,x9
0089de8c	lsr x13,x8,#0x6
0089de90	lsl x15,x17,x8
0089de94	ldr x14,[x12, x13, LSL #0x3]
0089de98	tst x14,x15
0089de9c	b.ne 0x0089de74
0089dea0	mov w9,#0x30
0089dea4	movi v0.2D,#0x0
0089dea8	madd x9,x8,x9,x11
0089deac	orr x11,x14,x15
0089deb0	str x11,[x12, x13, LSL #0x3]
0089deb4	stur q0,[x9, #0x8]
0089deb8	stur q0,[x9, #0x18]
0089debc	str xzr,[x9, #0x28]
0089dec0	ldr x11,[x19, #0x28]
0089dec4	str x10,[x9]
0089dec8	add x9,x11,#0x1
0089decc	ldr x11,[x19]
0089ded0	str x9,[x19, #0x28]
0089ded4	mov w9,#0x30
0089ded8	madd x8,x8,x9,x11
0089dedc	add x0,x8,#0x8
0089dee0	ldp x20,x19,[sp, #0x20]
0089dee4	ldr x21,[sp, #0x10]
0089dee8	ldp x29,x30,[sp], #0x30
0089deec	ret
