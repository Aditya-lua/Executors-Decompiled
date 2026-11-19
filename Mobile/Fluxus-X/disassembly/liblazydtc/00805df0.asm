; _INIT_28 @ 00805df0
00805df0	adrp x8,0xd1a000
00805df4	ldrb w9,[x8, #0xff8]
00805df8	tbnz w9,#0x0,0x00805e20
00805dfc	adrp x9,0xcb4000
00805e00	mov w11,#0x1
00805e04	ldr x9,[x9, #0x9b0]
00805e08	strb w11,[x8, #0xff8]
00805e0c	ldr w10,[x9]
00805e10	add w8,w10,#0x1
00805e14	adrp x10,0xd1a000
00805e18	str w8,[x9]
00805e1c	str w8,[x10, #0xff0]
00805e20	ret
