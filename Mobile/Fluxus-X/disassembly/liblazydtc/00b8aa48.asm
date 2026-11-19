; psa_cipher_generate_iv @ 00b8aa48
00b8aa48	stp x28,x27,[sp, #-0x60]!
00b8aa4c	stp x26,x25,[sp, #0x10]
00b8aa50	stp x24,x23,[sp, #0x20]
00b8aa54	stp x22,x21,[sp, #0x30]
00b8aa58	stp x20,x19,[sp, #0x40]
00b8aa5c	stp x29,x30,[sp, #0x50]
00b8aa60	add x29,sp,#0x50
00b8aa64	ldr w8,[x0]
00b8aa68	mov x24,x3
00b8aa6c	mov x21,x0
00b8aa70	mov x19,x1
00b8aa74	cbz w8,0x00b8aaa8
00b8aa78	ldrb w8,[x21, #0x4]
00b8aa7c	and w8,w8,#0x3
00b8aa80	cmp w8,#0x1
00b8aa84	b.ne 0x00b8aaa8
00b8aa88	ldrb w22,[x21, #0x5]
00b8aa8c	cmp x22,x2
00b8aa90	b.ls 0x00b8ab40
00b8aa94	mov x20,xzr
00b8aa98	mov x19,xzr
00b8aa9c	mov x28,xzr
00b8aaa0	mov w25,#0xffffff76
00b8aaa4	b 0x00b8aabc
00b8aaa8	mov x20,xzr
00b8aaac	mov x22,xzr
00b8aab0	mov x19,xzr
00b8aab4	mov x28,xzr
00b8aab8	mov w25,#0xffffff77
00b8aabc	str xzr,[x24]
00b8aac0	ldr w8,[x21]
00b8aac4	cbz w8,0x00b8aae8
00b8aac8	cmp w8,#0x1
00b8aacc	b.ne 0x00b8aad8
00b8aad0	add x0,x21,#0x8
00b8aad4	bl 0x00c42e70
00b8aad8	ldrb w8,[x21, #0x4]
00b8aadc	str wzr,[x21]
00b8aae0	and w8,w8,#0xfc
00b8aae4	strb w8,[x21, #0x4]
00b8aae8	cbz x20,0x00b8ab18
00b8aaec	mov x0,x20
00b8aaf0	mov x1,x22
00b8aaf4	bl 0x00c42220
00b8aaf8	cbz x19,0x00b8ab20
00b8aafc	cbz x28,0x00b8ab10
00b8ab00	mov x0,x19
00b8ab04	mov x1,x20
00b8ab08	mov x2,x28
00b8ab0c	bl 0x00c2ffd0
00b8ab10	mov x0,x20
00b8ab14	bl 0x00c30960
00b8ab18	mov w0,w25
00b8ab1c	b 0x00b8ab24
00b8ab20	mov w0,#0xffffff69
00b8ab24	ldp x29,x30,[sp, #0x50]
00b8ab28	ldp x20,x19,[sp, #0x40]
00b8ab2c	ldp x22,x21,[sp, #0x30]
00b8ab30	ldp x24,x23,[sp, #0x20]
00b8ab34	ldp x26,x25,[sp, #0x10]
00b8ab38	ldp x28,x27,[sp], #0x60
00b8ab3c	ret
00b8ab40	cmp w22,#0x10
00b8ab44	b.ls 0x00b8ab5c
00b8ab48	mov x20,xzr
00b8ab4c	mov x19,xzr
00b8ab50	mov x28,xzr
00b8ab54	mov w25,#0xffffff7c
00b8ab58	b 0x00b8aabc
00b8ab5c	cbz w22,0x00b8ab88
00b8ab60	mov w1,#0x1
00b8ab64	mov x0,x22
00b8ab68	bl 0x00c30a30
00b8ab6c	mov x20,x0
00b8ab70	mov x28,x22
00b8ab74	cbnz x0,0x00b8ab94
00b8ab78	mov x19,xzr
00b8ab7c	mov x28,xzr
00b8ab80	mov w25,#0xffffff73
00b8ab84	b 0x00b8aabc
00b8ab88	mov x28,xzr
00b8ab8c	mov x20,xzr
00b8ab90	mov x19,xzr
00b8ab94	adrp x8,0xd25000
00b8ab98	add x8,x8,#0xb10
00b8ab9c	ldrb w9,[x8, #0x1]
00b8aba0	mov w25,#0xffffff77
00b8aba4	cmp w9,#0x2
00b8aba8	b.ne 0x00b8aabc
00b8abac	ldrb w9,[x8]
00b8abb0	cmp w9,#0x7
00b8abb4	b.ne 0x00b8aabc
00b8abb8	cbz w22,0x00b8ac04
00b8abbc	add x25,x8,#0x358
00b8abc0	mov x23,x22
00b8abc4	mov x26,x20
00b8abc8	cmp x23,#0x400
00b8abcc	mov w8,#0x400
00b8abd0	csel x27,x23,x8,cc
00b8abd4	mov x0,x25
00b8abd8	mov x1,x26
00b8abdc	mov x2,x27
00b8abe0	bl 0x00c303a0
00b8abe4	cbnz w0,0x00b8abf8
00b8abe8	subs x23,x23,x27
00b8abec	add x26,x26,x27
00b8abf0	b.ne 0x00b8abc8
00b8abf4	b 0x00b8ac04
00b8abf8	bl 0x00c42bf0
00b8abfc	mov w25,w0
00b8ac00	cbnz w0,0x00b8aabc
00b8ac04	ldr w8,[x21]
00b8ac08	cmp w8,#0x1
00b8ac0c	b.ne 0x00b8ac40
00b8ac10	add x0,x21,#0x8
00b8ac14	mov x1,x20
00b8ac18	mov x2,x22
00b8ac1c	bl 0x00c42ed0
00b8ac20	mov w25,w0
00b8ac24	cbnz w0,0x00b8aabc
00b8ac28	str x22,[x24]
00b8ac2c	ldrb w8,[x21, #0x4]
00b8ac30	orr w8,w8,#0x2
00b8ac34	strb w8,[x21, #0x4]
00b8ac38	cbnz x20,0x00b8aaf8
00b8ac3c	b 0x00b8ab24
00b8ac40	mov w25,#0xffffff79
00b8ac44	b 0x00b8aabc
