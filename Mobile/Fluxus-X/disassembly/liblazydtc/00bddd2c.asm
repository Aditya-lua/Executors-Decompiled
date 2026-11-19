; FUN_00bddd2c @ 00bddd2c
00bddd2c	paciasp
00bddd30	sub sp,sp,#0x1b0
00bddd34	stp x29,x30,[sp, #0x150]
00bddd38	stp x28,x27,[sp, #0x160]
00bddd3c	stp x26,x25,[sp, #0x170]
00bddd40	stp x24,x23,[sp, #0x180]
00bddd44	stp x22,x21,[sp, #0x190]
00bddd48	stp x20,x19,[sp, #0x1a0]
00bddd4c	add x29,sp,#0x150
00bddd50	mov x0,x3
00bddd54	mov x21,x2
00bddd58	mov x19,x1
00bddd5c	sub x8,x29,#0x48
00bddd60	sub x1,x29,#0x24
00bddd64	sub x2,x29,#0x28
00bddd68	sub x3,x29,#0x2c
00bddd6c	stp x5,x4,[sp, #0x20]
00bddd70	sub x25,x29,#0x68
00bddd74	bl 0x00c44100
00bddd78	stp xzr,xzr,[x25, #0x8]
00bddd7c	str xzr,[x25, #0x18]
00bddd80	sub x0,x29,#0x60
00bddd84	mov w1,#0x16
00bddd88	mov w2,wzr
00bddd8c	sub x20,x29,#0x60
00bddd90	bl 0x00c30250
00bddd94	ldurb w8,[x29, #-0x60]
00bddd98	ldr x9,[x25, #0x18]
00bddd9c	mov w26,wzr
00bddda0	add x27,sp,#0x48
00bddda4	mov w10,#0x1
00bddda8	orr x28,x20,#0x1
00bdddac	tst w8,#0x1
00bdddb0	mov w8,#0x45
00bdddb4	add x22,sp,#0x3c
00bdddb8	csinc x23,x9,x20,ne
00bdddbc	add x20,sp,#0x40
00bdddc0	str wzr,[sp, #0x3c]
00bdddc4	str x27,[sp, #0x40]
00bdddc8	strb w10,[sp, #0x38]
00bdddcc	strb w8,[sp, #0x34]
00bdddd0	str x23,[x25]
00bdddd4	b 0x00bddde0
00bdddd8	add x8,x8,#0x1
00bddddc	str x8,[x19, #0x18]
00bddde0	cbz x19,0x00bdde0c
00bddde4	ldp x8,x9,[x19, #0x18]
00bddde8	cmp x8,x9
00bdddec	b.eq 0x00bdde1c
00bdddf0	mov w24,wzr
00bdddf4	cbz x21,0x00bdde14
00bdddf8	ldp x8,x9,[x21, #0x18]
00bdddfc	cmp x8,x9
00bdde00	b.eq 0x00bdde40
00bdde04	tbnz w24,#0x0,0x00bdde64
00bdde08	b 0x00bde038
00bdde0c	mov w24,#0x1
00bdde10	cbnz x21,0x00bdddf8
00bdde14	tbz w24,#0x0,0x00bdde64
00bdde18	b 0x00bde038
00bdde1c	ldr x8,[x19]
00bdde20	ldr x8,[x8, #0x48]
00bdde24	mov x0,x19
00bdde28	blr x8
00bdde2c	cmn w0,#0x1
00bdde30	cset w24,eq
00bdde34	csel x19,xzr,x19,eq
00bdde38	cbnz x21,0x00bdddf8
00bdde3c	b 0x00bdde14
00bdde40	ldr x8,[x21]
00bdde44	ldr x8,[x8, #0x48]
00bdde48	mov x0,x21
00bdde4c	blr x8
00bdde50	cmn w0,#0x1
00bdde54	cset w8,eq
00bdde58	csel x21,xzr,x21,eq
00bdde5c	cmp w24,w8
00bdde60	b.eq 0x00bde038
00bdde64	ldurb w8,[x29, #-0x60]
00bdde68	ldr x9,[x25, #0x10]
00bdde6c	ldr x11,[x25]
00bdde70	lsr x10,x8,#0x1
00bdde74	tst w8,#0x1
00bdde78	csel x24,x10,x9,eq
00bdde7c	add x9,x23,x24
00bdde80	cmp x11,x9
00bdde84	b.ne 0x00bddf40
00bdde88	cmp x24,#0x1
00bdde8c	b.lt 0x00bddea4
00bdde90	sub x0,x29,#0x60
00bdde94	mov x1,x24
00bdde98	mov w2,wzr
00bdde9c	bl 0x00c30250
00bddea0	b 0x00bddec8
00bddea4	lsl x9,x24,#0x1
00bddea8	tbnz w8,#0x0,0x00bddebc
00bddeac	lsl w8,w9,#0x1
00bddeb0	sturb w8,[x29, #-0x60]
00bddeb4	mov x8,x28
00bddeb8	b 0x00bddec4
00bddebc	ldr x8,[x25, #0x18]
00bddec0	str x9,[x25, #0x10]
00bddec4	strb wzr,[x8, x9]
00bddec8	ldp x9,x10,[x25, #0x8]
00bddecc	ldurb w8,[x29, #-0x60]
00bdded0	tst w8,#0x1
00bdded4	mov w8,#0x16
00bdded8	and x11,x9,#-0x2
00bddedc	ubfx x12,x9,#0x1,#0x7
00bddee0	sub x11,x11,#0x1
00bddee4	csel x8,x8,x11,eq
00bddee8	tst x9,#0x1
00bddeec	csel x10,x12,x10,eq
00bddef0	subs x1,x8,x10
00bddef4	b.ls 0x00bddf08
00bddef8	sub x0,x29,#0x60
00bddefc	mov w2,wzr
00bddf00	bl 0x00c30250
00bddf04	b 0x00bddf28
00bddf08	tbnz w9,#0x0,0x00bddf1c
00bddf0c	lsl w9,w8,#0x1
00bddf10	sturb w9,[x29, #-0x60]
00bddf14	mov x9,x28
00bddf18	b 0x00bddf24
00bddf1c	ldr x9,[x25, #0x18]
00bddf20	str x8,[x25, #0x10]
00bddf24	strb wzr,[x9, x8]
00bddf28	ldurb w8,[x29, #-0x60]
00bddf2c	ldr x9,[x25, #0x18]
00bddf30	tst w8,#0x1
00bddf34	csel x23,x28,x9,eq
00bddf38	add x8,x23,x24
00bddf3c	str x8,[x25]
00bddf40	ldp x8,x9,[x19, #0x18]
00bddf44	cmp x8,x9
00bddf48	b.eq 0x00bddf54
00bddf4c	ldrb w0,[x8]
00bddf50	b 0x00bddf64
00bddf54	ldr x8,[x19]
00bddf58	ldr x8,[x8, #0x48]
00bddf5c	mov x0,x19
00bddf60	blr x8
00bddf64	ldurb w6,[x29, #-0x2c]
00bddf68	ldurb w5,[x29, #-0x28]
00bddf6c	add x1,sp,#0x38
00bddf70	sub x8,x29,#0x24
00bddf74	add x2,sp,#0x34
00bddf78	sub x4,x29,#0x68
00bddf7c	sub x7,x29,#0x48
00bddf80	mov x3,x23
00bddf84	stp x22,x8,[sp, #0x10]
00bddf88	stp x27,x20,[sp]
00bddf8c	bl 0x00c44110
00bddf90	cbnz w0,0x00bde038
00bddf94	tbz w26,#0x0,0x00bddfa0
00bddf98	mov w26,#0x1
00bddf9c	b 0x00bde000
00bddfa0	ldr x8,[x25]
00bddfa4	sub x9,x8,x23
00bddfa8	cmp x9,#0x1
00bddfac	b.lt 0x00bddffc
00bddfb0	ldrb w8,[x23]
00bddfb4	cmp w8,#0x2b
00bddfb8	b.eq 0x00bddfc4
00bddfbc	cmp w8,#0x2d
00bddfc0	b.ne 0x00bde020
00bddfc4	cmp x9,#0x1
00bddfc8	b.eq 0x00bddffc
00bddfcc	cmp w8,#0x2d
00bddfd0	b.eq 0x00bddfdc
00bddfd4	cmp w8,#0x2b
00bddfd8	b.ne 0x00bddffc
00bddfdc	ldrb w8,[x23, #0x1]
00bddfe0	mov w26,#0x1
00bddfe4	cmp w8,#0x2e
00bddfe8	b.eq 0x00bde000
00bddfec	sub w8,w8,#0x30
00bddff0	cmp w8,#0x9
00bddff4	b.ls 0x00bde000
00bddff8	b 0x00bde038
00bddffc	mov w26,wzr
00bde000	ldp x8,x9,[x19, #0x18]
00bde004	cmp x8,x9
00bde008	b.ne 0x00bdddd8
00bde00c	ldr x8,[x19]
00bde010	ldr x8,[x8, #0x50]
00bde014	mov x0,x19
00bde018	blr x8
00bde01c	b 0x00bddde0
00bde020	cmp w8,#0x2e
00bde024	mov w26,#0x1
00bde028	b.eq 0x00bde000
00bde02c	sub w8,w8,#0x30
00bde030	cmp w8,#0xa
00bde034	b.cc 0x00bde000
00bde038	ldurb w8,[x29, #-0x48]
00bde03c	ldr x9,[x25, #0x28]
00bde040	ldr x22,[sp, #0x28]
00bde044	lsr x10,x8,#0x1
00bde048	tst w8,#0x1
00bde04c	csel x8,x10,x9,eq
00bde050	cbz x8,0x00bde080
00bde054	ldrb w8,[sp, #0x38]
00bde058	cmp w8,#0x1
00bde05c	b.ne 0x00bde080
00bde060	ldr x8,[sp, #0x40]
00bde064	add x9,sp,#0x48
00bde068	sub x9,x8,x9
00bde06c	cmp x9,#0x9f
00bde070	b.gt 0x00bde080
00bde074	ldr w9,[sp, #0x3c]
00bde078	str w9,[x8], #0x4
00bde07c	str x8,[sp, #0x40]
00bde080	ldr x1,[x25]
00bde084	mov x0,x23
00bde088	mov x2,x22
00bde08c	bl 0x00c0c96c
00bde090	ldurb w10,[x29, #-0x48]
00bde094	ldr x12,[sp, #0x40]
00bde098	add x11,sp,#0x48
00bde09c	ldr x8,[x25, #0x28]
00bde0a0	lsr x9,x10,#0x1
00bde0a4	ands w13,w10,#0x1
00bde0a8	sub x11,x12,x11
00bde0ac	csel x8,x9,x8,eq
00bde0b0	ldr x9,[sp, #0x20]
00bde0b4	cmp x11,#0x5
00bde0b8	str q0,[x9]
00bde0bc	b.lt 0x00bde21c
00bde0c0	cbz x8,0x00bde21c
00bde0c4	sub x8,x12,#0x4
00bde0c8	add x9,sp,#0x48
00bde0cc	cmp x9,x8
00bde0d0	cset w11,cc
00bde0d4	cmp x9,x12
00bde0d8	b.eq 0x00bde188
00bde0dc	cbz w11,0x00bde188
00bde0e0	add x10,sp,#0x48
00bde0e4	sub x14,x12,#0x8
00bde0e8	add x11,x10,#0x4
00bde0ec	cmp x14,x11
00bde0f0	csel x13,x14,x11,hi
00bde0f4	sub x13,x13,#0x4
00bde0f8	cmp x13,x10
00bde0fc	cinc x15,x10,ne
00bde100	cmp x13,x10
00bde104	sub x15,x13,x15
00bde108	lsr x15,x15,#0x3
00bde10c	cinc x13,x15,ne
00bde110	cmp x13,#0x13
00bde114	b.cc 0x00bde15c
00bde118	cmp x14,x11
00bde11c	csel x14,x14,x11,hi
00bde120	sub x14,x14,#0x4
00bde124	cmp x14,x10
00bde128	cinc x15,x10,ne
00bde12c	cmp x14,x10
00bde130	sub x15,x14,x15
00bde134	lsr x15,x15,#0x3
00bde138	cinc x14,x15,ne
00bde13c	cmp x10,x12
00bde140	b.cs 0x00bde300
00bde144	lsl x14,x14,#0x2
00bde148	sub x15,x12,x14
00bde14c	add x11,x11,x14
00bde150	sub x14,x15,#0x4
00bde154	cmp x14,x11
00bde158	b.cs 0x00bde300
00bde15c	mov x11,x8
00bde160	add x10,x10,#0x4
00bde164	ldr w12,[x11]
00bde168	ldur w13,[x10, #-0x4]
00bde16c	stur w12,[x10, #-0x4]
00bde170	str w13,[x11], #-0x4
00bde174	cmp x10,x11
00bde178	add x10,x10,#0x4
00bde17c	b.cc 0x00bde164
00bde180	ldurb w10,[x29, #-0x48]
00bde184	and w13,w10,#0x1
00bde188	ldr x11,[x25, #0x30]
00bde18c	cmp w13,#0x0
00bde190	sub x12,x29,#0x48
00bde194	csinc x11,x11,x12,ne
00bde198	cmp x9,x8
00bde19c	b.cs 0x00bde1f4
00bde1a0	lsr w9,w10,#0x1
00bde1a4	ldr x10,[x25, #0x28]
00bde1a8	cmp w13,#0x0
00bde1ac	csel x9,x9,x10,eq
00bde1b0	add x10,sp,#0x48
00bde1b4	add x9,x11,x9
00bde1b8	b 0x00bde1d4
00bde1bc	sub x12,x9,x11
00bde1c0	add x10,x10,#0x4
00bde1c4	cmp x12,#0x1
00bde1c8	cinc x11,x11,gt
00bde1cc	cmp x10,x8
00bde1d0	b.cs 0x00bde1f4
00bde1d4	ldrb w12,[x11]
00bde1d8	cbz w12,0x00bde1bc
00bde1dc	cmp w12,#0xff
00bde1e0	b.eq 0x00bde1bc
00bde1e4	ldr w13,[x10]
00bde1e8	cmp w13,w12
00bde1ec	b.eq 0x00bde1bc
00bde1f0	b 0x00bde214
00bde1f4	ldrb w9,[x11]
00bde1f8	cbz w9,0x00bde21c
00bde1fc	cmp w9,#0xff
00bde200	b.eq 0x00bde21c
00bde204	ldr w8,[x8]
00bde208	sub w8,w8,#0x1
00bde20c	cmp w8,w9
00bde210	b.cc 0x00bde21c
00bde214	mov w8,#0x4
00bde218	str w8,[x22]
00bde21c	cbz x19,0x00bde2a8
00bde220	ldp x8,x9,[x19, #0x18]
00bde224	cmp x8,x9
00bde228	b.eq 0x00bde2b8
00bde22c	mov w20,wzr
00bde230	cbz x21,0x00bde2b0
00bde234	ldp x8,x9,[x21, #0x18]
00bde238	cmp x8,x9
00bde23c	b.eq 0x00bde2dc
00bde240	tbnz w20,#0x0,0x00bde250
00bde244	ldr w8,[x22]
00bde248	orr w8,w8,#0x2
00bde24c	str w8,[x22]
00bde250	ldurb w8,[x29, #-0x60]
00bde254	tbz w8,#0x0,0x00bde268
00bde258	ldr x8,[x25, #0x8]
00bde25c	ldr x0,[x25, #0x18]
00bde260	and x1,x8,#-0x2
00bde264	bl 0x00c2fe80
00bde268	ldurb w8,[x29, #-0x48]
00bde26c	tbz w8,#0x0,0x00bde280
00bde270	ldr x8,[x25, #0x20]
00bde274	ldr x0,[x25, #0x30]
00bde278	and x1,x8,#-0x2
00bde27c	bl 0x00c2fe80
00bde280	mov x0,x19
00bde284	ldp x20,x19,[sp, #0x1a0]
00bde288	ldp x22,x21,[sp, #0x190]
00bde28c	ldp x24,x23,[sp, #0x180]
00bde290	ldp x26,x25,[sp, #0x170]
00bde294	ldp x28,x27,[sp, #0x160]
00bde298	ldp x29,x30,[sp, #0x150]
00bde29c	add sp,sp,#0x1b0
00bde2a0	autiasp
00bde2a4	ret
00bde2a8	mov w20,#0x1
00bde2ac	cbnz x21,0x00bde234
00bde2b0	tbnz w20,#0x0,0x00bde244
00bde2b4	b 0x00bde250
00bde2b8	ldr x8,[x19]
00bde2bc	ldr x8,[x8, #0x48]
00bde2c0	mov x0,x19
00bde2c4	blr x8
00bde2c8	cmn w0,#0x1
00bde2cc	cset w20,eq
00bde2d0	csel x19,xzr,x19,eq
00bde2d4	cbnz x21,0x00bde234
00bde2d8	b 0x00bde2b0
00bde2dc	ldr x8,[x21]
00bde2e0	ldr x8,[x8, #0x48]
00bde2e4	mov x0,x21
00bde2e8	blr x8
00bde2ec	cmn w0,#0x1
00bde2f0	cset w8,eq
00bde2f4	eor w8,w20,w8
00bde2f8	tbz w8,#0x0,0x00bde244
00bde2fc	b 0x00bde250
00bde300	add x13,x13,#0x1
00bde304	add x15,sp,#0x48
00bde308	sub x12,x12,#0x10
00bde30c	and x14,x13,#0x7ffffffffffffff8
00bde310	lsl x10,x14,#0x2
00bde314	mov x16,x14
00bde318	sub x11,x8,x10
00bde31c	add x10,x15,x10
00bde320	add x15,x15,#0x10
00bde324	ldp q1,q0,[x12, #-0x10]
00bde328	sub x16,x16,#0x8
00bde32c	ldp q2,q3,[x15, #-0x10]
00bde330	rev64 v0.4S,v0.4S
00bde334	rev64 v1.4S,v1.4S
00bde338	rev64 v2.4S,v2.4S
00bde33c	rev64 v3.4S,v3.4S
00bde340	ext v0.16B,v0.16B,v0.16B,0x8
00bde344	ext v1.16B,v1.16B,v1.16B,0x8
00bde348	ext v2.16B,v2.16B,v2.16B,0x8
00bde34c	ext v3.16B,v3.16B,v3.16B,0x8
00bde350	stp q0,q1,[x15, #-0x10]
00bde354	add x15,x15,#0x20
00bde358	stp q3,q2,[x12, #-0x10]
00bde35c	sub x12,x12,#0x20
00bde360	cbnz x16,0x00bde324
00bde364	cmp x13,x14
00bde368	b.eq 0x00bde180
00bde36c	b 0x00bde160
