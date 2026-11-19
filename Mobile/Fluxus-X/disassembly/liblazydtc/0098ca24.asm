; ix::WebSocket::WebSocket @ 0098ca24
0098ca24	sub sp,sp,#0xe0
0098ca28	stp x28,x27,[sp, #0x80]
0098ca2c	stp x26,x25,[sp, #0x90]
0098ca30	stp x24,x23,[sp, #0xa0]
0098ca34	stp x22,x21,[sp, #0xb0]
0098ca38	stp x20,x19,[sp, #0xc0]
0098ca3c	stp x29,x30,[sp, #0xd0]
0098ca40	add x29,sp,#0xd0
0098ca44	mrs x28,tpidr_el0
0098ca48	ldr x8,[x28, #0x28]
0098ca4c	mov x19,x0
0098ca50	stur x8,[x29, #-0x58]
0098ca54	bl 0x00c338e0
0098ca58	str xzr,[x19, #0x2f0]
0098ca5c	movi v0.2D,#0x0
0098ca60	add x24,x19,#0x300
0098ca64	adrp x8,0xcb5000
0098ca68	ldr x8,[x8, #0x30]
0098ca6c	str q0,[x19, #0x2e0]
0098ca70	str q0,[x19, #0x300]
0098ca74	str x24,[x19, #0x2f8]
0098ca78	adrp x9,0xcb5000
0098ca7c	ldr x9,[x9, #0x38]
0098ca80	add x0,x19,#0x310
0098ca84	ldrb w4,[x8]
0098ca88	ldrb w5,[x9]
0098ca8c	mov w1,wzr
0098ca90	mov w2,wzr
0098ca94	mov w3,wzr
0098ca98	bl 0x00c33900
0098ca9c	add x25,x19,#0x318
0098caa0	add x8,x19,#0x348
0098caa4	mov w2,#0x48
0098caa8	mov x0,x25
0098caac	mov w1,wzr
0098cab0	str x8,[sp, #0x30]
0098cab4	bl 0x00c301c0
0098cab8	mov w12,#0x5953
0098cabc	orr w8,wzr,#0xc
0098cac0	add x9,x19,#0x349
0098cac4	movk w12,#0x5453, LSL #16
0098cac8	add x13,x19,#0x360
0098cacc	add x10,x19,#0x34d
0098cad0	mov w11,#0x4d45
0098cad4	str x13,[sp, #0x28]
0098cad8	add x13,x19,#0x368
0098cadc	strb w8,[x19, #0x348]
0098cae0	str w12,[x9]
0098cae4	mov w12,#0x4544
0098cae8	movi v0.2D,#0x0
0098caec	orr w14,wzr,#0xe
0098caf0	add x8,x19,#0x361
0098caf4	strh w11,[x10]
0098caf8	add x11,x19,#0x365
0098cafc	mov w9,#0x4c55
0098cb00	movk w12,#0x4146, LSL #16
0098cb04	strb wzr,[x19, #0x34f]
0098cb08	str q0,[x13]
0098cb0c	add x13,x19,#0x380
0098cb10	mov w10,#0x54
0098cb14	str x13,[sp, #0x20]
0098cb18	str xzr,[x19, #0x360]
0098cb1c	strb w14,[x19, #0x360]
0098cb20	add x13,x19,#0x3a0
0098cb24	strh w9,[x11]
0098cb28	add x9,x19,#0x410
0098cb2c	str w12,[x8]
0098cb30	add x8,x19,#0x428
0098cb34	str x13,[sp, #0x38]
0098cb38	add x20,x19,#0x408
0098cb3c	str x9,[sp, #0x18]
0098cb40	add x9,x19,#0x418
0098cb44	strb w10,[x19, #0x367]
0098cb48	strb wzr,[x19, #0x368]
0098cb4c	strh wzr,[x19, #0x378]
0098cb50	str xzr,[x19, #0x390]
0098cb54	str q0,[x19, #0x380]
0098cb58	strb wzr,[x19, #0x398]
0098cb5c	str xzr,[x19, #0x3c0]
0098cb60	stp q0,q0,[x19, #0x3a0]
0098cb64	str xzr,[x19, #0x3f0]
0098cb68	strb wzr,[x19, #0x400]
0098cb6c	str q0,[x8]
0098cb70	adrp x8,0x29b000
0098cb74	str q0,[x9]
0098cb78	str q0,[x20]
0098cb7c	ldr d0,[x8, #0xf70]
0098cb80	add x22,x19,#0x444
0098cb84	mov w21,#0x1
0098cb88	add x8,x19,#0x43c
0098cb8c	mov w2,#0x58
0098cb90	mov x0,x22
0098cb94	mov w1,wzr
0098cb98	strb w21,[x19, #0x438]
0098cb9c	str d0,[x8]
0098cba0	add x23,x19,#0x46c
0098cba4	bl 0x00c301c0
0098cba8	orr w8,wzr,#0x3c
0098cbac	str w8,[x19, #0x49c]
0098cbb0	mov w8,#0x2
0098cbb4	str w8,[x19, #0x4c8]
0098cbb8	adrp x8,0xc52000
0098cbbc	add x8,x8,#0x1b0
0098cbc0	strb w21,[x19, #0x4a0]
0098cbc4	mov w9,#0xffffffff
0098cbc8	strb w21,[x19, #0x4e8]
0098cbcc	add x21,x19,#0x4b0
0098cbd0	add x26,x19,#0x4d0
0098cbd4	add x8,x8,#0x10
0098cbd8	add x27,sp,#0x40
0098cbdc	str xzr,[x19, #0x4c0]
0098cbe0	str xzr,[x19, #0x4b8]
0098cbe4	str xzr,[x19, #0x4b0]
0098cbe8	str w9,[x19, #0x4a4]
0098cbec	str xzr,[x19, #0x4e0]
0098cbf0	str xzr,[x19, #0x4d8]
0098cbf4	str xzr,[x19, #0x4d0]
0098cbf8	stp x8,x19,[sp, #0x40]
0098cbfc	str x27,[sp, #0x60]
0098cc00	add x1,sp,#0x40
0098cc04	mov x0,x19
0098cc08	bl 0x00c33870
0098cc0c	ldr x0,[sp, #0x60]
0098cc10	cmp x27,x0
0098cc14	b.eq 0x0098cc28
0098cc18	cbz x0,0x0098cc34
0098cc1c	ldr x8,[x0]
0098cc20	ldr x8,[x8, #0x28]
0098cc24	b 0x0098cc30
0098cc28	ldr x8,[x0]
0098cc2c	ldr x8,[x8, #0x20]
0098cc30	blr x8
0098cc34	ldr x8,[x28, #0x28]
0098cc38	ldur x9,[x29, #-0x58]
0098cc3c	cmp x8,x9
0098cc40	b.ne 0x0098cc64
0098cc44	ldp x29,x30,[sp, #0xd0]
0098cc48	ldp x20,x19,[sp, #0xc0]
0098cc4c	ldp x22,x21,[sp, #0xb0]
0098cc50	ldp x24,x23,[sp, #0xa0]
0098cc54	ldp x26,x25,[sp, #0x90]
0098cc58	ldp x28,x27,[sp, #0x80]
0098cc5c	add sp,sp,#0xe0
0098cc60	ret
0098cc64	bl 0x00c2fec0
