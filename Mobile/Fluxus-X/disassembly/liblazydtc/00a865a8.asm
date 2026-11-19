; EVP_CIPHER_meth_set_flags @ 00a865a8
00a865a8	ldr x9,[x0, #0x10]
00a865ac	mov x8,x0
00a865b0	mov w0,wzr
00a865b4	cbz x9,0x00a865bc
00a865b8	ret
00a865bc	mov w0,#0x1
00a865c0	str x1,[x8, #0x10]
00a865c4	ret
