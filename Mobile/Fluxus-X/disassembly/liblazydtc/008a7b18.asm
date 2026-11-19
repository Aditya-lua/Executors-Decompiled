; FUN_008a7b18 @ 008a7b18
008a7b18	ldp x9,x8,[x0, #0x20]
008a7b1c	add x10,x9,x9, LSL #0x1
008a7b20	cmp x8,x10, LSR #0x2
008a7b24	b.cs 0x008a7b2c
008a7b28	ret
008a7b2c	cbz x8,0x008a7bc8
008a7b30	ldr x8,[x1]
008a7b34	mov x12,#0x2d69
008a7b38	movk x12,#0xeb38, LSL #16
008a7b3c	lsl w10,w8,#0x3
008a7b40	lsr x11,x8,#0x20
008a7b44	movk x12,#0xea08, LSL #32
008a7b48	movk x12,#0x9ddf, LSL #48
008a7b4c	add x10,x10,#0x8
008a7b50	eor x10,x10,x11
008a7b54	mul x10,x10,x12
008a7b58	eor x11,x11,x10, LSR #0x2f
008a7b5c	eor x10,x11,x10
008a7b60	mov x11,#0x959d
008a7b64	mul x10,x10,x12
008a7b68	movk x11,#0xb8f4, LSL #16
008a7b6c	movk x11,#0xd34f, LSL #32
008a7b70	movk x11,#0x949d, LSL #48
008a7b74	eor x10,x10,x10, LSR #0x2f
008a7b78	mul x10,x10,x11
008a7b7c	ldrb w11,[x0, #0x30]
008a7b80	lsr x11,x10,x11
008a7b84	ldr x10,[x0, #0x18]
008a7b88	lsr x12,x11,#0x6
008a7b8c	ldr x12,[x10, x12, LSL #0x3]
008a7b90	lsr x12,x12,x11
008a7b94	tbz w12,#0x0,0x008a7bc8
008a7b98	ldr x12,[x0]
008a7b9c	sub x9,x9,#0x1
008a7ba0	lsl x13,x11,#0x5
008a7ba4	ldr x13,[x12, x13#0x0]
008a7ba8	cmp x13,x8
008a7bac	b.eq 0x008a7b28
008a7bb0	add x11,x11,#0x1
008a7bb4	and x11,x11,x9
008a7bb8	lsr x13,x11,#0x6
008a7bbc	ldr x13,[x10, x13, LSL #0x3]
008a7bc0	lsr x13,x13,x11
008a7bc4	tbnz w13,#0x0,0x008a7ba0
008a7bc8	b 0x008a7bcc
008a7bcc	sub sp,sp,#0x90
008a7bd0	stp x29,x30,[sp, #0x40]
008a7bd4	str x25,[sp, #0x50]
008a7bd8	stp x24,x23,[sp, #0x60]
008a7bdc	stp x22,x21,[sp, #0x70]
008a7be0	stp x20,x19,[sp, #0x80]
008a7be4	add x29,sp,#0x40
008a7be8	mrs x22,tpidr_el0
008a7bec	mov w10,#0x10
008a7bf0	mov x19,x0
008a7bf4	ldr x8,[x22, #0x28]
008a7bf8	stur x8,[x29, #-0x8]
008a7bfc	ldr x8,[x0, #0x20]
008a7c00	stp xzr,xzr,[sp, #0x10]
008a7c04	lsl x9,x8,#0x1
008a7c08	cmp x8,#0x0
008a7c0c	csel x23,x10,x9,eq
008a7c10	str x23,[sp, #0x8]
008a7c14	cbz x23,0x008a7c80
008a7c18	cmp x23,#0x40
008a7c1c	mov w24,#0x40
008a7c20	csel x8,x23,x24,hi
008a7c24	lsr x8,x8,#0x6
008a7c28	lsl x21,x8,#0x3
008a7c2c	str x8,[sp, #0x10]
008a7c30	mov x0,x21
008a7c34	bl 0x00c2fed0
008a7c38	mov w1,wzr
008a7c3c	mov x2,x21
008a7c40	mov x20,x0
008a7c44	str x0,[sp, #0x18]
008a7c48	bl 0x00c301c0
008a7c4c	lsl x0,x23,#0x5
008a7c50	str xzr,[sp, #0x28]
008a7c54	bl 0x00c2fed0
008a7c58	rbit x8,x23
008a7c5c	sub x9,x23,#0x1
008a7c60	str x23,[sp, #0x20]
008a7c64	clz x8,x8
008a7c68	sub w8,w24,w8
008a7c6c	strb w8,[sp, #0x30]
008a7c70	and x8,x8,#0xff
008a7c74	ldp x21,x23,[x19, #0x10]
008a7c78	cbnz x21,0x008a7ca0
008a7c7c	b 0x008a7e20
008a7c80	mov w8,#0x40
008a7c84	mov x0,xzr
008a7c88	mov x20,xzr
008a7c8c	stp xzr,xzr,[sp, #0x20]
008a7c90	mov x9,#-0x1
008a7c94	strb w8,[sp, #0x30]
008a7c98	ldp x21,x23,[x19, #0x10]
008a7c9c	cbz x21,0x008a7e20
008a7ca0	ldr x10,[x23]
008a7ca4	cbz x10,0x008a7cb0
008a7ca8	mov x12,xzr
008a7cac	b 0x008a7ccc
008a7cb0	mov w11,#0x1
008a7cb4	cmp x21,x11
008a7cb8	b.eq 0x008a7e20
008a7cbc	ldr x10,[x23, x11, LSL #0x3]
008a7cc0	add x11,x11,#0x1
008a7cc4	cbz x10,0x008a7cb4
008a7cc8	sub x12,x11,#0x1
008a7ccc	rbit x13,x10
008a7cd0	mov x15,#0x959d
008a7cd4	mov x11,xzr
008a7cd8	movk x15,#0xb8f4, LSL #16
008a7cdc	mov w16,#0x1
008a7ce0	clz x14,x13
008a7ce4	mov x13,#0x2d69
008a7ce8	movk x15,#0xd34f, LSL #32
008a7cec	movk x13,#0xeb38, LSL #16
008a7cf0	orr x17,x14,x12, LSL #0x6
008a7cf4	add x14,x23,#0x8
008a7cf8	movk x13,#0xea08, LSL #32
008a7cfc	movk x15,#0x949d, LSL #48
008a7d00	movk x13,#0x9ddf, LSL #48
008a7d04	ldr x1,[x19]
008a7d08	add x1,x1,x17, LSL #0x5
008a7d0c	ldr x2,[x1]
008a7d10	lsl w3,w2,#0x3
008a7d14	lsr x4,x2,#0x20
008a7d18	add x3,x3,#0x8
008a7d1c	eor x3,x3,x4
008a7d20	mul x3,x3,x13
008a7d24	eor x4,x4,x3, LSR #0x2f
008a7d28	eor x3,x4,x3
008a7d2c	mul x3,x3,x13
008a7d30	eor x3,x3,x3, LSR #0x2f
008a7d34	mul x3,x3,x15
008a7d38	lsr x3,x3,x8
008a7d3c	lsr x4,x3,#0x6
008a7d40	lsl x5,x16,x3
008a7d44	ldr x6,[x20, x4, LSL #0x3]
008a7d48	tst x5,x6
008a7d4c	b.eq 0x008a7d8c
008a7d50	lsl x4,x3,#0x5
008a7d54	ldr x4,[x0, x4#0x0]
008a7d58	cmp x4,x2
008a7d5c	b.eq 0x008a7d80
008a7d60	add x3,x3,#0x1
008a7d64	and x3,x3,x9
008a7d68	lsr x4,x3,#0x6
008a7d6c	lsl x5,x16,x3
008a7d70	ldr x6,[x20, x4, LSL #0x3]
008a7d74	tst x6,x5
008a7d78	b.ne 0x008a7d50
008a7d7c	b 0x008a7d88
008a7d80	lsr x4,x3,#0x6
008a7d84	lsl x5,x16,x3
008a7d88	ldr x6,[x20, x4, LSL #0x3]
008a7d8c	add x3,x0,x3, LSL #0x5
008a7d90	add x11,x11,#0x1
008a7d94	orr x5,x6,x5
008a7d98	str x5,[x20, x4, LSL #0x3]
008a7d9c	str x11,[sp, #0x28]
008a7da0	str x2,[x3]
008a7da4	ldr x2,[x1, #0x18]
008a7da8	ldur q0,[x1, #0x8]
008a7dac	str x2,[x3, #0x18]
008a7db0	sub x2,x10,#0x1
008a7db4	ands x10,x2,x10
008a7db8	stur q0,[x3, #0x8]
008a7dbc	stp xzr,xzr,[x1, #0x10]
008a7dc0	str xzr,[x1, #0x8]
008a7dc4	b.ne 0x008a7df0
008a7dc8	add x10,x12,#0x1
008a7dcc	cmp x21,x10
008a7dd0	csinc x1,x21,x12,hi
008a7dd4	add x2,x12,#0x1
008a7dd8	cmp x2,x21
008a7ddc	b.cs 0x008a7e0c
008a7de0	ldr x10,[x14, x12, LSL #0x3]
008a7de4	mov x12,x2
008a7de8	cbz x10,0x008a7dd4
008a7dec	mov x12,x2
008a7df0	rbit x17,x10
008a7df4	clz x17,x17
008a7df8	orr x17,x17,x12, LSL #0x6
008a7dfc	cbnz x10,0x008a7d04
008a7e00	cmp x12,x21
008a7e04	b.ne 0x008a7d04
008a7e08	b 0x008a7e1c
008a7e0c	mov x10,xzr
008a7e10	mov x12,x1
008a7e14	cbz x10,0x008a7e00
008a7e18	b 0x008a7d04
008a7e1c	ldp x21,x23,[x19, #0x10]
008a7e20	ldp x8,x24,[x19]
008a7e24	mov x9,sp
008a7e28	cmp x19,x9
008a7e2c	stp x0,xzr,[x19]
008a7e30	stp xzr,xzr,[x19, #0x10]
008a7e34	str x8,[sp]
008a7e38	b.eq 0x008a7e64
008a7e3c	mov x0,xzr
008a7e40	mov x25,sp
008a7e44	bl 0x00c301d0
008a7e48	ldr x8,[sp, #0x18]
008a7e4c	ldur q0,[sp, #0x8]
008a7e50	mov x20,xzr
008a7e54	stp xzr,xzr,[x25, #0x10]
008a7e58	str x8,[x19, #0x18]
008a7e5c	stur q0,[x19, #0x8]
008a7e60	stur xzr,[x25, #0x8]
008a7e64	mov x0,x20
008a7e68	bl 0x00c301d0
008a7e6c	mov x0,xzr
008a7e70	stp x21,x23,[sp, #0x10]
008a7e74	str x24,[sp, #0x8]
008a7e78	bl 0x00c301d0
008a7e7c	ldr x8,[sp, #0x20]
008a7e80	ldr x9,[x19, #0x20]
008a7e84	ldrb w10,[sp, #0x30]
008a7e88	ldr x11,[sp]
008a7e8c	str x8,[x19, #0x20]
008a7e90	ldrb w8,[x19, #0x30]
008a7e94	str x9,[sp, #0x20]
008a7e98	strb w10,[x19, #0x30]
008a7e9c	strb w8,[sp, #0x30]
008a7ea0	cbz x11,0x008a7eac
008a7ea4	mov x0,sp
008a7ea8	bl 0x00882ec8
008a7eac	ldr x0,[sp, #0x18]
008a7eb0	bl 0x00c301d0
008a7eb4	ldr x8,[x22, #0x28]
008a7eb8	ldur x9,[x29, #-0x8]
008a7ebc	cmp x8,x9
008a7ec0	b.ne 0x008a7f08
008a7ec4	ldp x20,x19,[sp, #0x80]
008a7ec8	ldr x25,[sp, #0x50]
008a7ecc	ldp x22,x21,[sp, #0x70]
008a7ed0	ldp x24,x23,[sp, #0x60]
008a7ed4	ldp x29,x30,[sp, #0x40]
008a7ed8	add sp,sp,#0x90
008a7edc	ret
008a7f08	bl 0x00c2fec0
