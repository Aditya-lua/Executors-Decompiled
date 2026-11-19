; DES_ncbc_encrypt @ 00a16e08
00a16e08	sub sp,sp,#0x90
00a16e0c	stp x28,x27,[sp, #0x30]
00a16e10	stp x26,x25,[sp, #0x40]
00a16e14	stp x24,x23,[sp, #0x50]
00a16e18	stp x22,x21,[sp, #0x60]
00a16e1c	stp x20,x19,[sp, #0x70]
00a16e20	stp x29,x30,[sp, #0x80]
00a16e24	ldp w24,w25,[x4]
00a16e28	mov x19,x4
00a16e2c	mov x21,x3
00a16e30	mov x23,x2
00a16e34	mov x28,x1
00a16e38	mov x22,x0
00a16e3c	subs x8,x2,#0x8
00a16e40	add x29,sp,#0x80
00a16e44	cbz w5,0x00a16fc4
00a16e48	b.lt 0x00a16efc
00a16e4c	str x8,[sp, #0x18]
00a16e50	mvn x8,x23
00a16e54	orr x9,xzr,#-0x10
00a16e58	cmn x8,#0x10
00a16e5c	csinv x8,x9,x23,le
00a16e60	add x8,x8,x23
00a16e64	add x8,x8,#0x8
00a16e68	and x26,x8,#-0x8
00a16e6c	add x20,x26,#0x8
00a16e70	add x8,x22,x20
00a16e74	add x23,x23,#0x8
00a16e78	mov x27,x28
00a16e7c	str x8,[sp, #0x20]
00a16e80	ldp w8,w9,[x22], #0x8
00a16e84	add x0,sp,#0x28
00a16e88	mov w2,#0x1
00a16e8c	mov x1,x21
00a16e90	eor w8,w8,w24
00a16e94	eor w9,w9,w25
00a16e98	stp w8,w9,[sp, #0x28]
00a16e9c	bl 0x00a14ec4
00a16ea0	ldr w24,[sp, #0x28]
00a16ea4	sub x23,x23,#0x8
00a16ea8	cmp x23,#0xf
00a16eac	lsr w8,w24,#0x8
00a16eb0	lsr w9,w24,#0x10
00a16eb4	strb w8,[x27, #0x1]
00a16eb8	lsr w8,w24,#0x18
00a16ebc	strb w24,[x27]
00a16ec0	strb w9,[x27, #0x2]
00a16ec4	strb w8,[x27, #0x3]
00a16ec8	ldr w25,[sp, #0x2c]
00a16ecc	lsr w8,w25,#0x8
00a16ed0	strb w8,[x27, #0x5]
00a16ed4	lsr w8,w25,#0x10
00a16ed8	strb w8,[x27, #0x6]
00a16edc	lsr w8,w25,#0x18
00a16ee0	strb w25,[x27, #0x4]
00a16ee4	strb w8,[x27, #0x7]
00a16ee8	add x27,x27,#0x8
00a16eec	b.gt 0x00a16e80
00a16ef0	ldp x8,x22,[sp, #0x18]
00a16ef4	add x28,x28,x20
00a16ef8	sub x23,x8,x26
00a16efc	cbz x23,0x00a17120
00a16f00	sub x9,x23,#0x1
00a16f04	cmp x9,#0x6
00a16f08	mov w8,wzr
00a16f0c	b.hi 0x00a17180
00a16f10	adrp x10,0x752000
00a16f14	add x10,x10,#0x6d0
00a16f18	ldrsw x9,[x10, x9, LSL #0x2]
00a16f1c	add x11,x9,x10
00a16f20	add x9,x22,x23
00a16f24	mov w10,w8
00a16f28	br x11
00a16f2c	ldrb w8,[x9, #-0x1]!
00a16f30	lsl w8,w8,#0x10
00a16f34	ldrb w10,[x9, #-0x1]!
00a16f38	orr w8,w8,w10, LSL #0x8
00a16f3c	ldrb w10,[x9, #-0x1]!
00a16f40	orr w8,w8,w10
00a16f44	ldrb w11,[x9, #-0x1]!
00a16f48	mov w10,w8
00a16f4c	lsl w8,w11,#0x18
00a16f50	ldrb w11,[x9, #-0x1]!
00a16f54	orr w8,w8,w11, LSL #0x10
00a16f58	ldrb w11,[x9, #-0x1]!
00a16f5c	orr w8,w8,w11, LSL #0x8
00a16f60	ldurb w9,[x9, #-0x1]
00a16f64	orr w8,w8,w9
00a16f68	eor w8,w8,w24
00a16f6c	eor w9,w10,w25
00a16f70	add x0,sp,#0x28
00a16f74	mov w2,#0x1
00a16f78	mov x1,x21
00a16f7c	stp w8,w9,[sp, #0x28]
00a16f80	bl 0x00a14ec4
00a16f84	ldp w22,w26,[sp, #0x28]
00a16f88	lsr w8,w22,#0x8
00a16f8c	strb w8,[x28, #0x1]
00a16f90	lsr w8,w22,#0x18
00a16f94	strb w8,[x28, #0x3]
00a16f98	lsr w8,w26,#0x8
00a16f9c	strb w8,[x28, #0x5]
00a16fa0	lsr w8,w26,#0x10
00a16fa4	lsr w9,w22,#0x10
00a16fa8	strb w8,[x28, #0x6]
00a16fac	lsr w8,w26,#0x18
00a16fb0	strb w22,[x28]
00a16fb4	strb w9,[x28, #0x2]
00a16fb8	strb w26,[x28, #0x4]
00a16fbc	strb w8,[x28, #0x7]
00a16fc0	b 0x00a17128
00a16fc4	b.lt 0x00a17118
00a16fc8	str x8,[sp, #0x18]
00a16fcc	mvn x8,x23
00a16fd0	orr x9,xzr,#-0x10
00a16fd4	cmn x8,#0x10
00a16fd8	csinv x8,x9,x23,le
00a16fdc	add x8,x8,x23
00a16fe0	add x8,x8,#0x8
00a16fe4	and x8,x8,#-0x8
00a16fe8	str x8,[sp, #0x10]
00a16fec	add x8,x8,#0x8
00a16ff0	str x8,[sp, #0x8]
00a16ff4	add x8,x22,x8
00a16ff8	add x23,x23,#0x8
00a16ffc	mov x20,x28
00a17000	str x8,[sp, #0x20]
00a17004	mov w27,w24
00a17008	ldr w24,[x22]
00a1700c	mov w26,w25
00a17010	add x0,sp,#0x28
00a17014	mov x1,x21
00a17018	str w24,[sp, #0x28]
00a1701c	ldr w25,[x22, #0x4]
00a17020	mov w2,wzr
00a17024	str w25,[sp, #0x2c]
00a17028	bl 0x00a14ec4
00a1702c	ldp w8,w9,[sp, #0x28]
00a17030	sub x23,x23,#0x8
00a17034	add x22,x22,#0x8
00a17038	cmp x23,#0xf
00a1703c	eor w8,w8,w27
00a17040	lsr w10,w8,#0x8
00a17044	eor w9,w9,w26
00a17048	strb w8,[x20]
00a1704c	strb w10,[x20, #0x1]
00a17050	lsr w10,w8,#0x10
00a17054	lsr w8,w8,#0x18
00a17058	strb w9,[x20, #0x4]
00a1705c	strb w10,[x20, #0x2]
00a17060	lsr w10,w9,#0x8
00a17064	strb w8,[x20, #0x3]
00a17068	lsr w8,w9,#0x10
00a1706c	lsr w9,w9,#0x18
00a17070	strb w10,[x20, #0x5]
00a17074	strb w8,[x20, #0x6]
00a17078	strb w9,[x20, #0x7]
00a1707c	add x20,x20,#0x8
00a17080	b.gt 0x00a17004
00a17084	ldp x9,x8,[sp, #0x10]
00a17088	sub x23,x8,x9
00a1708c	ldr x8,[sp, #0x8]
00a17090	add x28,x28,x8
00a17094	ldr x8,[sp, #0x20]
00a17098	cbz x23,0x00a17120
00a1709c	ldp w22,w26,[x8]
00a170a0	add x0,sp,#0x28
00a170a4	mov x1,x21
00a170a8	mov w2,wzr
00a170ac	stp w22,w26,[sp, #0x28]
00a170b0	bl 0x00a14ec4
00a170b4	sub x8,x23,#0x1
00a170b8	cmp x8,#0x6
00a170bc	b.hi 0x00a17128
00a170c0	adrp x11,0x752000
00a170c4	add x11,x11,#0x6ec
00a170c8	ldrsw x12,[x11, x8, LSL #0x2]
00a170cc	ldp w9,w10,[sp, #0x28]
00a170d0	add x11,x12,x11
00a170d4	eor w8,w9,w24
00a170d8	eor w10,w10,w25
00a170dc	add x9,x28,x23
00a170e0	br x11
00a170e4	lsr w11,w10,#0x10
00a170e8	strb w11,[x9, #-0x1]!
00a170ec	lsr w11,w10,#0x8
00a170f0	strb w11,[x9, #-0x1]!
00a170f4	strb w10,[x9, #-0x1]!
00a170f8	lsr w10,w8,#0x18
00a170fc	strb w10,[x9, #-0x1]!
00a17100	lsr w10,w8,#0x10
00a17104	strb w10,[x9, #-0x1]!
00a17108	lsr w10,w8,#0x8
00a1710c	strb w10,[x9, #-0x1]!
00a17110	sturb w8,[x9, #-0x1]
00a17114	b 0x00a17128
00a17118	mov x8,x22
00a1711c	cbnz x23,0x00a1709c
00a17120	mov w22,w24
00a17124	mov w26,w25
00a17128	lsr w8,w22,#0x8
00a1712c	lsr w9,w22,#0x10
00a17130	lsr w10,w22,#0x18
00a17134	lsr w11,w26,#0x8
00a17138	lsr w12,w26,#0x10
00a1713c	lsr w13,w26,#0x18
00a17140	strb w22,[x19]
00a17144	strb w26,[x19, #0x4]
00a17148	strb w8,[x19, #0x1]
00a1714c	strb w9,[x19, #0x2]
00a17150	strb w10,[x19, #0x3]
00a17154	strb w11,[x19, #0x5]
00a17158	strb w12,[x19, #0x6]
00a1715c	strb w13,[x19, #0x7]
00a17160	ldp x29,x30,[sp, #0x80]
00a17164	ldp x20,x19,[sp, #0x70]
00a17168	ldp x22,x21,[sp, #0x60]
00a1716c	ldp x24,x23,[sp, #0x50]
00a17170	ldp x26,x25,[sp, #0x40]
00a17174	ldp x28,x27,[sp, #0x30]
00a17178	add sp,sp,#0x90
00a1717c	ret
00a17180	mov w10,w8
00a17184	b 0x00a16f68
