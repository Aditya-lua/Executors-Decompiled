; mbedtls_psa_crypto_configure_entropy_sources @ 00b8f6d8
00b8f6d8	adrp x9,0xd25000
00b8f6dc	add x9,x9,#0xb10
00b8f6e0	ldrb w10,[x9, #0x1]
00b8f6e4	mov x8,x0
00b8f6e8	cbz w10,0x00b8f6f4
00b8f6ec	mov w0,#0xffffff77
00b8f6f0	ret
00b8f6f4	mov w0,wzr
00b8f6f8	stp x8,x1,[x9, #0x8]
00b8f6fc	ret
