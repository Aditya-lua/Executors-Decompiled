; CRYPTO_THREAD_lock_new @ 00aa5394
00aa5394	str x19,[sp, #-0x20]!
00aa5398	adrp x1,0x2d1000
00aa539c	add x1,x1,#0xde8
00aa53a0	orr w0,wzr,#0x38
00aa53a4	mov w2,#0x32
00aa53a8	stp x29,x30,[sp, #0x10]
00aa53ac	add x29,sp,#0x10
00aa53b0	bl 0x00c34250
00aa53b4	mov x19,x0
00aa53b8	cbz x0,0x00aa53e4
00aa53bc	mov x0,x19
00aa53c0	mov x1,xzr
00aa53c4	bl 0x00c3ed30
00aa53c8	cbz w0,0x00aa53e4
00aa53cc	adrp x1,0x2d1000
00aa53d0	add x1,x1,#0xde8
00aa53d4	orr w2,wzr,#0x38
00aa53d8	mov x0,x19
00aa53dc	bl 0x00c32310
00aa53e0	mov x19,xzr
00aa53e4	ldp x29,x30,[sp, #0x10]
00aa53e8	mov x0,x19
00aa53ec	ldr x19,[sp], #0x20
00aa53f0	ret
