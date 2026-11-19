; OSSL_DECODER_CTX_set_input_structure @ 00a4d3cc
00a4d3cc	cbz x0,0x00a4d3dc
00a4d3d0	str x1,[x0, #0x8]
00a4d3d4	mov w0,#0x1
00a4d3d8	ret
00a4d3dc	stp x29,x30,[sp, #-0x10]!
00a4d3e0	mov x29,sp
00a4d3e4	bl 0x00c342a0
00a4d3e8	adrp x0,0x2bd000
00a4d3ec	adrp x2,0x2a5000
00a4d3f0	add x0,x0,#0x9db
00a4d3f4	add x2,x2,#0xe85
00a4d3f8	mov w1,#0xc8
00a4d3fc	bl 0x00c342b0
00a4d400	mov w1,#0x102
00a4d404	orr w0,wzr,#0x3c
00a4d408	movk w1,#0xc, LSL #16
00a4d40c	mov x2,xzr
00a4d410	bl 0x00c342c0
00a4d414	mov w0,wzr
00a4d418	ldp x29,x30,[sp], #0x10
00a4d41c	ret
