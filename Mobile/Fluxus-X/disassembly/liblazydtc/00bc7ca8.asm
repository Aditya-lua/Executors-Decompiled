; std::__ndk1::stof @ 00bc7ca8
00bc7ca8	paciasp
00bc7cac	sub sp,sp,#0x70
00bc7cb0	str d8,[sp, #0x30]
00bc7cb4	stp x29,x30,[sp, #0x40]
00bc7cb8	stp x22,x21,[sp, #0x50]
00bc7cbc	stp x20,x19,[sp, #0x60]
00bc7cc0	add x29,sp,#0x40
00bc7cc4	mov w8,#0x8
00bc7cc8	ldrb w9,[x0]
00bc7ccc	mov x19,x1
00bc7cd0	strb w8,[sp]
00bc7cd4	mov w8,#0x7473
00bc7cd8	movk w8,#0x666f, LSL #16
00bc7cdc	tst w9,#0x1
00bc7ce0	strb wzr,[sp, #0x5]
00bc7ce4	stur w8,[sp, #0x1]
00bc7ce8	ldr x8,[x0, #0x10]
00bc7cec	stur xzr,[x29, #-0x8]
00bc7cf0	csinc x20,x8,x0,ne
00bc7cf4	bl 0x00c30710
00bc7cf8	mov x21,x0
00bc7cfc	ldr w22,[x0]
00bc7d00	str wzr,[x0]
00bc7d04	sub x1,x29,#0x8
00bc7d08	mov x0,x20
00bc7d0c	bl 0x00c43a50
00bc7d10	ldr w8,[x21]
00bc7d14	str w22,[x21]
00bc7d18	cmp w8,#0x22
00bc7d1c	b.eq 0x00bc7d60
00bc7d20	ldur x8,[x29, #-0x8]
00bc7d24	subs x8,x8,x20
00bc7d28	b.eq 0x00bc7d98
00bc7d2c	fmov s8,s0
00bc7d30	cbz x19,0x00bc7d38
00bc7d34	str x8,[x19]
00bc7d38	mov x0,sp
00bc7d3c	bl 0x00c43db0
00bc7d40	fmov s0,s8
00bc7d44	ldp x20,x19,[sp, #0x60]
00bc7d48	ldr d8,[sp, #0x30]
00bc7d4c	ldp x22,x21,[sp, #0x50]
00bc7d50	ldp x29,x30,[sp, #0x40]
00bc7d54	add sp,sp,#0x70
00bc7d58	autiasp
00bc7d5c	ret
00bc7d60	mov w8,#0x24
00bc7d64	adrp x10,0x2ce000
00bc7d68	add x10,x10,#0xb11
00bc7d6c	ldur w9,[sp, #0x1]
00bc7d70	strb w8,[sp, #0x18]
00bc7d74	ldr x8,[x10]
00bc7d78	ldur x10,[x10, #0x6]
00bc7d7c	str xzr,[sp, #0x28]
00bc7d80	stur w9,[sp, #0x19]
00bc7d84	stur x8,[sp, #0x1d]
00bc7d88	add x8,sp,#0x18
00bc7d8c	stur x10,[sp, #0x23]
00bc7d90	orr x0,x8,#0x1
00bc7d94	bl 0x0080c8d0
00bc7d98	mov w8,#0x26
00bc7d9c	adrp x10,0x2ac000
00bc7da0	add x10,x10,#0xd16
00bc7da4	ldur w9,[sp, #0x1]
00bc7da8	strb w8,[sp, #0x18]
00bc7dac	ldr x8,[x10]
00bc7db0	ldur x10,[x10, #0x7]
00bc7db4	str xzr,[sp, #0x28]
00bc7db8	stur w9,[sp, #0x19]
00bc7dbc	stur x8,[sp, #0x1d]
00bc7dc0	add x8,sp,#0x18
00bc7dc4	stur x10,[sp, #0x24]
00bc7dc8	orr x0,x8,#0x1
00bc7dcc	bl 0x00bcab04
00bc7dd0	b 0x00bc7dd4
00bc7dd4	mov x19,x0
00bc7dd8	add x0,sp,#0x18
00bc7ddc	bl 0x00c43db0
00bc7de0	mov x0,sp
00bc7de4	bl 0x00c43db0
00bc7de8	mov x0,x19
00bc7dec	bl 0x00c2c090
