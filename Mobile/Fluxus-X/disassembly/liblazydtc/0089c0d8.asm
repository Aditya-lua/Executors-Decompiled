; FUN_0089c0d8 @ 0089c0d8
0089c0d8	stp x29,x30,[sp, #-0x50]!
0089c0dc	str x25,[sp, #0x10]
0089c0e0	stp x24,x23,[sp, #0x20]
0089c0e4	stp x22,x21,[sp, #0x30]
0089c0e8	stp x20,x19,[sp, #0x40]
0089c0ec	mov x29,sp
0089c0f0	ldp x8,x21,[x1]
0089c0f4	cmp x21,x8
0089c0f8	b.eq 0x0089c1f8
0089c0fc	mov x22,#0x2d69
0089c100	mov x23,#0x959d
0089c104	mov x19,x1
0089c108	movk x22,#0xeb38, LSL #16
0089c10c	movk x23,#0xb8f4, LSL #16
0089c110	mov x20,x0
0089c114	movk x22,#0xea08, LSL #32
0089c118	movk x23,#0xd34f, LSL #32
0089c11c	mov w24,#0x30
0089c120	movk x22,#0x9ddf, LSL #48
0089c124	movk x23,#0x949d, LSL #48
0089c128	b 0x0089c154
0089c12c	mov x0,x20
0089c130	mov x1,x21
0089c134	bl 0x008984e0
0089c138	ldp q1,q0,[x25, #-0x30]
0089c13c	ldur x8,[x25, #-0x10]
0089c140	str x8,[x0, #0x20]
0089c144	stp q1,q0,[x0]
0089c148	ldr x8,[x19]
0089c14c	cmp x21,x8
0089c150	b.eq 0x0089c1f8
0089c154	ldurb w9,[x21, #-0x8]
0089c158	mov x25,x21
0089c15c	sub x21,x21,#0x38
0089c160	cmp w9,#0x1
0089c164	b.ne 0x0089c12c
0089c168	ldr x9,[x20, #0x28]
0089c16c	cbz x9,0x0089c14c
0089c170	ldr x9,[x21]
0089c174	lsl w10,w9,#0x3
0089c178	lsr x11,x9,#0x20
0089c17c	add x10,x10,#0x8
0089c180	eor x10,x10,x11
0089c184	mul x10,x10,x22
0089c188	eor x11,x11,x10, LSR #0x2f
0089c18c	eor x10,x11,x10
0089c190	ldrb w11,[x20, #0x30]
0089c194	mul x10,x10,x22
0089c198	eor x10,x10,x10, LSR #0x2f
0089c19c	mul x10,x10,x23
0089c1a0	lsr x11,x10,x11
0089c1a4	ldr x10,[x20, #0x18]
0089c1a8	lsr x12,x11,#0x6
0089c1ac	ldr x12,[x10, x12, LSL #0x3]
0089c1b0	lsr x12,x12,x11
0089c1b4	tbz w12,#0x0,0x0089c14c
0089c1b8	ldr x13,[x20, #0x20]
0089c1bc	ldr x12,[x20]
0089c1c0	sub x13,x13,#0x1
0089c1c4	madd x14,x11,x24,x12
0089c1c8	ldr x15,[x14]
0089c1cc	cmp x15,x9
0089c1d0	b.eq 0x0089c1f0
0089c1d4	add x11,x11,#0x1
0089c1d8	and x11,x11,x13
0089c1dc	lsr x14,x11,#0x6
0089c1e0	ldr x14,[x10, x14, LSL #0x3]
0089c1e4	lsr x14,x14,x11
0089c1e8	tbnz w14,#0x0,0x0089c1c4
0089c1ec	b 0x0089c14c
0089c1f0	str wzr,[x14, #0x8]
0089c1f4	b 0x0089c14c
0089c1f8	ldp x20,x19,[sp, #0x40]
0089c1fc	ldr x25,[sp, #0x10]
0089c200	ldp x22,x21,[sp, #0x30]
0089c204	ldp x24,x23,[sp, #0x20]
0089c208	ldp x29,x30,[sp], #0x50
0089c20c	ret
