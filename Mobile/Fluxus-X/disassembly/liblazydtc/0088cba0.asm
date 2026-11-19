; FUN_0088cba0 @ 0088cba0
0088cba0	ldr x9,[x0, #0x688]
0088cba4	ldr x8,[x0, #0x680]
0088cba8	sub x9,x9,x8
0088cbac	asr x9,x9,#0x3
0088cbb0	cmp x1,x9
0088cbb4	b.cs 0x0088cc78
0088cbb8	mov x10,#0x2d69
0088cbbc	ldp x15,x11,[x0, #0xc0]
0088cbc0	mov x16,#0x959d
0088cbc4	movk x10,#0xeb38, LSL #16
0088cbc8	ldrb w12,[x0, #0xd0]
0088cbcc	movk x16,#0xb8f4, LSL #16
0088cbd0	movk x10,#0xea08, LSL #32
0088cbd4	ldr x13,[x0, #0xb8]
0088cbd8	ldr x14,[x0, #0xa0]
0088cbdc	movk x16,#0xd34f, LSL #32
0088cbe0	movk x10,#0x9ddf, LSL #48
0088cbe4	sub x15,x15,#0x1
0088cbe8	movk x16,#0x949d, LSL #48
0088cbec	mov w17,#0x18
0088cbf0	cbz x11,0x0088cc50
0088cbf4	ldr x0,[x8, x1, LSL #0x3]
0088cbf8	lsl w2,w0,#0x3
0088cbfc	lsr x3,x0,#0x20
0088cc00	add x2,x2,#0x8
0088cc04	eor x2,x2,x3
0088cc08	mul x2,x2,x10
0088cc0c	eor x3,x3,x2, LSR #0x2f
0088cc10	eor x2,x3,x2
0088cc14	mul x2,x2,x10
0088cc18	eor x2,x2,x2, LSR #0x2f
0088cc1c	mul x2,x2,x16
0088cc20	lsr x2,x2,x12
0088cc24	lsr x3,x2,#0x6
0088cc28	ldr x3,[x13, x3, LSL #0x3]
0088cc2c	lsr x3,x3,x2
0088cc30	tbz w3,#0x0,0x0088cc50
0088cc34	madd x3,x2,x17,x14
0088cc38	ldr x4,[x3]
0088cc3c	cmp x4,x0
0088cc40	b.eq 0x0088cc54
0088cc44	add x2,x2,#0x1
0088cc48	and x2,x2,x15
0088cc4c	b 0x0088cc24
0088cc50	mov x3,xzr
0088cc54	add x0,x3,#0x8
0088cc58	cmp x3,#0x0
0088cc5c	csel x0,xzr,x0,eq
0088cc60	ldrb w0,[x0, #0x2]
0088cc64	tbnz w0,#0x0,0x0088cc74
0088cc68	add x1,x1,#0x1
0088cc6c	cmp x1,x9
0088cc70	b.ne 0x0088cbf0
0088cc74	ret
0088cc78	mov w0,wzr
0088cc7c	ret
