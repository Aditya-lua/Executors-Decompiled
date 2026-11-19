; EVP_CIPHER_meth_set_ctrl @ 00a86688
00a86688	ldr x9,[x0, #0x50]
00a8668c	mov x8,x0
00a86690	mov w0,wzr
00a86694	cbz x9,0x00a8669c
00a86698	ret
00a8669c	mov w0,#0x1
00a866a0	str x1,[x8, #0x50]
00a866a4	ret
