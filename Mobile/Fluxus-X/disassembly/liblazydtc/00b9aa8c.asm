; mbedtls_psa_ecdsa_verify_hash @ 00b9aa8c
00b9aa8c	sub sp,sp,#0x80
00b9aa90	stp x26,x25,[sp, #0x30]
00b9aa94	stp x24,x23,[sp, #0x40]
00b9aa98	stp x22,x21,[sp, #0x50]
00b9aa9c	stp x20,x19,[sp, #0x60]
00b9aaa0	stp x29,x30,[sp, #0x70]
00b9aaa4	add x29,sp,#0x70
00b9aaa8	mrs x26,tpidr_el0
00b9aaac	ldr x8,[x26, #0x28]
00b9aab0	mov x21,x4
00b9aab4	mov x3,x2
00b9aab8	mov x2,x1
00b9aabc	str x8,[sp, #0x28]
00b9aac0	str xzr,[sp, #0x20]
00b9aac4	ldrh w8,[x0, #0x2]
00b9aac8	ldrh w0,[x0]
00b9aacc	add x4,sp,#0x20
00b9aad0	mov x24,x7
00b9aad4	mov x1,x8
00b9aad8	mov x22,x6
00b9aadc	mov x20,x5
00b9aae0	bl 0x00c42f80
00b9aae4	mov w23,w0
00b9aae8	cbnz w0,0x00b9abd8
00b9aaec	ldr x19,[sp, #0x20]
00b9aaf0	add x0,sp,#0x10
00b9aaf4	ldr x8,[x19, #0x78]
00b9aaf8	add x8,x8,#0x7
00b9aafc	lsr x25,x8,#0x3
00b9ab00	bl 0x00c41c00
00b9ab04	mov x0,sp
00b9ab08	bl 0x00c41c00
00b9ab0c	lsl x8,x25,#0x1
00b9ab10	cmp x8,x24
00b9ab14	b.ne 0x00b9abb4
00b9ab18	add x0,sp,#0x10
00b9ab1c	mov x1,x22
00b9ab20	mov x2,x25
00b9ab24	bl 0x00c41ca0
00b9ab28	bl 0x00c42bf0
00b9ab2c	mov w23,w0
00b9ab30	cbnz w0,0x00b9abb8
00b9ab34	add x1,x22,x25
00b9ab38	mov x0,sp
00b9ab3c	mov x2,x25
00b9ab40	bl 0x00c41ca0
00b9ab44	bl 0x00c42bf0
00b9ab48	mov w23,w0
00b9ab4c	cbnz w0,0x00b9abb8
00b9ab50	add x22,x19,#0xd0
00b9ab54	mov x0,x22
00b9ab58	bl 0x00c426d0
00b9ab5c	cbz w0,0x00b9ab80
00b9ab60	adrp x4,0xcb5000
00b9ab64	ldr x4,[x4, #0xac0]
00b9ab68	add x2,x19,#0xc0
00b9ab6c	add x3,x19,#0x38
00b9ab70	mov x0,x19
00b9ab74	mov x1,x22
00b9ab78	mov x5,xzr
00b9ab7c	bl 0x00c42700
00b9ab80	bl 0x00c42bf0
00b9ab84	mov w23,w0
00b9ab88	cbnz w0,0x00b9abb8
00b9ab8c	add x4,sp,#0x10
00b9ab90	mov x5,sp
00b9ab94	mov x0,x19
00b9ab98	mov x1,x21
00b9ab9c	mov x2,x20
00b9aba0	mov x3,x22
00b9aba4	bl 0x00c42550
00b9aba8	bl 0x00c42bf0
00b9abac	mov w23,w0
00b9abb0	b 0x00b9abb8
00b9abb4	mov w23,#0xffffff6b
00b9abb8	add x0,sp,#0x10
00b9abbc	bl 0x00c41bb0
00b9abc0	mov x0,sp
00b9abc4	bl 0x00c41bb0
00b9abc8	mov x0,x19
00b9abcc	bl 0x00c426e0
00b9abd0	mov x0,x19
00b9abd4	bl 0x00c30960
00b9abd8	ldr x8,[x26, #0x28]
00b9abdc	ldr x9,[sp, #0x28]
00b9abe0	cmp x8,x9
00b9abe4	b.ne 0x00b9ac08
00b9abe8	mov w0,w23
00b9abec	ldp x29,x30,[sp, #0x70]
00b9abf0	ldp x20,x19,[sp, #0x60]
00b9abf4	ldp x22,x21,[sp, #0x50]
00b9abf8	ldp x24,x23,[sp, #0x40]
00b9abfc	ldp x26,x25,[sp, #0x30]
00b9ac00	add sp,sp,#0x80
00b9ac04	ret
00b9ac08	bl 0x00c2fec0
