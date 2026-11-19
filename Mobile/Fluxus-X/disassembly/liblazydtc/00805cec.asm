; _INIT_23 @ 00805cec
00805cec	adrp x8,0xd1a000
00805cf0	ldrb w9,[x8, #0xfa8]
00805cf4	tbnz w9,#0x0,0x00805d1c
00805cf8	adrp x9,0xcb4000
00805cfc	mov w11,#0x1
00805d00	ldr x9,[x9, #0x9b0]
00805d04	strb w11,[x8, #0xfa8]
00805d08	ldr w10,[x9]
00805d0c	add w8,w10,#0x1
00805d10	adrp x10,0xd1a000
00805d14	str w8,[x9]
00805d18	str w8,[x10, #0xfa0]
00805d1c	ret
