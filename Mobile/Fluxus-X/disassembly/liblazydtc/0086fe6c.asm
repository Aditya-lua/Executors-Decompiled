; FUN_0086fe6c @ 0086fe6c
0086fe6c	stp x29,x30,[sp, #-0x50]!
0086fe70	str x25,[sp, #0x10]
0086fe74	stp x24,x23,[sp, #0x20]
0086fe78	stp x22,x21,[sp, #0x30]
0086fe7c	stp x20,x19,[sp, #0x40]
0086fe80	mov x29,sp
0086fe84	ldr x9,[x0, #0x20]
0086fe88	mov w8,#0x10
0086fe8c	mov x19,x0
0086fe90	lsl x10,x9,#0x1
0086fe94	cmp x9,#0x0
0086fe98	csel x23,x8,x10,eq
0086fe9c	cbz x23,0x0086fef0
0086fea0	cmp x23,#0x40
0086fea4	mov w22,#0x40
0086fea8	csel x8,x23,x22,hi
0086feac	lsr x24,x8,#0x6
0086feb0	lsl x21,x24,#0x3
0086feb4	mov x0,x21
0086feb8	bl 0x00c2fed0
0086febc	mov w1,wzr
0086fec0	mov x2,x21
0086fec4	mov x20,x0
0086fec8	bl 0x00c301c0
0086fecc	add x8,x23,x23, LSL #0x1
0086fed0	lsl x0,x8,#0x3
0086fed4	bl 0x00c2fed0
0086fed8	rbit x8,x23
0086fedc	clz x8,x8
0086fee0	sub w25,w22,w8
0086fee4	ldp x8,x21,[x19, #0x10]
0086fee8	cbnz x8,0x0086ff08
0086feec	b 0x00870054
0086fef0	mov x24,xzr
0086fef4	mov x20,xzr
0086fef8	mov x0,xzr
0086fefc	mov w25,#0x40
0086ff00	ldp x8,x21,[x19, #0x10]
0086ff04	cbz x8,0x00870054
0086ff08	ldr x10,[x21]
0086ff0c	cbz x10,0x0086ff18
0086ff10	mov x9,xzr
0086ff14	b 0x0086ff38
0086ff18	mov x9,xzr
0086ff1c	add x11,x21,#0x8
0086ff20	sub x12,x8,#0x1
0086ff24	cmp x12,x9
0086ff28	b.eq 0x00870054
0086ff2c	ldr x10,[x11, x9, LSL #0x3]
0086ff30	add x9,x9,#0x1
0086ff34	cbz x10,0x0086ff24
0086ff38	rbit x11,x10
0086ff3c	mov x15,#0x7c15
0086ff40	ldr x22,[x19]
0086ff44	movk x15,#0x7f4a, LSL #16
0086ff48	and x12,x25,#0xff
0086ff4c	add x13,x21,#0x8
0086ff50	clz x11,x11
0086ff54	movk x15,#0x79b9, LSL #32
0086ff58	mov w14,#0x18
0086ff5c	orr x17,x11,x9, LSL #0x6
0086ff60	sub x11,x23,#0x1
0086ff64	movk x15,#0x9e37, LSL #48
0086ff68	mov w16,#0x1
0086ff6c	madd x1,x17,x14,x22
0086ff70	ldr x5,[x1]
0086ff74	lsr x2,x5,#0x4
0086ff78	eor x2,x2,x5, LSR #0x9
0086ff7c	mul x2,x2,x15
0086ff80	lsr x2,x2,x12
0086ff84	lsr x3,x2,#0x6
0086ff88	lsl x4,x16,x2
0086ff8c	ldr x6,[x20, x3, LSL #0x3]
0086ff90	tst x4,x6
0086ff94	b.eq 0x0086ffd4
0086ff98	mul x3,x2,x14
0086ff9c	ldr x3,[x0, x3#0x0]
0086ffa0	cmp x3,x5
0086ffa4	b.eq 0x0086ffc8
0086ffa8	add x2,x2,#0x1
0086ffac	and x2,x2,x11
0086ffb0	lsr x3,x2,#0x6
0086ffb4	lsl x4,x16,x2
0086ffb8	ldr x6,[x20, x3, LSL #0x3]
0086ffbc	tst x6,x4
0086ffc0	b.ne 0x0086ff98
0086ffc4	b 0x0086ffd0
0086ffc8	lsr x3,x2,#0x6
0086ffcc	lsl x4,x16,x2
0086ffd0	ldr x6,[x20, x3, LSL #0x3]
0086ffd4	nop
0086ffd8	madd x2,x2,x14,x0
0086ffdc	orr x4,x6,x4
0086ffe0	str x4,[x20, x3, LSL #0x3]
0086ffe4	ldr x3,[x1, #0x10]
0086ffe8	sub x4,x10,#0x1
0086ffec	ldr q0,[x1]
0086fff0	ands x10,x4,x10
0086fff4	str x3,[x2, #0x10]
0086fff8	str q0,[x2]
0086fffc	b.ne 0x00870028
00870000	add x10,x9,#0x1
00870004	cmp x8,x10
00870008	csinc x1,x8,x9,hi
0087000c	add x2,x9,#0x1
00870010	cmp x2,x8
00870014	b.cs 0x00870044
00870018	ldr x10,[x13, x9, LSL #0x3]
0087001c	mov x9,x2
00870020	cbz x10,0x0087000c
00870024	mov x9,x2
00870028	rbit x17,x10
0087002c	clz x17,x17
00870030	orr x17,x17,x9, LSL #0x6
00870034	cbnz x10,0x0086ff6c
00870038	cmp x9,x8
0087003c	b.ne 0x0086ff6c
00870040	b 0x00870058
00870044	mov x10,xzr
00870048	mov x9,x1
0087004c	cbz x10,0x00870038
00870050	b 0x0086ff6c
00870054	ldr x22,[x19]
00870058	stp x0,xzr,[x19]
0087005c	mov x0,xzr
00870060	stp xzr,xzr,[x19, #0x10]
00870064	bl 0x00c301d0
00870068	mov x0,xzr
0087006c	stp x24,x20,[x19, #0x10]
00870070	str x23,[x19, #0x8]
00870074	bl 0x00c301d0
00870078	mov x0,xzr
0087007c	bl 0x00c301d0
00870080	str x23,[x19, #0x20]
00870084	strb w25,[x19, #0x30]
00870088	cbz x22,0x008700a8
0087008c	mov x0,x22
00870090	bl 0x00c301d0
00870094	mov x0,x21
00870098	bl 0x00c301d0
0087009c	mov x0,xzr
008700a0	bl 0x00c301d0
008700a4	mov x21,xzr
008700a8	mov x0,x21
008700ac	ldp x20,x19,[sp, #0x40]
008700b0	ldr x25,[sp, #0x10]
008700b4	ldp x22,x21,[sp, #0x30]
008700b8	ldp x24,x23,[sp, #0x20]
008700bc	ldp x29,x30,[sp], #0x50
008700c0	b 0x00c301d0
