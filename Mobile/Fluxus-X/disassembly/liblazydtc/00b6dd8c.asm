; mbedtls_aes_setkey_enc @ 00b6dd8c
00b6dd8c	stp x28,x27,[sp, #-0x60]!
00b6dd90	stp x26,x25,[sp, #0x10]
00b6dd94	stp x24,x23,[sp, #0x20]
00b6dd98	stp x22,x21,[sp, #0x30]
00b6dd9c	stp x20,x19,[sp, #0x40]
00b6dda0	stp x29,x30,[sp, #0x50]
00b6dda4	add x29,sp,#0x50
00b6dda8	sub sp,sp,#0x230
00b6ddac	mrs x3,tpidr_el0
00b6ddb0	ldr x8,[x3, #0x28]
00b6ddb4	cmp w2,#0x80
00b6ddb8	stur x8,[x29, #-0x60]
00b6ddbc	b.eq 0x00b6dde8
00b6ddc0	cmp w2,#0x100
00b6ddc4	b.eq 0x00b6dddc
00b6ddc8	cmp w2,#0xc0
00b6ddcc	b.ne 0x00b6e214
00b6ddd0	mov w15,#0x4
00b6ddd4	orr w10,wzr,#0xc
00b6ddd8	b 0x00b6ddf0
00b6dddc	orr w15,wzr,#0x6
00b6dde0	orr w10,wzr,#0xe
00b6dde4	b 0x00b6ddf0
00b6dde8	mov w15,#0x2
00b6ddec	mov w10,#0xa
00b6ddf0	str w10,[x0]
00b6ddf4	adrp x8,0xd23000
00b6ddf8	ldrb w11,[x8, #0x8d0]
00b6ddfc	tbnz w11,#0x0,0x00b6e088
00b6de00	str w15,[sp, #0xc]
00b6de04	mov x11,xzr
00b6de08	mov w15,#0x1
00b6de0c	add x12,sp,#0x120
00b6de10	add x13,sp,#0x20
00b6de14	mov w14,#0x1b
00b6de18	str x1,[sp]
00b6de1c	str x0,[sp, #0x10]
00b6de20	sxtb w16,w15
00b6de24	and x17,x15,#0xff
00b6de28	strb w15,[x12, x11]
00b6de2c	eor w15,w15,w15, LSL #0x1
00b6de30	strb w11,[x13, x17]
00b6de34	and w16,w14,w16, LSR #0x7
00b6de38	add x11,x11,#0x1
00b6de3c	cmp x11,#0x100
00b6de40	eor w15,w15,w16
00b6de44	b.ne 0x00b6de20
00b6de48	adrp x11,0x29c000
00b6de4c	adrp x14,0x29c000
00b6de50	ldr q0,[x11, #0x9e0]
00b6de54	ldr q1,[x14, #0xa80]
00b6de58	adrp x12,0xd23000
00b6de5c	mov x15,#0x1b
00b6de60	add x12,x12,#0x8e0
00b6de64	movk x15,#0x36, LSL #32
00b6de68	adrp x16,0xd23000
00b6de6c	mov w13,#0x63
00b6de70	adrp x11,0xd25000
00b6de74	str x15,[x12, #0x20]
00b6de78	stp q0,q1,[x12]
00b6de7c	adrp x12,0xd23000
00b6de80	add x11,x11,#0xa08
00b6de84	mov w14,#0x1
00b6de88	add x15,sp,#0x20
00b6de8c	strb w13,[x16, #0x908]
00b6de90	add x16,sp,#0x120
00b6de94	add x12,x12,#0x908
00b6de98	str x3,[sp, #0x18]
00b6de9c	strb wzr,[x11, #0x63]
00b6dea0	ldrb w17,[x15, x14]
00b6dea4	mvn w17,w17
00b6dea8	and x17,x17,#0xff
00b6deac	ldrb w17,[x16, x17]
00b6deb0	lsr w18,w17,#0x7
00b6deb4	ubfx w3,w17,#0x6,#0x1
00b6deb8	bfm w18,w17,#0x1f,#0x7
00b6debc	ubfx w4,w17,#0x5,#0x1
00b6dec0	lsr w5,w17,#0x4
00b6dec4	bfm w3,w18,#0x1f,#0x8
00b6dec8	eor w17,w17,w18
00b6decc	bfm w4,w3,#0x1f,#0x9
00b6ded0	eor w17,w17,w3
00b6ded4	bfm w5,w4,#0x1f,#0x1e
00b6ded8	eor w17,w17,w4
00b6dedc	eor w17,w17,w5
00b6dee0	eor w17,w17,w13
00b6dee4	strb w17,[x12, x14]
00b6dee8	and x17,x17,#0xff
00b6deec	strb w14,[x11, x17]
00b6def0	add x14,x14,#0x1
00b6def4	cmp x14,#0x100
00b6def8	b.ne 0x00b6dea0
00b6defc	ldrb w14,[sp, #0x2e]
00b6df00	ldrb w15,[sp, #0x29]
00b6df04	ldrb w16,[sp, #0x2d]
00b6df08	ldrb w17,[sp, #0x2b]
00b6df0c	adrp x3,0xd24000
00b6df10	adrp x4,0xd24000
00b6df14	adrp x5,0xd25000
00b6df18	adrp x6,0xd25000
00b6df1c	adrp x7,0xd23000
00b6df20	adrp x19,0xd23000
00b6df24	adrp x20,0xd24000
00b6df28	adrp x21,0xd24000
00b6df2c	mov w23,#0x8081
00b6df30	mov x13,xzr
00b6df34	mov w18,#0x1b
00b6df38	add x3,x3,#0xa08
00b6df3c	add x4,x4,#0xe08
00b6df40	add x5,x5,#0x208
00b6df44	add x6,x6,#0x608
00b6df48	add x7,x7,#0xa08
00b6df4c	add x19,x19,#0xe08
00b6df50	add x20,x20,#0x208
00b6df54	add x21,x21,#0x608
00b6df58	add x0,sp,#0x20
00b6df5c	movk w23,#0x8080, LSL #16
00b6df60	add x24,sp,#0x120
00b6df64	ldrb w27,[x12, x13]
00b6df68	lsl x25,x13,#0x2
00b6df6c	lsl w26,w27,#0x18
00b6df70	and w26,w18,w26, ASR #0x1f
00b6df74	lsl w28,w27,#0x8
00b6df78	eor w26,w26,w27, LSL #0x1
00b6df7c	bfm w28,w27,#0x10,#0x7
00b6df80	eor w30,w26,w27
00b6df84	bfxil w28,w26,#0x0,#0x8
00b6df88	and w26,w30,#0xff
00b6df8c	bfm w30,w28,#0x18,#0x17
00b6df90	bfm w28,w26,#0x8,#0x7
00b6df94	ldrb w26,[x11, x13]
00b6df98	mov w10,w27
00b6df9c	bfm w10,w30,#0x18,#0x17
00b6dfa0	bfm w27,w10,#0x18,#0x17
00b6dfa4	str w30,[x4, x25#0x0]
00b6dfa8	str w28,[x3, x25#0x0]
00b6dfac	str w10,[x5, x25#0x0]
00b6dfb0	str w27,[x6, x25#0x0]
00b6dfb4	cbz x26,0x00b6e038
00b6dfb8	ldrb w10,[x0, x26]
00b6dfbc	add w26,w10,w14
00b6dfc0	add w27,w10,w15
00b6dfc4	umull x30,w26,w23
00b6dfc8	add w28,w10,w16
00b6dfcc	umull x8,w27,w23
00b6dfd0	lsr x30,x30,#0x27
00b6dfd4	umull x9,w28,w23
00b6dfd8	lsr x8,x8,#0x27
00b6dfdc	lsl w22,w30,#0x8
00b6dfe0	lsr x9,x9,#0x27
00b6dfe4	sub w22,w22,w30
00b6dfe8	lsl w30,w8,#0x8
00b6dfec	add w10,w10,w17
00b6dff0	sub w8,w30,w8
00b6dff4	lsl w30,w9,#0x8
00b6dff8	sub w22,w26,w22
00b6dffc	umull x26,w10,w23
00b6e000	sub w9,w30,w9
00b6e004	lsr x30,x26,#0x27
00b6e008	sub w8,w27,w8
00b6e00c	lsl w1,w30,#0x8
00b6e010	sub w9,w28,w9
00b6e014	ldrb w27,[x24, w22, UXTW ]
00b6e018	ldrb w26,[x24, w8, UXTW ]
00b6e01c	sub w8,w1,w30
00b6e020	ldrb w28,[x24, w9, UXTW ]
00b6e024	sub w8,w10,w8
00b6e028	ldrb w30,[x24, w8, UXTW ]
00b6e02c	bfm w27,w26,#0x18,#0x7
00b6e030	bfm w27,w28,#0x10,#0x7
00b6e034	b 0x00b6e044
00b6e038	mov w27,wzr
00b6e03c	mov w28,wzr
00b6e040	mov w30,wzr
00b6e044	orr w8,w27,w30, LSL #0x18
00b6e048	str w8,[x7, x25#0x0]
00b6e04c	extr w8,w27,w8,#0x18
00b6e050	add x13,x13,#0x1
00b6e054	bfm w28,w8,#0x18,#0x17
00b6e058	bfm w26,w28,#0x18,#0x17
00b6e05c	cmp x13,#0x100
00b6e060	str w8,[x19, x25#0x0]
00b6e064	str w28,[x20, x25#0x0]
00b6e068	str w26,[x21, x25#0x0]
00b6e06c	b.ne 0x00b6df64
00b6e070	ldp x0,x3,[sp, #0x10]
00b6e074	ldr w15,[sp, #0xc]
00b6e078	ldr x1,[sp]
00b6e07c	mov w8,#0x1
00b6e080	adrp x9,0xd23000
00b6e084	strb w8,[x9, #0x8d0]
00b6e088	lsr w12,w2,#0x5
00b6e08c	str xzr,[x0, #0x8]
00b6e090	cbz w12,0x00b6e120
00b6e094	mov x11,xzr
00b6e098	cmp w2,#0xff
00b6e09c	mov w10,w12
00b6e0a0	b.ls 0x00b6e0fc
00b6e0a4	lsl w11,w12,#0x2
00b6e0a8	add x8,x0,#0x10
00b6e0ac	add x9,x1,x11
00b6e0b0	cmp x9,x8
00b6e0b4	b.ls 0x00b6e0cc
00b6e0b8	add x8,x0,x11
00b6e0bc	add x8,x8,#0x10
00b6e0c0	cmp x8,x1
00b6e0c4	mov x11,xzr
00b6e0c8	b.hi 0x00b6e0fc
00b6e0cc	and x11,x10,#0x7fffff8
00b6e0d0	add x12,x1,#0x10
00b6e0d4	add x13,x0,#0x20
00b6e0d8	mov x14,x11
00b6e0dc	ldp q0,q1,[x12, #-0x10]
00b6e0e0	add x12,x12,#0x20
00b6e0e4	subs x14,x14,#0x8
00b6e0e8	stp q0,q1,[x13, #-0x10]
00b6e0ec	add x13,x13,#0x20
00b6e0f0	b.ne 0x00b6e0dc
00b6e0f4	cmp x11,x10
00b6e0f8	b.eq 0x00b6e120
00b6e0fc	lsl x8,x11,#0x2
00b6e100	add x9,x0,x8
00b6e104	add x12,x1,x8
00b6e108	add x13,x9,#0x10
00b6e10c	sub x10,x10,x11
00b6e110	ldr w8,[x12], #0x4
00b6e114	subs x10,x10,#0x1
00b6e118	str w8,[x13], #0x4
00b6e11c	b.ne 0x00b6e110
00b6e120	and w8,w15,#0x7
00b6e124	cmp w8,#0x2
00b6e128	b.eq 0x00b6e2b4
00b6e12c	cmp w8,#0x4
00b6e130	b.eq 0x00b6e21c
00b6e134	cmp w8,#0x6
00b6e138	mov w8,wzr
00b6e13c	b.ne 0x00b6e33c
00b6e140	ldr w13,[x0, #0x10]
00b6e144	adrp x11,0xd23000
00b6e148	adrp x12,0xd23000
00b6e14c	mov x8,xzr
00b6e150	add x10,x0,#0x28
00b6e154	add x11,x11,#0x8e0
00b6e158	add x12,x12,#0x908
00b6e15c	ldr w9,[x11, x8#0x0]
00b6e160	ldr w14,[x10, #0x4]
00b6e164	ldp w15,w16,[x10, #-0x14]
00b6e168	add x8,x8,#0x4
00b6e16c	eor w9,w9,w13
00b6e170	ubfx w13,w14,#0x8,#0x8
00b6e174	ldrb w13,[x12, w13, UXTW ]
00b6e178	ubfx w17,w14,#0x10,#0x8
00b6e17c	ubfx x18,x14,#0x18,#0x8
00b6e180	ldrb w17,[x12, w17, UXTW ]
00b6e184	ldrb w18,[x12, w18, UXTW ]
00b6e188	eor w9,w9,w13
00b6e18c	and x13,x14,#0xff
00b6e190	ldrb w13,[x12, x13]
00b6e194	eor w9,w9,w17, LSL #0x8
00b6e198	eor w9,w9,w18, LSL #0x10
00b6e19c	ldp w17,w18,[x10, #-0xc]
00b6e1a0	eor w13,w9,w13, LSL #0x18
00b6e1a4	eor w9,w13,w15
00b6e1a8	stp w13,w9,[x10, #0x8]
00b6e1ac	eor w9,w16,w9
00b6e1b0	eor w15,w17,w9
00b6e1b4	stp w9,w15,[x10, #0x10]
00b6e1b8	and w9,w15,#0xff
00b6e1bc	ldrb w9,[x12, w9, UXTW ]
00b6e1c0	ubfx w17,w15,#0x8,#0x8
00b6e1c4	ldrb w17,[x12, w17, UXTW ]
00b6e1c8	cmp x8,#0x1c
00b6e1cc	eor w9,w18,w9
00b6e1d0	ubfx w18,w15,#0x10,#0x8
00b6e1d4	ldrb w18,[x12, w18, UXTW ]
00b6e1d8	lsr w15,w15,#0x18
00b6e1dc	ldrb w15,[x12, w15, UXTW ]
00b6e1e0	eor w9,w9,w17, LSL #0x8
00b6e1e4	ldp w17,w16,[x10, #-0x4]
00b6e1e8	eor w9,w9,w18, LSL #0x10
00b6e1ec	eor w9,w9,w15, LSL #0x18
00b6e1f0	eor w15,w9,w17
00b6e1f4	stp w9,w15,[x10, #0x18]
00b6e1f8	eor w9,w16,w15
00b6e1fc	eor w14,w9,w14
00b6e200	add x15,x10,#0x20
00b6e204	stp w9,w14,[x10, #0x20]
00b6e208	mov x10,x15
00b6e20c	b.ne 0x00b6e15c
00b6e210	b 0x00b6e338
00b6e214	orr w8,wzr,#0xffffffe0
00b6e218	b 0x00b6e33c
00b6e21c	ldr w13,[x0, #0x10]
00b6e220	adrp x11,0xd23000
00b6e224	adrp x12,0xd23000
00b6e228	mov x8,xzr
00b6e22c	add x10,x0,#0x20
00b6e230	add x11,x11,#0x8e0
00b6e234	add x12,x12,#0x908
00b6e238	ldr w9,[x11, x8#0x0]
00b6e23c	ldp w15,w14,[x10]
00b6e240	add x8,x8,#0x4
00b6e244	cmp x8,#0x20
00b6e248	eor w9,w9,w13
00b6e24c	ubfx w13,w14,#0x8,#0x8
00b6e250	ldrb w13,[x12, w13, UXTW ]
00b6e254	ubfx w16,w14,#0x10,#0x8
00b6e258	ubfx x17,x14,#0x18,#0x8
00b6e25c	ldrb w16,[x12, w16, UXTW ]
00b6e260	ldrb w17,[x12, w17, UXTW ]
00b6e264	eor w9,w9,w13
00b6e268	and x13,x14,#0xff
00b6e26c	ldrb w13,[x12, x13]
00b6e270	eor w9,w9,w16, LSL #0x8
00b6e274	eor w9,w9,w17, LSL #0x10
00b6e278	ldp w16,w17,[x10, #-0xc]
00b6e27c	eor w13,w9,w13, LSL #0x18
00b6e280	ldur w9,[x10, #-0x4]
00b6e284	eor w16,w13,w16
00b6e288	stp w13,w16,[x10, #0x8]
00b6e28c	eor w16,w17,w16
00b6e290	eor w9,w9,w16
00b6e294	stp w16,w9,[x10, #0x10]
00b6e298	eor w9,w15,w9
00b6e29c	eor w14,w9,w14
00b6e2a0	add x15,x10,#0x18
00b6e2a4	stp w9,w14,[x10, #0x18]
00b6e2a8	mov x10,x15
00b6e2ac	b.ne 0x00b6e238
00b6e2b0	b 0x00b6e338
00b6e2b4	ldr w13,[x0, #0x10]
00b6e2b8	adrp x11,0xd23000
00b6e2bc	adrp x12,0xd23000
00b6e2c0	mov x8,xzr
00b6e2c4	add x10,x0,#0x18
00b6e2c8	add x11,x11,#0x8e0
00b6e2cc	add x12,x12,#0x908
00b6e2d0	ldr w9,[x11, x8#0x0]
00b6e2d4	ldp w15,w14,[x10]
00b6e2d8	add x8,x8,#0x4
00b6e2dc	cmp x8,#0x28
00b6e2e0	eor w9,w9,w13
00b6e2e4	ubfx w13,w14,#0x8,#0x8
00b6e2e8	ldrb w13,[x12, w13, UXTW ]
00b6e2ec	ubfx w16,w14,#0x10,#0x8
00b6e2f0	ldrb w16,[x12, w16, UXTW ]
00b6e2f4	ubfx x17,x14,#0x18,#0x8
00b6e2f8	ldrb w17,[x12, w17, UXTW ]
00b6e2fc	eor w9,w9,w13
00b6e300	and x13,x14,#0xff
00b6e304	ldrb w13,[x12, x13]
00b6e308	eor w9,w9,w16, LSL #0x8
00b6e30c	ldur w16,[x10, #-0x4]
00b6e310	eor w9,w9,w17, LSL #0x10
00b6e314	eor w13,w9,w13, LSL #0x18
00b6e318	eor w9,w13,w16
00b6e31c	stp w13,w9,[x10, #0x8]
00b6e320	eor w9,w15,w9
00b6e324	eor w14,w9,w14
00b6e328	add x15,x10,#0x10
00b6e32c	stp w9,w14,[x10, #0x10]
00b6e330	mov x10,x15
00b6e334	b.ne 0x00b6e2d0
00b6e338	mov w8,wzr
00b6e33c	ldr x9,[x3, #0x28]
00b6e340	ldur x10,[x29, #-0x60]
00b6e344	cmp x9,x10
00b6e348	b.ne 0x00b6e370
00b6e34c	mov w0,w8
00b6e350	add sp,sp,#0x230
00b6e354	ldp x29,x30,[sp, #0x50]
00b6e358	ldp x20,x19,[sp, #0x40]
00b6e35c	ldp x22,x21,[sp, #0x30]
00b6e360	ldp x24,x23,[sp, #0x20]
00b6e364	ldp x26,x25,[sp, #0x10]
00b6e368	ldp x28,x27,[sp], #0x60
00b6e36c	ret
00b6e370	bl 0x00c2fec0
