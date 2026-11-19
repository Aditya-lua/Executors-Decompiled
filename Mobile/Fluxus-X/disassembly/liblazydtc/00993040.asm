; ix::WebSocketServer::WebSocketServer @ 00993040
00993040	stp x20,x19,[sp, #-0x20]!
00993044	stp x29,x30,[sp, #0x10]
00993048	add x29,sp,#0x10
0099304c	mov w19,w5
00993050	mov w5,w6
00993054	mov x20,x0
00993058	bl 0x00c33680
0099305c	adrp x8,0xcb5000
00993060	ldr x8,[x8, #0xe0]
00993064	mov w9,#0x101
00993068	strh w9,[x20, #0x240]
0099306c	add x9,x20,#0x2e0
00993070	add x8,x8,#0x10
00993074	str w19,[x20, #0x23c]
00993078	str xzr,[x20, #0x270]
0099307c	str xzr,[x20, #0x2a0]
00993080	str xzr,[x20, #0x2d0]
00993084	str xzr,[x20, #0x2c8]
00993088	str xzr,[x20, #0x2c0]
0099308c	str xzr,[x20, #0x2b8]
00993090	str xzr,[x20, #0x2b0]
00993094	str xzr,[x20, #0x2e8]
00993098	str xzr,[x20, #0x2e0]
0099309c	str x8,[x20]
009930a0	str x9,[x20, #0x2d8]
009930a4	ldp x29,x30,[sp, #0x10]
009930a8	ldp x20,x19,[sp], #0x20
009930ac	ret
