; mbedtls_md_finish @ 00b78ca4
00b78ca4	cbz x0,0x00b78ce0
00b78ca8	ldr x8,[x0]
00b78cac	cbz x8,0x00b78ce0
00b78cb0	ldr w9,[x8]
00b78cb4	sub w9,w9,#0x3
00b78cb8	cmp w9,#0x10
00b78cbc	b.hi 0x00b78ce0
00b78cc0	adrp x10,0x77f000
00b78cc4	add x10,x10,#0xb84
00b78cc8	ldrsw x9,[x10, x9, LSL #0x2]
00b78ccc	add x9,x9,x10
00b78cd0	br x9
00b78cd4	ldr x0,[x0, #0x8]
00b78cd8	ldrb w2,[x8, #0x4]
00b78cdc	b 0x00c42af0
00b78ce0	mov w0,#0xffffaf00
00b78ce4	ret
00b78ce8	ldr x0,[x0, #0x8]
00b78cec	b 0x00c42a90
00b78cf0	ldr x0,[x0, #0x8]
00b78cf4	b 0x00c42b60
00b78cf8	ldr x0,[x0, #0x8]
00b78cfc	b 0x00c42900
00b78d00	ldr x0,[x0, #0x8]
00b78d04	b 0x00c429b0
00b78d08	ldr x0,[x0, #0x8]
00b78d0c	b 0x00c42a20
