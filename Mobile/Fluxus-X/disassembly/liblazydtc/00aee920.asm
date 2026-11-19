; UI_get_result_string_length @ 00aee920
00aee920	ldr w8,[x0]
00aee924	sub w8,w8,#0x1
00aee928	cmp w8,#0x1
00aee92c	b.hi 0x00aee938
00aee930	ldr w0,[x0, #0x20]
00aee934	ret
00aee938	mov w0,#0xffffffff
00aee93c	ret
