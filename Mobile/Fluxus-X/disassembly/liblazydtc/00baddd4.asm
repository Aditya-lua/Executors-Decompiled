; mbedtls_internal_sha512_process @ 00baddd4
00baddd4	stp x28,x19,[sp, #-0x20]!
00baddd8	stp x29,x30,[sp, #0x10]
00badddc	add x29,sp,#0x10
00badde0	sub sp,sp,#0x2e0
00badde4	mrs x19,tpidr_el0
00badde8	ldr x9,[x19, #0x28]
00baddec	mov x8,xzr
00baddf0	stur x9,[x29, #-0x18]
00baddf4	ldr q0,[x0, #0x40]
00baddf8	add x9,sp,#0x1c9
00baddfc	stur q0,[x9, #0xff]
00bade00	ldr q0,[x0, #0x30]
00bade04	add x9,sp,#0x1b9
00bade08	stur q0,[x9, #0xff]
00bade0c	ldr q0,[x0, #0x20]
00bade10	add x9,sp,#0x1a9
00bade14	stur q0,[x9, #0xff]
00bade18	ldr q0,[x0, #0x10]
00bade1c	add x9,sp,#0x199
00bade20	stur q0,[x9, #0xff]
00bade24	ldp x9,x10,[x1]
00bade28	rev x9,x9
00bade2c	rev x10,x10
00bade30	stp x9,x10,[sp, #0x18]
00bade34	ldr x10,[x1, #0x10]
00bade38	rev x10,x10
00bade3c	str x10,[sp, #0x28]
00bade40	ldr x10,[x1, #0x18]
00bade44	rev x10,x10
00bade48	str x10,[sp, #0x30]
00bade4c	ldr x10,[x1, #0x20]
00bade50	rev x10,x10
00bade54	str x10,[sp, #0x38]
00bade58	ldr x10,[x1, #0x28]
00bade5c	rev x10,x10
00bade60	str x10,[sp, #0x40]
00bade64	ldr x10,[x1, #0x30]
00bade68	rev x10,x10
00bade6c	str x10,[sp, #0x48]
00bade70	ldr x10,[x1, #0x38]
00bade74	rev x10,x10
00bade78	str x10,[sp, #0x50]
00bade7c	ldr x10,[x1, #0x40]
00bade80	rev x10,x10
00bade84	str x10,[sp, #0x58]
00bade88	ldr x10,[x1, #0x48]
00bade8c	rev x10,x10
00bade90	str x10,[sp, #0x60]
00bade94	ldr x10,[x1, #0x50]
00bade98	rev x10,x10
00bade9c	str x10,[sp, #0x68]
00badea0	ldr x10,[x1, #0x58]
00badea4	rev x10,x10
00badea8	str x10,[sp, #0x70]
00badeac	ldr x10,[x1, #0x60]
00badeb0	rev x10,x10
00badeb4	str x10,[sp, #0x78]
00badeb8	ldr x10,[x1, #0x68]
00badebc	rev x10,x10
00badec0	str x10,[sp, #0x80]
00badec4	ldr x10,[x1, #0x70]
00badec8	rev x10,x10
00badecc	str x10,[sp, #0x88]
00baded0	ldr x10,[x1, #0x78]
00baded4	rev x10,x10
00baded8	str x10,[sp, #0x90]
00badedc	add x10,sp,#0x8
00badee0	add x10,x10,#0x90
00badee4	add x11,x10,x8
00badee8	ldur x13,[x11, #-0x38]
00badeec	ldur x12,[x11, #-0x10]
00badef0	add x8,x8,#0x8
00badef4	cmp x8,#0x200
00badef8	add x9,x9,x13
00badefc	ldur x13,[x11, #-0x78]
00badf00	ror x14,x12,#0x3d
00badf04	eor x14,x14,x12, LSR #0x6
00badf08	eor x12,x14,x12, ROR #0x13
00badf0c	add x9,x9,x12
00badf10	ror x12,x13,#0x8
00badf14	eor x12,x12,x13, LSR #0x7
00badf18	eor x12,x12,x13, ROR #0x1
00badf1c	add x9,x9,x12
00badf20	str x9,[x11]
00badf24	mov x9,x13
00badf28	b.ne 0x00badee4
00badf2c	ldr x15,[sp, #0x2b8]
00badf30	ldr x13,[sp, #0x2c8]
00badf34	ldr x16,[sp, #0x2c0]
00badf38	ldr x12,[sp, #0x298]
00badf3c	ldr x11,[sp, #0x2a0]
00badf40	ldr x14,[sp, #0x2a8]
00badf44	adrp x10,0x788000
00badf48	add x9,sp,#0x8
00badf4c	add x10,x10,#0x768
00badf50	mov x8,xzr
00badf54	add x9,x9,#0x28
00badf58	add x10,x10,#0x20
00badf5c	ror x3,x12,#0x1c
00badf60	orr x5,x11,x12
00badf64	and x4,x11,x12
00badf68	eor x3,x3,x12, ROR #0x22
00badf6c	and x5,x14,x5
00badf70	orr x4,x5,x4
00badf74	eor x3,x3,x12, ROR #0x27
00badf78	ldr x18,[sp, #0x2d0]
00badf7c	add x3,x3,x4
00badf80	ldp x5,x4,[x10, #-0x20]
00badf84	ror x1,x15,#0xe
00badf88	ldur x2,[x9, #-0x18]
00badf8c	eor x1,x1,x15, ROR #0x12
00badf90	eor x17,x16,x13
00badf94	add x18,x5,x18
00badf98	ldr x5,[sp, #0x2b0]
00badf9c	eor x1,x1,x15, ROR #0x29
00badfa0	add x18,x18,x1
00badfa4	and x17,x17,x15
00badfa8	add x18,x18,x2
00badfac	ldp x1,x2,[x10, #-0x10]
00badfb0	eor x17,x17,x13
00badfb4	add x17,x18,x17
00badfb8	eor x18,x16,x15
00badfbc	add x5,x5,x17
00badfc0	and x18,x5,x18
00badfc4	add x1,x1,x16
00badfc8	add x17,x3,x17
00badfcc	eor x16,x18,x16
00badfd0	str x5,[sp, #0x2b0]
00badfd4	str x17,[sp, #0x2d0]
00badfd8	add x13,x16,x13
00badfdc	orr x16,x17,x12
00badfe0	add x13,x13,x4
00badfe4	ldur x4,[x9, #-0x10]
00badfe8	and x18,x17,x12
00badfec	and x16,x16,x11
00badff0	ror x3,x5,#0xe
00badff4	orr x16,x16,x18
00badff8	ror x18,x17,#0x1c
00badffc	eor x18,x18,x17, ROR #0x22
00bae000	eor x3,x3,x5, ROR #0x12
00bae004	eor x18,x18,x17, ROR #0x27
00bae008	eor x3,x3,x5, ROR #0x29
00bae00c	add x13,x13,x4
00bae010	add x16,x18,x16
00bae014	add x13,x13,x3
00bae018	add x3,x13,x14
00bae01c	add x13,x13,x16
00bae020	eor x18,x5,x15
00bae024	ror x16,x13,#0x1c
00bae028	orr x4,x13,x17
00bae02c	str x3,[sp, #0x2a8]
00bae030	str x13,[sp, #0x2c8]
00bae034	and x14,x3,x18
00bae038	and x18,x13,x17
00bae03c	eor x16,x16,x13, ROR #0x22
00bae040	and x4,x4,x12
00bae044	add x2,x2,x15
00bae048	eor x14,x14,x15
00bae04c	ldur x15,[x9, #-0x8]
00bae050	orr x18,x4,x18
00bae054	eor x16,x16,x13, ROR #0x27
00bae058	add x16,x16,x18
00bae05c	ldp x4,x18,[x10]
00bae060	add x15,x1,x15
00bae064	ror x1,x3,#0xe
00bae068	add x15,x15,x14
00bae06c	add x14,x18,x3
00bae070	eor x18,x1,x3, ROR #0x12
00bae074	eor x18,x18,x3, ROR #0x29
00bae078	add x15,x15,x18
00bae07c	eor x6,x3,x5
00bae080	add x18,x15,x11
00bae084	add x11,x15,x16
00bae088	and x15,x18,x6
00bae08c	add x4,x4,x5
00bae090	eor x15,x15,x5
00bae094	orr x5,x11,x13
00bae098	str x18,[sp, #0x2a0]
00bae09c	str x11,[sp, #0x2c0]
00bae0a0	and x1,x11,x13
00bae0a4	and x5,x5,x17
00bae0a8	ror x16,x11,#0x1c
00bae0ac	orr x1,x5,x1
00bae0b0	ldr x5,[x9]
00bae0b4	eor x16,x16,x11, ROR #0x22
00bae0b8	eor x16,x16,x11, ROR #0x27
00bae0bc	add x16,x16,x1
00bae0c0	ror x1,x18,#0xe
00bae0c4	add x2,x2,x5
00bae0c8	eor x1,x1,x18, ROR #0x12
00bae0cc	eor x1,x1,x18, ROR #0x29
00bae0d0	add x15,x2,x15
00bae0d4	add x1,x15,x1
00bae0d8	eor x5,x18,x3
00bae0dc	add x15,x1,x12
00bae0e0	add x12,x1,x16
00bae0e4	str x15,[sp, #0x298]
00bae0e8	str x12,[sp, #0x2b8]
00bae0ec	and x16,x15,x5
00bae0f0	eor x16,x16,x3
00bae0f4	ldr x3,[x9, #0x8]
00bae0f8	ror x1,x12,#0x1c
00bae0fc	orr x5,x12,x11
00bae100	and x2,x12,x11
00bae104	eor x1,x1,x12, ROR #0x22
00bae108	and x5,x5,x13
00bae10c	eor x1,x1,x12, ROR #0x27
00bae110	orr x2,x5,x2
00bae114	add x1,x1,x2
00bae118	add x2,x4,x3
00bae11c	add x16,x2,x16
00bae120	ror x2,x15,#0xe
00bae124	eor x2,x2,x15, ROR #0x12
00bae128	ldp x5,x3,[x10, #0x10]
00bae12c	eor x2,x2,x15, ROR #0x29
00bae130	add x16,x16,x2
00bae134	eor x2,x15,x18
00bae138	add x17,x16,x17
00bae13c	add x1,x16,x1
00bae140	and x16,x17,x2
00bae144	add x4,x5,x18
00bae148	eor x16,x16,x18
00bae14c	orr x18,x1,x12
00bae150	and x2,x1,x12
00bae154	and x18,x18,x11
00bae158	orr x18,x18,x2
00bae15c	ror x2,x1,#0x1c
00bae160	eor x2,x2,x1, ROR #0x22
00bae164	str x17,[sp, #0x2d0]
00bae168	str x1,[sp, #0x2b0]
00bae16c	eor x2,x2,x1, ROR #0x27
00bae170	add x18,x2,x18
00bae174	ldr x2,[x9, #0x10]
00bae178	add x3,x3,x15
00bae17c	add x8,x8,#0x8
00bae180	cmp x8,#0x50
00bae184	add x14,x14,x2
00bae188	ror x2,x17,#0xe
00bae18c	eor x2,x2,x17, ROR #0x12
00bae190	add x14,x14,x16
00bae194	eor x2,x2,x17, ROR #0x29
00bae198	add x14,x14,x2
00bae19c	eor x16,x17,x15
00bae1a0	add x13,x14,x13
00bae1a4	add x14,x14,x18
00bae1a8	and x16,x13,x16
00bae1ac	eor x15,x16,x15
00bae1b0	orr x16,x14,x1
00bae1b4	str x13,[sp, #0x2c8]
00bae1b8	str x14,[sp, #0x2a8]
00bae1bc	and x2,x14,x1
00bae1c0	and x16,x16,x12
00bae1c4	ror x18,x14,#0x1c
00bae1c8	orr x16,x16,x2
00bae1cc	ldr x2,[x9, #0x18]
00bae1d0	eor x18,x18,x14, ROR #0x22
00bae1d4	eor x18,x18,x14, ROR #0x27
00bae1d8	add x18,x18,x16
00bae1dc	ror x16,x13,#0xe
00bae1e0	add x2,x4,x2
00bae1e4	eor x16,x16,x13, ROR #0x12
00bae1e8	eor x16,x16,x13, ROR #0x29
00bae1ec	add x15,x2,x15
00bae1f0	add x15,x15,x16
00bae1f4	eor x4,x13,x17
00bae1f8	add x16,x15,x11
00bae1fc	add x11,x15,x18
00bae200	and x18,x16,x4
00bae204	str x16,[sp, #0x2c0]
00bae208	str x11,[sp, #0x2a0]
00bae20c	eor x18,x18,x17
00bae210	orr x17,x11,x14
00bae214	and x17,x17,x1
00bae218	ldr x1,[x9, #0x20]
00bae21c	ror x15,x16,#0xe
00bae220	ror x2,x11,#0x1c
00bae224	and x4,x11,x14
00bae228	eor x15,x15,x16, ROR #0x12
00bae22c	eor x2,x2,x11, ROR #0x22
00bae230	add x1,x3,x1
00bae234	eor x15,x15,x16, ROR #0x29
00bae238	eor x2,x2,x11, ROR #0x27
00bae23c	orr x17,x17,x4
00bae240	add x18,x1,x18
00bae244	add x17,x2,x17
00bae248	add x18,x18,x15
00bae24c	add x9,x9,#0x40
00bae250	add x15,x18,x12
00bae254	add x12,x18,x17
00bae258	add x10,x10,#0x40
00bae25c	str x15,[sp, #0x2b8]
00bae260	str x12,[sp, #0x298]
00bae264	b.cc 0x00badf5c
00bae268	stp x18,x17,[sp, #0x8]
00bae26c	ldp x8,x9,[x0, #0x10]
00bae270	mov w1,#0x2d0
00bae274	add x8,x8,x12
00bae278	ldp x12,x17,[x0, #0x30]
00bae27c	add x9,x9,x11
00bae280	stp x8,x9,[x0, #0x10]
00bae284	ldp x10,x11,[x0, #0x20]
00bae288	add x12,x12,x15
00bae28c	ldp x8,x15,[x0, #0x40]
00bae290	ldr x9,[sp, #0x2b0]
00bae294	add x10,x10,x14
00bae298	add x14,x17,x16
00bae29c	add x8,x8,x13
00bae2a0	add x9,x11,x9
00bae2a4	stp x12,x14,[x0, #0x30]
00bae2a8	stp x10,x9,[x0, #0x20]
00bae2ac	str x8,[x0, #0x40]
00bae2b0	ldr x8,[sp, #0x2d0]
00bae2b4	add x8,x15,x8
00bae2b8	str x8,[x0, #0x48]
00bae2bc	add x0,sp,#0x8
00bae2c0	bl 0x00c42220
00bae2c4	ldr x8,[x19, #0x28]
00bae2c8	ldur x9,[x29, #-0x18]
00bae2cc	cmp x8,x9
00bae2d0	b.ne 0x00bae2e8
00bae2d4	mov w0,wzr
00bae2d8	add sp,sp,#0x2e0
00bae2dc	ldp x29,x30,[sp, #0x10]
00bae2e0	ldp x28,x19,[sp], #0x20
00bae2e4	ret
00bae2e8	bl 0x00c2fec0
