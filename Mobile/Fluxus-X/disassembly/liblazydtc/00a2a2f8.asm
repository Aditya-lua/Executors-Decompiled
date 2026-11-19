; ossl_ec_GF2m_simple_add @ 00a2a2f8
00a2a2f8	sub sp,sp,#0x80
00a2a2fc	stp x22,x21,[sp, #0x50]
00a2a300	mov x21,x1
00a2a304	mov x1,x2
00a2a308	stp x28,x27,[sp, #0x20]
00a2a30c	stp x26,x25,[sp, #0x30]
00a2a310	stp x24,x23,[sp, #0x40]
00a2a314	stp x20,x19,[sp, #0x60]
00a2a318	stp x29,x30,[sp, #0x70]
00a2a31c	add x29,sp,#0x70
00a2a320	mov x19,x4
00a2a324	mov x25,x3
00a2a328	mov x24,x2
00a2a32c	mov x22,x0
00a2a330	bl 0x00c3ae10
00a2a334	cbz w0,0x00a2a344
00a2a338	mov x0,x21
00a2a33c	mov x1,x25
00a2a340	b 0x00a2a35c
00a2a344	mov x0,x22
00a2a348	mov x1,x25
00a2a34c	bl 0x00c3ae10
00a2a350	cbz w0,0x00a2a38c
00a2a354	mov x0,x21
00a2a358	mov x1,x24
00a2a35c	bl 0x00c3acc0
00a2a360	cmp w0,#0x0
00a2a364	cset w21,ne
00a2a368	mov w0,w21
00a2a36c	ldp x29,x30,[sp, #0x70]
00a2a370	ldp x20,x19,[sp, #0x60]
00a2a374	ldp x22,x21,[sp, #0x50]
00a2a378	ldp x24,x23,[sp, #0x40]
00a2a37c	ldp x26,x25,[sp, #0x30]
00a2a380	ldp x28,x27,[sp, #0x20]
00a2a384	add sp,sp,#0x80
00a2a388	ret
00a2a38c	mov x8,xzr
00a2a390	cbnz x19,0x00a2a3a4
00a2a394	bl 0x00c38a50
00a2a398	mov x19,x0
00a2a39c	mov x8,x0
00a2a3a0	cbz x0,0x00a2a490
00a2a3a4	mov x0,x19
00a2a3a8	str x8,[sp, #0x18]
00a2a3ac	bl 0x00c38a90
00a2a3b0	mov x0,x19
00a2a3b4	bl 0x00c38a40
00a2a3b8	mov x27,x0
00a2a3bc	mov x0,x19
00a2a3c0	bl 0x00c38a40
00a2a3c4	mov x23,x0
00a2a3c8	mov x0,x19
00a2a3cc	bl 0x00c38a40
00a2a3d0	str x0,[sp, #0x10]
00a2a3d4	mov x0,x19
00a2a3d8	bl 0x00c38a40
00a2a3dc	mov x20,x0
00a2a3e0	mov x0,x19
00a2a3e4	bl 0x00c38a40
00a2a3e8	str x0,[sp, #0x8]
00a2a3ec	mov x0,x19
00a2a3f0	bl 0x00c38a40
00a2a3f4	str x0,[sp]
00a2a3f8	mov x0,x19
00a2a3fc	bl 0x00c38a40
00a2a400	mov x26,x0
00a2a404	mov x0,x19
00a2a408	bl 0x00c38a40
00a2a40c	cbz x0,0x00a2a6b0
00a2a410	ldr w8,[x24, #0x28]
00a2a414	mov x28,x0
00a2a418	cbz w8,0x00a2a440
00a2a41c	ldr x1,[x24, #0x10]
00a2a420	mov x0,x27
00a2a424	bl 0x00c36990
00a2a428	cbz x0,0x00a2a6b0
00a2a42c	ldr x1,[x24, #0x18]
00a2a430	mov x0,x23
00a2a434	bl 0x00c36990
00a2a438	cbnz x0,0x00a2a45c
00a2a43c	b 0x00a2a6b0
00a2a440	mov x0,x22
00a2a444	mov x1,x24
00a2a448	mov x2,x27
00a2a44c	mov x3,x23
00a2a450	mov x4,x19
00a2a454	bl 0x00c3ae70
00a2a458	cbz w0,0x00a2a6b0
00a2a45c	ldr w8,[x25, #0x28]
00a2a460	cbz w8,0x00a2a498
00a2a464	ldr x1,[x25, #0x10]
00a2a468	ldr x0,[sp, #0x10]
00a2a46c	bl 0x00c36990
00a2a470	cbz x0,0x00a2a6b0
00a2a474	ldr x1,[x25, #0x18]
00a2a478	mov x0,x20
00a2a47c	mov x24,x20
00a2a480	bl 0x00c36990
00a2a484	ldr x25,[sp, #0x10]
00a2a488	cbnz x0,0x00a2a4bc
00a2a48c	b 0x00a2a6b0
00a2a490	mov w21,wzr
00a2a494	b 0x00a2a368
00a2a498	mov x1,x25
00a2a49c	ldr x25,[sp, #0x10]
00a2a4a0	mov x0,x22
00a2a4a4	mov x3,x20
00a2a4a8	mov x4,x19
00a2a4ac	mov x2,x25
00a2a4b0	mov x24,x20
00a2a4b4	bl 0x00c3ae70
00a2a4b8	cbz w0,0x00a2a6b0
00a2a4bc	mov x0,x27
00a2a4c0	mov x1,x25
00a2a4c4	bl 0x00c369c0
00a2a4c8	cbz w0,0x00a2a5f8
00a2a4cc	mov x0,x28
00a2a4d0	mov x1,x27
00a2a4d4	mov x2,x25
00a2a4d8	bl 0x00c38b40
00a2a4dc	cbz w0,0x00a2a6b0
00a2a4e0	mov x0,x26
00a2a4e4	mov x1,x23
00a2a4e8	mov x2,x24
00a2a4ec	bl 0x00c38b40
00a2a4f0	cbz w0,0x00a2a6b0
00a2a4f4	ldr x8,[x22]
00a2a4f8	mov x0,x22
00a2a4fc	mov x1,x26
00a2a500	mov x2,x26
00a2a504	ldr x8,[x8, #0x108]
00a2a508	mov x3,x28
00a2a50c	mov x4,x19
00a2a510	blr x8
00a2a514	cbz w0,0x00a2a6b0
00a2a518	ldr x8,[x22]
00a2a51c	ldr x23,[sp, #0x8]
00a2a520	mov x0,x22
00a2a524	mov x2,x26
00a2a528	ldr x8,[x8, #0x100]
00a2a52c	mov x1,x23
00a2a530	mov x3,x19
00a2a534	blr x8
00a2a538	cbz w0,0x00a2a6b0
00a2a53c	ldr x2,[x22, #0x60]
00a2a540	mov x0,x23
00a2a544	mov x1,x23
00a2a548	bl 0x00c38b40
00a2a54c	cbz w0,0x00a2a6b0
00a2a550	mov x0,x23
00a2a554	mov x1,x23
00a2a558	mov x2,x26
00a2a55c	bl 0x00c38b40
00a2a560	cbz w0,0x00a2a6b0
00a2a564	mov x0,x23
00a2a568	mov x1,x23
00a2a56c	mov x2,x28
00a2a570	bl 0x00c38b40
00a2a574	cbz w0,0x00a2a6b0
00a2a578	ldr x20,[sp]
00a2a57c	ldr x1,[sp, #0x10]
00a2a580	mov x2,x23
00a2a584	mov x0,x20
00a2a588	bl 0x00c38b40
00a2a58c	cbz w0,0x00a2a6b0
00a2a590	ldr x8,[x22]
00a2a594	mov x0,x22
00a2a598	mov x1,x20
00a2a59c	mov x2,x20
00a2a5a0	ldr x8,[x8, #0xf8]
00a2a5a4	mov x3,x26
00a2a5a8	mov x4,x19
00a2a5ac	blr x8
00a2a5b0	cbz w0,0x00a2a6b0
00a2a5b4	mov x0,x20
00a2a5b8	mov x1,x20
00a2a5bc	mov x2,x23
00a2a5c0	bl 0x00c38b40
00a2a5c4	cbz w0,0x00a2a6b0
00a2a5c8	mov x0,x20
00a2a5cc	mov x1,x20
00a2a5d0	mov x2,x24
00a2a5d4	bl 0x00c38b40
00a2a5d8	cbz w0,0x00a2a6b0
00a2a5dc	mov x0,x22
00a2a5e0	mov x1,x21
00a2a5e4	mov x2,x23
00a2a5e8	mov x3,x20
00a2a5ec	mov x4,x19
00a2a5f0	bl 0x00c3ae80
00a2a5f4	b 0x00a2a620
00a2a5f8	mov x0,x23
00a2a5fc	mov x1,x24
00a2a600	bl 0x00c369c0
00a2a604	cbnz w0,0x00a2a614
00a2a608	mov x0,x25
00a2a60c	bl 0x00c369b0
00a2a610	cbz w0,0x00a2a62c
00a2a614	mov x0,x22
00a2a618	mov x1,x21
00a2a61c	bl 0x00c3af10
00a2a620	cmp w0,#0x0
00a2a624	cset w21,ne
00a2a628	b 0x00a2a6b4
00a2a62c	ldr x8,[x22]
00a2a630	mov x0,x22
00a2a634	mov x1,x26
00a2a638	mov x2,x24
00a2a63c	ldr x8,[x8, #0x108]
00a2a640	mov x3,x25
00a2a644	mov x4,x19
00a2a648	blr x8
00a2a64c	cbz w0,0x00a2a6b0
00a2a650	mov x0,x26
00a2a654	mov x1,x26
00a2a658	mov x2,x25
00a2a65c	bl 0x00c38b40
00a2a660	cbz w0,0x00a2a6b0
00a2a664	ldr x8,[x22]
00a2a668	ldr x23,[sp, #0x8]
00a2a66c	mov x0,x22
00a2a670	mov x2,x26
00a2a674	ldr x8,[x8, #0x100]
00a2a678	mov x1,x23
00a2a67c	mov x3,x19
00a2a680	blr x8
00a2a684	cbz w0,0x00a2a6b0
00a2a688	mov x0,x23
00a2a68c	mov x1,x23
00a2a690	mov x2,x26
00a2a694	bl 0x00c38b40
00a2a698	cbz w0,0x00a2a6b0
00a2a69c	ldr x2,[x22, #0x60]
00a2a6a0	mov x0,x23
00a2a6a4	mov x1,x23
00a2a6a8	bl 0x00c38b40
00a2a6ac	cbnz w0,0x00a2a578
00a2a6b0	mov w21,wzr
00a2a6b4	ldr x20,[sp, #0x18]
00a2a6b8	mov x0,x19
00a2a6bc	bl 0x00c38a20
00a2a6c0	mov x0,x20
00a2a6c4	bl 0x00c38a30
00a2a6c8	b 0x00a2a368
