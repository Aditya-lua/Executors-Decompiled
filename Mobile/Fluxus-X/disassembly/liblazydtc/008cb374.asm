; FUN_008cb374 @ 008cb374
008cb374	sub sp,sp,#0x70
008cb378	stp x29,x30,[sp, #0x20]
008cb37c	stp x26,x25,[sp, #0x30]
008cb380	stp x24,x23,[sp, #0x40]
008cb384	stp x22,x21,[sp, #0x50]
008cb388	stp x20,x19,[sp, #0x60]
008cb38c	add x29,sp,#0x20
008cb390	mrs x24,tpidr_el0
008cb394	mov x20,x3
008cb398	mov x21,x2
008cb39c	ldr x8,[x24, #0x28]
008cb3a0	mov x23,x1
008cb3a4	mov x19,x0
008cb3a8	stur x8,[x29, #-0x8]
008cb3ac	ldr w8,[x1, #0xc]
008cb3b0	cmp w8,#0x6
008cb3b4	b.ne 0x008cb460
008cb3b8	ldr x22,[x23]
008cb3bc	mov x1,x21
008cb3c0	mov x0,x22
008cb3c4	bl 0x008bb604
008cb3c8	ldr w8,[x0, #0xc]
008cb3cc	cbz w8,0x008cb590
008cb3d0	ldrb w8,[x22, #0x7]
008cb3d4	cbnz w8,0x008cb6b8
008cb3d8	strb wzr,[x22, #0x6]
008cb3dc	adrp x8,0xd1f000
008cb3e0	add x8,x8,#0x1e0
008cb3e4	ldarb w8,[x8]
008cb3e8	adrp x23,0xd1f000
008cb3ec	tbz w8,#0x0,0x008cb6d0
008cb3f0	ldr x8,[x23, #0x1d8]
008cb3f4	add x8,x8,#0x7f2, LSL #12
008cb3f8	add x8,x8,#0xef0
008cb3fc	cmp x0,x8
008cb400	b.ne 0x008cb414
008cb404	mov x0,x19
008cb408	mov x1,x22
008cb40c	mov x2,x21
008cb410	bl 0x008bbddc
008cb414	ldr x8,[x22, #0x28]
008cb418	sub x8,x0,x8
008cb41c	lsr x8,x8,#0x5
008cb420	str w8,[x19, #0x2c]
008cb424	ldr q0,[x20]
008cb428	str q0,[x0]
008cb42c	ldr w8,[x20, #0xc]
008cb430	cmp w8,#0x5
008cb434	b.lt 0x008cb5e8
008cb438	ldrb w8,[x22, #0x2]
008cb43c	tbz w8,#0x2,0x008cb5e8
008cb440	ldr x2,[x20]
008cb444	ldrb w8,[x2, #0x2]
008cb448	tst w8,#0x3
008cb44c	b.eq 0x008cb5e8
008cb450	mov x0,x19
008cb454	mov x1,x22
008cb458	bl 0x008b6370
008cb45c	b 0x008cb5e8
008cb460	cmp w8,#0xc
008cb464	b.ne 0x008cb478
008cb468	adrp x8,0xd1f000
008cb46c	add x8,x8,#0xdd0
008cb470	ldrb w8,[x8]
008cb474	tbnz w8,#0x0,0x008cb624
008cb478	mov x0,x19
008cb47c	mov x1,x23
008cb480	mov w2,#0x1
008cb484	bl 0x008be028
008cb488	ldr w8,[x0, #0xc]
008cb48c	cbz w8,0x008cb698
008cb490	mov x1,x0
008cb494	ldr w8,[x1, #0xc]
008cb498	cmp w8,#0x7
008cb49c	b.eq 0x008cb5d4
008cb4a0	adrp x25,0xcb4000
008cb4a4	ldr q0,[x1]
008cb4a8	mov w26,#0x63
008cb4ac	ldr x25,[x25, #0xbe8]
008cb4b0	str q0,[sp]
008cb4b4	ldr w8,[sp, #0xc]
008cb4b8	cmp w8,#0x6
008cb4bc	b.ne 0x008cb518
008cb4c0	ldr x22,[sp]
008cb4c4	mov x1,x21
008cb4c8	mov x0,x22
008cb4cc	bl 0x008bb604
008cb4d0	ldr w8,[x0, #0xc]
008cb4d4	cbnz w8,0x008cb3d0
008cb4d8	ldr x8,[x22, #0x10]
008cb4dc	cbz x8,0x008cb3d0
008cb4e0	ldrb w9,[x8, #0x6]
008cb4e4	tbnz w9,#0x1,0x008cb3d0
008cb4e8	ldrb w9,[x8, #0x7]
008cb4ec	tbnz w9,#0x1,0x008cb54c
008cb4f0	ldr x9,[x19, #0x60]
008cb4f4	mov x23,x0
008cb4f8	mov x0,x8
008cb4fc	mov w1,#0x1
008cb500	ldr x2,[x9, #0x340]
008cb504	bl 0x008bdfe0
008cb508	mov x1,x0
008cb50c	mov x0,x23
008cb510	cbnz x1,0x008cb554
008cb514	b 0x008cb3d0
008cb518	cmp w8,#0xc
008cb51c	b.ne 0x008cb528
008cb520	ldrb w8,[x25]
008cb524	tbnz w8,#0x0,0x008cb620
008cb528	mov x1,sp
008cb52c	mov x0,x19
008cb530	mov w2,#0x1
008cb534	mov x23,sp
008cb538	bl 0x008be028
008cb53c	ldr w8,[x0, #0xc]
008cb540	cbz w8,0x008cb698
008cb544	mov x1,x0
008cb548	b 0x008cb554
008cb54c	ldr x8,[x8, #0x20]
008cb550	sub x1,x8,#0x20
008cb554	ldr w8,[x1, #0xc]
008cb558	cmp w8,#0x7
008cb55c	b.eq 0x008cb5d0
008cb560	ldr q0,[x1]
008cb564	subs w26,w26,#0x1
008cb568	str q0,[sp]
008cb56c	b.ne 0x008cb4b4
008cb570	ldr x8,[x24, #0x28]
008cb574	ldur x9,[x29, #-0x8]
008cb578	cmp x8,x9
008cb57c	b.ne 0x008cb75c
008cb580	adrp x1,0x2af000
008cb584	add x1,x1,#0x94
008cb588	mov x0,x19
008cb58c	bl 0x008b39cc
008cb590	ldr x8,[x22, #0x10]
008cb594	cbz x8,0x008cb3d0
008cb598	ldrb w9,[x8, #0x6]
008cb59c	tbnz w9,#0x1,0x008cb3d0
008cb5a0	ldrb w9,[x8, #0x7]
008cb5a4	tbnz w9,#0x1,0x008cb614
008cb5a8	ldr x9,[x19, #0x60]
008cb5ac	mov x25,x0
008cb5b0	mov x0,x8
008cb5b4	mov w1,#0x1
008cb5b8	ldr x2,[x9, #0x340]
008cb5bc	bl 0x008bdfe0
008cb5c0	mov x1,x0
008cb5c4	mov x0,x25
008cb5c8	cbnz x1,0x008cb494
008cb5cc	b 0x008cb3d0
008cb5d0	mov x23,sp
008cb5d4	mov x0,x19
008cb5d8	mov x2,x23
008cb5dc	mov x3,x21
008cb5e0	mov x4,x20
008cb5e4	bl 0x008cb760
008cb5e8	ldr x8,[x24, #0x28]
008cb5ec	ldur x9,[x29, #-0x8]
008cb5f0	cmp x8,x9
008cb5f4	b.ne 0x008cb75c
008cb5f8	ldp x20,x19,[sp, #0x60]
008cb5fc	ldp x22,x21,[sp, #0x50]
008cb600	ldp x24,x23,[sp, #0x40]
008cb604	ldp x26,x25,[sp, #0x30]
008cb608	ldp x29,x30,[sp, #0x20]
008cb60c	add sp,sp,#0x70
008cb610	ret
008cb614	ldr x8,[x8, #0x20]
008cb618	sub x1,x8,#0x20
008cb61c	b 0x008cb494
008cb620	mov x23,sp
008cb624	ldr x22,[x23]
008cb628	mov x1,x21
008cb62c	ldr x8,[x22, #0x10]
008cb630	ldr x0,[x8, #0x38]
008cb634	bl 0x008bb604
008cb638	ldr w8,[x0, #0xc]
008cb63c	cbz w8,0x008cb714
008cb640	ldr d0,[x0]
008cb644	ldr x9,[x22, #0x10]
008cb648	fcvtzu w8,d0
008cb64c	ldr w9,[x9, #0x58]
008cb650	cmp w9,w8
008cb654	b.ls 0x008cb698
008cb658	ldr x9,[x22, #0x20]
008cb65c	ldr q0,[x20]
008cb660	str q0,[x9,w8, uxtw #4]
008cb664	ldr w8,[x20, #0xc]
008cb668	cmp w8,#0x5
008cb66c	b.lt 0x008cb5e8
008cb670	ldrb w8,[x22, #0x2]
008cb674	tbz w8,#0x2,0x008cb5e8
008cb678	ldr x2,[x20]
008cb67c	ldrb w8,[x2, #0x2]
008cb680	tst w8,#0x3
008cb684	b.eq 0x008cb5e8
008cb688	mov x0,x19
008cb68c	mov x1,x22
008cb690	bl 0x008b6188
008cb694	b 0x008cb5e8
008cb698	ldr x8,[x24, #0x28]
008cb69c	ldur x9,[x29, #-0x8]
008cb6a0	cmp x8,x9
008cb6a4	b.ne 0x008cb75c
008cb6a8	mov x0,x19
008cb6ac	mov x1,x23
008cb6b0	mov x2,x21
008cb6b4	bl 0x008b3be4
008cb6b8	ldr x8,[x24, #0x28]
008cb6bc	ldur x9,[x29, #-0x8]
008cb6c0	cmp x8,x9
008cb6c4	b.ne 0x008cb75c
008cb6c8	mov x0,x19
008cb6cc	bl 0x008b3cec
008cb6d0	adrp x8,0xd1f000
008cb6d4	add x8,x8,#0x1e0
008cb6d8	mov x25,x0
008cb6dc	mov x0,x8
008cb6e0	bl 0x00c2fe90
008cb6e4	mov w8,w0
008cb6e8	mov x0,x25
008cb6ec	cbz w8,0x008cb3f0
008cb6f0	adrp x8,0xcca000
008cb6f4	ldr x0,[x8, #0x8c8]
008cb6f8	bl 0x007fe1ec
008cb6fc	str x0,[x23, #0x1d8]
008cb700	adrp x0,0xd1f000
008cb704	add x0,x0,#0x1e0
008cb708	bl 0x00c2fea0
008cb70c	mov x0,x25
008cb710	b 0x008cb3f0
008cb714	ldr x8,[x24, #0x28]
008cb718	ldur x9,[x29, #-0x8]
008cb71c	cmp x8,x9
008cb720	b.ne 0x008cb75c
008cb724	mov x0,x19
008cb728	mov x1,x23
008cb72c	mov x2,x21
008cb730	bl 0x008b3c58
008cb734	mov x19,x0
008cb738	adrp x0,0xd1f000
008cb73c	add x0,x0,#0x1e0
008cb740	bl 0x00c2feb0
008cb744	ldr x8,[x24, #0x28]
008cb748	ldur x9,[x29, #-0x8]
008cb74c	cmp x8,x9
008cb750	b.ne 0x008cb75c
008cb754	mov x0,x19
008cb758	bl 0x00c2c090
008cb75c	bl 0x00c2fec0
