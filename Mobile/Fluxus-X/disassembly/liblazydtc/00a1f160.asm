; DH_up_ref @ 00a1f160
00a1f160	add x8,x0,#0x90
00a1f164	ldxr w9,[x8]
00a1f168	add w10,w9,#0x1
00a1f16c	stxr w11,w10,[x8]
00a1f170	cbnz w11,0x00a1f164
00a1f174	cmp w9,#0x0
00a1f178	cset w0,gt
00a1f17c	ret
