; ossl_rsa_multip_cap @ 00ad328c
00ad328c	cmp w0,#0x400
00ad3290	b.ge 0x00ad329c
00ad3294	mov w0,#0x2
00ad3298	ret
00ad329c	cmp w0,#0x1, LSL #12
00ad32a0	b.ge 0x00ad32ac
00ad32a4	orr w0,wzr,#0x3
00ad32a8	ret
00ad32ac	cmp w0,#0x2, LSL #12
00ad32b0	mov w8,#0x4
00ad32b4	cinc w0,w8,ge
00ad32b8	ret
