; X509_CRL_set_default_method @ 00b1b3f0
00b1b3f0	adrp x8,0xcc9000
00b1b3f4	add x8,x8,#0xd38
00b1b3f8	cmp x0,#0x0
00b1b3fc	csel x8,x8,x0,eq
00b1b400	adrp x9,0xcc9000
00b1b404	str x8,[x9, #0xd60]
00b1b408	ret
