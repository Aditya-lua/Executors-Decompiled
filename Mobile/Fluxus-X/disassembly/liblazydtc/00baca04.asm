; mbedtls_internal_sha256_process @ 00baca04
00baca04	sub sp,sp,#0x160
00baca08	stp x28,x21,[sp, #0x130]
00baca0c	stp x20,x19,[sp, #0x140]
00baca10	stp x29,x30,[sp, #0x150]
00baca14	add x29,sp,#0x150
00baca18	mrs x19,tpidr_el0
00baca1c	ldr x8,[x19, #0x28]
00baca20	mov x9,sp
00baca24	mov x10,xzr
00baca28	add x11,x9,#0x14
00baca2c	stur x8,[x29, #-0x28]
00baca30	ldur q0,[x0, #0x58]
00baca34	add x8,x9,#0x118
00baca38	str q0,[x8]
00baca3c	ldur q0,[x0, #0x48]
00baca40	add x8,x9,#0x108
00baca44	str q0,[x8]
00baca48	ldr w8,[x1]
00baca4c	ldr w14,[sp, #0x118]
00baca50	ldr w15,[sp, #0x120]
00baca54	ldr w18,[sp, #0x11c]
00baca58	rev w8,w8
00baca5c	str w8,[sp, #0x8]
00baca60	ldr w8,[x1, #0x4]
00baca64	ldr w16,[sp, #0x108]
00baca68	ldr w17,[sp, #0x10c]
00baca6c	rev w8,w8
00baca70	str w8,[sp, #0xc]
00baca74	ldr w8,[x1, #0x8]
00baca78	rev w8,w8
00baca7c	str w8,[sp, #0x10]
00baca80	ldr w8,[x1, #0xc]
00baca84	rev w8,w8
00baca88	str w8,[sp, #0x14]
00baca8c	ldr w8,[x1, #0x10]
00baca90	rev w8,w8
00baca94	str w8,[sp, #0x18]
00baca98	ldr w8,[x1, #0x14]
00baca9c	rev w8,w8
00bacaa0	str w8,[sp, #0x1c]
00bacaa4	ldr w8,[x1, #0x18]
00bacaa8	rev w8,w8
00bacaac	str w8,[sp, #0x20]
00bacab0	ldr w8,[x1, #0x1c]
00bacab4	rev w8,w8
00bacab8	str w8,[sp, #0x24]
00bacabc	ldr w8,[x1, #0x20]
00bacac0	rev w8,w8
00bacac4	str w8,[sp, #0x28]
00bacac8	ldr w8,[x1, #0x24]
00bacacc	rev w8,w8
00bacad0	str w8,[sp, #0x2c]
00bacad4	ldr w8,[x1, #0x28]
00bacad8	rev w8,w8
00bacadc	str w8,[sp, #0x30]
00bacae0	ldr w8,[x1, #0x2c]
00bacae4	rev w8,w8
00bacae8	str w8,[sp, #0x34]
00bacaec	ldr w8,[x1, #0x30]
00bacaf0	rev w8,w8
00bacaf4	str w8,[sp, #0x38]
00bacaf8	ldr w8,[x1, #0x34]
00bacafc	rev w8,w8
00bacb00	str w8,[sp, #0x3c]
00bacb04	ldp w8,w12,[x1, #0x38]
00bacb08	ldr w1,[sp, #0x110]
00bacb0c	rev w12,w12
00bacb10	str w12,[sp, #0x44]
00bacb14	adrp x12,0x788000
00bacb18	rev w8,w8
00bacb1c	add x12,x12,#0x4e0
00bacb20	str w8,[sp, #0x40]
00bacb24	add x8,x9,#0x11c
00bacb28	add x9,x9,#0x10c
00bacb2c	add x13,x12,#0x10
00bacb30	ror w6,w16,#0x2
00bacb34	orr w20,w17,w16
00bacb38	and w7,w17,w16
00bacb3c	eor w6,w6,w16, ROR #0xd
00bacb40	and w20,w1,w20
00bacb44	orr w7,w20,w7
00bacb48	eor w6,w6,w16, ROR #0x16
00bacb4c	ldr w3,[sp, #0x124]
00bacb50	add w6,w6,w7
00bacb54	ldp w20,w7,[x13, #-0x10]
00bacb58	ror w4,w14,#0x6
00bacb5c	ldur w5,[x11, #-0xc]
00bacb60	eor w4,w4,w14, ROR #0xb
00bacb64	eor w2,w18,w15
00bacb68	add w3,w20,w3
00bacb6c	ldr w20,[sp, #0x114]
00bacb70	eor w4,w4,w14, ROR #0x19
00bacb74	add w3,w3,w4
00bacb78	and w2,w2,w14
00bacb7c	add w3,w3,w5
00bacb80	ldp w4,w5,[x13, #-0x8]
00bacb84	eor w2,w2,w15
00bacb88	add w2,w3,w2
00bacb8c	eor w3,w18,w14
00bacb90	add w20,w20,w2
00bacb94	and w3,w20,w3
00bacb98	add w4,w4,w18
00bacb9c	add w2,w6,w2
00bacba0	eor w18,w3,w18
00bacba4	str w20,[sp, #0x114]
00bacba8	str w2,[sp, #0x124]
00bacbac	add w15,w18,w15
00bacbb0	orr w18,w2,w16
00bacbb4	add w15,w15,w7
00bacbb8	ldur w7,[x11, #-0x8]
00bacbbc	and w3,w2,w16
00bacbc0	and w18,w18,w17
00bacbc4	ror w6,w20,#0x6
00bacbc8	orr w18,w18,w3
00bacbcc	ror w3,w2,#0x2
00bacbd0	eor w3,w3,w2, ROR #0xd
00bacbd4	eor w6,w6,w20, ROR #0xb
00bacbd8	eor w3,w3,w2, ROR #0x16
00bacbdc	eor w6,w6,w20, ROR #0x19
00bacbe0	add w15,w15,w7
00bacbe4	add w18,w3,w18
00bacbe8	add w15,w15,w6
00bacbec	eor w3,w20,w14
00bacbf0	add w6,w15,w1
00bacbf4	add w15,w15,w18
00bacbf8	str w6,[sp, #0x110]
00bacbfc	str w15,[sp, #0x120]
00bacc00	and w18,w6,w3
00bacc04	add w5,w5,w14
00bacc08	eor w14,w18,w14
00bacc0c	ldur w18,[x11, #-0x4]
00bacc10	ror w1,w15,#0x2
00bacc14	orr w7,w15,w2
00bacc18	and w3,w15,w2
00bacc1c	eor w1,w1,w15, ROR #0xd
00bacc20	and w7,w7,w16
00bacc24	add w18,w4,w18
00bacc28	ror w4,w6,#0x6
00bacc2c	orr w3,w7,w3
00bacc30	eor w1,w1,w15, ROR #0x16
00bacc34	add w14,w18,w14
00bacc38	eor w18,w4,w6, ROR #0xb
00bacc3c	add w1,w1,w3
00bacc40	ldp w7,w3,[x13]
00bacc44	eor w18,w18,w6, ROR #0x19
00bacc48	add w14,w14,w18
00bacc4c	eor w21,w6,w20
00bacc50	add w18,w14,w17
00bacc54	add w14,w14,w1
00bacc58	and w17,w18,w21
00bacc5c	add w7,w7,w20
00bacc60	eor w17,w17,w20
00bacc64	orr w20,w14,w15
00bacc68	str w18,[sp, #0x10c]
00bacc6c	str w14,[sp, #0x11c]
00bacc70	and w4,w14,w15
00bacc74	and w20,w20,w2
00bacc78	orr w4,w20,w4
00bacc7c	ldr w20,[x11]
00bacc80	ror w1,w14,#0x2
00bacc84	eor w1,w1,w14, ROR #0xd
00bacc88	eor w1,w1,w14, ROR #0x16
00bacc8c	add w4,w1,w4
00bacc90	add w1,w3,w6
00bacc94	add w3,w5,w20
00bacc98	ror w5,w18,#0x6
00bacc9c	eor w5,w5,w18, ROR #0xb
00bacca0	add w17,w3,w17
00bacca4	eor w5,w5,w18, ROR #0x19
00bacca8	add w5,w17,w5
00baccac	eor w3,w18,w6
00baccb0	add w17,w5,w16
00baccb4	add w16,w5,w4
00baccb8	and w3,w17,w3
00baccbc	eor w3,w3,w6
00baccc0	orr w6,w16,w14
00baccc4	str w17,[sp, #0x108]
00baccc8	str w16,[sp, #0x118]
00bacccc	and w5,w16,w14
00baccd0	and w6,w6,w15
00baccd4	orr w5,w6,w5
00baccd8	ldr w6,[x11, #0x4]
00baccdc	ror w4,w16,#0x2
00bacce0	eor w4,w4,w16, ROR #0xd
00bacce4	eor w4,w4,w16, ROR #0x16
00bacce8	add w6,w7,w6
00baccec	add w3,w6,w3
00baccf0	ror w6,w17,#0x6
00baccf4	eor w6,w6,w17, ROR #0xb
00baccf8	add w4,w4,w5
00baccfc	ldp w5,w7,[x13, #0x8]
00bacd00	eor w6,w6,w17, ROR #0x19
00bacd04	add w3,w3,w6
00bacd08	eor w6,w17,w18
00bacd0c	add w2,w3,w2
00bacd10	add w3,w3,w4
00bacd14	and w4,w2,w6
00bacd18	add w5,w5,w18
00bacd1c	eor w18,w4,w18
00bacd20	orr w4,w3,w16
00bacd24	and w6,w3,w16
00bacd28	and w4,w4,w14
00bacd2c	orr w4,w4,w6
00bacd30	ror w6,w3,#0x2
00bacd34	eor w6,w6,w3, ROR #0xd
00bacd38	str w2,[sp, #0x124]
00bacd3c	str w3,[sp, #0x114]
00bacd40	eor w6,w6,w3, ROR #0x16
00bacd44	add w4,w6,w4
00bacd48	ldr w6,[x11, #0x8]
00bacd4c	eor w20,w2,w17
00bacd50	add w7,w7,w17
00bacd54	add x10,x10,#0x8
00bacd58	add w1,w1,w6
00bacd5c	ror w6,w2,#0x6
00bacd60	add w18,w1,w18
00bacd64	eor w1,w6,w2, ROR #0xb
00bacd68	eor w1,w1,w2, ROR #0x19
00bacd6c	add w18,w18,w1
00bacd70	add w15,w18,w15
00bacd74	add w1,w18,w4
00bacd78	and w18,w15,w20
00bacd7c	eor w17,w18,w17
00bacd80	orr w18,w1,w3
00bacd84	str w15,[sp, #0x120]
00bacd88	str w1,[sp, #0x110]
00bacd8c	and w6,w1,w3
00bacd90	and w18,w18,w16
00bacd94	ror w4,w1,#0x2
00bacd98	orr w18,w18,w6
00bacd9c	ldr w6,[x11, #0xc]
00bacda0	eor w4,w4,w1, ROR #0xd
00bacda4	eor w4,w4,w1, ROR #0x16
00bacda8	add w4,w4,w18
00bacdac	ror w18,w15,#0x6
00bacdb0	add w5,w5,w6
00bacdb4	eor w18,w18,w15, ROR #0xb
00bacdb8	eor w18,w18,w15, ROR #0x19
00bacdbc	add w17,w5,w17
00bacdc0	add w17,w17,w18
00bacdc4	eor w6,w15,w2
00bacdc8	add w18,w17,w14
00bacdcc	add w17,w17,w4
00bacdd0	and w4,w18,w6
00bacdd4	str w18,[sp, #0x11c]
00bacdd8	str w17,[sp, #0x10c]
00bacddc	eor w4,w4,w2
00bacde0	orr w2,w17,w1
00bacde4	and w2,w2,w3
00bacde8	ldr w3,[x11, #0x10]
00bacdec	ror w14,w18,#0x6
00bacdf0	ror w5,w17,#0x2
00bacdf4	and w6,w17,w1
00bacdf8	eor w14,w14,w18, ROR #0xb
00bacdfc	eor w5,w5,w17, ROR #0xd
00bace00	add w3,w7,w3
00bace04	eor w14,w14,w18, ROR #0x19
00bace08	eor w5,w5,w17, ROR #0x16
00bace0c	orr w2,w2,w6
00bace10	add w3,w3,w4
00bace14	add w2,w5,w2
00bace18	add w3,w3,w14
00bace1c	add x13,x13,#0x20
00bace20	cmp x10,#0x10
00bace24	add w14,w3,w16
00bace28	add w16,w3,w2
00bace2c	add x11,x11,#0x20
00bace30	str w14,[sp, #0x118]
00bace34	str w16,[sp, #0x108]
00bace38	b.cc 0x00bacb30
00bace3c	mov x11,sp
00bace40	add x10,x12,#0x5c
00bace44	add x11,x11,#0x34
00bace48	orr w12,wzr,#0x18
00bace4c	stp w3,w2,[sp]
00bace50	b 0x00bace68
00bace54	ldr w15,[sp, #0x120]
00bace58	ldr w18,[sp, #0x11c]
00bace5c	add x12,x12,#0x8
00bace60	add x10,x10,#0x20
00bace64	add x11,x11,#0x20
00bace68	ror w16,w14,#0x6
00bace6c	eor w17,w18,w15
00bace70	ldr w18,[x11, #0xc]
00bace74	ldur w1,[x11, #-0x8]
00bace78	ldp w2,w3,[x11, #-0x2c]
00bace7c	eor w16,w16,w14, ROR #0xb
00bace80	and w17,w17,w14
00bace84	ldr w13,[sp, #0x124]
00bace88	eor w14,w16,w14, ROR #0x19
00bace8c	eor w15,w17,w15
00bace90	ldp w16,w17,[x10, #-0x1c]
00bace94	add w1,w2,w1
00bace98	ror w2,w18,#0x13
00bace9c	eor w2,w2,w18, LSR #0xa
00bacea0	add w13,w16,w13
00bacea4	ror w16,w3,#0x12
00bacea8	eor w16,w16,w3, LSR #0x3
00baceac	add w13,w13,w14
00baceb0	eor w14,w2,w18, ROR #0x11
00baceb4	eor w16,w16,w3, ROR #0x7
00baceb8	add w14,w1,w14
00bacebc	add w14,w14,w16
00bacec0	add w13,w13,w15
00bacec4	str w14,[x11, #0x14]
00bacec8	add w13,w13,w14
00bacecc	ldr w14,[sp, #0x108]
00baced0	ldr w15,[sp, #0x10c]
00baced4	ldr w16,[sp, #0x110]
00baced8	ldr w18,[sp, #0x114]
00bacedc	ror w1,w14,#0x2
00bacee0	and w2,w15,w14
00bacee4	orr w15,w15,w14
00bacee8	eor w1,w1,w14, ROR #0xd
00baceec	and w15,w16,w15
00bacef0	eor w14,w1,w14, ROR #0x16
00bacef4	orr w15,w15,w2
00bacef8	add w14,w14,w15
00bacefc	add w18,w18,w13
00bacf00	add w13,w14,w13
00bacf04	str w13,[sp, #0x124]
00bacf08	ldr w13,[sp, #0x120]
00bacf0c	ror w16,w18,#0x6
00bacf10	eor w16,w16,w18, ROR #0xb
00bacf14	str w18,[sp, #0x114]
00bacf18	eor w15,w16,w18, ROR #0x19
00bacf1c	ldr w14,[sp, #0x11c]
00bacf20	ldr w16,[sp, #0x118]
00bacf24	ldr w1,[x11, #0x10]
00bacf28	ldur w2,[x11, #-0x4]
00bacf2c	add w13,w15,w13
00bacf30	ldp w3,w15,[x11, #-0x28]
00bacf34	eor w16,w16,w14
00bacf38	and w16,w16,w18
00bacf3c	eor w14,w16,w14
00bacf40	add w2,w3,w2
00bacf44	ror w3,w1,#0x13
00bacf48	ror w18,w15,#0x12
00bacf4c	eor w3,w3,w1, LSR #0xa
00bacf50	eor w18,w18,w15, LSR #0x3
00bacf54	eor w16,w3,w1, ROR #0x11
00bacf58	add w13,w13,w17
00bacf5c	eor w15,w18,w15, ROR #0x7
00bacf60	add w16,w2,w16
00bacf64	add w13,w13,w14
00bacf68	add w14,w16,w15
00bacf6c	str w14,[x11, #0x18]
00bacf70	add w13,w13,w14
00bacf74	ldr w14,[sp, #0x124]
00bacf78	ldr w15,[sp, #0x108]
00bacf7c	ldr w16,[sp, #0x10c]
00bacf80	ldr w17,[sp, #0x110]
00bacf84	ror w18,w14,#0x2
00bacf88	and w1,w15,w14
00bacf8c	orr w15,w15,w14
00bacf90	eor w18,w18,w14, ROR #0xd
00bacf94	and w15,w16,w15
00bacf98	eor w14,w18,w14, ROR #0x16
00bacf9c	orr w15,w15,w1
00bacfa0	add w14,w14,w15
00bacfa4	add w17,w17,w13
00bacfa8	add w13,w14,w13
00bacfac	str w17,[sp, #0x110]
00bacfb0	str w13,[sp, #0x120]
00bacfb4	ror w16,w17,#0x6
00bacfb8	ldr w13,[sp, #0x11c]
00bacfbc	ldr w18,[x11]
00bacfc0	ldp w1,w3,[x11, #-0x24]
00bacfc4	eor w16,w16,w17, ROR #0xb
00bacfc8	eor w15,w16,w17, ROR #0x19
00bacfcc	ldr w14,[sp, #0x118]
00bacfd0	ldr w16,[sp, #0x114]
00bacfd4	ldr w2,[x11, #0x14]
00bacfd8	add w13,w15,w13
00bacfdc	add w15,w1,w18
00bacfe0	ldp w18,w1,[x10, #-0x14]
00bacfe4	eor w16,w16,w14
00bacfe8	and w16,w16,w17
00bacfec	ror w17,w2,#0x13
00bacff0	add w13,w13,w18
00bacff4	ror w18,w3,#0x12
00bacff8	eor w17,w17,w2, LSR #0xa
00bacffc	eor w18,w18,w3, LSR #0x3
00bad000	eor w14,w16,w14
00bad004	eor w16,w17,w2, ROR #0x11
00bad008	eor w17,w18,w3, ROR #0x7
00bad00c	add w15,w15,w16
00bad010	add w13,w13,w14
00bad014	add w14,w15,w17
00bad018	str w14,[x11, #0x1c]
00bad01c	add w13,w13,w14
00bad020	ldr w14,[sp, #0x120]
00bad024	ldr w15,[sp, #0x124]
00bad028	ldr w16,[sp, #0x108]
00bad02c	ldr w17,[sp, #0x10c]
00bad030	ror w18,w14,#0x2
00bad034	and w2,w15,w14
00bad038	orr w15,w15,w14
00bad03c	eor w18,w18,w14, ROR #0xd
00bad040	and w15,w16,w15
00bad044	eor w14,w18,w14, ROR #0x16
00bad048	orr w15,w15,w2
00bad04c	add w14,w14,w15
00bad050	add w17,w17,w13
00bad054	add w13,w14,w13
00bad058	str w13,[sp, #0x11c]
00bad05c	ldr w13,[sp, #0x118]
00bad060	ror w16,w17,#0x6
00bad064	eor w16,w16,w17, ROR #0xb
00bad068	str w17,[sp, #0x10c]
00bad06c	eor w15,w16,w17, ROR #0x19
00bad070	ldr w14,[sp, #0x114]
00bad074	ldr w16,[sp, #0x110]
00bad078	ldr w18,[x11, #0x18]
00bad07c	ldr w2,[x11, #0x4]
00bad080	add w13,w15,w13
00bad084	ldp w3,w15,[x11, #-0x20]
00bad088	eor w16,w16,w14
00bad08c	and w16,w16,w17
00bad090	eor w14,w16,w14
00bad094	add w2,w3,w2
00bad098	ror w3,w18,#0x13
00bad09c	ror w17,w15,#0x12
00bad0a0	eor w3,w3,w18, LSR #0xa
00bad0a4	eor w17,w17,w15, LSR #0x3
00bad0a8	eor w16,w3,w18, ROR #0x11
00bad0ac	add w13,w13,w1
00bad0b0	eor w15,w17,w15, ROR #0x7
00bad0b4	add w16,w2,w16
00bad0b8	add w13,w13,w14
00bad0bc	add w14,w16,w15
00bad0c0	str w14,[x11, #0x20]
00bad0c4	add w13,w13,w14
00bad0c8	ldr w14,[sp, #0x11c]
00bad0cc	ldr w15,[sp, #0x120]
00bad0d0	ldr w16,[sp, #0x124]
00bad0d4	ldr w17,[sp, #0x108]
00bad0d8	ror w18,w14,#0x2
00bad0dc	and w1,w15,w14
00bad0e0	orr w15,w15,w14
00bad0e4	eor w18,w18,w14, ROR #0xd
00bad0e8	and w15,w16,w15
00bad0ec	eor w14,w18,w14, ROR #0x16
00bad0f0	orr w15,w15,w1
00bad0f4	add w14,w14,w15
00bad0f8	add w17,w17,w13
00bad0fc	add w13,w14,w13
00bad100	str w17,[sp, #0x108]
00bad104	str w13,[sp, #0x118]
00bad108	ror w16,w17,#0x6
00bad10c	ldr w13,[sp, #0x114]
00bad110	ldr w18,[x11, #0x8]
00bad114	ldp w1,w3,[x11, #-0x1c]
00bad118	eor w16,w16,w17, ROR #0xb
00bad11c	eor w15,w16,w17, ROR #0x19
00bad120	ldr w14,[sp, #0x110]
00bad124	ldr w16,[sp, #0x10c]
00bad128	ldr w2,[x11, #0x1c]
00bad12c	add w13,w15,w13
00bad130	add w15,w1,w18
00bad134	ldp w18,w1,[x10, #-0xc]
00bad138	eor w16,w16,w14
00bad13c	and w16,w16,w17
00bad140	ror w17,w2,#0x13
00bad144	add w13,w13,w18
00bad148	ror w18,w3,#0x12
00bad14c	eor w17,w17,w2, LSR #0xa
00bad150	eor w18,w18,w3, LSR #0x3
00bad154	eor w14,w16,w14
00bad158	eor w16,w17,w2, ROR #0x11
00bad15c	eor w17,w18,w3, ROR #0x7
00bad160	add w15,w15,w16
00bad164	add w13,w13,w14
00bad168	add w14,w15,w17
00bad16c	str w14,[x11, #0x24]
00bad170	add w13,w13,w14
00bad174	ldr w14,[sp, #0x118]
00bad178	ldr w15,[sp, #0x11c]
00bad17c	ldr w16,[sp, #0x120]
00bad180	ldr w17,[sp, #0x124]
00bad184	ror w18,w14,#0x2
00bad188	and w2,w15,w14
00bad18c	orr w15,w15,w14
00bad190	eor w18,w18,w14, ROR #0xd
00bad194	and w15,w16,w15
00bad198	eor w14,w18,w14, ROR #0x16
00bad19c	orr w15,w15,w2
00bad1a0	add w14,w14,w15
00bad1a4	add w17,w17,w13
00bad1a8	add w13,w14,w13
00bad1ac	ror w16,w17,#0x6
00bad1b0	str w13,[sp, #0x114]
00bad1b4	ldr w13,[sp, #0x110]
00bad1b8	eor w16,w16,w17, ROR #0xb
00bad1bc	str w17,[sp, #0x124]
00bad1c0	eor w15,w16,w17, ROR #0x19
00bad1c4	ldr w14,[sp, #0x10c]
00bad1c8	ldr w16,[sp, #0x108]
00bad1cc	ldr w3,[x11, #0x20]
00bad1d0	add w13,w15,w13
00bad1d4	ldp w2,w15,[x11, #-0x18]
00bad1d8	ldr w18,[x11, #0xc]
00bad1dc	eor w16,w16,w14
00bad1e0	and w16,w16,w17
00bad1e4	ror w17,w3,#0x13
00bad1e8	add w13,w13,w1
00bad1ec	ror w1,w15,#0x12
00bad1f0	eor w17,w17,w3, LSR #0xa
00bad1f4	add w18,w2,w18
00bad1f8	eor w1,w1,w15, LSR #0x3
00bad1fc	eor w14,w16,w14
00bad200	eor w16,w17,w3, ROR #0x11
00bad204	eor w15,w1,w15, ROR #0x7
00bad208	add w16,w18,w16
00bad20c	add w13,w13,w14
00bad210	add w14,w16,w15
00bad214	str w14,[x11, #0x28]
00bad218	add w13,w13,w14
00bad21c	ldr w14,[sp, #0x114]
00bad220	ldr w15,[sp, #0x118]
00bad224	ldr w16,[sp, #0x11c]
00bad228	ldr w17,[sp, #0x120]
00bad22c	ror w18,w14,#0x2
00bad230	and w1,w15,w14
00bad234	orr w15,w15,w14
00bad238	eor w18,w18,w14, ROR #0xd
00bad23c	and w15,w16,w15
00bad240	eor w14,w18,w14, ROR #0x16
00bad244	orr w15,w15,w1
00bad248	add w14,w14,w15
00bad24c	add w17,w17,w13
00bad250	add w13,w14,w13
00bad254	str w13,[sp, #0x110]
00bad258	ldr w13,[sp, #0x10c]
00bad25c	ror w16,w17,#0x6
00bad260	eor w16,w16,w17, ROR #0xb
00bad264	str w17,[sp, #0x120]
00bad268	eor w15,w16,w17, ROR #0x19
00bad26c	ldr w18,[x11, #0x10]
00bad270	add w13,w15,w13
00bad274	ldp w1,w15,[x11, #-0x14]
00bad278	ldr w14,[sp, #0x108]
00bad27c	ldr w16,[sp, #0x124]
00bad280	ldr w2,[x11, #0x24]
00bad284	add w18,w1,w18
00bad288	ldur w1,[x10, #-0x4]
00bad28c	eor w16,w16,w14
00bad290	and w16,w16,w17
00bad294	ror w17,w2,#0x13
00bad298	add w13,w13,w1
00bad29c	ror w1,w15,#0x12
00bad2a0	eor w17,w17,w2, LSR #0xa
00bad2a4	eor w1,w1,w15, LSR #0x3
00bad2a8	eor w14,w16,w14
00bad2ac	eor w16,w17,w2, ROR #0x11
00bad2b0	eor w15,w1,w15, ROR #0x7
00bad2b4	add w16,w18,w16
00bad2b8	add w13,w13,w14
00bad2bc	add w14,w16,w15
00bad2c0	str w14,[x11, #0x2c]
00bad2c4	add w13,w13,w14
00bad2c8	ldr w14,[sp, #0x110]
00bad2cc	ldr w15,[sp, #0x114]
00bad2d0	ldr w16,[sp, #0x118]
00bad2d4	ldr w17,[sp, #0x11c]
00bad2d8	ror w18,w14,#0x2
00bad2dc	and w1,w15,w14
00bad2e0	orr w15,w15,w14
00bad2e4	eor w18,w18,w14, ROR #0xd
00bad2e8	and w15,w16,w15
00bad2ec	eor w14,w18,w14, ROR #0x16
00bad2f0	orr w15,w15,w1
00bad2f4	add w14,w14,w15
00bad2f8	add w17,w17,w13
00bad2fc	add w13,w14,w13
00bad300	str w13,[sp, #0x10c]
00bad304	ldr w13,[sp, #0x108]
00bad308	ror w16,w17,#0x6
00bad30c	eor w16,w16,w17, ROR #0xb
00bad310	str w17,[sp, #0x11c]
00bad314	eor w15,w16,w17, ROR #0x19
00bad318	ldr w18,[x11, #0x14]
00bad31c	add w13,w15,w13
00bad320	ldp w1,w15,[x11, #-0x10]
00bad324	ldr w14,[sp, #0x124]
00bad328	ldr w16,[sp, #0x120]
00bad32c	ldr w2,[x11, #0x28]
00bad330	add w18,w1,w18
00bad334	ldr w1,[x10]
00bad338	eor w16,w16,w14
00bad33c	and w16,w16,w17
00bad340	ror w17,w2,#0x13
00bad344	add w13,w13,w1
00bad348	ror w1,w15,#0x12
00bad34c	eor w17,w17,w2, LSR #0xa
00bad350	eor w1,w1,w15, LSR #0x3
00bad354	eor w14,w16,w14
00bad358	eor w16,w17,w2, ROR #0x11
00bad35c	eor w15,w1,w15, ROR #0x7
00bad360	add w16,w18,w16
00bad364	add w15,w16,w15
00bad368	str w15,[x11, #0x30]
00bad36c	ldr d0,[x9]
00bad370	add w13,w13,w14
00bad374	add w13,w13,w15
00bad378	ldr w15,[sp, #0x114]
00bad37c	fmov w16,s0
00bad380	ror w17,w16,#0x2
00bad384	mov w18,v0.S[0x1]
00bad388	ldr w14,[sp, #0x118]
00bad38c	eor w17,w17,w16, ROR #0xd
00bad390	and w1,w18,w16
00bad394	orr w18,w18,w16
00bad398	eor w16,w17,w16, ROR #0x16
00bad39c	and w17,w15,w18
00bad3a0	orr w17,w17,w1
00bad3a4	add w17,w16,w17
00bad3a8	add w14,w14,w13
00bad3ac	add w16,w17,w13
00bad3b0	cmp x12,#0x3f
00bad3b4	str w14,[sp, #0x118]
00bad3b8	str w16,[sp, #0x108]
00bad3bc	b.ls 0x00bace54
00bad3c0	stp w13,w17,[sp]
00bad3c4	ldr w9,[x0, #0x48]
00bad3c8	ldur d1,[x0, #0x4c]
00bad3cc	ldp w10,w11,[x0, #0x54]
00bad3d0	mov w1,#0x128
00bad3d4	add w9,w9,w16
00bad3d8	add v0.2S,v1.2S,v0.2S
00bad3dc	add w10,w10,w15
00bad3e0	add w11,w11,w14
00bad3e4	str w9,[x0, #0x48]
00bad3e8	stur d0,[x0, #0x4c]
00bad3ec	stp w10,w11,[x0, #0x54]
00bad3f0	ldur d1,[x0, #0x5c]
00bad3f4	ldr d0,[x8]
00bad3f8	ldr w9,[x0, #0x64]
00bad3fc	add v0.2S,v1.2S,v0.2S
00bad400	stur d0,[x0, #0x5c]
00bad404	ldr w8,[sp, #0x124]
00bad408	add w8,w9,w8
00bad40c	str w8,[x0, #0x64]
00bad410	mov x0,sp
00bad414	bl 0x00c42220
00bad418	ldr x8,[x19, #0x28]
00bad41c	ldur x9,[x29, #-0x28]
00bad420	cmp x8,x9
00bad424	b.ne 0x00bad440
00bad428	ldp x29,x30,[sp, #0x150]
00bad42c	ldp x20,x19,[sp, #0x140]
00bad430	ldp x28,x21,[sp, #0x130]
00bad434	mov w0,wzr
00bad438	add sp,sp,#0x160
00bad43c	ret
00bad440	bl 0x00c2fec0
