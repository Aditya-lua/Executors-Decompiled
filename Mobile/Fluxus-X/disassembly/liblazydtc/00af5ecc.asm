; X509v3_addr_get_afi @ 00af5ecc
00af5ecc	cbz x0,0x00af5efc
00af5ed0	ldr x9,[x0]
00af5ed4	cbz x9,0x00af5f00
00af5ed8	ldr x8,[x9, #0x8]
00af5edc	cbz x8,0x00af5f08
00af5ee0	ldr w9,[x9]
00af5ee4	mov w0,wzr
00af5ee8	cmp w9,#0x2
00af5eec	b.lt 0x00af5efc
00af5ef0	ldrb w9,[x8]
00af5ef4	ldrb w0,[x8, #0x1]
00af5ef8	bfm w0,w9,#0x18,#0x7
00af5efc	ret
00af5f00	mov w0,wzr
00af5f04	ret
00af5f08	mov w0,wzr
00af5f0c	ret
