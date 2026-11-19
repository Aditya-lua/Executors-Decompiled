; EVP_CIPHER_meth_set_cleanup @ 00a86628
00a86628	ldr x9,[x0, #0x30]
00a8662c	mov x8,x0
00a86630	mov w0,wzr
00a86634	cbz x9,0x00a8663c
00a86638	ret
00a8663c	mov w0,#0x1
00a86640	str x1,[x8, #0x30]
00a86644	ret
