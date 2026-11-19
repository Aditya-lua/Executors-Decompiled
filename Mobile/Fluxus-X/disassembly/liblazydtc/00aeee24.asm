; UI_method_set_data_duplicator @ 00aeee24
00aeee24	cbz x0,0x00aeee38
00aeee28	mov x8,x0
00aeee2c	mov w0,wzr
00aeee30	stp x1,x2,[x8, #0x30]
00aeee34	ret
00aeee38	mov w0,#0xffffffff
00aeee3c	ret
