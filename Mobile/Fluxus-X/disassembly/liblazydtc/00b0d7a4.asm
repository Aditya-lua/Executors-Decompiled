; X509_EXTENSION_set_critical @ 00b0d7a4
00b0d7a4	cbz x0,0x00b0d7bc
00b0d7a8	cmp w1,#0x0
00b0d7ac	orr w8,wzr,#0xff
00b0d7b0	csinv w8,w8,wzr,ne
00b0d7b4	str w8,[x0, #0x8]
00b0d7b8	mov w0,#0x1
00b0d7bc	ret
