; UI_method_set_writer @ 00aeedb4
00aeedb4	cbz x0,0x00aeedc8
00aeedb8	mov x8,x0
00aeedbc	mov w0,wzr
00aeedc0	str x1,[x8, #0x10]
00aeedc4	ret
00aeedc8	mov w0,#0xffffffff
00aeedcc	ret
