; EVP_PKEY_meth_get_derive @ 00a77dac
00a77dac	cbz x1,0x00a77db8
00a77db0	ldr x8,[x0, #0xb0]
00a77db4	str x8,[x1]
00a77db8	cbz x2,0x00a77dc4
00a77dbc	ldr x8,[x0, #0xb8]
00a77dc0	str x8,[x2]
00a77dc4	ret
