; std::__ndk1::money_get<wchar_t,std::__ndk1::istreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>::do_get @ 00bef338
00bef338	paciasp
00bef33c	stp x29,x30,[sp, #-0x60]!
00bef340	stp x28,x27,[sp, #0x10]
00bef344	stp x26,x25,[sp, #0x20]
00bef348	stp x24,x23,[sp, #0x30]
00bef34c	stp x22,x21,[sp, #0x40]
00bef350	stp x20,x19,[sp, #0x50]
00bef354	mov x29,sp
00bef358	sub sp,sp,#0x270
00bef35c	stur x1,[x29, #-0x8]
00bef360	adrp x8,0xcb5000
00bef364	mov x21,x6
00bef368	ldr x8,[x8, #0xc18]
00bef36c	mov x19,x5
00bef370	mov x23,x4
00bef374	mov w22,w3
00bef378	mov x20,x2
00bef37c	add x25,sp,#0xd8
00bef380	stp x25,x8,[sp, #0xc8]
00bef384	add x8,sp,#0xb8
00bef388	mov x0,x4
00bef38c	bl 0x00c30070
00bef390	adrp x26,0xcb5000
00bef394	ldr x26,[x26, #0xb98]
00bef398	ldr x24,[sp, #0xb8]
00bef39c	str x26,[sp, #0xa8]
00bef3a0	ldar x8,[x26]
00bef3a4	cmn x8,#0x1
00bef3a8	b.eq 0x00bef3d4
00bef3ac	add x8,sp,#0xa8
00bef3b0	add x9,sp,#0x18
00bef3b4	str x8,[sp, #0x18]
00bef3b8	str x9,[sp, #0x80]
00bef3bc	adrp x0,0xcb5000
00bef3c0	nop
00bef3c4	adr x2,0xc0bab0
00bef3c8	ldr x0,[x0, #0xb98]
00bef3cc	add x1,sp,#0x80
00bef3d0	bl 0x00c305d0
00bef3d4	ldp x8,x10,[x24, #0x10]
00bef3d8	ldrsw x9,[x26, #0x8]
00bef3dc	sub x9,x9,#0x1
00bef3e0	sub x10,x10,x8
00bef3e4	cmp x9,x10, ASR #0x3
00bef3e8	b.cs 0x00bef608
00bef3ec	ldr x24,[x8, x9, LSL #0x3]
00bef3f0	cbz x24,0x00bef608
00bef3f4	ldr w4,[x23, #0x8]
00bef3f8	add x10,x25,#0x190
00bef3fc	strb wzr,[sp, #0xb4]
00bef400	add x8,sp,#0xc0
00bef404	add x9,sp,#0xc8
00bef408	sub x0,x29,#0x8
00bef40c	and w2,w22,#0x1
00bef410	add x3,sp,#0xb8
00bef414	add x6,sp,#0xb4
00bef418	mov x1,x20
00bef41c	mov x5,x19
00bef420	mov x7,x24
00bef424	stp x8,x10,[sp, #0x8]
00bef428	str x9,[sp]
00bef42c	bl 0x00c44220
00bef430	tbz w0,#0x0,0x00bef52c
00bef434	adrp x9,0x29d000
00bef438	add x9,x9,#0x4da
00bef43c	mov w8,#0x3837
00bef440	ldr x9,[x9]
00bef444	movk w8,#0x39, LSL #16
00bef448	stur w8,[sp, #0xaf]
00bef44c	str x9,[sp, #0xa8]
00bef450	add x9,sp,#0xa8
00bef454	ldr x8,[x24]
00bef458	ldr x8,[x8, #0x60]
00bef45c	add x1,sp,#0xa8
00bef460	add x2,x9,#0xa
00bef464	add x3,sp,#0x80
00bef468	mov x0,x24
00bef46c	blr x8
00bef470	ldp x25,x23,[sp, #0xc0]
00bef474	sub x8,x25,x23
00bef478	cmp x8,#0x189
00bef47c	b.lt 0x00bef49c
00bef480	lsr x8,x8,#0x2
00bef484	add x0,x8,#0x2
00bef488	bl 0x00c308d0
00bef48c	mov x22,x0
00bef490	mov x24,x0
00bef494	cbnz x0,0x00bef4a4
00bef498	bl 0x00c43cc0
00bef49c	mov x22,xzr
00bef4a0	add x24,sp,#0x18
00bef4a4	ldrb w8,[sp, #0xb4]
00bef4a8	cmp w8,#0x1
00bef4ac	b.ne 0x00bef4b8
00bef4b0	mov w8,#0x2d
00bef4b4	strb w8,[x24], #0x1
00bef4b8	cmp x23,x25
00bef4bc	b.cs 0x00bef500
00bef4c0	add x25,sp,#0x80
00bef4c4	add x27,sp,#0xa8
00bef4c8	add x26,x25,#0x28
00bef4cc	ldr w1,[x23], #0x4
00bef4d0	add x0,sp,#0x80
00bef4d4	mov w2,#0xa
00bef4d8	bl 0x00c43a60
00bef4dc	cmp x0,#0x0
00bef4e0	ldr x9,[sp, #0xc0]
00bef4e4	csel x8,x26,x0,eq
00bef4e8	sub x8,x8,x25
00bef4ec	cmp x23,x9
00bef4f0	asr x8,x8,#0x2
00bef4f4	ldrb w8,[x27, x8]
00bef4f8	strb w8,[x24], #0x1
00bef4fc	b.cc 0x00bef4cc
00bef500	adrp x1,0x2ba000
00bef504	add x1,x1,#0xc50
00bef508	add x0,sp,#0x18
00bef50c	mov x2,x21
00bef510	strb wzr,[x24]
00bef514	bl 0x00c30c30
00bef518	cmp w0,#0x1
00bef51c	b.ne 0x00bef60c
00bef520	cbz x22,0x00bef52c
00bef524	mov x0,x22
00bef528	bl 0x00c30960
00bef52c	ldur x0,[x29, #-0x8]
00bef530	cbz x0,0x00bef578
00bef534	ldp x8,x9,[x0, #0x18]
00bef538	cmp x8,x9
00bef53c	b.eq 0x00bef548
00bef540	ldr w0,[x8]
00bef544	b 0x00bef554
00bef548	ldr x8,[x0]
00bef54c	ldr x8,[x8, #0x48]
00bef550	blr x8
00bef554	cmn w0,#0x1
00bef558	b.eq 0x00bef574
00bef55c	ldur x8,[x29, #-0x8]
00bef560	cmp x8,#0x0
00bef564	cset w21,eq
00bef568	cbnz x20,0x00bef580
00bef56c	tbnz w21,#0x0,0x00bef5b4
00bef570	b 0x00bef5c0
00bef574	stur xzr,[x29, #-0x8]
00bef578	mov w21,#0x1
00bef57c	cbz x20,0x00bef56c
00bef580	ldp x8,x9,[x20, #0x18]
00bef584	cmp x8,x9
00bef588	b.eq 0x00bef594
00bef58c	ldr w0,[x8]
00bef590	b 0x00bef5a4
00bef594	ldr x8,[x20]
00bef598	ldr x8,[x8, #0x48]
00bef59c	mov x0,x20
00bef5a0	blr x8
00bef5a4	cmn w0,#0x1
00bef5a8	cset w8,eq
00bef5ac	eor w8,w21,w8
00bef5b0	tbnz w8,#0x0,0x00bef5c0
00bef5b4	ldr w8,[x19]
00bef5b8	orr w8,w8,#0x2
00bef5bc	str w8,[x19]
00bef5c0	ldur x19,[x29, #-0x8]
00bef5c4	add x0,sp,#0xb8
00bef5c8	bl 0x00c30090
00bef5cc	ldr x0,[sp, #0xc8]
00bef5d0	str xzr,[sp, #0xc8]
00bef5d4	cbz x0,0x00bef5e0
00bef5d8	ldr x8,[sp, #0xd0]
00bef5dc	blr x8
00bef5e0	mov x0,x19
00bef5e4	add sp,sp,#0x270
00bef5e8	ldp x20,x19,[sp, #0x50]
00bef5ec	ldp x22,x21,[sp, #0x40]
00bef5f0	ldp x24,x23,[sp, #0x30]
00bef5f4	ldp x26,x25,[sp, #0x20]
00bef5f8	ldp x28,x27,[sp, #0x10]
00bef5fc	ldp x29,x30,[sp], #0x60
00bef600	autiasp
00bef604	ret
00bef608	bl 0x00bd8968
00bef60c	adrp x0,0x2dd000
00bef610	add x0,x0,#0x20d
00bef614	bl 0x00c43d00
00bef618	b 0x00bef64c
00bef64c	mov x19,x0
00bef650	add x0,sp,#0xb8
00bef654	bl 0x00c30090
00bef658	ldr x0,[sp, #0xc8]
00bef65c	str xzr,[sp, #0xc8]
00bef660	cbz x0,0x00bef66c
00bef664	ldr x8,[sp, #0xd0]
00bef668	blr x8
00bef66c	mov x0,x19
00bef670	bl 0x00c2c090
