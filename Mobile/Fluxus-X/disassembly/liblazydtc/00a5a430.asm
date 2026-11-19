; EVP_CIPHER_CTX_reset @ 00a5a430
00a5a430	str x21,[sp, #-0x30]!
00a5a434	stp x20,x19,[sp, #0x10]
00a5a438	stp x29,x30,[sp, #0x20]
00a5a43c	add x29,sp,#0x20
00a5a440	cbz x0,0x00a5a500
00a5a444	ldr x8,[x0]
00a5a448	mov x19,x0
00a5a44c	cbz x8,0x00a5a4cc
00a5a450	ldr x9,[x8, #0x78]
00a5a454	cbz x9,0x00a5a4a0
00a5a458	ldr x0,[x19, #0xa8]
00a5a45c	cbz x0,0x00a5a470
00a5a460	ldr x8,[x8, #0xc0]
00a5a464	cbz x8,0x00a5a46c
00a5a468	blr x8
00a5a46c	str xzr,[x19, #0xa8]
00a5a470	ldr x20,[x19, #0xb0]
00a5a474	cbz x20,0x00a5a4e8
00a5a478	ldr w8,[x20, #0x18]
00a5a47c	cbnz w8,0x00a5a4e8
00a5a480	add x9,x20,#0x80
00a5a484	ldxr w8,[x9]
00a5a488	subs w10,w8,#0x1
00a5a48c	stxr w11,w10,[x9]
00a5a490	cbnz w11,0x00a5a484
00a5a494	b.ne 0x00a5a514
00a5a498	dmb ISHLD
00a5a49c	b 0x00a5a51c
00a5a4a0	ldr x8,[x8, #0x30]
00a5a4a4	cbz x8,0x00a5a4b4
00a5a4a8	mov x0,x19
00a5a4ac	blr x8
00a5a4b0	cbz w0,0x00a5a504
00a5a4b4	ldr x0,[x19, #0x78]
00a5a4b8	cbz x0,0x00a5a4cc
00a5a4bc	ldr x8,[x19]
00a5a4c0	ldrsw x1,[x8, #0x38]
00a5a4c4	cbz w1,0x00a5a4cc
00a5a4c8	bl 0x00c34750
00a5a4cc	ldr x0,[x19, #0x78]
00a5a4d0	adrp x1,0x2a5000
00a5a4d4	add x1,x1,#0xf9d
00a5a4d8	orr w2,wzr,#0x3c
00a5a4dc	bl 0x00c32310
00a5a4e0	ldr x0,[x19, #0x8]
00a5a4e4	bl 0x00c32360
00a5a4e8	mov w2,#0xb8
00a5a4ec	mov x0,x19
00a5a4f0	mov w1,wzr
00a5a4f4	bl 0x00c301c0
00a5a4f8	mov w8,#0xffffffff
00a5a4fc	str w8,[x19, #0x6c]
00a5a500	mov w0,#0x1
00a5a504	ldp x29,x30,[sp, #0x20]
00a5a508	ldp x20,x19,[sp, #0x10]
00a5a50c	ldr x21,[sp], #0x30
00a5a510	ret
00a5a514	cmp w8,#0x1
00a5a518	b.gt 0x00a5a4e8
00a5a51c	ldr x0,[x20, #0x68]
00a5a520	adrp x21,0x2a5000
00a5a524	add x21,x21,#0xf9d
00a5a528	mov w2,#0x69b
00a5a52c	mov x1,x21
00a5a530	bl 0x00c32310
00a5a534	ldr x0,[x20, #0x78]
00a5a538	bl 0x00c3b690
00a5a53c	ldr x0,[x20, #0x88]
00a5a540	bl 0x00c34d40
00a5a544	mov w2,#0x69e
00a5a548	mov x0,x20
00a5a54c	mov x1,x21
00a5a550	bl 0x00c32310
00a5a554	b 0x00a5a4e8
