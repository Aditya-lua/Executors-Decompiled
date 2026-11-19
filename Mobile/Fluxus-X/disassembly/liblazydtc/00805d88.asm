; _INIT_26 @ 00805d88
00805d88	adrp x8,0xd1a000
00805d8c	ldrb w9,[x8, #0xfd8]
00805d90	tbnz w9,#0x0,0x00805db8
00805d94	adrp x9,0xcb4000
00805d98	mov w11,#0x1
00805d9c	ldr x9,[x9, #0x9b0]
00805da0	strb w11,[x8, #0xfd8]
00805da4	ldr w10,[x9]
00805da8	add w8,w10,#0x1
00805dac	adrp x10,0xd1a000
00805db0	str w8,[x9]
00805db4	str w8,[x10, #0xfd0]
00805db8	ret
