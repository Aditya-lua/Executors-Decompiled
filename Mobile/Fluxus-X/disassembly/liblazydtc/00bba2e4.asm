; FUN_00bba2e4 @ 00bba2e4
00bba2e4	cmp x2,#0x2
00bba2e8	b.cs 0x00bba2f4
00bba2ec	mov x0,#-0x14
00bba2f0	ret
00bba2f4	stp x29,x30,[sp, #-0x40]!
00bba2f8	stp x24,x23,[sp, #0x10]
00bba2fc	stp x22,x21,[sp, #0x20]
00bba300	stp x20,x19,[sp, #0x30]
00bba304	mov x29,sp
00bba308	add x21,x0,#0x7, LSL #12
00bba30c	ldrb w11,[x1]
00bba310	ldr w9,[x21, #0x5e0]
00bba314	and w22,w11,#0x3
00bba318	cbz w9,0x00bba36c
00bba31c	ldr w10,[x21, #0x4f8]
00bba320	cmp w22,#0x1
00bba324	b.gt 0x00bba378
00bba328	ubfx w12,w11,#0x2,#0x2
00bba32c	cmp x10,x4
00bba330	csel x8,x10,x4,cc
00bba334	cmp w12,#0x1
00bba338	cbnz w22,0x00bba3dc
00bba33c	b.eq 0x00bba40c
00bba340	cmp w12,#0x3
00bba344	b.ne 0x00bba43c
00bba348	cmp x2,#0x2
00bba34c	b.eq 0x00bba4d8
00bba350	ldrh w11,[x1]
00bba354	ldrb w12,[x1, #0x2]
00bba358	orr x11,x11,x12, LSL #0x10
00bba35c	lsr x19,x11,#0x4
00bba360	mov w11,#0x3
00bba364	cbz x3,0x00bba448
00bba368	b 0x00bba44c
00bba36c	mov w10,#0x20000
00bba370	cmp w22,#0x1
00bba374	b.le 0x00bba328
00bba378	cmp w22,#0x2
00bba37c	b.eq 0x00bba388
00bba380	ldr w8,[x21, #0x530]
00bba384	cbz w8,0x00bba404
00bba388	cmp x2,#0x5
00bba38c	b.cc 0x00bba4d8
00bba390	ldr w8,[x21, #0x614]
00bba394	ubfx w11,w11,#0x2,#0x2
00bba398	cmp x10,x4
00bba39c	csel x14,x10,x4,cc
00bba3a0	cmp w8,#0x0
00bba3a4	ldr w8,[x1]
00bba3a8	cset w13,ne
00bba3ac	cmp w11,#0x2
00bba3b0	b.eq 0x00bba494
00bba3b4	cmp w11,#0x3
00bba3b8	b.ne 0x00bba4a8
00bba3bc	lsr w11,w8,#0x16
00bba3c0	ldrb w12,[x1, #0x4]
00bba3c4	ubfx w15,w8,#0x4,#0x12
00bba3c8	mov w11,w11
00bba3cc	orr x8,x11,x12, LSL #0xa
00bba3d0	mov w12,#0x1
00bba3d4	mov w11,#0x5
00bba3d8	b 0x00bba4bc
00bba3dc	b.eq 0x00bba420
00bba3e0	cmp w12,#0x3
00bba3e4	b.ne 0x00bba468
00bba3e8	cmp x2,#0x4
00bba3ec	b.cc 0x00bba4d8
00bba3f0	ldrh w11,[x1]
00bba3f4	ldrb w12,[x1, #0x2]
00bba3f8	mov w20,#0x3
00bba3fc	orr x11,x11,x12, LSL #0x10
00bba400	b 0x00bba430
00bba404	mov x0,#-0x1e
00bba408	b 0x00bba4dc
00bba40c	ldrh w11,[x1]
00bba410	lsr x19,x11,#0x4
00bba414	mov w11,#0x2
00bba418	cbz x3,0x00bba448
00bba41c	b 0x00bba44c
00bba420	cmp x2,#0x2
00bba424	b.eq 0x00bba4d8
00bba428	ldrh w11,[x1]
00bba42c	mov w20,#0x2
00bba430	lsr x19,x11,#0x4
00bba434	cbz x3,0x00bba474
00bba438	b 0x00bba478
00bba43c	lsr x19,x11,#0x3
00bba440	mov w11,#0x1
00bba444	cbnz x3,0x00bba44c
00bba448	cbnz x19,0x00bba4c4
00bba44c	cmp x19,x10
00bba450	b.hi 0x00bba4d8
00bba454	cmp x4,x19
00bba458	b.cc 0x00bba4c4
00bba45c	cbz w9,0x00bba528
00bba460	ldr w10,[x21, #0x4f8]
00bba464	b 0x00bba52c
00bba468	lsr w19,w11,#0x3
00bba46c	mov w20,#0x1
00bba470	cbnz x3,0x00bba478
00bba474	cbnz x19,0x00bba4c4
00bba478	cmp x19,x10
00bba47c	b.hi 0x00bba4d8
00bba480	cmp x4,x19
00bba484	b.cc 0x00bba4c4
00bba488	cbz w9,0x00bba610
00bba48c	ldr w9,[x21, #0x4f8]
00bba490	b 0x00bba614
00bba494	ubfx w15,w8,#0x4,#0xe
00bba498	lsr x8,x8,#0x12
00bba49c	mov w12,#0x1
00bba4a0	mov w11,#0x4
00bba4a4	b 0x00bba4bc
00bba4a8	cmp w11,#0x0
00bba4ac	ubfx w15,w8,#0x4,#0xa
00bba4b0	ubfx x8,x8,#0xe,#0xa
00bba4b4	cset w12,ne
00bba4b8	mov w11,#0x3
00bba4bc	cbnz x3,0x00bba4cc
00bba4c0	cbz w15,0x00bba4cc
00bba4c4	mov x0,#-0x46
00bba4c8	b 0x00bba4dc
00bba4cc	mov w19,w15
00bba4d0	cmp x10,x19
00bba4d4	b.cs 0x00bba4f0
00bba4d8	mov x0,#-0x14
00bba4dc	ldp x20,x19,[sp, #0x30]
00bba4e0	ldp x22,x21,[sp, #0x20]
00bba4e4	ldp x24,x23,[sp, #0x10]
00bba4e8	ldp x29,x30,[sp], #0x40
00bba4ec	ret
00bba4f0	cmp w19,#0x6
00bba4f4	csel w10,wzr,w12,cs
00bba4f8	tbz w10,#0x0,0x00bba504
00bba4fc	mov x0,#-0x18
00bba500	b 0x00bba4dc
00bba504	add x10,x11,x8
00bba508	cmp x10,x2
00bba50c	b.hi 0x00bba4d8
00bba510	cmp x14,x19
00bba514	b.cc 0x00bba4c4
00bba518	mov x23,x10
00bba51c	cbz w9,0x00bba6fc
00bba520	ldr w9,[x21, #0x4f8]
00bba524	b 0x00bba700
00bba528	mov w10,#0x20000
00bba52c	cbnz w5,0x00bba554
00bba530	add x9,x19,x10
00bba534	add x9,x9,#0x40
00bba538	cmp x4,x9
00bba53c	b.ls 0x00bba554
00bba540	add x8,x3,x10
00bba544	mov w9,wzr
00bba548	mov w10,#0x1
00bba54c	add x8,x8,#0x20
00bba550	b 0x00bba56c
00bba554	cmp x19,#0x10, LSL #12
00bba558	b.hi 0x00bba578
00bba55c	mov w8,#0x76a4
00bba560	mov w9,wzr
00bba564	mov w10,wzr
00bba568	add x8,x0,x8
00bba56c	str x8,[x0, #0x7690]
00bba570	add x12,x8,x19
00bba574	b 0x00bba59c
00bba578	add x8,x3,x8
00bba57c	mov w9,#0xffe0
00bba580	mov w10,#0x2
00bba584	sub x8,x8,x19
00bba588	add x8,x8,x9
00bba58c	add x9,x8,x19
00bba590	str x8,[x0, #0x7690]
00bba594	sub x12,x9,#0x10, LSL #12
00bba598	mov w9,#0x1
00bba59c	add x13,x11,x19
00bba5a0	str x12,[x0, #0x7698]
00bba5a4	mov x22,x13
00bba5a8	add x13,x13,#0x20
00bba5ac	str w10,[x21, #0x6a0]
00bba5b0	cmp x13,x2
00bba5b4	b.ls 0x00bba5f4
00bba5b8	cmp x22,x2
00bba5bc	b.hi 0x00bba4d8
00bba5c0	mov x23,x0
00bba5c4	add x20,x1,x11
00bba5c8	cbz w9,0x00bba6d8
00bba5cc	sub x21,x19,#0x10, LSL #12
00bba5d0	mov x0,x8
00bba5d4	mov x1,x20
00bba5d8	mov x2,x21
00bba5dc	bl 0x00c2ffd0
00bba5e0	mov w8,#0x76a4
00bba5e4	add x1,x21,x20
00bba5e8	mov w2,#0x10000
00bba5ec	add x0,x23,x8
00bba5f0	b 0x00bba6e4
00bba5f4	add x8,x1,x11
00bba5f8	str x19,[x0, #0x75c8]
00bba5fc	str x8,[x0, #0x75a8]
00bba600	add x8,x8,x19
00bba604	str x8,[x0, #0x7698]
00bba608	str wzr,[x21, #0x6a0]
00bba60c	b 0x00bba6f4
00bba610	mov w9,#0x20000
00bba614	cbnz w5,0x00bba638
00bba618	add x10,x19,x9
00bba61c	add x10,x10,#0x40
00bba620	cmp x4,x10
00bba624	b.ls 0x00bba638
00bba628	add x8,x3,x9
00bba62c	mov w9,#0x1
00bba630	add x8,x8,#0x20
00bba634	b 0x00bba64c
00bba638	subs x2,x19,#0x10, LSL #12
00bba63c	b.hi 0x00bba670
00bba640	mov w8,#0x76a4
00bba644	mov w9,wzr
00bba648	add x8,x0,x8
00bba64c	add x10,x8,x19
00bba650	str x8,[x0, #0x7690]
00bba654	mov x22,x0
00bba658	str x10,[x0, #0x7698]
00bba65c	mov x0,x8
00bba660	mov x2,x19
00bba664	str w9,[x21, #0x6a0]
00bba668	ldrb w1,[x1, x20]
00bba66c	b 0x00bba6c0
00bba670	add x8,x3,x8
00bba674	mov w9,#0xffe0
00bba678	mov w10,#0x2
00bba67c	sub x8,x8,x19
00bba680	str w10,[x21, #0x6a0]
00bba684	mov x21,x0
00bba688	add x8,x8,x9
00bba68c	mov x22,x1
00bba690	add x9,x2,x8
00bba694	str x8,[x0, #0x7690]
00bba698	str x9,[x0, #0x7698]
00bba69c	mov x0,x8
00bba6a0	ldrb w9,[x1, x20]
00bba6a4	mov w1,w9
00bba6a8	bl 0x00c301c0
00bba6ac	ldrb w1,[x22, x20]
00bba6b0	mov w8,#0x76a4
00bba6b4	mov x22,x21
00bba6b8	add x0,x21,x8
00bba6bc	mov w2,#0x10000
00bba6c0	bl 0x00c301c0
00bba6c4	ldr x8,[x22, #0x7690]
00bba6c8	str x19,[x22, #0x75c8]
00bba6cc	add x0,x20,#0x1
00bba6d0	str x8,[x22, #0x75a8]
00bba6d4	b 0x00bba4dc
00bba6d8	mov x0,x8
00bba6dc	mov x1,x20
00bba6e0	mov x2,x19
00bba6e4	bl 0x00c2ffd0
00bba6e8	ldr x8,[x23, #0x7690]
00bba6ec	str x19,[x23, #0x75c8]
00bba6f0	str x8,[x23, #0x75a8]
00bba6f4	mov x0,x22
00bba6f8	b 0x00bba4dc
00bba6fc	mov w9,#0x20000
00bba700	cbnz w5,0x00bba724
00bba704	add x10,x19,x9
00bba708	add x10,x10,#0x40
00bba70c	cmp x4,x10
00bba710	b.ls 0x00bba724
00bba714	add x9,x3,x9
00bba718	mov w10,#0x1
00bba71c	add x9,x9,#0x20
00bba720	b 0x00bba738
00bba724	cmp w19,#0x10, LSL #12
00bba728	b.hi 0x00bba744
00bba72c	mov w9,#0x76a4
00bba730	mov w10,wzr
00bba734	add x9,x0,x9
00bba738	str x9,[x0, #0x7690]
00bba73c	add x14,x9,x19
00bba740	b 0x00bba754
00bba744	add x14,x3,x14
00bba748	mov w10,#0x2
00bba74c	sub x9,x14,x19
00bba750	str x9,[x0, #0x7690]
00bba754	ldr w15,[x21, #0x5fc]
00bba758	lsl w7,w13,#0x4
00bba75c	str x14,[x0, #0x7698]
00bba760	str w10,[x21, #0x6a0]
00bba764	cbz w15,0x00bba790
00bba768	cmp w19,#0x301
00bba76c	b.cc 0x00bba790
00bba770	ldr x10,[x0, #0x18]
00bba774	mov x13,xzr
00bba778	lsr x14,x13,#0x2
00bba77c	add x15,x13,#0x40
00bba780	prfm PLDL2KEEP,[x10, x13#0x0]
00bba784	mov x13,x15
00bba788	cmp x14,#0xff1
00bba78c	b.cc 0x00bba778
00bba790	cmp w22,#0x3
00bba794	b.ne 0x00bba7c0
00bba798	ldr x4,[x0, #0x18]
00bba79c	mov x24,x0
00bba7a0	add x2,x1,x11
00bba7a4	mov x0,x9
00bba7a8	mov x1,x19
00bba7ac	mov x3,x8
00bba7b0	mov w5,w7
00bba7b4	tbz w12,#0x0,0x00bba7f8
00bba7b8	bl 0x00c43550
00bba7bc	b 0x00bba828
00bba7c0	mov w13,#0x2838
00bba7c4	mov w10,#0x6abc
00bba7c8	tbz w12,#0x0,0x00bba800
00bba7cc	mov x12,x0
00bba7d0	add x0,x0,x13
00bba7d4	add x3,x1,x11
00bba7d8	add x5,x12,x10
00bba7dc	mov x1,x9
00bba7e0	mov x2,x19
00bba7e4	mov x4,x8
00bba7e8	mov w6,#0xa00
00bba7ec	mov x24,x12
00bba7f0	bl 0x00c43560
00bba7f4	b 0x00bba828
00bba7f8	bl 0x00c43540
00bba7fc	b 0x00bba828
00bba800	mov x12,x0
00bba804	add x0,x0,x13
00bba808	add x3,x1,x11
00bba80c	add x5,x12,x10
00bba810	mov x1,x9
00bba814	mov x2,x19
00bba818	mov x4,x8
00bba81c	mov w6,#0xa00
00bba820	mov x24,x12
00bba824	bl 0x00c43530
00bba828	ldr w8,[x21, #0x6a0]
00bba82c	mov x20,x0
00bba830	cmp w8,#0x2
00bba834	b.ne 0x00bba878
00bba838	ldr x8,[x24, #0x7698]
00bba83c	mov w9,#0x76a4
00bba840	mov w2,#0x10000
00bba844	add x0,x24,x9
00bba848	sub x1,x8,#0x10, LSL #12
00bba84c	bl 0x00c2ffd0
00bba850	ldr x1,[x24, #0x7690]
00bba854	mov w8,#0xffe0
00bba858	sub x2,x19,#0x10, LSL #12
00bba85c	add x0,x1,x8
00bba860	bl 0x00c2ff60
00bba864	adrp x8,0x29c000
00bba868	ldr q0,[x24, #0x7690]
00bba86c	ldr q1,[x8, #0x6a0]
00bba870	add v0.2D,v0.2D,v1.2D
00bba874	str q0,[x24, #0x7690]
00bba878	cmn x20,#0x78
00bba87c	b.hi 0x00bba4d8
00bba880	ldr x8,[x24, #0x7690]
00bba884	mov x0,x23
00bba888	mov w9,#0x1
00bba88c	cmp w22,#0x2
00bba890	str x19,[x24, #0x75c8]
00bba894	str x8,[x24, #0x75a8]
00bba898	str w9,[x21, #0x530]
00bba89c	b.ne 0x00bba4dc
00bba8a0	mov w8,#0x2838
00bba8a4	add x8,x24,x8
00bba8a8	str x8,[x24, #0x18]
00bba8ac	b 0x00bba4dc
