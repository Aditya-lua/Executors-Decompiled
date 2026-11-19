; mbedtls_nist_kw_unwrap @ 00b7a9d8
00b7a9d8	sub sp,sp,#0x70
00b7a9dc	stp x24,x23,[sp, #0x30]
00b7a9e0	stp x22,x21,[sp, #0x40]
00b7a9e4	stp x20,x19,[sp, #0x50]
00b7a9e8	stp x29,x30,[sp, #0x60]
00b7a9ec	add x29,sp,#0x60
00b7a9f0	mrs x23,tpidr_el0
00b7a9f4	ldr x9,[x23, #0x28]
00b7a9f8	sub x22,x3,#0x8
00b7a9fc	mov x19,x5
00b7aa00	mov x20,x4
00b7aa04	mov x8,x2
00b7aa08	cmp x22,x6
00b7aa0c	str x9,[sp, #0x28]
00b7aa10	str xzr,[x5]
00b7aa14	b.ls 0x00b7aa20
00b7aa18	mov w21,#0xffff9f00
00b7aa1c	b 0x00b7ab24
00b7aa20	cmp w1,#0x1
00b7aa24	b.eq 0x00b7aa90
00b7aa28	cbnz w1,0x00b7aaf4
00b7aa2c	mov x10,#-0x18
00b7aa30	sub x9,x3,#0x18
00b7aa34	movk x10,#0x1ff, LSL #48
00b7aa38	cmp x9,x10
00b7aa3c	mov w21,#0xffff9f00
00b7aa40	b.hi 0x00b7ab24
00b7aa44	and x9,x3,#0x7
00b7aa48	cbnz x9,0x00b7ab24
00b7aa4c	lsr x2,x3,#0x3
00b7aa50	add x3,sp,#0x8
00b7aa54	mov x1,x8
00b7aa58	mov x4,x20
00b7aa5c	mov x5,x19
00b7aa60	bl 0x00b7ac30
00b7aa64	mov w21,w0
00b7aa68	cbnz w0,0x00b7aaf8
00b7aa6c	adrp x0,0x77f000
00b7aa70	add x0,x0,#0xf78
00b7aa74	add x1,sp,#0x8
00b7aa78	mov w2,#0x8
00b7aa7c	bl 0x00c42190
00b7aa80	str w0,[sp, #0x4]
00b7aa84	cbz w0,0x00b7ac24
00b7aa88	mov w21,#0xffff9d00
00b7aa8c	b 0x00b7aaf8
00b7aa90	sub x9,x3,#0x10
00b7aa94	orr w10,wzr,#0xfffffff0
00b7aa98	cmp x9,x10
00b7aa9c	mov w21,#0xffff9f00
00b7aaa0	b.hi 0x00b7ab24
00b7aaa4	and x9,x3,#0x7
00b7aaa8	cbnz x9,0x00b7ab24
00b7aaac	cmp x3,#0x10
00b7aab0	b.ne 0x00b7ab50
00b7aab4	mov w2,#0x10
00b7aab8	add x3,sp,#0x18
00b7aabc	add x4,sp,#0x10
00b7aac0	mov x1,x8
00b7aac4	bl 0x00c42180
00b7aac8	mov w21,w0
00b7aacc	cbnz w0,0x00b7aaf8
00b7aad0	ldp x8,x9,[sp, #0x18]
00b7aad4	add x0,sp,#0x18
00b7aad8	mov w1,#0x10
00b7aadc	str x8,[sp, #0x8]
00b7aae0	str x9,[x20]
00b7aae4	bl 0x00c42220
00b7aae8	mov w8,#0x8
00b7aaec	str x8,[x19]
00b7aaf0	b 0x00b7ab70
00b7aaf4	mov w21,#0xffff9f80
00b7aaf8	ldr x2,[x19]
00b7aafc	mov x0,x20
00b7ab00	mov w1,wzr
00b7ab04	bl 0x00c301c0
00b7ab08	str xzr,[x19]
00b7ab0c	add x0,sp,#0x4
00b7ab10	mov w1,#0x4
00b7ab14	bl 0x00c42220
00b7ab18	add x0,sp,#0x8
00b7ab1c	mov w1,#0x8
00b7ab20	bl 0x00c42220
00b7ab24	ldr x8,[x23, #0x28]
00b7ab28	ldr x9,[sp, #0x28]
00b7ab2c	cmp x8,x9
00b7ab30	b.ne 0x00b7ac2c
00b7ab34	mov w0,w21
00b7ab38	ldp x29,x30,[sp, #0x60]
00b7ab3c	ldp x20,x19,[sp, #0x50]
00b7ab40	ldp x22,x21,[sp, #0x40]
00b7ab44	ldp x24,x23,[sp, #0x30]
00b7ab48	add sp,sp,#0x70
00b7ab4c	ret
00b7ab50	lsr x2,x3,#0x3
00b7ab54	add x3,sp,#0x8
00b7ab58	mov x1,x8
00b7ab5c	mov x4,x20
00b7ab60	mov x5,x19
00b7ab64	bl 0x00b7ac30
00b7ab68	mov w21,w0
00b7ab6c	cbnz w0,0x00b7aaf8
00b7ab70	adrp x0,0x77f000
00b7ab74	add x0,x0,#0xf80
00b7ab78	add x1,sp,#0x8
00b7ab7c	mov w2,#0x4
00b7ab80	bl 0x00c42190
00b7ab84	ldr w8,[sp, #0xc]
00b7ab88	orr w21,wzr,#0x7
00b7ab8c	cmp w0,#0x0
00b7ab90	mov w9,#0x6300
00b7ab94	rev w24,w8
00b7ab98	sub x8,x22,x24
00b7ab9c	str w0,[sp, #0x4]
00b7aba0	csel x10,xzr,x9,eq
00b7aba4	eor x11,x8,x21
00b7aba8	sub x21,x21,x8
00b7abac	bic x21,x21,x11
00b7abb0	and x11,x11,x8
00b7abb4	orr x11,x21,x11
00b7abb8	asr x21,x11,#0x3f
00b7abbc	and x9,x9,x21
00b7abc0	mvn x21,x21
00b7abc4	and x21,x21,x10
00b7abc8	orr x21,x9,x21
00b7abcc	str xzr,[sp, #0x18]
00b7abd0	ldr x9,[x19]
00b7abd4	mov w10,#0x8
00b7abd8	and x22,x8,#0x7
00b7abdc	sub x3,x10,x22
00b7abe0	add x8,x20,x9
00b7abe4	sub x0,x8,#0x8
00b7abe8	add x1,sp,#0x18
00b7abec	mov w2,#0x8
00b7abf0	mov x4,xzr
00b7abf4	bl 0x00c423e0
00b7abf8	cmp w0,#0x0
00b7abfc	mov w8,#0xffff9d00
00b7ac00	csneg w21,w8,w21,ne
00b7ac04	str w0,[sp, #0x4]
00b7ac08	cbnz w21,0x00b7aaf8
00b7ac0c	add x0,x20,x24
00b7ac10	mov w1,wzr
00b7ac14	mov x2,x22
00b7ac18	bl 0x00c301c0
00b7ac1c	str x24,[x19]
00b7ac20	b 0x00b7ab0c
00b7ac24	mov w21,wzr
00b7ac28	b 0x00b7ab0c
00b7ac2c	bl 0x00c2fec0
