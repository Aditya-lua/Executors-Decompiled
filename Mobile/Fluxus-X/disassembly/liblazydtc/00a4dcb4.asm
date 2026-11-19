; OSSL_DECODER_CTX_set_cleanup @ 00a4dcb4
00a4dcb4	cbz x0,0x00a4dcc4
00a4dcb8	str x1,[x0, #0x28]
00a4dcbc	mov w0,#0x1
00a4dcc0	ret
00a4dcc4	stp x29,x30,[sp, #-0x10]!
00a4dcc8	mov x29,sp
00a4dccc	bl 0x00c342a0
00a4dcd0	adrp x0,0x2bd000
00a4dcd4	adrp x2,0x2aa000
00a4dcd8	add x0,x0,#0x9db
00a4dcdc	add x2,x2,#0x13e
00a4dce0	mov w1,#0x24e
00a4dce4	bl 0x00c342b0
00a4dce8	mov w1,#0x102
00a4dcec	orr w0,wzr,#0x3c
00a4dcf0	movk w1,#0xc, LSL #16
00a4dcf4	mov x2,xzr
00a4dcf8	bl 0x00c342c0
00a4dcfc	mov w0,wzr
00a4dd00	ldp x29,x30,[sp], #0x10
00a4dd04	ret
