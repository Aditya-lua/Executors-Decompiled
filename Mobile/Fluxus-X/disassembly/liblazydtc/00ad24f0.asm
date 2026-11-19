; EVP_PKEY_CTX_get_rsa_padding @ 00ad24f0
00ad24f0	mov x5,x1
00ad24f4	cbz x0,0x00ad2514
00ad24f8	ldr x8,[x0, #0x78]
00ad24fc	cbz x8,0x00ad2514
00ad2500	ldr w8,[x8]
00ad2504	cmp w8,#0x390
00ad2508	b.eq 0x00ad2514
00ad250c	cmp w8,#0x6
00ad2510	b.ne 0x00ad2528
00ad2514	mov w1,#0xffffffff
00ad2518	mov w2,#0xffffffff
00ad251c	mov w3,#0x1006
00ad2520	mov w4,wzr
00ad2524	b 0x00c370f0
00ad2528	mov w0,#0xffffffff
00ad252c	ret
