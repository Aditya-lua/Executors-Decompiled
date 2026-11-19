; SSL_SESSION_up_ref @ 009bd2f4
009bd2f4	add x8,x0,#0x2d0
009bd2f8	ldxr w9,[x8]
009bd2fc	add w10,w9,#0x1
009bd300	stxr w11,w10,[x8]
009bd304	cbnz w11,0x009bd2f8
009bd308	cmp w9,#0x0
009bd30c	cset w0,gt
009bd310	ret
