; FUN_008bbddc @ 008bbddc
008bbddc	stp x29,x30,[sp, #-0x10]!
008bbde0	mov x29,sp
008bbde4	ldr w8,[x2, #0xc]
008bbde8	cmp w8,#0x2
008bbdec	b.le 0x008bbe14
008bbdf0	cmp w8,#0x3
008bbdf4	b.eq 0x008bbe30
008bbdf8	cmp w8,#0x4
008bbdfc	b.eq 0x008bbe60
008bbe00	cmp w8,#0x5
008bbe04	b.ne 0x008bbe94
008bbe08	ldr x3,[x2]
008bbe0c	ldp x29,x30,[sp], #0x10
008bbe10	b 0x008bc8d0
008bbe14	cmp w8,#0x1
008bbe18	b.eq 0x008bbe54
008bbe1c	cmp w8,#0x2
008bbe20	b.ne 0x008bbe90
008bbe24	ldr x3,[x2]
008bbe28	ldp x29,x30,[sp], #0x10
008bbe2c	b 0x008bc0b4
008bbe30	ldr d0,[x2]
008bbe34	fcmp d0,d0
008bbe38	b.vs 0x008bbeb4
008bbe3c	fcvtzs w3,d0
008bbe40	scvtf d1,w3
008bbe44	fcmp d0,d1
008bbe48	b.ne 0x008bbea0
008bbe4c	ldp x29,x30,[sp], #0x10
008bbe50	b 0x008bc2bc
008bbe54	ldr w3,[x2]
008bbe58	ldp x29,x30,[sp], #0x10
008bbe5c	b 0x008bbecc
008bbe60	ldr s0,[x2]
008bbe64	fcmp s0,s0
008bbe68	b.vs 0x008bbea8
008bbe6c	ldr s0,[x2, #0x4]
008bbe70	fcmp s0,s0
008bbe74	b.vs 0x008bbea8
008bbe78	ldr s0,[x2, #0x8]
008bbe7c	fcmp s0,s0
008bbe80	b.vs 0x008bbea8
008bbe84	mov x3,x2
008bbe88	ldp x29,x30,[sp], #0x10
008bbe8c	b 0x008bc688
008bbe90	cbz w8,0x008bbec0
008bbe94	ldr x3,[x2]
008bbe98	ldp x29,x30,[sp], #0x10
008bbe9c	b 0x008bcadc
008bbea0	ldp x29,x30,[sp], #0x10
008bbea4	b 0x008bc474
008bbea8	adrp x1,0x2ca000
008bbeac	add x1,x1,#0xc41
008bbeb0	bl 0x008b39cc
008bbeb4	adrp x1,0x2c8000
008bbeb8	add x1,x1,#0xc93
008bbebc	bl 0x008b39cc
008bbec0	adrp x1,0x2b5000
008bbec4	add x1,x1,#0x268
008bbec8	bl 0x008b39cc
008bbecc	sub sp,sp,#0x70
008bbed0	stp x29,x30,[sp, #0x10]
008bbed4	stp x28,x27,[sp, #0x20]
008bbed8	stp x26,x25,[sp, #0x30]
008bbedc	stp x24,x23,[sp, #0x40]
008bbee0	stp x22,x21,[sp, #0x50]
008bbee4	stp x20,x19,[sp, #0x60]
008bbee8	add x29,sp,#0x10
008bbeec	mov w27,#0x3700
008bbef0	mov w21,w3
008bbef4	mov x19,x2
008bbef8	mov x20,x1
008bbefc	mov x22,x0
008bbf00	mov w24,#0xffffffff
008bbf04	adrp x23,0xd1f000
008bbf08	add x23,x23,#0xc90
008bbf0c	adrp x25,0xcca000
008bbf10	adrp x26,0xd1f000
008bbf14	movk w27,#0x7f, LSL #16
008bbf18	mov w28,#0x1
008bbf1c	ldrb w8,[x20, #0x5]
008bbf20	ldr x9,[x20, #0x28]
008bbf24	lsl w8,w24,w8
008bbf28	bic w8,w21,w8
008bbf2c	add x1,x9,x8, LSL #0x5
008bbf30	ldr w8,[x1, #0xc]
008bbf34	cbnz w8,0x008bbf50
008bbf38	ldarb w8,[x23]
008bbf3c	tbz w8,#0x0,0x008bc01c
008bbf40	ldr x8,[x26, #0xc88]
008bbf44	add x8,x8,x27
008bbf48	cmp x1,x8
008bbf4c	b.ne 0x008bc058
008bbf50	ldr w8,[x20, #0xc]
008bbf54	cmp w8,#0x1
008bbf58	b.lt 0x008bbf80
008bbf5c	sub x8,x8,#0x1
008bbf60	ldr x9,[x20, #0x28]
008bbf64	mov w10,w8
008bbf68	str w8,[x20, #0xc]
008bbf6c	add x2,x9,x10, LSL #0x5
008bbf70	ldrb w9,[x2, #0x1c]
008bbf74	tst w9,#0xf
008bbf78	b.ne 0x008bbf54
008bbf7c	b 0x008bc04c
008bbf80	ldrb w8,[x20, #0x5]
008bbf84	ldr x9,[x20, #0x28]
008bbf88	mov w11,wzr
008bbf8c	lsl w10,w28,w8
008bbf90	sxtw x10,w10
008bbf94	cbz x8,0x008bbfe4
008bbf98	add x14,x9,x10, LSL #0x5
008bbf9c	and x13,x10,#-0x2
008bbfa0	mov w12,wzr
008bbfa4	and x8,x10,#0x1
008bbfa8	mov x15,x13
008bbfac	sub x14,x14,#0x14
008bbfb0	ldr w16,[x14]
008bbfb4	ldur w17,[x14, #-0x20]
008bbfb8	sub x15,x15,#0x2
008bbfbc	sub x14,x14,#0x40
008bbfc0	cmp w16,#0x0
008bbfc4	cinc w11,w11,ne
008bbfc8	cmp w17,#0x0
008bbfcc	cinc w12,w12,ne
008bbfd0	cbnz x15,0x008bbfb0
008bbfd4	cmp x13,x10
008bbfd8	add w11,w12,w11
008bbfdc	b.ne 0x008bbfe8
008bbfe0	b 0x008bc004
008bbfe4	mov x8,x10
008bbfe8	add x9,x9,x8, LSL #0x5
008bbfec	sub x9,x9,#0x14
008bbff0	ldr w10,[x9], #-0x20
008bbff4	sub x8,x8,#0x1
008bbff8	cmp w10,#0x0
008bbffc	cinc w11,w11,ne
008bc000	cbnz x8,0x008bbff0
008bc004	ldr w2,[x20, #0x8]
008bc008	add w3,w11,#0x1
008bc00c	mov x0,x22
008bc010	mov x1,x20
008bc014	bl 0x008ba968
008bc018	b 0x008bbf1c
008bc01c	mov x0,x23
008bc020	str x1,[sp, #0x8]
008bc024	bl 0x00c2fe90
008bc028	ldr x1,[sp, #0x8]
008bc02c	cbz w0,0x008bbf40
008bc030	ldr x0,[x25, #0x8c8]
008bc034	bl 0x007fe1ec
008bc038	str x0,[x26, #0xc88]
008bc03c	mov x0,x23
008bc040	bl 0x00c2fea0
008bc044	ldr x1,[sp, #0x8]
008bc048	b 0x008bbf40
008bc04c	mov x0,x20
008bc050	bl 0x008bda50
008bc054	mov x1,x0
008bc058	ldr x8,[x19]
008bc05c	ldr w9,[x1, #0x1c]
008bc060	mov x0,x1
008bc064	str x8,[x1, #0x10]
008bc068	ldr w8,[x19, #0x8]
008bc06c	str w8,[x1, #0x18]
008bc070	ldr w8,[x19, #0xc]
008bc074	bfxil w9,w8,#0x0,#0x4
008bc078	str w9,[x1, #0x1c]
008bc07c	ldp x20,x19,[sp, #0x60]
008bc080	ldp x22,x21,[sp, #0x50]
008bc084	ldp x24,x23,[sp, #0x40]
008bc088	ldp x26,x25,[sp, #0x30]
008bc08c	ldp x28,x27,[sp, #0x20]
008bc090	ldp x29,x30,[sp, #0x10]
008bc094	add sp,sp,#0x70
008bc098	ret
008bc0b4	sub sp,sp,#0x70
008bc0b8	stp x29,x30,[sp, #0x10]
008bc0bc	stp x28,x27,[sp, #0x20]
008bc0c0	stp x26,x25,[sp, #0x30]
008bc0c4	stp x24,x23,[sp, #0x40]
008bc0c8	stp x22,x21,[sp, #0x50]
008bc0cc	stp x20,x19,[sp, #0x60]
008bc0d0	add x29,sp,#0x10
008bc0d4	eor w8,w3,w3, LSR #0x10
008bc0d8	mov w9,#0xca6b
008bc0dc	mov w27,#0x3700
008bc0e0	movk w9,#0x85eb, LSL #16
008bc0e4	mov x19,x2
008bc0e8	mov x20,x1
008bc0ec	mul w8,w8,w9
008bc0f0	mov w9,#0xae35
008bc0f4	mov x21,x0
008bc0f8	movk w9,#0xc2b2, LSL #16
008bc0fc	mov w23,#0xffffffff
008bc100	adrp x22,0xd1f000
008bc104	add x22,x22,#0xc90
008bc108	adrp x25,0xcca000
008bc10c	adrp x26,0xd1f000
008bc110	eor w8,w8,w8, LSR #0xd
008bc114	movk w27,#0x7f, LSL #16
008bc118	mov w28,#0x1
008bc11c	mul w8,w8,w9
008bc120	eor w24,w8,w8, LSR #0x10
008bc124	ldrb w8,[x20, #0x5]
008bc128	ldr x9,[x20, #0x28]
008bc12c	lsl w8,w23,w8
008bc130	bic w8,w24,w8
008bc134	add x1,x9,x8, LSL #0x5
008bc138	ldr w8,[x1, #0xc]
008bc13c	cbnz w8,0x008bc158
008bc140	ldarb w8,[x22]
008bc144	tbz w8,#0x0,0x008bc224
008bc148	ldr x8,[x26, #0xc88]
008bc14c	add x8,x8,x27
008bc150	cmp x1,x8
008bc154	b.ne 0x008bc260
008bc158	ldr w8,[x20, #0xc]
008bc15c	cmp w8,#0x1
008bc160	b.lt 0x008bc188
008bc164	sub x8,x8,#0x1
008bc168	ldr x9,[x20, #0x28]
008bc16c	mov w10,w8
008bc170	str w8,[x20, #0xc]
008bc174	add x2,x9,x10, LSL #0x5
008bc178	ldrb w9,[x2, #0x1c]
008bc17c	tst w9,#0xf
008bc180	b.ne 0x008bc15c
008bc184	b 0x008bc254
008bc188	ldrb w8,[x20, #0x5]
008bc18c	ldr x9,[x20, #0x28]
008bc190	mov w11,wzr
008bc194	lsl w10,w28,w8
008bc198	sxtw x10,w10
008bc19c	cbz x8,0x008bc1ec
008bc1a0	add x14,x9,x10, LSL #0x5
008bc1a4	and x13,x10,#-0x2
008bc1a8	mov w12,wzr
008bc1ac	and x8,x10,#0x1
008bc1b0	mov x15,x13
008bc1b4	sub x14,x14,#0x14
008bc1b8	ldr w16,[x14]
008bc1bc	ldur w17,[x14, #-0x20]
008bc1c0	sub x15,x15,#0x2
008bc1c4	sub x14,x14,#0x40
008bc1c8	cmp w16,#0x0
008bc1cc	cinc w11,w11,ne
008bc1d0	cmp w17,#0x0
008bc1d4	cinc w12,w12,ne
008bc1d8	cbnz x15,0x008bc1b8
008bc1dc	cmp x13,x10
008bc1e0	add w11,w12,w11
008bc1e4	b.ne 0x008bc1f0
008bc1e8	b 0x008bc20c
008bc1ec	mov x8,x10
008bc1f0	add x9,x9,x8, LSL #0x5
008bc1f4	sub x9,x9,#0x14
008bc1f8	ldr w10,[x9], #-0x20
008bc1fc	sub x8,x8,#0x1
008bc200	cmp w10,#0x0
008bc204	cinc w11,w11,ne
008bc208	cbnz x8,0x008bc1f8
008bc20c	ldr w2,[x20, #0x8]
008bc210	add w3,w11,#0x1
008bc214	mov x0,x21
008bc218	mov x1,x20
008bc21c	bl 0x008ba968
008bc220	b 0x008bc124
008bc224	mov x0,x22
008bc228	str x1,[sp, #0x8]
008bc22c	bl 0x00c2fe90
008bc230	ldr x1,[sp, #0x8]
008bc234	cbz w0,0x008bc148
008bc238	ldr x0,[x25, #0x8c8]
008bc23c	bl 0x007fe1ec
008bc240	str x0,[x26, #0xc88]
008bc244	mov x0,x22
008bc248	bl 0x00c2fea0
008bc24c	ldr x1,[sp, #0x8]
008bc250	b 0x008bc148
008bc254	mov x0,x20
008bc258	bl 0x008bda50
008bc25c	mov x1,x0
008bc260	ldr x8,[x19]
008bc264	ldr w9,[x1, #0x1c]
008bc268	mov x0,x1
008bc26c	str x8,[x1, #0x10]
008bc270	ldr w8,[x19, #0x8]
008bc274	str w8,[x1, #0x18]
008bc278	ldr w8,[x19, #0xc]
008bc27c	bfxil w9,w8,#0x0,#0x4
008bc280	str w9,[x1, #0x1c]
008bc284	ldp x20,x19,[sp, #0x60]
008bc288	ldp x22,x21,[sp, #0x50]
008bc28c	ldp x24,x23,[sp, #0x40]
008bc290	ldp x26,x25,[sp, #0x30]
008bc294	ldp x28,x27,[sp, #0x20]
008bc298	ldp x29,x30,[sp, #0x10]
008bc29c	add sp,sp,#0x70
008bc2a0	ret
