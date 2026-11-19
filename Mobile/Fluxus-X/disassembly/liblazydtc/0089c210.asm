; FUN_0089c210 @ 0089c210
0089c210	ldr x8,[x0, #0x28]
0089c214	cbz x8,0x0089c2b8
0089c218	ldr x8,[x1]
0089c21c	mov x11,#0x2d69
0089c220	movk x11,#0xeb38, LSL #16
0089c224	lsl w9,w8,#0x3
0089c228	lsr x10,x8,#0x20
0089c22c	movk x11,#0xea08, LSL #32
0089c230	movk x11,#0x9ddf, LSL #48
0089c234	add x9,x9,#0x8
0089c238	eor x9,x9,x10
0089c23c	mul x9,x9,x11
0089c240	eor x10,x10,x9, LSR #0x2f
0089c244	eor x9,x10,x9
0089c248	mov x10,#0x959d
0089c24c	mul x9,x9,x11
0089c250	movk x10,#0xb8f4, LSL #16
0089c254	movk x10,#0xd34f, LSL #32
0089c258	movk x10,#0x949d, LSL #48
0089c25c	eor x9,x9,x9, LSR #0x2f
0089c260	mul x9,x9,x10
0089c264	ldrb w10,[x0, #0x30]
0089c268	lsr x10,x9,x10
0089c26c	ldr x9,[x0, #0x18]
0089c270	lsr x11,x10,#0x6
0089c274	ldr x11,[x9, x11, LSL #0x3]
0089c278	lsr x11,x11,x10
0089c27c	tbz w11,#0x0,0x0089c2b8
0089c280	ldr x12,[x0, #0x20]
0089c284	ldr x11,[x0]
0089c288	mov w13,#0x30
0089c28c	sub x12,x12,#0x1
0089c290	madd x14,x10,x13,x11
0089c294	ldr x15,[x14]
0089c298	cmp x15,x8
0089c29c	b.eq 0x0089c2bc
0089c2a0	add x10,x10,#0x1
0089c2a4	and x10,x10,x12
0089c2a8	lsr x14,x10,#0x6
0089c2ac	ldr x14,[x9, x14, LSL #0x3]
0089c2b0	lsr x14,x14,x10
0089c2b4	tbnz w14,#0x0,0x0089c290
0089c2b8	mov x14,xzr
0089c2bc	add x8,x14,#0x8
0089c2c0	cmp x14,#0x0
0089c2c4	csel x0,xzr,x8,eq
0089c2c8	ret
