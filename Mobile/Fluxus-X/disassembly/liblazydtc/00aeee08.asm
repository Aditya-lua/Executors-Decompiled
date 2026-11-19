; UI_method_set_closer @ 00aeee08
00aeee08	cbz x0,0x00aeee1c
00aeee0c	mov x8,x0
00aeee10	mov w0,wzr
00aeee14	str x1,[x8, #0x28]
00aeee18	ret
00aeee1c	mov w0,#0xffffffff
00aeee20	ret
