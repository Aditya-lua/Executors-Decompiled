; ossl_x509_PUBKEY_get0_libctx @ 00b1e2d4
00b1e2d4	cbz x0,0x00b1e2e0
00b1e2d8	ldr x8,[x2, #0x18]
00b1e2dc	str x8,[x0]
00b1e2e0	cbz x1,0x00b1e2ec
00b1e2e4	ldr x8,[x2, #0x20]
00b1e2e8	str x8,[x1]
00b1e2ec	mov w0,#0x1
00b1e2f0	ret
