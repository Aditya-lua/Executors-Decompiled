; WebSocketHandshakeKeyGen::static_for<19,WebSocketHandshakeKeyGen::Sha1Loop<4>>::operator() @ 009a0d1c
009a0d1c	sub sp,sp,#0x40
009a0d20	str x21,[sp, #0x10]
009a0d24	stp x20,x19,[sp, #0x20]
009a0d28	stp x29,x30,[sp, #0x30]
009a0d2c	add x29,sp,#0x30
009a0d30	mrs x21,tpidr_el0
009a0d34	ldr x8,[x21, #0x28]
009a0d38	mov x0,sp
009a0d3c	mov x20,x2
009a0d40	mov x19,x1
009a0d44	str x8,[sp, #0x8]
009a0d48	bl 0x00c33a90
009a0d4c	ldr w9,[x20, #0x10]
009a0d50	ldr w10,[x20, #0x3c]
009a0d54	ldr w11,[x20, #0x24]
009a0d58	ldr w12,[x20, #0x1c]
009a0d5c	mov w8,#0xbcdc
009a0d60	eor w9,w10,w9
009a0d64	eor w9,w9,w11
009a0d68	eor w9,w9,w12
009a0d6c	ror w9,w9,#0x1f
009a0d70	str w9,[x20, #0x1c]
009a0d74	ldp w10,w11,[x19, #0x8]
009a0d78	ldp w13,w14,[x19]
009a0d7c	ldr w12,[x19, #0x10]
009a0d80	movk w8,#0x8f1b, LSL #16
009a0d84	orr w15,w10,w11
009a0d88	and w10,w10,w11
009a0d8c	and w14,w15,w14
009a0d90	orr w10,w14,w10
009a0d94	add w9,w9,w10
009a0d98	ror w12,w12,#0x1b
009a0d9c	add w9,w9,w13
009a0da0	add w9,w9,w12
009a0da4	ror w11,w11,#0x2
009a0da8	add w9,w9,w8
009a0dac	str w11,[x19, #0xc]
009a0db0	str w9,[x19]
009a0db4	ldr w9,[x20, #0x14]
009a0db8	ldr w10,[x20]
009a0dbc	ldr w11,[x20, #0x28]
009a0dc0	ldr w12,[x20, #0x20]
009a0dc4	eor w9,w10,w9
009a0dc8	eor w9,w9,w11
009a0dcc	eor w9,w9,w12
009a0dd0	ror w9,w9,#0x1f
009a0dd4	str w9,[x20, #0x20]
009a0dd8	ldp w11,w10,[x19, #0xc]
009a0ddc	ldp w14,w12,[x19, #0x4]
009a0de0	ldr w13,[x19]
009a0de4	orr w15,w11,w10
009a0de8	and w11,w11,w10
009a0dec	ror w10,w10,#0x2
009a0df0	and w12,w15,w12
009a0df4	str w10,[x19, #0x10]
009a0df8	orr w10,w12,w11
009a0dfc	add w9,w9,w10
009a0e00	ror w13,w13,#0x1b
009a0e04	add w9,w9,w14
009a0e08	add w9,w9,w13
009a0e0c	add w9,w9,w8
009a0e10	str w9,[x19, #0x4]
009a0e14	ldr w9,[x20, #0x18]
009a0e18	ldr w10,[x20, #0x4]
009a0e1c	ldr w11,[x20, #0x2c]
009a0e20	ldr w12,[x20, #0x24]
009a0e24	eor w9,w10,w9
009a0e28	eor w9,w9,w11
009a0e2c	eor w9,w9,w12
009a0e30	ror w9,w9,#0x1f
009a0e34	str w9,[x20, #0x24]
009a0e38	ldp w10,w14,[x19]
009a0e3c	ldp w12,w11,[x19, #0xc]
009a0e40	ldr w13,[x19, #0x8]
009a0e44	orr w15,w11,w10
009a0e48	and w12,w15,w12
009a0e4c	and w11,w11,w10
009a0e50	orr w11,w12,w11
009a0e54	ror w10,w10,#0x2
009a0e58	add w9,w9,w11
009a0e5c	str w10,[x19]
009a0e60	ror w10,w14,#0x1b
009a0e64	add w9,w9,w13
009a0e68	add w9,w9,w10
009a0e6c	add w9,w9,w8
009a0e70	str w9,[x19, #0x8]
009a0e74	ldr w9,[x20, #0x1c]
009a0e78	ldr w10,[x20, #0x8]
009a0e7c	ldr w11,[x20, #0x30]
009a0e80	ldr w12,[x20, #0x28]
009a0e84	eor w9,w10,w9
009a0e88	eor w9,w9,w11
009a0e8c	eor w9,w9,w12
009a0e90	ror w9,w9,#0x1f
009a0e94	str w9,[x20, #0x28]
009a0e98	ldp w10,w11,[x19]
009a0e9c	ldr w12,[x19, #0x10]
009a0ea0	orr w13,w10,w11
009a0ea4	and w12,w13,w12
009a0ea8	ldp w14,w13,[x19, #0x8]
009a0eac	and w10,w10,w11
009a0eb0	orr w10,w12,w10
009a0eb4	add w9,w9,w10
009a0eb8	ror w14,w14,#0x1b
009a0ebc	add w9,w9,w13
009a0ec0	add w9,w9,w14
009a0ec4	ror w11,w11,#0x2
009a0ec8	add w8,w9,w8
009a0ecc	str w11,[x19, #0x4]
009a0ed0	str w8,[x19, #0xc]
009a0ed4	ldr x8,[x21, #0x28]
009a0ed8	ldr x9,[sp, #0x8]
009a0edc	cmp x8,x9
009a0ee0	b.ne 0x009a0ef8
009a0ee4	ldp x29,x30,[sp, #0x30]
009a0ee8	ldp x20,x19,[sp, #0x20]
009a0eec	ldr x21,[sp, #0x10]
009a0ef0	add sp,sp,#0x40
009a0ef4	ret
009a0ef8	bl 0x00c2fec0
