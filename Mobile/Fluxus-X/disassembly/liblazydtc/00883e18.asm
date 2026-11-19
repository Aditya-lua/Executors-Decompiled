; FUN_00883e18 @ 00883e18
00883e18	stp x29,x30,[sp, #-0x30]!
00883e1c	str x21,[sp, #0x10]
00883e20	stp x20,x19,[sp, #0x20]
00883e24	mov x29,sp
00883e28	ldp x8,x9,[x0, #0x20]
00883e2c	mov x21,#0x7c15
00883e30	movk x21,#0x7f4a, LSL #16
00883e34	mov x20,x1
00883e38	mov x19,x0
00883e3c	movk x21,#0x79b9, LSL #32
00883e40	add x10,x8,x8, LSL #0x1
00883e44	movk x21,#0x9e37, LSL #48
00883e48	cmp x9,x10, LSR #0x2
00883e4c	b.cc 0x00883ebc
00883e50	cbz x9,0x00883eb0
00883e54	ldr x9,[x20]
00883e58	ldrb w11,[x19, #0x30]
00883e5c	lsr x10,x9,#0x4
00883e60	eor x10,x10,x9, LSR #0x9
00883e64	mul x10,x10,x21
00883e68	lsr x11,x10,x11
00883e6c	ldr x10,[x19, #0x18]
00883e70	lsr x12,x11,#0x6
00883e74	ldr x12,[x10, x12, LSL #0x3]
00883e78	lsr x12,x12,x11
00883e7c	tbz w12,#0x0,0x00883eb0
00883e80	ldr x12,[x19]
00883e84	sub x13,x8,#0x1
00883e88	lsl x14,x11,#0x4
00883e8c	ldr x14,[x12, x14#0x0]
00883e90	cmp x14,x9
00883e94	b.eq 0x00883ebc
00883e98	add x11,x11,#0x1
00883e9c	and x11,x11,x13
00883ea0	lsr x14,x11,#0x6
00883ea4	ldr x14,[x10, x14, LSL #0x3]
00883ea8	lsr x14,x14,x11
00883eac	tbnz w14,#0x0,0x00883e88
00883eb0	mov x0,x19
00883eb4	bl 0x00883f60
00883eb8	ldr x8,[x19, #0x20]
00883ebc	ldr x10,[x20]
00883ec0	ldrb w11,[x19, #0x30]
00883ec4	ldr x12,[x19, #0x18]
00883ec8	lsr x9,x10,#0x4
00883ecc	eor x9,x9,x10, LSR #0x9
00883ed0	mul x9,x9,x21
00883ed4	lsr x9,x9,x11
00883ed8	mov w11,#0x1
00883edc	lsr x13,x9,#0x6
00883ee0	lsl x15,x11,x9
00883ee4	ldr x11,[x19]
00883ee8	ldr x14,[x12, x13, LSL #0x3]
00883eec	tst x15,x14
00883ef0	b.eq 0x00883f28
00883ef4	sub x8,x8,#0x1
00883ef8	mov w16,#0x1
00883efc	lsl x13,x9,#0x4
00883f00	ldr x13,[x11, x13#0x0]
00883f04	cmp x13,x10
00883f08	b.eq 0x00883f48
00883f0c	add x9,x9,#0x1
00883f10	and x9,x9,x8
00883f14	lsr x13,x9,#0x6
00883f18	lsl x15,x16,x9
00883f1c	ldr x14,[x12, x13, LSL #0x3]
00883f20	tst x14,x15
00883f24	b.ne 0x00883efc
00883f28	add x8,x11,x9, LSL #0x4
00883f2c	orr x14,x14,x15
00883f30	str x14,[x12, x13, LSL #0x3]
00883f34	strh wzr,[x8, #0x8]
00883f38	ldr x12,[x19, #0x28]
00883f3c	str x10,[x8]
00883f40	add x8,x12,#0x1
00883f44	str x8,[x19, #0x28]
00883f48	add x8,x11,x9, LSL #0x4
00883f4c	add x0,x8,#0x8
00883f50	ldp x20,x19,[sp, #0x20]
00883f54	ldr x21,[sp, #0x10]
00883f58	ldp x29,x30,[sp], #0x30
00883f5c	ret
