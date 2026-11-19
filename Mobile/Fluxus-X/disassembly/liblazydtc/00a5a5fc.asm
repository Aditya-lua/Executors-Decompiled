; EVP_CIPHER_CTX_free @ 00a5a5fc
00a5a5fc	cbz x0,0x00a5a630
00a5a600	str x19,[sp, #-0x20]!
00a5a604	stp x29,x30,[sp, #0x10]
00a5a608	add x29,sp,#0x10
00a5a60c	mov x19,x0
00a5a610	bl 0x00a5a430
00a5a614	ldp x29,x30,[sp, #0x10]
00a5a618	adrp x1,0x2a5000
00a5a61c	add x1,x1,#0xf9d
00a5a620	mov w2,#0x4f
00a5a624	mov x0,x19
00a5a628	ldr x19,[sp], #0x20
00a5a62c	b 0x00c32310
00a5a630	ret
