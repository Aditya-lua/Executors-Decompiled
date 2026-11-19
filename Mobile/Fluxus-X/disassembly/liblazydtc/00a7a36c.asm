; FUN_00a7a36c @ 00a7a36c
00a7a36c	stp x22,x21,[sp, #-0x30]!
00a7a370	stp x20,x19,[sp, #0x10]
00a7a374	stp x29,x30,[sp, #0x20]
00a7a378	ldr x22,[x0, #0x98]
00a7a37c	orr w8,wzr,#0xffffefff
00a7a380	add w8,w1,w8
00a7a384	mov x19,x3
00a7a388	cmp w8,#0x9
00a7a38c	mov w20,w2
00a7a390	add x29,sp,#0x20
00a7a394	b.hi 0x00a7a3cc
00a7a398	adrp x9,0x766000
00a7a39c	add x9,x9,#0x970
00a7a3a0	ldrsw x8,[x9, x8, LSL #0x2]
00a7a3a4	add x8,x8,x9
00a7a3a8	br x8
00a7a3ac	mov w0,w20
00a7a3b0	bl 0x00c3aac0
00a7a3b4	cbz x0,0x00a7a5e4
00a7a3b8	mov x19,x0
00a7a3bc	ldr x0,[x22]
00a7a3c0	bl 0x00c3a770
00a7a3c4	str x19,[x22]
00a7a3c8	b 0x00a7a65c
00a7a3cc	cmp w1,#0xd
00a7a3d0	b.hi 0x00a7a5dc
00a7a3d4	mov w8,#0x1
00a7a3d8	lsl w8,w8,w1
00a7a3dc	mov w9,#0x8a4
00a7a3e0	tst w8,w9
00a7a3e4	b.ne 0x00a7a65c
00a7a3e8	cmp w1,#0x1
00a7a3ec	b.eq 0x00a7a4c0
00a7a3f0	cmp w1,#0xd
00a7a3f4	b.ne 0x00a7a5dc
00a7a3f8	ldr x8,[x22, #0x8]
00a7a3fc	b 0x00a7a47c
00a7a400	ldr x0,[x22]
00a7a404	cbz x0,0x00a7a60c
00a7a408	mov w1,w20
00a7a40c	bl 0x00c3aaf0
00a7a410	b 0x00a7a65c
00a7a414	mov x21,x0
00a7a418	cmn w20,#0x2
00a7a41c	b.ne 0x00a7a578
00a7a420	ldrsb w0,[x22, #0x18]
00a7a424	cmn w0,#0x1
00a7a428	b.ne 0x00a7a660
00a7a42c	ldr x0,[x21, #0x88]
00a7a430	bl 0x00c3a8b0
00a7a434	bl 0x00c3a810
00a7a438	ubfx w0,w0,#0xc,#0x1
00a7a43c	b 0x00a7a660
00a7a440	cmn w20,#0x2
00a7a444	b.ne 0x00a7a5d0
00a7a448	ldrb w0,[x22, #0x19]
00a7a44c	b 0x00a7a660
00a7a450	str x19,[x22, #0x20]
00a7a454	b 0x00a7a65c
00a7a458	ldr x8,[x22, #0x38]
00a7a45c	mov w0,#0x1
00a7a460	str w8,[x19]
00a7a464	b 0x00a7a660
00a7a468	ldr x8,[x22, #0x28]
00a7a46c	str x8,[x19]
00a7a470	ldr w0,[x22, #0x30]
00a7a474	b 0x00a7a660
00a7a478	ldr x8,[x22, #0x20]
00a7a47c	str x8,[x19]
00a7a480	b 0x00a7a65c
00a7a484	cmp w20,#0x1
00a7a488	b.lt 0x00a7a5dc
00a7a48c	sxtw x8,w20
00a7a490	str x8,[x22, #0x38]
00a7a494	b 0x00a7a65c
00a7a498	ldr x0,[x22, #0x28]
00a7a49c	adrp x1,0x2c1000
00a7a4a0	add x1,x1,#0xd1f
00a7a4a4	mov w2,#0x159
00a7a4a8	bl 0x00c32310
00a7a4ac	str x19,[x22, #0x28]
00a7a4b0	cbz x19,0x00a7a640
00a7a4b4	sxtw x8,w20
00a7a4b8	str x8,[x22, #0x30]
00a7a4bc	b 0x00a7a65c
00a7a4c0	mov x0,x19
00a7a4c4	bl 0x00c34c30
00a7a4c8	cmp w0,#0x40
00a7a4cc	b.eq 0x00a7a570
00a7a4d0	mov x0,x19
00a7a4d4	bl 0x00c34c30
00a7a4d8	cmp w0,#0x1a0
00a7a4dc	b.eq 0x00a7a570
00a7a4e0	mov x0,x19
00a7a4e4	bl 0x00c34c30
00a7a4e8	cmp w0,#0x2a3
00a7a4ec	b.eq 0x00a7a570
00a7a4f0	mov x0,x19
00a7a4f4	bl 0x00c34c30
00a7a4f8	cmp w0,#0x2a0
00a7a4fc	b.eq 0x00a7a570
00a7a500	mov x0,x19
00a7a504	bl 0x00c34c30
00a7a508	cmp w0,#0x2a1
00a7a50c	b.eq 0x00a7a570
00a7a510	mov x0,x19
00a7a514	bl 0x00c34c30
00a7a518	cmp w0,#0x2a2
00a7a51c	b.eq 0x00a7a570
00a7a520	mov x0,x19
00a7a524	bl 0x00c34c30
00a7a528	cmp w0,#0x448
00a7a52c	b.eq 0x00a7a570
00a7a530	mov x0,x19
00a7a534	bl 0x00c34c30
00a7a538	cmp w0,#0x449
00a7a53c	b.eq 0x00a7a570
00a7a540	mov x0,x19
00a7a544	bl 0x00c34c30
00a7a548	cmp w0,#0x44a
00a7a54c	b.eq 0x00a7a570
00a7a550	mov x0,x19
00a7a554	bl 0x00c34c30
00a7a558	cmp w0,#0x44b
00a7a55c	b.eq 0x00a7a570
00a7a560	mov x0,x19
00a7a564	bl 0x00c34c30
00a7a568	cmp w0,#0x477
00a7a56c	b.ne 0x00a7a6bc
00a7a570	str x19,[x22, #0x8]
00a7a574	b 0x00a7a65c
00a7a578	add w8,w20,#0x1
00a7a57c	cmp w8,#0x2
00a7a580	b.hi 0x00a7a5dc
00a7a584	cmn w20,#0x1
00a7a588	strb w20,[x22, #0x18]
00a7a58c	b.eq 0x00a7a650
00a7a590	ldr x0,[x21, #0x88]
00a7a594	bl 0x00c3a8b0
00a7a598	ldr x8,[x21, #0x88]
00a7a59c	ldr x8,[x8, #0x60]
00a7a5a0	cbz x8,0x00a7a670
00a7a5a4	bl 0x00c342a0
00a7a5a8	adrp x0,0x2c1000
00a7a5ac	adrp x2,0x2c9000
00a7a5b0	add x0,x0,#0xd1f
00a7a5b4	add x2,x2,#0xa5b
00a7a5b8	mov w1,#0x126
00a7a5bc	bl 0x00c342b0
00a7a5c0	mov w1,#0x10c
00a7a5c4	mov w0,#0x10
00a7a5c8	movk w1,#0x8, LSL #16
00a7a5cc	b 0x00a7a630
00a7a5d0	sub w8,w20,#0x1
00a7a5d4	cmp w8,#0x1
00a7a5d8	b.ls 0x00a7a648
00a7a5dc	orr w0,wzr,#0xfffffffe
00a7a5e0	b 0x00a7a660
00a7a5e4	bl 0x00c342a0
00a7a5e8	adrp x0,0x2c1000
00a7a5ec	adrp x2,0x2c9000
00a7a5f0	add x0,x0,#0xd1f
00a7a5f4	add x2,x2,#0xa5b
00a7a5f8	mov w1,#0x103
00a7a5fc	bl 0x00c342b0
00a7a600	mov w0,#0x10
00a7a604	mov w1,#0x8d
00a7a608	b 0x00a7a630
00a7a60c	bl 0x00c342a0
00a7a610	adrp x0,0x2c1000
00a7a614	adrp x2,0x2c9000
00a7a618	add x0,x0,#0xd1f
00a7a61c	add x2,x2,#0xa5b
00a7a620	mov w1,#0x10c
00a7a624	bl 0x00c342b0
00a7a628	mov w0,#0x10
00a7a62c	mov w1,#0x8b
00a7a630	mov x2,xzr
00a7a634	bl 0x00c342c0
00a7a638	mov w0,wzr
00a7a63c	b 0x00a7a660
00a7a640	str xzr,[x22, #0x30]
00a7a644	b 0x00a7a65c
00a7a648	strb w20,[x22, #0x19]
00a7a64c	b 0x00a7a65c
00a7a650	ldr x0,[x22, #0x10]
00a7a654	bl 0x00c3a7c0
00a7a658	str xzr,[x22, #0x10]
00a7a65c	mov w0,#0x1
00a7a660	ldp x29,x30,[sp, #0x20]
00a7a664	ldp x20,x19,[sp, #0x10]
00a7a668	ldp x22,x21,[sp], #0x30
00a7a66c	ret
00a7a670	ldr x8,[x0, #0x18]
00a7a674	mov x19,x0
00a7a678	cbz x8,0x00a7a5dc
00a7a67c	ldr x0,[x8, #0x18]
00a7a680	bl 0x00c38d20
00a7a684	cbnz w0,0x00a7a65c
00a7a688	ldr x0,[x22, #0x10]
00a7a68c	cbnz x0,0x00a7a6a0
00a7a690	mov x0,x19
00a7a694	bl 0x00c3a7b0
00a7a698	str x0,[x22, #0x10]
00a7a69c	cbz x0,0x00a7a660
00a7a6a0	cbz w20,0x00a7a6b0
00a7a6a4	mov w1,#0x1000
00a7a6a8	bl 0x00c3ab40
00a7a6ac	b 0x00a7a65c
00a7a6b0	mov w1,#0x1000
00a7a6b4	bl 0x00c3ac70
00a7a6b8	b 0x00a7a65c
00a7a6bc	bl 0x00c342a0
00a7a6c0	adrp x0,0x2c1000
00a7a6c4	adrp x2,0x2c9000
00a7a6c8	add x0,x0,#0xd1f
00a7a6cc	add x2,x2,#0xa5b
00a7a6d0	mov w1,#0x171
00a7a6d4	bl 0x00c342b0
00a7a6d8	mov w0,#0x10
00a7a6dc	mov w1,#0x8a
00a7a6e0	b 0x00a7a630
