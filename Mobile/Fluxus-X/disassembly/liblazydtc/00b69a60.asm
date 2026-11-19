; mbedtls_cipher_info_from_type @ 00b69a60
00b69a60	adrp x8,0xcb5000
00b69a64	ldr x8,[x8, #0xa88]
00b69a68	ldr x8,[x8, #0x8]
00b69a6c	cbz x8,0x00b69a90
00b69a70	adrp x9,0xcb5000
00b69a74	ldr x9,[x9, #0xa88]
00b69a78	ldr w10,[x9]
00b69a7c	cmp w10,w0
00b69a80	b.eq 0x00b69a90
00b69a84	ldr x8,[x9, #0x18]
00b69a88	add x9,x9,#0x10
00b69a8c	cbnz x8,0x00b69a78
00b69a90	mov x0,x8
00b69a94	ret
