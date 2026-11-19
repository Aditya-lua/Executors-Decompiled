; X509_STORE_CTX_get_by_subject @ 00b0aa34
00b0aa34	sub sp,sp,#0x1f0
00b0aa38	stp x28,x25,[sp, #0x1a0]
00b0aa3c	stp x24,x23,[sp, #0x1b0]
00b0aa40	stp x22,x21,[sp, #0x1c0]
00b0aa44	stp x20,x19,[sp, #0x1d0]
00b0aa48	stp x29,x30,[sp, #0x1e0]
00b0aa4c	ldr x25,[x0]
00b0aa50	add x29,sp,#0x1e0
00b0aa54	cbz x25,0x00b0abc4
00b0aa58	str wzr,[sp]
00b0aa5c	str xzr,[sp, #0x8]
00b0aa60	mov x21,x0
00b0aa64	ldr x0,[x25, #0x98]
00b0aa68	mov x19,x3
00b0aa6c	mov x20,x2
00b0aa70	mov w22,w1
00b0aa74	bl 0x00c356a0
00b0aa78	cbz w0,0x00b0abec
00b0aa7c	ldr x23,[x25, #0x8]
00b0aa80	stur w22,[x29, #-0x50]
00b0aa84	cbz w22,0x00b0aaa8
00b0aa88	cmp w22,#0x2
00b0aa8c	b.eq 0x00b0aabc
00b0aa90	cmp w22,#0x1
00b0aa94	b.ne 0x00b0aacc
00b0aa98	add x8,sp,#0x10
00b0aa9c	stur x8,[x29, #-0x48]
00b0aaa0	add x8,x8,#0x48
00b0aaa4	b 0x00b0aac8
00b0aaa8	mov w1,#0xffffffff
00b0aaac	cmn w1,#0x1
00b0aab0	b.ne 0x00b0aae8
00b0aab4	mov x23,xzr
00b0aab8	b 0x00b0aaf4
00b0aabc	add x8,sp,#0x10
00b0aac0	stur x8,[x29, #-0x48]
00b0aac4	add x8,x8,#0x18
00b0aac8	str x20,[x8]
00b0aacc	sub x1,x29,#0x50
00b0aad0	mov x0,x23
00b0aad4	mov x2,xzr
00b0aad8	bl 0x00c40220
00b0aadc	mov w1,w0
00b0aae0	cmn w1,#0x1
00b0aae4	b.eq 0x00b0aab4
00b0aae8	mov x0,x23
00b0aaec	bl 0x00c32610
00b0aaf0	mov x23,x0
00b0aaf4	ldr x0,[x25, #0x98]
00b0aaf8	bl 0x00c35690
00b0aafc	cmp w22,#0x2
00b0ab00	b.eq 0x00b0ab08
00b0ab04	cbnz x23,0x00b0aba0
00b0ab08	ldr x0,[x25, #0x10]
00b0ab0c	bl 0x00c325e0
00b0ab10	cmp w0,#0x1
00b0ab14	b.lt 0x00b0ab9c
00b0ab18	mov w24,wzr
00b0ab1c	ldr x0,[x25, #0x10]
00b0ab20	mov w1,w24
00b0ab24	bl 0x00c32610
00b0ab28	ldr w8,[x0, #0x4]
00b0ab2c	cbz w8,0x00b0ab48
00b0ab30	ldr x0,[x25, #0x10]
00b0ab34	add w24,w24,#0x1
00b0ab38	bl 0x00c325e0
00b0ab3c	cmp w24,w0
00b0ab40	b.lt 0x00b0ab1c
00b0ab44	b 0x00b0ab9c
00b0ab48	ldr x8,[x0, #0x8]
00b0ab4c	cbz x8,0x00b0ab30
00b0ab50	ldp x4,x5,[x21, #0x100]
00b0ab54	ldr x9,[x8, #0x30]
00b0ab58	ldr x8,[x8, #0x50]
00b0ab5c	cbz x9,0x00b0ab7c
00b0ab60	cbnz x8,0x00b0ab80
00b0ab64	mov x3,sp
00b0ab68	mov w1,w22
00b0ab6c	mov x2,x20
00b0ab70	blr x9
00b0ab74	cbz w0,0x00b0ab30
00b0ab78	b 0x00b0ab94
00b0ab7c	cbz x8,0x00b0ab30
00b0ab80	mov x3,sp
00b0ab84	mov w1,w22
00b0ab88	mov x2,x20
00b0ab8c	blr x8
00b0ab90	cbz w0,0x00b0ab30
00b0ab94	mov x23,sp
00b0ab98	b 0x00b0aba0
00b0ab9c	cbz x23,0x00b0abc4
00b0aba0	ldr w8,[x23]
00b0aba4	cmp w8,#0x2
00b0aba8	b.eq 0x00b0abcc
00b0abac	cmp w8,#0x1
00b0abb0	b.ne 0x00b0abdc
00b0abb4	ldr x0,[x23, #0x8]
00b0abb8	bl 0x00c350b0
00b0abbc	cbnz w0,0x00b0abd8
00b0abc0	b 0x00b0abec
00b0abc4	mov w0,wzr
00b0abc8	b 0x00b0abec
00b0abcc	ldr x0,[x23, #0x8]
00b0abd0	bl 0x00c3f810
00b0abd4	cbz w0,0x00b0abec
00b0abd8	ldr w8,[x23]
00b0abdc	str w8,[x19]
00b0abe0	ldr x8,[x23, #0x8]
00b0abe4	mov w0,#0x1
00b0abe8	str x8,[x19, #0x8]
00b0abec	ldp x29,x30,[sp, #0x1e0]
00b0abf0	ldp x20,x19,[sp, #0x1d0]
00b0abf4	ldp x22,x21,[sp, #0x1c0]
00b0abf8	ldp x24,x23,[sp, #0x1b0]
00b0abfc	ldp x28,x25,[sp, #0x1a0]
00b0ac00	add sp,sp,#0x1f0
00b0ac04	ret
