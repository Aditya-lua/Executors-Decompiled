; ossl_ec_GFp_simple_add @ 00a3a004
00a3a004	sub sp,sp,#0xa0
00a3a008	stp x28,x27,[sp, #0x40]
00a3a00c	stp x22,x21,[sp, #0x70]
00a3a010	stp x20,x19,[sp, #0x80]
00a3a014	mov x19,x4
00a3a018	mov x28,x2
00a3a01c	mov x21,x1
00a3a020	cmp x2,x3
00a3a024	mov x22,x0
00a3a028	stp x26,x25,[sp, #0x50]
00a3a02c	stp x24,x23,[sp, #0x60]
00a3a030	stp x29,x30,[sp, #0x90]
00a3a034	add x29,sp,#0x90
00a3a038	b.eq 0x00a3a05c
00a3a03c	mov x0,x22
00a3a040	mov x1,x28
00a3a044	mov x26,x3
00a3a048	bl 0x00c3ae10
00a3a04c	cbz w0,0x00a3a08c
00a3a050	mov x0,x21
00a3a054	mov x1,x26
00a3a058	b 0x00a3a0a4
00a3a05c	mov x0,x22
00a3a060	mov x1,x21
00a3a064	mov x2,x28
00a3a068	mov x3,x19
00a3a06c	ldp x29,x30,[sp, #0x90]
00a3a070	ldp x20,x19,[sp, #0x80]
00a3a074	ldp x22,x21,[sp, #0x70]
00a3a078	ldp x24,x23,[sp, #0x60]
00a3a07c	ldp x26,x25,[sp, #0x50]
00a3a080	ldp x28,x27,[sp, #0x40]
00a3a084	add sp,sp,#0xa0
00a3a088	b 0x00c3b060
00a3a08c	mov x0,x22
00a3a090	mov x1,x26
00a3a094	bl 0x00c3ae10
00a3a098	cbz w0,0x00a3a0c4
00a3a09c	mov x0,x21
00a3a0a0	mov x1,x28
00a3a0a4	ldp x29,x30,[sp, #0x90]
00a3a0a8	ldp x20,x19,[sp, #0x80]
00a3a0ac	ldp x22,x21,[sp, #0x70]
00a3a0b0	ldp x24,x23,[sp, #0x60]
00a3a0b4	ldp x26,x25,[sp, #0x50]
00a3a0b8	ldp x28,x27,[sp, #0x40]
00a3a0bc	add sp,sp,#0xa0
00a3a0c0	b 0x00c3acc0
00a3a0c4	ldr x8,[x22]
00a3a0c8	ldr x24,[x22, #0x40]
00a3a0cc	mov x20,xzr
00a3a0d0	ldp x25,x23,[x8, #0xf8]
00a3a0d4	cbnz x19,0x00a3a0ec
00a3a0d8	ldr x0,[x22, #0xa8]
00a3a0dc	bl 0x00c38a60
00a3a0e0	mov x20,x0
00a3a0e4	mov x19,x0
00a3a0e8	cbz x0,0x00a3a284
00a3a0ec	mov x0,x19
00a3a0f0	str x24,[sp, #0x10]
00a3a0f4	bl 0x00c38a90
00a3a0f8	mov x0,x19
00a3a0fc	bl 0x00c38a40
00a3a100	mov x24,x0
00a3a104	mov x0,x19
00a3a108	bl 0x00c38a40
00a3a10c	str x0,[sp, #0x38]
00a3a110	mov x0,x19
00a3a114	bl 0x00c38a40
00a3a118	str x0,[sp, #0x30]
00a3a11c	mov x0,x19
00a3a120	bl 0x00c38a40
00a3a124	str x0,[sp, #0x28]
00a3a128	mov x0,x19
00a3a12c	bl 0x00c38a40
00a3a130	str x0,[sp, #0x20]
00a3a134	mov x0,x19
00a3a138	bl 0x00c38a40
00a3a13c	str x0,[sp, #0x18]
00a3a140	mov x0,x19
00a3a144	bl 0x00c38a40
00a3a148	cbz x0,0x00a3a504
00a3a14c	ldr w8,[x26, #0x28]
00a3a150	mov x27,x0
00a3a154	cbz w8,0x00a3a214
00a3a158	ldr x1,[x28, #0x10]
00a3a15c	ldr x0,[sp, #0x38]
00a3a160	bl 0x00c36990
00a3a164	cbz x0,0x00a3a504
00a3a168	ldr x1,[x28, #0x18]
00a3a16c	ldr x0,[sp, #0x30]
00a3a170	bl 0x00c36990
00a3a174	cbz x0,0x00a3a504
00a3a178	ldr w8,[x28, #0x28]
00a3a17c	cbz w8,0x00a3a28c
00a3a180	ldr x1,[x26, #0x10]
00a3a184	ldr x0,[sp, #0x28]
00a3a188	bl 0x00c36990
00a3a18c	cbz x0,0x00a3a504
00a3a190	ldr x1,[x26, #0x18]
00a3a194	ldr x0,[sp, #0x20]
00a3a198	bl 0x00c36990
00a3a19c	cbz x0,0x00a3a504
00a3a1a0	str x25,[sp, #0x8]
00a3a1a4	ldp x25,x0,[sp, #0x10]
00a3a1a8	ldr x1,[sp, #0x38]
00a3a1ac	ldr x2,[sp, #0x28]
00a3a1b0	mov x3,x25
00a3a1b4	bl 0x00c38f20
00a3a1b8	cbz w0,0x00a3a504
00a3a1bc	ldr x1,[sp, #0x30]
00a3a1c0	ldr x2,[sp, #0x20]
00a3a1c4	mov x0,x27
00a3a1c8	mov x3,x25
00a3a1cc	bl 0x00c38f20
00a3a1d0	cbz w0,0x00a3a504
00a3a1d4	ldr x0,[sp, #0x18]
00a3a1d8	bl 0x00c369b0
00a3a1dc	cbz w0,0x00a3a2fc
00a3a1e0	mov x0,x27
00a3a1e4	bl 0x00c369b0
00a3a1e8	cbz w0,0x00a3a354
00a3a1ec	mov x0,x19
00a3a1f0	bl 0x00c38a20
00a3a1f4	mov x0,x22
00a3a1f8	mov x1,x21
00a3a1fc	mov x2,x28
00a3a200	mov x3,x19
00a3a204	bl 0x00c3b060
00a3a208	mov w21,w0
00a3a20c	mov x19,xzr
00a3a210	b 0x00a3a508
00a3a214	ldr x2,[x26, #0x20]
00a3a218	mov x0,x22
00a3a21c	mov x1,x24
00a3a220	mov x3,x19
00a3a224	blr x23
00a3a228	cbz w0,0x00a3a504
00a3a22c	ldr x2,[x28, #0x10]
00a3a230	ldr x1,[sp, #0x38]
00a3a234	mov x0,x22
00a3a238	mov x3,x24
00a3a23c	mov x4,x19
00a3a240	blr x25
00a3a244	cbz w0,0x00a3a504
00a3a248	ldr x3,[x26, #0x20]
00a3a24c	mov x0,x22
00a3a250	mov x1,x24
00a3a254	mov x2,x24
00a3a258	mov x4,x19
00a3a25c	blr x25
00a3a260	cbz w0,0x00a3a504
00a3a264	ldr x2,[x28, #0x18]
00a3a268	ldr x1,[sp, #0x30]
00a3a26c	mov x0,x22
00a3a270	mov x3,x24
00a3a274	mov x4,x19
00a3a278	blr x25
00a3a27c	cbnz w0,0x00a3a178
00a3a280	b 0x00a3a504
00a3a284	mov w21,wzr
00a3a288	b 0x00a3a518
00a3a28c	ldr x2,[x28, #0x20]
00a3a290	mov x0,x22
00a3a294	mov x1,x24
00a3a298	mov x3,x19
00a3a29c	blr x23
00a3a2a0	cbz w0,0x00a3a504
00a3a2a4	ldr x2,[x26, #0x10]
00a3a2a8	ldr x1,[sp, #0x28]
00a3a2ac	mov x0,x22
00a3a2b0	mov x3,x24
00a3a2b4	mov x4,x19
00a3a2b8	blr x25
00a3a2bc	cbz w0,0x00a3a504
00a3a2c0	ldr x3,[x28, #0x20]
00a3a2c4	mov x0,x22
00a3a2c8	mov x1,x24
00a3a2cc	mov x2,x24
00a3a2d0	mov x4,x19
00a3a2d4	blr x25
00a3a2d8	cbz w0,0x00a3a504
00a3a2dc	ldr x2,[x26, #0x18]
00a3a2e0	ldr x1,[sp, #0x20]
00a3a2e4	mov x0,x22
00a3a2e8	mov x3,x24
00a3a2ec	mov x4,x19
00a3a2f0	blr x25
00a3a2f4	cbnz w0,0x00a3a1a0
00a3a2f8	b 0x00a3a504
00a3a2fc	ldr x0,[sp, #0x38]
00a3a300	ldr x25,[sp, #0x10]
00a3a304	ldr x2,[sp, #0x28]
00a3a308	mov x1,x0
00a3a30c	mov x3,x25
00a3a310	bl 0x00c38ec0
00a3a314	cbz w0,0x00a3a504
00a3a318	ldr x0,[sp, #0x30]
00a3a31c	ldr x2,[sp, #0x20]
00a3a320	mov x3,x25
00a3a324	mov x1,x0
00a3a328	bl 0x00c38ec0
00a3a32c	cbz w0,0x00a3a504
00a3a330	ldr w9,[x28, #0x28]
00a3a334	ldr w8,[x26, #0x28]
00a3a338	cbz w9,0x00a3a368
00a3a33c	cbz w8,0x00a3a37c
00a3a340	ldr x0,[x21, #0x20]
00a3a344	ldr x1,[sp, #0x18]
00a3a348	bl 0x00c36990
00a3a34c	cbnz x0,0x00a3a3cc
00a3a350	b 0x00a3a504
00a3a354	ldr x0,[x21, #0x20]
00a3a358	bl 0x00c38e00
00a3a35c	str wzr,[x21, #0x28]
00a3a360	mov w21,#0x1
00a3a364	b 0x00a3a508
00a3a368	ldr x2,[x28, #0x20]
00a3a36c	cbz w8,0x00a3a394
00a3a370	mov x0,x24
00a3a374	mov x1,x2
00a3a378	b 0x00a3a384
00a3a37c	ldr x1,[x26, #0x20]
00a3a380	mov x0,x24
00a3a384	bl 0x00c36990
00a3a388	ldr x25,[sp, #0x8]
00a3a38c	cbnz x0,0x00a3a3b0
00a3a390	b 0x00a3a504
00a3a394	ldr x3,[x26, #0x20]
00a3a398	ldr x25,[sp, #0x8]
00a3a39c	mov x0,x22
00a3a3a0	mov x1,x24
00a3a3a4	mov x4,x19
00a3a3a8	blr x25
00a3a3ac	cbz w0,0x00a3a504
00a3a3b0	ldr x1,[x21, #0x20]
00a3a3b4	ldr x3,[sp, #0x18]
00a3a3b8	mov x0,x22
00a3a3bc	mov x2,x24
00a3a3c0	mov x4,x19
00a3a3c4	blr x25
00a3a3c8	cbz w0,0x00a3a504
00a3a3cc	mov x0,x22
00a3a3d0	mov x1,x24
00a3a3d4	mov x2,x27
00a3a3d8	mov x3,x19
00a3a3dc	str wzr,[x21, #0x28]
00a3a3e0	blr x23
00a3a3e4	cbz w0,0x00a3a504
00a3a3e8	ldp x2,x1,[sp, #0x18]
00a3a3ec	mov x0,x22
00a3a3f0	mov x3,x19
00a3a3f4	blr x23
00a3a3f8	cbz w0,0x00a3a504
00a3a3fc	ldp x3,x1,[sp, #0x20]
00a3a400	ldr x2,[sp, #0x38]
00a3a404	ldr x8,[sp, #0x8]
00a3a408	mov x0,x22
00a3a40c	mov x4,x19
00a3a410	blr x8
00a3a414	cbz w0,0x00a3a504
00a3a418	ldr x0,[x21, #0x10]
00a3a41c	ldr x2,[sp, #0x28]
00a3a420	ldr x3,[sp, #0x10]
00a3a424	mov x1,x24
00a3a428	bl 0x00c38f20
00a3a42c	cbz w0,0x00a3a504
00a3a430	ldr x1,[x21, #0x10]
00a3a434	ldr x2,[sp, #0x10]
00a3a438	mov x0,x24
00a3a43c	bl 0x00c38ed0
00a3a440	cbz w0,0x00a3a504
00a3a444	ldr x1,[sp, #0x28]
00a3a448	ldr x3,[sp, #0x10]
00a3a44c	mov x0,x24
00a3a450	mov x2,x24
00a3a454	bl 0x00c38f20
00a3a458	cbz w0,0x00a3a504
00a3a45c	ldr x8,[sp, #0x8]
00a3a460	mov x0,x22
00a3a464	mov x1,x24
00a3a468	mov x2,x24
00a3a46c	mov x3,x27
00a3a470	mov x4,x19
00a3a474	blr x8
00a3a478	cbz w0,0x00a3a504
00a3a47c	ldp x1,x2,[sp, #0x18]
00a3a480	ldr x8,[sp, #0x8]
00a3a484	mov x0,x22
00a3a488	mov x4,x19
00a3a48c	mov x3,x1
00a3a490	blr x8
00a3a494	cbz w0,0x00a3a504
00a3a498	ldp x2,x1,[sp, #0x30]
00a3a49c	ldr x3,[sp, #0x18]
00a3a4a0	ldr x8,[sp, #0x8]
00a3a4a4	mov x0,x22
00a3a4a8	mov x4,x19
00a3a4ac	blr x8
00a3a4b0	cbz w0,0x00a3a504
00a3a4b4	ldr x2,[sp, #0x38]
00a3a4b8	ldr x3,[sp, #0x10]
00a3a4bc	mov x0,x24
00a3a4c0	mov x1,x24
00a3a4c4	bl 0x00c38f20
00a3a4c8	cbz w0,0x00a3a504
00a3a4cc	mov x0,x24
00a3a4d0	bl 0x00c38d10
00a3a4d4	cbz w0,0x00a3a4ec
00a3a4d8	ldr x2,[sp, #0x10]
00a3a4dc	mov x0,x24
00a3a4e0	mov x1,x24
00a3a4e4	bl 0x00c38870
00a3a4e8	cbz w0,0x00a3a504
00a3a4ec	ldr x0,[x21, #0x18]
00a3a4f0	mov x1,x24
00a3a4f4	bl 0x00c39080
00a3a4f8	cmp w0,#0x0
00a3a4fc	cset w21,ne
00a3a500	b 0x00a3a508
00a3a504	mov w21,wzr
00a3a508	mov x0,x19
00a3a50c	bl 0x00c38a20
00a3a510	mov x0,x20
00a3a514	bl 0x00c38a30
00a3a518	mov w0,w21
00a3a51c	ldp x29,x30,[sp, #0x90]
00a3a520	ldp x20,x19,[sp, #0x80]
00a3a524	ldp x22,x21,[sp, #0x70]
00a3a528	ldp x24,x23,[sp, #0x60]
00a3a52c	ldp x26,x25,[sp, #0x50]
00a3a530	ldp x28,x27,[sp, #0x40]
00a3a534	add sp,sp,#0xa0
00a3a538	ret
