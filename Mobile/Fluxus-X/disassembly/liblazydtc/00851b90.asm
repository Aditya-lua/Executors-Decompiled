; _INIT_125 @ 00851b90
00851b90	adrp x8,0xd1e000
00851b94	ldrb w9,[x8, #0xb08]
00851b98	tbnz w9,#0x0,0x00851bbc
00851b9c	adrp x9,0xd1e000
00851ba0	mov w11,#0x1
00851ba4	ldr w10,[x9, #0x930]
00851ba8	strb w11,[x8, #0xb08]
00851bac	add w8,w10,#0x1
00851bb0	adrp x10,0xd1e000
00851bb4	str w8,[x9, #0x930]
00851bb8	str w8,[x10, #0xb00]
00851bbc	ret
