; FUN_00bdf260 @ 00bdf260
00bdf260	paciasp
00bdf264	sub sp,sp,#0x1e0
00bdf268	stp x29,x30,[sp, #0x180]
00bdf26c	stp x28,x27,[sp, #0x190]
00bdf270	stp x26,x25,[sp, #0x1a0]
00bdf274	stp x24,x23,[sp, #0x1b0]
00bdf278	stp x22,x21,[sp, #0x1c0]
00bdf27c	stp x20,x19,[sp, #0x1d0]
00bdf280	add x29,sp,#0x180
00bdf284	ldr w8,[x3, #0x8]
00bdf288	mov w9,#0x4a
00bdf28c	mov x25,x3
00bdf290	mov x20,x2
00bdf294	mov x21,x1
00bdf298	sub x27,x29,#0xb0
00bdf29c	ands w8,w8,w9
00bdf2a0	stp x5,x4,[sp, #0x10]
00bdf2a4	b.eq 0x00bdf2c8
00bdf2a8	cmp w8,#0x40
00bdf2ac	b.eq 0x00bdf2c0
00bdf2b0	cmp w8,#0x8
00bdf2b4	b.ne 0x00bdf2d0
00bdf2b8	mov w23,#0x10
00bdf2bc	b 0x00bdf2d4
00bdf2c0	mov w23,#0x8
00bdf2c4	b 0x00bdf2d4
00bdf2c8	mov w23,wzr
00bdf2cc	b 0x00bdf2d4
00bdf2d0	mov w23,#0xa
00bdf2d4	sub x2,x29,#0x74
00bdf2d8	mov x1,x25
00bdf2dc	bl 0x00c0cb44
00bdf2e0	mov x24,x0
00bdf2e4	sub x8,x29,#0x90
00bdf2e8	sub x1,x29,#0xc
00bdf2ec	mov x0,x25
00bdf2f0	bl 0x00c0cc28
00bdf2f4	stp xzr,xzr,[x27, #0x8]
00bdf2f8	str xzr,[x27, #0x18]
00bdf2fc	sub x0,x29,#0xa8
00bdf300	mov w1,#0x16
00bdf304	mov w2,wzr
00bdf308	sub x19,x29,#0xa8
00bdf30c	bl 0x00c30250
00bdf310	ldurb w8,[x29, #-0xa8]
00bdf314	ldr x9,[x27, #0x18]
00bdf318	add x10,sp,#0x30
00bdf31c	orr x28,x19,#0x1
00bdf320	add x22,sp,#0x28
00bdf324	str x10,[sp, #0x28]
00bdf328	tst w8,#0x1
00bdf32c	str wzr,[sp, #0x24]
00bdf330	csinc x25,x9,x19,ne
00bdf334	mov w19,#0x16
00bdf338	str x25,[x27]
00bdf33c	b 0x00bdf348
00bdf340	add x8,x8,#0x4
00bdf344	str x8,[x21, #0x18]
00bdf348	cbz x21,0x00bdf360
00bdf34c	ldp x8,x9,[x21, #0x18]
00bdf350	cmp x8,x9
00bdf354	b.eq 0x00bdf370
00bdf358	ldr w0,[x8]
00bdf35c	b 0x00bdf380
00bdf360	mov w26,#0x1
00bdf364	cbnz x20,0x00bdf390
00bdf368	tbz w26,#0x0,0x00bdf3c8
00bdf36c	b 0x00bdf50c
00bdf370	ldr x8,[x21]
00bdf374	ldr x8,[x8, #0x48]
00bdf378	mov x0,x21
00bdf37c	blr x8
00bdf380	cmn w0,#0x1
00bdf384	cset w26,eq
00bdf388	csel x21,xzr,x21,eq
00bdf38c	cbz x20,0x00bdf368
00bdf390	ldp x8,x9,[x20, #0x18]
00bdf394	cmp x8,x9
00bdf398	b.eq 0x00bdf3a4
00bdf39c	ldr w0,[x8]
00bdf3a0	b 0x00bdf3b4
00bdf3a4	ldr x8,[x20]
00bdf3a8	ldr x8,[x8, #0x48]
00bdf3ac	mov x0,x20
00bdf3b0	blr x8
00bdf3b4	cmn w0,#0x1
00bdf3b8	cset w8,eq
00bdf3bc	csel x20,xzr,x20,eq
00bdf3c0	cmp w26,w8
00bdf3c4	b.eq 0x00bdf50c
00bdf3c8	ldurb w8,[x29, #-0xa8]
00bdf3cc	ldr x9,[x27, #0x10]
00bdf3d0	ldr x11,[x27]
00bdf3d4	lsr x10,x8,#0x1
00bdf3d8	tst w8,#0x1
00bdf3dc	csel x26,x10,x9,eq
00bdf3e0	add x9,x25,x26
00bdf3e4	cmp x11,x9
00bdf3e8	b.ne 0x00bdf4a0
00bdf3ec	cmp x26,#0x1
00bdf3f0	b.lt 0x00bdf408
00bdf3f4	sub x0,x29,#0xa8
00bdf3f8	mov x1,x26
00bdf3fc	mov w2,wzr
00bdf400	bl 0x00c30250
00bdf404	b 0x00bdf42c
00bdf408	lsl x9,x26,#0x1
00bdf40c	tbnz w8,#0x0,0x00bdf420
00bdf410	lsl w8,w9,#0x1
00bdf414	sturb w8,[x29, #-0xa8]
00bdf418	mov x8,x28
00bdf41c	b 0x00bdf428
00bdf420	ldr x8,[x27, #0x18]
00bdf424	str x9,[x27, #0x10]
00bdf428	strb wzr,[x8, x9]
00bdf42c	ldp x9,x10,[x27, #0x8]
00bdf430	ldurb w8,[x29, #-0xa8]
00bdf434	tst w8,#0x1
00bdf438	and x11,x9,#-0x2
00bdf43c	ubfx x12,x9,#0x1,#0x7
00bdf440	sub x11,x11,#0x1
00bdf444	csel x8,x19,x11,eq
00bdf448	tst x9,#0x1
00bdf44c	csel x10,x12,x10,eq
00bdf450	subs x1,x8,x10
00bdf454	b.ls 0x00bdf468
00bdf458	sub x0,x29,#0xa8
00bdf45c	mov w2,wzr
00bdf460	bl 0x00c30250
00bdf464	b 0x00bdf488
00bdf468	tbnz w9,#0x0,0x00bdf47c
00bdf46c	lsl w9,w8,#0x1
00bdf470	sturb w9,[x29, #-0xa8]
00bdf474	mov x9,x28
00bdf478	b 0x00bdf484
00bdf47c	ldr x9,[x27, #0x18]
00bdf480	str x8,[x27, #0x10]
00bdf484	strb wzr,[x9, x8]
00bdf488	ldurb w8,[x29, #-0xa8]
00bdf48c	ldr x9,[x27, #0x18]
00bdf490	tst w8,#0x1
00bdf494	csel x25,x28,x9,eq
00bdf498	add x8,x25,x26
00bdf49c	str x8,[x27]
00bdf4a0	ldp x8,x9,[x21, #0x18]
00bdf4a4	cmp x8,x9
00bdf4a8	b.eq 0x00bdf4b4
00bdf4ac	ldr w0,[x8]
00bdf4b0	b 0x00bdf4c4
00bdf4b4	ldr x8,[x21]
00bdf4b8	ldr x8,[x8, #0x48]
00bdf4bc	mov x0,x21
00bdf4c0	blr x8
00bdf4c4	ldur w5,[x29, #-0xc]
00bdf4c8	sub x3,x29,#0xb0
00bdf4cc	add x4,sp,#0x24
00bdf4d0	sub x6,x29,#0x90
00bdf4d4	add x7,sp,#0x30
00bdf4d8	mov w1,w23
00bdf4dc	mov x2,x25
00bdf4e0	stp x22,x24,[sp]
00bdf4e4	bl 0x00c44120
00bdf4e8	cbnz w0,0x00bdf50c
00bdf4ec	ldp x8,x9,[x21, #0x18]
00bdf4f0	cmp x8,x9
00bdf4f4	b.ne 0x00bdf340
00bdf4f8	ldr x8,[x21]
00bdf4fc	ldr x8,[x8, #0x50]
00bdf500	mov x0,x21
00bdf504	blr x8
00bdf508	b 0x00bdf348
00bdf50c	ldurb w8,[x29, #-0x90]
00bdf510	ldr x9,[x27, #0x28]
00bdf514	ldr x22,[sp, #0x18]
00bdf518	lsr x10,x8,#0x1
00bdf51c	tst w8,#0x1
00bdf520	csel x8,x10,x9,eq
00bdf524	cbz x8,0x00bdf548
00bdf528	ldr x8,[sp, #0x28]
00bdf52c	add x9,sp,#0x30
00bdf530	sub x9,x8,x9
00bdf534	cmp x9,#0x9f
00bdf538	b.gt 0x00bdf548
00bdf53c	ldr w9,[sp, #0x24]
00bdf540	str w9,[x8], #0x4
00bdf544	str x8,[sp, #0x28]
00bdf548	ldr x1,[x27]
00bdf54c	mov x0,x25
00bdf550	mov x2,x22
00bdf554	mov w3,w23
00bdf558	bl 0x00c0bfac
00bdf55c	ldurb w10,[x29, #-0x90]
00bdf560	ldr x12,[sp, #0x28]
00bdf564	add x11,sp,#0x30
00bdf568	ldr x8,[x27, #0x28]
00bdf56c	lsr x9,x10,#0x1
00bdf570	ands w13,w10,#0x1
00bdf574	sub x11,x12,x11
00bdf578	csel x8,x9,x8,eq
00bdf57c	ldr x9,[sp, #0x10]
00bdf580	cmp x11,#0x5
00bdf584	str x0,[x9]
00bdf588	b.lt 0x00bdf6e8
00bdf58c	cbz x8,0x00bdf6e8
00bdf590	sub x8,x12,#0x4
00bdf594	add x9,sp,#0x30
00bdf598	cmp x9,x8
00bdf59c	cset w11,cc
00bdf5a0	cmp x9,x12
00bdf5a4	b.eq 0x00bdf654
00bdf5a8	cbz w11,0x00bdf654
00bdf5ac	add x10,sp,#0x30
00bdf5b0	sub x14,x12,#0x8
00bdf5b4	add x11,x10,#0x4
00bdf5b8	cmp x14,x11
00bdf5bc	csel x13,x14,x11,hi
00bdf5c0	sub x13,x13,#0x4
00bdf5c4	cmp x13,x10
00bdf5c8	cinc x15,x10,ne
00bdf5cc	cmp x13,x10
00bdf5d0	sub x15,x13,x15
00bdf5d4	lsr x15,x15,#0x3
00bdf5d8	cinc x13,x15,ne
00bdf5dc	cmp x13,#0x13
00bdf5e0	b.cc 0x00bdf628
00bdf5e4	cmp x14,x11
00bdf5e8	csel x14,x14,x11,hi
00bdf5ec	sub x14,x14,#0x4
00bdf5f0	cmp x14,x10
00bdf5f4	cinc x15,x10,ne
00bdf5f8	cmp x14,x10
00bdf5fc	sub x15,x14,x15
00bdf600	lsr x15,x15,#0x3
00bdf604	cinc x14,x15,ne
00bdf608	cmp x10,x12
00bdf60c	b.cs 0x00bdf7c8
00bdf610	lsl x14,x14,#0x2
00bdf614	sub x15,x12,x14
00bdf618	add x11,x11,x14
00bdf61c	sub x14,x15,#0x4
00bdf620	cmp x14,x11
00bdf624	b.cs 0x00bdf7c8
00bdf628	mov x11,x8
00bdf62c	add x10,x10,#0x4
00bdf630	ldr w12,[x11]
00bdf634	ldur w13,[x10, #-0x4]
00bdf638	stur w12,[x10, #-0x4]
00bdf63c	str w13,[x11], #-0x4
00bdf640	cmp x10,x11
00bdf644	add x10,x10,#0x4
00bdf648	b.cc 0x00bdf630
00bdf64c	ldurb w10,[x29, #-0x90]
00bdf650	and w13,w10,#0x1
00bdf654	ldr x11,[x27, #0x30]
00bdf658	cmp w13,#0x0
00bdf65c	sub x12,x29,#0x90
00bdf660	csinc x11,x11,x12,ne
00bdf664	cmp x9,x8
00bdf668	b.cs 0x00bdf6c0
00bdf66c	lsr w9,w10,#0x1
00bdf670	ldr x10,[x27, #0x28]
00bdf674	cmp w13,#0x0
00bdf678	csel x9,x9,x10,eq
00bdf67c	add x10,sp,#0x30
00bdf680	add x9,x11,x9
00bdf684	b 0x00bdf6a0
00bdf688	sub x12,x9,x11
00bdf68c	add x10,x10,#0x4
00bdf690	cmp x12,#0x1
00bdf694	cinc x11,x11,gt
00bdf698	cmp x10,x8
00bdf69c	b.cs 0x00bdf6c0
00bdf6a0	ldrb w12,[x11]
00bdf6a4	cbz w12,0x00bdf688
00bdf6a8	cmp w12,#0xff
00bdf6ac	b.eq 0x00bdf688
00bdf6b0	ldr w13,[x10]
00bdf6b4	cmp w13,w12
00bdf6b8	b.eq 0x00bdf688
00bdf6bc	b 0x00bdf6e0
00bdf6c0	ldrb w9,[x11]
00bdf6c4	cbz w9,0x00bdf6e8
00bdf6c8	cmp w9,#0xff
00bdf6cc	b.eq 0x00bdf6e8
00bdf6d0	ldr w8,[x8]
00bdf6d4	sub w8,w8,#0x1
00bdf6d8	cmp w8,w9
00bdf6dc	b.cc 0x00bdf6e8
00bdf6e0	mov w8,#0x4
00bdf6e4	str w8,[x22]
00bdf6e8	cbz x21,0x00bdf700
00bdf6ec	ldp x8,x9,[x21, #0x18]
00bdf6f0	cmp x8,x9
00bdf6f4	b.eq 0x00bdf710
00bdf6f8	ldr w0,[x8]
00bdf6fc	b 0x00bdf720
00bdf700	mov w19,#0x1
00bdf704	cbnz x20,0x00bdf730
00bdf708	tbnz w19,#0x0,0x00bdf764
00bdf70c	b 0x00bdf770
00bdf710	ldr x8,[x21]
00bdf714	ldr x8,[x8, #0x48]
00bdf718	mov x0,x21
00bdf71c	blr x8
00bdf720	cmn w0,#0x1
00bdf724	cset w19,eq
00bdf728	csel x21,xzr,x21,eq
00bdf72c	cbz x20,0x00bdf708
00bdf730	ldp x8,x9,[x20, #0x18]
00bdf734	cmp x8,x9
00bdf738	b.eq 0x00bdf744
00bdf73c	ldr w0,[x8]
00bdf740	b 0x00bdf754
00bdf744	ldr x8,[x20]
00bdf748	ldr x8,[x8, #0x48]
00bdf74c	mov x0,x20
00bdf750	blr x8
00bdf754	cmn w0,#0x1
00bdf758	cset w8,eq
00bdf75c	eor w8,w19,w8
00bdf760	tbnz w8,#0x0,0x00bdf770
00bdf764	ldr w8,[x22]
00bdf768	orr w8,w8,#0x2
00bdf76c	str w8,[x22]
00bdf770	ldurb w8,[x29, #-0xa8]
00bdf774	tbz w8,#0x0,0x00bdf788
00bdf778	ldr x8,[x27, #0x8]
00bdf77c	ldr x0,[x27, #0x18]
00bdf780	and x1,x8,#-0x2
00bdf784	bl 0x00c2fe80
00bdf788	ldurb w8,[x29, #-0x90]
00bdf78c	tbz w8,#0x0,0x00bdf7a0
00bdf790	ldr x8,[x27, #0x20]
00bdf794	ldr x0,[x27, #0x30]
00bdf798	and x1,x8,#-0x2
00bdf79c	bl 0x00c2fe80
00bdf7a0	mov x0,x21
00bdf7a4	ldp x20,x19,[sp, #0x1d0]
00bdf7a8	ldp x22,x21,[sp, #0x1c0]
00bdf7ac	ldp x24,x23,[sp, #0x1b0]
00bdf7b0	ldp x26,x25,[sp, #0x1a0]
00bdf7b4	ldp x28,x27,[sp, #0x190]
00bdf7b8	ldp x29,x30,[sp, #0x180]
00bdf7bc	add sp,sp,#0x1e0
00bdf7c0	autiasp
00bdf7c4	ret
00bdf7c8	add x13,x13,#0x1
00bdf7cc	add x15,sp,#0x30
00bdf7d0	sub x12,x12,#0x10
00bdf7d4	and x14,x13,#0x7ffffffffffffff8
00bdf7d8	lsl x10,x14,#0x2
00bdf7dc	mov x16,x14
00bdf7e0	sub x11,x8,x10
00bdf7e4	add x10,x15,x10
00bdf7e8	add x15,x15,#0x10
00bdf7ec	ldp q1,q0,[x12, #-0x10]
00bdf7f0	sub x16,x16,#0x8
00bdf7f4	ldp q2,q3,[x15, #-0x10]
00bdf7f8	rev64 v0.4S,v0.4S
00bdf7fc	rev64 v1.4S,v1.4S
00bdf800	rev64 v2.4S,v2.4S
00bdf804	rev64 v3.4S,v3.4S
00bdf808	ext v0.16B,v0.16B,v0.16B,0x8
00bdf80c	ext v1.16B,v1.16B,v1.16B,0x8
00bdf810	ext v2.16B,v2.16B,v2.16B,0x8
00bdf814	ext v3.16B,v3.16B,v3.16B,0x8
00bdf818	stp q0,q1,[x15, #-0x10]
00bdf81c	add x15,x15,#0x20
00bdf820	stp q3,q2,[x12, #-0x10]
00bdf824	sub x12,x12,#0x20
00bdf828	cbnz x16,0x00bdf7ec
00bdf82c	cmp x13,x14
00bdf830	b.eq 0x00bdf64c
00bdf834	b 0x00bdf62c
