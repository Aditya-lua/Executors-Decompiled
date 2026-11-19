; EVP_MD_meth_set_copy @ 00a5f9a8
00a5f9a8	ldr x9,[x0, #0x38]
00a5f9ac	mov x8,x0
00a5f9b0	mov w0,wzr
00a5f9b4	cbz x9,0x00a5f9bc
00a5f9b8	ret
00a5f9bc	mov w0,#0x1
00a5f9c0	str x1,[x8, #0x38]
00a5f9c4	ret
