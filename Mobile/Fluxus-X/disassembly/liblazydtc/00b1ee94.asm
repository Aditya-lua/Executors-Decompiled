; X509_get0_signature @ 00b1ee94
00b1ee94	cbz x0,0x00b1eea0
00b1ee98	add x8,x2,#0x98
00b1ee9c	str x8,[x0]
00b1eea0	cbz x1,0x00b1eeac
00b1eea4	add x8,x2,#0x88
00b1eea8	str x8,[x1]
00b1eeac	ret
