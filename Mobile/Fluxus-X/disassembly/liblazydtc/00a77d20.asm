; EVP_PKEY_meth_get_verify_recover @ 00a77d20
00a77d20	cbz x1,0x00a77d2c
00a77d24	ldr x8,[x0, #0x60]
00a77d28	str x8,[x1]
00a77d2c	cbz x2,0x00a77d38
00a77d30	ldr x8,[x0, #0x68]
00a77d34	str x8,[x2]
00a77d38	ret
