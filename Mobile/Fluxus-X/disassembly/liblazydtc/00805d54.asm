; _INIT_25 @ 00805d54
00805d54	adrp x8,0xd1a000
00805d58	ldrb w9,[x8, #0xfc8]
00805d5c	tbnz w9,#0x0,0x00805d84
00805d60	adrp x9,0xcb4000
00805d64	mov w11,#0x1
00805d68	ldr x9,[x9, #0x9b0]
00805d6c	strb w11,[x8, #0xfc8]
00805d70	ldr w10,[x9]
00805d74	add w8,w10,#0x1
00805d78	adrp x10,0xd1a000
00805d7c	str w8,[x9]
00805d80	str w8,[x10, #0xfc0]
00805d84	ret
