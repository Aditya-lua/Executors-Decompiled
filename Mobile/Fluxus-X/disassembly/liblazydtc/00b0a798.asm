; X509_STORE_up_ref @ 00b0a798
00b0a798	add x8,x0,#0x90
00b0a79c	ldxr w9,[x8]
00b0a7a0	add w10,w9,#0x1
00b0a7a4	stxr w11,w10,[x8]
00b0a7a8	cbnz w11,0x00b0a79c
00b0a7ac	cmp w9,#0x0
00b0a7b0	cset w0,gt
00b0a7b4	ret
