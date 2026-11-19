; FUN_0087a3fc @ 0087a3fc
0087a3fc	sub sp,sp,#0x80
0087a400	stp x29,x30,[sp, #0x30]
0087a404	str x25,[sp, #0x40]
0087a408	stp x24,x23,[sp, #0x50]
0087a40c	stp x22,x21,[sp, #0x60]
0087a410	stp x20,x19,[sp, #0x70]
0087a414	add x29,sp,#0x30
0087a418	mrs x24,tpidr_el0
0087a41c	ldr x8,[x24, #0x28]
0087a420	stur x8,[x29, #-0x8]
0087a424	ldp x9,x8,[x0]
0087a428	sub x22,x8,x9
0087a42c	asr x8,x22,#0x5
0087a430	add x8,x8,#0x1
0087a434	lsr x10,x8,#0x3b
0087a438	cbnz x10,0x0087a584
0087a43c	mov x10,x0
0087a440	orr x12,xzr,#0x7fffffffffffffe0
0087a444	mov x20,x2
0087a448	ldr x11,[x10, #0x10]!
0087a44c	mov x19,x0
0087a450	mov x21,x1
0087a454	str x10,[sp, #0x20]
0087a458	sub x9,x11,x9
0087a45c	asr x11,x9,#0x4
0087a460	cmp x11,x8
0087a464	csel x8,x11,x8,hi
0087a468	cmp x9,x12
0087a46c	mov x9,#0x7ffffffffffffff
0087a470	csel x23,x8,x9,cc
0087a474	cbz x23,0x0087a48c
0087a478	lsr x8,x23,#0x3b
0087a47c	cbnz x8,0x0087a5ac
0087a480	lsl x0,x23,#0x5
0087a484	bl 0x00c2fed0
0087a488	b 0x0087a490
0087a48c	mov x0,xzr
0087a490	ldr w9,[x21]
0087a494	ldr x21,[x20]
0087a498	add x25,x0,x22
0087a49c	add x8,x0,x23, LSL #0x5
0087a4a0	stp x0,x25,[sp]
0087a4a4	mov x0,x21
0087a4a8	str w9,[x25]
0087a4ac	stp x25,x8,[sp, #0x10]
0087a4b0	bl 0x00c2ff50
0087a4b4	cmn x0,#0x8
0087a4b8	b.cs 0x0087a598
0087a4bc	mov x20,x0
0087a4c0	cmp x0,#0x17
0087a4c4	b.cs 0x0087a4dc
0087a4c8	lsl w8,w20,#0x1
0087a4cc	add x22,x25,#0x9
0087a4d0	strb w8,[x25, #0x8]
0087a4d4	cbnz x20,0x0087a504
0087a4d8	b 0x0087a514
0087a4dc	orr x8,x20,#0x7
0087a4e0	mov w9,#0x1a
0087a4e4	cmp x8,#0x17
0087a4e8	csinc x23,x9,x8,eq
0087a4ec	mov x0,x23
0087a4f0	bl 0x00c2fed0
0087a4f4	orr x8,x23,#0x1
0087a4f8	mov x22,x0
0087a4fc	stp x20,x0,[x25, #0x10]
0087a500	str x8,[x25, #0x8]
0087a504	mov x0,x22
0087a508	mov x1,x21
0087a50c	mov x2,x20
0087a510	bl 0x00c2ff60
0087a514	strb wzr,[x22, x20]
0087a518	ldp x1,x8,[x19]
0087a51c	ldp x10,x9,[sp, #0x8]
0087a520	sub x2,x8,x1
0087a524	sub x21,x10,x2
0087a528	add x20,x9,#0x20
0087a52c	mov x0,x21
0087a530	bl 0x00c2ffd0
0087a534	ldr x0,[x19]
0087a538	ldr x9,[sp, #0x18]
0087a53c	ldr x8,[x19, #0x10]
0087a540	stp x21,x20,[x19]
0087a544	str x9,[x19, #0x10]
0087a548	cbz x0,0x0087a554
0087a54c	sub x1,x8,x0
0087a550	bl 0x00c2fe80
0087a554	ldr x8,[x24, #0x28]
0087a558	ldur x9,[x29, #-0x8]
0087a55c	cmp x8,x9
0087a560	b.ne 0x0087a5e4
0087a564	mov x0,x20
0087a568	ldp x20,x19,[sp, #0x70]
0087a56c	ldr x25,[sp, #0x40]
0087a570	ldp x22,x21,[sp, #0x60]
0087a574	ldp x24,x23,[sp, #0x50]
0087a578	ldp x29,x30,[sp, #0x30]
0087a57c	add sp,sp,#0x80
0087a580	ret
0087a584	ldr x8,[x24, #0x28]
0087a588	ldur x9,[x29, #-0x8]
0087a58c	cmp x8,x9
0087a590	b.ne 0x0087a5e4
0087a594	bl 0x0087a660
0087a598	ldr x8,[x24, #0x28]
0087a59c	ldur x9,[x29, #-0x8]
0087a5a0	cmp x8,x9
0087a5a4	b.ne 0x0087a5e4
0087a5a8	bl 0x007fe124
0087a5ac	ldr x8,[x24, #0x28]
0087a5b0	ldur x9,[x29, #-0x8]
0087a5b4	cmp x8,x9
0087a5b8	b.ne 0x0087a5e4
0087a5bc	bl 0x007fe1b8
0087a5e4	bl 0x00c2fec0
