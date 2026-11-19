; FUN_00af464c @ 00af464c
00af464c	sub sp,sp,#0x50
00af4650	stp x23,xzr,[sp, #0x10]
00af4654	stp x22,x21,[sp, #0x20]
00af4658	stp x20,x19,[sp, #0x30]
00af465c	stp x29,x30,[sp, #0x40]
00af4660	ldr x8,[x0, #0x8]
00af4664	mov x21,x3
00af4668	mov w19,w2
00af466c	mov w20,w1
00af4670	add x29,sp,#0x40
00af4674	cbz x8,0x00af469c
00af4678	str xzr,[sp, #0x18]
00af467c	blr x8
00af4680	mov x2,x0
00af4684	add x1,sp,#0x18
00af4688	mov x0,x21
00af468c	bl 0x00c36170
00af4690	mov w22,w0
00af4694	tbz w0,#0x1f,0x00af46ec
00af4698	b 0x00af4730
00af469c	ldr x8,[x0, #0x28]
00af46a0	mov x23,x0
00af46a4	mov x0,x21
00af46a8	mov x1,xzr
00af46ac	blr x8
00af46b0	mov w22,w0
00af46b4	cmp w0,#0x1
00af46b8	b.lt 0x00af4730
00af46bc	adrp x1,0x2aa000
00af46c0	sxtw x0,w22
00af46c4	add x1,x1,#0x9f7
00af46c8	mov w2,#0x9f
00af46cc	bl 0x00c32320
00af46d0	str x0,[sp, #0x18]
00af46d4	cbz x0,0x00af4730
00af46d8	str x0,[sp, #0x8]
00af46dc	ldr x8,[x23, #0x28]
00af46e0	add x1,sp,#0x8
00af46e4	mov x0,x21
00af46e8	blr x8
00af46ec	bl 0x00c38170
00af46f0	mov x21,x0
00af46f4	cbz x0,0x00af4734
00af46f8	ldr x8,[sp, #0x18]
00af46fc	mov x0,xzr
00af4700	mov w1,w20
00af4704	mov w2,w19
00af4708	mov x3,x21
00af470c	str x8,[x21, #0x8]
00af4710	str xzr,[sp, #0x18]
00af4714	str w22,[x21]
00af4718	bl 0x00c407a0
00af471c	cbz x0,0x00af4734
00af4720	mov x19,x0
00af4724	mov x0,x21
00af4728	bl 0x00c35530
00af472c	b 0x00af4784
00af4730	mov x21,xzr
00af4734	bl 0x00c342a0
00af4738	adrp x19,0x2aa000
00af473c	add x19,x19,#0x9f7
00af4740	adrp x2,0x2d6000
00af4744	add x2,x2,#0x640
00af4748	mov w1,#0xb2
00af474c	mov x0,x19
00af4750	bl 0x00c342b0
00af4754	mov w1,#0x100
00af4758	mov w0,#0x22
00af475c	movk w1,#0xc, LSL #16
00af4760	mov x2,xzr
00af4764	bl 0x00c342c0
00af4768	ldr x0,[sp, #0x18]
00af476c	mov w2,#0xb3
00af4770	mov x1,x19
00af4774	bl 0x00c32310
00af4778	mov x0,x21
00af477c	bl 0x00c35530
00af4780	mov x19,xzr
00af4784	mov x0,x19
00af4788	ldp x29,x30,[sp, #0x40]
00af478c	ldp x20,x19,[sp, #0x30]
00af4790	ldp x22,x21,[sp, #0x20]
00af4794	ldr x23,[sp, #0x10]
00af4798	add sp,sp,#0x50
00af479c	ret
