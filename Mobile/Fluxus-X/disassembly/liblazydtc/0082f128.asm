; FUN_0082f128 @ 0082f128
0082f128	sub sp,sp,#0x50
0082f12c	stp x29,x30,[sp, #0x20]
0082f130	stp x22,x21,[sp, #0x30]
0082f134	stp x20,x19,[sp, #0x40]
0082f138	add x29,sp,#0x20
0082f13c	mrs x22,tpidr_el0
0082f140	adrp x9,0x29c000
0082f144	add x9,x9,#0xce0
0082f148	ldr x8,[x22, #0x28]
0082f14c	ldr q0,[x9]
0082f150	mov x19,x0
0082f154	stur x8,[x29, #-0x8]
0082f158	adrp x8,0xd1d000
0082f15c	add x8,x8,#0x7d8
0082f160	str q0,[sp]
0082f164	ldarb w8,[x8]
0082f168	tbz w8,#0x0,0x0082f92c
0082f16c	adrp x8,0xd1d000
0082f170	ldrb w8,[x8, #0x7d0]
0082f174	cmp w8,#0x1
0082f178	b.ne 0x0082f19c
0082f17c	adrp x8,0xd1d000
0082f180	add x8,x8,#0x7c0
0082f184	adrp x9,0x29c000
0082f188	ldr q0,[x8]
0082f18c	ldr q1,[x9, #0x2c0]
0082f190	strb wzr,[x8, #0x10]
0082f194	eor v0.16B,v0.16B,v1.16B
0082f198	str q0,[x8]
0082f19c	nop
0082f1a0	adr x20,0x82fd6c
0082f1a4	adrp x21,0xd1d000
0082f1a8	add x21,x21,#0x7c0
0082f1ac	mov x0,x19
0082f1b0	mov x1,x20
0082f1b4	mov x2,x21
0082f1b8	mov w3,wzr
0082f1bc	mov x4,xzr
0082f1c0	bl 0x008ac76c
0082f1c4	mov x0,x19
0082f1c8	mov w1,#0xffffffff
0082f1cc	bl 0x008aa2e4
0082f1d0	ldr x8,[x0]
0082f1d4	adrp x0,0xd1d000
0082f1d8	add x0,x0,#0x790
0082f1dc	mov x1,sp
0082f1e0	mov x2,sp
0082f1e4	str x8,[sp]
0082f1e8	bl 0x00807f14
0082f1ec	adrp x0,0xcca000
0082f1f0	add x0,x0,#0x848
0082f1f4	mov x1,sp
0082f1f8	mov x2,sp
0082f1fc	str x20,[sp]
0082f200	bl 0x0080837c
0082f204	mov x0,x19
0082f208	mov w1,#0xffffd8ee
0082f20c	mov x2,x21
0082f210	bl 0x008ad800
0082f214	adrp x8,0x29d000
0082f218	add x8,x8,#0x160
0082f21c	ldr q0,[x8]
0082f220	adrp x8,0xd1d000
0082f224	add x8,x8,#0x848
0082f228	str q0,[sp]
0082f22c	ldarb w8,[x8]
0082f230	tbz w8,#0x0,0x0082f978
0082f234	adrp x8,0xd1d000
0082f238	ldrb w8,[x8, #0x840]
0082f23c	cmp w8,#0x1
0082f240	b.ne 0x0082f264
0082f244	adrp x8,0xd1d000
0082f248	add x8,x8,#0x830
0082f24c	adrp x9,0x29c000
0082f250	ldr q0,[x8]
0082f254	ldr q1,[x9, #0xcd0]
0082f258	strb wzr,[x8, #0x10]
0082f25c	eor v0.16B,v0.16B,v1.16B
0082f260	str q0,[x8]
0082f264	nop
0082f268	adr x20,0x82fdac
0082f26c	adrp x21,0xd1d000
0082f270	add x21,x21,#0x830
0082f274	mov x0,x19
0082f278	mov x1,x20
0082f27c	mov x2,x21
0082f280	mov w3,wzr
0082f284	mov x4,xzr
0082f288	bl 0x008ac76c
0082f28c	mov x0,x19
0082f290	mov w1,#0xffffffff
0082f294	bl 0x008aa2e4
0082f298	ldr x8,[x0]
0082f29c	adrp x0,0xd1d000
0082f2a0	add x0,x0,#0x790
0082f2a4	mov x1,sp
0082f2a8	mov x2,sp
0082f2ac	str x8,[sp]
0082f2b0	bl 0x00807f14
0082f2b4	adrp x0,0xcca000
0082f2b8	add x0,x0,#0x848
0082f2bc	mov x1,sp
0082f2c0	mov x2,sp
0082f2c4	str x20,[sp]
0082f2c8	bl 0x0080837c
0082f2cc	mov x0,x19
0082f2d0	mov w1,#0xffffd8ee
0082f2d4	mov x2,x21
0082f2d8	bl 0x008ad800
0082f2dc	adrp x8,0xd1d000
0082f2e0	add x8,x8,#0x860
0082f2e4	ldarb w9,[x8]
0082f2e8	adrp x8,0xd1d000
0082f2ec	add x8,x8,#0x850
0082f2f0	tbz w9,#0x0,0x0082f9c4
0082f2f4	adrp x9,0xd1d000
0082f2f8	ldrb w9,[x9, #0x85c]
0082f2fc	cmp w9,#0x1
0082f300	b.ne 0x0082f338
0082f304	ldr s0,[x8, #0x8]
0082f308	adrp x9,0x29b000
0082f30c	strb wzr,[x8, #0xc]
0082f310	ldr d1,[x9, #0x4e8]
0082f314	adrp x9,0x29b000
0082f318	uxtl v0.8H,v0.8B
0082f31c	ldr d2,[x9, #0x5c8]
0082f320	eor v0.8B,v0.8B,v1.8B
0082f324	ldr d1,[x8]
0082f328	eor v1.8B,v1.8B,v2.8B
0082f32c	uzp1 v0.8B,v0.8B,v0.8B
0082f330	str d1,[x8]
0082f334	str s0,[x8, #0x8]
0082f338	nop
0082f33c	adr x20,0x82ff90
0082f340	adrp x21,0xd1d000
0082f344	add x21,x21,#0x850
0082f348	mov x0,x19
0082f34c	mov x1,x20
0082f350	mov x2,x21
0082f354	mov w3,wzr
0082f358	mov x4,xzr
0082f35c	bl 0x008ac76c
0082f360	mov x0,x19
0082f364	mov w1,#0xffffffff
0082f368	bl 0x008aa2e4
0082f36c	ldr x8,[x0]
0082f370	adrp x0,0xd1d000
0082f374	add x0,x0,#0x790
0082f378	mov x1,sp
0082f37c	mov x2,sp
0082f380	str x8,[sp]
0082f384	bl 0x00807f14
0082f388	adrp x0,0xcca000
0082f38c	add x0,x0,#0x848
0082f390	mov x1,sp
0082f394	mov x2,sp
0082f398	str x20,[sp]
0082f39c	bl 0x0080837c
0082f3a0	mov x0,x19
0082f3a4	mov w1,#0xffffd8ee
0082f3a8	mov x2,x21
0082f3ac	bl 0x008ad800
0082f3b0	adrp x8,0xd1d000
0082f3b4	add x8,x8,#0x878
0082f3b8	ldarb w9,[x8]
0082f3bc	adrp x8,0xd1d000
0082f3c0	add x8,x8,#0x868
0082f3c4	tbz w9,#0x0,0x0082fa30
0082f3c8	adrp x9,0xd1d000
0082f3cc	ldrb w9,[x9, #0x873]
0082f3d0	cmp w9,#0x1
0082f3d4	b.ne 0x0082f418
0082f3d8	adrp x9,0x29b000
0082f3dc	ldr d0,[x8]
0082f3e0	ldrb w10,[x8, #0x8]
0082f3e4	ldr d1,[x9, #0x858]
0082f3e8	mov w11,#0x5f
0082f3ec	ldrb w9,[x8, #0x9]
0082f3f0	eor w10,w10,w11
0082f3f4	ldrb w11,[x8, #0xa]
0082f3f8	strb wzr,[x8, #0xb]
0082f3fc	eor v0.8B,v0.8B,v1.8B
0082f400	strb w10,[x8, #0x8]
0082f404	mvn w9,w9
0082f408	eor w10,w11,#0xffffff9f
0082f40c	strb w9,[x8, #0x9]
0082f410	strb w10,[x8, #0xa]
0082f414	str d0,[x8]
0082f418	nop
0082f41c	adr x20,0x82ffdc
0082f420	adrp x21,0xd1d000
0082f424	add x21,x21,#0x868
0082f428	mov x0,x19
0082f42c	mov x1,x20
0082f430	mov x2,x21
0082f434	mov w3,wzr
0082f438	mov x4,xzr
0082f43c	bl 0x008ac76c
0082f440	mov x0,x19
0082f444	mov w1,#0xffffffff
0082f448	bl 0x008aa2e4
0082f44c	ldr x8,[x0]
0082f450	adrp x0,0xd1d000
0082f454	add x0,x0,#0x790
0082f458	mov x1,sp
0082f45c	mov x2,sp
0082f460	str x8,[sp]
0082f464	bl 0x00807f14
0082f468	adrp x0,0xcca000
0082f46c	add x0,x0,#0x848
0082f470	mov x1,sp
0082f474	mov x2,sp
0082f478	str x20,[sp]
0082f47c	bl 0x0080837c
0082f480	mov x0,x19
0082f484	mov w1,#0xffffd8ee
0082f488	mov x2,x21
0082f48c	bl 0x008ad800
0082f490	adrp x8,0xd1d000
0082f494	add x8,x8,#0x890
0082f498	ldarb w9,[x8]
0082f49c	adrp x8,0xd1d000
0082f4a0	add x8,x8,#0x880
0082f4a4	tbz w9,#0x0,0x0082fa94
0082f4a8	adrp x9,0xd1d000
0082f4ac	ldrb w9,[x9, #0x88e]
0082f4b0	cmp w9,#0x1
0082f4b4	b.ne 0x0082f50c
0082f4b8	ldr s0,[x8, #0x8]
0082f4bc	adrp x9,0x29b000
0082f4c0	ldr d2,[x8]
0082f4c4	ldr d1,[x9, #0x860]
0082f4c8	adrp x9,0x29b000
0082f4cc	mov w10,#0x75
0082f4d0	uxtl v0.8H,v0.8B
0082f4d4	ldrb w11,[x8, #0xd]
0082f4d8	strb wzr,[x8, #0xe]
0082f4dc	eor v0.8B,v0.8B,v1.8B
0082f4e0	ldr d1,[x9, #0xd18]
0082f4e4	ldrb w9,[x8, #0xc]
0082f4e8	eor v1.8B,v2.8B,v1.8B
0082f4ec	eor w9,w9,w10
0082f4f0	mov w10,#0x43
0082f4f4	uzp1 v0.8B,v0.8B,v0.8B
0082f4f8	eor w10,w11,w10
0082f4fc	strb w9,[x8, #0xc]
0082f500	strb w10,[x8, #0xd]
0082f504	str d1,[x8]
0082f508	str s0,[x8, #0x8]
0082f50c	nop
0082f510	adr x20,0x830020
0082f514	adrp x21,0xd1d000
0082f518	add x21,x21,#0x880
0082f51c	mov x0,x19
0082f520	mov x1,x20
0082f524	mov x2,x21
0082f528	mov w3,wzr
0082f52c	mov x4,xzr
0082f530	bl 0x008ac76c
0082f534	mov x0,x19
0082f538	mov w1,#0xffffffff
0082f53c	bl 0x008aa2e4
0082f540	ldr x8,[x0]
0082f544	adrp x0,0xd1d000
0082f548	add x0,x0,#0x790
0082f54c	mov x1,sp
0082f550	mov x2,sp
0082f554	str x8,[sp]
0082f558	bl 0x00807f14
0082f55c	adrp x0,0xcca000
0082f560	add x0,x0,#0x848
0082f564	mov x1,sp
0082f568	mov x2,sp
0082f56c	str x20,[sp]
0082f570	bl 0x0080837c
0082f574	mov x0,x19
0082f578	mov w1,#0xffffd8ee
0082f57c	mov x2,x21
0082f580	bl 0x008ad800
0082f584	adrp x8,0xd1d000
0082f588	add x8,x8,#0x8a8
0082f58c	ldarb w9,[x8]
0082f590	adrp x8,0xd1d000
0082f594	add x8,x8,#0x898
0082f598	tbz w9,#0x0,0x0082fb08
0082f59c	adrp x9,0xd1d000
0082f5a0	ldrb w9,[x9, #0x8a5]
0082f5a4	cmp w9,#0x1
0082f5a8	b.ne 0x0082f5f0
0082f5ac	ldr s0,[x8, #0x8]
0082f5b0	adrp x9,0x29a000
0082f5b4	mov w10,#0x73
0082f5b8	ldr d1,[x9, #0xce8]
0082f5bc	adrp x9,0x29b000
0082f5c0	strb wzr,[x8, #0xd]
0082f5c4	uxtl v0.8H,v0.8B
0082f5c8	ldr d2,[x9, #0x5d0]
0082f5cc	ldrb w9,[x8, #0xc]
0082f5d0	eor w9,w9,w10
0082f5d4	eor v0.8B,v0.8B,v1.8B
0082f5d8	ldr d1,[x8]
0082f5dc	strb w9,[x8, #0xc]
0082f5e0	eor v1.8B,v1.8B,v2.8B
0082f5e4	uzp1 v0.8B,v0.8B,v0.8B
0082f5e8	str d1,[x8]
0082f5ec	str s0,[x8, #0x8]
0082f5f0	nop
0082f5f4	adr x20,0x830040
0082f5f8	adrp x21,0xd1d000
0082f5fc	add x21,x21,#0x898
0082f600	mov x0,x19
0082f604	mov x1,x20
0082f608	mov x2,x21
0082f60c	mov w3,wzr
0082f610	mov x4,xzr
0082f614	bl 0x008ac76c
0082f618	mov x0,x19
0082f61c	mov w1,#0xffffffff
0082f620	bl 0x008aa2e4
0082f624	ldr x8,[x0]
0082f628	adrp x0,0xd1d000
0082f62c	add x0,x0,#0x790
0082f630	mov x1,sp
0082f634	mov x2,sp
0082f638	str x8,[sp]
0082f63c	bl 0x00807f14
0082f640	adrp x0,0xcca000
0082f644	add x0,x0,#0x848
0082f648	mov x1,sp
0082f64c	mov x2,sp
0082f650	str x20,[sp]
0082f654	bl 0x0080837c
0082f658	mov x0,x19
0082f65c	mov w1,#0xffffd8ee
0082f660	mov x2,x21
0082f664	bl 0x008ad800
0082f668	adrp x8,0x35e000
0082f66c	add x8,x8,#0x754
0082f670	ldr q0,[x8]
0082f674	mov w8,#0x83db
0082f678	strh w8,[sp, #0x10]
0082f67c	adrp x8,0xd1d000
0082f680	add x8,x8,#0x8c8
0082f684	str q0,[sp]
0082f688	ldarb w8,[x8]
0082f68c	tbz w8,#0x0,0x0082fb74
0082f690	adrp x20,0xd1d000
0082f694	add x20,x20,#0x8b0
0082f698	mov x0,x20
0082f69c	bl 0x00830e2c
0082f6a0	nop
0082f6a4	adr x21,0x830060
0082f6a8	mov x0,x19
0082f6ac	mov x1,x21
0082f6b0	mov x2,x20
0082f6b4	mov w3,wzr
0082f6b8	mov x4,xzr
0082f6bc	bl 0x008ac76c
0082f6c0	mov x0,x19
0082f6c4	mov w1,#0xffffffff
0082f6c8	bl 0x008aa2e4
0082f6cc	ldr x8,[x0]
0082f6d0	adrp x0,0xd1d000
0082f6d4	add x0,x0,#0x790
0082f6d8	mov x1,sp
0082f6dc	mov x2,sp
0082f6e0	str x8,[sp]
0082f6e4	bl 0x00807f14
0082f6e8	adrp x0,0xcca000
0082f6ec	add x0,x0,#0x848
0082f6f0	mov x1,sp
0082f6f4	mov x2,sp
0082f6f8	str x21,[sp]
0082f6fc	bl 0x0080837c
0082f700	mov x0,x19
0082f704	mov w1,#0xffffd8ee
0082f708	mov x2,x20
0082f70c	bl 0x008ad800
0082f710	adrp x8,0x35e000
0082f714	add x8,x8,#0x766
0082f718	ldr q0,[x8]
0082f71c	mov w8,#0x3bdf
0082f720	strh w8,[sp, #0x10]
0082f724	adrp x8,0xd1d000
0082f728	add x8,x8,#0x8e8
0082f72c	str q0,[sp]
0082f730	ldarb w8,[x8]
0082f734	tbz w8,#0x0,0x0082fbc0
0082f738	adrp x20,0xd1d000
0082f73c	add x20,x20,#0x8d0
0082f740	mov x0,x20
0082f744	bl 0x00830e6c
0082f748	nop
0082f74c	adr x21,0x830080
0082f750	mov x0,x19
0082f754	mov x1,x21
0082f758	mov x2,x20
0082f75c	mov w3,wzr
0082f760	mov x4,xzr
0082f764	bl 0x008ac76c
0082f768	mov x0,x19
0082f76c	mov w1,#0xffffffff
0082f770	bl 0x008aa2e4
0082f774	ldr x8,[x0]
0082f778	adrp x0,0xd1d000
0082f77c	add x0,x0,#0x790
0082f780	mov x1,sp
0082f784	mov x2,sp
0082f788	str x8,[sp]
0082f78c	bl 0x00807f14
0082f790	adrp x0,0xcca000
0082f794	add x0,x0,#0x848
0082f798	mov x1,sp
0082f79c	mov x2,sp
0082f7a0	str x21,[sp]
0082f7a4	bl 0x0080837c
0082f7a8	mov x0,x19
0082f7ac	mov w1,#0xffffd8ee
0082f7b0	mov x2,x20
0082f7b4	bl 0x008ad800
0082f7b8	adrp x8,0xd1d000
0082f7bc	add x8,x8,#0x980
0082f7c0	ldarb w9,[x8]
0082f7c4	adrp x8,0xd1d000
0082f7c8	add x8,x8,#0x970
0082f7cc	tbz w9,#0x0,0x0082fc0c
0082f7d0	adrp x9,0xd1d000
0082f7d4	ldrb w9,[x9, #0x97f]
0082f7d8	cmp w9,#0x1
0082f7dc	b.ne 0x0082f840
0082f7e0	ldr s0,[x8, #0x8]
0082f7e4	adrp x9,0x29b000
0082f7e8	ldr d2,[x8]
0082f7ec	ldr d1,[x9, #0x2e8]
0082f7f0	adrp x9,0x29a000
0082f7f4	ldrb w10,[x8, #0xc]
0082f7f8	uxtl v0.8H,v0.8B
0082f7fc	mov w11,#0xa3
0082f800	strb wzr,[x8, #0xf]
0082f804	eor w10,w10,w11
0082f808	ldrb w11,[x8, #0xe]
0082f80c	strb w10,[x8, #0xc]
0082f810	mov w10,#0xa7
0082f814	eor v0.8B,v0.8B,v1.8B
0082f818	ldr d1,[x9, #0xf48]
0082f81c	ldrb w9,[x8, #0xd]
0082f820	eor w10,w11,w10
0082f824	eor v1.8B,v2.8B,v1.8B
0082f828	eor w9,w9,#0xffffff81
0082f82c	strb w10,[x8, #0xe]
0082f830	uzp1 v0.8B,v0.8B,v0.8B
0082f834	strb w9,[x8, #0xd]
0082f838	str d1,[x8]
0082f83c	str s0,[x8, #0x8]
0082f840	nop
0082f844	adr x20,0x8300c0
0082f848	adrp x21,0xd1d000
0082f84c	add x21,x21,#0x970
0082f850	mov x0,x19
0082f854	mov x1,x20
0082f858	mov x2,x21
0082f85c	mov w3,wzr
0082f860	mov x4,xzr
0082f864	bl 0x008ac76c
0082f868	mov x0,x19
0082f86c	mov w1,#0xffffffff
0082f870	bl 0x008aa2e4
0082f874	ldr x8,[x0]
0082f878	adrp x0,0xd1d000
0082f87c	add x0,x0,#0x790
0082f880	mov x1,sp
0082f884	mov x2,sp
0082f888	str x8,[sp]
0082f88c	bl 0x00807f14
0082f890	adrp x0,0xcca000
0082f894	add x0,x0,#0x848
0082f898	mov x1,sp
0082f89c	mov x2,sp
0082f8a0	str x20,[sp]
0082f8a4	bl 0x0080837c
0082f8a8	mov x0,x19
0082f8ac	mov w1,#0xffffd8ee
0082f8b0	mov x2,x21
0082f8b4	bl 0x008ad800
0082f8b8	adrp x8,0xd1d000
0082f8bc	add x8,x8,#0x9a0
0082f8c0	ldarb w8,[x8]
0082f8c4	tbz w8,#0x0,0x0082fc64
0082f8c8	nop
0082f8cc	adr x1,0x830020
0082f8d0	adrp x2,0xd1d000
0082f8d4	add x2,x2,#0x990
0082f8d8	mov x0,x19
0082f8dc	bl 0x0083060c
0082f8e0	adrp x8,0xd1d000
0082f8e4	add x8,x8,#0x9b8
0082f8e8	ldarb w8,[x8]
0082f8ec	tbz w8,#0x0,0x0082fcac
0082f8f0	nop
0082f8f4	adr x1,0x830040
0082f8f8	adrp x2,0xd1d000
0082f8fc	add x2,x2,#0x9a8
0082f900	mov x0,x19
0082f904	bl 0x00830738
0082f908	ldr x8,[x22, #0x28]
0082f90c	ldur x9,[x29, #-0x8]
0082f910	cmp x8,x9
0082f914	b.ne 0x0082fd68
0082f918	ldp x20,x19,[sp, #0x40]
0082f91c	ldp x22,x21,[sp, #0x30]
0082f920	ldp x29,x30,[sp, #0x20]
0082f924	add sp,sp,#0x50
0082f928	ret
0082f92c	adrp x0,0xd1d000
0082f930	add x0,x0,#0x7d8
0082f934	bl 0x00c2fe90
0082f938	cbz w0,0x0082f16c
0082f93c	adrp x0,0xd1d000
0082f940	add x0,x0,#0x7c0
0082f944	mov x1,sp
0082f948	bl 0x00830850
0082f94c	nop
0082f950	adr x0,0x8308dc
0082f954	adrp x1,0xd1d000
0082f958	add x1,x1,#0x7c0
0082f95c	adrp x2,0xc48000
0082f960	add x2,x2,#0x880
0082f964	bl 0x00c2fe70
0082f968	adrp x0,0xd1d000
0082f96c	add x0,x0,#0x7d8
0082f970	bl 0x00c2fea0
0082f974	b 0x0082f16c
0082f978	adrp x0,0xd1d000
0082f97c	add x0,x0,#0x848
0082f980	bl 0x00c2fe90
0082f984	cbz w0,0x0082f234
0082f988	adrp x0,0xd1d000
0082f98c	add x0,x0,#0x830
0082f990	mov x1,sp
0082f994	bl 0x00830bc0
0082f998	nop
0082f99c	adr x0,0x830c4c
0082f9a0	adrp x1,0xd1d000
0082f9a4	add x1,x1,#0x830
0082f9a8	adrp x2,0xc48000
0082f9ac	add x2,x2,#0x880
0082f9b0	bl 0x00c2fe70
0082f9b4	adrp x0,0xd1d000
0082f9b8	add x0,x0,#0x848
0082f9bc	bl 0x00c2fea0
0082f9c0	b 0x0082f234
0082f9c4	adrp x0,0xd1d000
0082f9c8	add x0,x0,#0x860
0082f9cc	bl 0x00c2fe90
0082f9d0	adrp x8,0xd1d000
0082f9d4	add x8,x8,#0x850
0082f9d8	cbz w0,0x0082f2f4
0082f9dc	adrp x9,0x29a000
0082f9e0	adrp x11,0x29b000
0082f9e4	mov w10,#0x1
0082f9e8	ldr d0,[x9, #0xf40]
0082f9ec	ldr d1,[x11, #0x5c0]
0082f9f0	nop
0082f9f4	adr x0,0x830c54
0082f9f8	adrp x2,0xc48000
0082f9fc	add x2,x2,#0x880
0082fa00	adrp x1,0xd1d000
0082fa04	add x1,x1,#0x850
0082fa08	strb w10,[x8, #0xc]
0082fa0c	str d0,[x8]
0082fa10	str s1,[x8, #0x8]
0082fa14	bl 0x00c2fe70
0082fa18	adrp x0,0xd1d000
0082fa1c	add x0,x0,#0x860
0082fa20	bl 0x00c2fea0
0082fa24	adrp x8,0xd1d000
0082fa28	add x8,x8,#0x850
0082fa2c	b 0x0082f2f4
0082fa30	adrp x0,0xd1d000
0082fa34	add x0,x0,#0x878
0082fa38	bl 0x00c2fe90
0082fa3c	adrp x8,0xd1d000
0082fa40	add x8,x8,#0x868
0082fa44	cbz w0,0x0082f3c8
0082fa48	adrp x9,0x29a000
0082fa4c	adrp x10,0x29b000
0082fa50	nop
0082fa54	adr x0,0x830c60
0082fa58	ldr d0,[x9, #0x608]
0082fa5c	ldr d1,[x10, #0xf20]
0082fa60	adrp x2,0xc48000
0082fa64	add x2,x2,#0x880
0082fa68	adrp x1,0xd1d000
0082fa6c	add x1,x1,#0x868
0082fa70	str d0,[x8]
0082fa74	str s1,[x8, #0x8]
0082fa78	bl 0x00c2fe70
0082fa7c	adrp x0,0xd1d000
0082fa80	add x0,x0,#0x878
0082fa84	bl 0x00c2fea0
0082fa88	adrp x8,0xd1d000
0082fa8c	add x8,x8,#0x868
0082fa90	b 0x0082f3c8
0082fa94	adrp x0,0xd1d000
0082fa98	add x0,x0,#0x890
0082fa9c	bl 0x00c2fe90
0082faa0	adrp x8,0xd1d000
0082faa4	add x8,x8,#0x880
0082faa8	cbz w0,0x0082f4a8
0082faac	adrp x9,0x29b000
0082fab0	adrp x11,0x29b000
0082fab4	mov w10,#0x1
0082fab8	ldr d0,[x9, #0xd10]
0082fabc	ldr d1,[x11, #0x788]
0082fac0	mov w9,#0x4310
0082fac4	nop
0082fac8	adr x0,0x830c6c
0082facc	adrp x2,0xc48000
0082fad0	add x2,x2,#0x880
0082fad4	adrp x1,0xd1d000
0082fad8	add x1,x1,#0x880
0082fadc	strb w10,[x8, #0xe]
0082fae0	str d0,[x8]
0082fae4	str s1,[x8, #0x8]
0082fae8	strh w9,[x8, #0xc]
0082faec	bl 0x00c2fe70
0082faf0	adrp x0,0xd1d000
0082faf4	add x0,x0,#0x890
0082faf8	bl 0x00c2fea0
0082fafc	adrp x8,0xd1d000
0082fb00	add x8,x8,#0x880
0082fb04	b 0x0082f4a8
0082fb08	adrp x0,0xd1d000
0082fb0c	add x0,x0,#0x8a8
0082fb10	bl 0x00c2fe90
0082fb14	adrp x8,0xd1d000
0082fb18	add x8,x8,#0x898
0082fb1c	cbz w0,0x0082f59c
0082fb20	adrp x9,0x29b000
0082fb24	adrp x10,0x29b000
0082fb28	nop
0082fb2c	adr x0,0x830c78
0082fb30	ldr d0,[x9, #0xf28]
0082fb34	ldr d1,[x10, #0x1d0]
0082fb38	mov w9,#0x173
0082fb3c	adrp x2,0xc48000
0082fb40	add x2,x2,#0x880
0082fb44	adrp x1,0xd1d000
0082fb48	add x1,x1,#0x898
0082fb4c	str d0,[x8]
0082fb50	str s1,[x8, #0x8]
0082fb54	strh w9,[x8, #0xc]
0082fb58	bl 0x00c2fe70
0082fb5c	adrp x0,0xd1d000
0082fb60	add x0,x0,#0x8a8
0082fb64	bl 0x00c2fea0
0082fb68	adrp x8,0xd1d000
0082fb6c	add x8,x8,#0x898
0082fb70	b 0x0082f59c
0082fb74	adrp x0,0xd1d000
0082fb78	add x0,x0,#0x8c8
0082fb7c	bl 0x00c2fe90
0082fb80	cbz w0,0x0082f690
0082fb84	adrp x0,0xd1d000
0082fb88	add x0,x0,#0x8b0
0082fb8c	mov x1,sp
0082fb90	bl 0x00830c84
0082fb94	nop
0082fb98	adr x0,0x830d20
0082fb9c	adrp x1,0xd1d000
0082fba0	add x1,x1,#0x8b0
0082fba4	adrp x2,0xc48000
0082fba8	add x2,x2,#0x880
0082fbac	bl 0x00c2fe70
0082fbb0	adrp x0,0xd1d000
0082fbb4	add x0,x0,#0x8c8
0082fbb8	bl 0x00c2fea0
0082fbbc	b 0x0082f690
0082fbc0	adrp x0,0xd1d000
0082fbc4	add x0,x0,#0x8e8
0082fbc8	bl 0x00c2fe90
0082fbcc	cbz w0,0x0082f738
0082fbd0	adrp x0,0xd1d000
0082fbd4	add x0,x0,#0x8d0
0082fbd8	mov x1,sp
0082fbdc	bl 0x00830d2c
0082fbe0	nop
0082fbe4	adr x0,0x830dc8
0082fbe8	adrp x1,0xd1d000
0082fbec	add x1,x1,#0x8d0
0082fbf0	adrp x2,0xc48000
0082fbf4	add x2,x2,#0x880
0082fbf8	bl 0x00c2fe70
0082fbfc	adrp x0,0xd1d000
0082fc00	add x0,x0,#0x8e8
0082fc04	bl 0x00c2fea0
0082fc08	b 0x0082f738
0082fc0c	adrp x0,0xd1d000
0082fc10	add x0,x0,#0x980
0082fc14	bl 0x00c2fe90
0082fc18	adrp x8,0xd1d000
0082fc1c	add x8,x8,#0x970
0082fc20	cbz w0,0x0082f7d0
0082fc24	adrp x9,0x29c000
0082fc28	nop
0082fc2c	adr x0,0x830e08
0082fc30	ldr q0,[x9, #0xe80]
0082fc34	adrp x2,0xc48000
0082fc38	add x2,x2,#0x880
0082fc3c	adrp x1,0xd1d000
0082fc40	add x1,x1,#0x970
0082fc44	str q0,[x8]
0082fc48	bl 0x00c2fe70
0082fc4c	adrp x0,0xd1d000
0082fc50	add x0,x0,#0x980
0082fc54	bl 0x00c2fea0
0082fc58	adrp x8,0xd1d000
0082fc5c	add x8,x8,#0x970
0082fc60	b 0x0082f7d0
0082fc64	adrp x0,0xd1d000
0082fc68	add x0,x0,#0x9a0
0082fc6c	bl 0x00c2fe90
0082fc70	cbz w0,0x0082f8c8
0082fc74	adrp x8,0x29c000
0082fc78	adrp x1,0xd1d000
0082fc7c	add x1,x1,#0x990
0082fc80	ldr q0,[x8, #0x1a0]
0082fc84	nop
0082fc88	adr x0,0x830e14
0082fc8c	adrp x2,0xc48000
0082fc90	add x2,x2,#0x880
0082fc94	str q0,[x1]
0082fc98	bl 0x00c2fe70
0082fc9c	adrp x0,0xd1d000
0082fca0	add x0,x0,#0x9a0
0082fca4	bl 0x00c2fea0
0082fca8	b 0x0082f8c8
0082fcac	adrp x0,0xd1d000
0082fcb0	add x0,x0,#0x9b8
0082fcb4	bl 0x00c2fe90
0082fcb8	cbz w0,0x0082f8f0
0082fcbc	adrp x8,0x29b000
0082fcc0	adrp x10,0x29a000
0082fcc4	adrp x1,0xd1d000
0082fcc8	add x1,x1,#0x9a8
0082fccc	ldr d0,[x8, #0xe10]
0082fcd0	ldr d1,[x10, #0x610]
0082fcd4	mov w9,#0x1
0082fcd8	mov w8,#0x72a
0082fcdc	nop
0082fce0	adr x0,0x830e20
0082fce4	adrp x2,0xc48000
0082fce8	add x2,x2,#0x880
0082fcec	strb w9,[x1, #0xe]
0082fcf0	str d0,[x1]
0082fcf4	str s1,[x1, #0x8]
0082fcf8	strh w8,[x1, #0xc]
0082fcfc	bl 0x00c2fe70
0082fd00	adrp x0,0xd1d000
0082fd04	add x0,x0,#0x9b8
0082fd08	bl 0x00c2fea0
0082fd0c	b 0x0082f8f0
0082fd68	bl 0x00c2fec0
