; OSSL_DECODER_CTX_set_input_type @ 00a4d378
00a4d378	cbz x0,0x00a4d388
00a4d37c	str x1,[x0]
00a4d380	mov w0,#0x1
00a4d384	ret
00a4d388	stp x29,x30,[sp, #-0x10]!
00a4d38c	mov x29,sp
00a4d390	bl 0x00c342a0
00a4d394	adrp x0,0x2bd000
00a4d398	adrp x2,0x2a0000
00a4d39c	add x0,x0,#0x9db
00a4d3a0	add x2,x2,#0x18c
00a4d3a4	mov w1,#0xb8
00a4d3a8	bl 0x00c342b0
00a4d3ac	mov w1,#0x102
00a4d3b0	orr w0,wzr,#0x3c
00a4d3b4	movk w1,#0xc, LSL #16
00a4d3b8	mov x2,xzr
00a4d3bc	bl 0x00c342c0
00a4d3c0	mov w0,wzr
00a4d3c4	ldp x29,x30,[sp], #0x10
00a4d3c8	ret
