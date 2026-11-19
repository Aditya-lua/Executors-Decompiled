; d2i_PKCS8PrivateKey_fp @ 00ab9578
00ab9578	stp x22,x21,[sp, #-0x30]!
00ab957c	mov x21,x1
00ab9580	mov w1,wzr
00ab9584	stp x20,x19,[sp, #0x10]
00ab9588	stp x29,x30,[sp, #0x20]
00ab958c	add x29,sp,#0x20
00ab9590	mov x19,x3
00ab9594	mov x20,x2
00ab9598	bl 0x00c37810
00ab959c	cbz x0,0x00ab95c8
00ab95a0	mov x1,x21
00ab95a4	mov x2,x20
00ab95a8	mov x3,x19
00ab95ac	mov x22,x0
00ab95b0	bl 0x00ab912c
00ab95b4	mov x19,x0
00ab95b8	mov x0,x22
00ab95bc	bl 0x00c31a40
00ab95c0	mov x0,x19
00ab95c4	b 0x00ab95fc
00ab95c8	bl 0x00c342a0
00ab95cc	adrp x0,0x2d6000
00ab95d0	adrp x2,0x2c4000
00ab95d4	add x0,x0,#0x469
00ab95d8	add x2,x2,#0xea
00ab95dc	mov w1,#0x103
00ab95e0	bl 0x00c342b0
00ab95e4	mov w1,#0x7
00ab95e8	mov w0,#0x9
00ab95ec	movk w1,#0x8, LSL #16
00ab95f0	mov x2,xzr
00ab95f4	bl 0x00c342c0
00ab95f8	mov x0,xzr
00ab95fc	ldp x29,x30,[sp, #0x20]
00ab9600	ldp x20,x19,[sp, #0x10]
00ab9604	ldp x22,x21,[sp], #0x30
00ab9608	ret
