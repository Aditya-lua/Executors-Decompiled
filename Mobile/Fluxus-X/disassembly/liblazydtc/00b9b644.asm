; mbedtls_ecdsa_can_do @ 00b9b644
00b9b644	orr w8,w0,#0x4
00b9b648	cmp w8,#0xd
00b9b64c	mov w8,#0x1
00b9b650	csel w0,wzr,w8,eq
00b9b654	ret
