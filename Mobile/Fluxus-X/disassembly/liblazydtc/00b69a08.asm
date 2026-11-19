; mbedtls_cipher_list @ 00b69a08
00b69a08	adrp x8,0xd23000
00b69a0c	ldrb w9,[x8, #0x8c8]
00b69a10	tbnz w9,#0x0,0x00b69a54
00b69a14	adrp x9,0xcb5000
00b69a18	ldr x9,[x9, #0xa88]
00b69a1c	ldr w10,[x9]
00b69a20	cbz w10,0x00b69a40
00b69a24	add x11,x9,#0x10
00b69a28	adrp x9,0xcb5000
00b69a2c	ldr x9,[x9, #0xa90]
00b69a30	str w10,[x9], #0x4
00b69a34	ldr w10,[x11], #0x10
00b69a38	cbnz w10,0x00b69a30
00b69a3c	b 0x00b69a48
00b69a40	adrp x9,0xcb5000
00b69a44	ldr x9,[x9, #0xa90]
00b69a48	str wzr,[x9]
00b69a4c	mov w9,#0x1
00b69a50	strb w9,[x8, #0x8c8]
00b69a54	adrp x0,0xcb5000
00b69a58	ldr x0,[x0, #0xa90]
00b69a5c	ret
