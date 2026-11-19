; mbedtls_cipher_setup @ 00b69bc8
00b69bc8	stp x20,x19,[sp, #-0x20]!
00b69bcc	stp x29,x30,[sp, #0x10]
00b69bd0	add x29,sp,#0x10
00b69bd4	mov x19,x1
00b69bd8	mov x20,x0
00b69bdc	cbz x1,0x00b69c24
00b69be0	orr w2,wzr,#0x60
00b69be4	mov x0,x20
00b69be8	mov w1,wzr
00b69bec	bl 0x00c301c0
00b69bf0	ldr w8,[x19, #0x8]
00b69bf4	adrp x9,0xcb5000
00b69bf8	ldr x9,[x9, #0xa80]
00b69bfc	ubfx w8,w8,#0x1a,#0x5
00b69c00	ldr x8,[x9, w8, UXTW #0x3]
00b69c04	ldr x8,[x8, #0x50]
00b69c08	cbz x8,0x00b69c18
00b69c0c	blr x8
00b69c10	str x0,[x20, #0x50]
00b69c14	cbz x0,0x00b69c2c
00b69c18	mov w0,wzr
00b69c1c	str x19,[x20]
00b69c20	b 0x00b69c30
00b69c24	mov w0,#0xffff9f00
00b69c28	b 0x00b69c30
00b69c2c	mov w0,#0xffff9e80
00b69c30	ldp x29,x30,[sp, #0x10]
00b69c34	ldp x20,x19,[sp], #0x20
00b69c38	ret
