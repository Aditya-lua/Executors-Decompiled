; mbedtls_md_update @ 00b78c3c
00b78c3c	cbz x0,0x00b78c74
00b78c40	ldr x8,[x0]
00b78c44	cbz x8,0x00b78c74
00b78c48	ldr w8,[x8]
00b78c4c	sub w8,w8,#0x3
00b78c50	cmp w8,#0x10
00b78c54	b.hi 0x00b78c74
00b78c58	adrp x9,0x77f000
00b78c5c	add x9,x9,#0xb40
00b78c60	ldrsw x8,[x9, x8, LSL #0x2]
00b78c64	add x8,x8,x9
00b78c68	br x8
00b78c6c	ldr x0,[x0, #0x8]
00b78c70	b 0x00c42b30
00b78c74	mov w0,#0xffffaf00
00b78c78	ret
00b78c7c	ldr x0,[x0, #0x8]
00b78c80	b 0x00c42ad0
00b78c84	ldr x0,[x0, #0x8]
00b78c88	b 0x00c42ba0
00b78c8c	ldr x0,[x0, #0x8]
00b78c90	b 0x00c42940
00b78c94	ldr x0,[x0, #0x8]
00b78c98	b 0x00c429f0
00b78c9c	ldr x0,[x0, #0x8]
00b78ca0	b 0x00c42a60
