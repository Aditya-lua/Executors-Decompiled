; ossl_decoder_ctx_add_decoder_inst @ 00a4d6dc
00a4d6dc	stp x20,x19,[sp, #-0x20]!
00a4d6e0	stp x29,x30,[sp, #0x10]
00a4d6e4	mov x20,x0
00a4d6e8	ldr x0,[x0, #0x18]
00a4d6ec	mov x19,x1
00a4d6f0	add x29,sp,#0x10
00a4d6f4	cbnz x0,0x00a4d704
00a4d6f8	bl 0x00c34780
00a4d6fc	str x0,[x20, #0x18]
00a4d700	cbz x0,0x00a4d720
00a4d704	mov x1,x19
00a4d708	bl 0x00c347a0
00a4d70c	cmp w0,#0x0
00a4d710	cset w0,gt
00a4d714	ldp x29,x30,[sp, #0x10]
00a4d718	ldp x20,x19,[sp], #0x20
00a4d71c	ret
00a4d720	bl 0x00c342a0
00a4d724	adrp x0,0x2bd000
00a4d728	adrp x2,0x2bf000
00a4d72c	add x0,x0,#0x9db
00a4d730	add x2,x2,#0xbf9
00a4d734	mov w1,#0x124
00a4d738	bl 0x00c342b0
00a4d73c	mov w1,#0x100
00a4d740	orr w0,wzr,#0x3c
00a4d744	movk w1,#0xc, LSL #16
00a4d748	mov x2,xzr
00a4d74c	bl 0x00c342c0
00a4d750	mov w0,wzr
00a4d754	b 0x00a4d714
