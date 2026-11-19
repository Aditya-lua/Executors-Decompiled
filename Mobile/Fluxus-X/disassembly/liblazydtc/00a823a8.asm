; ossl_namemap_empty @ 00a823a8
00a823a8	cbz x0,0x00a823bc
00a823ac	ldr w8,[x0, #0x18]
00a823b0	cmp w8,#0x0
00a823b4	cset w0,eq
00a823b8	ret
00a823bc	mov w0,#0x1
00a823c0	ret
