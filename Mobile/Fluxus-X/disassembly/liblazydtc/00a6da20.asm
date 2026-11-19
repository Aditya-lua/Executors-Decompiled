; EVP_PKEY_get0_DSA @ 00a6da20
00a6da20	stp x29,x30,[sp, #-0x10]!
00a6da24	ldr w8,[x0]
00a6da28	mov x29,sp
00a6da2c	cmp w8,#0x74
00a6da30	b.ne 0x00a6da40
00a6da34	bl 0x00a6d87c
00a6da38	ldp x29,x30,[sp], #0x10
00a6da3c	ret
00a6da40	bl 0x00c342a0
00a6da44	adrp x0,0x2c1000
00a6da48	adrp x2,0x2cd000
00a6da4c	add x0,x0,#0xcf9
00a6da50	add x2,x2,#0xb13
00a6da54	mov w1,#0x351
00a6da58	bl 0x00c342b0
00a6da5c	orr w0,wzr,#0x6
00a6da60	mov w1,#0x81
00a6da64	mov x2,xzr
00a6da68	bl 0x00c342c0
00a6da6c	mov x0,xzr
00a6da70	ldp x29,x30,[sp], #0x10
00a6da74	ret
