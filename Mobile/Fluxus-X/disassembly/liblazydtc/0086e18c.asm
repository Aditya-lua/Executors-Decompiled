; FUN_0086e18c @ 0086e18c
0086e18c	stp x29,x30,[sp, #-0x30]!
0086e190	str x21,[sp, #0x10]
0086e194	stp x20,x19,[sp, #0x20]
0086e198	mov x29,sp
0086e19c	ldp x8,x9,[x0, #0x20]
0086e1a0	mov x21,#0x7c15
0086e1a4	movk x21,#0x7f4a, LSL #16
0086e1a8	mov x20,x1
0086e1ac	mov x19,x0
0086e1b0	movk x21,#0x79b9, LSL #32
0086e1b4	add x10,x8,x8, LSL #0x1
0086e1b8	movk x21,#0x9e37, LSL #48
0086e1bc	cmp x9,x10, LSR #0x2
0086e1c0	b.cc 0x0086e230
0086e1c4	cbz x9,0x0086e224
0086e1c8	ldr x9,[x20]
0086e1cc	ldrb w11,[x19, #0x30]
0086e1d0	lsr x10,x9,#0x4
0086e1d4	eor x10,x10,x9, LSR #0x9
0086e1d8	mul x10,x10,x21
0086e1dc	lsr x11,x10,x11
0086e1e0	ldr x10,[x19, #0x18]
0086e1e4	lsr x12,x11,#0x6
0086e1e8	ldr x12,[x10, x12, LSL #0x3]
0086e1ec	lsr x12,x12,x11
0086e1f0	tbz w12,#0x0,0x0086e224
0086e1f4	ldr x12,[x19]
0086e1f8	sub x13,x8,#0x1
0086e1fc	lsl x14,x11,#0x4
0086e200	ldr x14,[x12, x14#0x0]
0086e204	cmp x14,x9
0086e208	b.eq 0x0086e230
0086e20c	add x11,x11,#0x1
0086e210	and x11,x11,x13
0086e214	lsr x14,x11,#0x6
0086e218	ldr x14,[x10, x14, LSL #0x3]
0086e21c	lsr x14,x14,x11
0086e220	tbnz w14,#0x0,0x0086e1fc
0086e224	mov x0,x19
0086e228	bl 0x00872a50
0086e22c	ldr x8,[x19, #0x20]
0086e230	ldr x10,[x20]
0086e234	ldrb w11,[x19, #0x30]
0086e238	ldr x12,[x19, #0x18]
0086e23c	lsr x9,x10,#0x4
0086e240	eor x9,x9,x10, LSR #0x9
0086e244	mul x9,x9,x21
0086e248	lsr x9,x9,x11
0086e24c	mov w11,#0x1
0086e250	lsr x13,x9,#0x6
0086e254	lsl x15,x11,x9
0086e258	ldr x11,[x19]
0086e25c	ldr x14,[x12, x13, LSL #0x3]
0086e260	tst x15,x14
0086e264	b.eq 0x0086e29c
0086e268	sub x8,x8,#0x1
0086e26c	mov w16,#0x1
0086e270	lsl x13,x9,#0x4
0086e274	ldr x13,[x11, x13#0x0]
0086e278	cmp x13,x10
0086e27c	b.eq 0x0086e2b8
0086e280	add x9,x9,#0x1
0086e284	and x9,x9,x8
0086e288	lsr x13,x9,#0x6
0086e28c	lsl x15,x16,x9
0086e290	ldr x14,[x12, x13, LSL #0x3]
0086e294	tst x14,x15
0086e298	b.ne 0x0086e270
0086e29c	orr x8,x14,x15
0086e2a0	str x8,[x12, x13, LSL #0x3]
0086e2a4	add x8,x11,x9, LSL #0x4
0086e2a8	ldr x12,[x19, #0x28]
0086e2ac	stp x10,xzr,[x8]
0086e2b0	add x8,x12,#0x1
0086e2b4	str x8,[x19, #0x28]
0086e2b8	add x8,x11,x9, LSL #0x4
0086e2bc	add x0,x8,#0x8
0086e2c0	ldp x20,x19,[sp, #0x20]
0086e2c4	ldr x21,[sp, #0x10]
0086e2c8	ldp x29,x30,[sp], #0x30
0086e2cc	ret
