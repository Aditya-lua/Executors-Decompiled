; FUN_008a9ccc @ 008a9ccc
008a9ccc	stp x29,x30,[sp, #-0x50]!
008a9cd0	str x25,[sp, #0x10]
008a9cd4	stp x24,x23,[sp, #0x20]
008a9cd8	stp x22,x21,[sp, #0x30]
008a9cdc	stp x20,x19,[sp, #0x40]
008a9ce0	mov x29,sp
008a9ce4	ldr x9,[x0, #0x20]
008a9ce8	mov w8,#0x10
008a9cec	mov x19,x0
008a9cf0	lsl x10,x9,#0x1
008a9cf4	cmp x9,#0x0
008a9cf8	csel x23,x8,x10,eq
008a9cfc	cbz x23,0x008a9d4c
008a9d00	cmp x23,#0x40
008a9d04	mov w22,#0x40
008a9d08	csel x8,x23,x22,hi
008a9d0c	lsr x24,x8,#0x6
008a9d10	lsl x21,x24,#0x3
008a9d14	mov x0,x21
008a9d18	bl 0x00c2fed0
008a9d1c	mov w1,wzr
008a9d20	mov x2,x21
008a9d24	mov x20,x0
008a9d28	bl 0x00c301c0
008a9d2c	lsl x0,x23,#0x4
008a9d30	bl 0x00c2fed0
008a9d34	rbit x8,x23
008a9d38	clz x8,x8
008a9d3c	sub w25,w22,w8
008a9d40	ldp x8,x21,[x19, #0x10]
008a9d44	cbnz x8,0x008a9d64
008a9d48	b 0x008a9e9c
008a9d4c	mov x24,xzr
008a9d50	mov x20,xzr
008a9d54	mov x0,xzr
008a9d58	mov w25,#0x40
008a9d5c	ldp x8,x21,[x19, #0x10]
008a9d60	cbz x8,0x008a9e9c
008a9d64	ldr x10,[x21]
008a9d68	cbz x10,0x008a9d74
008a9d6c	mov x9,xzr
008a9d70	b 0x008a9d94
008a9d74	mov x9,xzr
008a9d78	add x11,x21,#0x8
008a9d7c	sub x12,x8,#0x1
008a9d80	cmp x12,x9
008a9d84	b.eq 0x008a9e9c
008a9d88	ldr x10,[x11, x9, LSL #0x3]
008a9d8c	add x9,x9,#0x1
008a9d90	cbz x10,0x008a9d80
008a9d94	rbit x11,x10
008a9d98	mov x14,#0x7c15
008a9d9c	ldr x22,[x19]
008a9da0	movk x14,#0x7f4a, LSL #16
008a9da4	and x12,x25,#0xff
008a9da8	add x13,x21,#0x8
008a9dac	clz x11,x11
008a9db0	movk x14,#0x79b9, LSL #32
008a9db4	mov w15,#0x1
008a9db8	orr x16,x11,x9, LSL #0x6
008a9dbc	sub x11,x23,#0x1
008a9dc0	movk x14,#0x9e37, LSL #48
008a9dc4	add x17,x22,x16, LSL #0x4
008a9dc8	ldr x4,[x17]
008a9dcc	lsr x1,x4,#0x4
008a9dd0	eor x1,x1,x4, LSR #0x9
008a9dd4	mul x1,x1,x14
008a9dd8	lsr x1,x1,x12
008a9ddc	lsr x2,x1,#0x6
008a9de0	lsl x3,x15,x1
008a9de4	ldr x5,[x20, x2, LSL #0x3]
008a9de8	tst x3,x5
008a9dec	b.eq 0x008a9e2c
008a9df0	lsl x2,x1,#0x4
008a9df4	ldr x2,[x0, x2#0x0]
008a9df8	cmp x2,x4
008a9dfc	b.eq 0x008a9e20
008a9e00	add x1,x1,#0x1
008a9e04	and x1,x1,x11
008a9e08	lsr x2,x1,#0x6
008a9e0c	lsl x3,x15,x1
008a9e10	ldr x5,[x20, x2, LSL #0x3]
008a9e14	tst x5,x3
008a9e18	b.ne 0x008a9df0
008a9e1c	b 0x008a9e28
008a9e20	lsr x2,x1,#0x6
008a9e24	lsl x3,x15,x1
008a9e28	ldr x5,[x20, x2, LSL #0x3]
008a9e2c	orr x3,x5,x3
008a9e30	str x3,[x20, x2, LSL #0x3]
008a9e34	sub x2,x10,#0x1
008a9e38	ldr q0,[x17]
008a9e3c	ands x10,x2,x10
008a9e40	str q0,[x0,x1, lsl #4]
008a9e44	b.ne 0x008a9e70
008a9e48	add x10,x9,#0x1
008a9e4c	cmp x8,x10
008a9e50	csinc x17,x8,x9,hi
008a9e54	add x1,x9,#0x1
008a9e58	cmp x1,x8
008a9e5c	b.cs 0x008a9e8c
008a9e60	ldr x10,[x13, x9, LSL #0x3]
008a9e64	mov x9,x1
008a9e68	cbz x10,0x008a9e54
008a9e6c	mov x9,x1
008a9e70	rbit x16,x10
008a9e74	clz x16,x16
008a9e78	orr x16,x16,x9, LSL #0x6
008a9e7c	cbnz x10,0x008a9dc4
008a9e80	cmp x9,x8
008a9e84	b.ne 0x008a9dc4
008a9e88	b 0x008a9ea0
008a9e8c	mov x10,xzr
008a9e90	mov x9,x17
008a9e94	cbz x10,0x008a9e80
008a9e98	b 0x008a9dc4
008a9e9c	ldr x22,[x19]
008a9ea0	stp x0,xzr,[x19]
008a9ea4	mov x0,xzr
008a9ea8	stp xzr,xzr,[x19, #0x10]
008a9eac	bl 0x00c301d0
008a9eb0	mov x0,xzr
008a9eb4	stp x24,x20,[x19, #0x10]
008a9eb8	str x23,[x19, #0x8]
008a9ebc	bl 0x00c301d0
008a9ec0	mov x0,xzr
008a9ec4	bl 0x00c301d0
008a9ec8	str x23,[x19, #0x20]
008a9ecc	strb w25,[x19, #0x30]
008a9ed0	cbz x22,0x008a9ef0
008a9ed4	mov x0,x22
008a9ed8	bl 0x00c301d0
008a9edc	mov x0,x21
008a9ee0	bl 0x00c301d0
008a9ee4	mov x0,xzr
008a9ee8	bl 0x00c301d0
008a9eec	mov x21,xzr
008a9ef0	mov x0,x21
008a9ef4	ldp x20,x19,[sp, #0x40]
008a9ef8	ldr x25,[sp, #0x10]
008a9efc	ldp x22,x21,[sp, #0x30]
008a9f00	ldp x24,x23,[sp, #0x20]
008a9f04	ldp x29,x30,[sp], #0x50
008a9f08	b 0x00c301d0
