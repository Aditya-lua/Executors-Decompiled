; _INIT_131 @ 00851cb0
00851cb0	adrp x8,0xd1e000
00851cb4	ldrb w9,[x8, #0xb68]
00851cb8	tbnz w9,#0x0,0x00851cdc
00851cbc	adrp x9,0xd1e000
00851cc0	mov w11,#0x1
00851cc4	ldr w10,[x9, #0x930]
00851cc8	strb w11,[x8, #0xb68]
00851ccc	add w8,w10,#0x1
00851cd0	adrp x10,0xd1e000
00851cd4	str w8,[x9, #0x930]
00851cd8	str w8,[x10, #0xb60]
00851cdc	ret
