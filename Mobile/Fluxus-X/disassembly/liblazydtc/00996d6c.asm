; ix::WebSocketInitResult::WebSocketInitResult @ 00996d6c
00996d6c	sub sp,sp,#0x90
00996d70	str x27,[sp, #0x30]
00996d74	stp x26,x25,[sp, #0x40]
00996d78	stp x24,x23,[sp, #0x50]
00996d7c	stp x22,x21,[sp, #0x60]
00996d80	stp x20,x19,[sp, #0x70]
00996d84	stp x29,x30,[sp, #0x80]
00996d88	add x29,sp,#0x80
00996d8c	mrs x27,tpidr_el0
00996d90	ldr x8,[x27, #0x28]
00996d94	mov x20,x0
00996d98	mov x26,x0
00996d9c	mov x22,x0
00996da0	str x8,[sp, #0x28]
00996da4	mov x23,x0
00996da8	str xzr,[x20, #0x8]!
00996dac	stp xzr,xzr,[x0, #0x10]
00996db0	str xzr,[x26, #0x28]!
00996db4	mov x25,x5
00996db8	mov x24,x4
00996dbc	mov x19,x0
00996dc0	and w9,w1,#0x1
00996dc4	add x21,x0,#0x20
00996dc8	str xzr,[x0, #0x30]
00996dcc	stp xzr,xzr,[x0, #0x58]
00996dd0	stp xzr,xzr,[x0, #0x40]
00996dd4	str x26,[x0, #0x20]
00996dd8	str xzr,[x22, #0x38]!
00996ddc	str xzr,[x23, #0x50]!
00996de0	cmp x20,x3
00996de4	strb w9,[x0]
00996de8	str w2,[x0, #0x4]
00996dec	b.eq 0x00996e10
00996df0	ldrb w8,[x3]
00996df4	ldp x10,x9,[x3, #0x8]
00996df8	tst w8,#0x1
00996dfc	lsr w11,w8,#0x1
00996e00	csinc x1,x9,x3,ne
00996e04	csel x2,x11,x10,eq
00996e08	mov x0,x20
00996e0c	bl 0x00c31090
00996e10	cmp x21,x24
00996e14	b.eq 0x00996e28
00996e18	mov x2,x24
00996e1c	ldr x1,[x2], #0x8
00996e20	mov x0,x21
00996e24	bl 0x00c33130
00996e28	cmp x22,x25
00996e2c	b.eq 0x00996e50
00996e30	ldrb w8,[x25]
00996e34	ldp x10,x9,[x25, #0x8]
00996e38	tst w8,#0x1
00996e3c	lsr w11,w8,#0x1
00996e40	csinc x1,x9,x25,ne
00996e44	csel x2,x11,x10,eq
00996e48	mov x0,x22
00996e4c	bl 0x00c31090
00996e50	adrp x9,0x2a3000
00996e54	add x9,x9,#0xa16
00996e58	ldr q0,[x9]
00996e5c	ldur x9,[x9, #0xe]
00996e60	mov w8,#0x2c
00996e64	mov x10,sp
00996e68	strb w8,[sp]
00996e6c	stur q0,[sp, #0x1]
00996e70	stur x9,[sp, #0xf]
00996e74	strb wzr,[sp, #0x17]
00996e78	str x10,[sp, #0x20]
00996e7c	adrp x2,0x74a000
00996e80	add x2,x2,#0x980
00996e84	mov x1,sp
00996e88	add x3,sp,#0x20
00996e8c	add x4,sp,#0x18
00996e90	mov x0,x24
00996e94	bl 0x00c32fb0
00996e98	add x8,x0,#0x38
00996e9c	cmp x23,x8
00996ea0	b.eq 0x00996ec4
00996ea4	ldrb w9,[x0, #0x38]
00996ea8	ldp x11,x10,[x0, #0x40]
00996eac	tst w9,#0x1
00996eb0	lsr w12,w9,#0x1
00996eb4	csinc x1,x10,x8,ne
00996eb8	csel x2,x12,x11,eq
00996ebc	mov x0,x23
00996ec0	bl 0x00c31090
00996ec4	ldrb w8,[sp]
00996ec8	tbz w8,#0x0,0x00996ed4
00996ecc	ldr x0,[sp, #0x10]
00996ed0	bl 0x00c301d0
00996ed4	ldr x8,[x27, #0x28]
00996ed8	ldr x9,[sp, #0x28]
00996edc	cmp x8,x9
00996ee0	b.ne 0x00996f04
00996ee4	ldp x29,x30,[sp, #0x80]
00996ee8	ldp x20,x19,[sp, #0x70]
00996eec	ldp x22,x21,[sp, #0x60]
00996ef0	ldp x24,x23,[sp, #0x50]
00996ef4	ldp x26,x25,[sp, #0x40]
00996ef8	ldr x27,[sp, #0x30]
00996efc	add sp,sp,#0x90
00996f00	ret
00996f04	bl 0x00c2fec0
