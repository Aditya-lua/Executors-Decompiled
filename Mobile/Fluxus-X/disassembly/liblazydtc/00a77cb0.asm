; EVP_PKEY_meth_get_paramgen @ 00a77cb0
00a77cb0	cbz x1,0x00a77cbc
00a77cb4	ldr x8,[x0, #0x20]
00a77cb8	str x8,[x1]
00a77cbc	cbz x2,0x00a77cc8
00a77cc0	ldr x8,[x0, #0x28]
00a77cc4	str x8,[x2]
00a77cc8	ret
