; FUN_008a6bb8 @ 008a6bb8
008a6bb8	stp x29,x30,[sp, #-0x20]!
008a6bbc	stp x20,x19,[sp, #0x10]
008a6bc0	mov x29,sp
008a6bc4	mov x20,x1
008a6bc8	mov x19,x0
008a6bcc	bl 0x008a70d8
008a6bd0	ldr x8,[x20]
008a6bd4	mov x11,#0x2d69
008a6bd8	movk x11,#0xeb38, LSL #16
008a6bdc	lsl w9,w8,#0x3
008a6be0	lsr x10,x8,#0x20
008a6be4	movk x11,#0xea08, LSL #32
008a6be8	movk x11,#0x9ddf, LSL #48
008a6bec	add x9,x9,#0x8
008a6bf0	eor x9,x9,x10
008a6bf4	mul x9,x9,x11
008a6bf8	eor x10,x10,x9, LSR #0x2f
008a6bfc	eor x9,x10,x9
008a6c00	mov x10,#0x959d
008a6c04	mul x9,x9,x11
008a6c08	movk x10,#0xb8f4, LSL #16
008a6c0c	ldr x11,[x19, #0x18]
008a6c10	movk x10,#0xd34f, LSL #32
008a6c14	movk x10,#0x949d, LSL #48
008a6c18	eor x9,x9,x9, LSR #0x2f
008a6c1c	mul x9,x9,x10
008a6c20	ldrb w10,[x19, #0x30]
008a6c24	lsr x9,x9,x10
008a6c28	mov w10,#0x1
008a6c2c	lsr x12,x9,#0x6
008a6c30	lsl x14,x10,x9
008a6c34	ldr x10,[x19]
008a6c38	ldr x13,[x11, x12, LSL #0x3]
008a6c3c	tst x14,x13
008a6c40	b.eq 0x008a6c7c
008a6c44	ldr x12,[x19, #0x20]
008a6c48	mov w16,#0x1
008a6c4c	sub x15,x12,#0x1
008a6c50	lsl x12,x9,#0x4
008a6c54	ldr x12,[x10, x12#0x0]
008a6c58	cmp x12,x8
008a6c5c	b.eq 0x008a6c9c
008a6c60	add x9,x9,#0x1
008a6c64	and x9,x9,x15
008a6c68	lsr x12,x9,#0x6
008a6c6c	lsl x14,x16,x9
008a6c70	ldr x13,[x11, x12, LSL #0x3]
008a6c74	tst x13,x14
008a6c78	b.ne 0x008a6c50
008a6c7c	orr x13,x13,x14
008a6c80	str x13,[x11, x12, LSL #0x3]
008a6c84	add x11,x10,x9, LSL #0x4
008a6c88	ldr x12,[x19, #0x28]
008a6c8c	str x8,[x11]
008a6c90	add x8,x12,#0x1
008a6c94	str wzr,[x11, #0x8]
008a6c98	str x8,[x19, #0x28]
008a6c9c	add x8,x10,x9, LSL #0x4
008a6ca0	add x0,x8,#0x8
008a6ca4	ldp x20,x19,[sp, #0x10]
008a6ca8	ldp x29,x30,[sp], #0x20
008a6cac	ret
