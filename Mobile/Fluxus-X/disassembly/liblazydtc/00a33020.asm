; EC_ec_pre_comp_dup @ 00a33020
00a33020	cbz x0,0x00a33038
00a33024	add x8,x0,#0x30
00a33028	ldxr w9,[x8]
00a3302c	add w9,w9,#0x1
00a33030	stxr w10,w9,[x8]
00a33034	cbnz w10,0x00a33028
00a33038	ret
