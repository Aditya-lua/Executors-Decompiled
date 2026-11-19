; EVP_PKEY_get0_DH @ 00a6dcbc
00a6dcbc	stp x29,x30,[sp, #-0x10]!
00a6dcc0	ldr w8,[x0]
00a6dcc4	mov x29,sp
00a6dcc8	cmp w8,#0x1c
00a6dccc	b.eq 0x00a6dcd8
00a6dcd0	cmp w8,#0x398
00a6dcd4	b.ne 0x00a6dce4
00a6dcd8	bl 0x00a6d87c
00a6dcdc	ldp x29,x30,[sp], #0x10
00a6dce0	ret
00a6dce4	bl 0x00c342a0
00a6dce8	adrp x0,0x2c1000
00a6dcec	adrp x2,0x2d5000
00a6dcf0	add x0,x0,#0xcf9
00a6dcf4	add x2,x2,#0xd07
00a6dcf8	mov w1,#0x3b4
00a6dcfc	bl 0x00c342b0
00a6dd00	orr w0,wzr,#0x6
00a6dd04	mov w1,#0x80
00a6dd08	mov x2,xzr
00a6dd0c	bl 0x00c342c0
00a6dd10	mov x0,xzr
00a6dd14	ldp x29,x30,[sp], #0x10
00a6dd18	ret
