; EVP_PKEY_meth_get_signctx @ 00a77d3c
00a77d3c	cbz x1,0x00a77d48
00a77d40	ldr x8,[x0, #0x70]
00a77d44	str x8,[x1]
00a77d48	cbz x2,0x00a77d54
00a77d4c	ldr x8,[x0, #0x78]
00a77d50	str x8,[x2]
00a77d54	ret
