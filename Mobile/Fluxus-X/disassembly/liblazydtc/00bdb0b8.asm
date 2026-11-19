; FUN_00bdb0b8 @ 00bdb0b8
00bdb0b8	paciasp
00bdb0bc	sub sp,sp,#0x180
00bdb0c0	stp x29,x30,[sp, #0x120]
00bdb0c4	stp x28,x27,[sp, #0x130]
00bdb0c8	stp x26,x25,[sp, #0x140]
00bdb0cc	stp x24,x23,[sp, #0x150]
00bdb0d0	stp x22,x21,[sp, #0x160]
00bdb0d4	stp x20,x19,[sp, #0x170]
00bdb0d8	add x29,sp,#0x120
00bdb0dc	ldr w8,[x3, #0x8]
00bdb0e0	mov w9,#0x4a
00bdb0e4	mov x22,x4
00bdb0e8	mov x0,x3
00bdb0ec	mov x21,x2
00bdb0f0	mov x19,x1
00bdb0f4	ands w8,w8,w9
00bdb0f8	sub x26,x29,#0x48
00bdb0fc	str x5,[sp, #0x18]
00bdb100	b.eq 0x00bdb124
00bdb104	cmp w8,#0x40
00bdb108	b.eq 0x00bdb11c
00bdb10c	cmp w8,#0x8
00bdb110	b.ne 0x00bdb12c
00bdb114	mov w23,#0x10
00bdb118	b 0x00bdb130
00bdb11c	mov w23,#0x8
00bdb120	b 0x00bdb130
00bdb124	mov w23,wzr
00bdb128	b 0x00bdb130
00bdb12c	mov w23,#0xa
00bdb130	sub x8,x29,#0x28
00bdb134	sub x1,x29,#0xc
00bdb138	bl 0x00c0bec0
00bdb13c	stp xzr,xzr,[x26, #0x8]
00bdb140	str xzr,[x26, #0x18]
00bdb144	sub x0,x29,#0x40
00bdb148	mov w1,#0x16
00bdb14c	mov w2,wzr
00bdb150	sub x20,x29,#0x40
00bdb154	bl 0x00c30250
00bdb158	ldurb w8,[x29, #-0x40]
00bdb15c	add x10,sp,#0x38
00bdb160	str x22,[sp, #0x20]
00bdb164	ldr x9,[x26, #0x18]
00bdb168	str x10,[sp, #0x30]
00bdb16c	adrp x28,0xcb5000
00bdb170	tst w8,#0x1
00bdb174	ldr x28,[x28, #0xc08]
00bdb178	orr x27,x20,#0x1
00bdb17c	csinc x24,x9,x20,ne
00bdb180	mov w20,#0x16
00bdb184	add x22,sp,#0x30
00bdb188	str x24,[x26]
00bdb18c	str wzr,[sp, #0x2c]
00bdb190	b 0x00bdb19c
00bdb194	add x8,x8,#0x1
00bdb198	str x8,[x19, #0x18]
00bdb19c	cbz x19,0x00bdb1c8
00bdb1a0	ldp x8,x9,[x19, #0x18]
00bdb1a4	cmp x8,x9
00bdb1a8	b.eq 0x00bdb1d8
00bdb1ac	mov w25,wzr
00bdb1b0	cbz x21,0x00bdb1d0
00bdb1b4	ldp x8,x9,[x21, #0x18]
00bdb1b8	cmp x8,x9
00bdb1bc	b.eq 0x00bdb1fc
00bdb1c0	tbnz w25,#0x0,0x00bdb220
00bdb1c4	b 0x00bdb364
00bdb1c8	mov w25,#0x1
00bdb1cc	cbnz x21,0x00bdb1b4
00bdb1d0	tbz w25,#0x0,0x00bdb220
00bdb1d4	b 0x00bdb364
00bdb1d8	ldr x8,[x19]
00bdb1dc	ldr x8,[x8, #0x48]
00bdb1e0	mov x0,x19
00bdb1e4	blr x8
00bdb1e8	cmn w0,#0x1
00bdb1ec	cset w25,eq
00bdb1f0	csel x19,xzr,x19,eq
00bdb1f4	cbnz x21,0x00bdb1b4
00bdb1f8	b 0x00bdb1d0
00bdb1fc	ldr x8,[x21]
00bdb200	ldr x8,[x8, #0x48]
00bdb204	mov x0,x21
00bdb208	blr x8
00bdb20c	cmn w0,#0x1
00bdb210	cset w8,eq
00bdb214	csel x21,xzr,x21,eq
00bdb218	cmp w25,w8
00bdb21c	b.eq 0x00bdb364
00bdb220	ldurb w8,[x29, #-0x40]
00bdb224	ldr x9,[x26, #0x10]
00bdb228	ldr x11,[x26]
00bdb22c	lsr x10,x8,#0x1
00bdb230	tst w8,#0x1
00bdb234	csel x25,x10,x9,eq
00bdb238	add x9,x24,x25
00bdb23c	cmp x11,x9
00bdb240	b.ne 0x00bdb2f8
00bdb244	cmp x25,#0x1
00bdb248	b.lt 0x00bdb260
00bdb24c	sub x0,x29,#0x40
00bdb250	mov x1,x25
00bdb254	mov w2,wzr
00bdb258	bl 0x00c30250
00bdb25c	b 0x00bdb284
00bdb260	lsl x9,x25,#0x1
00bdb264	tbnz w8,#0x0,0x00bdb278
00bdb268	lsl w8,w9,#0x1
00bdb26c	sturb w8,[x29, #-0x40]
00bdb270	mov x8,x27
00bdb274	b 0x00bdb280
00bdb278	ldr x8,[x26, #0x18]
00bdb27c	str x9,[x26, #0x10]
00bdb280	strb wzr,[x8, x9]
00bdb284	ldp x9,x10,[x26, #0x8]
00bdb288	ldurb w8,[x29, #-0x40]
00bdb28c	tst w8,#0x1
00bdb290	and x11,x9,#-0x2
00bdb294	ubfx x12,x9,#0x1,#0x7
00bdb298	sub x11,x11,#0x1
00bdb29c	csel x8,x20,x11,eq
00bdb2a0	tst x9,#0x1
00bdb2a4	csel x10,x12,x10,eq
00bdb2a8	subs x1,x8,x10
00bdb2ac	b.ls 0x00bdb2c0
00bdb2b0	sub x0,x29,#0x40
00bdb2b4	mov w2,wzr
00bdb2b8	bl 0x00c30250
00bdb2bc	b 0x00bdb2e0
00bdb2c0	tbnz w9,#0x0,0x00bdb2d4
00bdb2c4	lsl w9,w8,#0x1
00bdb2c8	sturb w9,[x29, #-0x40]
00bdb2cc	mov x9,x27
00bdb2d0	b 0x00bdb2dc
00bdb2d4	ldr x9,[x26, #0x18]
00bdb2d8	str x8,[x26, #0x10]
00bdb2dc	strb wzr,[x9, x8]
00bdb2e0	ldurb w8,[x29, #-0x40]
00bdb2e4	ldr x9,[x26, #0x18]
00bdb2e8	tst w8,#0x1
00bdb2ec	csel x24,x27,x9,eq
00bdb2f0	add x8,x24,x25
00bdb2f4	str x8,[x26]
00bdb2f8	ldp x8,x9,[x19, #0x18]
00bdb2fc	cmp x8,x9
00bdb300	b.eq 0x00bdb30c
00bdb304	ldrb w0,[x8]
00bdb308	b 0x00bdb31c
00bdb30c	ldr x8,[x19]
00bdb310	ldr x8,[x8, #0x48]
00bdb314	mov x0,x19
00bdb318	blr x8
00bdb31c	ldurb w5,[x29, #-0xc]
00bdb320	sub x3,x29,#0x48
00bdb324	add x4,sp,#0x2c
00bdb328	sub x6,x29,#0x28
00bdb32c	add x7,sp,#0x38
00bdb330	mov w1,w23
00bdb334	mov x2,x24
00bdb338	stp x22,x28,[sp]
00bdb33c	bl 0x00c440f0
00bdb340	cbnz w0,0x00bdb364
00bdb344	ldp x8,x9,[x19, #0x18]
00bdb348	cmp x8,x9
00bdb34c	b.ne 0x00bdb194
00bdb350	ldr x8,[x19]
00bdb354	ldr x8,[x8, #0x50]
00bdb358	mov x0,x19
00bdb35c	blr x8
00bdb360	b 0x00bdb19c
00bdb364	ldurb w8,[x29, #-0x28]
00bdb368	ldr x9,[x26, #0x28]
00bdb36c	ldr x22,[sp, #0x20]
00bdb370	lsr x10,x8,#0x1
00bdb374	tst w8,#0x1
00bdb378	csel x8,x10,x9,eq
00bdb37c	cbz x8,0x00bdb3a0
00bdb380	ldr x8,[sp, #0x30]
00bdb384	add x9,sp,#0x38
00bdb388	sub x9,x8,x9
00bdb38c	cmp x9,#0x9f
00bdb390	b.gt 0x00bdb3a0
00bdb394	ldr w9,[sp, #0x2c]
00bdb398	str w9,[x8], #0x4
00bdb39c	str x8,[sp, #0x30]
00bdb3a0	ldr x1,[x26]
00bdb3a4	mov x0,x24
00bdb3a8	mov x2,x22
00bdb3ac	mov w3,w23
00bdb3b0	bl 0x00c0c0d4
00bdb3b4	ldurb w10,[x29, #-0x28]
00bdb3b8	ldr x12,[sp, #0x30]
00bdb3bc	add x11,sp,#0x38
00bdb3c0	ldr x8,[x26, #0x28]
00bdb3c4	lsr x9,x10,#0x1
00bdb3c8	ands w13,w10,#0x1
00bdb3cc	sub x11,x12,x11
00bdb3d0	csel x8,x9,x8,eq
00bdb3d4	ldr x9,[sp, #0x18]
00bdb3d8	cmp x11,#0x5
00bdb3dc	str x0,[x9]
00bdb3e0	b.lt 0x00bdb540
00bdb3e4	cbz x8,0x00bdb540
00bdb3e8	sub x8,x12,#0x4
00bdb3ec	add x9,sp,#0x38
00bdb3f0	cmp x9,x8
00bdb3f4	cset w11,cc
00bdb3f8	cmp x9,x12
00bdb3fc	b.eq 0x00bdb4ac
00bdb400	cbz w11,0x00bdb4ac
00bdb404	add x10,sp,#0x38
00bdb408	sub x14,x12,#0x8
00bdb40c	add x11,x10,#0x4
00bdb410	cmp x14,x11
00bdb414	csel x13,x14,x11,hi
00bdb418	sub x13,x13,#0x4
00bdb41c	cmp x13,x10
00bdb420	cinc x15,x10,ne
00bdb424	cmp x13,x10
00bdb428	sub x15,x13,x15
00bdb42c	lsr x15,x15,#0x3
00bdb430	cinc x13,x15,ne
00bdb434	cmp x13,#0x13
00bdb438	b.cc 0x00bdb480
00bdb43c	cmp x14,x11
00bdb440	csel x14,x14,x11,hi
00bdb444	sub x14,x14,#0x4
00bdb448	cmp x14,x10
00bdb44c	cinc x15,x10,ne
00bdb450	cmp x14,x10
00bdb454	sub x15,x14,x15
00bdb458	lsr x15,x15,#0x3
00bdb45c	cinc x14,x15,ne
00bdb460	cmp x10,x12
00bdb464	b.cs 0x00bdb624
00bdb468	lsl x14,x14,#0x2
00bdb46c	sub x15,x12,x14
00bdb470	add x11,x11,x14
00bdb474	sub x14,x15,#0x4
00bdb478	cmp x14,x11
00bdb47c	b.cs 0x00bdb624
00bdb480	mov x11,x8
00bdb484	add x10,x10,#0x4
00bdb488	ldr w12,[x11]
00bdb48c	ldur w13,[x10, #-0x4]
00bdb490	stur w12,[x10, #-0x4]
00bdb494	str w13,[x11], #-0x4
00bdb498	cmp x10,x11
00bdb49c	add x10,x10,#0x4
00bdb4a0	b.cc 0x00bdb488
00bdb4a4	ldurb w10,[x29, #-0x28]
00bdb4a8	and w13,w10,#0x1
00bdb4ac	ldr x11,[x26, #0x30]
00bdb4b0	cmp w13,#0x0
00bdb4b4	sub x12,x29,#0x28
00bdb4b8	csinc x11,x11,x12,ne
00bdb4bc	cmp x9,x8
00bdb4c0	b.cs 0x00bdb518
00bdb4c4	lsr w9,w10,#0x1
00bdb4c8	ldr x10,[x26, #0x28]
00bdb4cc	cmp w13,#0x0
00bdb4d0	csel x9,x9,x10,eq
00bdb4d4	add x10,sp,#0x38
00bdb4d8	add x9,x11,x9
00bdb4dc	b 0x00bdb4f8
00bdb4e0	sub x12,x9,x11
00bdb4e4	add x10,x10,#0x4
00bdb4e8	cmp x12,#0x1
00bdb4ec	cinc x11,x11,gt
00bdb4f0	cmp x10,x8
00bdb4f4	b.cs 0x00bdb518
00bdb4f8	ldrb w12,[x11]
00bdb4fc	cbz w12,0x00bdb4e0
00bdb500	cmp w12,#0xff
00bdb504	b.eq 0x00bdb4e0
00bdb508	ldr w13,[x10]
00bdb50c	cmp w13,w12
00bdb510	b.eq 0x00bdb4e0
00bdb514	b 0x00bdb538
00bdb518	ldrb w9,[x11]
00bdb51c	cbz w9,0x00bdb540
00bdb520	cmp w9,#0xff
00bdb524	b.eq 0x00bdb540
00bdb528	ldr w8,[x8]
00bdb52c	sub w8,w8,#0x1
00bdb530	cmp w8,w9
00bdb534	b.cc 0x00bdb540
00bdb538	mov w8,#0x4
00bdb53c	str w8,[x22]
00bdb540	cbz x19,0x00bdb5cc
00bdb544	ldp x8,x9,[x19, #0x18]
00bdb548	cmp x8,x9
00bdb54c	b.eq 0x00bdb5dc
00bdb550	mov w20,wzr
00bdb554	cbz x21,0x00bdb5d4
00bdb558	ldp x8,x9,[x21, #0x18]
00bdb55c	cmp x8,x9
00bdb560	b.eq 0x00bdb600
00bdb564	tbnz w20,#0x0,0x00bdb574
00bdb568	ldr w8,[x22]
00bdb56c	orr w8,w8,#0x2
00bdb570	str w8,[x22]
00bdb574	ldurb w8,[x29, #-0x40]
00bdb578	tbz w8,#0x0,0x00bdb58c
00bdb57c	ldr x8,[x26, #0x8]
00bdb580	ldr x0,[x26, #0x18]
00bdb584	and x1,x8,#-0x2
00bdb588	bl 0x00c2fe80
00bdb58c	ldurb w8,[x29, #-0x28]
00bdb590	tbz w8,#0x0,0x00bdb5a4
00bdb594	ldr x8,[x26, #0x20]
00bdb598	ldr x0,[x26, #0x30]
00bdb59c	and x1,x8,#-0x2
00bdb5a0	bl 0x00c2fe80
00bdb5a4	mov x0,x19
00bdb5a8	ldp x20,x19,[sp, #0x170]
00bdb5ac	ldp x22,x21,[sp, #0x160]
00bdb5b0	ldp x24,x23,[sp, #0x150]
00bdb5b4	ldp x26,x25,[sp, #0x140]
00bdb5b8	ldp x28,x27,[sp, #0x130]
00bdb5bc	ldp x29,x30,[sp, #0x120]
00bdb5c0	add sp,sp,#0x180
00bdb5c4	autiasp
00bdb5c8	ret
00bdb5cc	mov w20,#0x1
00bdb5d0	cbnz x21,0x00bdb558
00bdb5d4	tbnz w20,#0x0,0x00bdb568
00bdb5d8	b 0x00bdb574
00bdb5dc	ldr x8,[x19]
00bdb5e0	ldr x8,[x8, #0x48]
00bdb5e4	mov x0,x19
00bdb5e8	blr x8
00bdb5ec	cmn w0,#0x1
00bdb5f0	cset w20,eq
00bdb5f4	csel x19,xzr,x19,eq
00bdb5f8	cbnz x21,0x00bdb558
00bdb5fc	b 0x00bdb5d4
00bdb600	ldr x8,[x21]
00bdb604	ldr x8,[x8, #0x48]
00bdb608	mov x0,x21
00bdb60c	blr x8
00bdb610	cmn w0,#0x1
00bdb614	cset w8,eq
00bdb618	eor w8,w20,w8
00bdb61c	tbz w8,#0x0,0x00bdb568
00bdb620	b 0x00bdb574
00bdb624	add x13,x13,#0x1
00bdb628	add x15,sp,#0x38
00bdb62c	sub x12,x12,#0x10
00bdb630	and x14,x13,#0x7ffffffffffffff8
00bdb634	lsl x10,x14,#0x2
00bdb638	mov x16,x14
00bdb63c	sub x11,x8,x10
00bdb640	add x10,x15,x10
00bdb644	add x15,x15,#0x10
00bdb648	ldp q1,q0,[x12, #-0x10]
00bdb64c	sub x16,x16,#0x8
00bdb650	ldp q2,q3,[x15, #-0x10]
00bdb654	rev64 v0.4S,v0.4S
00bdb658	rev64 v1.4S,v1.4S
00bdb65c	rev64 v2.4S,v2.4S
00bdb660	rev64 v3.4S,v3.4S
00bdb664	ext v0.16B,v0.16B,v0.16B,0x8
00bdb668	ext v1.16B,v1.16B,v1.16B,0x8
00bdb66c	ext v2.16B,v2.16B,v2.16B,0x8
00bdb670	ext v3.16B,v3.16B,v3.16B,0x8
00bdb674	stp q0,q1,[x15, #-0x10]
00bdb678	add x15,x15,#0x20
00bdb67c	stp q3,q2,[x12, #-0x10]
00bdb680	sub x12,x12,#0x20
00bdb684	cbnz x16,0x00bdb648
00bdb688	cmp x13,x14
00bdb68c	b.eq 0x00bdb4a4
00bdb690	b 0x00bdb484
