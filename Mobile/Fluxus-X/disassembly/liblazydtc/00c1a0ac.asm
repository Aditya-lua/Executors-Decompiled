; FUN_00c1a0ac @ 00c1a0ac
00c1a0ac	paciasp
00c1a0b0	stp x29,x30,[sp, #-0x40]!
00c1a0b4	stp x24,x23,[sp, #0x10]
00c1a0b8	stp x22,x21,[sp, #0x20]
00c1a0bc	stp x20,x19,[sp, #0x30]
00c1a0c0	mov x29,sp
00c1a0c4	ldr w8,[x1, #0x20]
00c1a0c8	mov x19,x1
00c1a0cc	mov x20,x0
00c1a0d0	cbz w8,0x00c1a300
00c1a0d4	mov w23,wzr
00c1a0d8	ldurh w8,[x20, #0x9]
00c1a0dc	ldr x21,[x20, #0x10]
00c1a0e0	mov w10,#0x4400
00c1a0e4	lsl w24,w8,#0xa
00c1a0e8	sbfx w8,w8,#0x0,#0x6
00c1a0ec	ldurh w11,[x21, #0x9]
00c1a0f0	and w9,w24,#0xfc00
00c1a0f4	cmp w9,w10
00c1a0f8	mov w9,#0xf
00c1a0fc	csel w8,w9,w8,eq
00c1a100	lsl w9,w11,#0x1a
00c1a104	cinc w8,w8,ne
00c1a108	cmp w8,w9, ASR #0x1a
00c1a10c	b.ls 0x00c1a14c
00c1a110	ldr x8,[x21]
00c1a114	mov x0,x21
00c1a118	mov x1,x19
00c1a11c	ldr x8,[x8, #0x20]
00c1a120	blr x8
00c1a124	ldurh w8,[x21, #0x9]
00c1a128	and w8,w8,#0xc0
00c1a12c	cmp w8,#0x40
00c1a130	b.eq 0x00c1a22c
00c1a134	ldr x8,[x21]
00c1a138	mov x0,x21
00c1a13c	mov x1,x19
00c1a140	ldr x8,[x8, #0x28]
00c1a144	blr x8
00c1a148	b 0x00c1a22c
00c1a14c	ldp x8,x10,[x19, #0x8]
00c1a150	ldr w11,[x19, #0x20]
00c1a154	ldr x0,[x19]
00c1a158	add w11,w11,#0x1
00c1a15c	add x9,x8,#0x1
00c1a160	str w11,[x19, #0x20]
00c1a164	cmp x9,x10
00c1a168	b.ls 0x00c1a194
00c1a16c	lsl x9,x10,#0x1
00c1a170	add x8,x8,#0x3e1
00c1a174	cmp x9,x8
00c1a178	csel x1,x9,x8,hi
00c1a17c	str x1,[x19, #0x10]
00c1a180	bl 0x00c30950
00c1a184	str x0,[x19]
00c1a188	cbz x0,0x00c1a5a0
00c1a18c	ldr x8,[x19, #0x8]
00c1a190	add x9,x8,#0x1
00c1a194	str x9,[x19, #0x8]
00c1a198	ldr x9,[x21]
00c1a19c	mov w10,#0x28
00c1a1a0	strb w10,[x0, x8]
00c1a1a4	mov x0,x21
00c1a1a8	mov x1,x19
00c1a1ac	ldr x8,[x9, #0x20]
00c1a1b0	blr x8
00c1a1b4	ldurh w8,[x21, #0x9]
00c1a1b8	and w8,w8,#0xc0
00c1a1bc	cmp w8,#0x40
00c1a1c0	b.eq 0x00c1a1d8
00c1a1c4	ldr x8,[x21]
00c1a1c8	mov x0,x21
00c1a1cc	mov x1,x19
00c1a1d0	ldr x8,[x8, #0x28]
00c1a1d4	blr x8
00c1a1d8	ldp x8,x10,[x19, #0x8]
00c1a1dc	ldr w11,[x19, #0x20]
00c1a1e0	ldr x0,[x19]
00c1a1e4	sub w11,w11,#0x1
00c1a1e8	add x9,x8,#0x1
00c1a1ec	str w11,[x19, #0x20]
00c1a1f0	cmp x9,x10
00c1a1f4	b.ls 0x00c1a220
00c1a1f8	lsl x9,x10,#0x1
00c1a1fc	add x8,x8,#0x3e1
00c1a200	cmp x9,x8
00c1a204	csel x1,x9,x8,hi
00c1a208	str x1,[x19, #0x10]
00c1a20c	bl 0x00c30950
00c1a210	str x0,[x19]
00c1a214	cbz x0,0x00c1a5a4
00c1a218	ldr x8,[x19, #0x8]
00c1a21c	add x9,x8,#0x1
00c1a220	str x9,[x19, #0x8]
00c1a224	mov w9,#0x29
00c1a228	strb w9,[x0, x8]
00c1a22c	ldr x8,[x20, #0x20]
00c1a230	cmp x8,#0x1
00c1a234	b.ne 0x00c1a250
00c1a238	ldr x22,[x20, #0x18]
00c1a23c	ldrb w8,[x22]
00c1a240	cmp w8,#0x2c
00c1a244	b.ne 0x00c1a250
00c1a248	mov w21,#0x1
00c1a24c	b 0x00c1a2a8
00c1a250	ldp x8,x9,[x19, #0x8]
00c1a254	ldr x0,[x19]
00c1a258	add x10,x8,#0x1
00c1a25c	cmp x10,x9
00c1a260	b.ls 0x00c1a288
00c1a264	lsl x9,x9,#0x1
00c1a268	add x8,x8,#0x3e1
00c1a26c	cmp x9,x8
00c1a270	csel x1,x9,x8,hi
00c1a274	str x1,[x19, #0x10]
00c1a278	bl 0x00c30950
00c1a27c	str x0,[x19]
00c1a280	cbz x0,0x00c1a598
00c1a284	ldr x8,[x19, #0x8]
00c1a288	mov w9,#0x20
00c1a28c	strb w9,[x0, x8]
00c1a290	ldr x8,[x19, #0x8]
00c1a294	add x8,x8,#0x1
00c1a298	str x8,[x19, #0x8]
00c1a29c	ldr x21,[x20, #0x20]
00c1a2a0	cbz x21,0x00c1a324
00c1a2a4	ldr x22,[x20, #0x18]
00c1a2a8	ldp x8,x9,[x19, #0x8]
00c1a2ac	ldr x0,[x19]
00c1a2b0	add x10,x8,x21
00c1a2b4	cmp x10,x9
00c1a2b8	b.ls 0x00c1a2e0
00c1a2bc	lsl x8,x9,#0x1
00c1a2c0	add x9,x10,#0x3e0
00c1a2c4	cmp x8,x9
00c1a2c8	csel x1,x8,x9,hi
00c1a2cc	str x1,[x19, #0x10]
00c1a2d0	bl 0x00c30950
00c1a2d4	str x0,[x19]
00c1a2d8	cbz x0,0x00c1a59c
00c1a2dc	ldr x8,[x19, #0x8]
00c1a2e0	add x0,x0,x8
00c1a2e4	mov x1,x22
00c1a2e8	mov x2,x21
00c1a2ec	bl 0x00c2ffd0
00c1a2f0	ldr x8,[x19, #0x8]
00c1a2f4	add x8,x8,x21
00c1a2f8	str x8,[x19, #0x8]
00c1a2fc	b 0x00c1a328
00c1a300	ldp x8,x9,[x20, #0x18]
00c1a304	cmp x9,#0x2
00c1a308	b.eq 0x00c1a52c
00c1a30c	cmp x9,#0x1
00c1a310	b.ne 0x00c1a0d4
00c1a314	ldrb w8,[x8]
00c1a318	cmp w8,#0x3e
00c1a31c	b.ne 0x00c1a0d4
00c1a320	b 0x00c1a53c
00c1a324	ldr x8,[x19, #0x8]
00c1a328	ldr x9,[x19, #0x10]
00c1a32c	add x10,x8,#0x1
00c1a330	ldr x0,[x19]
00c1a334	cmp x10,x9
00c1a338	b.ls 0x00c1a360
00c1a33c	lsl x9,x9,#0x1
00c1a340	add x8,x8,#0x3e1
00c1a344	cmp x9,x8
00c1a348	csel x1,x9,x8,hi
00c1a34c	str x1,[x19, #0x10]
00c1a350	bl 0x00c30950
00c1a354	str x0,[x19]
00c1a358	cbz x0,0x00c1a594
00c1a35c	ldr x8,[x19, #0x8]
00c1a360	mov w9,#0x20
00c1a364	strb w9,[x0, x8]
00c1a368	mov w12,#0x4400
00c1a36c	ldr x9,[x19, #0x8]
00c1a370	ldr x21,[x20, #0x28]
00c1a374	cmp w12,w24, UXTH 
00c1a378	add x8,x9,#0x1
00c1a37c	str x8,[x19, #0x8]
00c1a380	ldurh w10,[x20, #0x9]
00c1a384	ldurh w11,[x21, #0x9]
00c1a388	sbfx w10,w10,#0x0,#0x6
00c1a38c	lsl w11,w11,#0x1a
00c1a390	cinc w10,w10,eq
00c1a394	cmp w10,w11, ASR #0x1a
00c1a398	b.ls 0x00c1a3dc
00c1a39c	ldr x8,[x21]
00c1a3a0	mov x0,x21
00c1a3a4	mov x1,x19
00c1a3a8	ldr x8,[x8, #0x20]
00c1a3ac	blr x8
00c1a3b0	ldurh w8,[x21, #0x9]
00c1a3b4	and w8,w8,#0xc0
00c1a3b8	cmp w8,#0x40
00c1a3bc	b.eq 0x00c1a3d4
00c1a3c0	ldr x8,[x21]
00c1a3c4	mov x0,x21
00c1a3c8	mov x1,x19
00c1a3cc	ldr x8,[x8, #0x28]
00c1a3d0	blr x8
00c1a3d4	cbnz w23,0x00c1a4c0
00c1a3d8	b 0x00c1a514
00c1a3dc	ldr w12,[x19, #0x20]
00c1a3e0	ldr x11,[x19, #0x10]
00c1a3e4	add x10,x9,#0x2
00c1a3e8	ldr x0,[x19]
00c1a3ec	add w12,w12,#0x1
00c1a3f0	cmp x10,x11
00c1a3f4	str w12,[x19, #0x20]
00c1a3f8	b.ls 0x00c1a424
00c1a3fc	lsl x8,x11,#0x1
00c1a400	add x9,x9,#0x3e2
00c1a404	cmp x8,x9
00c1a408	csel x1,x8,x9,hi
00c1a40c	str x1,[x19, #0x10]
00c1a410	bl 0x00c30950
00c1a414	str x0,[x19]
00c1a418	cbz x0,0x00c1a5a8
00c1a41c	ldr x8,[x19, #0x8]
00c1a420	add x10,x8,#0x1
00c1a424	ldr x9,[x21]
00c1a428	str x10,[x19, #0x8]
00c1a42c	mov w10,#0x28
00c1a430	strb w10,[x0, x8]
00c1a434	mov x0,x21
00c1a438	mov x1,x19
00c1a43c	ldr x8,[x9, #0x20]
00c1a440	blr x8
00c1a444	ldurh w8,[x21, #0x9]
00c1a448	and w8,w8,#0xc0
00c1a44c	cmp w8,#0x40
00c1a450	b.eq 0x00c1a468
00c1a454	ldr x8,[x21]
00c1a458	mov x0,x21
00c1a45c	mov x1,x19
00c1a460	ldr x8,[x8, #0x28]
00c1a464	blr x8
00c1a468	ldp x8,x10,[x19, #0x8]
00c1a46c	ldr w11,[x19, #0x20]
00c1a470	ldr x0,[x19]
00c1a474	sub w11,w11,#0x1
00c1a478	add x9,x8,#0x1
00c1a47c	str w11,[x19, #0x20]
00c1a480	cmp x9,x10
00c1a484	b.ls 0x00c1a4b0
00c1a488	lsl x9,x10,#0x1
00c1a48c	add x8,x8,#0x3e1
00c1a490	cmp x9,x8
00c1a494	csel x1,x9,x8,hi
00c1a498	str x1,[x19, #0x10]
00c1a49c	bl 0x00c30950
00c1a4a0	str x0,[x19]
00c1a4a4	cbz x0,0x00c1a5ac
00c1a4a8	ldr x8,[x19, #0x8]
00c1a4ac	add x9,x8,#0x1
00c1a4b0	str x9,[x19, #0x8]
00c1a4b4	mov w9,#0x29
00c1a4b8	strb w9,[x0, x8]
00c1a4bc	cbz w23,0x00c1a514
00c1a4c0	ldp x8,x10,[x19, #0x8]
00c1a4c4	ldr w11,[x19, #0x20]
00c1a4c8	ldr x0,[x19]
00c1a4cc	sub w11,w11,#0x1
00c1a4d0	add x9,x8,#0x1
00c1a4d4	str w11,[x19, #0x20]
00c1a4d8	cmp x9,x10
00c1a4dc	b.ls 0x00c1a508
00c1a4e0	lsl x9,x10,#0x1
00c1a4e4	add x8,x8,#0x3e1
00c1a4e8	cmp x9,x8
00c1a4ec	csel x1,x9,x8,hi
00c1a4f0	str x1,[x19, #0x10]
00c1a4f4	bl 0x00c30950
00c1a4f8	str x0,[x19]
00c1a4fc	cbz x0,0x00c1a5b0
00c1a500	ldr x8,[x19, #0x8]
00c1a504	add x9,x8,#0x1
00c1a508	str x9,[x19, #0x8]
00c1a50c	mov w9,#0x29
00c1a510	strb w9,[x0, x8]
00c1a514	ldp x20,x19,[sp, #0x30]
00c1a518	ldp x22,x21,[sp, #0x20]
00c1a51c	ldp x24,x23,[sp, #0x10]
00c1a520	ldp x29,x30,[sp], #0x40
00c1a524	autiasp
00c1a528	ret
00c1a52c	ldrh w8,[x8]
00c1a530	mov w9,#0x3e3e
00c1a534	cmp w8,w9
00c1a538	b.ne 0x00c1a0d4
00c1a53c	ldp x8,x10,[x19, #0x8]
00c1a540	mov w11,#0x1
00c1a544	ldr x0,[x19]
00c1a548	str w11,[x19, #0x20]
00c1a54c	add x9,x8,#0x1
00c1a550	cmp x9,x10
00c1a554	b.ls 0x00c1a580
00c1a558	lsl x9,x10,#0x1
00c1a55c	add x8,x8,#0x3e1
00c1a560	cmp x9,x8
00c1a564	csel x1,x9,x8,hi
00c1a568	str x1,[x19, #0x10]
00c1a56c	bl 0x00c30950
00c1a570	str x0,[x19]
00c1a574	cbz x0,0x00c1a5b4
00c1a578	ldr x8,[x19, #0x8]
00c1a57c	add x9,x8,#0x1
00c1a580	mov w23,#0x1
00c1a584	str x9,[x19, #0x8]
00c1a588	mov w9,#0x28
00c1a58c	strb w9,[x0, x8]
00c1a590	b 0x00c1a0d8
00c1a594	bl 0x00c30b40
00c1a598	bl 0x00c30b40
00c1a59c	bl 0x00c30b40
00c1a5a0	bl 0x00c30b40
00c1a5a4	bl 0x00c30b40
00c1a5a8	bl 0x00c30b40
00c1a5ac	bl 0x00c30b40
00c1a5b0	bl 0x00c30b40
00c1a5b4	bl 0x00c30b40
