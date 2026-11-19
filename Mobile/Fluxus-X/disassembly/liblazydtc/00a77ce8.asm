; EVP_PKEY_meth_get_sign @ 00a77ce8
00a77ce8	cbz x1,0x00a77cf4
00a77cec	ldr x8,[x0, #0x40]
00a77cf0	str x8,[x1]
00a77cf4	cbz x2,0x00a77d00
00a77cf8	ldr x8,[x0, #0x48]
00a77cfc	str x8,[x2]
00a77d00	ret
