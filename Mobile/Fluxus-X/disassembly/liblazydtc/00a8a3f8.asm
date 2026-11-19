; FUN_00a8a3f8 @ 00a8a3f8
00a8a3f8	sub sp,sp,#0x80
00a8a3fc	stp x24,x23,[sp, #0x40]
00a8a400	stp x22,x21,[sp, #0x50]
00a8a404	stp x20,x19,[sp, #0x60]
00a8a408	mov x19,x3
00a8a40c	mov x23,x2
00a8a410	mov x20,x1
00a8a414	lsr x8,x3,#0x1e
00a8a418	mov x21,x0
00a8a41c	stp x28,x27,[sp, #0x20]
00a8a420	stp x26,x25,[sp, #0x30]
00a8a424	stp x29,x30,[sp, #0x70]
00a8a428	add x29,sp,#0x70
00a8a42c	cbz x8,0x00a8a4e4
00a8a430	orr x28,xzr,#-0x40000000
00a8a434	add x8,x19,x28
00a8a438	mov w22,#0x40000000
00a8a43c	str x8,[sp, #0x8]
00a8a440	and x8,x8,#-0x40000000
00a8a444	str x8,[sp]
00a8a448	add x8,x8,x22
00a8a44c	str x8,[sp, #0x10]
00a8a450	add x8,x23,x8
00a8a454	str x8,[sp, #0x18]
00a8a458	adrp x25,0xcb5000
00a8a45c	ldr x25,[x25, #0x318]
00a8a460	add x24,x21,#0x28
00a8a464	mov x26,x20
00a8a468	mov x0,x21
00a8a46c	bl 0x00c3cea0
00a8a470	mov x27,x0
00a8a474	mov x0,x21
00a8a478	bl 0x00c3cec0
00a8a47c	mov w2,#0x40000000
00a8a480	cbz w0,0x00a8a4a0
00a8a484	mov x0,x23
00a8a488	mov x1,x26
00a8a48c	mov x3,x27
00a8a490	mov x4,x24
00a8a494	mov x5,x25
00a8a498	bl 0x00c3e250
00a8a49c	b 0x00a8a4b8
00a8a4a0	mov x0,x23
00a8a4a4	mov x1,x26
00a8a4a8	mov x3,x27
00a8a4ac	mov x4,x24
00a8a4b0	mov x5,x25
00a8a4b4	bl 0x00c3e240
00a8a4b8	add x19,x19,x28
00a8a4bc	add x23,x23,x22
00a8a4c0	lsr x8,x19,#0x1e
00a8a4c4	add x26,x26,x22
00a8a4c8	cbnz x8,0x00a8a468
00a8a4cc	ldp x9,x8,[sp]
00a8a4d0	sub x19,x8,x9
00a8a4d4	ldp x8,x22,[sp, #0x10]
00a8a4d8	add x20,x20,x8
00a8a4dc	cbnz x19,0x00a8a4ec
00a8a4e0	b 0x00a8a544
00a8a4e4	mov x22,x23
00a8a4e8	cbz x19,0x00a8a544
00a8a4ec	mov x0,x21
00a8a4f0	bl 0x00c3cea0
00a8a4f4	mov x23,x0
00a8a4f8	mov x0,x21
00a8a4fc	add x24,x21,#0x28
00a8a500	bl 0x00c3cec0
00a8a504	adrp x5,0xcb5000
00a8a508	ldr x5,[x5, #0x318]
00a8a50c	cbz w0,0x00a8a52c
00a8a510	mov x0,x22
00a8a514	mov x1,x20
00a8a518	mov x2,x19
00a8a51c	mov x3,x23
00a8a520	mov x4,x24
00a8a524	bl 0x00c3e250
00a8a528	b 0x00a8a544
00a8a52c	mov x0,x22
00a8a530	mov x1,x20
00a8a534	mov x2,x19
00a8a538	mov x3,x23
00a8a53c	mov x4,x24
00a8a540	bl 0x00c3e240
00a8a544	ldp x29,x30,[sp, #0x70]
00a8a548	ldp x20,x19,[sp, #0x60]
00a8a54c	ldp x22,x21,[sp, #0x50]
00a8a550	ldp x24,x23,[sp, #0x40]
00a8a554	ldp x26,x25,[sp, #0x30]
00a8a558	ldp x28,x27,[sp, #0x20]
00a8a55c	mov w0,#0x1
00a8a560	add sp,sp,#0x80
00a8a564	ret
