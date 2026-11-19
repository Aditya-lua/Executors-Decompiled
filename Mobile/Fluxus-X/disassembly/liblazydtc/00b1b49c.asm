; X509_CRL_METHOD_free @ 00b1b49c
00b1b49c	cbz x0,0x00b1b4a8
00b1b4a0	ldrb w8,[x0]
00b1b4a4	tbnz w8,#0x0,0x00b1b4ac
00b1b4a8	ret
00b1b4ac	adrp x1,0x2d6000
00b1b4b0	add x1,x1,#0x879
00b1b4b4	mov w2,#0x1fb
00b1b4b8	b 0x00c32310
