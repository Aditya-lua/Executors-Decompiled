; FUN_0089b01c @ 0089b01c
0089b01c	ldp x9,x8,[x0, #0x20]
0089b020	add x10,x9,x9, LSL #0x1
0089b024	cmp x8,x10, LSR #0x2
0089b028	b.cs 0x0089b030
0089b02c	ret
0089b030	cbz x8,0x0089b0d0
0089b034	ldr x8,[x1]
0089b038	mov x12,#0x2d69
0089b03c	movk x12,#0xeb38, LSL #16
0089b040	lsl w10,w8,#0x3
0089b044	lsr x11,x8,#0x20
0089b048	movk x12,#0xea08, LSL #32
0089b04c	movk x12,#0x9ddf, LSL #48
0089b050	add x10,x10,#0x8
0089b054	eor x10,x10,x11
0089b058	mul x10,x10,x12
0089b05c	eor x11,x11,x10, LSR #0x2f
0089b060	eor x10,x11,x10
0089b064	mov x11,#0x959d
0089b068	mul x10,x10,x12
0089b06c	movk x11,#0xb8f4, LSL #16
0089b070	movk x11,#0xd34f, LSL #32
0089b074	movk x11,#0x949d, LSL #48
0089b078	eor x10,x10,x10, LSR #0x2f
0089b07c	mul x10,x10,x11
0089b080	ldrb w11,[x0, #0x30]
0089b084	lsr x11,x10,x11
0089b088	ldr x10,[x0, #0x18]
0089b08c	lsr x12,x11,#0x6
0089b090	ldr x12,[x10, x12, LSL #0x3]
0089b094	lsr x12,x12,x11
0089b098	tbz w12,#0x0,0x0089b0d0
0089b09c	ldr x12,[x0]
0089b0a0	sub x9,x9,#0x1
0089b0a4	mov w13,#0x50
0089b0a8	mul x14,x11,x13
0089b0ac	ldr x14,[x12, x14#0x0]
0089b0b0	cmp x14,x8
0089b0b4	b.eq 0x0089b02c
0089b0b8	add x11,x11,#0x1
0089b0bc	and x11,x11,x9
0089b0c0	lsr x14,x11,#0x6
0089b0c4	ldr x14,[x10, x14, LSL #0x3]
0089b0c8	lsr x14,x14,x11
0089b0cc	tbnz w14,#0x0,0x0089b0a8
0089b0d0	b 0x0089b0d4
0089b0d4	sub sp,sp,#0x90
0089b0d8	stp x29,x30,[sp, #0x40]
0089b0dc	str x25,[sp, #0x50]
0089b0e0	stp x24,x23,[sp, #0x60]
0089b0e4	stp x22,x21,[sp, #0x70]
0089b0e8	stp x20,x19,[sp, #0x80]
0089b0ec	add x29,sp,#0x40
0089b0f0	mrs x22,tpidr_el0
0089b0f4	mov w10,#0x10
0089b0f8	mov x19,x0
0089b0fc	ldr x8,[x22, #0x28]
0089b100	stur x8,[x29, #-0x8]
0089b104	ldr x8,[x0, #0x20]
0089b108	stp xzr,xzr,[sp, #0x10]
0089b10c	lsl x9,x8,#0x1
0089b110	cmp x8,#0x0
0089b114	csel x23,x10,x9,eq
0089b118	str x23,[sp, #0x8]
0089b11c	cbz x23,0x0089b190
0089b120	cmp x23,#0x40
0089b124	mov w24,#0x40
0089b128	csel x8,x23,x24,hi
0089b12c	lsr x8,x8,#0x6
0089b130	lsl x21,x8,#0x3
0089b134	str x8,[sp, #0x10]
0089b138	mov x0,x21
0089b13c	bl 0x00c2fed0
0089b140	mov w1,wzr
0089b144	mov x2,x21
0089b148	mov x20,x0
0089b14c	str x0,[sp, #0x18]
0089b150	bl 0x00c301c0
0089b154	add x8,x23,x23, LSL #0x2
0089b158	str xzr,[sp, #0x28]
0089b15c	lsl x0,x8,#0x4
0089b160	bl 0x00c2fed0
0089b164	rbit x8,x23
0089b168	sub x9,x23,#0x1
0089b16c	str x0,[sp]
0089b170	str x23,[sp, #0x20]
0089b174	clz x8,x8
0089b178	sub w8,w24,w8
0089b17c	strb w8,[sp, #0x30]
0089b180	and x8,x8,#0xff
0089b184	ldp x21,x23,[x19, #0x10]
0089b188	cbnz x21,0x0089b1b0
0089b18c	b 0x0089b364
0089b190	mov w8,#0x40
0089b194	mov x0,xzr
0089b198	mov x20,xzr
0089b19c	stp xzr,xzr,[sp, #0x20]
0089b1a0	mov x9,#-0x1
0089b1a4	strb w8,[sp, #0x30]
0089b1a8	ldp x21,x23,[x19, #0x10]
0089b1ac	cbz x21,0x0089b364
0089b1b0	ldr x10,[x23]
0089b1b4	cbz x10,0x0089b1c0
0089b1b8	mov x12,xzr
0089b1bc	b 0x0089b1dc
0089b1c0	mov w11,#0x1
0089b1c4	cmp x21,x11
0089b1c8	b.eq 0x0089b364
0089b1cc	ldr x10,[x23, x11, LSL #0x3]
0089b1d0	add x11,x11,#0x1
0089b1d4	cbz x10,0x0089b1c4
0089b1d8	sub x12,x11,#0x1
0089b1dc	rbit x13,x10
0089b1e0	mov x16,#0x959d
0089b1e4	mov x11,xzr
0089b1e8	movk x16,#0xb8f4, LSL #16
0089b1ec	mov w15,#0x50
0089b1f0	mov w17,#0x1
0089b1f4	clz x14,x13
0089b1f8	mov x13,#0x2d69
0089b1fc	movk x16,#0xd34f, LSL #32
0089b200	movk x13,#0xeb38, LSL #16
0089b204	orr x1,x14,x12, LSL #0x6
0089b208	add x14,x23,#0x8
0089b20c	movk x13,#0xea08, LSL #32
0089b210	movk x16,#0x949d, LSL #48
0089b214	movk x13,#0x9ddf, LSL #48
0089b218	ldr x2,[x19]
0089b21c	nop
0089b220	madd x2,x1,x15,x2
0089b224	ldr x3,[x2]
0089b228	lsl w4,w3,#0x3
0089b22c	lsr x5,x3,#0x20
0089b230	add x4,x4,#0x8
0089b234	eor x4,x4,x5
0089b238	mul x4,x4,x13
0089b23c	eor x5,x5,x4, LSR #0x2f
0089b240	eor x4,x5,x4
0089b244	mul x4,x4,x13
0089b248	eor x4,x4,x4, LSR #0x2f
0089b24c	mul x4,x4,x16
0089b250	lsr x4,x4,x8
0089b254	lsr x5,x4,#0x6
0089b258	lsl x6,x17,x4
0089b25c	ldr x7,[x20, x5, LSL #0x3]
0089b260	tst x6,x7
0089b264	b.eq 0x0089b2a4
0089b268	mul x5,x4,x15
0089b26c	ldr x5,[x0, x5#0x0]
0089b270	cmp x5,x3
0089b274	b.eq 0x0089b298
0089b278	add x4,x4,#0x1
0089b27c	and x4,x4,x9
0089b280	lsr x5,x4,#0x6
0089b284	lsl x6,x17,x4
0089b288	ldr x7,[x20, x5, LSL #0x3]
0089b28c	tst x7,x6
0089b290	b.ne 0x0089b268
0089b294	b 0x0089b2a0
0089b298	lsr x5,x4,#0x6
0089b29c	lsl x6,x17,x4
0089b2a0	ldr x7,[x20, x5, LSL #0x3]
0089b2a4	nop
0089b2a8	madd x4,x4,x15,x0
0089b2ac	orr x6,x7,x6
0089b2b0	str x6,[x20, x5, LSL #0x3]
0089b2b4	ldr w5,[x2, #0x8]
0089b2b8	add x11,x11,#0x1
0089b2bc	str x11,[sp, #0x28]
0089b2c0	stp xzr,xzr,[x4, #0x18]
0089b2c4	str xzr,[x4, #0x10]
0089b2c8	ldr q0,[x2, #0x10]
0089b2cc	str x3,[x4]
0089b2d0	str w5,[x4, #0x8]
0089b2d4	sub x5,x10,#0x1
0089b2d8	str q0,[x4, #0x10]
0089b2dc	ands x10,x5,x10
0089b2e0	ldr x3,[x2, #0x20]
0089b2e4	str x3,[x4, #0x20]
0089b2e8	ldrb w3,[x2, #0x48]
0089b2ec	ldur q0,[x2, #0x38]
0089b2f0	ldur q1,[x2, #0x28]
0089b2f4	stp xzr,xzr,[x2, #0x10]
0089b2f8	str xzr,[x2, #0x20]
0089b2fc	strb w3,[x4, #0x48]
0089b300	stur q0,[x4, #0x38]
0089b304	stur q1,[x4, #0x28]
0089b308	b.ne 0x0089b334
0089b30c	add x10,x12,#0x1
0089b310	cmp x21,x10
0089b314	csinc x2,x21,x12,hi
0089b318	add x3,x12,#0x1
0089b31c	cmp x3,x21
0089b320	b.cs 0x0089b350
0089b324	ldr x10,[x14, x12, LSL #0x3]
0089b328	mov x12,x3
0089b32c	cbz x10,0x0089b318
0089b330	mov x12,x3
0089b334	rbit x1,x10
0089b338	clz x1,x1
0089b33c	orr x1,x1,x12, LSL #0x6
0089b340	cbnz x10,0x0089b218
0089b344	cmp x12,x21
0089b348	b.ne 0x0089b218
0089b34c	b 0x0089b360
0089b350	mov x10,xzr
0089b354	mov x12,x2
0089b358	cbz x10,0x0089b344
0089b35c	b 0x0089b218
0089b360	ldp x21,x23,[x19, #0x10]
0089b364	ldp x8,x24,[x19]
0089b368	mov x9,sp
0089b36c	cmp x19,x9
0089b370	stp x0,xzr,[x19]
0089b374	stp xzr,xzr,[x19, #0x10]
0089b378	str x8,[sp]
0089b37c	b.eq 0x0089b3a8
0089b380	mov x0,xzr
0089b384	mov x25,sp
0089b388	bl 0x00c301d0
0089b38c	ldr x8,[sp, #0x18]
0089b390	ldur q0,[sp, #0x8]
0089b394	mov x20,xzr
0089b398	stp xzr,xzr,[x25, #0x10]
0089b39c	str x8,[x19, #0x18]
0089b3a0	stur q0,[x19, #0x8]
0089b3a4	stur xzr,[x25, #0x8]
0089b3a8	mov x0,x20
0089b3ac	bl 0x00c301d0
0089b3b0	mov x0,xzr
0089b3b4	stp x21,x23,[sp, #0x10]
0089b3b8	str x24,[sp, #0x8]
0089b3bc	bl 0x00c301d0
0089b3c0	ldr x8,[sp, #0x20]
0089b3c4	ldr x9,[x19, #0x20]
0089b3c8	ldrb w10,[sp, #0x30]
0089b3cc	ldr x11,[sp]
0089b3d0	str x8,[x19, #0x20]
0089b3d4	ldrb w8,[x19, #0x30]
0089b3d8	str x9,[sp, #0x20]
0089b3dc	strb w10,[x19, #0x30]
0089b3e0	strb w8,[sp, #0x30]
0089b3e4	cbz x11,0x0089b3f0
0089b3e8	mov x0,sp
0089b3ec	bl 0x00882ff0
0089b3f0	ldr x0,[sp, #0x18]
0089b3f4	bl 0x00c301d0
0089b3f8	ldr x8,[x22, #0x28]
0089b3fc	ldur x9,[x29, #-0x8]
0089b400	cmp x8,x9
0089b404	b.ne 0x0089b44c
0089b408	ldp x20,x19,[sp, #0x80]
0089b40c	ldr x25,[sp, #0x50]
0089b410	ldp x22,x21,[sp, #0x70]
0089b414	ldp x24,x23,[sp, #0x60]
0089b418	ldp x29,x30,[sp, #0x40]
0089b41c	add sp,sp,#0x90
0089b420	ret
0089b44c	bl 0x00c2fec0
