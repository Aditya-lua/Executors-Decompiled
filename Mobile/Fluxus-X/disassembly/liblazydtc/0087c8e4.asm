; FUN_0087c8e4 @ 0087c8e4
0087c8e4	stp x29,x30,[sp, #-0x50]!
0087c8e8	str x25,[sp, #0x10]
0087c8ec	stp x24,x23,[sp, #0x20]
0087c8f0	stp x22,x21,[sp, #0x30]
0087c8f4	stp x20,x19,[sp, #0x40]
0087c8f8	mov x29,sp
0087c8fc	ldr x9,[x0, #0x20]
0087c900	mov w8,#0x10
0087c904	mov x19,x0
0087c908	lsl x10,x9,#0x1
0087c90c	cmp x9,#0x0
0087c910	csel x23,x8,x10,eq
0087c914	cbz x23,0x0087c964
0087c918	cmp x23,#0x40
0087c91c	mov w22,#0x40
0087c920	csel x8,x23,x22,hi
0087c924	lsr x24,x8,#0x6
0087c928	lsl x21,x24,#0x3
0087c92c	mov x0,x21
0087c930	bl 0x00c2fed0
0087c934	mov w1,wzr
0087c938	mov x2,x21
0087c93c	mov x20,x0
0087c940	bl 0x00c301c0
0087c944	lsl x0,x23,#0x3
0087c948	bl 0x00c2fed0
0087c94c	rbit x8,x23
0087c950	clz x8,x8
0087c954	sub w25,w22,w8
0087c958	ldp x8,x21,[x19, #0x10]
0087c95c	cbnz x8,0x0087c97c
0087c960	b 0x0087caac
0087c964	mov x24,xzr
0087c968	mov x20,xzr
0087c96c	mov x0,xzr
0087c970	mov w25,#0x40
0087c974	ldp x8,x21,[x19, #0x10]
0087c978	cbz x8,0x0087caac
0087c97c	ldr x10,[x21]
0087c980	cbz x10,0x0087c98c
0087c984	mov x9,xzr
0087c988	b 0x0087c9ac
0087c98c	mov x9,xzr
0087c990	add x11,x21,#0x8
0087c994	sub x12,x8,#0x1
0087c998	cmp x12,x9
0087c99c	b.eq 0x0087caac
0087c9a0	ldr x10,[x11, x9, LSL #0x3]
0087c9a4	add x9,x9,#0x1
0087c9a8	cbz x10,0x0087c998
0087c9ac	rbit x11,x10
0087c9b0	mov x14,#0x7c15
0087c9b4	ldr x22,[x19]
0087c9b8	movk x14,#0x7f4a, LSL #16
0087c9bc	and x12,x25,#0xff
0087c9c0	add x13,x21,#0x8
0087c9c4	clz x11,x11
0087c9c8	movk x14,#0x79b9, LSL #32
0087c9cc	mov w15,#0x1
0087c9d0	orr x16,x11,x9, LSL #0x6
0087c9d4	sub x11,x23,#0x1
0087c9d8	movk x14,#0x9e37, LSL #48
0087c9dc	add x17,x22,x16, LSL #0x3
0087c9e0	ldr w4,[x17]
0087c9e4	mul x1,x4,x14
0087c9e8	lsr x1,x1,x12
0087c9ec	lsr x2,x1,#0x6
0087c9f0	lsl x3,x15,x1
0087c9f4	ldr x5,[x20, x2, LSL #0x3]
0087c9f8	tst x3,x5
0087c9fc	b.eq 0x0087ca3c
0087ca00	lsl x2,x1,#0x3
0087ca04	ldr w2,[x0, x2#0x0]
0087ca08	cmp w2,w4
0087ca0c	b.eq 0x0087ca30
0087ca10	add x1,x1,#0x1
0087ca14	and x1,x1,x11
0087ca18	lsr x2,x1,#0x6
0087ca1c	lsl x3,x15,x1
0087ca20	ldr x5,[x20, x2, LSL #0x3]
0087ca24	tst x5,x3
0087ca28	b.ne 0x0087ca00
0087ca2c	b 0x0087ca38
0087ca30	lsr x2,x1,#0x6
0087ca34	lsl x3,x15,x1
0087ca38	ldr x5,[x20, x2, LSL #0x3]
0087ca3c	orr x3,x5,x3
0087ca40	str x3,[x20, x2, LSL #0x3]
0087ca44	sub x2,x10,#0x1
0087ca48	ldr x17,[x17]
0087ca4c	ands x10,x2,x10
0087ca50	str x17,[x0, x1, LSL #0x3]
0087ca54	b.ne 0x0087ca80
0087ca58	add x10,x9,#0x1
0087ca5c	cmp x8,x10
0087ca60	csinc x17,x8,x9,hi
0087ca64	add x1,x9,#0x1
0087ca68	cmp x1,x8
0087ca6c	b.cs 0x0087ca9c
0087ca70	ldr x10,[x13, x9, LSL #0x3]
0087ca74	mov x9,x1
0087ca78	cbz x10,0x0087ca64
0087ca7c	mov x9,x1
0087ca80	rbit x16,x10
0087ca84	clz x16,x16
0087ca88	orr x16,x16,x9, LSL #0x6
0087ca8c	cbnz x10,0x0087c9dc
0087ca90	cmp x9,x8
0087ca94	b.ne 0x0087c9dc
0087ca98	b 0x0087cab0
0087ca9c	mov x10,xzr
0087caa0	mov x9,x17
0087caa4	cbz x10,0x0087ca90
0087caa8	b 0x0087c9dc
0087caac	ldr x22,[x19]
0087cab0	stp x0,xzr,[x19]
0087cab4	mov x0,xzr
0087cab8	stp xzr,xzr,[x19, #0x10]
0087cabc	bl 0x00c301d0
0087cac0	mov x0,xzr
0087cac4	stp x24,x20,[x19, #0x10]
0087cac8	str x23,[x19, #0x8]
0087cacc	bl 0x00c301d0
0087cad0	mov x0,xzr
0087cad4	bl 0x00c301d0
0087cad8	str x23,[x19, #0x20]
0087cadc	strb w25,[x19, #0x30]
0087cae0	cbz x22,0x0087cb00
0087cae4	mov x0,x22
0087cae8	bl 0x00c301d0
0087caec	mov x0,x21
0087caf0	bl 0x00c301d0
0087caf4	mov x0,xzr
0087caf8	bl 0x00c301d0
0087cafc	mov x21,xzr
0087cb00	mov x0,x21
0087cb04	ldp x20,x19,[sp, #0x40]
0087cb08	ldr x25,[sp, #0x10]
0087cb0c	ldp x22,x21,[sp, #0x30]
0087cb10	ldp x24,x23,[sp, #0x20]
0087cb14	ldp x29,x30,[sp], #0x50
0087cb18	b 0x00c301d0
