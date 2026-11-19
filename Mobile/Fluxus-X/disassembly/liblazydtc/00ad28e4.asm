; EVP_PKEY_CTX_set_rsa_mgf1_md @ 00ad28e4
00ad28e4	mov x5,x1
00ad28e8	cbz x0,0x00ad2908
00ad28ec	ldr x8,[x0, #0x78]
00ad28f0	cbz x8,0x00ad2908
00ad28f4	ldr w8,[x8]
00ad28f8	cmp w8,#0x390
00ad28fc	b.eq 0x00ad2908
00ad2900	cmp w8,#0x6
00ad2904	b.ne 0x00ad291c
00ad2908	mov w1,#0xffffffff
00ad290c	orr w2,wzr,#0x7f0
00ad2910	mov w3,#0x1005
00ad2914	mov w4,wzr
00ad2918	b 0x00c370f0
00ad291c	mov w0,#0xffffffff
00ad2920	ret
