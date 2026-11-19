; FUN_00886bbc @ 00886bbc
00886bbc	ldp x9,x8,[x0, #0x20]
00886bc0	add x10,x9,x9, LSL #0x1
00886bc4	cmp x8,x10, LSR #0x2
00886bc8	b.cs 0x00886bd0
00886bcc	ret
00886bd0	cbz x8,0x00886c70
00886bd4	ldr x8,[x1]
00886bd8	mov x12,#0x2d69
00886bdc	movk x12,#0xeb38, LSL #16
00886be0	lsl w10,w8,#0x3
00886be4	lsr x11,x8,#0x20
00886be8	movk x12,#0xea08, LSL #32
00886bec	movk x12,#0x9ddf, LSL #48
00886bf0	add x10,x10,#0x8
00886bf4	eor x10,x10,x11
00886bf8	mul x10,x10,x12
00886bfc	eor x11,x11,x10, LSR #0x2f
00886c00	eor x10,x11,x10
00886c04	mov x11,#0x959d
00886c08	mul x10,x10,x12
00886c0c	movk x11,#0xb8f4, LSL #16
00886c10	movk x11,#0xd34f, LSL #32
00886c14	movk x11,#0x949d, LSL #48
00886c18	eor x10,x10,x10, LSR #0x2f
00886c1c	mul x10,x10,x11
00886c20	ldrb w11,[x0, #0x30]
00886c24	lsr x11,x10,x11
00886c28	ldr x10,[x0, #0x18]
00886c2c	lsr x12,x11,#0x6
00886c30	ldr x12,[x10, x12, LSL #0x3]
00886c34	lsr x12,x12,x11
00886c38	tbz w12,#0x0,0x00886c70
00886c3c	ldr x12,[x0]
00886c40	sub x9,x9,#0x1
00886c44	mov w13,#0x18
00886c48	mul x14,x11,x13
00886c4c	ldr x14,[x12, x14#0x0]
00886c50	cmp x14,x8
00886c54	b.eq 0x00886bcc
00886c58	add x11,x11,#0x1
00886c5c	and x11,x11,x9
00886c60	lsr x14,x11,#0x6
00886c64	ldr x14,[x10, x14, LSL #0x3]
00886c68	lsr x14,x14,x11
00886c6c	tbnz w14,#0x0,0x00886c48
00886c70	b 0x00886c74
00886c74	stp x29,x30,[sp, #-0x50]!
00886c78	str x25,[sp, #0x10]
00886c7c	stp x24,x23,[sp, #0x20]
00886c80	stp x22,x21,[sp, #0x30]
00886c84	stp x20,x19,[sp, #0x40]
00886c88	mov x29,sp
00886c8c	ldr x9,[x0, #0x20]
00886c90	mov w8,#0x10
00886c94	mov x19,x0
00886c98	lsl x10,x9,#0x1
00886c9c	cmp x9,#0x0
00886ca0	csel x23,x8,x10,eq
00886ca4	cbz x23,0x00886cf8
00886ca8	cmp x23,#0x40
00886cac	mov w22,#0x40
00886cb0	csel x8,x23,x22,hi
00886cb4	lsr x24,x8,#0x6
00886cb8	lsl x21,x24,#0x3
00886cbc	mov x0,x21
00886cc0	bl 0x00c2fed0
00886cc4	mov w1,wzr
00886cc8	mov x2,x21
00886ccc	mov x20,x0
00886cd0	bl 0x00c301c0
00886cd4	add x8,x23,x23, LSL #0x1
00886cd8	lsl x0,x8,#0x3
00886cdc	bl 0x00c2fed0
00886ce0	rbit x8,x23
00886ce4	clz x8,x8
00886ce8	sub w25,w22,w8
00886cec	ldp x8,x21,[x19, #0x10]
00886cf0	cbnz x8,0x00886d10
00886cf4	b 0x00886e88
00886cf8	mov x24,xzr
00886cfc	mov x20,xzr
00886d00	mov x0,xzr
00886d04	mov w25,#0x40
00886d08	ldp x8,x21,[x19, #0x10]
00886d0c	cbz x8,0x00886e88
00886d10	ldr x10,[x21]
00886d14	cbz x10,0x00886d20
00886d18	mov x9,xzr
00886d1c	b 0x00886d40
00886d20	mov x9,xzr
00886d24	add x11,x21,#0x8
00886d28	sub x12,x8,#0x1
00886d2c	cmp x12,x9
00886d30	b.eq 0x00886e88
00886d34	ldr x10,[x11, x9, LSL #0x3]
00886d38	add x9,x9,#0x1
00886d3c	cbz x10,0x00886d2c
00886d40	rbit x11,x10
00886d44	mov x16,#0x959d
00886d48	ldr x22,[x19]
00886d4c	movk x16,#0xb8f4, LSL #16
00886d50	and x13,x25,#0xff
00886d54	add x14,x21,#0x8
00886d58	clz x12,x11
00886d5c	mov x11,#0x2d69
00886d60	movk x16,#0xd34f, LSL #32
00886d64	movk x11,#0xeb38, LSL #16
00886d68	orr x1,x12,x9, LSL #0x6
00886d6c	sub x12,x23,#0x1
00886d70	movk x11,#0xea08, LSL #32
00886d74	mov w15,#0x18
00886d78	movk x16,#0x949d, LSL #48
00886d7c	movk x11,#0x9ddf, LSL #48
00886d80	mov w17,#0x1
00886d84	madd x2,x1,x15,x22
00886d88	ldr x6,[x2]
00886d8c	lsl w3,w6,#0x3
00886d90	lsr x4,x6,#0x20
00886d94	add x3,x3,#0x8
00886d98	eor x3,x3,x4
00886d9c	mul x3,x3,x11
00886da0	eor x4,x4,x3, LSR #0x2f
00886da4	eor x3,x4,x3
00886da8	mul x3,x3,x11
00886dac	eor x3,x3,x3, LSR #0x2f
00886db0	mul x3,x3,x16
00886db4	lsr x3,x3,x13
00886db8	lsr x4,x3,#0x6
00886dbc	lsl x5,x17,x3
00886dc0	ldr x7,[x20, x4, LSL #0x3]
00886dc4	tst x5,x7
00886dc8	b.eq 0x00886e08
00886dcc	mul x4,x3,x15
00886dd0	ldr x4,[x0, x4#0x0]
00886dd4	cmp x4,x6
00886dd8	b.eq 0x00886dfc
00886ddc	add x3,x3,#0x1
00886de0	and x3,x3,x12
00886de4	lsr x4,x3,#0x6
00886de8	lsl x5,x17,x3
00886dec	ldr x7,[x20, x4, LSL #0x3]
00886df0	tst x7,x5
00886df4	b.ne 0x00886dcc
00886df8	b 0x00886e04
00886dfc	lsr x4,x3,#0x6
00886e00	lsl x5,x17,x3
00886e04	ldr x7,[x20, x4, LSL #0x3]
00886e08	nop
00886e0c	madd x3,x3,x15,x0
00886e10	orr x5,x7,x5
00886e14	str x5,[x20, x4, LSL #0x3]
00886e18	ldr x4,[x2, #0x10]
00886e1c	sub x5,x10,#0x1
00886e20	ldr q0,[x2]
00886e24	ands x10,x5,x10
00886e28	str x4,[x3, #0x10]
00886e2c	str q0,[x3]
00886e30	b.ne 0x00886e5c
00886e34	add x10,x9,#0x1
00886e38	cmp x8,x10
00886e3c	csinc x2,x8,x9,hi
00886e40	add x3,x9,#0x1
00886e44	cmp x3,x8
00886e48	b.cs 0x00886e78
00886e4c	ldr x10,[x14, x9, LSL #0x3]
00886e50	mov x9,x3
00886e54	cbz x10,0x00886e40
00886e58	mov x9,x3
00886e5c	rbit x1,x10
00886e60	clz x1,x1
00886e64	orr x1,x1,x9, LSL #0x6
00886e68	cbnz x10,0x00886d84
00886e6c	cmp x9,x8
00886e70	b.ne 0x00886d84
00886e74	b 0x00886e8c
00886e78	mov x10,xzr
00886e7c	mov x9,x2
00886e80	cbz x10,0x00886e6c
00886e84	b 0x00886d84
00886e88	ldr x22,[x19]
00886e8c	stp x0,xzr,[x19]
00886e90	mov x0,xzr
00886e94	stp xzr,xzr,[x19, #0x10]
00886e98	bl 0x00c301d0
00886e9c	mov x0,xzr
00886ea0	stp x24,x20,[x19, #0x10]
00886ea4	str x23,[x19, #0x8]
00886ea8	bl 0x00c301d0
00886eac	mov x0,xzr
00886eb0	bl 0x00c301d0
00886eb4	str x23,[x19, #0x20]
00886eb8	strb w25,[x19, #0x30]
00886ebc	cbz x22,0x00886edc
00886ec0	mov x0,x22
00886ec4	bl 0x00c301d0
00886ec8	mov x0,x21
00886ecc	bl 0x00c301d0
00886ed0	mov x0,xzr
00886ed4	bl 0x00c301d0
00886ed8	mov x21,xzr
00886edc	mov x0,x21
00886ee0	ldp x20,x19,[sp, #0x40]
00886ee4	ldr x25,[sp, #0x10]
00886ee8	ldp x22,x21,[sp, #0x30]
00886eec	ldp x24,x23,[sp, #0x20]
00886ef0	ldp x29,x30,[sp], #0x50
00886ef4	b 0x00c301d0
