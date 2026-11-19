; X509_check_ip @ 00b06e44
00b06e44	cbz x1,0x00b06e54
00b06e48	orr w4,wzr,#0x7
00b06e4c	mov x5,xzr
00b06e50	b 0x00b06b10
00b06e54	orr w0,wzr,#0xfffffffe
00b06e58	ret
