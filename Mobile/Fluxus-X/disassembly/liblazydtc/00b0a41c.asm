; X509_STORE_new @ 00b0a41c
00b0a41c	str x19,[sp, #-0x20]!
00b0a420	adrp x1,0x2aa000
00b0a424	add x1,x1,#0xba3
00b0a428	mov w0,#0xa0
00b0a42c	mov w2,#0xb6
00b0a430	stp x29,x30,[sp, #0x10]
00b0a434	add x29,sp,#0x10
00b0a438	bl 0x00c34250
00b0a43c	mov x19,x0
00b0a440	cbz x0,0x00b0a4a8
00b0a444	adrp x0,0xb0a000
00b0a448	add x0,x0,#0x5bc
00b0a44c	bl 0x00c35340
00b0a450	str x0,[x19, #0x8]
00b0a454	cbz x0,0x00b0a4dc
00b0a458	mov w8,#0x1
00b0a45c	str w8,[x19]
00b0a460	bl 0x00c34780
00b0a464	str x0,[x19, #0x10]
00b0a468	cbz x0,0x00b0a4f8
00b0a46c	bl 0x00c35be0
00b0a470	str x0,[x19, #0x18]
00b0a474	cbz x0,0x00b0a514
00b0a478	add x2,x19,#0x80
00b0a47c	mov w0,#0x4
00b0a480	mov x1,x19
00b0a484	bl 0x00c356e0
00b0a488	cbz w0,0x00b0a530
00b0a48c	bl 0x00c34d50
00b0a490	str x0,[x19, #0x98]
00b0a494	cbz x0,0x00b0a54c
00b0a498	add x8,x19,#0x90
00b0a49c	mov w9,#0x1
00b0a4a0	stlr w9,[x8]
00b0a4a4	b 0x00b0a5ac
00b0a4a8	bl 0x00c342a0
00b0a4ac	adrp x0,0x2aa000
00b0a4b0	adrp x2,0x2ca000
00b0a4b4	add x0,x0,#0xba3
00b0a4b8	add x2,x2,#0x570
00b0a4bc	mov w1,#0xb9
00b0a4c0	bl 0x00c342b0
00b0a4c4	mov w1,#0x100
00b0a4c8	mov w0,#0xb
00b0a4cc	movk w1,#0xc, LSL #16
00b0a4d0	mov x2,xzr
00b0a4d4	bl 0x00c342c0
00b0a4d8	b 0x00b0a5ac
00b0a4dc	bl 0x00c342a0
00b0a4e0	adrp x0,0x2aa000
00b0a4e4	adrp x2,0x2ca000
00b0a4e8	add x0,x0,#0xba3
00b0a4ec	add x2,x2,#0x570
00b0a4f0	mov w1,#0xbd
00b0a4f4	b 0x00b0a564
00b0a4f8	bl 0x00c342a0
00b0a4fc	adrp x0,0x2aa000
00b0a500	adrp x2,0x2ca000
00b0a504	add x0,x0,#0xba3
00b0a508	add x2,x2,#0x570
00b0a50c	mov w1,#0xc2
00b0a510	b 0x00b0a564
00b0a514	bl 0x00c342a0
00b0a518	adrp x0,0x2aa000
00b0a51c	adrp x2,0x2ca000
00b0a520	add x0,x0,#0xba3
00b0a524	add x2,x2,#0x570
00b0a528	mov w1,#0xc7
00b0a52c	b 0x00b0a564
00b0a530	bl 0x00c342a0
00b0a534	adrp x0,0x2aa000
00b0a538	adrp x2,0x2ca000
00b0a53c	add x0,x0,#0xba3
00b0a540	add x2,x2,#0x570
00b0a544	mov w1,#0xcb
00b0a548	b 0x00b0a564
00b0a54c	bl 0x00c342a0
00b0a550	adrp x0,0x2aa000
00b0a554	adrp x2,0x2ca000
00b0a558	add x0,x0,#0xba3
00b0a55c	add x2,x2,#0x570
00b0a560	mov w1,#0xd1
00b0a564	bl 0x00c342b0
00b0a568	mov w1,#0x100
00b0a56c	mov w0,#0xb
00b0a570	movk w1,#0xc, LSL #16
00b0a574	mov x2,xzr
00b0a578	bl 0x00c342c0
00b0a57c	ldr x0,[x19, #0x18]
00b0a580	bl 0x00c35b90
00b0a584	ldr x0,[x19, #0x8]
00b0a588	bl 0x00c34770
00b0a58c	ldr x0,[x19, #0x10]
00b0a590	bl 0x00c34770
00b0a594	adrp x1,0x2aa000
00b0a598	add x1,x1,#0xba3
00b0a59c	mov w2,#0xdb
00b0a5a0	mov x0,x19
00b0a5a4	bl 0x00c32310
00b0a5a8	mov x19,xzr
00b0a5ac	ldp x29,x30,[sp, #0x10]
00b0a5b0	mov x0,x19
00b0a5b4	ldr x19,[sp], #0x20
00b0a5b8	ret
