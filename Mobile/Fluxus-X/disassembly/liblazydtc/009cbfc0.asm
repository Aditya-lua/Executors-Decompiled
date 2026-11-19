; ssl3_read_bytes @ 009cbfc0
009cbfc0	sub sp,sp,#0x80
009cbfc4	stp x28,x27,[sp, #0x20]
009cbfc8	stp x26,x25,[sp, #0x30]
009cbfcc	stp x24,x23,[sp, #0x40]
009cbfd0	stp x22,x21,[sp, #0x50]
009cbfd4	stp x20,x19,[sp, #0x60]
009cbfd8	stp x29,x30,[sp, #0x70]
009cbfdc	ldr x8,[x0, #0x8]
009cbfe0	mov x20,x6
009cbfe4	mov w24,w5
009cbfe8	mov x22,x4
009cbfec	ldr x9,[x8, #0xc0]
009cbff0	mov x23,x3
009cbff4	mov x21,x2
009cbff8	mov w25,w1
009cbffc	ldrb w9,[x9, #0x60]
009cc000	mov x19,x0
009cc004	mov w27,wzr
009cc008	add x29,sp,#0x70
009cc00c	tbnz w9,#0x3,0x009cc028
009cc010	ldr w8,[x8]
009cc014	cmp w8,#0x303
009cc018	cset w9,gt
009cc01c	cmp w8,#0x10, LSL #12
009cc020	cset w8,ne
009cc024	and w27,w9,w8
009cc028	ldr x8,[x19, #0xc78]
009cc02c	cbnz x8,0x009cc03c
009cc030	mov x0,x19
009cc034	bl 0x00c36cf0
009cc038	cbz w0,0x009cc09c
009cc03c	cmp w25,#0x17
009cc040	b.hi 0x009cc068
009cc044	mov w8,#0x1
009cc048	mov w9,#0x1
009cc04c	lsl w8,w8,w25
009cc050	movk w9,#0xc0, LSL #16
009cc054	tst w8,w9
009cc058	b.eq 0x009cc068
009cc05c	cmp w25,#0x17
009cc060	b.eq 0x009cc0c4
009cc064	cbz w24,0x009cc0c4
009cc068	bl 0x00c342a0
009cc06c	adrp x0,0x2d3000
009cc070	adrp x2,0x2b9000
009cc074	add x0,x0,#0x7fb
009cc078	add x2,x2,#0x9ef
009cc07c	mov w1,#0x51e
009cc080	bl 0x00c342b0
009cc084	mov w2,#0x103
009cc088	mov w1,#0x50
009cc08c	movk w2,#0xc, LSL #16
009cc090	mov x0,x19
009cc094	mov x3,xzr
009cc098	bl 0x00c34410
009cc09c	mov w26,#0xffffffff
009cc0a0	mov w0,w26
009cc0a4	ldp x29,x30,[sp, #0x70]
009cc0a8	ldp x20,x19,[sp, #0x60]
009cc0ac	ldp x22,x21,[sp, #0x50]
009cc0b0	ldp x24,x23,[sp, #0x40]
009cc0b4	ldp x26,x25,[sp, #0x30]
009cc0b8	ldp x28,x27,[sp, #0x20]
009cc0bc	add sp,sp,#0x80
009cc0c0	ret
009cc0c4	cmp w25,#0x16
009cc0c8	b.ne 0x009cc11c
009cc0cc	ldr x9,[x19, #0x1cc8]
009cc0d0	cbz x9,0x009cc11c
009cc0d4	cbz x22,0x009cc6ac
009cc0d8	mov w10,#0x1cc0
009cc0dc	mov x8,xzr
009cc0e0	add x10,x19,x10
009cc0e4	cbz x9,0x009cc6e4
009cc0e8	ldrb w9,[x10, x8]
009cc0ec	strb w9,[x23, x8]
009cc0f0	ldr x9,[x19, #0x1cc8]
009cc0f4	add x8,x8,#0x1
009cc0f8	cmp x22,x8
009cc0fc	sub x9,x9,#0x1
009cc100	str x9,[x19, #0x1cc8]
009cc104	b.ne 0x009cc0e4
009cc108	cbz x9,0x009cc6e4
009cc10c	add x9,x19,x8
009cc110	mov w10,#0x1cc0
009cc114	add x9,x9,x10
009cc118	b 0x009cc6b8
009cc11c	mov x0,x19
009cc120	bl 0x00c34510
009cc124	cbz w0,0x009cc13c
009cc128	str x21,[sp, #0x18]
009cc12c	mov w21,#0x1
009cc130	stp x20,xzr,[sp]
009cc134	str w27,[sp, #0x14]
009cc138	b 0x009cc16c
009cc13c	mov x0,x19
009cc140	bl 0x00c344e0
009cc144	cbz w0,0x009cc128
009cc148	ldr x8,[x19, #0x30]
009cc14c	mov x0,x19
009cc150	blr x8
009cc154	mov w26,w0
009cc158	tbnz w0,#0x1f,0x009cc0a0
009cc15c	cbnz w26,0x009cc128
009cc160	b 0x009cc09c
009cc164	madd x8,x28,x20,x19
009cc168	str w21,[x8, #0x12e0]
009cc16c	ldr x20,[x19, #0xc68]
009cc170	str w21,[x19, #0x28]
009cc174	mov w21,#0x50
009cc178	cbnz x20,0x009cc1a4
009cc17c	mov x0,x19
009cc180	bl 0x00c36cb0
009cc184	cmp w0,#0x1
009cc188	b.lt 0x009cc688
009cc18c	ldr x20,[x19, #0xc68]
009cc190	cbnz x20,0x009cc1a4
009cc194	b 0x009cc690
009cc198	mov x20,xzr
009cc19c	str xzr,[x19, #0xc68]
009cc1a0	cbz x20,0x009cc17c
009cc1a4	mov x28,xzr
009cc1a8	mov w8,#0x12e0
009cc1ac	ldr w9,[x19, x8#0x0]
009cc1b0	cbz w9,0x009cc1c4
009cc1b4	add x28,x28,#0x1
009cc1b8	cmp x28,x20
009cc1bc	add x8,x8,#0x50
009cc1c0	b.cc 0x009cc1ac
009cc1c4	cmp x28,x20
009cc1c8	b.eq 0x009cc198
009cc1cc	madd x10,x28,x21,x19
009cc1d0	ldr x8,[x19, #0x1cc8]
009cc1d4	ldr w9,[x10, #0x12ac]
009cc1d8	cbz x8,0x009cc208
009cc1dc	cmp w9,#0x16
009cc1e0	b.eq 0x009cc228
009cc1e4	ldr x11,[x19, #0x8]
009cc1e8	ldr x12,[x11, #0xc0]
009cc1ec	ldrb w12,[x12, #0x60]
009cc1f0	tbnz w12,#0x3,0x009cc208
009cc1f4	ldr w11,[x11]
009cc1f8	cmp w11,#0x304
009cc1fc	b.lt 0x009cc208
009cc200	cmp w11,#0x10, LSL #12
009cc204	b.ne 0x009cc884
009cc208	cmp w9,#0x15
009cc20c	b.ne 0x009cc228
009cc210	mov w11,#0x1
009cc214	cmp w9,#0x16
009cc218	b.eq 0x009cc244
009cc21c	ldr w12,[x19, #0x198]
009cc220	cbz w12,0x009cc244
009cc224	b 0x009cc6fc
009cc228	madd x11,x28,x21,x19
009cc22c	ldr x11,[x11, #0x12b0]
009cc230	cbz x11,0x009cc23c
009cc234	mov w11,wzr
009cc238	str wzr,[x19, #0x1d0c]
009cc23c	cmp w9,#0x16
009cc240	b.ne 0x009cc21c
009cc244	ldr w12,[x19, #0x44]
009cc248	tbnz w12,#0x1,0x009cc724
009cc24c	mov w13,#0x12a8
009cc250	add x21,x10,x13
009cc254	mov w13,#0x12ac
009cc258	cmp w9,w25
009cc25c	add x27,x10,x13
009cc260	b.eq 0x009cc444
009cc264	ldr x10,[sp, #0x18]
009cc268	cmp x10,#0x0
009cc26c	cset w10,eq
009cc270	cmp w25,#0x16
009cc274	cset w13,ne
009cc278	cmp w9,#0x14
009cc27c	cset w14,ne
009cc280	orr w13,w13,w14
009cc284	orr w10,w10,w13
009cc288	ldr w13,[sp, #0x14]
009cc28c	orr w10,w13,w10
009cc290	tbz w10,#0x0,0x009cc444
009cc294	ldr w14,[x21]
009cc298	cmp w14,#0x2
009cc29c	b.eq 0x009cc740
009cc2a0	ldr x10,[x19, #0x8]
009cc2a4	ldr w13,[x10]
009cc2a8	cmp w13,#0x10, LSL #12
009cc2ac	b.ne 0x009cc2c4
009cc2b0	ldr w15,[x19, #0x38]
009cc2b4	cmp w15,#0x0
009cc2b8	cset w15,eq
009cc2bc	and w15,w11,w15
009cc2c0	tbz w15,#0x0,0x009cc75c
009cc2c4	cbnz w11,0x009cc56c
009cc2c8	mov w21,#0x1
009cc2cc	tbnz w12,#0x0,0x009cc2dc
009cc2d0	cmp w9,#0x16
009cc2d4	b.eq 0x009cc300
009cc2d8	b 0x009cc380
009cc2dc	cmp w9,#0x16
009cc2e0	b.ne 0x009cc788
009cc2e4	cmp w13,#0x304
009cc2e8	b.lt 0x009cc3e4
009cc2ec	cmp w13,#0x10, LSL #12
009cc2f0	b.eq 0x009cc3e4
009cc2f4	ldr x9,[x10, #0xc0]
009cc2f8	ldr w9,[x9, #0x60]
009cc2fc	tbnz w9,#0x3,0x009cc3e4
009cc300	add x10,x19,#0xc58
009cc304	mov w11,#0x50
009cc308	mov w9,#0x4
009cc30c	madd x20,x28,x11,x10
009cc310	sub x9,x9,x8
009cc314	add x8,x10,x8
009cc318	ldr x10,[x20, #0x658]
009cc31c	ldr x11,[x20, #0x670]
009cc320	ldr x12,[x20, #0x668]
009cc324	mov w13,#0x1068
009cc328	cmp x10,x9
009cc32c	csel x26,x10,x9,cc
009cc330	add x0,x8,x13
009cc334	add x1,x11,x12
009cc338	mov x2,x26
009cc33c	bl 0x00c2ffd0
009cc340	ldr x8,[x20, #0x668]
009cc344	ldr x9,[x20, #0x658]
009cc348	add x8,x8,x26
009cc34c	subs x9,x9,x26
009cc350	str x8,[x20, #0x668]
009cc354	str x9,[x20, #0x658]
009cc358	ldr x8,[x19, #0x1cc8]
009cc35c	add x8,x8,x26
009cc360	str x8,[x19, #0x1cc8]
009cc364	b.ne 0x009cc374
009cc368	mov w9,#0x50
009cc36c	madd x9,x28,x9,x19
009cc370	str w21,[x9, #0x12e0]
009cc374	cmp x8,#0x4
009cc378	b.cc 0x009cc16c
009cc37c	ldr w9,[x27]
009cc380	cmp w9,#0x14
009cc384	b.eq 0x009cc7d4
009cc388	cmp x8,#0x4
009cc38c	b.cc 0x009cc3a0
009cc390	mov x0,x19
009cc394	bl 0x00c34510
009cc398	cbz w0,0x009cc400
009cc39c	ldr w9,[x27]
009cc3a0	cmp w9,#0x17
009cc3a4	b.ne 0x009cc7fc
009cc3a8	mov x0,x19
009cc3ac	bl 0x00c36ba0
009cc3b0	cbnz w0,0x009cc830
009cc3b4	mov x0,x19
009cc3b8	bl 0x00c36ca0
009cc3bc	cbz w0,0x009cc83c
009cc3c0	mov w20,#0x50
009cc3c4	madd x8,x28,x20,x19
009cc3c8	ldr x1,[x8, #0x12b0]
009cc3cc	mov w2,#0x68
009cc3d0	mov x0,x19
009cc3d4	mov w3,wzr
009cc3d8	bl 0x00c36c90
009cc3dc	cbnz w0,0x009cc164
009cc3e0	b 0x009cc09c
009cc3e4	mov w8,#0x50
009cc3e8	madd x8,x28,x8,x19
009cc3ec	str xzr,[x8, #0x12b0]
009cc3f0	str w21,[x8, #0x12e0]
009cc3f4	ldrb w8,[x19, #0x9f0]
009cc3f8	tbnz w8,#0x2,0x009cc16c
009cc3fc	b 0x009cc858
009cc400	ldr w20,[x19, #0x84]
009cc404	mov w1,#0x1
009cc408	mov x0,x19
009cc40c	bl 0x00c35cf0
009cc410	ldr x8,[x19, #0x30]
009cc414	mov x0,x19
009cc418	blr x8
009cc41c	tbnz w0,#0x1f,0x009cc688
009cc420	cmp w20,#0xb
009cc424	mov w26,#0xffffffff
009cc428	b.eq 0x009cc0a0
009cc42c	cbz w0,0x009cc0a0
009cc430	ldrb w8,[x19, #0x9f0]
009cc434	tbnz w8,#0x2,0x009cc16c
009cc438	ldr x8,[x19, #0xc98]
009cc43c	cbnz x8,0x009cc16c
009cc440	b 0x009cc858
009cc444	mov x0,x19
009cc448	bl 0x00c344e0
009cc44c	cmp w25,#0x17
009cc450	b.ne 0x009cc460
009cc454	cbz w0,0x009cc460
009cc458	ldr x8,[x19, #0x848]
009cc45c	cbz x8,0x009cc95c
009cc460	cmp w25,#0x16
009cc464	b.ne 0x009cc47c
009cc468	ldr w8,[x27]
009cc46c	cmp w8,#0x14
009cc470	b.ne 0x009cc47c
009cc474	ldr x8,[x19, #0x1cc8]
009cc478	cbnz x8,0x009cc984
009cc47c	ldr x9,[sp, #0x18]
009cc480	cbz x9,0x009cc48c
009cc484	ldr w8,[x27]
009cc488	str w8,[x9]
009cc48c	cbz x22,0x009cc8fc
009cc490	mov x27,xzr
009cc494	ldr x8,[x21, #0x8]
009cc498	ldp x9,x10,[x21, #0x18]
009cc49c	sub x11,x22,x27
009cc4a0	mov x0,x23
009cc4a4	cmp x11,x8
009cc4a8	csel x26,x8,x11,hi
009cc4ac	add x1,x10,x9
009cc4b0	mov x2,x26
009cc4b4	bl 0x00c2ffd0
009cc4b8	add x23,x23,x26
009cc4bc	cbz w24,0x009cc4cc
009cc4c0	ldr x8,[x21, #0x8]
009cc4c4	cbnz x8,0x009cc514
009cc4c8	b 0x009cc50c
009cc4cc	ldrb w8,[x19, #0x9e8]
009cc4d0	tbz w8,#0x1,0x009cc4e4
009cc4d4	ldp x8,x9,[x21, #0x18]
009cc4d8	mov x1,x26
009cc4dc	add x0,x9,x8
009cc4e0	bl 0x00c34750
009cc4e4	ldr x8,[x21, #0x8]
009cc4e8	ldr x9,[x21, #0x18]
009cc4ec	subs x8,x8,x26
009cc4f0	add x9,x9,x26
009cc4f4	str x8,[x21, #0x8]
009cc4f8	str x9,[x21, #0x18]
009cc4fc	b.ne 0x009cc514
009cc500	orr w9,wzr,#0xf0
009cc504	str w9,[x19, #0xc64]
009cc508	str xzr,[x21, #0x18]
009cc50c	mov w9,#0x1
009cc510	str w9,[x21, #0x38]
009cc514	cmp w24,#0x0
009cc518	cset w10,ne
009cc51c	cmp x8,#0x0
009cc520	cset w11,eq
009cc524	cmp x26,x8
009cc528	cset w8,eq
009cc52c	and w8,w10,w8
009cc530	orr w8,w11,w8
009cc534	add x9,x21,#0x50
009cc538	add x27,x26,x27
009cc53c	cmp w8,#0x0
009cc540	csel x21,x9,x21,ne
009cc544	cmp x27,x22
009cc548	add x28,x28,x8
009cc54c	b.cs 0x009cc560
009cc550	cmp w25,#0x17
009cc554	b.ne 0x009cc560
009cc558	cmp x28,x20
009cc55c	b.cc 0x009cc494
009cc560	mov w21,#0x1
009cc564	cbz x27,0x009cc16c
009cc568	b 0x009cc928
009cc56c	mov w8,#0x50
009cc570	madd x8,x28,x8,x19
009cc574	ldr x9,[x8, #0x12b0]
009cc578	cmp x9,#0x1
009cc57c	b.lt 0x009cc8d4
009cc580	b.eq 0x009cc8d4
009cc584	cmp x9,#0x2
009cc588	b.ne 0x009cc8d4
009cc58c	ldr x9,[x8, #0x12c8]
009cc590	ldr x10,[x8, #0x12c0]
009cc594	ldr x8,[x19, #0x4c0]
009cc598	add x3,x9,x10
009cc59c	ldrb w20,[x3]
009cc5a0	ldrb w26,[x3, #0x1]
009cc5a4	cbz x8,0x009cc5c4
009cc5a8	ldr w1,[x19]
009cc5ac	ldr x6,[x19, #0x4c8]
009cc5b0	mov w2,#0x15
009cc5b4	mov w4,#0x2
009cc5b8	mov w0,wzr
009cc5bc	mov x5,x19
009cc5c0	blr x8
009cc5c4	ldr x21,[x19, #0x978]
009cc5c8	ldr w27,[sp, #0x14]
009cc5cc	cbnz x21,0x009cc5e8
009cc5d0	ldr x8,[x19, #0x9a8]
009cc5d4	ldr x9,[sp, #0x8]
009cc5d8	ldr x8,[x8, #0x120]
009cc5dc	cmp x8,#0x0
009cc5e0	csel x21,x9,x8,eq
009cc5e4	cbz x21,0x009cc680
009cc5e8	mov w2,w26
009cc5ec	bfm w2,w20,#0x18,#0x7
009cc5f0	mov w1,#0x4004
009cc5f4	mov x0,x19
009cc5f8	blr x21
009cc5fc	str x21,[sp, #0x8]
009cc600	cmp w26,#0x5a
009cc604	cset w8,eq
009cc608	mov w21,#0x1
009cc60c	cmp w20,#0x1
009cc610	and w8,w27,w8
009cc614	b.eq 0x009cc61c
009cc618	cbz w8,0x009cc640
009cc61c	mov w9,#0x50
009cc620	madd x9,x28,x9,x19
009cc624	str w26,[x19, #0x19c]
009cc628	str w21,[x9, #0x12e0]
009cc62c	ldr w9,[x19, #0x1d0c]
009cc630	add w9,w9,#0x1
009cc634	cmp w9,#0x5
009cc638	str w9,[x19, #0x1d0c]
009cc63c	b.eq 0x009cc9a0
009cc640	tbnz w8,#0x0,0x009cc16c
009cc644	cmp w20,#0x1
009cc648	cset w8,eq
009cc64c	orr w8,w27,w8
009cc650	cmp w8,#0x1
009cc654	b.ne 0x009cc65c
009cc658	cbz w26,0x009cc9c8
009cc65c	cmp w20,#0x2
009cc660	cset w8,ne
009cc664	bic w8,w8,w27
009cc668	tbz w8,#0x0,0x009cc9d8
009cc66c	cmp w26,#0x64
009cc670	b.eq 0x009cca48
009cc674	cmp w20,#0x1
009cc678	b.eq 0x009cc16c
009cc67c	b 0x009cca70
009cc680	str xzr,[sp, #0x8]
009cc684	b 0x009cc600
009cc688	mov w26,w0
009cc68c	b 0x009cc0a0
009cc690	bl 0x00c342a0
009cc694	adrp x0,0x2d3000
009cc698	adrp x2,0x2b9000
009cc69c	add x0,x0,#0x7fb
009cc6a0	add x2,x2,#0x9ef
009cc6a4	mov w1,#0x561
009cc6a8	b 0x009cc080
009cc6ac	mov w9,#0x1cc0
009cc6b0	mov x8,xzr
009cc6b4	add x9,x19,x9
009cc6b8	mov x10,xzr
009cc6bc	mov x12,xzr
009cc6c0	mov w11,#0x1cc0
009cc6c4	ldrb w13,[x9, x10]
009cc6c8	add x12,x19,x12
009cc6cc	add x10,x10,#0x1
009cc6d0	strb w13,[x12, x11]
009cc6d4	ldr x13,[x19, #0x1cc8]
009cc6d8	and x12,x10,#0xffffffff
009cc6dc	cmp x13,x12
009cc6e0	b.hi 0x009cc6c4
009cc6e4	cbz x21,0x009cc6f0
009cc6e8	mov w9,#0x16
009cc6ec	str w9,[x21]
009cc6f0	str x8,[x20]
009cc6f4	mov w26,#0x1
009cc6f8	b 0x009cc0a0
009cc6fc	bl 0x00c342a0
009cc700	adrp x0,0x2d3000
009cc704	adrp x2,0x2b9000
009cc708	add x0,x0,#0x7fb
009cc70c	add x2,x2,#0x9ef
009cc710	mov w1,#0x587
009cc714	bl 0x00c342b0
009cc718	mov w1,#0xa
009cc71c	mov w2,#0x91
009cc720	b 0x009cc090
009cc724	mov w8,#0x50
009cc728	mov w9,#0x1
009cc72c	madd x8,x28,x8,x19
009cc730	mov w26,wzr
009cc734	str xzr,[x8, #0x12b0]
009cc738	str w9,[x19, #0x28]
009cc73c	b 0x009cc0a0
009cc740	bl 0x00c342a0
009cc744	adrp x0,0x2d3000
009cc748	adrp x2,0x2b9000
009cc74c	add x0,x0,#0x7fb
009cc750	add x2,x2,#0x9ef
009cc754	mov w1,#0x5f9
009cc758	b 0x009cc080
009cc75c	str w14,[x19]
009cc760	bl 0x00c342a0
009cc764	adrp x0,0x2d3000
009cc768	adrp x2,0x2b9000
009cc76c	add x0,x0,#0x7fb
009cc770	add x2,x2,#0x9ef
009cc774	mov w1,#0x606
009cc778	bl 0x00c342b0
009cc77c	mov w1,#0xa
009cc780	mov w2,#0xf4
009cc784	b 0x009cc090
009cc788	mov w8,#0x50
009cc78c	mov w9,#0x1
009cc790	madd x8,x28,x8,x19
009cc794	str xzr,[x8, #0x12b0]
009cc798	str w9,[x8, #0x12e0]
009cc79c	bl 0x00c342a0
009cc7a0	adrp x0,0x2d3000
009cc7a4	adrp x2,0x2b9000
009cc7a8	add x0,x0,#0x7fb
009cc7ac	add x2,x2,#0x9ef
009cc7b0	mov w1,#0x683
009cc7b4	bl 0x00c342b0
009cc7b8	mov w1,#0xffffffff
009cc7bc	mov w2,#0x123
009cc7c0	mov x0,x19
009cc7c4	mov x3,xzr
009cc7c8	mov w26,#0xffffffff
009cc7cc	bl 0x00c34410
009cc7d0	b 0x009cc0a0
009cc7d4	bl 0x00c342a0
009cc7d8	adrp x0,0x2d3000
009cc7dc	adrp x2,0x2b9000
009cc7e0	add x0,x0,#0x7fb
009cc7e4	add x2,x2,#0x9ef
009cc7e8	mov w1,#0x6a5
009cc7ec	bl 0x00c342b0
009cc7f0	mov w1,#0xa
009cc7f4	mov w2,#0x85
009cc7f8	b 0x009cc090
009cc7fc	sub w8,w9,#0x14
009cc800	cmp w8,#0x3
009cc804	b.cs 0x009cc8ac
009cc808	bl 0x00c342a0
009cc80c	adrp x0,0x2d3000
009cc810	adrp x2,0x2b9000
009cc814	add x0,x0,#0x7fb
009cc818	add x2,x2,#0x9ef
009cc81c	mov w1,#0x6eb
009cc820	bl 0x00c342b0
009cc824	mov w2,#0x103
009cc828	mov w1,#0xa
009cc82c	b 0x009cc08c
009cc830	mov w8,#0x2
009cc834	str w8,[x19, #0x1b8]
009cc838	b 0x009cc09c
009cc83c	bl 0x00c342a0
009cc840	adrp x0,0x2d3000
009cc844	adrp x2,0x2b9000
009cc848	add x0,x0,#0x7fb
009cc84c	add x2,x2,#0x9ef
009cc850	mov w1,#0x70a
009cc854	b 0x009cc8c4
009cc858	orr w8,wzr,#0x3
009cc85c	mov x0,x19
009cc860	str w8,[x19, #0x28]
009cc864	bl 0x00c34300
009cc868	orr w1,wzr,#0xf
009cc86c	mov x19,x0
009cc870	bl 0x00c32190
009cc874	mov w1,#0x9
009cc878	mov x0,x19
009cc87c	bl 0x00c322a0
009cc880	b 0x009cc09c
009cc884	bl 0x00c342a0
009cc888	adrp x0,0x2d3000
009cc88c	adrp x2,0x2b9000
009cc890	add x0,x0,#0x7fb
009cc894	add x2,x2,#0x9ef
009cc898	mov w1,#0x575
009cc89c	bl 0x00c342b0
009cc8a0	mov w1,#0xa
009cc8a4	mov w2,#0x125
009cc8a8	b 0x009cc090
009cc8ac	bl 0x00c342a0
009cc8b0	adrp x0,0x2d3000
009cc8b4	adrp x2,0x2b9000
009cc8b8	add x0,x0,#0x7fb
009cc8bc	add x2,x2,#0x9ef
009cc8c0	mov w1,#0x6e1
009cc8c4	bl 0x00c342b0
009cc8c8	mov w1,#0xa
009cc8cc	mov w2,#0xf5
009cc8d0	b 0x009cc090
009cc8d4	bl 0x00c342a0
009cc8d8	adrp x0,0x2d3000
009cc8dc	adrp x2,0x2b9000
009cc8e0	add x0,x0,#0x7fb
009cc8e4	add x2,x2,#0x9ef
009cc8e8	mov w1,#0x619
009cc8ec	bl 0x00c342b0
009cc8f0	mov w1,#0xa
009cc8f4	mov w2,#0xcd
009cc8f8	b 0x009cc090
009cc8fc	mov w8,#0x50
009cc900	madd x8,x28,x8,x19
009cc904	ldr x8,[x8, #0x12b0]
009cc908	mov w26,wzr
009cc90c	cbnz x8,0x009cc0a0
009cc910	mov w8,#0x50
009cc914	madd x8,x28,x8,x19
009cc918	mov w9,#0x1
009cc91c	mov w26,wzr
009cc920	str w9,[x8, #0x12e0]
009cc924	b 0x009cc0a0
009cc928	cmp x28,x20
009cc92c	b.ne 0x009cc94c
009cc930	cbnz w24,0x009cc94c
009cc934	ldrb w8,[x19, #0x9f0]
009cc938	tbz w8,#0x4,0x009cc94c
009cc93c	ldr x8,[x19, #0xc98]
009cc940	cbnz x8,0x009cc94c
009cc944	mov x0,x19
009cc948	bl 0x00c36cd0
009cc94c	ldr x8,[sp]
009cc950	mov w26,#0x1
009cc954	str x27,[x8]
009cc958	b 0x009cc0a0
009cc95c	bl 0x00c342a0
009cc960	adrp x0,0x2d3000
009cc964	adrp x2,0x2b9000
009cc968	add x0,x0,#0x7fb
009cc96c	add x2,x2,#0x9ef
009cc970	mov w1,#0x5a4
009cc974	bl 0x00c342b0
009cc978	mov w1,#0xa
009cc97c	mov w2,#0x64
009cc980	b 0x009cc090
009cc984	bl 0x00c342a0
009cc988	adrp x0,0x2d3000
009cc98c	adrp x2,0x2b9000
009cc990	add x0,x0,#0x7fb
009cc994	add x2,x2,#0x9ef
009cc998	mov w1,#0x5ab
009cc99c	b 0x009cc7ec
009cc9a0	bl 0x00c342a0
009cc9a4	adrp x0,0x2d3000
009cc9a8	adrp x2,0x2b9000
009cc9ac	add x0,x0,#0x7fb
009cc9b0	add x2,x2,#0x9ef
009cc9b4	mov w1,#0x633
009cc9b8	bl 0x00c342b0
009cc9bc	mov w1,#0xa
009cc9c0	mov w2,#0x199
009cc9c4	b 0x009cc090
009cc9c8	ldr w8,[x19, #0x44]
009cc9cc	orr w8,w8,#0x2
009cc9d0	str w8,[x19, #0x44]
009cc9d4	b 0x009cc0a0
009cc9d8	mov w20,#0x1
009cc9dc	str w20,[x19, #0x28]
009cc9e0	str w26,[x19, #0x1a0]
009cc9e4	bl 0x00c342a0
009cc9e8	adrp x0,0x2d3000
009cc9ec	adrp x2,0x2b9000
009cc9f0	add x0,x0,#0x7fb
009cc9f4	add x2,x2,#0x9ef
009cc9f8	mov w1,#0x645
009cc9fc	bl 0x00c342b0
009cca00	adrp x3,0x2a7000
009cca04	add w2,w26,#0x3e8
009cca08	add x3,x3,#0xb93
009cca0c	mov w1,#0xffffffff
009cca10	mov x0,x19
009cca14	mov w4,w26
009cca18	bl 0x00c34410
009cca1c	ldr w8,[x19, #0x44]
009cca20	mov w9,#0x50
009cca24	madd x9,x28,x9,x19
009cca28	orr w8,w8,#0x2
009cca2c	str w8,[x19, #0x44]
009cca30	str w20,[x9, #0x12e0]
009cca34	ldr x0,[x19, #0xb88]
009cca38	ldr x1,[x19, #0x918]
009cca3c	bl 0x00c34cd0
009cca40	mov w26,wzr
009cca44	b 0x009cc0a0
009cca48	bl 0x00c342a0
009cca4c	adrp x0,0x2d3000
009cca50	adrp x2,0x2b9000
009cca54	add x0,x0,#0x7fb
009cca58	add x2,x2,#0x9ef
009cca5c	mov w1,#0x655
009cca60	bl 0x00c342b0
009cca64	mov w1,#0x28
009cca68	mov w2,#0x153
009cca6c	b 0x009cc090
009cca70	bl 0x00c342a0
009cca74	adrp x0,0x2d3000
009cca78	adrp x2,0x2b9000
009cca7c	add x0,x0,#0x7fb
009cca80	add x2,x2,#0x9ef
009cca84	mov w1,#0x65c
009cca88	bl 0x00c342b0
009cca8c	mov w1,#0x2f
009cca90	mov w2,#0xf6
009cca94	b 0x009cc090
