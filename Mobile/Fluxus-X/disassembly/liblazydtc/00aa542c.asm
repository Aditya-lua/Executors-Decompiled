; CRYPTO_THREAD_unlock @ 00aa542c
00aa542c	stp x29,x30,[sp, #-0x10]!
00aa5430	mov x29,sp
00aa5434	bl 0x00c3ed50
00aa5438	cmp w0,#0x0
00aa543c	cset w0,eq
00aa5440	ldp x29,x30,[sp], #0x10
00aa5444	ret
