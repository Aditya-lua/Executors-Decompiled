; FUN_0089e084 @ 0089e084
0089e084	sub sp,sp,#0x60
0089e088	stp x29,x30,[sp, #0x20]
0089e08c	str x23,[sp, #0x30]
0089e090	stp x22,x21,[sp, #0x40]
0089e094	stp x20,x19,[sp, #0x50]
0089e098	add x29,sp,#0x20
0089e09c	mrs x20,tpidr_el0
0089e0a0	ldr x8,[x20, #0x28]
0089e0a4	cmp w1,#0xf
0089e0a8	stur x8,[x29, #-0x8]
0089e0ac	b.hi 0x0089eb94
0089e0b0	mov w8,w1
0089e0b4	adrp x9,0x364000
0089e0b8	add x9,x9,#0x534
0089e0bc	adr x10,0x89e0cc
0089e0c0	ldrb w11,[x9, x8]
0089e0c4	add x10,x10,x11, LSL #0x2
0089e0c8	br x10
0089e0cc	ldr w9,[x2]
0089e0d0	ldr w8,[x3]
0089e0d4	cmp w9,#0x3
0089e0d8	b.ne 0x0089e65c
0089e0dc	cmp w8,#0x3
0089e0e0	b.ne 0x0089e65c
0089e0e4	str w8,[x0]
0089e0e8	ldr d0,[x2, #0x8]
0089e0ec	ldr d1,[x3, #0x8]
0089e0f0	fadd d0,d0,d1
0089e0f4	str d0,[x0, #0x8]
0089e0f8	b 0x0089eb94
0089e0fc	ldr w8,[x2]
0089e100	cbz w8,0x0089eb94
0089e104	cmp w8,#0x1
0089e108	b.eq 0x0089e120
0089e10c	cmp w8,#0x2
0089e110	b.ne 0x0089e11c
0089e114	ldrb w8,[x2, #0x8]
0089e118	cbz w8,0x0089e120
0089e11c	mov x2,x3
0089e120	ldr x8,[x20, #0x28]
0089e124	ldur x9,[x29, #-0x8]
0089e128	cmp x8,x9
0089e12c	b.ne 0x0089efd0
0089e130	ldp q1,q0,[x2]
0089e134	ldr x8,[x2, #0x20]
0089e138	b 0x0089e2a8
0089e13c	ldr w8,[x2]
0089e140	cmp w8,#0x3
0089e144	b.ne 0x0089eb94
0089e148	ldr w8,[x3]
0089e14c	cmp w8,#0x3
0089e150	b.ne 0x0089eb94
0089e154	mov w8,#0x2
0089e158	str w8,[x0]
0089e15c	ldr d0,[x2, #0x8]
0089e160	ldr d1,[x3, #0x8]
0089e164	fcmp d0,d1
0089e168	cset w8,ls
0089e16c	b 0x0089e4b0
0089e170	ldr w9,[x2]
0089e174	ldr w8,[x3]
0089e178	cmp w9,#0x3
0089e17c	b.ne 0x0089e51c
0089e180	cmp w8,#0x3
0089e184	b.ne 0x0089e51c
0089e188	str w8,[x0]
0089e18c	ldr d0,[x2, #0x8]
0089e190	ldr d1,[x3, #0x8]
0089e194	fdiv d0,d0,d1
0089e198	frintm d0,d0
0089e19c	str d0,[x0, #0x8]
0089e1a0	b 0x0089eb94
0089e1a4	ldr w8,[x2]
0089e1a8	cmp w8,#0x3
0089e1ac	b.ne 0x0089eb94
0089e1b0	ldr w8,[x3]
0089e1b4	cmp w8,#0x3
0089e1b8	b.ne 0x0089eb94
0089e1bc	mov w8,#0x2
0089e1c0	str w8,[x0]
0089e1c4	ldr d0,[x2, #0x8]
0089e1c8	ldr d1,[x3, #0x8]
0089e1cc	fcmp d0,d1
0089e1d0	cset w8,gt
0089e1d4	b 0x0089e4b0
0089e1d8	ldr w8,[x2]
0089e1dc	cbz w8,0x0089eb94
0089e1e0	ldr w9,[x3]
0089e1e4	cbz w9,0x0089eb94
0089e1e8	cmp w8,#0x4
0089e1ec	b.ne 0x0089e7fc
0089e1f0	cmp w9,#0x4
0089e1f4	b.ne 0x0089e7fc
0089e1f8	ldr s0,[x2, #0x8]
0089e1fc	ldr s1,[x3, #0x8]
0089e200	fcmp s0,s1
0089e204	b.ne 0x0089e84c
0089e208	ldr s0,[x2, #0xc]
0089e20c	ldr s1,[x3, #0xc]
0089e210	fcmp s0,s1
0089e214	b.ne 0x0089e84c
0089e218	ldr s0,[x2, #0x10]
0089e21c	ldr s1,[x3, #0x10]
0089e220	fcmp s0,s1
0089e224	b.ne 0x0089e84c
0089e228	ldr s0,[x2, #0x14]
0089e22c	ldr s1,[x3, #0x14]
0089e230	fcmp s0,s1
0089e234	b.ne 0x0089eb94
0089e238	b 0x0089e84c
0089e23c	ldr w9,[x2]
0089e240	ldr w8,[x3]
0089e244	cmp w9,#0x3
0089e248	b.ne 0x0089e58c
0089e24c	cmp w8,#0x3
0089e250	b.ne 0x0089e58c
0089e254	str w8,[x0]
0089e258	ldr d0,[x2, #0x8]
0089e25c	ldr d1,[x3, #0x8]
0089e260	fmul d0,d0,d1
0089e264	str d0,[x0, #0x8]
0089e268	b 0x0089eb94
0089e26c	ldr w8,[x2]
0089e270	cbz w8,0x0089eb94
0089e274	cmp w8,#0x1
0089e278	b.eq 0x0089e290
0089e27c	cmp w8,#0x2
0089e280	b.ne 0x0089e28c
0089e284	ldrb w8,[x2, #0x8]
0089e288	cbz w8,0x0089e290
0089e28c	mov x3,x2
0089e290	ldr x8,[x20, #0x28]
0089e294	ldur x9,[x29, #-0x8]
0089e298	cmp x8,x9
0089e29c	b.ne 0x0089efd0
0089e2a0	ldp q1,q0,[x3]
0089e2a4	ldr x8,[x3, #0x20]
0089e2a8	str x8,[x0, #0x20]
0089e2ac	stp q1,q0,[x0]
0089e2b0	b 0x0089eba4
0089e2b4	ldr w9,[x2]
0089e2b8	ldr w8,[x3]
0089e2bc	cmp w9,#0x3
0089e2c0	b.ne 0x0089e5f8
0089e2c4	cmp w8,#0x3
0089e2c8	b.ne 0x0089e5f8
0089e2cc	str w8,[x0]
0089e2d0	ldr d0,[x2, #0x8]
0089e2d4	ldr d1,[x3, #0x8]
0089e2d8	fdiv d0,d0,d1
0089e2dc	str d0,[x0, #0x8]
0089e2e0	b 0x0089eb94
0089e2e4	ldr w8,[x2]
0089e2e8	cmp w8,#0x6
0089e2ec	b.ne 0x0089eb94
0089e2f0	ldr w8,[x3]
0089e2f4	cmp w8,#0x6
0089e2f8	b.ne 0x0089eb94
0089e2fc	ldr w8,[x2, #0x4]
0089e300	ldr w9,[x3, #0x4]
0089e304	add w8,w9,w8
0089e308	cmp w8,#0x1, LSL #12
0089e30c	b.hi 0x0089eb94
0089e310	str w8,[x0, #0x4]
0089e314	mov w10,#0x6
0089e318	ldr w9,[x2, #0x4]
0089e31c	str w10,[x0]
0089e320	cbz w9,0x0089ebbc
0089e324	ldr w9,[x3, #0x4]
0089e328	cbz w9,0x0089ed00
0089e32c	mov x19,x4
0089e330	mov x23,x2
0089e334	mov x22,x3
0089e338	mov x21,x0
0089e33c	add w1,w8,#0x1
0089e340	stp xzr,xzr,[sp]
0089e344	str xzr,[sp, #0x10]
0089e348	mov x0,sp
0089e34c	bl 0x00c308b0
0089e350	ldr x1,[x23, #0x8]
0089e354	ldr w2,[x23, #0x4]
0089e358	mov x0,sp
0089e35c	bl 0x00c308c0
0089e360	ldr x1,[x22, #0x8]
0089e364	ldr w2,[x22, #0x4]
0089e368	mov x0,sp
0089e36c	mov x22,sp
0089e370	bl 0x00c308c0
0089e374	ldrb w8,[sp]
0089e378	ldr x9,[sp, #0x10]
0089e37c	ldr w2,[x21, #0x4]
0089e380	tst w8,#0x1
0089e384	csinc x1,x9,x22,ne
0089e388	mov x0,x19
0089e38c	bl 0x008530cc
0089e390	ldrb w8,[sp]
0089e394	str x0,[x21, #0x8]
0089e398	tbz w8,#0x0,0x0089eb94
0089e39c	ldr x8,[sp]
0089e3a0	ldr x0,[sp, #0x10]
0089e3a4	and x1,x8,#-0x2
0089e3a8	bl 0x00c2fe80
0089e3ac	b 0x0089eb94
0089e3b0	ldr w9,[x2]
0089e3b4	ldr w8,[x3]
0089e3b8	cmp w9,#0x3
0089e3bc	b.ne 0x0089e6b4
0089e3c0	cmp w8,#0x3
0089e3c4	b.ne 0x0089e6b4
0089e3c8	str w8,[x0]
0089e3cc	ldr d0,[x2, #0x8]
0089e3d0	ldr d1,[x3, #0x8]
0089e3d4	fsub d0,d0,d1
0089e3d8	str d0,[x0, #0x8]
0089e3dc	b 0x0089eb94
0089e3e0	ldr w8,[x2]
0089e3e4	cmp w8,#0x3
0089e3e8	b.ne 0x0089eb94
0089e3ec	ldr w8,[x3]
0089e3f0	cmp w8,#0x3
0089e3f4	b.ne 0x0089eb94
0089e3f8	str w8,[x0]
0089e3fc	ldr d0,[x2, #0x8]
0089e400	ldr d1,[x3, #0x8]
0089e404	fdiv d2,d0,d1
0089e408	frintm d2,d2
0089e40c	fmsub d0,d2,d1,d0
0089e410	str d0,[x0, #0x8]
0089e414	b 0x0089eb94
0089e418	ldr w8,[x2]
0089e41c	cmp w8,#0x3
0089e420	b.ne 0x0089eb94
0089e424	ldr w8,[x3]
0089e428	cmp w8,#0x3
0089e42c	b.ne 0x0089eb94
0089e430	mov w8,#0x2
0089e434	str w8,[x0]
0089e438	ldr d0,[x2, #0x8]
0089e43c	ldr d1,[x3, #0x8]
0089e440	fcmp d0,d1
0089e444	cset w8,ge
0089e448	b 0x0089e4b0
0089e44c	ldr w8,[x2]
0089e450	cmp w8,#0x3
0089e454	b.ne 0x0089eb94
0089e458	ldr w8,[x3]
0089e45c	cmp w8,#0x3
0089e460	b.ne 0x0089eb94
0089e464	str w8,[x0]
0089e468	mov x19,x0
0089e46c	ldr d0,[x2, #0x8]
0089e470	ldr d1,[x3, #0x8]
0089e474	bl 0x00c30770
0089e478	str d0,[x19, #0x8]
0089e47c	b 0x0089eb94
0089e480	ldr w8,[x2]
0089e484	cmp w8,#0x3
0089e488	b.ne 0x0089eb94
0089e48c	ldr w8,[x3]
0089e490	cmp w8,#0x3
0089e494	b.ne 0x0089eb94
0089e498	mov w8,#0x2
0089e49c	str w8,[x0]
0089e4a0	ldr d0,[x2, #0x8]
0089e4a4	ldr d1,[x3, #0x8]
0089e4a8	fcmp d0,d1
0089e4ac	cset w8,mi
0089e4b0	strb w8,[x0, #0x8]
0089e4b4	b 0x0089eb94
0089e4b8	ldr w8,[x2]
0089e4bc	cbz w8,0x0089eb94
0089e4c0	ldr w9,[x3]
0089e4c4	cbz w9,0x0089eb94
0089e4c8	cmp w8,#0x4
0089e4cc	b.ne 0x0089e994
0089e4d0	cmp w9,#0x4
0089e4d4	b.ne 0x0089e994
0089e4d8	ldr s0,[x2, #0x8]
0089e4dc	ldr s1,[x3, #0x8]
0089e4e0	fcmp s0,s1
0089e4e4	b.ne 0x0089e9e4
0089e4e8	ldr s0,[x2, #0xc]
0089e4ec	ldr s1,[x3, #0xc]
0089e4f0	fcmp s0,s1
0089e4f4	b.ne 0x0089e9e4
0089e4f8	ldr s0,[x2, #0x10]
0089e4fc	ldr s1,[x3, #0x10]
0089e500	fcmp s0,s1
0089e504	b.ne 0x0089e9e4
0089e508	ldr s0,[x2, #0x14]
0089e50c	ldr s1,[x3, #0x14]
0089e510	fcmp s0,s1
0089e514	b.ne 0x0089eb94
0089e518	b 0x0089e9e4
0089e51c	cmp w9,#0x4
0089e520	b.ne 0x0089e70c
0089e524	cmp w8,#0x4
0089e528	b.ne 0x0089e70c
0089e52c	ldr s2,[x2, #0x14]
0089e530	ldr s1,[x3, #0x14]
0089e534	fdiv s0,s2,s1
0089e538	frintm s0,s0
0089e53c	fcmp s0,#0.0
0089e540	b.eq 0x0089e554
0089e544	fcmp s2,#0.0
0089e548	b.ne 0x0089e554
0089e54c	fcmp s1,#0.0
0089e550	b.eq 0x0089eb94
0089e554	mov w8,#0x4
0089e558	str w8,[x0]
0089e55c	ldr s1,[x2, #0x8]
0089e560	ldr s2,[x3, #0x8]
0089e564	fdiv s1,s1,s2
0089e568	frintm s1,s1
0089e56c	str s1,[x0, #0x8]
0089e570	ldr s1,[x2, #0xc]
0089e574	ldr s2,[x3, #0xc]
0089e578	fdiv s1,s1,s2
0089e57c	frintm s1,s1
0089e580	str s1,[x0, #0xc]
0089e584	ldr s1,[x2, #0x10]
0089e588	b 0x0089e780
0089e58c	cmp w9,#0x4
0089e590	b.ne 0x0089e790
0089e594	cmp w8,#0x4
0089e598	b.ne 0x0089e790
0089e59c	ldr s2,[x2, #0x14]
0089e5a0	ldr s1,[x3, #0x14]
0089e5a4	fmul s0,s2,s1
0089e5a8	fcmp s0,#0.0
0089e5ac	b.eq 0x0089e5c0
0089e5b0	fcmp s2,#0.0
0089e5b4	b.ne 0x0089e5c0
0089e5b8	fcmp s1,#0.0
0089e5bc	b.eq 0x0089eb94
0089e5c0	mov w8,#0x4
0089e5c4	str w8,[x0]
0089e5c8	ldr s1,[x2, #0x8]
0089e5cc	ldr s2,[x3, #0x8]
0089e5d0	fmul s1,s1,s2
0089e5d4	str s1,[x0, #0x8]
0089e5d8	ldr s1,[x2, #0xc]
0089e5dc	ldr s2,[x3, #0xc]
0089e5e0	fmul s1,s1,s2
0089e5e4	str s1,[x0, #0xc]
0089e5e8	ldr s1,[x2, #0x10]
0089e5ec	ldr s2,[x3, #0x10]
0089e5f0	fmul s1,s1,s2
0089e5f4	b 0x0089eb90
0089e5f8	cmp w9,#0x4
0089e5fc	b.ne 0x0089e870
0089e600	cmp w8,#0x4
0089e604	b.ne 0x0089e870
0089e608	ldr s2,[x2, #0x14]
0089e60c	ldr s1,[x3, #0x14]
0089e610	fdiv s0,s2,s1
0089e614	fcmp s0,#0.0
0089e618	b.eq 0x0089e62c
0089e61c	fcmp s2,#0.0
0089e620	b.ne 0x0089e62c
0089e624	fcmp s1,#0.0
0089e628	b.eq 0x0089eb94
0089e62c	mov w8,#0x4
0089e630	str w8,[x0]
0089e634	ldr s1,[x2, #0x8]
0089e638	ldr s2,[x3, #0x8]
0089e63c	fdiv s1,s1,s2
0089e640	str s1,[x0, #0x8]
0089e644	ldr s1,[x2, #0xc]
0089e648	ldr s2,[x3, #0xc]
0089e64c	fdiv s1,s1,s2
0089e650	str s1,[x0, #0xc]
0089e654	ldr s1,[x2, #0x10]
0089e658	b 0x0089e8d8
0089e65c	cmp w9,#0x4
0089e660	b.ne 0x0089e8e4
0089e664	cmp w8,#0x4
0089e668	b.ne 0x0089e8e4
0089e66c	str w8,[x0]
0089e670	ldr s0,[x2, #0x8]
0089e674	ldr s1,[x3, #0x8]
0089e678	fadd s0,s0,s1
0089e67c	str s0,[x0, #0x8]
0089e680	ldr s0,[x2, #0xc]
0089e684	ldr s1,[x3, #0xc]
0089e688	fadd s0,s0,s1
0089e68c	str s0,[x0, #0xc]
0089e690	ldr s0,[x2, #0x10]
0089e694	ldr s1,[x3, #0x10]
0089e698	fadd s0,s0,s1
0089e69c	str s0,[x0, #0x10]
0089e6a0	ldr s0,[x2, #0x14]
0089e6a4	ldr s1,[x3, #0x14]
0089e6a8	fadd s0,s0,s1
0089e6ac	str s0,[x0, #0x14]
0089e6b0	b 0x0089eb94
0089e6b4	cmp w9,#0x4
0089e6b8	b.ne 0x0089e93c
0089e6bc	cmp w8,#0x4
0089e6c0	b.ne 0x0089e93c
0089e6c4	str w8,[x0]
0089e6c8	ldr s0,[x2, #0x8]
0089e6cc	ldr s1,[x3, #0x8]
0089e6d0	fsub s0,s0,s1
0089e6d4	str s0,[x0, #0x8]
0089e6d8	ldr s0,[x2, #0xc]
0089e6dc	ldr s1,[x3, #0xc]
0089e6e0	fsub s0,s0,s1
0089e6e4	str s0,[x0, #0xc]
0089e6e8	ldr s0,[x2, #0x10]
0089e6ec	ldr s1,[x3, #0x10]
0089e6f0	fsub s0,s0,s1
0089e6f4	str s0,[x0, #0x10]
0089e6f8	ldr s0,[x2, #0x14]
0089e6fc	ldr s1,[x3, #0x14]
0089e700	fsub s0,s0,s1
0089e704	str s0,[x0, #0x14]
0089e708	b 0x0089eb94
0089e70c	cmp w9,#0x3
0089e710	b.ne 0x0089ea0c
0089e714	cmp w8,#0x4
0089e718	b.ne 0x0089ea0c
0089e71c	ldr d0,[x2, #0x8]
0089e720	ldr s1,[x3, #0x14]
0089e724	fcvt s0,d0
0089e728	fcmp s1,#0.0
0089e72c	fdiv s0,s0,s1
0089e730	frintm s0,s0
0089e734	b.ne 0x0089e740
0089e738	fcmp s0,#0.0
0089e73c	b.ne 0x0089eb94
0089e740	mov w8,#0x4
0089e744	str w8,[x0]
0089e748	ldr d1,[x2, #0x8]
0089e74c	ldr s2,[x3, #0x8]
0089e750	fcvt s1,d1
0089e754	fdiv s1,s1,s2
0089e758	frintm s1,s1
0089e75c	str s1,[x0, #0x8]
0089e760	ldr d1,[x2, #0x8]
0089e764	ldr s2,[x3, #0xc]
0089e768	fcvt s1,d1
0089e76c	fdiv s1,s1,s2
0089e770	frintm s1,s1
0089e774	str s1,[x0, #0xc]
0089e778	ldr d1,[x2, #0x8]
0089e77c	fcvt s1,d1
0089e780	ldr s2,[x3, #0x10]
0089e784	fdiv s1,s1,s2
0089e788	frintm s1,s1
0089e78c	b 0x0089eb90
0089e790	cmp w9,#0x3
0089e794	b.ne 0x0089eaac
0089e798	cmp w8,#0x4
0089e79c	b.ne 0x0089eaac
0089e7a0	ldr d0,[x2, #0x8]
0089e7a4	ldr s1,[x3, #0x14]
0089e7a8	fcvt s0,d0
0089e7ac	fcmp s1,#0.0
0089e7b0	fmul s0,s1,s0
0089e7b4	b.ne 0x0089e7c0
0089e7b8	fcmp s0,#0.0
0089e7bc	b.ne 0x0089eb94
0089e7c0	mov w8,#0x4
0089e7c4	str w8,[x0]
0089e7c8	ldr d1,[x2, #0x8]
0089e7cc	ldr s2,[x3, #0x8]
0089e7d0	fcvt s1,d1
0089e7d4	fmul s1,s2,s1
0089e7d8	str s1,[x0, #0x8]
0089e7dc	ldr d1,[x2, #0x8]
0089e7e0	ldr s2,[x3, #0xc]
0089e7e4	fcvt s1,d1
0089e7e8	fmul s1,s2,s1
0089e7ec	str s1,[x0, #0xc]
0089e7f0	ldr d1,[x2, #0x8]
0089e7f4	ldr s2,[x3, #0x10]
0089e7f8	b 0x0089eb14
0089e7fc	cmp w8,#0x5
0089e800	b.ne 0x0089e84c
0089e804	cmp w9,#0x5
0089e808	b.ne 0x0089e84c
0089e80c	ldr d0,[x2, #0x8]
0089e810	ldr d1,[x3, #0x8]
0089e814	fcmp d0,d1
0089e818	b.ne 0x0089e84c
0089e81c	ldr d0,[x2, #0x10]
0089e820	ldr d1,[x3, #0x10]
0089e824	fcmp d0,d1
0089e828	b.ne 0x0089e84c
0089e82c	ldr d0,[x2, #0x18]
0089e830	ldr d1,[x3, #0x18]
0089e834	fcmp d0,d1
0089e838	b.ne 0x0089e84c
0089e83c	ldr d0,[x2, #0x20]
0089e840	ldr d1,[x3, #0x20]
0089e844	fcmp d0,d1
0089e848	b.ne 0x0089eb94
0089e84c	mov w8,#0x2
0089e850	mov x19,x0
0089e854	mov x1,x3
0089e858	str w8,[x0]
0089e85c	mov x0,x2
0089e860	bl 0x0089fd34
0089e864	and w8,w0,#0x1
0089e868	strb w8,[x19, #0x8]
0089e86c	b 0x0089eb94
0089e870	cmp w9,#0x3
0089e874	b.ne 0x0089eb20
0089e878	cmp w8,#0x4
0089e87c	b.ne 0x0089eb20
0089e880	ldr d0,[x2, #0x8]
0089e884	ldr s1,[x3, #0x14]
0089e888	fcvt s0,d0
0089e88c	fcmp s1,#0.0
0089e890	fdiv s0,s0,s1
0089e894	b.ne 0x0089e8a0
0089e898	fcmp s0,#0.0
0089e89c	b.ne 0x0089eb94
0089e8a0	mov w8,#0x4
0089e8a4	str w8,[x0]
0089e8a8	ldr d1,[x2, #0x8]
0089e8ac	ldr s2,[x3, #0x8]
0089e8b0	fcvt s1,d1
0089e8b4	fdiv s1,s1,s2
0089e8b8	str s1,[x0, #0x8]
0089e8bc	ldr d1,[x2, #0x8]
0089e8c0	ldr s2,[x3, #0xc]
0089e8c4	fcvt s1,d1
0089e8c8	fdiv s1,s1,s2
0089e8cc	str s1,[x0, #0xc]
0089e8d0	ldr d1,[x2, #0x8]
0089e8d4	fcvt s1,d1
0089e8d8	ldr s2,[x3, #0x10]
0089e8dc	fdiv s1,s1,s2
0089e8e0	b 0x0089eb90
0089e8e4	cmp w9,#0x5
0089e8e8	b.ne 0x0089eb94
0089e8ec	cmp w8,#0x5
0089e8f0	b.ne 0x0089eb94
0089e8f4	str w8,[x0]
0089e8f8	ldr d0,[x2, #0x8]
0089e8fc	ldr d1,[x3, #0x8]
0089e900	fadd d0,d0,d1
0089e904	str d0,[x0, #0x8]
0089e908	ldr d0,[x2, #0x10]
0089e90c	ldr d1,[x3, #0x10]
0089e910	fadd d0,d0,d1
0089e914	str d0,[x0, #0x10]
0089e918	ldr d0,[x2, #0x18]
0089e91c	ldr d1,[x3, #0x18]
0089e920	fadd d0,d0,d1
0089e924	str d0,[x0, #0x18]
0089e928	ldr d0,[x2, #0x20]
0089e92c	ldr d1,[x3, #0x20]
0089e930	fadd d0,d0,d1
0089e934	str d0,[x0, #0x20]
0089e938	b 0x0089eb94
0089e93c	cmp w9,#0x5
0089e940	b.ne 0x0089eb94
0089e944	cmp w8,#0x5
0089e948	b.ne 0x0089eb94
0089e94c	str w8,[x0]
0089e950	ldr d0,[x2, #0x8]
0089e954	ldr d1,[x3, #0x8]
0089e958	fsub d0,d0,d1
0089e95c	str d0,[x0, #0x8]
0089e960	ldr d0,[x2, #0x10]
0089e964	ldr d1,[x3, #0x10]
0089e968	fsub d0,d0,d1
0089e96c	str d0,[x0, #0x10]
0089e970	ldr d0,[x2, #0x18]
0089e974	ldr d1,[x3, #0x18]
0089e978	fsub d0,d0,d1
0089e97c	str d0,[x0, #0x18]
0089e980	ldr d0,[x2, #0x20]
0089e984	ldr d1,[x3, #0x20]
0089e988	fsub d0,d0,d1
0089e98c	str d0,[x0, #0x20]
0089e990	b 0x0089eb94
0089e994	cmp w8,#0x5
0089e998	b.ne 0x0089e9e4
0089e99c	cmp w9,#0x5
0089e9a0	b.ne 0x0089e9e4
0089e9a4	ldr d0,[x2, #0x8]
0089e9a8	ldr d1,[x3, #0x8]
0089e9ac	fcmp d0,d1
0089e9b0	b.ne 0x0089e9e4
0089e9b4	ldr d0,[x2, #0x10]
0089e9b8	ldr d1,[x3, #0x10]
0089e9bc	fcmp d0,d1
0089e9c0	b.ne 0x0089e9e4
0089e9c4	ldr d0,[x2, #0x18]
0089e9c8	ldr d1,[x3, #0x18]
0089e9cc	fcmp d0,d1
0089e9d0	b.ne 0x0089e9e4
0089e9d4	ldr d0,[x2, #0x20]
0089e9d8	ldr d1,[x3, #0x20]
0089e9dc	fcmp d0,d1
0089e9e0	b.ne 0x0089eb94
0089e9e4	mov w8,#0x2
0089e9e8	mov x19,x0
0089e9ec	mov x1,x3
0089e9f0	str w8,[x0]
0089e9f4	mov x0,x2
0089e9f8	bl 0x0089fd34
0089e9fc	mov w8,#0x1
0089ea00	bic w8,w8,w0
0089ea04	strb w8,[x19, #0x8]
0089ea08	b 0x0089eb94
0089ea0c	cmp w9,#0x4
0089ea10	b.ne 0x0089ebc8
0089ea14	cmp w8,#0x3
0089ea18	b.ne 0x0089ebc8
0089ea1c	ldr s0,[x2, #0x14]
0089ea20	fcmp s0,#0.0
0089ea24	b.ne 0x0089ea40
0089ea28	ldr d1,[x3, #0x8]
0089ea2c	fcvt s1,d1
0089ea30	fdiv s0,s0,s1
0089ea34	frintm s0,s0
0089ea38	fcmp s0,#0.0
0089ea3c	b.ne 0x0089eb94
0089ea40	mov w8,#0x4
0089ea44	str w8,[x0]
0089ea48	ldr d0,[x3, #0x8]
0089ea4c	ldr s1,[x2, #0x8]
0089ea50	fcvt s0,d0
0089ea54	fdiv s0,s1,s0
0089ea58	frintm s0,s0
0089ea5c	str s0,[x0, #0x8]
0089ea60	ldr d0,[x3, #0x8]
0089ea64	ldr s1,[x2, #0xc]
0089ea68	fcvt s0,d0
0089ea6c	fdiv s0,s1,s0
0089ea70	frintm s0,s0
0089ea74	str s0,[x0, #0xc]
0089ea78	ldr d0,[x3, #0x8]
0089ea7c	ldr s1,[x2, #0x10]
0089ea80	fcvt s0,d0
0089ea84	fdiv s0,s1,s0
0089ea88	frintm s0,s0
0089ea8c	str s0,[x0, #0x10]
0089ea90	ldr d0,[x3, #0x8]
0089ea94	ldr s1,[x2, #0x14]
0089ea98	fcvt s0,d0
0089ea9c	fdiv s0,s1,s0
0089eaa0	frintm s0,s0
0089eaa4	str s0,[x0, #0x14]
0089eaa8	b 0x0089eb94
0089eaac	cmp w9,#0x4
0089eab0	b.ne 0x0089ec38
0089eab4	cmp w8,#0x3
0089eab8	b.ne 0x0089ec38
0089eabc	ldr d0,[x3, #0x8]
0089eac0	ldr s1,[x2, #0x14]
0089eac4	fcvt s0,d0
0089eac8	fcmp s1,#0.0
0089eacc	fmul s0,s1,s0
0089ead0	b.ne 0x0089eadc
0089ead4	fcmp s0,#0.0
0089ead8	b.ne 0x0089eb94
0089eadc	mov w8,#0x4
0089eae0	str w8,[x0]
0089eae4	ldr d1,[x3, #0x8]
0089eae8	ldr s2,[x2, #0x8]
0089eaec	fcvt s1,d1
0089eaf0	fmul s1,s2,s1
0089eaf4	str s1,[x0, #0x8]
0089eaf8	ldr d1,[x3, #0x8]
0089eafc	ldr s2,[x2, #0xc]
0089eb00	fcvt s1,d1
0089eb04	fmul s1,s2,s1
0089eb08	str s1,[x0, #0xc]
0089eb0c	ldr d1,[x3, #0x8]
0089eb10	ldr s2,[x2, #0x10]
0089eb14	fcvt s1,d1
0089eb18	fmul s1,s2,s1
0089eb1c	b 0x0089eb90
0089eb20	cmp w9,#0x4
0089eb24	b.ne 0x0089ec9c
0089eb28	cmp w8,#0x3
0089eb2c	b.ne 0x0089ec9c
0089eb30	ldr d0,[x3, #0x8]
0089eb34	ldr s1,[x2, #0x14]
0089eb38	fcvt s0,d0
0089eb3c	fcmp s1,#0.0
0089eb40	fdiv s0,s1,s0
0089eb44	b.ne 0x0089eb50
0089eb48	fcmp s0,#0.0
0089eb4c	b.ne 0x0089eb94
0089eb50	mov w8,#0x4
0089eb54	str w8,[x0]
0089eb58	ldr d1,[x3, #0x8]
0089eb5c	ldr s2,[x2, #0x8]
0089eb60	fcvt s1,d1
0089eb64	fdiv s1,s2,s1
0089eb68	str s1,[x0, #0x8]
0089eb6c	ldr d1,[x3, #0x8]
0089eb70	ldr s2,[x2, #0xc]
0089eb74	fcvt s1,d1
0089eb78	fdiv s1,s2,s1
0089eb7c	str s1,[x0, #0xc]
0089eb80	ldr d1,[x3, #0x8]
0089eb84	ldr s2,[x2, #0x10]
0089eb88	fcvt s1,d1
0089eb8c	fdiv s1,s2,s1
0089eb90	stp s1,s0,[x0, #0x10]
0089eb94	ldr x8,[x20, #0x28]
0089eb98	ldur x9,[x29, #-0x8]
0089eb9c	cmp x8,x9
0089eba0	b.ne 0x0089efd0
0089eba4	ldp x20,x19,[sp, #0x50]
0089eba8	ldr x23,[sp, #0x30]
0089ebac	ldp x22,x21,[sp, #0x40]
0089ebb0	ldp x29,x30,[sp, #0x20]
0089ebb4	add sp,sp,#0x60
0089ebb8	ret
0089ebbc	ldr x8,[x3, #0x8]
0089ebc0	str x8,[x0, #0x8]
0089ebc4	b 0x0089eb94
0089ebc8	cmp w9,#0x5
0089ebcc	b.ne 0x0089ed0c
0089ebd0	cmp w8,#0x5
0089ebd4	b.ne 0x0089ed0c
0089ebd8	ldr d2,[x2, #0x20]
0089ebdc	ldr d1,[x3, #0x20]
0089ebe0	fdiv d0,d2,d1
0089ebe4	frintm d0,d0
0089ebe8	fcmp d0,#0.0
0089ebec	b.eq 0x0089ec00
0089ebf0	fcmp d2,#0.0
0089ebf4	b.ne 0x0089ec00
0089ebf8	fcmp d1,#0.0
0089ebfc	b.eq 0x0089eb94
0089ec00	mov w8,#0x5
0089ec04	str w8,[x0]
0089ec08	ldr d1,[x2, #0x8]
0089ec0c	ldr d2,[x3, #0x8]
0089ec10	fdiv d1,d1,d2
0089ec14	frintm d1,d1
0089ec18	str d1,[x0, #0x8]
0089ec1c	ldr d1,[x2, #0x10]
0089ec20	ldr d2,[x3, #0x10]
0089ec24	fdiv d1,d1,d2
0089ec28	frintm d1,d1
0089ec2c	str d1,[x0, #0x10]
0089ec30	ldr d1,[x2, #0x18]
0089ec34	b 0x0089ed70
0089ec38	cmp w9,#0x5
0089ec3c	b.ne 0x0089ed80
0089ec40	cmp w8,#0x5
0089ec44	b.ne 0x0089ed80
0089ec48	ldr d2,[x2, #0x20]
0089ec4c	ldr d1,[x3, #0x20]
0089ec50	fmul d0,d2,d1
0089ec54	fcmp d0,#0.0
0089ec58	b.eq 0x0089ec6c
0089ec5c	fcmp d2,#0.0
0089ec60	b.ne 0x0089ec6c
0089ec64	fcmp d1,#0.0
0089ec68	b.eq 0x0089eb94
0089ec6c	mov w8,#0x5
0089ec70	str w8,[x0]
0089ec74	ldr d1,[x2, #0x8]
0089ec78	ldr d2,[x3, #0x8]
0089ec7c	fmul d1,d1,d2
0089ec80	str d1,[x0, #0x8]
0089ec84	ldr d1,[x2, #0x10]
0089ec88	ldr d2,[x3, #0x10]
0089ec8c	fmul d1,d1,d2
0089ec90	str d1,[x0, #0x10]
0089ec94	ldr d1,[x2, #0x18]
0089ec98	b 0x0089edd8
0089ec9c	cmp w9,#0x5
0089eca0	b.ne 0x0089ede4
0089eca4	cmp w8,#0x5
0089eca8	b.ne 0x0089ede4
0089ecac	ldr d2,[x2, #0x20]
0089ecb0	ldr d1,[x3, #0x20]
0089ecb4	fdiv d0,d2,d1
0089ecb8	fcmp d0,#0.0
0089ecbc	b.eq 0x0089ecd0
0089ecc0	fcmp d2,#0.0
0089ecc4	b.ne 0x0089ecd0
0089ecc8	fcmp d1,#0.0
0089eccc	b.eq 0x0089eb94
0089ecd0	mov w8,#0x5
0089ecd4	str w8,[x0]
0089ecd8	ldr d1,[x2, #0x8]
0089ecdc	ldr d2,[x3, #0x8]
0089ece0	fdiv d1,d1,d2
0089ece4	str d1,[x0, #0x8]
0089ece8	ldr d1,[x2, #0x10]
0089ecec	ldr d2,[x3, #0x10]
0089ecf0	fdiv d1,d1,d2
0089ecf4	str d1,[x0, #0x10]
0089ecf8	ldr d1,[x2, #0x18]
0089ecfc	b 0x0089ee3c
0089ed00	ldr x8,[x2, #0x8]
0089ed04	str x8,[x0, #0x8]
0089ed08	b 0x0089eb94
0089ed0c	cmp w9,#0x3
0089ed10	b.ne 0x0089ee4c
0089ed14	cmp w8,#0x5
0089ed18	b.ne 0x0089ee4c
0089ed1c	ldr d1,[x3, #0x20]
0089ed20	ldr d0,[x2, #0x8]
0089ed24	fdiv d0,d0,d1
0089ed28	frintm d0,d0
0089ed2c	fcmp d0,#0.0
0089ed30	b.eq 0x0089ed3c
0089ed34	fcmp d1,#0.0
0089ed38	b.eq 0x0089eb94
0089ed3c	mov w8,#0x5
0089ed40	str w8,[x0]
0089ed44	ldr d1,[x2, #0x8]
0089ed48	ldr d2,[x3, #0x8]
0089ed4c	fdiv d1,d1,d2
0089ed50	frintm d1,d1
0089ed54	str d1,[x0, #0x8]
0089ed58	ldr d1,[x2, #0x8]
0089ed5c	ldr d2,[x3, #0x10]
0089ed60	fdiv d1,d1,d2
0089ed64	frintm d1,d1
0089ed68	str d1,[x0, #0x10]
0089ed6c	ldr d1,[x2, #0x8]
0089ed70	ldr d2,[x3, #0x18]
0089ed74	fdiv d1,d1,d2
0089ed78	frintm d1,d1
0089ed7c	b 0x0089ee44
0089ed80	cmp w9,#0x3
0089ed84	b.ne 0x0089eed8
0089ed88	cmp w8,#0x5
0089ed8c	b.ne 0x0089eed8
0089ed90	ldr d1,[x3, #0x20]
0089ed94	ldr d0,[x2, #0x8]
0089ed98	fmul d0,d1,d0
0089ed9c	fcmp d1,#0.0
0089eda0	b.ne 0x0089edac
0089eda4	fcmp d0,#0.0
0089eda8	b.ne 0x0089eb94
0089edac	mov w8,#0x5
0089edb0	str w8,[x0]
0089edb4	ldr d1,[x2, #0x8]
0089edb8	ldr d2,[x3, #0x8]
0089edbc	fmul d1,d1,d2
0089edc0	str d1,[x0, #0x8]
0089edc4	ldr d1,[x2, #0x8]
0089edc8	ldr d2,[x3, #0x10]
0089edcc	fmul d1,d1,d2
0089edd0	str d1,[x0, #0x10]
0089edd4	ldr d1,[x2, #0x8]
0089edd8	ldr d2,[x3, #0x18]
0089eddc	fmul d1,d1,d2
0089ede0	b 0x0089ee44
0089ede4	cmp w9,#0x3
0089ede8	b.ne 0x0089ef38
0089edec	cmp w8,#0x5
0089edf0	b.ne 0x0089ef38
0089edf4	ldr d1,[x3, #0x20]
0089edf8	ldr d0,[x2, #0x8]
0089edfc	fdiv d0,d0,d1
0089ee00	fcmp d1,#0.0
0089ee04	b.ne 0x0089ee10
0089ee08	fcmp d0,#0.0
0089ee0c	b.ne 0x0089eb94
0089ee10	mov w8,#0x5
0089ee14	str w8,[x0]
0089ee18	ldr d1,[x2, #0x8]
0089ee1c	ldr d2,[x3, #0x8]
0089ee20	fdiv d1,d1,d2
0089ee24	str d1,[x0, #0x8]
0089ee28	ldr d1,[x2, #0x8]
0089ee2c	ldr d2,[x3, #0x10]
0089ee30	fdiv d1,d1,d2
0089ee34	str d1,[x0, #0x10]
0089ee38	ldr d1,[x2, #0x8]
0089ee3c	ldr d2,[x3, #0x18]
0089ee40	fdiv d1,d1,d2
0089ee44	stp d1,d0,[x0, #0x18]
0089ee48	b 0x0089eb94
0089ee4c	cmp w9,#0x5
0089ee50	b.ne 0x0089eb94
0089ee54	cmp w8,#0x3
0089ee58	b.ne 0x0089eb94
0089ee5c	ldr d0,[x2, #0x20]
0089ee60	ldr d1,[x3, #0x8]
0089ee64	fdiv d1,d0,d1
0089ee68	frintm d1,d1
0089ee6c	fcmp d1,#0.0
0089ee70	b.eq 0x0089ee7c
0089ee74	fcmp d0,#0.0
0089ee78	b.eq 0x0089eb94
0089ee7c	mov w8,#0x5
0089ee80	str w8,[x0]
0089ee84	ldr d0,[x2, #0x8]
0089ee88	ldr d1,[x3, #0x8]
0089ee8c	fdiv d0,d0,d1
0089ee90	frintm d0,d0
0089ee94	str d0,[x0, #0x8]
0089ee98	ldr d0,[x2, #0x10]
0089ee9c	ldr d1,[x3, #0x8]
0089eea0	fdiv d0,d0,d1
0089eea4	frintm d0,d0
0089eea8	str d0,[x0, #0x10]
0089eeac	ldr d0,[x2, #0x18]
0089eeb0	ldr d1,[x3, #0x8]
0089eeb4	fdiv d0,d0,d1
0089eeb8	frintm d0,d0
0089eebc	str d0,[x0, #0x18]
0089eec0	ldr d0,[x2, #0x20]
0089eec4	ldr d1,[x3, #0x8]
0089eec8	fdiv d0,d0,d1
0089eecc	frintm d0,d0
0089eed0	str d0,[x0, #0x20]
0089eed4	b 0x0089eb94
0089eed8	cmp w9,#0x5
0089eedc	b.ne 0x0089eb94
0089eee0	cmp w8,#0x3
0089eee4	b.ne 0x0089eb94
0089eee8	ldr d1,[x2, #0x20]
0089eeec	ldr d0,[x3, #0x8]
0089eef0	fmul d0,d1,d0
0089eef4	fcmp d1,#0.0
0089eef8	b.ne 0x0089ef04
0089eefc	fcmp d0,#0.0
0089ef00	b.ne 0x0089eb94
0089ef04	mov w8,#0x5
0089ef08	str w8,[x0]
0089ef0c	ldr d1,[x2, #0x8]
0089ef10	ldr d2,[x3, #0x8]
0089ef14	fmul d1,d1,d2
0089ef18	str d1,[x0, #0x8]
0089ef1c	ldr d1,[x2, #0x10]
0089ef20	ldr d2,[x3, #0x8]
0089ef24	fmul d1,d1,d2
0089ef28	str d1,[x0, #0x10]
0089ef2c	ldr d1,[x2, #0x18]
0089ef30	ldr d2,[x3, #0x8]
0089ef34	b 0x0089eddc
0089ef38	cmp w9,#0x5
0089ef3c	b.ne 0x0089eb94
0089ef40	cmp w8,#0x3
0089ef44	b.ne 0x0089eb94
0089ef48	ldr d1,[x2, #0x20]
0089ef4c	ldr d0,[x3, #0x8]
0089ef50	fdiv d0,d1,d0
0089ef54	fcmp d1,#0.0
0089ef58	b.ne 0x0089ef64
0089ef5c	fcmp d0,#0.0
0089ef60	b.ne 0x0089eb94
0089ef64	mov w8,#0x5
0089ef68	str w8,[x0]
0089ef6c	ldr d1,[x2, #0x8]
0089ef70	ldr d2,[x3, #0x8]
0089ef74	fdiv d1,d1,d2
0089ef78	str d1,[x0, #0x8]
0089ef7c	ldr d1,[x2, #0x10]
0089ef80	ldr d2,[x3, #0x8]
0089ef84	fdiv d1,d1,d2
0089ef88	str d1,[x0, #0x10]
0089ef8c	ldr d1,[x2, #0x18]
0089ef90	ldr d2,[x3, #0x8]
0089ef94	b 0x0089ee40
0089efd0	bl 0x00c2fec0
