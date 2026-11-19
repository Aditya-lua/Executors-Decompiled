; EVP_CIPHER_CTX_get_tag_length @ 00a5f150
00a5f150	sub sp,sp,#0xa0
00a5f154	str x19,[sp, #0x80]
00a5f158	stp x29,x30,[sp, #0x90]
00a5f15c	add x29,sp,#0x90
00a5f160	mov x19,x0
00a5f164	add x0,sp,#0x30
00a5f168	mov w2,#0x50
00a5f16c	mov w1,wzr
00a5f170	stur xzr,[x29, #-0x8]
00a5f174	bl 0x00c301c0
00a5f178	adrp x0,0x2ac000
00a5f17c	add x0,x0,#0x107
00a5f180	add x8,sp,#0x8
00a5f184	sub x1,x29,#0x8
00a5f188	bl 0x00c36270
00a5f18c	ldr x8,[sp, #0x28]
00a5f190	ldur q0,[sp, #0x18]
00a5f194	ldur q1,[sp, #0x8]
00a5f198	add x2,sp,#0x30
00a5f19c	str x8,[sp, #0x50]
00a5f1a0	stp q1,q0,[sp, #0x30]
00a5f1a4	ldr x0,[x19]
00a5f1a8	ldr x1,[x19, #0xa8]
00a5f1ac	bl 0x00c3cd60
00a5f1b0	ldur w8,[x29, #-0x8]
00a5f1b4	ldp x29,x30,[sp, #0x90]
00a5f1b8	ldr x19,[sp, #0x80]
00a5f1bc	cmp w0,#0x1
00a5f1c0	csel w0,w8,wzr,eq
00a5f1c4	add sp,sp,#0xa0
00a5f1c8	ret
