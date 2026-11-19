; FUN_0088df20 @ 0088df20
0088df20	adrp x8,0xd1b000
0088df24	ldr w9,[x1, #0x8]
0088df28	ldr w8,[x8, #0x10]
0088df2c	cbz x1,0x0088df38
0088df30	cmp w9,w8
0088df34	b.eq 0x0088df6c
0088df38	adrp x10,0xd1a000
0088df3c	adrp x11,0xd1b000
0088df40	ldr w10,[x10, #0xfc0]
0088df44	ldr w11,[x11, #0xb0]
0088df48	cmp w9,w10
0088df4c	b.eq 0x0088df58
0088df50	cmp w9,w11
0088df54	b.ne 0x0088e02c
0088df58	ldr x1,[x1, #0x20]
0088df5c	ldr w9,[x1, #0x8]
0088df60	cbz x1,0x0088df48
0088df64	cmp w9,w8
0088df68	b.ne 0x0088df48
0088df6c	ldr x8,[x0, #0xc8]
0088df70	cbz x8,0x0088e02c
0088df74	ldr x8,[x1, #0x20]
0088df78	mov x11,#0x2d69
0088df7c	movk x11,#0xeb38, LSL #16
0088df80	lsl w9,w8,#0x3
0088df84	lsr x10,x8,#0x20
0088df88	movk x11,#0xea08, LSL #32
0088df8c	movk x11,#0x9ddf, LSL #48
0088df90	add x9,x9,#0x8
0088df94	eor x9,x9,x10
0088df98	mul x9,x9,x11
0088df9c	eor x10,x10,x9, LSR #0x2f
0088dfa0	eor x9,x10,x9
0088dfa4	mov x10,#0x959d
0088dfa8	mul x9,x9,x11
0088dfac	movk x10,#0xb8f4, LSL #16
0088dfb0	movk x10,#0xd34f, LSL #32
0088dfb4	movk x10,#0x949d, LSL #48
0088dfb8	eor x9,x9,x9, LSR #0x2f
0088dfbc	mul x9,x9,x10
0088dfc0	ldrb w10,[x0, #0xd0]
0088dfc4	lsr x10,x9,x10
0088dfc8	ldr x9,[x0, #0xb8]
0088dfcc	lsr x11,x10,#0x6
0088dfd0	ldr x11,[x9, x11, LSL #0x3]
0088dfd4	lsr x11,x11,x10
0088dfd8	tbz w11,#0x0,0x0088e02c
0088dfdc	ldr x12,[x0, #0xc0]
0088dfe0	ldr x11,[x0, #0xa0]
0088dfe4	mov w13,#0x18
0088dfe8	sub x12,x12,#0x1
0088dfec	madd x14,x10,x13,x11
0088dff0	ldr x15,[x14]
0088dff4	cmp x15,x8
0088dff8	b.eq 0x0088e018
0088dffc	add x10,x10,#0x1
0088e000	and x10,x10,x12
0088e004	lsr x14,x10,#0x6
0088e008	ldr x14,[x9, x14, LSL #0x3]
0088e00c	lsr x14,x14,x10
0088e010	tbnz w14,#0x0,0x0088dfec
0088e014	b 0x0088e02c
0088e018	ldrb w8,[x14, #0x9]
0088e01c	cmp w8,#0x1
0088e020	b.ne 0x0088e02c
0088e024	ldrb w0,[x14, #0x8]
0088e028	ret
0088e02c	mov w0,#0xffffffff
0088e030	ret
