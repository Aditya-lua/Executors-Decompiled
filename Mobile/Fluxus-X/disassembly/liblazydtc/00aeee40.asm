; UI_method_set_prompt_constructor @ 00aeee40
00aeee40	cbz x0,0x00aeee54
00aeee44	mov x8,x0
00aeee48	mov w0,wzr
00aeee4c	str x1,[x8, #0x40]
00aeee50	ret
00aeee54	mov w0,#0xffffffff
00aeee58	ret
