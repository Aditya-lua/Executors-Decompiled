; _INIT_127 @ 00851bf0
00851bf0	adrp x8,0xd1e000
00851bf4	ldrb w9,[x8, #0xb28]
00851bf8	tbnz w9,#0x0,0x00851c1c
00851bfc	adrp x9,0xd1e000
00851c00	mov w11,#0x1
00851c04	ldr w10,[x9, #0x930]
00851c08	strb w11,[x8, #0xb28]
00851c0c	add w8,w10,#0x1
00851c10	adrp x10,0xd1e000
00851c14	str w8,[x9, #0x930]
00851c18	str w8,[x10, #0xb20]
00851c1c	ret
