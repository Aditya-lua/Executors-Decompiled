; EVP_CIPHER_get_params @ 00a5c7ec
00a5c7ec	cbz x0,0x00a5c800
00a5c7f0	ldr x2,[x0, #0xd0]
00a5c7f4	cbz x2,0x00a5c800
00a5c7f8	mov x0,x1
00a5c7fc	br x2
00a5c800	mov w0,wzr
00a5c804	ret
