; CRYPTO_THREAD_init_local @ 00aa549c
00aa549c	stp x29,x30,[sp, #-0x10]!
00aa54a0	mov x29,sp
00aa54a4	bl 0x00c3ecf0
00aa54a8	cmp w0,#0x0
00aa54ac	cset w0,eq
00aa54b0	ldp x29,x30,[sp], #0x10
00aa54b4	ret
