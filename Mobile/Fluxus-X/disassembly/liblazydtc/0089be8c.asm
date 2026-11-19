; FUN_0089be8c @ 0089be8c
0089be8c	stp x29,x30,[sp, #-0x50]!
0089be90	str x25,[sp, #0x10]
0089be94	stp x24,x23,[sp, #0x20]
0089be98	stp x22,x21,[sp, #0x30]
0089be9c	stp x20,x19,[sp, #0x40]
0089bea0	mov x29,sp
0089bea4	ldp x8,x21,[x1]
0089bea8	cmp x21,x8
0089beac	b.eq 0x0089bfac
0089beb0	mov x22,#0x2d69
0089beb4	mov x23,#0x959d
0089beb8	mov x19,x1
0089bebc	movk x22,#0xeb38, LSL #16
0089bec0	movk x23,#0xb8f4, LSL #16
0089bec4	mov x20,x0
0089bec8	movk x22,#0xea08, LSL #32
0089becc	movk x23,#0xd34f, LSL #32
0089bed0	mov w24,#0x30
0089bed4	movk x22,#0x9ddf, LSL #48
0089bed8	movk x23,#0x949d, LSL #48
0089bedc	b 0x0089bf08
0089bee0	mov x0,x20
0089bee4	mov x1,x21
0089bee8	bl 0x0089bfc4
0089beec	ldp q1,q0,[x25, #-0x30]
0089bef0	ldur x8,[x25, #-0x10]
0089bef4	str x8,[x0, #0x20]
0089bef8	stp q1,q0,[x0]
0089befc	ldr x8,[x19]
0089bf00	cmp x21,x8
0089bf04	b.eq 0x0089bfac
0089bf08	ldurb w9,[x21, #-0x8]
0089bf0c	mov x25,x21
0089bf10	sub x21,x21,#0x38
0089bf14	cmp w9,#0x1
0089bf18	b.ne 0x0089bee0
0089bf1c	ldr x9,[x20, #0x28]
0089bf20	cbz x9,0x0089bf00
0089bf24	ldr x9,[x21]
0089bf28	lsl w10,w9,#0x3
0089bf2c	lsr x11,x9,#0x20
0089bf30	add x10,x10,#0x8
0089bf34	eor x10,x10,x11
0089bf38	mul x10,x10,x22
0089bf3c	eor x11,x11,x10, LSR #0x2f
0089bf40	eor x10,x11,x10
0089bf44	ldrb w11,[x20, #0x30]
0089bf48	mul x10,x10,x22
0089bf4c	eor x10,x10,x10, LSR #0x2f
0089bf50	mul x10,x10,x23
0089bf54	lsr x11,x10,x11
0089bf58	ldr x10,[x20, #0x18]
0089bf5c	lsr x12,x11,#0x6
0089bf60	ldr x12,[x10, x12, LSL #0x3]
0089bf64	lsr x12,x12,x11
0089bf68	tbz w12,#0x0,0x0089bf00
0089bf6c	ldr x13,[x20, #0x20]
0089bf70	ldr x12,[x20]
0089bf74	sub x13,x13,#0x1
0089bf78	madd x14,x11,x24,x12
0089bf7c	ldr x15,[x14]
0089bf80	cmp x15,x9
0089bf84	b.eq 0x0089bfa4
0089bf88	add x11,x11,#0x1
0089bf8c	and x11,x11,x13
0089bf90	lsr x14,x11,#0x6
0089bf94	ldr x14,[x10, x14, LSL #0x3]
0089bf98	lsr x14,x14,x11
0089bf9c	tbnz w14,#0x0,0x0089bf78
0089bfa0	b 0x0089bf00
0089bfa4	str wzr,[x14, #0x8]
0089bfa8	b 0x0089bf00
0089bfac	ldp x20,x19,[sp, #0x40]
0089bfb0	ldr x25,[sp, #0x10]
0089bfb4	ldp x22,x21,[sp, #0x30]
0089bfb8	ldp x24,x23,[sp, #0x20]
0089bfbc	ldp x29,x30,[sp], #0x50
0089bfc0	ret
