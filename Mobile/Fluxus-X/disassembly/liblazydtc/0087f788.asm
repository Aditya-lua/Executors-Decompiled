; FUN_0087f788 @ 0087f788
0087f788	ldp x9,x8,[x0, #0x20]
0087f78c	add x10,x9,x9, LSL #0x1
0087f790	cmp x8,x10, LSR #0x2
0087f794	b.cs 0x0087f79c
0087f798	ret
0087f79c	cbz x8,0x0087f838
0087f7a0	ldr x8,[x1]
0087f7a4	mov x12,#0x2d69
0087f7a8	movk x12,#0xeb38, LSL #16
0087f7ac	lsl w10,w8,#0x3
0087f7b0	lsr x11,x8,#0x20
0087f7b4	movk x12,#0xea08, LSL #32
0087f7b8	movk x12,#0x9ddf, LSL #48
0087f7bc	add x10,x10,#0x8
0087f7c0	eor x10,x10,x11
0087f7c4	mul x10,x10,x12
0087f7c8	eor x11,x11,x10, LSR #0x2f
0087f7cc	eor x10,x11,x10
0087f7d0	mov x11,#0x959d
0087f7d4	mul x10,x10,x12
0087f7d8	movk x11,#0xb8f4, LSL #16
0087f7dc	movk x11,#0xd34f, LSL #32
0087f7e0	movk x11,#0x949d, LSL #48
0087f7e4	eor x10,x10,x10, LSR #0x2f
0087f7e8	mul x10,x10,x11
0087f7ec	ldrb w11,[x0, #0x30]
0087f7f0	lsr x11,x10,x11
0087f7f4	ldr x10,[x0, #0x18]
0087f7f8	lsr x12,x11,#0x6
0087f7fc	ldr x12,[x10, x12, LSL #0x3]
0087f800	lsr x12,x12,x11
0087f804	tbz w12,#0x0,0x0087f838
0087f808	ldr x12,[x0]
0087f80c	sub x9,x9,#0x1
0087f810	lsl x13,x11,#0x4
0087f814	ldr x13,[x12, x13#0x0]
0087f818	cmp x13,x8
0087f81c	b.eq 0x0087f798
0087f820	add x11,x11,#0x1
0087f824	and x11,x11,x9
0087f828	lsr x13,x11,#0x6
0087f82c	ldr x13,[x10, x13, LSL #0x3]
0087f830	lsr x13,x13,x11
0087f834	tbnz w13,#0x0,0x0087f810
0087f838	b 0x0087f83c
0087f83c	stp x29,x30,[sp, #-0x50]!
0087f840	str x25,[sp, #0x10]
0087f844	stp x24,x23,[sp, #0x20]
0087f848	stp x22,x21,[sp, #0x30]
0087f84c	stp x20,x19,[sp, #0x40]
0087f850	mov x29,sp
0087f854	ldr x9,[x0, #0x20]
0087f858	mov w8,#0x10
0087f85c	mov x19,x0
0087f860	lsl x10,x9,#0x1
0087f864	cmp x9,#0x0
0087f868	csel x23,x8,x10,eq
0087f86c	cbz x23,0x0087f8bc
0087f870	cmp x23,#0x40
0087f874	mov w22,#0x40
0087f878	csel x8,x23,x22,hi
0087f87c	lsr x24,x8,#0x6
0087f880	lsl x21,x24,#0x3
0087f884	mov x0,x21
0087f888	bl 0x00c2fed0
0087f88c	mov w1,wzr
0087f890	mov x2,x21
0087f894	mov x20,x0
0087f898	bl 0x00c301c0
0087f89c	lsl x0,x23,#0x4
0087f8a0	bl 0x00c2fed0
0087f8a4	rbit x8,x23
0087f8a8	clz x8,x8
0087f8ac	sub w25,w22,w8
0087f8b0	ldp x8,x21,[x19, #0x10]
0087f8b4	cbnz x8,0x0087f8d4
0087f8b8	b 0x0087fa38
0087f8bc	mov x24,xzr
0087f8c0	mov x20,xzr
0087f8c4	mov x0,xzr
0087f8c8	mov w25,#0x40
0087f8cc	ldp x8,x21,[x19, #0x10]
0087f8d0	cbz x8,0x0087fa38
0087f8d4	ldr x10,[x21]
0087f8d8	cbz x10,0x0087f8e4
0087f8dc	mov x9,xzr
0087f8e0	b 0x0087f904
0087f8e4	mov x9,xzr
0087f8e8	add x11,x21,#0x8
0087f8ec	sub x12,x8,#0x1
0087f8f0	cmp x12,x9
0087f8f4	b.eq 0x0087fa38
0087f8f8	ldr x10,[x11, x9, LSL #0x3]
0087f8fc	add x9,x9,#0x1
0087f900	cbz x10,0x0087f8f0
0087f904	rbit x12,x10
0087f908	mov x11,#0x2d69
0087f90c	mov x15,#0x959d
0087f910	movk x11,#0xeb38, LSL #16
0087f914	movk x15,#0xb8f4, LSL #16
0087f918	ldr x22,[x19]
0087f91c	clz x12,x12
0087f920	movk x11,#0xea08, LSL #32
0087f924	movk x15,#0xd34f, LSL #32
0087f928	orr x17,x12,x9, LSL #0x6
0087f92c	movk x11,#0x9ddf, LSL #48
0087f930	sub x12,x23,#0x1
0087f934	and x13,x25,#0xff
0087f938	add x14,x21,#0x8
0087f93c	movk x15,#0x949d, LSL #48
0087f940	mov w16,#0x1
0087f944	add x1,x22,x17, LSL #0x4
0087f948	ldr x5,[x1]
0087f94c	lsl w2,w5,#0x3
0087f950	lsr x3,x5,#0x20
0087f954	add x2,x2,#0x8
0087f958	eor x2,x2,x3
0087f95c	mul x2,x2,x11
0087f960	eor x3,x3,x2, LSR #0x2f
0087f964	eor x2,x3,x2
0087f968	mul x2,x2,x11
0087f96c	eor x2,x2,x2, LSR #0x2f
0087f970	mul x2,x2,x15
0087f974	lsr x2,x2,x13
0087f978	lsr x3,x2,#0x6
0087f97c	lsl x4,x16,x2
0087f980	ldr x6,[x20, x3, LSL #0x3]
0087f984	tst x4,x6
0087f988	b.eq 0x0087f9c8
0087f98c	lsl x3,x2,#0x4
0087f990	ldr x3,[x0, x3#0x0]
0087f994	cmp x3,x5
0087f998	b.eq 0x0087f9bc
0087f99c	add x2,x2,#0x1
0087f9a0	and x2,x2,x12
0087f9a4	lsr x3,x2,#0x6
0087f9a8	lsl x4,x16,x2
0087f9ac	ldr x6,[x20, x3, LSL #0x3]
0087f9b0	tst x6,x4
0087f9b4	b.ne 0x0087f98c
0087f9b8	b 0x0087f9c4
0087f9bc	lsr x3,x2,#0x6
0087f9c0	lsl x4,x16,x2
0087f9c4	ldr x6,[x20, x3, LSL #0x3]
0087f9c8	orr x4,x6,x4
0087f9cc	str x4,[x20, x3, LSL #0x3]
0087f9d0	sub x3,x10,#0x1
0087f9d4	ldr q0,[x1]
0087f9d8	ands x10,x3,x10
0087f9dc	str q0,[x0,x2, lsl #4]
0087f9e0	b.ne 0x0087fa0c
0087f9e4	add x10,x9,#0x1
0087f9e8	cmp x8,x10
0087f9ec	csinc x1,x8,x9,hi
0087f9f0	add x2,x9,#0x1
0087f9f4	cmp x2,x8
0087f9f8	b.cs 0x0087fa28
0087f9fc	ldr x10,[x14, x9, LSL #0x3]
0087fa00	mov x9,x2
0087fa04	cbz x10,0x0087f9f0
0087fa08	mov x9,x2
0087fa0c	rbit x17,x10
0087fa10	clz x17,x17
0087fa14	orr x17,x17,x9, LSL #0x6
0087fa18	cbnz x10,0x0087f944
0087fa1c	cmp x9,x8
0087fa20	b.ne 0x0087f944
0087fa24	b 0x0087fa3c
0087fa28	mov x10,xzr
0087fa2c	mov x9,x1
0087fa30	cbz x10,0x0087fa1c
0087fa34	b 0x0087f944
0087fa38	ldr x22,[x19]
0087fa3c	stp x0,xzr,[x19]
0087fa40	mov x0,xzr
0087fa44	stp xzr,xzr,[x19, #0x10]
0087fa48	bl 0x00c301d0
0087fa4c	mov x0,xzr
0087fa50	stp x24,x20,[x19, #0x10]
0087fa54	str x23,[x19, #0x8]
0087fa58	bl 0x00c301d0
0087fa5c	mov x0,xzr
0087fa60	bl 0x00c301d0
0087fa64	str x23,[x19, #0x20]
0087fa68	strb w25,[x19, #0x30]
0087fa6c	cbz x22,0x0087fa8c
0087fa70	mov x0,x22
0087fa74	bl 0x00c301d0
0087fa78	mov x0,x21
0087fa7c	bl 0x00c301d0
0087fa80	mov x0,xzr
0087fa84	bl 0x00c301d0
0087fa88	mov x21,xzr
0087fa8c	mov x0,x21
0087fa90	ldp x20,x19,[sp, #0x40]
0087fa94	ldr x25,[sp, #0x10]
0087fa98	ldp x22,x21,[sp, #0x30]
0087fa9c	ldp x24,x23,[sp, #0x20]
0087faa0	ldp x29,x30,[sp], #0x50
0087faa4	b 0x00c301d0
