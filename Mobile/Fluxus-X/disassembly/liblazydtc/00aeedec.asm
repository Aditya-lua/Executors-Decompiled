; UI_method_set_reader @ 00aeedec
00aeedec	cbz x0,0x00aeee00
00aeedf0	mov x8,x0
00aeedf4	mov w0,wzr
00aeedf8	str x1,[x8, #0x20]
00aeedfc	ret
00aeee00	mov w0,#0xffffffff
00aeee04	ret
