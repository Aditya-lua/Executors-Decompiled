; EVP_PKEY_meth_get_decrypt @ 00a77d90
00a77d90	cbz x1,0x00a77d9c
00a77d94	ldr x8,[x0, #0xa0]
00a77d98	str x8,[x1]
00a77d9c	cbz x2,0x00a77da8
00a77da0	ldr x8,[x0, #0xa8]
00a77da4	str x8,[x2]
00a77da8	ret
