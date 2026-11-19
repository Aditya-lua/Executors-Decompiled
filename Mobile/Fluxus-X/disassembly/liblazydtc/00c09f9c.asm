; std::__ndk1::moneypunct_byname<wchar_t,true>::init @ 00c09f9c
00c09f9c	paciasp
00c09fa0	stp x29,x30,[sp, #-0x50]!
00c09fa4	str x28,[sp, #0x10]
00c09fa8	stp x24,x23,[sp, #0x20]
00c09fac	stp x22,x21,[sp, #0x30]
00c09fb0	stp x20,x19,[sp, #0x40]
00c09fb4	mov x29,sp
00c09fb8	sub sp,sp,#0x1c0
00c09fbc	mov x20,x0
00c09fc0	mov w0,#0x1fbf
00c09fc4	mov x2,xzr
00c09fc8	mov x21,x1
00c09fcc	bl 0x00c43890
00c09fd0	str x0,[x29, #0x18]
00c09fd4	cbz x0,0x00c0a668
00c09fd8	mov x19,x0
00c09fdc	bl 0x00c43880
00c09fe0	mov x22,x0
00c09fe4	str x0,[sp, #0x10]
00c09fe8	bl 0x00c43bb0
00c09fec	mov x21,x0
00c09ff0	cbz x22,0x00c09ffc
00c09ff4	mov x0,x22
00c09ff8	bl 0x00c43880
00c09ffc	ldr x22,[x21, #0x28]
00c0a000	ldrb w8,[x22]
00c0a004	cbz w8,0x00c0a05c
00c0a008	mov x0,x22
00c0a00c	stur xzr,[x29, #-0x20]
00c0a010	bl 0x00c2ff50
00c0a014	mov x24,x0
00c0a018	mov x0,x19
00c0a01c	bl 0x00c43880
00c0a020	mov x23,x0
00c0a024	str x0,[sp, #0x10]
00c0a028	add x0,sp,#0x8
00c0a02c	sub x3,x29,#0x20
00c0a030	mov x1,x22
00c0a034	mov x2,x24
00c0a038	bl 0x00c43b00
00c0a03c	mov x22,x0
00c0a040	cbz x23,0x00c0a04c
00c0a044	mov x0,x23
00c0a048	bl 0x00c43880
00c0a04c	cmn x22,#0x3
00c0a050	b.hi 0x00c0a05c
00c0a054	ldr w8,[sp, #0x8]
00c0a058	b 0x00c0a060
00c0a05c	mov w8,#0xffffffff
00c0a060	str w8,[x20, #0x10]
00c0a064	ldr x22,[x21, #0x30]
00c0a068	ldrb w8,[x22]
00c0a06c	cbz w8,0x00c0a0c4
00c0a070	mov x0,x22
00c0a074	stur xzr,[x29, #-0x20]
00c0a078	bl 0x00c2ff50
00c0a07c	mov x24,x0
00c0a080	mov x0,x19
00c0a084	bl 0x00c43880
00c0a088	mov x23,x0
00c0a08c	str x0,[sp, #0x10]
00c0a090	add x0,sp,#0x8
00c0a094	sub x3,x29,#0x20
00c0a098	mov x1,x22
00c0a09c	mov x2,x24
00c0a0a0	bl 0x00c43b00
00c0a0a4	mov x22,x0
00c0a0a8	cbz x23,0x00c0a0b4
00c0a0ac	mov x0,x23
00c0a0b0	bl 0x00c43880
00c0a0b4	cmn x22,#0x3
00c0a0b8	b.hi 0x00c0a0c4
00c0a0bc	ldr w8,[sp, #0x8]
00c0a0c0	b 0x00c0a0c8
00c0a0c4	mov w8,#0xffffffff
00c0a0c8	str w8,[x20, #0x14]
00c0a0cc	ldr x1,[x21, #0x38]
00c0a0d0	add x0,x20,#0x18
00c0a0d4	bl 0x0080269c
00c0a0d8	ldr x8,[x21, #0x18]
00c0a0dc	stp x8,xzr,[sp]
00c0a0e0	mov x0,x19
00c0a0e4	bl 0x00c43880
00c0a0e8	mov x22,x0
00c0a0ec	stur x0,[x29, #-0x20]
00c0a0f0	add x0,sp,#0x10
00c0a0f4	mov x1,sp
00c0a0f8	add x3,sp,#0x8
00c0a0fc	mov w2,#0x64
00c0a100	bl 0x00c43af0
00c0a104	mov x23,x0
00c0a108	cbz x22,0x00c0a114
00c0a10c	mov x0,x22
00c0a110	bl 0x00c43880
00c0a114	cmn x23,#0x1
00c0a118	b.eq 0x00c0a6a0
00c0a11c	mov x22,x20
00c0a120	ldr x8,[x22, #0x30]!
00c0a124	ldrb w9,[x22]
00c0a128	and x10,x8,#-0x2
00c0a12c	tst w9,#0x1
00c0a130	mov w9,#0x4
00c0a134	sub x10,x10,#0x1
00c0a138	csel x1,x9,x10,eq
00c0a13c	and w9,w8,#0xff
00c0a140	subs x2,x23,x1
00c0a144	b.ls 0x00c0a188
00c0a148	ldr x10,[x20, #0x38]
00c0a14c	ubfx x8,x8,#0x1,#0x7
00c0a150	tst w9,#0x1
00c0a154	csel x3,x8,x10,eq
00c0a158	mov x0,x22
00c0a15c	mov x4,xzr
00c0a160	mov x5,x3
00c0a164	mov x6,xzr
00c0a168	bl 0x00c43d70
00c0a16c	ldrb w8,[x20, #0x30]
00c0a170	ldr x9,[x20, #0x40]
00c0a174	add x10,x20,#0x34
00c0a178	str xzr,[x20, #0x38]
00c0a17c	tst w8,#0x1
00c0a180	csel x12,x10,x9,eq
00c0a184	b 0x00c0a1a0
00c0a188	ldr x8,[x20, #0x40]
00c0a18c	add x10,x20,#0x34
00c0a190	tst w9,#0x1
00c0a194	csel x12,x10,x8,eq
00c0a198	mov x9,x12
00c0a19c	cbz x23,0x00c0a224
00c0a1a0	sub x8,x23,#0x1
00c0a1a4	and x9,x8,#0x3fffffffffffffff
00c0a1a8	add x8,sp,#0x10
00c0a1ac	cmp x9,#0x7
00c0a1b0	b.cc 0x00c0a208
00c0a1b4	sub x10,x12,x8
00c0a1b8	cmp x10,#0x20
00c0a1bc	b.cc 0x00c0a208
00c0a1c0	add x10,x9,#0x1
00c0a1c4	add x13,sp,#0x10
00c0a1c8	and x11,x10,#0x7ffffffffffffff8
00c0a1cc	lsl x8,x11,#0x2
00c0a1d0	mov x14,x11
00c0a1d4	add x9,x12,x8
00c0a1d8	add x8,x13,x8
00c0a1dc	add x13,x13,#0x10
00c0a1e0	add x12,x12,#0x10
00c0a1e4	ldp q0,q1,[x13, #-0x10]
00c0a1e8	subs x14,x14,#0x8
00c0a1ec	add x13,x13,#0x20
00c0a1f0	stp q0,q1,[x12, #-0x10]
00c0a1f4	add x12,x12,#0x20
00c0a1f8	b.ne 0x00c0a1e4
00c0a1fc	cmp x10,x11
00c0a200	b.ne 0x00c0a20c
00c0a204	b 0x00c0a224
00c0a208	mov x9,x12
00c0a20c	add x10,sp,#0x10
00c0a210	add x10,x10,x23, LSL #0x2
00c0a214	ldr w11,[x8], #0x4
00c0a218	cmp x8,x10
00c0a21c	str w11,[x9], #0x4
00c0a220	b.ne 0x00c0a214
00c0a224	str wzr,[x9]
00c0a228	ldrb w8,[x22]
00c0a22c	tbnz w8,#0x0,0x00c0a23c
00c0a230	lsl w8,w23,#0x1
00c0a234	strb w8,[x22]
00c0a238	b 0x00c0a240
00c0a23c	str x23,[x20, #0x38]
00c0a240	ldrb w8,[x21, #0x50]
00c0a244	cmp w8,#0xff
00c0a248	csel w8,wzr,w8,eq
00c0a24c	str w8,[x20, #0x78]
00c0a250	ldrb w8,[x21, #0x5c]
00c0a254	cbz w8,0x00c0a308
00c0a258	ldr x8,[x21, #0x40]
00c0a25c	stp x8,xzr,[sp]
00c0a260	mov x0,x19
00c0a264	bl 0x00c43880
00c0a268	mov x24,x0
00c0a26c	stur x0,[x29, #-0x20]
00c0a270	add x0,sp,#0x10
00c0a274	mov x1,sp
00c0a278	add x3,sp,#0x8
00c0a27c	mov w2,#0x64
00c0a280	bl 0x00c43af0
00c0a284	mov x23,x0
00c0a288	cbz x24,0x00c0a294
00c0a28c	mov x0,x24
00c0a290	bl 0x00c43880
00c0a294	cmn x23,#0x1
00c0a298	b.eq 0x00c0a65c
00c0a29c	mov x24,x20
00c0a2a0	ldr x8,[x24, #0x48]!
00c0a2a4	ldrb w9,[x24]
00c0a2a8	and x10,x8,#-0x2
00c0a2ac	tst w9,#0x1
00c0a2b0	mov w9,#0x4
00c0a2b4	sub x10,x10,#0x1
00c0a2b8	csel x1,x9,x10,eq
00c0a2bc	and w9,w8,#0xff
00c0a2c0	subs x2,x23,x1
00c0a2c4	b.ls 0x00c0a320
00c0a2c8	ldr x10,[x20, #0x50]
00c0a2cc	ubfx x8,x8,#0x1,#0x7
00c0a2d0	tst w9,#0x1
00c0a2d4	csel x3,x8,x10,eq
00c0a2d8	mov x0,x24
00c0a2dc	mov x4,xzr
00c0a2e0	mov x5,x3
00c0a2e4	mov x6,xzr
00c0a2e8	bl 0x00c43d70
00c0a2ec	ldrb w8,[x20, #0x48]
00c0a2f0	ldr x9,[x20, #0x58]
00c0a2f4	add x10,x20,#0x4c
00c0a2f8	str xzr,[x20, #0x50]
00c0a2fc	tst w8,#0x1
00c0a300	csel x12,x10,x9,eq
00c0a304	b 0x00c0a338
00c0a308	ldrb w8,[x20, #0x48]
00c0a30c	tbnz w8,#0x0,0x00c0a400
00c0a310	mov w8,#0x4
00c0a314	strb w8,[x20, #0x48]
00c0a318	add x8,x20,#0x4c
00c0a31c	b 0x00c0a40c
00c0a320	ldr x8,[x20, #0x58]
00c0a324	add x10,x20,#0x4c
00c0a328	tst w9,#0x1
00c0a32c	csel x12,x10,x8,eq
00c0a330	mov x9,x12
00c0a334	cbz x23,0x00c0a3bc
00c0a338	sub x8,x23,#0x1
00c0a33c	and x9,x8,#0x3fffffffffffffff
00c0a340	add x8,sp,#0x10
00c0a344	cmp x9,#0x7
00c0a348	b.cc 0x00c0a3a0
00c0a34c	sub x10,x12,x8
00c0a350	cmp x10,#0x20
00c0a354	b.cc 0x00c0a3a0
00c0a358	add x10,x9,#0x1
00c0a35c	add x13,sp,#0x10
00c0a360	and x11,x10,#0x7ffffffffffffff8
00c0a364	lsl x8,x11,#0x2
00c0a368	mov x14,x11
00c0a36c	add x9,x12,x8
00c0a370	add x8,x13,x8
00c0a374	add x13,x13,#0x10
00c0a378	add x12,x12,#0x10
00c0a37c	ldp q0,q1,[x13, #-0x10]
00c0a380	subs x14,x14,#0x8
00c0a384	add x13,x13,#0x20
00c0a388	stp q0,q1,[x12, #-0x10]
00c0a38c	add x12,x12,#0x20
00c0a390	b.ne 0x00c0a37c
00c0a394	cmp x10,x11
00c0a398	b.ne 0x00c0a3a4
00c0a39c	b 0x00c0a3bc
00c0a3a0	mov x9,x12
00c0a3a4	add x10,sp,#0x10
00c0a3a8	add x10,x10,x23, LSL #0x2
00c0a3ac	ldr w11,[x8], #0x4
00c0a3b0	cmp x8,x10
00c0a3b4	str w11,[x9], #0x4
00c0a3b8	b.ne 0x00c0a3ac
00c0a3bc	str wzr,[x9]
00c0a3c0	ldrb w8,[x24]
00c0a3c4	tbnz w8,#0x0,0x00c0a3dc
00c0a3c8	lsl w8,w23,#0x1
00c0a3cc	strb w8,[x24]
00c0a3d0	ldrb w8,[x21, #0x5d]
00c0a3d4	cbnz w8,0x00c0a424
00c0a3d8	b 0x00c0a3e8
00c0a3dc	str x23,[x20, #0x50]
00c0a3e0	ldrb w8,[x21, #0x5d]
00c0a3e4	cbnz w8,0x00c0a424
00c0a3e8	ldrb w8,[x20, #0x60]
00c0a3ec	tbnz w8,#0x0,0x00c0a5ac
00c0a3f0	mov w8,#0x4
00c0a3f4	strb w8,[x20, #0x60]
00c0a3f8	add x8,x20,#0x64
00c0a3fc	b 0x00c0a5b8
00c0a400	mov w9,#0x2
00c0a404	ldr x8,[x20, #0x58]
00c0a408	str x9,[x20, #0x50]
00c0a40c	mov x9,#0x28
00c0a410	str wzr,[x8, #0x8]
00c0a414	movk x9,#0x29, LSL #32
00c0a418	str x9,[x8]
00c0a41c	ldrb w8,[x21, #0x5d]
00c0a420	cbz w8,0x00c0a3e8
00c0a424	ldr x8,[x21, #0x48]
00c0a428	stp x8,xzr,[sp]
00c0a42c	mov x0,x19
00c0a430	bl 0x00c43880
00c0a434	mov x24,x0
00c0a438	stur x0,[x29, #-0x20]
00c0a43c	add x0,sp,#0x10
00c0a440	mov x1,sp
00c0a444	add x3,sp,#0x8
00c0a448	mov w2,#0x64
00c0a44c	bl 0x00c43af0
00c0a450	mov x23,x0
00c0a454	cbz x24,0x00c0a460
00c0a458	mov x0,x24
00c0a45c	bl 0x00c43880
00c0a460	cmn x23,#0x1
00c0a464	b.eq 0x00c0a65c
00c0a468	mov x24,x20
00c0a46c	ldr x8,[x24, #0x60]!
00c0a470	ldrb w9,[x24]
00c0a474	and x10,x8,#-0x2
00c0a478	tst w9,#0x1
00c0a47c	mov w9,#0x4
00c0a480	sub x10,x10,#0x1
00c0a484	csel x1,x9,x10,eq
00c0a488	and w9,w8,#0xff
00c0a48c	subs x2,x23,x1
00c0a490	b.ls 0x00c0a4d4
00c0a494	ldr x10,[x20, #0x68]
00c0a498	ubfx x8,x8,#0x1,#0x7
00c0a49c	tst w9,#0x1
00c0a4a0	csel x3,x8,x10,eq
00c0a4a4	mov x0,x24
00c0a4a8	mov x4,xzr
00c0a4ac	mov x5,x3
00c0a4b0	mov x6,xzr
00c0a4b4	bl 0x00c43d70
00c0a4b8	ldrb w8,[x20, #0x60]
00c0a4bc	ldr x9,[x20, #0x70]
00c0a4c0	add x10,x20,#0x64
00c0a4c4	str xzr,[x20, #0x68]
00c0a4c8	tst w8,#0x1
00c0a4cc	csel x12,x10,x9,eq
00c0a4d0	b 0x00c0a4ec
00c0a4d4	ldr x8,[x20, #0x70]
00c0a4d8	add x10,x20,#0x64
00c0a4dc	tst w9,#0x1
00c0a4e0	csel x12,x10,x8,eq
00c0a4e4	mov x9,x12
00c0a4e8	cbz x23,0x00c0a570
00c0a4ec	sub x8,x23,#0x1
00c0a4f0	and x9,x8,#0x3fffffffffffffff
00c0a4f4	add x8,sp,#0x10
00c0a4f8	cmp x9,#0x7
00c0a4fc	b.cc 0x00c0a554
00c0a500	sub x10,x12,x8
00c0a504	cmp x10,#0x20
00c0a508	b.cc 0x00c0a554
00c0a50c	add x10,x9,#0x1
00c0a510	add x13,sp,#0x10
00c0a514	and x11,x10,#0x7ffffffffffffff8
00c0a518	lsl x8,x11,#0x2
00c0a51c	mov x14,x11
00c0a520	add x9,x12,x8
00c0a524	add x8,x13,x8
00c0a528	add x13,x13,#0x10
00c0a52c	add x12,x12,#0x10
00c0a530	ldp q0,q1,[x13, #-0x10]
00c0a534	subs x14,x14,#0x8
00c0a538	add x13,x13,#0x20
00c0a53c	stp q0,q1,[x12, #-0x10]
00c0a540	add x12,x12,#0x20
00c0a544	b.ne 0x00c0a530
00c0a548	cmp x10,x11
00c0a54c	b.ne 0x00c0a558
00c0a550	b 0x00c0a570
00c0a554	mov x9,x12
00c0a558	add x10,sp,#0x10
00c0a55c	add x10,x10,x23, LSL #0x2
00c0a560	ldr w11,[x8], #0x4
00c0a564	cmp x8,x10
00c0a568	str w11,[x9], #0x4
00c0a56c	b.ne 0x00c0a560
00c0a570	str wzr,[x9]
00c0a574	ldrb w8,[x24]
00c0a578	tbnz w8,#0x0,0x00c0a590
00c0a57c	lsl w8,w23,#0x1
00c0a580	strb w8,[x24]
00c0a584	ldrb w8,[x22]
00c0a588	tbz w8,#0x0,0x00c0a5d0
00c0a58c	b 0x00c0a59c
00c0a590	str x23,[x20, #0x68]
00c0a594	ldrb w8,[x22]
00c0a598	tbz w8,#0x0,0x00c0a5d0
00c0a59c	ldp x2,x1,[x20, #0x38]
00c0a5a0	sub x0,x29,#0x20
00c0a5a4	bl 0x00bc5654
00c0a5a8	b 0x00c0a5e0
00c0a5ac	mov w9,#0x2
00c0a5b0	ldr x8,[x20, #0x70]
00c0a5b4	str x9,[x20, #0x68]
00c0a5b8	mov x9,#0x28
00c0a5bc	str wzr,[x8, #0x8]
00c0a5c0	movk x9,#0x29, LSL #32
00c0a5c4	str x9,[x8]
00c0a5c8	ldrb w8,[x22]
00c0a5cc	tbnz w8,#0x0,0x00c0a59c
00c0a5d0	ldr q0,[x22]
00c0a5d4	ldr x8,[x22, #0x10]
00c0a5d8	stur q0,[x29, #-0x20]
00c0a5dc	stur x8,[x29, #-0x10]
00c0a5e0	ldrb w5,[x21, #0x5c]
00c0a5e4	ldrb w4,[x21, #0x59]
00c0a5e8	ldrb w3,[x21, #0x58]
00c0a5ec	add x0,x20,#0x7c
00c0a5f0	sub x1,x29,#0x20
00c0a5f4	mov w2,#0x1
00c0a5f8	bl 0x00c09a68
00c0a5fc	ldrb w5,[x21, #0x5d]
00c0a600	ldrb w4,[x21, #0x5b]
00c0a604	ldrb w3,[x21, #0x5a]
00c0a608	add x0,x20,#0x80
00c0a60c	mov x1,x22
00c0a610	mov w2,#0x1
00c0a614	bl 0x00c09a68
00c0a618	ldurb w8,[x29, #-0x20]
00c0a61c	tbz w8,#0x0,0x00c0a634
00c0a620	ldur x8,[x29, #-0x20]
00c0a624	ldur x0,[x29, #-0x10]
00c0a628	lsl x8,x8,#0x2
00c0a62c	and x1,x8,#-0x8
00c0a630	bl 0x00c2fe80
00c0a634	mov x0,x19
00c0a638	bl 0x00c43980
00c0a63c	add sp,sp,#0x1c0
00c0a640	ldp x20,x19,[sp, #0x40]
00c0a644	ldr x28,[sp, #0x10]
00c0a648	ldp x22,x21,[sp, #0x30]
00c0a64c	ldp x24,x23,[sp, #0x20]
00c0a650	ldp x29,x30,[sp], #0x50
00c0a654	autiasp
00c0a658	ret
00c0a65c	adrp x0,0x29f000
00c0a660	add x0,x0,#0x109
00c0a664	bl 0x00c43d00
00c0a668	sub x0,x29,#0x20
00c0a66c	mov x1,x21
00c0a670	bl 0x00852d7c
00c0a674	adrp x0,0x2be000
00c0a678	add x0,x0,#0xc9d
00c0a67c	add x8,sp,#0x10
00c0a680	sub x1,x29,#0x20
00c0a684	add x19,sp,#0x10
00c0a688	bl 0x00bfb964
00c0a68c	ldrb w8,[sp, #0x10]
00c0a690	ldr x9,[sp, #0x20]
00c0a694	tst w8,#0x1
00c0a698	csinc x0,x9,x19,ne
00c0a69c	bl 0x00c43d00
00c0a6a0	adrp x0,0x29f000
00c0a6a4	add x0,x0,#0x109
00c0a6a8	bl 0x00c43d00
00c0a6ac	ldrb w8,[sp, #0x10]
00c0a6b0	mov x19,x0
00c0a6b4	tbz w8,#0x0,0x00c0a6d0
00c0a6b8	ldr x8,[sp, #0x10]
00c0a6bc	ldr x0,[sp, #0x20]
00c0a6c0	and x1,x8,#-0x2
00c0a6c4	bl 0x00c2fe80
00c0a6c8	b 0x00c0a6d0
00c0a6d0	ldurb w8,[x29, #-0x20]
00c0a6d4	tbz w8,#0x0,0x00c0a76c
00c0a6d8	ldur x8,[x29, #-0x20]
00c0a6dc	ldur x0,[x29, #-0x10]
00c0a6e0	and x1,x8,#-0x2
00c0a6e4	b 0x00c0a758
00c0a758	bl 0x00c2fe80
00c0a75c	b 0x00c0a76c
00c0a76c	add x0,x29,#0x18
00c0a770	bl 0x00c02418
00c0a774	mov x0,x19
00c0a778	bl 0x00c2c090
