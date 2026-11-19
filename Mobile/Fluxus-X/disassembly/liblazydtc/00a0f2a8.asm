; FUN_00a0f2a8 @ 00a0f2a8
00751f48	udf 0x0
00751f7c	udf 0x0
00a0f2a8	sub sp,sp,#0x80
00a0f2ac	stp x28,x27,[sp, #0x20]
00a0f2b0	stp x26,x25,[sp, #0x30]
00a0f2b4	stp x24,x23,[sp, #0x40]
00a0f2b8	stp x22,x21,[sp, #0x50]
00a0f2bc	stp x20,x19,[sp, #0x60]
00a0f2c0	stp x29,x30,[sp, #0x70]
00a0f2c4	add x29,sp,#0x70
00a0f2c8	mov x20,x3
00a0f2cc	mov x24,x2
00a0f2d0	mov x21,x1
00a0f2d4	mov x22,x0
00a0f2d8	bl 0x00c37020
00a0f2dc	cbz x0,0x00a0f7ac
00a0f2e0	mov x19,x0
00a0f2e4	mov x0,x20
00a0f2e8	bl 0x00c2ff50
00a0f2ec	orr x8,xzr,#0x100000000
00a0f2f0	add x8,x8,x0, LSL #0x20
00a0f2f4	asr x1,x8,#0x20
00a0f2f8	mov x0,x19
00a0f2fc	bl 0x00c37000
00a0f300	cbz x0,0x00a0f7a0
00a0f304	adrp x28,0x751000
00a0f308	mov w25,wzr
00a0f30c	mov w13,#0x29
00a0f310	mov w14,#0x7d
00a0f314	mov w15,#0x107
00a0f318	add x28,x28,#0xf4c
00a0f31c	str x21,[sp, #0x18]
00a0f320	str wzr,[sp, #0x14]
00a0f324	b 0x00a0f32c
00a0f328	strb w21,[x27]
00a0f32c	mov x23,x20
00a0f330	b 0x00a0f348
00a0f334	ldr x9,[x19, #0x8]
00a0f338	add x23,x23,#0x1
00a0f33c	strb w8,[x9, w25, SXTW ]
00a0f340	add w8,w25,#0x1
00a0f344	mov w25,w8
00a0f348	ldrsb w8,[x23]
00a0f34c	and x10,x8,#0xff
00a0f350	tbnz w8,#0x1f,0x00a0f334
00a0f354	ldr x9,[x22, #0x8]
00a0f358	ldrh w10,[x9, x10, LSL #0x1]
00a0f35c	tbnz w10,#0x6,0x00a0f394
00a0f360	tbnz w10,#0xa,0x00a0f424
00a0f364	tbnz w10,#0x5,0x00a0f498
00a0f368	tbnz w10,#0x3,0x00a0f6b8
00a0f36c	cmp w8,#0x24
00a0f370	b.ne 0x00a0f334
00a0f374	ldr w10,[x22, #0x18]
00a0f378	ldrb w11,[x23, #0x1]
00a0f37c	cbz w10,0x00a0f510
00a0f380	cmp w11,#0x7b
00a0f384	b.eq 0x00a0f510
00a0f388	cmp w11,#0x28
00a0f38c	b.ne 0x00a0f334
00a0f390	b 0x00a0f510
00a0f394	sxtw x25,w25
00a0f398	mov x9,x23
00a0f39c	ldrsb w10,[x9, #0x1]!
00a0f3a0	tbz w10,#0x1f,0x00a0f3c4
00a0f3a4	b 0x00a0f40c
00a0f3a8	ldr x11,[x19, #0x8]
00a0f3ac	add x12,x25,#0x1
00a0f3b0	mov x23,x9
00a0f3b4	strb w10,[x11, x25]
00a0f3b8	mov x25,x12
00a0f3bc	ldrsb w10,[x9, #0x1]!
00a0f3c0	tbnz w10,#0x1f,0x00a0f40c
00a0f3c4	cmp w10,w8
00a0f3c8	b.eq 0x00a0f418
00a0f3cc	ldr x11,[x22, #0x8]
00a0f3d0	and x12,x10,#0xff
00a0f3d4	ldrh w11,[x11, x12, LSL #0x1]
00a0f3d8	tbnz w11,#0x3,0x00a0f418
00a0f3dc	ldr x11,[x22, #0x8]
00a0f3e0	lsl x12,x12,#0x1
00a0f3e4	ldrb w12,[x11, x12]
00a0f3e8	tbz w12,#0x5,0x00a0f3a8
00a0f3ec	ldrsb w10,[x23, #0x2]!
00a0f3f0	mov x9,x23
00a0f3f4	tbnz w10,#0x1f,0x00a0f3a8
00a0f3f8	and x12,x10,#0xff
00a0f3fc	lsl x12,x12,#0x1
00a0f400	ldrb w11,[x11, x12]
00a0f404	tbz w11,#0x3,0x00a0f3a8
00a0f408	b 0x00a0f418
00a0f40c	cmp w10,w8
00a0f410	b.ne 0x00a0f3a8
00a0f414	mov w10,w8
00a0f418	cmp w10,w8
00a0f41c	cinc x23,x9,eq
00a0f420	b 0x00a0f348
00a0f424	sxtw x25,w25
00a0f428	b 0x00a0f440
00a0f42c	ldr x9,[x19, #0x8]
00a0f430	add x12,x25,#0x1
00a0f434	mov x23,x11
00a0f438	strb w10,[x9, x25]
00a0f43c	mov x25,x12
00a0f440	mov x9,x23
00a0f444	ldrsb w10,[x9, #0x1]!
00a0f448	tbnz w10,#0x1f,0x00a0f460
00a0f44c	ldr x11,[x22, #0x8]
00a0f450	and x12,x10,#0xff
00a0f454	lsl x12,x12,#0x1
00a0f458	ldrb w11,[x11, x12]
00a0f45c	tbnz w11,#0x3,0x00a0f488
00a0f460	cmp w10,w8
00a0f464	mov x11,x9
00a0f468	b.ne 0x00a0f42c
00a0f46c	ldrb w10,[x23, #0x2]!
00a0f470	cmp w10,w8, UXTB 
00a0f474	mov x11,x23
00a0f478	mov w10,w8
00a0f47c	b.eq 0x00a0f42c
00a0f480	mov w10,w8
00a0f484	b 0x00a0f48c
00a0f488	add x11,x23,#0x2
00a0f48c	cmp w10,w8
00a0f490	csel x23,x11,x9,eq
00a0f494	b 0x00a0f348
00a0f498	ldrsb w8,[x23, #0x1]
00a0f49c	tbnz w8,#0x1f,0x00a0f4b0
00a0f4a0	and x10,x8,#0xff
00a0f4a4	lsl x10,x10,#0x1
00a0f4a8	ldrb w9,[x9, x10]
00a0f4ac	tbnz w9,#0x3,0x00a0f6b8
00a0f4b0	sub w10,w8,#0x62
00a0f4b4	lsl w9,w10,#0x7
00a0f4b8	bfxil w9,w10,#0x1,#0x7
00a0f4bc	and w10,w9,#0xff
00a0f4c0	cmp w10,#0x9
00a0f4c4	add x23,x23,#0x2
00a0f4c8	b.hi 0x00a0f4e8
00a0f4cc	and x9,x9,#0xff
00a0f4d0	ldrsw x9,[x28, x9, LSL #0x2]
00a0f4d4	add x10,x9,x28
00a0f4d8	mov w9,#0xd
00a0f4dc	br x10
00a0f4e8	mov w9,w8
00a0f4ec	b 0x00a0f4fc
00a0f4fc	ldr x8,[x19, #0x8]
00a0f500	add w10,w25,#0x1
00a0f504	strb w9,[x8, w25, SXTW ]
00a0f508	mov w25,w10
00a0f50c	b 0x00a0f348
00a0f510	cmp w11,#0x28
00a0f514	csel w8,w13,wzr,eq
00a0f518	cmp w11,#0x7b
00a0f51c	csel w8,w14,w8,eq
00a0f520	add x11,x23,#0x2
00a0f524	cmp w8,#0x0
00a0f528	csinc x1,x11,x23,ne
00a0f52c	mov x26,x1
00a0f530	b 0x00a0f538
00a0f534	add x26,x26,#0x1
00a0f538	ldrsb w21,[x26]
00a0f53c	and x11,x21,#0xff
00a0f540	tbnz w21,#0x1f,0x00a0f550
00a0f544	ldrh w12,[x9, x11, LSL #0x1]
00a0f548	tst w12,w15
00a0f54c	b.ne 0x00a0f534
00a0f550	cbz w10,0x00a0f564
00a0f554	tbnz w21,#0x1f,0x00a0f5e4
00a0f558	add x11,x9,x11, LSL #0x1
00a0f55c	ldrb w11,[x11, #0x1]
00a0f560	tbnz w11,#0x4,0x00a0f534
00a0f564	cmp w21,#0x3a
00a0f568	b.ne 0x00a0f5e4
00a0f56c	ldrb w9,[x26, #0x1]
00a0f570	cmp w9,#0x3a
00a0f574	b.ne 0x00a0f5e0
00a0f578	and w9,w21,#0xff
00a0f57c	str w9,[sp, #0x14]
00a0f580	strb wzr,[x26]
00a0f584	mov x2,x26
00a0f588	ldrsb w21,[x2, #0x2]!
00a0f58c	tbnz w21,#0x1f,0x00a0f6b0
00a0f590	ldr w9,[x22, #0x18]
00a0f594	ldr x10,[x22, #0x8]
00a0f598	lsr w11,w21,#0x1f
00a0f59c	mov x27,x2
00a0f5a0	and x12,x21,#0xff
00a0f5a4	ldrh w12,[x10, x12, LSL #0x1]
00a0f5a8	tst w12,w15
00a0f5ac	b.ne 0x00a0f5d0
00a0f5b0	cmp w9,#0x0
00a0f5b4	cset w12,eq
00a0f5b8	orr w11,w12,w11
00a0f5bc	tbnz w11,#0x0,0x00a0f5f4
00a0f5c0	ldr x11,[x22, #0x8]
00a0f5c4	add x11,x11,w21, UXTB  #0x1
00a0f5c8	ldrb w11,[x11, #0x1]
00a0f5cc	tbz w11,#0x4,0x00a0f5f4
00a0f5d0	ldrsb w21,[x27, #0x1]!
00a0f5d4	lsr w11,w21,#0x1f
00a0f5d8	tbz w21,#0x1f,0x00a0f5a0
00a0f5dc	b 0x00a0f5f4
00a0f5e0	mov w21,#0x3a
00a0f5e4	mov x2,x1
00a0f5e8	ldr x1,[sp, #0x18]
00a0f5ec	mov x27,x26
00a0f5f0	mov x26,xzr
00a0f5f4	mov x20,x27
00a0f5f8	strb wzr,[x27]
00a0f5fc	cbz w8,0x00a0f60c
00a0f600	cmp w8,w21, UXTB 
00a0f604	b.ne 0x00a0f774
00a0f608	add x20,x27,#0x1
00a0f60c	mov x0,x22
00a0f610	str x24,[sp, #0x8]
00a0f614	bl 0x00c393f0
00a0f618	mov x24,x0
00a0f61c	cbz x26,0x00a0f628
00a0f620	ldr w8,[sp, #0x14]
00a0f624	strb w8,[x26]
00a0f628	strb w21,[x27]
00a0f62c	cbz x24,0x00a0f6f8
00a0f630	mov x0,x24
00a0f634	bl 0x00c2ff50
00a0f638	ldr x8,[x19]
00a0f63c	sub x9,x23,x20
00a0f640	add x9,x0,x9
00a0f644	add x1,x9,x8
00a0f648	cmp x1,#0x10, LSL #12
00a0f64c	b.hi 0x00a0f720
00a0f650	mov x0,x19
00a0f654	bl 0x00c37010
00a0f658	cbz x0,0x00a0f748
00a0f65c	ldrb w8,[x24]
00a0f660	cbz w8,0x00a0f698
00a0f664	add x9,x24,#0x1
00a0f668	ldr x24,[sp, #0x8]
00a0f66c	sxtw x10,w25
00a0f670	mov w13,#0x29
00a0f674	mov w14,#0x7d
00a0f678	mov w15,#0x107
00a0f67c	ldr x11,[x19, #0x8]
00a0f680	add w25,w25,#0x1
00a0f684	strb w8,[x11, x10]
00a0f688	ldrb w8,[x9], #0x1
00a0f68c	add x10,x10,#0x1
00a0f690	cbnz w8,0x00a0f67c
00a0f694	b 0x00a0f328
00a0f698	ldr x24,[sp, #0x8]
00a0f69c	mov w13,#0x29
00a0f6a0	mov w14,#0x7d
00a0f6a4	mov w15,#0x107
00a0f6a8	strb w21,[x27]
00a0f6ac	b 0x00a0f32c
00a0f6b0	mov x27,x2
00a0f6b4	b 0x00a0f5f4
00a0f6b8	ldr x8,[x19, #0x8]
00a0f6bc	adrp x21,0x2d7000
00a0f6c0	add x21,x21,#0xc86
00a0f6c4	mov w2,#0x320
00a0f6c8	strb wzr,[x8, w25, SXTW ]
00a0f6cc	ldr x0,[x24]
00a0f6d0	mov x1,x21
00a0f6d4	bl 0x00c32310
00a0f6d8	ldr x8,[x19, #0x8]
00a0f6dc	mov w2,#0x322
00a0f6e0	mov x0,x19
00a0f6e4	mov x1,x21
00a0f6e8	str x8,[x24]
00a0f6ec	bl 0x00c32310
00a0f6f0	mov w0,#0x1
00a0f6f4	b 0x00a0f7ac
00a0f6f8	bl 0x00c342a0
00a0f6fc	adrp x0,0x2d7000
00a0f700	adrp x2,0x2d1000
00a0f704	add x0,x0,#0xc86
00a0f708	add x2,x2,#0x760
00a0f70c	orr w1,wzr,#0x300
00a0f710	bl 0x00c342b0
00a0f714	orr w0,wzr,#0xe
00a0f718	mov w1,#0x68
00a0f71c	b 0x00a0f798
00a0f720	bl 0x00c342a0
00a0f724	adrp x0,0x2d7000
00a0f728	adrp x2,0x2d1000
00a0f72c	add x0,x0,#0xc86
00a0f730	add x2,x2,#0x760
00a0f734	mov w1,#0x305
00a0f738	bl 0x00c342b0
00a0f73c	orr w0,wzr,#0xe
00a0f740	mov w1,#0x74
00a0f744	b 0x00a0f798
00a0f748	bl 0x00c342a0
00a0f74c	adrp x0,0x2d7000
00a0f750	adrp x2,0x2d1000
00a0f754	add x0,x0,#0xc86
00a0f758	add x2,x2,#0x760
00a0f75c	mov w1,#0x309
00a0f760	bl 0x00c342b0
00a0f764	mov w1,#0x100
00a0f768	orr w0,wzr,#0xe
00a0f76c	movk w1,#0xc, LSL #16
00a0f770	b 0x00a0f798
00a0f774	bl 0x00c342a0
00a0f778	adrp x0,0x2d7000
00a0f77c	adrp x2,0x2d1000
00a0f780	add x0,x0,#0xc86
00a0f784	add x2,x2,#0x760
00a0f788	mov w1,#0x2ec
00a0f78c	bl 0x00c342b0
00a0f790	orr w0,wzr,#0xe
00a0f794	mov w1,#0x66
00a0f798	mov x2,xzr
00a0f79c	bl 0x00c342c0
00a0f7a0	mov x0,x19
00a0f7a4	bl 0x00c35660
00a0f7a8	mov w0,wzr
00a0f7ac	ldp x29,x30,[sp, #0x70]
00a0f7b0	ldp x20,x19,[sp, #0x60]
00a0f7b4	ldp x22,x21,[sp, #0x50]
00a0f7b8	ldp x24,x23,[sp, #0x40]
00a0f7bc	ldp x26,x25,[sp, #0x30]
00a0f7c0	ldp x28,x27,[sp, #0x20]
00a0f7c4	add sp,sp,#0x80
00a0f7c8	ret
