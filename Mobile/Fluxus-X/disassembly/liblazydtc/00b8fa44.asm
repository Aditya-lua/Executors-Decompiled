; psa_crypto_driver_pake_get_peer_len @ 00b8fa44
00b8fa44	ldr x8,[x0, #0x28]
00b8fa48	cbz x8,0x00b8fa58
00b8fa4c	mov w0,wzr
00b8fa50	str x8,[x1]
00b8fa54	ret
00b8fa58	mov w0,#0xffffff77
00b8fa5c	ret
