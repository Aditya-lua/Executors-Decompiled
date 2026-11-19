; FUN_008a2840 @ 008a2840
008a2840	ldp x9,x8,[x0, #0x20]
008a2844	add x10,x9,x9, LSL #0x1
008a2848	cmp x8,x10, LSR #0x2
008a284c	b.cs 0x008a2854
008a2850	ret
008a2854	cbz x8,0x008a28f0
008a2858	ldr x8,[x1]
008a285c	mov x12,#0x2d69
008a2860	movk x12,#0xeb38, LSL #16
008a2864	lsl w10,w8,#0x3
008a2868	lsr x11,x8,#0x20
008a286c	movk x12,#0xea08, LSL #32
008a2870	movk x12,#0x9ddf, LSL #48
008a2874	add x10,x10,#0x8
008a2878	eor x10,x10,x11
008a287c	mul x10,x10,x12
008a2880	eor x11,x11,x10, LSR #0x2f
008a2884	eor x10,x11,x10
008a2888	mov x11,#0x959d
008a288c	mul x10,x10,x12
008a2890	movk x11,#0xb8f4, LSL #16
008a2894	movk x11,#0xd34f, LSL #32
008a2898	movk x11,#0x949d, LSL #48
008a289c	eor x10,x10,x10, LSR #0x2f
008a28a0	mul x10,x10,x11
008a28a4	ldrb w11,[x0, #0x30]
008a28a8	lsr x11,x10,x11
008a28ac	ldr x10,[x0, #0x18]
008a28b0	lsr x12,x11,#0x6
008a28b4	ldr x12,[x10, x12, LSL #0x3]
008a28b8	lsr x12,x12,x11
008a28bc	tbz w12,#0x0,0x008a28f0
008a28c0	ldr x12,[x0]
008a28c4	sub x9,x9,#0x1
008a28c8	lsl x13,x11,#0x4
008a28cc	ldr x13,[x12, x13#0x0]
008a28d0	cmp x13,x8
008a28d4	b.eq 0x008a2850
008a28d8	add x11,x11,#0x1
008a28dc	and x11,x11,x9
008a28e0	lsr x13,x11,#0x6
008a28e4	ldr x13,[x10, x13, LSL #0x3]
008a28e8	lsr x13,x13,x11
008a28ec	tbnz w13,#0x0,0x008a28c8
008a28f0	b 0x008a28f4
008a28f4	stp x29,x30,[sp, #-0x50]!
008a28f8	str x25,[sp, #0x10]
008a28fc	stp x24,x23,[sp, #0x20]
008a2900	stp x22,x21,[sp, #0x30]
008a2904	stp x20,x19,[sp, #0x40]
008a2908	mov x29,sp
008a290c	ldr x9,[x0, #0x20]
008a2910	mov w8,#0x10
008a2914	mov x19,x0
008a2918	lsl x10,x9,#0x1
008a291c	cmp x9,#0x0
008a2920	csel x23,x8,x10,eq
008a2924	cbz x23,0x008a2974
008a2928	cmp x23,#0x40
008a292c	mov w22,#0x40
008a2930	csel x8,x23,x22,hi
008a2934	lsr x24,x8,#0x6
008a2938	lsl x21,x24,#0x3
008a293c	mov x0,x21
008a2940	bl 0x00c2fed0
008a2944	mov w1,wzr
008a2948	mov x2,x21
008a294c	mov x20,x0
008a2950	bl 0x00c301c0
008a2954	lsl x0,x23,#0x4
008a2958	bl 0x00c2fed0
008a295c	rbit x8,x23
008a2960	clz x8,x8
008a2964	sub w25,w22,w8
008a2968	ldp x8,x21,[x19, #0x10]
008a296c	cbnz x8,0x008a298c
008a2970	b 0x008a2af0
008a2974	mov x24,xzr
008a2978	mov x20,xzr
008a297c	mov x0,xzr
008a2980	mov w25,#0x40
008a2984	ldp x8,x21,[x19, #0x10]
008a2988	cbz x8,0x008a2af0
008a298c	ldr x10,[x21]
008a2990	cbz x10,0x008a299c
008a2994	mov x9,xzr
008a2998	b 0x008a29bc
008a299c	mov x9,xzr
008a29a0	add x11,x21,#0x8
008a29a4	sub x12,x8,#0x1
008a29a8	cmp x12,x9
008a29ac	b.eq 0x008a2af0
008a29b0	ldr x10,[x11, x9, LSL #0x3]
008a29b4	add x9,x9,#0x1
008a29b8	cbz x10,0x008a29a8
008a29bc	rbit x12,x10
008a29c0	mov x11,#0x2d69
008a29c4	mov x15,#0x959d
008a29c8	movk x11,#0xeb38, LSL #16
008a29cc	movk x15,#0xb8f4, LSL #16
008a29d0	ldr x22,[x19]
008a29d4	clz x12,x12
008a29d8	movk x11,#0xea08, LSL #32
008a29dc	movk x15,#0xd34f, LSL #32
008a29e0	orr x17,x12,x9, LSL #0x6
008a29e4	movk x11,#0x9ddf, LSL #48
008a29e8	sub x12,x23,#0x1
008a29ec	and x13,x25,#0xff
008a29f0	add x14,x21,#0x8
008a29f4	movk x15,#0x949d, LSL #48
008a29f8	mov w16,#0x1
008a29fc	add x1,x22,x17, LSL #0x4
008a2a00	ldr x5,[x1]
008a2a04	lsl w2,w5,#0x3
008a2a08	lsr x3,x5,#0x20
008a2a0c	add x2,x2,#0x8
008a2a10	eor x2,x2,x3
008a2a14	mul x2,x2,x11
008a2a18	eor x3,x3,x2, LSR #0x2f
008a2a1c	eor x2,x3,x2
008a2a20	mul x2,x2,x11
008a2a24	eor x2,x2,x2, LSR #0x2f
008a2a28	mul x2,x2,x15
008a2a2c	lsr x2,x2,x13
008a2a30	lsr x3,x2,#0x6
008a2a34	lsl x4,x16,x2
008a2a38	ldr x6,[x20, x3, LSL #0x3]
008a2a3c	tst x4,x6
008a2a40	b.eq 0x008a2a80
008a2a44	lsl x3,x2,#0x4
008a2a48	ldr x3,[x0, x3#0x0]
008a2a4c	cmp x3,x5
008a2a50	b.eq 0x008a2a74
008a2a54	add x2,x2,#0x1
008a2a58	and x2,x2,x12
008a2a5c	lsr x3,x2,#0x6
008a2a60	lsl x4,x16,x2
008a2a64	ldr x6,[x20, x3, LSL #0x3]
008a2a68	tst x6,x4
008a2a6c	b.ne 0x008a2a44
008a2a70	b 0x008a2a7c
008a2a74	lsr x3,x2,#0x6
008a2a78	lsl x4,x16,x2
008a2a7c	ldr x6,[x20, x3, LSL #0x3]
008a2a80	orr x4,x6,x4
008a2a84	str x4,[x20, x3, LSL #0x3]
008a2a88	sub x3,x10,#0x1
008a2a8c	ldr q0,[x1]
008a2a90	ands x10,x3,x10
008a2a94	str q0,[x0,x2, lsl #4]
008a2a98	b.ne 0x008a2ac4
008a2a9c	add x10,x9,#0x1
008a2aa0	cmp x8,x10
008a2aa4	csinc x1,x8,x9,hi
008a2aa8	add x2,x9,#0x1
008a2aac	cmp x2,x8
008a2ab0	b.cs 0x008a2ae0
008a2ab4	ldr x10,[x14, x9, LSL #0x3]
008a2ab8	mov x9,x2
008a2abc	cbz x10,0x008a2aa8
008a2ac0	mov x9,x2
008a2ac4	rbit x17,x10
008a2ac8	clz x17,x17
008a2acc	orr x17,x17,x9, LSL #0x6
008a2ad0	cbnz x10,0x008a29fc
008a2ad4	cmp x9,x8
008a2ad8	b.ne 0x008a29fc
008a2adc	b 0x008a2af4
008a2ae0	mov x10,xzr
008a2ae4	mov x9,x1
008a2ae8	cbz x10,0x008a2ad4
008a2aec	b 0x008a29fc
008a2af0	ldr x22,[x19]
008a2af4	stp x0,xzr,[x19]
008a2af8	mov x0,xzr
008a2afc	stp xzr,xzr,[x19, #0x10]
008a2b00	bl 0x00c301d0
008a2b04	mov x0,xzr
008a2b08	stp x24,x20,[x19, #0x10]
008a2b0c	str x23,[x19, #0x8]
008a2b10	bl 0x00c301d0
008a2b14	mov x0,xzr
008a2b18	bl 0x00c301d0
008a2b1c	str x23,[x19, #0x20]
008a2b20	strb w25,[x19, #0x30]
008a2b24	cbz x22,0x008a2b44
008a2b28	mov x0,x22
008a2b2c	bl 0x00c301d0
008a2b30	mov x0,x21
008a2b34	bl 0x00c301d0
008a2b38	mov x0,xzr
008a2b3c	bl 0x00c301d0
008a2b40	mov x21,xzr
008a2b44	mov x0,x21
008a2b48	ldp x20,x19,[sp, #0x40]
008a2b4c	ldr x25,[sp, #0x10]
008a2b50	ldp x22,x21,[sp, #0x30]
008a2b54	ldp x24,x23,[sp, #0x20]
008a2b58	ldp x29,x30,[sp], #0x50
008a2b5c	b 0x00c301d0
