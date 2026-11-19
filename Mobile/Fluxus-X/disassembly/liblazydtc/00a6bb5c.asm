; EVP_PKEY_get0_RSA @ 00a6bb5c
00a6bb5c	stp x29,x30,[sp, #-0x10]!
00a6bb60	ldr w8,[x0]
00a6bb64	mov x29,sp
00a6bb68	cmp w8,#0x6
00a6bb6c	b.eq 0x00a6bb78
00a6bb70	cmp w8,#0x390
00a6bb74	b.ne 0x00a6bb84
00a6bb78	bl 0x00c3b2e0
00a6bb7c	ldp x29,x30,[sp], #0x10
00a6bb80	ret
00a6bb84	bl 0x00c342a0
00a6bb88	adrp x0,0x2b2000
00a6bb8c	adrp x2,0x2c7000
00a6bb90	add x0,x0,#0x267
00a6bb94	add x2,x2,#0x9da
00a6bb98	mov w1,#0x25
00a6bb9c	bl 0x00c342b0
00a6bba0	orr w0,wzr,#0x6
00a6bba4	orr w1,wzr,#0x7f
00a6bba8	mov x2,xzr
00a6bbac	bl 0x00c342c0
00a6bbb0	mov x0,xzr
00a6bbb4	ldp x29,x30,[sp], #0x10
00a6bbb8	ret
