; FUN_00b5a294 @ 00b5a294
00b5a294	sub sp,sp,#0x60
00b5a298	stp x26,x25,[sp, #0x10]
00b5a29c	stp x24,x23,[sp, #0x20]
00b5a2a0	stp x22,x21,[sp, #0x30]
00b5a2a4	stp x20,x19,[sp, #0x40]
00b5a2a8	stp x29,x30,[sp, #0x50]
00b5a2ac	ldr w8,[x0, #0xc0]
00b5a2b0	ldr x25,[x0, #0xf8]
00b5a2b4	add x29,sp,#0x50
00b5a2b8	lsr w9,w8,#0x18
00b5a2bc	lsr w10,w8,#0x10
00b5a2c0	lsr w11,w8,#0x8
00b5a2c4	strb w9,[sp, #0xc]
00b5a2c8	strb w10,[sp, #0xd]
00b5a2cc	strb w11,[sp, #0xe]
00b5a2d0	strb w8,[sp, #0xf]
00b5a2d4	ldr x8,[x25, #0x18]
00b5a2d8	cbz x8,0x00b5a400
00b5a2dc	mov x20,x2
00b5a2e0	mov x19,x0
00b5a2e4	mov x21,x1
00b5a2e8	mov x22,x25
00b5a2ec	cbz x3,0x00b5a310
00b5a2f0	cbz x4,0x00b5a310
00b5a2f4	mov w1,#0x2
00b5a2f8	mov x0,x19
00b5a2fc	mov x2,x3
00b5a300	mov x3,x4
00b5a304	bl 0x00b5a720
00b5a308	cbz w0,0x00b5a548
00b5a30c	ldr x22,[x19, #0xf8]
00b5a310	cbz x20,0x00b5a428
00b5a314	ldr x2,[x19, #0xe8]
00b5a318	add x23,x22,#0x106
00b5a31c	add x1,x22,#0x28
00b5a320	mov x0,x23
00b5a324	bl 0x00c2ffd0
00b5a328	ldr x24,[x22, #0x18]
00b5a32c	mov x0,x22
00b5a330	bl 0x00c41160
00b5a334	mov x1,x0
00b5a338	mov x0,x24
00b5a33c	mov x2,xzr
00b5a340	bl 0x00c31f70
00b5a344	cbz w0,0x00b5a548
00b5a348	mov w26,#0x1
00b5a34c	ldr x0,[x22, #0x18]
00b5a350	ldr x2,[x19, #0xe8]
00b5a354	mov x1,x23
00b5a358	bl 0x00c31f80
00b5a35c	cbz w0,0x00b5a548
00b5a360	ldp x0,x8,[x22, #0x18]
00b5a364	cmp x20,x8
00b5a368	b.cc 0x00b5a408
00b5a36c	mov x1,x21
00b5a370	mov x2,xzr
00b5a374	bl 0x00c3c150
00b5a378	cbz w0,0x00b5a548
00b5a37c	ldr x9,[x22, #0x20]
00b5a380	subs x20,x20,x9
00b5a384	b.eq 0x00b5a428
00b5a388	ldr x8,[x19, #0xe8]
00b5a38c	add x21,x21,x9
00b5a390	add x10,x22,x8
00b5a394	ldrb w11,[x10, #0x105]
00b5a398	add w11,w11,#0x1
00b5a39c	strb w11,[x10, #0x105]
00b5a3a0	tbz w11,#0x8,0x00b5a3dc
00b5a3a4	ldr x9,[x19, #0xe8]
00b5a3a8	cmp x9,#0x1
00b5a3ac	b.eq 0x00b5a3dc
00b5a3b0	add x8,x22,x8
00b5a3b4	add x8,x8,#0x104
00b5a3b8	sub x9,x26,x9
00b5a3bc	ldrb w10,[x8]
00b5a3c0	add w10,w10,#0x1
00b5a3c4	tst w10,#0xff
00b5a3c8	strb w10,[x8]
00b5a3cc	b.ne 0x00b5a3dc
00b5a3d0	adds x9,x9,#0x1
00b5a3d4	sub x8,x8,#0x1
00b5a3d8	b.ne 0x00b5a3bc
00b5a3dc	ldr x24,[x22, #0x18]
00b5a3e0	mov x0,x22
00b5a3e4	bl 0x00c41160
00b5a3e8	mov x1,x0
00b5a3ec	mov x0,x24
00b5a3f0	mov x2,xzr
00b5a3f4	bl 0x00c31f70
00b5a3f8	cbnz w0,0x00b5a34c
00b5a3fc	b 0x00b5a548
00b5a400	mov w0,wzr
00b5a404	b 0x00b5a548
00b5a408	mov x1,x23
00b5a40c	mov x2,xzr
00b5a410	bl 0x00c3c150
00b5a414	cbz w0,0x00b5a548
00b5a418	mov x0,x21
00b5a41c	mov x1,x23
00b5a420	mov x2,x20
00b5a424	bl 0x00c2ffd0
00b5a428	orr w1,wzr,#0x3
00b5a42c	mov x0,x19
00b5a430	mov x2,xzr
00b5a434	mov x3,xzr
00b5a438	bl 0x00b5a720
00b5a43c	cbz w0,0x00b5a548
00b5a440	ldr x8,[x19, #0xe8]
00b5a444	cbz x8,0x00b5a4ac
00b5a448	mov w9,wzr
00b5a44c	mov x10,x8
00b5a450	add x11,x25,x10
00b5a454	ldrb w12,[x11, #0x27]
00b5a458	ldrb w13,[x11, #0x96]
00b5a45c	subs x10,x10,#0x1
00b5a460	add w9,w9,w12
00b5a464	add w12,w9,w13
00b5a468	asr w9,w12,#0x8
00b5a46c	strb w12,[x11, #0x27]
00b5a470	b.ne 0x00b5a450
00b5a474	cbz w9,0x00b5a4ac
00b5a478	ldr x10,[x19, #0xe8]
00b5a47c	cmp x10,x8
00b5a480	b.eq 0x00b5a4ac
00b5a484	add x9,x25,#0x27
00b5a488	sub x8,x8,x10
00b5a48c	ldrb w10,[x9]
00b5a490	add w10,w10,#0x1
00b5a494	tst w10,#0xff
00b5a498	strb w10,[x9]
00b5a49c	b.ne 0x00b5a4ac
00b5a4a0	adds x8,x8,#0x1
00b5a4a4	sub x9,x9,#0x1
00b5a4a8	b.ne 0x00b5a48c
00b5a4ac	ldr x8,[x19, #0xe8]
00b5a4b0	ldrb w9,[sp, #0xf]
00b5a4b4	add x10,x25,x8
00b5a4b8	ldrb w11,[x10, #0x27]
00b5a4bc	ldrb w12,[x10, #0x26]
00b5a4c0	add w9,w11,w9
00b5a4c4	strb w9,[x10, #0x27]
00b5a4c8	ldrb w11,[sp, #0xe]
00b5a4cc	add w9,w12,w9, LSR #0x8
00b5a4d0	ldrb w12,[x10, #0x25]
00b5a4d4	add w9,w9,w11
00b5a4d8	strb w9,[x10, #0x26]
00b5a4dc	ldrb w11,[sp, #0xd]
00b5a4e0	add w9,w12,w9, LSR #0x8
00b5a4e4	add w9,w9,w11
00b5a4e8	strb w9,[x10, #0x25]
00b5a4ec	ldrb w11,[x10, #0x24]
00b5a4f0	ldrb w12,[sp, #0xc]
00b5a4f4	add w9,w11,w9, LSR #0x8
00b5a4f8	add w9,w9,w12
00b5a4fc	tst w9,#0xfff00
00b5a500	strb w9,[x10, #0x24]
00b5a504	b.eq 0x00b5a544
00b5a508	ldr x9,[x19, #0xe8]
00b5a50c	cmp x9,#0x4
00b5a510	b.eq 0x00b5a544
00b5a514	add x8,x25,x8
00b5a518	mov w10,#0x4
00b5a51c	add x8,x8,#0x23
00b5a520	sub x9,x10,x9
00b5a524	ldrb w10,[x8]
00b5a528	add w10,w10,#0x1
00b5a52c	tst w10,#0xff
00b5a530	strb w10,[x8]
00b5a534	b.ne 0x00b5a544
00b5a538	adds x9,x9,#0x1
00b5a53c	sub x8,x8,#0x1
00b5a540	b.ne 0x00b5a524
00b5a544	mov w0,#0x1
00b5a548	ldp x29,x30,[sp, #0x50]
00b5a54c	ldp x20,x19,[sp, #0x40]
00b5a550	ldp x22,x21,[sp, #0x30]
00b5a554	ldp x24,x23,[sp, #0x20]
00b5a558	ldp x26,x25,[sp, #0x10]
00b5a55c	add sp,sp,#0x60
00b5a560	ret
