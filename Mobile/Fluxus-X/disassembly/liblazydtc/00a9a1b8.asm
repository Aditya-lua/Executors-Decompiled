; CRYPTO_secure_malloc @ 00a9a1b8
00a9a1b8	str x25,[sp, #-0x50]!
00a9a1bc	stp x24,x23,[sp, #0x10]
00a9a1c0	stp x22,x21,[sp, #0x20]
00a9a1c4	stp x20,x19,[sp, #0x30]
00a9a1c8	stp x29,x30,[sp, #0x40]
00a9a1cc	adrp x8,0xd22000
00a9a1d0	ldrb w8,[x8, #0xf0]
00a9a1d4	mov x20,x0
00a9a1d8	add x29,sp,#0x40
00a9a1dc	tbz w8,#0x0,0x00a9a264
00a9a1e0	adrp x22,0xd22000
00a9a1e4	ldr x0,[x22, #0xf8]
00a9a1e8	bl 0x00c356a0
00a9a1ec	cbz w0,0x00a9a280
00a9a1f0	adrp x23,0xd22000
00a9a1f4	add x23,x23,#0x108
00a9a1f8	ldr x8,[x23, #0x18]
00a9a1fc	cmp x8,x20
00a9a200	b.cc 0x00a9a240
00a9a204	ldp x19,x8,[x23, #0x28]
00a9a208	cmp x8,x20
00a9a20c	lsl x8,x8,#0x1
00a9a210	sub x19,x19,#0x1
00a9a214	b.cc 0x00a9a208
00a9a218	add x8,x19,#0x1
00a9a21c	cmp x8,#0x1
00a9a220	b.lt 0x00a9a240
00a9a224	ldr x8,[x23, #0x20]
00a9a228	mov x20,x19
00a9a22c	ldr x21,[x8, x20, LSL #0x3]
00a9a230	cbnz x21,0x00a9a2a0
00a9a234	cmp x20,#0x0
00a9a238	sub x20,x20,#0x1
00a9a23c	b.gt 0x00a9a22c
00a9a240	mov x20,xzr
00a9a244	mov x8,xzr
00a9a248	adrp x9,0xd22000
00a9a24c	ldr x10,[x9, #0x100]
00a9a250	ldr x0,[x22, #0xf8]
00a9a254	add x8,x10,x8
00a9a258	str x8,[x9, #0x100]
00a9a25c	bl 0x00c35690
00a9a260	b 0x00a9a284
00a9a264	mov x0,x20
00a9a268	ldp x29,x30,[sp, #0x40]
00a9a26c	ldp x20,x19,[sp, #0x30]
00a9a270	ldp x22,x21,[sp, #0x20]
00a9a274	ldp x24,x23,[sp, #0x10]
00a9a278	ldr x25,[sp], #0x50
00a9a27c	b 0x00c32320
00a9a280	mov x20,xzr
00a9a284	mov x0,x20
00a9a288	ldp x29,x30,[sp, #0x40]
00a9a28c	ldp x20,x19,[sp, #0x30]
00a9a290	ldp x22,x21,[sp, #0x20]
00a9a294	ldp x24,x23,[sp, #0x10]
00a9a298	ldr x25,[sp], #0x50
00a9a29c	ret
00a9a2a0	mov w24,#0x1
00a9a2a4	cmp x19,x20
00a9a2a8	b.eq 0x00a9a47c
00a9a2ac	ldr x2,[x23, #0x40]
00a9a2b0	mov x0,x21
00a9a2b4	mov w1,w20
00a9a2b8	bl 0x00a9b18c
00a9a2bc	cbnz w0,0x00a9a5c8
00a9a2c0	ldr x2,[x23, #0x38]
00a9a2c4	mov x0,x21
00a9a2c8	mov w1,w20
00a9a2cc	bl 0x00a9b250
00a9a2d0	ldr x8,[x21]
00a9a2d4	cbz x8,0x00a9a2e0
00a9a2d8	ldr x9,[x21, #0x8]
00a9a2dc	str x9,[x8, #0x8]
00a9a2e0	ldr x9,[x21, #0x8]
00a9a2e4	str x8,[x9]
00a9a2e8	ldr x8,[x21]
00a9a2ec	cbz x8,0x00a9a330
00a9a2f0	ldr x9,[x8, #0x8]
00a9a2f4	ldr x8,[x23, #0x20]
00a9a2f8	cmp x9,x8
00a9a2fc	b.cc 0x00a9a310
00a9a300	ldr x10,[x23, #0x28]
00a9a304	add x10,x8,x10, LSL #0x3
00a9a308	cmp x9,x10
00a9a30c	b.cc 0x00a9a334
00a9a310	ldr x10,[x23, #0x10]
00a9a314	cmp x9,x10
00a9a318	b.cc 0x00a9a5b0
00a9a31c	ldr x11,[x23, #0x18]
00a9a320	add x10,x10,x11
00a9a324	cmp x9,x10
00a9a328	b.cc 0x00a9a334
00a9a32c	b 0x00a9a5b0
00a9a330	ldr x8,[x23, #0x20]
00a9a334	ldr x8,[x8, x20, LSL #0x3]
00a9a338	cmp x21,x8
00a9a33c	b.eq 0x00a9a5e0
00a9a340	ldr x2,[x23, #0x40]
00a9a344	add x20,x20,#0x1
00a9a348	mov x0,x21
00a9a34c	mov w1,w20
00a9a350	bl 0x00a9b18c
00a9a354	cbnz w0,0x00a9a5f8
00a9a358	ldr x2,[x23, #0x38]
00a9a35c	mov x0,x21
00a9a360	mov w1,w20
00a9a364	bl 0x00a9afb8
00a9a368	ldr x8,[x23, #0x20]
00a9a36c	lsl x25,x20,#0x3
00a9a370	mov x1,x21
00a9a374	add x0,x8,x25
00a9a378	bl 0x00a9b0a0
00a9a37c	ldr x8,[x23, #0x20]
00a9a380	ldr x8,[x8, x25#0x0]
00a9a384	cmp x8,x21
00a9a388	b.ne 0x00a9a610
00a9a38c	ldr x8,[x23, #0x18]
00a9a390	ldr x2,[x23, #0x40]
00a9a394	mov w1,w20
00a9a398	lsr x8,x8,x20
00a9a39c	add x21,x21,x8
00a9a3a0	mov x0,x21
00a9a3a4	bl 0x00a9b18c
00a9a3a8	cbnz w0,0x00a9a628
00a9a3ac	ldr x2,[x23, #0x38]
00a9a3b0	mov x0,x21
00a9a3b4	mov w1,w20
00a9a3b8	bl 0x00a9afb8
00a9a3bc	ldr x8,[x23, #0x20]
00a9a3c0	mov x1,x21
00a9a3c4	add x0,x8,x25
00a9a3c8	bl 0x00a9b0a0
00a9a3cc	ldr x8,[x23, #0x20]
00a9a3d0	ldr x9,[x8, x25#0x0]
00a9a3d4	cmp x9,x21
00a9a3d8	b.ne 0x00a9a640
00a9a3dc	ldp x9,x10,[x23, #0x10]
00a9a3e0	and x11,x20,#0xffffffff
00a9a3e4	lsl x12,x24,x11
00a9a3e8	lsr x16,x10,x20
00a9a3ec	sub x13,x21,x9
00a9a3f0	lsr x11,x10,x11
00a9a3f4	ldr x10,[x23, #0x38]
00a9a3f8	udiv x13,x13,x11
00a9a3fc	add x13,x13,x12
00a9a400	lsr x14,x13,#0x3
00a9a404	ldrb w10,[x10, x14]
00a9a408	eor x13,x13,#0x1
00a9a40c	and x15,x13,#0x7
00a9a410	lsl x15,x24,x15
00a9a414	tst x15,x10
00a9a418	sub x10,x21,x16
00a9a41c	b.eq 0x00a9a440
00a9a420	ldr x16,[x23, #0x40]
00a9a424	ldrb w14,[x16, x14]
00a9a428	tst x15,x14
00a9a42c	mov x14,xzr
00a9a430	b.eq 0x00a9a450
00a9a434	cmp x10,x14
00a9a438	b.eq 0x00a9a2a4
00a9a43c	b 0x00a9a464
00a9a440	mov x14,xzr
00a9a444	cmp x10,x14
00a9a448	b.eq 0x00a9a2a4
00a9a44c	b 0x00a9a464
00a9a450	sub x12,x12,#0x1
00a9a454	and x12,x13,x12
00a9a458	madd x14,x12,x11,x9
00a9a45c	cmp x10,x14
00a9a460	b.eq 0x00a9a2a4
00a9a464	adrp x0,0x2ae000
00a9a468	adrp x1,0x2d6000
00a9a46c	add x0,x0,#0x42
00a9a470	add x1,x1,#0xc
00a9a474	mov w2,#0x294
00a9a478	bl 0x00c3c240
00a9a47c	ldr x20,[x8, x19, LSL #0x3]
00a9a480	ldr x2,[x23, #0x38]
00a9a484	mov w1,w19
00a9a488	mov x0,x20
00a9a48c	bl 0x00a9b18c
00a9a490	cbz w0,0x00a9a6a0
00a9a494	ldr x2,[x23, #0x40]
00a9a498	mov x0,x20
00a9a49c	mov w1,w19
00a9a4a0	bl 0x00a9afb8
00a9a4a4	ldr x8,[x20]
00a9a4a8	cbz x8,0x00a9a4b4
00a9a4ac	ldr x9,[x20, #0x8]
00a9a4b0	str x9,[x8, #0x8]
00a9a4b4	ldr x9,[x20, #0x8]
00a9a4b8	str x8,[x9]
00a9a4bc	ldr x8,[x20]
00a9a4c0	cbz x8,0x00a9a500
00a9a4c4	ldr x8,[x8, #0x8]
00a9a4c8	ldr x9,[x23, #0x20]
00a9a4cc	cmp x8,x9
00a9a4d0	b.cc 0x00a9a4e4
00a9a4d4	ldr x10,[x23, #0x28]
00a9a4d8	add x9,x9,x10, LSL #0x3
00a9a4dc	cmp x8,x9
00a9a4e0	b.cc 0x00a9a500
00a9a4e4	ldr x9,[x23, #0x10]
00a9a4e8	cmp x8,x9
00a9a4ec	b.cc 0x00a9a5b0
00a9a4f0	ldr x10,[x23, #0x18]
00a9a4f4	add x9,x9,x10
00a9a4f8	cmp x8,x9
00a9a4fc	b.cs 0x00a9a5b0
00a9a500	ldr x8,[x23, #0x10]
00a9a504	cmp x20,x8
00a9a508	b.cc 0x00a9a670
00a9a50c	ldr x9,[x23, #0x18]
00a9a510	add x8,x8,x9
00a9a514	cmp x20,x8
00a9a518	b.cs 0x00a9a670
00a9a51c	stp xzr,xzr,[x20]
00a9a520	ldr x8,[x23, #0x10]
00a9a524	cmp x8,x20
00a9a528	b.hi 0x00a9a688
00a9a52c	ldr x9,[x23, #0x18]
00a9a530	add x10,x8,x9
00a9a534	cmp x10,x20
00a9a538	b.ls 0x00a9a688
00a9a53c	ldp x11,x10,[x23, #0x28]
00a9a540	add x9,x20,x9
00a9a544	sub x8,x9,x8
00a9a548	cmp x10,x8
00a9a54c	sub x19,x11,#0x1
00a9a550	b.ls 0x00a9a55c
00a9a554	ldr x2,[x23, #0x38]
00a9a558	b 0x00a9a590
00a9a55c	ldr x2,[x23, #0x38]
00a9a560	udiv x8,x8,x10
00a9a564	mov w9,#0x1
00a9a568	lsr x10,x8,#0x3
00a9a56c	ldrb w10,[x2, x10]
00a9a570	and x11,x8,#0x7
00a9a574	lsl x11,x9,x11
00a9a578	tst x11,x10
00a9a57c	b.ne 0x00a9a590
00a9a580	tbnz w8,#0x0,0x00a9a658
00a9a584	lsr x8,x8,#0x1
00a9a588	sub x19,x19,#0x1
00a9a58c	cbnz x8,0x00a9a568
00a9a590	mov x0,x20
00a9a594	mov w1,w19
00a9a598	bl 0x00a9b18c
00a9a59c	cbz w0,0x00a9a6b8
00a9a5a0	ldr x8,[x23, #0x18]
00a9a5a4	and x9,x19,#0xffffffff
00a9a5a8	lsr x8,x8,x9
00a9a5ac	b 0x00a9a248
00a9a5b0	adrp x0,0x2c5000
00a9a5b4	adrp x1,0x2d6000
00a9a5b8	add x0,x0,#0xd24
00a9a5bc	add x1,x1,#0xc
00a9a5c0	mov w2,#0x196
00a9a5c4	bl 0x00c3c240
00a9a5c8	adrp x0,0x2d1000
00a9a5cc	adrp x1,0x2d6000
00a9a5d0	add x0,x0,#0xd9b
00a9a5d4	add x1,x1,#0xc
00a9a5d8	mov w2,#0x27f
00a9a5dc	bl 0x00c3c240
00a9a5e0	adrp x0,0x2dc000
00a9a5e4	adrp x1,0x2d6000
00a9a5e8	add x0,x0,#0x374
00a9a5ec	add x1,x1,#0xc
00a9a5f0	mov w2,#0x282
00a9a5f4	bl 0x00c3c240
00a9a5f8	adrp x0,0x2d1000
00a9a5fc	adrp x1,0x2d6000
00a9a600	add x0,x0,#0xd9b
00a9a604	add x1,x1,#0xc
00a9a608	mov w2,#0x288
00a9a60c	bl 0x00c3c240
00a9a610	adrp x0,0x2c9000
00a9a614	adrp x1,0x2d6000
00a9a618	add x0,x0,#0xd4f
00a9a61c	add x1,x1,#0xc
00a9a620	mov w2,#0x28b
00a9a624	bl 0x00c3c240
00a9a628	adrp x0,0x2d1000
00a9a62c	adrp x1,0x2d6000
00a9a630	add x0,x0,#0xd9b
00a9a634	add x1,x1,#0xc
00a9a638	mov w2,#0x28f
00a9a63c	bl 0x00c3c240
00a9a640	adrp x0,0x2c9000
00a9a644	adrp x1,0x2d6000
00a9a648	add x0,x0,#0xd4f
00a9a64c	add x1,x1,#0xc
00a9a650	mov w2,#0x292
00a9a654	bl 0x00c3c240
00a9a658	adrp x0,0x2a4000
00a9a65c	adrp x1,0x2d6000
00a9a660	add x0,x0,#0x3f8
00a9a664	add x1,x1,#0xc
00a9a668	mov w2,#0x14c
00a9a66c	bl 0x00c3c240
00a9a670	adrp x0,0x2bb000
00a9a674	adrp x1,0x2d6000
00a9a678	add x0,x0,#0xf3f
00a9a67c	add x1,x1,#0xc
00a9a680	mov w2,#0x29d
00a9a684	bl 0x00c3c240
00a9a688	adrp x0,0x29e000
00a9a68c	adrp x1,0x2d6000
00a9a690	add x0,x0,#0x41c
00a9a694	add x1,x1,#0xc
00a9a698	mov w2,#0x2d2
00a9a69c	bl 0x00c3c240
00a9a6a0	adrp x0,0x2da000
00a9a6a4	adrp x1,0x2d6000
00a9a6a8	add x0,x0,#0x8f
00a9a6ac	add x1,x1,#0xc
00a9a6b0	mov w2,#0x299
00a9a6b4	bl 0x00c3c240
00a9a6b8	adrp x0,0x2ac000
00a9a6bc	adrp x1,0x2d6000
00a9a6c0	add x0,x0,#0x398
00a9a6c4	add x1,x1,#0xc
00a9a6c8	mov w2,#0x2d6
00a9a6cc	bl 0x00c3c240
