; std::__ndk1::stoull @ 00bc7b3c
00bc7b3c	paciasp
00bc7b40	sub sp,sp,#0x80
00bc7b44	stp x29,x30,[sp, #0x30]
00bc7b48	str x25,[sp, #0x40]
00bc7b4c	stp x24,x23,[sp, #0x50]
00bc7b50	stp x22,x21,[sp, #0x60]
00bc7b54	stp x20,x19,[sp, #0x70]
00bc7b58	add x29,sp,#0x30
00bc7b5c	mov w8,#0xc
00bc7b60	mov w24,#0x7473
00bc7b64	ldr x9,[x0, #0x10]
00bc7b68	strb w8,[sp]
00bc7b6c	ldrb w8,[x0]
00bc7b70	movk w24,#0x756f, LSL #16
00bc7b74	mov w23,#0x6c6c
00bc7b78	mov w21,w2
00bc7b7c	mov x19,x1
00bc7b80	tst w8,#0x1
00bc7b84	stur w24,[sp, #0x1]
00bc7b88	sturh w23,[sp, #0x5]
00bc7b8c	csinc x20,x9,x0,ne
00bc7b90	strb wzr,[sp, #0x7]
00bc7b94	str xzr,[x29, #0x18]
00bc7b98	bl 0x00c30710
00bc7b9c	mov x22,x0
00bc7ba0	ldr w25,[x0]
00bc7ba4	str wzr,[x0]
00bc7ba8	add x1,x29,#0x18
00bc7bac	mov x0,x20
00bc7bb0	mov w2,w21
00bc7bb4	bl 0x00c30700
00bc7bb8	ldr w8,[x22]
00bc7bbc	str w25,[x22]
00bc7bc0	cmp w8,#0x22
00bc7bc4	b.eq 0x00bc7c0c
00bc7bc8	ldr x8,[x29, #0x18]
00bc7bcc	subs x8,x8,x20
00bc7bd0	b.eq 0x00bc7c44
00bc7bd4	mov x21,x0
00bc7bd8	cbz x19,0x00bc7be0
00bc7bdc	str x8,[x19]
00bc7be0	mov x0,sp
00bc7be4	bl 0x00c43db0
00bc7be8	mov x0,x21
00bc7bec	ldp x20,x19,[sp, #0x70]
00bc7bf0	ldr x25,[sp, #0x40]
00bc7bf4	ldp x22,x21,[sp, #0x60]
00bc7bf8	ldp x24,x23,[sp, #0x50]
00bc7bfc	ldp x29,x30,[sp, #0x30]
00bc7c00	add sp,sp,#0x80
00bc7c04	autiasp
00bc7c08	ret
00bc7c0c	mov w8,#0x28
00bc7c10	str xzr,[sp, #0x28]
00bc7c14	strb w8,[sp, #0x18]
00bc7c18	adrp x8,0x2ce000
00bc7c1c	add x8,x8,#0xb11
00bc7c20	ldr x9,[x8]
00bc7c24	ldur x8,[x8, #0x6]
00bc7c28	stur w24,[sp, #0x19]
00bc7c2c	sturh w23,[sp, #0x1d]
00bc7c30	stur x9,[sp, #0x1f]
00bc7c34	add x9,sp,#0x18
00bc7c38	stur x8,[sp, #0x25]
00bc7c3c	orr x0,x9,#0x1
00bc7c40	bl 0x0080c8d0
00bc7c44	mov w9,#0x7473
00bc7c48	mov w8,#0x2a
00bc7c4c	str xzr,[sp, #0x28]
00bc7c50	movk w9,#0x756f, LSL #16
00bc7c54	strb w8,[sp, #0x18]
00bc7c58	mov w8,#0x6c6c
00bc7c5c	stur w9,[sp, #0x19]
00bc7c60	adrp x9,0x2ac000
00bc7c64	add x9,x9,#0xd16
00bc7c68	ldr x10,[x9]
00bc7c6c	sturh w8,[sp, #0x1d]
00bc7c70	ldur x8,[x9, #0x7]
00bc7c74	add x9,sp,#0x18
00bc7c78	stur x10,[sp, #0x1f]
00bc7c7c	stur x8,[sp, #0x26]
00bc7c80	orr x0,x9,#0x1
00bc7c84	bl 0x00bcab04
00bc7c88	b 0x00bc7c8c
00bc7c8c	mov x19,x0
00bc7c90	add x0,sp,#0x18
00bc7c94	bl 0x00c43db0
00bc7c98	mov x0,sp
00bc7c9c	bl 0x00c43db0
00bc7ca0	mov x0,x19
00bc7ca4	bl 0x00c2c090
