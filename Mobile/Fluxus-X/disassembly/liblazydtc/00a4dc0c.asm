; OSSL_DECODER_CTX_set_construct @ 00a4dc0c
00a4dc0c	cbz x0,0x00a4dc1c
00a4dc10	str x1,[x0, #0x20]
00a4dc14	mov w0,#0x1
00a4dc18	ret
00a4dc1c	stp x29,x30,[sp, #-0x10]!
00a4dc20	mov x29,sp
00a4dc24	bl 0x00c342a0
00a4dc28	adrp x0,0x2bd000
00a4dc2c	adrp x2,0x2d9000
00a4dc30	add x0,x0,#0x9db
00a4dc34	add x2,x2,#0xba7
00a4dc38	mov w1,#0x238
00a4dc3c	bl 0x00c342b0
00a4dc40	mov w1,#0x102
00a4dc44	orr w0,wzr,#0x3c
00a4dc48	movk w1,#0xc, LSL #16
00a4dc4c	mov x2,xzr
00a4dc50	bl 0x00c342c0
00a4dc54	mov w0,wzr
00a4dc58	ldp x29,x30,[sp], #0x10
00a4dc5c	ret
