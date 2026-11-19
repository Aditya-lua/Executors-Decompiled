; PEM_ASN1_write_bio @ 00ab6274
00ab6274	stp x28,x27,[sp, #-0x60]!
00ab6278	stp x26,x25,[sp, #0x10]
00ab627c	stp x24,x23,[sp, #0x20]
00ab6280	stp x22,x21,[sp, #0x30]
00ab6284	stp x20,x19,[sp, #0x40]
00ab6288	stp x29,x30,[sp, #0x50]
00ab628c	add x29,sp,#0x50
00ab6290	sub sp,sp,#0x470
00ab6294	mov x27,x7
00ab6298	mov w25,w6
00ab629c	mov x26,x5
00ab62a0	mov x23,x4
00ab62a4	mov x28,x3
00ab62a8	mov x20,x2
00ab62ac	mov x22,x1
00ab62b0	mov x21,x0
00ab62b4	stur xzr,[x29, #-0x60]
00ab62b8	cbz x4,0x00ab6338
00ab62bc	mov x0,x23
00ab62c0	bl 0x00c3cef0
00ab62c4	cbz x0,0x00ab6310
00ab62c8	mov x24,x0
00ab62cc	mov x0,x23
00ab62d0	bl 0x00c34bc0
00ab62d4	cbz w0,0x00ab6310
00ab62d8	mov x0,x23
00ab62dc	bl 0x00c34bc0
00ab62e0	cmp w0,#0x10
00ab62e4	b.gt 0x00ab6310
00ab62e8	mov x0,x24
00ab62ec	bl 0x00c2ff50
00ab62f0	mov x19,x0
00ab62f4	mov x0,x23
00ab62f8	bl 0x00c34bc0
00ab62fc	lsl w8,w0,#0x1
00ab6300	add x8,x19,w8, SXTW 
00ab6304	add x8,x8,#0x24
00ab6308	cmp x8,#0x401
00ab630c	b.cc 0x00ab633c
00ab6310	bl 0x00c342a0
00ab6314	adrp x0,0x2ce000
00ab6318	adrp x2,0x2be000
00ab631c	add x0,x0,#0x16c
00ab6320	add x2,x2,#0x1ca
00ab6324	mov w1,#0x14f
00ab6328	bl 0x00c342b0
00ab632c	mov w0,#0x9
00ab6330	mov w1,#0x71
00ab6334	b 0x00ab63d4
00ab6338	mov x24,xzr
00ab633c	mov x0,x28
00ab6340	mov x1,xzr
00ab6344	blr x21
00ab6348	cmp w0,#0x0
00ab634c	b.le 0x00ab63ac
00ab6350	adrp x1,0x2ce000
00ab6354	mov w19,w0
00ab6358	add w0,w0,#0x14
00ab635c	add x1,x1,#0x16c
00ab6360	mov w2,#0x15b
00ab6364	str x20,[sp]
00ab6368	bl 0x00c32320
00ab636c	mov x20,x0
00ab6370	cbz x0,0x00ab6454
00ab6374	sub x1,x29,#0x68
00ab6378	mov x0,x28
00ab637c	stur x20,[x29, #-0x68]
00ab6380	blr x21
00ab6384	stur w0,[x29, #-0x5c]
00ab6388	cbz x23,0x00ab6488
00ab638c	cbnz x26,0x00ab64cc
00ab6390	ldr x3,[x29, #0x10]
00ab6394	add x0,sp,#0x58
00ab6398	mov w1,#0x400
00ab639c	mov w2,#0x1
00ab63a0	cbz x27,0x00ab64b8
00ab63a4	blr x27
00ab63a8	b 0x00ab64bc
00ab63ac	bl 0x00c342a0
00ab63b0	adrp x0,0x2ce000
00ab63b4	adrp x2,0x2be000
00ab63b8	add x0,x0,#0x16c
00ab63bc	add x2,x2,#0x1ca
00ab63c0	mov w1,#0x155
00ab63c4	bl 0x00c342b0
00ab63c8	mov w1,#0xd
00ab63cc	mov w0,#0x9
00ab63d0	movk w1,#0x8, LSL #16
00ab63d4	mov x2,xzr
00ab63d8	bl 0x00c342c0
00ab63dc	mov x24,xzr
00ab63e0	mov w19,wzr
00ab63e4	mov w21,wzr
00ab63e8	mov x20,xzr
00ab63ec	add x0,sp,#0x18
00ab63f0	mov w1,#0x40
00ab63f4	bl 0x00c34750
00ab63f8	add x0,sp,#0x8
00ab63fc	mov w1,#0x10
00ab6400	bl 0x00c34750
00ab6404	mov x0,x24
00ab6408	bl 0x00c342d0
00ab640c	add x0,sp,#0x58
00ab6410	mov w1,#0x400
00ab6414	bl 0x00c34750
00ab6418	adrp x2,0x2ce000
00ab641c	mov w1,w19
00ab6420	add x2,x2,#0x16c
00ab6424	mov w3,#0x19a
00ab6428	mov x0,x20
00ab642c	bl 0x00c345e0
00ab6430	mov w0,w21
00ab6434	add sp,sp,#0x470
00ab6438	ldp x29,x30,[sp, #0x50]
00ab643c	ldp x20,x19,[sp, #0x40]
00ab6440	ldp x22,x21,[sp, #0x30]
00ab6444	ldp x24,x23,[sp, #0x20]
00ab6448	ldp x26,x25,[sp, #0x10]
00ab644c	ldp x28,x27,[sp], #0x60
00ab6450	ret
00ab6454	bl 0x00c342a0
00ab6458	adrp x0,0x2ce000
00ab645c	adrp x2,0x2be000
00ab6460	add x0,x0,#0x16c
00ab6464	add x2,x2,#0x1ca
00ab6468	mov w1,#0x15d
00ab646c	bl 0x00c342b0
00ab6470	mov w1,#0x100
00ab6474	mov w0,#0x9
00ab6478	movk w1,#0xc, LSL #16
00ab647c	mov x2,xzr
00ab6480	bl 0x00c342c0
00ab6484	b 0x00ab6668
00ab6488	mov x24,xzr
00ab648c	strb wzr,[sp, #0x58]
00ab6490	sxtw x4,w0
00ab6494	ldr x0,[sp]
00ab6498	add x2,sp,#0x58
00ab649c	mov x1,x22
00ab64a0	mov x3,x20
00ab64a4	bl 0x00ab66a4
00ab64a8	cmp w0,#0x0
00ab64ac	cset w21,gt
00ab64b0	stur w0,[x29, #-0x5c]
00ab64b4	b 0x00ab63ec
00ab64b8	bl 0x00ab5958
00ab64bc	mov w25,w0
00ab64c0	cmp w0,#0x0
00ab64c4	b.le 0x00ab667c
00ab64c8	add x26,sp,#0x58
00ab64cc	mov x0,x23
00ab64d0	bl 0x00c34bc0
00ab64d4	mov w1,w0
00ab64d8	add x0,sp,#0x8
00ab64dc	bl 0x00c326a0
00ab64e0	cmp w0,#0x1
00ab64e4	b.lt 0x00ab6668
00ab64e8	bl 0x00c3d490
00ab64ec	mov x1,x0
00ab64f0	add x2,sp,#0x8
00ab64f4	mov w5,#0x1
00ab64f8	add x6,sp,#0x18
00ab64fc	mov x0,x23
00ab6500	mov x3,x26
00ab6504	mov w4,w25
00ab6508	mov x7,xzr
00ab650c	bl 0x00c3ce60
00ab6510	cbz w0,0x00ab6668
00ab6514	add x21,sp,#0x58
00ab6518	cmp x26,x21
00ab651c	b.ne 0x00ab652c
00ab6520	add x0,sp,#0x58
00ab6524	mov w1,#0x400
00ab6528	bl 0x00c34750
00ab652c	add x0,sp,#0x58
00ab6530	strb wzr,[sp, #0x58]
00ab6534	bl 0x00c2ff50
00ab6538	add x8,x21,x0
00ab653c	mov w26,#0x400
00ab6540	adrp x2,0x2aa000
00ab6544	adrp x3,0x774000
00ab6548	sub x1,x26,x0
00ab654c	add x2,x2,#0x82e
00ab6550	add x3,x3,#0x42c
00ab6554	mov x0,x8
00ab6558	bl 0x00c34d30
00ab655c	mov x0,x23
00ab6560	bl 0x00c34bc0
00ab6564	mov w25,w0
00ab6568	add x0,sp,#0x58
00ab656c	bl 0x00c2ff50
00ab6570	add x21,x21,x0
00ab6574	sub w26,w26,w0
00ab6578	adrp x2,0x2d8000
00ab657c	sxtw x1,w26
00ab6580	add x2,x2,#0x5b8
00ab6584	mov x0,x21
00ab6588	mov x3,x24
00ab658c	bl 0x00c34d30
00ab6590	cmp w0,#0x1
00ab6594	b.lt 0x00ab65fc
00ab6598	sub w26,w26,w0
00ab659c	cmp w25,#0x1
00ab65a0	add x21,x21,w0, SXTW 
00ab65a4	b.lt 0x00ab65ec
00ab65a8	adrp x24,0x2c7000
00ab65ac	mov x27,xzr
00ab65b0	sxtw x25,w25
00ab65b4	add x28,sp,#0x8
00ab65b8	add x24,x24,#0x74b
00ab65bc	ldrb w3,[x28, x27]
00ab65c0	sxtw x1,w26
00ab65c4	mov x0,x21
00ab65c8	mov x2,x24
00ab65cc	bl 0x00c34d30
00ab65d0	cmp w0,#0x1
00ab65d4	b.lt 0x00ab65fc
00ab65d8	add x27,x27,#0x1
00ab65dc	sub w26,w26,w0
00ab65e0	cmp x27,x25
00ab65e4	add x21,x21,w0, SXTW 
00ab65e8	b.lt 0x00ab65bc
00ab65ec	cmp w26,#0x1
00ab65f0	b.le 0x00ab65fc
00ab65f4	mov w8,#0xa
00ab65f8	strh w8,[x21]
00ab65fc	bl 0x00c34b90
00ab6600	mov x24,x0
00ab6604	cbz x0,0x00ab6674
00ab6608	add x3,sp,#0x18
00ab660c	add x4,sp,#0x8
00ab6610	mov x0,x24
00ab6614	mov x1,x23
00ab6618	mov x2,xzr
00ab661c	bl 0x00c37300
00ab6620	cbz w0,0x00ab6674
00ab6624	ldur w4,[x29, #-0x5c]
00ab6628	sub x2,x29,#0x60
00ab662c	mov x0,x24
00ab6630	mov x1,x20
00ab6634	mov x3,x20
00ab6638	bl 0x00c37310
00ab663c	cbz w0,0x00ab6674
00ab6640	ldursw x8,[x29, #-0x60]
00ab6644	sub x2,x29,#0x5c
00ab6648	mov x0,x24
00ab664c	add x1,x20,x8
00ab6650	bl 0x00c3cd20
00ab6654	cbz w0,0x00ab6674
00ab6658	ldp w8,w9,[x29, #-0x60]
00ab665c	add w0,w9,w8
00ab6660	stur w0,[x29, #-0x5c]
00ab6664	b 0x00ab6490
00ab6668	mov x24,xzr
00ab666c	mov w21,wzr
00ab6670	b 0x00ab63ec
00ab6674	mov w21,wzr
00ab6678	b 0x00ab63ec
00ab667c	bl 0x00c342a0
00ab6680	adrp x0,0x2ce000
00ab6684	adrp x2,0x2be000
00ab6688	add x0,x0,#0x16c
00ab668c	add x2,x2,#0x1ca
00ab6690	mov w1,#0x16a
00ab6694	bl 0x00c342b0
00ab6698	mov w0,#0x9
00ab669c	mov w1,#0x6f
00ab66a0	b 0x00ab647c
