; OSSL_PARAM_get_int32 @ 00a9e014
00a9e014	str x21,[sp, #-0x30]!
00a9e018	mov x8,x0
00a9e01c	mov w0,wzr
00a9e020	stp x20,x19,[sp, #0x10]
00a9e024	stp x29,x30,[sp, #0x20]
00a9e028	add x29,sp,#0x20
00a9e02c	cbz x8,0x00a9e200
00a9e030	mov x19,x1
00a9e034	cbz x1,0x00a9e200
00a9e038	ldr w9,[x8, #0x8]
00a9e03c	cmp w9,#0x3
00a9e040	b.eq 0x00a9e078
00a9e044	cmp w9,#0x2
00a9e048	b.eq 0x00a9e0c8
00a9e04c	cmp w9,#0x1
00a9e050	mov w0,wzr
00a9e054	b.ne 0x00a9e200
00a9e058	ldr x21,[x8, #0x18]
00a9e05c	cmp x21,#0x8
00a9e060	b.eq 0x00a9e0ec
00a9e064	cmp x21,#0x4
00a9e068	b.ne 0x00a9e10c
00a9e06c	ldr x8,[x8, #0x10]
00a9e070	ldr w8,[x8]
00a9e074	b 0x00a9e1f0
00a9e078	ldr x9,[x8, #0x18]
00a9e07c	mov w0,wzr
00a9e080	cmp x9,#0x8
00a9e084	b.ne 0x00a9e200
00a9e088	ldr x8,[x8, #0x10]
00a9e08c	adrp x9,0x29b000
00a9e090	ldr d1,[x9, #0xb88]
00a9e094	ldr d0,[x8]
00a9e098	fcmp d0,d1
00a9e09c	b.lt 0x00a9e1fc
00a9e0a0	adrp x8,0x29b000
00a9e0a4	ldr d1,[x8, #0x220]
00a9e0a8	mov w0,wzr
00a9e0ac	fcmp d0,d1
00a9e0b0	b.hi 0x00a9e200
00a9e0b4	fcvtzs w8,d0
00a9e0b8	scvtf d1,w8
00a9e0bc	fcmp d0,d1
00a9e0c0	b.eq 0x00a9e1f0
00a9e0c4	b 0x00a9e1fc
00a9e0c8	ldr x21,[x8, #0x18]
00a9e0cc	cmp x21,#0x8
00a9e0d0	b.eq 0x00a9e134
00a9e0d4	cmp x21,#0x4
00a9e0d8	b.ne 0x00a9e150
00a9e0dc	ldr x8,[x8, #0x10]
00a9e0e0	ldr w8,[x8]
00a9e0e4	tbz w8,#0x1f,0x00a9e1f0
00a9e0e8	b 0x00a9e1fc
00a9e0ec	ldr x8,[x8, #0x10]
00a9e0f0	mov w9,#0x80000000
00a9e0f4	ldr x8,[x8]
00a9e0f8	add x9,x8,x9
00a9e0fc	lsr x9,x9,#0x20
00a9e100	mov w0,wzr
00a9e104	cbz x9,0x00a9e148
00a9e108	b 0x00a9e200
00a9e10c	ldr x20,[x8, #0x10]
00a9e110	cmp x21,#0x3
00a9e114	add x8,x20,x21
00a9e118	ldursb w8,[x8, #-0x1]
00a9e11c	asr w1,w8,#0x7
00a9e120	b.hi 0x00a9e184
00a9e124	mov w8,#0x4
00a9e128	sub x2,x8,x21
00a9e12c	add x0,x19,x21
00a9e130	b 0x00a9e16c
00a9e134	ldr x8,[x8, #0x10]
00a9e138	ldr x8,[x8]
00a9e13c	lsr x9,x8,#0x1f
00a9e140	mov w0,wzr
00a9e144	cbnz x9,0x00a9e200
00a9e148	str w8,[x19]
00a9e14c	b 0x00a9e1f4
00a9e150	ldr x20,[x8, #0x10]
00a9e154	cmp x21,#0x3
00a9e158	b.hi 0x00a9e1c0
00a9e15c	mov w8,#0x4
00a9e160	sub x2,x8,x21
00a9e164	add x0,x19,x21
00a9e168	mov w1,wzr
00a9e16c	bl 0x00c301c0
00a9e170	mov x0,x19
00a9e174	mov x1,x20
00a9e178	mov x2,x21
00a9e17c	bl 0x00c2ffd0
00a9e180	b 0x00a9e1f4
00a9e184	subs x8,x21,#0x4
00a9e188	b.eq 0x00a9e1ac
00a9e18c	mov x9,xzr
00a9e190	add x10,x20,#0x4
00a9e194	ldrb w11,[x10, x9]
00a9e198	cmp w11,w1, UXTB 
00a9e19c	b.ne 0x00a9e1fc
00a9e1a0	add x9,x9,#0x1
00a9e1a4	cmp x9,x8
00a9e1a8	b.cc 0x00a9e194
00a9e1ac	ldrb w8,[x20, #0x3]
00a9e1b0	eor w8,w8,w1
00a9e1b4	sxtb w8,w8
00a9e1b8	tbz w8,#0x1f,0x00a9e1ec
00a9e1bc	b 0x00a9e1fc
00a9e1c0	subs x8,x21,#0x4
00a9e1c4	b.eq 0x00a9e1e4
00a9e1c8	mov x9,xzr
00a9e1cc	add x10,x20,#0x4
00a9e1d0	ldrb w11,[x10, x9]
00a9e1d4	cbnz w11,0x00a9e1fc
00a9e1d8	add x9,x9,#0x1
00a9e1dc	cmp x9,x8
00a9e1e0	b.cc 0x00a9e1d0
00a9e1e4	ldrsb w8,[x20, #0x3]
00a9e1e8	tbnz w8,#0x1f,0x00a9e1fc
00a9e1ec	ldr w8,[x20]
00a9e1f0	str w8,[x19]
00a9e1f4	mov w0,#0x1
00a9e1f8	b 0x00a9e200
00a9e1fc	mov w0,wzr
00a9e200	ldp x29,x30,[sp, #0x20]
00a9e204	ldp x20,x19,[sp, #0x10]
00a9e208	ldr x21,[sp], #0x30
00a9e20c	ret
