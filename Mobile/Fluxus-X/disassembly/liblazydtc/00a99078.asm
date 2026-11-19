; ossl_err_load_CRYPTO_strings @ 00a99078
00a99078	stp x29,x30,[sp, #-0x10]!
00a9907c	mov w0,#0x75
00a99080	movk w0,#0x780, LSL #16
00a99084	mov x29,sp
00a99088	bl 0x00c35520
00a9908c	cbnz x0,0x00a9909c
00a99090	adrp x0,0xc6b000
00a99094	add x0,x0,#0xd88
00a99098	bl 0x00c35510
00a9909c	mov w0,#0x1
00a990a0	ldp x29,x30,[sp], #0x10
00a990a4	ret
