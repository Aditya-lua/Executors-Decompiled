; _INIT_121 @ 00851ad0
00851ad0	adrp x8,0xd1e000
00851ad4	ldrb w9,[x8, #0xac8]
00851ad8	tbnz w9,#0x0,0x00851afc
00851adc	adrp x9,0xd1e000
00851ae0	mov w11,#0x1
00851ae4	ldr w10,[x9, #0x930]
00851ae8	strb w11,[x8, #0xac8]
00851aec	add w8,w10,#0x1
00851af0	adrp x10,0xd1e000
00851af4	str w8,[x9, #0x930]
00851af8	str w8,[x10, #0xac0]
00851afc	ret
