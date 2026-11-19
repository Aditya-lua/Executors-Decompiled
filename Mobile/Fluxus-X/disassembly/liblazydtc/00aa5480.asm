; CRYPTO_THREAD_run_once @ 00aa5480
00aa5480	stp x29,x30,[sp, #-0x10]!
00aa5484	mov x29,sp
00aa5488	bl 0x00c3ed10
00aa548c	cmp w0,#0x0
00aa5490	cset w0,eq
00aa5494	ldp x29,x30,[sp], #0x10
00aa5498	ret
