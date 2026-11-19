; mbedtls_cipher_setkey @ 00b69c3c
00b69c3c	cmp w3,#0x1
00b69c40	b.hi 0x00b69ca0
00b69c44	ldr x8,[x0]
00b69c48	cbz x8,0x00b69ca0
00b69c4c	ldr w9,[x8, #0x8]
00b69c50	tbnz w9,#0x19,0x00b69c64
00b69c54	lsr w9,w9,#0x2
00b69c58	and w9,w9,#0x3c0
00b69c5c	cmp w9,w2
00b69c60	b.ne 0x00b69ca0
00b69c64	stp w2,w3,[x0, #0x8]
00b69c68	ldr w8,[x8, #0x8]
00b69c6c	cmp w3,#0x1
00b69c70	b.eq 0x00b69c84
00b69c74	ubfx w9,w8,#0xc,#0x4
00b69c78	sub w9,w9,#0x3
00b69c7c	cmp w9,#0x2
00b69c80	b.hi 0x00b69ca8
00b69c84	adrp x9,0xcb5000
00b69c88	ldr x9,[x9, #0xa80]
00b69c8c	ubfx w8,w8,#0x1a,#0x5
00b69c90	ldr x0,[x0, #0x50]
00b69c94	ldr x8,[x9, w8, UXTW #0x3]
00b69c98	ldr x3,[x8, #0x40]
00b69c9c	br x3
00b69ca0	mov w0,#0xffff9f00
00b69ca4	ret
00b69ca8	adrp x9,0xcb5000
00b69cac	ldr x9,[x9, #0xa80]
00b69cb0	ubfx w8,w8,#0x1a,#0x5
00b69cb4	ldr x0,[x0, #0x50]
00b69cb8	ldr x8,[x9, w8, UXTW #0x3]
00b69cbc	ldr x3,[x8, #0x48]
00b69cc0	br x3
