; FUN_0087deec @ 0087deec
0087deec	stp x29,x30,[sp, #-0x20]!
0087def0	stp x20,x19,[sp, #0x10]
0087def4	mov x29,sp
0087def8	adrp x8,0xd1b000
0087defc	ldr w9,[x0, #0x8]
0087df00	ldr w8,[x8, #0x10]
0087df04	cbz x0,0x0087dfbc
0087df08	cmp w9,w8
0087df0c	b.ne 0x0087dfbc
0087df10	ldr x8,[x2, #0x28]
0087df14	cbz x8,0x0087e27c
0087df18	ldr x8,[x0, #0x20]
0087df1c	mov x11,#0x2d69
0087df20	movk x11,#0xeb38, LSL #16
0087df24	lsl w9,w8,#0x3
0087df28	lsr x10,x8,#0x20
0087df2c	movk x11,#0xea08, LSL #32
0087df30	movk x11,#0x9ddf, LSL #48
0087df34	add x9,x9,#0x8
0087df38	eor x9,x9,x10
0087df3c	mul x9,x9,x11
0087df40	eor x10,x10,x9, LSR #0x2f
0087df44	eor x9,x10,x9
0087df48	mov x10,#0x959d
0087df4c	mul x9,x9,x11
0087df50	movk x10,#0xb8f4, LSL #16
0087df54	movk x10,#0xd34f, LSL #32
0087df58	movk x10,#0x949d, LSL #48
0087df5c	eor x9,x9,x9, LSR #0x2f
0087df60	mul x9,x9,x10
0087df64	ldrb w10,[x2, #0x30]
0087df68	lsr x10,x9,x10
0087df6c	ldr x9,[x2, #0x18]
0087df70	lsr x11,x10,#0x6
0087df74	ldr x11,[x9, x11, LSL #0x3]
0087df78	lsr x11,x11,x10
0087df7c	tbz w11,#0x0,0x0087e278
0087df80	ldr x12,[x2, #0x20]
0087df84	ldr x11,[x2]
0087df88	mov w13,#0x28
0087df8c	sub x12,x12,#0x1
0087df90	madd x14,x10,x13,x11
0087df94	ldr x15,[x14]
0087df98	cmp x15,x8
0087df9c	b.eq 0x0087e12c
0087dfa0	add x10,x10,#0x1
0087dfa4	and x10,x10,x12
0087dfa8	lsr x14,x10,#0x6
0087dfac	ldr x14,[x9, x14, LSL #0x3]
0087dfb0	lsr x14,x14,x10
0087dfb4	tbnz w14,#0x0,0x0087df90
0087dfb8	b 0x0087e278
0087dfbc	cbz x0,0x0087e094
0087dfc0	adrp x10,0xd1b000
0087dfc4	ldr w10,[x10, #0x50]
0087dfc8	cmp w9,w10
0087dfcc	b.ne 0x0087e094
0087dfd0	ldr x10,[x0, #0x20]
0087dfd4	adrp x11,0xd1b000
0087dfd8	ldr w9,[x10, #0x8]
0087dfdc	cbz x10,0x0087e1d0
0087dfe0	cmp w9,w8
0087dfe4	b.ne 0x0087e1d0
0087dfe8	ldr x8,[x2, #0x28]
0087dfec	cbz x8,0x0087e1d0
0087dff0	ldr x8,[x10, #0x20]
0087dff4	mov x14,#0x2d69
0087dff8	movk x14,#0xeb38, LSL #16
0087dffc	lsl w12,w8,#0x3
0087e000	lsr x13,x8,#0x20
0087e004	movk x14,#0xea08, LSL #32
0087e008	movk x14,#0x9ddf, LSL #48
0087e00c	add x12,x12,#0x8
0087e010	eor x12,x12,x13
0087e014	mul x12,x12,x14
0087e018	eor x13,x13,x12, LSR #0x2f
0087e01c	eor x12,x13,x12
0087e020	mov x13,#0x959d
0087e024	mul x12,x12,x14
0087e028	movk x13,#0xb8f4, LSL #16
0087e02c	movk x13,#0xd34f, LSL #32
0087e030	movk x13,#0x949d, LSL #48
0087e034	eor x12,x12,x12, LSR #0x2f
0087e038	mul x12,x12,x13
0087e03c	ldrb w13,[x2, #0x30]
0087e040	lsr x13,x12,x13
0087e044	ldr x12,[x2, #0x18]
0087e048	lsr x14,x13,#0x6
0087e04c	ldr x14,[x12, x14, LSL #0x3]
0087e050	lsr x14,x14,x13
0087e054	tbz w14,#0x0,0x0087e1d0
0087e058	ldr x15,[x2, #0x20]
0087e05c	ldr x14,[x2]
0087e060	mov w16,#0x28
0087e064	sub x15,x15,#0x1
0087e068	madd x17,x13,x16,x14
0087e06c	ldr x2,[x17]
0087e070	cmp x2,x8
0087e074	b.eq 0x0087e14c
0087e078	add x13,x13,#0x1
0087e07c	and x13,x13,x15
0087e080	lsr x17,x13,#0x6
0087e084	ldr x17,[x12, x17, LSL #0x3]
0087e088	lsr x17,x17,x13
0087e08c	tbnz w17,#0x0,0x0087e068
0087e090	b 0x0087e1d0
0087e094	mov x8,xzr
0087e098	cbz x0,0x0087e264
0087e09c	adrp x10,0xd1b000
0087e0a0	ldr w10,[x10, #0x20]
0087e0a4	cmp w9,w10
0087e0a8	mov x9,x8
0087e0ac	b.ne 0x0087e280
0087e0b0	ldr x8,[x1, #0x28]
0087e0b4	ldr x9,[x0, #0x20]
0087e0b8	cbz x8,0x0087e19c
0087e0bc	lsr x8,x9,#0x4
0087e0c0	mov x10,#0x7c15
0087e0c4	movk x10,#0x7f4a, LSL #16
0087e0c8	eor x8,x8,x9, LSR #0x9
0087e0cc	movk x10,#0x79b9, LSL #32
0087e0d0	movk x10,#0x9e37, LSL #48
0087e0d4	mul x8,x8,x10
0087e0d8	ldrb w10,[x1, #0x30]
0087e0dc	lsr x8,x8,x10
0087e0e0	ldr x10,[x1, #0x18]
0087e0e4	lsr x11,x8,#0x6
0087e0e8	ldr x11,[x10, x11, LSL #0x3]
0087e0ec	lsr x11,x11,x8
0087e0f0	tbz w11,#0x0,0x0087e19c
0087e0f4	ldr x12,[x1, #0x20]
0087e0f8	ldr x11,[x1]
0087e0fc	sub x12,x12,#0x1
0087e100	lsl x13,x8,#0x4
0087e104	ldr x13,[x11, x13#0x0]
0087e108	cmp x13,x9
0087e10c	b.eq 0x0087e190
0087e110	add x8,x8,#0x1
0087e114	and x8,x8,x12
0087e118	lsr x13,x8,#0x6
0087e11c	ldr x13,[x10, x13, LSL #0x3]
0087e120	lsr x13,x13,x8
0087e124	tbnz w13,#0x0,0x0087e100
0087e128	b 0x0087e19c
0087e12c	ldrb w8,[x14, #0x20]
0087e130	tbnz w8,#0x0,0x0087e278
0087e134	ldr x0,[x14, #0x8]
0087e138	cbz x0,0x0087e278
0087e13c	bl 0x0087deec
0087e140	mov x8,x0
0087e144	mov x9,x1
0087e148	b 0x0087e280
0087e14c	ldrb w8,[x17, #0x20]
0087e150	tbnz w8,#0x0,0x0087e1d0
0087e154	ldr x19,[x17, #0x8]
0087e158	cbz x19,0x0087e1d0
0087e15c	ldr w12,[x19, #0x8]
0087e160	ldr w8,[x11, #0x20]
0087e164	cmp w12,w8
0087e168	b.ne 0x0087e1a4
0087e16c	ldr x8,[x19, #0x20]
0087e170	mov x20,x0
0087e174	mov x0,x1
0087e178	mov x1,x8
0087e17c	bl 0x0087e29c
0087e180	cbnz w0,0x0087e278
0087e184	ldr x8,[x19, #0x20]
0087e188	ldr x9,[x20, #0x28]
0087e18c	b 0x0087e280
0087e190	add x8,x11,x8, LSL #0x4
0087e194	ldr w8,[x8, #0x8]
0087e198	cbnz w8,0x0087e278
0087e19c	mov x8,xzr
0087e1a0	b 0x0087e280
0087e1a4	adrp x13,0xd1b000
0087e1a8	ldr w13,[x13, #0xa0]
0087e1ac	cmp w12,w13
0087e1b0	b.ne 0x0087e1d0
0087e1b4	ldr w12,[x19, #0x1c]
0087e1b8	cmp w12,#0xf
0087e1bc	b.ne 0x0087e1d0
0087e1c0	ldr x19,[x19, #0x20]
0087e1c4	ldr w12,[x19, #0x8]
0087e1c8	cmp w12,w8
0087e1cc	b.eq 0x0087e16c
0087e1d0	mov x8,xzr
0087e1d4	cbz x10,0x0087e264
0087e1d8	ldr w11,[x11, #0x20]
0087e1dc	cmp w9,w11
0087e1e0	mov x9,x8
0087e1e4	b.ne 0x0087e280
0087e1e8	ldr x9,[x1, #0x28]
0087e1ec	ldr x8,[x10, #0x20]
0087e1f0	cbz x9,0x0087e294
0087e1f4	lsr x9,x8,#0x4
0087e1f8	mov x10,#0x7c15
0087e1fc	movk x10,#0x7f4a, LSL #16
0087e200	eor x9,x9,x8, LSR #0x9
0087e204	movk x10,#0x79b9, LSL #32
0087e208	movk x10,#0x9e37, LSL #48
0087e20c	mul x9,x9,x10
0087e210	ldrb w10,[x1, #0x30]
0087e214	lsr x9,x9,x10
0087e218	ldr x10,[x1, #0x18]
0087e21c	lsr x11,x9,#0x6
0087e220	ldr x11,[x10, x11, LSL #0x3]
0087e224	lsr x11,x11,x9
0087e228	tbz w11,#0x0,0x0087e294
0087e22c	ldr x12,[x1, #0x20]
0087e230	ldr x11,[x1]
0087e234	sub x12,x12,#0x1
0087e238	lsl x13,x9,#0x4
0087e23c	ldr x13,[x11, x13#0x0]
0087e240	cmp x13,x8
0087e244	b.eq 0x0087e26c
0087e248	add x9,x9,#0x1
0087e24c	and x9,x9,x12
0087e250	lsr x13,x9,#0x6
0087e254	ldr x13,[x10, x13, LSL #0x3]
0087e258	lsr x13,x13,x9
0087e25c	tbnz w13,#0x0,0x0087e238
0087e260	b 0x0087e294
0087e264	mov x9,x8
0087e268	b 0x0087e280
0087e26c	add x9,x11,x9, LSL #0x4
0087e270	ldr w9,[x9, #0x8]
0087e274	cbz w9,0x0087e294
0087e278	mov x8,xzr
0087e27c	mov x9,xzr
0087e280	mov x0,x8
0087e284	mov x1,x9
0087e288	ldp x20,x19,[sp, #0x10]
0087e28c	ldp x29,x30,[sp], #0x20
0087e290	ret
0087e294	ldr x9,[x0, #0x28]
0087e298	b 0x0087e280
