; CRYPTO_gcm128_encrypt @ 00aaa160
00aaa160	sub sp,sp,#0xa0
00aaa164	stp x28,x27,[sp, #0x40]
00aaa168	stp x26,x25,[sp, #0x50]
00aaa16c	stp x24,x23,[sp, #0x60]
00aaa170	stp x22,x21,[sp, #0x70]
00aaa174	stp x20,x19,[sp, #0x80]
00aaa178	stp x29,x30,[sp, #0x90]
00aaa17c	ldr x8,[x0, #0x38]
00aaa180	orr x10,xzr,#0xfffffffe0
00aaa184	mov x19,x0
00aaa188	mov w0,#0xffffffff
00aaa18c	adds x8,x8,x3
00aaa190	cset w9,cs
00aaa194	cmp x8,x10
00aaa198	add x29,sp,#0x90
00aaa19c	b.hi 0x00aaa614
00aaa1a0	tbnz w9,#0x0,0x00aaa614
00aaa1a4	ldr w9,[x19, #0x174]
00aaa1a8	ldp x28,x21,[x19, #0x178]
00aaa1ac	mov x23,x3
00aaa1b0	mov x22,x2
00aaa1b4	mov x20,x1
00aaa1b8	str x8,[x19, #0x38]
00aaa1bc	cbz w9,0x00aaa1e0
00aaa1c0	cbz x23,0x00aaa270
00aaa1c4	ldr q0,[x19, #0x40]
00aaa1c8	add x8,x19,#0x188
00aaa1cc	mov w14,#0x10
00aaa1d0	str q0,[x8]
00aaa1d4	str wzr,[x19, #0x174]
00aaa1d8	stp xzr,xzr,[x19, #0x40]
00aaa1dc	b 0x00aaa1e4
00aaa1e0	ldr w14,[x19, #0x170]
00aaa1e4	ldr w24,[x19, #0xc]
00aaa1e8	ands w8,w14,#0xf
00aaa1ec	b.eq 0x00aaa244
00aaa1f0	cbz x23,0x00aaa238
00aaa1f4	add x9,x19,#0x10
00aaa1f8	ldrb w11,[x20], #0x1
00aaa1fc	ldrb w12,[x9, w8, UXTW ]
00aaa200	mov w10,w14
00aaa204	add w8,w8,#0x1
00aaa208	add x13,x19,w14, UXTW 
00aaa20c	eor w10,w12,w11
00aaa210	add w14,w14,#0x1
00aaa214	ands w8,w8,#0xf
00aaa218	strb w10,[x22], #0x1
00aaa21c	sub x27,x23,#0x1
00aaa220	strb w10,[x13, #0x188]
00aaa224	b.eq 0x00aaa234
00aaa228	cmp x23,#0x1
00aaa22c	mov x23,x27
00aaa230	b.ne 0x00aaa1f8
00aaa234	cbz w8,0x00aaa288
00aaa238	mov w0,wzr
00aaa23c	str w14,[x19, #0x170]
00aaa240	b 0x00aaa614
00aaa244	cmp x23,#0x10
00aaa248	b.cc 0x00aaa268
00aaa24c	cbz w14,0x00aaa268
00aaa250	add x0,x19,#0x40
00aaa254	add x1,x19,#0x60
00aaa258	add x2,x19,#0x188
00aaa25c	mov w3,w14
00aaa260	bl 0x00aaa048
00aaa264	mov w14,wzr
00aaa268	mov x27,x23
00aaa26c	b 0x00aaa2a0
00aaa270	add x0,x19,#0x40
00aaa274	add x1,x19,#0x60
00aaa278	bl 0x00aa9de0
00aaa27c	mov w0,wzr
00aaa280	str wzr,[x19, #0x174]
00aaa284	b 0x00aaa614
00aaa288	add x0,x19,#0x40
00aaa28c	add x1,x19,#0x60
00aaa290	add x2,x19,#0x188
00aaa294	mov w3,w14
00aaa298	bl 0x00aaa048
00aaa29c	mov w14,wzr
00aaa2a0	cmp x27,#0xc00
00aaa2a4	rev w24,w24
00aaa2a8	str w14,[sp, #0xc]
00aaa2ac	b.cc 0x00aaa450
00aaa2b0	add x8,x19,#0x40
00aaa2b4	add x23,x19,#0x10
00aaa2b8	str x8,[sp, #0x18]
00aaa2bc	add x8,x19,#0x60
00aaa2c0	add w25,w24,#0x1
00aaa2c4	str x8,[sp, #0x10]
00aaa2c8	mov x26,xzr
00aaa2cc	add x8,x22,#0xc00
00aaa2d0	str w24,[sp, #0x28]
00aaa2d4	stp x27,x8,[sp, #0x30]
00aaa2d8	str w25,[sp, #0x20]
00aaa2dc	mov x0,x19
00aaa2e0	mov x1,x23
00aaa2e4	mov x2,x21
00aaa2e8	add x27,x22,x26
00aaa2ec	add x24,x20,x26
00aaa2f0	blr x28
00aaa2f4	lsr w8,w25,#0x18
00aaa2f8	lsr w9,w25,#0x10
00aaa2fc	strb w8,[x19, #0xc]
00aaa300	lsr w8,w25,#0x8
00aaa304	strb w25,[x19, #0xf]
00aaa308	strb w9,[x19, #0xd]
00aaa30c	strb w8,[x19, #0xe]
00aaa310	ldr x9,[x19, #0x10]
00aaa314	ldr x8,[x24]
00aaa318	add x26,x26,#0x10
00aaa31c	cmp x26,#0xc00
00aaa320	add w25,w25,#0x1
00aaa324	eor x8,x9,x8
00aaa328	str x8,[x27]
00aaa32c	ldr x8,[x24, #0x8]
00aaa330	ldr x9,[x19, #0x18]
00aaa334	eor x8,x9,x8
00aaa338	str x8,[x27, #0x8]
00aaa33c	b.ne 0x00aaa2dc
00aaa340	ldr w24,[sp, #0x28]
00aaa344	ldp x1,x0,[sp, #0x10]
00aaa348	orr w3,wzr,#0xc00
00aaa34c	mov x2,x22
00aaa350	add x20,x20,#0xc00
00aaa354	add w24,w24,#0xc0
00aaa358	bl 0x00aaa048
00aaa35c	ldp x27,x26,[sp, #0x30]
00aaa360	ldr w25,[sp, #0x20]
00aaa364	sub x27,x27,#0xc00
00aaa368	cmp x27,#0xbff
00aaa36c	add w25,w25,#0xc0
00aaa370	mov x22,x26
00aaa374	b.hi 0x00aaa2c8
00aaa378	ands x22,x27,#-0x10
00aaa37c	b.eq 0x00aaa45c
00aaa380	subs x25,x27,#0x10
00aaa384	b.cc 0x00aaa434
00aaa388	lsr x8,x25,#0x4
00aaa38c	and x9,x25,#-0x10
00aaa390	str x9,[sp, #0x28]
00aaa394	add x9,x9,#0x10
00aaa398	add w8,w24,w8
00aaa39c	add x23,x19,#0x10
00aaa3a0	str w8,[sp, #0x18]
00aaa3a4	add x8,x20,x9
00aaa3a8	add w24,w24,#0x1
00aaa3ac	str x9,[sp, #0x20]
00aaa3b0	stp x8,x26,[sp, #0x30]
00aaa3b4	mov x0,x19
00aaa3b8	mov x1,x23
00aaa3bc	mov x2,x21
00aaa3c0	blr x28
00aaa3c4	lsr w8,w24,#0x18
00aaa3c8	lsr w9,w24,#0x10
00aaa3cc	strb w8,[x19, #0xc]
00aaa3d0	lsr w8,w24,#0x8
00aaa3d4	strb w24,[x19, #0xf]
00aaa3d8	strb w9,[x19, #0xd]
00aaa3dc	strb w8,[x19, #0xe]
00aaa3e0	ldr x9,[x19, #0x10]
00aaa3e4	ldr x8,[x20]
00aaa3e8	sub x27,x27,#0x10
00aaa3ec	add w24,w24,#0x1
00aaa3f0	cmp x27,#0xf
00aaa3f4	eor x8,x9,x8
00aaa3f8	str x8,[x26]
00aaa3fc	ldr x8,[x20, #0x8]
00aaa400	ldr x9,[x19, #0x18]
00aaa404	add x20,x20,#0x10
00aaa408	eor x8,x9,x8
00aaa40c	str x8,[x26, #0x8]
00aaa410	add x26,x26,#0x10
00aaa414	b.hi 0x00aaa3b4
00aaa418	ldp x20,x26,[sp, #0x30]
00aaa41c	ldr x8,[sp, #0x20]
00aaa420	add x26,x26,x8
00aaa424	ldr x8,[sp, #0x28]
00aaa428	sub x27,x25,x8
00aaa42c	ldr w8,[sp, #0x18]
00aaa430	add w24,w8,#0x1
00aaa434	add x0,x19,#0x40
00aaa438	add x1,x19,#0x60
00aaa43c	sub x2,x26,x22
00aaa440	mov x3,x22
00aaa444	bl 0x00aaa048
00aaa448	cbnz x27,0x00aaa460
00aaa44c	b 0x00aaa4b0
00aaa450	mov x26,x22
00aaa454	ands x22,x27,#-0x10
00aaa458	b.ne 0x00aaa380
00aaa45c	cbz x27,0x00aaa4b0
00aaa460	add x22,x19,#0x10
00aaa464	mov x0,x19
00aaa468	mov x1,x22
00aaa46c	mov x2,x21
00aaa470	blr x28
00aaa474	add w8,w24,#0x1
00aaa478	cmp x27,#0x20
00aaa47c	lsr w9,w8,#0x18
00aaa480	lsr w10,w8,#0x10
00aaa484	lsr w11,w8,#0x8
00aaa488	strb w9,[x19, #0xc]
00aaa48c	strb w10,[x19, #0xd]
00aaa490	strb w11,[x19, #0xe]
00aaa494	strb w8,[x19, #0xf]
00aaa498	b.cs 0x00aaa4b8
00aaa49c	ldr w2,[sp, #0xc]
00aaa4a0	mov w8,wzr
00aaa4a4	mov x9,x27
00aaa4a8	mov w11,w2
00aaa4ac	b 0x00aaa5dc
00aaa4b0	ldr w2,[sp, #0xc]
00aaa4b4	b 0x00aaa60c
00aaa4b8	ldr w2,[sp, #0xc]
00aaa4bc	sub x8,x27,#0x1
00aaa4c0	cmn w2,w8
00aaa4c4	b.cs 0x00aaa5d0
00aaa4c8	lsr x8,x8,#0x20
00aaa4cc	cbnz x8,0x00aaa5d0
00aaa4d0	mov w10,w2
00aaa4d4	add x8,x19,#0x188
00aaa4d8	add x9,x27,x10
00aaa4dc	add x0,x8,x9
00aaa4e0	add x12,x26,x27
00aaa4e4	add x17,x8,x10
00aaa4e8	cmp x26,x0
00aaa4ec	add x14,x20,x27
00aaa4f0	cset w8,cc
00aaa4f4	cmp x17,x12
00aaa4f8	add x16,x19,#0x10
00aaa4fc	cset w9,cc
00aaa500	cmp x26,x14
00aaa504	add x18,x16,x27
00aaa508	and w1,w8,w9
00aaa50c	cset w8,cc
00aaa510	cmp x20,x12
00aaa514	cset w11,cc
00aaa518	cmp x26,x18
00aaa51c	cset w9,cc
00aaa520	cmp x12,x16
00aaa524	cset w13,hi
00aaa528	cmp x17,x14
00aaa52c	cset w12,cc
00aaa530	cmp x20,x0
00aaa534	cset w15,cc
00aaa538	cmp x17,x18
00aaa53c	cset w14,cc
00aaa540	cmp x0,x16
00aaa544	cset w16,hi
00aaa548	tbnz w1,#0x0,0x00aaa5d0
00aaa54c	and w8,w8,w11
00aaa550	tbnz w8,#0x0,0x00aaa5d0
00aaa554	and w8,w9,w13
00aaa558	tbnz w8,#0x0,0x00aaa5d0
00aaa55c	and w8,w12,w15
00aaa560	tbnz w8,#0x0,0x00aaa5d0
00aaa564	and w8,w14,w16
00aaa568	tbnz w8,#0x0,0x00aaa5d0
00aaa56c	and x8,x27,#-0x20
00aaa570	mov x12,xzr
00aaa574	sub x9,x27,x8
00aaa578	add w11,w2,w8
00aaa57c	and x14,x12,#0xffffffe0
00aaa580	add x15,x20,x14
00aaa584	ldp q0,q1,[x15]
00aaa588	add x15,x22,x14
00aaa58c	ldp q2,q3,[x15]
00aaa590	add w13,w10,w12
00aaa594	add x12,x12,#0x20
00aaa598	add x13,x19,x13
00aaa59c	add x14,x26,x14
00aaa5a0	cmp x8,x12
00aaa5a4	add x15,x13,#0x188
00aaa5a8	add x13,x13,#0x198
00aaa5ac	eor v0.16B,v2.16B,v0.16B
00aaa5b0	eor v1.16B,v3.16B,v1.16B
00aaa5b4	stp q0,q1,[x14]
00aaa5b8	str q0,[x15]
00aaa5bc	str q1,[x13]
00aaa5c0	b.ne 0x00aaa57c
00aaa5c4	cmp x27,x8
00aaa5c8	b.ne 0x00aaa5dc
00aaa5cc	b 0x00aaa608
00aaa5d0	mov w8,wzr
00aaa5d4	mov x9,x27
00aaa5d8	mov w11,w2
00aaa5dc	mov w10,w8
00aaa5e0	ldrb w12,[x20, x10]
00aaa5e4	ldrb w13,[x22, x10]
00aaa5e8	subs x9,x9,#0x1
00aaa5ec	add x14,x19,w11, UXTW 
00aaa5f0	add w11,w11,#0x1
00aaa5f4	eor w12,w13,w12
00aaa5f8	add w8,w8,#0x1
00aaa5fc	strb w12,[x26, x10]
00aaa600	strb w12,[x14, #0x188]
00aaa604	b.ne 0x00aaa5dc
00aaa608	add w2,w2,w27
00aaa60c	mov w0,wzr
00aaa610	str w2,[x19, #0x170]
00aaa614	ldp x29,x30,[sp, #0x90]
00aaa618	ldp x20,x19,[sp, #0x80]
00aaa61c	ldp x22,x21,[sp, #0x70]
00aaa620	ldp x24,x23,[sp, #0x60]
00aaa624	ldp x26,x25,[sp, #0x50]
00aaa628	ldp x28,x27,[sp, #0x40]
00aaa62c	add sp,sp,#0xa0
00aaa630	ret
