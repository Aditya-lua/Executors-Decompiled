; FUN_00a45158 @ 00a45158
00a45158	ldp w9,w8,[x1, #0x20]
00a4515c	ldp w13,w14,[x1]
00a45160	ldp w15,w16,[x1, #0x8]
00a45164	ldp w17,w12,[x1, #0x10]
00a45168	ldp w11,w10,[x1, #0x18]
00a4516c	mov w18,#0x13
00a45170	mov w1,#0x1000000
00a45174	madd w1,w8,w18,w1
00a45178	add w1,w13,w1, ASR #0x19
00a4517c	add w1,w14,w1, ASR #0x1a
00a45180	add w1,w15,w1, ASR #0x19
00a45184	add w1,w16,w1, ASR #0x1a
00a45188	add w1,w17,w1, ASR #0x19
00a4518c	add w1,w12,w1, ASR #0x1a
00a45190	add w1,w11,w1, ASR #0x19
00a45194	add w1,w10,w1, ASR #0x1a
00a45198	add w1,w9,w1, ASR #0x19
00a4519c	add w1,w8,w1, ASR #0x1a
00a451a0	asr w1,w1,#0x19
00a451a4	madd w13,w1,w18,w13
00a451a8	add w14,w14,w13, ASR #0x1a
00a451ac	add w15,w15,w14, ASR #0x19
00a451b0	strb w13,[x0]
00a451b4	lsr w18,w13,#0x8
00a451b8	lsr w1,w13,#0x10
00a451bc	lsr w13,w13,#0x18
00a451c0	and w2,w14,#0x1ffffff
00a451c4	add w16,w16,w15, ASR #0x1a
00a451c8	strb w18,[x0, #0x1]
00a451cc	strb w1,[x0, #0x2]
00a451d0	lsr w18,w14,#0x6
00a451d4	lsr w1,w14,#0xe
00a451d8	ubfx w14,w14,#0x16,#0x3
00a451dc	and w3,w15,#0x3ffffff
00a451e0	bfm w13,w2,#0x1e,#0x18
00a451e4	add w17,w17,w16, ASR #0x19
00a451e8	strb w13,[x0, #0x3]
00a451ec	bfm w14,w3,#0x1d,#0x19
00a451f0	lsr w13,w16,#0x3
00a451f4	add w12,w12,w17, ASR #0x1a
00a451f8	strb w18,[x0, #0x4]
00a451fc	strb w1,[x0, #0x5]
00a45200	lsr w18,w15,#0x5
00a45204	lsr w1,w15,#0xd
00a45208	ubfx w15,w15,#0x15,#0x5
00a4520c	and w2,w16,#0x1ffffff
00a45210	strb w14,[x0, #0x6]
00a45214	strb w13,[x0, #0xa]
00a45218	lsr w13,w17,#0x2
00a4521c	lsr w14,w17,#0xa
00a45220	add w11,w11,w12, ASR #0x19
00a45224	strb w18,[x0, #0x7]
00a45228	lsr w18,w16,#0xb
00a4522c	ubfx w16,w16,#0x13,#0x6
00a45230	bfm w15,w2,#0x1b,#0x18
00a45234	strb w13,[x0, #0xd]
00a45238	strb w14,[x0, #0xe]
00a4523c	lsr w13,w12,#0x8
00a45240	lsr w14,w12,#0x10
00a45244	add w10,w10,w11, ASR #0x1a
00a45248	bfm w16,w17,#0x1a,#0x19
00a4524c	strb w15,[x0, #0x9]
00a45250	strb w12,[x0, #0x10]
00a45254	lsr w12,w12,#0x18
00a45258	and w15,w11,#0x3ffffff
00a4525c	strb w13,[x0, #0x11]
00a45260	strb w14,[x0, #0x12]
00a45264	lsr w13,w11,#0x7
00a45268	lsr w14,w11,#0xf
00a4526c	add w9,w9,w10, ASR #0x19
00a45270	strb w16,[x0, #0xc]
00a45274	ubfx w11,w11,#0x17,#0x3
00a45278	and w16,w10,#0x1ffffff
00a4527c	bfm w12,w15,#0x1f,#0x19
00a45280	strb w13,[x0, #0x14]
00a45284	strb w14,[x0, #0x15]
00a45288	lsr w13,w10,#0x5
00a4528c	lsr w14,w10,#0xd
00a45290	add w8,w8,w9, ASR #0x1a
00a45294	ubfx w10,w10,#0x15,#0x4
00a45298	and w15,w9,#0x3ffffff
00a4529c	strb w12,[x0, #0x13]
00a452a0	bfm w11,w16,#0x1d,#0x18
00a452a4	strb w13,[x0, #0x17]
00a452a8	strb w14,[x0, #0x18]
00a452ac	lsr w12,w9,#0x4
00a452b0	lsr w13,w9,#0xc
00a452b4	ubfx w9,w9,#0x14,#0x6
00a452b8	and w14,w8,#0x1ffffff
00a452bc	lsr w17,w17,#0x12
00a452c0	strb w11,[x0, #0x16]
00a452c4	bfm w10,w15,#0x1c,#0x19
00a452c8	strb w12,[x0, #0x1a]
00a452cc	lsr w11,w8,#0x2
00a452d0	lsr w12,w8,#0xa
00a452d4	ubfx w8,w8,#0x12,#0x7
00a452d8	bfm w9,w14,#0x1a,#0x18
00a452dc	strb w1,[x0, #0x8]
00a452e0	strb w18,[x0, #0xb]
00a452e4	strb w17,[x0, #0xf]
00a452e8	strb w13,[x0, #0x1b]
00a452ec	strb w10,[x0, #0x19]
00a452f0	strb w11,[x0, #0x1d]
00a452f4	strb w12,[x0, #0x1e]
00a452f8	strb w9,[x0, #0x1c]
00a452fc	strb w8,[x0, #0x1f]
00a45300	ret
