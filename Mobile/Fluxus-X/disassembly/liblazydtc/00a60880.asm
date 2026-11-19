; EVP_PKEY_add1_attr @ 00a60880
00a60880	stp x29,x30,[sp, #-0x10]!
00a60884	add x0,x0,#0x40
00a60888	mov x29,sp
00a6088c	bl 0x00c37ef0
00a60890	cmp x0,#0x0
00a60894	cset w0,ne
00a60898	ldp x29,x30,[sp], #0x10
00a6089c	ret
