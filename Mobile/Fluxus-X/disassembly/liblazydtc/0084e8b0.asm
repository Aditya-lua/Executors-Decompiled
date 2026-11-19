; _INIT_94 @ 0084e8b0
0084e8b0	movi v0.2D,#0x0
0084e8b4	adrp x1,0xd1e000
0084e8b8	add x1,x1,#0x8f8
0084e8bc	mov w8,#0x3f800000
0084e8c0	nop
0084e8c4	adr x0,0x7fbc70
0084e8c8	adrp x2,0xc48000
0084e8cc	add x2,x2,#0x880
0084e8d0	str w8,[x1, #0x20]
0084e8d4	stp q0,q0,[x1]
0084e8d8	b 0x00c2fe70
