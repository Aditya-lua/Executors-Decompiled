; ossl_rsa_padding_check_PKCS1_type_2_TLS @ 00ad61f4
00ad61f4	sub sp,sp,#0x70
00ad61f8	cmp x2,#0x30
00ad61fc	str x23,[sp, #0x30]
00ad6200	stp x22,x21,[sp, #0x40]
00ad6204	stp x20,x19,[sp, #0x50]
00ad6208	stp x29,x30,[sp, #0x60]
00ad620c	add x29,sp,#0x60
00ad6210	b.cc 0x00ad6284
00ad6214	mov x23,x4
00ad6218	cmp x4,#0x3a
00ad621c	b.ls 0x00ad6284
00ad6220	mov x22,x3
00ad6224	mov x19,x1
00ad6228	mov x1,sp
00ad622c	orr w2,wzr,#0x30
00ad6230	mov w3,wzr
00ad6234	mov w20,w6
00ad6238	mov w21,w5
00ad623c	bl 0x00c358b0
00ad6240	cmp w0,#0x0
00ad6244	b.le 0x00ad62ac
00ad6248	ldrb w10,[x22, #0x1]
00ad624c	ldrb w8,[x22]
00ad6250	sub x13,x23,#0x33
00ad6254	sub x9,x23,#0x30
00ad6258	eor w10,w10,#0x2
00ad625c	sub w8,w8,#0x1
00ad6260	sub w10,w10,#0x1
00ad6264	and w8,w10,w8
00ad6268	cmp x13,#0x2
00ad626c	asr w8,w8,#0x1f
00ad6270	sub x10,x23,#0x31
00ad6274	b.cs 0x00ad62e4
00ad6278	mov w11,#0x2
00ad627c	mov w12,#0x2
00ad6280	b 0x00ad635c
00ad6284	bl 0x00c342a0
00ad6288	adrp x0,0x2d8000
00ad628c	adrp x2,0x2c0000
00ad6290	add x0,x0,#0x794
00ad6294	add x2,x2,#0x50f
00ad6298	mov w1,#0x138
00ad629c	bl 0x00c342b0
00ad62a0	mov w0,#0x4
00ad62a4	mov w1,#0x9f
00ad62a8	b 0x00ad62d4
00ad62ac	bl 0x00c342a0
00ad62b0	adrp x0,0x2d8000
00ad62b4	adrp x2,0x2c0000
00ad62b8	add x0,x0,#0x794
00ad62bc	add x2,x2,#0x50f
00ad62c0	mov w1,#0x142
00ad62c4	bl 0x00c342b0
00ad62c8	mov w1,#0x103
00ad62cc	mov w0,#0x4
00ad62d0	movk w1,#0xc, LSL #16
00ad62d4	mov x2,xzr
00ad62d8	bl 0x00c342c0
00ad62dc	mov w0,#0xffffffff
00ad62e0	b 0x00ad6438
00ad62e4	sub x14,x23,#0x34
00ad62e8	mov w11,#0x2
00ad62ec	cmn w14,#0x3
00ad62f0	mov w12,#0x2
00ad62f4	b.hi 0x00ad635c
00ad62f8	lsr x15,x14,#0x20
00ad62fc	cbnz x15,0x00ad635c
00ad6300	cmn w14,#0x4
00ad6304	b.hi 0x00ad635c
00ad6308	cbnz x15,0x00ad635c
00ad630c	and x14,x13,#-0x2
00ad6310	add x16,x22,#0x3
00ad6314	mov w15,#0xffffffff
00ad6318	add x11,x14,#0x2
00ad631c	add w12,w14,#0x2
00ad6320	orr w17,wzr,#0xffffff00
00ad6324	mov x18,x14
00ad6328	ldurb w0,[x16, #-0x1]
00ad632c	ldrb w1,[x16], #0x2
00ad6330	subs x18,x18,#0x2
00ad6334	sub w0,w0,#0x1
00ad6338	sub w1,w1,#0x1
00ad633c	orn w0,w17,w0, ASR #0x1f
00ad6340	orn w1,w17,w1, ASR #0x1f
00ad6344	and w8,w8,w0
00ad6348	and w15,w15,w1
00ad634c	b.ne 0x00ad6328
00ad6350	cmp x13,x14
00ad6354	and w8,w15,w8
00ad6358	b.eq 0x00ad6384
00ad635c	add w12,w12,#0x1
00ad6360	orr w13,wzr,#0xffffff00
00ad6364	ldrb w14,[x22, x11]
00ad6368	mov w11,w12
00ad636c	cmp x10,x11
00ad6370	add w12,w12,#0x1
00ad6374	sub w14,w14,#0x1
00ad6378	orn w14,w13,w14, ASR #0x1f
00ad637c	and w8,w8,w14
00ad6380	b.hi 0x00ad6364
00ad6384	add x11,x22,x23
00ad6388	ldrb w10,[x22, x10]
00ad638c	ldrb w9,[x22, x9]
00ad6390	ldurb w13,[x11, #-0x2f]
00ad6394	ubfx w12,w21,#0x8,#0x8
00ad6398	and w14,w21,#0xff
00ad639c	sub w10,w10,#0x1
00ad63a0	eor w15,w12,w9
00ad63a4	eor w14,w14,w13
00ad63a8	asr w12,w10,#0x1f
00ad63ac	sub w10,w15,#0x1
00ad63b0	sub w14,w14,#0x1
00ad63b4	and w10,w14,w10
00ad63b8	cmp w20,#0x1
00ad63bc	asr w10,w10,#0x1f
00ad63c0	b.lt 0x00ad63e4
00ad63c4	ubfx w14,w20,#0x8,#0x8
00ad63c8	and w15,w20,#0xff
00ad63cc	eor w9,w14,w9
00ad63d0	eor w13,w15,w13
00ad63d4	sub w9,w9,#0x1
00ad63d8	sub w13,w13,#0x1
00ad63dc	and w9,w13,w9
00ad63e0	orr w10,w10,w9, ASR #0x1f
00ad63e4	and w12,w8,w12
00ad63e8	and w10,w12,w10
00ad63ec	and w10,w10,#0xff
00ad63f0	mov x9,xzr
00ad63f4	sub x8,x11,#0x30
00ad63f8	mvn w11,w10
00ad63fc	mov x12,sp
00ad6400	ldrb w13,[x8, x9]
00ad6404	ldrb w14,[x12, x9]
00ad6408	stur w10,[x29, #-0x24]
00ad640c	ldur w15,[x29, #-0x24]
00ad6410	stur w11,[x29, #-0x24]
00ad6414	ldur w16,[x29, #-0x24]
00ad6418	and w13,w15,w13
00ad641c	and w14,w16,w14
00ad6420	orr w13,w14,w13
00ad6424	strb w13,[x19, x9]
00ad6428	add x9,x9,#0x1
00ad642c	cmp x9,#0x30
00ad6430	b.ne 0x00ad6400
00ad6434	orr w0,wzr,#0x30
00ad6438	ldp x29,x30,[sp, #0x60]
00ad643c	ldp x20,x19,[sp, #0x50]
00ad6440	ldp x22,x21,[sp, #0x40]
00ad6444	ldr x23,[sp, #0x30]
00ad6448	add sp,sp,#0x70
00ad644c	ret
