; mbedtls_chachapoly_self_test @ 00b6d5c4
00b6d5c4	str x28,[sp, #-0x40]!
00b6d5c8	stp x22,x21,[sp, #0x10]
00b6d5cc	stp x20,x19,[sp, #0x20]
00b6d5d0	stp x29,x30,[sp, #0x30]
00b6d5d4	add x29,sp,#0x30
00b6d5d8	sub sp,sp,#0x1d0
00b6d5dc	mrs x21,tpidr_el0
00b6d5e0	ldr x8,[x21, #0x28]
00b6d5e4	add x9,sp,#0xd8
00b6d5e8	mov w19,w0
00b6d5ec	add x20,x9,#0x88
00b6d5f0	add x22,x9,#0xd8
00b6d5f4	stur x8,[x29, #-0x38]
00b6d5f8	cbz w0,0x00b6d60c
00b6d5fc	adrp x0,0x2d4000
00b6d600	add x0,x0,#0x968
00b6d604	mov w1,wzr
00b6d608	bl 0x00c41af0
00b6d60c	add x0,sp,#0xd8
00b6d610	bl 0x00c42080
00b6d614	mov x0,x20
00b6d618	bl 0x00c42270
00b6d61c	adrp x1,0x77c000
00b6d620	add x1,x1,#0xfc4
00b6d624	add x0,sp,#0xd8
00b6d628	stp xzr,xzr,[x22]
00b6d62c	str xzr,[x22, #0x10]
00b6d630	bl 0x00c42090
00b6d634	mov w1,w0
00b6d638	cbz w0,0x00b6d64c
00b6d63c	cbz w19,0x00b6d694
00b6d640	adrp x0,0x2a8000
00b6d644	add x0,x0,#0xec1
00b6d648	b 0x00b6d690
00b6d64c	adrp x2,0x77c000
00b6d650	adrp x3,0x77c000
00b6d654	adrp x5,0x77c000
00b6d658	add x2,x2,#0xfe4
00b6d65c	add x3,x3,#0xff0
00b6d660	add x5,x5,#0xffc
00b6d664	add x0,sp,#0xd8
00b6d668	mov w1,#0x72
00b6d66c	orr w4,wzr,#0xc
00b6d670	add x6,sp,#0x10
00b6d674	mov x7,sp
00b6d678	bl 0x00c420d0
00b6d67c	mov w1,w0
00b6d680	cbz w0,0x00b6d6c0
00b6d684	cbz w19,0x00b6d694
00b6d688	adrp x0,0x2c4000
00b6d68c	add x0,x0,#0x8c9
00b6d690	bl 0x00c41af0
00b6d694	mov w0,#0xffffffff
00b6d698	ldr x8,[x21, #0x28]
00b6d69c	ldur x9,[x29, #-0x38]
00b6d6a0	cmp x8,x9
00b6d6a4	b.ne 0x00b6d74c
00b6d6a8	add sp,sp,#0x1d0
00b6d6ac	ldp x29,x30,[sp, #0x30]
00b6d6b0	ldp x20,x19,[sp, #0x20]
00b6d6b4	ldp x22,x21,[sp, #0x10]
00b6d6b8	ldr x28,[sp], #0x40
00b6d6bc	ret
00b6d6c0	adrp x1,0x77d000
00b6d6c4	add x1,x1,#0x6e
00b6d6c8	add x0,sp,#0x10
00b6d6cc	mov w2,#0x72
00b6d6d0	bl 0x00c300b0
00b6d6d4	cbz w0,0x00b6d6e8
00b6d6d8	cbz w19,0x00b6d694
00b6d6dc	adrp x0,0x746000
00b6d6e0	add x0,x0,#0x3a0
00b6d6e4	b 0x00b6d70c
00b6d6e8	adrp x1,0x77d000
00b6d6ec	add x1,x1,#0xe0
00b6d6f0	mov x0,sp
00b6d6f4	mov w2,#0x10
00b6d6f8	bl 0x00c300b0
00b6d6fc	cbz w0,0x00b6d714
00b6d700	cbz w19,0x00b6d694
00b6d704	adrp x0,0x746000
00b6d708	add x0,x0,#0x310
00b6d70c	bl 0x00c30760
00b6d710	b 0x00b6d694
00b6d714	add x0,sp,#0xd8
00b6d718	bl 0x00c42070
00b6d71c	mov x0,x20
00b6d720	bl 0x00c42260
00b6d724	stp xzr,xzr,[x22]
00b6d728	str xzr,[x22, #0x10]
00b6d72c	cbz w19,0x00b6d744
00b6d730	adrp x0,0x77c000
00b6d734	add x0,x0,#0x87c
00b6d738	bl 0x00c30760
00b6d73c	mov w0,#0xa
00b6d740	bl 0x00c42240
00b6d744	mov w0,wzr
00b6d748	b 0x00b6d698
00b6d74c	bl 0x00c2fec0
