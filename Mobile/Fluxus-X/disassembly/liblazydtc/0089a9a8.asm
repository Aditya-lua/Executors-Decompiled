; FUN_0089a9a8 @ 0089a9a8
0089a9a8	ldp x9,x8,[x0, #0x20]
0089a9ac	add x10,x9,x9, LSL #0x1
0089a9b0	cmp x8,x10, LSR #0x2
0089a9b4	b.cs 0x0089a9bc
0089a9b8	ret
0089a9bc	cbz x8,0x0089aa58
0089a9c0	ldr x8,[x1]
0089a9c4	mov x12,#0x2d69
0089a9c8	movk x12,#0xeb38, LSL #16
0089a9cc	lsl w10,w8,#0x3
0089a9d0	lsr x11,x8,#0x20
0089a9d4	movk x12,#0xea08, LSL #32
0089a9d8	movk x12,#0x9ddf, LSL #48
0089a9dc	add x10,x10,#0x8
0089a9e0	eor x10,x10,x11
0089a9e4	mul x10,x10,x12
0089a9e8	eor x11,x11,x10, LSR #0x2f
0089a9ec	eor x10,x11,x10
0089a9f0	mov x11,#0x959d
0089a9f4	mul x10,x10,x12
0089a9f8	movk x11,#0xb8f4, LSL #16
0089a9fc	movk x11,#0xd34f, LSL #32
0089aa00	movk x11,#0x949d, LSL #48
0089aa04	eor x10,x10,x10, LSR #0x2f
0089aa08	mul x10,x10,x11
0089aa0c	ldrb w11,[x0, #0x30]
0089aa10	lsr x11,x10,x11
0089aa14	ldr x10,[x0, #0x18]
0089aa18	lsr x12,x11,#0x6
0089aa1c	ldr x12,[x10, x12, LSL #0x3]
0089aa20	lsr x12,x12,x11
0089aa24	tbz w12,#0x0,0x0089aa58
0089aa28	ldr x12,[x0]
0089aa2c	sub x9,x9,#0x1
0089aa30	lsl x13,x11,#0x4
0089aa34	ldr x13,[x12, x13#0x0]
0089aa38	cmp x13,x8
0089aa3c	b.eq 0x0089a9b8
0089aa40	add x11,x11,#0x1
0089aa44	and x11,x11,x9
0089aa48	lsr x13,x11,#0x6
0089aa4c	ldr x13,[x10, x13, LSL #0x3]
0089aa50	lsr x13,x13,x11
0089aa54	tbnz w13,#0x0,0x0089aa30
0089aa58	b 0x0089aa5c
0089aa5c	stp x29,x30,[sp, #-0x50]!
0089aa60	str x25,[sp, #0x10]
0089aa64	stp x24,x23,[sp, #0x20]
0089aa68	stp x22,x21,[sp, #0x30]
0089aa6c	stp x20,x19,[sp, #0x40]
0089aa70	mov x29,sp
0089aa74	ldr x9,[x0, #0x20]
0089aa78	mov w8,#0x10
0089aa7c	mov x19,x0
0089aa80	lsl x10,x9,#0x1
0089aa84	cmp x9,#0x0
0089aa88	csel x23,x8,x10,eq
0089aa8c	cbz x23,0x0089aadc
0089aa90	cmp x23,#0x40
0089aa94	mov w22,#0x40
0089aa98	csel x8,x23,x22,hi
0089aa9c	lsr x24,x8,#0x6
0089aaa0	lsl x21,x24,#0x3
0089aaa4	mov x0,x21
0089aaa8	bl 0x00c2fed0
0089aaac	mov w1,wzr
0089aab0	mov x2,x21
0089aab4	mov x20,x0
0089aab8	bl 0x00c301c0
0089aabc	lsl x0,x23,#0x4
0089aac0	bl 0x00c2fed0
0089aac4	rbit x8,x23
0089aac8	clz x8,x8
0089aacc	sub w25,w22,w8
0089aad0	ldp x8,x21,[x19, #0x10]
0089aad4	cbnz x8,0x0089aaf4
0089aad8	b 0x0089ac58
0089aadc	mov x24,xzr
0089aae0	mov x20,xzr
0089aae4	mov x0,xzr
0089aae8	mov w25,#0x40
0089aaec	ldp x8,x21,[x19, #0x10]
0089aaf0	cbz x8,0x0089ac58
0089aaf4	ldr x10,[x21]
0089aaf8	cbz x10,0x0089ab04
0089aafc	mov x9,xzr
0089ab00	b 0x0089ab24
0089ab04	mov x9,xzr
0089ab08	add x11,x21,#0x8
0089ab0c	sub x12,x8,#0x1
0089ab10	cmp x12,x9
0089ab14	b.eq 0x0089ac58
0089ab18	ldr x10,[x11, x9, LSL #0x3]
0089ab1c	add x9,x9,#0x1
0089ab20	cbz x10,0x0089ab10
0089ab24	rbit x12,x10
0089ab28	mov x11,#0x2d69
0089ab2c	mov x15,#0x959d
0089ab30	movk x11,#0xeb38, LSL #16
0089ab34	movk x15,#0xb8f4, LSL #16
0089ab38	ldr x22,[x19]
0089ab3c	clz x12,x12
0089ab40	movk x11,#0xea08, LSL #32
0089ab44	movk x15,#0xd34f, LSL #32
0089ab48	orr x17,x12,x9, LSL #0x6
0089ab4c	movk x11,#0x9ddf, LSL #48
0089ab50	sub x12,x23,#0x1
0089ab54	and x13,x25,#0xff
0089ab58	add x14,x21,#0x8
0089ab5c	movk x15,#0x949d, LSL #48
0089ab60	mov w16,#0x1
0089ab64	add x1,x22,x17, LSL #0x4
0089ab68	ldr x5,[x1]
0089ab6c	lsl w2,w5,#0x3
0089ab70	lsr x3,x5,#0x20
0089ab74	add x2,x2,#0x8
0089ab78	eor x2,x2,x3
0089ab7c	mul x2,x2,x11
0089ab80	eor x3,x3,x2, LSR #0x2f
0089ab84	eor x2,x3,x2
0089ab88	mul x2,x2,x11
0089ab8c	eor x2,x2,x2, LSR #0x2f
0089ab90	mul x2,x2,x15
0089ab94	lsr x2,x2,x13
0089ab98	lsr x3,x2,#0x6
0089ab9c	lsl x4,x16,x2
0089aba0	ldr x6,[x20, x3, LSL #0x3]
0089aba4	tst x4,x6
0089aba8	b.eq 0x0089abe8
0089abac	lsl x3,x2,#0x4
0089abb0	ldr x3,[x0, x3#0x0]
0089abb4	cmp x3,x5
0089abb8	b.eq 0x0089abdc
0089abbc	add x2,x2,#0x1
0089abc0	and x2,x2,x12
0089abc4	lsr x3,x2,#0x6
0089abc8	lsl x4,x16,x2
0089abcc	ldr x6,[x20, x3, LSL #0x3]
0089abd0	tst x6,x4
0089abd4	b.ne 0x0089abac
0089abd8	b 0x0089abe4
0089abdc	lsr x3,x2,#0x6
0089abe0	lsl x4,x16,x2
0089abe4	ldr x6,[x20, x3, LSL #0x3]
0089abe8	orr x4,x6,x4
0089abec	str x4,[x20, x3, LSL #0x3]
0089abf0	sub x3,x10,#0x1
0089abf4	ldr q0,[x1]
0089abf8	ands x10,x3,x10
0089abfc	str q0,[x0,x2, lsl #4]
0089ac00	b.ne 0x0089ac2c
0089ac04	add x10,x9,#0x1
0089ac08	cmp x8,x10
0089ac0c	csinc x1,x8,x9,hi
0089ac10	add x2,x9,#0x1
0089ac14	cmp x2,x8
0089ac18	b.cs 0x0089ac48
0089ac1c	ldr x10,[x14, x9, LSL #0x3]
0089ac20	mov x9,x2
0089ac24	cbz x10,0x0089ac10
0089ac28	mov x9,x2
0089ac2c	rbit x17,x10
0089ac30	clz x17,x17
0089ac34	orr x17,x17,x9, LSL #0x6
0089ac38	cbnz x10,0x0089ab64
0089ac3c	cmp x9,x8
0089ac40	b.ne 0x0089ab64
0089ac44	b 0x0089ac5c
0089ac48	mov x10,xzr
0089ac4c	mov x9,x1
0089ac50	cbz x10,0x0089ac3c
0089ac54	b 0x0089ab64
0089ac58	ldr x22,[x19]
0089ac5c	stp x0,xzr,[x19]
0089ac60	mov x0,xzr
0089ac64	stp xzr,xzr,[x19, #0x10]
0089ac68	bl 0x00c301d0
0089ac6c	mov x0,xzr
0089ac70	stp x24,x20,[x19, #0x10]
0089ac74	str x23,[x19, #0x8]
0089ac78	bl 0x00c301d0
0089ac7c	mov x0,xzr
0089ac80	bl 0x00c301d0
0089ac84	str x23,[x19, #0x20]
0089ac88	strb w25,[x19, #0x30]
0089ac8c	cbz x22,0x0089acac
0089ac90	mov x0,x22
0089ac94	bl 0x00c301d0
0089ac98	mov x0,x21
0089ac9c	bl 0x00c301d0
0089aca0	mov x0,xzr
0089aca4	bl 0x00c301d0
0089aca8	mov x21,xzr
0089acac	mov x0,x21
0089acb0	ldp x20,x19,[sp, #0x40]
0089acb4	ldr x25,[sp, #0x10]
0089acb8	ldp x22,x21,[sp, #0x30]
0089acbc	ldp x24,x23,[sp, #0x20]
0089acc0	ldp x29,x30,[sp], #0x50
0089acc4	b 0x00c301d0
