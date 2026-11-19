; FUN_008a6cb0 @ 008a6cb0
008a6cb0	ldp x9,x8,[x0, #0x20]
008a6cb4	add x10,x9,x9, LSL #0x1
008a6cb8	cmp x8,x10, LSR #0x2
008a6cbc	b.cs 0x008a6cc4
008a6cc0	ret
008a6cc4	cbz x8,0x008a6d60
008a6cc8	ldr x8,[x1]
008a6ccc	mov x12,#0x2d69
008a6cd0	movk x12,#0xeb38, LSL #16
008a6cd4	lsl w10,w8,#0x3
008a6cd8	lsr x11,x8,#0x20
008a6cdc	movk x12,#0xea08, LSL #32
008a6ce0	movk x12,#0x9ddf, LSL #48
008a6ce4	add x10,x10,#0x8
008a6ce8	eor x10,x10,x11
008a6cec	mul x10,x10,x12
008a6cf0	eor x11,x11,x10, LSR #0x2f
008a6cf4	eor x10,x11,x10
008a6cf8	mov x11,#0x959d
008a6cfc	mul x10,x10,x12
008a6d00	movk x11,#0xb8f4, LSL #16
008a6d04	movk x11,#0xd34f, LSL #32
008a6d08	movk x11,#0x949d, LSL #48
008a6d0c	eor x10,x10,x10, LSR #0x2f
008a6d10	mul x10,x10,x11
008a6d14	ldrb w11,[x0, #0x30]
008a6d18	lsr x11,x10,x11
008a6d1c	ldr x10,[x0, #0x18]
008a6d20	lsr x12,x11,#0x6
008a6d24	ldr x12,[x10, x12, LSL #0x3]
008a6d28	lsr x12,x12,x11
008a6d2c	tbz w12,#0x0,0x008a6d60
008a6d30	ldr x12,[x0]
008a6d34	sub x9,x9,#0x1
008a6d38	lsl x13,x11,#0x4
008a6d3c	ldr x13,[x12, x13#0x0]
008a6d40	cmp x13,x8
008a6d44	b.eq 0x008a6cc0
008a6d48	add x11,x11,#0x1
008a6d4c	and x11,x11,x9
008a6d50	lsr x13,x11,#0x6
008a6d54	ldr x13,[x10, x13, LSL #0x3]
008a6d58	lsr x13,x13,x11
008a6d5c	tbnz w13,#0x0,0x008a6d38
008a6d60	b 0x008a6d64
008a6d64	stp x29,x30,[sp, #-0x50]!
008a6d68	str x25,[sp, #0x10]
008a6d6c	stp x24,x23,[sp, #0x20]
008a6d70	stp x22,x21,[sp, #0x30]
008a6d74	stp x20,x19,[sp, #0x40]
008a6d78	mov x29,sp
008a6d7c	ldr x9,[x0, #0x20]
008a6d80	mov w8,#0x10
008a6d84	mov x19,x0
008a6d88	lsl x10,x9,#0x1
008a6d8c	cmp x9,#0x0
008a6d90	csel x23,x8,x10,eq
008a6d94	cbz x23,0x008a6de4
008a6d98	cmp x23,#0x40
008a6d9c	mov w22,#0x40
008a6da0	csel x8,x23,x22,hi
008a6da4	lsr x24,x8,#0x6
008a6da8	lsl x21,x24,#0x3
008a6dac	mov x0,x21
008a6db0	bl 0x00c2fed0
008a6db4	mov w1,wzr
008a6db8	mov x2,x21
008a6dbc	mov x20,x0
008a6dc0	bl 0x00c301c0
008a6dc4	lsl x0,x23,#0x4
008a6dc8	bl 0x00c2fed0
008a6dcc	rbit x8,x23
008a6dd0	clz x8,x8
008a6dd4	sub w25,w22,w8
008a6dd8	ldp x8,x21,[x19, #0x10]
008a6ddc	cbnz x8,0x008a6dfc
008a6de0	b 0x008a6f60
008a6de4	mov x24,xzr
008a6de8	mov x20,xzr
008a6dec	mov x0,xzr
008a6df0	mov w25,#0x40
008a6df4	ldp x8,x21,[x19, #0x10]
008a6df8	cbz x8,0x008a6f60
008a6dfc	ldr x10,[x21]
008a6e00	cbz x10,0x008a6e0c
008a6e04	mov x9,xzr
008a6e08	b 0x008a6e2c
008a6e0c	mov x9,xzr
008a6e10	add x11,x21,#0x8
008a6e14	sub x12,x8,#0x1
008a6e18	cmp x12,x9
008a6e1c	b.eq 0x008a6f60
008a6e20	ldr x10,[x11, x9, LSL #0x3]
008a6e24	add x9,x9,#0x1
008a6e28	cbz x10,0x008a6e18
008a6e2c	rbit x12,x10
008a6e30	mov x11,#0x2d69
008a6e34	mov x15,#0x959d
008a6e38	movk x11,#0xeb38, LSL #16
008a6e3c	movk x15,#0xb8f4, LSL #16
008a6e40	ldr x22,[x19]
008a6e44	clz x12,x12
008a6e48	movk x11,#0xea08, LSL #32
008a6e4c	movk x15,#0xd34f, LSL #32
008a6e50	orr x17,x12,x9, LSL #0x6
008a6e54	movk x11,#0x9ddf, LSL #48
008a6e58	sub x12,x23,#0x1
008a6e5c	and x13,x25,#0xff
008a6e60	add x14,x21,#0x8
008a6e64	movk x15,#0x949d, LSL #48
008a6e68	mov w16,#0x1
008a6e6c	add x1,x22,x17, LSL #0x4
008a6e70	ldr x5,[x1]
008a6e74	lsl w2,w5,#0x3
008a6e78	lsr x3,x5,#0x20
008a6e7c	add x2,x2,#0x8
008a6e80	eor x2,x2,x3
008a6e84	mul x2,x2,x11
008a6e88	eor x3,x3,x2, LSR #0x2f
008a6e8c	eor x2,x3,x2
008a6e90	mul x2,x2,x11
008a6e94	eor x2,x2,x2, LSR #0x2f
008a6e98	mul x2,x2,x15
008a6e9c	lsr x2,x2,x13
008a6ea0	lsr x3,x2,#0x6
008a6ea4	lsl x4,x16,x2
008a6ea8	ldr x6,[x20, x3, LSL #0x3]
008a6eac	tst x4,x6
008a6eb0	b.eq 0x008a6ef0
008a6eb4	lsl x3,x2,#0x4
008a6eb8	ldr x3,[x0, x3#0x0]
008a6ebc	cmp x3,x5
008a6ec0	b.eq 0x008a6ee4
008a6ec4	add x2,x2,#0x1
008a6ec8	and x2,x2,x12
008a6ecc	lsr x3,x2,#0x6
008a6ed0	lsl x4,x16,x2
008a6ed4	ldr x6,[x20, x3, LSL #0x3]
008a6ed8	tst x6,x4
008a6edc	b.ne 0x008a6eb4
008a6ee0	b 0x008a6eec
008a6ee4	lsr x3,x2,#0x6
008a6ee8	lsl x4,x16,x2
008a6eec	ldr x6,[x20, x3, LSL #0x3]
008a6ef0	orr x4,x6,x4
008a6ef4	str x4,[x20, x3, LSL #0x3]
008a6ef8	sub x3,x10,#0x1
008a6efc	ldr q0,[x1]
008a6f00	ands x10,x3,x10
008a6f04	str q0,[x0,x2, lsl #4]
008a6f08	b.ne 0x008a6f34
008a6f0c	add x10,x9,#0x1
008a6f10	cmp x8,x10
008a6f14	csinc x1,x8,x9,hi
008a6f18	add x2,x9,#0x1
008a6f1c	cmp x2,x8
008a6f20	b.cs 0x008a6f50
008a6f24	ldr x10,[x14, x9, LSL #0x3]
008a6f28	mov x9,x2
008a6f2c	cbz x10,0x008a6f18
008a6f30	mov x9,x2
008a6f34	rbit x17,x10
008a6f38	clz x17,x17
008a6f3c	orr x17,x17,x9, LSL #0x6
008a6f40	cbnz x10,0x008a6e6c
008a6f44	cmp x9,x8
008a6f48	b.ne 0x008a6e6c
008a6f4c	b 0x008a6f64
008a6f50	mov x10,xzr
008a6f54	mov x9,x1
008a6f58	cbz x10,0x008a6f44
008a6f5c	b 0x008a6e6c
008a6f60	ldr x22,[x19]
008a6f64	stp x0,xzr,[x19]
008a6f68	mov x0,xzr
008a6f6c	stp xzr,xzr,[x19, #0x10]
008a6f70	bl 0x00c301d0
008a6f74	mov x0,xzr
008a6f78	stp x24,x20,[x19, #0x10]
008a6f7c	str x23,[x19, #0x8]
008a6f80	bl 0x00c301d0
008a6f84	mov x0,xzr
008a6f88	bl 0x00c301d0
008a6f8c	str x23,[x19, #0x20]
008a6f90	strb w25,[x19, #0x30]
008a6f94	cbz x22,0x008a6fb4
008a6f98	mov x0,x22
008a6f9c	bl 0x00c301d0
008a6fa0	mov x0,x21
008a6fa4	bl 0x00c301d0
008a6fa8	mov x0,xzr
008a6fac	bl 0x00c301d0
008a6fb0	mov x21,xzr
008a6fb4	mov x0,x21
008a6fb8	ldp x20,x19,[sp, #0x40]
008a6fbc	ldr x25,[sp, #0x10]
008a6fc0	ldp x22,x21,[sp, #0x30]
008a6fc4	ldp x24,x23,[sp, #0x20]
008a6fc8	ldp x29,x30,[sp], #0x50
008a6fcc	b 0x00c301d0
