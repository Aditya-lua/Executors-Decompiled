; ASN1_mbstring_ncopy @ 009edd6c
009edd6c	sub sp,sp,#0x70
009edd70	stp x26,x25,[sp, #0x20]
009edd74	stp x24,x23,[sp, #0x30]
009edd78	stp x22,x21,[sp, #0x40]
009edd7c	stp x20,x19,[sp, #0x50]
009edd80	mov x22,x6
009edd84	mov x23,x5
009edd88	mov x25,x4
009edd8c	mov w20,w3
009edd90	mov w21,w2
009edd94	mov x19,x1
009edd98	mov x24,x0
009edd9c	cmn w2,#0x1
009edda0	stp x28,x27,[sp, #0x10]
009edda4	stp x29,x30,[sp, #0x60]
009edda8	add x29,sp,#0x60
009eddac	str x4,[sp]
009eddb0	b.eq 0x009eddc0
009eddb4	cbz x25,0x009eddd0
009eddb8	tbz w21,#0x1f,0x009edddc
009eddbc	b 0x009ee2dc
009eddc0	mov x0,x19
009eddc4	bl 0x00c2ff50
009eddc8	mov x21,x0
009eddcc	cbnz x25,0x009eddb8
009eddd0	mov w8,#0x2806
009eddd4	str x8,[sp]
009eddd8	tbnz w21,#0x1f,0x009ee2dc
009edddc	sub w8,w20,#0x1, LSL #12
009edde0	cmp w8,#0x4
009edde4	b.hi 0x009ede64
009edde8	adrp x9,0x74d000
009eddec	add x9,x9,#0xe94
009eddf0	ldrsw x8,[x9, x8, LSL #0x2]
009eddf4	mov w27,w21
009eddf8	add x8,x8,x9
009eddfc	br x8
009ede00	cbz w21,0x009edf0c
009ede04	mov w27,wzr
009ede08	mov w28,#0xd800
009ede0c	mov x25,x19
009ede10	mov w26,w21
009ede14	add x2,sp,#0x8
009ede18	mov x0,x25
009ede1c	mov w1,w26
009ede20	bl 0x00c37820
009ede24	tbnz w0,#0x1f,0x009edee4
009ede28	ldr x8,[sp, #0x8]
009ede2c	lsr x9,x8,#0x10
009ede30	cmp x9,#0x10
009ede34	b.hi 0x009edee4
009ede38	and x8,x8,#-0x800
009ede3c	cmp x8,x28
009ede40	b.eq 0x009edee4
009ede44	sub w26,w26,w0
009ede48	add x25,x25,w0, SXTW 
009ede4c	add w27,w27,#0x1
009ede50	cbnz w26,0x009ede14
009ede54	b 0x009edf18
009ede58	tbnz w21,#0x0,0x009edebc
009ede5c	lsr w27,w21,#0x1
009ede60	b 0x009edf18
009ede64	bl 0x00c342a0
009ede68	adrp x0,0x2a5000
009ede6c	adrp x2,0x2cf000
009ede70	add x0,x0,#0xc01
009ede74	add x2,x2,#0x8c3
009ede78	mov w1,#0x5f
009ede7c	bl 0x00c342b0
009ede80	mov w0,#0xd
009ede84	mov w1,#0xa0
009ede88	b 0x009ee2d4
009ede8c	tst w21,#0x3
009ede90	b.eq 0x009edf14
009ede94	bl 0x00c342a0
009ede98	adrp x0,0x2a5000
009ede9c	adrp x2,0x2cf000
009edea0	add x0,x0,#0xc01
009edea4	add x2,x2,#0x8c3
009edea8	mov w1,#0x4a
009edeac	bl 0x00c342b0
009edeb0	mov w0,#0xd
009edeb4	mov w1,#0x85
009edeb8	b 0x009ee2d4
009edebc	bl 0x00c342a0
009edec0	adrp x0,0x2a5000
009edec4	adrp x2,0x2cf000
009edec8	add x0,x0,#0xc01
009edecc	add x2,x2,#0x8c3
009eded0	mov w1,#0x42
009eded4	bl 0x00c342b0
009eded8	mov w0,#0xd
009ededc	mov w1,#0x81
009edee0	b 0x009ee2d4
009edee4	bl 0x00c342a0
009edee8	adrp x0,0x2a5000
009edeec	adrp x2,0x2cf000
009edef0	add x0,x0,#0xc01
009edef4	add x2,x2,#0x8c3
009edef8	mov w1,#0x55
009edefc	bl 0x00c342b0
009edf00	mov w0,#0xd
009edf04	mov w1,#0x86
009edf08	b 0x009ee2d4
009edf0c	mov w27,wzr
009edf10	b 0x009edf18
009edf14	lsr w27,w21,#0x2
009edf18	cmp x23,#0x1
009edf1c	sxtw x8,w27
009edf20	b.lt 0x009edf60
009edf24	cmp x8,x23
009edf28	b.ge 0x009edf60
009edf2c	bl 0x00c342a0
009edf30	adrp x0,0x2a5000
009edf34	adrp x2,0x2cf000
009edf38	add x0,x0,#0xc01
009edf3c	add x2,x2,#0x8c3
009edf40	mov w1,#0x64
009edf44	bl 0x00c342b0
009edf48	adrp x2,0x2af000
009edf4c	add x2,x2,#0xc26
009edf50	mov w0,#0xd
009edf54	mov w1,#0x98
009edf58	mov x3,x23
009edf5c	b 0x009edfa0
009edf60	cmp x22,#0x1
009edf64	b.lt 0x009edfa8
009edf68	cmp x8,x22
009edf6c	b.le 0x009edfa8
009edf70	bl 0x00c342a0
009edf74	adrp x0,0x2a5000
009edf78	adrp x2,0x2cf000
009edf7c	add x0,x0,#0xc01
009edf80	add x2,x2,#0x8c3
009edf84	mov w1,#0x6a
009edf88	bl 0x00c342b0
009edf8c	adrp x2,0x2cb000
009edf90	add x2,x2,#0x6c2
009edf94	mov w0,#0xd
009edf98	mov w1,#0x97
009edf9c	mov x3,x22
009edfa0	bl 0x00c342c0
009edfa4	b 0x009ee2dc
009edfa8	adrp x3,0x9ee000
009edfac	add x3,x3,#0x438
009edfb0	mov x4,sp
009edfb4	mov x0,x19
009edfb8	mov w1,w21
009edfbc	mov w2,w20
009edfc0	bl 0x009ee304
009edfc4	tbnz w0,#0x1f,0x009edffc
009edfc8	ldr x8,[sp]
009edfcc	tbnz w8,#0x0,0x009ee024
009edfd0	tbnz w8,#0x1,0x009ee034
009edfd4	tbnz w8,#0x4,0x009ee044
009edfd8	tbnz w8,#0x2,0x009ee054
009edfdc	tbnz w8,#0xb,0x009ee064
009edfe0	and x8,x8,#0x100
009edfe4	lsr x9,x8,#0x4
009edfe8	lsr x8,x8,#0x6
009edfec	orr w22,w9,#0xc
009edff0	orr w25,w8,#0x1000
009edff4	cbnz x24,0x009ee070
009edff8	b 0x009ee2e0
009edffc	bl 0x00c342a0
009ee000	adrp x0,0x2a5000
009ee004	adrp x2,0x2cf000
009ee008	add x0,x0,#0xc01
009ee00c	add x2,x2,#0x8c3
009ee010	mov w1,#0x71
009ee014	bl 0x00c342b0
009ee018	mov w0,#0xd
009ee01c	orr w1,wzr,#0x7c
009ee020	b 0x009ee2d4
009ee024	mov w25,#0x1001
009ee028	mov w22,#0x12
009ee02c	cbnz x24,0x009ee070
009ee030	b 0x009ee2e0
009ee034	mov w25,#0x1001
009ee038	mov w22,#0x13
009ee03c	cbnz x24,0x009ee070
009ee040	b 0x009ee2e0
009ee044	mov w25,#0x1001
009ee048	mov w22,#0x16
009ee04c	cbnz x24,0x009ee070
009ee050	b 0x009ee2e0
009ee054	mov w25,#0x1001
009ee058	mov w22,#0x14
009ee05c	cbnz x24,0x009ee070
009ee060	b 0x009ee2e0
009ee064	mov w25,#0x1002
009ee068	orr w22,wzr,#0x1e
009ee06c	cbz x24,0x009ee2e0
009ee070	ldr x23,[x24]
009ee074	cbz x23,0x009ee0d0
009ee078	ldr x0,[x23, #0x8]
009ee07c	adrp x1,0x2a5000
009ee080	add x1,x1,#0xc01
009ee084	mov w2,#0x8e
009ee088	bl 0x00c32310
009ee08c	mov w26,wzr
009ee090	str xzr,[x23, #0x8]
009ee094	stp wzr,w22,[x23]
009ee098	cmp w25,w20
009ee09c	b.ne 0x009ee0f0
009ee0a0	mov x0,x23
009ee0a4	mov x1,x19
009ee0a8	mov w2,w21
009ee0ac	bl 0x00c378a0
009ee0b0	cbnz w0,0x009ee2e0
009ee0b4	bl 0x00c342a0
009ee0b8	adrp x0,0x2a5000
009ee0bc	adrp x2,0x2cf000
009ee0c0	add x0,x0,#0xc01
009ee0c4	add x2,x2,#0x8c3
009ee0c8	mov w1,#0x9e
009ee0cc	b 0x009ee2c4
009ee0d0	mov w0,w22
009ee0d4	bl 0x00c378b0
009ee0d8	cbz x0,0x009ee200
009ee0dc	mov x23,x0
009ee0e0	mov w26,#0x1
009ee0e4	str x0,[x24]
009ee0e8	cmp w25,w20
009ee0ec	b.eq 0x009ee0a0
009ee0f0	and w8,w25,#0x7
009ee0f4	mov x24,xzr
009ee0f8	cmp w8,#0x4
009ee0fc	mov w28,wzr
009ee100	b.hi 0x009ee258
009ee104	adrp x9,0x74d000
009ee108	and x8,x25,#0x7
009ee10c	add x9,x9,#0xea8
009ee110	ldrsw x8,[x9, x8, LSL #0x2]
009ee114	add x8,x8,x9
009ee118	br x8
009ee11c	cbz w21,0x009ee24c
009ee120	mov w28,wzr
009ee124	mov w27,#0x1004
009ee128	mov x25,x19
009ee12c	mov w24,w21
009ee130	cmp w20,w27
009ee134	b.eq 0x009ee160
009ee138	mov w8,#0x1002
009ee13c	cmp w20,w8
009ee140	b.eq 0x009ee19c
009ee144	mov w8,#0x1001
009ee148	cmp w20,w8
009ee14c	b.ne 0x009ee1c0
009ee150	ldrb w2,[x25], #0x1
009ee154	sub w24,w24,#0x1
009ee158	str x2,[sp, #0x8]
009ee15c	b 0x009ee1e0
009ee160	ldrb w8,[x25]
009ee164	sub w24,w24,#0x4
009ee168	lsl x8,x8,#0x18
009ee16c	str x8,[sp, #0x8]
009ee170	ldrb w9,[x25, #0x1]
009ee174	bfm x8,x9,#0x30,#0x7
009ee178	str x8,[sp, #0x8]
009ee17c	ldrb w9,[x25, #0x2]
009ee180	bfm x8,x9,#0x38,#0x7
009ee184	str x8,[sp, #0x8]
009ee188	ldrb w9,[x25, #0x3]
009ee18c	add x25,x25,#0x4
009ee190	orr x2,x8,x9
009ee194	str x2,[sp, #0x8]
009ee198	b 0x009ee1e0
009ee19c	ldrb w8,[x25]
009ee1a0	sub w24,w24,#0x2
009ee1a4	lsl x9,x8,#0x8
009ee1a8	str x9,[sp, #0x8]
009ee1ac	ldrb w2,[x25, #0x1]
009ee1b0	add x25,x25,#0x2
009ee1b4	bfm x2,x8,#0x38,#0x7
009ee1b8	str x2,[sp, #0x8]
009ee1bc	b 0x009ee1e0
009ee1c0	add x2,sp,#0x8
009ee1c4	mov x0,x25
009ee1c8	mov w1,w24
009ee1cc	bl 0x00c37820
009ee1d0	tbnz w0,#0x1f,0x009ee250
009ee1d4	ldr x2,[sp, #0x8]
009ee1d8	sub w24,w24,w0
009ee1dc	add x25,x25,w0, SXTW 
009ee1e0	mov w1,#0xffffffff
009ee1e4	mov x0,xzr
009ee1e8	bl 0x00c37830
009ee1ec	cmp w0,#0x1
009ee1f0	b.lt 0x009ee250
009ee1f4	add w28,w0,w28
009ee1f8	cbnz w24,0x009ee130
009ee1fc	b 0x009ee250
009ee200	bl 0x00c342a0
009ee204	adrp x0,0x2a5000
009ee208	adrp x2,0x2cf000
009ee20c	add x0,x0,#0xc01
009ee210	add x2,x2,#0x8c3
009ee214	mov w1,#0x96
009ee218	b 0x009ee2c4
009ee21c	adrp x24,0x9ee000
009ee220	add x24,x24,#0x520
009ee224	mov w28,w27
009ee228	b 0x009ee258
009ee22c	adrp x24,0x9ee000
009ee230	lsl w28,w27,#0x1
009ee234	add x24,x24,#0x53c
009ee238	b 0x009ee258
009ee23c	adrp x24,0x9ee000
009ee240	lsl w28,w27,#0x2
009ee244	add x24,x24,#0x560
009ee248	b 0x009ee258
009ee24c	mov w28,wzr
009ee250	adrp x24,0x9ee000
009ee254	add x24,x24,#0x594
009ee258	add w8,w28,#0x1
009ee25c	adrp x1,0x2a5000
009ee260	sxtw x0,w8
009ee264	add x1,x1,#0xc01
009ee268	mov w2,#0xbb
009ee26c	bl 0x00c32320
009ee270	str x0,[sp, #0x8]
009ee274	cbz x0,0x009ee2a0
009ee278	str w28,[x23]
009ee27c	str x0,[x23, #0x8]
009ee280	strb wzr,[x0, w28, SXTW ]
009ee284	add x4,sp,#0x8
009ee288	mov x0,x19
009ee28c	mov w1,w21
009ee290	mov w2,w20
009ee294	mov x3,x24
009ee298	bl 0x009ee304
009ee29c	b 0x009ee2e0
009ee2a0	cbz w26,0x009ee2ac
009ee2a4	mov x0,x23
009ee2a8	bl 0x00c37890
009ee2ac	bl 0x00c342a0
009ee2b0	adrp x0,0x2a5000
009ee2b4	adrp x2,0x2cf000
009ee2b8	add x0,x0,#0xc01
009ee2bc	add x2,x2,#0x8c3
009ee2c0	mov w1,#0xbe
009ee2c4	bl 0x00c342b0
009ee2c8	mov w1,#0x100
009ee2cc	mov w0,#0xd
009ee2d0	movk w1,#0xc, LSL #16
009ee2d4	mov x2,xzr
009ee2d8	bl 0x00c342c0
009ee2dc	mov w22,#0xffffffff
009ee2e0	mov w0,w22
009ee2e4	ldp x29,x30,[sp, #0x60]
009ee2e8	ldp x20,x19,[sp, #0x50]
009ee2ec	ldp x22,x21,[sp, #0x40]
009ee2f0	ldp x24,x23,[sp, #0x30]
009ee2f4	ldp x26,x25,[sp, #0x20]
009ee2f8	ldp x28,x27,[sp, #0x10]
009ee2fc	add sp,sp,#0x70
009ee300	ret
