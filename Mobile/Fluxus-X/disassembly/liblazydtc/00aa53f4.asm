; CRYPTO_THREAD_read_lock @ 00aa53f4
00aa53f4	stp x29,x30,[sp, #-0x10]!
00aa53f8	mov x29,sp
00aa53fc	bl 0x00c3ed40
00aa5400	cmp w0,#0x0
00aa5404	cset w0,eq
00aa5408	ldp x29,x30,[sp], #0x10
00aa540c	ret
