; EVP_CIPHER_CTX_set_num @ 00a5f46c
00a5f46c	sub sp,sp,#0xa0
00a5f470	stp x29,x30,[sp, #0x90]
00a5f474	add x29,sp,#0x90
00a5f478	str x19,[sp, #0x80]
00a5f47c	mov x19,x0
00a5f480	stur w1,[x29, #-0x4]
00a5f484	add x0,sp,#0x30
00a5f488	mov w2,#0x50
00a5f48c	mov w1,wzr
00a5f490	bl 0x00c301c0
00a5f494	adrp x0,0x2aa000
00a5f498	add x0,x0,#0x191
00a5f49c	add x8,sp,#0x8
00a5f4a0	sub x1,x29,#0x4
00a5f4a4	bl 0x00c37340
00a5f4a8	ldr x8,[sp, #0x28]
00a5f4ac	ldur q0,[sp, #0x18]
00a5f4b0	ldur q1,[sp, #0x8]
00a5f4b4	add x2,sp,#0x30
00a5f4b8	str x8,[sp, #0x50]
00a5f4bc	stp q1,q0,[sp, #0x30]
00a5f4c0	ldr x0,[x19]
00a5f4c4	ldr x1,[x19, #0xa8]
00a5f4c8	bl 0x00c3cd70
00a5f4cc	cbz w0,0x00a5f4d8
00a5f4d0	ldur w8,[x29, #-0x4]
00a5f4d4	str w8,[x19, #0x58]
00a5f4d8	ldp x29,x30,[sp, #0x90]
00a5f4dc	ldr x19,[sp, #0x80]
00a5f4e0	cmp w0,#0x0
00a5f4e4	cset w0,ne
00a5f4e8	add sp,sp,#0xa0
00a5f4ec	ret
