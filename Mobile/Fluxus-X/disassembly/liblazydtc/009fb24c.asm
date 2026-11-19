; BIO_parse_hostserv @ 009fb24c
009fb24c	stp x26,x25,[sp, #-0x50]!
009fb250	stp x24,x23,[sp, #0x10]
009fb254	stp x22,x21,[sp, #0x20]
009fb258	stp x20,x19,[sp, #0x30]
009fb25c	stp x29,x30,[sp, #0x40]
009fb260	ldrb w8,[x0]
009fb264	mov x19,x2
009fb268	mov x21,x0
009fb26c	mov x20,x1
009fb270	cmp w8,#0x5b
009fb274	add x29,sp,#0x40
009fb278	b.ne 0x009fb2bc
009fb27c	mov w1,#0x5d
009fb280	mov x0,x21
009fb284	bl 0x00c30890
009fb288	cbz x0,0x009fb370
009fb28c	ldrb w8,[x0, #0x1]
009fb290	add x21,x21,#0x1
009fb294	sub x22,x0,x21
009fb298	cbz w8,0x009fb3b8
009fb29c	cmp w8,#0x3a
009fb2a0	b.ne 0x009fb370
009fb2a4	add x23,x0,#0x2
009fb2a8	mov x0,x23
009fb2ac	bl 0x00c2ff50
009fb2b0	mov x24,x0
009fb2b4	mov w25,#0x1
009fb2b8	b 0x009fb360
009fb2bc	mov w1,#0x3a
009fb2c0	mov x0,x21
009fb2c4	mov w23,w3
009fb2c8	bl 0x00c31d40
009fb2cc	mov x22,x0
009fb2d0	mov w1,#0x3a
009fb2d4	mov x0,x21
009fb2d8	bl 0x00c30890
009fb2dc	cmp x0,x22
009fb2e0	b.eq 0x009fb30c
009fb2e4	bl 0x00c342a0
009fb2e8	adrp x0,0x2cd000
009fb2ec	adrp x2,0x2cb000
009fb2f0	add x0,x0,#0x866
009fb2f4	add x2,x2,#0x710
009fb2f8	mov w1,#0x22d
009fb2fc	bl 0x00c342b0
009fb300	mov w0,#0x20
009fb304	mov w1,#0x81
009fb308	b 0x009fb394
009fb30c	cbz x22,0x009fb330
009fb310	add x23,x22,#0x1
009fb314	mov x0,x23
009fb318	sub x26,x22,x21
009fb31c	bl 0x00c2ff50
009fb320	mov x22,x0
009fb324	mov x0,x21
009fb328	mov x21,x23
009fb32c	b 0x009fb348
009fb330	mov x0,x21
009fb334	bl 0x00c2ff50
009fb338	mov x22,x0
009fb33c	cbz w23,0x009fb3b8
009fb340	mov x0,xzr
009fb344	mov x26,xzr
009fb348	cmp x21,#0x0
009fb34c	cset w25,ne
009fb350	mov x24,x22
009fb354	mov x23,x21
009fb358	mov x22,x26
009fb35c	mov x21,x0
009fb360	mov w1,#0x3a
009fb364	mov x0,x23
009fb368	bl 0x00c30890
009fb36c	cbz x0,0x009fb3c4
009fb370	bl 0x00c342a0
009fb374	adrp x0,0x2cd000
009fb378	adrp x2,0x2cb000
009fb37c	add x0,x0,#0x866
009fb380	add x2,x2,#0x710
009fb384	mov w1,#0x230
009fb388	bl 0x00c342b0
009fb38c	mov w0,#0x20
009fb390	mov w1,#0x82
009fb394	mov x2,xzr
009fb398	bl 0x00c342c0
009fb39c	mov w0,wzr
009fb3a0	ldp x29,x30,[sp, #0x40]
009fb3a4	ldp x20,x19,[sp, #0x30]
009fb3a8	ldp x22,x21,[sp, #0x20]
009fb3ac	ldp x24,x23,[sp, #0x10]
009fb3b0	ldp x26,x25,[sp], #0x50
009fb3b4	ret
009fb3b8	mov w25,wzr
009fb3bc	mov x24,xzr
009fb3c0	mov x23,xzr
009fb3c4	cbz x20,0x009fb40c
009fb3c8	cbz x21,0x009fb40c
009fb3cc	cbz x22,0x009fb3e4
009fb3d0	cmp x22,#0x1
009fb3d4	b.ne 0x009fb3ec
009fb3d8	ldrb w8,[x21]
009fb3dc	cmp w8,#0x2a
009fb3e0	b.ne 0x009fb3ec
009fb3e4	str xzr,[x20]
009fb3e8	b 0x009fb40c
009fb3ec	adrp x2,0x2cd000
009fb3f0	add x2,x2,#0x866
009fb3f4	mov w3,#0x21b
009fb3f8	mov x0,x21
009fb3fc	mov x1,x22
009fb400	bl 0x00c36180
009fb404	str x0,[x20]
009fb408	cbz x0,0x009fb468
009fb40c	cmp x19,#0x0
009fb410	cset w8,eq
009fb414	eor w9,w25,#0x1
009fb418	orr w8,w8,w9
009fb41c	tbnz w8,#0x0,0x009fb460
009fb420	cbz x24,0x009fb438
009fb424	cmp x24,#0x1
009fb428	b.ne 0x009fb440
009fb42c	ldrb w8,[x23]
009fb430	cmp w8,#0x2a
009fb434	b.ne 0x009fb440
009fb438	str xzr,[x19]
009fb43c	b 0x009fb460
009fb440	adrp x2,0x2cd000
009fb444	add x2,x2,#0x866
009fb448	mov w3,#0x225
009fb44c	mov x0,x23
009fb450	mov x1,x24
009fb454	bl 0x00c36180
009fb458	str x0,[x19]
009fb45c	cbz x0,0x009fb468
009fb460	mov w0,#0x1
009fb464	b 0x009fb3a0
009fb468	bl 0x00c342a0
009fb46c	adrp x0,0x2cd000
009fb470	adrp x2,0x2cb000
009fb474	add x0,x0,#0x866
009fb478	add x2,x2,#0x710
009fb47c	mov w1,#0x233
009fb480	bl 0x00c342b0
009fb484	mov w1,#0x100
009fb488	mov w0,#0x20
009fb48c	movk w1,#0xc, LSL #16
009fb490	b 0x009fb394
