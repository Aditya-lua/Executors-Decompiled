; EVP_MD_meth_set_final @ 00a5f988
00a5f988	ldr x9,[x0, #0x30]
00a5f98c	mov x8,x0
00a5f990	mov w0,wzr
00a5f994	cbz x9,0x00a5f99c
00a5f998	ret
00a5f99c	mov w0,#0x1
00a5f9a0	str x1,[x8, #0x30]
00a5f9a4	ret
