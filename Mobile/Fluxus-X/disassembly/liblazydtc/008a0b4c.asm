; FUN_008a0b4c @ 008a0b4c
008a0b4c	ldp x9,x8,[x0, #0x20]
008a0b50	add x10,x9,x9, LSL #0x1
008a0b54	cmp x8,x10, LSR #0x2
008a0b58	b.cs 0x008a0b60
008a0b5c	ret
008a0b60	cbz x8,0x008a0c00
008a0b64	ldr x8,[x1]
008a0b68	mov x12,#0x2d69
008a0b6c	movk x12,#0xeb38, LSL #16
008a0b70	lsl w10,w8,#0x3
008a0b74	lsr x11,x8,#0x20
008a0b78	movk x12,#0xea08, LSL #32
008a0b7c	movk x12,#0x9ddf, LSL #48
008a0b80	add x10,x10,#0x8
008a0b84	eor x10,x10,x11
008a0b88	mul x10,x10,x12
008a0b8c	eor x11,x11,x10, LSR #0x2f
008a0b90	eor x10,x11,x10
008a0b94	mov x11,#0x959d
008a0b98	mul x10,x10,x12
008a0b9c	movk x11,#0xb8f4, LSL #16
008a0ba0	movk x11,#0xd34f, LSL #32
008a0ba4	movk x11,#0x949d, LSL #48
008a0ba8	eor x10,x10,x10, LSR #0x2f
008a0bac	mul x10,x10,x11
008a0bb0	ldrb w11,[x0, #0x30]
008a0bb4	lsr x11,x10,x11
008a0bb8	ldr x10,[x0, #0x18]
008a0bbc	lsr x12,x11,#0x6
008a0bc0	ldr x12,[x10, x12, LSL #0x3]
008a0bc4	lsr x12,x12,x11
008a0bc8	tbz w12,#0x0,0x008a0c00
008a0bcc	ldr x12,[x0]
008a0bd0	sub x9,x9,#0x1
008a0bd4	mov w13,#0x30
008a0bd8	mul x14,x11,x13
008a0bdc	ldr x14,[x12, x14#0x0]
008a0be0	cmp x14,x8
008a0be4	b.eq 0x008a0b5c
008a0be8	add x11,x11,#0x1
008a0bec	and x11,x11,x9
008a0bf0	lsr x14,x11,#0x6
008a0bf4	ldr x14,[x10, x14, LSL #0x3]
008a0bf8	lsr x14,x14,x11
008a0bfc	tbnz w14,#0x0,0x008a0bd8
008a0c00	b 0x008a0c04
008a0c04	stp x29,x30,[sp, #-0x50]!
008a0c08	str x25,[sp, #0x10]
008a0c0c	stp x24,x23,[sp, #0x20]
008a0c10	stp x22,x21,[sp, #0x30]
008a0c14	stp x20,x19,[sp, #0x40]
008a0c18	mov x29,sp
008a0c1c	ldr x9,[x0, #0x20]
008a0c20	mov w8,#0x10
008a0c24	mov x19,x0
008a0c28	lsl x10,x9,#0x1
008a0c2c	cmp x9,#0x0
008a0c30	csel x23,x8,x10,eq
008a0c34	cbz x23,0x008a0c88
008a0c38	cmp x23,#0x40
008a0c3c	mov w22,#0x40
008a0c40	csel x8,x23,x22,hi
008a0c44	lsr x24,x8,#0x6
008a0c48	lsl x21,x24,#0x3
008a0c4c	mov x0,x21
008a0c50	bl 0x00c2fed0
008a0c54	mov w1,wzr
008a0c58	mov x2,x21
008a0c5c	mov x20,x0
008a0c60	bl 0x00c301c0
008a0c64	add x8,x23,x23, LSL #0x1
008a0c68	lsl x0,x8,#0x4
008a0c6c	bl 0x00c2fed0
008a0c70	rbit x8,x23
008a0c74	clz x8,x8
008a0c78	sub w25,w22,w8
008a0c7c	ldp x8,x21,[x19, #0x10]
008a0c80	cbnz x8,0x008a0ca0
008a0c84	b 0x008a0e18
008a0c88	mov x24,xzr
008a0c8c	mov x20,xzr
008a0c90	mov x0,xzr
008a0c94	mov w25,#0x40
008a0c98	ldp x8,x21,[x19, #0x10]
008a0c9c	cbz x8,0x008a0e18
008a0ca0	ldr x10,[x21]
008a0ca4	cbz x10,0x008a0cb0
008a0ca8	mov x9,xzr
008a0cac	b 0x008a0cd0
008a0cb0	mov x9,xzr
008a0cb4	add x11,x21,#0x8
008a0cb8	sub x12,x8,#0x1
008a0cbc	cmp x12,x9
008a0cc0	b.eq 0x008a0e18
008a0cc4	ldr x10,[x11, x9, LSL #0x3]
008a0cc8	add x9,x9,#0x1
008a0ccc	cbz x10,0x008a0cbc
008a0cd0	rbit x11,x10
008a0cd4	mov x16,#0x959d
008a0cd8	ldr x22,[x19]
008a0cdc	movk x16,#0xb8f4, LSL #16
008a0ce0	and x13,x25,#0xff
008a0ce4	add x14,x21,#0x8
008a0ce8	clz x12,x11
008a0cec	mov x11,#0x2d69
008a0cf0	movk x16,#0xd34f, LSL #32
008a0cf4	movk x11,#0xeb38, LSL #16
008a0cf8	orr x1,x12,x9, LSL #0x6
008a0cfc	sub x12,x23,#0x1
008a0d00	movk x11,#0xea08, LSL #32
008a0d04	mov w15,#0x30
008a0d08	movk x16,#0x949d, LSL #48
008a0d0c	movk x11,#0x9ddf, LSL #48
008a0d10	mov w17,#0x1
008a0d14	madd x2,x1,x15,x22
008a0d18	ldr x6,[x2]
008a0d1c	lsl w3,w6,#0x3
008a0d20	lsr x4,x6,#0x20
008a0d24	add x3,x3,#0x8
008a0d28	eor x3,x3,x4
008a0d2c	mul x3,x3,x11
008a0d30	eor x4,x4,x3, LSR #0x2f
008a0d34	eor x3,x4,x3
008a0d38	mul x3,x3,x11
008a0d3c	eor x3,x3,x3, LSR #0x2f
008a0d40	mul x3,x3,x16
008a0d44	lsr x3,x3,x13
008a0d48	lsr x4,x3,#0x6
008a0d4c	lsl x5,x17,x3
008a0d50	ldr x7,[x20, x4, LSL #0x3]
008a0d54	tst x5,x7
008a0d58	b.eq 0x008a0d98
008a0d5c	mul x4,x3,x15
008a0d60	ldr x4,[x0, x4#0x0]
008a0d64	cmp x4,x6
008a0d68	b.eq 0x008a0d8c
008a0d6c	add x3,x3,#0x1
008a0d70	and x3,x3,x12
008a0d74	lsr x4,x3,#0x6
008a0d78	lsl x5,x17,x3
008a0d7c	ldr x7,[x20, x4, LSL #0x3]
008a0d80	tst x7,x5
008a0d84	b.ne 0x008a0d5c
008a0d88	b 0x008a0d94
008a0d8c	lsr x4,x3,#0x6
008a0d90	lsl x5,x17,x3
008a0d94	ldr x7,[x20, x4, LSL #0x3]
008a0d98	nop
008a0d9c	madd x3,x3,x15,x0
008a0da0	orr x5,x7,x5
008a0da4	str x5,[x20, x4, LSL #0x3]
008a0da8	ldp q1,q0,[x2, #0x10]
008a0dac	ldr q2,[x2]
008a0db0	sub x2,x10,#0x1
008a0db4	ands x10,x2,x10
008a0db8	stp q1,q0,[x3, #0x10]
008a0dbc	str q2,[x3]
008a0dc0	b.ne 0x008a0dec
008a0dc4	add x10,x9,#0x1
008a0dc8	cmp x8,x10
008a0dcc	csinc x2,x8,x9,hi
008a0dd0	add x3,x9,#0x1
008a0dd4	cmp x3,x8
008a0dd8	b.cs 0x008a0e08
008a0ddc	ldr x10,[x14, x9, LSL #0x3]
008a0de0	mov x9,x3
008a0de4	cbz x10,0x008a0dd0
008a0de8	mov x9,x3
008a0dec	rbit x1,x10
008a0df0	clz x1,x1
008a0df4	orr x1,x1,x9, LSL #0x6
008a0df8	cbnz x10,0x008a0d14
008a0dfc	cmp x9,x8
008a0e00	b.ne 0x008a0d14
008a0e04	b 0x008a0e1c
008a0e08	mov x10,xzr
008a0e0c	mov x9,x2
008a0e10	cbz x10,0x008a0dfc
008a0e14	b 0x008a0d14
008a0e18	ldr x22,[x19]
008a0e1c	stp x0,xzr,[x19]
008a0e20	mov x0,xzr
008a0e24	stp xzr,xzr,[x19, #0x10]
008a0e28	bl 0x00c301d0
008a0e2c	mov x0,xzr
008a0e30	stp x24,x20,[x19, #0x10]
008a0e34	str x23,[x19, #0x8]
008a0e38	bl 0x00c301d0
008a0e3c	mov x0,xzr
008a0e40	bl 0x00c301d0
008a0e44	str x23,[x19, #0x20]
008a0e48	strb w25,[x19, #0x30]
008a0e4c	cbz x22,0x008a0e6c
008a0e50	mov x0,x22
008a0e54	bl 0x00c301d0
008a0e58	mov x0,x21
008a0e5c	bl 0x00c301d0
008a0e60	mov x0,xzr
008a0e64	bl 0x00c301d0
008a0e68	mov x21,xzr
008a0e6c	mov x0,x21
008a0e70	ldp x20,x19,[sp, #0x40]
008a0e74	ldr x25,[sp, #0x10]
008a0e78	ldp x22,x21,[sp, #0x30]
008a0e7c	ldp x24,x23,[sp, #0x20]
008a0e80	ldp x29,x30,[sp], #0x50
008a0e84	b 0x00c301d0
