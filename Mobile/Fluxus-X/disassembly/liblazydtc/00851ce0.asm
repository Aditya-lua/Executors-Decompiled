; _INIT_132 @ 00851ce0
00851ce0	adrp x8,0xd1e000
00851ce4	ldrb w9,[x8, #0xb78]
00851ce8	tbnz w9,#0x0,0x00851d0c
00851cec	adrp x9,0xd1e000
00851cf0	mov w11,#0x1
00851cf4	ldr w10,[x9, #0x930]
00851cf8	strb w11,[x8, #0xb78]
00851cfc	add w8,w10,#0x1
00851d00	adrp x10,0xd1e000
00851d04	str w8,[x9, #0x930]
00851d08	str w8,[x10, #0xb70]
00851d0c	ret
