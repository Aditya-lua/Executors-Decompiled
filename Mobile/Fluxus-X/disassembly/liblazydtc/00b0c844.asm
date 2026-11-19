; X509_up_ref @ 00b0c844
00b0c844	add x8,x0,#0xc0
00b0c848	ldxr w9,[x8]
00b0c84c	add w10,w9,#0x1
00b0c850	stxr w11,w10,[x8]
00b0c854	cbnz w11,0x00b0c848
00b0c858	cmp w9,#0x0
00b0c85c	cset w0,gt
00b0c860	ret
