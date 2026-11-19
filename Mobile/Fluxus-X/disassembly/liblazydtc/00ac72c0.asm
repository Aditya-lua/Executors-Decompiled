; ossl_property_get_number_value @ 00ac72c0
00ac72c0	cbz x0,0x00ac72e0
00ac72c4	ldr w8,[x0, #0x4]
00ac72c8	cmp w8,#0x1
00ac72cc	mov x8,xzr
00ac72d0	b.ne 0x00ac72d8
00ac72d4	ldr x8,[x0, #0x10]
00ac72d8	mov x0,x8
00ac72dc	ret
00ac72e0	mov x0,xzr
00ac72e4	ret
