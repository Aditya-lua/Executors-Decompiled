; ix::WebSocketPerMessageDeflateOptions::startsWith @ 00992d28
00992d28	stp x20,x19,[sp, #-0x20]!
00992d2c	stp x29,x30,[sp, #0x10]
00992d30	add x29,sp,#0x10
00992d34	ldrb w9,[x1]
00992d38	ldp x10,x11,[x1, #0x8]
00992d3c	ldrb w8,[x0]
00992d40	ldr x12,[x0, #0x8]
00992d44	lsr w13,w9,#0x1
00992d48	tst w9,#0x1
00992d4c	lsr w9,w8,#0x1
00992d50	csel x19,x13,x10,eq
00992d54	csinc x1,x11,x1,ne
00992d58	tst w8,#0x1
00992d5c	csel x20,x9,x12,eq
00992d60	cmn x19,#0x1
00992d64	b.eq 0x00992da4
00992d68	cmp x20,x19
00992d6c	csel x2,x20,x19,cc
00992d70	cbz x2,0x00992d88
00992d74	ldr x9,[x0, #0x10]
00992d78	tst w8,#0x1
00992d7c	csinc x0,x9,x0,ne
00992d80	bl 0x00c300b0
00992d84	cbnz w0,0x00992d90
00992d88	cmp x20,x19
00992d8c	csetm w0,cc
00992d90	ldp x29,x30,[sp, #0x10]
00992d94	cmp w0,#0x0
00992d98	cset w0,eq
00992d9c	ldp x20,x19,[sp], #0x20
00992da0	ret
00992da4	bl 0x00c31420
