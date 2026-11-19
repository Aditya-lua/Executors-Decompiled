; EVP_CIPHER_meth_set_set_asn1_params @ 00a86648
00a86648	ldr x9,[x0, #0x40]
00a8664c	mov x8,x0
00a86650	mov w0,wzr
00a86654	cbz x9,0x00a8665c
00a86658	ret
00a8665c	mov w0,#0x1
00a86660	str x1,[x8, #0x40]
00a86664	ret
