; ossl_statem_client_read_transition @ 009db244
009db244	str x19,[sp, #-0x20]!
009db248	stp x29,x30,[sp, #0x10]
009db24c	ldr x9,[x0, #0x8]
009db250	mov x19,x0
009db254	add x29,sp,#0x10
009db258	ldr x8,[x9, #0xc0]
009db25c	ldr w8,[x8, #0x60]
009db260	tbnz w8,#0x3,0x009db2b8
009db264	ldr w9,[x9]
009db268	cmp w9,#0x304
009db26c	b.lt 0x009db2b8
009db270	cmp w9,#0x10, LSL #12
009db274	b.eq 0x009db2b8
009db278	ldr w8,[x19, #0x5c]
009db27c	sub w8,w8,#0x1
009db280	cmp w8,#0x26
009db284	b.hi 0x009db580
009db288	adrp x9,0x74d000
009db28c	add x9,x9,#0x90
009db290	ldrsw x8,[x9, x8, LSL #0x2]
009db294	add x8,x8,x9
009db298	br x8
009db29c	cmp w1,#0x18
009db2a0	b.eq 0x009db504
009db2a4	cmp w1,#0xd
009db2a8	b.eq 0x009db50c
009db2ac	cmp w1,#0x4
009db2b0	b.eq 0x009db300
009db2b4	b 0x009db580
009db2b8	ldr w9,[x19, #0x5c]
009db2bc	sub w9,w9,#0x1
009db2c0	cmp w9,#0x2d
009db2c4	b.hi 0x009db544
009db2c8	adrp x10,0x74d000
009db2cc	add x10,x10,#0x12c
009db2d0	ldrsw x9,[x10, x9, LSL #0x2]
009db2d4	add x9,x9,x10
009db2d8	br x9
009db2dc	cbnz w1,0x009db544
009db2e0	mov w8,#0x29
009db2e4	b 0x009db530
009db2e8	ldr w9,[x19, #0x4d0]
009db2ec	cbz w9,0x009db444
009db2f0	ldr w9,[x19, #0xa98]
009db2f4	cbz w9,0x009db308
009db2f8	cmp w1,#0x4
009db2fc	b.ne 0x009db544
009db300	mov w8,#0x9
009db304	b 0x009db530
009db308	cmp w1,#0x101
009db30c	b.ne 0x009db580
009db310	mov w8,#0xa
009db314	b 0x009db530
009db318	cmp w1,#0x16
009db31c	b.ne 0x009db330
009db320	ldr w9,[x19, #0xa74]
009db324	cbz w9,0x009db330
009db328	mov w8,#0x5
009db32c	b 0x009db530
009db330	ldr x9,[x19, #0x2e0]
009db334	mov w10,#0x1a6
009db338	ldr w9,[x9, #0x1c]
009db33c	tst w9,w10
009db340	b.eq 0x009db38c
009db344	cmp w1,#0xc
009db348	b.eq 0x009db3a0
009db34c	b 0x009db544
009db350	cmp w1,#0xe
009db354	b.ne 0x009db544
009db358	b 0x009db4fc
009db35c	cmp w1,#0x14
009db360	b.eq 0x009db43c
009db364	b 0x009db544
009db368	cmp w1,#0x2
009db36c	b.eq 0x009db424
009db370	cmp w1,#0x3
009db374	b.ne 0x009db544
009db378	tbnz w8,#0x3,0x009db450
009db37c	b 0x009db544
009db380	cmp w1,#0x2
009db384	b.eq 0x009db424
009db388	b 0x009db544
009db38c	cmp w1,#0xc
009db390	b.ne 0x009db3a8
009db394	mov w10,#0x1c8
009db398	and w9,w9,w10
009db39c	cbz w9,0x009db3a8
009db3a0	orr w8,wzr,#0x6
009db3a4	b 0x009db530
009db3a8	cmp w1,#0xe
009db3ac	b.eq 0x009db4fc
009db3b0	cmp w1,#0xd
009db3b4	b.ne 0x009db544
009db3b8	ldr x8,[x19, #0x2e0]
009db3bc	ldr w9,[x19]
009db3c0	mov w11,#0x50
009db3c4	ldr w10,[x8, #0x20]
009db3c8	cmp w9,#0x301
009db3cc	cset w8,lt
009db3d0	tst w10,#0x4
009db3d4	cset w9,eq
009db3d8	tst w10,w11
009db3dc	b.ne 0x009db580
009db3e0	orr w8,w8,w9
009db3e4	cbnz w8,0x009db52c
009db3e8	b 0x009db580
009db3ec	cmp w1,#0x8
009db3f0	b.ne 0x009db580
009db3f4	mov w8,#0x26
009db3f8	b 0x009db530
009db3fc	cmp w1,#0xf
009db400	b.ne 0x009db580
009db404	mov w8,#0x27
009db408	b 0x009db530
009db40c	cmp w1,#0xb
009db410	b.ne 0x009db580
009db414	mov w8,#0x4
009db418	b 0x009db530
009db41c	cmp w1,#0x2
009db420	b.ne 0x009db580
009db424	orr w8,wzr,#0x3
009db428	b 0x009db530
009db42c	ldr w8,[x19, #0x4d0]
009db430	cbz w8,0x009db458
009db434	cmp w1,#0x14
009db438	b.ne 0x009db580
009db43c	mov w8,#0xb
009db440	b 0x009db530
009db444	cmp w1,#0x3
009db448	b.ne 0x009db46c
009db44c	tbz w8,#0x3,0x009db46c
009db450	mov w8,#0x2
009db454	b 0x009db530
009db458	cmp w1,#0xb
009db45c	b.eq 0x009db414
009db460	cmp w1,#0xd
009db464	b.eq 0x009db52c
009db468	b 0x009db580
009db46c	ldr w9,[x19]
009db470	cmp w9,#0x301
009db474	b.lt 0x009db4a8
009db478	ldr x10,[x19, #0xaf8]
009db47c	cbz x10,0x009db4a8
009db480	cmp w1,#0x101
009db484	b.ne 0x009db4a8
009db488	ldr x10,[x19, #0x918]
009db48c	ldr x10,[x10, #0x338]
009db490	cbz x10,0x009db4a8
009db494	mov w0,#0x1
009db498	mov w8,#0xa
009db49c	str w0,[x19, #0x4d0]
009db4a0	str w8,[x19, #0x5c]
009db4a4	b 0x009db5b4
009db4a8	ldr x11,[x19, #0x2e0]
009db4ac	mov w12,#0x54
009db4b0	ldr w10,[x11, #0x20]
009db4b4	tst w10,w12
009db4b8	b.eq 0x009db53c
009db4bc	ldr w11,[x11, #0x1c]
009db4c0	mov w12,#0x1a6
009db4c4	tst w11,w12
009db4c8	b.ne 0x009db344
009db4cc	cmp w1,#0xc
009db4d0	b.ne 0x009db4e0
009db4d4	mov w12,#0x1c8
009db4d8	and w11,w11,w12
009db4dc	cbnz w11,0x009db3a0
009db4e0	cmp w1,#0xe
009db4e4	b.eq 0x009db4fc
009db4e8	cmp w1,#0xd
009db4ec	b.ne 0x009db544
009db4f0	cmp w9,#0x301
009db4f4	mov w11,#0x50
009db4f8	b 0x009db3cc
009db4fc	mov w8,#0x8
009db500	b 0x009db530
009db504	mov w8,#0x2d
009db508	b 0x009db530
009db50c	ldr w8,[x19, #0xba8]
009db510	cmp w8,#0x1
009db514	b.ne 0x009db580
009db518	mov w8,#0x4
009db51c	mov x0,x19
009db520	str w8,[x19, #0xba8]
009db524	bl 0x00c371c0
009db528	cbz w0,0x009db580
009db52c	orr w8,wzr,#0x7
009db530	str w8,[x19, #0x5c]
009db534	mov w0,#0x1
009db538	b 0x009db5b4
009db53c	cmp w1,#0xb
009db540	b.eq 0x009db414
009db544	cmp w1,#0x101
009db548	b.ne 0x009db580
009db54c	tbz w8,#0x3,0x009db580
009db550	orr w8,wzr,#0x3
009db554	mov x0,x19
009db558	str xzr,[x19, #0x98]
009db55c	str w8,[x19, #0x28]
009db560	bl 0x00c34300
009db564	orr w1,wzr,#0xf
009db568	mov x19,x0
009db56c	bl 0x00c32190
009db570	mov w1,#0x9
009db574	mov x0,x19
009db578	bl 0x00c322a0
009db57c	b 0x009db5b0
009db580	bl 0x00c342a0
009db584	adrp x0,0x2d7000
009db588	adrp x2,0x2a3000
009db58c	add x0,x0,#0xb1a
009db590	add x2,x2,#0xd84
009db594	mov w1,#0x18e
009db598	bl 0x00c342b0
009db59c	mov w1,#0xa
009db5a0	mov w2,#0xf4
009db5a4	mov x0,x19
009db5a8	mov x3,xzr
009db5ac	bl 0x00c34410
009db5b0	mov w0,wzr
009db5b4	ldp x29,x30,[sp, #0x10]
009db5b8	ldr x19,[sp], #0x20
009db5bc	ret
