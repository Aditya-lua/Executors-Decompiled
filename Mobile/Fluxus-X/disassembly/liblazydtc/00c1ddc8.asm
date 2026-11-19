; FUN_00c1ddc8 @ 00c1ddc8
00c1ddc8	paciasp
00c1ddcc	sub sp,sp,#0xd0
00c1ddd0	stp x29,x30,[sp, #0x70]
00c1ddd4	stp x28,x27,[sp, #0x80]
00c1ddd8	stp x26,x25,[sp, #0x90]
00c1dddc	stp x24,x23,[sp, #0xa0]
00c1dde0	stp x22,x21,[sp, #0xb0]
00c1dde4	stp x20,x19,[sp, #0xc0]
00c1dde8	add x29,sp,#0x70
00c1ddec	ldp x8,x9,[x0]
00c1ddf0	sub x9,x9,x8
00c1ddf4	cmp x9,#0x2
00c1ddf8	b.cs 0x00c1de04
00c1ddfc	mov x0,xzr
00c1de00	b 0x00c1e680
00c1de04	ldrh w9,[x8]
00c1de08	mov w10,#0x7954
00c1de0c	mov x19,x0
00c1de10	mov x20,x1
00c1de14	cmp w9,w10
00c1de18	b.eq 0x00c1de88
00c1de1c	ldrh w9,[x8]
00c1de20	mov w10,#0x6b54
00c1de24	cmp w9,w10
00c1de28	b.eq 0x00c1df40
00c1de2c	ldrh w9,[x8]
00c1de30	mov w10,#0x6e54
00c1de34	cmp w9,w10
00c1de38	b.eq 0x00c1e018
00c1de3c	ldrh w9,[x8]
00c1de40	mov w10,#0x7454
00c1de44	cmp w9,w10
00c1de48	b.eq 0x00c1e0d4
00c1de4c	ldrh w9,[x8]
00c1de50	mov w10,#0x7054
00c1de54	cmp w9,w10
00c1de58	b.ne 0x00c1ddfc
00c1de5c	add x8,x8,#0x2
00c1de60	mov x0,x19
00c1de64	mov x1,x20
00c1de68	str x8,[x19]
00c1de6c	bl 0x00c1ddc8
00c1de70	str x0,[sp, #0x8]
00c1de74	cbz x0,0x00c1e680
00c1de78	add x1,sp,#0x8
00c1de7c	mov x0,x19
00c1de80	bl 0x00c1ea70
00c1de84	b 0x00c1e680
00c1de88	ldr w21,[x19, #0x318]
00c1de8c	add x8,x8,#0x2
00c1de90	ldr x22,[x19, #0x1330]
00c1de94	str x8,[x19]
00c1de98	add w8,w21,#0x1
00c1de9c	str w8,[x19, #0x318]
00c1dea0	ldr x8,[x22, #0x8]
00c1dea4	sub x9,x8,#0xfd0
00c1dea8	cmn x9,#0xff1
00c1deac	b.hi 0x00c1decc
00c1deb0	mov w0,#0x1000
00c1deb4	bl 0x00c308d0
00c1deb8	cbz x0,0x00c1e6a4
00c1debc	mov x8,xzr
00c1dec0	stp x22,xzr,[x0]
00c1dec4	mov x22,x0
00c1dec8	str x0,[x19, #0x1330]
00c1decc	add x9,x8,#0x20
00c1ded0	add x24,x22,x8
00c1ded4	adrp x8,0xcb2000
00c1ded8	add x8,x8,#0x300
00c1dedc	str x9,[x22, #0x8]
00c1dee0	mov w10,#0x540
00c1dee4	str x8,[x24, #0x10]!
00c1dee8	ldurh w8,[x24, #0x9]
00c1deec	mov w9,#0x21
00c1def0	stp wzr,w21,[x24, #0xc]
00c1def4	and w8,w8,#0xf000
00c1def8	strb w9,[x24, #0x8]
00c1defc	orr w8,w8,w10
00c1df00	sturh w8,[x24, #0x9]
00c1df04	cbz x20,0x00c1e1e0
00c1df08	ldp x23,x8,[x20, #0x8]
00c1df0c	cmp x23,x8
00c1df10	b.ne 0x00c1e1d8
00c1df14	mov x8,x20
00c1df18	ldr x22,[x8], #0x18
00c1df1c	sub x21,x23,x22
00c1df20	cmp x22,x8
00c1df24	lsl x1,x21,#0x1
00c1df28	b.eq 0x00c1e19c
00c1df2c	mov x0,x22
00c1df30	bl 0x00c30950
00c1df34	str x0,[x20]
00c1df38	cbnz x0,0x00c1e1c8
00c1df3c	bl 0x00c30b40
00c1df40	ldrb w25,[x19, #0x30a]
00c1df44	add x8,x8,#0x2
00c1df48	mov w9,#0x1
00c1df4c	str x8,[x19]
00c1df50	strb w9,[x19, #0x30a]
00c1df54	mov x0,x19
00c1df58	mov x1,xzr
00c1df5c	bl 0x00c12574
00c1df60	mov x21,x0
00c1df64	cbz x0,0x00c1e190
00c1df68	ldr w22,[x19, #0x318]
00c1df6c	ldr x23,[x19, #0x1330]
00c1df70	add w8,w22,#0x1
00c1df74	str w8,[x19, #0x318]
00c1df78	ldr x8,[x23, #0x8]
00c1df7c	sub x9,x8,#0xfd0
00c1df80	cmn x9,#0xff1
00c1df84	b.hi 0x00c1dfa4
00c1df88	mov w0,#0x1000
00c1df8c	bl 0x00c308d0
00c1df90	cbz x0,0x00c1e6a4
00c1df94	mov x8,xzr
00c1df98	stp x23,xzr,[x0]
00c1df9c	mov x23,x0
00c1dfa0	str x0,[x19, #0x1330]
00c1dfa4	add x9,x8,#0x20
00c1dfa8	add x26,x23,x8
00c1dfac	adrp x8,0xcb2000
00c1dfb0	add x8,x8,#0x300
00c1dfb4	str x9,[x23, #0x8]
00c1dfb8	mov w10,#0x540
00c1dfbc	str x8,[x26, #0x10]!
00c1dfc0	ldurh w8,[x26, #0x9]
00c1dfc4	mov w9,#0x21
00c1dfc8	stp wzr,w22,[x26, #0xc]
00c1dfcc	and w8,w8,#0xf000
00c1dfd0	strb w9,[x26, #0x8]
00c1dfd4	orr w8,w8,w10
00c1dfd8	sturh w8,[x26, #0x9]
00c1dfdc	cbz x20,0x00c1e340
00c1dfe0	ldp x24,x8,[x20, #0x8]
00c1dfe4	cmp x24,x8
00c1dfe8	b.ne 0x00c1e338
00c1dfec	mov x27,x20
00c1dff0	ldr x23,[x27], #0x18
00c1dff4	sub x22,x24,x23
00c1dff8	cmp x23,x27
00c1dffc	lsl x1,x22,#0x1
00c1e000	b.eq 0x00c1e2fc
00c1e004	mov x0,x23
00c1e008	bl 0x00c30950
00c1e00c	str x0,[x20]
00c1e010	cbnz x0,0x00c1e328
00c1e014	bl 0x00c30b40
00c1e018	ldr w21,[x19, #0x31c]
00c1e01c	add x8,x8,#0x2
00c1e020	ldr x22,[x19, #0x1330]
00c1e024	str x8,[x19]
00c1e028	add w8,w21,#0x1
00c1e02c	str w8,[x19, #0x31c]
00c1e030	ldr x8,[x22, #0x8]
00c1e034	sub x9,x8,#0xfd0
00c1e038	cmn x9,#0xff1
00c1e03c	b.hi 0x00c1e05c
00c1e040	mov w0,#0x1000
00c1e044	bl 0x00c308d0
00c1e048	cbz x0,0x00c1e6a4
00c1e04c	mov x8,xzr
00c1e050	stp x22,xzr,[x0]
00c1e054	mov x22,x0
00c1e058	str x0,[x19, #0x1330]
00c1e05c	add x9,x8,#0x20
00c1e060	add x24,x22,x8
00c1e064	adrp x8,0xcb2000
00c1e068	add x8,x8,#0x300
00c1e06c	str x9,[x22, #0x8]
00c1e070	mov w9,#0x21
00c1e074	str x8,[x24, #0x10]!
00c1e078	ldurh w8,[x24, #0x9]
00c1e07c	mov w10,#0x540
00c1e080	strb w9,[x24, #0x8]
00c1e084	mov w9,#0x1
00c1e088	and w8,w8,#0xf000
00c1e08c	stp w9,w21,[x24, #0xc]
00c1e090	orr w8,w8,w10
00c1e094	sturh w8,[x24, #0x9]
00c1e098	cbz x20,0x00c1e290
00c1e09c	ldp x23,x8,[x20, #0x8]
00c1e0a0	cmp x23,x8
00c1e0a4	b.ne 0x00c1e288
00c1e0a8	mov x25,x20
00c1e0ac	ldr x22,[x25], #0x18
00c1e0b0	sub x21,x23,x22
00c1e0b4	cmp x22,x25
00c1e0b8	lsl x1,x21,#0x1
00c1e0bc	b.eq 0x00c1e24c
00c1e0c0	mov x0,x22
00c1e0c4	bl 0x00c30950
00c1e0c8	str x0,[x20]
00c1e0cc	cbnz x0,0x00c1e278
00c1e0d0	bl 0x00c30b40
00c1e0d4	ldr w21,[x19, #0x320]
00c1e0d8	add x8,x8,#0x2
00c1e0dc	ldr x22,[x19, #0x1330]
00c1e0e0	str x8,[x19]
00c1e0e4	add w8,w21,#0x1
00c1e0e8	str w8,[x19, #0x320]
00c1e0ec	ldr x8,[x22, #0x8]
00c1e0f0	sub x9,x8,#0xfd0
00c1e0f4	cmn x9,#0xff1
00c1e0f8	b.hi 0x00c1e118
00c1e0fc	mov w0,#0x1000
00c1e100	bl 0x00c308d0
00c1e104	cbz x0,0x00c1e6a4
00c1e108	mov x8,xzr
00c1e10c	stp x22,xzr,[x0]
00c1e110	mov x22,x0
00c1e114	str x0,[x19, #0x1330]
00c1e118	add x9,x8,#0x20
00c1e11c	add x25,x22,x8
00c1e120	adrp x8,0xcb2000
00c1e124	add x8,x8,#0x300
00c1e128	str x9,[x22, #0x8]
00c1e12c	mov w9,#0x21
00c1e130	str x8,[x25, #0x10]!
00c1e134	ldurh w8,[x25, #0x9]
00c1e138	mov w10,#0x540
00c1e13c	strb w9,[x25, #0x8]
00c1e140	mov w9,#0x2
00c1e144	and w8,w8,#0xf000
00c1e148	stp w9,w21,[x25, #0xc]
00c1e14c	orr w8,w8,w10
00c1e150	sturh w8,[x25, #0x9]
00c1e154	cbz x20,0x00c1e3f4
00c1e158	ldp x23,x8,[x20, #0x8]
00c1e15c	cmp x23,x8
00c1e160	b.ne 0x00c1e3ec
00c1e164	mov x24,x20
00c1e168	ldr x22,[x24], #0x18
00c1e16c	sub x21,x23,x22
00c1e170	cmp x22,x24
00c1e174	lsl x1,x21,#0x1
00c1e178	b.eq 0x00c1e3b0
00c1e17c	mov x0,x22
00c1e180	bl 0x00c30950
00c1e184	str x0,[x20]
00c1e188	cbnz x0,0x00c1e3dc
00c1e18c	bl 0x00c30b40
00c1e190	mov x0,xzr
00c1e194	strb w25,[x19, #0x30a]
00c1e198	b 0x00c1e680
00c1e19c	mov x0,x1
00c1e1a0	bl 0x00c308d0
00c1e1a4	cbz x0,0x00c1e6d0
00c1e1a8	cmp x23,x22
00c1e1ac	b.eq 0x00c1e1c4
00c1e1b0	mov x1,x22
00c1e1b4	mov x2,x21
00c1e1b8	mov x23,x0
00c1e1bc	bl 0x00c2ff60
00c1e1c0	mov x0,x23
00c1e1c4	str x0,[x20]
00c1e1c8	asr x8,x21,#0x2
00c1e1cc	add x23,x0,x21
00c1e1d0	add x8,x0,x8, LSL #0x3
00c1e1d4	str x8,[x20, #0x10]
00c1e1d8	str x24,[x23], #0x8
00c1e1dc	str x23,[x20, #0x8]
00c1e1e0	ldr x20,[x19, #0x1330]
00c1e1e4	ldr x8,[x20, #0x8]
00c1e1e8	sub x9,x8,#0xfd0
00c1e1ec	cmn x9,#0xff1
00c1e1f0	b.hi 0x00c1e210
00c1e1f4	mov w0,#0x1000
00c1e1f8	bl 0x00c308d0
00c1e1fc	cbz x0,0x00c1e6a4
00c1e200	mov x8,xzr
00c1e204	stp x20,xzr,[x0]
00c1e208	mov x20,x0
00c1e20c	str x0,[x19, #0x1330]
00c1e210	add x9,x8,#0x20
00c1e214	add x0,x20,x8
00c1e218	adrp x8,0xcb2000
00c1e21c	add x8,x8,#0x378
00c1e220	str x9,[x20, #0x8]
00c1e224	mov w10,#0x500
00c1e228	str x8,[x0, #0x10]!
00c1e22c	ldurh w8,[x0, #0x9]
00c1e230	mov w9,#0x23
00c1e234	str x24,[x0, #0x10]
00c1e238	and w8,w8,#0xf000
00c1e23c	strb w9,[x0, #0x8]
00c1e240	orr w8,w8,w10
00c1e244	sturh w8,[x0, #0x9]
00c1e248	b 0x00c1e680
00c1e24c	mov x0,x1
00c1e250	bl 0x00c308d0
00c1e254	cbz x0,0x00c1e6d4
00c1e258	cmp x23,x25
00c1e25c	b.eq 0x00c1e274
00c1e260	mov x1,x22
00c1e264	mov x2,x21
00c1e268	mov x23,x0
00c1e26c	bl 0x00c2ff60
00c1e270	mov x0,x23
00c1e274	str x0,[x20]
00c1e278	asr x8,x21,#0x2
00c1e27c	add x23,x0,x21
00c1e280	add x8,x0,x8, LSL #0x3
00c1e284	str x8,[x20, #0x10]
00c1e288	str x24,[x23], #0x8
00c1e28c	str x23,[x20, #0x8]
00c1e290	mov x0,x19
00c1e294	bl 0x00c10bfc
00c1e298	cbz x0,0x00c1e680
00c1e29c	ldr x21,[x19, #0x1330]
00c1e2a0	mov x20,x0
00c1e2a4	ldr x8,[x21, #0x8]
00c1e2a8	sub x9,x8,#0xfd0
00c1e2ac	cmn x9,#0xff1
00c1e2b0	b.hi 0x00c1e2d0
00c1e2b4	mov w0,#0x1000
00c1e2b8	bl 0x00c308d0
00c1e2bc	cbz x0,0x00c1e6a4
00c1e2c0	mov x8,xzr
00c1e2c4	stp x21,xzr,[x0]
00c1e2c8	mov x21,x0
00c1e2cc	str x0,[x19, #0x1330]
00c1e2d0	add x9,x8,#0x20
00c1e2d4	add x0,x21,x8
00c1e2d8	adrp x8,0xcb2000
00c1e2dc	add x8,x8,#0x468
00c1e2e0	str x9,[x21, #0x8]
00c1e2e4	mov w10,#0x500
00c1e2e8	str x8,[x0, #0x10]!
00c1e2ec	ldurh w8,[x0, #0x9]
00c1e2f0	mov w9,#0x25
00c1e2f4	stp x24,x20,[x0, #0x10]
00c1e2f8	b 0x00c1e238
00c1e2fc	mov x0,x1
00c1e300	bl 0x00c308d0
00c1e304	cbz x0,0x00c1e6dc
00c1e308	cmp x24,x27
00c1e30c	b.eq 0x00c1e324
00c1e310	mov x1,x23
00c1e314	mov x2,x22
00c1e318	mov x24,x0
00c1e31c	bl 0x00c2ff60
00c1e320	mov x0,x24
00c1e324	str x0,[x20]
00c1e328	asr x8,x22,#0x2
00c1e32c	add x24,x0,x22
00c1e330	add x8,x0,x8, LSL #0x3
00c1e334	str x8,[x20, #0x10]
00c1e338	str x26,[x24], #0x8
00c1e33c	str x24,[x20, #0x8]
00c1e340	ldr x20,[x19, #0x1330]
00c1e344	ldr x8,[x20, #0x8]
00c1e348	sub x9,x8,#0xfd0
00c1e34c	cmn x9,#0xff1
00c1e350	b.hi 0x00c1e370
00c1e354	mov w0,#0x1000
00c1e358	bl 0x00c308d0
00c1e35c	cbz x0,0x00c1e6a4
00c1e360	mov x8,xzr
00c1e364	stp x20,xzr,[x0]
00c1e368	mov x20,x0
00c1e36c	str x0,[x19, #0x1330]
00c1e370	add x9,x8,#0x20
00c1e374	add x0,x20,x8
00c1e378	adrp x8,0xcb2000
00c1e37c	add x8,x8,#0x3f0
00c1e380	str x9,[x20, #0x8]
00c1e384	mov w10,#0x500
00c1e388	str x8,[x0, #0x10]!
00c1e38c	ldurh w8,[x0, #0x9]
00c1e390	mov w9,#0x24
00c1e394	stp x21,x26,[x0, #0x10]
00c1e398	and w8,w8,#0xf000
00c1e39c	strb w9,[x0, #0x8]
00c1e3a0	orr w8,w8,w10
00c1e3a4	sturh w8,[x0, #0x9]
00c1e3a8	strb w25,[x19, #0x30a]
00c1e3ac	b 0x00c1e680
00c1e3b0	mov x0,x1
00c1e3b4	bl 0x00c308d0
00c1e3b8	cbz x0,0x00c1e6e0
00c1e3bc	cmp x23,x24
00c1e3c0	b.eq 0x00c1e3d8
00c1e3c4	mov x1,x22
00c1e3c8	mov x2,x21
00c1e3cc	mov x23,x0
00c1e3d0	bl 0x00c2ff60
00c1e3d4	mov x0,x23
00c1e3d8	str x0,[x20]
00c1e3dc	asr x8,x21,#0x2
00c1e3e0	add x23,x0,x21
00c1e3e4	add x8,x0,x8, LSL #0x3
00c1e3e8	str x8,[x20, #0x10]
00c1e3ec	str x25,[x23], #0x8
00c1e3f0	str x23,[x20, #0x8]
00c1e3f4	ldr x22,[x19, #0x2a0]
00c1e3f8	ldr x21,[x19, #0x298]
00c1e3fc	add x23,sp,#0x8
00c1e400	movi v0.2D,#0x0
00c1e404	add x8,x23,#0x68
00c1e408	ldr x9,[x19, #0x2a8]
00c1e40c	sub x20,x22,x21
00c1e410	ldp x27,x24,[x19, #0x10]
00c1e414	str x8,[sp, #0x28]
00c1e418	asr x8,x20,#0x3
00c1e41c	add x26,x23,#0x28
00c1e420	cmp x22,x9
00c1e424	stp x26,x26,[sp, #0x18]
00c1e428	stp q0,q0,[sp, #0x30]
00c1e42c	stp x19,x8,[sp, #0x8]
00c1e430	stp q0,q0,[sp, #0x50]
00c1e434	b.ne 0x00c1e498
00c1e438	add x8,x19,#0x2b0
00c1e43c	lsl x1,x20,#0x1
00c1e440	cmp x21,x8
00c1e444	b.eq 0x00c1e45c
00c1e448	mov x0,x21
00c1e44c	bl 0x00c30950
00c1e450	str x0,[x19, #0x298]
00c1e454	cbnz x0,0x00c1e488
00c1e458	bl 0x00c30b40
00c1e45c	mov x0,x1
00c1e460	bl 0x00c308d0
00c1e464	cbz x0,0x00c1e6d8
00c1e468	cmp x22,x21
00c1e46c	b.eq 0x00c1e484
00c1e470	mov x1,x21
00c1e474	mov x2,x20
00c1e478	mov x22,x0
00c1e47c	bl 0x00c2ff60
00c1e480	mov x0,x22
00c1e484	str x0,[x19, #0x298]
00c1e488	asr x8,x20,#0x2
00c1e48c	add x22,x0,x20
00c1e490	add x8,x0,x8, LSL #0x3
00c1e494	str x8,[x19, #0x2a8]
00c1e498	add x21,x23,#0x10
00c1e49c	sub x8,x24,x27
00c1e4a0	add x27,x19,#0x28
00c1e4a4	str x21,[x22], #0x8
00c1e4a8	asr x20,x8,#0x3
00c1e4ac	ldp x8,x9,[x19]
00c1e4b0	str x22,[x19, #0x2a0]
00c1e4b4	cmp x8,x9
00c1e4b8	b.eq 0x00c1e4c8
00c1e4bc	ldrb w9,[x8]
00c1e4c0	cmp w9,#0x45
00c1e4c4	b.eq 0x00c1e5b8
00c1e4c8	mov x0,x19
00c1e4cc	mov x1,x21
00c1e4d0	bl 0x00c1ddc8
00c1e4d4	cbz x0,0x00c1e644
00c1e4d8	ldp x24,x8,[x19, #0x18]
00c1e4dc	cmp x24,x8
00c1e4e0	b.ne 0x00c1e550
00c1e4e4	ldr x23,[x19, #0x10]
00c1e4e8	mov x28,x0
00c1e4ec	sub x22,x24,x23
00c1e4f0	cmp x23,x27
00c1e4f4	lsl x1,x22,#0x1
00c1e4f8	b.eq 0x00c1e510
00c1e4fc	mov x0,x23
00c1e500	bl 0x00c30950
00c1e504	str x0,[x19, #0x10]
00c1e508	cbnz x0,0x00c1e53c
00c1e50c	b 0x00c1e6a8
00c1e510	mov x0,x1
00c1e514	bl 0x00c308d0
00c1e518	cbz x0,0x00c1e6ac
00c1e51c	cmp x24,x27
00c1e520	b.eq 0x00c1e538
00c1e524	mov x1,x23
00c1e528	mov x2,x22
00c1e52c	mov x24,x0
00c1e530	bl 0x00c2ff60
00c1e534	mov x0,x24
00c1e538	str x0,[x19, #0x10]
00c1e53c	asr x8,x22,#0x2
00c1e540	add x24,x0,x22
00c1e544	add x8,x0,x8, LSL #0x3
00c1e548	mov x0,x28
00c1e54c	str x8,[x19, #0x20]
00c1e550	str x0,[x24], #0x8
00c1e554	ldp x8,x9,[x19]
00c1e558	str x24,[x19, #0x18]
00c1e55c	cmp x8,x9
00c1e560	b.eq 0x00c1e4b4
00c1e564	ldrb w10,[x8]
00c1e568	cmp w10,#0x51
00c1e56c	b.ne 0x00c1e4b4
00c1e570	ldrb w22,[x19, #0x30a]
00c1e574	add x8,x8,#0x1
00c1e578	mov w9,#0x1
00c1e57c	str x8,[x19]
00c1e580	strb w9,[x19, #0x30a]
00c1e584	mov x0,x19
00c1e588	bl 0x00c16098
00c1e58c	mov x21,x0
00c1e590	strb w22,[x19, #0x30a]
00c1e594	cbz x0,0x00c1e5b0
00c1e598	ldp x8,x9,[x19]
00c1e59c	cmp x8,x9
00c1e5a0	b.eq 0x00c1e5b0
00c1e5a4	ldrb w9,[x8]
00c1e5a8	cmp w9,#0x45
00c1e5ac	b.eq 0x00c1e5bc
00c1e5b0	mov x0,xzr
00c1e5b4	b 0x00c1e644
00c1e5b8	mov x21,xzr
00c1e5bc	add x8,x8,#0x1
00c1e5c0	str x8,[x19]
00c1e5c4	mov x0,x19
00c1e5c8	mov x1,x20
00c1e5cc	bl 0x00c13140
00c1e5d0	ldr x23,[x19, #0x1330]
00c1e5d4	mov x22,x0
00c1e5d8	mov x20,x1
00c1e5dc	ldr x8,[x23, #0x8]
00c1e5e0	sub x9,x8,#0xfc0
00c1e5e4	cmn x9,#0xff1
00c1e5e8	b.hi 0x00c1e608
00c1e5ec	mov w0,#0x1000
00c1e5f0	bl 0x00c308d0
00c1e5f4	cbz x0,0x00c1e6a4
00c1e5f8	mov x8,xzr
00c1e5fc	stp x23,xzr,[x0]
00c1e600	mov x23,x0
00c1e604	str x0,[x19, #0x1330]
00c1e608	add x9,x8,#0x30
00c1e60c	add x0,x23,x8
00c1e610	adrp x8,0xcb2000
00c1e614	add x8,x8,#0x4e0
00c1e618	str x9,[x23, #0x8]
00c1e61c	mov w9,#0x26
00c1e620	str x8,[x0, #0x10]!
00c1e624	ldurh w8,[x0, #0x9]
00c1e628	strb w9,[x0, #0x8]
00c1e62c	mov w9,#0x500
00c1e630	and w8,w8,#0xf000
00c1e634	stp x25,x22,[x0, #0x10]
00c1e638	orr w8,w8,w9
00c1e63c	stp x20,x21,[x0, #0x20]
00c1e640	sturh w8,[x0, #0x9]
00c1e644	ldp x9,x10,[sp, #0x8]
00c1e648	ldr x8,[x9, #0x2a0]
00c1e64c	ldr x11,[x9, #0x298]
00c1e650	sub x8,x8,x11
00c1e654	cmp x10,x8, ASR #0x3
00c1e658	b.hi 0x00c1e6b0
00c1e65c	ldr x8,[sp, #0x18]
00c1e660	add x10,x11,x10, LSL #0x3
00c1e664	cmp x8,x26
00c1e668	str x10,[x9, #0x2a0]
00c1e66c	b.eq 0x00c1e680
00c1e670	mov x19,x0
00c1e674	mov x0,x8
00c1e678	bl 0x00c30960
00c1e67c	mov x0,x19
00c1e680	ldp x20,x19,[sp, #0xc0]
00c1e684	ldp x22,x21,[sp, #0xb0]
00c1e688	ldp x24,x23,[sp, #0xa0]
00c1e68c	ldp x26,x25,[sp, #0x90]
00c1e690	ldp x28,x27,[sp, #0x80]
00c1e694	ldp x29,x30,[sp, #0x70]
00c1e698	add sp,sp,#0xd0
00c1e69c	autiasp
00c1e6a0	ret
00c1e6a4	bl 0x00c2fff0
00c1e6a8	bl 0x00c30b40
00c1e6ac	bl 0x00c30b40
00c1e6b0	adrp x0,0x29f000
00c1e6b4	add x0,x0,#0x357
00c1e6b8	adrp x1,0x2c0000
00c1e6bc	add x1,x1,#0xcf7
00c1e6c0	adrp x3,0x2ab000
00c1e6c4	add x3,x3,#0x32c
00c1e6c8	mov w2,#0xac7
00c1e6cc	bl 0x00c0de94
00c1e6d0	bl 0x00c30b40
00c1e6d4	bl 0x00c30b40
00c1e6d8	bl 0x00c30b40
00c1e6dc	bl 0x00c30b40
00c1e6e0	bl 0x00c30b40
