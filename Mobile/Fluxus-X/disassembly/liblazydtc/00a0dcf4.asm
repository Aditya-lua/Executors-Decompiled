; FUN_00a0dcf4 @ 00a0dcf4
00a0dcf4	sub sp,sp,#0x140
00a0dcf8	stp x28,x27,[sp, #0xe0]
00a0dcfc	stp x26,x25,[sp, #0xf0]
00a0dd00	stp x24,x23,[sp, #0x100]
00a0dd04	stp x22,x21,[sp, #0x110]
00a0dd08	stp x20,x19,[sp, #0x120]
00a0dd0c	stp x29,x30,[sp, #0x130]
00a0dd10	stp xzr,xzr,[sp, #0x48]
00a0dd14	ldr x28,[x0, #0x10]
00a0dd18	add x29,sp,#0x130
00a0dd1c	mov x26,x2
00a0dd20	mov x21,x1
00a0dd24	mov x19,x0
00a0dd28	bl 0x00c37020
00a0dd2c	mov x23,x0
00a0dd30	cbz x0,0x00a0ea74
00a0dd34	adrp x0,0x2c1000
00a0dd38	adrp x1,0x2d7000
00a0dd3c	add x0,x0,#0x1ad
00a0dd40	add x1,x1,#0xc86
00a0dd44	mov w2,#0xee
00a0dd48	str x23,[sp, #0x30]
00a0dd4c	bl 0x00c34600
00a0dd50	str x0,[sp, #0x50]
00a0dd54	cbz x0,0x00a0eab8
00a0dd58	mov x23,x0
00a0dd5c	mov x0,x19
00a0dd60	bl 0x00c39400
00a0dd64	cbz w0,0x00a0ead4
00a0dd68	mov x0,x19
00a0dd6c	mov x1,x23
00a0dd70	bl 0x00c39410
00a0dd74	mov x20,x0
00a0dd78	cbz x0,0x00a0ec44
00a0dd7c	ldr x23,[sp, #0x30]
00a0dd80	mov w1,#0x200
00a0dd84	mov x0,x23
00a0dd88	bl 0x00c37000
00a0dd8c	cbz x0,0x00a0ec80
00a0dd90	add x8,x19,#0x18
00a0dd94	stp x8,x20,[sp, #0x10]
00a0dd98	add x8,x19,#0x1c
00a0dd9c	mov x25,xzr
00a0dda0	str xzr,[sp, #0x38]
00a0dda4	mov x24,xzr
00a0dda8	str x8,[sp, #0x8]
00a0ddac	mov w22,#0x1
00a0ddb0	stp x28,x26,[sp, #0x20]
00a0ddb4	mov x27,x23
00a0ddb8	mov w23,wzr
00a0ddbc	mov w20,wzr
00a0ddc0	ldr x8,[x27, #0x8]
00a0ddc4	sxtw x23,w23
00a0ddc8	add x26,x8,x23
00a0ddcc	mov x27,x26
00a0ddd0	strb wzr,[x27], #0x3
00a0ddd4	cbz x21,0x00a0de08
00a0ddd8	orr w2,wzr,#0x1ff
00a0dddc	mov x0,x21
00a0dde0	mov x1,x26
00a0dde4	bl 0x00c38470
00a0dde8	tbz w0,#0x1f,0x00a0de08
00a0ddec	b 0x00a0ef84
00a0ddf0	mov x28,x0
00a0ddf4	mov x0,x21
00a0ddf8	bl 0x00c38670
00a0ddfc	mov w22,wzr
00a0de00	mov x21,x28
00a0de04	cbnz x21,0x00a0ddd8
00a0de08	mov x0,x26
00a0de0c	strb wzr,[x26, #0x1ff]
00a0de10	bl 0x00c2ff50
00a0de14	mov x28,x0
00a0de18	cbz w22,0x00a0de58
00a0de1c	cmp w28,#0x3
00a0de20	b.lt 0x00a0de58
00a0de24	adrp x1,0x752000
00a0de28	orr w2,wzr,#0x3
00a0de2c	mov x0,x26
00a0de30	add x1,x1,#0x74
00a0de34	bl 0x00c300b0
00a0de38	cbnz w0,0x00a0de58
00a0de3c	sxtw x8,w28
00a0de40	sub x28,x8,#0x3
00a0de44	mov x0,x26
00a0de48	mov x1,x27
00a0de4c	mov x2,x28
00a0de50	bl 0x00c2ff60
00a0de54	strb wzr,[x26, x28]
00a0de58	orr w8,w28,w20
00a0de5c	cbnz w8,0x00a0dea0
00a0de60	ldr x8,[sp, #0x48]
00a0de64	cbz x8,0x00a0de90
00a0de68	add x1,sp,#0x48
00a0de6c	mov x0,x24
00a0de70	bl 0x00a0f0ec
00a0de74	cbnz x0,0x00a0ddf0
00a0de78	adrp x1,0x2d7000
00a0de7c	mov w2,#0x128
00a0de80	mov x0,x24
00a0de84	add x1,x1,#0xc86
00a0de88	bl 0x00c32310
00a0de8c	mov x24,xzr
00a0de90	mov x0,x25
00a0de94	bl 0x00c325f0
00a0de98	cbnz x0,0x00a0ddf0
00a0de9c	b 0x00a0ecc0
00a0dea0	cmp w28,#0x1
00a0dea4	mov w8,w28
00a0dea8	b.lt 0x00a0ded8
00a0deac	sxtw x8,w28
00a0deb0	add x9,x26,x8
00a0deb4	ldurb w9,[x9, #-0x1]
00a0deb8	cmp w9,#0xd
00a0debc	b.eq 0x00a0dec8
00a0dec0	cmp w9,#0xa
00a0dec4	b.ne 0x00a0ded8
00a0dec8	sub x8,x8,#0x1
00a0decc	add x9,x8,#0x1
00a0ded0	cmp x9,#0x1
00a0ded4	b.gt 0x00a0deb0
00a0ded8	cbz w28,0x00a0deec
00a0dedc	cmp w8,w28
00a0dee0	b.ne 0x00a0deec
00a0dee4	mov w9,#0x1
00a0dee8	b 0x00a0df00
00a0deec	ldr x10,[sp, #0x38]
00a0def0	mov w9,wzr
00a0def4	strb wzr,[x26, w8, SXTW ]
00a0def8	add x10,x10,#0x1
00a0defc	str x10,[sp, #0x38]
00a0df00	ldp x28,x26,[sp, #0x20]
00a0df04	add x8,x23,w8, SXTW 
00a0df08	cmp w8,#0x1
00a0df0c	b.lt 0x00a0df3c
00a0df10	ldr x10,[sp, #0x30]
00a0df14	sub x23,x8,#0x1
00a0df18	ldr x10,[x10, #0x8]
00a0df1c	add x10,x10,x23
00a0df20	ldrsb w12,[x10]
00a0df24	tbnz w12,#0x1f,0x00a0df3c
00a0df28	ldr x11,[x19, #0x8]
00a0df2c	and x12,x12,#0xff
00a0df30	lsl x12,x12,#0x1
00a0df34	ldrb w12,[x11, x12]
00a0df38	tbnz w12,#0x5,0x00a0e260
00a0df3c	cbz w9,0x00a0df4c
00a0df40	mov w20,#0x1
00a0df44	mov w23,w8
00a0df48	b 0x00a0e510
00a0df4c	ldr x23,[sp, #0x30]
00a0df50	ldr x8,[x19, #0x8]
00a0df54	ldr x14,[x23, #0x8]
00a0df58	ldrsb w9,[x14]
00a0df5c	mov x10,x14
00a0df60	tbnz w9,#0x1f,0x00a0df88
00a0df64	and x11,x9,#0xff
00a0df68	ldrh w11,[x8, x11, LSL #0x1]
00a0df6c	tbnz w11,#0xb,0x00a0e09c
00a0df70	tbz w11,#0x4,0x00a0df88
00a0df74	ldrsb w9,[x10, #0x1]!
00a0df78	tbz w9,#0x1f,0x00a0df64
00a0df7c	b 0x00a0df88
00a0df80	ldrb w9,[x11]
00a0df84	mov x10,x11
00a0df88	sxtb w11,w9
00a0df8c	tbnz w11,#0x1f,0x00a0dfac
00a0df90	and x11,x9,#0xff
00a0df94	ldrh w11,[x8, x11, LSL #0x1]
00a0df98	tbnz w11,#0x7,0x00a0e09c
00a0df9c	tbnz w11,#0xa,0x00a0dfb4
00a0dfa0	tbnz w11,#0x6,0x00a0e008
00a0dfa4	tbnz w11,#0x5,0x00a0e078
00a0dfa8	tbnz w11,#0x3,0x00a0e0a0
00a0dfac	add x11,x10,#0x1
00a0dfb0	b 0x00a0df80
00a0dfb4	mov x11,x10
00a0dfb8	ldrsb w13,[x11, #0x1]!
00a0dfbc	mov x12,x10
00a0dfc0	tbnz w13,#0x1f,0x00a0dfd4
00a0dfc4	and x10,x13,#0xff
00a0dfc8	lsl x10,x10,#0x1
00a0dfcc	ldrb w10,[x8, x10]
00a0dfd0	tbnz w10,#0x3,0x00a0dffc
00a0dfd4	and w10,w13,#0xff
00a0dfd8	cmp w10,w9, UXTB 
00a0dfdc	mov x10,x11
00a0dfe0	b.ne 0x00a0dfb4
00a0dfe4	ldrb w10,[x12, #0x2]!
00a0dfe8	cmp w10,w9, UXTB 
00a0dfec	mov x10,x12
00a0dff0	b.eq 0x00a0dfb4
00a0dff4	mov w13,w9
00a0dff8	b 0x00a0e000
00a0dffc	add x10,x12,#0x2
00a0e000	and w12,w13,#0xff
00a0e004	b 0x00a0e06c
00a0e008	mov x11,x10
00a0e00c	mov x10,x11
00a0e010	ldrsb w12,[x11, #0x1]!
00a0e014	tbnz w12,#0x1f,0x00a0e054
00a0e018	and w13,w12,#0xff
00a0e01c	cmp w13,w9, UXTB 
00a0e020	b.eq 0x00a0e064
00a0e024	and x13,x12,#0xff
00a0e028	ldrh w13,[x8, x13, LSL #0x1]
00a0e02c	tbnz w13,#0x3,0x00a0e064
00a0e030	tbz w13,#0x5,0x00a0e00c
00a0e034	ldrsb w12,[x10, #0x2]!
00a0e038	mov x11,x10
00a0e03c	tbnz w12,#0x1f,0x00a0e00c
00a0e040	and x10,x12,#0xff
00a0e044	lsl x10,x10,#0x1
00a0e048	ldrb w10,[x8, x10]
00a0e04c	tbz w10,#0x3,0x00a0e00c
00a0e050	b 0x00a0df80
00a0e054	and w12,w12,#0xff
00a0e058	cmp w12,w9, UXTB 
00a0e05c	b.ne 0x00a0e00c
00a0e060	mov w12,w9
00a0e064	and w12,w12,#0xff
00a0e068	add x10,x10,#0x2
00a0e06c	cmp w12,w9, UXTB 
00a0e070	csel x11,x10,x11,eq
00a0e074	b 0x00a0df80
00a0e078	mov x11,x10
00a0e07c	ldrsb w9,[x11, #0x1]!
00a0e080	tbnz w9,#0x1f,0x00a0e094
00a0e084	and x9,x9,#0xff
00a0e088	lsl x9,x9,#0x1
00a0e08c	ldrb w9,[x8, x9]
00a0e090	tbnz w9,#0x3,0x00a0df80
00a0e094	add x11,x10,#0x2
00a0e098	b 0x00a0df80
00a0e09c	strb wzr,[x10]
00a0e0a0	ldrsb w27,[x14]
00a0e0a4	tbnz w27,#0x1f,0x00a0e0d0
00a0e0a8	ldr x8,[x19, #0x8]
00a0e0ac	add x3,x14,#0x1
00a0e0b0	and x9,x27,#0xff
00a0e0b4	ldrh w9,[x8, x9, LSL #0x1]
00a0e0b8	and w10,w9,#0x18
00a0e0bc	cmp w10,#0x10
00a0e0c0	b.ne 0x00a0e288
00a0e0c4	ldrsb w27,[x3], #0x1
00a0e0c8	tbz w27,#0x1f,0x00a0e0b0
00a0e0cc	sub x14,x3,#0x1
00a0e0d0	mov x20,x14
00a0e0d4	ldr x8,[sp, #0x50]
00a0e0d8	mov x22,x14
00a0e0dc	str x8,[sp]
00a0e0e0	mov x26,x20
00a0e0e4	adrp x1,0x2a3000
00a0e0e8	orr w2,wzr,#0x7
00a0e0ec	mov x0,x22
00a0e0f0	add x1,x1,#0xe6f
00a0e0f4	bl 0x00c31bb0
00a0e0f8	mov x9,x22
00a0e0fc	cbz w0,0x00a0e30c
00a0e100	adrp x1,0x2d3000
00a0e104	mov w2,#0x8
00a0e108	mov x0,x9
00a0e10c	add x1,x1,#0x950
00a0e110	bl 0x00c31bb0
00a0e114	cbz w0,0x00a0e60c
00a0e118	and w8,w27,#0xff
00a0e11c	cmp w8,#0x3d
00a0e120	b.ne 0x00a0ecf4
00a0e124	strb wzr,[x20]
00a0e128	ldrsb w9,[x26, #0x1]!
00a0e12c	ldr x8,[x19, #0x8]
00a0e130	adrp x20,0x2d7000
00a0e134	add x20,x20,#0xc86
00a0e138	tbnz w9,#0x1f,0x00a0e158
00a0e13c	and x10,x9,#0xff
00a0e140	ldrh w10,[x8, x10, LSL #0x1]
00a0e144	and w10,w10,#0x18
00a0e148	cmp w10,#0x10
00a0e14c	b.ne 0x00a0e158
00a0e150	ldrsb w9,[x26, #0x1]!
00a0e154	tbz w9,#0x1f,0x00a0e13c
00a0e158	sub x10,x26,#0x1
00a0e15c	mov x11,x26
00a0e160	sxtb w12,w9
00a0e164	tbz w12,#0x1f,0x00a0e178
00a0e168	ldrb w9,[x11, #0x1]!
00a0e16c	add x10,x10,#0x1
00a0e170	sxtb w12,w9
00a0e174	tbnz w12,#0x1f,0x00a0e168
00a0e178	and x9,x9,#0xff
00a0e17c	lsl x9,x9,#0x1
00a0e180	ldrb w9,[x8, x9]
00a0e184	tbz w9,#0x3,0x00a0e168
00a0e188	mov x9,x10
00a0e18c	cmp x10,x26
00a0e190	b.cc 0x00a0e1b0
00a0e194	ldrsb w10,[x9]
00a0e198	tbnz w10,#0x1f,0x00a0e1b0
00a0e19c	and x10,x10,#0xff
00a0e1a0	lsl x10,x10,#0x1
00a0e1a4	ldrb w11,[x8, x10]
00a0e1a8	sub x10,x9,#0x1
00a0e1ac	tbnz w11,#0x4,0x00a0e188
00a0e1b0	orr w0,wzr,#0x18
00a0e1b4	mov w2,#0x21b
00a0e1b8	mov x1,x20
00a0e1bc	strb wzr,[x9, #0x1]
00a0e1c0	bl 0x00c32320
00a0e1c4	mov x27,x0
00a0e1c8	cbz x0,0x00a0ed2c
00a0e1cc	mov w2,#0x21f
00a0e1d0	mov x0,x22
00a0e1d4	mov x1,x20
00a0e1d8	bl 0x00c34600
00a0e1dc	mov x2,x27
00a0e1e0	str xzr,[x2, #0x10]!
00a0e1e4	stur x0,[x2, #-0x8]
00a0e1e8	cbz x0,0x00a0ed68
00a0e1ec	ldr x20,[sp]
00a0e1f0	mov x0,x19
00a0e1f4	mov x3,x26
00a0e1f8	mov x1,x20
00a0e1fc	bl 0x00a0f2a8
00a0e200	cbz w0,0x00a0ed98
00a0e204	ldr x1,[sp, #0x50]
00a0e208	mov x0,x20
00a0e20c	bl 0x00c301f0
00a0e210	ldr x1,[sp, #0x18]
00a0e214	ldr x26,[sp, #0x28]
00a0e218	cbz w0,0x00a0e244
00a0e21c	mov x0,x19
00a0e220	mov x1,x20
00a0e224	bl 0x00c393d0
00a0e228	mov x1,x0
00a0e22c	cbnz x0,0x00a0e244
00a0e230	mov x0,x19
00a0e234	mov x1,x20
00a0e238	bl 0x00c39410
00a0e23c	mov x1,x0
00a0e240	cbz x0,0x00a0ee3c
00a0e244	mov x0,x19
00a0e248	mov x2,x27
00a0e24c	bl 0x00c393b0
00a0e250	mov w20,wzr
00a0e254	mov w23,wzr
00a0e258	cbnz w0,0x00a0e510
00a0e25c	b 0x00a0edd8
00a0e260	cmp w8,#0x2
00a0e264	b.lt 0x00a0e280
00a0e268	ldursb w10,[x10, #-0x1]
00a0e26c	tbnz w10,#0x1f,0x00a0e280
00a0e270	and x10,x10,#0xff
00a0e274	lsl x10,x10,#0x1
00a0e278	ldrb w10,[x11, x10]
00a0e27c	tbnz w10,#0x5,0x00a0df3c
00a0e280	mov w20,#0x1
00a0e284	b 0x00a0e510
00a0e288	mov w20,wzr
00a0e28c	mov w23,wzr
00a0e290	tbnz w9,#0x3,0x00a0e510
00a0e294	and w9,w27,#0xff
00a0e298	cmp w9,#0x5b
00a0e29c	b.eq 0x00a0e8d0
00a0e2a0	ldr w9,[x19, #0x18]
00a0e2a4	ldr x10,[x19, #0x8]
00a0e2a8	ldr x23,[sp, #0x30]
00a0e2ac	sub x14,x3,#0x1
00a0e2b0	mov x20,x14
00a0e2b4	mov w12,#0x307
00a0e2b8	and x8,x27,#0xff
00a0e2bc	ldrh w11,[x10, x8, LSL #0x1]
00a0e2c0	mov x8,x20
00a0e2c4	tbnz w11,#0x5,0x00a0e2e0
00a0e2c8	tst w11,w12
00a0e2cc	b.ne 0x00a0e2d8
00a0e2d0	cbz w9,0x00a0e530
00a0e2d4	tbz w11,#0xc,0x00a0e530
00a0e2d8	add x20,x8,#0x1
00a0e2dc	b 0x00a0e300
00a0e2e0	mov x20,x8
00a0e2e4	ldrsb w11,[x20, #0x1]!
00a0e2e8	tbnz w11,#0x1f,0x00a0e2fc
00a0e2ec	and x11,x11,#0xff
00a0e2f0	lsl x11,x11,#0x1
00a0e2f4	ldrb w11,[x10, x11]
00a0e2f8	tbnz w11,#0x3,0x00a0e300
00a0e2fc	add x20,x8,#0x2
00a0e300	ldrsb w27,[x20]
00a0e304	tbz w27,#0x1f,0x00a0e2b8
00a0e308	b 0x00a0e0d4
00a0e30c	add x8,x9,#0x7
00a0e310	cmp x26,x8
00a0e314	b.eq 0x00a0e328
00a0e318	and w8,w27,#0xff
00a0e31c	cmp w8,#0x3d
00a0e320	b.eq 0x00a0e334
00a0e324	b 0x00a0e35c
00a0e328	and w8,w27,#0xff
00a0e32c	cmp w8,#0x3d
00a0e330	b.ne 0x00a0e100
00a0e334	ldrsb w27,[x26, #0x1]!
00a0e338	tbnz w27,#0x1f,0x00a0e35c
00a0e33c	ldr x8,[x19, #0x8]
00a0e340	and x9,x27,#0xff
00a0e344	ldrh w9,[x8, x9, LSL #0x1]
00a0e348	and w9,w9,#0x18
00a0e34c	cmp w9,#0x10
00a0e350	b.ne 0x00a0e35c
00a0e354	ldrsb w27,[x26, #0x1]!
00a0e358	tbz w27,#0x1f,0x00a0e340
00a0e35c	ldr x8,[x19, #0x8]
00a0e360	sub x20,x26,#0x1
00a0e364	mov x9,x20
00a0e368	mov x10,x26
00a0e36c	sxtb w11,w27
00a0e370	tbz w11,#0x1f,0x00a0e384
00a0e374	ldrb w27,[x10, #0x1]!
00a0e378	add x9,x9,#0x1
00a0e37c	sxtb w11,w27
00a0e380	tbnz w11,#0x1f,0x00a0e374
00a0e384	and x11,x27,#0xff
00a0e388	lsl x11,x11,#0x1
00a0e38c	ldrb w11,[x8, x11]
00a0e390	tbz w11,#0x3,0x00a0e374
00a0e394	mov x10,x9
00a0e398	cmp x9,x26
00a0e39c	b.cc 0x00a0e3bc
00a0e3a0	ldrsb w9,[x10]
00a0e3a4	tbnz w9,#0x1f,0x00a0e3bc
00a0e3a8	and x9,x9,#0xff
00a0e3ac	lsl x9,x9,#0x1
00a0e3b0	ldrb w11,[x8, x9]
00a0e3b4	sub x9,x10,#0x1
00a0e3b8	tbnz w11,#0x4,0x00a0e394
00a0e3bc	mov w1,#0x3a
00a0e3c0	mov x0,x26
00a0e3c4	strb wzr,[x10, #0x1]
00a0e3c8	bl 0x00c30890
00a0e3cc	cbz x0,0x00a0eda4
00a0e3d0	cmp x0,x26
00a0e3d4	b.eq 0x00a0eda4
00a0e3d8	mov x27,x0
00a0e3dc	ldrb w8,[x27, #0x1]!
00a0e3e0	cbz w8,0x00a0eda4
00a0e3e4	strb wzr,[x0]
00a0e3e8	ldr x8,[x19, #0x8]
00a0e3ec	mov x9,x26
00a0e3f0	b 0x00a0e3fc
00a0e3f4	add x9,x9,#0x1
00a0e3f8	add x20,x20,#0x1
00a0e3fc	ldrsb w11,[x9]
00a0e400	and x10,x11,#0xff
00a0e404	tbnz w11,#0x1f,0x00a0e3f4
00a0e408	lsl x10,x10,#0x1
00a0e40c	ldrb w10,[x8, x10]
00a0e410	tbz w10,#0x3,0x00a0e3f4
00a0e414	mov x9,x20
00a0e418	cmp x20,x26
00a0e41c	b.cc 0x00a0e43c
00a0e420	ldrsb w10,[x9]
00a0e424	tbnz w10,#0x1f,0x00a0e43c
00a0e428	and x10,x10,#0xff
00a0e42c	lsl x10,x10,#0x1
00a0e430	ldrb w10,[x8, x10]
00a0e434	sub x20,x9,#0x1
00a0e438	tbnz w10,#0x4,0x00a0e414
00a0e43c	strb wzr,[x9, #0x1]
00a0e440	ldrsb w9,[x27]
00a0e444	tbnz w9,#0x1f,0x00a0e468
00a0e448	ldr x8,[x19, #0x8]
00a0e44c	and x9,x9,#0xff
00a0e450	ldrh w9,[x8, x9, LSL #0x1]
00a0e454	and w9,w9,#0x18
00a0e458	cmp w9,#0x10
00a0e45c	b.ne 0x00a0e468
00a0e460	ldrsb w9,[x27, #0x1]!
00a0e464	tbz w9,#0x1f,0x00a0e44c
00a0e468	adrp x1,0x2d5000
00a0e46c	mov x0,x26
00a0e470	add x1,x1,#0xb27
00a0e474	bl 0x00c301f0
00a0e478	cbz w0,0x00a0e4ec
00a0e47c	adrp x1,0x2d7000
00a0e480	mov x0,x26
00a0e484	add x1,x1,#0xc9d
00a0e488	bl 0x00c301f0
00a0e48c	cbz w0,0x00a0e4f4
00a0e490	adrp x1,0x2b2000
00a0e494	mov x0,x26
00a0e498	add x1,x1,#0x85
00a0e49c	bl 0x00c301f0
00a0e4a0	ldr x26,[sp, #0x28]
00a0e4a4	mov w20,wzr
00a0e4a8	mov w23,wzr
00a0e4ac	cbnz w0,0x00a0e510
00a0e4b0	ldr x0,[x19, #0x20]
00a0e4b4	adrp x20,0x2d7000
00a0e4b8	add x20,x20,#0xc86
00a0e4bc	mov w2,#0x1ae
00a0e4c0	mov x1,x20
00a0e4c4	bl 0x00c32310
00a0e4c8	mov w2,#0x1af
00a0e4cc	mov x0,x27
00a0e4d0	mov x1,x20
00a0e4d4	bl 0x00c34600
00a0e4d8	mov w20,wzr
00a0e4dc	mov w23,wzr
00a0e4e0	str x0,[x19, #0x20]
00a0e4e4	cbnz x0,0x00a0e510
00a0e4e8	b 0x00a0ee70
00a0e4ec	ldr x1,[sp, #0x10]
00a0e4f0	b 0x00a0e4f8
00a0e4f4	ldr x1,[sp, #0x8]
00a0e4f8	mov x0,x27
00a0e4fc	bl 0x00a0f7cc
00a0e500	ldr x26,[sp, #0x28]
00a0e504	mov w20,wzr
00a0e508	mov w23,wzr
00a0e50c	cbz w0,0x00a0ef88
00a0e510	ldr x27,[sp, #0x30]
00a0e514	add w8,w23,#0x200
00a0e518	sxtw x1,w8
00a0e51c	mov x0,x27
00a0e520	bl 0x00c37000
00a0e524	mov w22,wzr
00a0e528	cbnz x0,0x00a0ddc0
00a0e52c	b 0x00a0ecec
00a0e530	and w9,w27,#0xff
00a0e534	cmp w9,#0x3a
00a0e538	b.ne 0x00a0e5c4
00a0e53c	ldrb w9,[x8, #0x1]
00a0e540	cmp w9,#0x3a
00a0e544	b.ne 0x00a0e5c0
00a0e548	strb wzr,[x8]
00a0e54c	ldrsb w27,[x8, #0x2]!
00a0e550	str x14,[sp]
00a0e554	mov x22,x8
00a0e558	tbnz w27,#0x1f,0x00a0e600
00a0e55c	ldr x8,[sp, #0x10]
00a0e560	ldr x10,[x19, #0x8]
00a0e564	mov x20,x22
00a0e568	ldr w9,[x8]
00a0e56c	and x8,x27,#0xff
00a0e570	ldrh w11,[x10, x8, LSL #0x1]
00a0e574	mov x8,x20
00a0e578	tbnz w11,#0x5,0x00a0e594
00a0e57c	tst w11,w12
00a0e580	b.ne 0x00a0e58c
00a0e584	cbz w9,0x00a0e5d0
00a0e588	tbz w11,#0xc,0x00a0e5d0
00a0e58c	add x20,x8,#0x1
00a0e590	b 0x00a0e5b4
00a0e594	mov x20,x8
00a0e598	ldrsb w11,[x20, #0x1]!
00a0e59c	tbnz w11,#0x1f,0x00a0e5b0
00a0e5a0	and x11,x11,#0xff
00a0e5a4	lsl x11,x11,#0x1
00a0e5a8	ldrb w11,[x10, x11]
00a0e5ac	tbnz w11,#0x3,0x00a0e5b4
00a0e5b0	add x20,x8,#0x2
00a0e5b4	ldrsb w27,[x20]
00a0e5b8	tbz w27,#0x1f,0x00a0e56c
00a0e5bc	b 0x00a0e0e0
00a0e5c0	mov w27,#0x3a
00a0e5c4	ldr x9,[sp, #0x50]
00a0e5c8	mov x22,x14
00a0e5cc	mov x14,x9
00a0e5d0	ldr x9,[x19, #0x8]
00a0e5d4	mov x26,x8
00a0e5d8	str x14,[sp]
00a0e5dc	and x10,x27,#0xff
00a0e5e0	ldrh w10,[x9, x10, LSL #0x1]
00a0e5e4	and w10,w10,#0x18
00a0e5e8	cmp w10,#0x10
00a0e5ec	b.ne 0x00a0e5f8
00a0e5f0	ldrsb w27,[x26, #0x1]!
00a0e5f4	tbz w27,#0x1f,0x00a0e5dc
00a0e5f8	mov x20,x8
00a0e5fc	b 0x00a0e0e4
00a0e600	mov x20,x22
00a0e604	mov x26,x22
00a0e608	b 0x00a0e0e4
00a0e60c	add x8,x22,#0x8
00a0e610	cmp x26,x8
00a0e614	b.ne 0x00a0e624
00a0e618	and w8,w27,#0xff
00a0e61c	cmp w8,#0x3d
00a0e620	b.ne 0x00a0ecf4
00a0e624	adrp x0,0x2db000
00a0e628	add x0,x0,#0xdfd
00a0e62c	str xzr,[sp, #0x40]
00a0e630	bl 0x00c395b0
00a0e634	mov x22,x0
00a0e638	cbnz x0,0x00a0e640
00a0e63c	ldr x22,[x19, #0x20]
00a0e640	ldrb w8,[x26]
00a0e644	ldr x1,[sp]
00a0e648	adrp x20,0x2d7000
00a0e64c	add x20,x20,#0xc86
00a0e650	cmp w8,#0x3d
00a0e654	b.ne 0x00a0e680
00a0e658	ldrsb w8,[x26, #0x1]!
00a0e65c	tbnz w8,#0x1f,0x00a0e680
00a0e660	ldr x9,[x19, #0x8]
00a0e664	and x10,x8,#0xff
00a0e668	ldrh w10,[x9, x10, LSL #0x1]
00a0e66c	and w10,w10,#0x18
00a0e670	cmp w10,#0x10
00a0e674	b.ne 0x00a0e680
00a0e678	ldrsb w8,[x26, #0x1]!
00a0e67c	tbz w8,#0x1f,0x00a0e664
00a0e680	ldr x9,[x19, #0x8]
00a0e684	sub x10,x26,#0x1
00a0e688	mov x11,x26
00a0e68c	sxtb w12,w8
00a0e690	tbz w12,#0x1f,0x00a0e6a4
00a0e694	ldrb w8,[x11, #0x1]!
00a0e698	add x10,x10,#0x1
00a0e69c	sxtb w12,w8
00a0e6a0	tbnz w12,#0x1f,0x00a0e694
00a0e6a4	and x8,x8,#0xff
00a0e6a8	lsl x8,x8,#0x1
00a0e6ac	ldrb w8,[x9, x8]
00a0e6b0	tbz w8,#0x3,0x00a0e694
00a0e6b4	mov x8,x10
00a0e6b8	cmp x10,x26
00a0e6bc	b.cc 0x00a0e6dc
00a0e6c0	ldrsb w10,[x8]
00a0e6c4	tbnz w10,#0x1f,0x00a0e6dc
00a0e6c8	and x10,x10,#0xff
00a0e6cc	lsl x10,x10,#0x1
00a0e6d0	ldrb w11,[x9, x10]
00a0e6d4	sub x10,x8,#0x1
00a0e6d8	tbnz w11,#0x4,0x00a0e6b4
00a0e6dc	add x2,sp,#0x40
00a0e6e0	mov x0,x19
00a0e6e4	mov x3,x26
00a0e6e8	strb wzr,[x8, #0x1]
00a0e6ec	bl 0x00a0f2a8
00a0e6f0	cbz w0,0x00a0ef84
00a0e6f4	ldr x27,[sp, #0x40]
00a0e6f8	cbz x22,0x00a0e708
00a0e6fc	ldrb w8,[x27]
00a0e700	cmp w8,#0x2f
00a0e704	b.ne 0x00a0e710
00a0e708	mov x26,x27
00a0e70c	b 0x00a0e7a8
00a0e710	mov x0,x22
00a0e714	bl 0x00c2ff50
00a0e718	mov x26,x0
00a0e71c	mov x0,x27
00a0e720	bl 0x00c2ff50
00a0e724	add x8,x26,x0
00a0e728	add x28,x8,#0x2
00a0e72c	mov w2,#0x1dc
00a0e730	mov x0,x28
00a0e734	mov x1,x20
00a0e738	bl 0x00c32320
00a0e73c	cbz x0,0x00a0ef04
00a0e740	mov x1,x22
00a0e744	mov x2,x28
00a0e748	mov x26,x0
00a0e74c	bl 0x00c387f0
00a0e750	ldrb w8,[x26]
00a0e754	cbz w8,0x00a0e770
00a0e758	mov x0,x26
00a0e75c	bl 0x00c2ff50
00a0e760	add x8,x26,x0
00a0e764	ldurb w8,[x8, #-0x1]
00a0e768	cmp w8,#0x2f
00a0e76c	b.eq 0x00a0e784
00a0e770	adrp x1,0x2a9000
00a0e774	mov x0,x26
00a0e778	add x1,x1,#0x1de
00a0e77c	mov x2,x28
00a0e780	bl 0x00c395d0
00a0e784	mov x0,x26
00a0e788	mov x1,x27
00a0e78c	mov x2,x28
00a0e790	bl 0x00c395d0
00a0e794	mov w2,#0x1e7
00a0e798	mov x0,x27
00a0e79c	mov x1,x20
00a0e7a0	bl 0x00c32310
00a0e7a4	ldr x28,[sp, #0x20]
00a0e7a8	ldr x8,[sp, #0x8]
00a0e7ac	ldr w8,[x8]
00a0e7b0	cbz w8,0x00a0e7c0
00a0e7b4	ldrb w8,[x26]
00a0e7b8	cmp w8,#0x2f
00a0e7bc	b.ne 0x00a0eea4
00a0e7c0	add x1,sp,#0x58
00a0e7c4	mov x0,x26
00a0e7c8	bl 0x00c30400
00a0e7cc	tbnz w0,#0x1f,0x00a0e814
00a0e7d0	ldr w8,[sp, #0x68]
00a0e7d4	and w8,w8,#0xf000
00a0e7d8	cmp w8,#0x4, LSL #12
00a0e7dc	b.ne 0x00a0e8b0
00a0e7e0	ldr x8,[sp, #0x48]
00a0e7e4	cbz x8,0x00a0e9ec
00a0e7e8	bl 0x00c342a0
00a0e7ec	adrp x2,0x2d5000
00a0e7f0	mov w1,#0x33d
00a0e7f4	mov x0,x20
00a0e7f8	add x2,x2,#0xb30
00a0e7fc	bl 0x00c342b0
00a0e800	adrp x2,0x2b6000
00a0e804	orr w0,wzr,#0xe
00a0e808	mov w1,#0x6f
00a0e80c	add x2,x2,#0xc62
00a0e810	b 0x00a0e840
00a0e814	bl 0x00c342a0
00a0e818	adrp x2,0x2d5000
00a0e81c	mov w1,#0x336
00a0e820	mov x0,x20
00a0e824	add x2,x2,#0xb30
00a0e828	bl 0x00c342b0
00a0e82c	bl 0x00c30710
00a0e830	ldr w1,[x0]
00a0e834	adrp x2,0x2db000
00a0e838	mov w0,#0x2
00a0e83c	add x2,x2,#0xe12
00a0e840	mov x3,x26
00a0e844	bl 0x00c342c0
00a0e848	mov x27,xzr
00a0e84c	cmp x26,x24
00a0e850	b.eq 0x00a0e864
00a0e854	orr w2,wzr,#0x1f8
00a0e858	mov x0,x26
00a0e85c	mov x1,x20
00a0e860	bl 0x00c32310
00a0e864	cbz x27,0x00a0e894
00a0e868	ldr x26,[sp, #0x28]
00a0e86c	cbnz x25,0x00a0e87c
00a0e870	bl 0x00c34780
00a0e874	mov x25,x0
00a0e878	cbz x0,0x00a0ef4c
00a0e87c	mov x0,x25
00a0e880	mov x1,x21
00a0e884	bl 0x00c347a0
00a0e888	cbz w0,0x00a0eee8
00a0e88c	mov x21,x27
00a0e890	b 0x00a0e898
00a0e894	ldr x26,[sp, #0x28]
00a0e898	mov w1,#0x200
00a0e89c	mov x0,x23
00a0e8a0	bl 0x00c37000
00a0e8a4	mov w22,wzr
00a0e8a8	cbnz x0,0x00a0ddb4
00a0e8ac	b 0x00a0ec8c
00a0e8b0	adrp x1,0x2c8000
00a0e8b4	mov x0,x26
00a0e8b8	add x1,x1,#0xcc8
00a0e8bc	bl 0x00c387e0
00a0e8c0	mov x27,x0
00a0e8c4	cmp x26,x24
00a0e8c8	b.ne 0x00a0e854
00a0e8cc	b 0x00a0e864
00a0e8d0	ldrsb w9,[x3]
00a0e8d4	ldr x23,[sp, #0x30]
00a0e8d8	tbnz w9,#0x1f,0x00a0e8f8
00a0e8dc	and x10,x9,#0xff
00a0e8e0	ldrh w10,[x8, x10, LSL #0x1]
00a0e8e4	and w10,w10,#0x18
00a0e8e8	cmp w10,#0x10
00a0e8ec	b.ne 0x00a0e8f8
00a0e8f0	ldrsb w9,[x3, #0x1]!
00a0e8f4	tbz w9,#0x1f,0x00a0e8dc
00a0e8f8	ldr x10,[sp, #0x10]
00a0e8fc	mov x11,x3
00a0e900	ldr w10,[x10]
00a0e904	sxtb w12,w9
00a0e908	tbnz w12,#0x1f,0x00a0e96c
00a0e90c	mov x12,x11
00a0e910	and x13,x9,#0xff
00a0e914	ldrh w13,[x8, x13, LSL #0x1]
00a0e918	tbnz w13,#0x5,0x00a0e938
00a0e91c	mov w14,#0x307
00a0e920	tst w13,w14
00a0e924	b.ne 0x00a0e930
00a0e928	cbz w10,0x00a0e994
00a0e92c	tbz w13,#0xc,0x00a0e994
00a0e930	add x13,x12,#0x1
00a0e934	b 0x00a0e958
00a0e938	mov x13,x12
00a0e93c	ldrsb w9,[x13, #0x1]!
00a0e940	tbnz w9,#0x1f,0x00a0e954
00a0e944	and x9,x9,#0xff
00a0e948	lsl x9,x9,#0x1
00a0e94c	ldrb w9,[x8, x9]
00a0e950	tbnz w9,#0x3,0x00a0e958
00a0e954	add x13,x12,#0x2
00a0e958	ldrsb w9,[x13]
00a0e95c	mov x12,x13
00a0e960	mov x14,x13
00a0e964	tbz w9,#0x1f,0x00a0e910
00a0e968	b 0x00a0e974
00a0e96c	mov x13,x11
00a0e970	mov x14,x11
00a0e974	ands w12,w9,#0xff
00a0e978	b.eq 0x00a0ee14
00a0e97c	cmp w12,#0x5d
00a0e980	b.eq 0x00a0ea10
00a0e984	cmp x11,x14
00a0e988	mov x11,x14
00a0e98c	b.ne 0x00a0e904
00a0e990	b 0x00a0ee14
00a0e994	and w13,w13,#0x18
00a0e998	cmp w13,#0x10
00a0e99c	b.ne 0x00a0e9d8
00a0e9a0	add x13,x12,#0x1
00a0e9a4	ldrsb w9,[x13]
00a0e9a8	mov x14,x13
00a0e9ac	tbnz w9,#0x1f,0x00a0e9c8
00a0e9b0	and x13,x9,#0xff
00a0e9b4	ldrh w13,[x8, x13, LSL #0x1]
00a0e9b8	and w13,w13,#0x18
00a0e9bc	cmp w13,#0x10
00a0e9c0	add x13,x14,#0x1
00a0e9c4	b.eq 0x00a0e9a4
00a0e9c8	mov x13,x12
00a0e9cc	ands w12,w9,#0xff
00a0e9d0	b.ne 0x00a0e97c
00a0e9d4	b 0x00a0ee14
00a0e9d8	mov x13,x12
00a0e9dc	mov x14,x12
00a0e9e0	ands w12,w9,#0xff
00a0e9e4	b.ne 0x00a0e97c
00a0e9e8	b 0x00a0ee14
00a0e9ec	add x1,sp,#0x48
00a0e9f0	mov x0,x26
00a0e9f4	bl 0x00a0f0ec
00a0e9f8	cmp x0,#0x0
00a0e9fc	mov x27,x0
00a0ea00	csel x24,x24,x26,eq
00a0ea04	cmp x26,x24
00a0ea08	b.ne 0x00a0e854
00a0ea0c	b 0x00a0e864
00a0ea10	add x2,sp,#0x50
00a0ea14	mov x0,x19
00a0ea18	mov x1,xzr
00a0ea1c	strb wzr,[x13]
00a0ea20	bl 0x00a0f2a8
00a0ea24	cbz w0,0x00a0ef84
00a0ea28	ldr x26,[sp, #0x50]
00a0ea2c	mov x0,x19
00a0ea30	mov x1,x26
00a0ea34	bl 0x00c393d0
00a0ea38	str x0,[sp, #0x18]
00a0ea3c	cbnz x0,0x00a0ea54
00a0ea40	mov x0,x19
00a0ea44	mov x1,x26
00a0ea48	bl 0x00c39410
00a0ea4c	str x0,[sp, #0x18]
00a0ea50	cbz x0,0x00a0ef98
00a0ea54	ldr x23,[sp, #0x30]
00a0ea58	mov w1,#0x200
00a0ea5c	mov x0,x23
00a0ea60	bl 0x00c37000
00a0ea64	ldp x28,x26,[sp, #0x20]
00a0ea68	mov w22,wzr
00a0ea6c	cbnz x0,0x00a0ddb4
00a0ea70	b 0x00a0ec8c
00a0ea74	bl 0x00c342a0
00a0ea78	adrp x0,0x2d7000
00a0ea7c	adrp x2,0x2d3000
00a0ea80	add x0,x0,#0xc86
00a0ea84	add x2,x2,#0x943
00a0ea88	mov w1,#0xea
00a0ea8c	bl 0x00c342b0
00a0ea90	mov w1,#0x7
00a0ea94	orr w0,wzr,#0xe
00a0ea98	movk w1,#0x8, LSL #16
00a0ea9c	mov x2,xzr
00a0eaa0	bl 0x00c342c0
00a0eaa4	mov x24,xzr
00a0eaa8	str xzr,[sp, #0x38]
00a0eaac	mov x27,xzr
00a0eab0	mov x20,xzr
00a0eab4	b 0x00a0eb18
00a0eab8	bl 0x00c342a0
00a0eabc	adrp x0,0x2d7000
00a0eac0	adrp x2,0x2d3000
00a0eac4	add x0,x0,#0xc86
00a0eac8	add x2,x2,#0x943
00a0eacc	orr w1,wzr,#0xf0
00a0ead0	b 0x00a0eaec
00a0ead4	bl 0x00c342a0
00a0ead8	adrp x0,0x2d7000
00a0eadc	adrp x2,0x2d3000
00a0eae0	add x0,x0,#0xc86
00a0eae4	add x2,x2,#0x943
00a0eae8	mov w1,#0xf5
00a0eaec	bl 0x00c342b0
00a0eaf0	mov w1,#0x100
00a0eaf4	orr w0,wzr,#0xe
00a0eaf8	movk w1,#0xc, LSL #16
00a0eafc	mov x2,xzr
00a0eb00	bl 0x00c342c0
00a0eb04	mov x24,xzr
00a0eb08	mov x27,xzr
00a0eb0c	mov x20,xzr
00a0eb10	str xzr,[sp, #0x38]
00a0eb14	ldr x23,[sp, #0x30]
00a0eb18	mov x25,xzr
00a0eb1c	mov x0,x23
00a0eb20	bl 0x00c35660
00a0eb24	ldr x0,[sp, #0x50]
00a0eb28	adrp x1,0x2d7000
00a0eb2c	add x1,x1,#0xc86
00a0eb30	mov w2,#0x245
00a0eb34	bl 0x00c32310
00a0eb38	mov x0,x25
00a0eb3c	bl 0x00c325e0
00a0eb40	cmp w0,#0x1
00a0eb44	b.lt 0x00a0eb70
00a0eb48	mov x0,x25
00a0eb4c	bl 0x00c325f0
00a0eb50	mov x22,x0
00a0eb54	mov x0,x21
00a0eb58	bl 0x00c38670
00a0eb5c	mov x0,x25
00a0eb60	bl 0x00c325e0
00a0eb64	cmp w0,#0x0
00a0eb68	mov x21,x22
00a0eb6c	b.gt 0x00a0eb48
00a0eb70	mov x0,x25
00a0eb74	bl 0x00c34770
00a0eb78	adrp x1,0x2d7000
00a0eb7c	add x1,x1,#0xc86
00a0eb80	mov w2,#0x252
00a0eb84	mov x0,x24
00a0eb88	bl 0x00c32310
00a0eb8c	ldr x8,[sp, #0x48]
00a0eb90	cbz x8,0x00a0eb9c
00a0eb94	add x0,sp,#0x48
00a0eb98	bl 0x00c34d90
00a0eb9c	ldr x3,[sp, #0x38]
00a0eba0	cbz x26,0x00a0eba8
00a0eba4	str x3,[x26]
00a0eba8	adrp x2,0x2d1000
00a0ebac	add x2,x2,#0x1bf
00a0ebb0	add x0,sp,#0x58
00a0ebb4	orr w1,wzr,#0x18
00a0ebb8	bl 0x00c34d30
00a0ebbc	adrp x1,0x2b4000
00a0ebc0	add x1,x1,#0x5a
00a0ebc4	mov w0,#0x2
00a0ebc8	add x2,sp,#0x58
00a0ebcc	bl 0x00c37fb0
00a0ebd0	ldr x0,[x19, #0x10]
00a0ebd4	cmp x28,x0
00a0ebd8	b.eq 0x00a0ebe4
00a0ebdc	bl 0x00c39440
00a0ebe0	str xzr,[x19, #0x10]
00a0ebe4	cbz x20,0x00a0ec20
00a0ebe8	ldr x0,[x20, #0x8]
00a0ebec	adrp x19,0x2d7000
00a0ebf0	add x19,x19,#0xc86
00a0ebf4	mov w2,#0x25f
00a0ebf8	mov x1,x19
00a0ebfc	bl 0x00c32310
00a0ec00	ldr x0,[x20, #0x10]
00a0ec04	mov w2,#0x260
00a0ec08	mov x1,x19
00a0ec0c	bl 0x00c32310
00a0ec10	mov w2,#0x261
00a0ec14	mov x0,x27
00a0ec18	mov x1,x19
00a0ec1c	bl 0x00c32310
00a0ec20	mov w0,wzr
00a0ec24	ldp x29,x30,[sp, #0x130]
00a0ec28	ldp x20,x19,[sp, #0x120]
00a0ec2c	ldp x22,x21,[sp, #0x110]
00a0ec30	ldp x24,x23,[sp, #0x100]
00a0ec34	ldp x26,x25,[sp, #0xf0]
00a0ec38	ldp x28,x27,[sp, #0xe0]
00a0ec3c	add sp,sp,#0x140
00a0ec40	ret
00a0ec44	bl 0x00c342a0
00a0ec48	adrp x0,0x2d7000
00a0ec4c	adrp x2,0x2d3000
00a0ec50	add x0,x0,#0xc86
00a0ec54	add x2,x2,#0x943
00a0ec58	mov w1,#0xfb
00a0ec5c	bl 0x00c342b0
00a0ec60	orr w0,wzr,#0xe
00a0ec64	mov w1,#0x67
00a0ec68	mov x2,xzr
00a0ec6c	bl 0x00c342c0
00a0ec70	mov x24,xzr
00a0ec74	str xzr,[sp, #0x38]
00a0ec78	mov x27,xzr
00a0ec7c	b 0x00a0eb14
00a0ec80	mov x25,xzr
00a0ec84	mov x24,xzr
00a0ec88	str xzr,[sp, #0x38]
00a0ec8c	bl 0x00c342a0
00a0ec90	adrp x0,0x2d7000
00a0ec94	adrp x2,0x2d3000
00a0ec98	add x0,x0,#0xc86
00a0ec9c	add x2,x2,#0x943
00a0eca0	mov w1,#0x103
00a0eca4	bl 0x00c342b0
00a0eca8	mov w1,#0x7
00a0ecac	orr w0,wzr,#0xe
00a0ecb0	movk w1,#0x8, LSL #16
00a0ecb4	mov x2,xzr
00a0ecb8	bl 0x00c342c0
00a0ecbc	b 0x00a0ef8c
00a0ecc0	ldr x0,[sp, #0x30]
00a0ecc4	bl 0x00c35660
00a0ecc8	ldr x0,[sp, #0x50]
00a0eccc	adrp x1,0x2d7000
00a0ecd0	add x1,x1,#0xc86
00a0ecd4	mov w2,#0x23b
00a0ecd8	bl 0x00c32310
00a0ecdc	mov x0,x25
00a0ece0	bl 0x00c34770
00a0ece4	mov w0,#0x1
00a0ece8	b 0x00a0ec24
00a0ecec	mov x23,x27
00a0ecf0	b 0x00a0ec8c
00a0ecf4	bl 0x00c342a0
00a0ecf8	adrp x0,0x2d7000
00a0ecfc	adrp x2,0x2d3000
00a0ed00	add x0,x0,#0xc86
00a0ed04	add x2,x2,#0x943
00a0ed08	mov w1,#0x212
00a0ed0c	bl 0x00c342b0
00a0ed10	adrp x2,0x2b7000
00a0ed14	add x2,x2,#0x91b
00a0ed18	orr w0,wzr,#0xe
00a0ed1c	mov w1,#0x65
00a0ed20	mov x3,x26
00a0ed24	bl 0x00c342c0
00a0ed28	b 0x00a0edd0
00a0ed2c	bl 0x00c342a0
00a0ed30	adrp x0,0x2d7000
00a0ed34	adrp x2,0x2d3000
00a0ed38	add x0,x0,#0xc86
00a0ed3c	add x2,x2,#0x943
00a0ed40	mov w1,#0x21c
00a0ed44	bl 0x00c342b0
00a0ed48	mov w1,#0x100
00a0ed4c	orr w0,wzr,#0xe
00a0ed50	movk w1,#0xc, LSL #16
00a0ed54	mov x2,xzr
00a0ed58	bl 0x00c342c0
00a0ed5c	ldr x26,[sp, #0x28]
00a0ed60	mov x20,xzr
00a0ed64	b 0x00a0eb1c
00a0ed68	bl 0x00c342a0
00a0ed6c	adrp x0,0x2d7000
00a0ed70	adrp x2,0x2d3000
00a0ed74	add x0,x0,#0xc86
00a0ed78	add x2,x2,#0x943
00a0ed7c	mov w1,#0x222
00a0ed80	bl 0x00c342b0
00a0ed84	mov w1,#0x100
00a0ed88	orr w0,wzr,#0xe
00a0ed8c	movk w1,#0xc, LSL #16
00a0ed90	mov x2,xzr
00a0ed94	bl 0x00c342c0
00a0ed98	ldr x26,[sp, #0x28]
00a0ed9c	mov x20,x27
00a0eda0	b 0x00a0eb1c
00a0eda4	bl 0x00c342a0
00a0eda8	adrp x0,0x2d7000
00a0edac	adrp x2,0x2d3000
00a0edb0	add x0,x0,#0xc86
00a0edb4	add x2,x2,#0x943
00a0edb8	mov w1,#0x198
00a0edbc	bl 0x00c342b0
00a0edc0	orr w0,wzr,#0xe
00a0edc4	mov w1,#0x7a
00a0edc8	mov x2,xzr
00a0edcc	bl 0x00c342c0
00a0edd0	ldr x26,[sp, #0x28]
00a0edd4	b 0x00a0ef8c
00a0edd8	bl 0x00c342a0
00a0eddc	adrp x0,0x2d7000
00a0ede0	adrp x2,0x2d3000
00a0ede4	add x0,x0,#0xc86
00a0ede8	add x2,x2,#0x943
00a0edec	mov w1,#0x234
00a0edf0	bl 0x00c342b0
00a0edf4	mov w1,#0x100
00a0edf8	orr w0,wzr,#0xe
00a0edfc	movk w1,#0xc, LSL #16
00a0ee00	mov x2,xzr
00a0ee04	bl 0x00c342c0
00a0ee08	ldr x23,[sp, #0x30]
00a0ee0c	mov x20,x27
00a0ee10	b 0x00a0eb1c
00a0ee14	bl 0x00c342a0
00a0ee18	adrp x0,0x2d7000
00a0ee1c	adrp x2,0x2d3000
00a0ee20	add x0,x0,#0xc86
00a0ee24	add x2,x2,#0x943
00a0ee28	mov w1,#0x171
00a0ee2c	bl 0x00c342b0
00a0ee30	orr w0,wzr,#0xe
00a0ee34	mov w1,#0x64
00a0ee38	b 0x00a0ecb4
00a0ee3c	bl 0x00c342a0
00a0ee40	adrp x0,0x2d7000
00a0ee44	adrp x2,0x2d3000
00a0ee48	add x0,x0,#0xc86
00a0ee4c	add x2,x2,#0x943
00a0ee50	mov w1,#0x22e
00a0ee54	bl 0x00c342b0
00a0ee58	orr w0,wzr,#0xe
00a0ee5c	mov w1,#0x67
00a0ee60	mov x2,xzr
00a0ee64	bl 0x00c342c0
00a0ee68	mov x20,x27
00a0ee6c	b 0x00a0eb1c
00a0ee70	bl 0x00c342a0
00a0ee74	adrp x0,0x2d7000
00a0ee78	adrp x2,0x2d3000
00a0ee7c	add x0,x0,#0xc86
00a0ee80	add x2,x2,#0x943
00a0ee84	mov w1,#0x1b0
00a0ee88	bl 0x00c342b0
00a0ee8c	mov w1,#0x100
00a0ee90	orr w0,wzr,#0xe
00a0ee94	movk w1,#0xc, LSL #16
00a0ee98	mov x2,xzr
00a0ee9c	bl 0x00c342c0
00a0eea0	b 0x00a0ef88
00a0eea4	bl 0x00c342a0
00a0eea8	adrp x27,0x2d7000
00a0eeac	add x27,x27,#0xc86
00a0eeb0	adrp x2,0x2d3000
00a0eeb4	add x2,x2,#0x943
00a0eeb8	mov w1,#0x1ee
00a0eebc	mov x0,x27
00a0eec0	bl 0x00c342b0
00a0eec4	orr w0,wzr,#0xe
00a0eec8	mov w1,#0x7d
00a0eecc	mov x2,xzr
00a0eed0	bl 0x00c342c0
00a0eed4	mov w2,#0x1ef
00a0eed8	mov x0,x26
00a0eedc	mov x1,x27
00a0eee0	bl 0x00c32310
00a0eee4	b 0x00a0ef84
00a0eee8	bl 0x00c342a0
00a0eeec	adrp x0,0x2d7000
00a0eef0	adrp x2,0x2d3000
00a0eef4	add x0,x0,#0xc86
00a0eef8	add x2,x2,#0x943
00a0eefc	mov w1,#0x209
00a0ef00	b 0x00a0ef64
00a0ef04	bl 0x00c342a0
00a0ef08	adrp x26,0x2d7000
00a0ef0c	add x26,x26,#0xc86
00a0ef10	adrp x2,0x2d3000
00a0ef14	add x2,x2,#0x943
00a0ef18	mov w1,#0x1de
00a0ef1c	mov x0,x26
00a0ef20	bl 0x00c342b0
00a0ef24	mov w1,#0x100
00a0ef28	orr w0,wzr,#0xe
00a0ef2c	movk w1,#0xc, LSL #16
00a0ef30	mov x2,xzr
00a0ef34	bl 0x00c342c0
00a0ef38	mov w2,#0x1df
00a0ef3c	mov x0,x27
00a0ef40	mov x1,x26
00a0ef44	bl 0x00c32310
00a0ef48	b 0x00a0ef84
00a0ef4c	bl 0x00c342a0
00a0ef50	adrp x0,0x2d7000
00a0ef54	adrp x2,0x2d3000
00a0ef58	add x0,x0,#0xc86
00a0ef5c	add x2,x2,#0x943
00a0ef60	mov w1,#0x203
00a0ef64	bl 0x00c342b0
00a0ef68	mov w1,#0x100
00a0ef6c	orr w0,wzr,#0xe
00a0ef70	movk w1,#0xc, LSL #16
00a0ef74	mov x2,xzr
00a0ef78	bl 0x00c342c0
00a0ef7c	mov x0,x27
00a0ef80	bl 0x00c31a40
00a0ef84	ldp x28,x26,[sp, #0x20]
00a0ef88	ldr x23,[sp, #0x30]
00a0ef8c	mov x27,xzr
00a0ef90	mov x20,xzr
00a0ef94	b 0x00a0eb1c
00a0ef98	bl 0x00c342a0
00a0ef9c	adrp x0,0x2d7000
00a0efa0	adrp x2,0x2d3000
00a0efa4	add x0,x0,#0xc86
00a0efa8	add x2,x2,#0x943
00a0efac	mov w1,#0x17a
00a0efb0	bl 0x00c342b0
00a0efb4	orr w0,wzr,#0xe
00a0efb8	mov w1,#0x67
00a0efbc	mov x2,xzr
00a0efc0	bl 0x00c342c0
00a0efc4	b 0x00a0ef84
