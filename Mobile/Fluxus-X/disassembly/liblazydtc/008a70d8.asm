; FUN_008a70d8 @ 008a70d8
008a70d8	ldp x9,x8,[x0, #0x20]
008a70dc	add x10,x9,x9, LSL #0x1
008a70e0	cmp x8,x10, LSR #0x2
008a70e4	b.cs 0x008a70ec
008a70e8	ret
008a70ec	cbz x8,0x008a7188
008a70f0	ldr x8,[x1]
008a70f4	mov x12,#0x2d69
008a70f8	movk x12,#0xeb38, LSL #16
008a70fc	lsl w10,w8,#0x3
008a7100	lsr x11,x8,#0x20
008a7104	movk x12,#0xea08, LSL #32
008a7108	movk x12,#0x9ddf, LSL #48
008a710c	add x10,x10,#0x8
008a7110	eor x10,x10,x11
008a7114	mul x10,x10,x12
008a7118	eor x11,x11,x10, LSR #0x2f
008a711c	eor x10,x11,x10
008a7120	mov x11,#0x959d
008a7124	mul x10,x10,x12
008a7128	movk x11,#0xb8f4, LSL #16
008a712c	movk x11,#0xd34f, LSL #32
008a7130	movk x11,#0x949d, LSL #48
008a7134	eor x10,x10,x10, LSR #0x2f
008a7138	mul x10,x10,x11
008a713c	ldrb w11,[x0, #0x30]
008a7140	lsr x11,x10,x11
008a7144	ldr x10,[x0, #0x18]
008a7148	lsr x12,x11,#0x6
008a714c	ldr x12,[x10, x12, LSL #0x3]
008a7150	lsr x12,x12,x11
008a7154	tbz w12,#0x0,0x008a7188
008a7158	ldr x12,[x0]
008a715c	sub x9,x9,#0x1
008a7160	lsl x13,x11,#0x4
008a7164	ldr x13,[x12, x13#0x0]
008a7168	cmp x13,x8
008a716c	b.eq 0x008a70e8
008a7170	add x11,x11,#0x1
008a7174	and x11,x11,x9
008a7178	lsr x13,x11,#0x6
008a717c	ldr x13,[x10, x13, LSL #0x3]
008a7180	lsr x13,x13,x11
008a7184	tbnz w13,#0x0,0x008a7160
008a7188	b 0x008a718c
008a718c	stp x29,x30,[sp, #-0x50]!
008a7190	str x25,[sp, #0x10]
008a7194	stp x24,x23,[sp, #0x20]
008a7198	stp x22,x21,[sp, #0x30]
008a719c	stp x20,x19,[sp, #0x40]
008a71a0	mov x29,sp
008a71a4	ldr x9,[x0, #0x20]
008a71a8	mov w8,#0x10
008a71ac	mov x19,x0
008a71b0	lsl x10,x9,#0x1
008a71b4	cmp x9,#0x0
008a71b8	csel x23,x8,x10,eq
008a71bc	cbz x23,0x008a720c
008a71c0	cmp x23,#0x40
008a71c4	mov w22,#0x40
008a71c8	csel x8,x23,x22,hi
008a71cc	lsr x24,x8,#0x6
008a71d0	lsl x21,x24,#0x3
008a71d4	mov x0,x21
008a71d8	bl 0x00c2fed0
008a71dc	mov w1,wzr
008a71e0	mov x2,x21
008a71e4	mov x20,x0
008a71e8	bl 0x00c301c0
008a71ec	lsl x0,x23,#0x4
008a71f0	bl 0x00c2fed0
008a71f4	rbit x8,x23
008a71f8	clz x8,x8
008a71fc	sub w25,w22,w8
008a7200	ldp x8,x21,[x19, #0x10]
008a7204	cbnz x8,0x008a7224
008a7208	b 0x008a7388
008a720c	mov x24,xzr
008a7210	mov x20,xzr
008a7214	mov x0,xzr
008a7218	mov w25,#0x40
008a721c	ldp x8,x21,[x19, #0x10]
008a7220	cbz x8,0x008a7388
008a7224	ldr x10,[x21]
008a7228	cbz x10,0x008a7234
008a722c	mov x9,xzr
008a7230	b 0x008a7254
008a7234	mov x9,xzr
008a7238	add x11,x21,#0x8
008a723c	sub x12,x8,#0x1
008a7240	cmp x12,x9
008a7244	b.eq 0x008a7388
008a7248	ldr x10,[x11, x9, LSL #0x3]
008a724c	add x9,x9,#0x1
008a7250	cbz x10,0x008a7240
008a7254	rbit x12,x10
008a7258	mov x11,#0x2d69
008a725c	mov x15,#0x959d
008a7260	movk x11,#0xeb38, LSL #16
008a7264	movk x15,#0xb8f4, LSL #16
008a7268	ldr x22,[x19]
008a726c	clz x12,x12
008a7270	movk x11,#0xea08, LSL #32
008a7274	movk x15,#0xd34f, LSL #32
008a7278	orr x17,x12,x9, LSL #0x6
008a727c	movk x11,#0x9ddf, LSL #48
008a7280	sub x12,x23,#0x1
008a7284	and x13,x25,#0xff
008a7288	add x14,x21,#0x8
008a728c	movk x15,#0x949d, LSL #48
008a7290	mov w16,#0x1
008a7294	add x1,x22,x17, LSL #0x4
008a7298	ldr x5,[x1]
008a729c	lsl w2,w5,#0x3
008a72a0	lsr x3,x5,#0x20
008a72a4	add x2,x2,#0x8
008a72a8	eor x2,x2,x3
008a72ac	mul x2,x2,x11
008a72b0	eor x3,x3,x2, LSR #0x2f
008a72b4	eor x2,x3,x2
008a72b8	mul x2,x2,x11
008a72bc	eor x2,x2,x2, LSR #0x2f
008a72c0	mul x2,x2,x15
008a72c4	lsr x2,x2,x13
008a72c8	lsr x3,x2,#0x6
008a72cc	lsl x4,x16,x2
008a72d0	ldr x6,[x20, x3, LSL #0x3]
008a72d4	tst x4,x6
008a72d8	b.eq 0x008a7318
008a72dc	lsl x3,x2,#0x4
008a72e0	ldr x3,[x0, x3#0x0]
008a72e4	cmp x3,x5
008a72e8	b.eq 0x008a730c
008a72ec	add x2,x2,#0x1
008a72f0	and x2,x2,x12
008a72f4	lsr x3,x2,#0x6
008a72f8	lsl x4,x16,x2
008a72fc	ldr x6,[x20, x3, LSL #0x3]
008a7300	tst x6,x4
008a7304	b.ne 0x008a72dc
008a7308	b 0x008a7314
008a730c	lsr x3,x2,#0x6
008a7310	lsl x4,x16,x2
008a7314	ldr x6,[x20, x3, LSL #0x3]
008a7318	orr x4,x6,x4
008a731c	str x4,[x20, x3, LSL #0x3]
008a7320	sub x3,x10,#0x1
008a7324	ldr q0,[x1]
008a7328	ands x10,x3,x10
008a732c	str q0,[x0,x2, lsl #4]
008a7330	b.ne 0x008a735c
008a7334	add x10,x9,#0x1
008a7338	cmp x8,x10
008a733c	csinc x1,x8,x9,hi
008a7340	add x2,x9,#0x1
008a7344	cmp x2,x8
008a7348	b.cs 0x008a7378
008a734c	ldr x10,[x14, x9, LSL #0x3]
008a7350	mov x9,x2
008a7354	cbz x10,0x008a7340
008a7358	mov x9,x2
008a735c	rbit x17,x10
008a7360	clz x17,x17
008a7364	orr x17,x17,x9, LSL #0x6
008a7368	cbnz x10,0x008a7294
008a736c	cmp x9,x8
008a7370	b.ne 0x008a7294
008a7374	b 0x008a738c
008a7378	mov x10,xzr
008a737c	mov x9,x1
008a7380	cbz x10,0x008a736c
008a7384	b 0x008a7294
008a7388	ldr x22,[x19]
008a738c	stp x0,xzr,[x19]
008a7390	mov x0,xzr
008a7394	stp xzr,xzr,[x19, #0x10]
008a7398	bl 0x00c301d0
008a739c	mov x0,xzr
008a73a0	stp x24,x20,[x19, #0x10]
008a73a4	str x23,[x19, #0x8]
008a73a8	bl 0x00c301d0
008a73ac	mov x0,xzr
008a73b0	bl 0x00c301d0
008a73b4	str x23,[x19, #0x20]
008a73b8	strb w25,[x19, #0x30]
008a73bc	cbz x22,0x008a73dc
008a73c0	mov x0,x22
008a73c4	bl 0x00c301d0
008a73c8	mov x0,x21
008a73cc	bl 0x00c301d0
008a73d0	mov x0,xzr
008a73d4	bl 0x00c301d0
008a73d8	mov x21,xzr
008a73dc	mov x0,x21
008a73e0	ldp x20,x19,[sp, #0x40]
008a73e4	ldr x25,[sp, #0x10]
008a73e8	ldp x22,x21,[sp, #0x30]
008a73ec	ldp x24,x23,[sp, #0x20]
008a73f0	ldp x29,x30,[sp], #0x50
008a73f4	b 0x00c301d0
