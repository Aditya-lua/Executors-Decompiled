; d2i_SSL_SESSION @ 009bf1c8
009bf1c8	str x23,[sp, #-0x40]!
009bf1cc	stp x22,x21,[sp, #0x10]
009bf1d0	stp x20,x19,[sp, #0x20]
009bf1d4	stp x29,x30,[sp, #0x30]
009bf1d8	ldr x8,[x1]
009bf1dc	adrp x3,0xc57000
009bf1e0	mov x22,x1
009bf1e4	mov x19,x0
009bf1e8	add x3,x3,#0x3d8
009bf1ec	add x1,sp,#0x8
009bf1f0	mov x0,xzr
009bf1f4	add x29,sp,#0x30
009bf1f8	str x8,[sp, #0x8]
009bf1fc	bl 0x00c36150
009bf200	mov x21,x0
009bf204	cbz x0,0x009bf2b8
009bf208	cbz x19,0x009bf214
009bf20c	ldr x20,[x19]
009bf210	cbnz x20,0x009bf220
009bf214	bl 0x00c360a0
009bf218	mov x20,x0
009bf21c	cbz x0,0x009bf33c
009bf220	ldr w8,[x21]
009bf224	cmp w8,#0x1
009bf228	b.ne 0x009bf2c0
009bf22c	ldr w8,[x21, #0x4]
009bf230	asr w9,w8,#0x8
009bf234	cmp w9,#0x3
009bf238	b.eq 0x009bf24c
009bf23c	cmp w9,#0xfe
009bf240	b.eq 0x009bf24c
009bf244	cmp w8,#0x100
009bf248	b.ne 0x009bf310
009bf24c	str w8,[x20]
009bf250	ldr w8,[x21, #0xb8]
009bf254	str w8,[x20, #0x308]
009bf258	ldr x8,[x21, #0x8]
009bf25c	ldr w9,[x8]
009bf260	cmp w9,#0x2
009bf264	b.ne 0x009bf2e8
009bf268	ldr x8,[x8, #0x8]
009bf26c	ldrb w9,[x8]
009bf270	ldrb w8,[x8, #0x1]
009bf274	bfm x8,x9,#0x38,#0x7
009bf278	orr x0,x8,#0x3000000
009bf27c	str x0,[x20, #0x300]
009bf280	bl 0x00c34860
009bf284	str x0,[x20, #0x2f8]
009bf288	cbz x0,0x009bf33c
009bf28c	ldr x23,[x21, #0x20]
009bf290	cbz x23,0x009bf380
009bf294	ldrsw x2,[x23]
009bf298	cbz w2,0x009bf380
009bf29c	cmp w2,#0x20
009bf2a0	b.hi 0x009bf33c
009bf2a4	ldr x1,[x23, #0x8]
009bf2a8	add x0,x20,#0x258
009bf2ac	bl 0x00c2ffd0
009bf2b0	ldrsw x8,[x23]
009bf2b4	b 0x009bf384
009bf2b8	mov x20,xzr
009bf2bc	b 0x009bf33c
009bf2c0	bl 0x00c342a0
009bf2c4	adrp x0,0x2c5000
009bf2c8	adrp x2,0x2d5000
009bf2cc	add x0,x0,#0x69b
009bf2d0	add x2,x2,#0x8c6
009bf2d4	mov w1,#0x10a
009bf2d8	bl 0x00c342b0
009bf2dc	mov w0,#0x14
009bf2e0	orr w1,wzr,#0xfe
009bf2e4	b 0x009bf334
009bf2e8	bl 0x00c342a0
009bf2ec	adrp x0,0x2c5000
009bf2f0	adrp x2,0x2d5000
009bf2f4	add x0,x0,#0x69b
009bf2f8	add x2,x2,#0x8c6
009bf2fc	mov w1,#0x11a
009bf300	bl 0x00c342b0
009bf304	mov w0,#0x14
009bf308	mov w1,#0x89
009bf30c	b 0x009bf334
009bf310	bl 0x00c342a0
009bf314	adrp x0,0x2c5000
009bf318	adrp x2,0x2d5000
009bf31c	add x0,x0,#0x69b
009bf320	add x2,x2,#0x8c6
009bf324	mov w1,#0x111
009bf328	bl 0x00c342b0
009bf32c	mov w0,#0x14
009bf330	mov w1,#0x103
009bf334	mov x2,xzr
009bf338	bl 0x00c342c0
009bf33c	adrp x1,0xc57000
009bf340	add x1,x1,#0x3d8
009bf344	mov x0,x21
009bf348	bl 0x00c36160
009bf34c	cbz x19,0x009bf35c
009bf350	ldr x8,[x19]
009bf354	cmp x8,x20
009bf358	b.eq 0x009bf364
009bf35c	mov x0,x20
009bf360	bl 0x00c32870
009bf364	mov x20,xzr
009bf368	mov x0,x20
009bf36c	ldp x29,x30,[sp, #0x30]
009bf370	ldp x20,x19,[sp, #0x20]
009bf374	ldp x22,x21,[sp, #0x10]
009bf378	ldr x23,[sp], #0x40
009bf37c	ret
009bf380	mov x8,xzr
009bf384	str x8,[x20, #0x250]
009bf388	ldr x23,[x21, #0x18]
009bf38c	cbz x23,0x009bf3b4
009bf390	ldrsw x2,[x23]
009bf394	cbz w2,0x009bf3b4
009bf398	cmp w2,#0x200
009bf39c	b.hi 0x009bf33c
009bf3a0	ldr x1,[x23, #0x8]
009bf3a4	add x0,x20,#0x50
009bf3a8	bl 0x00c2ffd0
009bf3ac	ldrsw x8,[x23]
009bf3b0	b 0x009bf3b8
009bf3b4	mov x8,xzr
009bf3b8	str x8,[x20, #0x8]
009bf3bc	ldr x0,[x21, #0x30]
009bf3c0	cbnz x0,0x009bf3c8
009bf3c4	bl 0x00c30970
009bf3c8	str x0,[x20, #0x2e0]
009bf3cc	ldr x8,[x21, #0x38]
009bf3d0	orr w9,wzr,#0x3
009bf3d4	mov x0,x20
009bf3d8	cmp x8,#0x0
009bf3dc	csel x8,x9,x8,eq
009bf3e0	str x8,[x20, #0x2d8]
009bf3e4	bl 0x00c36110
009bf3e8	ldr x0,[x20, #0x2b8]
009bf3ec	bl 0x00c31a90
009bf3f0	ldr x8,[x21, #0x40]
009bf3f4	str x8,[x20, #0x2b8]
009bf3f8	ldr x23,[x21, #0x48]
009bf3fc	str xzr,[x21, #0x40]
009bf400	cbz x23,0x009bf428
009bf404	ldrsw x2,[x23]
009bf408	cbz w2,0x009bf428
009bf40c	cmp w2,#0x20
009bf410	b.hi 0x009bf33c
009bf414	ldr x1,[x23, #0x8]
009bf418	add x0,x20,#0x280
009bf41c	bl 0x00c2ffd0
009bf420	ldrsw x8,[x23]
009bf424	b 0x009bf42c
009bf428	mov x8,xzr
009bf42c	str x8,[x20, #0x278]
009bf430	ldrsw x8,[x21, #0x50]
009bf434	ldr x0,[x20, #0x330]
009bf438	adrp x1,0x2c5000
009bf43c	add x1,x1,#0x69b
009bf440	str x8,[x20, #0x2c8]
009bf444	ldr x23,[x21, #0x58]
009bf448	mov w2,#0xd9
009bf44c	bl 0x00c32310
009bf450	str xzr,[x20, #0x330]
009bf454	cbz x23,0x009bf478
009bf458	ldr x0,[x23, #0x8]
009bf45c	ldrsw x1,[x23]
009bf460	adrp x2,0x2c5000
009bf464	add x2,x2,#0x69b
009bf468	mov w3,#0xdd
009bf46c	bl 0x00c36180
009bf470	str x0,[x20, #0x330]
009bf474	cbz x0,0x009bf33c
009bf478	ldr x0,[x20, #0x2a0]
009bf47c	ldr x23,[x21, #0x78]
009bf480	adrp x1,0x2c5000
009bf484	add x1,x1,#0x69b
009bf488	mov w2,#0xd9
009bf48c	bl 0x00c32310
009bf490	str xzr,[x20, #0x2a0]
009bf494	cbz x23,0x009bf4b8
009bf498	ldr x0,[x23, #0x8]
009bf49c	ldrsw x1,[x23]
009bf4a0	adrp x2,0x2c5000
009bf4a4	add x2,x2,#0x69b
009bf4a8	mov w3,#0xdd
009bf4ac	bl 0x00c36180
009bf4b0	str x0,[x20, #0x2a0]
009bf4b4	cbz x0,0x009bf33c
009bf4b8	ldr x0,[x20, #0x2a8]
009bf4bc	ldr x23,[x21, #0x80]
009bf4c0	adrp x1,0x2c5000
009bf4c4	add x1,x1,#0x69b
009bf4c8	mov w2,#0xd9
009bf4cc	bl 0x00c32310
009bf4d0	str xzr,[x20, #0x2a8]
009bf4d4	cbz x23,0x009bf4f8
009bf4d8	ldr x0,[x23, #0x8]
009bf4dc	ldrsw x1,[x23]
009bf4e0	adrp x2,0x2c5000
009bf4e4	add x2,x2,#0x69b
009bf4e8	mov w3,#0xdd
009bf4ec	bl 0x00c36180
009bf4f0	str x0,[x20, #0x2a8]
009bf4f4	cbz x0,0x009bf33c
009bf4f8	ldr x8,[x21, #0x60]
009bf4fc	ldr x0,[x20, #0x338]
009bf500	adrp x1,0x2c5000
009bf504	add x1,x1,#0x69b
009bf508	str x8,[x20, #0x348]
009bf50c	ldr w8,[x21, #0x68]
009bf510	mov w2,#0x152
009bf514	str w8,[x20, #0x350]
009bf518	bl 0x00c32310
009bf51c	ldr x9,[x21, #0x70]
009bf520	cbz x9,0x009bf53c
009bf524	mov x8,x9
009bf528	ldr x10,[x8, #0x8]!
009bf52c	str x10,[x20, #0x338]
009bf530	ldrsw x9,[x9]
009bf534	str x9,[x20, #0x340]
009bf538	b 0x009bf540
009bf53c	add x8,x20,#0x338
009bf540	str xzr,[x8]
009bf544	ldr x8,[x21, #0x10]
009bf548	cbz x8,0x009bf560
009bf54c	ldr w9,[x8]
009bf550	cmp w9,#0x1
009bf554	b.ne 0x009bf660
009bf558	ldr x8,[x8, #0x8]
009bf55c	ldrb w8,[x8]
009bf560	str w8,[x20, #0x2f4]
009bf564	ldr x0,[x20, #0x370]
009bf568	ldr x23,[x21, #0x88]
009bf56c	adrp x1,0x2c5000
009bf570	add x1,x1,#0x69b
009bf574	mov w2,#0xd9
009bf578	bl 0x00c32310
009bf57c	str xzr,[x20, #0x370]
009bf580	cbz x23,0x009bf5a4
009bf584	ldr x0,[x23, #0x8]
009bf588	ldrsw x1,[x23]
009bf58c	adrp x2,0x2c5000
009bf590	add x2,x2,#0x69b
009bf594	mov w3,#0xdd
009bf598	bl 0x00c36180
009bf59c	str x0,[x20, #0x370]
009bf5a0	cbz x0,0x009bf33c
009bf5a4	ldr x8,[x21, #0x90]
009bf5a8	ldr x0,[x20, #0x358]
009bf5ac	adrp x1,0x2c5000
009bf5b0	add x1,x1,#0x69b
009bf5b4	str w8,[x20, #0x388]
009bf5b8	ldr w8,[x21, #0x98]
009bf5bc	mov w2,#0x16e
009bf5c0	add x23,x20,#0x358
009bf5c4	str w8,[x20, #0x354]
009bf5c8	bl 0x00c32310
009bf5cc	ldr x8,[x21, #0xa0]
009bf5d0	cbz x8,0x009bf5e8
009bf5d4	mov x9,x8
009bf5d8	ldr x10,[x9, #0x8]!
009bf5dc	str x10,[x23]
009bf5e0	ldrsw x8,[x8]
009bf5e4	mov x23,x9
009bf5e8	str xzr,[x23]
009bf5ec	str x8,[x20, #0x360]
009bf5f0	ldr w8,[x21, #0xa8]
009bf5f4	ldr x0,[x20, #0x378]
009bf5f8	adrp x1,0x2c5000
009bf5fc	add x1,x1,#0x69b
009bf600	mov w2,#0x17a
009bf604	strb w8,[x20, #0x368]
009bf608	add x23,x20,#0x378
009bf60c	bl 0x00c32310
009bf610	ldr x8,[x21, #0xb0]
009bf614	cbz x8,0x009bf62c
009bf618	mov x9,x8
009bf61c	ldr x10,[x9, #0x8]!
009bf620	str x10,[x23]
009bf624	ldrsw x8,[x8]
009bf628	mov x23,x9
009bf62c	adrp x1,0xc57000
009bf630	add x1,x1,#0x3d8
009bf634	mov x0,x21
009bf638	str xzr,[x23]
009bf63c	str x8,[x20, #0x380]
009bf640	bl 0x00c36160
009bf644	cbz x19,0x009bf654
009bf648	ldr x8,[x19]
009bf64c	cbnz x8,0x009bf654
009bf650	str x20,[x19]
009bf654	ldr x8,[sp, #0x8]
009bf658	str x8,[x22]
009bf65c	b 0x009bf368
009bf660	bl 0x00c342a0
009bf664	adrp x0,0x2c5000
009bf668	adrp x2,0x2d5000
009bf66c	add x0,x0,#0x69b
009bf670	add x2,x2,#0x8c6
009bf674	mov w1,#0x15d
009bf678	bl 0x00c342b0
009bf67c	mov w0,#0x14
009bf680	mov w1,#0x10f
009bf684	b 0x009bf334
