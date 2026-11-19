; OSSL_ENCODER_CTX_set_construct @ 00a625d8
00a625d8	cbz x0,0x00a625e8
00a625dc	str x1,[x0, #0x20]
00a625e0	mov w0,#0x1
00a625e4	ret
00a625e8	stp x29,x30,[sp, #-0x10]!
00a625ec	mov x29,sp
00a625f0	bl 0x00c342a0
00a625f4	adrp x0,0x2a0000
00a625f8	adrp x2,0x2c9000
00a625fc	add x0,x0,#0x26d
00a62600	add x2,x2,#0x968
00a62604	mov w1,#0x14f
00a62608	bl 0x00c342b0
00a6260c	mov w1,#0x102
00a62610	mov w0,#0x3b
00a62614	movk w1,#0xc, LSL #16
00a62618	mov x2,xzr
00a6261c	bl 0x00c342c0
00a62620	mov w0,wzr
00a62624	ldp x29,x30,[sp], #0x10
00a62628	ret
