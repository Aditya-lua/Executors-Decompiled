; X509_EXTENSION_get_critical @ 00b0d80c
00b0d80c	cbz x0,0x00b0d81c
00b0d810	ldr w8,[x0, #0x8]
00b0d814	cmp w8,#0x0
00b0d818	cset w0,gt
00b0d81c	ret
