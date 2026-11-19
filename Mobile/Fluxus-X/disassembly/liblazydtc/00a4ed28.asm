; ossl_decoder_store_cache_flush @ 00a4ed28
00a4ed28	stp x29,x30,[sp, #-0x10]!
00a4ed2c	adrp x2,0xc5d000
00a4ed30	add x2,x2,#0x58
00a4ed34	mov w1,#0xb
00a4ed38	mov x29,sp
00a4ed3c	bl 0x00c3b520
00a4ed40	cbz x0,0x00a4ed4c
00a4ed44	ldp x29,x30,[sp], #0x10
00a4ed48	b 0x00c3b570
00a4ed4c	mov w0,#0x1
00a4ed50	ldp x29,x30,[sp], #0x10
00a4ed54	ret
