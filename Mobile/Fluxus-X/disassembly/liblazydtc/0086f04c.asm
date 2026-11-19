; FUN_0086f04c @ 0086f04c
0086f04c	sub sp,sp,#0x80
0086f050	stp x29,x30,[sp, #0x30]
0086f054	str x25,[sp, #0x40]
0086f058	stp x24,x23,[sp, #0x50]
0086f05c	stp x22,x21,[sp, #0x60]
0086f060	stp x20,x19,[sp, #0x70]
0086f064	add x29,sp,#0x30
0086f068	mrs x22,tpidr_el0
0086f06c	mov x19,x0
0086f070	orr x10,xzr,#-0x5555555555555556
0086f074	ldr x8,[x22, #0x28]
0086f078	movk x10,#0xaaab
0086f07c	mov x9,#0x1
0086f080	stur x8,[x29, #-0x8]
0086f084	ldp x0,x23,[x0]
0086f088	sub x24,x23,x0
0086f08c	asr x8,x24,#0x4
0086f090	madd x9,x8,x10,x9
0086f094	orr x8,xzr,#0x5555555555555555
0086f098	movk x8,#0x555, LSL #48
0086f09c	cmp x9,x8
0086f0a0	b.hi 0x0086f224
0086f0a4	mov x11,x19
0086f0a8	orr x13,xzr,#-0x5555555555555556
0086f0ac	mov x20,x1
0086f0b0	ldr x12,[x11, #0x10]!
0086f0b4	movk x13,#0x2aa, LSL #48
0086f0b8	str x11,[sp, #0x20]
0086f0bc	sub x12,x12,x0
0086f0c0	asr x12,x12,#0x4
0086f0c4	mul x10,x12,x10
0086f0c8	lsl x12,x10,#0x1
0086f0cc	cmp x12,x9
0086f0d0	csel x9,x12,x9,hi
0086f0d4	cmp x10,x13
0086f0d8	csel x25,x9,x8,cc
0086f0dc	cbz x25,0x0086f104
0086f0e0	cmp x25,x8
0086f0e4	b.hi 0x0086f238
0086f0e8	add x8,x25,x25, LSL #0x1
0086f0ec	mov x21,x0
0086f0f0	lsl x0,x8,#0x4
0086f0f4	bl 0x00c2fed0
0086f0f8	mov x8,x0
0086f0fc	mov x0,x21
0086f100	b 0x0086f108
0086f104	mov x8,xzr
0086f108	mov w9,#0x30
0086f10c	add x21,x8,x24
0086f110	madd x9,x25,x9,x8
0086f114	stp x8,x21,[sp]
0086f118	mov x8,x20
0086f11c	ldrb w10,[x8, #0x18]!
0086f120	ldur q0,[x8, #-0x10]
0086f124	adrp x25,0xc4a000
0086f128	add x25,x25,#0x5f8
0086f12c	str x25,[x21]
0086f130	stur q0,[x21, #0x8]
0086f134	stp x21,x9,[sp, #0x10]
0086f138	tbnz w10,#0x0,0x0086f154
0086f13c	ldr q0,[x8]
0086f140	ldr x8,[x8, #0x10]
0086f144	stur q0,[x21, #0x18]
0086f148	stur x8,[x21, #0x28]
0086f14c	mov x8,x21
0086f150	b 0x0086f16c
0086f154	ldp x2,x1,[x20, #0x20]
0086f158	add x0,x21,#0x18
0086f15c	bl 0x007ff40c
0086f160	ldp x0,x23,[x19]
0086f164	ldp x21,x8,[sp, #0x8]
0086f168	sub x24,x23,x0
0086f16c	cmp x0,x23
0086f170	add x20,x8,#0x30
0086f174	sub x21,x21,x24
0086f178	b.eq 0x0086f1d8
0086f17c	mov x8,x0
0086f180	mov x9,x21
0086f184	str x25,[x9]
0086f188	ldur q0,[x8, #0x8]
0086f18c	stur q0,[x9, #0x8]
0086f190	ldr x10,[x8, #0x28]
0086f194	ldur q0,[x8, #0x18]
0086f198	str x10,[x9, #0x28]
0086f19c	stur q0,[x9, #0x18]
0086f1a0	add x9,x9,#0x30
0086f1a4	stp xzr,xzr,[x8, #0x20]
0086f1a8	str xzr,[x8, #0x18]
0086f1ac	add x8,x8,#0x30
0086f1b0	cmp x8,x23
0086f1b4	b.ne 0x0086f184
0086f1b8	mov x24,x0
0086f1bc	ldr x8,[x24], #0x30
0086f1c0	ldr x8,[x8]
0086f1c4	blr x8
0086f1c8	cmp x24,x23
0086f1cc	mov x0,x24
0086f1d0	b.ne 0x0086f1bc
0086f1d4	ldr x0,[x19]
0086f1d8	ldr x9,[sp, #0x18]
0086f1dc	ldr x8,[x19, #0x10]
0086f1e0	stp x21,x20,[x19]
0086f1e4	str x9,[x19, #0x10]
0086f1e8	cbz x0,0x0086f1f4
0086f1ec	sub x1,x8,x0
0086f1f0	bl 0x00c2fe80
0086f1f4	ldr x8,[x22, #0x28]
0086f1f8	ldur x9,[x29, #-0x8]
0086f1fc	cmp x8,x9
0086f200	b.ne 0x0086f278
0086f204	mov x0,x20
0086f208	ldp x20,x19,[sp, #0x70]
0086f20c	ldr x25,[sp, #0x40]
0086f210	ldp x22,x21,[sp, #0x60]
0086f214	ldp x24,x23,[sp, #0x50]
0086f218	ldp x29,x30,[sp, #0x30]
0086f21c	add sp,sp,#0x80
0086f220	ret
0086f224	ldr x8,[x22, #0x28]
0086f228	ldur x9,[x29, #-0x8]
0086f22c	cmp x8,x9
0086f230	b.ne 0x0086f278
0086f234	bl 0x0086f2dc
0086f238	ldr x8,[x22, #0x28]
0086f23c	ldur x9,[x29, #-0x8]
0086f240	cmp x8,x9
0086f244	b.ne 0x0086f278
0086f248	bl 0x007fe1b8
0086f278	bl 0x00c2fec0
