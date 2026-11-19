; _INIT_130 @ 00851c80
00851c80	adrp x8,0xd1e000
00851c84	ldrb w9,[x8, #0xb58]
00851c88	tbnz w9,#0x0,0x00851cac
00851c8c	adrp x9,0xd1e000
00851c90	mov w11,#0x1
00851c94	ldr w10,[x9, #0x930]
00851c98	strb w11,[x8, #0xb58]
00851c9c	add w8,w10,#0x1
00851ca0	adrp x10,0xd1e000
00851ca4	str w8,[x9, #0x930]
00851ca8	str w8,[x10, #0xb50]
00851cac	ret
