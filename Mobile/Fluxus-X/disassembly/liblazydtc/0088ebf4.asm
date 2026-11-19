; FUN_0088ebf4 @ 0088ebf4
0088ebf4	stp x29,x30,[sp, #-0x60]!
0088ebf8	stp x28,x27,[sp, #0x10]
0088ebfc	stp x26,x25,[sp, #0x20]
0088ec00	stp x24,x23,[sp, #0x30]
0088ec04	stp x22,x21,[sp, #0x40]
0088ec08	stp x20,x19,[sp, #0x50]
0088ec0c	mov x29,sp
0088ec10	sub sp,sp,#0x1a0
0088ec14	mrs x20,tpidr_el0
0088ec18	mov w28,w2
0088ec1c	mov x19,x0
0088ec20	ldr x8,[x20, #0x28]
0088ec24	stur x8,[x29, #-0x10]
0088ec28	ldr x8,[x1, #0x28]
0088ec2c	str x1,[sp, #0x28]
0088ec30	cbz x8,0x0088ec5c
0088ec34	ldr x9,[x1, #0x20]
0088ec38	mov x21,x1
0088ec3c	cmp x8,#0x9
0088ec40	str x20,[sp, #0x18]
0088ec44	b.cs 0x0088ecc8
0088ec48	mov w2,wzr
0088ec4c	mov w24,wzr
0088ec50	mov x10,xzr
0088ec54	mov w27,wzr
0088ec58	b 0x0088ed94
0088ec5c	add x0,x19,#0x1f0
0088ec60	add x1,sp,#0x28
0088ec64	bl 0x00891928
0088ec68	ldp w21,w22,[x0]
0088ec6c	ldr x8,[x19]
0088ec70	adrp x1,0x2c6000
0088ec74	add x1,x1,#0xb24
0088ec78	mov x0,x8
0088ec7c	mov w2,w22
0088ec80	bl 0x008769e0
0088ec84	ldr x0,[x19]
0088ec88	mov x8,#-0x1
0088ec8c	mov w9,#0x1
0088ec90	add x8,x8,#0x1
0088ec94	lsl w10,w9,w8
0088ec98	cmp w10,w22
0088ec9c	b.cc 0x0088ec90
0088eca0	cmp w22,#0x0
0088eca4	mov w1,#0x35
0088eca8	mov w2,w28
0088ecac	csinc w3,wzr,w8,eq
0088ecb0	mov w4,wzr
0088ecb4	bl 0x00875b54
0088ecb8	ldr x0,[x19]
0088ecbc	mov w1,w21
0088ecc0	bl 0x00875d18
0088ecc4	b 0x0088f594
0088ecc8	ands x10,x8,#0x7
0088eccc	mov w11,#0x8
0088ecd0	movi v0.2D,#0x0
0088ecd4	movi v4.4S,#0x1
0088ecd8	movi v6.2D,#0x0
0088ecdc	movi v3.2D,#0x0
0088ece0	movi v5.2D,#0x0
0088ece4	movi v1.2D,#0x0
0088ece8	csel x10,x11,x10,eq
0088ecec	movi v2.2D,#0x0
0088ecf0	sub x10,x8,x10
0088ecf4	add x11,x9,#0x60
0088ecf8	mov x12,x10
0088ecfc	ldur s7,[x11, #-0x60]
0088ed00	ldr s16,[x11]
0088ed04	sub x13,x11,#0x48
0088ed08	add x14,x11,#0x18
0088ed0c	subs x12,x12,#0x8
0088ed10	ld1 {v7.S}[1],[x13]
0088ed14	ld1 {v16.S}[1],[x14]
0088ed18	sub x13,x11,#0x30
0088ed1c	add x14,x11,#0x30
0088ed20	ld1 {v7.S}[2],[x13]
0088ed24	ld1 {v16.S}[2],[x14]
0088ed28	sub x13,x11,#0x18
0088ed2c	add x14,x11,#0x48
0088ed30	add x11,x11,#0xc0
0088ed34	ld1 {v7.S}[3],[x13]
0088ed38	ld1 {v16.S}[3],[x14]
0088ed3c	cmtst v17.4S,v7.4S,v7.4S
0088ed40	cmtst v20.4S,v16.4S,v16.4S
0088ed44	cmeq v18.4S,v7.4S,#0
0088ed48	cmeq v19.4S,v16.4S,#0
0088ed4c	cmeq v7.4S,v7.4S,v4.4S
0088ed50	cmeq v16.4S,v16.4S,v4.4S
0088ed54	sub v1.4S,v1.4S,v18.4S
0088ed58	sub v2.4S,v2.4S,v19.4S
0088ed5c	sub v0.4S,v0.4S,v17.4S
0088ed60	sub v6.4S,v6.4S,v20.4S
0088ed64	sub v3.4S,v3.4S,v7.4S
0088ed68	sub v5.4S,v5.4S,v16.4S
0088ed6c	b.ne 0x0088ecfc
0088ed70	add v0.4S,v6.4S,v0.4S
0088ed74	add v3.4S,v5.4S,v3.4S
0088ed78	add v1.4S,v2.4S,v1.4S
0088ed7c	addv s0,v0.4S
0088ed80	addv s2,v3.4S
0088ed84	addv s1,v1.4S
0088ed88	fmov w2,s0
0088ed8c	fmov w24,s2
0088ed90	fmov w27,s1
0088ed94	mov w11,#0x18
0088ed98	madd x11,x10,x11,x9
0088ed9c	sub x10,x8,x10
0088eda0	ldr w12,[x11], #0x18
0088eda4	cmp w12,#0x0
0088eda8	cinc w27,w27,eq
0088edac	cinc w2,w2,ne
0088edb0	cmp w12,#0x1
0088edb4	cinc w24,w24,eq
0088edb8	subs x10,x10,#0x1
0088edbc	b.ne 0x0088eda0
0088edc0	cbnz w27,0x0088eecc
0088edc4	cbz w2,0x0088eecc
0088edc8	ldp x17,x13,[x19, #0x168]
0088edcc	mov x12,#0x2d69
0088edd0	mov x1,#0x959d
0088edd4	movk x12,#0xeb38, LSL #16
0088edd8	ldrb w14,[x19, #0x178]
0088eddc	movk x1,#0xb8f4, LSL #16
0088ede0	movk x12,#0xea08, LSL #32
0088ede4	ldr x15,[x19, #0x160]
0088ede8	ldr x16,[x19, #0x148]
0088edec	movk x1,#0xd34f, LSL #32
0088edf0	mov w10,wzr
0088edf4	mov x11,xzr
0088edf8	movk x12,#0x9ddf, LSL #48
0088edfc	sub x17,x17,#0x1
0088ee00	mov w0,#0x18
0088ee04	movk x1,#0x949d, LSL #48
0088ee08	mov w22,#0x30
0088ee0c	b 0x0088ee24
0088ee10	mov w5,wzr
0088ee14	add x11,x11,#0x1
0088ee18	add w10,w5,w10
0088ee1c	cmp x11,x8
0088ee20	b.eq 0x0088eebc
0088ee24	cbz x13,0x0088ee10
0088ee28	madd x5,x11,x0,x9
0088ee2c	ldr x5,[x5, #0x8]
0088ee30	lsl w6,w5,#0x3
0088ee34	lsr x7,x5,#0x20
0088ee38	add x6,x6,#0x8
0088ee3c	eor x6,x6,x7
0088ee40	mul x6,x6,x12
0088ee44	eor x7,x7,x6, LSR #0x2f
0088ee48	eor x6,x7,x6
0088ee4c	mul x6,x6,x12
0088ee50	eor x6,x6,x6, LSR #0x2f
0088ee54	mul x6,x6,x1
0088ee58	lsr x6,x6,x14
0088ee5c	lsr x7,x6,#0x6
0088ee60	ldr x7,[x15, x7, LSL #0x3]
0088ee64	lsr x7,x7,x6
0088ee68	tbz w7,#0x0,0x0088ee10
0088ee6c	madd x7,x6,x22,x16
0088ee70	ldr x20,[x7]
0088ee74	cmp x20,x5
0088ee78	b.eq 0x0088ee98
0088ee7c	add x6,x6,#0x1
0088ee80	and x6,x6,x17
0088ee84	lsr x7,x6,#0x6
0088ee88	ldr x7,[x15, x7, LSL #0x3]
0088ee8c	lsr x7,x7,x6
0088ee90	tbnz w7,#0x0,0x0088ee6c
0088ee94	b 0x0088ee10
0088ee98	ldr w5,[x7, #0x8]
0088ee9c	cmp w5,#0x3
0088eea0	b.ne 0x0088ee10
0088eea4	add w5,w10,#0x1
0088eea8	ldr d1,[x7, #0x10]
0088eeac	ucvtf d0,w5
0088eeb0	fcmp d1,d0
0088eeb4	cset w5,eq
0088eeb8	b 0x0088ee14
0088eebc	add w11,w10,w24
0088eec0	cmp w2,w11
0088eec4	csel w10,w10,wzr,eq
0088eec8	csel w2,w24,w2,eq
0088eecc	mov x11,#-0x1
0088eed0	mov w12,#0x1
0088eed4	add x11,x11,#0x1
0088eed8	lsl w13,w12,w11
0088eedc	cmp w13,w2
0088eee0	b.cc 0x0088eed4
0088eee4	cmp w2,#0x0
0088eee8	ldr w13,[x19, #0x64c]
0088eeec	str w28,[sp, #0x24]
0088eef0	csinc w25,wzr,w11,eq
0088eef4	str w13,[sp, #0x14]
0088eef8	tbnz w3,#0x0,0x0088ef20
0088eefc	add w11,w13,#0x1
0088ef00	cmp w11,#0x100
0088ef04	b.cs 0x0088f6d8
0088ef08	ldr w12,[x19, #0x650]
0088ef0c	str w11,[x19, #0x64c]
0088ef10	str w13,[sp, #0x24]
0088ef14	cmp w12,w11
0088ef18	csel w11,w12,w11,hi
0088ef1c	str w11,[x19, #0x650]
0088ef20	movi v0.2D,#0x0
0088ef24	orr w11,w27,w10
0088ef28	mov w12,#0x3f800000
0088ef2c	str xzr,[sp, #0x70]
0088ef30	str w12,[sp, #0x78]
0088ef34	stp q0,q0,[sp, #0x50]
0088ef38	str q0,[sp, #0x40]
0088ef3c	cbnz w11,0x0088f0ec
0088ef40	sub w11,w24,#0x1
0088ef44	cmp w11,#0x1f
0088ef48	b.hi 0x0088f0ec
0088ef4c	cmp w2,w24
0088ef50	b.ne 0x0088f0ec
0088ef54	stp w4,w28,[sp, #0xc]
0088ef58	mov x20,xzr
0088ef5c	mov w22,#0x18
0088ef60	adrp x28,0xd1b000
0088ef64	str wzr,[sp, #0x188]
0088ef68	strb wzr,[sp, #0x18c]
0088ef6c	ldr x8,[x21, #0x20]
0088ef70	nop
0088ef74	madd x23,x20,x22,x8
0088ef78	ldr w10,[x28]
0088ef7c	ldr x0,[x19]
0088ef80	ldr x8,[x23, #0x8]
0088ef84	ldr w9,[x8, #0x8]
0088ef88	cmp w9,w10
0088ef8c	csel x26,x8,xzr,eq
0088ef90	ldp x1,x2,[x26, #0x20]
0088ef94	bl 0x00875070
0088ef98	str w0,[sp, #0x30]
0088ef9c	tbnz w0,#0x1f,0x0088f65c
0088efa0	ldr x1,[x23, #0x10]
0088efa4	mov x0,x19
0088efa8	bl 0x008868ec
0088efac	ldr x8,[sp, #0x60]
0088efb0	mov w26,w0
0088efb4	cbz x8,0x0088f074
0088efb8	fmov d0,x8
0088efbc	ldrsw x10,[sp, #0x30]
0088efc0	cnt v0.8B,v0.8B
0088efc4	addv b0,v0.8B
0088efc8	fmov x9,d0
0088efcc	cmp x9,#0x1
0088efd0	b.hi 0x0088efe0
0088efd4	sub x11,x8,#0x1
0088efd8	and x11,x11,x10
0088efdc	b 0x0088eff4
0088efe0	cmp x8,x10
0088efe4	mov x11,x10
0088efe8	b.hi 0x0088eff4
0088efec	udiv x11,x10,x8
0088eff0	msub x11,x11,x8,x10
0088eff4	ldr x12,[sp, #0x58]
0088eff8	ldr x12,[x12, x11, LSL #0x3]
0088effc	cbz x12,0x0088f074
0088f000	ldr x12,[x12]
0088f004	cbz x12,0x0088f074
0088f008	sub x13,x8,#0x1
0088f00c	b 0x0088f024
0088f010	ldr w14,[x12, #0x10]
0088f014	cmp w14,w10
0088f018	b.eq 0x0088f05c
0088f01c	ldr x12,[x12]
0088f020	cbz x12,0x0088f074
0088f024	ldr x14,[x12, #0x8]
0088f028	cmp x14,x10
0088f02c	b.eq 0x0088f010
0088f030	cmp x9,#0x1
0088f034	b.hi 0x0088f040
0088f038	and x14,x14,x13
0088f03c	b 0x0088f050
0088f040	cmp x14,x8
0088f044	b.cc 0x0088f050
0088f048	udiv x15,x14,x8
0088f04c	msub x14,x15,x8,x14
0088f050	cmp x14,x11
0088f054	b.eq 0x0088f01c
0088f058	b 0x0088f074
0088f05c	add x0,sp,#0x40
0088f060	add x1,sp,#0x30
0088f064	bl 0x00891a24
0088f068	ldr w8,[x0]
0088f06c	cmn w8,#0x1
0088f070	b.eq 0x0088f084
0088f074	add x0,sp,#0x40
0088f078	add x1,sp,#0x30
0088f07c	bl 0x00891a24
0088f080	str w26,[x0]
0088f084	ldr x8,[x21, #0x28]
0088f088	add x20,x20,#0x1
0088f08c	cmp x20,x8
0088f090	b.cc 0x0088ef6c
0088f094	ldp x8,x9,[sp, #0x40]
0088f098	ldp w20,w28,[sp, #0xc]
0088f09c	cmp x8,x9
0088f0a0	b.eq 0x0088f10c
0088f0a4	add x10,sp,#0x88
0088f0a8	ldr w13,[sp, #0x188]
0088f0ac	mov w12,#0x1
0088f0b0	add x11,x10,#0x80
0088f0b4	b 0x0088f0d0
0088f0b8	ldr w13,[sp, #0x188]
0088f0bc	add x8,x8,#0x8
0088f0c0	cmp x8,x9
0088f0c4	add w13,w13,#0x1
0088f0c8	str w13,[sp, #0x188]
0088f0cc	b.eq 0x0088f10c
0088f0d0	ldr w14,[x8]
0088f0d4	str w14,[x10, w13, UXTW #0x2]
0088f0d8	ldr w14,[x8, #0x4]
0088f0dc	str w14,[x11, w13, UXTW #0x2]
0088f0e0	tbnz w14,#0x1f,0x0088f0b8
0088f0e4	strb w12,[sp, #0x18c]
0088f0e8	b 0x0088f0b8
0088f0ec	mov w11,#0x18
0088f0f0	madd x8,x8,x11,x9
0088f0f4	subs x9,x8,#0x18
0088f0f8	b.eq 0x0088f104
0088f0fc	ldr w9,[x9]
0088f100	cbz w9,0x0088f188
0088f104	mov w8,wzr
0088f108	b 0x0088f1a0
0088f10c	ldr x0,[x19]
0088f110	add x1,sp,#0x88
0088f114	bl 0x008751d0
0088f118	mov w26,w0
0088f11c	tbnz w0,#0x1f,0x0088f71c
0088f120	ldr x0,[x19]
0088f124	adrp x1,0x29d000
0088f128	add x1,x1,#0x529
0088f12c	mov w2,w24
0088f130	bl 0x008769e0
0088f134	mov w8,#0xff
0088f138	bics wzr,w8,w20
0088f13c	b.eq 0x0088f5c4
0088f140	adrp x8,0xd1e000
0088f144	add x8,x8,#0xc80
0088f148	ldrb w8,[x8]
0088f14c	tbz w8,#0x0,0x0088f5c4
0088f150	ldr x0,[x19]
0088f154	mov w1,w26
0088f158	bl 0x00875680
0088f15c	mov w24,w0
0088f160	ldr x0,[x19]
0088f164	ldr w2,[sp, #0x24]
0088f168	mov w1,#0x5b
0088f16c	mov w3,w20
0088f170	mov w4,wzr
0088f174	bl 0x00875b54
0088f178	ldr x0,[x19]
0088f17c	mov w1,w24
0088f180	bl 0x00875d18
0088f184	b 0x0088f20c
0088f188	ldur x8,[x8, #-0x8]
0088f18c	adrp x9,0xd1b000
0088f190	ldr w9,[x9, #0x30]
0088f194	ldr w8,[x8, #0x8]
0088f198	cmp w8,w9
0088f19c	csetm w8,eq
0088f1a0	add w9,w10,w27
0088f1a4	add w23,w9,w8
0088f1a8	cbz w2,0x0088f1c8
0088f1ac	ldr x0,[x19]
0088f1b0	cbz w23,0x0088f1dc
0088f1b4	adrp x1,0x2be000
0088f1b8	add x1,x1,#0xf25
0088f1bc	mov w3,w23
0088f1c0	bl 0x008769e0
0088f1c4	b 0x0088f1e8
0088f1c8	ldr x0,[x19]
0088f1cc	adrp x1,0x29d000
0088f1d0	add x1,x1,#0x547
0088f1d4	mov w2,w23
0088f1d8	b 0x0088f1e4
0088f1dc	adrp x1,0x2c6000
0088f1e0	add x1,x1,#0xb24
0088f1e4	bl 0x008769e0
0088f1e8	ldr x0,[x19]
0088f1ec	ldr w2,[sp, #0x24]
0088f1f0	mov w1,#0x35
0088f1f4	mov w3,w25
0088f1f8	mov w4,wzr
0088f1fc	bl 0x00875b54
0088f200	ldr x0,[x19]
0088f204	mov w1,w23
0088f208	bl 0x00875d18
0088f20c	cmp w27,#0x10
0088f210	mov w8,#0x10
0088f214	ldr w23,[x19, #0x64c]
0088f218	csel w24,w27,w8,cc
0088f21c	add w8,w23,w24
0088f220	cmp w8,#0x100
0088f224	b.cs 0x0088f6ac
0088f228	ldr w9,[x19, #0x650]
0088f22c	str w8,[x19, #0x64c]
0088f230	cmp w9,w8
0088f234	csel w8,w9,w8,hi
0088f238	str w8,[x19, #0x650]
0088f23c	ldr x8,[x21, #0x28]
0088f240	cbz x8,0x0088f514
0088f244	mov w22,wzr
0088f248	mov x20,xzr
0088f24c	mov w26,wzr
0088f250	mov w25,#0x1
0088f254	str w28,[sp, #0x10]
0088f258	b 0x0088f270
0088f25c	add w22,w22,#0x1
0088f260	ldr x8,[x21, #0x28]
0088f264	add x20,x20,#0x1
0088f268	cmp x20,x8
0088f26c	b.cs 0x0088f4e4
0088f270	ldr x8,[x21, #0x20]
0088f274	mov w9,#0x18
0088f278	madd x8,x20,x9,x8
0088f27c	ldp x10,x9,[sp, #0x40]
0088f280	cmp x9,x10
0088f284	ldp x28,x27,[x8, #0x8]
0088f288	b.eq 0x0088f37c
0088f28c	cbz x28,0x0088f37c
0088f290	adrp x9,0xd1b000
0088f294	ldr w8,[x28, #0x8]
0088f298	ldr w9,[x9]
0088f29c	cmp w8,w9
0088f2a0	b.ne 0x0088f37c
0088f2a4	ldp x1,x2,[x28, #0x20]
0088f2a8	ldr x0,[x19]
0088f2ac	bl 0x00875070
0088f2b0	ldr x8,[sp, #0x60]
0088f2b4	cbz x8,0x0088f37c
0088f2b8	fmov d0,x8
0088f2bc	sxtw x10,w0
0088f2c0	cnt v0.8B,v0.8B
0088f2c4	addv b0,v0.8B
0088f2c8	fmov x9,d0
0088f2cc	cmp x9,#0x1
0088f2d0	b.hi 0x0088f2e0
0088f2d4	sub x11,x8,#0x1
0088f2d8	and x11,x11,x10
0088f2dc	b 0x0088f2f4
0088f2e0	cmp x8,x10
0088f2e4	mov x11,x10
0088f2e8	b.hi 0x0088f2f4
0088f2ec	udiv x11,x10,x8
0088f2f0	msub x11,x11,x8,x10
0088f2f4	ldr x12,[sp, #0x58]
0088f2f8	ldr x12,[x12, x11, LSL #0x3]
0088f2fc	cbz x12,0x0088f37c
0088f300	ldr x12,[x12]
0088f304	cbz x12,0x0088f37c
0088f308	sub x13,x8,#0x1
0088f30c	b 0x0088f324
0088f310	ldr w14,[x12, #0x10]
0088f314	cmp w14,w0
0088f318	b.eq 0x0088f35c
0088f31c	ldr x12,[x12]
0088f320	cbz x12,0x0088f37c
0088f324	ldr x14,[x12, #0x8]
0088f328	cmp x14,x10
0088f32c	b.eq 0x0088f310
0088f330	cmp x9,#0x1
0088f334	b.hi 0x0088f340
0088f338	and x14,x14,x13
0088f33c	b 0x0088f350
0088f340	cmp x14,x8
0088f344	b.cc 0x0088f350
0088f348	udiv x15,x14,x8
0088f34c	msub x14,x15,x8,x14
0088f350	cmp x14,x11
0088f354	b.eq 0x0088f31c
0088f358	b 0x0088f37c
0088f35c	ldp x8,x10,[sp, #0x40]
0088f360	ldr x9,[x12, #0x18]
0088f364	sub x10,x10,x8
0088f368	cmp x9,x10, ASR #0x3
0088f36c	b.cs 0x0088f704
0088f370	add x8,x8,x9, LSL #0x3
0088f374	ldr w8,[x8, #0x4]
0088f378	tbz w8,#0x1f,0x0088f260
0088f37c	ldr w8,[x19, #0xc]
0088f380	cmp w8,#0x1
0088f384	b.lt 0x0088f398
0088f388	ldr x0,[x19]
0088f38c	ldr w8,[x27, #0xc]
0088f390	add w1,w8,#0x1
0088f394	bl 0x00876644
0088f398	ldr w8,[x19, #0x14]
0088f39c	cmp w8,#0x1
0088f3a0	b.le 0x0088f3bc
0088f3a4	ldr x0,[x19]
0088f3a8	mov w1,#0x45
0088f3ac	mov w2,wzr
0088f3b0	mov w3,wzr
0088f3b4	mov w4,wzr
0088f3b8	bl 0x00875b54
0088f3bc	cbz w22,0x0088f3f4
0088f3c0	cbnz x28,0x0088f3cc
0088f3c4	cmp w22,w24
0088f3c8	b.ne 0x0088f494
0088f3cc	ldr x0,[x19]
0088f3d0	ldr w2,[sp, #0x24]
0088f3d4	add w4,w22,#0x1
0088f3d8	mov w1,#0x37
0088f3dc	mov w3,w23
0088f3e0	bl 0x00875b54
0088f3e4	ldr x0,[x19]
0088f3e8	mov w1,w25
0088f3ec	bl 0x00875d18
0088f3f0	add w25,w22,w25
0088f3f4	cbz x28,0x0088f490
0088f3f8	ldr w8,[x19, #0x64c]
0088f3fc	str x19,[sp, #0x30]
0088f400	str w8,[sp, #0x38]
0088f404	ldr w1,[sp, #0x24]
0088f408	add x8,sp,#0x88
0088f40c	add x3,sp,#0x30
0088f410	mov x0,x19
0088f414	mov x2,x28
0088f418	bl 0x00891ba0
0088f41c	mov x0,x19
0088f420	mov x1,x27
0088f424	bl 0x0088df20
0088f428	mov w2,w0
0088f42c	tbz w0,#0x1f,0x0088f468
0088f430	ldr w2,[x19, #0x64c]
0088f434	add w8,w2,#0x1
0088f438	cmp w8,#0x100
0088f43c	b.cs 0x0088f680
0088f440	ldr w9,[x19, #0x650]
0088f444	str w8,[x19, #0x64c]
0088f448	cmp w9,w8
0088f44c	csel w8,w9,w8,hi
0088f450	str w8,[x19, #0x650]
0088f454	mov x0,x19
0088f458	mov x1,x27
0088f45c	mov w3,#0xff
0088f460	bl 0x00891438
0088f464	mov w2,w0
0088f468	add x1,sp,#0x88
0088f46c	mov x0,x19
0088f470	mov w3,#0x1
0088f474	mov x4,xzr
0088f478	bl 0x00892774
0088f47c	ldr w8,[sp, #0x38]
0088f480	ldr x9,[sp, #0x30]
0088f484	mov w22,wzr
0088f488	str w8,[x9, #0x64c]
0088f48c	b 0x0088f260
0088f490	mov w22,wzr
0088f494	ldr x8,[x21, #0x28]
0088f498	add x9,x20,#0x1
0088f49c	add w2,w22,w23
0088f4a0	cmp x9,x8
0088f4a4	b.ne 0x0088f4bc
0088f4a8	mov x0,x19
0088f4ac	mov x1,x27
0088f4b0	bl 0x00891d80
0088f4b4	mov w26,w0
0088f4b8	b 0x0088f25c
0088f4bc	and w8,w2,#0xff
0088f4c0	ldr w28,[x19, #0x64c]
0088f4c4	add w8,w8,#0x1
0088f4c8	str w8,[x19, #0x64c]
0088f4cc	mov x0,x19
0088f4d0	mov x1,x27
0088f4d4	mov w3,#0x1
0088f4d8	bl 0x0088d1d0
0088f4dc	str w28,[x19, #0x64c]
0088f4e0	b 0x0088f25c
0088f4e4	ldr w28,[sp, #0x10]
0088f4e8	cbz w22,0x0088f514
0088f4ec	ldr x0,[x19]
0088f4f0	tst w26,#0x1
0088f4f4	csinc w4,wzr,w22,ne
0088f4f8	ldr w2,[sp, #0x24]
0088f4fc	mov w1,#0x37
0088f500	mov w3,w23
0088f504	bl 0x00875b54
0088f508	ldr x0,[x19]
0088f50c	mov w1,w25
0088f510	bl 0x00875d18
0088f514	ldr w9,[sp, #0x24]
0088f518	and w8,w28,#0xff
0088f51c	cmp w8,w9, UXTB 
0088f520	b.eq 0x0088f53c
0088f524	ldr x0,[x19]
0088f528	ldr w3,[sp, #0x24]
0088f52c	mov w1,#0x6
0088f530	mov w2,w28
0088f534	mov w4,wzr
0088f538	bl 0x00875b54
0088f53c	ldr x0,[sp, #0x68]
0088f540	cbz x0,0x0088f558
0088f544	ldr x20,[x0]
0088f548	mov w1,#0x20
0088f54c	bl 0x00c2fe80
0088f550	mov x0,x20
0088f554	cbnz x20,0x0088f544
0088f558	ldr x0,[sp, #0x58]
0088f55c	ldr x20,[sp, #0x18]
0088f560	ldr w21,[sp, #0x14]
0088f564	str xzr,[sp, #0x58]
0088f568	cbz x0,0x0088f578
0088f56c	ldr x8,[sp, #0x60]
0088f570	lsl x1,x8,#0x3
0088f574	bl 0x00c2fe80
0088f578	ldr x0,[sp, #0x40]
0088f57c	cbz x0,0x0088f590
0088f580	ldr x8,[sp, #0x50]
0088f584	str x0,[sp, #0x48]
0088f588	sub x1,x8,x0
0088f58c	bl 0x00c2fe80
0088f590	str w21,[x19, #0x64c]
0088f594	ldr x8,[x20, #0x28]
0088f598	ldur x9,[x29, #-0x10]
0088f59c	cmp x8,x9
0088f5a0	b.ne 0x0088f7cc
0088f5a4	add sp,sp,#0x1a0
0088f5a8	ldp x20,x19,[sp, #0x50]
0088f5ac	ldp x22,x21,[sp, #0x40]
0088f5b0	ldp x24,x23,[sp, #0x30]
0088f5b4	ldp x26,x25,[sp, #0x20]
0088f5b8	ldp x28,x27,[sp, #0x10]
0088f5bc	ldp x29,x30,[sp], #0x60
0088f5c0	ret
0088f5c4	lsr w8,w26,#0xf
0088f5c8	cbnz w8,0x0088f5e4
0088f5cc	ldr x0,[x19]
0088f5d0	ldr w2,[sp, #0x24]
0088f5d4	mov w1,#0x36
0088f5d8	mov w3,w26
0088f5dc	bl 0x00875cac
0088f5e0	b 0x0088f20c
0088f5e4	ldr x8,[sp, #0x40]
0088f5e8	ldr x9,[sp, #0x70]
0088f5ec	strb wzr,[sp, #0x18c]
0088f5f0	str x8,[sp, #0x48]
0088f5f4	cbz x9,0x0088f634
0088f5f8	ldr x0,[sp, #0x68]
0088f5fc	cbz x0,0x0088f614
0088f600	ldr x20,[x0]
0088f604	mov w1,#0x20
0088f608	bl 0x00c2fe80
0088f60c	mov x0,x20
0088f610	cbnz x20,0x0088f600
0088f614	ldr x8,[sp, #0x60]
0088f618	str xzr,[sp, #0x68]
0088f61c	cbz x8,0x0088f630
0088f620	ldr x0,[sp, #0x58]
0088f624	lsl x2,x8,#0x3
0088f628	mov w1,wzr
0088f62c	bl 0x00c301c0
0088f630	str xzr,[sp, #0x70]
0088f634	ldr x0,[x19]
0088f638	ldr w2,[sp, #0x24]
0088f63c	mov w1,#0x35
0088f640	mov w3,w25
0088f644	mov w4,wzr
0088f648	bl 0x00875b54
0088f64c	ldr x0,[x19]
0088f650	mov w1,wzr
0088f654	bl 0x00875d18
0088f658	b 0x0088f20c
0088f65c	ldr x8,[sp, #0x18]
0088f660	ldr x8,[x8, #0x28]
0088f664	ldur x9,[x29, #-0x10]
0088f668	cmp x8,x9
0088f66c	b.ne 0x0088f7cc
0088f670	adrp x1,0x2a7000
0088f674	add x1,x1,#0x164
0088f678	add x0,x26,#0xc
0088f67c	bl 0x0087fcd8
0088f680	ldr x8,[sp, #0x18]
0088f684	ldr x8,[x8, #0x28]
0088f688	ldur x9,[x29, #-0x10]
0088f68c	cmp x8,x9
0088f690	b.ne 0x0088f7cc
0088f694	adrp x1,0x2d0000
0088f698	add x1,x1,#0xc00
0088f69c	add x0,x27,#0xc
0088f6a0	mov w2,#0x1
0088f6a4	mov w3,#0xff
0088f6a8	bl 0x0087fcd8
0088f6ac	ldr x8,[sp, #0x18]
0088f6b0	ldr x8,[x8, #0x28]
0088f6b4	ldur x9,[x29, #-0x10]
0088f6b8	cmp x8,x9
0088f6bc	b.ne 0x0088f7cc
0088f6c0	adrp x1,0x2d0000
0088f6c4	add x1,x1,#0xc00
0088f6c8	add x0,x21,#0xc
0088f6cc	mov w2,w24
0088f6d0	mov w3,#0xff
0088f6d4	bl 0x0087fcd8
0088f6d8	ldr x8,[sp, #0x18]
0088f6dc	ldr x8,[x8, #0x28]
0088f6e0	ldur x9,[x29, #-0x10]
0088f6e4	cmp x8,x9
0088f6e8	b.ne 0x0088f7cc
0088f6ec	adrp x1,0x2d0000
0088f6f0	add x1,x1,#0xc00
0088f6f4	add x0,x21,#0xc
0088f6f8	mov w2,#0x1
0088f6fc	mov w3,#0xff
0088f700	bl 0x0087fcd8
0088f704	ldr x8,[sp, #0x18]
0088f708	ldr x8,[x8, #0x28]
0088f70c	ldur x9,[x29, #-0x10]
0088f710	cmp x8,x9
0088f714	b.ne 0x0088f7cc
0088f718	bl 0x00892760
0088f71c	ldr x8,[sp, #0x18]
0088f720	ldr x8,[x8, #0x28]
0088f724	ldur x9,[x29, #-0x10]
0088f728	cmp x8,x9
0088f72c	b.ne 0x0088f7cc
0088f730	adrp x1,0x2a7000
0088f734	add x1,x1,#0x164
0088f738	add x0,x21,#0xc
0088f73c	bl 0x0087fcd8
0088f7cc	bl 0x00c2fec0
