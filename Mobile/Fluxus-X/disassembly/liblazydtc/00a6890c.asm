; EVP_MAC_CTX_get_params @ 00a6890c
00a6890c	ldr x8,[x0]
00a68910	ldr x2,[x8, #0x80]
00a68914	cbz x2,0x00a68920
00a68918	ldr x0,[x0, #0x8]
00a6891c	br x2
00a68920	mov w0,#0x1
00a68924	ret
