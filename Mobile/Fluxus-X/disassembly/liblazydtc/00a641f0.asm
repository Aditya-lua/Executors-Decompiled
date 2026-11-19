; EVP_KDF_CTX_reset @ 00a641f0
00a641f0	cbz x0,0x00a64208
00a641f4	ldr x8,[x0]
00a641f8	ldr x1,[x8, #0x48]
00a641fc	cbz x1,0x00a64208
00a64200	ldr x0,[x0, #0x8]
00a64204	br x1
00a64208	ret
