; std::__ndk1::num_get<char,std::__ndk1::istreambuf_iterator<char,std::__ndk1::char_traits<char>>>::do_get @ 00bda35c
00bda35c	paciasp
00bda360	sub sp,sp,#0x90
00bda364	stp x29,x30,[sp, #0x50]
00bda368	stp x24,x23,[sp, #0x60]
00bda36c	stp x22,x21,[sp, #0x70]
00bda370	stp x20,x19,[sp, #0x80]
00bda374	add x29,sp,#0x50
00bda378	ldrb w8,[x3, #0x8]
00bda37c	mov x19,x5
00bda380	mov x20,x4
00bda384	stur x1,[x29, #-0x18]
00bda388	tbnz w8,#0x0,0x00bda3c0
00bda38c	ldr x8,[x0]
00bda390	mov x9,#-0x1
00bda394	mov x5,sp
00bda398	mov x4,x20
00bda39c	str x9,[sp]
00bda3a0	ldr x8,[x8, #0x20]
00bda3a4	blr x8
00bda3a8	ldr x8,[sp]
00bda3ac	cmp x8,#0x1
00bda3b0	b.eq 0x00bda564
00bda3b4	cbnz x8,0x00bda56c
00bda3b8	strb wzr,[x19]
00bda3bc	b 0x00bda57c
00bda3c0	sub x8,x29,#0x20
00bda3c4	mov x0,x3
00bda3c8	mov x21,x2
00bda3cc	mov x23,x3
00bda3d0	bl 0x00c30070
00bda3d4	adrp x24,0xcb4000
00bda3d8	ldr x24,[x24, #0x998]
00bda3dc	ldur x22,[x29, #-0x20]
00bda3e0	stur x24,[x29, #-0x10]
00bda3e4	ldar x8,[x24]
00bda3e8	cmn x8,#0x1
00bda3ec	b.eq 0x00bda418
00bda3f0	sub x8,x29,#0x10
00bda3f4	mov x9,sp
00bda3f8	str x8,[sp]
00bda3fc	stur x9,[x29, #-0x8]
00bda400	adrp x0,0xcb4000
00bda404	nop
00bda408	adr x2,0xc0bab0
00bda40c	ldr x0,[x0, #0x998]
00bda410	sub x1,x29,#0x8
00bda414	bl 0x00c305d0
00bda418	ldp x8,x10,[x22, #0x10]
00bda41c	ldrsw x9,[x24, #0x8]
00bda420	sub x9,x9,#0x1
00bda424	sub x10,x10,x8
00bda428	cmp x9,x10, ASR #0x3
00bda42c	b.cs 0x00bda598
00bda430	ldr x22,[x8, x9, LSL #0x3]
00bda434	cbz x22,0x00bda598
00bda438	sub x0,x29,#0x20
00bda43c	bl 0x00c30090
00bda440	sub x8,x29,#0x20
00bda444	mov x0,x23
00bda448	bl 0x00c30070
00bda44c	adrp x24,0xcb5000
00bda450	ldr x24,[x24, #0xc00]
00bda454	ldur x23,[x29, #-0x20]
00bda458	stur x24,[x29, #-0x10]
00bda45c	ldar x8,[x24]
00bda460	cmn x8,#0x1
00bda464	b.eq 0x00bda490
00bda468	sub x8,x29,#0x10
00bda46c	mov x9,sp
00bda470	str x8,[sp]
00bda474	stur x9,[x29, #-0x8]
00bda478	adrp x0,0xcb5000
00bda47c	nop
00bda480	adr x2,0xc0bab0
00bda484	ldr x0,[x0, #0xc00]
00bda488	sub x1,x29,#0x8
00bda48c	bl 0x00c305d0
00bda490	ldp x8,x10,[x23, #0x10]
00bda494	ldrsw x9,[x24, #0x8]
00bda498	sub x9,x9,#0x1
00bda49c	sub x10,x10,x8
00bda4a0	cmp x9,x10, ASR #0x3
00bda4a4	b.cs 0x00bda59c
00bda4a8	ldr x23,[x8, x9, LSL #0x3]
00bda4ac	cbz x23,0x00bda59c
00bda4b0	sub x0,x29,#0x20
00bda4b4	bl 0x00c30090
00bda4b8	ldr x8,[x23]
00bda4bc	ldr x9,[x8, #0x30]
00bda4c0	mov x8,sp
00bda4c4	mov x0,x23
00bda4c8	mov x24,sp
00bda4cc	blr x9
00bda4d0	ldr x8,[x23]
00bda4d4	ldr x9,[x8, #0x38]
00bda4d8	add x8,x24,#0x18
00bda4dc	mov x0,x23
00bda4e0	blr x9
00bda4e4	mov x23,sp
00bda4e8	sub x0,x29,#0x18
00bda4ec	mov x2,sp
00bda4f0	add x3,x23,#0x30
00bda4f4	mov x1,x21
00bda4f8	mov x4,x22
00bda4fc	mov x5,x20
00bda500	mov w6,#0x1
00bda504	bl 0x00bda608
00bda508	cmp x0,x23
00bda50c	ldrb w8,[sp, #0x18]
00bda510	ldur x0,[x29, #-0x18]
00bda514	cset w9,eq
00bda518	strb w9,[x19]
00bda51c	tbz w8,#0x0,0x00bda53c
00bda520	ldr x8,[sp, #0x28]
00bda524	ldr x9,[sp, #0x18]
00bda528	mov x19,x0
00bda52c	and x1,x9,#-0x2
00bda530	mov x0,x8
00bda534	bl 0x00c2fe80
00bda538	mov x0,x19
00bda53c	ldrb w8,[sp]
00bda540	tbz w8,#0x0,0x00bda57c
00bda544	ldr x8,[sp, #0x10]
00bda548	ldr x9,[sp]
00bda54c	mov x19,x0
00bda550	and x1,x9,#-0x2
00bda554	mov x0,x8
00bda558	bl 0x00c2fe80
00bda55c	mov x0,x19
00bda560	b 0x00bda57c
00bda564	strb w8,[x19]
00bda568	b 0x00bda57c
00bda56c	mov w8,#0x1
00bda570	mov w9,#0x4
00bda574	strb w8,[x19]
00bda578	str w9,[x20]
00bda57c	ldp x20,x19,[sp, #0x80]
00bda580	ldp x22,x21,[sp, #0x70]
00bda584	ldp x24,x23,[sp, #0x60]
00bda588	ldp x29,x30,[sp, #0x50]
00bda58c	add sp,sp,#0x90
00bda590	autiasp
00bda594	ret
00bda598	bl 0x00bd8968
00bda59c	bl 0x00bd8968
