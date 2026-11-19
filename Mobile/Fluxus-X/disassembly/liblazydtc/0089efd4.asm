; FUN_0089efd4 @ 0089efd4
0089efd4	sub sp,sp,#0xa0
0089efd8	stp x29,x30,[sp, #0x40]
0089efdc	stp x28,x27,[sp, #0x50]
0089efe0	stp x26,x25,[sp, #0x60]
0089efe4	stp x24,x23,[sp, #0x70]
0089efe8	stp x22,x21,[sp, #0x80]
0089efec	stp x20,x19,[sp, #0x90]
0089eff0	add x29,sp,#0x40
0089eff4	mrs x19,tpidr_el0
0089eff8	ldr x8,[x19, #0x28]
0089effc	stur x8,[x29, #-0x8]
0089f000	ldr x8,[x1, #0x28]
0089f004	cbz x8,0x0089f36c
0089f008	mov x26,#0x2d69
0089f00c	ldp x16,x12,[x2, #0x20]
0089f010	mov x6,#0x959d
0089f014	movk x26,#0xeb38, LSL #16
0089f018	ldr x10,[x1, #0x20]
0089f01c	movk x6,#0xb8f4, LSL #16
0089f020	movk x26,#0xea08, LSL #32
0089f024	ldr x11,[x1, #0x38]
0089f028	ldrb w13,[x2, #0x30]
0089f02c	ldr x14,[x2, #0x18]
0089f030	ldr x15,[x2]
0089f034	movk x6,#0xd34f, LSL #32
0089f038	mov x22,x2
0089f03c	mov x23,x1
0089f040	mov x21,xzr
0089f044	mov x9,xzr
0089f048	movk x26,#0x9ddf, LSL #48
0089f04c	movk x6,#0x949d, LSL #48
0089f050	sub x16,x16,#0x1
0089f054	mov w17,#0x30
0089f058	b 0x0089f080
0089f05c	mov x2,xzr
0089f060	add x1,x2,#0x8
0089f064	cmp x2,#0x0
0089f068	csel x1,xzr,x1,eq
0089f06c	ldr w1,[x1, #0x4]
0089f070	add x21,x21,x1
0089f074	add x9,x9,#0x1
0089f078	cmp x9,x8
0089f07c	b.eq 0x0089f0f8
0089f080	add x1,x10,x9, LSL #0x4
0089f084	cmp x9,x11
0089f088	ldr x1,[x1, #0x8]
0089f08c	add x21,x1,x21
0089f090	b.cs 0x0089f074
0089f094	cbz x12,0x0089f05c
0089f098	ldr x1,[x23, #0x30]
0089f09c	ldr x4,[x1, x9, LSL #0x3]
0089f0a0	lsl w1,w4,#0x3
0089f0a4	lsr x2,x4,#0x20
0089f0a8	add x1,x1,#0x8
0089f0ac	eor x1,x1,x2
0089f0b0	mul x1,x1,x26
0089f0b4	eor x2,x2,x1, LSR #0x2f
0089f0b8	eor x1,x2,x1
0089f0bc	mul x1,x1,x26
0089f0c0	eor x1,x1,x1, LSR #0x2f
0089f0c4	mul x1,x1,x6
0089f0c8	lsr x1,x1,x13
0089f0cc	lsr x2,x1,#0x6
0089f0d0	ldr x2,[x14, x2, LSL #0x3]
0089f0d4	lsr x2,x2,x1
0089f0d8	tbz w2,#0x0,0x0089f05c
0089f0dc	madd x2,x1,x17,x15
0089f0e0	ldr x5,[x2]
0089f0e4	cmp x5,x4
0089f0e8	b.eq 0x0089f060
0089f0ec	add x1,x1,#0x1
0089f0f0	and x1,x1,x16
0089f0f4	b 0x0089f0cc
0089f0f8	cmp x21,#0x1, LSL #12
0089f0fc	b.hi 0x0089f384
0089f100	mov w8,#0x6
0089f104	stp w8,w21,[x0]
0089f108	cbz x21,0x0089f378
0089f10c	cmp x21,#0x17
0089f110	stp x3,x0,[sp]
0089f114	str x19,[sp, #0x10]
0089f118	stp xzr,xzr,[sp, #0x20]
0089f11c	str xzr,[sp, #0x30]
0089f120	b.cc 0x0089f144
0089f124	orr x8,x21,#0x7
0089f128	mov w9,#0x19
0089f12c	cmp x8,#0x17
0089f130	csel x1,x9,x8,eq
0089f134	add x0,sp,#0x20
0089f138	bl 0x00879ca4
0089f13c	ldr x8,[x23, #0x28]
0089f140	cbz x8,0x0089f3b4
0089f144	add x8,sp,#0x20
0089f148	mov x28,xzr
0089f14c	mov w25,#0x16
0089f150	orr x8,x8,#0x1
0089f154	mov w19,#0x30
0089f158	str x8,[sp, #0x18]
0089f15c	b 0x0089f18c
0089f160	sub x8,x6,x1
0089f164	add x0,sp,#0x20
0089f168	add x2,x8,x24
0089f16c	mov x3,x24
0089f170	mov x4,x24
0089f174	mov x5,xzr
0089f178	bl 0x00c30200
0089f17c	ldr x8,[x23, #0x28]
0089f180	add x28,x28,#0x1
0089f184	cmp x28,x8
0089f188	b.cs 0x0089f3b4
0089f18c	ldp x8,x11,[sp, #0x20]
0089f190	ldr x9,[x23, #0x20]
0089f194	ldrb w10,[sp, #0x20]
0089f198	add x9,x9,x28, LSL #0x4
0089f19c	and x12,x8,#-0x2
0089f1a0	tst w10,#0x1
0089f1a4	ubfx x10,x8,#0x1,#0x7
0089f1a8	sub x12,x12,#0x1
0089f1ac	ldp x7,x6,[x9]
0089f1b0	csel x1,x25,x12,eq
0089f1b4	tst x8,#0x1
0089f1b8	csel x24,x10,x11,eq
0089f1bc	sub x10,x1,x24
0089f1c0	cmp x10,x6
0089f1c4	b.cs 0x0089f1e8
0089f1c8	sub x8,x6,x1
0089f1cc	add x0,sp,#0x20
0089f1d0	add x2,x8,x24
0089f1d4	mov x3,x24
0089f1d8	mov x4,x24
0089f1dc	mov x5,xzr
0089f1e0	bl 0x00c30200
0089f1e4	b 0x0089f230
0089f1e8	cbz x6,0x0089f230
0089f1ec	ldr x9,[sp, #0x30]
0089f1f0	tst x8,#0x1
0089f1f4	ldr x8,[sp, #0x18]
0089f1f8	mov x1,x7
0089f1fc	mov x2,x6
0089f200	mov x27,x6
0089f204	csel x20,x8,x9,eq
0089f208	add x0,x20,x24
0089f20c	bl 0x00c2ff60
0089f210	ldrb w9,[sp, #0x20]
0089f214	add x8,x24,x27
0089f218	tbnz w9,#0x0,0x0089f228
0089f21c	lsl w9,w8,#0x1
0089f220	strb w9,[sp, #0x20]
0089f224	b 0x0089f22c
0089f228	str x8,[sp, #0x28]
0089f22c	strb wzr,[x20, x8]
0089f230	ldr x8,[x23, #0x38]
0089f234	cmp x28,x8
0089f238	b.cs 0x0089f17c
0089f23c	ldr x8,[x22, #0x28]
0089f240	cbz x8,0x0089f2d4
0089f244	ldr x8,[x23, #0x30]
0089f248	ldr x8,[x8, x28, LSL #0x3]
0089f24c	lsl w9,w8,#0x3
0089f250	lsr x10,x8,#0x20
0089f254	add x9,x9,#0x8
0089f258	eor x9,x9,x10
0089f25c	mul x9,x9,x26
0089f260	eor x10,x10,x9, LSR #0x2f
0089f264	eor x9,x10,x9
0089f268	mov x10,#0x959d
0089f26c	mul x9,x9,x26
0089f270	movk x10,#0xb8f4, LSL #16
0089f274	movk x10,#0xd34f, LSL #32
0089f278	movk x10,#0x949d, LSL #48
0089f27c	eor x9,x9,x9, LSR #0x2f
0089f280	mul x9,x9,x10
0089f284	ldrb w10,[x22, #0x30]
0089f288	lsr x10,x9,x10
0089f28c	ldr x9,[x22, #0x18]
0089f290	lsr x11,x10,#0x6
0089f294	ldr x11,[x9, x11, LSL #0x3]
0089f298	lsr x11,x11,x10
0089f29c	tbz w11,#0x0,0x0089f2d4
0089f2a0	ldr x11,[x22, #0x20]
0089f2a4	ldr x12,[x22]
0089f2a8	sub x13,x11,#0x1
0089f2ac	madd x11,x10,x19,x12
0089f2b0	ldr x14,[x11]
0089f2b4	cmp x14,x8
0089f2b8	b.eq 0x0089f2d8
0089f2bc	add x10,x10,#0x1
0089f2c0	and x10,x10,x13
0089f2c4	lsr x11,x10,#0x6
0089f2c8	ldr x11,[x9, x11, LSL #0x3]
0089f2cc	lsr x11,x11,x10
0089f2d0	tbnz w11,#0x0,0x0089f2ac
0089f2d4	mov x11,xzr
0089f2d8	add x9,x11,#0x8
0089f2dc	cmp x11,#0x0
0089f2e0	ldrb w10,[sp, #0x20]
0089f2e4	ldp x8,x11,[sp, #0x20]
0089f2e8	csel x9,xzr,x9,eq
0089f2ec	tst w10,#0x1
0089f2f0	ldr w6,[x9, #0x4]
0089f2f4	ldr x7,[x9, #0x8]
0089f2f8	and x12,x8,#-0x2
0089f2fc	ubfx x10,x8,#0x1,#0x7
0089f300	sub x12,x12,#0x1
0089f304	csel x1,x25,x12,eq
0089f308	tst x8,#0x1
0089f30c	csel x24,x10,x11,eq
0089f310	sub x10,x1,x24
0089f314	cmp x10,x6
0089f318	b.cc 0x0089f160
0089f31c	cbz w6,0x0089f17c
0089f320	ldr x9,[sp, #0x30]
0089f324	tst x8,#0x1
0089f328	ldr x8,[sp, #0x18]
0089f32c	mov x1,x7
0089f330	mov x2,x6
0089f334	mov x27,x6
0089f338	csel x20,x8,x9,eq
0089f33c	add x0,x20,x24
0089f340	bl 0x00c2ff60
0089f344	ldrb w9,[sp, #0x20]
0089f348	add x8,x24,x27
0089f34c	tbnz w9,#0x0,0x0089f360
0089f350	lsl w9,w8,#0x1
0089f354	strb w9,[sp, #0x20]
0089f358	strb wzr,[x20, x8]
0089f35c	b 0x0089f17c
0089f360	str x8,[sp, #0x28]
0089f364	strb wzr,[x20, x8]
0089f368	b 0x0089f17c
0089f36c	adrp x8,0x29a000
0089f370	ldr d0,[x8, #0x9b0]
0089f374	str d0,[x0]
0089f378	adrp x8,0x2ab000
0089f37c	add x8,x8,#0x32c
0089f380	str x8,[x0, #0x8]
0089f384	ldr x8,[x19, #0x28]
0089f388	ldur x9,[x29, #-0x8]
0089f38c	cmp x8,x9
0089f390	b.ne 0x0089f444
0089f394	ldp x20,x19,[sp, #0x90]
0089f398	ldp x22,x21,[sp, #0x80]
0089f39c	ldp x24,x23,[sp, #0x70]
0089f3a0	ldp x26,x25,[sp, #0x60]
0089f3a4	ldp x28,x27,[sp, #0x50]
0089f3a8	ldp x29,x30,[sp, #0x40]
0089f3ac	add sp,sp,#0xa0
0089f3b0	ret
0089f3b4	ldrb w8,[sp, #0x20]
0089f3b8	ldr x10,[sp, #0x30]
0089f3bc	mov w9,#0x6
0089f3c0	ldp x0,x19,[sp]
0089f3c4	tst w8,#0x1
0089f3c8	add x8,sp,#0x20
0089f3cc	csinc x1,x10,x8,ne
0089f3d0	stp w9,w21,[x19]
0089f3d4	mov x2,x21
0089f3d8	bl 0x008530cc
0089f3dc	ldrb w8,[sp, #0x20]
0089f3e0	str x0,[x19, #0x8]
0089f3e4	ldr x19,[sp, #0x10]
0089f3e8	tbz w8,#0x0,0x0089f384
0089f3ec	ldr x8,[sp, #0x20]
0089f3f0	ldr x0,[sp, #0x30]
0089f3f4	and x1,x8,#-0x2
0089f3f8	bl 0x00c2fe80
0089f3fc	b 0x0089f384
0089f444	bl 0x00c2fec0
