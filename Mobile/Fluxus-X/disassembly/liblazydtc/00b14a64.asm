; X509_CRL_get0_signature @ 00b14a64
00b14a64	cbz x1,0x00b14a70
00b14a68	add x8,x0,#0x68
00b14a6c	str x8,[x1]
00b14a70	cbz x2,0x00b14a7c
00b14a74	add x8,x0,#0x58
00b14a78	str x8,[x2]
00b14a7c	ret
