; UI_method_set_opener @ 00aeed98
00aeed98	cbz x0,0x00aeedac
00aeed9c	mov x8,x0
00aeeda0	mov w0,wzr
00aeeda4	str x1,[x8, #0x8]
00aeeda8	ret
00aeedac	mov w0,#0xffffffff
00aeedb0	ret
