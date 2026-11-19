; EVP_PKEY_meth_get_keygen @ 00a77ccc
00a77ccc	cbz x1,0x00a77cd8
00a77cd0	ldr x8,[x0, #0x30]
00a77cd4	str x8,[x1]
00a77cd8	cbz x2,0x00a77ce4
00a77cdc	ldr x8,[x0, #0x38]
00a77ce0	str x8,[x2]
00a77ce4	ret
