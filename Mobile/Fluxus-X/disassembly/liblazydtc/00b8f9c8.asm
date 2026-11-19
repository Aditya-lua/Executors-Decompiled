; psa_crypto_driver_pake_get_user_len @ 00b8f9c8
00b8f9c8	ldr x8,[x0, #0x18]
00b8f9cc	cbz x8,0x00b8f9dc
00b8f9d0	mov w0,wzr
00b8f9d4	str x8,[x1]
00b8f9d8	ret
00b8f9dc	mov w0,#0xffffff77
00b8f9e0	ret
