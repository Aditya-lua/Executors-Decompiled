; SSL_up_ref @ 009b24f4
009b24f4	add x8,x0,#0x9e0
009b24f8	ldxr w9,[x8]
009b24fc	add w10,w9,#0x1
009b2500	stxr w11,w10,[x8]
009b2504	cbnz w11,0x009b24f8
009b2508	cmp w9,#0x0
009b250c	cset w0,gt
009b2510	ret
