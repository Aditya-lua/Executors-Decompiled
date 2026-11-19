; psa_crypto_driver_pake_get_cipher_suite @ 00b8fac0
00b8fac0	mov x8,x0
00b8fac4	ldr w9,[x8, #0x48]!
00b8fac8	cbz w9,0x00b8fae4
00b8facc	ldr w9,[x8, #0x8]
00b8fad0	mov w0,wzr
00b8fad4	str w9,[x1, #0x8]
00b8fad8	ldr x8,[x8]
00b8fadc	str x8,[x1]
00b8fae0	ret
00b8fae4	mov w0,#0xffffff77
00b8fae8	ret
