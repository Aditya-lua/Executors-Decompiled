; cpr::Session::prepareCommon @ 008ec334
008ec334	sub sp,sp,#0xc0
008ec338	stp x24,x23,[sp, #0x80]
008ec33c	stp x22,x21,[sp, #0x90]
008ec340	stp x20,x19,[sp, #0xa0]
008ec344	stp x29,x30,[sp, #0xb0]
008ec348	add x29,sp,#0xb0
008ec34c	mrs x24,tpidr_el0
008ec350	ldr x8,[x24, #0x28]
008ec354	mov x19,x0
008ec358	stur x8,[x29, #-0x38]
008ec35c	bl 0x00c312e0
008ec360	ldr x1,[x19, #0x18]
008ec364	add x0,x19,#0x48
008ec368	add x8,sp,#0x48
008ec36c	bl 0x00c30f50
008ec370	ldrb w8,[sp, #0x48]
008ec374	ldr x9,[sp, #0x50]
008ec378	lsr w10,w8,#0x1
008ec37c	tst w8,#0x1
008ec380	csel x8,x10,x9,eq
008ec384	cbz x8,0x008ec470
008ec388	add x20,x19,#0x30
008ec38c	adrp x1,0x2a3000
008ec390	add x1,x1,#0x5cf
008ec394	sub x8,x29,#0x50
008ec398	mov x0,x20
008ec39c	bl 0x00c30fa0
008ec3a0	adrp x13,0xcb4000
008ec3a4	ldurb w8,[x29, #-0x50]
008ec3a8	ldp x12,x9,[x29, #-0x48]
008ec3ac	ldur x11,[x29, #-0x4f]
008ec3b0	ldr x13,[x13, #0xa28]
008ec3b4	add x10,sp,#0x8
008ec3b8	add x0,x10,#0x8
008ec3bc	strb w8,[sp, #0x10]
008ec3c0	add x22,x13,#0x10
008ec3c4	stur x11,[sp, #0x11]
008ec3c8	stp x12,x9,[sp, #0x18]
008ec3cc	str x22,[sp, #0x8]
008ec3d0	sub x8,x29,#0x50
008ec3d4	add x1,sp,#0x48
008ec3d8	bl 0x00c31770
008ec3dc	adrp x21,0xcb4000
008ec3e0	ldurb w8,[x29, #-0x50]
008ec3e4	ldp x12,x9,[x29, #-0x48]
008ec3e8	ldur x11,[x29, #-0x4f]
008ec3ec	ldr x21,[x21, #0xa30]
008ec3f0	add x10,sp,#0x28
008ec3f4	add x23,x10,#0x8
008ec3f8	strb w8,[sp, #0x30]
008ec3fc	add x10,x21,#0x10
008ec400	str x10,[sp, #0x8]
008ec404	ldrb w10,[sp, #0x10]
008ec408	stur x11,[sp, #0x31]
008ec40c	stp x12,x9,[sp, #0x38]
008ec410	str x22,[sp, #0x28]
008ec414	tbz w10,#0x0,0x008ec428
008ec418	ldr x0,[sp, #0x20]
008ec41c	bl 0x00c301d0
008ec420	ldrb w8,[sp, #0x30]
008ec424	ldr x9,[sp, #0x40]
008ec428	ldr x10,[x19, #0x18]
008ec42c	tst w8,#0x1
008ec430	csinc x2,x9,x23,ne
008ec434	ldr x0,[x10]
008ec438	mov w1,#0x2712
008ec43c	bl 0x00c317c0
008ec440	add x8,x21,#0x10
008ec444	str x8,[sp, #0x28]
008ec448	ldrb w8,[sp, #0x30]
008ec44c	tbz w8,#0x0,0x008ec498
008ec450	ldr x0,[sp, #0x40]
008ec454	bl 0x00c301d0
008ec458	ldrb w22,[x20]
008ec45c	tbz w22,#0x0,0x008ec4a0
008ec460	ldp x2,x21,[x19, #0x38]
008ec464	cbnz x2,0x008ec4ac
008ec468	mov x8,#-0x1
008ec46c	b 0x008ec4c4
008ec470	mov x20,x19
008ec474	ldrb w8,[x20, #0x30]!
008ec478	ldur x9,[x20, #-0x18]
008ec47c	ldr x0,[x9]
008ec480	tbnz w8,#0x0,0x008ec48c
008ec484	add x2,x20,#0x1
008ec488	b 0x008ec490
008ec48c	ldr x2,[x19, #0x40]
008ec490	mov w1,#0x2712
008ec494	bl 0x00c317c0
008ec498	ldrb w22,[x20]
008ec49c	tbnz w22,#0x0,0x008ec460
008ec4a0	add x21,x20,#0x1
008ec4a4	lsr w2,w22,#0x1
008ec4a8	cbz x2,0x008ec468
008ec4ac	mov w1,#0x3a
008ec4b0	mov x0,x21
008ec4b4	bl 0x00c300a0
008ec4b8	sub x8,x0,x21
008ec4bc	cmp x0,#0x0
008ec4c0	csinv x8,x8,xzr,ne
008ec4c4	stp xzr,xzr,[sp, #0x28]
008ec4c8	str xzr,[sp, #0x38]
008ec4cc	ldp x9,x10,[x19, #0x38]
008ec4d0	lsr w11,w22,#0x1
008ec4d4	tst w22,#0x1
008ec4d8	csel x9,x11,x9,eq
008ec4dc	csinc x21,x10,x20,ne
008ec4e0	cmp x9,x8
008ec4e4	csel x20,x9,x8,cc
008ec4e8	cmn x20,#0x10
008ec4ec	b.cs 0x008ec7dc
008ec4f0	cmp x20,#0x17
008ec4f4	b.cs 0x008ec510
008ec4f8	add x9,sp,#0x28
008ec4fc	lsl w8,w20,#0x1
008ec500	orr x22,x9,#0x1
008ec504	strb w8,[sp, #0x28]
008ec508	cbnz x20,0x008ec530
008ec50c	b 0x008ec540
008ec510	add x8,x20,#0x10
008ec514	and x23,x8,#-0x10
008ec518	mov x0,x23
008ec51c	bl 0x00c2fed0
008ec520	orr x8,x23,#0x1
008ec524	mov x22,x0
008ec528	stp x20,x0,[sp, #0x30]
008ec52c	str x8,[sp, #0x28]
008ec530	mov x0,x22
008ec534	mov x1,x21
008ec538	mov x2,x20
008ec53c	bl 0x00c2ffd0
008ec540	strb wzr,[x22, x20]
008ec544	add x20,x19,#0x68
008ec548	add x1,sp,#0x28
008ec54c	mov x0,x20
008ec550	bl 0x00c310f0
008ec554	tbz w0,#0x0,0x008ec5d4
008ec558	ldr x8,[x19, #0x18]
008ec55c	ldr x21,[x8]
008ec560	add x1,sp,#0x28
008ec564	mov x0,x20
008ec568	bl 0x00c310e0
008ec56c	ldrb w8,[x0]
008ec570	ldr x9,[x0, #0x10]
008ec574	tst w8,#0x1
008ec578	csinc x2,x9,x0,ne
008ec57c	mov w1,#0x2714
008ec580	mov x0,x21
008ec584	bl 0x00c317c0
008ec588	add x20,x19,#0x80
008ec58c	add x1,sp,#0x28
008ec590	mov x0,x20
008ec594	bl 0x00c31160
008ec598	tbz w0,#0x0,0x008ec5d4
008ec59c	ldr x8,[x19, #0x18]
008ec5a0	ldr x0,[x8]
008ec5a4	mov w1,#0x6f
008ec5a8	orr x2,xzr,#-0x11
008ec5ac	bl 0x00c317c0
008ec5b0	ldr x8,[x19, #0x18]
008ec5b4	ldr x21,[x8]
008ec5b8	add x1,sp,#0x28
008ec5bc	mov x0,x20
008ec5c0	bl 0x00c31150
008ec5c4	mov x2,x0
008ec5c8	mov w1,#0x2716
008ec5cc	mov x0,x21
008ec5d0	bl 0x00c317c0
008ec5d4	add x21,x19,#0xb0
008ec5d8	mov x0,x21
008ec5dc	bl 0x00c30cb0
008ec5e0	tbz w0,#0x0,0x008ec600
008ec5e4	ldr x8,[x19, #0x18]
008ec5e8	ldr x0,[x8]
008ec5ec	adrp x2,0x2ab000
008ec5f0	add x2,x2,#0x32c
008ec5f4	mov w1,#0x2776
008ec5f8	bl 0x00c317c0
008ec5fc	b 0x008ec668
008ec600	mov x0,x21
008ec604	bl 0x00c30cc0
008ec608	ldr x8,[x19, #0x18]
008ec60c	ldr x20,[x8]
008ec610	tbz w0,#0x0,0x008ec628
008ec614	mov w1,#0x2776
008ec618	mov x0,x20
008ec61c	mov x2,xzr
008ec620	bl 0x00c317c0
008ec624	b 0x008ec668
008ec628	sub x8,x29,#0x50
008ec62c	mov x0,x21
008ec630	sub x22,x29,#0x50
008ec634	bl 0x00c30cd0
008ec638	ldurb w8,[x29, #-0x50]
008ec63c	ldur x9,[x29, #-0x40]
008ec640	orr x10,x22,#0x1
008ec644	tst w8,#0x1
008ec648	csel x2,x10,x9,eq
008ec64c	mov w1,#0x2776
008ec650	mov x0,x20
008ec654	bl 0x00c317c0
008ec658	ldurb w8,[x29, #-0x50]
008ec65c	tbz w8,#0x0,0x008ec668
008ec660	ldur x0,[x29, #-0x40]
008ec664	bl 0x00c301d0
008ec668	stur xzr,[x29, #-0x50]
008ec66c	ldr x8,[x19, #0x18]
008ec670	ldr x0,[x8]
008ec674	mov w1,#0xd8
008ec678	sub x2,x29,#0x50
008ec67c	bl 0x00c317c0
008ec680	ldr x8,[x19, #0x18]
008ec684	ldur x20,[x29, #-0x50]
008ec688	ldr x0,[x8]
008ec68c	mov w1,#0xd8
008ec690	mov w2,#0x10
008ec694	bl 0x00c317c0
008ec698	tbz w20,#0x1,0x008ec6b0
008ec69c	ldr x8,[x19, #0x18]
008ec6a0	ldr x0,[x8]
008ec6a4	mov w1,#0xd8
008ec6a8	mov w2,#0x2
008ec6ac	bl 0x00c317c0
008ec6b0	ldr x8,[x19, #0x18]
008ec6b4	add x21,x19,#0x248
008ec6b8	strb wzr,[x8, #0x20]
008ec6bc	ldrb w8,[x19, #0x248]
008ec6c0	tbnz w8,#0x0,0x008ec6d4
008ec6c4	strh wzr,[x21]
008ec6c8	ldr x1,[x19, #0x240]
008ec6cc	cbnz x1,0x008ec6e8
008ec6d0	b 0x008ec6f0
008ec6d4	ldr x8,[x19, #0x258]
008ec6d8	strb wzr,[x8]
008ec6dc	str xzr,[x19, #0x250]
008ec6e0	ldr x1,[x19, #0x240]
008ec6e4	cbz x1,0x008ec6f0
008ec6e8	mov x0,x21
008ec6ec	bl 0x00c308b0
008ec6f0	ldrb w8,[x19, #0x260]
008ec6f4	add x20,x19,#0x260
008ec6f8	tbnz w8,#0x0,0x008ec70c
008ec6fc	strh wzr,[x20]
008ec700	ldr x8,[x19, #0x190]
008ec704	cbnz x8,0x008ec74c
008ec708	b 0x008ec720
008ec70c	ldr x8,[x19, #0x270]
008ec710	strb wzr,[x8]
008ec714	str xzr,[x19, #0x268]
008ec718	ldr x8,[x19, #0x190]
008ec71c	cbnz x8,0x008ec74c
008ec720	ldr x8,[x19, #0x18]
008ec724	ldr x0,[x8]
008ec728	adrp x2,0xcb4000
008ec72c	ldr x2,[x2, #0xcd0]
008ec730	mov w1,#0x4e2b
008ec734	bl 0x00c317c0
008ec738	ldr x8,[x19, #0x18]
008ec73c	ldr x0,[x8]
008ec740	mov w1,#0x2711
008ec744	mov x2,x21
008ec748	bl 0x00c317c0
008ec74c	ldr x8,[x19, #0x150]
008ec750	cbnz x8,0x008ec780
008ec754	ldr x8,[x19, #0x18]
008ec758	ldr x0,[x8]
008ec75c	adrp x2,0xcb4000
008ec760	ldr x2,[x2, #0xcd0]
008ec764	mov w1,#0x4e6f
008ec768	bl 0x00c317c0
008ec76c	ldr x8,[x19, #0x18]
008ec770	ldr x0,[x8]
008ec774	mov w1,#0x272d
008ec778	mov x2,x20
008ec77c	bl 0x00c317c0
008ec780	ldr x8,[x19, #0x18]
008ec784	ldr x0,[x8]
008ec788	mov w1,#0xac
008ec78c	mov w2,#0x1
008ec790	bl 0x00c317c0
008ec794	ldrb w8,[sp, #0x28]
008ec798	tbz w8,#0x0,0x008ec7a4
008ec79c	ldr x0,[sp, #0x38]
008ec7a0	bl 0x00c301d0
008ec7a4	ldrb w8,[sp, #0x48]
008ec7a8	tbz w8,#0x0,0x008ec7b4
008ec7ac	ldr x0,[sp, #0x58]
008ec7b0	bl 0x00c301d0
008ec7b4	ldr x8,[x24, #0x28]
008ec7b8	ldur x9,[x29, #-0x38]
008ec7bc	cmp x8,x9
008ec7c0	b.ne 0x008ec7e4
008ec7c4	ldp x29,x30,[sp, #0xb0]
008ec7c8	ldp x20,x19,[sp, #0xa0]
008ec7cc	ldp x22,x21,[sp, #0x90]
008ec7d0	ldp x24,x23,[sp, #0x80]
008ec7d4	add sp,sp,#0xc0
008ec7d8	ret
008ec7dc	add x0,sp,#0x28
008ec7e0	bl 0x00c30ce0
008ec7e4	bl 0x00c2fec0
