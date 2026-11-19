; _INIT_85 @ 00817fdc
00817fdc	movi v0.2D,#0x0
00817fe0	adrp x1,0xd1c000
00817fe4	add x1,x1,#0x358
00817fe8	mov w8,#0x3f800000
00817fec	nop
00817ff0	adr x0,0x7fbc70
00817ff4	adrp x2,0xc48000
00817ff8	add x2,x2,#0x880
00817ffc	str w8,[x1, #0x20]
00818000	stp q0,q0,[x1]
00818004	b 0x00c2fe70
