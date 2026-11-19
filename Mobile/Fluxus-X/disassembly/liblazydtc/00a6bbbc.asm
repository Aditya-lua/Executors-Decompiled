; EVP_PKEY_get1_RSA @ 00a6bbbc
00a6bbbc	str x19,[sp, #-0x20]!
00a6bbc0	stp x29,x30,[sp, #0x10]
00a6bbc4	ldr w8,[x0]
00a6bbc8	add x29,sp,#0x10
00a6bbcc	cmp w8,#0x6
00a6bbd0	b.eq 0x00a6bbdc
00a6bbd4	cmp w8,#0x390
00a6bbd8	b.ne 0x00a6bbf4
00a6bbdc	bl 0x00c3b2e0
00a6bbe0	mov x19,x0
00a6bbe4	cbz x0,0x00a6bc24
00a6bbe8	mov x0,x19
00a6bbec	bl 0x00c3d900
00a6bbf0	b 0x00a6bc24
00a6bbf4	bl 0x00c342a0
00a6bbf8	adrp x0,0x2b2000
00a6bbfc	adrp x2,0x2c7000
00a6bc00	add x0,x0,#0x267
00a6bc04	add x2,x2,#0x9da
00a6bc08	mov w1,#0x25
00a6bc0c	bl 0x00c342b0
00a6bc10	orr w0,wzr,#0x6
00a6bc14	orr w1,wzr,#0x7f
00a6bc18	mov x2,xzr
00a6bc1c	bl 0x00c342c0
00a6bc20	mov x19,xzr
00a6bc24	ldp x29,x30,[sp, #0x10]
00a6bc28	mov x0,x19
00a6bc2c	ldr x19,[sp], #0x20
00a6bc30	ret
