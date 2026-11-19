; mbedtls_cipher_cmac_starts @ 00b9e62c
00b9e62c	str x19,[sp, #-0x20]!
00b9e630	stp x29,x30,[sp, #0x10]
00b9e634	add x29,sp,#0x10
00b9e638	mov x19,x0
00b9e63c	cbz x0,0x00b9e6b4
00b9e640	mov w0,#0xffff9f00
00b9e644	cbz x1,0x00b9e6b8
00b9e648	ldr x8,[x19]
00b9e64c	cbz x8,0x00b9e6b8
00b9e650	mov w3,#0x1
00b9e654	mov x0,x19
00b9e658	bl 0x00c302a0
00b9e65c	cbnz w0,0x00b9e6b8
00b9e660	ldr x8,[x19]
00b9e664	cbz x8,0x00b9e6b4
00b9e668	ldrb w8,[x8, #0xa]
00b9e66c	mov w0,#0xffff9f00
00b9e670	cmp w8,#0x24
00b9e674	b.hi 0x00b9e6b8
00b9e678	mov w9,#0x1
00b9e67c	lsl x8,x9,x8
00b9e680	mov x9,#0x1000000010
00b9e684	movk x9,#0x1c
00b9e688	tst x8,x9
00b9e68c	b.eq 0x00b9e6b8
00b9e690	mov w0,#0x1
00b9e694	mov w1,#0x28
00b9e698	bl 0x00c30a30
00b9e69c	cbz x0,0x00b9e6c4
00b9e6a0	mov w1,#0x10
00b9e6a4	str x0,[x19, #0x58]
00b9e6a8	bl 0x00c42220
00b9e6ac	mov w0,wzr
00b9e6b0	b 0x00b9e6b8
00b9e6b4	mov w0,#0xffff9f00
00b9e6b8	ldp x29,x30,[sp, #0x10]
00b9e6bc	ldr x19,[sp], #0x20
00b9e6c0	ret
00b9e6c4	mov w0,#0xffff9e80
00b9e6c8	b 0x00b9e6b8
