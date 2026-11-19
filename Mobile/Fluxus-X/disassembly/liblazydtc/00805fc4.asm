; _INIT_37 @ 00805fc4
00805fc4	adrp x8,0xd1b000
00805fc8	ldrb w9,[x8, #0x88]
00805fcc	tbnz w9,#0x0,0x00805ff4
00805fd0	adrp x9,0xcb4000
00805fd4	mov w11,#0x1
00805fd8	ldr x9,[x9, #0x9b0]
00805fdc	strb w11,[x8, #0x88]
00805fe0	ldr w10,[x9]
00805fe4	add w8,w10,#0x1
00805fe8	adrp x10,0xd1b000
00805fec	str w8,[x9]
00805ff0	str w8,[x10, #0x80]
00805ff4	ret
