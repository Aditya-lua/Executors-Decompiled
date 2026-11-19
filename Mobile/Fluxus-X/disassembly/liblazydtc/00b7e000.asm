; mbedtls_mpi_mul_int @ 00b7e000
00b7e000	stp x26,x25,[sp, #-0x50]!
00b7e004	stp x24,x23,[sp, #0x10]
00b7e008	stp x22,x21,[sp, #0x20]
00b7e00c	stp x20,x19,[sp, #0x30]
00b7e010	stp x29,x30,[sp, #0x40]
00b7e014	add x29,sp,#0x40
00b7e018	ldrh w8,[x1, #0xa]
00b7e01c	mov x20,x2
00b7e020	mov x21,x1
00b7e024	mov x19,x0
00b7e028	sub x26,x8,#0x1
00b7e02c	cmn x26,#0x1
00b7e030	b.eq 0x00b7e0d8
00b7e034	ldr x8,[x21]
00b7e038	ldr x8,[x8, x26, LSL #0x3]
00b7e03c	sub x26,x26,#0x1
00b7e040	cbz x8,0x00b7e02c
00b7e044	cbz x20,0x00b7e0d8
00b7e048	add x22,x26,#0x3
00b7e04c	mov w8,#0x2710
00b7e050	cmp x22,x8
00b7e054	b.hi 0x00b7e15c
00b7e058	ldrh w25,[x19, #0xa]
00b7e05c	cmp x22,x25
00b7e060	b.ls 0x00b7e0a8
00b7e064	mov w1,#0x8
00b7e068	mov x0,x22
00b7e06c	bl 0x00c30a30
00b7e070	mov x23,x0
00b7e074	cbz x0,0x00b7e15c
00b7e078	ldr x24,[x19]
00b7e07c	cbz x24,0x00b7e0a0
00b7e080	lsl x25,x25,#0x3
00b7e084	mov x0,x23
00b7e088	mov x1,x24
00b7e08c	mov x2,x25
00b7e090	bl 0x00c2ffd0
00b7e094	mov x0,x24
00b7e098	mov x1,x25
00b7e09c	bl 0x00c42230
00b7e0a0	strh w22,[x19, #0xa]
00b7e0a4	str x23,[x19]
00b7e0a8	mov x0,x19
00b7e0ac	mov x1,x21
00b7e0b0	bl 0x00c41b60
00b7e0b4	cbnz w0,0x00b7e160
00b7e0b8	ldr x0,[x19]
00b7e0bc	ldrh w1,[x19, #0xa]
00b7e0c0	ldr x2,[x21]
00b7e0c4	add x3,x26,#0x2
00b7e0c8	sub x4,x20,#0x1
00b7e0cc	bl 0x00c41e70
00b7e0d0	mov w0,wzr
00b7e0d4	b 0x00b7e160
00b7e0d8	ldrh w22,[x19, #0xa]
00b7e0dc	cbz x22,0x00b7e0ec
00b7e0e0	ldr x20,[x19]
00b7e0e4	lsl x2,x22,#0x3
00b7e0e8	b 0x00b7e138
00b7e0ec	mov w0,#0x1
00b7e0f0	mov w1,#0x8
00b7e0f4	bl 0x00c30a30
00b7e0f8	mov x20,x0
00b7e0fc	cbz x0,0x00b7e15c
00b7e100	ldr x21,[x19]
00b7e104	cbz x21,0x00b7e128
00b7e108	lsl x22,x22,#0x3
00b7e10c	mov x0,x20
00b7e110	mov x1,x21
00b7e114	mov x2,x22
00b7e118	bl 0x00c2ffd0
00b7e11c	mov x0,x21
00b7e120	mov x1,x22
00b7e124	bl 0x00c42230
00b7e128	mov w8,#0x1
00b7e12c	mov w2,#0x8
00b7e130	str x20,[x19]
00b7e134	strh w8,[x19, #0xa]
00b7e138	mov x0,x20
00b7e13c	mov w1,wzr
00b7e140	bl 0x00c301c0
00b7e144	ldr x8,[x19]
00b7e148	mov w9,#0x1
00b7e14c	mov w0,wzr
00b7e150	str xzr,[x8]
00b7e154	strh w9,[x19, #0x8]
00b7e158	b 0x00b7e160
00b7e15c	orr w0,wzr,#0xfffffff0
00b7e160	ldp x29,x30,[sp, #0x40]
00b7e164	ldp x20,x19,[sp, #0x30]
00b7e168	ldp x22,x21,[sp, #0x20]
00b7e16c	ldp x24,x23,[sp, #0x10]
00b7e170	ldp x26,x25,[sp], #0x50
00b7e174	ret
