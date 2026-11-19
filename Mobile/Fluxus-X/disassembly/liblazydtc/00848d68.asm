; FUN_00848d68 @ 00848d68
00848d68	sub sp,sp,#0x70
00848d6c	stp x29,x30,[sp, #0x20]
00848d70	str x25,[sp, #0x30]
00848d74	stp x24,x23,[sp, #0x40]
00848d78	stp x22,x21,[sp, #0x50]
00848d7c	stp x20,x19,[sp, #0x60]
00848d80	add x29,sp,#0x20
00848d84	mrs x25,tpidr_el0
00848d88	mov x19,x8
00848d8c	sub x21,x2,x1
00848d90	ldr x8,[x25, #0x28]
00848d94	cmn x21,#0x8
00848d98	stur x8,[x29, #-0x8]
00848d9c	b.cs 0x00848ef0
00848da0	mov x22,x2
00848da4	mov x20,x0
00848da8	cmp x21,#0x16
00848dac	b.hi 0x00848dcc
00848db0	lsl w8,w21,#0x1
00848db4	mov x9,sp
00848db8	orr x23,x9,#0x1
00848dbc	strb w8,[sp]
00848dc0	cmp x22,x1
00848dc4	b.ne 0x00848e04
00848dc8	b 0x00848e10
00848dcc	orr x8,x21,#0x7
00848dd0	mov w9,#0x1a
00848dd4	mov x23,x1
00848dd8	cmp x8,#0x17
00848ddc	csinc x24,x9,x8,eq
00848de0	mov x0,x24
00848de4	bl 0x00c2fed0
00848de8	mov x1,x23
00848dec	mov x23,x0
00848df0	orr x8,x24,#0x1
00848df4	stp x21,x0,[sp, #0x8]
00848df8	str x8,[sp]
00848dfc	cmp x22,x1
00848e00	b.eq 0x00848e10
00848e04	mov x0,x23
00848e08	mov x2,x21
00848e0c	bl 0x00c2ff60
00848e10	strb wzr,[x23, x21]
00848e14	ldr x0,[x20, #0x10]
00848e18	ldrb w8,[sp]
00848e1c	ldp x11,x10,[sp, #0x8]
00848e20	ldr x9,[x0]
00848e24	lsr x12,x8,#0x1
00848e28	tst w8,#0x1
00848e2c	mov x8,sp
00848e30	ldr x9,[x9, #0x20]
00848e34	csinc x1,x10,x8,ne
00848e38	csel x8,x12,x11,eq
00848e3c	add x2,x1,x8
00848e40	mov x8,x19
00848e44	blr x9
00848e48	ldrb w8,[x19]
00848e4c	ldr x9,[x19, #0x8]
00848e50	lsr x10,x8,#0x1
00848e54	tst w8,#0x1
00848e58	csel x9,x10,x9,eq
00848e5c	cmp x9,#0x1
00848e60	b.eq 0x00848e94
00848e64	cmp x9,#0xc
00848e68	b.ne 0x00848e8c
00848e6c	ldr x9,[x19, #0x10]
00848e70	tst w8,#0x1
00848e74	csinc x8,x9,x19,ne
00848e78	ldrb w9,[x8, #0x3]
00848e7c	strb w9,[x8, #0xb]
00848e80	ldrb w8,[sp]
00848e84	tbnz w8,#0x0,0x00848e9c
00848e88	b 0x00848eac
00848e8c	tbnz w8,#0x0,0x00848ed8
00848e90	strh wzr,[x19]
00848e94	ldrb w8,[sp]
00848e98	tbz w8,#0x0,0x00848eac
00848e9c	ldr x8,[sp]
00848ea0	ldr x0,[sp, #0x10]
00848ea4	and x1,x8,#-0x2
00848ea8	bl 0x00c2fe80
00848eac	ldr x8,[x25, #0x28]
00848eb0	ldur x9,[x29, #-0x8]
00848eb4	cmp x8,x9
00848eb8	b.ne 0x00848f38
00848ebc	ldp x20,x19,[sp, #0x60]
00848ec0	ldr x25,[sp, #0x30]
00848ec4	ldp x22,x21,[sp, #0x50]
00848ec8	ldp x24,x23,[sp, #0x40]
00848ecc	ldp x29,x30,[sp, #0x20]
00848ed0	add sp,sp,#0x70
00848ed4	ret
00848ed8	ldr x8,[x19, #0x10]
00848edc	strb wzr,[x8]
00848ee0	str xzr,[x19, #0x8]
00848ee4	ldrb w8,[sp]
00848ee8	tbnz w8,#0x0,0x00848e9c
00848eec	b 0x00848eac
00848ef0	ldr x8,[x25, #0x28]
00848ef4	ldur x9,[x29, #-0x8]
00848ef8	cmp x8,x9
00848efc	b.ne 0x00848f38
00848f00	bl 0x007fe124
00848f38	bl 0x00c2fec0
