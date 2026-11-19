; ossl_decoder_instance_new @ 00a4d420
00a4d420	str x23,[sp, #-0x40]!
00a4d424	stp x22,x21,[sp, #0x10]
00a4d428	stp x20,x19,[sp, #0x20]
00a4d42c	stp x29,x30,[sp, #0x30]
00a4d430	add x29,sp,#0x30
00a4d434	cbz x0,0x00a4d4dc
00a4d438	mov x21,x1
00a4d43c	adrp x1,0x2bd000
00a4d440	mov x20,x0
00a4d444	add x1,x1,#0x9db
00a4d448	mov w0,#0x28
00a4d44c	mov w2,#0xe2
00a4d450	bl 0x00c34250
00a4d454	mov x19,x0
00a4d458	cbz x0,0x00a4d514
00a4d45c	mov x0,x20
00a4d460	bl 0x00c3b3f0
00a4d464	bl 0x00c3b2f0
00a4d468	mov x22,x0
00a4d46c	mov x0,x20
00a4d470	bl 0x00c3b470
00a4d474	cbz x0,0x00a4d548
00a4d478	adrp x2,0x2a4000
00a4d47c	add x2,x2,#0x12
00a4d480	mov x1,x22
00a4d484	mov x23,x0
00a4d488	bl 0x00c3b480
00a4d48c	mov x1,x0
00a4d490	mov x0,x22
00a4d494	bl 0x00c3b490
00a4d498	str x0,[x19, #0x10]
00a4d49c	cbz x0,0x00a4d5a4
00a4d4a0	adrp x2,0x2bd000
00a4d4a4	add x2,x2,#0xa0b
00a4d4a8	mov x0,x23
00a4d4ac	mov x1,x22
00a4d4b0	bl 0x00c3b480
00a4d4b4	cbz x0,0x00a4d4c8
00a4d4b8	mov x1,x0
00a4d4bc	mov x0,x22
00a4d4c0	bl 0x00c3b490
00a4d4c4	str x0,[x19, #0x18]
00a4d4c8	mov x0,x20
00a4d4cc	bl 0x00c3b410
00a4d4d0	cbz w0,0x00a4d63c
00a4d4d4	stp x20,x21,[x19]
00a4d4d8	b 0x00a4d624
00a4d4dc	bl 0x00c342a0
00a4d4e0	adrp x0,0x2bd000
00a4d4e4	adrp x2,0x2cd000
00a4d4e8	add x0,x0,#0x9db
00a4d4ec	add x2,x2,#0x9b8
00a4d4f0	mov w1,#0xde
00a4d4f4	bl 0x00c342b0
00a4d4f8	mov w8,#0x100
00a4d4fc	movk w8,#0xc, LSL #16
00a4d500	add w1,w8,#0x2
00a4d504	orr w0,wzr,#0x3c
00a4d508	mov x2,xzr
00a4d50c	bl 0x00c342c0
00a4d510	b 0x00a4d620
00a4d514	bl 0x00c342a0
00a4d518	adrp x0,0x2bd000
00a4d51c	adrp x2,0x2cd000
00a4d520	add x0,x0,#0x9db
00a4d524	add x2,x2,#0x9b8
00a4d528	mov w1,#0xe3
00a4d52c	bl 0x00c342b0
00a4d530	mov w1,#0x100
00a4d534	orr w0,wzr,#0x3c
00a4d538	movk w1,#0xc, LSL #16
00a4d53c	mov x2,xzr
00a4d540	bl 0x00c342c0
00a4d544	b 0x00a4d624
00a4d548	bl 0x00c342a0
00a4d54c	adrp x0,0x2bd000
00a4d550	adrp x2,0x2cd000
00a4d554	add x0,x0,#0x9db
00a4d558	add x2,x2,#0x9b8
00a4d55c	mov w1,#0xeb
00a4d560	bl 0x00c342b0
00a4d564	mov x0,x20
00a4d568	bl 0x00c3b3d0
00a4d56c	adrp x2,0x2b4000
00a4d570	mov w1,#0x10e
00a4d574	mov x3,x0
00a4d578	add x2,x2,#0x1cf
00a4d57c	orr w0,wzr,#0x3c
00a4d580	movk w1,#0x8, LSL #16
00a4d584	bl 0x00c342c0
00a4d588	ldr x8,[x19]
00a4d58c	cbz x8,0x00a4d5fc
00a4d590	ldr x8,[x8, #0x40]
00a4d594	ldr x0,[x19, #0x8]
00a4d598	blr x8
00a4d59c	ldr x0,[x19]
00a4d5a0	b 0x00a4d600
00a4d5a4	bl 0x00c342a0
00a4d5a8	adrp x0,0x2bd000
00a4d5ac	adrp x2,0x2cd000
00a4d5b0	add x0,x0,#0x9db
00a4d5b4	add x2,x2,#0x9b8
00a4d5b8	mov w1,#0xf5
00a4d5bc	bl 0x00c342b0
00a4d5c0	mov x0,x20
00a4d5c4	bl 0x00c3b3d0
00a4d5c8	mov x21,x0
00a4d5cc	mov x0,x20
00a4d5d0	bl 0x00c3b3e0
00a4d5d4	adrp x2,0x2b7000
00a4d5d8	mov w1,#0x10e
00a4d5dc	mov x4,x0
00a4d5e0	add x2,x2,#0xb50
00a4d5e4	orr w0,wzr,#0x3c
00a4d5e8	movk w1,#0x8, LSL #16
00a4d5ec	mov x3,x21
00a4d5f0	bl 0x00c342c0
00a4d5f4	ldr x8,[x19]
00a4d5f8	cbnz x8,0x00a4d590
00a4d5fc	mov x0,xzr
00a4d600	str xzr,[x19, #0x8]
00a4d604	bl 0x00c3b3c0
00a4d608	adrp x1,0x2bd000
00a4d60c	add x1,x1,#0x9db
00a4d610	mov w2,#0x118
00a4d614	mov x0,x19
00a4d618	str xzr,[x19]
00a4d61c	bl 0x00c32310
00a4d620	mov x19,xzr
00a4d624	mov x0,x19
00a4d628	ldp x29,x30,[sp, #0x30]
00a4d62c	ldp x20,x19,[sp, #0x20]
00a4d630	ldp x22,x21,[sp, #0x10]
00a4d634	ldr x23,[sp], #0x40
00a4d638	ret
00a4d63c	bl 0x00c342a0
00a4d640	adrp x0,0x2bd000
00a4d644	adrp x2,0x2cd000
00a4d648	add x0,x0,#0x9db
00a4d64c	add x2,x2,#0x9b8
00a4d650	mov w1,#0x105
00a4d654	bl 0x00c342b0
00a4d658	mov w8,#0x100
00a4d65c	movk w8,#0xc, LSL #16
00a4d660	add w1,w8,#0x3
00a4d664	orr w0,wzr,#0x3c
00a4d668	mov x2,xzr
00a4d66c	bl 0x00c342c0
00a4d670	ldr x8,[x19]
00a4d674	cbnz x8,0x00a4d590
00a4d678	b 0x00a4d5fc
