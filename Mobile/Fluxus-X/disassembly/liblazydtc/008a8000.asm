; FUN_008a8000 @ 008a8000
008a8000	ldp x9,x8,[x0, #0x20]
008a8004	add x10,x9,x9, LSL #0x1
008a8008	cmp x8,x10, LSR #0x2
008a800c	b.cs 0x008a8014
008a8010	ret
008a8014	cbz x8,0x008a80b0
008a8018	ldr x8,[x1]
008a801c	mov x12,#0x2d69
008a8020	movk x12,#0xeb38, LSL #16
008a8024	lsl w10,w8,#0x3
008a8028	lsr x11,x8,#0x20
008a802c	movk x12,#0xea08, LSL #32
008a8030	movk x12,#0x9ddf, LSL #48
008a8034	add x10,x10,#0x8
008a8038	eor x10,x10,x11
008a803c	mul x10,x10,x12
008a8040	eor x11,x11,x10, LSR #0x2f
008a8044	eor x10,x11,x10
008a8048	mov x11,#0x959d
008a804c	mul x10,x10,x12
008a8050	movk x11,#0xb8f4, LSL #16
008a8054	movk x11,#0xd34f, LSL #32
008a8058	movk x11,#0x949d, LSL #48
008a805c	eor x10,x10,x10, LSR #0x2f
008a8060	mul x10,x10,x11
008a8064	ldrb w11,[x0, #0x30]
008a8068	lsr x11,x10,x11
008a806c	ldr x10,[x0, #0x18]
008a8070	lsr x12,x11,#0x6
008a8074	ldr x12,[x10, x12, LSL #0x3]
008a8078	lsr x12,x12,x11
008a807c	tbz w12,#0x0,0x008a80b0
008a8080	ldr x12,[x0]
008a8084	sub x9,x9,#0x1
008a8088	lsl x13,x11,#0x4
008a808c	ldr x13,[x12, x13#0x0]
008a8090	cmp x13,x8
008a8094	b.eq 0x008a8010
008a8098	add x11,x11,#0x1
008a809c	and x11,x11,x9
008a80a0	lsr x13,x11,#0x6
008a80a4	ldr x13,[x10, x13, LSL #0x3]
008a80a8	lsr x13,x13,x11
008a80ac	tbnz w13,#0x0,0x008a8088
008a80b0	b 0x008a80b4
008a80b4	stp x29,x30,[sp, #-0x50]!
008a80b8	str x25,[sp, #0x10]
008a80bc	stp x24,x23,[sp, #0x20]
008a80c0	stp x22,x21,[sp, #0x30]
008a80c4	stp x20,x19,[sp, #0x40]
008a80c8	mov x29,sp
008a80cc	ldr x9,[x0, #0x20]
008a80d0	mov w8,#0x10
008a80d4	mov x19,x0
008a80d8	lsl x10,x9,#0x1
008a80dc	cmp x9,#0x0
008a80e0	csel x23,x8,x10,eq
008a80e4	cbz x23,0x008a8134
008a80e8	cmp x23,#0x40
008a80ec	mov w22,#0x40
008a80f0	csel x8,x23,x22,hi
008a80f4	lsr x24,x8,#0x6
008a80f8	lsl x21,x24,#0x3
008a80fc	mov x0,x21
008a8100	bl 0x00c2fed0
008a8104	mov w1,wzr
008a8108	mov x2,x21
008a810c	mov x20,x0
008a8110	bl 0x00c301c0
008a8114	lsl x0,x23,#0x4
008a8118	bl 0x00c2fed0
008a811c	rbit x8,x23
008a8120	clz x8,x8
008a8124	sub w25,w22,w8
008a8128	ldp x8,x21,[x19, #0x10]
008a812c	cbnz x8,0x008a814c
008a8130	b 0x008a82b0
008a8134	mov x24,xzr
008a8138	mov x20,xzr
008a813c	mov x0,xzr
008a8140	mov w25,#0x40
008a8144	ldp x8,x21,[x19, #0x10]
008a8148	cbz x8,0x008a82b0
008a814c	ldr x10,[x21]
008a8150	cbz x10,0x008a815c
008a8154	mov x9,xzr
008a8158	b 0x008a817c
008a815c	mov x9,xzr
008a8160	add x11,x21,#0x8
008a8164	sub x12,x8,#0x1
008a8168	cmp x12,x9
008a816c	b.eq 0x008a82b0
008a8170	ldr x10,[x11, x9, LSL #0x3]
008a8174	add x9,x9,#0x1
008a8178	cbz x10,0x008a8168
008a817c	rbit x12,x10
008a8180	mov x11,#0x2d69
008a8184	mov x15,#0x959d
008a8188	movk x11,#0xeb38, LSL #16
008a818c	movk x15,#0xb8f4, LSL #16
008a8190	ldr x22,[x19]
008a8194	clz x12,x12
008a8198	movk x11,#0xea08, LSL #32
008a819c	movk x15,#0xd34f, LSL #32
008a81a0	orr x17,x12,x9, LSL #0x6
008a81a4	movk x11,#0x9ddf, LSL #48
008a81a8	sub x12,x23,#0x1
008a81ac	and x13,x25,#0xff
008a81b0	add x14,x21,#0x8
008a81b4	movk x15,#0x949d, LSL #48
008a81b8	mov w16,#0x1
008a81bc	add x1,x22,x17, LSL #0x4
008a81c0	ldr x5,[x1]
008a81c4	lsl w2,w5,#0x3
008a81c8	lsr x3,x5,#0x20
008a81cc	add x2,x2,#0x8
008a81d0	eor x2,x2,x3
008a81d4	mul x2,x2,x11
008a81d8	eor x3,x3,x2, LSR #0x2f
008a81dc	eor x2,x3,x2
008a81e0	mul x2,x2,x11
008a81e4	eor x2,x2,x2, LSR #0x2f
008a81e8	mul x2,x2,x15
008a81ec	lsr x2,x2,x13
008a81f0	lsr x3,x2,#0x6
008a81f4	lsl x4,x16,x2
008a81f8	ldr x6,[x20, x3, LSL #0x3]
008a81fc	tst x4,x6
008a8200	b.eq 0x008a8240
008a8204	lsl x3,x2,#0x4
008a8208	ldr x3,[x0, x3#0x0]
008a820c	cmp x3,x5
008a8210	b.eq 0x008a8234
008a8214	add x2,x2,#0x1
008a8218	and x2,x2,x12
008a821c	lsr x3,x2,#0x6
008a8220	lsl x4,x16,x2
008a8224	ldr x6,[x20, x3, LSL #0x3]
008a8228	tst x6,x4
008a822c	b.ne 0x008a8204
008a8230	b 0x008a823c
008a8234	lsr x3,x2,#0x6
008a8238	lsl x4,x16,x2
008a823c	ldr x6,[x20, x3, LSL #0x3]
008a8240	orr x4,x6,x4
008a8244	str x4,[x20, x3, LSL #0x3]
008a8248	sub x3,x10,#0x1
008a824c	ldr q0,[x1]
008a8250	ands x10,x3,x10
008a8254	str q0,[x0,x2, lsl #4]
008a8258	b.ne 0x008a8284
008a825c	add x10,x9,#0x1
008a8260	cmp x8,x10
008a8264	csinc x1,x8,x9,hi
008a8268	add x2,x9,#0x1
008a826c	cmp x2,x8
008a8270	b.cs 0x008a82a0
008a8274	ldr x10,[x14, x9, LSL #0x3]
008a8278	mov x9,x2
008a827c	cbz x10,0x008a8268
008a8280	mov x9,x2
008a8284	rbit x17,x10
008a8288	clz x17,x17
008a828c	orr x17,x17,x9, LSL #0x6
008a8290	cbnz x10,0x008a81bc
008a8294	cmp x9,x8
008a8298	b.ne 0x008a81bc
008a829c	b 0x008a82b4
008a82a0	mov x10,xzr
008a82a4	mov x9,x1
008a82a8	cbz x10,0x008a8294
008a82ac	b 0x008a81bc
008a82b0	ldr x22,[x19]
008a82b4	stp x0,xzr,[x19]
008a82b8	mov x0,xzr
008a82bc	stp xzr,xzr,[x19, #0x10]
008a82c0	bl 0x00c301d0
008a82c4	mov x0,xzr
008a82c8	stp x24,x20,[x19, #0x10]
008a82cc	str x23,[x19, #0x8]
008a82d0	bl 0x00c301d0
008a82d4	mov x0,xzr
008a82d8	bl 0x00c301d0
008a82dc	str x23,[x19, #0x20]
008a82e0	strb w25,[x19, #0x30]
008a82e4	cbz x22,0x008a8304
008a82e8	mov x0,x22
008a82ec	bl 0x00c301d0
008a82f0	mov x0,x21
008a82f4	bl 0x00c301d0
008a82f8	mov x0,xzr
008a82fc	bl 0x00c301d0
008a8300	mov x21,xzr
008a8304	mov x0,x21
008a8308	ldp x20,x19,[sp, #0x40]
008a830c	ldr x25,[sp, #0x10]
008a8310	ldp x22,x21,[sp, #0x30]
008a8314	ldp x24,x23,[sp, #0x20]
008a8318	ldp x29,x30,[sp], #0x50
008a831c	b 0x00c301d0
