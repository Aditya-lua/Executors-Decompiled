; FUN_0085eb28 @ 0085eb28
0085eb28	sub sp,sp,#0xc0
0085eb2c	stp x29,x30,[sp, #0x70]
0085eb30	str x25,[sp, #0x80]
0085eb34	stp x24,x23,[sp, #0x90]
0085eb38	stp x22,x21,[sp, #0xa0]
0085eb3c	stp x20,x19,[sp, #0xb0]
0085eb40	add x29,sp,#0x70
0085eb44	mrs x24,tpidr_el0
0085eb48	mov x22,x4
0085eb4c	mov x23,x3
0085eb50	ldr x8,[x24, #0x28]
0085eb54	mov x21,x2
0085eb58	mov x19,x0
0085eb5c	mov x20,x1
0085eb60	stur x8,[x29, #-0x8]
0085eb64	ldp x9,x8,[x0, #0x158]
0085eb68	sub x8,x8,x9
0085eb6c	cmp x8,#0x8
0085eb70	b.ne 0x0085eb80
0085eb74	ldr w8,[x19, #0x124]
0085eb78	cmp w8,#0x1
0085eb7c	b.eq 0x0085eb94
0085eb80	adrp x2,0x2ce000
0085eb84	add x2,x2,#0xcde
0085eb88	mov x0,x19
0085eb8c	mov x1,x20
0085eb90	bl 0x00860ecc
0085eb94	ldrb w8,[x19, #0x238]
0085eb98	cmp w8,#0x1
0085eb9c	b.ne 0x0085ebb4
0085eba0	adrp x2,0x2a1000
0085eba4	add x2,x2,#0x4c7
0085eba8	mov x0,x19
0085ebac	mov x1,x20
0085ebb0	bl 0x00860ecc
0085ebb4	ldr x9,[x23, #0x8]
0085ebb8	sub x8,x29,#0x10
0085ebbc	stp x19,x19,[x29, #-0x18]
0085ebc0	stur x8,[x29, #-0x20]
0085ebc4	cbz x9,0x0085ec20
0085ebc8	mov x0,x19
0085ebcc	ldr w8,[x0, #0x90]!
0085ebd0	cmp w8,#0x12b
0085ebd4	b.eq 0x0085ec20
0085ebd8	add x8,sp,#0x20
0085ebdc	add x25,sp,#0x20
0085ebe0	bl 0x008521fc
0085ebe4	ldrb w8,[sp, #0x20]
0085ebe8	ldr x9,[sp, #0x30]
0085ebec	tst w8,#0x1
0085ebf0	csinc x3,x9,x25,ne
0085ebf4	adrp x2,0x2ac000
0085ebf8	add x2,x2,#0xe50
0085ebfc	add x1,x19,#0x94
0085ec00	mov x0,x19
0085ec04	bl 0x00860ecc
0085ec08	ldrb w8,[sp, #0x20]
0085ec0c	tbz w8,#0x0,0x0085ec20
0085ec10	ldr x8,[sp, #0x20]
0085ec14	ldr x0,[sp, #0x30]
0085ec18	and x1,x8,#-0x2
0085ec1c	bl 0x00c2fe80
0085ec20	ldr w8,[x19, #0x90]
0085ec24	cmp w8,#0x119
0085ec28	b.eq 0x0085ed80
0085ec2c	cmp w8,#0x12b
0085ec30	b.eq 0x0085ec9c
0085ec34	cmp w8,#0x12e
0085ec38	b.ne 0x0085ed98
0085ec3c	ldur q0,[x19, #0x94]
0085ec40	add x8,sp,#0x20
0085ec44	add x0,x19,#0x70
0085ec48	stur q0,[x29, #-0x30]
0085ec4c	bl 0x00853d20
0085ec50	ldr w9,[sp, #0x20]
0085ec54	adrp x8,0xd1e000
0085ec58	ldrb w8,[x8, #0xc80]
0085ec5c	cmp w9,#0x12b
0085ec60	b.ne 0x0085edf0
0085ec64	adrp x9,0x2ac000
0085ec68	add x9,x9,#0xea0
0085ec6c	cmp w8,#0x0
0085ec70	adrp x8,0x2bc000
0085ec74	add x8,x8,#0xcbe
0085ec78	csel x2,x8,x9,ne
0085ec7c	mov x0,x19
0085ec80	mov x1,x20
0085ec84	bl 0x00860ecc
0085ec88	ldp x1,x2,[x20]
0085ec8c	add x4,sp,#0x20
0085ec90	ldur x3,[x29, #-0x30]
0085ec94	stp xzr,xzr,[sp, #0x20]
0085ec98	b 0x0085ef20
0085ec9c	ldp x1,x2,[x20]
0085eca0	mov x0,x19
0085eca4	mov x3,x21
0085eca8	mov x4,x23
0085ecac	mov w5,#0x1
0085ecb0	mov x6,x22
0085ecb4	bl 0x0085b410
0085ecb8	adrp x8,0xd1b000
0085ecbc	ldr w9,[x0, #0x8]
0085ecc0	ldr w8,[x8, #0x1d0]
0085ecc4	cmp w9,w8
0085ecc8	b.ne 0x0085f058
0085eccc	ldr x20,[x0, #0x20]
0085ecd0	ldur x8,[x29, #-0x10]
0085ecd4	ldr x3,[x20], #0x8
0085ecd8	ldr x9,[x8, #0x228]
0085ecdc	str x3,[sp, #0x20]
0085ece0	cbz x9,0x0085ed54
0085ece4	lsr x9,x3,#0x4
0085ece8	mov x10,#0x7c15
0085ecec	movk x10,#0x7f4a, LSL #16
0085ecf0	eor x9,x9,x3, LSR #0x9
0085ecf4	movk x10,#0x79b9, LSL #32
0085ecf8	movk x10,#0x9e37, LSL #48
0085ecfc	mul x9,x9,x10
0085ed00	ldrb w10,[x8, #0x230]
0085ed04	lsr x10,x9,x10
0085ed08	ldr x9,[x8, #0x218]
0085ed0c	lsr x11,x10,#0x6
0085ed10	ldr x11,[x9, x11, LSL #0x3]
0085ed14	lsr x11,x11,x10
0085ed18	tbz w11,#0x0,0x0085ed54
0085ed1c	ldr x12,[x8, #0x220]
0085ed20	ldr x11,[x8, #0x200]
0085ed24	mov w13,#0x18
0085ed28	sub x12,x12,#0x1
0085ed2c	mul x14,x10,x13
0085ed30	ldr x14,[x11, x14#0x0]
0085ed34	cmp x14,x3
0085ed38	b.eq 0x0085f084
0085ed3c	add x10,x10,#0x1
0085ed40	and x10,x10,x12
0085ed44	lsr x14,x10,#0x6
0085ed48	ldr x14,[x9, x14, LSL #0x3]
0085ed4c	lsr x14,x14,x10
0085ed50	tbnz w14,#0x0,0x0085ed2c
0085ed54	mov x21,x0
0085ed58	add x0,x8,#0x200
0085ed5c	add x1,sp,#0x20
0085ed60	bl 0x0086fd10
0085ed64	ldr q0,[x20]
0085ed68	str q0,[x0]
0085ed6c	ldr x8,[x21, #0x20]
0085ed70	mov w9,#0x101
0085ed74	mov x0,x21
0085ed78	strh w9,[x8, #0x30]
0085ed7c	b 0x0085f058
0085ed80	ldr x0,[x19, #0xa8]
0085ed84	cbz x0,0x0085ed98
0085ed88	adrp x1,0x2d2000
0085ed8c	add x1,x1,#0xbdf
0085ed90	bl 0x00c301f0
0085ed94	cbz w0,0x0085eea4
0085ed98	adrp x22,0xd1e000
0085ed9c	adrp x21,0x2ca000
0085eda0	add x21,x21,#0xa7c
0085eda4	ldrb w8,[x22, #0xc80]
0085eda8	cmp w8,#0x1
0085edac	b.ne 0x0085ee80
0085edb0	mov x0,x19
0085edb4	bl 0x00863160
0085edb8	tbz w0,#0x0,0x0085ee6c
0085edbc	ldr x0,[x19, #0xa8]
0085edc0	cmp x0,#0x0
0085edc4	cset w21,ne
0085edc8	cbz x0,0x0085ef74
0085edcc	adrp x1,0x2a5000
0085edd0	add x1,x1,#0x1a9
0085edd4	bl 0x00c301f0
0085edd8	mov w22,w0
0085eddc	mov x0,x19
0085ede0	bl 0x00858f2c
0085ede4	cbz w22,0x0085ef34
0085ede8	mov w21,wzr
0085edec	b 0x0085ef7c
0085edf0	cbz w8,0x0085ee30
0085edf4	add x8,sp,#0x20
0085edf8	add x0,x19,#0x70
0085edfc	bl 0x00853d20
0085ee00	ldr w8,[sp, #0x20]
0085ee04	cmp w8,#0x119
0085ee08	b.ne 0x0085ee30
0085ee0c	mov x8,sp
0085ee10	add x0,x19,#0x70
0085ee14	bl 0x00853d20
0085ee18	ldr x0,[sp, #0x18]
0085ee1c	cbz x0,0x0085ee30
0085ee20	adrp x1,0x2c4000
0085ee24	add x1,x1,#0xb1f
0085ee28	bl 0x00c301f0
0085ee2c	cbz w0,0x0085f0ec
0085ee30	ldp x1,x2,[x20]
0085ee34	add x4,sp,#0x20
0085ee38	mov x0,x19
0085ee3c	mov x3,x21
0085ee40	mov w5,wzr
0085ee44	mov x6,xzr
0085ee48	stp xzr,xzr,[sp, #0x20]
0085ee4c	bl 0x0085b410
0085ee50	mov x19,x0
0085ee54	sub x0,x29,#0x20
0085ee58	sub x2,x29,#0x30
0085ee5c	mov x1,x19
0085ee60	bl 0x00865adc
0085ee64	mov x0,x19
0085ee68	b 0x0085f058
0085ee6c	ldrb w8,[x22, #0xc80]
0085ee70	tst w8,#0x1
0085ee74	adrp x8,0x2ce000
0085ee78	add x8,x8,#0xd13
0085ee7c	csel x21,x8,x21,ne
0085ee80	add x2,sp,#0x20
0085ee84	mov x3,sp
0085ee88	mov x0,x19
0085ee8c	mov x1,x20
0085ee90	mov x4,x21
0085ee94	stp xzr,xzr,[sp, #0x20]
0085ee98	stp xzr,xzr,[sp]
0085ee9c	bl 0x0085e984
0085eea0	b 0x0085f058
0085eea4	ldur q0,[x19, #0x94]
0085eea8	mov x0,x19
0085eeac	str q0,[sp, #0x20]
0085eeb0	bl 0x00858f2c
0085eeb4	adrp x21,0xd1e000
0085eeb8	ldrb w8,[x21, #0xc80]
0085eebc	cmp w8,#0x1
0085eec0	b.ne 0x0085eedc
0085eec4	mov x0,x19
0085eec8	bl 0x00863160
0085eecc	tbz w0,#0x0,0x0085eedc
0085eed0	adrp x2,0x2c4000
0085eed4	add x2,x2,#0xb77
0085eed8	b 0x0085ef04
0085eedc	ldr w8,[x19, #0x90]
0085eee0	cmp w8,#0x12b
0085eee4	b.ne 0x0085f0a0
0085eee8	ldrb w8,[x21, #0xc80]
0085eeec	adrp x9,0x2ca000
0085eef0	add x9,x9,#0xa7c
0085eef4	cmp w8,#0x0
0085eef8	adrp x8,0x2c4000
0085eefc	add x8,x8,#0xb77
0085ef00	csel x2,x8,x9,ne
0085ef04	mov x0,x19
0085ef08	mov x1,x20
0085ef0c	bl 0x00860ecc
0085ef10	ldp x1,x2,[x20]
0085ef14	mov x4,sp
0085ef18	ldr x3,[sp, #0x20]
0085ef1c	stp xzr,xzr,[sp]
0085ef20	mov x0,x19
0085ef24	mov w5,#0x1
0085ef28	mov x6,xzr
0085ef2c	bl 0x0085b410
0085ef30	b 0x0085f058
0085ef34	ldr w8,[x19, #0x90]
0085ef38	cmp w8,#0x119
0085ef3c	b.ne 0x0085ef58
0085ef40	ldr x0,[x19, #0xa8]
0085ef44	cbz x0,0x0085ef58
0085ef48	adrp x1,0x2c4000
0085ef4c	add x1,x1,#0xb1f
0085ef50	bl 0x00c301f0
0085ef54	cbz w0,0x0085ef74
0085ef58	adrp x4,0x2b6000
0085ef5c	add x4,x4,#0xc90
0085ef60	add x2,sp,#0x20
0085ef64	mov x3,sp
0085ef68	mov x0,x19
0085ef6c	mov x1,x20
0085ef70	b 0x0085ee94
0085ef74	mov x0,x19
0085ef78	bl 0x00858f2c
0085ef7c	mov x0,x19
0085ef80	mov x1,x20
0085ef84	mov w2,#0x3
0085ef88	mov w3,w21
0085ef8c	bl 0x0085da04
0085ef90	cbz x0,0x0085f058
0085ef94	adrp x8,0xd1b000
0085ef98	ldr w9,[x0, #0x8]
0085ef9c	ldr w8,[x8, #0x220]
0085efa0	cmp w9,w8
0085efa4	b.ne 0x0085f058
0085efa8	ldr x21,[x0, #0x20]
0085efac	ldur x8,[x29, #-0x10]
0085efb0	mov x20,x21
0085efb4	ldr x9,[x8, #0x228]
0085efb8	ldr x3,[x20], #0x8
0085efbc	str x3,[sp, #0x20]
0085efc0	cbz x9,0x0085f034
0085efc4	lsr x9,x3,#0x4
0085efc8	mov x10,#0x7c15
0085efcc	movk x10,#0x7f4a, LSL #16
0085efd0	eor x9,x9,x3, LSR #0x9
0085efd4	movk x10,#0x79b9, LSL #32
0085efd8	movk x10,#0x9e37, LSL #48
0085efdc	mul x9,x9,x10
0085efe0	ldrb w10,[x8, #0x230]
0085efe4	lsr x10,x9,x10
0085efe8	ldr x9,[x8, #0x218]
0085efec	lsr x11,x10,#0x6
0085eff0	ldr x11,[x9, x11, LSL #0x3]
0085eff4	lsr x11,x11,x10
0085eff8	tbz w11,#0x0,0x0085f034
0085effc	ldr x12,[x8, #0x220]
0085f000	ldr x11,[x8, #0x200]
0085f004	mov w13,#0x18
0085f008	sub x12,x12,#0x1
0085f00c	mul x14,x10,x13
0085f010	ldr x14,[x11, x14#0x0]
0085f014	cmp x14,x3
0085f018	b.eq 0x0085f0d0
0085f01c	add x10,x10,#0x1
0085f020	and x10,x10,x12
0085f024	lsr x14,x10,#0x6
0085f028	ldr x14,[x9, x14, LSL #0x3]
0085f02c	lsr x14,x14,x10
0085f030	tbnz w14,#0x0,0x0085f00c
0085f034	mov x22,x0
0085f038	add x0,x8,#0x200
0085f03c	add x1,sp,#0x20
0085f040	bl 0x0086fd10
0085f044	ldr q0,[x20]
0085f048	str q0,[x0]
0085f04c	mov w8,#0x1
0085f050	mov x0,x22
0085f054	strb w8,[x21, #0x31]
0085f058	ldr x8,[x24, #0x28]
0085f05c	ldur x9,[x29, #-0x8]
0085f060	cmp x8,x9
0085f064	b.ne 0x0085f12c
0085f068	ldp x20,x19,[sp, #0xb0]
0085f06c	ldr x25,[sp, #0x80]
0085f070	ldp x22,x21,[sp, #0xa0]
0085f074	ldp x24,x23,[sp, #0x90]
0085f078	ldp x29,x30,[sp, #0x70]
0085f07c	add sp,sp,#0xc0
0085f080	ret
0085f084	mov x21,x0
0085f088	adrp x2,0x2cc000
0085f08c	add x2,x2,#0xb4a
0085f090	mov x0,x19
0085f094	mov x1,x20
0085f098	bl 0x00860ecc
0085f09c	b 0x0085ed6c
0085f0a0	ldp x1,x2,[x20]
0085f0a4	mov x4,sp
0085f0a8	ldr x3,[sp, #0x20]
0085f0ac	mov x0,x19
0085f0b0	mov w5,#0x1
0085f0b4	mov x6,xzr
0085f0b8	stp xzr,xzr,[sp]
0085f0bc	bl 0x0085b410
0085f0c0	mov x19,x0
0085f0c4	sub x0,x29,#0x20
0085f0c8	add x2,sp,#0x20
0085f0cc	b 0x0085ee5c
0085f0d0	mov x22,x0
0085f0d4	adrp x2,0x2cc000
0085f0d8	add x2,x2,#0xb4a
0085f0dc	mov x0,x19
0085f0e0	mov x1,x20
0085f0e4	bl 0x00860ecc
0085f0e8	b 0x0085f04c
0085f0ec	adrp x2,0x2bc000
0085f0f0	add x2,x2,#0xcbe
0085f0f4	b 0x0085ec7c
0085f12c	bl 0x00c2fec0
