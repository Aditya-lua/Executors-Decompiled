; FUN_00c14ebc @ 00c14ebc
00c14ebc	paciasp
00c14ec0	sub sp,sp,#0x50
00c14ec4	stp x29,x30,[sp, #0x10]
00c14ec8	stp x24,x23,[sp, #0x20]
00c14ecc	stp x22,x21,[sp, #0x30]
00c14ed0	stp x20,x19,[sp, #0x40]
00c14ed4	add x29,sp,#0x10
00c14ed8	ldp x20,x8,[x0]
00c14edc	cmp x20,x8
00c14ee0	b.eq 0x00c150a8
00c14ee4	ldrb w9,[x20]
00c14ee8	cmp w9,#0x54
00c14eec	b.ne 0x00c150a8
00c14ef0	add x21,x20,#0x1
00c14ef4	cmp x21,x8
00c14ef8	str x21,[x0]
00c14efc	b.eq 0x00c14f98
00c14f00	ldrb w9,[x21]
00c14f04	cmp w9,#0x4c
00c14f08	b.ne 0x00c14f98
00c14f0c	add x9,x20,#0x2
00c14f10	cmp x8,x9
00c14f14	str x9,[x0]
00c14f18	b.eq 0x00c150a8
00c14f1c	ldrb w9,[x9]
00c14f20	sub w9,w9,#0x3a
00c14f24	cmn w9,#0xa
00c14f28	b.cc 0x00c150a8
00c14f2c	mov x9,xzr
00c14f30	add x12,x20,#0x4
00c14f34	mov w10,#0xa
00c14f38	sub x11,x12,#0x1
00c14f3c	mov x21,x12
00c14f40	str x11,[x0]
00c14f44	cmp x11,x8
00c14f48	ldurb w12,[x12, #-0x2]
00c14f4c	nop
00c14f50	madd x9,x9,x10,x12
00c14f54	sub x9,x9,#0x30
00c14f58	b.eq 0x00c14f70
00c14f5c	ldurb w12,[x21, #-0x1]
00c14f60	sub w12,w12,#0x30
00c14f64	cmp w12,#0x9
00c14f68	add x12,x21,#0x1
00c14f6c	b.ls 0x00c14f38
00c14f70	cmp x11,x8
00c14f74	b.eq 0x00c150a8
00c14f78	ldurb w10,[x21, #-0x1]
00c14f7c	cmp w10,#0x5f
00c14f80	b.ne 0x00c150a8
00c14f84	add x9,x9,#0x1
00c14f88	str x21,[x0]
00c14f8c	cmp x21,x8
00c14f90	b.ne 0x00c14fa4
00c14f94	b 0x00c150a8
00c14f98	mov x9,xzr
00c14f9c	cmp x21,x8
00c14fa0	b.eq 0x00c150a8
00c14fa4	ldrb w10,[x21]
00c14fa8	cmp w10,#0x5f
00c14fac	b.ne 0x00c1503c
00c14fb0	mov x22,xzr
00c14fb4	ldrb w8,[x0, #0x30a]
00c14fb8	add x10,x21,#0x1
00c14fbc	str x10,[x0]
00c14fc0	cmp w8,#0x1
00c14fc4	b.ne 0x00c150cc
00c14fc8	ldr x22,[x0, #0x1330]
00c14fcc	ldr x8,[x22, #0x8]
00c14fd0	sub x9,x8,#0xfd0
00c14fd4	cmn x9,#0xff1
00c14fd8	b.hi 0x00c14ffc
00c14fdc	mov x19,x0
00c14fe0	mov w0,#0x1000
00c14fe4	bl 0x00c308d0
00c14fe8	cbz x0,0x00c1527c
00c14fec	mov x8,xzr
00c14ff0	stp x22,xzr,[x0]
00c14ff4	mov x22,x0
00c14ff8	str x0,[x19, #0x1330]
00c14ffc	add x9,x8,#0x20
00c15000	add x19,x22,x8
00c15004	adrp x8,0xcb1000
00c15008	add x8,x8,#0x4c0
00c1500c	str x9,[x22, #0x8]
00c15010	mov w10,#0x540
00c15014	str x8,[x19, #0x10]!
00c15018	ldurh w8,[x19, #0x9]
00c1501c	mov w9,#0x8
00c15020	and w8,w8,#0xf000
00c15024	strb w9,[x19, #0x8]
00c15028	orr w8,w8,w10
00c1502c	sturh w8,[x19, #0x9]
00c15030	sub x8,x21,x20
00c15034	stp x20,x8,[x19, #0x10]
00c15038	b 0x00c150ac
00c1503c	ldrb w10,[x21]
00c15040	sub w10,w10,#0x3a
00c15044	cmn w10,#0xa
00c15048	b.cc 0x00c150a8
00c1504c	mov x10,xzr
00c15050	add x12,x21,#0x1
00c15054	mov w11,#0xa
00c15058	str x12,[x0]
00c1505c	mov x21,x12
00c15060	ldurb w12,[x12, #-0x1]
00c15064	nop
00c15068	madd x10,x10,x11,x12
00c1506c	cmp x21,x8
00c15070	sub x10,x10,#0x30
00c15074	b.eq 0x00c1508c
00c15078	mov x12,x21
00c1507c	ldrb w13,[x12], #0x1
00c15080	sub w13,w13,#0x30
00c15084	cmp w13,#0x9
00c15088	b.ls 0x00c15058
00c1508c	cmp x21,x8
00c15090	b.eq 0x00c150a8
00c15094	ldrb w8,[x21]
00c15098	cmp w8,#0x5f
00c1509c	b.ne 0x00c150a8
00c150a0	add x22,x10,#0x1
00c150a4	b 0x00c14fb4
00c150a8	mov x19,xzr
00c150ac	mov x0,x19
00c150b0	ldp x20,x19,[sp, #0x40]
00c150b4	ldp x22,x21,[sp, #0x30]
00c150b8	ldp x24,x23,[sp, #0x20]
00c150bc	ldp x29,x30,[sp, #0x10]
00c150c0	add sp,sp,#0x50
00c150c4	autiasp
00c150c8	ret
00c150cc	ldrb w8,[x0, #0x309]
00c150d0	cmp w8,#0x1
00c150d4	b.ne 0x00c1519c
00c150d8	cbnz x9,0x00c1519c
00c150dc	ldr x19,[x0, #0x1330]
00c150e0	ldr x9,[x19, #0x8]
00c150e4	sub x8,x9,#0xfc0
00c150e8	cmn x8,#0xff1
00c150ec	b.hi 0x00c15118
00c150f0	mov x20,x0
00c150f4	mov w0,#0x1000
00c150f8	bl 0x00c308d0
00c150fc	cbz x0,0x00c1527c
00c15100	mov x8,x0
00c15104	mov x9,xzr
00c15108	stp x19,xzr,[x0]
00c1510c	mov x19,x0
00c15110	mov x0,x20
00c15114	str x8,[x20, #0x1330]
00c15118	add x8,x9,#0x30
00c1511c	str x8,[x19, #0x8]
00c15120	add x19,x19,x9
00c15124	adrp x8,0xcb1000
00c15128	add x8,x8,#0x5b0
00c1512c	mov w9,#0xa80
00c15130	str x8,[x19, #0x10]!
00c15134	ldurh w8,[x19, #0x9]
00c15138	stp x22,xzr,[x19, #0x10]
00c1513c	and w8,w8,#0xf000
00c15140	strb wzr,[x19, #0x20]
00c15144	orr w8,w8,w9
00c15148	mov w9,#0x2c
00c1514c	sturh w8,[x19, #0x9]
00c15150	ldr x23,[x0, #0x2d8]
00c15154	ldr x8,[x0, #0x2e0]
00c15158	strb w9,[x19, #0x8]
00c1515c	cmp x23,x8
00c15160	b.ne 0x00c15270
00c15164	ldr x22,[x0, #0x2d0]
00c15168	add x8,x0,#0x2e8
00c1516c	mov x24,x0
00c15170	sub x20,x23,x22
00c15174	cmp x22,x8
00c15178	lsl x1,x20,#0x1
00c1517c	b.eq 0x00c15230
00c15180	mov x0,x22
00c15184	bl 0x00c30950
00c15188	mov x21,x0
00c1518c	mov x0,x24
00c15190	str x21,[x24, #0x2d0]
00c15194	cbnz x21,0x00c15260
00c15198	bl 0x00c30b40
00c1519c	ldr x8,[x0, #0x2a0]
00c151a0	ldr x10,[x0, #0x298]
00c151a4	sub x8,x8,x10
00c151a8	asr x8,x8,#0x3
00c151ac	cmp x9,x8
00c151b0	b.cs 0x00c151d4
00c151b4	ldr x10,[x10, x9, LSL #0x3]
00c151b8	cbz x10,0x00c151d4
00c151bc	ldp x10,x11,[x10]
00c151c0	sub x11,x11,x10
00c151c4	cmp x22,x11, ASR #0x3
00c151c8	b.cs 0x00c151d4
00c151cc	ldr x19,[x10, x22, LSL #0x3]
00c151d0	b 0x00c150ac
00c151d4	cmp x9,x8
00c151d8	mov x19,xzr
00c151dc	b.hi 0x00c150ac
00c151e0	ldr x10,[x0, #0x310]
00c151e4	cmp x10,x9
00c151e8	b.ne 0x00c150ac
00c151ec	cmp x9,x8
00c151f0	b.ne 0x00c1520c
00c151f4	mov x19,x0
00c151f8	add x0,x0,#0x298
00c151fc	add x1,sp,#0x8
00c15200	str xzr,[sp, #0x8]
00c15204	bl 0x00c15c8c
00c15208	mov x0,x19
00c1520c	adrp x1,0x2a1000
00c15210	add x1,x1,#0xf81
00c15214	ldp x20,x19,[sp, #0x40]
00c15218	ldp x22,x21,[sp, #0x30]
00c1521c	ldp x24,x23,[sp, #0x20]
00c15220	ldp x29,x30,[sp, #0x10]
00c15224	add sp,sp,#0x50
00c15228	autiasp
00c1522c	b 0x00c15d60
00c15230	mov x0,x1
00c15234	bl 0x00c308d0
00c15238	cbz x0,0x00c15280
00c1523c	mov x21,x0
00c15240	cmp x23,x22
00c15244	b.eq 0x00c15258
00c15248	mov x0,x21
00c1524c	mov x1,x22
00c15250	mov x2,x20
00c15254	bl 0x00c2ff60
00c15258	mov x0,x24
00c1525c	str x21,[x24, #0x2d0]
00c15260	asr x8,x20,#0x2
00c15264	add x23,x21,x20
00c15268	add x8,x21,x8, LSL #0x3
00c1526c	str x8,[x0, #0x2e0]
00c15270	str x19,[x23], #0x8
00c15274	str x23,[x0, #0x2d8]
00c15278	b 0x00c150ac
00c1527c	bl 0x00c2fff0
00c15280	bl 0x00c30b40
