; _INIT_22 @ 00805cb8
00805cb8	adrp x8,0xd1a000
00805cbc	ldrb w9,[x8, #0xf98]
00805cc0	tbnz w9,#0x0,0x00805ce8
00805cc4	adrp x9,0xcb4000
00805cc8	mov w11,#0x1
00805ccc	ldr x9,[x9, #0x9b0]
00805cd0	strb w11,[x8, #0xf98]
00805cd4	ldr w10,[x9]
00805cd8	add w8,w10,#0x1
00805cdc	adrp x10,0xd1a000
00805ce0	str w8,[x9]
00805ce4	str w8,[x10, #0xf90]
00805ce8	ret
