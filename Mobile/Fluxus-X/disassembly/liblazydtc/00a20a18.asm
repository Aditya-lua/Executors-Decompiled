; DSA_up_ref @ 00a20a18
00a20a18	add x8,x0,#0x88
00a20a1c	ldxr w9,[x8]
00a20a20	add w10,w9,#0x1
00a20a24	stxr w11,w10,[x8]
00a20a28	cbnz w11,0x00a20a1c
00a20a2c	cmp w9,#0x0
00a20a30	cset w0,gt
00a20a34	ret
