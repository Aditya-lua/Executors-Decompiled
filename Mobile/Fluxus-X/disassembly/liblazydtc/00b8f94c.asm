; psa_crypto_driver_pake_get_password_len @ 00b8f94c
00b8f94c	ldr x8,[x0, #0x8]
00b8f950	cbz x8,0x00b8f960
00b8f954	mov w0,wzr
00b8f958	str x8,[x1]
00b8f95c	ret
00b8f960	mov w0,#0xffffff77
00b8f964	ret
