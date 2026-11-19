; CRYPTO_THREAD_write_lock @ 00aa5410
00aa5410	stp x29,x30,[sp, #-0x10]!
00aa5414	mov x29,sp
00aa5418	bl 0x00c3ed60
00aa541c	cmp w0,#0x0
00aa5420	cset w0,eq
00aa5424	ldp x29,x30,[sp], #0x10
00aa5428	ret
