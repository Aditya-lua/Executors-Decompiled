; ossl_provider_default_props_update @ 00aa4630
00aa4630	stp x22,x21,[sp, #-0x30]!
00aa4634	adrp x2,0xc6d000
00aa4638	stp x20,x19,[sp, #0x10]
00aa463c	mov x19,x1
00aa4640	add x2,x2,#0x4c8
00aa4644	mov w1,#0x1
00aa4648	stp x29,x30,[sp, #0x20]
00aa464c	add x29,sp,#0x20
00aa4650	bl 0x00c3b520
00aa4654	cbz x0,0x00aa46b4
00aa4658	mov x20,x0
00aa465c	ldr x0,[x0, #0x20]
00aa4660	bl 0x00c35680
00aa4664	cbz w0,0x00aa46e8
00aa4668	ldr x0,[x20, #0x10]
00aa466c	bl 0x00c325e0
00aa4670	cmp w0,#0x1
00aa4674	b.lt 0x00aa46a4
00aa4678	mov w21,w0
00aa467c	mov w22,wzr
00aa4680	ldr x0,[x20, #0x10]
00aa4684	mov w1,w22
00aa4688	bl 0x00c32610
00aa468c	ldp x8,x1,[x0, #0x18]
00aa4690	mov x0,x19
00aa4694	blr x8
00aa4698	add w22,w22,#0x1
00aa469c	cmp w21,w22
00aa46a0	b.ne 0x00aa4680
00aa46a4	ldr x0,[x20, #0x20]
00aa46a8	bl 0x00c35690
00aa46ac	mov w0,#0x1
00aa46b0	b 0x00aa46e8
00aa46b4	bl 0x00c342a0
00aa46b8	adrp x0,0x2aa000
00aa46bc	adrp x2,0x2bb000
00aa46c0	add x0,x0,#0x4b5
00aa46c4	add x2,x2,#0xf7d
00aa46c8	mov w1,#0x156
00aa46cc	bl 0x00c342b0
00aa46d0	mov w1,#0x103
00aa46d4	orr w0,wzr,#0xf
00aa46d8	movk w1,#0xc, LSL #16
00aa46dc	mov x2,xzr
00aa46e0	bl 0x00c342c0
00aa46e4	mov w0,wzr
00aa46e8	ldp x29,x30,[sp, #0x20]
00aa46ec	ldp x20,x19,[sp, #0x10]
00aa46f0	ldp x22,x21,[sp], #0x30
00aa46f4	ret
