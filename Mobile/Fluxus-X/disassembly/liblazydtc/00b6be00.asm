; mbedtls_ccm_star_encrypt_and_tag @ 00b6be00
00b6be00	sub sp,sp,#0x70
00b6be04	stp x28,x27,[sp, #0x10]
00b6be08	stp x26,x25,[sp, #0x20]
00b6be0c	stp x24,x23,[sp, #0x30]
00b6be10	stp x22,x21,[sp, #0x40]
00b6be14	stp x20,x19,[sp, #0x50]
00b6be18	stp x29,x30,[sp, #0x60]
00b6be1c	add x29,sp,#0x60
00b6be20	mrs x28,tpidr_el0
00b6be24	ldr x8,[x28, #0x28]
00b6be28	sub x9,x3,#0x7
00b6be2c	mov x20,x7
00b6be30	mov x21,x6
00b6be34	mov x23,x5
00b6be38	mov x24,x4
00b6be3c	mov x25,x3
00b6be40	mov x26,x2
00b6be44	mov x22,x1
00b6be48	mov x19,x0
00b6be4c	cmp x9,#0x6
00b6be50	str x8,[sp, #0x8]
00b6be54	b.ls 0x00b6be60
00b6be58	orr w0,wzr,#0xfffffff3
00b6be5c	b 0x00b6bed8
00b6be60	and w9,w25,#0xff
00b6be64	orr w10,wzr,#0xf
00b6be68	orr w11,wzr,#0xe
00b6be6c	add x27,x19,#0x11
00b6be70	orr w8,wzr,#0x3
00b6be74	sub w10,w10,w9
00b6be78	sub w9,w11,w9
00b6be7c	mov x0,x27
00b6be80	mov x1,x26
00b6be84	mov x2,x25
00b6be88	stp xzr,xzr,[x19, #0x10]
00b6be8c	stp w10,w8,[x19, #0x40]
00b6be90	strb w9,[x19, #0x10]
00b6be94	bl 0x00c2ffd0
00b6be98	ldr w2,[x19, #0x40]
00b6be9c	add x0,x27,x25
00b6bea0	mov w1,wzr
00b6bea4	bl 0x00c301c0
00b6bea8	mov w8,#0x1
00b6beac	add x0,x19,#0x1
00b6beb0	mov x1,x26
00b6beb4	mov x2,x25
00b6beb8	strb w8,[x19, #0x1f]
00b6bebc	bl 0x00c2ffd0
00b6bec0	ldr w8,[x19, #0xa8]
00b6bec4	mov x0,x19
00b6bec8	orr w8,w8,#0x1
00b6becc	str w8,[x19, #0xa8]
00b6bed0	bl 0x00b6b1c8
00b6bed4	cbz w0,0x00b6bf08
00b6bed8	ldr x8,[x28, #0x28]
00b6bedc	ldr x9,[sp, #0x8]
00b6bee0	cmp x8,x9
00b6bee4	b.ne 0x00b6bf98
00b6bee8	ldp x29,x30,[sp, #0x60]
00b6beec	ldp x20,x19,[sp, #0x50]
00b6bef0	ldp x22,x21,[sp, #0x40]
00b6bef4	ldp x24,x23,[sp, #0x30]
00b6bef8	ldp x26,x25,[sp, #0x20]
00b6befc	ldp x28,x27,[sp, #0x10]
00b6bf00	add sp,sp,#0x70
00b6bf04	ret
00b6bf08	lsr x8,x23,#0x8
00b6bf0c	cmp x8,#0xfe
00b6bf10	orr w0,wzr,#0xfffffff3
00b6bf14	b.hi 0x00b6bed8
00b6bf18	ldr x25,[x29, #0x18]
00b6bf1c	cmp x25,#0x2
00b6bf20	b.eq 0x00b6bed8
00b6bf24	cmp x25,#0x10
00b6bf28	b.hi 0x00b6bed8
00b6bf2c	tbnz w25,#0x0,0x00b6bed8
00b6bf30	ldr w8,[x19, #0xa8]
00b6bf34	mov x0,x19
00b6bf38	stp x22,x23,[x19, #0x20]
00b6bf3c	stp x25,xzr,[x19, #0x30]
00b6bf40	orr w8,w8,#0x2
00b6bf44	str w8,[x19, #0xa8]
00b6bf48	bl 0x00b6b1c8
00b6bf4c	cbnz w0,0x00b6bed8
00b6bf50	mov x0,x19
00b6bf54	mov x1,x24
00b6bf58	mov x2,x23
00b6bf5c	bl 0x00c42060
00b6bf60	cbnz w0,0x00b6bed8
00b6bf64	mov x5,sp
00b6bf68	mov x0,x19
00b6bf6c	mov x1,x21
00b6bf70	mov x2,x22
00b6bf74	mov x3,x20
00b6bf78	mov x4,x22
00b6bf7c	bl 0x00c42050
00b6bf80	cbnz w0,0x00b6bed8
00b6bf84	ldr x1,[x29, #0x10]
00b6bf88	mov x0,x19
00b6bf8c	mov x2,x25
00b6bf90	bl 0x00c41ff0
00b6bf94	b 0x00b6bed8
00b6bf98	bl 0x00c2fec0
