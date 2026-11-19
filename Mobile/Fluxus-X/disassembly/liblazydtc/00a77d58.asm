; EVP_PKEY_meth_get_verifyctx @ 00a77d58
00a77d58	cbz x1,0x00a77d64
00a77d5c	ldr x8,[x0, #0x80]
00a77d60	str x8,[x1]
00a77d64	cbz x2,0x00a77d70
00a77d68	ldr x8,[x0, #0x88]
00a77d6c	str x8,[x2]
00a77d70	ret
