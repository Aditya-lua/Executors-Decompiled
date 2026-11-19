; EVP_PKEY_meth_get_encrypt @ 00a77d74
00a77d74	cbz x1,0x00a77d80
00a77d78	ldr x8,[x0, #0x90]
00a77d7c	str x8,[x1]
00a77d80	cbz x2,0x00a77d8c
00a77d84	ldr x8,[x0, #0x98]
00a77d88	str x8,[x2]
00a77d8c	ret
