; FUN_00b2dff0 @ 00b2dff0
00b2dff0	stp x28,x27,[sp, #-0x60]!
00b2dff4	stp x26,x25,[sp, #0x10]
00b2dff8	stp x24,x23,[sp, #0x20]
00b2dffc	stp x22,x21,[sp, #0x30]
00b2e000	stp x20,x19,[sp, #0x40]
00b2e004	stp x29,x30,[sp, #0x50]
00b2e008	sub sp,sp,#0x1b0
00b2e00c	stp x1,x2,[sp, #0x8]
00b2e010	ldr q0,[x0]
00b2e014	cmp x2,#0x80
00b2e018	mov w10,#0x80
00b2e01c	mov x9,xzr
00b2e020	str q0,[sp, #0xb0]
00b2e024	ldr q0,[x0, #0x20]
00b2e028	ldr x11,[sp, #0xb0]
00b2e02c	csel x8,x2,x10,cc
00b2e030	str q0,[sp, #0xd0]
00b2e034	ldr q0,[x0, #0x30]
00b2e038	ldr x20,[sp, #0xd0]
00b2e03c	str q0,[sp, #0xe0]
00b2e040	ldr q0,[x0, #0x10]
00b2e044	stp x0,x8,[sp, #0x48]
00b2e048	str q0,[sp, #0xc0]
00b2e04c	ldr x8,[sp, #0x8]
00b2e050	str x9,[sp, #0xa8]
00b2e054	add x11,x20,x11
00b2e058	add x10,x8,x9
00b2e05c	ldr x8,[x10]
00b2e060	str x8,[sp, #0x130]
00b2e064	ldur q0,[x10, #0x8]
00b2e068	mov x9,x8
00b2e06c	str x8,[sp, #0xa0]
00b2e070	add x8,sp,#0x130
00b2e074	stur q0,[x8, #0x8]
00b2e078	ldur q1,[x10, #0x18]
00b2e07c	add x11,x11,x9
00b2e080	mov x9,#0x82d1
00b2e084	movk x9,#0xade6, LSL #16
00b2e088	stur q1,[x8, #0x18]
00b2e08c	ldur q1,[x10, #0x28]
00b2e090	fmov x21,d0
00b2e094	movk x9,#0x527f, LSL #32
00b2e098	movk x9,#0x510e, LSL #48
00b2e09c	stur q1,[x8, #0x28]
00b2e0a0	ldur q1,[x10, #0x38]
00b2e0a4	stur q1,[x8, #0x38]
00b2e0a8	ldur q1,[x10, #0x48]
00b2e0ac	stur q1,[x8, #0x48]
00b2e0b0	ldur q1,[x10, #0x58]
00b2e0b4	stur q1,[x8, #0x58]
00b2e0b8	ldur q1,[x10, #0x68]
00b2e0bc	stur q1,[x8, #0x68]
00b2e0c0	ldr x10,[x10, #0x78]
00b2e0c4	ldp x14,x8,[sp, #0x48]
00b2e0c8	str x10,[sp, #0x1a8]
00b2e0cc	ldp x12,x13,[x14, #0x40]
00b2e0d0	add x10,x21,x11
00b2e0d4	str x21,[sp, #0x98]
00b2e0d8	adds x15,x12,x8
00b2e0dc	eor x11,x11,x15
00b2e0e0	eor x11,x11,x9
00b2e0e4	mov x9,#0xc908
00b2e0e8	movk x9,#0xf3bc, LSL #16
00b2e0ec	movk x9,#0xe667, LSL #32
00b2e0f0	cinc x12,x13,cs
00b2e0f4	ror x13,x11,#0x20
00b2e0f8	movk x9,#0x6a09, LSL #48
00b2e0fc	stp x15,x12,[x14, #0x40]
00b2e100	add x15,x13,x9
00b2e104	eor x11,x15,x20
00b2e108	ror x16,x11,#0x18
00b2e10c	add x0,x10,x16
00b2e110	eor x10,x0,x13
00b2e114	ror x10,x10,#0x10
00b2e118	add x15,x10,x15
00b2e11c	eor x13,x15,x16
00b2e120	ror x30,x13,#0x3f
00b2e124	ldr x13,[sp, #0xb8]
00b2e128	ldr x16,[sp, #0xd8]
00b2e12c	ldp x17,x19,[sp, #0x140]
00b2e130	mov x9,#0x6c1f
00b2e134	movk x9,#0x2b3e, LSL #16
00b2e138	add x13,x16,x13
00b2e13c	add x13,x13,x17
00b2e140	movk x9,#0x688c, LSL #32
00b2e144	mov x8,#0x36f1
00b2e148	eor x12,x13,x12
00b2e14c	movk x9,#0x9b05, LSL #48
00b2e150	movk x8,#0x5f1d, LSL #16
00b2e154	eor x12,x12,x9
00b2e158	mov x9,#0xa73b
00b2e15c	movk x8,#0xf53a, LSL #32
00b2e160	movk x9,#0x84ca, LSL #16
00b2e164	movk x8,#0xa54f, LSL #48
00b2e168	movk x9,#0xae85, LSL #32
00b2e16c	str x8,[sp, #0x108]
00b2e170	ror x12,x12,#0x20
00b2e174	movk x9,#0xbb67, LSL #48
00b2e178	ldp x29,x28,[x14, #0x50]
00b2e17c	str x17,[sp, #0x88]
00b2e180	add x17,x12,x9
00b2e184	eor x16,x17,x16
00b2e188	add x13,x19,x13
00b2e18c	ror x16,x16,#0x18
00b2e190	add x18,x13,x16
00b2e194	eor x12,x18,x12
00b2e198	ror x12,x12,#0x10
00b2e19c	add x13,x12,x17
00b2e1a0	ldr x17,[sp, #0xc0]
00b2e1a4	ldr x14,[sp, #0xe0]
00b2e1a8	ldp x23,x7,[sp, #0x150]
00b2e1ac	mov x9,#0xbd6b
00b2e1b0	movk x9,#0xfb41, LSL #16
00b2e1b4	add x17,x14,x17
00b2e1b8	add x17,x17,x23
00b2e1bc	movk x9,#0xd9ab, LSL #32
00b2e1c0	eor x29,x17,x29
00b2e1c4	movk x9,#0x1f83, LSL #48
00b2e1c8	eor x29,x29,x9
00b2e1cc	mov x9,#0xf82b
00b2e1d0	movk x9,#0xfe94, LSL #16
00b2e1d4	movk x9,#0xf372, LSL #32
00b2e1d8	ror x29,x29,#0x20
00b2e1dc	movk x9,#0x3c6e, LSL #48
00b2e1e0	add x1,x29,x9
00b2e1e4	eor x14,x1,x14
00b2e1e8	add x17,x7,x17
00b2e1ec	ror x14,x14,#0x18
00b2e1f0	add x17,x17,x14
00b2e1f4	eor x29,x17,x29
00b2e1f8	ror x2,x29,#0x10
00b2e1fc	ldr x24,[sp, #0x180]
00b2e200	add x1,x2,x1
00b2e204	ldp x11,x20,[sp, #0x188]
00b2e208	eor x14,x1,x14
00b2e20c	ldr x29,[sp, #0xc8]
00b2e210	ldr x9,[sp, #0xe8]
00b2e214	ror x14,x14,#0x3f
00b2e218	ldp x27,x22,[sp, #0x160]
00b2e21c	add x18,x14,x18
00b2e220	add x18,x18,x24
00b2e224	str x10,[sp, #0x110]
00b2e228	eor x10,x18,x10
00b2e22c	add x18,x11,x18
00b2e230	mov x26,x11
00b2e234	mov x11,#0x2179
00b2e238	add x29,x9,x29
00b2e23c	movk x11,#0x137e, LSL #16
00b2e240	add x29,x29,x27
00b2e244	movk x11,#0xcd19, LSL #32
00b2e248	eor x28,x29,x28
00b2e24c	movk x11,#0x5be0, LSL #48
00b2e250	eor x28,x28,x11
00b2e254	ror x28,x28,#0x20
00b2e258	add x8,x28,x8
00b2e25c	ldp x25,x5,[sp, #0x170]
00b2e260	eor x9,x8,x9
00b2e264	add x29,x22,x29
00b2e268	ror x9,x9,#0x18
00b2e26c	eor x16,x13,x16
00b2e270	add x29,x29,x9
00b2e274	ror x16,x16,#0x3f
00b2e278	str x0,[sp, #0xb0]
00b2e27c	eor x28,x29,x28
00b2e280	add x0,x16,x0
00b2e284	ror x28,x28,#0x10
00b2e288	add x0,x0,x25
00b2e28c	add x8,x28,x8
00b2e290	eor x28,x28,x0
00b2e294	ror x28,x28,#0x20
00b2e298	add x1,x28,x1
00b2e29c	eor x16,x1,x16
00b2e2a0	add x0,x5,x0
00b2e2a4	ror x16,x16,#0x18
00b2e2a8	add x0,x0,x16
00b2e2ac	eor x28,x0,x28
00b2e2b0	ror x10,x10,#0x20
00b2e2b4	ror x28,x28,#0x10
00b2e2b8	eor x9,x8,x9
00b2e2bc	add x8,x10,x8
00b2e2c0	add x4,x28,x1
00b2e2c4	eor x14,x8,x14
00b2e2c8	eor x16,x4,x16
00b2e2cc	ror x14,x14,#0x18
00b2e2d0	ror x16,x16,#0x3f
00b2e2d4	ror x9,x9,#0x3f
00b2e2d8	add x18,x18,x14
00b2e2dc	add x1,x16,x23
00b2e2e0	add x17,x9,x17
00b2e2e4	eor x10,x18,x10
00b2e2e8	add x18,x1,x18
00b2e2ec	ldp x6,x1,[sp, #0x1a0]
00b2e2f0	add x17,x17,x20
00b2e2f4	str x12,[sp, #0x118]
00b2e2f8	ldr x3,[sp, #0x198]
00b2e2fc	eor x12,x17,x12
00b2e300	ror x11,x10,#0x10
00b2e304	ror x10,x12,#0x20
00b2e308	add x29,x29,x30
00b2e30c	add x12,x11,x8
00b2e310	add x8,x10,x15
00b2e314	add x29,x29,x6
00b2e318	str x2,[sp, #0x120]
00b2e31c	eor x14,x12,x14
00b2e320	eor x9,x8,x9
00b2e324	eor x2,x29,x2
00b2e328	str x15,[sp, #0xf0]
00b2e32c	add x17,x3,x17
00b2e330	ror x15,x14,#0x3f
00b2e334	ror x14,x9,#0x18
00b2e338	ror x2,x2,#0x20
00b2e33c	str x13,[sp, #0xf8]
00b2e340	add x9,x17,x14
00b2e344	add x13,x2,x13
00b2e348	str x30,[sp, #0xd0]
00b2e34c	eor x10,x9,x10
00b2e350	eor x30,x13,x30
00b2e354	add x29,x1,x29
00b2e358	ror x30,x30,#0x18
00b2e35c	ror x10,x10,#0x10
00b2e360	add x29,x29,x30
00b2e364	add x8,x10,x8
00b2e368	eor x2,x29,x2
00b2e36c	eor x14,x8,x14
00b2e370	ror x14,x14,#0x3f
00b2e374	ror x2,x2,#0x10
00b2e378	str x5,[sp, #0x58]
00b2e37c	add x17,x15,x5
00b2e380	mov x5,x6
00b2e384	str x6,[sp, #0x70]
00b2e388	add x6,x14,x3
00b2e38c	add x13,x2,x13
00b2e390	add x6,x6,x29
00b2e394	eor x29,x13,x30
00b2e398	eor x10,x10,x18
00b2e39c	add x0,x5,x0
00b2e3a0	ror x29,x29,#0x3f
00b2e3a4	ror x10,x10,#0x20
00b2e3a8	add x0,x0,x29
00b2e3ac	add x13,x13,x10
00b2e3b0	str x16,[sp, #0xd8]
00b2e3b4	eor x11,x0,x11
00b2e3b8	eor x16,x13,x16
00b2e3bc	ror x11,x11,#0x20
00b2e3c0	add x18,x18,x25
00b2e3c4	ror x16,x16,#0x18
00b2e3c8	add x8,x11,x8
00b2e3cc	add x30,x18,x16
00b2e3d0	eor x29,x8,x29
00b2e3d4	eor x10,x30,x10
00b2e3d8	add x0,x0,x24
00b2e3dc	ror x29,x29,#0x18
00b2e3e0	ror x10,x10,#0x10
00b2e3e4	add x0,x0,x29
00b2e3e8	add x5,x10,x13
00b2e3ec	add x17,x17,x9
00b2e3f0	eor x9,x0,x11
00b2e3f4	eor x11,x5,x16
00b2e3f8	ror x11,x11,#0x3f
00b2e3fc	eor x16,x2,x17
00b2e400	add x13,x11,x21
00b2e404	ror x16,x16,#0x20
00b2e408	add x13,x13,x0
00b2e40c	add x0,x16,x4
00b2e410	stp x15,x14,[sp, #0xe0]
00b2e414	eor x15,x0,x15
00b2e418	add x17,x1,x17
00b2e41c	ror x15,x15,#0x18
00b2e420	add x17,x17,x15
00b2e424	eor x16,x17,x16
00b2e428	eor x2,x6,x28
00b2e42c	ror x18,x9,#0x10
00b2e430	ror x9,x16,#0x10
00b2e434	ror x16,x2,#0x20
00b2e438	stp x12,x18,[sp, #0x108]
00b2e43c	add x12,x16,x12
00b2e440	eor x14,x12,x14
00b2e444	str x4,[sp, #0x100]
00b2e448	add x4,x6,x27
00b2e44c	ror x14,x14,#0x18
00b2e450	add x8,x18,x8
00b2e454	add x2,x4,x14
00b2e458	add x6,x17,x26
00b2e45c	add x17,x9,x0
00b2e460	eor x0,x8,x29
00b2e464	eor x16,x2,x16
00b2e468	ror x0,x0,#0x3f
00b2e46c	add x2,x2,x7
00b2e470	ror x4,x16,#0x10
00b2e474	add x16,x2,x0
00b2e478	add x2,x4,x12
00b2e47c	eor x14,x2,x14
00b2e480	stp x10,x9,[sp, #0x118]
00b2e484	eor x9,x16,x9
00b2e488	ror x14,x14,#0x3f
00b2e48c	add x12,x16,x19
00b2e490	ror x9,x9,#0x20
00b2e494	add x16,x6,x14
00b2e498	stp x8,x5,[sp, #0xf0]
00b2e49c	add x5,x9,x5
00b2e4a0	eor x10,x16,x10
00b2e4a4	str x0,[sp, #0xd0]
00b2e4a8	eor x0,x5,x0
00b2e4ac	ror x10,x10,#0x20
00b2e4b0	ror x0,x0,#0x18
00b2e4b4	add x8,x10,x8
00b2e4b8	add x6,x12,x0
00b2e4bc	eor x12,x8,x14
00b2e4c0	add x16,x16,x22
00b2e4c4	ror x12,x12,#0x18
00b2e4c8	add x16,x16,x12
00b2e4cc	eor x10,x16,x10
00b2e4d0	ror x10,x10,#0x10
00b2e4d4	add x8,x10,x8
00b2e4d8	eor x12,x8,x12
00b2e4dc	ror x12,x12,#0x3f
00b2e4e0	str x1,[sp, #0x90]
00b2e4e4	add x14,x12,x1
00b2e4e8	ldr x1,[sp, #0xa0]
00b2e4ec	eor x4,x13,x4
00b2e4f0	eor x15,x17,x15
00b2e4f4	ror x4,x4,#0x20
00b2e4f8	eor x9,x6,x9
00b2e4fc	add x14,x14,x6
00b2e500	add x6,x30,x1
00b2e504	ror x15,x15,#0x3f
00b2e508	add x17,x4,x17
00b2e50c	add x6,x6,x15
00b2e510	eor x11,x17,x11
00b2e514	eor x18,x18,x6
00b2e518	ldr x21,[sp, #0x88]
00b2e51c	add x13,x13,x20
00b2e520	ror x11,x11,#0x18
00b2e524	ror x18,x18,#0x20
00b2e528	add x13,x13,x11
00b2e52c	add x2,x18,x2
00b2e530	eor x4,x13,x4
00b2e534	eor x15,x2,x15
00b2e538	ror x4,x4,#0x10
00b2e53c	str x28,[sp, #0x128]
00b2e540	add x6,x6,x21
00b2e544	ror x28,x15,#0x18
00b2e548	add x17,x4,x17
00b2e54c	add x15,x6,x28
00b2e550	eor x11,x17,x11
00b2e554	eor x18,x15,x18
00b2e558	add x15,x15,x20
00b2e55c	ror x11,x11,#0x3f
00b2e560	add x15,x15,x11
00b2e564	ror x9,x9,#0x10
00b2e568	eor x10,x15,x10
00b2e56c	add x5,x9,x5
00b2e570	ror x10,x10,#0x20
00b2e574	eor x0,x5,x0
00b2e578	add x5,x10,x5
00b2e57c	str x11,[sp, #0xd8]
00b2e580	eor x11,x5,x11
00b2e584	add x13,x13,x26
00b2e588	ror x0,x0,#0x3f
00b2e58c	add x15,x15,x1
00b2e590	ror x11,x11,#0x18
00b2e594	ror x18,x18,#0x10
00b2e598	add x13,x13,x0
00b2e59c	add x30,x15,x11
00b2e5a0	add x2,x18,x2
00b2e5a4	eor x18,x13,x18
00b2e5a8	eor x10,x30,x10
00b2e5ac	ror x18,x18,#0x20
00b2e5b0	ror x6,x10,#0x10
00b2e5b4	add x8,x18,x8
00b2e5b8	add x5,x6,x5
00b2e5bc	eor x0,x8,x0
00b2e5c0	eor x10,x5,x11
00b2e5c4	add x13,x13,x25
00b2e5c8	ror x0,x0,#0x18
00b2e5cc	ror x11,x10,#0x3f
00b2e5d0	add x13,x13,x0
00b2e5d4	add x10,x11,x24
00b2e5d8	add x15,x10,x13
00b2e5dc	eor x10,x2,x28
00b2e5e0	eor x18,x13,x18
00b2e5e4	ror x10,x10,#0x3f
00b2e5e8	add x13,x16,x7
00b2e5ec	add x13,x13,x10
00b2e5f0	eor x9,x9,x13
00b2e5f4	ror x9,x9,#0x20
00b2e5f8	str x17,[sp, #0x100]
00b2e5fc	add x17,x9,x17
00b2e600	stp x10,x12,[sp, #0xe0]
00b2e604	eor x10,x17,x10
00b2e608	add x13,x13,x21
00b2e60c	ror x16,x10,#0x18
00b2e610	add x10,x13,x16
00b2e614	eor x13,x14,x4
00b2e618	ror x13,x13,#0x20
00b2e61c	str x2,[sp, #0x108]
00b2e620	add x2,x13,x2
00b2e624	str x7,[sp, #0x68]
00b2e628	mov x7,x3
00b2e62c	add x14,x14,x3
00b2e630	eor x12,x2,x12
00b2e634	ldr x3,[sp, #0x58]
00b2e638	str x4,[sp, #0x128]
00b2e63c	eor x9,x10,x9
00b2e640	add x4,x10,x22
00b2e644	ror x10,x18,#0x10
00b2e648	ror x12,x12,#0x18
00b2e64c	ror x9,x9,#0x10
00b2e650	add x8,x10,x8
00b2e654	add x14,x14,x12
00b2e658	add x18,x9,x17
00b2e65c	eor x17,x8,x0
00b2e660	eor x13,x14,x13
00b2e664	ror x17,x17,#0x3f
00b2e668	add x14,x14,x3
00b2e66c	ror x0,x13,#0x10
00b2e670	add x13,x14,x17
00b2e674	add x14,x0,x2
00b2e678	eor x12,x14,x12
00b2e67c	str x9,[sp, #0x120]
00b2e680	eor x9,x13,x9
00b2e684	ror x12,x12,#0x3f
00b2e688	ror x9,x9,#0x20
00b2e68c	add x4,x4,x12
00b2e690	stp x8,x5,[sp, #0xf0]
00b2e694	add x2,x9,x5
00b2e698	eor x5,x4,x6
00b2e69c	ldr x29,[sp, #0x98]
00b2e6a0	ror x5,x5,#0x20
00b2e6a4	add x8,x5,x8
00b2e6a8	eor x12,x8,x12
00b2e6ac	str x17,[sp, #0xd0]
00b2e6b0	eor x17,x2,x17
00b2e6b4	add x4,x4,x29
00b2e6b8	ror x12,x12,#0x18
00b2e6bc	stp x10,x6,[sp, #0x110]
00b2e6c0	add x13,x13,x23
00b2e6c4	ror x6,x17,#0x18
00b2e6c8	add x17,x4,x12
00b2e6cc	add x28,x13,x6
00b2e6d0	eor x13,x17,x5
00b2e6d4	ror x4,x13,#0x10
00b2e6d8	add x8,x4,x8
00b2e6dc	eor x12,x8,x12
00b2e6e0	ror x13,x12,#0x3f
00b2e6e4	add x12,x13,x26
00b2e6e8	eor x16,x18,x16
00b2e6ec	add x5,x12,x28
00b2e6f0	add x12,x30,x19
00b2e6f4	ror x16,x16,#0x3f
00b2e6f8	add x12,x12,x16
00b2e6fc	mov x1,x22
00b2e700	mov x22,x19
00b2e704	str x19,[sp, #0x80]
00b2e708	eor x10,x10,x12
00b2e70c	eor x0,x15,x0
00b2e710	ldr x19,[sp, #0x70]
00b2e714	ror x10,x10,#0x20
00b2e718	ror x0,x0,#0x20
00b2e71c	add x14,x10,x14
00b2e720	add x18,x0,x18
00b2e724	eor x16,x14,x16
00b2e728	eor x11,x18,x11
00b2e72c	add x12,x12,x27
00b2e730	add x15,x15,x19
00b2e734	ror x16,x16,#0x18
00b2e738	ror x11,x11,#0x18
00b2e73c	add x12,x12,x16
00b2e740	add x15,x15,x11
00b2e744	eor x9,x28,x9
00b2e748	eor x10,x12,x10
00b2e74c	eor x0,x15,x0
00b2e750	ror x10,x10,#0x10
00b2e754	ror x0,x0,#0x10
00b2e758	ror x9,x9,#0x10
00b2e75c	add x14,x10,x14
00b2e760	str x0,[sp, #0x128]
00b2e764	add x18,x0,x18
00b2e768	add x2,x9,x2
00b2e76c	eor x0,x5,x0
00b2e770	eor x11,x18,x11
00b2e774	eor x6,x2,x6
00b2e778	eor x16,x14,x16
00b2e77c	ror x0,x0,#0x20
00b2e780	add x12,x12,x22
00b2e784	add x15,x15,x1
00b2e788	ror x11,x11,#0x3f
00b2e78c	ror x6,x6,#0x3f
00b2e790	ror x16,x16,#0x3f
00b2e794	add x17,x17,x7
00b2e798	str x14,[sp, #0x108]
00b2e79c	add x14,x0,x14
00b2e7a0	add x15,x15,x6
00b2e7a4	add x12,x12,x11
00b2e7a8	stp x16,x13,[sp, #0xe0]
00b2e7ac	add x17,x17,x16
00b2e7b0	eor x13,x14,x13
00b2e7b4	eor x10,x15,x10
00b2e7b8	eor x4,x12,x4
00b2e7bc	eor x9,x9,x17
00b2e7c0	add x5,x5,x19
00b2e7c4	ror x13,x13,#0x18
00b2e7c8	ror x10,x10,#0x20
00b2e7cc	ror x4,x4,#0x20
00b2e7d0	ror x9,x9,#0x20
00b2e7d4	add x5,x5,x13
00b2e7d8	str x18,[sp, #0x100]
00b2e7dc	add x8,x10,x8
00b2e7e0	add x2,x4,x2
00b2e7e4	add x18,x9,x18
00b2e7e8	eor x0,x5,x0
00b2e7ec	str x11,[sp, #0xd8]
00b2e7f0	eor x6,x8,x6
00b2e7f4	eor x11,x2,x11
00b2e7f8	eor x16,x18,x16
00b2e7fc	ror x0,x0,#0x10
00b2e800	add x15,x15,x3
00b2e804	add x12,x12,x29
00b2e808	ror x6,x6,#0x18
00b2e80c	ror x11,x11,#0x18
00b2e810	add x17,x17,x20
00b2e814	ror x16,x16,#0x18
00b2e818	add x14,x0,x14
00b2e81c	add x15,x15,x6
00b2e820	add x12,x12,x11
00b2e824	add x17,x17,x16
00b2e828	eor x13,x14,x13
00b2e82c	eor x10,x15,x10
00b2e830	eor x4,x12,x4
00b2e834	eor x9,x17,x9
00b2e838	add x17,x17,x23
00b2e83c	ror x13,x13,#0x3f
00b2e840	str x26,[sp, #0x78]
00b2e844	ror x4,x4,#0x10
00b2e848	mov x29,x7
00b2e84c	ror x10,x10,#0x10
00b2e850	ldr x26,[sp, #0x90]
00b2e854	add x17,x17,x13
00b2e858	ldr x7,[sp, #0x68]
00b2e85c	str x20,[sp, #0x28]
00b2e860	add x2,x4,x2
00b2e864	ror x9,x9,#0x10
00b2e868	stp x10,x4,[sp, #0x110]
00b2e86c	eor x4,x17,x4
00b2e870	ldr x20,[sp, #0xa0]
00b2e874	eor x11,x2,x11
00b2e878	add x8,x10,x8
00b2e87c	add x18,x9,x18
00b2e880	ror x4,x4,#0x20
00b2e884	ror x11,x11,#0x3f
00b2e888	stp x8,x2,[sp, #0xf0]
00b2e88c	eor x6,x8,x6
00b2e890	add x8,x4,x8
00b2e894	eor x16,x18,x16
00b2e898	add x28,x11,x21
00b2e89c	ror x6,x6,#0x3f
00b2e8a0	add x5,x5,x26
00b2e8a4	eor x13,x8,x13
00b2e8a8	add x12,x12,x7
00b2e8ac	ror x16,x16,#0x3f
00b2e8b0	add x15,x28,x15
00b2e8b4	add x5,x5,x6
00b2e8b8	add x17,x17,x20
00b2e8bc	ror x13,x13,#0x18
00b2e8c0	add x12,x12,x16
00b2e8c4	str x9,[sp, #0x120]
00b2e8c8	eor x9,x5,x9
00b2e8cc	add x17,x17,x13
00b2e8d0	eor x10,x10,x12
00b2e8d4	eor x0,x15,x0
00b2e8d8	ror x9,x9,#0x20
00b2e8dc	eor x4,x17,x4
00b2e8e0	ror x10,x10,#0x20
00b2e8e4	ror x0,x0,#0x20
00b2e8e8	add x2,x9,x2
00b2e8ec	ror x4,x4,#0x10
00b2e8f0	add x14,x10,x14
00b2e8f4	add x18,x0,x18
00b2e8f8	str x6,[sp, #0xd0]
00b2e8fc	eor x6,x2,x6
00b2e900	add x8,x4,x8
00b2e904	eor x16,x14,x16
00b2e908	eor x11,x18,x11
00b2e90c	add x5,x5,x25
00b2e910	ror x6,x6,#0x18
00b2e914	eor x13,x8,x13
00b2e918	add x12,x12,x24
00b2e91c	add x15,x15,x27
00b2e920	ror x16,x16,#0x18
00b2e924	ror x11,x11,#0x18
00b2e928	add x5,x5,x6
00b2e92c	ror x13,x13,#0x3f
00b2e930	add x12,x12,x16
00b2e934	add x15,x15,x11
00b2e938	eor x9,x5,x9
00b2e93c	add x28,x13,x24
00b2e940	eor x10,x12,x10
00b2e944	eor x0,x15,x0
00b2e948	add x5,x28,x5
00b2e94c	ror x10,x10,#0x10
00b2e950	ror x0,x0,#0x10
00b2e954	ror x9,x9,#0x10
00b2e958	add x14,x10,x14
00b2e95c	str x0,[sp, #0x128]
00b2e960	add x18,x0,x18
00b2e964	add x2,x9,x2
00b2e968	eor x0,x5,x0
00b2e96c	eor x11,x18,x11
00b2e970	eor x6,x2,x6
00b2e974	eor x16,x14,x16
00b2e978	ror x0,x0,#0x20
00b2e97c	add x12,x12,x7
00b2e980	add x15,x15,x3
00b2e984	ror x11,x11,#0x3f
00b2e988	ror x6,x6,#0x3f
00b2e98c	ror x16,x16,#0x3f
00b2e990	add x17,x17,x21
00b2e994	str x14,[sp, #0x108]
00b2e998	add x14,x0,x14
00b2e99c	add x15,x15,x6
00b2e9a0	add x12,x12,x11
00b2e9a4	stp x16,x13,[sp, #0xe0]
00b2e9a8	add x17,x17,x16
00b2e9ac	eor x13,x14,x13
00b2e9b0	eor x10,x15,x10
00b2e9b4	eor x4,x12,x4
00b2e9b8	eor x9,x9,x17
00b2e9bc	add x5,x5,x26
00b2e9c0	ror x13,x13,#0x18
00b2e9c4	ror x10,x10,#0x20
00b2e9c8	ror x4,x4,#0x20
00b2e9cc	ror x9,x9,#0x20
00b2e9d0	add x5,x5,x13
00b2e9d4	str x18,[sp, #0x100]
00b2e9d8	add x8,x10,x8
00b2e9dc	add x2,x4,x2
00b2e9e0	add x18,x9,x18
00b2e9e4	eor x0,x5,x0
00b2e9e8	mov x22,x1
00b2e9ec	str x11,[sp, #0xd8]
00b2e9f0	eor x6,x8,x6
00b2e9f4	eor x11,x2,x11
00b2e9f8	eor x16,x18,x16
00b2e9fc	ror x0,x0,#0x10
00b2ea00	add x15,x15,x20
00b2ea04	add x12,x12,x22
00b2ea08	ror x6,x6,#0x18
00b2ea0c	ror x11,x11,#0x18
00b2ea10	add x17,x17,x23
00b2ea14	ror x16,x16,#0x18
00b2ea18	add x14,x0,x14
00b2ea1c	add x15,x15,x6
00b2ea20	add x12,x12,x11
00b2ea24	add x17,x17,x16
00b2ea28	eor x13,x14,x13
00b2ea2c	eor x10,x15,x10
00b2ea30	eor x4,x12,x4
00b2ea34	eor x9,x17,x9
00b2ea38	add x17,x17,x27
00b2ea3c	ror x13,x13,#0x3f
00b2ea40	str x1,[sp, #0x60]
00b2ea44	mov x1,x24
00b2ea48	ror x4,x4,#0x10
00b2ea4c	mov x24,x23
00b2ea50	mov x22,x27
00b2ea54	str x27,[sp, #0x38]
00b2ea58	ror x10,x10,#0x10
00b2ea5c	ldr x27,[sp, #0x80]
00b2ea60	add x17,x17,x13
00b2ea64	ldr x23,[sp, #0x78]
00b2ea68	add x2,x4,x2
00b2ea6c	ror x9,x9,#0x10
00b2ea70	stp x10,x4,[sp, #0x110]
00b2ea74	eor x4,x17,x4
00b2ea78	eor x11,x2,x11
00b2ea7c	add x8,x10,x8
00b2ea80	add x18,x9,x18
00b2ea84	ror x4,x4,#0x20
00b2ea88	ror x11,x11,#0x3f
00b2ea8c	stp x8,x2,[sp, #0xf0]
00b2ea90	eor x6,x8,x6
00b2ea94	add x8,x4,x8
00b2ea98	eor x16,x18,x16
00b2ea9c	mov x30,x25
00b2eaa0	add x28,x11,x19
00b2eaa4	ror x6,x6,#0x3f
00b2eaa8	add x5,x5,x27
00b2eaac	eor x13,x8,x13
00b2eab0	add x12,x12,x23
00b2eab4	ror x16,x16,#0x3f
00b2eab8	add x15,x28,x15
00b2eabc	add x5,x5,x6
00b2eac0	add x17,x17,x30
00b2eac4	ror x13,x13,#0x18
00b2eac8	add x12,x12,x16
00b2eacc	mov x7,x3
00b2ead0	mov x3,x20
00b2ead4	str x9,[sp, #0x120]
00b2ead8	eor x9,x5,x9
00b2eadc	mov x25,x29
00b2eae0	add x5,x5,x29
00b2eae4	add x17,x17,x13
00b2eae8	eor x10,x10,x12
00b2eaec	ldr x20,[sp, #0x28]
00b2eaf0	eor x0,x15,x0
00b2eaf4	ldr x29,[sp, #0x98]
00b2eaf8	ror x9,x9,#0x20
00b2eafc	eor x4,x17,x4
00b2eb00	ror x10,x10,#0x20
00b2eb04	ror x0,x0,#0x20
00b2eb08	add x2,x9,x2
00b2eb0c	ror x4,x4,#0x10
00b2eb10	add x14,x10,x14
00b2eb14	add x18,x0,x18
00b2eb18	str x6,[sp, #0xd0]
00b2eb1c	eor x6,x2,x6
00b2eb20	add x8,x4,x8
00b2eb24	eor x16,x14,x16
00b2eb28	eor x11,x18,x11
00b2eb2c	ror x6,x6,#0x18
00b2eb30	eor x13,x8,x13
00b2eb34	add x12,x12,x20
00b2eb38	add x15,x15,x29
00b2eb3c	ror x16,x16,#0x18
00b2eb40	ror x11,x11,#0x18
00b2eb44	add x5,x5,x6
00b2eb48	ror x13,x13,#0x3f
00b2eb4c	add x12,x12,x16
00b2eb50	add x15,x15,x11
00b2eb54	eor x9,x5,x9
00b2eb58	add x28,x13,x30
00b2eb5c	eor x10,x12,x10
00b2eb60	eor x0,x15,x0
00b2eb64	add x5,x28,x5
00b2eb68	ror x10,x10,#0x10
00b2eb6c	ror x0,x0,#0x10
00b2eb70	ror x9,x9,#0x10
00b2eb74	add x14,x10,x14
00b2eb78	str x0,[sp, #0x128]
00b2eb7c	add x18,x0,x18
00b2eb80	add x2,x9,x2
00b2eb84	eor x0,x5,x0
00b2eb88	eor x11,x18,x11
00b2eb8c	eor x6,x2,x6
00b2eb90	eor x16,x14,x16
00b2eb94	ror x0,x0,#0x20
00b2eb98	add x12,x12,x22
00b2eb9c	add x15,x15,x21
00b2eba0	ror x11,x11,#0x3f
00b2eba4	ror x6,x6,#0x3f
00b2eba8	ror x16,x16,#0x3f
00b2ebac	add x17,x17,x3
00b2ebb0	str x14,[sp, #0x108]
00b2ebb4	add x14,x0,x14
00b2ebb8	add x15,x15,x6
00b2ebbc	add x12,x12,x11
00b2ebc0	stp x16,x13,[sp, #0xe0]
00b2ebc4	add x17,x17,x16
00b2ebc8	eor x13,x14,x13
00b2ebcc	eor x10,x15,x10
00b2ebd0	eor x4,x12,x4
00b2ebd4	eor x9,x9,x17
00b2ebd8	add x5,x5,x27
00b2ebdc	ror x13,x13,#0x18
00b2ebe0	ror x10,x10,#0x20
00b2ebe4	ror x4,x4,#0x20
00b2ebe8	ror x9,x9,#0x20
00b2ebec	add x5,x5,x13
00b2ebf0	str x18,[sp, #0x100]
00b2ebf4	add x8,x10,x8
00b2ebf8	add x2,x4,x2
00b2ebfc	add x18,x9,x18
00b2ec00	eor x0,x5,x0
00b2ec04	str x11,[sp, #0xd8]
00b2ec08	eor x6,x8,x6
00b2ec0c	eor x11,x2,x11
00b2ec10	eor x16,x18,x16
00b2ec14	ror x0,x0,#0x10
00b2ec18	add x15,x15,x20
00b2ec1c	add x12,x12,x1
00b2ec20	ror x6,x6,#0x18
00b2ec24	ror x11,x11,#0x18
00b2ec28	add x17,x17,x23
00b2ec2c	ror x16,x16,#0x18
00b2ec30	add x14,x0,x14
00b2ec34	add x15,x15,x6
00b2ec38	add x12,x12,x11
00b2ec3c	add x17,x17,x16
00b2ec40	eor x13,x14,x13
00b2ec44	eor x10,x15,x10
00b2ec48	eor x4,x12,x4
00b2ec4c	eor x9,x17,x9
00b2ec50	add x17,x17,x26
00b2ec54	ror x13,x13,#0x3f
00b2ec58	ror x4,x4,#0x10
00b2ec5c	ror x10,x10,#0x10
00b2ec60	add x17,x17,x13
00b2ec64	add x2,x4,x2
00b2ec68	stp x10,x4,[sp, #0x110]
00b2ec6c	eor x4,x17,x4
00b2ec70	add x8,x10,x8
00b2ec74	ror x4,x4,#0x20
00b2ec78	stp x8,x2,[sp, #0xf0]
00b2ec7c	eor x6,x8,x6
00b2ec80	add x8,x4,x8
00b2ec84	eor x13,x8,x13
00b2ec88	add x17,x17,x19
00b2ec8c	ror x13,x13,#0x18
00b2ec90	add x17,x17,x13
00b2ec94	eor x4,x17,x4
00b2ec98	ror x4,x4,#0x10
00b2ec9c	eor x11,x2,x11
00b2eca0	add x8,x4,x8
00b2eca4	ror x11,x11,#0x3f
00b2eca8	eor x13,x8,x13
00b2ecac	mov x22,x24
00b2ecb0	add x28,x11,x24
00b2ecb4	ror x13,x13,#0x3f
00b2ecb8	str x24,[sp, #0x40]
00b2ecbc	add x15,x28,x15
00b2ecc0	mov x24,x29
00b2ecc4	add x5,x5,x29
00b2ecc8	add x28,x13,x22
00b2eccc	ldp x22,x29,[sp, #0x60]
00b2ecd0	ror x9,x9,#0x10
00b2ecd4	add x18,x9,x18
00b2ecd8	eor x0,x15,x0
00b2ecdc	eor x16,x18,x16
00b2ece0	ror x0,x0,#0x20
00b2ece4	add x12,x12,x22
00b2ece8	ror x16,x16,#0x3f
00b2ecec	add x18,x0,x18
00b2ecf0	ror x6,x6,#0x3f
00b2ecf4	add x12,x12,x16
00b2ecf8	eor x11,x18,x11
00b2ecfc	add x5,x5,x6
00b2ed00	eor x10,x10,x12
00b2ed04	add x15,x15,x25
00b2ed08	ror x11,x11,#0x18
00b2ed0c	str x9,[sp, #0x120]
00b2ed10	eor x9,x5,x9
00b2ed14	ror x10,x10,#0x20
00b2ed18	add x15,x15,x11
00b2ed1c	ror x9,x9,#0x20
00b2ed20	add x14,x10,x14
00b2ed24	eor x0,x15,x0
00b2ed28	add x2,x9,x2
00b2ed2c	eor x16,x14,x16
00b2ed30	ror x0,x0,#0x10
00b2ed34	str x6,[sp, #0xd0]
00b2ed38	eor x6,x2,x6
00b2ed3c	add x12,x12,x29
00b2ed40	ror x16,x16,#0x18
00b2ed44	add x18,x0,x18
00b2ed48	add x5,x5,x7
00b2ed4c	ror x6,x6,#0x18
00b2ed50	add x12,x12,x16
00b2ed54	eor x11,x18,x11
00b2ed58	add x5,x5,x6
00b2ed5c	eor x10,x12,x10
00b2ed60	add x12,x12,x24
00b2ed64	ror x11,x11,#0x3f
00b2ed68	eor x9,x5,x9
00b2ed6c	add x12,x12,x11
00b2ed70	ror x10,x10,#0x10
00b2ed74	ror x9,x9,#0x10
00b2ed78	eor x4,x12,x4
00b2ed7c	add x14,x10,x14
00b2ed80	add x2,x9,x2
00b2ed84	ror x4,x4,#0x20
00b2ed88	eor x6,x2,x6
00b2ed8c	add x2,x4,x2
00b2ed90	eor x16,x14,x16
00b2ed94	mov x21,x20
00b2ed98	str x11,[sp, #0xd8]
00b2ed9c	eor x11,x2,x11
00b2eda0	ror x16,x16,#0x3f
00b2eda4	add x17,x17,x19
00b2eda8	add x5,x28,x5
00b2edac	add x15,x15,x21
00b2edb0	ror x6,x6,#0x3f
00b2edb4	add x12,x12,x26
00b2edb8	ror x11,x11,#0x18
00b2edbc	add x17,x17,x16
00b2edc0	str x0,[sp, #0x128]
00b2edc4	add x15,x15,x6
00b2edc8	add x12,x12,x11
00b2edcc	eor x9,x9,x17
00b2edd0	eor x0,x5,x0
00b2edd4	eor x10,x15,x10
00b2edd8	eor x4,x12,x4
00b2eddc	ror x9,x9,#0x20
00b2ede0	ror x0,x0,#0x20
00b2ede4	str x18,[sp, #0x100]
00b2ede8	ror x10,x10,#0x20
00b2edec	ror x4,x4,#0x10
00b2edf0	str x14,[sp, #0x108]
00b2edf4	add x18,x9,x18
00b2edf8	add x14,x0,x14
00b2edfc	mov x27,x25
00b2ee00	add x8,x10,x8
00b2ee04	add x2,x4,x2
00b2ee08	stp x16,x13,[sp, #0xe0]
00b2ee0c	eor x16,x18,x16
00b2ee10	eor x13,x14,x13
00b2ee14	eor x6,x8,x6
00b2ee18	eor x11,x2,x11
00b2ee1c	add x17,x17,x27
00b2ee20	ror x16,x16,#0x18
00b2ee24	add x5,x5,x1
00b2ee28	ror x13,x13,#0x18
00b2ee2c	add x15,x15,x29
00b2ee30	ror x6,x6,#0x18
00b2ee34	ror x11,x11,#0x3f
00b2ee38	add x17,x17,x16
00b2ee3c	add x5,x5,x13
00b2ee40	mov x20,x1
00b2ee44	add x15,x15,x6
00b2ee48	add x28,x11,x3
00b2ee4c	mov x26,x1
00b2ee50	eor x9,x17,x9
00b2ee54	eor x0,x5,x0
00b2ee58	ldr x1,[sp, #0x38]
00b2ee5c	eor x10,x15,x10
00b2ee60	add x15,x28,x15
00b2ee64	ror x9,x9,#0x10
00b2ee68	ror x0,x0,#0x10
00b2ee6c	ror x10,x10,#0x10
00b2ee70	add x18,x9,x18
00b2ee74	add x14,x0,x14
00b2ee78	eor x0,x15,x0
00b2ee7c	add x8,x10,x8
00b2ee80	eor x13,x14,x13
00b2ee84	eor x16,x18,x16
00b2ee88	ror x0,x0,#0x20
00b2ee8c	add x17,x17,x7
00b2ee90	eor x6,x8,x6
00b2ee94	ror x13,x13,#0x3f
00b2ee98	add x12,x12,x1
00b2ee9c	ror x16,x16,#0x3f
00b2eea0	add x18,x0,x18
00b2eea4	ror x6,x6,#0x3f
00b2eea8	add x5,x5,x30
00b2eeac	add x17,x17,x13
00b2eeb0	add x12,x12,x16
00b2eeb4	eor x11,x18,x11
00b2eeb8	mov x25,x19
00b2eebc	mov x19,x27
00b2eec0	str x27,[sp, #0x30]
00b2eec4	stp x10,x4,[sp, #0x110]
00b2eec8	add x5,x5,x6
00b2eecc	eor x4,x17,x4
00b2eed0	ldp x27,x20,[sp, #0x80]
00b2eed4	eor x10,x10,x12
00b2eed8	add x15,x15,x22
00b2eedc	ror x11,x11,#0x18
00b2eee0	str x9,[sp, #0x120]
00b2eee4	eor x9,x5,x9
00b2eee8	ror x4,x4,#0x20
00b2eeec	ror x10,x10,#0x20
00b2eef0	add x15,x15,x11
00b2eef4	stp x8,x2,[sp, #0xf0]
00b2eef8	ror x9,x9,#0x20
00b2eefc	add x8,x4,x8
00b2ef00	add x14,x10,x14
00b2ef04	eor x0,x15,x0
00b2ef08	add x2,x9,x2
00b2ef0c	eor x13,x8,x13
00b2ef10	eor x16,x14,x16
00b2ef14	ror x0,x0,#0x10
00b2ef18	str x6,[sp, #0xd0]
00b2ef1c	eor x6,x2,x6
00b2ef20	add x17,x17,x20
00b2ef24	ror x13,x13,#0x18
00b2ef28	add x12,x12,x27
00b2ef2c	ror x16,x16,#0x18
00b2ef30	add x18,x0,x18
00b2ef34	add x5,x5,x23
00b2ef38	ror x6,x6,#0x18
00b2ef3c	add x17,x17,x13
00b2ef40	add x12,x12,x16
00b2ef44	eor x11,x18,x11
00b2ef48	add x5,x5,x6
00b2ef4c	eor x4,x17,x4
00b2ef50	eor x10,x12,x10
00b2ef54	add x12,x12,x22
00b2ef58	ror x11,x11,#0x3f
00b2ef5c	eor x9,x5,x9
00b2ef60	ror x4,x4,#0x10
00b2ef64	add x12,x12,x11
00b2ef68	add x8,x4,x8
00b2ef6c	ror x9,x9,#0x10
00b2ef70	eor x4,x12,x4
00b2ef74	add x2,x9,x2
00b2ef78	ror x4,x4,#0x20
00b2ef7c	eor x6,x2,x6
00b2ef80	add x2,x4,x2
00b2ef84	str x11,[sp, #0xd8]
00b2ef88	eor x11,x2,x11
00b2ef8c	eor x13,x8,x13
00b2ef90	add x12,x12,x25
00b2ef94	ror x11,x11,#0x18
00b2ef98	ror x13,x13,#0x3f
00b2ef9c	add x15,x15,x19
00b2efa0	ror x6,x6,#0x3f
00b2efa4	add x12,x12,x11
00b2efa8	add x28,x13,x27
00b2efac	ror x10,x10,#0x10
00b2efb0	add x15,x15,x6
00b2efb4	eor x4,x12,x4
00b2efb8	add x5,x28,x5
00b2efbc	add x14,x10,x14
00b2efc0	eor x10,x15,x10
00b2efc4	ror x4,x4,#0x10
00b2efc8	str x0,[sp, #0x128]
00b2efcc	ror x10,x10,#0x20
00b2efd0	add x2,x4,x2
00b2efd4	eor x16,x14,x16
00b2efd8	eor x0,x5,x0
00b2efdc	add x8,x10,x8
00b2efe0	eor x11,x2,x11
00b2efe4	ror x16,x16,#0x3f
00b2efe8	add x17,x17,x21
00b2efec	ror x0,x0,#0x20
00b2eff0	eor x6,x8,x6
00b2eff4	ror x11,x11,#0x3f
00b2eff8	str x14,[sp, #0x108]
00b2effc	add x17,x17,x16
00b2f000	add x14,x0,x14
00b2f004	mov x3,x7
00b2f008	mov x7,x22
00b2f00c	add x15,x15,x23
00b2f010	ror x6,x6,#0x18
00b2f014	mov x22,x29
00b2f018	add x28,x11,x29
00b2f01c	stp x16,x13,[sp, #0xe0]
00b2f020	eor x9,x9,x17
00b2f024	ldr x29,[sp, #0x98]
00b2f028	eor x13,x14,x13
00b2f02c	add x15,x15,x6
00b2f030	ror x9,x9,#0x20
00b2f034	add x5,x5,x3
00b2f038	ror x13,x13,#0x18
00b2f03c	str x18,[sp, #0x100]
00b2f040	eor x10,x15,x10
00b2f044	add x18,x9,x18
00b2f048	add x5,x5,x13
00b2f04c	eor x16,x18,x16
00b2f050	ror x10,x10,#0x10
00b2f054	eor x0,x5,x0
00b2f058	add x17,x17,x29
00b2f05c	ror x16,x16,#0x18
00b2f060	add x8,x10,x8
00b2f064	ror x0,x0,#0x10
00b2f068	add x17,x17,x16
00b2f06c	eor x6,x8,x6
00b2f070	add x14,x0,x14
00b2f074	eor x9,x17,x9
00b2f078	ror x6,x6,#0x3f
00b2f07c	add x5,x5,x20
00b2f080	eor x13,x14,x13
00b2f084	add x17,x17,x30
00b2f088	ror x9,x9,#0x10
00b2f08c	add x5,x5,x6
00b2f090	ror x13,x13,#0x3f
00b2f094	add x18,x9,x18
00b2f098	str x9,[sp, #0x120]
00b2f09c	eor x9,x5,x9
00b2f0a0	mov x7,x26
00b2f0a4	add x5,x5,x26
00b2f0a8	add x17,x17,x13
00b2f0ac	ldr x26,[sp, #0x90]
00b2f0b0	stp x10,x4,[sp, #0x110]
00b2f0b4	eor x4,x17,x4
00b2f0b8	ror x4,x4,#0x20
00b2f0bc	stp x8,x2,[sp, #0xf0]
00b2f0c0	add x8,x4,x8
00b2f0c4	eor x16,x18,x16
00b2f0c8	eor x13,x8,x13
00b2f0cc	add x12,x12,x26
00b2f0d0	ror x16,x16,#0x3f
00b2f0d4	add x15,x28,x15
00b2f0d8	add x17,x17,x1
00b2f0dc	ror x13,x13,#0x18
00b2f0e0	add x12,x12,x16
00b2f0e4	mov x19,x23
00b2f0e8	mov x24,x21
00b2f0ec	mov x21,x1
00b2f0f0	add x17,x17,x13
00b2f0f4	ldr x1,[sp, #0xa0]
00b2f0f8	eor x10,x10,x12
00b2f0fc	ldr x23,[sp, #0x40]
00b2f100	eor x0,x15,x0
00b2f104	ror x9,x9,#0x20
00b2f108	eor x4,x17,x4
00b2f10c	ror x10,x10,#0x20
00b2f110	ror x0,x0,#0x20
00b2f114	add x2,x9,x2
00b2f118	ror x4,x4,#0x10
00b2f11c	add x14,x10,x14
00b2f120	add x18,x0,x18
00b2f124	str x6,[sp, #0xd0]
00b2f128	eor x6,x2,x6
00b2f12c	add x8,x4,x8
00b2f130	eor x16,x14,x16
00b2f134	eor x11,x18,x11
00b2f138	ror x6,x6,#0x18
00b2f13c	eor x13,x8,x13
00b2f140	add x12,x12,x23
00b2f144	add x15,x15,x1
00b2f148	ror x16,x16,#0x18
00b2f14c	ror x11,x11,#0x18
00b2f150	add x5,x5,x6
00b2f154	ror x13,x13,#0x3f
00b2f158	add x12,x12,x16
00b2f15c	add x15,x15,x11
00b2f160	eor x9,x5,x9
00b2f164	add x28,x13,x1
00b2f168	eor x10,x12,x10
00b2f16c	eor x0,x15,x0
00b2f170	add x5,x28,x5
00b2f174	ror x10,x10,#0x10
00b2f178	ror x0,x0,#0x10
00b2f17c	ror x9,x9,#0x10
00b2f180	add x14,x10,x14
00b2f184	str x0,[sp, #0x128]
00b2f188	add x18,x0,x18
00b2f18c	add x2,x9,x2
00b2f190	eor x0,x5,x0
00b2f194	eor x11,x18,x11
00b2f198	eor x6,x2,x6
00b2f19c	eor x16,x14,x16
00b2f1a0	ror x0,x0,#0x20
00b2f1a4	add x12,x12,x25
00b2f1a8	add x15,x15,x21
00b2f1ac	ror x11,x11,#0x3f
00b2f1b0	ror x6,x6,#0x3f
00b2f1b4	ror x16,x16,#0x3f
00b2f1b8	add x17,x17,x19
00b2f1bc	str x14,[sp, #0x108]
00b2f1c0	add x14,x0,x14
00b2f1c4	add x15,x15,x6
00b2f1c8	add x12,x12,x11
00b2f1cc	stp x16,x13,[sp, #0xe0]
00b2f1d0	add x17,x17,x16
00b2f1d4	eor x13,x14,x13
00b2f1d8	eor x10,x15,x10
00b2f1dc	eor x4,x12,x4
00b2f1e0	eor x9,x9,x17
00b2f1e4	add x5,x5,x30
00b2f1e8	ror x13,x13,#0x18
00b2f1ec	ror x10,x10,#0x20
00b2f1f0	ror x4,x4,#0x20
00b2f1f4	ror x9,x9,#0x20
00b2f1f8	add x5,x5,x13
00b2f1fc	str x18,[sp, #0x100]
00b2f200	add x8,x10,x8
00b2f204	add x2,x4,x2
00b2f208	add x18,x9,x18
00b2f20c	eor x0,x5,x0
00b2f210	str x11,[sp, #0xd8]
00b2f214	eor x6,x8,x6
00b2f218	eor x11,x2,x11
00b2f21c	eor x16,x18,x16
00b2f220	ror x0,x0,#0x10
00b2f224	add x15,x15,x26
00b2f228	add x12,x12,x3
00b2f22c	ror x6,x6,#0x18
00b2f230	ror x11,x11,#0x18
00b2f234	add x17,x17,x27
00b2f238	ror x16,x16,#0x18
00b2f23c	add x14,x0,x14
00b2f240	add x15,x15,x6
00b2f244	add x12,x12,x11
00b2f248	add x17,x17,x16
00b2f24c	eor x13,x14,x13
00b2f250	eor x10,x15,x10
00b2f254	eor x4,x12,x4
00b2f258	eor x9,x17,x9
00b2f25c	add x17,x17,x29
00b2f260	ror x13,x13,#0x3f
00b2f264	ror x4,x4,#0x10
00b2f268	mov x1,x27
00b2f26c	ror x10,x10,#0x10
00b2f270	add x17,x17,x13
00b2f274	ldr x27,[sp, #0x30]
00b2f278	add x2,x4,x2
00b2f27c	ror x9,x9,#0x10
00b2f280	stp x10,x4,[sp, #0x110]
00b2f284	eor x4,x17,x4
00b2f288	eor x11,x2,x11
00b2f28c	add x8,x10,x8
00b2f290	add x18,x9,x18
00b2f294	ror x4,x4,#0x20
00b2f298	ror x11,x11,#0x3f
00b2f29c	stp x8,x2,[sp, #0xf0]
00b2f2a0	eor x6,x8,x6
00b2f2a4	add x8,x4,x8
00b2f2a8	eor x16,x18,x16
00b2f2ac	add x28,x11,x24
00b2f2b0	ror x6,x6,#0x3f
00b2f2b4	add x5,x5,x7
00b2f2b8	eor x13,x8,x13
00b2f2bc	add x12,x12,x27
00b2f2c0	ror x16,x16,#0x3f
00b2f2c4	add x15,x28,x15
00b2f2c8	add x5,x5,x6
00b2f2cc	add x17,x17,x23
00b2f2d0	ror x13,x13,#0x18
00b2f2d4	add x12,x12,x16
00b2f2d8	mov x25,x24
00b2f2dc	str x9,[sp, #0x120]
00b2f2e0	eor x9,x5,x9
00b2f2e4	mov x3,x22
00b2f2e8	add x5,x5,x22
00b2f2ec	add x17,x17,x13
00b2f2f0	eor x10,x10,x12
00b2f2f4	ldr x24,[sp, #0x60]
00b2f2f8	eor x0,x15,x0
00b2f2fc	ldr x22,[sp, #0x88]
00b2f300	ror x9,x9,#0x20
00b2f304	eor x4,x17,x4
00b2f308	ror x10,x10,#0x20
00b2f30c	ror x0,x0,#0x20
00b2f310	add x2,x9,x2
00b2f314	ror x4,x4,#0x10
00b2f318	add x14,x10,x14
00b2f31c	add x18,x0,x18
00b2f320	str x6,[sp, #0xd0]
00b2f324	eor x6,x2,x6
00b2f328	add x8,x4,x8
00b2f32c	eor x16,x14,x16
00b2f330	eor x11,x18,x11
00b2f334	ror x6,x6,#0x18
00b2f338	eor x13,x8,x13
00b2f33c	add x12,x12,x24
00b2f340	add x15,x15,x22
00b2f344	ror x16,x16,#0x18
00b2f348	ror x11,x11,#0x18
00b2f34c	add x5,x5,x6
00b2f350	ror x13,x13,#0x3f
00b2f354	add x12,x12,x16
00b2f358	add x15,x15,x11
00b2f35c	eor x9,x5,x9
00b2f360	add x28,x13,x29
00b2f364	eor x10,x12,x10
00b2f368	eor x0,x15,x0
00b2f36c	add x5,x28,x5
00b2f370	ror x10,x10,#0x10
00b2f374	ror x0,x0,#0x10
00b2f378	ror x9,x9,#0x10
00b2f37c	add x14,x10,x14
00b2f380	str x0,[sp, #0x128]
00b2f384	add x18,x0,x18
00b2f388	add x2,x9,x2
00b2f38c	eor x0,x5,x0
00b2f390	eor x11,x18,x11
00b2f394	eor x6,x2,x6
00b2f398	eor x16,x14,x16
00b2f39c	ror x0,x0,#0x20
00b2f3a0	add x12,x12,x30
00b2f3a4	add x15,x15,x7
00b2f3a8	ror x11,x11,#0x3f
00b2f3ac	ror x6,x6,#0x3f
00b2f3b0	ror x16,x16,#0x3f
00b2f3b4	add x17,x17,x24
00b2f3b8	str x14,[sp, #0x108]
00b2f3bc	add x14,x0,x14
00b2f3c0	add x15,x15,x6
00b2f3c4	add x12,x12,x11
00b2f3c8	stp x16,x13,[sp, #0xe0]
00b2f3cc	add x17,x17,x16
00b2f3d0	eor x13,x14,x13
00b2f3d4	eor x10,x15,x10
00b2f3d8	eor x4,x12,x4
00b2f3dc	eor x9,x9,x17
00b2f3e0	add x5,x5,x3
00b2f3e4	ror x13,x13,#0x18
00b2f3e8	ror x10,x10,#0x20
00b2f3ec	ror x4,x4,#0x20
00b2f3f0	ror x9,x9,#0x20
00b2f3f4	add x5,x5,x13
00b2f3f8	str x18,[sp, #0x100]
00b2f3fc	add x8,x10,x8
00b2f400	add x2,x4,x2
00b2f404	add x18,x9,x18
00b2f408	eor x0,x5,x0
00b2f40c	str x11,[sp, #0xd8]
00b2f410	eor x6,x8,x6
00b2f414	eor x11,x2,x11
00b2f418	eor x16,x18,x16
00b2f41c	ror x0,x0,#0x10
00b2f420	add x15,x15,x22
00b2f424	add x12,x12,x23
00b2f428	ror x6,x6,#0x18
00b2f42c	ror x11,x11,#0x18
00b2f430	add x17,x17,x21
00b2f434	ror x16,x16,#0x18
00b2f438	add x14,x0,x14
00b2f43c	add x15,x15,x6
00b2f440	add x12,x12,x11
00b2f444	add x17,x17,x16
00b2f448	eor x13,x14,x13
00b2f44c	eor x10,x15,x10
00b2f450	eor x4,x12,x4
00b2f454	eor x9,x17,x9
00b2f458	add x17,x17,x1
00b2f45c	ror x13,x13,#0x3f
00b2f460	ror x4,x4,#0x10
00b2f464	ror x10,x10,#0x10
00b2f468	add x17,x17,x13
00b2f46c	add x2,x4,x2
00b2f470	stp x10,x4,[sp, #0x110]
00b2f474	eor x4,x17,x4
00b2f478	add x8,x10,x8
00b2f47c	ror x4,x4,#0x20
00b2f480	eor x11,x2,x11
00b2f484	stp x8,x2,[sp, #0xf0]
00b2f488	eor x6,x8,x6
00b2f48c	add x8,x4,x8
00b2f490	ldr x19,[sp, #0x58]
00b2f494	ror x11,x11,#0x3f
00b2f498	ror x9,x9,#0x10
00b2f49c	eor x13,x8,x13
00b2f4a0	add x28,x11,x26
00b2f4a4	add x18,x9,x18
00b2f4a8	ror x6,x6,#0x3f
00b2f4ac	add x5,x5,x27
00b2f4b0	add x17,x17,x25
00b2f4b4	ror x13,x13,#0x18
00b2f4b8	add x15,x28,x15
00b2f4bc	add x5,x5,x6
00b2f4c0	add x17,x17,x13
00b2f4c4	eor x16,x18,x16
00b2f4c8	str x30,[sp, #0x18]
00b2f4cc	str x7,[sp, #0x20]
00b2f4d0	mov x30,x24
00b2f4d4	mov x24,x3
00b2f4d8	str x9,[sp, #0x120]
00b2f4dc	eor x9,x5,x9
00b2f4e0	ldr x20,[sp, #0xa0]
00b2f4e4	eor x4,x17,x4
00b2f4e8	add x12,x12,x19
00b2f4ec	ror x16,x16,#0x3f
00b2f4f0	ldp x7,x3,[sp, #0x70]
00b2f4f4	eor x0,x15,x0
00b2f4f8	ror x9,x9,#0x20
00b2f4fc	ror x4,x4,#0x10
00b2f500	add x12,x12,x16
00b2f504	ror x0,x0,#0x20
00b2f508	add x2,x9,x2
00b2f50c	add x8,x4,x8
00b2f510	eor x10,x10,x12
00b2f514	add x18,x0,x18
00b2f518	str x6,[sp, #0xd0]
00b2f51c	eor x6,x2,x6
00b2f520	eor x13,x8,x13
00b2f524	ror x10,x10,#0x20
00b2f528	eor x11,x18,x11
00b2f52c	add x5,x5,x20
00b2f530	ror x6,x6,#0x18
00b2f534	ror x13,x13,#0x3f
00b2f538	add x15,x15,x3
00b2f53c	add x14,x10,x14
00b2f540	ror x11,x11,#0x18
00b2f544	add x5,x5,x6
00b2f548	add x28,x13,x21
00b2f54c	eor x16,x14,x16
00b2f550	add x15,x15,x11
00b2f554	eor x9,x5,x9
00b2f558	add x5,x28,x5
00b2f55c	ror x28,x16,#0x18
00b2f560	eor x16,x15,x0
00b2f564	ror x0,x16,#0x10
00b2f568	add x12,x12,x7
00b2f56c	ror x9,x9,#0x10
00b2f570	add x18,x0,x18
00b2f574	add x12,x12,x28
00b2f578	add x16,x9,x2
00b2f57c	eor x11,x18,x11
00b2f580	eor x10,x12,x10
00b2f584	add x12,x12,x22
00b2f588	eor x2,x16,x6
00b2f58c	ror x11,x11,#0x3f
00b2f590	add x15,x15,x20
00b2f594	ror x2,x2,#0x3f
00b2f598	add x12,x12,x11
00b2f59c	ror x10,x10,#0x10
00b2f5a0	add x15,x15,x2
00b2f5a4	eor x4,x12,x4
00b2f5a8	add x14,x10,x14
00b2f5ac	eor x10,x15,x10
00b2f5b0	ror x4,x4,#0x20
00b2f5b4	ror x10,x10,#0x20
00b2f5b8	add x16,x4,x16
00b2f5bc	str x11,[sp, #0xd8]
00b2f5c0	add x8,x10,x8
00b2f5c4	eor x11,x16,x11
00b2f5c8	add x6,x12,x1
00b2f5cc	eor x12,x8,x2
00b2f5d0	ror x2,x11,#0x18
00b2f5d4	add x6,x6,x2
00b2f5d8	eor x11,x6,x4
00b2f5dc	eor x4,x14,x28
00b2f5e0	ror x4,x4,#0x3f
00b2f5e4	add x17,x17,x23
00b2f5e8	add x17,x17,x4
00b2f5ec	str x0,[sp, #0x128]
00b2f5f0	add x15,x15,x29
00b2f5f4	ror x12,x12,#0x18
00b2f5f8	eor x9,x9,x17
00b2f5fc	eor x0,x5,x0
00b2f600	add x29,x15,x12
00b2f604	ror x15,x11,#0x10
00b2f608	ldr x26,[sp, #0x18]
00b2f60c	ror x9,x9,#0x20
00b2f610	ror x0,x0,#0x20
00b2f614	str x18,[sp, #0x100]
00b2f618	add x11,x15,x16
00b2f61c	str x14,[sp, #0x108]
00b2f620	add x18,x9,x18
00b2f624	add x14,x0,x14
00b2f628	eor x16,x11,x2
00b2f62c	stp x4,x13,[sp, #0xe0]
00b2f630	eor x4,x18,x4
00b2f634	eor x13,x14,x13
00b2f638	ror x16,x16,#0x3f
00b2f63c	add x17,x17,x24
00b2f640	ror x4,x4,#0x18
00b2f644	add x5,x5,x30
00b2f648	ror x13,x13,#0x18
00b2f64c	add x2,x16,x26
00b2f650	add x17,x17,x4
00b2f654	add x5,x5,x13
00b2f658	eor x10,x29,x10
00b2f65c	add x2,x2,x29
00b2f660	mov x29,x24
00b2f664	mov x24,x30
00b2f668	eor x9,x17,x9
00b2f66c	ldr x30,[sp, #0x20]
00b2f670	eor x0,x5,x0
00b2f674	ror x9,x9,#0x10
00b2f678	ror x0,x0,#0x10
00b2f67c	add x18,x9,x18
00b2f680	add x14,x0,x14
00b2f684	eor x0,x2,x0
00b2f688	ror x10,x10,#0x10
00b2f68c	eor x4,x18,x4
00b2f690	ror x0,x0,#0x20
00b2f694	add x6,x6,x30
00b2f698	add x8,x10,x8
00b2f69c	ror x4,x4,#0x3f
00b2f6a0	add x18,x0,x18
00b2f6a4	add x6,x6,x4
00b2f6a8	eor x16,x18,x16
00b2f6ac	eor x12,x8,x12
00b2f6b0	str x10,[sp, #0x110]
00b2f6b4	eor x10,x10,x6
00b2f6b8	add x6,x6,x3
00b2f6bc	mov x28,x3
00b2f6c0	add x5,x5,x7
00b2f6c4	mov x3,x19
00b2f6c8	add x2,x2,x19
00b2f6cc	ror x16,x16,#0x18
00b2f6d0	ror x12,x12,#0x3f
00b2f6d4	add x2,x2,x16
00b2f6d8	add x3,x5,x12
00b2f6dc	eor x0,x2,x0
00b2f6e0	add x2,x2,x7
00b2f6e4	stp x15,x9,[sp, #0x118]
00b2f6e8	eor x9,x3,x9
00b2f6ec	ldr x7,[sp, #0x90]
00b2f6f0	ror x9,x9,#0x20
00b2f6f4	stp x8,x11,[sp, #0xf0]
00b2f6f8	add x11,x9,x11
00b2f6fc	str x12,[sp, #0xd0]
00b2f700	eor x12,x11,x12
00b2f704	eor x13,x14,x13
00b2f708	add x3,x3,x7
00b2f70c	ror x12,x12,#0x18
00b2f710	ror x10,x10,#0x20
00b2f714	add x17,x17,x25
00b2f718	ror x13,x13,#0x3f
00b2f71c	add x3,x3,x12
00b2f720	add x14,x10,x14
00b2f724	add x17,x17,x13
00b2f728	eor x9,x3,x9
00b2f72c	eor x4,x14,x4
00b2f730	eor x15,x17,x15
00b2f734	ror x9,x9,#0x10
00b2f738	ror x4,x4,#0x18
00b2f73c	ror x15,x15,#0x20
00b2f740	add x5,x9,x11
00b2f744	add x6,x6,x4
00b2f748	add x8,x15,x8
00b2f74c	eor x11,x5,x12
00b2f750	eor x10,x6,x10
00b2f754	eor x13,x8,x13
00b2f758	ror x11,x11,#0x3f
00b2f75c	add x17,x17,x27
00b2f760	ror x13,x13,#0x18
00b2f764	ror x10,x10,#0x10
00b2f768	add x12,x2,x11
00b2f76c	add x17,x17,x13
00b2f770	add x14,x10,x14
00b2f774	eor x2,x12,x10
00b2f778	add x10,x12,x30
00b2f77c	ror x12,x0,#0x10
00b2f780	eor x15,x17,x15
00b2f784	add x18,x12,x18
00b2f788	eor x16,x18,x16
00b2f78c	ror x15,x15,#0x10
00b2f790	add x6,x6,x23
00b2f794	ror x16,x16,#0x3f
00b2f798	add x8,x15,x8
00b2f79c	add x0,x6,x16
00b2f7a0	eor x13,x8,x13
00b2f7a4	mov x1,x27
00b2f7a8	eor x15,x0,x15
00b2f7ac	ror x13,x13,#0x3f
00b2f7b0	eor x4,x14,x4
00b2f7b4	add x1,x13,x27
00b2f7b8	ror x15,x15,#0x20
00b2f7bc	ror x4,x4,#0x3f
00b2f7c0	add x1,x1,x3
00b2f7c4	add x3,x15,x5
00b2f7c8	stp x16,x4,[sp, #0xd8]
00b2f7cc	eor x16,x3,x16
00b2f7d0	add x17,x17,x19
00b2f7d4	add x0,x0,x26
00b2f7d8	ror x16,x16,#0x18
00b2f7dc	add x17,x17,x4
00b2f7e0	str x12,[sp, #0x128]
00b2f7e4	eor x12,x1,x12
00b2f7e8	add x0,x0,x16
00b2f7ec	eor x9,x9,x17
00b2f7f0	eor x15,x0,x15
00b2f7f4	ror x12,x12,#0x20
00b2f7f8	stp x18,x14,[sp, #0x100]
00b2f7fc	ror x9,x9,#0x20
00b2f800	add x14,x12,x14
00b2f804	ror x2,x2,#0x20
00b2f808	ror x15,x15,#0x10
00b2f80c	ldr x5,[sp, #0x98]
00b2f810	add x18,x9,x18
00b2f814	str x13,[sp, #0xe8]
00b2f818	eor x13,x14,x13
00b2f81c	add x8,x2,x8
00b2f820	add x3,x15,x3
00b2f824	add x1,x1,x21
00b2f828	eor x4,x18,x4
00b2f82c	ror x13,x13,#0x18
00b2f830	eor x11,x8,x11
00b2f834	eor x16,x3,x16
00b2f838	add x17,x17,x7
00b2f83c	ror x4,x4,#0x18
00b2f840	add x1,x1,x13
00b2f844	ror x11,x11,#0x18
00b2f848	ror x16,x16,#0x3f
00b2f84c	add x17,x17,x4
00b2f850	eor x12,x1,x12
00b2f854	add x10,x10,x11
00b2f858	add x5,x16,x5
00b2f85c	eor x9,x17,x9
00b2f860	eor x2,x10,x2
00b2f864	add x10,x5,x10
00b2f868	ror x12,x12,#0x10
00b2f86c	ror x9,x9,#0x10
00b2f870	add x14,x12,x14
00b2f874	eor x12,x10,x12
00b2f878	add x18,x9,x18
00b2f87c	ror x12,x12,#0x20
00b2f880	eor x4,x18,x4
00b2f884	add x18,x12,x18
00b2f888	eor x16,x18,x16
00b2f88c	add x10,x10,x25
00b2f890	ror x16,x16,#0x18
00b2f894	add x10,x10,x16
00b2f898	eor x12,x10,x12
00b2f89c	ror x2,x2,#0x10
00b2f8a0	ror x12,x12,#0x10
00b2f8a4	add x0,x0,x20
00b2f8a8	add x8,x2,x8
00b2f8ac	ror x4,x4,#0x3f
00b2f8b0	str x12,[sp, #0x128]
00b2f8b4	add x12,x12,x18
00b2f8b8	add x0,x0,x4
00b2f8bc	eor x11,x8,x11
00b2f8c0	str x12,[sp, #0x100]
00b2f8c4	eor x12,x12,x16
00b2f8c8	add x1,x1,x29
00b2f8cc	stp x2,x15,[sp, #0x110]
00b2f8d0	eor x2,x2,x0
00b2f8d4	ror x11,x11,#0x3f
00b2f8d8	ror x12,x12,#0x3f
00b2f8dc	add x1,x1,x11
00b2f8e0	str x12,[sp, #0xd8]
00b2f8e4	ror x12,x2,#0x20
00b2f8e8	str x9,[sp, #0x120]
00b2f8ec	eor x9,x1,x9
00b2f8f0	ldr x5,[sp, #0x80]
00b2f8f4	eor x13,x14,x13
00b2f8f8	add x14,x12,x14
00b2f8fc	add x17,x17,x28
00b2f900	ror x13,x13,#0x3f
00b2f904	ror x9,x9,#0x20
00b2f908	eor x16,x14,x4
00b2f90c	add x0,x0,x22
00b2f910	add x17,x17,x13
00b2f914	add x18,x9,x3
00b2f918	ror x16,x16,#0x18
00b2f91c	str x11,[sp, #0xd0]
00b2f920	eor x15,x17,x15
00b2f924	eor x11,x18,x11
00b2f928	add x0,x0,x16
00b2f92c	add x1,x1,x5
00b2f930	ror x2,x11,#0x18
00b2f934	eor x11,x0,x12
00b2f938	ror x12,x15,#0x20
00b2f93c	stp x8,x3,[sp, #0xf0]
00b2f940	add x15,x1,x2
00b2f944	ror x1,x11,#0x10
00b2f948	add x8,x12,x8
00b2f94c	add x14,x1,x14
00b2f950	eor x11,x8,x13
00b2f954	add x17,x17,x24
00b2f958	eor x13,x14,x16
00b2f95c	ror x16,x11,#0x18
00b2f960	ror x11,x13,#0x3f
00b2f964	add x13,x17,x16
00b2f968	eor x9,x15,x9
00b2f96c	eor x12,x13,x12
00b2f970	ldr x3,[sp, #0x48]
00b2f974	ror x9,x9,#0x10
00b2f978	ror x12,x12,#0x10
00b2f97c	add x18,x9,x18
00b2f980	add x8,x12,x8
00b2f984	str x10,[sp, #0xb0]
00b2f988	stp x14,x1,[sp, #0x108]
00b2f98c	str x11,[sp, #0xe0]
00b2f990	stp x12,x9,[sp, #0x118]
00b2f994	stp x8,x18,[sp, #0xf0]
00b2f998	ldr x11,[x3]
00b2f99c	eor x11,x11,x8
00b2f9a0	eor x11,x11,x10
00b2f9a4	ldr x10,[x3, #0x8]
00b2f9a8	str x11,[x3]
00b2f9ac	eor x8,x8,x16
00b2f9b0	eor x10,x10,x18
00b2f9b4	eor x10,x10,x0
00b2f9b8	stp x11,x10,[sp, #0xb0]
00b2f9bc	str x10,[x3, #0x8]
00b2f9c0	ldr x10,[sp, #0x100]
00b2f9c4	ldr x17,[x3, #0x10]
00b2f9c8	eor x10,x17,x10
00b2f9cc	eor x10,x10,x13
00b2f9d0	str x10,[sp, #0xc0]
00b2f9d4	ldr x13,[x3, #0x18]
00b2f9d8	str x10,[x3, #0x10]
00b2f9dc	eor x10,x13,x14
00b2f9e0	eor x10,x10,x15
00b2f9e4	str x10,[sp, #0xc8]
00b2f9e8	ldr x13,[x3, #0x20]
00b2f9ec	eor x14,x18,x2
00b2f9f0	str x10,[x3, #0x18]
00b2f9f4	eor x10,x13,x1
00b2f9f8	eor x20,x10,x14, ROR #0x3f
00b2f9fc	str x20,[x3, #0x20]
00b2fa00	ldr x10,[x3, #0x28]
00b2fa04	ldr x13,[sp, #0xd8]
00b2fa08	eor x10,x10,x12
00b2fa0c	eor x10,x10,x13
00b2fa10	stp x20,x10,[sp, #0xd0]
00b2fa14	str x10,[x3, #0x28]
00b2fa18	ldr x10,[x3, #0x30]
00b2fa1c	ldr x12,[sp, #0xe0]
00b2fa20	eor x9,x10,x9
00b2fa24	eor x9,x9,x12
00b2fa28	str x9,[sp, #0xe0]
00b2fa2c	str x9,[x3, #0x30]
00b2fa30	ldr x9,[sp, #0x128]
00b2fa34	ldr x10,[x3, #0x38]
00b2fa38	eor x9,x10,x9
00b2fa3c	eor x8,x9,x8, ROR #0x3f
00b2fa40	ldr x9,[sp, #0xa8]
00b2fa44	ldr x10,[sp, #0x50]
00b2fa48	str x8,[sp, #0xe8]
00b2fa4c	str x8,[x3, #0x38]
00b2fa50	add x9,x9,x10
00b2fa54	str x9,[sp, #0xa8]
00b2fa58	ldr x9,[sp, #0x10]
00b2fa5c	ldr x10,[sp, #0xa8]
00b2fa60	cmp x9,x10
00b2fa64	ldr x9,[sp, #0xa8]
00b2fa68	b.ne 0x00b2e04c
00b2fa6c	add sp,sp,#0x1b0
00b2fa70	ldp x29,x30,[sp, #0x50]
00b2fa74	ldp x20,x19,[sp, #0x40]
00b2fa78	ldp x22,x21,[sp, #0x30]
00b2fa7c	ldp x24,x23,[sp, #0x20]
00b2fa80	ldp x26,x25,[sp, #0x10]
00b2fa84	ldp x28,x27,[sp], #0x60
00b2fa88	ret
