; ossl_encoder_store_cache_flush @ 00a60d40
00a60d40	stp x29,x30,[sp, #-0x10]!
00a60d44	adrp x2,0xc5d000
00a60d48	add x2,x2,#0x818
00a60d4c	mov w1,#0xa
00a60d50	mov x29,sp
00a60d54	bl 0x00c3b520
00a60d58	cbz x0,0x00a60d64
00a60d5c	ldp x29,x30,[sp], #0x10
00a60d60	b 0x00c3b570
00a60d64	mov w0,#0x1
00a60d68	ldp x29,x30,[sp], #0x10
00a60d6c	ret
