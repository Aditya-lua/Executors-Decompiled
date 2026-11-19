; EVP_PKEY_get_size_t_param @ 00a6f474
00a6f474	sub sp,sp,#0xa0
00a6f478	str x19,[sp, #0x80]
00a6f47c	stp x29,x30,[sp, #0x90]
00a6f480	add x29,sp,#0x90
00a6f484	cbz x1,0x00a6f4f4
00a6f488	mov x19,x0
00a6f48c	add x8,sp,#0x8
00a6f490	mov x0,x1
00a6f494	mov x1,x2
00a6f498	bl 0x00c36270
00a6f49c	ldr x8,[sp, #0x28]
00a6f4a0	ldur q0,[sp, #0x18]
00a6f4a4	ldur q1,[sp, #0x8]
00a6f4a8	str x8,[sp, #0x50]
00a6f4ac	add x8,sp,#0x8
00a6f4b0	stp q1,q0,[sp, #0x30]
00a6f4b4	bl 0x00c34c40
00a6f4b8	ldr x8,[sp, #0x28]
00a6f4bc	ldur q0,[sp, #0x18]
00a6f4c0	ldur q1,[sp, #0x8]
00a6f4c4	add x1,sp,#0x30
00a6f4c8	mov x0,x19
00a6f4cc	str x8,[sp, #0x78]
00a6f4d0	stur q0,[sp, #0x68]
00a6f4d4	stur q1,[sp, #0x58]
00a6f4d8	bl 0x00a6f360
00a6f4dc	cbz w0,0x00a6f4f8
00a6f4e0	add x0,sp,#0x30
00a6f4e4	bl 0x00c3d030
00a6f4e8	cmp w0,#0x0
00a6f4ec	cset w0,ne
00a6f4f0	b 0x00a6f4f8
00a6f4f4	mov w0,wzr
00a6f4f8	ldp x29,x30,[sp, #0x90]
00a6f4fc	ldr x19,[sp, #0x80]
00a6f500	add sp,sp,#0xa0
00a6f504	ret
