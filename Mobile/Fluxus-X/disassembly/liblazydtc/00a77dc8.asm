; EVP_PKEY_meth_get_ctrl @ 00a77dc8
00a77dc8	cbz x1,0x00a77dd4
00a77dcc	ldr x8,[x0, #0xc0]
00a77dd0	str x8,[x1]
00a77dd4	cbz x2,0x00a77de0
00a77dd8	ldr x8,[x0, #0xc8]
00a77ddc	str x8,[x2]
00a77de0	ret
