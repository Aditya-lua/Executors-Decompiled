; std::__ndk1::time_get<wchar_t,std::__ndk1::istreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>::do_get @ 00beb198
00beb198	paciasp
00beb19c	sub sp,sp,#0xa0
00beb1a0	stp x29,x30,[sp, #0x50]
00beb1a4	stp x26,x25,[sp, #0x60]
00beb1a8	stp x24,x23,[sp, #0x70]
00beb1ac	stp x22,x21,[sp, #0x80]
00beb1b0	stp x20,x19,[sp, #0x90]
00beb1b4	add x29,sp,#0x50
00beb1b8	mov x23,x0
00beb1bc	sub x8,x29,#0x20
00beb1c0	mov x0,x3
00beb1c4	mov w25,w6
00beb1c8	mov x19,x5
00beb1cc	mov x20,x4
00beb1d0	mov x22,x3
00beb1d4	mov x21,x2
00beb1d8	stur x1,[x29, #-0x18]
00beb1dc	str wzr,[x4]
00beb1e0	bl 0x00c30070
00beb1e4	adrp x26,0xcb5000
00beb1e8	ldr x26,[x26, #0xb98]
00beb1ec	ldur x24,[x29, #-0x20]
00beb1f0	stur x26,[x29, #-0x10]
00beb1f4	ldar x8,[x26]
00beb1f8	cmn x8,#0x1
00beb1fc	b.eq 0x00beb228
00beb200	sub x8,x29,#0x10
00beb204	mov x9,sp
00beb208	str x8,[sp]
00beb20c	stur x9,[x29, #-0x8]
00beb210	adrp x0,0xcb5000
00beb214	nop
00beb218	adr x2,0xc0bab0
00beb21c	ldr x0,[x0, #0xb98]
00beb220	sub x1,x29,#0x8
00beb224	bl 0x00c305d0
00beb228	ldp x8,x10,[x24, #0x10]
00beb22c	ldrsw x9,[x26, #0x8]
00beb230	sub x9,x9,#0x1
00beb234	sub x10,x10,x8
00beb238	cmp x9,x10, ASR #0x3
00beb23c	b.cs 0x00beb7ec
00beb240	ldr x24,[x8, x9, LSL #0x3]
00beb244	cbz x24,0x00beb7ec
00beb248	sub x0,x29,#0x20
00beb24c	bl 0x00c30090
00beb250	and w8,w25,#0xff
00beb254	sub w8,w8,#0x25
00beb258	cmp w8,#0x54
00beb25c	b.hi 0x00beb720
00beb260	adrp x9,0x78a000
00beb264	add x9,x9,#0x740
00beb268	adr x10,0xbeb278
00beb26c	ldrh w11,[x9, x8, LSL #0x1]
00beb270	add x10,x10,x11, LSL #0x2
00beb274	br x10
00beb278	bti j
00beb27c	ldr x8,[x23, #0x10]!
00beb280	mov x0,x23
00beb284	ldr x8,[x8, #0x8]
00beb288	blr x8
00beb28c	mov x22,x0
00beb290	sub x0,x29,#0x18
00beb294	mov x1,x21
00beb298	add x3,x22,#0x240
00beb29c	mov x2,x22
00beb2a0	mov x4,x24
00beb2a4	mov x5,x20
00beb2a8	mov w6,wzr
00beb2ac	bl 0x00bdede4
00beb2b0	sub x8,x0,x22
00beb2b4	cmp x8,#0x23f
00beb2b8	b.gt 0x00beb730
00beb2bc	asr x8,x8,#0x3
00beb2c0	orr x9,xzr,#-0x5555555555555556
00beb2c4	movk x9,#0xaaab
00beb2c8	mul x8,x8,x9
00beb2cc	orr x9,xzr,#-0x5555555555555556
00beb2d0	eor x9,x9,#-0x7fffffffffffffff
00beb2d4	smulh x9,x8,x9
00beb2d8	lsr x10,x9,#0x3f
00beb2dc	add w9,w10,w9, LSR #0x1
00beb2e0	mov w10,#0xc
00beb2e4	msub w8,w9,w10,w8
00beb2e8	str w8,[x19, #0x10]
00beb2ec	b 0x00beb730
00beb2f0	bti j
00beb2f4	sub x0,x29,#0x18
00beb2f8	mov x1,x21
00beb2fc	mov x2,x20
00beb300	mov x3,x24
00beb304	mov w4,#0x2
00beb308	bl 0x00bec028
00beb30c	ldr w8,[x20]
00beb310	sub w9,w0,#0x1
00beb314	cmp w9,#0x1e
00beb318	b.hi 0x00beb728
00beb31c	tbnz w8,#0x2,0x00beb728
00beb320	str w0,[x19, #0xc]
00beb324	b 0x00beb730
00beb328	bti j
00beb32c	ldr x8,[x23, #0x10]!
00beb330	mov x0,x23
00beb334	ldr x8,[x8]
00beb338	blr x8
00beb33c	mov x22,x0
00beb340	sub x0,x29,#0x18
00beb344	mov x1,x21
00beb348	add x3,x22,#0x150
00beb34c	mov x2,x22
00beb350	mov x4,x24
00beb354	mov x5,x20
00beb358	mov w6,wzr
00beb35c	bl 0x00bdede4
00beb360	sub x8,x0,x22
00beb364	cmp x8,#0x14f
00beb368	b.gt 0x00beb730
00beb36c	asr x8,x8,#0x3
00beb370	orr x9,xzr,#-0x5555555555555556
00beb374	movk x9,#0xaaab
00beb378	mul x8,x8,x9
00beb37c	mov x9,#0x4925
00beb380	movk x9,#0x2492, LSL #16
00beb384	movk x9,#0x9249, LSL #32
00beb388	movk x9,#0x4924, LSL #48
00beb38c	smulh x9,x8,x9
00beb390	lsr x10,x9,#0x3f
00beb394	lsr x9,x9,#0x1
00beb398	add w9,w9,w10
00beb39c	sub w9,w9,w9, LSL #0x3
00beb3a0	add w8,w8,w9
00beb3a4	str w8,[x19, #0x18]
00beb3a8	b 0x00beb730
00beb3ac	bti j
00beb3b0	sub x1,x29,#0x18
00beb3b4	mov x0,x23
00beb3b8	mov x2,x21
00beb3bc	mov x3,x20
00beb3c0	mov x4,x24
00beb3c4	bl 0x00c441d0
00beb3c8	b 0x00beb730
00beb3cc	bti j
00beb3d0	adrp x8,0x78a000
00beb3d4	add x8,x8,#0x818
00beb3d8	ldur x1,[x29, #-0x18]
00beb3dc	ldp q0,q1,[x8]
00beb3e0	ldur q2,[x8, #0x1c]
00beb3e4	mov x8,sp
00beb3e8	mov x6,sp
00beb3ec	add x7,x8,#0x2c
00beb3f0	stp q0,q1,[sp]
00beb3f4	stur q2,[sp, #0x1c]
00beb3f8	b 0x00beb614
00beb3fc	bti j
00beb400	mov x0,x23
00beb404	ldr x8,[x0, #0x10]!
00beb408	ldr x8,[x8, #0x30]
00beb40c	b 0x00beb484
00beb410	bti j
00beb414	sub x0,x29,#0x18
00beb418	mov x1,x21
00beb41c	mov x2,x20
00beb420	mov x3,x24
00beb424	mov w4,#0x4
00beb428	bl 0x00bec028
00beb42c	ldrb w8,[x20]
00beb430	tbnz w8,#0x2,0x00beb730
00beb434	sub w8,w0,#0x76c
00beb438	str w8,[x19, #0x14]
00beb43c	b 0x00beb730
00beb440	bti j
00beb444	sub x0,x29,#0x18
00beb448	mov x1,x21
00beb44c	mov x2,x20
00beb450	mov x3,x24
00beb454	mov w4,#0x2
00beb458	bl 0x00bec028
00beb45c	ldr w8,[x20]
00beb460	cmp w0,#0x3b
00beb464	b.gt 0x00beb728
00beb468	tbnz w8,#0x2,0x00beb728
00beb46c	str w0,[x19, #0x4]
00beb470	b 0x00beb730
00beb474	bti j
00beb478	mov x0,x23
00beb47c	ldr x8,[x0, #0x10]!
00beb480	ldr x8,[x8, #0x18]
00beb484	blr x8
00beb488	ldrb w8,[x0]
00beb48c	ldp x10,x9,[x0, #0x8]
00beb490	add x12,x0,#0x4
00beb494	ldur x1,[x29, #-0x18]
00beb498	lsr x11,x8,#0x1
00beb49c	tst w8,#0x1
00beb4a0	csel x6,x12,x9,eq
00beb4a4	csel x8,x11,x10,eq
00beb4a8	add x7,x6,x8, LSL #0x2
00beb4ac	b 0x00beb614
00beb4b0	bti j
00beb4b4	adrp x8,0x364000
00beb4b8	add x8,x8,#0xe70
00beb4bc	b 0x00beb5fc
00beb4c0	bti j
00beb4c4	sub x0,x29,#0x18
00beb4c8	mov x1,x21
00beb4cc	mov x2,x20
00beb4d0	mov x3,x24
00beb4d4	mov w4,#0x2
00beb4d8	bl 0x00bec028
00beb4dc	ldr w9,[x20]
00beb4e0	sub w8,w0,#0x1
00beb4e4	cmp w8,#0xb
00beb4e8	b.hi 0x00beb788
00beb4ec	tbnz w9,#0x2,0x00beb788
00beb4f0	str w8,[x19, #0x10]
00beb4f4	b 0x00beb730
00beb4f8	bti j
00beb4fc	adrp x8,0x364000
00beb500	add x8,x8,#0xdb0
00beb504	b 0x00beb5fc
00beb508	bti j
00beb50c	sub x0,x29,#0x18
00beb510	mov x1,x21
00beb514	mov x2,x20
00beb518	mov x3,x24
00beb51c	mov w4,#0x2
00beb520	bl 0x00bec028
00beb524	ldr w8,[x20]
00beb528	cmp w0,#0x17
00beb52c	b.le 0x00beb590
00beb530	b 0x00beb728
00beb534	bti j
00beb538	adrp x9,0x78a000
00beb53c	add x9,x9,#0x844
00beb540	mov w8,#0x4d
00beb544	ldr q0,[x9]
00beb548	str w8,[sp, #0x10]
00beb54c	ldur x1,[x29, #-0x18]
00beb550	mov x8,sp
00beb554	mov x6,sp
00beb558	str q0,[sp]
00beb55c	add x7,x8,#0x14
00beb560	b 0x00beb614
00beb564	bti j
00beb568	sub x0,x29,#0x18
00beb56c	mov x1,x21
00beb570	mov x2,x20
00beb574	mov x3,x24
00beb578	mov w4,#0x2
00beb57c	bl 0x00bec028
00beb580	ldr w8,[x20]
00beb584	sub w9,w0,#0x1
00beb588	cmp w9,#0xb
00beb58c	b.hi 0x00beb728
00beb590	tbnz w8,#0x2,0x00beb728
00beb594	str w0,[x19, #0x8]
00beb598	b 0x00beb730
00beb59c	bti j
00beb5a0	sub x1,x29,#0x18
00beb5a4	mov x0,x23
00beb5a8	mov x2,x21
00beb5ac	mov x3,x20
00beb5b0	mov x4,x24
00beb5b4	bl 0x00c441e0
00beb5b8	b 0x00beb730
00beb5bc	bti j
00beb5c0	sub x0,x29,#0x18
00beb5c4	mov x1,x21
00beb5c8	mov x2,x20
00beb5cc	mov x3,x24
00beb5d0	mov w4,#0x2
00beb5d4	bl 0x00bec028
00beb5d8	ldr w8,[x20]
00beb5dc	cmp w0,#0x3c
00beb5e0	b.gt 0x00beb728
00beb5e4	tbnz w8,#0x2,0x00beb728
00beb5e8	str w0,[x19]
00beb5ec	b 0x00beb730
00beb5f0	bti j
00beb5f4	adrp x8,0x364000
00beb5f8	add x8,x8,#0xd30
00beb5fc	ldp q0,q1,[x8]
00beb600	mov x8,sp
00beb604	ldur x1,[x29, #-0x18]
00beb608	mov x6,sp
00beb60c	add x7,x8,#0x20
00beb610	stp q0,q1,[sp]
00beb614	mov x0,x23
00beb618	mov x2,x21
00beb61c	mov x3,x22
00beb620	mov x4,x20
00beb624	mov x5,x19
00beb628	bl 0x00c441c0
00beb62c	stur x0,[x29, #-0x18]
00beb630	b 0x00beb730
00beb634	bti j
00beb638	sub x0,x29,#0x18
00beb63c	mov x1,x21
00beb640	mov x2,x20
00beb644	mov x3,x24
00beb648	mov w4,#0x4
00beb64c	bl 0x00bec028
00beb650	ldrb w8,[x20]
00beb654	tbnz w8,#0x2,0x00beb730
00beb658	add w8,w0,#0x76c
00beb65c	cmp w0,#0x64
00beb660	add w9,w0,#0x7d0
00beb664	csel w8,w8,w0,cc
00beb668	cmp w0,#0x45
00beb66c	csel w8,w9,w8,lt
00beb670	sub w8,w8,#0x76c
00beb674	str w8,[x19, #0x14]
00beb678	b 0x00beb730
00beb67c	bti j
00beb680	ldr x8,[x23]
00beb684	ldur x1,[x29, #-0x18]
00beb688	mov x0,x23
00beb68c	mov x2,x21
00beb690	mov x3,x22
00beb694	mov x4,x20
00beb698	ldr x8,[x8, #0x28]
00beb69c	mov x5,x19
00beb6a0	blr x8
00beb6a4	b 0x00beb734
00beb6a8	bti j
00beb6ac	sub x0,x29,#0x18
00beb6b0	mov x1,x21
00beb6b4	mov x2,x20
00beb6b8	mov x3,x24
00beb6bc	mov w4,#0x3
00beb6c0	bl 0x00bec028
00beb6c4	ldr w8,[x20]
00beb6c8	cmp w0,#0x16d
00beb6cc	b.gt 0x00beb728
00beb6d0	tbnz w8,#0x2,0x00beb728
00beb6d4	str w0,[x19, #0x1c]
00beb6d8	b 0x00beb730
00beb6dc	bti j
00beb6e0	ldr x8,[x23, #0x10]!
00beb6e4	mov x0,x23
00beb6e8	ldr x8,[x8, #0x10]
00beb6ec	blr x8
00beb6f0	ldrb w8,[x0]
00beb6f4	ldrb w9,[x0, #0x18]
00beb6f8	ldr x10,[x0, #0x8]
00beb6fc	lsr x11,x8,#0x1
00beb700	tst w8,#0x1
00beb704	ldr x8,[x0, #0x20]
00beb708	lsr x12,x9,#0x1
00beb70c	csel x10,x11,x10,eq
00beb710	tst w9,#0x1
00beb714	csel x8,x12,x8,eq
00beb718	cmn x10,x8
00beb71c	b.ne 0x00beb790
00beb720	bti j
00beb724	ldr w8,[x20]
00beb728	orr w8,w8,#0x4
00beb72c	str w8,[x20]
00beb730	ldur x0,[x29, #-0x18]
00beb734	ldp x20,x19,[sp, #0x90]
00beb738	ldp x22,x21,[sp, #0x80]
00beb73c	ldp x24,x23,[sp, #0x70]
00beb740	ldp x26,x25,[sp, #0x60]
00beb744	ldp x29,x30,[sp, #0x50]
00beb748	add sp,sp,#0xa0
00beb74c	autiasp
00beb750	ret
00beb754	bti j
00beb758	sub x0,x29,#0x18
00beb75c	mov x1,x21
00beb760	mov x2,x20
00beb764	mov x3,x24
00beb768	mov w4,#0x1
00beb76c	bl 0x00bec028
00beb770	ldr w8,[x20]
00beb774	cmp w0,#0x6
00beb778	b.gt 0x00beb728
00beb77c	tbnz w8,#0x2,0x00beb728
00beb780	str w0,[x19, #0x18]
00beb784	b 0x00beb730
00beb788	orr w8,w9,#0x4
00beb78c	b 0x00beb72c
00beb790	mov x22,x0
00beb794	sub x0,x29,#0x18
00beb798	mov x1,x21
00beb79c	add x3,x22,#0x30
00beb7a0	mov x2,x22
00beb7a4	mov x4,x24
00beb7a8	mov x5,x20
00beb7ac	mov w6,wzr
00beb7b0	bl 0x00bdede4
00beb7b4	ldr w8,[x19, #0x8]
00beb7b8	subs x9,x0,x22
00beb7bc	b.ne 0x00beb7d0
00beb7c0	cmp w8,#0xc
00beb7c4	b.ne 0x00beb7d0
00beb7c8	str wzr,[x19, #0x8]
00beb7cc	b 0x00beb730
00beb7d0	cmp x9,#0x18
00beb7d4	b.ne 0x00beb730
00beb7d8	cmp w8,#0xb
00beb7dc	b.gt 0x00beb730
00beb7e0	add w8,w8,#0xc
00beb7e4	str w8,[x19, #0x8]
00beb7e8	b 0x00beb730
00beb7ec	bl 0x00bd8968
