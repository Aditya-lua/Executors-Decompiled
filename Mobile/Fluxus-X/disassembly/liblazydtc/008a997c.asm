; FUN_008a997c @ 008a997c
008a997c	ldp x9,x8,[x0, #0x20]
008a9980	add x10,x9,x9, LSL #0x1
008a9984	cmp x8,x10, LSR #0x2
008a9988	b.cs 0x008a9990
008a998c	ret
008a9990	cbz x8,0x008a9a30
008a9994	ldr x8,[x1]
008a9998	mov x12,#0x2d69
008a999c	movk x12,#0xeb38, LSL #16
008a99a0	lsl w10,w8,#0x3
008a99a4	lsr x11,x8,#0x20
008a99a8	movk x12,#0xea08, LSL #32
008a99ac	movk x12,#0x9ddf, LSL #48
008a99b0	add x10,x10,#0x8
008a99b4	eor x10,x10,x11
008a99b8	mul x10,x10,x12
008a99bc	eor x11,x11,x10, LSR #0x2f
008a99c0	eor x10,x11,x10
008a99c4	mov x11,#0x959d
008a99c8	mul x10,x10,x12
008a99cc	movk x11,#0xb8f4, LSL #16
008a99d0	movk x11,#0xd34f, LSL #32
008a99d4	movk x11,#0x949d, LSL #48
008a99d8	eor x10,x10,x10, LSR #0x2f
008a99dc	mul x10,x10,x11
008a99e0	ldrb w11,[x0, #0x30]
008a99e4	lsr x11,x10,x11
008a99e8	ldr x10,[x0, #0x18]
008a99ec	lsr x12,x11,#0x6
008a99f0	ldr x12,[x10, x12, LSL #0x3]
008a99f4	lsr x12,x12,x11
008a99f8	tbz w12,#0x0,0x008a9a30
008a99fc	ldr x12,[x0]
008a9a00	sub x9,x9,#0x1
008a9a04	mov w13,#0x28
008a9a08	mul x14,x11,x13
008a9a0c	ldr x14,[x12, x14#0x0]
008a9a10	cmp x14,x8
008a9a14	b.eq 0x008a998c
008a9a18	add x11,x11,#0x1
008a9a1c	and x11,x11,x9
008a9a20	lsr x14,x11,#0x6
008a9a24	ldr x14,[x10, x14, LSL #0x3]
008a9a28	lsr x14,x14,x11
008a9a2c	tbnz w14,#0x0,0x008a9a08
008a9a30	b 0x008a9a34
008a9a34	stp x29,x30,[sp, #-0x50]!
008a9a38	str x25,[sp, #0x10]
008a9a3c	stp x24,x23,[sp, #0x20]
008a9a40	stp x22,x21,[sp, #0x30]
008a9a44	stp x20,x19,[sp, #0x40]
008a9a48	mov x29,sp
008a9a4c	ldr x9,[x0, #0x20]
008a9a50	mov w8,#0x10
008a9a54	mov x19,x0
008a9a58	lsl x10,x9,#0x1
008a9a5c	cmp x9,#0x0
008a9a60	csel x23,x8,x10,eq
008a9a64	cbz x23,0x008a9ab8
008a9a68	cmp x23,#0x40
008a9a6c	mov w22,#0x40
008a9a70	csel x8,x23,x22,hi
008a9a74	lsr x24,x8,#0x6
008a9a78	lsl x21,x24,#0x3
008a9a7c	mov x0,x21
008a9a80	bl 0x00c2fed0
008a9a84	mov w1,wzr
008a9a88	mov x2,x21
008a9a8c	mov x20,x0
008a9a90	bl 0x00c301c0
008a9a94	add x8,x23,x23, LSL #0x2
008a9a98	lsl x0,x8,#0x3
008a9a9c	bl 0x00c2fed0
008a9aa0	rbit x8,x23
008a9aa4	clz x8,x8
008a9aa8	sub w25,w22,w8
008a9aac	ldp x8,x21,[x19, #0x10]
008a9ab0	cbnz x8,0x008a9ad0
008a9ab4	b 0x008a9c48
008a9ab8	mov x24,xzr
008a9abc	mov x20,xzr
008a9ac0	mov x0,xzr
008a9ac4	mov w25,#0x40
008a9ac8	ldp x8,x21,[x19, #0x10]
008a9acc	cbz x8,0x008a9c48
008a9ad0	ldr x10,[x21]
008a9ad4	cbz x10,0x008a9ae0
008a9ad8	mov x9,xzr
008a9adc	b 0x008a9b00
008a9ae0	mov x9,xzr
008a9ae4	add x11,x21,#0x8
008a9ae8	sub x12,x8,#0x1
008a9aec	cmp x12,x9
008a9af0	b.eq 0x008a9c48
008a9af4	ldr x10,[x11, x9, LSL #0x3]
008a9af8	add x9,x9,#0x1
008a9afc	cbz x10,0x008a9aec
008a9b00	rbit x11,x10
008a9b04	mov x16,#0x959d
008a9b08	ldr x22,[x19]
008a9b0c	movk x16,#0xb8f4, LSL #16
008a9b10	and x13,x25,#0xff
008a9b14	add x14,x21,#0x8
008a9b18	clz x12,x11
008a9b1c	mov x11,#0x2d69
008a9b20	movk x16,#0xd34f, LSL #32
008a9b24	movk x11,#0xeb38, LSL #16
008a9b28	orr x1,x12,x9, LSL #0x6
008a9b2c	sub x12,x23,#0x1
008a9b30	movk x11,#0xea08, LSL #32
008a9b34	mov w15,#0x28
008a9b38	movk x16,#0x949d, LSL #48
008a9b3c	movk x11,#0x9ddf, LSL #48
008a9b40	mov w17,#0x1
008a9b44	madd x2,x1,x15,x22
008a9b48	ldr x6,[x2]
008a9b4c	lsl w3,w6,#0x3
008a9b50	lsr x4,x6,#0x20
008a9b54	add x3,x3,#0x8
008a9b58	eor x3,x3,x4
008a9b5c	mul x3,x3,x11
008a9b60	eor x4,x4,x3, LSR #0x2f
008a9b64	eor x3,x4,x3
008a9b68	mul x3,x3,x11
008a9b6c	eor x3,x3,x3, LSR #0x2f
008a9b70	mul x3,x3,x16
008a9b74	lsr x3,x3,x13
008a9b78	lsr x4,x3,#0x6
008a9b7c	lsl x5,x17,x3
008a9b80	ldr x7,[x20, x4, LSL #0x3]
008a9b84	tst x5,x7
008a9b88	b.eq 0x008a9bc8
008a9b8c	mul x4,x3,x15
008a9b90	ldr x4,[x0, x4#0x0]
008a9b94	cmp x4,x6
008a9b98	b.eq 0x008a9bbc
008a9b9c	add x3,x3,#0x1
008a9ba0	and x3,x3,x12
008a9ba4	lsr x4,x3,#0x6
008a9ba8	lsl x5,x17,x3
008a9bac	ldr x7,[x20, x4, LSL #0x3]
008a9bb0	tst x7,x5
008a9bb4	b.ne 0x008a9b8c
008a9bb8	b 0x008a9bc4
008a9bbc	lsr x4,x3,#0x6
008a9bc0	lsl x5,x17,x3
008a9bc4	ldr x7,[x20, x4, LSL #0x3]
008a9bc8	nop
008a9bcc	madd x3,x3,x15,x0
008a9bd0	orr x5,x7,x5
008a9bd4	str x5,[x20, x4, LSL #0x3]
008a9bd8	ldp q1,q0,[x2]
008a9bdc	ldr x4,[x2, #0x20]
008a9be0	sub x2,x10,#0x1
008a9be4	ands x10,x2,x10
008a9be8	str x4,[x3, #0x20]
008a9bec	stp q1,q0,[x3]
008a9bf0	b.ne 0x008a9c1c
008a9bf4	add x10,x9,#0x1
008a9bf8	cmp x8,x10
008a9bfc	csinc x2,x8,x9,hi
008a9c00	add x3,x9,#0x1
008a9c04	cmp x3,x8
008a9c08	b.cs 0x008a9c38
008a9c0c	ldr x10,[x14, x9, LSL #0x3]
008a9c10	mov x9,x3
008a9c14	cbz x10,0x008a9c00
008a9c18	mov x9,x3
008a9c1c	rbit x1,x10
008a9c20	clz x1,x1
008a9c24	orr x1,x1,x9, LSL #0x6
008a9c28	cbnz x10,0x008a9b44
008a9c2c	cmp x9,x8
008a9c30	b.ne 0x008a9b44
008a9c34	b 0x008a9c4c
008a9c38	mov x10,xzr
008a9c3c	mov x9,x2
008a9c40	cbz x10,0x008a9c2c
008a9c44	b 0x008a9b44
008a9c48	ldr x22,[x19]
008a9c4c	stp x0,xzr,[x19]
008a9c50	mov x0,xzr
008a9c54	stp xzr,xzr,[x19, #0x10]
008a9c58	bl 0x00c301d0
008a9c5c	mov x0,xzr
008a9c60	stp x24,x20,[x19, #0x10]
008a9c64	str x23,[x19, #0x8]
008a9c68	bl 0x00c301d0
008a9c6c	mov x0,xzr
008a9c70	bl 0x00c301d0
008a9c74	str x23,[x19, #0x20]
008a9c78	strb w25,[x19, #0x30]
008a9c7c	cbz x22,0x008a9c9c
008a9c80	mov x0,x22
008a9c84	bl 0x00c301d0
008a9c88	mov x0,x21
008a9c8c	bl 0x00c301d0
008a9c90	mov x0,xzr
008a9c94	bl 0x00c301d0
008a9c98	mov x21,xzr
008a9c9c	mov x0,x21
008a9ca0	ldp x20,x19,[sp, #0x40]
008a9ca4	ldr x25,[sp, #0x10]
008a9ca8	ldp x22,x21,[sp, #0x30]
008a9cac	ldp x24,x23,[sp, #0x20]
008a9cb0	ldp x29,x30,[sp], #0x50
008a9cb4	b 0x00c301d0
