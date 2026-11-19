; EVP_PKEY_get0_poly1305 @ 00a6d940
00a6d940	str x19,[sp, #-0x20]!
00a6d944	stp x29,x30,[sp, #0x10]
00a6d948	ldr w8,[x0]
00a6d94c	add x29,sp,#0x10
00a6d950	cmp w8,#0x425
00a6d954	b.ne 0x00a6d974
00a6d958	mov x19,x1
00a6d95c	bl 0x00a6d87c
00a6d960	cbz x0,0x00a6d9a4
00a6d964	ldrsw x8,[x0]
00a6d968	str x8,[x19]
00a6d96c	ldr x0,[x0, #0x8]
00a6d970	b 0x00a6d9a4
00a6d974	bl 0x00c342a0
00a6d978	adrp x0,0x2c1000
00a6d97c	adrp x2,0x2b9000
00a6d980	add x0,x0,#0xcf9
00a6d984	add x2,x2,#0xe82
00a6d988	mov w1,#0x32f
00a6d98c	bl 0x00c342b0
00a6d990	orr w0,wzr,#0x6
00a6d994	mov w1,#0xa4
00a6d998	mov x2,xzr
00a6d99c	bl 0x00c342c0
00a6d9a0	mov x0,xzr
00a6d9a4	ldp x29,x30,[sp, #0x10]
00a6d9a8	ldr x19,[sp], #0x20
00a6d9ac	ret
