; mbedtls_rsa_rsassa_pss_sign_ext @ 00ba829c
00ba829c	ldr w8,[x0, #0xe0]
00ba82a0	cmp w8,#0x1
00ba82a4	b.ne 0x00ba82b8
00ba82a8	ldr w8,[x0, #0xe4]
00ba82ac	orr w8,w8,w3
00ba82b0	cbz w8,0x00ba82b8
00ba82b4	b 0x00ba8060
00ba82b8	mov w0,#0xffffbf80
00ba82bc	ret
