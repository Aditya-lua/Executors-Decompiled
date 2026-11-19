; FUN_008b9ff8 @ 008b9ff8
008b9ff8	stp x29,x30,[sp, #-0x50]!
008b9ffc	str x25,[sp, #0x10]
008ba000	stp x24,x23,[sp, #0x20]
008ba004	stp x22,x21,[sp, #0x30]
008ba008	stp x20,x19,[sp, #0x40]
008ba00c	mov x29,sp
008ba010	adrp x8,0xd1f000
008ba014	mov x19,x2
008ba018	mov x20,x1
008ba01c	ldrb w8,[x8, #0xbd8]
008ba020	mov x21,x0
008ba024	cmp w8,#0x1
008ba028	b.ne 0x008ba0b4
008ba02c	ldr x25,[x21, #0x60]
008ba030	subs x8,x19,#0x20
008ba034	b.cc 0x008ba138
008ba038	orr x9,xzr,#-0x5555555555555556
008ba03c	mov w10,wzr
008ba040	mov w11,wzr
008ba044	movk x9,#0xaaab
008ba048	mov w22,w19
008ba04c	mov x12,x20
008ba050	umulh x8,x8,x9
008ba054	lsr x8,x8,#0x3
008ba058	add x8,x8,x8, LSL #0x1
008ba05c	lsl x9,x8,#0x2
008ba060	mov x8,x19
008ba064	ldp w15,w13,[x12, #0x4]
008ba068	ldr w14,[x12], #0xc
008ba06c	sub x8,x8,#0xc
008ba070	cmp x8,#0x1f
008ba074	add w13,w13,w22
008ba078	add w11,w14,w11
008ba07c	add w10,w15,w10
008ba080	ror w14,w13,#0xe
008ba084	eor w11,w13,w11
008ba088	sub w11,w11,w14
008ba08c	ror w14,w11,#0xb
008ba090	eor w10,w11,w10
008ba094	sub w10,w10,w14
008ba098	ror w14,w10,#0x19
008ba09c	eor w13,w10,w13
008ba0a0	sub w22,w13,w14
008ba0a4	b.hi 0x008ba064
008ba0a8	add x9,x20,x9
008ba0ac	add x9,x9,#0xb
008ba0b0	b 0x008ba148
008ba0b4	subs x8,x19,#0x20
008ba0b8	b.cc 0x008ba1d0
008ba0bc	orr x9,xzr,#-0x5555555555555556
008ba0c0	mov w10,wzr
008ba0c4	mov w11,wzr
008ba0c8	movk x9,#0xaaab
008ba0cc	mov w22,w19
008ba0d0	mov x12,x20
008ba0d4	umulh x8,x8,x9
008ba0d8	lsr x8,x8,#0x3
008ba0dc	add x8,x8,x8, LSL #0x1
008ba0e0	lsl x9,x8,#0x2
008ba0e4	mov x8,x19
008ba0e8	ldp w15,w13,[x12, #0x4]
008ba0ec	ldr w14,[x12], #0xc
008ba0f0	sub x8,x8,#0xc
008ba0f4	cmp x8,#0x1f
008ba0f8	add w13,w13,w22
008ba0fc	add w11,w14,w11
008ba100	add w10,w15,w10
008ba104	ror w14,w13,#0xe
008ba108	eor w11,w13,w11
008ba10c	sub w11,w11,w14
008ba110	ror w14,w11,#0xb
008ba114	eor w10,w11,w10
008ba118	sub w10,w10,w14
008ba11c	ror w14,w10,#0x19
008ba120	eor w13,w10,w13
008ba124	sub w22,w13,w14
008ba128	b.hi 0x008ba0e8
008ba12c	add x9,x20,x9
008ba130	add x9,x9,#0xb
008ba134	b 0x008ba1e0
008ba138	cbz x19,0x008ba2b0
008ba13c	sub x9,x20,#0x1
008ba140	mov w22,w19
008ba144	mov x8,x19
008ba148	lsl w10,w22,#0x5
008ba14c	ldrb w11,[x9, x8]
008ba150	subs x8,x8,#0x1
008ba154	add w10,w10,w22, LSR #0x2
008ba158	add w10,w10,w11
008ba15c	eor w22,w10,w22
008ba160	b.ne 0x008ba148
008ba164	ldr w8,[x25, #0x28]
008ba168	ldr w9,[x25, #0x30]
008ba16c	madd w24,w8,w22,w9
008ba170	ldrb w8,[x25, #0x44]
008ba174	ldr x9,[x25, #0x38]
008ba178	lsr w8,w24,w8
008ba17c	ldr x23,[x9, w8, SXTW #0x3]
008ba180	cbnz x23,0x008ba1a4
008ba184	mov x0,x21
008ba188	mov x1,x20
008ba18c	mov x2,x19
008ba190	mov w3,w22
008ba194	mov w4,w24
008ba198	b 0x008ba22c
008ba19c	ldr x23,[x23, #0x8]
008ba1a0	cbz x23,0x008ba184
008ba1a4	ldr w8,[x23, #0x14]
008ba1a8	cmp x19,x8
008ba1ac	b.ne 0x008ba19c
008ba1b0	add x1,x23,#0x18
008ba1b4	mov x0,x20
008ba1b8	mov x2,x19
008ba1bc	bl 0x00c300b0
008ba1c0	cbnz w0,0x008ba19c
008ba1c4	ldrb w8,[x23, #0x2]
008ba1c8	ldrb w9,[x25, #0x2]
008ba1cc	b 0x008ba274
008ba1d0	cbz x19,0x008ba2b8
008ba1d4	sub x9,x20,#0x1
008ba1d8	mov w22,w19
008ba1dc	mov x8,x19
008ba1e0	lsl w10,w22,#0x5
008ba1e4	ldrb w11,[x9, x8]
008ba1e8	subs x8,x8,#0x1
008ba1ec	add w10,w10,w22, LSR #0x2
008ba1f0	add w10,w10,w11
008ba1f4	eor w22,w10,w22
008ba1f8	b.ne 0x008ba1e0
008ba1fc	ldr x24,[x21, #0x60]
008ba200	ldr w8,[x24, #0x2c]
008ba204	ldr x9,[x24, #0x38]
008ba208	sub w8,w8,#0x1
008ba20c	and w8,w8,w22
008ba210	ldr x23,[x9, w8, SXTW #0x3]
008ba214	cbnz x23,0x008ba24c
008ba218	mov x0,x21
008ba21c	mov x1,x20
008ba220	mov x2,x19
008ba224	mov w3,w22
008ba228	mov w4,wzr
008ba22c	ldp x20,x19,[sp, #0x40]
008ba230	ldr x25,[sp, #0x10]
008ba234	ldp x22,x21,[sp, #0x30]
008ba238	ldp x24,x23,[sp, #0x20]
008ba23c	ldp x29,x30,[sp], #0x50
008ba240	b 0x008ba2c0
008ba244	ldr x23,[x23, #0x8]
008ba248	cbz x23,0x008ba218
008ba24c	ldr w8,[x23, #0x14]
008ba250	cmp x19,x8
008ba254	b.ne 0x008ba244
008ba258	add x1,x23,#0x18
008ba25c	mov x0,x20
008ba260	mov x2,x19
008ba264	bl 0x00c300b0
008ba268	cbnz w0,0x008ba244
008ba26c	ldrb w8,[x23, #0x2]
008ba270	ldrb w9,[x24, #0x2]
008ba274	mov w10,#0xb
008ba278	and w9,w9,#0x3
008ba27c	and w10,w8,w10
008ba280	eor w9,w9,w10
008ba284	cmp w9,#0x3
008ba288	b.ne 0x008ba294
008ba28c	eor w8,w8,#0x3
008ba290	strb w8,[x23, #0x2]
008ba294	mov x0,x23
008ba298	ldp x20,x19,[sp, #0x40]
008ba29c	ldr x25,[sp, #0x10]
008ba2a0	ldp x22,x21,[sp, #0x30]
008ba2a4	ldp x24,x23,[sp, #0x20]
008ba2a8	ldp x29,x30,[sp], #0x50
008ba2ac	ret
008ba2b0	mov w22,wzr
008ba2b4	b 0x008ba164
008ba2b8	mov w22,wzr
008ba2bc	b 0x008ba1fc
008ba2c0	stp x29,x30,[sp, #-0x50]!
008ba2c4	str x25,[sp, #0x10]
008ba2c8	stp x24,x23,[sp, #0x20]
008ba2cc	stp x22,x21,[sp, #0x30]
008ba2d0	stp x20,x19,[sp, #0x40]
008ba2d4	mov x29,sp
008ba2d8	mov w8,#0x1
008ba2dc	mov x19,x0
008ba2e0	movk w8,#0x4000, LSL #16
008ba2e4	cmp x2,x8
008ba2e8	b.cs 0x008ba3e4
008ba2ec	mov x23,x2
008ba2f0	ldrb w2,[x19, #0x4]
008ba2f4	mov w21,w4
008ba2f8	mov w22,w3
008ba2fc	mov x24,x1
008ba300	add x1,x23,#0x19
008ba304	mov x0,x19
008ba308	mov w3,#0x5
008ba30c	mov w4,wzr
008ba310	mov w25,#0x5
008ba314	bl 0x008b78d0
008ba318	ldr x8,[x19, #0x60]
008ba31c	ldrb w9,[x19, #0x4]
008ba320	mov w10,#0x8000ffff
008ba324	strb w25,[x0]
008ba328	add x25,x0,#0x18
008ba32c	mov x20,x0
008ba330	ldrb w8,[x8, #0x2]
008ba334	strb w9,[x0, #0x1]
008ba338	mov x1,x24
008ba33c	str w10,[x0, #0x4]
008ba340	mov x2,x23
008ba344	and w8,w8,#0x3
008ba348	stp w22,w23,[x0, #0x10]
008ba34c	strb w8,[x0, #0x2]
008ba350	mov x0,x25
008ba354	bl 0x00c2ffd0
008ba358	strb wzr,[x25, x23]
008ba35c	adrp x9,0xd1f000
008ba360	ldr x8,[x19, #0x60]
008ba364	ldrb w9,[x9, #0xbd8]
008ba368	ldr x10,[x8, #0x38]
008ba36c	cmp w9,#0x1
008ba370	b.ne 0x008ba384
008ba374	ldrb w9,[x8, #0x44]
008ba378	lsr w11,w21,w9
008ba37c	ldr w9,[x8, #0x2c]
008ba380	b 0x008ba390
008ba384	ldr w9,[x8, #0x2c]
008ba388	sub w11,w9,#0x1
008ba38c	and w11,w11,w22
008ba390	ldr x12,[x10, w11, UXTW #0x3]
008ba394	str x12,[x20, #0x8]
008ba398	str x20,[x10, w11, UXTW #0x3]
008ba39c	ldr w10,[x8, #0x40]
008ba3a0	add w10,w10,#0x1
008ba3a4	cmp w10,w9
008ba3a8	str w10,[x8, #0x40]
008ba3ac	b.ls 0x008ba3c8
008ba3b0	mov w8,#0x3fffffff
008ba3b4	cmp w9,w8
008ba3b8	b.gt 0x008ba3c8
008ba3bc	lsl w1,w9,#0x1
008ba3c0	mov x0,x19
008ba3c4	bl 0x008b9b8c
008ba3c8	mov x0,x20
008ba3cc	ldp x20,x19,[sp, #0x40]
008ba3d0	ldr x25,[sp, #0x10]
008ba3d4	ldp x22,x21,[sp, #0x30]
008ba3d8	ldp x24,x23,[sp, #0x20]
008ba3dc	ldp x29,x30,[sp], #0x50
008ba3e0	ret
008ba3e4	mov x0,x19
008ba3e8	bl 0x008b75fc
