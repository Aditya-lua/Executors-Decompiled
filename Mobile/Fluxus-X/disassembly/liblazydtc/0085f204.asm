; FUN_0085f204 @ 0085f204
0085f204	stp x29,x30,[sp, #-0x60]!
0085f208	stp x28,x27,[sp, #0x10]
0085f20c	stp x26,x25,[sp, #0x20]
0085f210	stp x24,x23,[sp, #0x30]
0085f214	stp x22,x21,[sp, #0x40]
0085f218	stp x20,x19,[sp, #0x50]
0085f21c	mov x29,sp
0085f220	sub sp,sp,#0x1b0
0085f224	mrs x8,tpidr_el0
0085f228	mov x20,x0
0085f22c	mov x19,x0
0085f230	stp x1,x8,[sp, #0x50]
0085f234	sub x28,x29,#0xbc
0085f238	ldr x8,[x8, #0x28]
0085f23c	stur x8,[x29, #-0x18]
0085f240	ldr x8,[x2, #0x8]
0085f244	ldr w22,[x20, #0x90]!
0085f248	cbz x8,0x0085f2bc
0085f24c	cmp w22,#0x12b
0085f250	b.eq 0x0085f2c4
0085f254	sub x8,x29,#0x70
0085f258	mov x0,x20
0085f25c	stp xzr,xzr,[sp, #0xc0]
0085f260	stp xzr,xzr,[x29, #-0xb0]
0085f264	sub x20,x29,#0x70
0085f268	bl 0x008521fc
0085f26c	ldurb w8,[x29, #-0x70]
0085f270	ldur x9,[x29, #-0x60]
0085f274	tst w8,#0x1
0085f278	csinc x5,x9,x20,ne
0085f27c	adrp x4,0x2bc000
0085f280	add x4,x4,#0xc41
0085f284	add x1,x19,#0x94
0085f288	add x2,sp,#0xc0
0085f28c	sub x3,x29,#0xb0
0085f290	mov x0,x19
0085f294	bl 0x0085e984
0085f298	ldurb w8,[x29, #-0x70]
0085f29c	tbz w8,#0x0,0x0085f95c
0085f2a0	ldur x8,[x29, #-0x60]
0085f2a4	ldur x9,[x29, #-0x70]
0085f2a8	mov x19,x0
0085f2ac	and x1,x9,#-0x2
0085f2b0	mov x0,x8
0085f2b4	bl 0x00c2fe80
0085f2b8	b 0x0085f958
0085f2bc	cmp w22,#0x12b
0085f2c0	b.ne 0x0085f3fc
0085f2c4	mov x0,x19
0085f2c8	str x2,[sp, #0x38]
0085f2cc	bl 0x00858f2c
0085f2d0	ldr w8,[x19, #0x90]
0085f2d4	cmp w8,#0x119
0085f2d8	b.ne 0x0085f2f4
0085f2dc	ldur q0,[x19, #0x94]
0085f2e0	ldr x21,[x19, #0xa8]
0085f2e4	mov x0,x19
0085f2e8	stur q0,[x28, #0x14]
0085f2ec	bl 0x00858f2c
0085f2f0	b 0x0085f310
0085f2f4	adrp x1,0x2d4000
0085f2f8	add x1,x1,#0xd62
0085f2fc	mov x0,x19
0085f300	bl 0x0086e040
0085f304	ldur x8,[x19, #0x94]
0085f308	ldr x21,[x19, #0x138]
0085f30c	stp x8,x8,[x29, #-0xa8]
0085f310	sub x8,x29,#0x70
0085f314	mov x0,x19
0085f318	mov w1,wzr
0085f31c	mov x2,xzr
0085f320	mov x3,xzr
0085f324	mov x4,xzr
0085f328	stur x21,[x29, #-0xb0]
0085f32c	sub x24,x29,#0x70
0085f330	bl 0x00863bd4
0085f334	ldr w8,[x19, #0x90]
0085f338	ldur x9,[x19, #0x94]
0085f33c	cmp w8,#0x28
0085f340	stur w8,[x29, #-0xbc]
0085f344	stur x9,[x28, #0x4]
0085f348	b.ne 0x0085f358
0085f34c	mov x0,x19
0085f350	bl 0x00858f2c
0085f354	b 0x0085f36c
0085f358	adrp x2,0x2b1000
0085f35c	add x2,x2,#0x31e
0085f360	mov x0,x19
0085f364	mov w1,#0x28
0085f368	bl 0x0086e3b4
0085f36c	ldr x8,[x19, #0x308]
0085f370	ldr x9,[x19, #0x300]
0085f374	ldr w10,[x19, #0x90]
0085f378	stp xzr,xzr,[x29, #-0xd0]
0085f37c	sub x8,x8,x9
0085f380	orr x9,xzr,#-0x5555555555555556
0085f384	cmp w10,#0x29
0085f388	asr x8,x8,#0x4
0085f38c	movk x9,#0xaaab
0085f390	mul x8,x8,x9
0085f394	add x9,x19,#0x300
0085f398	stur x9,[x29, #-0x30]
0085f39c	stp x8,xzr,[x29, #-0x28]
0085f3a0	b.ne 0x0085f3b0
0085f3a4	mov x23,xzr
0085f3a8	mov w26,wzr
0085f3ac	b 0x0085f3f0
0085f3b0	add x8,sp,#0xc0
0085f3b4	sub x1,x29,#0x30
0085f3b8	mov x0,x19
0085f3bc	mov w2,#0x1
0085f3c0	mov x3,xzr
0085f3c4	mov x4,xzr
0085f3c8	mov x5,xzr
0085f3cc	mov w6,wzr
0085f3d0	bl 0x008614c0
0085f3d4	ldr w8,[x20]
0085f3d8	ldur q0,[sp, #0xc4]
0085f3dc	ldrb w26,[sp, #0xc0]
0085f3e0	ldr x23,[sp, #0xd8]
0085f3e4	cmp w8,#0x29
0085f3e8	stur q0,[x29, #-0xd0]
0085f3ec	b.ne 0x0085f454
0085f3f0	mov x0,x19
0085f3f4	bl 0x00858f2c
0085f3f8	b 0x0085f478
0085f3fc	ldr x21,[x19, #0xa8]
0085f400	cbz x21,0x0085f418
0085f404	adrp x1,0x2d7000
0085f408	add x1,x1,#0x50
0085f40c	mov x0,x21
0085f410	bl 0x00c301f0
0085f414	cbz w0,0x0085f86c
0085f418	cmp w22,#0x119
0085f41c	b.ne 0x0085f834
0085f420	ldur q0,[x19, #0x94]
0085f424	mov x0,x19
0085f428	stur q0,[x28, #0x54]
0085f42c	bl 0x00858f2c
0085f430	ldr w8,[x19, #0x90]
0085f434	mov w9,#0x1
0085f438	stur x21,[x29, #-0x70]
0085f43c	sturb w9,[x29, #-0x58]
0085f440	cmp w8,#0x3a
0085f444	b.ne 0x0085f8bc
0085f448	mov x0,x19
0085f44c	bl 0x00858f2c
0085f450	b 0x0085f8d0
0085f454	sub x2,x29,#0xbc
0085f458	mov x0,x19
0085f45c	mov w1,#0x29
0085f460	mov x3,xzr
0085f464	bl 0x0086b5f8
0085f468	mov x0,x19
0085f46c	mov w1,#0x29
0085f470	mov w3,wzr
0085f474	bl 0x0086e434
0085f478	ldr w8,[x20]
0085f47c	cmp w8,#0x3a
0085f480	b.eq 0x0085f4a0
0085f484	cmp w8,#0x107
0085f488	b.ne 0x0085f4e8
0085f48c	adrp x2,0x2a9000
0085f490	add x2,x2,#0x285
0085f494	add x1,x19,#0x94
0085f498	mov x0,x19
0085f49c	bl 0x00860ecc
0085f4a0	mov x0,x19
0085f4a4	bl 0x00858f2c
0085f4a8	ldr w21,[x19, #0x124]
0085f4ac	mov x0,x19
0085f4b0	bl 0x008665f0
0085f4b4	ldr w8,[x20]
0085f4b8	mov x22,x0
0085f4bc	cmp w8,#0x2c
0085f4c0	b.ne 0x0085f4e0
0085f4c4	adrp x2,0x2a9000
0085f4c8	add x2,x2,#0x2cc
0085f4cc	add x1,x19,#0x94
0085f4d0	mov x0,x19
0085f4d4	bl 0x00860ecc
0085f4d8	mov x0,x19
0085f4dc	bl 0x00858f2c
0085f4e0	str w21,[x19, #0x124]
0085f4e4	cbnz x22,0x0085f50c
0085f4e8	ldr x0,[x19, #0xe8]
0085f4ec	mov w1,#0x38
0085f4f0	bl 0x0084e938
0085f4f4	mov x22,x0
0085f4f8	stp xzr,xzr,[sp, #0xc0]
0085f4fc	str xzr,[sp, #0xd0]
0085f500	add x1,x19,#0x94
0085f504	add x2,sp,#0xc0
0085f508	bl 0x00851204
0085f50c	ldr x27,[x19, #0x368]
0085f510	ldr x25,[x19, #0x360]
0085f514	ldr x8,[x19, #0x3f8]
0085f518	ldr x9,[x19, #0x3f0]
0085f51c	str x22,[sp, #0x30]
0085f520	ldur x22,[x29, #-0x20]
0085f524	sub x10,x27,x25
0085f528	ldur x20,[x19, #0x9c]
0085f52c	sub x8,x8,x9
0085f530	stp x10,x8,[sp, #0x40]
0085f534	cbz x22,0x0085f66c
0085f538	str w26,[sp, #0x2c]
0085f53c	ldp x26,x8,[x29, #-0x30]
0085f540	add x28,sp,#0xc0
0085f544	mov x21,x22
0085f548	add x8,x8,x8, LSL #0x1
0085f54c	lsl x24,x8,#0x4
0085f550	ldr x8,[x26]
0085f554	add x1,x8,x24
0085f558	ldr x8,[x1, #0x18]!
0085f55c	cbz x8,0x0085f6b0
0085f560	add x0,x19,#0x360
0085f564	bl 0x00871cec
0085f568	ldr x8,[x26]
0085f56c	add x8,x8,x24
0085f570	ldr x9,[x8]
0085f574	str x9,[sp, #0xc0]
0085f578	ldur q0,[x8, #0x8]
0085f57c	stur q0,[x28, #0x8]
0085f580	add x0,x19,#0x3f0
0085f584	add x1,sp,#0xc0
0085f588	bl 0x00871de4
0085f58c	subs x21,x21,#0x1
0085f590	add x24,x24,#0x30
0085f594	b.ne 0x0085f550
0085f598	ldr w26,[sp, #0x2c]
0085f59c	cmp x23,#0x0
0085f5a0	sub x24,x29,#0x70
0085f5a4	csel w8,wzr,w26,ne
0085f5a8	tbnz w8,#0x0,0x0085f67c
0085f5ac	ldr x8,[sp, #0x50]
0085f5b0	ldr x0,[x19, #0xe8]
0085f5b4	lsl x1,x22,#0x3
0085f5b8	ldr x21,[x19, #0x360]
0085f5bc	mov x28,x23
0085f5c0	ldr x8,[x8]
0085f5c4	stp x8,x20,[sp, #0xb0]
0085f5c8	mov x23,x0
0085f5cc	bl 0x0084e938
0085f5d0	cmp x22,#0x8
0085f5d4	b.cc 0x0085f5ec
0085f5d8	add x8,x25,x0
0085f5dc	add x9,x21,x27
0085f5e0	sub x8,x8,x9
0085f5e4	cmp x8,#0x20
0085f5e8	b.cs 0x0085f990
0085f5ec	mov x8,xzr
0085f5f0	lsl x10,x8,#0x3
0085f5f4	sub x8,x22,x8
0085f5f8	add x9,x27,x10
0085f5fc	add x10,x0,x10
0085f600	sub x9,x9,x25
0085f604	add x9,x21,x9
0085f608	ldr x11,[x9], #0x8
0085f60c	subs x8,x8,#0x1
0085f610	str x11,[x10], #0x8
0085f614	b.ne 0x0085f608
0085f618	add x8,x22,x22, LSL #0x1
0085f61c	stp x0,x22,[sp, #0xc0]
0085f620	ldr x20,[x19, #0x3f0]
0085f624	ldr x0,[x19, #0xe8]
0085f628	str x28,[sp, #0xd0]
0085f62c	lsl x1,x8,#0x3
0085f630	bl 0x0084e938
0085f634	sub x8,x29,#0xb0
0085f638	mov x9,x0
0085f63c	mov x10,x22
0085f640	add x21,x8,#0x8
0085f644	ldr x8,[sp, #0x48]
0085f648	add x8,x20,x8
0085f64c	ldr x11,[x8, #0x10]
0085f650	ldr q0,[x8], #0x18
0085f654	subs x10,x10,#0x1
0085f658	str x11,[x9, #0x10]
0085f65c	str q0,[x9], #0x18
0085f660	b.ne 0x0085f64c
0085f664	mov x9,x23
0085f668	b 0x0085f708
0085f66c	cmp x23,#0x0
0085f670	csel w8,wzr,w26,ne
0085f674	cmp w8,#0x1
0085f678	b.ne 0x0085f6e4
0085f67c	ldr x8,[sp, #0x50]
0085f680	stp xzr,xzr,[sp, #0xb0]
0085f684	stp xzr,xzr,[sp, #0xa0]
0085f688	ldr x8,[x8]
0085f68c	stp x8,x20,[sp, #0xc0]
0085f690	adrp x4,0x2c8000
0085f694	add x4,x4,#0xb4c
0085f698	add x1,sp,#0xc0
0085f69c	add x2,sp,#0xb0
0085f6a0	add x3,sp,#0xa0
0085f6a4	mov x0,x19
0085f6a8	bl 0x0085e984
0085f6ac	b 0x0085f754
0085f6b0	ldr x8,[sp, #0x50]
0085f6b4	stp xzr,xzr,[sp, #0xb0]
0085f6b8	stp xzr,xzr,[sp, #0xa0]
0085f6bc	ldr x8,[x8]
0085f6c0	stp x8,x20,[sp, #0xc0]
0085f6c4	adrp x4,0x2c8000
0085f6c8	add x4,x4,#0xb4c
0085f6cc	add x1,sp,#0xc0
0085f6d0	add x2,sp,#0xb0
0085f6d4	add x3,sp,#0xa0
0085f6d8	mov x0,x19
0085f6dc	bl 0x0085e984
0085f6e0	b 0x0085f754
0085f6e4	ldr x8,[sp, #0x50]
0085f6e8	ldr x9,[x19, #0xe8]
0085f6ec	mov x0,xzr
0085f6f0	stp xzr,xzr,[sp, #0xc0]
0085f6f4	ldr x8,[x8]
0085f6f8	str x23,[sp, #0xd0]
0085f6fc	stp x8,x20,[sp, #0xb0]
0085f700	sub x8,x29,#0xb0
0085f704	add x21,x8,#0x8
0085f708	stp x0,x22,[sp, #0xa0]
0085f70c	mov x0,x9
0085f710	mov w1,#0xb0
0085f714	bl 0x0084e938
0085f718	ldp x10,x2,[sp, #0x30]
0085f71c	sub x8,x29,#0xd0
0085f720	add x9,sp,#0xa0
0085f724	add x1,sp,#0xb0
0085f728	sub x3,x29,#0xb0
0085f72c	sub x5,x29,#0x70
0085f730	add x6,x24,#0x10
0085f734	add x7,sp,#0xc0
0085f738	mov x4,x21
0085f73c	stp x8,x10,[sp, #0x10]
0085f740	mov x20,x0
0085f744	strb w26,[sp, #0x8]
0085f748	str x9,[sp]
0085f74c	bl 0x00850864
0085f750	mov x0,x20
0085f754	ldr x9,[x19, #0x3f0]
0085f758	ldr x11,[sp, #0x48]
0085f75c	ldr x8,[x19, #0x3f8]
0085f760	add x10,x11,x9
0085f764	cmp x10,x8
0085f768	b.eq 0x0085f7a4
0085f76c	add x9,x9,x11
0085f770	sub x10,x8,x10
0085f774	add x10,x9,x10
0085f778	cmp x10,x8
0085f77c	b.eq 0x0085f7a0
0085f780	ldr x11,[x10]
0085f784	str x11,[x9]
0085f788	ldur q0,[x10, #0x8]
0085f78c	add x10,x10,#0x18
0085f790	cmp x10,x8
0085f794	stur q0,[x9, #0x8]
0085f798	add x9,x9,#0x18
0085f79c	b.ne 0x0085f780
0085f7a0	str x9,[x19, #0x3f8]
0085f7a4	ldr x9,[x19, #0x360]
0085f7a8	ldr x10,[sp, #0x40]
0085f7ac	ldr x8,[x19, #0x368]
0085f7b0	add x20,x10,x9
0085f7b4	cmp x20,x8
0085f7b8	b.eq 0x0085f7e8
0085f7bc	sub x9,x8,x20
0085f7c0	add x1,x20,x9
0085f7c4	subs x21,x8,x1
0085f7c8	b.eq 0x0085f7e0
0085f7cc	mov x22,x0
0085f7d0	mov x0,x20
0085f7d4	mov x2,x21
0085f7d8	bl 0x00c2ff60
0085f7dc	mov x0,x22
0085f7e0	add x8,x20,x21
0085f7e4	str x8,[x19, #0x368]
0085f7e8	ldp x20,x9,[x29, #-0x30]
0085f7ec	mov w10,#0x30
0085f7f0	ldp x11,x8,[x20]
0085f7f4	nop
0085f7f8	madd x19,x9,x10,x11
0085f7fc	cmp x19,x8
0085f800	b.eq 0x0085f95c
0085f804	sub x9,x8,x19
0085f808	add x1,x19,x9
0085f80c	subs x21,x8,x1
0085f810	b.eq 0x0085f828
0085f814	sub x2,x21,#0x7
0085f818	mov x22,x0
0085f81c	mov x0,x19
0085f820	bl 0x00c2ff60
0085f824	mov x0,x22
0085f828	add x8,x19,x21
0085f82c	str x8,[x20, #0x8]
0085f830	b 0x0085f95c
0085f834	adrp x1,0x2b3000
0085f838	add x1,x1,#0x387
0085f83c	mov x0,x19
0085f840	bl 0x0086e040
0085f844	ldr x1,[sp, #0x50]
0085f848	adrp x4,0x2be000
0085f84c	add x4,x4,#0xe8d
0085f850	sub x2,x29,#0x70
0085f854	add x3,sp,#0xc0
0085f858	mov x0,x19
0085f85c	stp xzr,xzr,[x29, #-0x70]
0085f860	stp xzr,xzr,[sp, #0xc0]
0085f864	bl 0x0085e984
0085f868	b 0x0085f95c
0085f86c	mov x0,x19
0085f870	bl 0x00858f2c
0085f874	ldr x21,[x19, #0xa8]
0085f878	cbz x21,0x0085f890
0085f87c	adrp x1,0x2ce000
0085f880	add x1,x1,#0xcd9
0085f884	mov x0,x21
0085f888	bl 0x00c301f0
0085f88c	cbz w0,0x0085f9cc
0085f890	adrp x4,0x2ab000
0085f894	add x4,x4,#0x356
0085f898	add x1,x19,#0x94
0085f89c	sub x2,x29,#0x70
0085f8a0	add x3,sp,#0xc0
0085f8a4	mov x0,x19
0085f8a8	mov x5,x21
0085f8ac	stp xzr,xzr,[x29, #-0x70]
0085f8b0	stp xzr,xzr,[sp, #0xc0]
0085f8b4	bl 0x0085e984
0085f8b8	b 0x0085f95c
0085f8bc	adrp x2,0x2ba000
0085f8c0	add x2,x2,#0xe1d
0085f8c4	mov x0,x19
0085f8c8	mov w1,#0x3a
0085f8cc	bl 0x0086e3b4
0085f8d0	ldr w8,[x19, #0x90]
0085f8d4	ldur q0,[x19, #0x94]
0085f8d8	mov x1,xzr
0085f8dc	ldr w22,[x19, #0x124]
0085f8e0	sub x21,x29,#0x70
0085f8e4	cmp w8,#0x26
0085f8e8	str q0,[sp, #0xc0]
0085f8ec	b.eq 0x0085f910
0085f8f0	cmp w8,#0x7c
0085f8f4	b.eq 0x0085f910
0085f8f8	mov x0,x19
0085f8fc	mov w1,wzr
0085f900	mov w2,#0x1
0085f904	bl 0x008695d4
0085f908	mov x1,x0
0085f90c	str w22,[x19, #0x124]
0085f910	add x2,sp,#0xc0
0085f914	mov x0,x19
0085f918	bl 0x00867310
0085f91c	ldr x8,[sp, #0x50]
0085f920	str w22,[x19, #0x124]
0085f924	mov x20,x0
0085f928	ldur x9,[x0, #0x14]
0085f92c	ldr x0,[x19, #0xe8]
0085f930	mov w1,#0x40
0085f934	ldr x8,[x8]
0085f938	stp x8,x9,[sp, #0xc0]
0085f93c	bl 0x0084e938
0085f940	add x1,sp,#0xc0
0085f944	sub x2,x29,#0x70
0085f948	add x3,x21,#0x8
0085f94c	mov x4,x20
0085f950	mov x19,x0
0085f954	bl 0x008505f0
0085f958	mov x0,x19
0085f95c	ldr x8,[sp, #0x58]
0085f960	ldr x8,[x8, #0x28]
0085f964	ldur x9,[x29, #-0x18]
0085f968	cmp x8,x9
0085f96c	b.ne 0x00860254
0085f970	add sp,sp,#0x1b0
0085f974	ldp x20,x19,[sp, #0x50]
0085f978	ldp x22,x21,[sp, #0x40]
0085f97c	ldp x24,x23,[sp, #0x30]
0085f980	ldp x26,x25,[sp, #0x20]
0085f984	ldp x28,x27,[sp, #0x10]
0085f988	ldp x29,x30,[sp], #0x60
0085f98c	ret
0085f990	ldr x9,[sp, #0x40]
0085f994	and x8,x22,#-0x4
0085f998	mov x11,x8
0085f99c	add x10,x9,x21
0085f9a0	add x9,x0,#0x10
0085f9a4	add x10,x10,#0x10
0085f9a8	ldp q0,q1,[x10, #-0x10]
0085f9ac	subs x11,x11,#0x4
0085f9b0	add x10,x10,#0x20
0085f9b4	stp q0,q1,[x9, #-0x10]
0085f9b8	add x9,x9,#0x20
0085f9bc	b.ne 0x0085f9a8
0085f9c0	cmp x22,x8
0085f9c4	b.eq 0x0085f618
0085f9c8	b 0x0085f5f0
0085f9cc	mov x0,x19
0085f9d0	bl 0x00858f2c
0085f9d4	mov x27,x19
0085f9d8	ldr x22,[x27, #0x94]!
0085f9dc	ldur w8,[x27, #-0x4]
0085f9e0	cmp w8,#0x119
0085f9e4	b.ne 0x0085fa00
0085f9e8	ldr q0,[x27]
0085f9ec	ldr x21,[x19, #0xa8]
0085f9f0	mov x0,x19
0085f9f4	stur q0,[x28, #0x14]
0085f9f8	bl 0x00858f2c
0085f9fc	b 0x0085fa1c
0085fa00	adrp x1,0x2ca000
0085fa04	add x1,x1,#0xa72
0085fa08	mov x0,x19
0085fa0c	bl 0x0086e040
0085fa10	ldur x8,[x19, #0x94]
0085fa14	ldr x21,[x19, #0x138]
0085fa18	stp x8,x8,[x29, #-0xa8]
0085fa1c	ldr x24,[x19, #0xa8]
0085fa20	stur x21,[x29, #-0xb0]
0085fa24	str x22,[sp, #0x40]
0085fa28	cbz x24,0x0085fa48
0085fa2c	adrp x1,0x2d0000
0085fa30	add x1,x1,#0xbb1
0085fa34	mov x0,x24
0085fa38	bl 0x00c301f0
0085fa3c	cbz w0,0x0085fa50
0085fa40	stp xzr,xzr,[sp, #0x30]
0085fa44	b 0x0085faa0
0085fa48	stp xzr,xzr,[sp, #0x30]
0085fa4c	b 0x0085fab4
0085fa50	mov x0,x19
0085fa54	bl 0x00858f2c
0085fa58	ldr w8,[x19, #0x90]
0085fa5c	cmp w8,#0x119
0085fa60	b.ne 0x0085fa78
0085fa64	ldr x8,[x19, #0xa8]
0085fa68	mov x0,x19
0085fa6c	str x8,[sp, #0x38]
0085fa70	bl 0x00858f2c
0085fa74	b 0x0085fa90
0085fa78	adrp x1,0x2ae000
0085fa7c	add x1,x1,#0xf72
0085fa80	mov x0,x19
0085fa84	bl 0x0086e040
0085fa88	ldr x8,[x19, #0x138]
0085fa8c	str x8,[sp, #0x38]
0085fa90	ldr x24,[x19, #0xa8]
0085fa94	mov w8,#0x1
0085fa98	str x8,[sp, #0x30]
0085fa9c	cbz x24,0x0085fab4
0085faa0	adrp x1,0x2c8000
0085faa4	add x1,x1,#0xb79
0085faa8	mov x0,x24
0085faac	bl 0x00c301f0
0085fab0	cbz w0,0x0085fad0
0085fab4	adrp x2,0x2a3000
0085fab8	add x2,x2,#0x4b0
0085fabc	mov x0,x19
0085fac0	mov x1,x27
0085fac4	mov x3,x24
0085fac8	bl 0x00860ecc
0085facc	b 0x0085fad8
0085fad0	mov x0,x19
0085fad4	bl 0x00858f2c
0085fad8	ldr w8,[x19, #0x90]
0085fadc	ldr x9,[x19, #0x398]
0085fae0	add x22,x19,#0x390
0085fae4	ldr x10,[x19, #0x390]
0085fae8	cmp w8,#0x128
0085faec	sub x9,x9,x10
0085faf0	stp x9,x22,[sp, #0x48]
0085faf4	b.ne 0x0085fb64
0085faf8	mov x24,xzr
0085fafc	mov x21,xzr
0085fb00	ldur x22,[x19, #0x9c]
0085fb04	mov x0,x19
0085fb08	bl 0x00858f2c
0085fb0c	ldp x8,x23,[sp, #0x40]
0085fb10	ldr x20,[x19, #0xe8]
0085fb14	stp x8,x22,[x29, #-0x70]
0085fb18	cbz x21,0x0085ff5c
0085fb1c	lsl x8,x21,#0x6
0085fb20	ldr x9,[sp, #0x50]
0085fb24	ldr x22,[x9]
0085fb28	sub x1,x8,x21, LSL #0x3
0085fb2c	mov x0,x20
0085fb30	bl 0x0084e938
0085fb34	add x8,x22,x23
0085fb38	mov x9,x0
0085fb3c	mov x10,x21
0085fb40	ldp q2,q0,[x8, #0x10]
0085fb44	subs x10,x10,#0x1
0085fb48	ldr x11,[x8, #0x30]
0085fb4c	ldr q1,[x8], #0x38
0085fb50	str x11,[x9, #0x30]
0085fb54	stp q2,q0,[x9, #0x10]
0085fb58	str q1,[x9], #0x38
0085fb5c	b.ne 0x0085fb40
0085fb60	b 0x0085ff60
0085fb64	mov x21,xzr
0085fb68	mov x24,xzr
0085fb6c	b 0x0085fb98
0085fb70	add x8,sp,#0xc0
0085fb74	mov x0,x19
0085fb78	adrp x2,0x2ac000
0085fb7c	add x2,x2,#0xe18
0085fb80	orr x1,x8,#0x4
0085fb84	bl 0x00860ecc
0085fb88	ldr x22,[sp, #0x50]
0085fb8c	ldr w8,[x20]
0085fb90	cmp w8,#0x128
0085fb94	b.eq 0x0085fb00
0085fb98	and w9,w8,#0xfffffffe
0085fb9c	stp xzr,xzr,[x29, #-0xd0]
0085fba0	cmp w9,#0x11c
0085fba4	b.ne 0x0085fbc8
0085fba8	mov x0,x19
0085fbac	mov x1,xzr
0085fbb0	bl 0x00862f80
0085fbb4	ldr w8,[x20]
0085fbb8	stp x0,x1,[x29, #-0xd0]
0085fbbc	cmp w8,#0x12b
0085fbc0	b.eq 0x0085fbd8
0085fbc4	b 0x0085ffd4
0085fbc8	cmp w8,#0x5b
0085fbcc	b.eq 0x0085fbfc
0085fbd0	cmp w8,#0x12b
0085fbd4	b.ne 0x0085fc74
0085fbd8	sub x8,x29,#0x70
0085fbdc	sub x1,x29,#0xd0
0085fbe0	mov x0,x19
0085fbe4	bl 0x00864ba4
0085fbe8	sub x1,x29,#0x70
0085fbec	mov x0,x22
0085fbf0	bl 0x00871f10
0085fbf4	add x21,x21,#0x1
0085fbf8	b 0x0085fb8c
0085fbfc	ldp q0,q1,[x20]
0085fc00	stp q0,q1,[sp, #0xc0]
0085fc04	mov x0,x19
0085fc08	bl 0x00858f2c
0085fc0c	ldr w8,[x20]
0085fc10	and w8,w8,#0xfffffffe
0085fc14	cmp w8,#0x116
0085fc18	b.ne 0x0085fd28
0085fc1c	sub x8,x29,#0x70
0085fc20	add x0,x19,#0x70
0085fc24	bl 0x00853d20
0085fc28	ldur w8,[x29, #-0x70]
0085fc2c	cmp w8,#0x5d
0085fc30	b.ne 0x0085fd28
0085fc34	ldur x23,[x19, #0x94]
0085fc38	sub x8,x29,#0x30
0085fc3c	mov x0,x19
0085fc40	mov x1,xzr
0085fc44	bl 0x00865548
0085fc48	ldr w9,[x19, #0x90]
0085fc4c	ldr w8,[sp, #0xc0]
0085fc50	ldur x10,[sp, #0xc4]
0085fc54	ldr x25,[x19, #0xb8]
0085fc58	cmp w9,#0x5d
0085fc5c	stur w8,[x29, #-0x70]
0085fc60	stur x10,[x28, #0x50]
0085fc64	b.ne 0x0085fe48
0085fc68	mov x0,x19
0085fc6c	bl 0x00858f2c
0085fc70	b 0x0085fe6c
0085fc74	cmp w8,#0x119
0085fc78	b.ne 0x0085fce4
0085fc7c	sub x8,x29,#0x70
0085fc80	add x0,x19,#0x70
0085fc84	bl 0x00853d20
0085fc88	ldur w8,[x29, #-0x70]
0085fc8c	cmp w8,#0x3a
0085fc90	b.eq 0x0085fce4
0085fc94	ldr x26,[x19, #0xa8]
0085fc98	cbz x26,0x0085fcc4
0085fc9c	mov x0,x26
0085fca0	adrp x1,0x2b1000
0085fca4	add x1,x1,#0x33a
0085fca8	bl 0x00c301f0
0085fcac	cbz w0,0x0085ff3c
0085fcb0	mov x0,x26
0085fcb4	adrp x1,0x2a9000
0085fcb8	add x1,x1,#0x21b
0085fcbc	bl 0x00c301f0
0085fcc0	cbz w0,0x0085ff4c
0085fcc4	mov x0,x19
0085fcc8	mov x1,x27
0085fccc	adrp x2,0x2d8000
0085fcd0	add x2,x2,#0xeba
0085fcd4	mov x3,x26
0085fcd8	bl 0x00860ecc
0085fcdc	add x0,x19,#0x70
0085fce0	bl 0x00853424
0085fce4	mov w22,#0x3
0085fce8	ldr w8,[x20]
0085fcec	cmp w8,#0x119
0085fcf0	b.ne 0x00860044
0085fcf4	ldr q0,[x27]
0085fcf8	mov x23,x27
0085fcfc	ldr x26,[x27]
0085fd00	ldr x27,[x19, #0xa8]
0085fd04	str q0,[sp, #0xc0]
0085fd08	mov x0,x19
0085fd0c	bl 0x00858f2c
0085fd10	ldr w8,[x20]
0085fd14	cmp w8,#0x3a
0085fd18	b.ne 0x0085fd70
0085fd1c	mov x0,x19
0085fd20	bl 0x00858f2c
0085fd24	b 0x0085fd84
0085fd28	cbz x24,0x0085fe18
0085fd2c	ldp q0,q1,[sp, #0xc0]
0085fd30	sturb wzr,[x29, #-0x84]
0085fd34	sturb wzr,[x29, #-0x74]
0085fd38	stp q0,q1,[sp, #0x80]
0085fd3c	sub x8,x29,#0x70
0085fd40	sub x2,x29,#0x84
0085fd44	add x3,sp,#0x80
0085fd48	mov x0,x19
0085fd4c	mov w1,#0x3
0085fd50	bl 0x008657f4
0085fd54	ldur x8,[x29, #-0x70]
0085fd58	add x1,x8,#0x10
0085fd5c	mov x0,x19
0085fd60	adrp x2,0x2cc000
0085fd64	add x2,x2,#0xb16
0085fd68	bl 0x00860ecc
0085fd6c	b 0x0085fb8c
0085fd70	mov x0,x19
0085fd74	mov w1,#0x3a
0085fd78	adrp x2,0x2b6000
0085fd7c	add x2,x2,#0xcdd
0085fd80	bl 0x0086e3b4
0085fd84	ldr w8,[x19, #0x90]
0085fd88	mov x25,x24
0085fd8c	ldr q0,[x23]
0085fd90	ldr w24,[x19, #0x124]
0085fd94	mov x1,xzr
0085fd98	cmp w8,#0x26
0085fd9c	stur q0,[x29, #-0x70]
0085fda0	b.eq 0x0085fdc4
0085fda4	cmp w8,#0x7c
0085fda8	b.eq 0x0085fdc4
0085fdac	mov x0,x19
0085fdb0	mov w1,wzr
0085fdb4	mov w2,wzr
0085fdb8	bl 0x008695d4
0085fdbc	mov x1,x0
0085fdc0	str w24,[x19, #0x124]
0085fdc4	sub x2,x29,#0x70
0085fdc8	mov x0,x19
0085fdcc	bl 0x00867310
0085fdd0	ldr q0,[sp, #0xc0]
0085fdd4	sub x8,x29,#0x70
0085fdd8	str w24,[x19, #0x124]
0085fddc	stur x27,[x29, #-0x70]
0085fde0	stur q0,[x8, #0x8]
0085fde4	ldr x8,[x19, #0xb8]
0085fde8	stur x0,[x29, #-0x58]
0085fdec	sturb wzr,[x29, #-0x50]
0085fdf0	stp x26,x8,[x28, #0x70]
0085fdf4	stur w22,[x29, #-0x3c]
0085fdf8	ldr x22,[sp, #0x50]
0085fdfc	sub x1,x29,#0x70
0085fe00	mov x0,x22
0085fe04	bl 0x00871f10
0085fe08	add x21,x21,#0x1
0085fe0c	mov x24,x25
0085fe10	mov x27,x23
0085fe14	b 0x0085fb8c
0085fe18	ldp q0,q1,[sp, #0xc0]
0085fe1c	sturb wzr,[x29, #-0x98]
0085fe20	sturb wzr,[x29, #-0x88]
0085fe24	stp q0,q1,[sp, #0x60]
0085fe28	sub x8,x29,#0x70
0085fe2c	sub x2,x29,#0x98
0085fe30	add x3,sp,#0x60
0085fe34	mov x0,x19
0085fe38	mov w1,#0x3
0085fe3c	bl 0x008657f4
0085fe40	ldur x24,[x29, #-0x70]
0085fe44	b 0x0085fb8c
0085fe48	sub x2,x29,#0x70
0085fe4c	mov x0,x19
0085fe50	mov w1,#0x5d
0085fe54	mov x3,xzr
0085fe58	bl 0x0086b5f8
0085fe5c	mov x0,x19
0085fe60	mov w1,#0x5d
0085fe64	mov w3,wzr
0085fe68	bl 0x0086e434
0085fe6c	ldr w8,[x20]
0085fe70	cmp w8,#0x3a
0085fe74	b.ne 0x0085fe84
0085fe78	mov x0,x19
0085fe7c	bl 0x00858f2c
0085fe80	b 0x0085fe98
0085fe84	mov x0,x19
0085fe88	mov w1,#0x3a
0085fe8c	adrp x2,0x2b6000
0085fe90	add x2,x2,#0xcdd
0085fe94	bl 0x0086e3b4
0085fe98	ldr w8,[x19, #0x90]
0085fe9c	ldr q0,[x27]
0085fea0	mov x1,xzr
0085fea4	ldr w22,[x19, #0x124]
0085fea8	cmp w8,#0x26
0085feac	stur q0,[x29, #-0x70]
0085feb0	b.eq 0x0085fed4
0085feb4	cmp w8,#0x7c
0085feb8	b.eq 0x0085fed4
0085febc	mov x0,x19
0085fec0	mov w1,wzr
0085fec4	mov w2,wzr
0085fec8	bl 0x008695d4
0085fecc	mov x1,x0
0085fed0	str w22,[x19, #0x124]
0085fed4	sub x2,x29,#0x70
0085fed8	mov x0,x19
0085fedc	bl 0x00867310
0085fee0	ldurb w8,[x29, #-0x20]
0085fee4	str w22,[x19, #0x124]
0085fee8	cmp w8,#0x1
0085feec	b.ne 0x0085fb70
0085fef0	ldp x22,x2,[x29, #-0x30]
0085fef4	mov x26,x0
0085fef8	mov w1,wzr
0085fefc	mov x0,x22
0085ff00	bl 0x00c300a0
0085ff04	cbnz x0,0x0085fb70
0085ff08	ldur x8,[sp, #0xc4]
0085ff0c	ldr x9,[x19, #0xb8]
0085ff10	stp x22,x23,[x29, #-0x70]
0085ff14	stp x25,x26,[x29, #-0x60]
0085ff18	stp x8,x9,[x28, #0x70]
0085ff1c	mov w8,#0x3
0085ff20	sturb wzr,[x29, #-0x50]
0085ff24	stur w8,[x29, #-0x3c]
0085ff28	ldr x22,[sp, #0x50]
0085ff2c	sub x1,x29,#0x70
0085ff30	mov x0,x22
0085ff34	bl 0x00871f10
0085ff38	b 0x0085fbf4
0085ff3c	add x0,x19,#0x70
0085ff40	bl 0x00853424
0085ff44	mov w22,#0x1
0085ff48	b 0x0085fce8
0085ff4c	add x0,x19,#0x70
0085ff50	bl 0x00853424
0085ff54	mov w22,#0x2
0085ff58	b 0x0085fce8
0085ff5c	mov x0,xzr
0085ff60	stp x0,x21,[sp, #0xc0]
0085ff64	mov x0,x20
0085ff68	mov w1,#0x50
0085ff6c	bl 0x0084e938
0085ff70	ldp x4,x3,[sp, #0x30]
0085ff74	sub x1,x29,#0x70
0085ff78	sub x2,x29,#0xb0
0085ff7c	add x5,sp,#0xc0
0085ff80	mov x6,x24
0085ff84	mov x20,x0
0085ff88	bl 0x0085099c
0085ff8c	mov x0,x20
0085ff90	ldr x9,[x19, #0x390]
0085ff94	ldr x8,[x19, #0x398]
0085ff98	add x20,x23,x9
0085ff9c	cmp x20,x8
0085ffa0	b.eq 0x0085f95c
0085ffa4	sub x9,x8,x20
0085ffa8	add x1,x20,x9
0085ffac	subs x21,x8,x1
0085ffb0	b.eq 0x0085ffc8
0085ffb4	mov x22,x0
0085ffb8	mov x0,x20
0085ffbc	mov x2,x21
0085ffc0	bl 0x00c2ff60
0085ffc4	mov x0,x22
0085ffc8	add x8,x20,x21
0085ffcc	str x8,[x19, #0x398]
0085ffd0	b 0x0085f95c
0085ffd4	stp xzr,xzr,[sp, #0xc0]
0085ffd8	stp xzr,xzr,[x29, #-0x30]
0085ffdc	sub x8,x29,#0x70
0085ffe0	mov x0,x20
0085ffe4	sub x20,x29,#0x70
0085ffe8	bl 0x008521fc
0085ffec	ldurb w8,[x29, #-0x70]
0085fff0	ldur x9,[x29, #-0x60]
0085fff4	tst w8,#0x1
0085fff8	csinc x5,x9,x20,ne
0085fffc	adrp x4,0x2a1000
00860000	add x4,x4,#0x51e
00860004	add x2,sp,#0xc0
00860008	sub x3,x29,#0x30
0086000c	mov x0,x19
00860010	mov x1,x27
00860014	bl 0x0085e984
00860018	ldurb w8,[x29, #-0x70]
0086001c	ldr x23,[sp, #0x48]
00860020	tbz w8,#0x0,0x0085ff90
00860024	ldur x8,[x29, #-0x60]
00860028	ldur x9,[x29, #-0x70]
0086002c	mov x20,x0
00860030	and x1,x9,#-0x2
00860034	mov x0,x8
00860038	bl 0x00c2fe80
0086003c	mov x0,x20
00860040	b 0x0085ff90
00860044	adrp x1,0x2ba000
00860048	add x1,x1,#0xe0f
0086004c	mov x0,x19
00860050	bl 0x0086e040
00860054	b 0x0085fb00
00860254	bl 0x00c2fec0
