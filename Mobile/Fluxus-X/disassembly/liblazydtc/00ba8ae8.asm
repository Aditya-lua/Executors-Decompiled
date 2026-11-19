; mbedtls_rsa_pkcs1_verify @ 00ba8ae8
00ba8ae8	mov x6,x4
00ba8aec	orr w8,w2,w1
00ba8af0	cbz w8,0x00ba8b00
00ba8af4	cbnz x3,0x00ba8b00
00ba8af8	mov w0,#0xffffbf80
00ba8afc	ret
00ba8b00	ldr w8,[x0, #0xe0]
00ba8b04	cmp w8,#0x1
00ba8b08	b.eq 0x00ba8b18
00ba8b0c	cbnz w8,0x00ba8b2c
00ba8b10	mov x4,x6
00ba8b14	b 0x00c434a0
00ba8b18	ldr w8,[x0, #0xe4]
00ba8b1c	mov w5,#0xffffffff
00ba8b20	cmp w8,#0x0
00ba8b24	csel w4,w1,w8,eq
00ba8b28	b 0x00c433a0
00ba8b2c	mov w0,#0xffffbf00
00ba8b30	ret
