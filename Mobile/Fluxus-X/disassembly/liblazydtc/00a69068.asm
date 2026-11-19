; EVP_MAC_up_ref @ 00a69068
00a69068	add x8,x0,#0x20
00a6906c	ldxr w9,[x8]
00a69070	add w9,w9,#0x1
00a69074	stxr w10,w9,[x8]
00a69078	cbnz w10,0x00a6906c
00a6907c	mov w0,#0x1
00a69080	ret
