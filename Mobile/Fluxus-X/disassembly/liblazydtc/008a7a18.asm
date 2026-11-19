; FUN_008a7a18 @ 008a7a18
008a7a18	stp x29,x30,[sp, #-0x20]!
008a7a1c	stp x20,x19,[sp, #0x10]
008a7a20	mov x29,sp
008a7a24	mov x20,x1
008a7a28	mov x19,x0
008a7a2c	bl 0x008a7b18
008a7a30	ldr x8,[x20]
008a7a34	mov x11,#0x2d69
008a7a38	movk x11,#0xeb38, LSL #16
008a7a3c	lsl w9,w8,#0x3
008a7a40	lsr x10,x8,#0x20
008a7a44	movk x11,#0xea08, LSL #32
008a7a48	movk x11,#0x9ddf, LSL #48
008a7a4c	add x9,x9,#0x8
008a7a50	eor x9,x9,x10
008a7a54	mul x9,x9,x11
008a7a58	eor x10,x10,x9, LSR #0x2f
008a7a5c	eor x9,x10,x9
008a7a60	mov x10,#0x959d
008a7a64	mul x9,x9,x11
008a7a68	movk x10,#0xb8f4, LSL #16
008a7a6c	ldr x11,[x19, #0x18]
008a7a70	movk x10,#0xd34f, LSL #32
008a7a74	movk x10,#0x949d, LSL #48
008a7a78	eor x9,x9,x9, LSR #0x2f
008a7a7c	mul x9,x9,x10
008a7a80	ldrb w10,[x19, #0x30]
008a7a84	lsr x9,x9,x10
008a7a88	mov w10,#0x1
008a7a8c	lsr x12,x9,#0x6
008a7a90	lsl x14,x10,x9
008a7a94	ldr x10,[x19]
008a7a98	ldr x13,[x11, x12, LSL #0x3]
008a7a9c	tst x14,x13
008a7aa0	b.eq 0x008a7adc
008a7aa4	ldr x12,[x19, #0x20]
008a7aa8	mov w16,#0x1
008a7aac	sub x15,x12,#0x1
008a7ab0	lsl x12,x9,#0x5
008a7ab4	ldr x12,[x10, x12#0x0]
008a7ab8	cmp x12,x8
008a7abc	b.eq 0x008a7b04
008a7ac0	add x9,x9,#0x1
008a7ac4	and x9,x9,x15
008a7ac8	lsr x12,x9,#0x6
008a7acc	lsl x14,x16,x9
008a7ad0	ldr x13,[x11, x12, LSL #0x3]
008a7ad4	tst x13,x14
008a7ad8	b.ne 0x008a7ab0
008a7adc	add x10,x10,x9, LSL #0x5
008a7ae0	orr x13,x13,x14
008a7ae4	str x13,[x11, x12, LSL #0x3]
008a7ae8	stp xzr,xzr,[x10, #0x8]
008a7aec	str xzr,[x10, #0x18]
008a7af0	ldr x11,[x19, #0x28]
008a7af4	str x8,[x10]
008a7af8	ldr x10,[x19]
008a7afc	add x8,x11,#0x1
008a7b00	str x8,[x19, #0x28]
008a7b04	add x8,x10,x9, LSL #0x5
008a7b08	add x0,x8,#0x8
008a7b0c	ldp x20,x19,[sp, #0x10]
008a7b10	ldp x29,x30,[sp], #0x20
008a7b14	ret
