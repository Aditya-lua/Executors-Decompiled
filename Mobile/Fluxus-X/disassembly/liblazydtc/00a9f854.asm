; OSSL_PARAM_set_octet_ptr @ 00a9f854
00a9f854	cbz x0,0x00a9f880
00a9f858	mov x8,x0
00a9f85c	ldr w9,[x8, #0x8]
00a9f860	mov w0,wzr
00a9f864	str x2,[x8, #0x20]
00a9f868	cmp w9,#0x7
00a9f86c	b.ne 0x00a9f880
00a9f870	ldr x8,[x8, #0x10]
00a9f874	cbz x8,0x00a9f87c
00a9f878	str x1,[x8]
00a9f87c	mov w0,#0x1
00a9f880	ret
