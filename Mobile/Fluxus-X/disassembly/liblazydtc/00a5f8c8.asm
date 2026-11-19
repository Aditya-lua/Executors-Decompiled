; EVP_MD_meth_set_input_blocksize @ 00a5f8c8
00a5f8c8	ldr w9,[x0, #0x48]
00a5f8cc	mov x8,x0
00a5f8d0	mov w0,wzr
00a5f8d4	cbz w9,0x00a5f8dc
00a5f8d8	ret
00a5f8dc	mov w0,#0x1
00a5f8e0	str w1,[x8, #0x48]
00a5f8e4	ret
