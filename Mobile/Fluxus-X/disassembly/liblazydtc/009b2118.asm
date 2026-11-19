; SSL_CTX_up_ref @ 009b2118
009b2118	add x8,x0,#0xa4
009b211c	ldxr w9,[x8]
009b2120	add w10,w9,#0x1
009b2124	stxr w11,w10,[x8]
009b2128	cbnz w11,0x009b211c
009b212c	cmp w9,#0x0
009b2130	cset w0,gt
009b2134	ret
