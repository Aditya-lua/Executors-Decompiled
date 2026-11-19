; SipHash_Final @ 00b56160
00b56160	mov w8,wzr
00b56164	cbz x2,0x00b56360
00b56168	ldr w10,[x0, #0x30]
00b5616c	cbz w10,0x00b56360
00b56170	ldr w11,[x0, #0x2c]
00b56174	mov w8,wzr
00b56178	cmp x11,x2
00b5617c	b.ne 0x00b56360
00b56180	ldr w15,[x0, #0x28]
00b56184	ldp x12,x14,[x0]
00b56188	ldp x8,x13,[x0, #0x10]
00b5618c	ldr x9,[x0, #0x20]
00b56190	sub w15,w15,#0x1
00b56194	cmp w15,#0x6
00b56198	lsl x12,x12,#0x38
00b5619c	b.hi 0x00b561ec
00b561a0	adrp x16,0x77c000
00b561a4	add x16,x16,#0x228
00b561a8	ldrsw x15,[x16, x15, LSL #0x2]
00b561ac	add x15,x15,x16
00b561b0	br x15
00b561b4	ldrb w15,[x0, #0x3e]
00b561b8	orr x12,x12,x15, LSL #0x30
00b561bc	ldrb w15,[x0, #0x3d]
00b561c0	orr x12,x12,x15, LSL #0x28
00b561c4	ldrb w15,[x0, #0x3c]
00b561c8	orr x12,x12,x15, LSL #0x20
00b561cc	ldrb w15,[x0, #0x3b]
00b561d0	orr x12,x12,x15, LSL #0x18
00b561d4	ldrb w15,[x0, #0x3a]
00b561d8	orr x12,x12,x15, LSL #0x10
00b561dc	ldrb w15,[x0, #0x39]
00b561e0	orr x12,x12,x15, LSL #0x8
00b561e4	ldrb w15,[x0, #0x38]
00b561e8	orr x12,x12,x15
00b561ec	eor x9,x12,x9
00b561f0	add x14,x8,x14
00b561f4	add x13,x9,x13
00b561f8	eor x8,x14,x8, ROR #0x33
00b561fc	ror x14,x14,#0x20
00b56200	eor x9,x13,x9, ROR #0x30
00b56204	add x14,x9,x14
00b56208	add x13,x13,x8
00b5620c	subs w10,w10,#0x1
00b56210	eor x9,x14,x9, ROR #0x2b
00b56214	eor x8,x13,x8, ROR #0x2f
00b56218	ror x13,x13,#0x20
00b5621c	b.ne 0x00b561f0
00b56220	eor x10,x14,x12
00b56224	ldr w12,[x0, #0x34]
00b56228	cmp w11,#0x10
00b5622c	orr w11,wzr,#0xff
00b56230	mov w14,#0xee
00b56234	csel x11,x14,x11,eq
00b56238	eor x11,x13,x11
00b5623c	cbz w12,0x00b56278
00b56240	mov w13,wzr
00b56244	add x10,x8,x10
00b56248	add x11,x9,x11
00b5624c	eor x8,x10,x8, ROR #0x33
00b56250	ror x10,x10,#0x20
00b56254	eor x9,x11,x9, ROR #0x30
00b56258	add w13,w13,#0x1
00b5625c	add x10,x9,x10
00b56260	add x11,x11,x8
00b56264	cmp w13,w12
00b56268	eor x9,x10,x9, ROR #0x2b
00b5626c	eor x8,x11,x8, ROR #0x2f
00b56270	ror x11,x11,#0x20
00b56274	b.cc 0x00b56244
00b56278	eor x12,x8,x10
00b5627c	eor x12,x12,x11
00b56280	eor x12,x12,x9
00b56284	ubfx x13,x12,#0x8,#0x18
00b56288	strb w13,[x1, #0x1]
00b5628c	ubfx x13,x12,#0x10,#0x10
00b56290	strb w13,[x1, #0x2]
00b56294	ubfx x13,x12,#0x18,#0x8
00b56298	strb w13,[x1, #0x3]
00b5629c	lsr x13,x12,#0x20
00b562a0	strb w13,[x1, #0x4]
00b562a4	lsr x13,x12,#0x28
00b562a8	strb w12,[x1]
00b562ac	strb w13,[x1, #0x5]
00b562b0	lsr x13,x12,#0x30
00b562b4	lsr x12,x12,#0x38
00b562b8	strb w13,[x1, #0x6]
00b562bc	strb w12,[x1, #0x7]
00b562c0	ldr w12,[x0, #0x2c]
00b562c4	cmp w12,#0x8
00b562c8	b.eq 0x00b5635c
00b562cc	ldr w12,[x0, #0x34]
00b562d0	mov w13,#0xdd
00b562d4	eor x8,x8,x13
00b562d8	cbz w12,0x00b56314
00b562dc	mov w13,wzr
00b562e0	add x10,x8,x10
00b562e4	add x11,x9,x11
00b562e8	eor x8,x10,x8, ROR #0x33
00b562ec	ror x10,x10,#0x20
00b562f0	eor x9,x11,x9, ROR #0x30
00b562f4	add w13,w13,#0x1
00b562f8	add x10,x9,x10
00b562fc	add x11,x11,x8
00b56300	cmp w13,w12
00b56304	eor x9,x10,x9, ROR #0x2b
00b56308	eor x8,x11,x8, ROR #0x2f
00b5630c	ror x11,x11,#0x20
00b56310	b.cc 0x00b562e0
00b56314	eor x8,x8,x10
00b56318	eor x8,x8,x11
00b5631c	eor x8,x8,x9
00b56320	ubfx x9,x8,#0x8,#0x18
00b56324	ubfx x10,x8,#0x10,#0x10
00b56328	ubfx x11,x8,#0x18,#0x8
00b5632c	strb w8,[x1, #0x8]
00b56330	strb w9,[x1, #0x9]
00b56334	lsr x9,x8,#0x20
00b56338	strb w10,[x1, #0xa]
00b5633c	lsr x10,x8,#0x28
00b56340	strb w11,[x1, #0xb]
00b56344	lsr x11,x8,#0x30
00b56348	lsr x8,x8,#0x38
00b5634c	strb w9,[x1, #0xc]
00b56350	strb w10,[x1, #0xd]
00b56354	strb w11,[x1, #0xe]
00b56358	strb w8,[x1, #0xf]
00b5635c	mov w8,#0x1
00b56360	mov w0,w8
00b56364	ret
