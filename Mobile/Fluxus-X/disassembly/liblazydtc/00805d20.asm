; _INIT_24 @ 00805d20
00805d20	adrp x8,0xd1a000
00805d24	ldrb w9,[x8, #0xfb8]
00805d28	tbnz w9,#0x0,0x00805d50
00805d2c	adrp x9,0xcb4000
00805d30	mov w11,#0x1
00805d34	ldr x9,[x9, #0x9b0]
00805d38	strb w11,[x8, #0xfb8]
00805d3c	ldr w10,[x9]
00805d40	add w8,w10,#0x1
00805d44	adrp x10,0xd1a000
00805d48	str w8,[x9]
00805d4c	str w8,[x10, #0xfb0]
00805d50	ret
