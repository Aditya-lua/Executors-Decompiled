; cpr::AcceptEncoding::getString @ 008e5c64
008e5c64	sub sp,sp,#0x110
008e5c68	stp x28,x27,[sp, #0xb0]
008e5c6c	stp x26,x25,[sp, #0xc0]
008e5c70	stp x24,x23,[sp, #0xd0]
008e5c74	stp x22,x21,[sp, #0xe0]
008e5c78	stp x20,x19,[sp, #0xf0]
008e5c7c	stp x29,x30,[sp, #0x100]
008e5c80	add x29,sp,#0x100
008e5c84	mrs x25,tpidr_el0
008e5c88	ldr x9,[x25, #0x28]
008e5c8c	stur x9,[x29, #-0x60]
008e5c90	ldr x9,[x0, #0x10]
008e5c94	ldr x26,[x9]
008e5c98	stp xzr,xzr,[sp, #0x18]
008e5c9c	str xzr,[sp, #0x10]
008e5ca0	mov x10,x9
008e5ca4	ldrb w11,[x10, #0x10]!
008e5ca8	str x8,[sp, #0x8]
008e5cac	tbnz w11,#0x0,0x008e5cc8
008e5cb0	ldr x8,[x10, #0x10]
008e5cb4	str x8,[sp, #0x20]
008e5cb8	ldr q0,[x10]
008e5cbc	str q0,[sp, #0x10]
008e5cc0	cbnz x26,0x008e5d38
008e5cc4	b 0x008e5f64
008e5cc8	ldr x20,[x9, #0x18]
008e5ccc	cmn x20,#0x10
008e5cd0	b.cs 0x008e5fbc
008e5cd4	ldr x21,[x9, #0x20]
008e5cd8	cmp x20,#0x17
008e5cdc	b.cs 0x008e5d00
008e5ce0	add x9,sp,#0x10
008e5ce4	lsl w8,w20,#0x1
008e5ce8	orr x22,x9,#0x1
008e5cec	strb w8,[sp, #0x10]
008e5cf0	cbnz x20,0x008e5d20
008e5cf4	strb wzr,[x22, x20]
008e5cf8	cbnz x26,0x008e5d38
008e5cfc	b 0x008e5f64
008e5d00	add x8,x20,#0x10
008e5d04	and x23,x8,#-0x10
008e5d08	mov x0,x23
008e5d0c	bl 0x00c2fed0
008e5d10	orr x8,x23,#0x1
008e5d14	mov x22,x0
008e5d18	stp x20,x0,[sp, #0x18]
008e5d1c	str x8,[sp, #0x10]
008e5d20	mov x0,x22
008e5d24	mov x1,x21
008e5d28	mov x2,x20
008e5d2c	bl 0x00c2ffd0
008e5d30	strb wzr,[x22, x20]
008e5d34	cbz x26,0x008e5f64
008e5d38	add x8,sp,#0x30
008e5d3c	add x9,sp,#0x50
008e5d40	add x10,sp,#0x10
008e5d44	adrp x20,0x2a7000
008e5d48	orr x27,x8,#0x1
008e5d4c	orr x28,x9,#0x1
008e5d50	orr x19,x10,#0x1
008e5d54	add x20,x20,#0x15d
008e5d58	ldrb w8,[sp, #0x10]
008e5d5c	stp xzr,xzr,[sp, #0x50]
008e5d60	str xzr,[sp, #0x60]
008e5d64	tbnz w8,#0x0,0x008e5d7c
008e5d68	ldr x8,[sp, #0x20]
008e5d6c	ldr q0,[sp, #0x10]
008e5d70	str x8,[sp, #0x60]
008e5d74	str q0,[sp, #0x50]
008e5d78	b 0x008e5ddc
008e5d7c	ldr x21,[sp, #0x18]
008e5d80	cmn x21,#0x10
008e5d84	b.cs 0x008e5fb0
008e5d88	ldr x22,[sp, #0x20]
008e5d8c	cmp x21,#0x17
008e5d90	b.cs 0x008e5da8
008e5d94	lsl w8,w21,#0x1
008e5d98	mov x23,x28
008e5d9c	strb w8,[sp, #0x50]
008e5da0	cbnz x21,0x008e5dc8
008e5da4	b 0x008e5dd8
008e5da8	add x8,x21,#0x10
008e5dac	and x24,x8,#-0x10
008e5db0	mov x0,x24
008e5db4	bl 0x00c2fed0
008e5db8	orr x8,x24,#0x1
008e5dbc	mov x23,x0
008e5dc0	stp x21,x0,[sp, #0x58]
008e5dc4	str x8,[sp, #0x50]
008e5dc8	mov x0,x23
008e5dcc	mov x1,x22
008e5dd0	mov x2,x21
008e5dd4	bl 0x00c2ffd0
008e5dd8	strb wzr,[x23, x21]
008e5ddc	stp xzr,xzr,[sp, #0x38]
008e5de0	str xzr,[sp, #0x30]
008e5de4	mov x8,x26
008e5de8	ldrb w9,[x8, #0x10]!
008e5dec	tbnz w9,#0x0,0x008e5e04
008e5df0	ldr x9,[x8, #0x10]
008e5df4	str x9,[sp, #0x40]
008e5df8	ldr q0,[x8]
008e5dfc	str q0,[sp, #0x30]
008e5e00	b 0x008e5e64
008e5e04	ldr x21,[x26, #0x18]
008e5e08	cmn x21,#0x10
008e5e0c	b.cs 0x008e5fa8
008e5e10	ldr x22,[x26, #0x20]
008e5e14	cmp x21,#0x17
008e5e18	b.cs 0x008e5e30
008e5e1c	lsl w8,w21,#0x1
008e5e20	mov x23,x27
008e5e24	strb w8,[sp, #0x30]
008e5e28	cbnz x21,0x008e5e50
008e5e2c	b 0x008e5e60
008e5e30	add x8,x21,#0x10
008e5e34	and x24,x8,#-0x10
008e5e38	mov x0,x24
008e5e3c	bl 0x00c2fed0
008e5e40	orr x8,x24,#0x1
008e5e44	mov x23,x0
008e5e48	stp x21,x0,[sp, #0x38]
008e5e4c	str x8,[sp, #0x30]
008e5e50	mov x0,x23
008e5e54	mov x1,x22
008e5e58	mov x2,x21
008e5e5c	bl 0x00c2ffd0
008e5e60	strb wzr,[x23, x21]
008e5e64	add x0,sp,#0x50
008e5e68	mov w2,#0x2
008e5e6c	mov x1,x20
008e5e70	bl 0x00c308c0
008e5e74	ldr x8,[x0, #0x10]
008e5e78	str x8,[sp, #0x80]
008e5e7c	ldr q0,[x0]
008e5e80	str q0,[sp, #0x70]
008e5e84	stp xzr,xzr,[x0, #0x8]
008e5e88	str xzr,[x0]
008e5e8c	ldrb w8,[sp, #0x30]
008e5e90	ldp x10,x9,[sp, #0x38]
008e5e94	tst w8,#0x1
008e5e98	lsr w11,w8,#0x1
008e5e9c	csel x1,x27,x9,eq
008e5ea0	csel x2,x11,x10,eq
008e5ea4	add x0,sp,#0x70
008e5ea8	bl 0x00c308c0
008e5eac	ldp x8,x21,[x0, #0x8]
008e5eb0	ldrb w22,[x0]
008e5eb4	stur x8,[x29, #-0x69]
008e5eb8	ldur x8,[x0, #0x1]
008e5ebc	stur x8,[x29, #-0x70]
008e5ec0	stp xzr,xzr,[x0]
008e5ec4	str xzr,[x0, #0x10]
008e5ec8	ldrb w8,[sp, #0x70]
008e5ecc	tbz w8,#0x0,0x008e5ed8
008e5ed0	ldr x0,[sp, #0x80]
008e5ed4	bl 0x00c301d0
008e5ed8	ldrb w8,[sp, #0x10]
008e5edc	tbnz w8,#0x0,0x008e5ee8
008e5ee0	strh wzr,[sp, #0x10]
008e5ee4	b 0x008e5f08
008e5ee8	ldr x8,[sp, #0x20]
008e5eec	strb wzr,[x8]
008e5ef0	ldrb w8,[sp, #0x10]
008e5ef4	str xzr,[sp, #0x18]
008e5ef8	tbz w8,#0x0,0x008e5f08
008e5efc	ldr x0,[sp, #0x20]
008e5f00	bl 0x00c301d0
008e5f04	str xzr,[sp, #0x10]
008e5f08	ldur x8,[x29, #-0x69]
008e5f0c	ldur x9,[x29, #-0x70]
008e5f10	ldrb w10,[sp, #0x30]
008e5f14	strb w22,[sp, #0x10]
008e5f18	stur xzr,[x29, #-0x69]
008e5f1c	stur x8,[x19, #0x7]
008e5f20	str x9,[x19]
008e5f24	str x21,[sp, #0x20]
008e5f28	stur xzr,[x29, #-0x70]
008e5f2c	tbnz w10,#0x0,0x008e5f44
008e5f30	ldrb w8,[sp, #0x50]
008e5f34	tbnz w8,#0x0,0x008e5f54
008e5f38	ldr x26,[x26]
008e5f3c	cbnz x26,0x008e5d58
008e5f40	b 0x008e5f64
008e5f44	ldr x0,[sp, #0x40]
008e5f48	bl 0x00c301d0
008e5f4c	ldrb w8,[sp, #0x50]
008e5f50	tbz w8,#0x0,0x008e5f38
008e5f54	ldr x0,[sp, #0x60]
008e5f58	bl 0x00c301d0
008e5f5c	ldr x26,[x26]
008e5f60	cbnz x26,0x008e5d58
008e5f64	ldr x8,[sp, #0x20]
008e5f68	ldr q0,[sp, #0x10]
008e5f6c	ldr x9,[sp, #0x8]
008e5f70	str x8,[x9, #0x10]
008e5f74	str q0,[x9]
008e5f78	ldr x8,[x25, #0x28]
008e5f7c	ldur x9,[x29, #-0x60]
008e5f80	cmp x8,x9
008e5f84	b.ne 0x008e5fb8
008e5f88	ldp x29,x30,[sp, #0x100]
008e5f8c	ldp x20,x19,[sp, #0xf0]
008e5f90	ldp x22,x21,[sp, #0xe0]
008e5f94	ldp x24,x23,[sp, #0xd0]
008e5f98	ldp x26,x25,[sp, #0xc0]
008e5f9c	ldp x28,x27,[sp, #0xb0]
008e5fa0	add sp,sp,#0x110
008e5fa4	ret
008e5fa8	add x0,sp,#0x30
008e5fac	bl 0x00c30ce0
008e5fb0	add x0,sp,#0x50
008e5fb4	bl 0x00c30ce0
008e5fb8	bl 0x00c2fec0
008e5fbc	add x0,sp,#0x10
008e5fc0	bl 0x00c30ce0
