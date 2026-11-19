; OSSL_DECODER_CTX_set_construct_data @ 00a4dc60
00a4dc60	cbz x0,0x00a4dc70
00a4dc64	str x1,[x0, #0x30]
00a4dc68	mov w0,#0x1
00a4dc6c	ret
00a4dc70	stp x29,x30,[sp, #-0x10]!
00a4dc74	mov x29,sp
00a4dc78	bl 0x00c342a0
00a4dc7c	adrp x0,0x2bd000
00a4dc80	adrp x2,0x2d1000
00a4dc84	add x0,x0,#0x9db
00a4dc88	add x2,x2,#0x92c
00a4dc8c	mov w1,#0x243
00a4dc90	bl 0x00c342b0
00a4dc94	mov w1,#0x102
00a4dc98	orr w0,wzr,#0x3c
00a4dc9c	movk w1,#0xc, LSL #16
00a4dca0	mov x2,xzr
00a4dca4	bl 0x00c342c0
00a4dca8	mov w0,wzr
00a4dcac	ldp x29,x30,[sp], #0x10
00a4dcb0	ret
