; EVP_PKEY_set1_engine @ 00a6d568
00a6d568	stp x20,x19,[sp, #-0x20]!
00a6d56c	mov x19,x1
00a6d570	mov x20,x0
00a6d574	stp x29,x30,[sp, #0x10]
00a6d578	add x29,sp,#0x10
00a6d57c	cbz x1,0x00a6d59c
00a6d580	mov x0,x19
00a6d584	bl 0x00c323b0
00a6d588	cbz w0,0x00a6d5b0
00a6d58c	ldr w1,[x20]
00a6d590	mov x0,x19
00a6d594	bl 0x00c3bd60
00a6d598	cbz x0,0x00a6d5dc
00a6d59c	ldr x0,[x20, #0x18]
00a6d5a0	bl 0x00c32360
00a6d5a4	mov w0,#0x1
00a6d5a8	str x19,[x20, #0x18]
00a6d5ac	b 0x00a6d614
00a6d5b0	bl 0x00c342a0
00a6d5b4	adrp x0,0x2c1000
00a6d5b8	adrp x2,0x2b5000
00a6d5bc	add x0,x0,#0xcf9
00a6d5c0	add x2,x2,#0xcb6
00a6d5c4	mov w1,#0x2b7
00a6d5c8	bl 0x00c342b0
00a6d5cc	mov w1,#0x26
00a6d5d0	orr w0,wzr,#0x6
00a6d5d4	movk w1,#0x8, LSL #16
00a6d5d8	b 0x00a6d608
00a6d5dc	mov x0,x19
00a6d5e0	bl 0x00c32360
00a6d5e4	bl 0x00c342a0
00a6d5e8	adrp x0,0x2c1000
00a6d5ec	adrp x2,0x2b5000
00a6d5f0	add x0,x0,#0xcf9
00a6d5f4	add x2,x2,#0xcb6
00a6d5f8	mov w1,#0x2bc
00a6d5fc	bl 0x00c342b0
00a6d600	orr w0,wzr,#0x6
00a6d604	mov w1,#0x9c
00a6d608	mov x2,xzr
00a6d60c	bl 0x00c342c0
00a6d610	mov w0,wzr
00a6d614	ldp x29,x30,[sp, #0x10]
00a6d618	ldp x20,x19,[sp], #0x20
00a6d61c	ret
