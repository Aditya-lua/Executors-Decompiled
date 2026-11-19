; EVP_PKEY_CTX_get_rsa_mgf1_md @ 00ad299c
00ad299c	mov x5,x1
00ad29a0	cbz x0,0x00ad29c0
00ad29a4	ldr x8,[x0, #0x78]
00ad29a8	cbz x8,0x00ad29c0
00ad29ac	ldr w8,[x8]
00ad29b0	cmp w8,#0x390
00ad29b4	b.eq 0x00ad29c0
00ad29b8	cmp w8,#0x6
00ad29bc	b.ne 0x00ad29d4
00ad29c0	mov w1,#0xffffffff
00ad29c4	orr w2,wzr,#0x7f0
00ad29c8	mov w3,#0x1008
00ad29cc	mov w4,wzr
00ad29d0	b 0x00c370f0
00ad29d4	mov w0,#0xffffffff
00ad29d8	ret
