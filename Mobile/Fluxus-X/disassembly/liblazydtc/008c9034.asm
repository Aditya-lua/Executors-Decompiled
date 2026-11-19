; FUN_008c9034 @ 008c9034
008c9034	sub sp,sp,#0x80
008c9038	stp x29,x30,[sp, #0x20]
008c903c	str x27,[sp, #0x30]
008c9040	stp x26,x25,[sp, #0x40]
008c9044	stp x24,x23,[sp, #0x50]
008c9048	stp x22,x21,[sp, #0x60]
008c904c	stp x20,x19,[sp, #0x70]
008c9050	add x29,sp,#0x20
008c9054	mrs x22,tpidr_el0
008c9058	adrp x25,0xd1f000
008c905c	mov x21,x1
008c9060	ldr x8,[x22, #0x28]
008c9064	mov x19,x0
008c9068	stur x8,[x29, #-0x8]
008c906c	ldr x20,[x1, #0xe8]
008c9070	ldrb w8,[x1, #0x1]
008c9074	ldrb w23,[x0, #0x4]
008c9078	ldrb w9,[x25, #0xe78]
008c907c	ldr x24,[x0, #0x60]
008c9080	str xzr,[sp, #0x10]
008c9084	strb w8,[x0, #0x4]
008c9088	ldr w8,[x20, #0x20]
008c908c	cmp w9,#0x1
008c9090	stp x20,x1,[sp]
008c9094	add w8,w8,#0x1
008c9098	str w8,[x20, #0x20]
008c909c	b.ne 0x008c90b4
008c90a0	ldrb w27,[x24]
008c90a4	mov w8,#0x1
008c90a8	mov x26,xzr
008c90ac	strb w8,[x24]
008c90b0	b 0x008c90c4
008c90b4	ldr x26,[x24, #0x8]
008c90b8	mov w27,wzr
008c90bc	mov x8,#-0x1
008c90c0	str x8,[x24, #0x8]
008c90c4	nop
008c90c8	adr x1,0x8c9314
008c90cc	mov x2,sp
008c90d0	mov x0,x19
008c90d4	bl 0x008b3edc
008c90d8	ldrb w8,[x25, #0xe78]
008c90dc	cmp w8,#0x1
008c90e0	b.ne 0x008c90ec
008c90e4	strb w27,[x24]
008c90e8	b 0x008c90f0
008c90ec	str x26,[x24, #0x8]
008c90f0	strb w23,[x19, #0x4]
008c90f4	cbnz w0,0x008c92b8
008c90f8	ldr x8,[x21, #0xe8]
008c90fc	cbz x8,0x008c9224
008c9100	ldr x8,[sp, #0x10]
008c9104	ldr w9,[x8, #0xb8]
008c9108	ldr x10,[x8, #0x18]
008c910c	str w9,[x21, #0xb8]
008c9110	ldr x9,[x8, #0xe0]
008c9114	str x10,[x21, #0x18]
008c9118	ldur d0,[x8, #0xac]
008c911c	ldur q1,[x8, #0x28]
008c9120	str x9,[x21, #0xe0]
008c9124	stur d0,[x21, #0xac]
008c9128	stur q1,[x21, #0x28]
008c912c	ldur q0,[x8, #0x9c]
008c9130	ldr x9,[x8, #0x38]
008c9134	ldr x10,[x8, #0x90]
008c9138	stur q0,[x21, #0x9c]
008c913c	str x9,[x21, #0x38]
008c9140	ldr w9,[x8, #0xb4]
008c9144	str x10,[x21, #0x90]
008c9148	ldr q0,[x8, #0x80]
008c914c	str w9,[x21, #0xb4]
008c9150	ldr w9,[x8, #0xbc]
008c9154	str wzr,[x8, #0x9c]
008c9158	str q0,[x21, #0x80]
008c915c	ldur q0,[x8, #0x8]
008c9160	str w9,[x21, #0xbc]
008c9164	ldr w9,[x8, #0xc8]
008c9168	str wzr,[x8, #0xa4]
008c916c	stur q0,[x21, #0x8]
008c9170	movi v0.2D,#0x0
008c9174	str w9,[x21, #0xc8]
008c9178	ldr x9,[x8, #0x40]
008c917c	str xzr,[x8, #0x90]
008c9180	str x9,[x21, #0x40]
008c9184	ldr x9,[x8, #0xc0]
008c9188	str xzr,[x8, #0x80]
008c918c	str xzr,[x8, #0x10]
008c9190	str x9,[x21, #0xc0]
008c9194	stur q0,[x8, #0x28]
008c9198	stur q0,[x8, #0x38]
008c919c	stur q0,[x8, #0xac]
008c91a0	stur q0,[x8, #0xbc]
008c91a4	ldrb w8,[x21, #0x2]
008c91a8	str xzr,[x21, #0xe8]
008c91ac	tbz w8,#0x2,0x008c91c0
008c91b0	add x2,x21,#0x20
008c91b4	mov x0,x19
008c91b8	mov x1,x21
008c91bc	bl 0x008b63a4
008c91c0	ldr w8,[x20, #0x20]
008c91c4	subs w8,w8,#0x1
008c91c8	str w8,[x20, #0x20]
008c91cc	b.ne 0x008c9224
008c91d0	ldr x8,[x20, #0x18]
008c91d4	cbz x8,0x008c91e0
008c91d8	ldr x0,[x20, #0x10]
008c91dc	blr x8
008c91e0	ldr w8,[x20, #0x68]
008c91e4	ldr x1,[x20, #0x60]
008c91e8	mov x0,x19
008c91ec	ldrb w3,[x20, #0x38]
008c91f0	lsl x2,x8,#0x2
008c91f4	bl 0x008b7a9c
008c91f8	ldr w8,[x20, #0x78]
008c91fc	ldr x1,[x20, #0x70]
008c9200	mov x0,x19
008c9204	ldrb w3,[x20, #0x38]
008c9208	lsl x2,x8,#0x2
008c920c	bl 0x008b7a9c
008c9210	ldrb w3,[x20, #0x38]
008c9214	mov x0,x19
008c9218	mov x1,x20
008c921c	mov w2,#0x80
008c9220	bl 0x008b7a9c
008c9224	ldr w8,[x20, #0x20]
008c9228	subs w8,w8,#0x1
008c922c	str w8,[x20, #0x20]
008c9230	b.ne 0x008c9288
008c9234	ldr x8,[x20, #0x18]
008c9238	cbz x8,0x008c9244
008c923c	ldr x0,[x20, #0x10]
008c9240	blr x8
008c9244	ldr w8,[x20, #0x68]
008c9248	ldr x1,[x20, #0x60]
008c924c	mov x0,x19
008c9250	ldrb w3,[x20, #0x38]
008c9254	lsl x2,x8,#0x2
008c9258	bl 0x008b7a9c
008c925c	ldr w8,[x20, #0x78]
008c9260	ldr x1,[x20, #0x70]
008c9264	mov x0,x19
008c9268	ldrb w3,[x20, #0x38]
008c926c	lsl x2,x8,#0x2
008c9270	bl 0x008b7a9c
008c9274	ldrb w3,[x20, #0x38]
008c9278	mov x0,x19
008c927c	mov x1,x20
008c9280	mov w2,#0x80
008c9284	bl 0x008b7a9c
008c9288	ldr x8,[x22, #0x28]
008c928c	ldur x9,[x29, #-0x8]
008c9290	cmp x8,x9
008c9294	b.ne 0x008c9310
008c9298	ldp x20,x19,[sp, #0x70]
008c929c	ldr x27,[sp, #0x30]
008c92a0	ldp x22,x21,[sp, #0x60]
008c92a4	ldp x24,x23,[sp, #0x50]
008c92a8	ldp x26,x25,[sp, #0x40]
008c92ac	ldp x29,x30,[sp, #0x20]
008c92b0	add sp,sp,#0x80
008c92b4	ret
008c92b8	mov w21,w0
008c92bc	mov x0,x19
008c92c0	mov x1,x20
008c92c4	bl 0x008c8f9c
008c92c8	ldr x8,[x22, #0x28]
008c92cc	ldur x9,[x29, #-0x8]
008c92d0	cmp x8,x9
008c92d4	b.ne 0x008c9310
008c92d8	mov x0,x19
008c92dc	mov w1,w21
008c92e0	bl 0x008b3f9c
008c9310	bl 0x00c2fec0
