; evp_pkey_get0_RSA_int @ 00a6bafc
00a6bafc	stp x29,x30,[sp, #-0x10]!
00a6bb00	ldr w8,[x0]
00a6bb04	mov x29,sp
00a6bb08	cmp w8,#0x6
00a6bb0c	b.eq 0x00a6bb18
00a6bb10	cmp w8,#0x390
00a6bb14	b.ne 0x00a6bb24
00a6bb18	bl 0x00c3b2e0
00a6bb1c	ldp x29,x30,[sp], #0x10
00a6bb20	ret
00a6bb24	bl 0x00c342a0
00a6bb28	adrp x0,0x2b2000
00a6bb2c	adrp x2,0x2c7000
00a6bb30	add x0,x0,#0x267
00a6bb34	add x2,x2,#0x9da
00a6bb38	mov w1,#0x25
00a6bb3c	bl 0x00c342b0
00a6bb40	orr w0,wzr,#0x6
00a6bb44	orr w1,wzr,#0x7f
00a6bb48	mov x2,xzr
00a6bb4c	bl 0x00c342c0
00a6bb50	mov x0,xzr
00a6bb54	ldp x29,x30,[sp], #0x10
00a6bb58	ret
