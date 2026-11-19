; _INIT_120 @ 00851aa0
00851aa0	adrp x8,0xd1e000
00851aa4	ldrb w9,[x8, #0xab8]
00851aa8	tbnz w9,#0x0,0x00851acc
00851aac	adrp x9,0xd1e000
00851ab0	mov w11,#0x1
00851ab4	ldr w10,[x9, #0x930]
00851ab8	strb w11,[x8, #0xab8]
00851abc	add w8,w10,#0x1
00851ac0	adrp x10,0xd1e000
00851ac4	str w8,[x9, #0x930]
00851ac8	str w8,[x10, #0xab0]
00851acc	ret
