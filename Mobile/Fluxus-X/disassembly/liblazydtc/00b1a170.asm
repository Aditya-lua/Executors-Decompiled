; FUN_00b1a170 @ 00b1a170
00b1a170	sub sp,sp,#0x70
00b1a174	stp x28,x27,[sp, #0x10]
00b1a178	stp x26,x25,[sp, #0x20]
00b1a17c	stp x24,x23,[sp, #0x30]
00b1a180	stp x22,x21,[sp, #0x40]
00b1a184	stp x20,x19,[sp, #0x50]
00b1a188	stp x29,x30,[sp, #0x60]
00b1a18c	ldr x3,[x1, #0x30]
00b1a190	adrp x27,0x77b000
00b1a194	mov x20,x1
00b1a198	mov x19,x0
00b1a19c	add x21,x1,#0x20
00b1a1a0	mov w22,#0xffffffff
00b1a1a4	add x27,x27,#0xaac
00b1a1a8	mov w28,#0x2
00b1a1ac	orr w23,wzr,#0x3
00b1a1b0	mov w24,#0x4
00b1a1b4	mov w25,#0x5
00b1a1b8	add x29,sp,#0x60
00b1a1bc	str x3,[sp, #0x8]
00b1a1c0	b 0x00b1a214
00b1a1c4	bl 0x00c35ed0
00b1a1c8	bl 0x00c342a0
00b1a1cc	adrp x0,0x2bc000
00b1a1d0	adrp x2,0x2b2000
00b1a1d4	mov w1,#0xb1
00b1a1d8	add x0,x0,#0x77a
00b1a1dc	add x2,x2,#0xe4f
00b1a1e0	bl 0x00c342b0
00b1a1e4	bl 0x00c30710
00b1a1e8	ldr w1,[x0]
00b1a1ec	ldp x3,x4,[x20, #0x8]
00b1a1f0	adrp x2,0x2a8000
00b1a1f4	mov w0,#0x2
00b1a1f8	add x2,x2,#0xa39
00b1a1fc	bl 0x00c342c0
00b1a200	ldr x3,[sp, #0x8]
00b1a204	orr w8,wzr,#0x7
00b1a208	mov w22,wzr
00b1a20c	str w8,[x20]
00b1a210	cbnz x3,0x00b1a3f8
00b1a214	ldr w8,[x20]
00b1a218	sub w8,w8,#0x1
00b1a21c	cmp w8,#0x6
00b1a220	b.hi 0x00b1a420
00b1a224	ldrsw x8,[x27, x8, LSL #0x2]
00b1a228	add x8,x8,x27
00b1a22c	br x8
00b1a230	ldr x8,[x20, #0x8]
00b1a234	cbnz x8,0x00b1a240
00b1a238	ldr x8,[x20, #0x10]
00b1a23c	cbz x8,0x00b1a58c
00b1a240	str w28,[x20]
00b1a244	cbz x3,0x00b1a214
00b1a248	b 0x00b1a3f8
00b1a24c	ldr w8,[x20, #0x4]
00b1a250	cmp w8,#0x100
00b1a254	b.eq 0x00b1a3bc
00b1a258	cmp w8,#0x6
00b1a25c	b.eq 0x00b1a3c4
00b1a260	cmp w8,#0x4
00b1a264	b.ne 0x00b1a4ac
00b1a268	mov w3,#0x2
00b1a26c	b 0x00b1a3c8
00b1a270	ldr x0,[x20, #0x28]
00b1a274	bl 0x00c384c0
00b1a278	ldr x8,[x20, #0x28]
00b1a27c	mov w22,w0
00b1a280	mov x0,x8
00b1a284	bl 0x00c38500
00b1a288	ldr x8,[x20, #0x28]
00b1a28c	mov w26,w0
00b1a290	mov x0,x8
00b1a294	bl 0x00c384f0
00b1a298	mov w2,w0
00b1a29c	mov w0,w22
00b1a2a0	mov w1,w26
00b1a2a4	mov w3,wzr
00b1a2a8	bl 0x00c38780
00b1a2ac	cmn w0,#0x1
00b1a2b0	b.eq 0x00b1a4d4
00b1a2b4	ldr x3,[sp, #0x8]
00b1a2b8	mov w22,w0
00b1a2bc	str w0,[x19, #0x38]
00b1a2c0	str w24,[x20]
00b1a2c4	cbz x3,0x00b1a214
00b1a2c8	b 0x00b1a3f8
00b1a2cc	orr w1,wzr,#0xf
00b1a2d0	mov x0,x19
00b1a2d4	bl 0x00c32190
00b1a2d8	bl 0x00c35250
00b1a2dc	ldr x0,[x20, #0x28]
00b1a2e0	ldr w22,[x19, #0x38]
00b1a2e4	bl 0x00c384b0
00b1a2e8	ldr w8,[x20, #0x18]
00b1a2ec	mov x1,x0
00b1a2f0	mov w0,w22
00b1a2f4	orr w2,w8,#0x4
00b1a2f8	bl 0x00c387b0
00b1a2fc	str wzr,[x19, #0x34]
00b1a300	cbz w0,0x00b1a378
00b1a304	mov w22,w0
00b1a308	bl 0x00c35ed0
00b1a30c	b 0x00b1a368
00b1a310	ldr w26,[x19, #0x38]
00b1a314	mov x0,xzr
00b1a318	bl 0x00c30970
00b1a31c	mov x2,x0
00b1a320	mov w0,w26
00b1a324	mov w1,wzr
00b1a328	bl 0x00c38660
00b1a32c	cbz w0,0x00b1a3b0
00b1a330	ldr w0,[x19, #0x38]
00b1a334	bl 0x00c38730
00b1a338	cbz w0,0x00b1a368
00b1a33c	mov w26,w0
00b1a340	orr w1,wzr,#0xf
00b1a344	mov x0,x19
00b1a348	bl 0x00c32190
00b1a34c	ldr x0,[x20, #0x28]
00b1a350	bl 0x00c384e0
00b1a354	str x0,[x20, #0x28]
00b1a358	cbz x0,0x00b1a5cc
00b1a35c	ldr w0,[x19, #0x38]
00b1a360	bl 0x00c38750
00b1a364	b 0x00b1a3ec
00b1a368	str w25,[x20]
00b1a36c	ldr x3,[sp, #0x8]
00b1a370	cbz x3,0x00b1a214
00b1a374	b 0x00b1a3f8
00b1a378	bl 0x00c38770
00b1a37c	cbnz w0,0x00b1a628
00b1a380	ldr x0,[x20, #0x28]
00b1a384	bl 0x00c384e0
00b1a388	str x0,[x20, #0x28]
00b1a38c	cbz x0,0x00b1a1c4
00b1a390	ldr w0,[x19, #0x38]
00b1a394	bl 0x00c38750
00b1a398	str w23,[x20]
00b1a39c	bl 0x00c35240
00b1a3a0	ldr x3,[sp, #0x8]
00b1a3a4	mov w22,wzr
00b1a3a8	cbz x3,0x00b1a214
00b1a3ac	b 0x00b1a3f8
00b1a3b0	ldr x3,[sp, #0x8]
00b1a3b4	cbz x3,0x00b1a214
00b1a3b8	b 0x00b1a3f8
00b1a3bc	mov w3,wzr
00b1a3c0	b 0x00b1a3c8
00b1a3c4	mov w3,#0xa
00b1a3c8	ldp x0,x1,[x20, #0x8]
00b1a3cc	mov w4,#0x1
00b1a3d0	mov w2,wzr
00b1a3d4	mov x5,x21
00b1a3d8	bl 0x00c38590
00b1a3dc	cbz w0,0x00b1a548
00b1a3e0	ldr x8,[x21]
00b1a3e4	cbz x8,0x00b1a554
00b1a3e8	str x8,[x20, #0x28]
00b1a3ec	str w23,[x20]
00b1a3f0	ldr x3,[sp, #0x8]
00b1a3f4	cbz x3,0x00b1a214
00b1a3f8	ldr w1,[x20]
00b1a3fc	ldr x3,[sp, #0x8]
00b1a400	mov x0,x19
00b1a404	mov w2,w22
00b1a408	blr x3
00b1a40c	ldr x3,[sp, #0x8]
00b1a410	mov w22,w0
00b1a414	cbnz w0,0x00b1a214
00b1a418	b 0x00b1a488
00b1a41c	mov w22,#0x1
00b1a420	cbz x3,0x00b1a488
00b1a424	ldr w1,[x20]
00b1a428	mov x0,x19
00b1a42c	mov w2,w22
00b1a430	ldp x29,x30,[sp, #0x60]
00b1a434	ldp x20,x19,[sp, #0x50]
00b1a438	ldp x22,x21,[sp, #0x40]
00b1a43c	ldp x24,x23,[sp, #0x30]
00b1a440	ldp x26,x25,[sp, #0x20]
00b1a444	ldp x28,x27,[sp, #0x10]
00b1a448	add sp,sp,#0x70
00b1a44c	br x3
00b1a450	bl 0x00c342a0
00b1a454	adrp x0,0x2bc000
00b1a458	adrp x2,0x2b2000
00b1a45c	add x0,x0,#0x77a
00b1a460	add x2,x2,#0xe4f
00b1a464	mov w1,#0xe2
00b1a468	bl 0x00c342b0
00b1a46c	mov w0,#0x20
00b1a470	mov w1,#0x67
00b1a474	mov x2,xzr
00b1a478	bl 0x00c342c0
00b1a47c	ldr x3,[sp, #0x8]
00b1a480	mov w22,wzr
00b1a484	cbnz x3,0x00b1a424
00b1a488	mov w0,w22
00b1a48c	ldp x29,x30,[sp, #0x60]
00b1a490	ldp x20,x19,[sp, #0x50]
00b1a494	ldp x22,x21,[sp, #0x40]
00b1a498	ldp x24,x23,[sp, #0x30]
00b1a49c	ldp x26,x25,[sp, #0x20]
00b1a4a0	ldp x28,x27,[sp, #0x10]
00b1a4a4	add sp,sp,#0x70
00b1a4a8	ret
00b1a4ac	bl 0x00c342a0
00b1a4b0	adrp x0,0x2bc000
00b1a4b4	adrp x2,0x2b2000
00b1a4b8	add x0,x0,#0x77a
00b1a4bc	add x2,x2,#0xe4f
00b1a4c0	mov w1,#0x7b
00b1a4c4	bl 0x00c342b0
00b1a4c8	mov w0,#0x20
00b1a4cc	mov w1,#0x92
00b1a4d0	b 0x00b1a578
00b1a4d4	bl 0x00c342a0
00b1a4d8	adrp x21,0x2bc000
00b1a4dc	adrp x22,0x2b2000
00b1a4e0	add x21,x21,#0x77a
00b1a4e4	add x22,x22,#0xe4f
00b1a4e8	mov w1,#0x90
00b1a4ec	mov x0,x21
00b1a4f0	mov x2,x22
00b1a4f4	bl 0x00c342b0
00b1a4f8	bl 0x00c30710
00b1a4fc	ldr w1,[x0]
00b1a500	ldp x3,x4,[x20, #0x8]
00b1a504	adrp x2,0x2d2000
00b1a508	add x2,x2,#0x637
00b1a50c	mov w0,#0x2
00b1a510	bl 0x00c342c0
00b1a514	bl 0x00c342a0
00b1a518	mov w1,#0x93
00b1a51c	mov x0,x21
00b1a520	mov x2,x22
00b1a524	bl 0x00c342b0
00b1a528	mov w0,#0x20
00b1a52c	mov w1,#0x76
00b1a530	mov x2,xzr
00b1a534	bl 0x00c342c0
00b1a538	ldr x3,[sp, #0x8]
00b1a53c	mov w22,#0xffffffff
00b1a540	cbnz x3,0x00b1a424
00b1a544	b 0x00b1a488
00b1a548	ldr x3,[sp, #0x8]
00b1a54c	cbnz x3,0x00b1a424
00b1a550	b 0x00b1a488
00b1a554	bl 0x00c342a0
00b1a558	adrp x0,0x2bc000
00b1a55c	adrp x2,0x2b2000
00b1a560	add x0,x0,#0x77a
00b1a564	add x2,x2,#0xe4f
00b1a568	mov w1,#0x84
00b1a56c	bl 0x00c342b0
00b1a570	mov w0,#0x20
00b1a574	mov w1,#0x8e
00b1a578	mov x2,xzr
00b1a57c	bl 0x00c342c0
00b1a580	ldr x3,[sp, #0x8]
00b1a584	cbnz x3,0x00b1a424
00b1a588	b 0x00b1a488
00b1a58c	bl 0x00c342a0
00b1a590	adrp x0,0x2bc000
00b1a594	adrp x2,0x2b2000
00b1a598	add x0,x0,#0x77a
00b1a59c	add x2,x2,#0xe4f
00b1a5a0	mov w1,#0x5a
00b1a5a4	bl 0x00c342b0
00b1a5a8	ldp x3,x4,[x20, #0x8]
00b1a5ac	adrp x2,0x2d6000
00b1a5b0	add x2,x2,#0x862
00b1a5b4	mov w0,#0x20
00b1a5b8	mov w1,#0x90
00b1a5bc	bl 0x00c342c0
00b1a5c0	ldr x3,[sp, #0x8]
00b1a5c4	cbnz x3,0x00b1a424
00b1a5c8	b 0x00b1a488
00b1a5cc	bl 0x00c342a0
00b1a5d0	adrp x21,0x2bc000
00b1a5d4	adrp x22,0x2b2000
00b1a5d8	add x21,x21,#0x77a
00b1a5dc	add x22,x22,#0xe4f
00b1a5e0	mov w1,#0xcd
00b1a5e4	mov x0,x21
00b1a5e8	mov x2,x22
00b1a5ec	bl 0x00c342b0
00b1a5f0	ldp x3,x4,[x20, #0x8]
00b1a5f4	adrp x2,0x2a8000
00b1a5f8	add x2,x2,#0xa39
00b1a5fc	mov w0,#0x2
00b1a600	mov w1,w26
00b1a604	bl 0x00c342c0
00b1a608	bl 0x00c342a0
00b1a60c	mov w1,#0xd0
00b1a610	mov x0,x21
00b1a614	mov x2,x22
00b1a618	bl 0x00c342b0
00b1a61c	mov w0,#0x20
00b1a620	mov w1,#0x6e
00b1a624	b 0x00b1a474
00b1a628	orr w1,wzr,#0xc
00b1a62c	mov x0,x19
00b1a630	bl 0x00c322a0
00b1a634	orr w8,wzr,#0x6
00b1a638	mov w9,#0x2
00b1a63c	str w8,[x20]
00b1a640	str w9,[x19, #0x34]
00b1a644	bl 0x00c35240
00b1a648	b 0x00b1a47c
