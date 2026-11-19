; mbedtls_cipher_info_from_values @ 00b69af8
00b69af8	adrp x9,0xcb5000
00b69afc	ldr x9,[x9, #0xa88]
00b69b00	ldr x8,[x9, #0x8]
00b69b04	cbz x8,0x00b69b48
00b69b08	adrp x10,0xcb5000
00b69b0c	ldr x10,[x10, #0xa80]
00b69b10	add x9,x9,#0x18
00b69b14	ldr w11,[x8, #0x8]
00b69b18	ubfx w12,w11,#0x1a,#0x5
00b69b1c	ldr x12,[x10, w12, UXTW #0x3]
00b69b20	lsr w13,w11,#0x2
00b69b24	and w13,w13,#0x3c0
00b69b28	ubfx w11,w11,#0xc,#0x4
00b69b2c	ldr w12,[x12]
00b69b30	cmp w12,w0
00b69b34	ccmp w13,w1,#0x0,eq
00b69b38	ccmp w11,w2,#0x0,eq
00b69b3c	b.eq 0x00b69b48
00b69b40	ldr x8,[x9], #0x10
00b69b44	cbnz x8,0x00b69b14
00b69b48	mov x0,x8
00b69b4c	ret
