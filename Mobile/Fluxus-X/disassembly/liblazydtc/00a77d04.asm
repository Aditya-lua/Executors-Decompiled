; EVP_PKEY_meth_get_verify @ 00a77d04
00a77d04	cbz x1,0x00a77d10
00a77d08	ldr x8,[x0, #0x50]
00a77d0c	str x8,[x1]
00a77d10	cbz x2,0x00a77d1c
00a77d14	ldr x8,[x0, #0x58]
00a77d18	str x8,[x2]
00a77d1c	ret
