; EVP_MD_meth_set_ctrl @ 00a5f9e8
00a5f9e8	ldr x9,[x0, #0x50]
00a5f9ec	mov x8,x0
00a5f9f0	mov w0,wzr
00a5f9f4	cbz x9,0x00a5f9fc
00a5f9f8	ret
00a5f9fc	mov w0,#0x1
00a5fa00	str x1,[x8, #0x50]
00a5fa04	ret
