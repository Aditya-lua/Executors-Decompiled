; ix::HttpResponse::HttpResponse @ 0097a294
0097a294	sub sp,sp,#0xa0
0097a298	stp x28,x27,[sp, #0x40]
0097a29c	stp x26,x25,[sp, #0x50]
0097a2a0	stp x24,x23,[sp, #0x60]
0097a2a4	stp x22,x21,[sp, #0x70]
0097a2a8	stp x20,x19,[sp, #0x80]
0097a2ac	stp x29,x30,[sp, #0x90]
0097a2b0	add x29,sp,#0x90
0097a2b4	mrs x8,tpidr_el0
0097a2b8	stp x8,x7,[sp]
0097a2bc	ldr x8,[x8, #0x28]
0097a2c0	mov x20,x0
0097a2c4	mov x22,x6
0097a2c8	mov x25,x5
0097a2cc	str x8,[sp, #0x38]
0097a2d0	str w1,[x0]
0097a2d4	str xzr,[x20, #0x8]!
0097a2d8	stp xzr,xzr,[x0, #0x10]
0097a2dc	ldrb w8,[x2]
0097a2e0	mov x26,x4
0097a2e4	mov x19,x0
0097a2e8	mov x23,x3
0097a2ec	tbnz w8,#0x0,0x0097a304
0097a2f0	ldr x8,[x2, #0x10]
0097a2f4	str x8,[x20, #0x10]
0097a2f8	ldr q0,[x2]
0097a2fc	str q0,[x20]
0097a300	b 0x0097a364
0097a304	ldr x24,[x2, #0x8]
0097a308	cmn x24,#0x10
0097a30c	b.cs 0x0097a5b0
0097a310	ldr x27,[x2, #0x10]
0097a314	cmp x24,#0x17
0097a318	b.cs 0x0097a330
0097a31c	lsl w8,w24,#0x1
0097a320	mov x28,x20
0097a324	strb w8,[x28], #0x1
0097a328	cbnz x24,0x0097a350
0097a32c	b 0x0097a360
0097a330	add x8,x24,#0x10
0097a334	and x21,x8,#-0x10
0097a338	mov x0,x21
0097a33c	bl 0x00c2fed0
0097a340	orr x8,x21,#0x1
0097a344	mov x28,x0
0097a348	stp x24,x0,[x19, #0x10]
0097a34c	str x8,[x19, #0x8]
0097a350	mov x0,x28
0097a354	mov x1,x27
0097a358	mov x2,x24
0097a35c	bl 0x00c2ffd0
0097a360	strb wzr,[x28, x24]
0097a364	ldr w8,[x23]
0097a368	mov x23,x19
0097a36c	str xzr,[x23, #0x30]!
0097a370	str xzr,[x23, #0x8]
0097a374	stur w8,[x23, #-0x10]
0097a378	stur x23,[x23, #-0x8]
0097a37c	ldr x21,[x26], #0x8
0097a380	sub x24,x23,#0x8
0097a384	cmp x21,x26
0097a388	b.eq 0x0097a464
0097a38c	add x28,x21,#0x20
0097a390	add x2,sp,#0x18
0097a394	add x3,sp,#0x10
0097a398	mov x0,x24
0097a39c	mov x1,x23
0097a3a0	mov x4,x28
0097a3a4	bl 0x00c32f90
0097a3a8	ldr x8,[x0]
0097a3ac	mov x27,x0
0097a3b0	cbz x8,0x0097a3c0
0097a3b4	ldr x8,[x21, #0x8]
0097a3b8	cbnz x8,0x0097a410
0097a3bc	b 0x0097a420
0097a3c0	add x8,sp,#0x20
0097a3c4	mov x0,x24
0097a3c8	mov x1,x28
0097a3cc	bl 0x00c32fa0
0097a3d0	ldp x8,x1,[sp, #0x18]
0097a3d4	stp xzr,xzr,[x1]
0097a3d8	str x8,[x1, #0x10]
0097a3dc	str x1,[x27]
0097a3e0	ldr x8,[x24]
0097a3e4	ldr x8,[x8]
0097a3e8	cbz x8,0x0097a3f4
0097a3ec	str x8,[x24]
0097a3f0	ldr x1,[x27]
0097a3f4	ldr x0,[x19, #0x30]
0097a3f8	bl 0x00c30c90
0097a3fc	ldr x8,[x19, #0x38]
0097a400	add x8,x8,#0x1
0097a404	str x8,[x19, #0x38]
0097a408	ldr x8,[x21, #0x8]
0097a40c	cbz x8,0x0097a420
0097a410	mov x21,x8
0097a414	ldr x8,[x8]
0097a418	cbnz x8,0x0097a410
0097a41c	b 0x0097a44c
0097a420	mov x8,x21
0097a424	ldr x9,[x8, #0x10]!
0097a428	ldr x10,[x9]
0097a42c	cmp x10,x21
0097a430	b.eq 0x0097a458
0097a434	ldr x9,[x8]
0097a438	mov x8,x9
0097a43c	ldr x21,[x8, #0x10]!
0097a440	ldr x10,[x21]
0097a444	cmp x10,x9
0097a448	b.ne 0x0097a434
0097a44c	cmp x21,x26
0097a450	b.ne 0x0097a38c
0097a454	b 0x0097a464
0097a458	mov x21,x9
0097a45c	cmp x21,x26
0097a460	b.ne 0x0097a38c
0097a464	mov x26,x19
0097a468	str xzr,[x26, #0x40]!
0097a46c	stp xzr,xzr,[x26, #0x8]
0097a470	ldrb w8,[x25]
0097a474	tbnz w8,#0x0,0x0097a48c
0097a478	ldr x8,[x25, #0x10]
0097a47c	str x8,[x26, #0x10]
0097a480	ldr q0,[x25]
0097a484	str q0,[x26]
0097a488	b 0x0097a4ec
0097a48c	ldr x27,[x25, #0x8]
0097a490	cmn x27,#0x10
0097a494	b.cs 0x0097a5b8
0097a498	ldr x25,[x25, #0x10]
0097a49c	cmp x27,#0x17
0097a4a0	b.cs 0x0097a4b8
0097a4a4	lsl w8,w27,#0x1
0097a4a8	mov x28,x26
0097a4ac	strb w8,[x28], #0x1
0097a4b0	cbnz x27,0x0097a4d8
0097a4b4	b 0x0097a4e8
0097a4b8	add x8,x27,#0x10
0097a4bc	and x21,x8,#-0x10
0097a4c0	mov x0,x21
0097a4c4	bl 0x00c2fed0
0097a4c8	orr x8,x21,#0x1
0097a4cc	mov x28,x0
0097a4d0	stp x27,x0,[x19, #0x48]
0097a4d4	str x8,[x19, #0x40]
0097a4d8	mov x0,x28
0097a4dc	mov x1,x25
0097a4e0	mov x2,x27
0097a4e4	bl 0x00c2ffd0
0097a4e8	strb wzr,[x28, x27]
0097a4ec	mov x25,x19
0097a4f0	str xzr,[x25, #0x58]!
0097a4f4	stp xzr,xzr,[x25, #0x8]
0097a4f8	ldrb w8,[x22]
0097a4fc	tbnz w8,#0x0,0x0097a514
0097a500	ldr x8,[x22, #0x10]
0097a504	str x8,[x25, #0x10]
0097a508	ldr q0,[x22]
0097a50c	str q0,[x25]
0097a510	b 0x0097a570
0097a514	ldr x27,[x22, #0x8]
0097a518	cmn x27,#0x10
0097a51c	b.cs 0x0097a5c0
0097a520	ldr x22,[x22, #0x10]
0097a524	cmp x27,#0x17
0097a528	b.cs 0x0097a53c
0097a52c	lsl w8,w27,#0x1
0097a530	strb w8,[x25], #0x1
0097a534	cbnz x27,0x0097a55c
0097a538	b 0x0097a56c
0097a53c	add x8,x27,#0x10
0097a540	and x21,x8,#-0x10
0097a544	mov x0,x21
0097a548	bl 0x00c2fed0
0097a54c	orr x8,x21,#0x1
0097a550	mov x25,x0
0097a554	stp x27,x0,[x19, #0x60]
0097a558	str x8,[x19, #0x58]
0097a55c	mov x0,x25
0097a560	mov x1,x22
0097a564	mov x2,x27
0097a568	bl 0x00c2ffd0
0097a56c	strb wzr,[x25, x27]
0097a570	ldp x10,x9,[sp]
0097a574	ldr x8,[x29, #0x10]
0097a578	stp x9,x8,[x19, #0x70]
0097a57c	ldr x8,[x10, #0x28]
0097a580	ldr x9,[sp, #0x38]
0097a584	cmp x8,x9
0097a588	b.ne 0x0097a5ac
0097a58c	ldp x29,x30,[sp, #0x90]
0097a590	ldp x20,x19,[sp, #0x80]
0097a594	ldp x22,x21,[sp, #0x70]
0097a598	ldp x24,x23,[sp, #0x60]
0097a59c	ldp x26,x25,[sp, #0x50]
0097a5a0	ldp x28,x27,[sp, #0x40]
0097a5a4	add sp,sp,#0xa0
0097a5a8	ret
0097a5ac	bl 0x00c2fec0
0097a5b0	mov x0,x20
0097a5b4	bl 0x00c30ce0
0097a5b8	mov x0,x26
0097a5bc	bl 0x00c30ce0
0097a5c0	mov x0,x25
0097a5c4	bl 0x00c30ce0
