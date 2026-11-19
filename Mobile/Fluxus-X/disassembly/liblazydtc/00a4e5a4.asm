; OSSL_DECODER_up_ref @ 00a4e5a4
00a4e5a4	add x8,x0,#0x28
00a4e5a8	ldxr w9,[x8]
00a4e5ac	add w9,w9,#0x1
00a4e5b0	stxr w10,w9,[x8]
00a4e5b4	cbnz w10,0x00a4e5a8
00a4e5b8	mov w0,#0x1
00a4e5bc	ret
