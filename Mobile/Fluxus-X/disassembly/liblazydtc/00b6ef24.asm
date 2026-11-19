; mbedtls_aes_crypt_xts @ 00b6ef24
00b6ef24	sub sp,sp,#0xd0
00b6ef28	stp x28,x27,[sp, #0x70]
00b6ef2c	stp x26,x25,[sp, #0x80]
00b6ef30	stp x24,x23,[sp, #0x90]
00b6ef34	stp x22,x21,[sp, #0xa0]
00b6ef38	stp x20,x19,[sp, #0xb0]
00b6ef3c	stp x29,x30,[sp, #0xc0]
00b6ef40	add x29,sp,#0xc0
00b6ef44	str x0,[sp, #0x18]
00b6ef48	mrs x24,tpidr_el0
00b6ef4c	ldr x8,[x24, #0x28]
00b6ef50	mov x22,x5
00b6ef54	mov x19,x4
00b6ef58	mov x23,x2
00b6ef5c	mov w20,w1
00b6ef60	cmp w1,#0x1
00b6ef64	stur x8,[x29, #-0x58]
00b6ef68	b.ls 0x00b6ef74
00b6ef6c	orr w0,wzr,#0xffffffdf
00b6ef70	b 0x00b6f200
00b6ef74	sub x8,x23,#0x10
00b6ef78	orr w9,wzr,#0xfffff0
00b6ef7c	cmp x8,x9
00b6ef80	b.ls 0x00b6ef8c
00b6ef84	mov w0,#0xffffffde
00b6ef88	b 0x00b6f200
00b6ef8c	ldr x8,[sp, #0x18]
00b6ef90	add x2,sp,#0x40
00b6ef94	mov x1,x3
00b6ef98	lsr x21,x23,#0x4
00b6ef9c	add x0,x8,#0x120
00b6efa0	and x25,x23,#0xf
00b6efa4	bl 0x00c419a0
00b6efa8	cbz x21,0x00b6efec
00b6efac	cmp x25,#0x0
00b6efb0	mov w8,#0x1
00b6efb4	cset w9,ne
00b6efb8	cmp w20,#0x0
00b6efbc	and x10,x23,#-0x10
00b6efc0	sub x28,x8,x21
00b6efc4	cset w8,eq
00b6efc8	str x10,[sp]
00b6efcc	add x10,x22,x10
00b6efd0	and w8,w8,w9
00b6efd4	mov w27,#0x8
00b6efd8	stp x10,x24,[sp, #0x8]
00b6efdc	eor w26,w8,#0x1
00b6efe0	mov w24,#0x87
00b6efe4	mov x21,x19
00b6efe8	b 0x00b6f024
00b6efec	mov x0,x22
00b6eff0	cbnz x25,0x00b6f0b0
00b6eff4	mov w0,wzr
00b6eff8	b 0x00b6f200
00b6effc	ldp x9,x8,[sp, #0x40]
00b6f000	ldr q0,[sp, #0x40]
00b6f004	lsr x10,x8,#0x3f
00b6f008	sub w10,w27,w10, LSL #0x3
00b6f00c	lsr w10,w24,w10
00b6f010	extr x8,x8,x9,#0x3f
00b6f014	eor x9,x10,x9, LSL #0x1
00b6f018	str q0,[sp, #0x50]
00b6f01c	stp x9,x8,[sp, #0x40]
00b6f020	b 0x00b6f034
00b6f024	cmp x28,#0x0
00b6f028	cset w8,ne
00b6f02c	orr w8,w26,w8
00b6f030	tbz w8,#0x0,0x00b6effc
00b6f034	ldr q0,[x21]
00b6f038	ldr q1,[sp, #0x40]
00b6f03c	add x1,sp,#0x30
00b6f040	add x2,sp,#0x30
00b6f044	eor v0.16B,v1.16B,v0.16B
00b6f048	fmov x23,d1
00b6f04c	stp q1,q0,[sp, #0x20]
00b6f050	cbz w20,0x00b6f060
00b6f054	ldr x0,[sp, #0x18]
00b6f058	bl 0x00c419a0
00b6f05c	b 0x00b6f068
00b6f060	ldr x0,[sp, #0x18]
00b6f064	bl 0x00c41990
00b6f068	ldp q1,q0,[sp, #0x20]
00b6f06c	add x28,x28,#0x1
00b6f070	cmp x28,#0x1
00b6f074	add x21,x21,#0x10
00b6f078	eor v0.16B,v1.16B,v0.16B
00b6f07c	str q0,[x22], #0x10
00b6f080	ldr x8,[sp, #0x48]
00b6f084	lsr x9,x8,#0x3f
00b6f088	sub w9,w27,w9, LSL #0x3
00b6f08c	lsr w9,w24,w9
00b6f090	extr x8,x8,x23,#0x3f
00b6f094	eor x9,x9,x23, LSL #0x1
00b6f098	stp x9,x8,[sp, #0x40]
00b6f09c	b.ne 0x00b6f024
00b6f0a0	ldp x8,x0,[sp]
00b6f0a4	ldr x24,[sp, #0x10]
00b6f0a8	add x19,x19,x8
00b6f0ac	cbz x25,0x00b6eff4
00b6f0b0	cmp w20,#0x0
00b6f0b4	add x8,sp,#0x40
00b6f0b8	add x9,sp,#0x50
00b6f0bc	csel x22,x9,x8,eq
00b6f0c0	sub x26,x0,#0x10
00b6f0c4	mov x8,x25
00b6f0c8	mov x9,x0
00b6f0cc	ldurb w10,[x9, #-0x10]
00b6f0d0	subs x8,x8,#0x1
00b6f0d4	strb w10,[x9], #0x1
00b6f0d8	b.ne 0x00b6f0cc
00b6f0dc	add x9,sp,#0x30
00b6f0e0	ldrb w10,[x19, x8]
00b6f0e4	ldrb w11,[x22, x8]
00b6f0e8	eor w10,w11,w10
00b6f0ec	strb w10,[x9, x8]
00b6f0f0	add x8,x8,#0x1
00b6f0f4	cmp x25,x8
00b6f0f8	b.ne 0x00b6f0e0
00b6f0fc	mov w11,#0x10
00b6f100	add x9,sp,#0x30
00b6f104	sub x12,x11,x25
00b6f108	mov x10,xzr
00b6f10c	add x8,x26,x25
00b6f110	add x9,x9,x25
00b6f114	cmp x12,#0x10
00b6f118	add x11,x22,x25
00b6f11c	b.cc 0x00b6f134
00b6f120	ldr q0,[x8]
00b6f124	ldr q1,[x11]
00b6f128	mov w10,#0x10
00b6f12c	eor v0.16B,v1.16B,v0.16B
00b6f130	str q0,[x9]
00b6f134	cmp x10,x12
00b6f138	b.cs 0x00b6f1c4
00b6f13c	mov w12,#0x10
00b6f140	sub x12,x12,x10
00b6f144	sub x13,x12,x25
00b6f148	cmp x13,#0x20
00b6f14c	b.cs 0x00b6f158
00b6f150	mov x12,x10
00b6f154	b 0x00b6f19c
00b6f158	and x14,x13,#-0x20
00b6f15c	mov x15,xzr
00b6f160	orr x12,x10,x14
00b6f164	orr x16,x10,x15
00b6f168	add x17,x8,x16
00b6f16c	add x18,x11,x16
00b6f170	ldp q0,q1,[x17]
00b6f174	ldp q2,q3,[x18]
00b6f178	add x15,x15,#0x20
00b6f17c	add x16,x9,x16
00b6f180	cmp x14,x15
00b6f184	eor v0.16B,v2.16B,v0.16B
00b6f188	eor v1.16B,v3.16B,v1.16B
00b6f18c	stp q0,q1,[x16]
00b6f190	b.ne 0x00b6f164
00b6f194	cmp x13,x14
00b6f198	b.eq 0x00b6f1c4
00b6f19c	add x8,x12,x25
00b6f1a0	add x9,sp,#0x30
00b6f1a4	add x10,x0,x8
00b6f1a8	ldrb w11,[x22, x8]
00b6f1ac	ldurb w10,[x10, #-0x10]
00b6f1b0	eor w10,w11,w10
00b6f1b4	strb w10,[x9, x8]
00b6f1b8	add x8,x8,#0x1
00b6f1bc	cmp x8,#0x10
00b6f1c0	b.ne 0x00b6f1a4
00b6f1c4	cbz w20,0x00b6f1dc
00b6f1c8	ldr x0,[sp, #0x18]
00b6f1cc	add x1,sp,#0x30
00b6f1d0	add x2,sp,#0x30
00b6f1d4	bl 0x00c419a0
00b6f1d8	b 0x00b6f1ec
00b6f1dc	ldr x0,[sp, #0x18]
00b6f1e0	add x1,sp,#0x30
00b6f1e4	add x2,sp,#0x30
00b6f1e8	bl 0x00c41990
00b6f1ec	ldr q0,[sp, #0x30]
00b6f1f0	ldr q1,[x22]
00b6f1f4	mov w0,wzr
00b6f1f8	eor v0.16B,v1.16B,v0.16B
00b6f1fc	str q0,[x26]
00b6f200	ldr x8,[x24, #0x28]
00b6f204	ldur x9,[x29, #-0x58]
00b6f208	cmp x8,x9
00b6f20c	b.ne 0x00b6f230
00b6f210	ldp x29,x30,[sp, #0xc0]
00b6f214	ldp x20,x19,[sp, #0xb0]
00b6f218	ldp x22,x21,[sp, #0xa0]
00b6f21c	ldp x24,x23,[sp, #0x90]
00b6f220	ldp x26,x25,[sp, #0x80]
00b6f224	ldp x28,x27,[sp, #0x70]
00b6f228	add sp,sp,#0xd0
00b6f22c	ret
00b6f230	bl 0x00c2fec0
