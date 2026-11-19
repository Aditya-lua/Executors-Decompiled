; EVP_PKEY_CTX_get_rsa_pss_saltlen @ 00ad2c3c
00ad2c3c	mov x5,x1
00ad2c40	cbz x0,0x00ad2c60
00ad2c44	ldr x8,[x0, #0x78]
00ad2c48	cbz x8,0x00ad2c60
00ad2c4c	ldr w8,[x8]
00ad2c50	cmp w8,#0x390
00ad2c54	b.eq 0x00ad2c60
00ad2c58	cmp w8,#0x6
00ad2c5c	b.ne 0x00ad2c74
00ad2c60	mov w1,#0xffffffff
00ad2c64	orr w2,wzr,#0x1f0
00ad2c68	mov w3,#0x1007
00ad2c6c	mov w4,wzr
00ad2c70	b 0x00c370f0
00ad2c74	mov w0,#0xffffffff
00ad2c78	ret
