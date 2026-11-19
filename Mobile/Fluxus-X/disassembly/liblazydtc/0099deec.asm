; macaron::Base64::Encode @ 0099deec
0099deec	stp x24,x23,[sp, #-0x40]!
0099def0	stp x22,x21,[sp, #0x10]
0099def4	stp x20,x19,[sp, #0x20]
0099def8	stp x29,x30,[sp, #0x30]
0099defc	add x29,sp,#0x30
0099df00	ldrb w9,[x0]
0099df04	mov x19,x0
0099df08	mov x20,x8
0099df0c	tbnz w9,#0x0,0x0099df18
0099df10	lsr w24,w9,#0x1
0099df14	b 0x0099df1c
0099df18	ldr x24,[x19, #0x8]
0099df1c	orr x9,xzr,#-0x5555555555555556
0099df20	add x8,x24,#0x2
0099df24	movk x9,#0xaaab
0099df28	umulh x8,x8,x9
0099df2c	lsr x8,x8,#0x1
0099df30	lsl x21,x8,#0x2
0099df34	cmn x21,#0x10
0099df38	stp xzr,xzr,[x20]
0099df3c	str xzr,[x20, #0x10]
0099df40	b.cs 0x0099e178
0099df44	cmp x21,#0x17
0099df48	b.cs 0x0099df64
0099df4c	lsl w8,w8,#0x3
0099df50	mov x23,x20
0099df54	strb w8,[x23], #0x1
0099df58	mov x22,x23
0099df5c	cbnz x21,0x0099df88
0099df60	b 0x0099df98
0099df64	add x8,x21,#0x10
0099df68	and x23,x8,#-0x10
0099df6c	mov x0,x23
0099df70	bl 0x00c2fed0
0099df74	orr x8,x23,#0x1
0099df78	mov x22,x0
0099df7c	stp x21,x0,[x20, #0x8]
0099df80	str x8,[x20]
0099df84	add x23,x20,#0x1
0099df88	mov x0,x22
0099df8c	mov w1,wzr
0099df90	mov x2,x21
0099df94	bl 0x00c301c0
0099df98	strb wzr,[x22, x21]
0099df9c	ldrb w8,[x20]
0099dfa0	ldr x9,[x20, #0x10]
0099dfa4	tst w8,#0x1
0099dfa8	csel x8,x23,x9,eq
0099dfac	mov x9,xzr
0099dfb0	subs x10,x24,#0x2
0099dfb4	b.eq 0x0099e09c
0099dfb8	adrp x13,0xcb5000
0099dfbc	ldr x13,[x13, #0xd8]
0099dfc0	add x11,x19,#0x1
0099dfc4	add x12,x19,#0x2
0099dfc8	ldrb w15,[x19]
0099dfcc	mov x14,x11
0099dfd0	tbz w15,#0x0,0x0099dfd8
0099dfd4	ldr x14,[x19, #0x10]
0099dfd8	ldrb w14,[x14, x9]
0099dfdc	lsr w14,w14,#0x2
0099dfe0	ldrb w14,[x13, w14, UXTW ]
0099dfe4	strb w14,[x8]
0099dfe8	ldrb w14,[x19]
0099dfec	tbnz w14,#0x0,0x0099e000
0099dff0	add x14,x19,x9
0099dff4	add x14,x14,#0x1
0099dff8	mov x15,x11
0099dffc	b 0x0099e008
0099e000	ldr x15,[x19, #0x10]
0099e004	add x14,x15,x9
0099e008	add x15,x15,x9
0099e00c	ldrb w15,[x15, #0x1]
0099e010	ldrb w14,[x14]
0099e014	lsr w15,w15,#0x4
0099e018	bfm w15,w14,#0x1c,#0x1
0099e01c	ldrb w14,[x13, w15, UXTW ]
0099e020	strb w14,[x8, #0x1]
0099e024	ldrb w14,[x19]
0099e028	tbnz w14,#0x0,0x0099e038
0099e02c	add x14,x12,x9
0099e030	mov x15,x11
0099e034	b 0x0099e044
0099e038	ldr x15,[x19, #0x10]
0099e03c	add x14,x9,#0x1
0099e040	add x14,x15,x14
0099e044	add x15,x15,x9
0099e048	ldrb w15,[x15, #0x2]
0099e04c	ldrb w14,[x14]
0099e050	lsr w15,w15,#0x6
0099e054	bfm w15,w14,#0x1e,#0x3
0099e058	ldrb w14,[x13, w15, UXTW ]
0099e05c	strb w14,[x8, #0x2]
0099e060	ldrb w15,[x19]
0099e064	mov x14,x11
0099e068	tbz w15,#0x0,0x0099e070
0099e06c	ldr x14,[x19, #0x10]
0099e070	add x14,x14,x9
0099e074	ldrb w14,[x14, #0x2]
0099e078	add x9,x9,#0x3
0099e07c	cmp x9,x10
0099e080	and x14,x14,#0x3f
0099e084	ldrb w15,[x13, x14]
0099e088	add x14,x8,#0x4
0099e08c	strb w15,[x8, #0x3]
0099e090	mov x8,x14
0099e094	b.cc 0x0099dfc8
0099e098	mov x8,x14
0099e09c	cmp x9,x24
0099e0a0	b.cs 0x0099e164
0099e0a4	ldrb w10,[x19]
0099e0a8	tbnz w10,#0x0,0x0099e0b4
0099e0ac	add x10,x19,#0x1
0099e0b0	b 0x0099e0b8
0099e0b4	ldr x10,[x19, #0x10]
0099e0b8	ldrb w10,[x10, x9]
0099e0bc	sub x12,x24,#0x1
0099e0c0	lsr w11,w10,#0x2
0099e0c4	adrp x10,0xcb5000
0099e0c8	ldr x10,[x10, #0xd8]
0099e0cc	ldrb w11,[x10, w11, UXTW ]
0099e0d0	strb w11,[x8]
0099e0d4	ldrb w11,[x19]
0099e0d8	tbnz w11,#0x0,0x0099e0e4
0099e0dc	add x13,x19,#0x1
0099e0e0	b 0x0099e0e8
0099e0e4	ldr x13,[x19, #0x10]
0099e0e8	ldrb w13,[x13, x9]
0099e0ec	cmp x9,x12
0099e0f0	ubfiz w12,w13,#0x4,#0x2
0099e0f4	b.ne 0x0099e110
0099e0f8	and x9,x12,#0xff
0099e0fc	ldrb w9,[x10, x9]
0099e100	mov w10,#0x3d
0099e104	strb w10,[x8, #0x2]
0099e108	strb w9,[x8, #0x1]
0099e10c	b 0x0099e15c
0099e110	add x9,x9,#0x1
0099e114	tbnz w11,#0x0,0x0099e120
0099e118	add x11,x19,#0x1
0099e11c	b 0x0099e124
0099e120	ldr x11,[x19, #0x10]
0099e124	ldrb w11,[x11, x9]
0099e128	orr w11,w12,w11, LSR #0x4
0099e12c	and x11,x11,#0xff
0099e130	ldrb w11,[x10, x11]
0099e134	strb w11,[x8, #0x1]
0099e138	ldrb w11,[x19]
0099e13c	tbnz w11,#0x0,0x0099e148
0099e140	add x11,x19,#0x1
0099e144	b 0x0099e14c
0099e148	ldr x11,[x19, #0x10]
0099e14c	ldrb w9,[x11, x9]
0099e150	ubfiz w9,w9,#0x2,#0x4
0099e154	ldrb w9,[x10, w9, UXTW ]
0099e158	strb w9,[x8, #0x2]
0099e15c	mov w9,#0x3d
0099e160	strb w9,[x8, #0x3]
0099e164	ldp x29,x30,[sp, #0x30]
0099e168	ldp x20,x19,[sp, #0x20]
0099e16c	ldp x22,x21,[sp, #0x10]
0099e170	ldp x24,x23,[sp], #0x40
0099e174	ret
0099e178	mov x0,x20
0099e17c	bl 0x00c30ce0
