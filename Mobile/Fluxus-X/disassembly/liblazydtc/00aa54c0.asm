; CRYPTO_THREAD_set_local @ 00aa54c0
00aa54c0	stp x29,x30,[sp, #-0x10]!
00aa54c4	ldr w0,[x0]
00aa54c8	mov x29,sp
00aa54cc	bl 0x00c30190
00aa54d0	cmp w0,#0x0
00aa54d4	cset w0,eq
00aa54d8	ldp x29,x30,[sp], #0x10
00aa54dc	ret
