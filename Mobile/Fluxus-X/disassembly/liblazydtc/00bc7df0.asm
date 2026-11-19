; std::__ndk1::stod @ 00bc7df0
00bc7df0	paciasp
00bc7df4	sub sp,sp,#0x70
00bc7df8	str d8,[sp, #0x30]
00bc7dfc	stp x29,x30,[sp, #0x40]
00bc7e00	stp x22,x21,[sp, #0x50]
00bc7e04	stp x20,x19,[sp, #0x60]
00bc7e08	add x29,sp,#0x40
00bc7e0c	mov w8,#0x8
00bc7e10	ldrb w9,[x0]
00bc7e14	mov x19,x1
00bc7e18	strb w8,[sp]
00bc7e1c	mov w8,#0x7473
00bc7e20	movk w8,#0x646f, LSL #16
00bc7e24	tst w9,#0x1
00bc7e28	strb wzr,[sp, #0x5]
00bc7e2c	stur w8,[sp, #0x1]
00bc7e30	ldr x8,[x0, #0x10]
00bc7e34	stur xzr,[x29, #-0x8]
00bc7e38	csinc x20,x8,x0,ne
00bc7e3c	bl 0x00c30710
00bc7e40	mov x21,x0
00bc7e44	ldr w22,[x0]
00bc7e48	str wzr,[x0]
00bc7e4c	sub x1,x29,#0x8
00bc7e50	mov x0,x20
00bc7e54	bl 0x00c30720
00bc7e58	ldr w8,[x21]
00bc7e5c	str w22,[x21]
00bc7e60	cmp w8,#0x22
00bc7e64	b.eq 0x00bc7ea8
00bc7e68	ldur x8,[x29, #-0x8]
00bc7e6c	subs x8,x8,x20
00bc7e70	b.eq 0x00bc7ee0
00bc7e74	fmov d8,d0
00bc7e78	cbz x19,0x00bc7e80
00bc7e7c	str x8,[x19]
00bc7e80	mov x0,sp
00bc7e84	bl 0x00c43db0
00bc7e88	fmov d0,d8
00bc7e8c	ldp x20,x19,[sp, #0x60]
00bc7e90	ldr d8,[sp, #0x30]
00bc7e94	ldp x22,x21,[sp, #0x50]
00bc7e98	ldp x29,x30,[sp, #0x40]
00bc7e9c	add sp,sp,#0x70
00bc7ea0	autiasp
00bc7ea4	ret
00bc7ea8	mov w8,#0x24
00bc7eac	adrp x10,0x2ce000
00bc7eb0	add x10,x10,#0xb11
00bc7eb4	ldur w9,[sp, #0x1]
00bc7eb8	strb w8,[sp, #0x18]
00bc7ebc	ldr x8,[x10]
00bc7ec0	ldur x10,[x10, #0x6]
00bc7ec4	str xzr,[sp, #0x28]
00bc7ec8	stur w9,[sp, #0x19]
00bc7ecc	stur x8,[sp, #0x1d]
00bc7ed0	add x8,sp,#0x18
00bc7ed4	stur x10,[sp, #0x23]
00bc7ed8	orr x0,x8,#0x1
00bc7edc	bl 0x0080c8d0
00bc7ee0	mov w8,#0x26
00bc7ee4	adrp x10,0x2ac000
00bc7ee8	add x10,x10,#0xd16
00bc7eec	ldur w9,[sp, #0x1]
00bc7ef0	strb w8,[sp, #0x18]
00bc7ef4	ldr x8,[x10]
00bc7ef8	ldur x10,[x10, #0x7]
00bc7efc	str xzr,[sp, #0x28]
00bc7f00	stur w9,[sp, #0x19]
00bc7f04	stur x8,[sp, #0x1d]
00bc7f08	add x8,sp,#0x18
00bc7f0c	stur x10,[sp, #0x24]
00bc7f10	orr x0,x8,#0x1
00bc7f14	bl 0x00bcab04
00bc7f18	b 0x00bc7f1c
00bc7f1c	mov x19,x0
00bc7f20	add x0,sp,#0x18
00bc7f24	bl 0x00c43db0
00bc7f28	mov x0,sp
00bc7f2c	bl 0x00c43db0
00bc7f30	mov x0,x19
00bc7f34	bl 0x00c2c090
