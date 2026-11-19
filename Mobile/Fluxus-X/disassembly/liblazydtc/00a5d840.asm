; evp_method_store_cache_flush @ 00a5d840
00a5d840	stp x29,x30,[sp, #-0x10]!
00a5d844	adrp x2,0xc5d000
00a5d848	add x2,x2,#0x6b8
00a5d84c	mov w1,wzr
00a5d850	mov x29,sp
00a5d854	bl 0x00c3b520
00a5d858	cbz x0,0x00a5d864
00a5d85c	ldp x29,x30,[sp], #0x10
00a5d860	b 0x00c3b570
00a5d864	mov w0,#0x1
00a5d868	ldp x29,x30,[sp], #0x10
00a5d86c	ret
