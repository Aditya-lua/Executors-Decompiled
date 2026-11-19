; FUN_00c24d58 @ 00c24d58
00c24d58	paciasp
00c24d5c	stp x29,x30,[sp, #-0x40]!
00c24d60	stp x24,x23,[sp, #0x10]
00c24d64	stp x22,x21,[sp, #0x20]
00c24d68	stp x20,x19,[sp, #0x30]
00c24d6c	mov x29,sp
00c24d70	ldp x9,x8,[x0]
00c24d74	mov x19,x0
00c24d78	cmp x9,x8
00c24d7c	b.eq 0x00c24ea8
00c24d80	ldrb w10,[x9]
00c24d84	cmp w10,#0x55
00c24d88	b.ne 0x00c24e84
00c24d8c	add x10,x9,#0x1
00c24d90	cmp x8,x10
00c24d94	str x10,[x19]
00c24d98	b.eq 0x00c25110
00c24d9c	ldrb w10,[x10]
00c24da0	sub w10,w10,#0x3a
00c24da4	cmn w10,#0xa
00c24da8	b.cc 0x00c25110
00c24dac	mov x15,xzr
00c24db0	mov x22,xzr
00c24db4	mov w10,#0xa
00c24db8	add x11,x9,x15
00c24dbc	mov x14,x15
00c24dc0	mov x12,x22
00c24dc4	add x23,x11,#0x2
00c24dc8	str x23,[x19]
00c24dcc	cmp x23,x8
00c24dd0	ldrb w13,[x11, #0x1]
00c24dd4	nop
00c24dd8	madd x15,x22,x10,x13
00c24ddc	sub x22,x15,#0x30
00c24de0	b.eq 0x00c24df8
00c24de4	ldrb w15,[x23]
00c24de8	sub w15,w15,#0x30
00c24dec	cmp w15,#0x9
00c24df0	add x15,x14,#0x1
00c24df4	b.ls 0x00c24db8
00c24df8	sub x10,x8,x9
00c24dfc	sub x10,x10,x14
00c24e00	sub x10,x10,#0x2
00c24e04	cmp x10,x22
00c24e08	b.cc 0x00c25110
00c24e0c	mov w10,#0xa
00c24e10	add x15,x9,x14
00c24e14	madd x10,x12,x10,x13
00c24e18	add x10,x15,x10
00c24e1c	sub x10,x10,#0x2e
00c24e20	str x10,[x19]
00c24e24	cbz x22,0x00c25110
00c24e28	cmp x22,#0x9
00c24e2c	b.cc 0x00c24e58
00c24e30	mov x17,#0x626f
00c24e34	ldur x15,[x11, #0x2]
00c24e38	ldrb w16,[x11, #0xa]
00c24e3c	movk x17,#0x636a, LSL #16
00c24e40	movk x17,#0x7270, LSL #32
00c24e44	movk x17,#0x746f, LSL #48
00c24e48	cmp x15,x17
00c24e4c	mov w15,#0x6f
00c24e50	ccmp w16,w15,#0x0,eq
00c24e54	b.eq 0x00c25000
00c24e58	cmp x10,x8
00c24e5c	b.eq 0x00c24f7c
00c24e60	ldrb w8,[x10]
00c24e64	cmp w8,#0x49
00c24e68	b.ne 0x00c24f7c
00c24e6c	mov x0,x19
00c24e70	mov w1,wzr
00c24e74	bl 0x00c14948
00c24e78	mov x20,x0
00c24e7c	cbnz x0,0x00c24f80
00c24e80	b 0x00c25114
00c24e84	ldrb w10,[x9]
00c24e88	cmp w10,#0x72
00c24e8c	b.ne 0x00c24ea8
00c24e90	add x9,x9,#0x1
00c24e94	mov w20,#0x4
00c24e98	str x9,[x19]
00c24e9c	cmp x9,x8
00c24ea0	b.ne 0x00c24eb4
00c24ea4	b 0x00c24ecc
00c24ea8	mov w20,wzr
00c24eac	cmp x9,x8
00c24eb0	b.eq 0x00c24ecc
00c24eb4	ldrb w10,[x9]
00c24eb8	cmp w10,#0x56
00c24ebc	b.ne 0x00c24ecc
00c24ec0	add x9,x9,#0x1
00c24ec4	orr w20,w20,#0x2
00c24ec8	str x9,[x19]
00c24ecc	cmp x9,x8
00c24ed0	b.eq 0x00c24eec
00c24ed4	ldrb w8,[x9]
00c24ed8	cmp w8,#0x4b
00c24edc	b.ne 0x00c24eec
00c24ee0	add x8,x9,#0x1
00c24ee4	orr w20,w20,#0x1
00c24ee8	str x8,[x19]
00c24eec	mov x0,x19
00c24ef0	bl 0x00c10bfc
00c24ef4	cbz x0,0x00c25114
00c24ef8	cbz w20,0x00c25114
00c24efc	ldr x21,[x19, #0x1330]
00c24f00	ldr x8,[x21, #0x8]
00c24f04	sub x9,x8,#0xfd0
00c24f08	cmn x9,#0xff1
00c24f0c	b.hi 0x00c24f34
00c24f10	mov x22,x0
00c24f14	mov w0,#0x1000
00c24f18	bl 0x00c308d0
00c24f1c	cbz x0,0x00c2512c
00c24f20	mov x8,xzr
00c24f24	stp x21,xzr,[x0]
00c24f28	mov x21,x0
00c24f2c	str x0,[x19, #0x1330]
00c24f30	mov x0,x22
00c24f34	add x9,x8,#0x20
00c24f38	add x8,x21,x8
00c24f3c	mov w11,#0x3
00c24f40	str x9,[x21, #0x8]
00c24f44	adrp x9,0xcb3000
00c24f48	add x9,x9,#0xb60
00c24f4c	ldurh w10,[x0, #0x9]
00c24f50	str x9,[x8, #0x10]!
00c24f54	ldurh w9,[x8, #0x9]
00c24f58	str x0,[x8, #0x10]
00c24f5c	mov x0,x8
00c24f60	and w10,w10,#0xfc0
00c24f64	strb w11,[x8, #0x8]
00c24f68	and w9,w9,#0xf000
00c24f6c	str w20,[x8, #0xc]
00c24f70	orr w9,w9,w10
00c24f74	sturh w9,[x8, #0x9]
00c24f78	b 0x00c25114
00c24f7c	mov x20,xzr
00c24f80	mov x0,x19
00c24f84	bl 0x00c24d58
00c24f88	cbz x0,0x00c25114
00c24f8c	ldr x24,[x19, #0x1330]
00c24f90	mov x21,x0
00c24f94	ldr x8,[x24, #0x8]
00c24f98	sub x9,x8,#0xfc0
00c24f9c	cmn x9,#0xff1
00c24fa0	b.hi 0x00c24fc0
00c24fa4	mov w0,#0x1000
00c24fa8	bl 0x00c308d0
00c24fac	cbz x0,0x00c2512c
00c24fb0	mov x8,xzr
00c24fb4	stp x24,xzr,[x0]
00c24fb8	mov x24,x0
00c24fbc	str x0,[x19, #0x1330]
00c24fc0	add x9,x8,#0x30
00c24fc4	add x0,x24,x8
00c24fc8	adrp x8,0xcb3000
00c24fcc	add x8,x8,#0xae8
00c24fd0	str x9,[x24, #0x8]
00c24fd4	mov w9,#0x2
00c24fd8	str x8,[x0, #0x10]!
00c24fdc	ldurh w8,[x0, #0x9]
00c24fe0	strb w9,[x0, #0x8]
00c24fe4	mov w9,#0x540
00c24fe8	and w8,w8,#0xf000
00c24fec	stp x21,x23,[x0, #0x10]
00c24ff0	orr w8,w8,w9
00c24ff4	stp x22,x20,[x0, #0x20]
00c24ff8	sturh w8,[x0, #0x9]
00c24ffc	b 0x00c25114
00c25000	add x9,x9,x14
00c25004	cmp x22,#0x9
00c25008	add x9,x9,#0xb
00c2500c	stp x9,x10,[x19]
00c25010	b.eq 0x00c2507c
00c25014	ldrb w9,[x9]
00c25018	sub w9,w9,#0x3a
00c2501c	cmn w9,#0xa
00c25020	b.cc 0x00c2507c
00c25024	mov w9,#0xa
00c25028	add x11,x11,#0xc
00c2502c	mov x21,xzr
00c25030	madd x12,x12,x9,x13
00c25034	mov x14,x11
00c25038	sub x13,x12,#0x3a
00c2503c	str x11,[x19]
00c25040	mov x22,x14
00c25044	ldurb w12,[x11, #-0x1]
00c25048	nop
00c2504c	madd x15,x21,x9,x12
00c25050	mov x12,x13
00c25054	sub x21,x15,#0x30
00c25058	cbz x13,0x00c25074
00c2505c	ldrb w13,[x11], #0x1
00c25060	add x14,x22,#0x1
00c25064	sub w13,w13,#0x30
00c25068	cmp w13,#0x9
00c2506c	sub x13,x12,#0x1
00c25070	b.ls 0x00c2503c
00c25074	cmp x12,x21
00c25078	b.cs 0x00c25088
00c2507c	mov x0,xzr
00c25080	stp x10,x8,[x19]
00c25084	b 0x00c25114
00c25088	stp x10,x8,[x19]
00c2508c	cbz x21,0x00c25110
00c25090	mov x0,x19
00c25094	bl 0x00c24d58
00c25098	cbz x0,0x00c25114
00c2509c	ldr x23,[x19, #0x1330]
00c250a0	mov x20,x0
00c250a4	ldr x8,[x23, #0x8]
00c250a8	sub x9,x8,#0xfc0
00c250ac	cmn x9,#0xff1
00c250b0	b.hi 0x00c250d0
00c250b4	mov w0,#0x1000
00c250b8	bl 0x00c308d0
00c250bc	cbz x0,0x00c2512c
00c250c0	mov x8,xzr
00c250c4	stp x23,xzr,[x0]
00c250c8	mov x23,x0
00c250cc	str x0,[x19, #0x1330]
00c250d0	add x9,x8,#0x30
00c250d4	add x0,x23,x8
00c250d8	adrp x8,0xcb3000
00c250dc	add x8,x8,#0xa70
00c250e0	str x9,[x23, #0x8]
00c250e4	mov w9,#0xb
00c250e8	str x8,[x0, #0x10]!
00c250ec	ldurh w8,[x0, #0x9]
00c250f0	strb w9,[x0, #0x8]
00c250f4	mov w9,#0x540
00c250f8	and w8,w8,#0xf000
00c250fc	stp x20,x22,[x0, #0x10]
00c25100	orr w8,w8,w9
00c25104	str x21,[x0, #0x20]
00c25108	sturh w8,[x0, #0x9]
00c2510c	b 0x00c25114
00c25110	mov x0,xzr
00c25114	ldp x20,x19,[sp, #0x30]
00c25118	ldp x22,x21,[sp, #0x20]
00c2511c	ldp x24,x23,[sp, #0x10]
00c25120	ldp x29,x30,[sp], #0x40
00c25124	autiasp
00c25128	ret
00c2512c	bl 0x00c2fff0
