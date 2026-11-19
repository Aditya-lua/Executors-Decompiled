; FUN_00883c54 @ 00883c54
00883c54	stp x29,x30,[sp, #-0x20]!
00883c58	stp x20,x19,[sp, #0x10]
00883c5c	mov x29,sp
00883c60	mov x20,x1
00883c64	mov x19,x0
00883c68	bl 0x008841b4
00883c6c	ldr x8,[x20]
00883c70	mov x11,#0x2d69
00883c74	movk x11,#0xeb38, LSL #16
00883c78	lsl w9,w8,#0x3
00883c7c	lsr x10,x8,#0x20
00883c80	movk x11,#0xea08, LSL #32
00883c84	movk x11,#0x9ddf, LSL #48
00883c88	add x9,x9,#0x8
00883c8c	eor x9,x9,x10
00883c90	mul x9,x9,x11
00883c94	eor x10,x10,x9, LSR #0x2f
00883c98	eor x9,x10,x9
00883c9c	mov x10,#0x959d
00883ca0	mul x9,x9,x11
00883ca4	movk x10,#0xb8f4, LSL #16
00883ca8	ldr x11,[x19, #0x18]
00883cac	movk x10,#0xd34f, LSL #32
00883cb0	movk x10,#0x949d, LSL #48
00883cb4	eor x9,x9,x9, LSR #0x2f
00883cb8	mul x9,x9,x10
00883cbc	ldrb w10,[x19, #0x30]
00883cc0	lsr x9,x9,x10
00883cc4	mov w10,#0x1
00883cc8	lsr x12,x9,#0x6
00883ccc	lsl x14,x10,x9
00883cd0	ldr x10,[x19]
00883cd4	ldr x13,[x11, x12, LSL #0x3]
00883cd8	tst x14,x13
00883cdc	b.eq 0x00883d18
00883ce0	ldr x12,[x19, #0x20]
00883ce4	mov w16,#0x1
00883ce8	sub x15,x12,#0x1
00883cec	lsl x12,x9,#0x6
00883cf0	ldr x12,[x10, x12#0x0]
00883cf4	cmp x12,x8
00883cf8	b.eq 0x00883d50
00883cfc	add x9,x9,#0x1
00883d00	and x9,x9,x15
00883d04	lsr x12,x9,#0x6
00883d08	lsl x14,x16,x9
00883d0c	ldr x13,[x11, x12, LSL #0x3]
00883d10	tst x13,x14
00883d14	b.ne 0x00883cec
00883d18	movi v0.2D,#0x0
00883d1c	add x10,x10,x9, LSL #0x6
00883d20	orr x13,x13,x14
00883d24	str x13,[x11, x12, LSL #0x3]
00883d28	str x8,[x10]
00883d2c	mov w8,#0x40
00883d30	strb w8,[x10, #0x38]
00883d34	stur q0,[x10, #0x8]
00883d38	stur q0,[x10, #0x18]
00883d3c	stur q0,[x10, #0x28]
00883d40	ldr x11,[x19, #0x28]
00883d44	ldr x10,[x19]
00883d48	add x8,x11,#0x1
00883d4c	str x8,[x19, #0x28]
00883d50	add x8,x10,x9, LSL #0x6
00883d54	add x0,x8,#0x8
00883d58	ldp x20,x19,[sp, #0x10]
00883d5c	ldp x29,x30,[sp], #0x20
00883d60	ret
