; mbedtls_cipher_reset @ 00b69e20
00b69e20	ldr x9,[x0]
00b69e24	mov x8,x0
00b69e28	cbz x9,0x00b69e38
00b69e2c	mov w0,wzr
00b69e30	str xzr,[x8, #0x30]
00b69e34	ret
00b69e38	mov w0,#0xffff9f00
00b69e3c	ret
