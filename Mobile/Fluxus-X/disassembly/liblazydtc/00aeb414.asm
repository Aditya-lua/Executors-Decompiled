; ossl_store_loader_store_cache_flush @ 00aeb414
00aeb414	stp x29,x30,[sp, #-0x10]!
00aeb418	adrp x2,0xc7d000
00aeb41c	add x2,x2,#0xeb8
00aeb420	orr w1,wzr,#0xf
00aeb424	mov x29,sp
00aeb428	bl 0x00c3b520
00aeb42c	cbz x0,0x00aeb438
00aeb430	ldp x29,x30,[sp], #0x10
00aeb434	b 0x00c3b570
00aeb438	mov w0,#0x1
00aeb43c	ldp x29,x30,[sp], #0x10
00aeb440	ret
