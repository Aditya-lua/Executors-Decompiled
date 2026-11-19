; BIO_up_ref @ 009fbf80
009fbf80	add x8,x0,#0x58
009fbf84	ldxr w9,[x8]
009fbf88	add w10,w9,#0x1
009fbf8c	stxr w11,w10,[x8]
009fbf90	cbnz w11,0x009fbf84
009fbf94	cmp w9,#0x0
009fbf98	cset w0,gt
009fbf9c	ret
