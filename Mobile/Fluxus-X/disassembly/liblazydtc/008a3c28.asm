; FUN_008a3c28 @ 008a3c28
008a3c28	stp x29,x30,[sp, #-0x30]!
008a3c2c	stp x22,x21,[sp, #0x10]
008a3c30	stp x20,x19,[sp, #0x20]
008a3c34	mov x29,sp
008a3c38	ldp x8,x9,[x0, #0x20]
008a3c3c	mov x22,#0xe5b9
008a3c40	mov x21,#0x7c15
008a3c44	movk x22,#0x1ce4, LSL #16
008a3c48	mov x20,x1
008a3c4c	movk x21,#0x7f4a, LSL #16
008a3c50	movk x22,#0x476d, LSL #32
008a3c54	mov x19,x0
008a3c58	add x10,x8,x8, LSL #0x1
008a3c5c	movk x21,#0x79b9, LSL #32
008a3c60	movk x22,#0xbf58, LSL #48
008a3c64	movk x21,#0x9e37, LSL #48
008a3c68	cmp x9,x10, LSR #0x2
008a3c6c	b.cc 0x008a3cec
008a3c70	cbz x9,0x008a3ce0
008a3c74	ldp x9,x10,[x20]
008a3c78	mul x11,x9,x22
008a3c7c	lsr x12,x10,#0x4
008a3c80	eor x12,x12,x10, LSR #0x9
008a3c84	eor x12,x12,x11, LSR #0x1f
008a3c88	eor x11,x12,x11
008a3c8c	ldrb w12,[x19, #0x30]
008a3c90	mul x11,x11,x21
008a3c94	lsr x12,x11,x12
008a3c98	ldr x11,[x19, #0x18]
008a3c9c	lsr x13,x12,#0x6
008a3ca0	ldr x13,[x11, x13, LSL #0x3]
008a3ca4	lsr x13,x13,x12
008a3ca8	tbz w13,#0x0,0x008a3ce0
008a3cac	ldr x13,[x19]
008a3cb0	sub x14,x8,#0x1
008a3cb4	add x15,x13,x12, LSL #0x4
008a3cb8	ldp x16,x15,[x15]
008a3cbc	cmp x16,x9
008a3cc0	ccmp x15,x10,#0x0,eq
008a3cc4	b.eq 0x008a3cec
008a3cc8	add x12,x12,#0x1
008a3ccc	and x12,x12,x14
008a3cd0	lsr x15,x12,#0x6
008a3cd4	ldr x15,[x11, x15, LSL #0x3]
008a3cd8	lsr x15,x15,x12
008a3cdc	tbnz w15,#0x0,0x008a3cb4
008a3ce0	mov x0,x19
008a3ce4	bl 0x008a3d9c
008a3ce8	ldr x8,[x19, #0x20]
008a3cec	ldp x12,x13,[x20]
008a3cf0	ldr x11,[x19, #0x18]
008a3cf4	mul x9,x12,x22
008a3cf8	lsr x10,x13,#0x9
008a3cfc	eor x10,x10,x13, LSR #0x4
008a3d00	eor x10,x10,x9, LSR #0x1f
008a3d04	eor x9,x10,x9
008a3d08	ldrb w10,[x19, #0x30]
008a3d0c	mul x9,x9,x21
008a3d10	lsr x9,x9,x10
008a3d14	mov w10,#0x1
008a3d18	lsr x14,x9,#0x6
008a3d1c	lsl x16,x10,x9
008a3d20	ldr x10,[x19]
008a3d24	ldr x15,[x11, x14, LSL #0x3]
008a3d28	tst x16,x15
008a3d2c	b.eq 0x008a3d68
008a3d30	sub x8,x8,#0x1
008a3d34	mov w17,#0x1
008a3d38	add x14,x10,x9, LSL #0x4
008a3d3c	ldp x15,x14,[x14]
008a3d40	cmp x15,x12
008a3d44	ccmp x14,x13,#0x0,eq
008a3d48	b.eq 0x008a3d88
008a3d4c	add x9,x9,#0x1
008a3d50	and x9,x9,x8
008a3d54	lsr x14,x9,#0x6
008a3d58	lsl x16,x17,x9
008a3d5c	ldr x15,[x11, x14, LSL #0x3]
008a3d60	tst x15,x16
008a3d64	b.ne 0x008a3d38
008a3d68	orr x8,x15,x16
008a3d6c	str x8,[x11, x14, LSL #0x3]
008a3d70	ldr q0,[x20]
008a3d74	str q0,[x10,x9, lsl #4]
008a3d78	ldr x8,[x19, #0x28]
008a3d7c	ldr x10,[x19]
008a3d80	add x8,x8,#0x1
008a3d84	str x8,[x19, #0x28]
008a3d88	add x0,x10,x9, LSL #0x4
008a3d8c	ldp x20,x19,[sp, #0x20]
008a3d90	ldp x22,x21,[sp, #0x10]
008a3d94	ldp x29,x30,[sp], #0x30
008a3d98	ret
