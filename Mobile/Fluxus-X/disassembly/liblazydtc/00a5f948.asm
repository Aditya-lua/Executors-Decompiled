; EVP_MD_meth_set_init @ 00a5f948
00a5f948	ldr x9,[x0, #0x20]
00a5f94c	mov x8,x0
00a5f950	mov w0,wzr
00a5f954	cbz x9,0x00a5f95c
00a5f958	ret
00a5f95c	mov w0,#0x1
00a5f960	str x1,[x8, #0x20]
00a5f964	ret
