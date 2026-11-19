; X509_STORE_CTX_purpose_inherit @ 00b0f3b4
00b0f3b4	stp x22,x21,[sp, #-0x30]!
00b0f3b8	cmp w1,#0x0
00b0f3bc	csel w8,w2,w1,eq
00b0f3c0	cmp w2,#0x0
00b0f3c4	stp x20,x19,[sp, #0x10]
00b0f3c8	mov w19,w3
00b0f3cc	mov x21,x0
00b0f3d0	csel w20,w1,w2,eq
00b0f3d4	csel w22,w1,w8,eq
00b0f3d8	stp x29,x30,[sp, #0x20]
00b0f3dc	add x29,sp,#0x20
00b0f3e0	cbz w20,0x00b0f440
00b0f3e4	mov w0,w20
00b0f3e8	bl 0x00c40a10
00b0f3ec	cmn w0,#0x1
00b0f3f0	b.eq 0x00b0f408
00b0f3f4	bl 0x00c40a00
00b0f3f8	ldr w8,[x0, #0x4]
00b0f3fc	cbz w8,0x00b0f424
00b0f400	cbnz w19,0x00b0f444
00b0f404	b 0x00b0f43c
00b0f408	bl 0x00c342a0
00b0f40c	adrp x0,0x2a0000
00b0f410	adrp x2,0x2b2000
00b0f414	add x0,x0,#0xe02
00b0f418	add x2,x2,#0xdd5
00b0f41c	mov w1,#0x8cb
00b0f420	b 0x00b0f4e0
00b0f424	mov w0,w22
00b0f428	bl 0x00c40a10
00b0f42c	cmn w0,#0x1
00b0f430	b.eq 0x00b0f4c8
00b0f434	bl 0x00c40a00
00b0f438	cbnz w19,0x00b0f444
00b0f43c	ldr w19,[x0, #0x4]
00b0f440	cbz w19,0x00b0f4b8
00b0f444	mov w0,w19
00b0f448	bl 0x00c40cf0
00b0f44c	cmn w0,#0x1
00b0f450	b.eq 0x00b0f490
00b0f454	mov w8,#0x1
00b0f458	ldr x9,[x21, #0x20]
00b0f45c	cbz w20,0x00b0f46c
00b0f460	ldr w10,[x9, #0x20]
00b0f464	cbnz w10,0x00b0f46c
00b0f468	str w20,[x9, #0x20]
00b0f46c	ldr w10,[x9, #0x24]
00b0f470	eor w8,w8,#0x1
00b0f474	cmp w10,#0x0
00b0f478	cset w10,ne
00b0f47c	orr w8,w8,w10
00b0f480	tbnz w8,#0x0,0x00b0f488
00b0f484	str w19,[x9, #0x24]
00b0f488	mov w0,#0x1
00b0f48c	b 0x00b0f4f8
00b0f490	bl 0x00c342a0
00b0f494	adrp x0,0x2a0000
00b0f498	adrp x2,0x2b2000
00b0f49c	add x0,x0,#0xe02
00b0f4a0	add x2,x2,#0xdd5
00b0f4a4	mov w1,#0x8de
00b0f4a8	bl 0x00c342b0
00b0f4ac	mov w0,#0xb
00b0f4b0	orr w1,wzr,#0x78
00b0f4b4	b 0x00b0f4ec
00b0f4b8	mov w8,wzr
00b0f4bc	ldr x9,[x21, #0x20]
00b0f4c0	cbnz w20,0x00b0f460
00b0f4c4	b 0x00b0f46c
00b0f4c8	bl 0x00c342a0
00b0f4cc	adrp x0,0x2a0000
00b0f4d0	adrp x2,0x2b2000
00b0f4d4	add x0,x0,#0xe02
00b0f4d8	add x2,x2,#0xdd5
00b0f4dc	mov w1,#0x8d2
00b0f4e0	bl 0x00c342b0
00b0f4e4	mov w0,#0xb
00b0f4e8	mov w1,#0x79
00b0f4ec	mov x2,xzr
00b0f4f0	bl 0x00c342c0
00b0f4f4	mov w0,wzr
00b0f4f8	ldp x29,x30,[sp, #0x20]
00b0f4fc	ldp x20,x19,[sp, #0x10]
00b0f500	ldp x22,x21,[sp], #0x30
00b0f504	ret
