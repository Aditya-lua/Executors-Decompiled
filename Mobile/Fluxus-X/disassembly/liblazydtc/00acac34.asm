; RC2_cbc_encrypt @ 00acac34
00acac34	sub sp,sp,#0x90
00acac38	stp x28,x27,[sp, #0x30]
00acac3c	stp x26,x25,[sp, #0x40]
00acac40	stp x24,x23,[sp, #0x50]
00acac44	stp x22,x21,[sp, #0x60]
00acac48	stp x20,x19,[sp, #0x70]
00acac4c	stp x29,x30,[sp, #0x80]
00acac50	ldrb w24,[x4]
00acac54	ldrb w8,[x4, #0x1]
00acac58	ldrb w25,[x4, #0x4]
00acac5c	ldrb w10,[x4, #0x5]
00acac60	ldrb w9,[x4, #0x2]
00acac64	bfm x24,x8,#0x38,#0x7
00acac68	ldrb w8,[x4, #0x6]
00acac6c	ldrb w11,[x4, #0x3]
00acac70	bfm x25,x10,#0x38,#0x7
00acac74	ldrb w10,[x4, #0x7]
00acac78	bfm x24,x9,#0x30,#0x7
00acac7c	bfm x25,x8,#0x30,#0x7
00acac80	mov x19,x4
00acac84	mov x21,x3
00acac88	mov x23,x2
00acac8c	mov x28,x1
00acac90	mov x22,x0
00acac94	bfm x24,x11,#0x28,#0x7
00acac98	bfm x25,x10,#0x28,#0x7
00acac9c	add x29,sp,#0x80
00acaca0	cbz w5,0x00acae4c
00acaca4	subs x27,x23,#0x8
00acaca8	b.lt 0x00acad88
00acacac	mvn x8,x23
00acacb0	orr x9,xzr,#-0x10
00acacb4	cmn x8,#0x10
00acacb8	csinv x8,x9,x23,le
00acacbc	add x8,x8,x23
00acacc0	add x8,x8,#0x8
00acacc4	and x26,x8,#-0x8
00acacc8	add x20,x26,#0x8
00acaccc	add x8,x22,x20
00acacd0	add x23,x23,#0x8
00acacd4	stp x8,x28,[sp, #0x10]
00acacd8	ldrb w8,[x22]
00acacdc	ldrb w9,[x22, #0x1]
00acace0	ldrb w11,[x22, #0x4]
00acace4	ldrb w12,[x22, #0x5]
00acace8	ldrb w10,[x22, #0x2]
00acacec	bfm x8,x9,#0x38,#0x7
00acacf0	ldrb w9,[x22, #0x6]
00acacf4	ldrb w13,[x22, #0x3]
00acacf8	bfm x11,x12,#0x38,#0x7
00acacfc	ldrb w12,[x22, #0x7]
00acad00	bfm x8,x10,#0x30,#0x7
00acad04	bfm x11,x9,#0x30,#0x7
00acad08	bfm x8,x13,#0x28,#0x7
00acad0c	bfm x11,x12,#0x28,#0x7
00acad10	eor x8,x8,x24
00acad14	eor x9,x11,x25
00acad18	add x0,sp,#0x20
00acad1c	mov x1,x21
00acad20	stp x8,x9,[sp, #0x20]
00acad24	bl 0x00acb06c
00acad28	ldr x24,[sp, #0x20]
00acad2c	sub x23,x23,#0x8
00acad30	add x22,x22,#0x8
00acad34	cmp x23,#0xf
00acad38	lsr x8,x24,#0x8
00acad3c	lsr x9,x24,#0x10
00acad40	strb w8,[x28, #0x1]
00acad44	lsr x8,x24,#0x18
00acad48	strb w24,[x28]
00acad4c	strb w9,[x28, #0x2]
00acad50	strb w8,[x28, #0x3]
00acad54	ldr x25,[sp, #0x28]
00acad58	lsr x8,x25,#0x8
00acad5c	strb w8,[x28, #0x5]
00acad60	lsr x8,x25,#0x10
00acad64	strb w8,[x28, #0x6]
00acad68	lsr x8,x25,#0x18
00acad6c	strb w25,[x28, #0x4]
00acad70	strb w8,[x28, #0x7]
00acad74	add x28,x28,#0x8
00acad78	b.gt 0x00acacd8
00acad7c	ldp x22,x28,[sp, #0x10]
00acad80	sub x23,x27,x26
00acad84	add x28,x28,x20
00acad88	cbz x23,0x00acb004
00acad8c	sub x9,x23,#0x1
00acad90	cmp x9,#0x6
00acad94	mov x8,xzr
00acad98	b.hi 0x00acb064
00acad9c	adrp x10,0x774000
00acada0	add x10,x10,#0x774
00acada4	ldrsw x9,[x10, x9, LSL #0x2]
00acada8	add x11,x9,x10
00acadac	add x9,x22,x23
00acadb0	mov x10,x8
00acadb4	br x11
00acadb8	ldrb w8,[x9, #-0x1]!
00acadbc	lsl x8,x8,#0x10
00acadc0	ldrb w10,[x9, #-0x1]!
00acadc4	orr x8,x8,x10, LSL #0x8
00acadc8	ldrb w10,[x9, #-0x1]!
00acadcc	orr x8,x8,x10
00acadd0	ldrb w11,[x9, #-0x1]!
00acadd4	mov x10,x8
00acadd8	lsl x8,x11,#0x18
00acaddc	ldrb w11,[x9, #-0x1]!
00acade0	orr x8,x8,x11, LSL #0x10
00acade4	ldrb w11,[x9, #-0x1]!
00acade8	orr x8,x8,x11, LSL #0x8
00acadec	ldurb w9,[x9, #-0x1]
00acadf0	orr x8,x8,x9
00acadf4	eor x8,x8,x24
00acadf8	eor x9,x10,x25
00acadfc	add x0,sp,#0x20
00acae00	mov x1,x21
00acae04	stp x8,x9,[sp, #0x20]
00acae08	bl 0x00acb06c
00acae0c	ldp x22,x27,[sp, #0x20]
00acae10	lsr x8,x22,#0x8
00acae14	strb w8,[x28, #0x1]
00acae18	lsr x8,x22,#0x18
00acae1c	strb w8,[x28, #0x3]
00acae20	lsr x8,x27,#0x8
00acae24	strb w8,[x28, #0x5]
00acae28	lsr x8,x27,#0x10
00acae2c	lsr x9,x22,#0x10
00acae30	strb w8,[x28, #0x6]
00acae34	lsr x8,x27,#0x18
00acae38	strb w22,[x28]
00acae3c	strb w9,[x28, #0x2]
00acae40	strb w27,[x28, #0x4]
00acae44	strb w8,[x28, #0x7]
00acae48	b 0x00acb00c
00acae4c	subs x8,x23,#0x8
00acae50	b.lt 0x00acaffc
00acae54	stp x8,x28,[sp, #0x10]
00acae58	mvn x8,x23
00acae5c	orr x9,xzr,#-0x10
00acae60	cmn x8,#0x10
00acae64	csinv x8,x9,x23,le
00acae68	add x8,x8,x23
00acae6c	add x8,x8,#0x8
00acae70	and x8,x8,#-0x8
00acae74	str x8,[sp, #0x8]
00acae78	add x8,x8,#0x8
00acae7c	add x26,x22,x8
00acae80	add x23,x23,#0x8
00acae84	mov x20,x28
00acae88	str x8,[sp]
00acae8c	mov x28,x24
00acae90	ldrb w24,[x22]
00acae94	ldrb w8,[x22, #0x1]
00acae98	ldrb w9,[x22, #0x2]
00acae9c	ldrb w10,[x22, #0x3]
00acaea0	mov x27,x25
00acaea4	bfm x24,x8,#0x38,#0x7
00acaea8	bfm x24,x9,#0x30,#0x7
00acaeac	bfm x24,x10,#0x28,#0x7
00acaeb0	str x24,[sp, #0x20]
00acaeb4	ldrb w25,[x22, #0x4]
00acaeb8	ldrb w8,[x22, #0x5]
00acaebc	ldrb w9,[x22, #0x6]
00acaec0	ldrb w10,[x22, #0x7]
00acaec4	add x0,sp,#0x20
00acaec8	bfm x25,x8,#0x38,#0x7
00acaecc	bfm x25,x9,#0x30,#0x7
00acaed0	bfm x25,x10,#0x28,#0x7
00acaed4	mov x1,x21
00acaed8	str x25,[sp, #0x28]
00acaedc	bl 0x00acb180
00acaee0	ldp x8,x9,[sp, #0x20]
00acaee4	sub x23,x23,#0x8
00acaee8	add x22,x22,#0x8
00acaeec	cmp x23,#0xf
00acaef0	eor x8,x8,x28
00acaef4	lsr x10,x8,#0x8
00acaef8	eor x9,x9,x27
00acaefc	strb w8,[x20]
00acaf00	strb w10,[x20, #0x1]
00acaf04	lsr x10,x8,#0x10
00acaf08	lsr x8,x8,#0x18
00acaf0c	strb w9,[x20, #0x4]
00acaf10	strb w10,[x20, #0x2]
00acaf14	lsr x10,x9,#0x8
00acaf18	strb w8,[x20, #0x3]
00acaf1c	lsr x8,x9,#0x10
00acaf20	lsr x9,x9,#0x18
00acaf24	strb w10,[x20, #0x5]
00acaf28	strb w8,[x20, #0x6]
00acaf2c	strb w9,[x20, #0x7]
00acaf30	add x20,x20,#0x8
00acaf34	b.gt 0x00acae8c
00acaf38	ldp x9,x8,[sp, #0x8]
00acaf3c	ldr x28,[sp, #0x18]
00acaf40	sub x23,x8,x9
00acaf44	ldr x8,[sp]
00acaf48	add x28,x28,x8
00acaf4c	cbz x23,0x00acb004
00acaf50	ldrb w22,[x26]
00acaf54	ldrb w8,[x26, #0x1]
00acaf58	ldrb w9,[x26, #0x2]
00acaf5c	ldrb w10,[x26, #0x3]
00acaf60	ldrb w27,[x26, #0x4]
00acaf64	bfm x22,x8,#0x38,#0x7
00acaf68	ldrb w8,[x26, #0x5]
00acaf6c	bfm x22,x9,#0x30,#0x7
00acaf70	ldrb w9,[x26, #0x6]
00acaf74	bfm x22,x10,#0x28,#0x7
00acaf78	ldrb w10,[x26, #0x7]
00acaf7c	bfm x27,x8,#0x38,#0x7
00acaf80	bfm x27,x9,#0x30,#0x7
00acaf84	add x0,sp,#0x20
00acaf88	bfm x27,x10,#0x28,#0x7
00acaf8c	mov x1,x21
00acaf90	stp x22,x27,[sp, #0x20]
00acaf94	bl 0x00acb180
00acaf98	sub x8,x23,#0x1
00acaf9c	cmp x8,#0x6
00acafa0	b.hi 0x00acb00c
00acafa4	adrp x11,0x774000
00acafa8	add x11,x11,#0x790
00acafac	ldrsw x12,[x11, x8, LSL #0x2]
00acafb0	ldp x9,x10,[sp, #0x20]
00acafb4	add x11,x12,x11
00acafb8	eor x8,x9,x24
00acafbc	eor x10,x10,x25
00acafc0	add x9,x28,x23
00acafc4	br x11
00acafc8	lsr x11,x10,#0x10
00acafcc	strb w11,[x9, #-0x1]!
00acafd0	lsr x11,x10,#0x8
00acafd4	strb w11,[x9, #-0x1]!
00acafd8	strb w10,[x9, #-0x1]!
00acafdc	lsr x10,x8,#0x18
00acafe0	strb w10,[x9, #-0x1]!
00acafe4	lsr x10,x8,#0x10
00acafe8	strb w10,[x9, #-0x1]!
00acafec	lsr x10,x8,#0x8
00acaff0	strb w10,[x9, #-0x1]!
00acaff4	sturb w8,[x9, #-0x1]
00acaff8	b 0x00acb00c
00acaffc	mov x26,x22
00acb000	cbnz x23,0x00acaf50
00acb004	mov x22,x24
00acb008	mov x27,x25
00acb00c	lsr x8,x22,#0x8
00acb010	lsr x9,x22,#0x10
00acb014	lsr x10,x22,#0x18
00acb018	lsr x11,x27,#0x8
00acb01c	lsr x12,x27,#0x10
00acb020	lsr x13,x27,#0x18
00acb024	strb w22,[x19]
00acb028	strb w27,[x19, #0x4]
00acb02c	strb w8,[x19, #0x1]
00acb030	strb w9,[x19, #0x2]
00acb034	strb w10,[x19, #0x3]
00acb038	strb w11,[x19, #0x5]
00acb03c	strb w12,[x19, #0x6]
00acb040	strb w13,[x19, #0x7]
00acb044	ldp x29,x30,[sp, #0x80]
00acb048	ldp x20,x19,[sp, #0x70]
00acb04c	ldp x22,x21,[sp, #0x60]
00acb050	ldp x24,x23,[sp, #0x50]
00acb054	ldp x26,x25,[sp, #0x40]
00acb058	ldp x28,x27,[sp, #0x30]
00acb05c	add sp,sp,#0x90
00acb060	ret
00acb064	mov x10,x8
00acb068	b 0x00acadf4
