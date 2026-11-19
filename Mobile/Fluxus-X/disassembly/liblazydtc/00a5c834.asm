; EVP_CIPHER_CTX_get_params @ 00a5c834
00a5c834	ldr x8,[x0]
00a5c838	cbz x8,0x00a5c84c
00a5c83c	ldr x2,[x8, #0xd8]
00a5c840	cbz x2,0x00a5c84c
00a5c844	ldr x0,[x0, #0xa8]
00a5c848	br x2
00a5c84c	mov w0,wzr
00a5c850	ret
