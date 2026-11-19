; X509_CRL_up_ref @ 00b14a04
00b14a04	add x8,x0,#0x80
00b14a08	ldxr w9,[x8]
00b14a0c	add w10,w9,#0x1
00b14a10	stxr w11,w10,[x8]
00b14a14	cbnz w11,0x00b14a08
00b14a18	cmp w9,#0x0
00b14a1c	cset w0,gt
00b14a20	ret
