; EVP_KEYEXCH_up_ref @ 00a63104
00a63104	add x8,x0,#0x20
00a63108	ldxr w9,[x8]
00a6310c	add w9,w9,#0x1
00a63110	stxr w10,w9,[x8]
00a63114	cbnz w10,0x00a63108
00a63118	mov w0,#0x1
00a6311c	ret
