; FUN_008a0818 @ 008a0818
008a0818	ldp x9,x8,[x0, #0x20]
008a081c	add x10,x9,x9, LSL #0x1
008a0820	cmp x8,x10, LSR #0x2
008a0824	b.cs 0x008a082c
008a0828	ret
008a082c	cbz x8,0x008a08c8
008a0830	ldr x8,[x1]
008a0834	mov x12,#0x2d69
008a0838	movk x12,#0xeb38, LSL #16
008a083c	lsl w10,w8,#0x3
008a0840	lsr x11,x8,#0x20
008a0844	movk x12,#0xea08, LSL #32
008a0848	movk x12,#0x9ddf, LSL #48
008a084c	add x10,x10,#0x8
008a0850	eor x10,x10,x11
008a0854	mul x10,x10,x12
008a0858	eor x11,x11,x10, LSR #0x2f
008a085c	eor x10,x11,x10
008a0860	mov x11,#0x959d
008a0864	mul x10,x10,x12
008a0868	movk x11,#0xb8f4, LSL #16
008a086c	movk x11,#0xd34f, LSL #32
008a0870	movk x11,#0x949d, LSL #48
008a0874	eor x10,x10,x10, LSR #0x2f
008a0878	mul x10,x10,x11
008a087c	ldrb w11,[x0, #0x30]
008a0880	lsr x11,x10,x11
008a0884	ldr x10,[x0, #0x18]
008a0888	lsr x12,x11,#0x6
008a088c	ldr x12,[x10, x12, LSL #0x3]
008a0890	lsr x12,x12,x11
008a0894	tbz w12,#0x0,0x008a08c8
008a0898	ldr x12,[x0]
008a089c	sub x9,x9,#0x1
008a08a0	lsl x13,x11,#0x4
008a08a4	ldr x13,[x12, x13#0x0]
008a08a8	cmp x13,x8
008a08ac	b.eq 0x008a0828
008a08b0	add x11,x11,#0x1
008a08b4	and x11,x11,x9
008a08b8	lsr x13,x11,#0x6
008a08bc	ldr x13,[x10, x13, LSL #0x3]
008a08c0	lsr x13,x13,x11
008a08c4	tbnz w13,#0x0,0x008a08a0
008a08c8	b 0x008a08cc
008a08cc	stp x29,x30,[sp, #-0x50]!
008a08d0	str x25,[sp, #0x10]
008a08d4	stp x24,x23,[sp, #0x20]
008a08d8	stp x22,x21,[sp, #0x30]
008a08dc	stp x20,x19,[sp, #0x40]
008a08e0	mov x29,sp
008a08e4	ldr x9,[x0, #0x20]
008a08e8	mov w8,#0x10
008a08ec	mov x19,x0
008a08f0	lsl x10,x9,#0x1
008a08f4	cmp x9,#0x0
008a08f8	csel x23,x8,x10,eq
008a08fc	cbz x23,0x008a094c
008a0900	cmp x23,#0x40
008a0904	mov w22,#0x40
008a0908	csel x8,x23,x22,hi
008a090c	lsr x24,x8,#0x6
008a0910	lsl x21,x24,#0x3
008a0914	mov x0,x21
008a0918	bl 0x00c2fed0
008a091c	mov w1,wzr
008a0920	mov x2,x21
008a0924	mov x20,x0
008a0928	bl 0x00c301c0
008a092c	lsl x0,x23,#0x4
008a0930	bl 0x00c2fed0
008a0934	rbit x8,x23
008a0938	clz x8,x8
008a093c	sub w25,w22,w8
008a0940	ldp x8,x21,[x19, #0x10]
008a0944	cbnz x8,0x008a0964
008a0948	b 0x008a0ac8
008a094c	mov x24,xzr
008a0950	mov x20,xzr
008a0954	mov x0,xzr
008a0958	mov w25,#0x40
008a095c	ldp x8,x21,[x19, #0x10]
008a0960	cbz x8,0x008a0ac8
008a0964	ldr x10,[x21]
008a0968	cbz x10,0x008a0974
008a096c	mov x9,xzr
008a0970	b 0x008a0994
008a0974	mov x9,xzr
008a0978	add x11,x21,#0x8
008a097c	sub x12,x8,#0x1
008a0980	cmp x12,x9
008a0984	b.eq 0x008a0ac8
008a0988	ldr x10,[x11, x9, LSL #0x3]
008a098c	add x9,x9,#0x1
008a0990	cbz x10,0x008a0980
008a0994	rbit x12,x10
008a0998	mov x11,#0x2d69
008a099c	mov x15,#0x959d
008a09a0	movk x11,#0xeb38, LSL #16
008a09a4	movk x15,#0xb8f4, LSL #16
008a09a8	ldr x22,[x19]
008a09ac	clz x12,x12
008a09b0	movk x11,#0xea08, LSL #32
008a09b4	movk x15,#0xd34f, LSL #32
008a09b8	orr x17,x12,x9, LSL #0x6
008a09bc	movk x11,#0x9ddf, LSL #48
008a09c0	sub x12,x23,#0x1
008a09c4	and x13,x25,#0xff
008a09c8	add x14,x21,#0x8
008a09cc	movk x15,#0x949d, LSL #48
008a09d0	mov w16,#0x1
008a09d4	add x1,x22,x17, LSL #0x4
008a09d8	ldr x5,[x1]
008a09dc	lsl w2,w5,#0x3
008a09e0	lsr x3,x5,#0x20
008a09e4	add x2,x2,#0x8
008a09e8	eor x2,x2,x3
008a09ec	mul x2,x2,x11
008a09f0	eor x3,x3,x2, LSR #0x2f
008a09f4	eor x2,x3,x2
008a09f8	mul x2,x2,x11
008a09fc	eor x2,x2,x2, LSR #0x2f
008a0a00	mul x2,x2,x15
008a0a04	lsr x2,x2,x13
008a0a08	lsr x3,x2,#0x6
008a0a0c	lsl x4,x16,x2
008a0a10	ldr x6,[x20, x3, LSL #0x3]
008a0a14	tst x4,x6
008a0a18	b.eq 0x008a0a58
008a0a1c	lsl x3,x2,#0x4
008a0a20	ldr x3,[x0, x3#0x0]
008a0a24	cmp x3,x5
008a0a28	b.eq 0x008a0a4c
008a0a2c	add x2,x2,#0x1
008a0a30	and x2,x2,x12
008a0a34	lsr x3,x2,#0x6
008a0a38	lsl x4,x16,x2
008a0a3c	ldr x6,[x20, x3, LSL #0x3]
008a0a40	tst x6,x4
008a0a44	b.ne 0x008a0a1c
008a0a48	b 0x008a0a54
008a0a4c	lsr x3,x2,#0x6
008a0a50	lsl x4,x16,x2
008a0a54	ldr x6,[x20, x3, LSL #0x3]
008a0a58	orr x4,x6,x4
008a0a5c	str x4,[x20, x3, LSL #0x3]
008a0a60	sub x3,x10,#0x1
008a0a64	ldr q0,[x1]
008a0a68	ands x10,x3,x10
008a0a6c	str q0,[x0,x2, lsl #4]
008a0a70	b.ne 0x008a0a9c
008a0a74	add x10,x9,#0x1
008a0a78	cmp x8,x10
008a0a7c	csinc x1,x8,x9,hi
008a0a80	add x2,x9,#0x1
008a0a84	cmp x2,x8
008a0a88	b.cs 0x008a0ab8
008a0a8c	ldr x10,[x14, x9, LSL #0x3]
008a0a90	mov x9,x2
008a0a94	cbz x10,0x008a0a80
008a0a98	mov x9,x2
008a0a9c	rbit x17,x10
008a0aa0	clz x17,x17
008a0aa4	orr x17,x17,x9, LSL #0x6
008a0aa8	cbnz x10,0x008a09d4
008a0aac	cmp x9,x8
008a0ab0	b.ne 0x008a09d4
008a0ab4	b 0x008a0acc
008a0ab8	mov x10,xzr
008a0abc	mov x9,x1
008a0ac0	cbz x10,0x008a0aac
008a0ac4	b 0x008a09d4
008a0ac8	ldr x22,[x19]
008a0acc	stp x0,xzr,[x19]
008a0ad0	mov x0,xzr
008a0ad4	stp xzr,xzr,[x19, #0x10]
008a0ad8	bl 0x00c301d0
008a0adc	mov x0,xzr
008a0ae0	stp x24,x20,[x19, #0x10]
008a0ae4	str x23,[x19, #0x8]
008a0ae8	bl 0x00c301d0
008a0aec	mov x0,xzr
008a0af0	bl 0x00c301d0
008a0af4	str x23,[x19, #0x20]
008a0af8	strb w25,[x19, #0x30]
008a0afc	cbz x22,0x008a0b1c
008a0b00	mov x0,x22
008a0b04	bl 0x00c301d0
008a0b08	mov x0,x21
008a0b0c	bl 0x00c301d0
008a0b10	mov x0,xzr
008a0b14	bl 0x00c301d0
008a0b18	mov x21,xzr
008a0b1c	mov x0,x21
008a0b20	ldp x20,x19,[sp, #0x40]
008a0b24	ldr x25,[sp, #0x10]
008a0b28	ldp x22,x21,[sp, #0x30]
008a0b2c	ldp x24,x23,[sp, #0x20]
008a0b30	ldp x29,x30,[sp], #0x50
008a0b34	b 0x00c301d0
