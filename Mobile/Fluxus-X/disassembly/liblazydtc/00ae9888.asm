; OSSL_STORE_ctrl @ 00ae9888
00ae9888	sub sp,sp,#0x1a0
00ae988c	orr x8,xzr,#-0x7f00000080
00ae9890	stp x29,x30,[sp, #0x190]
00ae9894	add x29,sp,#0x190
00ae9898	movk x8,#0xffd0
00ae989c	add x9,sp,#0x10
00ae98a0	add x10,sp,#0x90
00ae98a4	stp x22,x21,[sp, #0x170]
00ae98a8	add x21,x29,#0x10
00ae98ac	str x8,[sp, #0xd8]
00ae98b0	add x8,x9,#0x80
00ae98b4	add x22,x10,#0x30
00ae98b8	stp x28,x23,[sp, #0x160]
00ae98bc	stp x20,x19,[sp, #0x180]
00ae98c0	stp q6,q7,[sp, #0x70]
00ae98c4	stp q4,q5,[sp, #0x50]
00ae98c8	stp q2,q3,[sp, #0x30]
00ae98cc	stp q0,q1,[sp, #0x10]
00ae98d0	stp x6,x7,[sp, #0xb0]
00ae98d4	stp x4,x5,[sp, #0xa0]
00ae98d8	stp x2,x3,[sp, #0x90]
00ae98dc	stp x22,x8,[sp, #0xc8]
00ae98e0	str x21,[sp, #0xc0]
00ae98e4	ldr x9,[x0, #0x8]
00ae98e8	ldr d0,[sp, #0xd8]
00ae98ec	mov x19,x0
00ae98f0	mov w20,w1
00ae98f4	cbz x9,0x00ae9980
00ae98f8	ldr x23,[x9, #0xa8]
00ae98fc	cbz x23,0x00ae99ac
00ae9900	sub x0,x29,#0x80
00ae9904	mov w2,#0x50
00ae9908	mov w1,wzr
00ae990c	str q0,[sp]
00ae9910	bl 0x00c301c0
00ae9914	cmp w20,#0x1
00ae9918	b.ne 0x00ae9970
00ae991c	ldr q0,[sp]
00ae9920	adrp x0,0x2a2000
00ae9924	add x0,x0,#0xcd8
00ae9928	sub x1,x29,#0x84
00ae992c	fmov w8,s0
00ae9930	add w9,w8,#0x8
00ae9934	cmp w9,#0x1
00ae9938	ccmp w8,#0x0,#0x0,lt
00ae993c	add x8,x22,w8, SXTW 
00ae9940	csel x8,x8,x21,lt
00ae9944	ldr x8,[x8]
00ae9948	ldr w8,[x8]
00ae994c	stur w8,[x29, #-0x84]
00ae9950	sub x8,x29,#0xb0
00ae9954	bl 0x00c36260
00ae9958	ldur x8,[x29, #-0x90]
00ae995c	ldp q1,q0,[x29, #-0xb0]
00ae9960	stur x8,[x29, #-0x60]
00ae9964	stp q1,q0,[x29, #-0x80]
00ae9968	ldr x8,[x19, #0x8]
00ae996c	ldr x23,[x8, #0xa8]
00ae9970	ldr x0,[x19, #0x10]
00ae9974	sub x1,x29,#0x80
00ae9978	blr x23
00ae997c	b 0x00ae99b0
00ae9980	ldr x9,[x19]
00ae9984	ldr x9,[x9, #0x20]
00ae9988	cbz x9,0x00ae99ac
00ae998c	ldr x0,[x19, #0x10]
00ae9990	sub x2,x29,#0x80
00ae9994	mov w1,w20
00ae9998	stp x21,x22,[x29, #-0x80]
00ae999c	stur x8,[x29, #-0x70]
00ae99a0	stur d0,[x29, #-0x68]
00ae99a4	blr x9
00ae99a8	b 0x00ae99b0
00ae99ac	mov w0,#0x1
00ae99b0	ldp x29,x30,[sp, #0x190]
00ae99b4	ldp x20,x19,[sp, #0x180]
00ae99b8	ldp x22,x21,[sp, #0x170]
00ae99bc	ldp x28,x23,[sp, #0x160]
00ae99c0	add sp,sp,#0x1a0
00ae99c4	ret
