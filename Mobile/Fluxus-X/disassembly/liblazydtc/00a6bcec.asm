; EVP_PKEY_get0_EC_KEY @ 00a6bcec
00a6bcec	str x19,[sp, #-0x20]!
00a6bcf0	stp x29,x30,[sp, #0x10]
00a6bcf4	add x29,sp,#0x10
00a6bcf8	mov x19,x0
00a6bcfc	bl 0x00c37cd0
00a6bd00	cmp w0,#0x198
00a6bd04	b.ne 0x00a6bd14
00a6bd08	mov x0,x19
00a6bd0c	bl 0x00c3b2e0
00a6bd10	b 0x00a6bd44
00a6bd14	bl 0x00c342a0
00a6bd18	adrp x0,0x2b2000
00a6bd1c	adrp x2,0x2d1000
00a6bd20	add x0,x0,#0x267
00a6bd24	add x2,x2,#0xa4f
00a6bd28	mov w1,#0x48
00a6bd2c	bl 0x00c342b0
00a6bd30	orr w0,wzr,#0x6
00a6bd34	mov w1,#0x8e
00a6bd38	mov x2,xzr
00a6bd3c	bl 0x00c342c0
00a6bd40	mov x0,xzr
00a6bd44	ldp x29,x30,[sp, #0x10]
00a6bd48	ldr x19,[sp], #0x20
00a6bd4c	ret
