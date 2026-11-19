; UI_method_set_flusher @ 00aeedd0
00aeedd0	cbz x0,0x00aeede4
00aeedd4	mov x8,x0
00aeedd8	mov w0,wzr
00aeeddc	str x1,[x8, #0x18]
00aeede0	ret
00aeede4	mov w0,#0xffffffff
00aeede8	ret
