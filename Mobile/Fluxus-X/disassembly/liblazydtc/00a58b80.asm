; EVP_MD_get_params @ 00a58b80
00a58b80	cbz x0,0x00a58b94
00a58b84	ldr x2,[x0, #0xc0]
00a58b88	cbz x2,0x00a58b94
00a58b8c	mov x0,x1
00a58b90	br x2
00a58b94	mov w0,wzr
00a58b98	ret
