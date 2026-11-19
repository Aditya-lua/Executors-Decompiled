; BN_lshift1 @ 00a0aac0
00a0aac0	str x21,[sp, #-0x30]!
00a0aac4	stp x20,x19,[sp, #0x10]
00a0aac8	mov x20,x1
00a0aacc	mov x19,x0
00a0aad0	cmp x0,x1
00a0aad4	stp x29,x30,[sp, #0x20]
00a0aad8	add x29,sp,#0x20
00a0aadc	b.eq 0x00a0ab0c
00a0aae0	ldr w8,[x20, #0x10]
00a0aae4	mov x21,x20
00a0aae8	mov x0,x19
00a0aaec	str w8,[x19, #0x10]
00a0aaf0	ldr w8,[x21, #0x8]!
00a0aaf4	add w1,w8,#0x1
00a0aaf8	bl 0x00c38e80
00a0aafc	cbz x0,0x00a0ab78
00a0ab00	ldr w8,[x21]
00a0ab04	str w8,[x19, #0x8]
00a0ab08	b 0x00a0ab24
00a0ab0c	ldr w8,[x19, #0x8]
00a0ab10	mov x0,x19
00a0ab14	add w1,w8,#0x1
00a0ab18	bl 0x00c38e80
00a0ab1c	cbz x0,0x00a0ab78
00a0ab20	add x21,x20,#0x8
00a0ab24	ldr w9,[x21]
00a0ab28	ldr x8,[x19]
00a0ab2c	cmp w9,#0x1
00a0ab30	b.lt 0x00a0ab60
00a0ab34	ldr x11,[x20]
00a0ab38	mov x10,xzr
00a0ab3c	mov x12,xzr
00a0ab40	ldr x13,[x11, x10, LSL #0x3]
00a0ab44	add x10,x10,#0x1
00a0ab48	cmp w10,w9
00a0ab4c	orr x12,x12,x13, LSL #0x1
00a0ab50	str x12,[x8], #0x8
00a0ab54	lsr x12,x13,#0x3f
00a0ab58	b.lt 0x00a0ab40
00a0ab5c	b 0x00a0ab64
00a0ab60	mov x12,xzr
00a0ab64	str x12,[x8]
00a0ab68	ldr w8,[x19, #0x8]
00a0ab6c	mov w0,#0x1
00a0ab70	add w8,w8,w12
00a0ab74	str w8,[x19, #0x8]
00a0ab78	ldp x29,x30,[sp, #0x20]
00a0ab7c	ldp x20,x19,[sp, #0x10]
00a0ab80	ldr x21,[sp], #0x30
00a0ab84	ret
