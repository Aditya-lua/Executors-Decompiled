; a2d_ASN1_OBJECT @ 009ec184
009ec184	sub sp,sp,#0xc0
009ec188	stp x24,x23,[sp, #0x80]
009ec18c	mov w23,w3
009ec190	stp x28,x27,[sp, #0x60]
009ec194	stp x26,x25,[sp, #0x70]
009ec198	stp x22,x21,[sp, #0x90]
009ec19c	stp x20,x19,[sp, #0xa0]
009ec1a0	stp x29,x30,[sp, #0xb0]
009ec1a4	add x29,sp,#0xb0
009ec1a8	cbz w3,0x009ec24c
009ec1ac	mov x20,x2
009ec1b0	mov w19,w1
009ec1b4	mov x22,x0
009ec1b8	cmn w23,#0x1
009ec1bc	b.ne 0x009ec1cc
009ec1c0	mov x0,x20
009ec1c4	bl 0x00c2ff50
009ec1c8	mov x23,x0
009ec1cc	ldrb w10,[x20]
009ec1d0	sub w8,w10,#0x30
009ec1d4	and w8,w8,#0xff
009ec1d8	cmp w8,#0x2
009ec1dc	b.hi 0x009ec210
009ec1e0	subs w24,w23,#0x2
009ec1e4	b.ge 0x009ec270
009ec1e8	bl 0x00c342a0
009ec1ec	adrp x0,0x2b7000
009ec1f0	adrp x2,0x2cd000
009ec1f4	add x0,x0,#0x892
009ec1f8	add x2,x2,#0x7ed
009ec1fc	mov w1,#0x4e
009ec200	bl 0x00c342b0
009ec204	mov w0,#0xd
009ec208	mov w1,#0x8a
009ec20c	b 0x009ec234
009ec210	bl 0x00c342a0
009ec214	adrp x0,0x2b7000
009ec218	adrp x2,0x2cd000
009ec21c	add x0,x0,#0x892
009ec220	add x2,x2,#0x7ed
009ec224	mov w1,#0x49
009ec228	bl 0x00c342b0
009ec22c	mov w0,#0xd
009ec230	mov w1,#0x7a
009ec234	mov x2,xzr
009ec238	bl 0x00c342c0
009ec23c	mov x19,xzr
009ec240	mov x0,x19
009ec244	bl 0x00c36290
009ec248	mov w23,wzr
009ec24c	mov w0,w23
009ec250	ldp x29,x30,[sp, #0xb0]
009ec254	ldp x20,x19,[sp, #0xa0]
009ec258	ldp x22,x21,[sp, #0x90]
009ec25c	ldp x24,x23,[sp, #0x80]
009ec260	ldp x26,x25,[sp, #0x70]
009ec264	ldp x28,x27,[sp, #0x60]
009ec268	add sp,sp,#0xc0
009ec26c	ret
009ec270	b.ne 0x009ec288
009ec274	mov x19,xzr
009ec278	mov w23,wzr
009ec27c	mov x0,x19
009ec280	bl 0x00c36290
009ec284	b 0x009ec24c
009ec288	add x9,x22,#0x2
009ec28c	str x9,[sp, #0x8]
009ec290	add x9,x22,#0x10
009ec294	str x9,[sp]
009ec298	orr w9,wzr,#0x18
009ec29c	str x9,[sp, #0x28]
009ec2a0	adrp x9,0x29d000
009ec2a4	ldrb w26,[x20, #0x1]
009ec2a8	ldr q3,[x9, #0x80]
009ec2ac	mov w8,#0x28
009ec2b0	mul x8,x10,x8
009ec2b4	str w19,[sp, #0x24]
009ec2b8	mov x19,xzr
009ec2bc	mov w23,wzr
009ec2c0	add x25,x20,#0x2
009ec2c4	movi v2.16B,#0x80
009ec2c8	sub x8,x8,#0x780
009ec2cc	add x28,sp,#0x48
009ec2d0	stp x8,x10,[sp, #0x10]
009ec2d4	str q3,[sp, #0x30]
009ec2d8	cmp w26,#0x2e
009ec2dc	b.eq 0x009ec2e8
009ec2e0	cmp w26,#0x20
009ec2e4	b.ne 0x009ec674
009ec2e8	mov x27,xzr
009ec2ec	mov w20,wzr
009ec2f0	add x8,x25,#0x1
009ec2f4	ldurb w26,[x8, #-0x1]
009ec2f8	mov x25,x8
009ec2fc	mov w21,w24
009ec300	sub w24,w24,#0x1
009ec304	cmp w26,#0x20
009ec308	b.eq 0x009ec3b8
009ec30c	cmp w26,#0x2e
009ec310	b.eq 0x009ec3c4
009ec314	mov w0,w26
009ec318	bl 0x00c37770
009ec31c	cbz w0,0x009ec624
009ec320	cbnz w20,0x009ec360
009ec324	orr x8,xzr,#-0x6666666666666667
009ec328	movk x8,#0x9991
009ec32c	movk x8,#0x1999, LSL #48
009ec330	cmp x27,x8
009ec334	b.cc 0x009ec360
009ec338	cbnz x19,0x009ec348
009ec33c	bl 0x00c37710
009ec340	mov x19,x0
009ec344	cbz x0,0x009ec650
009ec348	mov x0,x19
009ec34c	mov x1,x27
009ec350	bl 0x00c37720
009ec354	cbz w0,0x009ec650
009ec358	mov w20,#0x1
009ec35c	b 0x009ec36c
009ec360	ldr q3,[sp, #0x30]
009ec364	movi v2.16B,#0x80
009ec368	cbz w20,0x009ec398
009ec36c	mov w1,#0xa
009ec370	mov x0,x19
009ec374	bl 0x00c37700
009ec378	cbz w0,0x009ec650
009ec37c	sub x1,x26,#0x30
009ec380	mov x0,x19
009ec384	bl 0x00c376e0
009ec388	ldr q3,[sp, #0x30]
009ec38c	movi v2.16B,#0x80
009ec390	cbnz w0,0x009ec3a4
009ec394	b 0x009ec650
009ec398	mov w8,#0xa
009ec39c	madd x8,x27,x8,x26
009ec3a0	sub x27,x8,#0x30
009ec3a4	add w8,w24,#0x1
009ec3a8	cmp w8,#0x1
009ec3ac	add x8,x25,#0x1
009ec3b0	b.gt 0x009ec2f4
009ec3b4	b 0x009ec3c8
009ec3b8	mov w26,#0x20
009ec3bc	cbnz w23,0x009ec3cc
009ec3c0	b 0x009ec3d4
009ec3c4	mov w26,#0x2e
009ec3c8	cbz w23,0x009ec3d4
009ec3cc	cbnz w20,0x009ec3fc
009ec3d0	b 0x009ec4dc
009ec3d4	ldr x8,[sp, #0x18]
009ec3d8	cmp w8,#0x31
009ec3dc	b.hi 0x009ec3e8
009ec3e0	cmp x27,#0x28
009ec3e4	b.cs 0x009ec6c4
009ec3e8	cbz w20,0x009ec4d4
009ec3ec	ldr x1,[sp, #0x10]
009ec3f0	mov x0,x19
009ec3f4	bl 0x00c376e0
009ec3f8	cbz w0,0x009ec650
009ec3fc	mov x0,x19
009ec400	bl 0x00c322f0
009ec404	mov w9,#0x2493
009ec408	add w8,w0,#0x6
009ec40c	movk w9,#0x9249, LSL #16
009ec410	smull x9,w8,w9
009ec414	lsr x9,x9,#0x20
009ec418	add w8,w9,w8
009ec41c	asr w9,w8,#0x2
009ec420	add w20,w9,w8, LSR #0x1f
009ec424	ldr x8,[sp, #0x28]
009ec428	mov w27,w0
009ec42c	cmp w20,w8
009ec430	b.le 0x009ec478
009ec434	add x8,sp,#0x48
009ec438	adrp x1,0x2b7000
009ec43c	cmp x28,x8
009ec440	add x1,x1,#0x892
009ec444	b.eq 0x009ec45c
009ec448	mov w2,#0x87
009ec44c	mov x0,x28
009ec450	bl 0x00c32310
009ec454	adrp x1,0x2b7000
009ec458	add x1,x1,#0x892
009ec45c	add w8,w20,#0x20
009ec460	sxtw x0,w8
009ec464	mov w2,#0x89
009ec468	str x8,[sp, #0x28]
009ec46c	bl 0x00c32320
009ec470	mov x28,x0
009ec474	cbz x0,0x009ec6ec
009ec478	add w8,w27,#0xc
009ec47c	cmp w8,#0xd
009ec480	b.cs 0x009ec48c
009ec484	mov w8,wzr
009ec488	b 0x009ec4bc
009ec48c	mov x27,xzr
009ec490	mov w20,w20
009ec494	mov w1,#0x80
009ec498	mov x0,x19
009ec49c	bl 0x00c376f0
009ec4a0	cmn x0,#0x1
009ec4a4	b.eq 0x009ec650
009ec4a8	add x8,x27,#0x1
009ec4ac	cmp w20,w8
009ec4b0	strb w0,[x28, x27]
009ec4b4	mov x27,x8
009ec4b8	b.ne 0x009ec494
009ec4bc	ldr q3,[sp, #0x30]
009ec4c0	orr x14,xzr,#-0x3
009ec4c4	movi v2.16B,#0x80
009ec4c8	add w9,w8,w23
009ec4cc	cbnz x22,0x009ec500
009ec4d0	b 0x009ec5f4
009ec4d4	ldr x8,[sp, #0x10]
009ec4d8	add x27,x27,x8
009ec4dc	mov x8,xzr
009ec4e0	and w9,w27,#0x7f
009ec4e4	lsr x27,x27,#0x7
009ec4e8	strb w9,[x28, x8]
009ec4ec	add x8,x8,#0x1
009ec4f0	cbnz x27,0x009ec4e0
009ec4f4	orr x14,xzr,#-0x3
009ec4f8	add w9,w8,w23
009ec4fc	cbz x22,0x009ec5f4
009ec500	ldr w10,[sp, #0x24]
009ec504	cmp w9,w10
009ec508	b.gt 0x009ec69c
009ec50c	cmp w8,#0x2
009ec510	b.lt 0x009ec5e8
009ec514	sxtw x8,w8
009ec518	mvn x11,x8
009ec51c	cmn x11,#0x3
009ec520	csinv x9,x14,x8,le
009ec524	add x9,x9,x8
009ec528	add x9,x9,#0x2
009ec52c	cmp x9,#0x1f
009ec530	sxtw x10,w23
009ec534	b.ls 0x009ec5c0
009ec538	add x12,x22,x10
009ec53c	cmn x11,#0x3
009ec540	add x13,x28,x8
009ec544	csinv x11,x14,x8,le
009ec548	cmp x12,x13
009ec54c	b.cs 0x009ec570
009ec550	ldr x14,[sp, #0x8]
009ec554	add x12,x11,x8
009ec558	sub x11,x28,x11
009ec55c	add x12,x12,x10
009ec560	add x12,x14,x12
009ec564	sub x11,x11,#0x2
009ec568	cmp x11,x12
009ec56c	b.cc 0x009ec5c0
009ec570	ldr x12,[sp]
009ec574	and x11,x9,#-0x20
009ec578	add x23,x11,x10
009ec57c	sub x8,x8,x11
009ec580	add x12,x12,x10
009ec584	sub x10,x13,#0x10
009ec588	mov x13,x11
009ec58c	ldp q1,q0,[x10, #-0x10]
009ec590	sub x13,x13,#0x20
009ec594	sub x10,x10,#0x20
009ec598	orr v0.16B,v0.16B,v2.16B
009ec59c	orr v1.16B,v1.16B,v2.16B
009ec5a0	tbl v0.16B,{v0.16B},v3.16B
009ec5a4	tbl v1.16B,{v1.16B},v3.16B
009ec5a8	stp q0,q1,[x12, #-0x10]
009ec5ac	add x12,x12,#0x20
009ec5b0	cbnz x13,0x009ec58c
009ec5b4	cmp x9,x11
009ec5b8	mov x10,x23
009ec5bc	b.eq 0x009ec5e8
009ec5c0	sub x8,x8,#0x1
009ec5c4	ldrb w9,[x28, x8]
009ec5c8	add x23,x10,#0x1
009ec5cc	add x11,x8,#0x1
009ec5d0	sub x8,x8,#0x1
009ec5d4	orr w9,w9,#0x80
009ec5d8	cmp x11,#0x2
009ec5dc	strb w9,[x22, x10]
009ec5e0	mov x10,x23
009ec5e4	b.gt 0x009ec5c4
009ec5e8	ldrb w8,[x28]
009ec5ec	add w9,w23,#0x1
009ec5f0	strb w8,[x22, w23, SXTW ]
009ec5f4	mov w23,w9
009ec5f8	cmp w21,#0x1
009ec5fc	b.gt 0x009ec2d8
009ec600	add x8,sp,#0x48
009ec604	cmp x28,x8
009ec608	b.eq 0x009ec27c
009ec60c	adrp x1,0x2b7000
009ec610	add x1,x1,#0x892
009ec614	mov w2,#0xab
009ec618	mov x0,x28
009ec61c	bl 0x00c32310
009ec620	b 0x009ec27c
009ec624	bl 0x00c342a0
009ec628	adrp x0,0x2b7000
009ec62c	adrp x2,0x2cd000
009ec630	add x0,x0,#0x892
009ec634	add x2,x2,#0x7ed
009ec638	mov w1,#0x64
009ec63c	bl 0x00c342b0
009ec640	mov w0,#0xd
009ec644	mov w1,#0x82
009ec648	mov x2,xzr
009ec64c	bl 0x00c342c0
009ec650	add x8,sp,#0x48
009ec654	cmp x28,x8
009ec658	b.eq 0x009ec240
009ec65c	adrp x1,0x2b7000
009ec660	add x1,x1,#0x892
009ec664	mov w2,#0xb0
009ec668	mov x0,x28
009ec66c	bl 0x00c32310
009ec670	b 0x009ec240
009ec674	bl 0x00c342a0
009ec678	adrp x0,0x2b7000
009ec67c	adrp x2,0x2cd000
009ec680	add x0,x0,#0x892
009ec684	add x2,x2,#0x7ed
009ec688	mov w1,#0x57
009ec68c	bl 0x00c342b0
009ec690	mov w0,#0xd
009ec694	mov w1,#0x83
009ec698	b 0x009ec648
009ec69c	bl 0x00c342a0
009ec6a0	adrp x0,0x2b7000
009ec6a4	adrp x2,0x2cd000
009ec6a8	add x0,x0,#0x892
009ec6ac	add x2,x2,#0x7ed
009ec6b0	mov w1,#0xa1
009ec6b4	bl 0x00c342b0
009ec6b8	mov w0,#0xd
009ec6bc	mov w1,#0x6b
009ec6c0	b 0x009ec648
009ec6c4	bl 0x00c342a0
009ec6c8	adrp x0,0x2b7000
009ec6cc	adrp x2,0x2cd000
009ec6d0	add x0,x0,#0x892
009ec6d4	add x2,x2,#0x7ed
009ec6d8	mov w1,#0x77
009ec6dc	bl 0x00c342b0
009ec6e0	mov w0,#0xd
009ec6e4	mov w1,#0x93
009ec6e8	b 0x009ec648
009ec6ec	bl 0x00c342a0
009ec6f0	adrp x0,0x2b7000
009ec6f4	adrp x2,0x2cd000
009ec6f8	add x0,x0,#0x892
009ec6fc	add x2,x2,#0x7ed
009ec700	mov w1,#0x8b
009ec704	bl 0x00c342b0
009ec708	mov w1,#0x100
009ec70c	mov w0,#0xd
009ec710	movk w1,#0xc, LSL #16
009ec714	mov x2,xzr
009ec718	bl 0x00c342c0
009ec71c	b 0x009ec65c
