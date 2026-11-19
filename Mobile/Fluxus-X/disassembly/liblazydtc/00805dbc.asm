; _INIT_27 @ 00805dbc
00805dbc	adrp x8,0xd1a000
00805dc0	ldrb w9,[x8, #0xfe8]
00805dc4	tbnz w9,#0x0,0x00805dec
00805dc8	adrp x9,0xcb4000
00805dcc	mov w11,#0x1
00805dd0	ldr x9,[x9, #0x9b0]
00805dd4	strb w11,[x8, #0xfe8]
00805dd8	ldr w10,[x9]
00805ddc	add w8,w10,#0x1
00805de0	adrp x10,0xd1a000
00805de4	str w8,[x9]
00805de8	str w8,[x10, #0xfe0]
00805dec	ret
