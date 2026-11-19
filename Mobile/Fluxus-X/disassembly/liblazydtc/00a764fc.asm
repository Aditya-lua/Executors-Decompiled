; EVP_PKEY_CTX_set_signature_md @ 00a764fc
00a764fc	ldr x8,[x0, #0x30]
00a76500	orr w3,wzr,#0x1f0
00a76504	mov w4,#0x1
00a76508	cmp x8,#0x0
00a7650c	cset w2,eq
00a76510	b 0x00a76514
