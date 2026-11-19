; EVP_PKEY_CTX_set_tls1_prf_md @ 00a76680
00a76680	ldr x8,[x0, #0x30]
00a76684	mov w3,#0x800
00a76688	mov w4,#0x1000
00a7668c	cmp x8,#0x0
00a76690	cset w2,eq
00a76694	b 0x00a76514
