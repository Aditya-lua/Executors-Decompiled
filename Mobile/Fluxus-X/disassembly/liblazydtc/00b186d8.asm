; OSSL_HTTP_is_alive @ 00b186d8
00b186d8	cbz x0,0x00b186e8
00b186dc	ldr w8,[x0, #0xa0]
00b186e0	cmp w8,#0x0
00b186e4	cset w0,ne
00b186e8	ret
