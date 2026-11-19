; EVP_PKEY_CTX_set_rsa_pss_saltlen @ 00ad2bfc
00ad2bfc	mov w4,w1
00ad2c00	cbz x0,0x00ad2c20
00ad2c04	ldr x8,[x0, #0x78]
00ad2c08	cbz x8,0x00ad2c20
00ad2c0c	ldr w8,[x8]
00ad2c10	cmp w8,#0x390
00ad2c14	b.eq 0x00ad2c20
00ad2c18	cmp w8,#0x6
00ad2c1c	b.ne 0x00ad2c34
00ad2c20	mov w1,#0xffffffff
00ad2c24	orr w2,wzr,#0x1f0
00ad2c28	mov w3,#0x1002
00ad2c2c	mov x5,xzr
00ad2c30	b 0x00c370f0
00ad2c34	mov w0,#0xffffffff
00ad2c38	ret
