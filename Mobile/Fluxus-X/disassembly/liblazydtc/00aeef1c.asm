; UI_get_result_minsize @ 00aeef1c
00aeef1c	ldr w8,[x0]
00aeef20	sub w8,w8,#0x1
00aeef24	cmp w8,#0x1
00aeef28	b.hi 0x00aeef34
00aeef2c	ldr w0,[x0, #0x28]
00aeef30	ret
00aeef34	mov w0,#0xffffffff
00aeef38	ret
