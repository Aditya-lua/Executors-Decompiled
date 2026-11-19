; X509_REQ_get0_signature @ 00b0c5f8
00b0c5f8	cbz x1,0x00b0c604
00b0c5fc	ldr x8,[x0, #0x48]
00b0c600	str x8,[x1]
00b0c604	cbz x2,0x00b0c610
00b0c608	add x8,x0,#0x38
00b0c60c	str x8,[x2]
00b0c610	ret
