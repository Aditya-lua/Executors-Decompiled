; _INIT_33 @ 00805ef4
00805ef4	adrp x8,0xd1b000
00805ef8	ldrb w9,[x8, #0x48]
00805efc	tbnz w9,#0x0,0x00805f24
00805f00	adrp x9,0xcb4000
00805f04	mov w11,#0x1
00805f08	ldr x9,[x9, #0x9b0]
00805f0c	strb w11,[x8, #0x48]
00805f10	ldr w10,[x9]
00805f14	add w8,w10,#0x1
00805f18	adrp x10,0xd1b000
00805f1c	str w8,[x9]
00805f20	str w8,[x10, #0x40]
00805f24	ret
