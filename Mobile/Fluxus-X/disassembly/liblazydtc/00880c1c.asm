; FUN_00880c1c @ 00880c1c
00880c1c	stp x29,x30,[sp, #-0x30]!
00880c20	str x21,[sp, #0x10]
00880c24	stp x20,x19,[sp, #0x20]
00880c28	mov x29,sp
00880c2c	ldp x8,x9,[x0, #0x20]
00880c30	mov x21,#0x7c15
00880c34	movk x21,#0x7f4a, LSL #16
00880c38	mov x20,x1
00880c3c	mov x19,x0
00880c40	movk x21,#0x79b9, LSL #32
00880c44	add x10,x8,x8, LSL #0x1
00880c48	movk x21,#0x9e37, LSL #48
00880c4c	cmp x9,x10, LSR #0x2
00880c50	b.cc 0x00880cc0
00880c54	cbz x9,0x00880cb4
00880c58	ldr x9,[x20]
00880c5c	ldrb w11,[x19, #0x30]
00880c60	lsr x10,x9,#0x4
00880c64	eor x10,x10,x9, LSR #0x9
00880c68	mul x10,x10,x21
00880c6c	lsr x11,x10,x11
00880c70	ldr x10,[x19, #0x18]
00880c74	lsr x12,x11,#0x6
00880c78	ldr x12,[x10, x12, LSL #0x3]
00880c7c	lsr x12,x12,x11
00880c80	tbz w12,#0x0,0x00880cb4
00880c84	ldr x12,[x19]
00880c88	sub x13,x8,#0x1
00880c8c	lsl x14,x11,#0x4
00880c90	ldr x14,[x12, x14#0x0]
00880c94	cmp x14,x9
00880c98	b.eq 0x00880cc0
00880c9c	add x11,x11,#0x1
00880ca0	and x11,x11,x13
00880ca4	lsr x14,x11,#0x6
00880ca8	ldr x14,[x10, x14, LSL #0x3]
00880cac	lsr x14,x14,x11
00880cb0	tbnz w14,#0x0,0x00880c8c
00880cb4	mov x0,x19
00880cb8	bl 0x0089b598
00880cbc	ldr x8,[x19, #0x20]
00880cc0	ldr x10,[x20]
00880cc4	ldrb w11,[x19, #0x30]
00880cc8	ldr x12,[x19, #0x18]
00880ccc	lsr x9,x10,#0x4
00880cd0	eor x9,x9,x10, LSR #0x9
00880cd4	mul x9,x9,x21
00880cd8	lsr x9,x9,x11
00880cdc	mov w11,#0x1
00880ce0	lsr x13,x9,#0x6
00880ce4	lsl x15,x11,x9
00880ce8	ldr x11,[x19]
00880cec	ldr x14,[x12, x13, LSL #0x3]
00880cf0	tst x15,x14
00880cf4	b.eq 0x00880d2c
00880cf8	sub x8,x8,#0x1
00880cfc	mov w16,#0x1
00880d00	lsl x13,x9,#0x4
00880d04	ldr x13,[x11, x13#0x0]
00880d08	cmp x13,x10
00880d0c	b.eq 0x00880d50
00880d10	add x9,x9,#0x1
00880d14	and x9,x9,x8
00880d18	lsr x13,x9,#0x6
00880d1c	lsl x15,x16,x9
00880d20	ldr x14,[x12, x13, LSL #0x3]
00880d24	tst x14,x15
00880d28	b.ne 0x00880d00
00880d2c	add x8,x11,x9, LSL #0x4
00880d30	orr x11,x14,x15
00880d34	str x11,[x12, x13, LSL #0x3]
00880d38	strb wzr,[x8, #0x8]
00880d3c	ldr x11,[x19, #0x28]
00880d40	str x10,[x8]
00880d44	add x8,x11,#0x1
00880d48	ldr x11,[x19]
00880d4c	str x8,[x19, #0x28]
00880d50	add x8,x11,x9, LSL #0x4
00880d54	add x0,x8,#0x8
00880d58	ldp x20,x19,[sp, #0x20]
00880d5c	ldr x21,[sp, #0x10]
00880d60	ldp x29,x30,[sp], #0x30
00880d64	ret
