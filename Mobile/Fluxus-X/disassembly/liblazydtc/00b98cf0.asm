; mbedtls_psa_cipher_set_iv @ 00b98cf0
00b98cf0	ldrb w8,[x0, #0x4]
00b98cf4	cmp x8,x2
00b98cf8	b.ne 0x00b98d14
00b98cfc	stp x29,x30,[sp, #-0x10]!
00b98d00	mov x29,sp
00b98d04	add x0,x0,#0x8
00b98d08	bl 0x00c42170
00b98d0c	ldp x29,x30,[sp], #0x10
00b98d10	b 0x00c42bf0
00b98d14	mov w0,#0xffffff79
00b98d18	ret
