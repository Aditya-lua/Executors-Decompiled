; EVP_CIPHER_CTX_iv_noconst @ 00a5f250
00a5f250	sub sp,sp,#0xa0
00a5f254	str x19,[sp, #0x80]
00a5f258	stp x29,x30,[sp, #0x90]
00a5f25c	add x29,sp,#0x90
00a5f260	mov x19,x0
00a5f264	add x8,x0,#0x28
00a5f268	add x0,sp,#0x30
00a5f26c	mov w2,#0x50
00a5f270	mov w1,wzr
00a5f274	stur x8,[x29, #-0x8]
00a5f278	bl 0x00c301c0
00a5f27c	adrp x0,0x2af000
00a5f280	add x0,x0,#0xfc0
00a5f284	add x8,sp,#0x8
00a5f288	sub x1,x29,#0x8
00a5f28c	mov w2,#0x10
00a5f290	bl 0x00c36de0
00a5f294	ldr x8,[sp, #0x28]
00a5f298	ldur q0,[sp, #0x18]
00a5f29c	ldur q1,[sp, #0x8]
00a5f2a0	add x2,sp,#0x30
00a5f2a4	str x8,[sp, #0x50]
00a5f2a8	stp q1,q0,[sp, #0x30]
00a5f2ac	ldr x0,[x19]
00a5f2b0	ldr x1,[x19, #0xa8]
00a5f2b4	bl 0x00c3cd60
00a5f2b8	ldur x8,[x29, #-0x8]
00a5f2bc	ldp x29,x30,[sp, #0x90]
00a5f2c0	ldr x19,[sp, #0x80]
00a5f2c4	cmp w0,#0x0
00a5f2c8	csel x0,xzr,x8,eq
00a5f2cc	add sp,sp,#0xa0
00a5f2d0	ret
