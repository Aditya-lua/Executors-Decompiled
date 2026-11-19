; UI_get_result_maxsize @ 00aeef3c
00aeef3c	ldr w8,[x0]
00aeef40	sub w8,w8,#0x1
00aeef44	cmp w8,#0x1
00aeef48	b.hi 0x00aeef54
00aeef4c	ldr w0,[x0, #0x2c]
00aeef50	ret
00aeef54	mov w0,#0xffffffff
00aeef58	ret
