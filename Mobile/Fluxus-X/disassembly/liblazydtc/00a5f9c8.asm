; EVP_MD_meth_set_cleanup @ 00a5f9c8
00a5f9c8	ldr x9,[x0, #0x40]
00a5f9cc	mov x8,x0
00a5f9d0	mov w0,wzr
00a5f9d4	cbz x9,0x00a5f9dc
00a5f9d8	ret
00a5f9dc	mov w0,#0x1
00a5f9e0	str x1,[x8, #0x40]
00a5f9e4	ret
