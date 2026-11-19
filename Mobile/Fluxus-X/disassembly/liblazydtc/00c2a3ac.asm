; __cxa_call_unexpected @ 00c2a3ac
00c2a3ac	paciasp
00c2a3b0	sub sp,sp,#0x70
00c2a3b4	stp x29,x30,[sp, #0x10]
00c2a3b8	stp x28,x27,[sp, #0x20]
00c2a3bc	stp x26,x25,[sp, #0x30]
00c2a3c0	stp x24,x23,[sp, #0x40]
00c2a3c4	stp x22,x21,[sp, #0x50]
00c2a3c8	stp x20,x19,[sp, #0x60]
00c2a3cc	add x29,sp,#0x10
00c2a3d0	cbnz x0,0x00c2a3dc
00c2a3d4	bl 0x00c2ffe0
00c2a3d8	bl 0x00c2fff0
00c2a3dc	mov x20,x0
00c2a3e0	bl 0x00c2ffe0
00c2a3e4	mov x0,x20
00c2a3e8	bl 0x00c29308
00c2a3ec	mov w23,w0
00c2a3f0	tbz w0,#0x0,0x00c2a408
00c2a3f4	ldp x0,x19,[x20, #-0x40]
00c2a3f8	sub x25,x20,#0x60
00c2a3fc	ldp x24,x21,[x20, #-0x18]
00c2a400	ldursw x22,[x20, #-0x24]
00c2a404	b 0x00c2a41c
00c2a408	bl 0x00c44750
00c2a40c	mov x19,x0
00c2a410	bl 0x00c44740
00c2a414	mov x21,xzr
00c2a418	mov x25,xzr
00c2a41c	bl 0x00c0d728
00c2a420	bl 0x00c2ffe0
00c2a424	tbz w23,#0x0,0x00c2a538
00c2a428	ldrb w1,[x24], #0x1
00c2a42c	add x0,sp,#0x8
00c2a430	mov x2,x21
00c2a434	str x24,[sp, #0x8]
00c2a438	bl 0x00c2a5f8
00c2a43c	ldr x9,[sp, #0x8]
00c2a440	ldrb w23,[x9]
00c2a444	cmp w23,#0xff
00c2a448	b.ne 0x00c2a454
00c2a44c	mov x0,x19
00c2a450	bl 0x00c0d774
00c2a454	mov x8,xzr
00c2a458	mov x26,xzr
00c2a45c	add x27,x9,#0x1
00c2a460	ldrb w9,[x27], #0x1
00c2a464	and x10,x9,#0x7f
00c2a468	lsl x10,x10,x8
00c2a46c	add x8,x8,#0x7
00c2a470	orr x26,x10,x26
00c2a474	tbnz w9,#0x7,0x00c2a460
00c2a478	str x27,[sp, #0x8]
00c2a47c	bl 0x00c44730
00c2a480	ldr x28,[x0]
00c2a484	mov x24,x0
00c2a488	cbz x28,0x00c2a44c
00c2a48c	add x0,x28,#0x60
00c2a490	bl 0x00c29308
00c2a494	cmp x28,x25
00c2a498	cset w8,ne
00c2a49c	and w8,w0,w8
00c2a4a0	cmp w8,#0x1
00c2a4a4	b.ne 0x00c2a4f8
00c2a4a8	ldr x25,[x28, #0x10]
00c2a4ac	add x0,x28,#0x60
00c2a4b0	bl 0x00c292fc
00c2a4b4	mov x8,#0x2b01
00c2a4b8	movk x8,#0x432b, LSL #16
00c2a4bc	movk x8,#0x4e47, LSL #32
00c2a4c0	movk x8,#0x434c, LSL #48
00c2a4c4	cmp x0,x8
00c2a4c8	b.ne 0x00c2a4d4
00c2a4cc	ldr x4,[x28, #0x8]
00c2a4d0	b 0x00c2a4d8
00c2a4d4	add x4,x28,#0x80
00c2a4d8	add x1,x27,x26
00c2a4dc	mov x0,x22
00c2a4e0	mov w2,w23
00c2a4e4	mov x3,x25
00c2a4e8	mov x5,x20
00c2a4ec	mov x6,x21
00c2a4f0	bl 0x00c2a7a0
00c2a4f4	tbz w0,#0x0,0x00c2a570
00c2a4f8	adrp x24,0xcb5000
00c2a4fc	ldr x24,[x24, #0xe98]
00c2a500	add x8,x24,#0x10
00c2a504	str x8,[sp]
00c2a508	adrp x3,0xcb5000
00c2a50c	add x1,x27,x26
00c2a510	mov x4,sp
00c2a514	ldr x3,[x3, #0xea0]
00c2a518	mov x0,x22
00c2a51c	mov w2,w23
00c2a520	mov x5,x20
00c2a524	mov x6,x21
00c2a528	bl 0x00c2a7a0
00c2a52c	tbz w0,#0x0,0x00c2a544
00c2a530	mov x0,sp
00c2a534	bl 0x00c447a0
00c2a538	bl 0x00c30160
00c2a53c	mov x0,x19
00c2a540	bl 0x00c0d774
00c2a544	bl 0x00c30160
00c2a548	mov w0,#0x8
00c2a54c	bl 0x00c30000
00c2a550	add x8,x24,#0x10
00c2a554	str x8,[x0]
00c2a558	adrp x1,0xcb5000
00c2a55c	adrp x2,0xcb5000
00c2a560	ldr x1,[x1, #0xea0]
00c2a564	ldr x2,[x2, #0xe80]
00c2a568	bl 0x00c30020
00c2a570	ldr w8,[x28, #0x38]
00c2a574	ldr w9,[x24, #0x8]
00c2a578	neg w8,w8
00c2a57c	add w9,w9,#0x1
00c2a580	str w8,[x28, #0x38]
00c2a584	str w9,[x24, #0x8]
00c2a588	bl 0x00c30160
00c2a58c	bl 0x00c30160
00c2a590	add x0,x28,#0x60
00c2a594	bl 0x00c2ffe0
00c2a598	bl 0x00c30170
00c2a59c	mov x19,x0
00c2a5a0	mov x0,sp
00c2a5a4	bl 0x00c447a0
00c2a5a8	b 0x00c2a5b8
00c2a5b8	bl 0x00c30160
00c2a5bc	mov x0,x19
00c2a5c0	bl 0x00c2c090
