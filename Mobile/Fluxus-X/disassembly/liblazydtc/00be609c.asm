; std::__ndk1::num_put<wchar_t,std::__ndk1::ostreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>::do_put @ 00be609c
00be609c	bti c
00be60a0	adrp x4,0x2ab000
00be60a4	add x4,x4,#0x32c
00be60a8	b 0x00be60ac
00be60ac	paciasp
00be60b0	sub sp,sp,#0x1a0
00be60b4	str d8,[sp, #0x130]
00be60b8	stp x29,x30,[sp, #0x140]
00be60bc	stp x28,x27,[sp, #0x150]
00be60c0	stp x26,x25,[sp, #0x160]
00be60c4	stp x24,x23,[sp, #0x170]
00be60c8	stp x22,x21,[sp, #0x180]
00be60cc	stp x20,x19,[sp, #0x190]
00be60d0	add x29,sp,#0x140
00be60d4	fmov d8,d0
00be60d8	ldr w9,[x2, #0x8]
00be60dc	mov w8,#0x25
00be60e0	mov w19,w3
00be60e4	mov x20,x2
00be60e8	mov x21,x1
00be60ec	stur x8,[x29, #-0x8]
00be60f0	sub x8,x29,#0x8
00be60f4	tbnz w9,#0xb,0x00be6104
00be60f8	orr x8,x8,#0x1
00be60fc	tbnz w9,#0xa,0x00be6114
00be6100	b 0x00be611c
00be6104	mov w10,#0x2b
00be6108	orr x8,x8,#0x2
00be610c	sturb w10,[x29, #-0x7]
00be6110	tbz w9,#0xa,0x00be611c
00be6114	mov w10,#0x23
00be6118	strb w10,[x8], #0x1
00be611c	mov w10,#0x104
00be6120	and w22,w9,w10
00be6124	cmp w22,#0x104
00be6128	b.eq 0x00be6134
00be612c	mov w10,#0x2a2e
00be6130	strh w10,[x8], #0x2
00be6134	ldrb w10,[x4]
00be6138	cbz w10,0x00be614c
00be613c	add x11,x4,#0x1
00be6140	strb w10,[x8], #0x1
00be6144	ldrb w10,[x11], #0x1
00be6148	cbnz w10,0x00be6140
00be614c	cmp w22,#0x100
00be6150	b.eq 0x00be616c
00be6154	cmp w22,#0x4
00be6158	b.ne 0x00be617c
00be615c	tst w9,#0x4000
00be6160	mov w9,#0x46
00be6164	mov w10,#0x66
00be6168	b 0x00be61e4
00be616c	tst w9,#0x4000
00be6170	mov w9,#0x45
00be6174	mov w10,#0x65
00be6178	b 0x00be61e4
00be617c	cmp w22,#0x104
00be6180	b.ne 0x00be61d8
00be6184	tst w9,#0x4000
00be6188	mov w9,#0x41
00be618c	mov w10,#0x61
00be6190	csel w9,w10,w9,eq
00be6194	sub x10,x29,#0x2e
00be6198	adrp x22,0xd27000
00be619c	strb w9,[x8]
00be61a0	adrp x8,0xd27000
00be61a4	add x8,x8,#0xf8
00be61a8	stur x10,[x29, #-0x38]
00be61ac	ldarb w8,[x8]
00be61b0	tbz w8,#0x0,0x00be647c
00be61b4	fmov d0,d8
00be61b8	ldr x2,[x22, #0xf0]
00be61bc	sub x0,x29,#0x2e
00be61c0	sub x3,x29,#0x8
00be61c4	mov w1,#0x1e
00be61c8	bl 0x00c0cd14
00be61cc	cmp w0,#0x1d
00be61d0	b.gt 0x00be6234
00be61d4	b 0x00be6260
00be61d8	tst w9,#0x4000
00be61dc	mov w9,#0x47
00be61e0	mov w10,#0x67
00be61e4	csel w9,w10,w9,eq
00be61e8	adrp x23,0xd27000
00be61ec	add x23,x23,#0xf8
00be61f0	strb w9,[x8]
00be61f4	sub x8,x29,#0x2e
00be61f8	stur x8,[x29, #-0x38]
00be61fc	ldarb w8,[x23]
00be6200	tbz w8,#0x0,0x00be63c8
00be6204	fmov d0,d8
00be6208	adrp x24,0xd27000
00be620c	ldr w4,[x20, #0x10]
00be6210	ldr x2,[x24, #0xf0]
00be6214	sub x0,x29,#0x2e
00be6218	sub x3,x29,#0x8
00be621c	mov w1,#0x1e
00be6220	bl 0x00c0cd14
00be6224	cmp w0,#0x1d
00be6228	b.le 0x00be6260
00be622c	cmp w22,#0x104
00be6230	b.ne 0x00be6268
00be6234	adrp x8,0xd27000
00be6238	add x8,x8,#0xf8
00be623c	ldarb w8,[x8]
00be6240	tbz w8,#0x0,0x00be6408
00be6244	adrp x8,0xd27000
00be6248	ldr x1,[x8, #0xf0]
00be624c	fmov d0,d8
00be6250	sub x0,x29,#0x38
00be6254	sub x2,x29,#0x8
00be6258	bl 0x00c0cdd4
00be625c	b 0x00be6288
00be6260	mov x22,xzr
00be6264	b 0x00be6294
00be6268	ldarb w8,[x23]
00be626c	tbz w8,#0x0,0x00be6444
00be6270	ldr x1,[x24, #0xf0]
00be6274	ldr w3,[x20, #0x10]
00be6278	fmov d0,d8
00be627c	sub x0,x29,#0x38
00be6280	sub x2,x29,#0x8
00be6284	bl 0x00c0cdd4
00be6288	cmn w0,#0x1
00be628c	b.eq 0x00be6404
00be6290	ldur x22,[x29, #-0x38]
00be6294	ldr w9,[x20, #0x8]
00be6298	ldur x23,[x29, #-0x38]
00be629c	sxtw x8,w0
00be62a0	mov w10,#0xb0
00be62a4	and w9,w9,w10
00be62a8	add x25,x23,x8
00be62ac	cmp w9,#0x20
00be62b0	mov x26,x25
00be62b4	b.eq 0x00be6308
00be62b8	cmp w9,#0x10
00be62bc	b.ne 0x00be6304
00be62c0	ldrb w9,[x23]
00be62c4	cmp w9,#0x2d
00be62c8	b.eq 0x00be62d4
00be62cc	cmp w9,#0x2b
00be62d0	b.ne 0x00be62dc
00be62d4	add x26,x23,#0x1
00be62d8	b 0x00be6308
00be62dc	cmp w8,#0x2
00be62e0	b.lt 0x00be6304
00be62e4	cmp w9,#0x30
00be62e8	b.ne 0x00be6304
00be62ec	ldrb w9,[x23, #0x1]
00be62f0	orr w9,w9,#0x20
00be62f4	cmp w9,#0x78
00be62f8	b.ne 0x00be6304
00be62fc	add x26,x23,#0x2
00be6300	b 0x00be6308
00be6304	mov x26,x23
00be6308	sub x9,x29,#0x2e
00be630c	cmp x23,x9
00be6310	b.eq 0x00be632c
00be6314	lsl x0,x8,#0x3
00be6318	bl 0x00c308d0
00be631c	mov x24,x0
00be6320	mov x27,x0
00be6324	cbnz x0,0x00be6334
00be6328	bl 0x00c43cc0
00be632c	mov x24,xzr
00be6330	add x27,sp,#0x24
00be6334	add x8,sp,#0x8
00be6338	mov x0,x20
00be633c	bl 0x00c30070
00be6340	add x4,sp,#0x18
00be6344	add x5,sp,#0x10
00be6348	add x6,sp,#0x8
00be634c	mov x0,x23
00be6350	mov x1,x26
00be6354	mov x2,x25
00be6358	mov x3,x27
00be635c	bl 0x00c44180
00be6360	add x0,sp,#0x8
00be6364	bl 0x00c30090
00be6368	ldp x3,x2,[sp, #0x10]
00be636c	mov x0,x21
00be6370	mov x1,x27
00be6374	mov x4,x20
00be6378	mov w5,w19
00be637c	bl 0x00be6bec
00be6380	mov x19,x0
00be6384	cbz x24,0x00be6390
00be6388	mov x0,x24
00be638c	bl 0x00c30960
00be6390	cbz x22,0x00be639c
00be6394	mov x0,x22
00be6398	bl 0x00c30960
00be639c	mov x0,x19
00be63a0	ldp x20,x19,[sp, #0x190]
00be63a4	ldr d8,[sp, #0x130]
00be63a8	ldp x22,x21,[sp, #0x180]
00be63ac	ldp x24,x23,[sp, #0x170]
00be63b0	ldp x26,x25,[sp, #0x160]
00be63b4	ldp x28,x27,[sp, #0x150]
00be63b8	ldp x29,x30,[sp, #0x140]
00be63bc	add sp,sp,#0x1a0
00be63c0	autiasp
00be63c4	ret
00be63c8	adrp x0,0xd27000
00be63cc	add x0,x0,#0xf8
00be63d0	bl 0x00c2fe90
00be63d4	cbz w0,0x00be6204
00be63d8	adrp x1,0x2c6000
00be63dc	add x1,x1,#0xbfc
00be63e0	mov w0,#0x1fbf
00be63e4	mov x2,xzr
00be63e8	bl 0x00c43890
00be63ec	adrp x8,0xd27000
00be63f0	str x0,[x8, #0xf0]
00be63f4	adrp x0,0xd27000
00be63f8	add x0,x0,#0xf8
00be63fc	bl 0x00c2fea0
00be6400	b 0x00be6204
00be6404	bl 0x00c43cc0
00be6408	adrp x0,0xd27000
00be640c	add x0,x0,#0xf8
00be6410	bl 0x00c2fe90
00be6414	cbz w0,0x00be6244
00be6418	adrp x1,0x2c6000
00be641c	add x1,x1,#0xbfc
00be6420	mov w0,#0x1fbf
00be6424	mov x2,xzr
00be6428	bl 0x00c43890
00be642c	adrp x8,0xd27000
00be6430	str x0,[x8, #0xf0]
00be6434	adrp x0,0xd27000
00be6438	add x0,x0,#0xf8
00be643c	bl 0x00c2fea0
00be6440	b 0x00be6244
00be6444	adrp x0,0xd27000
00be6448	add x0,x0,#0xf8
00be644c	bl 0x00c2fe90
00be6450	cbz w0,0x00be6270
00be6454	adrp x1,0x2c6000
00be6458	add x1,x1,#0xbfc
00be645c	mov w0,#0x1fbf
00be6460	mov x2,xzr
00be6464	bl 0x00c43890
00be6468	str x0,[x24, #0xf0]
00be646c	adrp x0,0xd27000
00be6470	add x0,x0,#0xf8
00be6474	bl 0x00c2fea0
00be6478	b 0x00be6270
00be647c	adrp x0,0xd27000
00be6480	add x0,x0,#0xf8
00be6484	bl 0x00c2fe90
00be6488	cbz w0,0x00be61b4
00be648c	adrp x1,0x2c6000
00be6490	add x1,x1,#0xbfc
00be6494	mov w0,#0x1fbf
00be6498	mov x2,xzr
00be649c	bl 0x00c43890
00be64a0	str x0,[x22, #0xf0]
00be64a4	adrp x0,0xd27000
00be64a8	add x0,x0,#0xf8
00be64ac	bl 0x00c2fea0
00be64b0	b 0x00be61b4
