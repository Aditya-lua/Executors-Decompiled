; _INIT_31 @ 00805e8c
00805e8c	adrp x8,0xd1b000
00805e90	ldrb w9,[x8, #0x28]
00805e94	tbnz w9,#0x0,0x00805ebc
00805e98	adrp x9,0xcb4000
00805e9c	mov w11,#0x1
00805ea0	ldr x9,[x9, #0x9b0]
00805ea4	strb w11,[x8, #0x28]
00805ea8	ldr w10,[x9]
00805eac	add w8,w10,#0x1
00805eb0	adrp x10,0xd1b000
00805eb4	str w8,[x9]
00805eb8	str w8,[x10, #0x20]
00805ebc	ret
