; std::__ndk1::money_get<char,std::__ndk1::istreambuf_iterator<char,std::__ndk1::char_traits<char>>>::do_get @ 00bed1e0
00bed1e0	paciasp
00bed1e4	sub sp,sp,#0x190
00bed1e8	stp x29,x30,[sp, #0x130]
00bed1ec	stp x28,x27,[sp, #0x140]
00bed1f0	stp x26,x25,[sp, #0x150]
00bed1f4	stp x24,x23,[sp, #0x160]
00bed1f8	stp x22,x21,[sp, #0x170]
00bed1fc	stp x20,x19,[sp, #0x180]
00bed200	add x29,sp,#0x130
00bed204	stur x1,[x29, #-0x8]
00bed208	adrp x8,0xcb5000
00bed20c	mov x21,x6
00bed210	ldr x8,[x8, #0xc18]
00bed214	mov x19,x5
00bed218	mov x23,x4
00bed21c	mov w22,w3
00bed220	mov x20,x2
00bed224	sub x25,x29,#0x6c
00bed228	stp x25,x8,[x29, #-0x80]
00bed22c	sub x8,x29,#0x90
00bed230	mov x0,x4
00bed234	bl 0x00c30070
00bed238	adrp x26,0xcb4000
00bed23c	ldr x26,[x26, #0x998]
00bed240	ldur x24,[x29, #-0x90]
00bed244	str x26,[sp, #0x80]
00bed248	ldar x8,[x26]
00bed24c	cmn x8,#0x1
00bed250	b.eq 0x00bed27c
00bed254	add x8,sp,#0x80
00bed258	add x9,sp,#0x18
00bed25c	str x8,[sp, #0x18]
00bed260	str x9,[sp, #0x90]
00bed264	adrp x0,0xcb4000
00bed268	nop
00bed26c	adr x2,0xc0bab0
00bed270	ldr x0,[x0, #0x998]
00bed274	add x1,sp,#0x90
00bed278	bl 0x00c305d0
00bed27c	ldp x8,x10,[x24, #0x10]
00bed280	ldrsw x9,[x26, #0x8]
00bed284	sub x9,x9,#0x1
00bed288	sub x10,x10,x8
00bed28c	cmp x9,x10, ASR #0x3
00bed290	b.cs 0x00bed4ac
00bed294	ldr x24,[x8, x9, LSL #0x3]
00bed298	cbz x24,0x00bed4ac
00bed29c	ldr w4,[x23, #0x8]
00bed2a0	add x10,x25,#0x64
00bed2a4	sturb wzr,[x29, #-0x94]
00bed2a8	sub x8,x29,#0x88
00bed2ac	sub x9,x29,#0x80
00bed2b0	sub x0,x29,#0x8
00bed2b4	and w2,w22,#0x1
00bed2b8	sub x3,x29,#0x90
00bed2bc	sub x6,x29,#0x94
00bed2c0	mov x1,x20
00bed2c4	mov x5,x19
00bed2c8	mov x7,x24
00bed2cc	stp x8,x10,[sp, #0x8]
00bed2d0	str x9,[sp]
00bed2d4	bl 0x00c44200
00bed2d8	tbz w0,#0x0,0x00bed3cc
00bed2dc	adrp x9,0x29d000
00bed2e0	add x9,x9,#0x4da
00bed2e4	mov w8,#0x3837
00bed2e8	ldr x9,[x9]
00bed2ec	movk w8,#0x39, LSL #16
00bed2f0	stur w8,[sp, #0x97]
00bed2f4	str x9,[sp, #0x90]
00bed2f8	add x9,sp,#0x90
00bed2fc	ldr x8,[x24]
00bed300	ldr x8,[x8, #0x40]
00bed304	add x1,sp,#0x90
00bed308	add x2,x9,#0xa
00bed30c	add x3,sp,#0x80
00bed310	mov x0,x24
00bed314	blr x8
00bed318	ldp x25,x23,[x29, #-0x88]
00bed31c	sub x8,x25,x23
00bed320	cmp x8,#0x63
00bed324	b.lt 0x00bed340
00bed328	add x0,x8,#0x2
00bed32c	bl 0x00c308d0
00bed330	mov x22,x0
00bed334	mov x24,x0
00bed338	cbnz x0,0x00bed348
00bed33c	bl 0x00c43cc0
00bed340	mov x22,xzr
00bed344	add x24,sp,#0x18
00bed348	ldurb w8,[x29, #-0x94]
00bed34c	cmp w8,#0x1
00bed350	b.ne 0x00bed35c
00bed354	mov w8,#0x2d
00bed358	strb w8,[x24], #0x1
00bed35c	cmp x23,x25
00bed360	b.cs 0x00bed3a0
00bed364	add x25,sp,#0x80
00bed368	add x27,sp,#0x90
00bed36c	add x26,x25,#0xa
00bed370	ldrb w1,[x23], #0x1
00bed374	add x0,sp,#0x80
00bed378	mov w2,#0xa
00bed37c	bl 0x00c300a0
00bed380	cmp x0,#0x0
00bed384	ldur x8,[x29, #-0x88]
00bed388	csel x9,x26,x0,eq
00bed38c	sub x9,x9,x25
00bed390	cmp x23,x8
00bed394	ldrb w9,[x27, x9]
00bed398	strb w9,[x24], #0x1
00bed39c	b.cc 0x00bed370
00bed3a0	adrp x1,0x2ba000
00bed3a4	add x1,x1,#0xc50
00bed3a8	add x0,sp,#0x18
00bed3ac	mov x2,x21
00bed3b0	strb wzr,[x24]
00bed3b4	bl 0x00c30c30
00bed3b8	cmp w0,#0x1
00bed3bc	b.ne 0x00bed4b0
00bed3c0	cbz x22,0x00bed3cc
00bed3c4	mov x0,x22
00bed3c8	bl 0x00c30960
00bed3cc	ldur x0,[x29, #-0x8]
00bed3d0	cbz x0,0x00bed41c
00bed3d4	ldp x8,x9,[x0, #0x18]
00bed3d8	cmp x8,x9
00bed3dc	b.eq 0x00bed3ec
00bed3e0	mov w21,wzr
00bed3e4	cbnz x20,0x00bed424
00bed3e8	b 0x00bed410
00bed3ec	ldr x8,[x0]
00bed3f0	ldr x8,[x8, #0x48]
00bed3f4	blr x8
00bed3f8	cmn w0,#0x1
00bed3fc	b.eq 0x00bed418
00bed400	ldur x8,[x29, #-0x8]
00bed404	cmp x8,#0x0
00bed408	cset w21,eq
00bed40c	cbnz x20,0x00bed424
00bed410	tbnz w21,#0x0,0x00bed434
00bed414	b 0x00bed440
00bed418	stur xzr,[x29, #-0x8]
00bed41c	mov w21,#0x1
00bed420	cbz x20,0x00bed410
00bed424	ldp x8,x9,[x20, #0x18]
00bed428	cmp x8,x9
00bed42c	b.eq 0x00bed488
00bed430	tbnz w21,#0x0,0x00bed440
00bed434	ldr w8,[x19]
00bed438	orr w8,w8,#0x2
00bed43c	str w8,[x19]
00bed440	ldur x19,[x29, #-0x8]
00bed444	sub x0,x29,#0x90
00bed448	bl 0x00c30090
00bed44c	ldur x0,[x29, #-0x80]
00bed450	stur xzr,[x29, #-0x80]
00bed454	cbz x0,0x00bed460
00bed458	ldur x8,[x29, #-0x78]
00bed45c	blr x8
00bed460	mov x0,x19
00bed464	ldp x20,x19,[sp, #0x180]
00bed468	ldp x22,x21,[sp, #0x170]
00bed46c	ldp x24,x23,[sp, #0x160]
00bed470	ldp x26,x25,[sp, #0x150]
00bed474	ldp x28,x27,[sp, #0x140]
00bed478	ldp x29,x30,[sp, #0x130]
00bed47c	add sp,sp,#0x190
00bed480	autiasp
00bed484	ret
00bed488	ldr x8,[x20]
00bed48c	ldr x8,[x8, #0x48]
00bed490	mov x0,x20
00bed494	blr x8
00bed498	cmn w0,#0x1
00bed49c	cset w8,eq
00bed4a0	eor w8,w21,w8
00bed4a4	tbz w8,#0x0,0x00bed434
00bed4a8	b 0x00bed440
00bed4ac	bl 0x00bd8968
00bed4b0	adrp x0,0x2dd000
00bed4b4	add x0,x0,#0x20d
00bed4b8	bl 0x00c43d00
00bed4bc	b 0x00bed4f0
00bed4f0	mov x19,x0
00bed4f4	sub x0,x29,#0x90
00bed4f8	bl 0x00c30090
00bed4fc	ldur x0,[x29, #-0x80]
00bed500	stur xzr,[x29, #-0x80]
00bed504	cbz x0,0x00bed510
00bed508	ldur x8,[x29, #-0x78]
00bed50c	blr x8
00bed510	mov x0,x19
00bed514	bl 0x00c2c090
