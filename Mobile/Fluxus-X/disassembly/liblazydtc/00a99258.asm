; ossl_init_thread @ 00a99258
00a99258	stp x29,x30,[sp, #-0x10]!
00a9925c	adrp x0,0xcc9000
00a99260	adrp x1,0xa99000
00a99264	add x0,x0,#0x130
00a99268	add x1,x1,#0x284
00a9926c	mov x29,sp
00a99270	bl 0x00c38370
00a99274	cmp w0,#0x0
00a99278	cset w0,ne
00a9927c	ldp x29,x30,[sp], #0x10
00a99280	ret
