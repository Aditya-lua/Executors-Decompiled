; CRYPTO_THREAD_cleanup_local @ 00aa54e0
00aa54e0	stp x29,x30,[sp, #-0x10]!
00aa54e4	ldr w0,[x0]
00aa54e8	mov x29,sp
00aa54ec	bl 0x00c3ed00
00aa54f0	cmp w0,#0x0
00aa54f4	cset w0,eq
00aa54f8	ldp x29,x30,[sp], #0x10
00aa54fc	ret
