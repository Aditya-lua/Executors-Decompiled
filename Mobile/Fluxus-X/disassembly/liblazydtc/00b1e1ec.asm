; X509_PUBKEY_get0_param @ 00b1e1ec
00b1e1ec	cbz x0,0x00b1e1fc
00b1e1f0	ldr x8,[x4]
00b1e1f4	ldr x8,[x8]
00b1e1f8	str x8,[x0]
00b1e1fc	cbz x1,0x00b1e218
00b1e200	ldr x8,[x4, #0x8]
00b1e204	ldr x8,[x8, #0x8]
00b1e208	str x8,[x1]
00b1e20c	ldr x8,[x4, #0x8]
00b1e210	ldr w8,[x8]
00b1e214	str w8,[x2]
00b1e218	cbz x3,0x00b1e224
00b1e21c	ldr x8,[x4]
00b1e220	str x8,[x3]
00b1e224	mov w0,#0x1
00b1e228	ret
