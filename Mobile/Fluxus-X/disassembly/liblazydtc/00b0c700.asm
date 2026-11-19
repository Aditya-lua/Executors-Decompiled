; X509_set_serialNumber @ 00b0c700
00b0c700	cbz x0,0x00b0c718
00b0c704	add x0,x0,#0x8
00b0c708	cmp x0,x1
00b0c70c	b.eq 0x00b0c714
00b0c710	b 0x00c37940
00b0c714	mov w0,#0x1
00b0c718	ret
