; ossl_property_get_string_value @ 00ac72a4
00ac72a4	cbz x1,0x00ac72b0
00ac72a8	ldr w8,[x1, #0x4]
00ac72ac	cbz w8,0x00ac72b8
00ac72b0	mov x0,xzr
00ac72b4	ret
00ac72b8	ldr w1,[x1, #0x10]
00ac72bc	b 0x00c3f8a0
