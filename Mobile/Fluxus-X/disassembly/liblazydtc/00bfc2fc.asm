; std::__ndk1::collate_byname<wchar_t>::do_transform @ 00bfc2fc
00bfc2fc	paciasp
00bfc300	sub sp,sp,#0x70
00bfc304	stp x29,x30,[sp, #0x20]
00bfc308	stp x26,x25,[sp, #0x30]
00bfc30c	stp x24,x23,[sp, #0x40]
00bfc310	stp x22,x21,[sp, #0x50]
00bfc314	stp x20,x19,[sp, #0x60]
00bfc318	add x29,sp,#0x20
00bfc31c	sub x21,x2,x1
00bfc320	mov x24,#-0x9
00bfc324	asr x25,x21,#0x2
00bfc328	movk x24,#0x3fff, LSL #48
00bfc32c	cmp x25,x24
00bfc330	b.hi 0x00bfc4b0
00bfc334	mov x22,x2
00bfc338	mov x20,x0
00bfc33c	mov x19,x8
00bfc340	cmp x25,#0x4
00bfc344	b.hi 0x00bfc368
00bfc348	lsr w8,w21,#0x1
00bfc34c	add x9,sp,#0x8
00bfc350	orr x23,x9,#0x4
00bfc354	and w8,w8,#0xfe
00bfc358	strb w8,[sp, #0x8]
00bfc35c	cmp x22,x1
00bfc360	b.ne 0x00bfc3a0
00bfc364	b 0x00bfc3ac
00bfc368	orr x8,x25,#0x1
00bfc36c	mov w9,#0x8
00bfc370	mov x23,x1
00bfc374	cmp x8,#0x5
00bfc378	csinc x26,x9,x8,eq
00bfc37c	lsl x0,x26,#0x2
00bfc380	bl 0x00c2fed0
00bfc384	mov x1,x23
00bfc388	mov x23,x0
00bfc38c	orr x8,x26,#0x1
00bfc390	stp x25,x0,[sp, #0x10]
00bfc394	str x8,[sp, #0x8]
00bfc398	cmp x22,x1
00bfc39c	b.eq 0x00bfc3ac
00bfc3a0	mov x0,x23
00bfc3a4	mov x2,x21
00bfc3a8	bl 0x00c2ffd0
00bfc3ac	str wzr,[x23, x21#0x0]
00bfc3b0	add x10,sp,#0x8
00bfc3b4	ldr x3,[x20, #0x10]
00bfc3b8	ldrb w8,[sp, #0x8]
00bfc3bc	ldr x9,[sp, #0x18]
00bfc3c0	orr x23,x10,#0x4
00bfc3c4	tst w8,#0x1
00bfc3c8	csel x1,x23,x9,eq
00bfc3cc	mov x0,xzr
00bfc3d0	mov x2,xzr
00bfc3d4	bl 0x00c437a0
00bfc3d8	mov x21,x0
00bfc3dc	cmp x0,x24
00bfc3e0	b.hi 0x00bfc4b4
00bfc3e4	cmp x21,#0x5
00bfc3e8	b.cs 0x00bfc400
00bfc3ec	lsl w8,w21,#0x1
00bfc3f0	mov x22,x19
00bfc3f4	strb w8,[x22], #0x4
00bfc3f8	cbnz x21,0x00bfc428
00bfc3fc	b 0x00bfc438
00bfc400	orr x8,x21,#0x1
00bfc404	mov w9,#0x8
00bfc408	cmp x8,#0x5
00bfc40c	csinc x24,x9,x8,eq
00bfc410	lsl x0,x24,#0x2
00bfc414	bl 0x00c2fed0
00bfc418	orr x8,x24,#0x1
00bfc41c	mov x22,x0
00bfc420	stp x21,x0,[x19, #0x8]
00bfc424	str x8,[x19]
00bfc428	lsl x2,x21,#0x2
00bfc42c	mov x0,x22
00bfc430	mov w1,wzr
00bfc434	bl 0x00c301c0
00bfc438	ldrb w8,[sp, #0x8]
00bfc43c	str wzr,[x22, x21, LSL #0x2]
00bfc440	add x10,x19,#0x4
00bfc444	ldrb w9,[x19]
00bfc448	ldr x11,[sp, #0x18]
00bfc44c	ldr x3,[x20, #0x10]
00bfc450	tst w8,#0x1
00bfc454	ldp x12,x8,[x19, #0x8]
00bfc458	lsr x13,x9,#0x1
00bfc45c	csel x1,x23,x11,eq
00bfc460	tst w9,#0x1
00bfc464	csel x0,x10,x8,eq
00bfc468	csel x8,x13,x12,eq
00bfc46c	add x2,x8,#0x1
00bfc470	bl 0x00c437a0
00bfc474	ldrb w8,[sp, #0x8]
00bfc478	tbz w8,#0x0,0x00bfc490
00bfc47c	ldr x8,[sp, #0x8]
00bfc480	ldr x0,[sp, #0x18]
00bfc484	lsl x8,x8,#0x2
00bfc488	and x1,x8,#-0x8
00bfc48c	bl 0x00c2fe80
00bfc490	ldp x20,x19,[sp, #0x60]
00bfc494	ldp x22,x21,[sp, #0x50]
00bfc498	ldp x24,x23,[sp, #0x40]
00bfc49c	ldp x26,x25,[sp, #0x30]
00bfc4a0	ldp x29,x30,[sp, #0x20]
00bfc4a4	add sp,sp,#0x70
00bfc4a8	autiasp
00bfc4ac	ret
00bfc4b0	bl 0x00bc5610
00bfc4b4	bl 0x00bc5610
