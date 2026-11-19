; FUN_008a8b48 @ 008a8b48
008a8b48	stp x29,x30,[sp, #-0x30]!
008a8b4c	str x21,[sp, #0x10]
008a8b50	stp x20,x19,[sp, #0x20]
008a8b54	mov x29,sp
008a8b58	ldp x8,x9,[x0, #0x20]
008a8b5c	mov x21,#0x7c15
008a8b60	movk x21,#0x7f4a, LSL #16
008a8b64	mov x20,x1
008a8b68	mov x19,x0
008a8b6c	movk x21,#0x79b9, LSL #32
008a8b70	add x10,x8,x8, LSL #0x1
008a8b74	movk x21,#0x9e37, LSL #48
008a8b78	cmp x9,x10, LSR #0x2
008a8b7c	b.cc 0x008a8bec
008a8b80	cbz x9,0x008a8be0
008a8b84	ldr x9,[x20]
008a8b88	ldrb w11,[x19, #0x30]
008a8b8c	lsr x10,x9,#0x4
008a8b90	eor x10,x10,x9, LSR #0x9
008a8b94	mul x10,x10,x21
008a8b98	lsr x11,x10,x11
008a8b9c	ldr x10,[x19, #0x18]
008a8ba0	lsr x12,x11,#0x6
008a8ba4	ldr x12,[x10, x12, LSL #0x3]
008a8ba8	lsr x12,x12,x11
008a8bac	tbz w12,#0x0,0x008a8be0
008a8bb0	ldr x12,[x19]
008a8bb4	sub x13,x8,#0x1
008a8bb8	lsl x14,x11,#0x4
008a8bbc	ldr x14,[x12, x14#0x0]
008a8bc0	cmp x14,x9
008a8bc4	b.eq 0x008a8bec
008a8bc8	add x11,x11,#0x1
008a8bcc	and x11,x11,x13
008a8bd0	lsr x14,x11,#0x6
008a8bd4	ldr x14,[x10, x14, LSL #0x3]
008a8bd8	lsr x14,x14,x11
008a8bdc	tbnz w14,#0x0,0x008a8bb8
008a8be0	mov x0,x19
008a8be4	bl 0x008a9ccc
008a8be8	ldr x8,[x19, #0x20]
008a8bec	ldr x10,[x20]
008a8bf0	ldrb w11,[x19, #0x30]
008a8bf4	ldr x12,[x19, #0x18]
008a8bf8	lsr x9,x10,#0x4
008a8bfc	eor x9,x9,x10, LSR #0x9
008a8c00	mul x9,x9,x21
008a8c04	lsr x9,x9,x11
008a8c08	mov w11,#0x1
008a8c0c	lsr x13,x9,#0x6
008a8c10	lsl x15,x11,x9
008a8c14	ldr x11,[x19]
008a8c18	ldr x14,[x12, x13, LSL #0x3]
008a8c1c	tst x15,x14
008a8c20	b.eq 0x008a8c58
008a8c24	sub x8,x8,#0x1
008a8c28	mov w16,#0x1
008a8c2c	lsl x13,x9,#0x4
008a8c30	ldr x13,[x11, x13#0x0]
008a8c34	cmp x13,x10
008a8c38	b.eq 0x008a8c78
008a8c3c	add x9,x9,#0x1
008a8c40	and x9,x9,x8
008a8c44	lsr x13,x9,#0x6
008a8c48	lsl x15,x16,x9
008a8c4c	ldr x14,[x12, x13, LSL #0x3]
008a8c50	tst x14,x15
008a8c54	b.ne 0x008a8c2c
008a8c58	orr x8,x14,x15
008a8c5c	str x8,[x12, x13, LSL #0x3]
008a8c60	add x8,x11,x9, LSL #0x4
008a8c64	ldr x12,[x19, #0x28]
008a8c68	str x10,[x8]
008a8c6c	str wzr,[x8, #0x8]
008a8c70	add x8,x12,#0x1
008a8c74	str x8,[x19, #0x28]
008a8c78	add x8,x11,x9, LSL #0x4
008a8c7c	add x0,x8,#0x8
008a8c80	ldp x20,x19,[sp, #0x20]
008a8c84	ldr x21,[sp, #0x10]
008a8c88	ldp x29,x30,[sp], #0x30
008a8c8c	ret
