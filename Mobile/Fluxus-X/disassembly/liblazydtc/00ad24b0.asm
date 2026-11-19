; EVP_PKEY_CTX_set_rsa_padding @ 00ad24b0
00ad24b0	mov w4,w1
00ad24b4	cbz x0,0x00ad24d4
00ad24b8	ldr x8,[x0, #0x78]
00ad24bc	cbz x8,0x00ad24d4
00ad24c0	ldr w8,[x8]
00ad24c4	cmp w8,#0x390
00ad24c8	b.eq 0x00ad24d4
00ad24cc	cmp w8,#0x6
00ad24d0	b.ne 0x00ad24e8
00ad24d4	mov w1,#0xffffffff
00ad24d8	mov w2,#0xffffffff
00ad24dc	mov w3,#0x1001
00ad24e0	mov x5,xzr
00ad24e4	b 0x00c370f0
00ad24e8	mov w0,#0xffffffff
00ad24ec	ret
