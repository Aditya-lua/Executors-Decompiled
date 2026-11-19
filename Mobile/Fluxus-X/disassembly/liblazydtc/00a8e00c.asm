; BF_cfb64_encrypt @ 00a8e00c
00a8e00c	str x25,[sp, #-0x50]!
00a8e010	stp x24,x23,[sp, #0x10]
00a8e014	stp x22,x21,[sp, #0x20]
00a8e018	stp x20,x19,[sp, #0x30]
00a8e01c	stp x29,x30,[sp, #0x40]
00a8e020	ldr w25,[x5]
00a8e024	mov x19,x5
00a8e028	mov x20,x4
00a8e02c	mov x21,x3
00a8e030	mov x22,x2
00a8e034	mov x23,x1
00a8e038	mov x24,x0
00a8e03c	add x29,sp,#0x40
00a8e040	cbz w6,0x00a8e0dc
00a8e044	cbz x22,0x00a8e170
00a8e048	cbnz w25,0x00a8e0b0
00a8e04c	ldr w8,[x20]
00a8e050	add x0,sp,#0x8
00a8e054	mov x1,x21
00a8e058	rev w8,w8
00a8e05c	str w8,[sp, #0x8]
00a8e060	ldr w8,[x20, #0x4]
00a8e064	rev w8,w8
00a8e068	str w8,[sp, #0xc]
00a8e06c	bl 0x00c38420
00a8e070	ldr w8,[sp, #0x8]
00a8e074	lsr w9,w8,#0x18
00a8e078	strb w9,[x20]
00a8e07c	lsr w9,w8,#0x10
00a8e080	strb w8,[x20, #0x3]
00a8e084	lsr w8,w8,#0x8
00a8e088	strb w9,[x20, #0x1]
00a8e08c	strb w8,[x20, #0x2]
00a8e090	ldr w8,[sp, #0xc]
00a8e094	lsr w9,w8,#0x18
00a8e098	strb w9,[x20, #0x4]
00a8e09c	lsr w9,w8,#0x10
00a8e0a0	strb w9,[x20, #0x5]
00a8e0a4	lsr w9,w8,#0x8
00a8e0a8	strb w9,[x20, #0x6]
00a8e0ac	strb w8,[x20, #0x7]
00a8e0b0	sxtw x9,w25
00a8e0b4	ldrb w8,[x24], #0x1
00a8e0b8	ldrb w10,[x20, x9]
00a8e0bc	add w11,w25,#0x1
00a8e0c0	subs x22,x22,#0x1
00a8e0c4	and w25,w11,#0x7
00a8e0c8	eor w8,w10,w8
00a8e0cc	strb w8,[x23], #0x1
00a8e0d0	strb w8,[x20, x9]
00a8e0d4	b.ne 0x00a8e048
00a8e0d8	b 0x00a8e170
00a8e0dc	cbz x22,0x00a8e170
00a8e0e0	cbnz w25,0x00a8e148
00a8e0e4	ldr w8,[x20]
00a8e0e8	add x0,sp,#0x8
00a8e0ec	mov x1,x21
00a8e0f0	rev w8,w8
00a8e0f4	str w8,[sp, #0x8]
00a8e0f8	ldr w8,[x20, #0x4]
00a8e0fc	rev w8,w8
00a8e100	str w8,[sp, #0xc]
00a8e104	bl 0x00c38420
00a8e108	ldr w8,[sp, #0x8]
00a8e10c	lsr w9,w8,#0x18
00a8e110	strb w9,[x20]
00a8e114	lsr w9,w8,#0x10
00a8e118	strb w8,[x20, #0x3]
00a8e11c	lsr w8,w8,#0x8
00a8e120	strb w9,[x20, #0x1]
00a8e124	strb w8,[x20, #0x2]
00a8e128	ldr w8,[sp, #0xc]
00a8e12c	lsr w9,w8,#0x18
00a8e130	strb w9,[x20, #0x4]
00a8e134	lsr w9,w8,#0x10
00a8e138	strb w9,[x20, #0x5]
00a8e13c	lsr w9,w8,#0x8
00a8e140	strb w9,[x20, #0x6]
00a8e144	strb w8,[x20, #0x7]
00a8e148	sxtw x9,w25
00a8e14c	ldrb w8,[x24], #0x1
00a8e150	ldrb w10,[x20, x9]
00a8e154	add w11,w25,#0x1
00a8e158	subs x22,x22,#0x1
00a8e15c	strb w8,[x20, x9]
00a8e160	eor w8,w10,w8
00a8e164	strb w8,[x23], #0x1
00a8e168	and w25,w11,#0x7
00a8e16c	b.ne 0x00a8e0e0
00a8e170	str w25,[x19]
00a8e174	ldp x29,x30,[sp, #0x40]
00a8e178	ldp x20,x19,[sp, #0x30]
00a8e17c	ldp x22,x21,[sp, #0x20]
00a8e180	ldp x24,x23,[sp, #0x10]
00a8e184	ldr x25,[sp], #0x50
00a8e188	ret
