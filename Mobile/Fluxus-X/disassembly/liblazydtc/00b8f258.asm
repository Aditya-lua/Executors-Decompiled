; psa_generate_key_custom @ 00b8f258
00b8f258	sub sp,sp,#0x90
00b8f25c	stp x28,x27,[sp, #0x30]
00b8f260	stp x26,x25,[sp, #0x40]
00b8f264	stp x24,x23,[sp, #0x50]
00b8f268	stp x22,x21,[sp, #0x60]
00b8f26c	stp x20,x19,[sp, #0x70]
00b8f270	stp x29,x30,[sp, #0x80]
00b8f274	add x29,sp,#0x80
00b8f278	mrs x28,tpidr_el0
00b8f27c	ldr x8,[x28, #0x28]
00b8f280	mov x19,x4
00b8f284	mov x21,x3
00b8f288	mov x22,x2
00b8f28c	str x8,[sp, #0x28]
00b8f290	stp xzr,xzr,[sp, #0x18]
00b8f294	str wzr,[x4]
00b8f298	ldrh w8,[x0, #0x2]
00b8f29c	mov x23,x0
00b8f2a0	mov x24,x1
00b8f2a4	cbz w8,0x00b8f2cc
00b8f2a8	ldrh w9,[x23]
00b8f2ac	and w8,w9,#0x7000
00b8f2b0	cmp w8,#0x4, LSL #12
00b8f2b4	b.eq 0x00b8f2cc
00b8f2b8	ldr w8,[x24]
00b8f2bc	mov w10,#0x7001
00b8f2c0	cmp w9,w10
00b8f2c4	b.ne 0x00b8f304
00b8f2c8	cbz w8,0x00b8f310
00b8f2cc	mov w25,#0xffffff79
00b8f2d0	ldr x8,[x28, #0x28]
00b8f2d4	ldr x9,[sp, #0x28]
00b8f2d8	cmp x8,x9
00b8f2dc	b.ne 0x00b8f6ac
00b8f2e0	mov w0,w25
00b8f2e4	ldp x29,x30,[sp, #0x80]
00b8f2e8	ldp x20,x19,[sp, #0x70]
00b8f2ec	ldp x22,x21,[sp, #0x60]
00b8f2f0	ldp x24,x23,[sp, #0x50]
00b8f2f4	ldp x26,x25,[sp, #0x40]
00b8f2f8	ldp x28,x27,[sp, #0x30]
00b8f2fc	add sp,sp,#0x90
00b8f300	ret
00b8f304	mov w25,#0xffffff79
00b8f308	cbnz x21,0x00b8f2d0
00b8f30c	cbnz w8,0x00b8f2d0
00b8f310	add x1,sp,#0x20
00b8f314	add x2,sp,#0x18
00b8f318	mov x0,x23
00b8f31c	bl 0x00b8785c
00b8f320	mov w25,w0
00b8f324	cbnz w0,0x00b8f3f4
00b8f328	ldr x20,[sp, #0x20]
00b8f32c	ldr x4,[x20, #0x28]
00b8f330	cbz x4,0x00b8f37c
00b8f334	add x26,x20,#0x30
00b8f338	add x27,x23,#0x4
00b8f33c	ldr w8,[x27]
00b8f340	cmp w8,#0x100
00b8f344	b.cs 0x00b8f3c0
00b8f348	ldr x5,[x26]
00b8f34c	mov x0,x23
00b8f350	mov x2,x22
00b8f354	mov x3,x21
00b8f358	mov x6,x26
00b8f35c	bl 0x00c42ca0
00b8f360	ldr x20,[sp, #0x20]
00b8f364	mov w25,w0
00b8f368	cbz w0,0x00b8f4a4
00b8f36c	ldr x4,[x20, #0x28]!
00b8f370	add x26,x20,#0x8
00b8f374	cbnz x4,0x00b8f3e0
00b8f378	b 0x00b8f3ec
00b8f37c	mov x27,x23
00b8f380	ldr w8,[x27, #0x4]!
00b8f384	cmp w8,#0xff
00b8f388	b.hi 0x00b8f478
00b8f38c	ldrh w26,[x23]
00b8f390	ldrh w1,[x23, #0x2]
00b8f394	and w8,w26,#0x7000
00b8f398	cmp w8,#0x2, LSL #12
00b8f39c	str x1,[sp, #0x8]
00b8f3a0	b.eq 0x00b8f3ac
00b8f3a4	cmp w8,#0x1, LSL #12
00b8f3a8	b.ne 0x00b8f4e4
00b8f3ac	mov w0,w26
00b8f3b0	bl 0x00c42d80
00b8f3b4	mov w25,w0
00b8f3b8	cbnz w0,0x00b8f3f4
00b8f3bc	b 0x00b8f568
00b8f3c0	ldr w9,[x24]
00b8f3c4	mov w10,#0x100
00b8f3c8	mov w11,#0xffffff79
00b8f3cc	add x20,x20,#0x28
00b8f3d0	cmp w9,#0x0
00b8f3d4	ccmp x21,#0x0,#0x0,eq
00b8f3d8	ccmp w8,w10,#0x0,ne
00b8f3dc	cinc w25,w11,cs
00b8f3e0	ldr x1,[x26]
00b8f3e4	mov x0,x4
00b8f3e8	bl 0x00c42230
00b8f3ec	str xzr,[x20]
00b8f3f0	str xzr,[x26]
00b8f3f4	ldr x20,[sp, #0x20]
00b8f3f8	cbz x20,0x00b8f2d0
00b8f3fc	mov x19,x20
00b8f400	ldr x0,[x19, #0x28]!
00b8f404	cbz x0,0x00b8f410
00b8f408	ldr x1,[x20, #0x30]
00b8f40c	bl 0x00c42230
00b8f410	stp xzr,xzr,[x19]
00b8f414	ldr w8,[x20, #0x18]
00b8f418	sub w9,w8,#0x2
00b8f41c	cmp w9,#0x2
00b8f420	b.cs 0x00b8f434
00b8f424	ldr x8,[x20, #0x20]
00b8f428	cmp x8,#0x1
00b8f42c	b.ne 0x00b8f444
00b8f430	b 0x00b8f458
00b8f434	cmp w8,#0x1
00b8f438	b.ne 0x00b8f444
00b8f43c	ldr x8,[x20, #0x20]
00b8f440	cbz x8,0x00b8f458
00b8f444	movi v0.2D,#0x0
00b8f448	str xzr,[x20, #0x30]
00b8f44c	stp q0,q0,[x20, #0x10]
00b8f450	str q0,[x20]
00b8f454	b 0x00b8f2d0
00b8f458	ldrb w0,[x20, #0x1c]
00b8f45c	movi v0.2D,#0x0
00b8f460	mov x1,x20
00b8f464	stp xzr,xzr,[x20, #0x28]
00b8f468	stp q0,q0,[x20]
00b8f46c	str xzr,[x20, #0x20]
00b8f470	bl 0x00c43180
00b8f474	b 0x00b8f2d0
00b8f478	add x1,sp,#0x10
00b8f47c	mov x0,x23
00b8f480	bl 0x00c42f10
00b8f484	mov w25,w0
00b8f488	cbnz w0,0x00b8f3f4
00b8f48c	ldr x20,[sp, #0x20]
00b8f490	ldr x8,[x20, #0x28]
00b8f494	cbz x8,0x00b8f5b4
00b8f498	mov w25,#0xffffff75
00b8f49c	cbnz x20,0x00b8f3fc
00b8f4a0	b 0x00b8f2d0
00b8f4a4	ldrb w8,[x20, #0x4]
00b8f4a8	cbz w8,0x00b8f4c0
00b8f4ac	ldp x1,x2,[x20, #0x28]
00b8f4b0	mov x0,x20
00b8f4b4	bl 0x00c43250
00b8f4b8	mov w25,w0
00b8f4bc	cbnz w0,0x00b8f3f4
00b8f4c0	ldr w8,[x20, #0x14]
00b8f4c4	str w8,[x19]
00b8f4c8	ldr w8,[x20, #0x18]
00b8f4cc	cmp w8,#0x1
00b8f4d0	b.ne 0x00b8f50c
00b8f4d4	mov w8,#0x2
00b8f4d8	mov w25,wzr
00b8f4dc	str w8,[x20, #0x18]
00b8f4e0	b 0x00b8f2d0
00b8f4e4	mov w8,#0x7001
00b8f4e8	cmp w26,w8
00b8f4ec	b.ne 0x00b8f520
00b8f4f0	sub x8,x1,#0x400
00b8f4f4	cmp x8,#0xc00
00b8f4f8	mov w25,#0xffffff7a
00b8f4fc	b.hi 0x00b8f3f4
00b8f500	and x8,x1,#0x7
00b8f504	cbz x8,0x00b8f568
00b8f508	b 0x00b8f3f4
00b8f50c	mov w25,#0xffffff69
00b8f510	str wzr,[x19]
00b8f514	ldr x20,[sp, #0x20]
00b8f518	cbnz x20,0x00b8f3fc
00b8f51c	b 0x00b8f2d0
00b8f520	and w8,w26,#0xff00
00b8f524	mov w9,#0x7100
00b8f528	cmp w8,w9
00b8f52c	b.eq 0x00b8f568
00b8f530	mov w9,#0x7200
00b8f534	cmp w8,w9
00b8f538	b.ne 0x00b8f61c
00b8f53c	ldr x8,[sp, #0x8]
00b8f540	mov w25,#0xffffff7a
00b8f544	sub x8,x8,#0x800
00b8f548	ror x8,x8,#0xa
00b8f54c	cmp x8,#0x6
00b8f550	b.hi 0x00b8f3f4
00b8f554	mov w9,#0x1
00b8f558	lsl x8,x9,x8
00b8f55c	mov w9,#0x57
00b8f560	tst x8,x9
00b8f564	b.eq 0x00b8f3f4
00b8f568	and w8,w26,#0x7000
00b8f56c	cmp w8,#0x2, LSL #12
00b8f570	b.eq 0x00b8f57c
00b8f574	cmp w8,#0x1, LSL #12
00b8f578	b.ne 0x00b8f588
00b8f57c	ldr x8,[sp, #0x8]
00b8f580	add w8,w8,#0x7
00b8f584	b 0x00b8f5a4
00b8f588	ldr x10,[sp, #0x8]
00b8f58c	mov w8,#0xcf00
00b8f590	and w8,w26,w8
00b8f594	mov w9,#0x4200
00b8f598	cmp w8,w9
00b8f59c	b.ne 0x00b8f5ec
00b8f5a0	add w8,w10,#0x7
00b8f5a4	lsr w8,w8,#0x3
00b8f5a8	mov w25,w8
00b8f5ac	str x25,[sp, #0x10]
00b8f5b0	b 0x00b8f5b8
00b8f5b4	ldr x25,[sp, #0x10]
00b8f5b8	mov w0,#0x1
00b8f5bc	mov x1,x25
00b8f5c0	bl 0x00c30a30
00b8f5c4	str x0,[x20, #0x28]
00b8f5c8	cbz x0,0x00b8f5dc
00b8f5cc	mov x26,x20
00b8f5d0	mov x4,x0
00b8f5d4	str x25,[x26, #0x30]!
00b8f5d8	b 0x00b8f33c
00b8f5dc	mov w25,#0xffffff73
00b8f5e0	ldr x20,[sp, #0x20]
00b8f5e4	cbnz x20,0x00b8f3fc
00b8f5e8	b 0x00b8f2d0
00b8f5ec	cmp w26,#0x7, LSL #12
00b8f5f0	b.gt 0x00b8f62c
00b8f5f4	mov w8,#0x4001
00b8f5f8	cmp w26,w8
00b8f5fc	b.eq 0x00b8f65c
00b8f600	mov w8,#0x4002
00b8f604	cmp w26,w8
00b8f608	b.ne 0x00b8f678
00b8f60c	lsr w8,w10,#0x3
00b8f610	add w8,w8,w8, LSL #0x1
00b8f614	add w8,w8,#0x4a
00b8f618	b 0x00b8f5a8
00b8f61c	mov w25,#0xffffff7a
00b8f620	ldr x20,[sp, #0x20]
00b8f624	cbnz x20,0x00b8f3fc
00b8f628	b 0x00b8f2d0
00b8f62c	mov w8,#0x7002
00b8f630	cmp w26,w8
00b8f634	b.eq 0x00b8f668
00b8f638	mov w8,#0x7001
00b8f63c	cmp w26,w8
00b8f640	b.ne 0x00b8f678
00b8f644	lsr w8,w10,#0x1
00b8f648	add w8,w8,#0x1
00b8f64c	lsr w8,w8,#0x3
00b8f650	add w8,w8,w8, LSL #0x3
00b8f654	add w8,w8,#0x3b
00b8f658	b 0x00b8f5a8
00b8f65c	lsr w8,w10,#0x3
00b8f660	add w8,w8,#0x10
00b8f664	b 0x00b8f5a8
00b8f668	lsr w8,w10,#0x3
00b8f66c	add w8,w8,w8, LSL #0x1
00b8f670	add w8,w8,#0x5a
00b8f674	b 0x00b8f5a8
00b8f678	and w8,w26,#0xff00
00b8f67c	mov w9,#0x4100
00b8f680	cmp w8,w9
00b8f684	b.eq 0x00b8f69c
00b8f688	mov w9,#0x7100
00b8f68c	cmp w8,w9
00b8f690	mov w8,wzr
00b8f694	b.eq 0x00b8f5a0
00b8f698	b 0x00b8f5a8
00b8f69c	add w8,w10,#0x7
00b8f6a0	lsr w8,w8,#0x2
00b8f6a4	orr w8,w8,#0x1
00b8f6a8	b 0x00b8f5a8
00b8f6ac	bl 0x00c2fec0
