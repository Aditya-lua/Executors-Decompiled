; _INIT_36 @ 00805f90
00805f90	adrp x8,0xd1b000
00805f94	ldrb w9,[x8, #0x78]
00805f98	tbnz w9,#0x0,0x00805fc0
00805f9c	adrp x9,0xcb4000
00805fa0	mov w11,#0x1
00805fa4	ldr x9,[x9, #0x9b0]
00805fa8	strb w11,[x8, #0x78]
00805fac	ldr w10,[x9]
00805fb0	add w8,w10,#0x1
00805fb4	adrp x10,0xd1b000
00805fb8	str w8,[x9]
00805fbc	str w8,[x10, #0x70]
00805fc0	ret
