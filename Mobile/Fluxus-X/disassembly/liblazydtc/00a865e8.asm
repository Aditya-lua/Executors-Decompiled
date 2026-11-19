; EVP_CIPHER_meth_set_init @ 00a865e8
00a865e8	ldr x9,[x0, #0x20]
00a865ec	mov x8,x0
00a865f0	mov w0,wzr
00a865f4	cbz x9,0x00a865fc
00a865f8	ret
00a865fc	mov w0,#0x1
00a86600	str x1,[x8, #0x20]
00a86604	ret
