; RSA_up_ref @ 00ad16a0
00ad16a0	add x8,x0,#0xa0
00ad16a4	ldxr w9,[x8]
00ad16a8	add w10,w9,#0x1
00ad16ac	stxr w11,w10,[x8]
00ad16b0	cbnz w11,0x00ad16a4
00ad16b4	cmp w9,#0x0
00ad16b8	cset w0,gt
00ad16bc	ret
