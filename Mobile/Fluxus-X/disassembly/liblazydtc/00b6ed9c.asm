; mbedtls_aes_crypt_ecb @ 00b6ed9c
00b6ed9c	stp x29,x30,[sp, #-0x10]!
00b6eda0	mov x29,sp
00b6eda4	cmp w1,#0x1
00b6eda8	b.ls 0x00b6edb8
00b6edac	orr w0,wzr,#0xffffffdf
00b6edb0	ldp x29,x30,[sp], #0x10
00b6edb4	ret
00b6edb8	cbz w1,0x00b6edcc
00b6edbc	mov x1,x2
00b6edc0	mov x2,x3
00b6edc4	bl 0x00c419a0
00b6edc8	b 0x00b6edd8
00b6edcc	mov x1,x2
00b6edd0	mov x2,x3
00b6edd4	bl 0x00c41990
00b6edd8	mov w0,wzr
00b6eddc	ldp x29,x30,[sp], #0x10
00b6ede0	ret
