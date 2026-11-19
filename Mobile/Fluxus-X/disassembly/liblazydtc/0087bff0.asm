; FUN_0087bff0 @ 0087bff0
0087bff0	sub sp,sp,#0xc0
0087bff4	stp x29,x30,[sp, #0x60]
0087bff8	stp x28,x27,[sp, #0x70]
0087bffc	stp x26,x25,[sp, #0x80]
0087c000	stp x24,x23,[sp, #0x90]
0087c004	stp x22,x21,[sp, #0xa0]
0087c008	stp x20,x19,[sp, #0xb0]
0087c00c	add x29,sp,#0x60
0087c010	mrs x24,tpidr_el0
0087c014	mov w10,#0x10
0087c018	ldr x8,[x24, #0x28]
0087c01c	stur x8,[x29, #-0x8]
0087c020	ldr x8,[x0, #0x20]
0087c024	stp xzr,xzr,[sp, #0x30]
0087c028	str x0,[sp, #0x10]
0087c02c	lsl x9,x8,#0x1
0087c030	cmp x8,#0x0
0087c034	csel x19,x10,x9,eq
0087c038	stp xzr,x19,[sp, #0x20]
0087c03c	cbz x19,0x0087c0a4
0087c040	cmp x19,#0x40
0087c044	mov w22,#0x40
0087c048	csel x8,x19,x22,hi
0087c04c	lsr x8,x8,#0x6
0087c050	lsl x21,x8,#0x3
0087c054	str x8,[sp, #0x30]
0087c058	mov x0,x21
0087c05c	bl 0x00c2fed0
0087c060	mov w1,wzr
0087c064	mov x2,x21
0087c068	mov x20,x0
0087c06c	str x0,[sp, #0x38]
0087c070	bl 0x00c301c0
0087c074	add x8,x19,x19, LSL #0x1
0087c078	str xzr,[sp, #0x48]
0087c07c	lsl x0,x8,#0x3
0087c080	bl 0x00c2fed0
0087c084	rbit x8,x19
0087c088	mov x21,x0
0087c08c	str x0,[sp, #0x20]
0087c090	ldr x0,[sp, #0x10]
0087c094	str x19,[sp, #0x40]
0087c098	clz x8,x8
0087c09c	sub w8,w22,w8
0087c0a0	b 0x0087c0b4
0087c0a4	mov w8,#0x40
0087c0a8	mov x20,xzr
0087c0ac	mov x21,xzr
0087c0b0	stp xzr,xzr,[sp, #0x40]
0087c0b4	strb w8,[sp, #0x50]
0087c0b8	ldp x9,x22,[x0, #0x10]
0087c0bc	str x9,[sp, #0x18]
0087c0c0	cbz x9,0x0087c29c
0087c0c4	ldr x26,[x22]
0087c0c8	cbz x26,0x0087c0d8
0087c0cc	str x24,[sp]
0087c0d0	mov x27,xzr
0087c0d4	b 0x0087c0f8
0087c0d8	mov w8,#0x1
0087c0dc	cmp x9,x8
0087c0e0	b.eq 0x0087c29c
0087c0e4	ldr x26,[x22, x8, LSL #0x3]
0087c0e8	add x8,x8,#0x1
0087c0ec	cbz x26,0x0087c0dc
0087c0f0	sub x27,x8,#0x1
0087c0f4	str x24,[sp]
0087c0f8	rbit x8,x26
0087c0fc	add x11,x22,#0x8
0087c100	ldr x22,[sp, #0x10]
0087c104	mov w24,#0x18
0087c108	str x11,[sp, #0x8]
0087c10c	clz x8,x8
0087c110	orr x12,x8,x27, LSL #0x6
0087c114	b 0x0087c12c
0087c118	mov x26,xzr
0087c11c	mov x27,x8
0087c120	cbnz x26,0x0087c12c
0087c124	cmp x27,x10
0087c128	b.eq 0x0087c284
0087c12c	ldr x8,[x22]
0087c130	nop
0087c134	madd x23,x12,x24,x8
0087c138	ldr x25,[sp, #0x40]
0087c13c	mov x28,x12
0087c140	ldp x0,x1,[x23]
0087c144	bl 0x008aa250
0087c148	mov x8,#0x7c15
0087c14c	ldrb w9,[sp, #0x50]
0087c150	ldr x20,[sp, #0x38]
0087c154	movk x8,#0x7f4a, LSL #16
0087c158	mov w10,#0x1
0087c15c	ldr x21,[sp, #0x20]
0087c160	movk x8,#0x79b9, LSL #32
0087c164	movk x8,#0x9e37, LSL #48
0087c168	mul x8,x0,x8
0087c16c	lsr x19,x8,x9
0087c170	lsr x8,x19,#0x6
0087c174	lsl x10,x10,x19
0087c178	ldr x9,[x20, x8, LSL #0x3]
0087c17c	tst x10,x9
0087c180	b.eq 0x0087c1f4
0087c184	ldp x22,x23,[x23]
0087c188	sub x25,x25,#0x1
0087c18c	b 0x0087c1b0
0087c190	cmp x0,x22
0087c194	b.eq 0x0087c1e0
0087c198	add x8,x19,#0x1
0087c19c	and x19,x8,x25
0087c1a0	lsr x8,x19,#0x6
0087c1a4	ldr x8,[x20, x8, LSL #0x3]
0087c1a8	lsr x8,x8,x19
0087c1ac	tbz w8,#0x0,0x0087c1e0
0087c1b0	madd x8,x19,x24,x21
0087c1b4	ldr x0,[x8]
0087c1b8	cmp x0,#0x0
0087c1bc	ccmp x22,#0x0,#0x4,ne
0087c1c0	b.eq 0x0087c190
0087c1c4	ldr x8,[x8, #0x8]
0087c1c8	cmp x8,x23
0087c1cc	b.ne 0x0087c198
0087c1d0	mov x1,x22
0087c1d4	mov x2,x23
0087c1d8	bl 0x00c300b0
0087c1dc	cbnz w0,0x0087c198
0087c1e0	lsr x8,x19,#0x6
0087c1e4	mov w10,#0x1
0087c1e8	ldr x22,[sp, #0x10]
0087c1ec	lsl x10,x10,x19
0087c1f0	ldr x9,[x20, x8, LSL #0x3]
0087c1f4	orr x9,x9,x10
0087c1f8	str x9,[x20, x8, LSL #0x3]
0087c1fc	ldr x8,[x22]
0087c200	nop
0087c204	madd x8,x28,x24,x8
0087c208	ldr x9,[sp, #0x48]
0087c20c	sub x11,x26,#0x1
0087c210	ands x26,x11,x26
0087c214	madd x10,x19,x24,x21
0087c218	add x9,x9,#0x1
0087c21c	str x9,[sp, #0x48]
0087c220	ldr x9,[x8, #0x10]
0087c224	ldr q0,[x8]
0087c228	str x9,[x10, #0x10]
0087c22c	str q0,[x10]
0087c230	b.eq 0x0087c23c
0087c234	ldr x10,[sp, #0x18]
0087c238	b 0x0087c270
0087c23c	ldr x10,[sp, #0x18]
0087c240	add x8,x27,#0x1
0087c244	ldr x11,[sp, #0x8]
0087c248	mov x12,x28
0087c24c	cmp x10,x8
0087c250	csinc x8,x10,x27,hi
0087c254	add x9,x27,#0x1
0087c258	cmp x9,x10
0087c25c	b.cs 0x0087c118
0087c260	ldr x26,[x11, x27, LSL #0x3]
0087c264	mov x27,x9
0087c268	cbz x26,0x0087c254
0087c26c	mov x27,x9
0087c270	rbit x8,x26
0087c274	clz x8,x8
0087c278	orr x12,x8,x27, LSL #0x6
0087c27c	cbz x26,0x0087c124
0087c280	b 0x0087c12c
0087c284	ldr x8,[x22, #0x10]
0087c288	mov x25,x22
0087c28c	ldr x22,[x22, #0x18]
0087c290	ldr x24,[sp]
0087c294	str x8,[sp, #0x18]
0087c298	b 0x0087c2a0
0087c29c	ldr x25,[sp, #0x10]
0087c2a0	ldp x8,x23,[x25]
0087c2a4	add x9,sp,#0x20
0087c2a8	cmp x25,x9
0087c2ac	add x19,sp,#0x20
0087c2b0	stp x21,xzr,[x25]
0087c2b4	stp xzr,xzr,[x25, #0x10]
0087c2b8	str x8,[sp, #0x20]
0087c2bc	b.eq 0x0087c2e4
0087c2c0	mov x0,xzr
0087c2c4	bl 0x00c301d0
0087c2c8	ldr x8,[sp, #0x38]
0087c2cc	ldur q0,[sp, #0x28]
0087c2d0	mov x20,xzr
0087c2d4	stp xzr,xzr,[x19, #0x10]
0087c2d8	str x8,[x25, #0x18]
0087c2dc	stur q0,[x25, #0x8]
0087c2e0	stur xzr,[x19, #0x8]
0087c2e4	mov x0,x20
0087c2e8	bl 0x00c301d0
0087c2ec	ldr x8,[sp, #0x18]
0087c2f0	mov x0,xzr
0087c2f4	str x23,[sp, #0x28]
0087c2f8	stp x8,x22,[sp, #0x30]
0087c2fc	bl 0x00c301d0
0087c300	ldr x8,[sp, #0x40]
0087c304	ldr x9,[x25, #0x20]
0087c308	ldrb w10,[sp, #0x50]
0087c30c	ldr x0,[sp, #0x20]
0087c310	str x8,[x25, #0x20]
0087c314	ldrb w8,[x25, #0x30]
0087c318	str x9,[sp, #0x40]
0087c31c	strb w10,[x25, #0x30]
0087c320	strb w8,[sp, #0x50]
0087c324	cbz x0,0x0087c354
0087c328	bl 0x00c301d0
0087c32c	ldr x0,[sp, #0x38]
0087c330	str xzr,[sp, #0x20]
0087c334	bl 0x00c301d0
0087c338	mov x0,xzr
0087c33c	stp xzr,xzr,[x19, #0x8]
0087c340	stur xzr,[x19, #0x18]
0087c344	bl 0x00c301d0
0087c348	mov w8,#0x40
0087c34c	str xzr,[sp, #0x40]
0087c350	strb w8,[sp, #0x50]
0087c354	ldr x0,[sp, #0x38]
0087c358	bl 0x00c301d0
0087c35c	ldr x8,[x24, #0x28]
0087c360	ldur x9,[x29, #-0x8]
0087c364	cmp x8,x9
0087c368	b.ne 0x0087c3c8
0087c36c	ldp x20,x19,[sp, #0xb0]
0087c370	ldp x22,x21,[sp, #0xa0]
0087c374	ldp x24,x23,[sp, #0x90]
0087c378	ldp x26,x25,[sp, #0x80]
0087c37c	ldp x28,x27,[sp, #0x70]
0087c380	ldp x29,x30,[sp, #0x60]
0087c384	add sp,sp,#0xc0
0087c388	ret
0087c3c8	bl 0x00c2fec0
