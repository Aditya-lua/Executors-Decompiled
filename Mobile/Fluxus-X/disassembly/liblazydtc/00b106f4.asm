; X509_STORE_CTX_set0_trusted_stack @ 00b106f4
00b106f4	adrp x8,0xb10000
00b106f8	adrp x9,0xb10000
00b106fc	add x8,x8,#0x714
00b10700	add x9,x9,#0x758
00b10704	str x1,[x0, #0x28]
00b10708	str x8,[x0, #0x40]
00b1070c	str x9,[x0, #0x78]
00b10710	ret
