; _INIT_126 @ 00851bc0
00851bc0	adrp x8,0xd1e000
00851bc4	ldrb w9,[x8, #0xb18]
00851bc8	tbnz w9,#0x0,0x00851bec
00851bcc	adrp x9,0xd1e000
00851bd0	mov w11,#0x1
00851bd4	ldr w10,[x9, #0x930]
00851bd8	strb w11,[x8, #0xb18]
00851bdc	add w8,w10,#0x1
00851be0	adrp x10,0xd1e000
00851be4	str w8,[x9, #0x930]
00851be8	str w8,[x10, #0xb10]
00851bec	ret
