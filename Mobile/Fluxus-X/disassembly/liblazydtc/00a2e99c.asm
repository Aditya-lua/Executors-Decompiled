; EC_KEY_up_ref @ 00a2e99c
00a2e99c	add x8,x0,#0x38
00a2e9a0	ldxr w9,[x8]
00a2e9a4	add w10,w9,#0x1
00a2e9a8	stxr w11,w10,[x8]
00a2e9ac	cbnz w11,0x00a2e9a0
00a2e9b0	cmp w9,#0x0
00a2e9b4	cset w0,gt
00a2e9b8	ret
