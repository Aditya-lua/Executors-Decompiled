; FUN_008db0f8 @ 008db0f8
008db0f8	stp x29,x30,[sp, #-0x50]!
008db0fc	str x25,[sp, #0x10]
008db100	stp x24,x23,[sp, #0x20]
008db104	stp x22,x21,[sp, #0x30]
008db108	stp x20,x19,[sp, #0x40]
008db10c	mov x29,sp
008db110	mov w8,#0xffffffff
008db114	cbz x0,0x008db7ec
008db118	tbnz w3,#0x1f,0x008db7ec
008db11c	cbz w3,0x008db508
008db120	cbz w2,0x008db7ec
008db124	add x9,x0,w2, SXTW 
008db128	mov w11,w3
008db12c	sub x10,x1,x4
008db130	add x12,x1,x11
008db134	cmp w3,#0x40
008db138	mov x8,x0
008db13c	sub x13,x9,#0x10
008db140	sub x14,x12,#0x20
008db144	mov x19,x1
008db148	b.cc 0x008db760
008db14c	mov x15,x0
008db150	cmp w2,#0x12
008db154	ldrb w22,[x15], #0x1
008db158	lsr x20,x22,#0x4
008db15c	b.ge 0x008db174
008db160	mov x19,x1
008db164	cmp x20,#0xf
008db168	mov x8,x15
008db16c	b.eq 0x008db5a8
008db170	b 0x008db5dc
008db174	sub x17,x9,#0x11
008db178	sub x2,x9,#0xf
008db17c	sub x3,x12,#0x40
008db180	sub x4,x9,#0x40
008db184	adrp x5,0x364000
008db188	add x5,x5,#0xe30
008db18c	sub x6,x9,#0x6
008db190	adrp x7,0x364000
008db194	add x7,x7,#0xdd0
008db198	orr w21,wzr,#0x1010101
008db19c	mov x19,x1
008db1a0	mov x8,x0
008db1a4	b 0x008db1d4
008db1a8	ldr x20,[x16]
008db1ac	str x20,[x15]
008db1b0	ldr x20,[x16, #0x8]
008db1b4	str x20,[x15, #0x8]
008db1b8	ldrh w16,[x16, #0x10]
008db1bc	strh w16,[x15, #0x10]
008db1c0	mov x15,x8
008db1c4	ldrb w22,[x15], #0x1
008db1c8	cmp x15,x17
008db1cc	lsr x20,x22,#0x4
008db1d0	b.hi 0x008db164
008db1d4	cmp x20,#0xf
008db1d8	b.ne 0x008db234
008db1dc	cmp x15,x2
008db1e0	b.cs 0x008db500
008db1e4	ldrb w15,[x15]
008db1e8	add x8,x8,#0x2
008db1ec	cmp x15,#0xff
008db1f0	b.eq 0x008db318
008db1f4	add x20,x15,#0xf
008db1f8	cmn x8,x20
008db1fc	b.cs 0x008db520
008db200	add x15,x19,x20
008db204	cmp x15,x3
008db208	b.hi 0x008db5e0
008db20c	add x24,x8,x20
008db210	cmp x24,x4
008db214	b.hi 0x008db5e0
008db218	ldp q1,q0,[x8, #0x20]
008db21c	ldp q2,q3,[x8], #0x40
008db220	stp q1,q0,[x19, #0x20]
008db224	stp q2,q3,[x19], #0x40
008db228	cmp x19,x15
008db22c	b.cc 0x008db218
008db230	b 0x008db244
008db234	ldr q0,[x15]
008db238	add x24,x15,x20
008db23c	add x15,x19,x20
008db240	str q0,[x19]
008db244	mov x8,x24
008db248	and x19,x22,#0xf
008db24c	ldrh w23,[x8], #0x2
008db250	cmp x19,#0xf
008db254	sub x16,x15,x23
008db258	b.ne 0x008db290
008db25c	cmp x8,x6
008db260	b.cs 0x008db520
008db264	ldrb w19,[x24, #0x2]
008db268	add x8,x24,#0x3
008db26c	cmp x19,#0xff
008db270	b.eq 0x008db33c
008db274	add x20,x19,#0x13
008db278	cmn x15,x20
008db27c	b.cs 0x008db520
008db280	add x19,x15,x20
008db284	cmp x19,x3
008db288	b.cc 0x008db2b0
008db28c	b 0x008db6d8
008db290	add x20,x19,#0x4
008db294	add x19,x15,x20
008db298	cmp x19,x3
008db29c	b.cs 0x008db6d8
008db2a0	cmp x16,x10
008db2a4	b.cc 0x008db2b0
008db2a8	cmp w23,#0x8
008db2ac	b.cs 0x008db1a8
008db2b0	cmp x16,x10
008db2b4	b.cc 0x008db520
008db2b8	cmp w23,#0xf
008db2bc	add x19,x15,x20
008db2c0	b.ls 0x008db360
008db2c4	cmp w23,#0x3f
008db2c8	neg x16,x23
008db2cc	b.ls 0x008db2f0
008db2d0	add x20,x15,x16
008db2d4	ldp q1,q0,[x20, #0x20]
008db2d8	ldp q2,q3,[x20]
008db2dc	stp q1,q0,[x15, #0x20]
008db2e0	stp q2,q3,[x15], #0x40
008db2e4	cmp x15,x19
008db2e8	b.cc 0x008db2d0
008db2ec	b 0x008db1c0
008db2f0	add x16,x15,x16
008db2f4	add x16,x16,#0x10
008db2f8	ldur q0,[x16, #-0x10]
008db2fc	str q0,[x15]
008db300	ldr q0,[x16], #0x20
008db304	str q0,[x15, #0x10]
008db308	add x15,x15,#0x20
008db30c	cmp x15,x19
008db310	b.cc 0x008db2f8
008db314	b 0x008db1c0
008db318	cmp x8,x2
008db31c	b.cs 0x008db520
008db320	ldrb w16,[x8], #0x1
008db324	cmp x16,#0xff
008db328	add x15,x15,x16
008db32c	b.eq 0x008db318
008db330	cmn x15,#0x1
008db334	b.ne 0x008db1f4
008db338	b 0x008db520
008db33c	cmp x8,x6
008db340	b.cs 0x008db520
008db344	ldrb w20,[x8], #0x1
008db348	cmp x20,#0xff
008db34c	add x19,x19,x20
008db350	b.eq 0x008db33c
008db354	cmn x19,#0x1
008db358	b.ne 0x008db274
008db35c	b 0x008db520
008db360	cmp w23,#0x4
008db364	b.eq 0x008db398
008db368	cmp w23,#0x2
008db36c	b.eq 0x008db388
008db370	cmp w23,#0x1
008db374	b.ne 0x008db424
008db378	ldrb w22,[x16]
008db37c	orr x16,x22,x22, LSL #0x8
008db380	mul w22,w22,w21
008db384	b 0x008db390
008db388	ldrh w16,[x16]
008db38c	orr w22,w16,w16, LSL #0x10
008db390	mov x23,x16
008db394	b 0x008db3a8
008db398	ldr w22,[x16]
008db39c	lsr w23,w22,#0x10
008db3a0	and x16,x22,#0xffff
008db3a4	mov w23,w23
008db3a8	orr x16,x16,x23, LSL #0x10
008db3ac	cmp x20,#0x9
008db3b0	orr x16,x16,x22, LSL #0x20
008db3b4	str x16,[x15]
008db3b8	b.cc 0x008db1c0
008db3bc	add x20,x20,x15
008db3c0	add x22,x15,#0x10
008db3c4	cmp x20,x22
008db3c8	csel x20,x20,x22,hi
008db3cc	sub x20,x20,x15
008db3d0	sub x22,x20,#0x9
008db3d4	add x20,x15,#0x8
008db3d8	cmp x22,#0x18
008db3dc	b.cc 0x008db414
008db3e0	lsr x22,x22,#0x3
008db3e4	dup v0.2D,x16
008db3e8	add x15,x15,#0x18
008db3ec	add x22,x22,#0x1
008db3f0	and x23,x22,#0x3ffffffffffffffc
008db3f4	add x20,x20,x23, LSL #0x3
008db3f8	mov x24,x23
008db3fc	subs x24,x24,#0x4
008db400	stp q0,q0,[x15, #-0x10]
008db404	add x15,x15,#0x20
008db408	b.ne 0x008db3fc
008db40c	cmp x22,x23
008db410	b.eq 0x008db1c0
008db414	str x16,[x20], #0x8
008db418	cmp x20,x19
008db41c	b.cc 0x008db414
008db420	b 0x008db1c0
008db424	cmp w23,#0x7
008db428	b.hi 0x008db45c
008db42c	str wzr,[x15]
008db430	ldrh w22,[x16]
008db434	strh w22,[x15]
008db438	ldrh w22,[x16, #0x2]
008db43c	strh w22,[x15, #0x2]
008db440	ldr w22,[x5, x23, LSL #0x2]
008db444	add x16,x16,x22
008db448	ldr w22,[x16]
008db44c	str w22,[x15, #0x4]
008db450	ldrsw x22,[x7, x23, LSL #0x2]
008db454	sub x16,x16,x22
008db458	b 0x008db464
008db45c	ldr x22,[x16], #0x8
008db460	str x22,[x15]
008db464	add x20,x20,x15
008db468	add x22,x15,#0x10
008db46c	cmp x20,x22
008db470	csel x20,x20,x22,hi
008db474	sub x20,x20,x15
008db478	sub x22,x20,#0x9
008db47c	add x20,x15,#0x8
008db480	cmp x22,#0x18
008db484	b.cs 0x008db490
008db488	mov x22,x16
008db48c	b 0x008db4ec
008db490	sub x23,x15,x16
008db494	add x23,x23,#0x8
008db498	cmp x23,#0x20
008db49c	b.cs 0x008db4a8
008db4a0	mov x22,x16
008db4a4	b 0x008db4ec
008db4a8	lsr x22,x22,#0x3
008db4ac	add x15,x15,#0x18
008db4b0	add x23,x22,#0x1
008db4b4	and x24,x23,#0x3ffffffffffffffc
008db4b8	lsl x25,x24,#0x3
008db4bc	add x22,x16,x25
008db4c0	add x20,x20,x25
008db4c4	add x16,x16,#0x10
008db4c8	mov x25,x24
008db4cc	ldp q0,q1,[x16, #-0x10]
008db4d0	subs x25,x25,#0x4
008db4d4	add x16,x16,#0x20
008db4d8	stp q0,q1,[x15, #-0x10]
008db4dc	add x15,x15,#0x20
008db4e0	b.ne 0x008db4cc
008db4e4	cmp x23,x24
008db4e8	b.eq 0x008db1c0
008db4ec	ldr x15,[x22], #0x8
008db4f0	str x15,[x20], #0x8
008db4f4	cmp x20,x19
008db4f8	b.cc 0x008db4ec
008db4fc	b 0x008db1c0
008db500	mov x8,x15
008db504	b 0x008db520
008db508	cmp w2,#0x1
008db50c	b.ne 0x008db7ec
008db510	ldrb w8,[x0]
008db514	cmp w8,#0x0
008db518	csetm w8,ne
008db51c	b 0x008db7ec
008db520	mvn w8,w8
008db524	add w8,w8,w0
008db528	b 0x008db7ec
008db52c	cmp x8,x13
008db530	b.cs 0x008db5dc
008db534	cmp x19,x14
008db538	b.hi 0x008db5dc
008db53c	ldr q0,[x8]
008db540	add x17,x8,x20
008db544	and x2,x22,#0xf
008db548	mov x8,x17
008db54c	add x15,x19,x20
008db550	cmp x2,#0xf
008db554	str q0,[x19]
008db558	ldrh w23,[x8], #0x2
008db55c	sub x16,x15,x23
008db560	b.eq 0x008db694
008db564	cmp w23,#0x8
008db568	b.cc 0x008db694
008db56c	cmp x16,x10
008db570	b.cc 0x008db694
008db574	ldr x8,[x16]
008db578	str x8,[x15]
008db57c	ldr x8,[x16, #0x8]
008db580	str x8,[x15, #0x8]
008db584	ldrh w8,[x16, #0x10]
008db588	strh w8,[x15, #0x10]
008db58c	add x8,x15,x2
008db590	ldrb w22,[x17, #0x2]
008db594	add x19,x8,#0x4
008db598	add x8,x17,#0x3
008db59c	lsr x20,x22,#0x4
008db5a0	cmp x20,#0xf
008db5a4	b.ne 0x008db52c
008db5a8	sub x16,x9,#0xf
008db5ac	cmp x8,x16
008db5b0	b.cs 0x008db520
008db5b4	ldrb w15,[x8], #0x1
008db5b8	cmp x15,#0xff
008db5bc	b.eq 0x008db808
008db5c0	add x20,x15,#0xf
008db5c4	cmn x19,x20
008db5c8	cset w16,cs
008db5cc	cmn x8,x20
008db5d0	cset w15,cs
008db5d4	tbnz w16,#0x0,0x008db520
008db5d8	tbnz w15,#0x0,0x008db520
008db5dc	add x15,x19,x20
008db5e0	sub x16,x12,#0xc
008db5e4	cmp x15,x16
008db5e8	b.hi 0x008db7bc
008db5ec	add x17,x8,x20
008db5f0	sub x16,x9,#0x8
008db5f4	cmp x17,x16
008db5f8	b.hi 0x008db7bc
008db5fc	add x16,x19,#0x8
008db600	mvn x2,x19
008db604	cmp x15,x16
008db608	csel x16,x15,x16,hi
008db60c	add x16,x16,x2
008db610	cmp x16,#0x18
008db614	b.cc 0x008db66c
008db618	sub x2,x19,x8
008db61c	cmp x2,#0x20
008db620	b.cc 0x008db66c
008db624	lsr x16,x16,#0x3
008db628	add x5,x19,#0x10
008db62c	add x3,x16,#0x1
008db630	and x4,x3,#0x3ffffffffffffffc
008db634	lsl x2,x4,#0x3
008db638	mov x6,x4
008db63c	add x16,x8,x2
008db640	add x2,x19,x2
008db644	add x8,x8,#0x10
008db648	ldp q0,q1,[x8, #-0x10]
008db64c	subs x6,x6,#0x4
008db650	add x8,x8,#0x20
008db654	stp q0,q1,[x5, #-0x10]
008db658	add x5,x5,#0x20
008db65c	b.ne 0x008db648
008db660	cmp x3,x4
008db664	b.ne 0x008db674
008db668	b 0x008db684
008db66c	mov x16,x8
008db670	mov x2,x19
008db674	ldr x8,[x16], #0x8
008db678	str x8,[x2], #0x8
008db67c	cmp x2,x15
008db680	b.cc 0x008db674
008db684	ldrh w23,[x17], #0x2
008db688	and x2,x22,#0xf
008db68c	mov x8,x17
008db690	sub x16,x15,x23
008db694	cmp x2,#0xf
008db698	b.ne 0x008db6d4
008db69c	sub x2,x9,#0x6
008db6a0	cmp x8,x2
008db6a4	b.cs 0x008db520
008db6a8	ldrb w17,[x8], #0x1
008db6ac	cmp x17,#0xff
008db6b0	b.eq 0x008db82c
008db6b4	add x2,x17,#0xf
008db6b8	cmn x15,x2
008db6bc	cset w3,cs
008db6c0	cmn x17,#0x1
008db6c4	mov w17,#0xf
008db6c8	csel x2,x17,x2,eq
008db6cc	b.eq 0x008db520
008db6d0	tbnz w3,#0x0,0x008db520
008db6d4	add x20,x2,#0x4
008db6d8	cmp x16,x10
008db6dc	b.cc 0x008db520
008db6e0	cmp x23,#0x7
008db6e4	add x19,x15,x20
008db6e8	sub x17,x12,#0xc
008db6ec	b.ls 0x008db848
008db6f0	ldr x2,[x16], #0x8
008db6f4	str x2,[x15]
008db6f8	cmp x19,x17
008db6fc	add x2,x15,#0x8
008db700	b.hi 0x008db898
008db704	ldr x17,[x16]
008db708	cmp x20,#0x11
008db70c	str x17,[x2]
008db710	b.cc 0x008db760
008db714	add x17,x20,x15
008db718	add x2,x15,#0x18
008db71c	cmp x17,x2
008db720	csel x17,x17,x2,hi
008db724	sub x17,x17,x15
008db728	sub x2,x17,#0x11
008db72c	add x17,x15,#0x10
008db730	cmp x2,#0x28
008db734	b.cc 0x008db748
008db738	sub x3,x15,x16
008db73c	add x3,x3,#0x8
008db740	cmp x3,#0x20
008db744	b.cs 0x008db774
008db748	mov x2,x16
008db74c	add x15,x2,#0x8
008db750	ldr x16,[x15], #0x8
008db754	str x16,[x17], #0x8
008db758	cmp x17,x19
008db75c	b.cc 0x008db750
008db760	ldrb w22,[x8], #0x1
008db764	lsr x20,x22,#0x4
008db768	cmp x20,#0xf
008db76c	b.ne 0x008db52c
008db770	b 0x008db5a8
008db774	lsr x2,x2,#0x3
008db778	add x15,x15,#0x20
008db77c	add x3,x2,#0x1
008db780	and x4,x3,#0x3ffffffffffffffc
008db784	lsl x5,x4,#0x3
008db788	add x2,x16,x5
008db78c	add x17,x17,x5
008db790	add x16,x16,#0x18
008db794	mov x5,x4
008db798	ldp q0,q1,[x16, #-0x10]
008db79c	subs x5,x5,#0x4
008db7a0	add x16,x16,#0x20
008db7a4	stp q0,q1,[x15, #-0x10]
008db7a8	add x15,x15,#0x20
008db7ac	b.ne 0x008db798
008db7b0	cmp x3,x4
008db7b4	b.eq 0x008db760
008db7b8	b 0x008db74c
008db7bc	add x10,x8,x20
008db7c0	cmp x10,x9
008db7c4	b.ne 0x008db520
008db7c8	cmp x15,x12
008db7cc	b.hi 0x008db520
008db7d0	mov x0,x19
008db7d4	mov x21,x1
008db7d8	mov x1,x8
008db7dc	mov x2,x20
008db7e0	bl 0x00c2ff60
008db7e4	add w8,w19,w20
008db7e8	sub w8,w8,w21
008db7ec	mov w0,w8
008db7f0	ldp x20,x19,[sp, #0x40]
008db7f4	ldr x25,[sp, #0x10]
008db7f8	ldp x22,x21,[sp, #0x30]
008db7fc	ldp x24,x23,[sp, #0x20]
008db800	ldp x29,x30,[sp], #0x50
008db804	ret
008db808	cmp x8,x16
008db80c	b.cs 0x008db520
008db810	ldrb w17,[x8], #0x1
008db814	cmp x17,#0xff
008db818	add x15,x15,x17
008db81c	b.eq 0x008db808
008db820	cmn x15,#0x1
008db824	b.ne 0x008db5c0
008db828	b 0x008db520
008db82c	cmp x8,x2
008db830	b.cs 0x008db520
008db834	ldrb w3,[x8], #0x1
008db838	cmp x3,#0xff
008db83c	add x17,x17,x3
008db840	b.eq 0x008db82c
008db844	b 0x008db6b4
008db848	str wzr,[x15]
008db84c	ldrb w2,[x16]
008db850	strb w2,[x15]
008db854	ldrb w2,[x16, #0x1]
008db858	strb w2,[x15, #0x1]
008db85c	ldrb w2,[x16, #0x2]
008db860	strb w2,[x15, #0x2]
008db864	ldrb w2,[x16, #0x3]
008db868	strb w2,[x15, #0x3]
008db86c	adrp x2,0x364000
008db870	add x2,x2,#0xe30
008db874	ldr w2,[x2, x23, LSL #0x2]
008db878	add x16,x16,x2
008db87c	ldr w2,[x16]
008db880	str w2,[x15, #0x4]
008db884	adrp x2,0x364000
008db888	add x2,x2,#0xdd0
008db88c	ldrsw x2,[x2, x23, LSL #0x2]
008db890	sub x16,x16,x2
008db894	b 0x008db6f8
008db898	sub x17,x12,#0x5
008db89c	cmp x19,x17
008db8a0	b.hi 0x008db520
008db8a4	sub x17,x12,#0x7
008db8a8	cmp x2,x17
008db8ac	b.cs 0x008db8e0
008db8b0	add x3,x1,x11
008db8b4	add x4,x15,#0x10
008db8b8	sub x3,x3,#0x7
008db8bc	cmp x3,x4
008db8c0	csel x3,x3,x4,hi
008db8c4	sub x3,x3,x15
008db8c8	sub x5,x3,#0x9
008db8cc	cmp x5,#0x28
008db8d0	b.cs 0x008db8ec
008db8d4	mov x3,x16
008db8d8	mov x4,x2
008db8dc	b 0x008db948
008db8e0	mov x3,x16
008db8e4	mov x17,x2
008db8e8	b 0x008db960
008db8ec	sub x3,x15,x16
008db8f0	mov x4,x2
008db8f4	add x3,x3,#0x8
008db8f8	cmp x3,#0x20
008db8fc	mov x3,x16
008db900	b.cc 0x008db948
008db904	lsr x3,x5,#0x3
008db908	add x7,x15,#0x18
008db90c	add x21,x16,#0x10
008db910	add x5,x3,#0x1
008db914	and x6,x5,#0x3ffffffffffffffc
008db918	lsl x4,x6,#0x3
008db91c	mov x22,x6
008db920	add x3,x16,x4
008db924	add x4,x2,x4
008db928	ldp q0,q1,[x21, #-0x10]
008db92c	subs x22,x22,#0x4
008db930	add x21,x21,#0x20
008db934	stp q0,q1,[x7, #-0x10]
008db938	add x7,x7,#0x20
008db93c	b.ne 0x008db928
008db940	cmp x5,x6
008db944	b.eq 0x008db958
008db948	ldr x5,[x3], #0x8
008db94c	str x5,[x4], #0x8
008db950	cmp x4,x17
008db954	b.cc 0x008db948
008db958	sub x2,x17,x2
008db95c	add x3,x16,x2
008db960	cmp x17,x19
008db964	b.cs 0x008db760
008db968	add x2,x1,x11
008db96c	add x4,x15,#0x8
008db970	add x5,x20,x15
008db974	sub x2,x2,#0x7
008db978	cmp x2,x4
008db97c	csel x4,x2,x4,hi
008db980	sub x2,x5,x4
008db984	cmp x2,#0x8
008db988	b.cc 0x008db99c
008db98c	sub x5,x15,x16
008db990	add x5,x5,#0x8
008db994	cmp x5,#0x20
008db998	b.cs 0x008db9b8
008db99c	mov x6,x17
008db9a0	mov x7,x3
008db9a4	ldrb w15,[x7], #0x1
008db9a8	strb w15,[x6], #0x1
008db9ac	cmp x6,x19
008db9b0	b.cc 0x008db9a4
008db9b4	b 0x008db760
008db9b8	cmp x2,#0x20
008db9bc	mov x5,xzr
008db9c0	b.cc 0x008dba0c
008db9c4	sub x6,x4,x15
008db9c8	and x5,x2,#-0x20
008db9cc	add x7,x17,#0x10
008db9d0	add x6,x6,x16
008db9d4	mov x20,x5
008db9d8	add x6,x6,#0x8
008db9dc	ldp q0,q1,[x6, #-0x10]
008db9e0	subs x20,x20,#0x20
008db9e4	add x6,x6,#0x20
008db9e8	stp q0,q1,[x7, #-0x10]
008db9ec	add x7,x7,#0x20
008db9f0	b.ne 0x008db9dc
008db9f4	cmp x2,x5
008db9f8	b.eq 0x008db760
008db9fc	tst x2,#0x18
008dba00	add x6,x17,x5
008dba04	add x7,x3,x5
008dba08	b.eq 0x008db9a4
008dba0c	add x6,x5,x4
008dba10	and x4,x2,#-0x8
008dba14	sub x15,x6,x15
008dba18	add x6,x17,x4
008dba1c	add x7,x3,x4
008dba20	add x15,x15,x16
008dba24	add x16,x17,x5
008dba28	sub x17,x5,x4
008dba2c	sub x15,x15,#0x8
008dba30	ldr d0,[x15], #0x8
008dba34	adds x17,x17,#0x8
008dba38	str d0,[x16], #0x8
008dba3c	b.ne 0x008dba30
008dba40	cmp x2,x4
008dba44	b.ne 0x008db9a4
008dba48	b 0x008db760
