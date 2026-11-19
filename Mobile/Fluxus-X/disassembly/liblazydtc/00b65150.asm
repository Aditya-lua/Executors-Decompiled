; ossl_cipher_var_keylen_set_ctx_params @ 00b65150
00b65150	sub sp,sp,#0x30
00b65154	stp x20,x19,[sp, #0x10]
00b65158	stp x29,x30,[sp, #0x20]
00b6515c	add x29,sp,#0x20
00b65160	cbz x1,0x00b651b4
00b65164	mov x20,x1
00b65168	mov x19,x0
00b6516c	bl 0x00b651fc
00b65170	cbz w0,0x00b651b8
00b65174	adrp x1,0x2bd000
00b65178	add x1,x1,#0xa97
00b6517c	mov x0,x20
00b65180	bl 0x00c36530
00b65184	cbz x0,0x00b651b4
00b65188	add x1,sp,#0x8
00b6518c	bl 0x00c3e920
00b65190	cbz w0,0x00b651c8
00b65194	ldr x9,[x19, #0x48]
00b65198	ldr x8,[sp, #0x8]
00b6519c	cmp x9,x8
00b651a0	b.eq 0x00b651b4
00b651a4	ldrb w9,[x19, #0x6c]
00b651a8	str x8,[x19, #0x48]
00b651ac	and w8,w9,#0xfffffff7
00b651b0	strb w8,[x19, #0x6c]
00b651b4	mov w0,#0x1
00b651b8	ldp x29,x30,[sp, #0x20]
00b651bc	ldp x20,x19,[sp, #0x10]
00b651c0	add sp,sp,#0x30
00b651c4	ret
00b651c8	bl 0x00c342a0
00b651cc	adrp x0,0x2c4000
00b651d0	adrp x2,0x2ab000
00b651d4	add x0,x0,#0x898
00b651d8	add x2,x2,#0x72
00b651dc	mov w1,#0x80
00b651e0	bl 0x00c342b0
00b651e4	mov w0,#0x39
00b651e8	mov w1,#0x67
00b651ec	mov x2,xzr
00b651f0	bl 0x00c342c0
00b651f4	mov w0,wzr
00b651f8	b 0x00b651b8
