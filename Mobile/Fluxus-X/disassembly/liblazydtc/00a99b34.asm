; CRYPTO_free @ 00a99b34
00a99b34	adrp x8,0xcc9000
00a99b38	ldr x3,[x8, #0x148]
00a99b3c	adrp x8,0xcb4000
00a99b40	ldr x8,[x8, #0xe60]
00a99b44	cmp x3,x8
00a99b48	b.eq 0x00a99b50
00a99b4c	br x3
00a99b50	b 0x00c30960
