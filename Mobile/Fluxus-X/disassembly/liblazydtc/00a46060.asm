; FUN_00a46060 @ 00a46060
00a46060	sub sp,sp,#0x80
00a46064	stp x26,x25,[sp, #0x30]
00a46068	stp x24,x23,[sp, #0x40]
00a4606c	stp x22,x21,[sp, #0x50]
00a46070	stp x20,x19,[sp, #0x60]
00a46074	stp x29,x30,[sp, #0x70]
00a46078	add x29,sp,#0x70
00a4607c	mov x20,x1
00a46080	mov x19,x0
00a46084	bl 0x00a46500
00a46088	add x0,x19,#0x50
00a4608c	add x1,x20,#0x28
00a46090	bl 0x00a46500
00a46094	ldpsw x4,x5,[x20, #0x50]
00a46098	ldpsw x9,x6,[x20, #0x58]
00a4609c	ldpsw x12,x2,[x20, #0x60]
00a460a0	ldpsw x13,x16,[x20, #0x68]
00a460a4	mov w3,#0x26
00a460a8	lsl x14,x4,#0x1
00a460ac	lsl x0,x5,#0x1
00a460b0	lsl x7,x9,#0x1
00a460b4	mul x21,x2,x2
00a460b8	mul x4,x4,x4
00a460bc	ldpsw x11,x10,[x20, #0x70]
00a460c0	mov w8,#0x13
00a460c4	lsl x15,x6,#0x1
00a460c8	mul x25,x14,x5
00a460cc	mul x5,x0,x5
00a460d0	mul x26,x0,x9
00a460d4	madd x4,x21,x3,x4
00a460d8	mul x21,x12,x7
00a460dc	lsl x1,x12,#0x1
00a460e0	lsl x17,x2,#0x1
00a460e4	mul x22,x13,x8
00a460e8	madd x26,x6,x14,x26
00a460ec	madd x21,x15,x6,x21
00a460f0	mul x6,x7,x6
00a460f4	madd x5,x9,x14,x5
00a460f8	madd x4,x22,x1,x4
00a460fc	madd x25,x22,x17,x25
00a46100	madd x5,x22,x13,x5
00a46104	mul x22,x15,x12
00a46108	madd x6,x12,x0,x6
00a4610c	mul x23,x16,x3
00a46110	madd x22,x2,x7,x22
00a46114	madd x6,x2,x14,x6
00a46118	mul x2,x1,x2
00a4611c	mul x18,x11,x8
00a46120	mul x24,x12,x12
00a46124	madd x2,x13,x15,x2
00a46128	madd x4,x23,x15,x4
00a4612c	madd x24,x13,x7,x24
00a46130	madd x2,x16,x7,x2
00a46134	madd x4,x18,x7,x4
00a46138	mul x7,x9,x9
00a4613c	madd x7,x15,x0,x7
00a46140	madd x7,x12,x14,x7
00a46144	madd x25,x23,x12,x25
00a46148	madd x26,x23,x13,x26
00a4614c	madd x7,x23,x16,x7
00a46150	madd x5,x23,x17,x5
00a46154	mul x23,x13,x18
00a46158	madd x22,x13,x0,x22
00a4615c	add x7,x7,x23, LSL #0x1
00a46160	madd x22,x16,x14,x22
00a46164	lsl x16,x16,#0x1
00a46168	mul x3,x10,x3
00a4616c	madd x23,x17,x15,x24
00a46170	madd x21,x17,x0,x21
00a46174	madd x23,x16,x0,x23
00a46178	madd x2,x11,x0,x2
00a4617c	madd x0,x3,x0,x4
00a46180	madd x4,x18,x15,x25
00a46184	madd x4,x3,x9,x4
00a46188	madd x1,x18,x1,x5
00a4618c	madd x9,x18,x17,x26
00a46190	madd x5,x13,x14,x21
00a46194	madd x12,x3,x12,x9
00a46198	madd x17,x3,x17,x7
00a4619c	madd x9,x18,x16,x6
00a461a0	madd x18,x18,x11,x5
00a461a4	madd x5,x11,x14,x23
00a461a8	madd x13,x3,x13,x9
00a461ac	mov w9,#0x2000000
00a461b0	madd x6,x3,x11,x22
00a461b4	madd x5,x3,x10,x5
00a461b8	madd x14,x10,x14,x2
00a461bc	madd x10,x3,x15,x1
00a461c0	madd x11,x3,x16,x18
00a461c4	lsl x15,x0,#0x1
00a461c8	lsl x16,x17,#0x1
00a461cc	add x17,x15,x9
00a461d0	add x18,x16,x9
00a461d4	asr x0,x17,#0x1a
00a461d8	asr x1,x18,#0x1a
00a461dc	mov w7,#0x1000000
00a461e0	and x17,x17,#-0x4000000
00a461e4	and x18,x18,#-0x4000000
00a461e8	add x0,x0,x4, LSL #0x1
00a461ec	add x13,x1,x13, LSL #0x1
00a461f0	sub x15,x15,x17
00a461f4	sub x16,x16,x18
00a461f8	add x17,x0,x7
00a461fc	add x18,x13,x7
00a46200	asr x1,x17,#0x19
00a46204	and w17,w17,#0xfe000000
00a46208	asr x2,x18,#0x19
00a4620c	and w18,w18,#0xfe000000
00a46210	add x1,x1,x10, LSL #0x1
00a46214	sub w10,w0,w17
00a46218	add x17,x2,x11, LSL #0x1
00a4621c	sub w11,w13,w18
00a46220	add x13,x17,x9
00a46224	asr x18,x13,#0x1a
00a46228	add x18,x18,x6, LSL #0x1
00a4622c	add x0,x18,x7
00a46230	asr x2,x0,#0x19
00a46234	add x2,x2,x5, LSL #0x1
00a46238	add x3,x2,x9
00a4623c	asr x4,x3,#0x1a
00a46240	add x14,x4,x14, LSL #0x1
00a46244	add x4,x14,x7
00a46248	asr x5,x4,#0x19
00a4624c	madd x8,x5,x8,x15
00a46250	add x15,x1,x9
00a46254	asr x5,x15,#0x1a
00a46258	add x12,x5,x12, LSL #0x1
00a4625c	and w13,w13,#0xfc000000
00a46260	sub w13,w17,w13
00a46264	add x17,x12,x7
00a46268	and w15,w15,#0xfc000000
00a4626c	add x16,x16,x17, ASR #0x19
00a46270	and w17,w17,#0xfe000000
00a46274	sub w15,w1,w15
00a46278	sub w12,w12,w17
00a4627c	and w17,w0,#0xfe000000
00a46280	sub w17,w18,w17
00a46284	stp w15,w12,[x19, #0x80]
00a46288	add x12,x16,x9
00a4628c	stp w13,w17,[x19, #0x90]
00a46290	lsr x13,x12,#0x1a
00a46294	and w12,w12,#0xfc000000
00a46298	add w11,w11,w13
00a4629c	sub w12,w16,w12
00a462a0	and w13,w3,#0xfc000000
00a462a4	stp w12,w11,[x19, #0x88]
00a462a8	and w11,w4,#0xfe000000
00a462ac	sub w13,w2,w13
00a462b0	sub w11,w14,w11
00a462b4	add x9,x8,x9
00a462b8	stp w13,w11,[x19, #0x98]
00a462bc	lsr x11,x9,#0x1a
00a462c0	and w9,w9,#0xfc000000
00a462c4	add w10,w10,w11
00a462c8	sub w8,w8,w9
00a462cc	stp w8,w10,[x19, #0x78]
00a462d0	ldr w8,[x20]
00a462d4	ldr w9,[x20, #0x28]
00a462d8	add x1,x19,#0x28
00a462dc	add x0,sp,#0x8
00a462e0	add w8,w9,w8
00a462e4	str w8,[x19, #0x28]
00a462e8	ldr w8,[x20, #0x4]
00a462ec	ldr w9,[x20, #0x2c]
00a462f0	add w8,w9,w8
00a462f4	str w8,[x19, #0x2c]
00a462f8	ldr w8,[x20, #0x8]
00a462fc	ldr w9,[x20, #0x30]
00a46300	add w8,w9,w8
00a46304	str w8,[x19, #0x30]
00a46308	ldr w8,[x20, #0xc]
00a4630c	ldr w9,[x20, #0x34]
00a46310	add w8,w9,w8
00a46314	str w8,[x19, #0x34]
00a46318	ldr w8,[x20, #0x10]
00a4631c	ldr w9,[x20, #0x38]
00a46320	add w8,w9,w8
00a46324	str w8,[x19, #0x38]
00a46328	ldr w8,[x20, #0x14]
00a4632c	ldr w9,[x20, #0x3c]
00a46330	add w8,w9,w8
00a46334	str w8,[x19, #0x3c]
00a46338	ldr w8,[x20, #0x18]
00a4633c	ldr w9,[x20, #0x40]
00a46340	add w8,w9,w8
00a46344	str w8,[x19, #0x40]
00a46348	ldr w8,[x20, #0x1c]
00a4634c	ldr w9,[x20, #0x44]
00a46350	add w8,w9,w8
00a46354	str w8,[x19, #0x44]
00a46358	ldr w8,[x20, #0x20]
00a4635c	ldr w9,[x20, #0x48]
00a46360	add w8,w9,w8
00a46364	str w8,[x19, #0x48]
00a46368	ldr w8,[x20, #0x24]
00a4636c	ldr w9,[x20, #0x4c]
00a46370	add w8,w9,w8
00a46374	str w8,[x19, #0x4c]
00a46378	bl 0x00a46500
00a4637c	ldp w8,w9,[x19, #0x50]
00a46380	ldp w10,w11,[x19]
00a46384	ldp w12,w13,[x19, #0x58]
00a46388	ldp w14,w15,[x19, #0x8]
00a4638c	ldp w16,w17,[x19, #0x60]
00a46390	ldp w18,w0,[x19, #0x10]
00a46394	ldp w1,w2,[x19, #0x68]
00a46398	ldp w3,w4,[x19, #0x18]
00a4639c	ldp w5,w6,[x19, #0x70]
00a463a0	ldp w7,w20,[x19, #0x20]
00a463a4	add w21,w10,w8
00a463a8	sub w10,w8,w10
00a463ac	add w22,w11,w9
00a463b0	sub w11,w9,w11
00a463b4	add w23,w14,w12
00a463b8	sub w12,w12,w14
00a463bc	add w14,w15,w13
00a463c0	sub w13,w13,w15
00a463c4	add w15,w18,w16
00a463c8	sub w16,w16,w18
00a463cc	add w18,w0,w17
00a463d0	sub w17,w17,w0
00a463d4	add w0,w3,w1
00a463d8	sub w1,w1,w3
00a463dc	add w3,w4,w2
00a463e0	sub w2,w2,w4
00a463e4	add w9,w7,w5
00a463e8	sub w4,w5,w7
00a463ec	add w8,w20,w6
00a463f0	sub w5,w6,w20
00a463f4	stp w21,w22,[x19, #0x28]
00a463f8	stp w23,w14,[x19, #0x30]
00a463fc	stp w15,w18,[x19, #0x38]
00a46400	stp w0,w3,[x19, #0x40]
00a46404	stp w9,w8,[x19, #0x48]
00a46408	stp w10,w11,[x19, #0x50]
00a4640c	stp w12,w13,[x19, #0x58]
00a46410	stp w16,w17,[x19, #0x60]
00a46414	stp w1,w2,[x19, #0x68]
00a46418	stp w4,w5,[x19, #0x70]
00a4641c	ldr w6,[sp, #0x8]
00a46420	sub w6,w6,w21
00a46424	str w6,[x19]
00a46428	ldr w6,[sp, #0xc]
00a4642c	sub w6,w6,w22
00a46430	str w6,[x19, #0x4]
00a46434	ldr w6,[sp, #0x10]
00a46438	sub w6,w6,w23
00a4643c	str w6,[x19, #0x8]
00a46440	ldr w6,[sp, #0x14]
00a46444	sub w14,w6,w14
00a46448	str w14,[x19, #0xc]
00a4644c	ldp w14,w7,[x19, #0x78]
00a46450	ldr w6,[sp, #0x18]
00a46454	sub w10,w14,w10
00a46458	sub w14,w6,w15
00a4645c	str w14,[x19, #0x10]
00a46460	ldp w14,w6,[x19, #0x80]
00a46464	ldr w15,[sp, #0x1c]
00a46468	sub w11,w7,w11
00a4646c	sub w12,w14,w12
00a46470	sub w14,w15,w18
00a46474	str w14,[x19, #0x14]
00a46478	ldr w15,[sp, #0x20]
00a4647c	ldp w14,w18,[x19, #0x88]
00a46480	sub w13,w6,w13
00a46484	sub w15,w15,w0
00a46488	str w15,[x19, #0x18]
00a4648c	sub w14,w14,w16
00a46490	ldr w16,[sp, #0x24]
00a46494	sub w17,w18,w17
00a46498	ldp w15,w18,[x19, #0x90]
00a4649c	sub w16,w16,w3
00a464a0	str w16,[x19, #0x1c]
00a464a4	ldr w16,[sp, #0x28]
00a464a8	sub w15,w15,w1
00a464ac	ldp w0,w1,[x19, #0x98]
00a464b0	sub w18,w18,w2
00a464b4	sub w9,w16,w9
00a464b8	str w9,[x19, #0x20]
00a464bc	ldr w9,[sp, #0x2c]
00a464c0	sub w0,w0,w4
00a464c4	sub w1,w1,w5
00a464c8	stp w10,w11,[x19, #0x78]
00a464cc	sub w8,w9,w8
00a464d0	stp w12,w13,[x19, #0x80]
00a464d4	stp w14,w17,[x19, #0x88]
00a464d8	stp w15,w18,[x19, #0x90]
00a464dc	stp w0,w1,[x19, #0x98]
00a464e0	str w8,[x19, #0x24]
00a464e4	ldp x29,x30,[sp, #0x70]
00a464e8	ldp x20,x19,[sp, #0x60]
00a464ec	ldp x22,x21,[sp, #0x50]
00a464f0	ldp x24,x23,[sp, #0x40]
00a464f4	ldp x26,x25,[sp, #0x30]
00a464f8	add sp,sp,#0x80
00a464fc	ret
