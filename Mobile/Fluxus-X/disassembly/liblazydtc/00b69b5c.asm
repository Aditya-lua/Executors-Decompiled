; mbedtls_cipher_free @ 00b69b5c
00b69b5c	str x19,[sp, #-0x20]!
00b69b60	stp x29,x30,[sp, #0x10]
00b69b64	add x29,sp,#0x10
00b69b68	mov x19,x0
00b69b6c	cbz x0,0x00b69bbc
00b69b70	ldr x0,[x19, #0x58]
00b69b74	cbz x0,0x00b69b80
00b69b78	mov w1,#0x28
00b69b7c	bl 0x00c42230
00b69b80	ldr x0,[x19, #0x50]
00b69b84	cbz x0,0x00b69ba8
00b69b88	ldr x8,[x19]
00b69b8c	adrp x9,0xcb5000
00b69b90	ldr w8,[x8, #0x8]
00b69b94	ldr x9,[x9, #0xa80]
00b69b98	ubfx w8,w8,#0x1a,#0x5
00b69b9c	ldr x8,[x9, w8, UXTW #0x3]
00b69ba0	ldr x8,[x8, #0x58]
00b69ba4	blr x8
00b69ba8	ldp x29,x30,[sp, #0x10]
00b69bac	orr w1,wzr,#0x60
00b69bb0	mov x0,x19
00b69bb4	ldr x19,[sp], #0x20
00b69bb8	b 0x00c42220
00b69bbc	ldp x29,x30,[sp, #0x10]
00b69bc0	ldr x19,[sp], #0x20
00b69bc4	ret
