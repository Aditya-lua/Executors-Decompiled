; _INIT_90 @ 00830eb0
00830eb0	movi v0.2D,#0x0
00830eb4	adrp x1,0xd1d000
00830eb8	add x1,x1,#0x790
00830ebc	mov w8,#0x3f800000
00830ec0	nop
00830ec4	adr x0,0x7fbc70
00830ec8	adrp x2,0xc48000
00830ecc	add x2,x2,#0x880
00830ed0	str w8,[x1, #0x20]
00830ed4	stp q0,q0,[x1]
00830ed8	b 0x00c2fe70
