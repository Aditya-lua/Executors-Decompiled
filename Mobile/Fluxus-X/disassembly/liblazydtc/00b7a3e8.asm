; mbedtls_md5_self_test @ 00b7a3e8
00b7a3e8	sub sp,sp,#0xf0
00b7a3ec	stp x28,x27,[sp, #0x90]
00b7a3f0	stp x26,x25,[sp, #0xa0]
00b7a3f4	stp x24,x23,[sp, #0xb0]
00b7a3f8	stp x22,x21,[sp, #0xc0]
00b7a3fc	stp x20,x19,[sp, #0xd0]
00b7a400	stp x29,x30,[sp, #0xe0]
00b7a404	add x29,sp,#0xe0
00b7a408	mrs x9,tpidr_el0
00b7a40c	adrp x8,0x29c000
00b7a410	str x9,[sp, #0x8]
00b7a414	ldr x9,[x9, #0x28]
00b7a418	ldr q0,[x8, #0x2e0]
00b7a41c	add x27,sp,#0x30
00b7a420	adrp x25,0x2b6000
00b7a424	adrp x28,0x77f000
00b7a428	mov w19,w0
00b7a42c	mov x26,xzr
00b7a430	add x25,x25,#0xab0
00b7a434	mov w20,#0x80
00b7a438	add x28,x28,#0xf08
00b7a43c	add x21,x27,#0x18
00b7a440	str q0,[sp, #0x10]
00b7a444	stur x9,[x29, #-0x58]
00b7a448	cbz w19,0x00b7a458
00b7a44c	add w1,w26,#0x1
00b7a450	mov x0,x25
00b7a454	bl 0x00c41af0
00b7a458	add x0,sp,#0x30
00b7a45c	mov w2,#0x58
00b7a460	mov w1,wzr
00b7a464	bl 0x00c301c0
00b7a468	ldr q0,[sp, #0x10]
00b7a46c	stur q0,[sp, #0x38]
00b7a470	cbz x26,0x00b7a4f4
00b7a474	adrp x8,0x77f000
00b7a478	add x8,x8,#0xed0
00b7a47c	ldr x23,[x8, x26, LSL #0x3]
00b7a480	adrp x9,0x77f000
00b7a484	mov w8,#0x51
00b7a488	add x9,x9,#0xc98
00b7a48c	madd x24,x26,x8,x9
00b7a490	cmp x26,#0x6
00b7a494	str w23,[sp, #0x30]
00b7a498	b.ne 0x00b7a4e4
00b7a49c	mov x27,x25
00b7a4a0	sub x25,x23,#0x40
00b7a4a4	and x22,x25,#-0x40
00b7a4a8	add x0,sp,#0x30
00b7a4ac	mov x1,x24
00b7a4b0	bl 0x00c42bc0
00b7a4b4	sub x23,x23,#0x40
00b7a4b8	cmp x23,#0x3f
00b7a4bc	add x24,x24,#0x40
00b7a4c0	b.hi 0x00b7a4a8
00b7a4c4	subs x23,x25,x22
00b7a4c8	mov x25,x27
00b7a4cc	add x27,sp,#0x30
00b7a4d0	b.eq 0x00b7a4f4
00b7a4d4	adrp x8,0x77f000
00b7a4d8	add x8,x8,#0xc98
00b7a4dc	add x8,x8,x22
00b7a4e0	add x24,x8,#0x226
00b7a4e4	mov x0,x21
00b7a4e8	mov x1,x24
00b7a4ec	mov x2,x23
00b7a4f0	bl 0x00c2ffd0
00b7a4f4	ldr w23,[sp, #0x30]
00b7a4f8	add x9,x27,#0x18
00b7a4fc	and w8,w23,#0x3f
00b7a500	add w10,w8,#0x1
00b7a504	cmp w10,#0x38
00b7a508	add x0,x9,x10
00b7a50c	strb w20,[x9, w8, UXTW ]
00b7a510	b.hi 0x00b7a528
00b7a514	mov w9,#0x37
00b7a518	sub w2,w9,w8
00b7a51c	mov w1,wzr
00b7a520	bl 0x00c301c0
00b7a524	b 0x00b7a554
00b7a528	eor w2,w8,#0x3f
00b7a52c	mov w1,wzr
00b7a530	bl 0x00c301c0
00b7a534	add x0,sp,#0x30
00b7a538	mov x1,x21
00b7a53c	bl 0x00c42bc0
00b7a540	stp xzr,xzr,[x21, #0x28]
00b7a544	stp xzr,xzr,[x21, #0x18]
00b7a548	stp xzr,xzr,[x21, #0x8]
00b7a54c	str xzr,[x21]
00b7a550	ldr w23,[sp, #0x30]
00b7a554	ldr w8,[sp, #0x34]
00b7a558	lsl w9,w23,#0x3
00b7a55c	add x0,sp,#0x30
00b7a560	mov x1,x21
00b7a564	extr w8,w8,w23,#0x1d
00b7a568	stp w9,w8,[sp, #0x80]
00b7a56c	bl 0x00c42bc0
00b7a570	ldur q0,[sp, #0x38]
00b7a574	add x0,sp,#0x30
00b7a578	mov w1,#0x58
00b7a57c	str q0,[sp, #0x20]
00b7a580	bl 0x00c42220
00b7a584	add x0,sp,#0x30
00b7a588	mov w1,#0x58
00b7a58c	bl 0x00c42220
00b7a590	add x1,x28,x26, LSL #0x4
00b7a594	add x0,sp,#0x20
00b7a598	mov w2,#0x10
00b7a59c	bl 0x00c300b0
00b7a5a0	cbnz w0,0x00b7a5d4
00b7a5a4	cbz w19,0x00b7a5b4
00b7a5a8	adrp x0,0x77c000
00b7a5ac	add x0,x0,#0x87c
00b7a5b0	bl 0x00c30760
00b7a5b4	add x26,x26,#0x1
00b7a5b8	cmp x26,#0x7
00b7a5bc	b.cc 0x00b7a448
00b7a5c0	cbz w19,0x00b7a5cc
00b7a5c4	mov w0,#0xa
00b7a5c8	bl 0x00c42240
00b7a5cc	mov w0,wzr
00b7a5d0	b 0x00b7a5e8
00b7a5d4	cbz w19,0x00b7a5e4
00b7a5d8	adrp x0,0x77c000
00b7a5dc	add x0,x0,#0x854
00b7a5e0	bl 0x00c30760
00b7a5e4	mov w0,#0x1
00b7a5e8	ldr x8,[sp, #0x8]
00b7a5ec	ldr x8,[x8, #0x28]
00b7a5f0	ldur x9,[x29, #-0x58]
00b7a5f4	cmp x8,x9
00b7a5f8	b.ne 0x00b7a61c
00b7a5fc	ldp x29,x30,[sp, #0xe0]
00b7a600	ldp x20,x19,[sp, #0xd0]
00b7a604	ldp x22,x21,[sp, #0xc0]
00b7a608	ldp x24,x23,[sp, #0xb0]
00b7a60c	ldp x26,x25,[sp, #0xa0]
00b7a610	ldp x28,x27,[sp, #0x90]
00b7a614	add sp,sp,#0xf0
00b7a618	ret
00b7a61c	bl 0x00c2fec0
