; std::__ndk1::time_put<char,std::__ndk1::ostreambuf_iterator<char,std::__ndk1::char_traits<char>>>::put @ 00bec384
00bec384	paciasp
00bec388	sub sp,sp,#0x90
00bec38c	stp x29,x30,[sp, #0x30]
00bec390	stp x28,x27,[sp, #0x40]
00bec394	stp x26,x25,[sp, #0x50]
00bec398	stp x24,x23,[sp, #0x60]
00bec39c	stp x22,x21,[sp, #0x70]
00bec3a0	stp x20,x19,[sp, #0x80]
00bec3a4	add x29,sp,#0x30
00bec3a8	mov x24,x0
00bec3ac	add x8,sp,#0x10
00bec3b0	mov x0,x2
00bec3b4	mov x20,x6
00bec3b8	mov x25,x5
00bec3bc	str x4,[sp, #0x8]
00bec3c0	mov w22,w3
00bec3c4	mov x23,x2
00bec3c8	mov x19,x1
00bec3cc	bl 0x00c30070
00bec3d0	adrp x27,0xcb4000
00bec3d4	ldr x27,[x27, #0x998]
00bec3d8	ldr x26,[sp, #0x10]
00bec3dc	str x27,[sp, #0x18]
00bec3e0	ldar x8,[x27]
00bec3e4	cmn x8,#0x1
00bec3e8	b.eq 0x00bec410
00bec3ec	add x8,sp,#0x18
00bec3f0	sub x9,x29,#0x8
00bec3f4	stp x9,x8,[x29, #-0x10]
00bec3f8	adrp x0,0xcb4000
00bec3fc	nop
00bec400	adr x2,0xc0bab0
00bec404	ldr x0,[x0, #0x998]
00bec408	sub x1,x29,#0x10
00bec40c	bl 0x00c305d0
00bec410	ldp x8,x10,[x26, #0x10]
00bec414	ldrsw x9,[x27, #0x8]
00bec418	sub x9,x9,#0x1
00bec41c	sub x10,x10,x8
00bec420	cmp x9,x10, ASR #0x3
00bec424	b.cs 0x00bec608
00bec428	ldr x26,[x8, x9, LSL #0x3]
00bec42c	cbz x26,0x00bec608
00bec430	add x0,sp,#0x10
00bec434	bl 0x00c30090
00bec438	b 0x00bec458
00bec43c	ldr x8,[x19]
00bec440	mov x0,x19
00bec444	ldr x8,[x8, #0x68]
00bec448	blr x8
00bec44c	cmn w0,#0x1
00bec450	csel x19,xzr,x19,eq
00bec454	add x25,x25,#0x1
00bec458	cmp x25,x20
00bec45c	b.eq 0x00bec5d8
00bec460	ldr x8,[x26]
00bec464	ldrb w1,[x25]
00bec468	mov x0,x26
00bec46c	mov w2,wzr
00bec470	ldr x8,[x8, #0x48]
00bec474	blr x8
00bec478	and w8,w0,#0xff
00bec47c	cmp w8,#0x25
00bec480	b.ne 0x00bec4f0
00bec484	add x21,x25,#0x1
00bec488	cmp x21,x20
00bec48c	b.eq 0x00bec550
00bec490	ldr x8,[x26]
00bec494	ldrb w1,[x21]
00bec498	mov x0,x26
00bec49c	mov w2,wzr
00bec4a0	ldr x8,[x8, #0x48]
00bec4a4	blr x8
00bec4a8	and w8,w0,#0xff
00bec4ac	mov w27,w0
00bec4b0	cmp w8,#0x4f
00bec4b4	b.eq 0x00bec4c0
00bec4b8	cmp w8,#0x45
00bec4bc	b.ne 0x00bec518
00bec4c0	add x28,x25,#0x2
00bec4c4	cmp x28,x20
00bec4c8	b.eq 0x00bec574
00bec4cc	ldr x8,[x26]
00bec4d0	ldrb w1,[x28]
00bec4d4	mov x0,x26
00bec4d8	mov w2,wzr
00bec4dc	ldr x8,[x8, #0x48]
00bec4e0	blr x8
00bec4e4	mov w5,w0
00bec4e8	mov x21,x28
00bec4ec	b 0x00bec520
00bec4f0	cbz x19,0x00bec454
00bec4f4	ldp x8,x9,[x19, #0x30]
00bec4f8	ldrb w1,[x25]
00bec4fc	cmp x8,x9
00bec500	b.eq 0x00bec43c
00bec504	add x9,x8,#0x1
00bec508	add x25,x25,#0x1
00bec50c	str x9,[x19, #0x30]
00bec510	strb w1,[x8]
00bec514	b 0x00bec458
00bec518	mov w5,w27
00bec51c	mov w27,wzr
00bec520	ldr x8,[x24]
00bec524	ldr x4,[sp, #0x8]
00bec528	mov x0,x24
00bec52c	mov x1,x19
00bec530	mov x2,x23
00bec534	mov w3,w22
00bec538	ldr x8,[x8, #0x18]
00bec53c	mov w6,w27
00bec540	blr x8
00bec544	mov x19,x0
00bec548	add x25,x21,#0x1
00bec54c	b 0x00bec458
00bec550	cbz x19,0x00bec5d8
00bec554	ldp x8,x9,[x19, #0x30]
00bec558	ldrb w1,[x25]
00bec55c	cmp x8,x9
00bec560	b.eq 0x00bec5c0
00bec564	add x9,x8,#0x1
00bec568	str x9,[x19, #0x30]
00bec56c	strb w1,[x8]
00bec570	b 0x00bec5d8
00bec574	cbz x19,0x00bec5d8
00bec578	ldp x8,x9,[x19, #0x30]
00bec57c	ldrb w1,[x25]
00bec580	cmp x8,x9
00bec584	b.eq 0x00bec598
00bec588	add x9,x8,#0x1
00bec58c	str x9,[x19, #0x30]
00bec590	strb w1,[x8]
00bec594	b 0x00bec5b0
00bec598	ldr x8,[x19]
00bec59c	mov x0,x19
00bec5a0	ldr x8,[x8, #0x68]
00bec5a4	blr x8
00bec5a8	cmn w0,#0x1
00bec5ac	b.eq 0x00bec600
00bec5b0	ldp x8,x9,[x19, #0x30]
00bec5b4	ldrb w1,[x21]
00bec5b8	cmp x8,x9
00bec5bc	b.ne 0x00bec564
00bec5c0	ldr x8,[x19]
00bec5c4	mov x0,x19
00bec5c8	ldr x8,[x8, #0x68]
00bec5cc	blr x8
00bec5d0	cmn w0,#0x1
00bec5d4	csel x19,xzr,x19,eq
00bec5d8	mov x0,x19
00bec5dc	ldp x20,x19,[sp, #0x80]
00bec5e0	ldp x22,x21,[sp, #0x70]
00bec5e4	ldp x24,x23,[sp, #0x60]
00bec5e8	ldp x26,x25,[sp, #0x50]
00bec5ec	ldp x28,x27,[sp, #0x40]
00bec5f0	ldp x29,x30,[sp, #0x30]
00bec5f4	add sp,sp,#0x90
00bec5f8	autiasp
00bec5fc	ret
00bec600	mov x19,xzr
00bec604	b 0x00bec5d8
00bec608	bl 0x00bd8968
