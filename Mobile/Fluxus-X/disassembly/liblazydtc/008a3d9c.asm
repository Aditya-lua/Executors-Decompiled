; FUN_008a3d9c @ 008a3d9c
008a3d9c	stp x29,x30,[sp, #-0x50]!
008a3da0	str x25,[sp, #0x10]
008a3da4	stp x24,x23,[sp, #0x20]
008a3da8	stp x22,x21,[sp, #0x30]
008a3dac	stp x20,x19,[sp, #0x40]
008a3db0	mov x29,sp
008a3db4	ldr x9,[x0, #0x20]
008a3db8	mov w8,#0x10
008a3dbc	mov x19,x0
008a3dc0	lsl x10,x9,#0x1
008a3dc4	cmp x9,#0x0
008a3dc8	csel x23,x8,x10,eq
008a3dcc	cbz x23,0x008a3e1c
008a3dd0	cmp x23,#0x40
008a3dd4	mov w22,#0x40
008a3dd8	csel x8,x23,x22,hi
008a3ddc	lsr x24,x8,#0x6
008a3de0	lsl x21,x24,#0x3
008a3de4	mov x0,x21
008a3de8	bl 0x00c2fed0
008a3dec	mov w1,wzr
008a3df0	mov x2,x21
008a3df4	mov x20,x0
008a3df8	bl 0x00c301c0
008a3dfc	lsl x0,x23,#0x4
008a3e00	bl 0x00c2fed0
008a3e04	rbit x8,x23
008a3e08	clz x8,x8
008a3e0c	sub w25,w22,w8
008a3e10	ldp x8,x21,[x19, #0x10]
008a3e14	cbnz x8,0x008a3e34
008a3e18	b 0x008a3f8c
008a3e1c	mov x24,xzr
008a3e20	mov x20,xzr
008a3e24	mov x0,xzr
008a3e28	mov w25,#0x40
008a3e2c	ldp x8,x21,[x19, #0x10]
008a3e30	cbz x8,0x008a3f8c
008a3e34	ldr x10,[x21]
008a3e38	cbz x10,0x008a3e44
008a3e3c	mov x9,xzr
008a3e40	b 0x008a3e64
008a3e44	mov x9,xzr
008a3e48	add x11,x21,#0x8
008a3e4c	sub x12,x8,#0x1
008a3e50	cmp x12,x9
008a3e54	b.eq 0x008a3f8c
008a3e58	ldr x10,[x11, x9, LSL #0x3]
008a3e5c	add x9,x9,#0x1
008a3e60	cbz x10,0x008a3e50
008a3e64	rbit x11,x10
008a3e68	mov x14,#0xe5b9
008a3e6c	mov x15,#0x7c15
008a3e70	movk x14,#0x1ce4, LSL #16
008a3e74	movk x15,#0x7f4a, LSL #16
008a3e78	ldr x22,[x19]
008a3e7c	clz x11,x11
008a3e80	movk x14,#0x476d, LSL #32
008a3e84	movk x15,#0x79b9, LSL #32
008a3e88	orr x17,x11,x9, LSL #0x6
008a3e8c	sub x11,x23,#0x1
008a3e90	and x12,x25,#0xff
008a3e94	add x13,x21,#0x8
008a3e98	movk x14,#0xbf58, LSL #48
008a3e9c	movk x15,#0x9e37, LSL #48
008a3ea0	mov w16,#0x1
008a3ea4	add x1,x22,x17, LSL #0x4
008a3ea8	ldp x5,x6,[x1]
008a3eac	mul x2,x5,x14
008a3eb0	lsr x3,x6,#0x4
008a3eb4	eor x3,x3,x6, LSR #0x9
008a3eb8	eor x3,x3,x2, LSR #0x1f
008a3ebc	eor x2,x3,x2
008a3ec0	mul x2,x2,x15
008a3ec4	lsr x2,x2,x12
008a3ec8	lsr x3,x2,#0x6
008a3ecc	lsl x4,x16,x2
008a3ed0	ldr x7,[x20, x3, LSL #0x3]
008a3ed4	tst x4,x7
008a3ed8	b.eq 0x008a3f1c
008a3edc	add x3,x0,x2, LSL #0x4
008a3ee0	ldp x4,x3,[x3]
008a3ee4	cmp x4,x5
008a3ee8	ccmp x3,x6,#0x0,eq
008a3eec	b.eq 0x008a3f10
008a3ef0	add x2,x2,#0x1
008a3ef4	and x2,x2,x11
008a3ef8	lsr x3,x2,#0x6
008a3efc	lsl x4,x16,x2
008a3f00	ldr x7,[x20, x3, LSL #0x3]
008a3f04	tst x7,x4
008a3f08	b.ne 0x008a3edc
008a3f0c	b 0x008a3f18
008a3f10	lsr x3,x2,#0x6
008a3f14	lsl x4,x16,x2
008a3f18	ldr x7,[x20, x3, LSL #0x3]
008a3f1c	orr x4,x7,x4
008a3f20	str x4,[x20, x3, LSL #0x3]
008a3f24	sub x3,x10,#0x1
008a3f28	ldr q0,[x1]
008a3f2c	ands x10,x3,x10
008a3f30	str q0,[x0,x2, lsl #4]
008a3f34	b.ne 0x008a3f60
008a3f38	add x10,x9,#0x1
008a3f3c	cmp x8,x10
008a3f40	csinc x1,x8,x9,hi
008a3f44	add x2,x9,#0x1
008a3f48	cmp x2,x8
008a3f4c	b.cs 0x008a3f7c
008a3f50	ldr x10,[x13, x9, LSL #0x3]
008a3f54	mov x9,x2
008a3f58	cbz x10,0x008a3f44
008a3f5c	mov x9,x2
008a3f60	rbit x17,x10
008a3f64	clz x17,x17
008a3f68	orr x17,x17,x9, LSL #0x6
008a3f6c	cbnz x10,0x008a3ea4
008a3f70	cmp x9,x8
008a3f74	b.ne 0x008a3ea4
008a3f78	b 0x008a3f90
008a3f7c	mov x10,xzr
008a3f80	mov x9,x1
008a3f84	cbz x10,0x008a3f70
008a3f88	b 0x008a3ea4
008a3f8c	ldr x22,[x19]
008a3f90	stp x0,xzr,[x19]
008a3f94	mov x0,xzr
008a3f98	stp xzr,xzr,[x19, #0x10]
008a3f9c	bl 0x00c301d0
008a3fa0	mov x0,xzr
008a3fa4	stp x24,x20,[x19, #0x10]
008a3fa8	str x23,[x19, #0x8]
008a3fac	bl 0x00c301d0
008a3fb0	mov x0,xzr
008a3fb4	bl 0x00c301d0
008a3fb8	str x23,[x19, #0x20]
008a3fbc	strb w25,[x19, #0x30]
008a3fc0	cbz x22,0x008a3fe0
008a3fc4	mov x0,x22
008a3fc8	bl 0x00c301d0
008a3fcc	mov x0,x21
008a3fd0	bl 0x00c301d0
008a3fd4	mov x0,xzr
008a3fd8	bl 0x00c301d0
008a3fdc	mov x21,xzr
008a3fe0	mov x0,x21
008a3fe4	ldp x20,x19,[sp, #0x40]
008a3fe8	ldr x25,[sp, #0x10]
008a3fec	ldp x22,x21,[sp, #0x30]
008a3ff0	ldp x24,x23,[sp, #0x20]
008a3ff4	ldp x29,x30,[sp], #0x50
008a3ff8	b 0x00c301d0
