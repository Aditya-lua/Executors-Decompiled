; EVP_MD_meth_set_result_size @ 00a5f8e8
00a5f8e8	ldr w9,[x0, #0x8]
00a5f8ec	mov x8,x0
00a5f8f0	mov w0,wzr
00a5f8f4	cbz w9,0x00a5f8fc
00a5f8f8	ret
00a5f8fc	mov w0,#0x1
00a5f900	str w1,[x8, #0x8]
00a5f904	ret
