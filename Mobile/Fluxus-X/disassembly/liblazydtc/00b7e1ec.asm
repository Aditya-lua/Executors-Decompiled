; mbedtls_mpi_write_string @ 00b7e1ec
00b7e1ec	sub sp,sp,#0xb0
00b7e1f0	stp x28,x27,[sp, #0x50]
00b7e1f4	stp x26,x25,[sp, #0x60]
00b7e1f8	stp x24,x23,[sp, #0x70]
00b7e1fc	stp x22,x21,[sp, #0x80]
00b7e200	stp x20,x19,[sp, #0x90]
00b7e204	stp x29,x30,[sp, #0xa0]
00b7e208	add x29,sp,#0xa0
00b7e20c	mrs x27,tpidr_el0
00b7e210	ldr x8,[x27, #0x28]
00b7e214	sub w9,w1,#0x2
00b7e218	mov x19,x4
00b7e21c	mov x23,x3
00b7e220	mov x20,x2
00b7e224	mov w24,w1
00b7e228	mov x22,x0
00b7e22c	cmp w9,#0xe
00b7e230	str x8,[sp, #0x48]
00b7e234	b.ls 0x00b7e240
00b7e238	orr w26,wzr,#0xfffffffc
00b7e23c	b 0x00b7e6e8
00b7e240	ldr x0,[x22]
00b7e244	ldrh w1,[x22, #0xa]
00b7e248	bl 0x00c41dc0
00b7e24c	cmp w24,#0x3
00b7e250	cset w8,gt
00b7e254	cmp w24,#0xf
00b7e258	lsr x8,x0,x8
00b7e25c	cset w9,gt
00b7e260	lsr x8,x8,x9
00b7e264	add x8,x8,#0x3
00b7e268	and x9,x8,#0x1
00b7e26c	add x8,x9,x8
00b7e270	cmp x8,x23
00b7e274	b.ls 0x00b7e284
00b7e278	str x8,[x19]
00b7e27c	orr w26,wzr,#0xfffffff8
00b7e280	b 0x00b7e6e8
00b7e284	mov w8,#0x1
00b7e288	str w8,[sp, #0x28]
00b7e28c	str xzr,[sp, #0x20]
00b7e290	ldrsh w8,[x22, #0x8]
00b7e294	cmn w8,#0x1
00b7e298	b.eq 0x00b7e538
00b7e29c	mov x21,x20
00b7e2a0	cmp w24,#0x10
00b7e2a4	b.ne 0x00b7e550
00b7e2a8	ldrh w16,[x22, #0xa]
00b7e2ac	cbz x16,0x00b7e6b8
00b7e2b0	mov w11,#0x1
00b7e2b4	orr x12,xzr,#-0x2
00b7e2b8	orr x13,xzr,#-0x3
00b7e2bc	orr x14,xzr,#-0x4
00b7e2c0	orr x15,xzr,#-0x5
00b7e2c4	mov x17,#-0x6
00b7e2c8	lsl x18,x16,#0x3
00b7e2cc	neg x9,x16
00b7e2d0	mvn x10,x16
00b7e2d4	sub x11,x11,x16
00b7e2d8	sub x12,x12,x16
00b7e2dc	sub x13,x13,x16
00b7e2e0	sub x14,x14,x16
00b7e2e4	sub x15,x15,x16
00b7e2e8	sub x16,x17,x16
00b7e2ec	sub x17,x18,#0x8
00b7e2f0	adrp x18,0x2a3000
00b7e2f4	mov x8,xzr
00b7e2f8	mov x1,xzr
00b7e2fc	add x18,x18,#0x64c
00b7e300	b 0x00b7e31c
00b7e304	cmp x11,x8
00b7e308	and w2,w0,#0xff
00b7e30c	b.eq 0x00b7e504
00b7e310	mov x1,xzr
00b7e314	cbz w2,0x00b7e528
00b7e318	b 0x00b7e504
00b7e31c	ldr x0,[x22]
00b7e320	cmp x16,x8
00b7e324	add x0,x0,x17
00b7e328	ldr x0,[x0, x8, LSL #0x3]
00b7e32c	b.eq 0x00b7e338
00b7e330	orr x1,x1,x0, LSR #0x38
00b7e334	cbz x1,0x00b7e364
00b7e338	lsr x1,x0,#0x3c
00b7e33c	ubfx x0,x0,#0x38,#0x4
00b7e340	ldrb w1,[x18, x1]
00b7e344	ldrb w0,[x18, x0]
00b7e348	strb w1,[x21]
00b7e34c	strb w0,[x21, #0x1]
00b7e350	ldr x0,[x22]
00b7e354	add x21,x21,#0x2
00b7e358	mov w1,#0x1
00b7e35c	add x0,x0,x17
00b7e360	ldr x0,[x0, x8, LSL #0x3]
00b7e364	cmp x15,x8
00b7e368	ubfx x2,x0,#0x30,#0x8
00b7e36c	b.eq 0x00b7e380
00b7e370	tbnz w1,#0x0,0x00b7e380
00b7e374	cbnz w2,0x00b7e380
00b7e378	mov w1,wzr
00b7e37c	b 0x00b7e3ac
00b7e380	lsr w1,w2,#0x4
00b7e384	ubfx x0,x0,#0x30,#0x4
00b7e388	ldrb w1,[x18, w1, UXTW ]
00b7e38c	ldrb w0,[x18, x0]
00b7e390	strb w1,[x21]
00b7e394	strb w0,[x21, #0x1]
00b7e398	ldr x0,[x22]
00b7e39c	add x21,x21,#0x2
00b7e3a0	mov w1,#0x1
00b7e3a4	add x0,x0,x17
00b7e3a8	ldr x0,[x0, x8, LSL #0x3]
00b7e3ac	cmp x14,x8
00b7e3b0	ubfx x2,x0,#0x28,#0x8
00b7e3b4	b.eq 0x00b7e3c8
00b7e3b8	tbnz w1,#0x0,0x00b7e3c8
00b7e3bc	cbnz w2,0x00b7e3c8
00b7e3c0	mov w1,wzr
00b7e3c4	b 0x00b7e3f4
00b7e3c8	lsr w1,w2,#0x4
00b7e3cc	ubfx x0,x0,#0x28,#0x4
00b7e3d0	ldrb w1,[x18, w1, UXTW ]
00b7e3d4	ldrb w0,[x18, x0]
00b7e3d8	strb w1,[x21]
00b7e3dc	strb w0,[x21, #0x1]
00b7e3e0	ldr x0,[x22]
00b7e3e4	add x21,x21,#0x2
00b7e3e8	mov w1,#0x1
00b7e3ec	add x0,x0,x17
00b7e3f0	ldr x0,[x0, x8, LSL #0x3]
00b7e3f4	cmp x13,x8
00b7e3f8	ubfx x2,x0,#0x20,#0x8
00b7e3fc	b.eq 0x00b7e410
00b7e400	tbnz w1,#0x0,0x00b7e410
00b7e404	cbnz w2,0x00b7e410
00b7e408	mov w1,wzr
00b7e40c	b 0x00b7e43c
00b7e410	lsr w1,w2,#0x4
00b7e414	ubfx x0,x0,#0x20,#0x4
00b7e418	ldrb w1,[x18, w1, UXTW ]
00b7e41c	ldrb w0,[x18, x0]
00b7e420	strb w1,[x21]
00b7e424	strb w0,[x21, #0x1]
00b7e428	ldr x0,[x22]
00b7e42c	add x21,x21,#0x2
00b7e430	mov w1,#0x1
00b7e434	add x0,x0,x17
00b7e438	ldr x0,[x0, x8, LSL #0x3]
00b7e43c	cmp x12,x8
00b7e440	ubfx x2,x0,#0x18,#0x8
00b7e444	b.eq 0x00b7e458
00b7e448	tbnz w1,#0x0,0x00b7e458
00b7e44c	cbnz w2,0x00b7e458
00b7e450	mov w1,wzr
00b7e454	b 0x00b7e484
00b7e458	lsr w1,w2,#0x4
00b7e45c	ubfx x0,x0,#0x18,#0x4
00b7e460	ldrb w1,[x18, w1, UXTW ]
00b7e464	ldrb w0,[x18, x0]
00b7e468	strb w1,[x21]
00b7e46c	strb w0,[x21, #0x1]
00b7e470	ldr x0,[x22]
00b7e474	add x21,x21,#0x2
00b7e478	mov w1,#0x1
00b7e47c	add x0,x0,x17
00b7e480	ldr x0,[x0, x8, LSL #0x3]
00b7e484	cmp x10,x8
00b7e488	ubfx w2,w0,#0x10,#0x8
00b7e48c	b.eq 0x00b7e4a8
00b7e490	tbnz w1,#0x0,0x00b7e4a8
00b7e494	cbnz w2,0x00b7e4a8
00b7e498	ubfx x1,x0,#0x8,#0x8
00b7e49c	cbz w1,0x00b7e304
00b7e4a0	lsr x0,x0,#0x8
00b7e4a4	b 0x00b7e4d8
00b7e4a8	lsr w1,w2,#0x4
00b7e4ac	ubfx x0,x0,#0x10,#0x4
00b7e4b0	ldrb w1,[x18, w1, UXTW ]
00b7e4b4	ldrb w0,[x18, x0]
00b7e4b8	strb w1,[x21]
00b7e4bc	strb w0,[x21, #0x1]
00b7e4c0	ldr x0,[x22]
00b7e4c4	add x21,x21,#0x2
00b7e4c8	add x0,x0,x17
00b7e4cc	ldr x1,[x0, x8, LSL #0x3]
00b7e4d0	lsr x0,x1,#0x8
00b7e4d4	ubfx x1,x1,#0x8,#0x8
00b7e4d8	lsr w1,w1,#0x4
00b7e4dc	and x0,x0,#0xf
00b7e4e0	ldrb w1,[x18, w1, UXTW ]
00b7e4e4	ldrb w0,[x18, x0]
00b7e4e8	strb w1,[x21]
00b7e4ec	strb w0,[x21, #0x1]
00b7e4f0	ldr x0,[x22]
00b7e4f4	add x21,x21,#0x2
00b7e4f8	add x0,x0,x17
00b7e4fc	ldr x0,[x0, x8, LSL #0x3]
00b7e500	and w2,w0,#0xff
00b7e504	lsr w1,w2,#0x4
00b7e508	ldrb w1,[x18, w1, UXTW ]
00b7e50c	and x0,x0,#0xf
00b7e510	ldrb w0,[x18, x0]
00b7e514	strb w1,[x21]
00b7e518	add x1,x21,#0x2
00b7e51c	strb w0,[x21, #0x1]
00b7e520	mov x21,x1
00b7e524	mov w1,#0x1
00b7e528	sub x8,x8,#0x1
00b7e52c	cmp x9,x8
00b7e530	b.ne 0x00b7e31c
00b7e534	b 0x00b7e6b8
00b7e538	mov w8,#0x2d
00b7e53c	mov x21,x20
00b7e540	strb w8,[x21], #0x1
00b7e544	sub x23,x23,#0x1
00b7e548	cmp w24,#0x10
00b7e54c	b.eq 0x00b7e2a8
00b7e550	add x0,sp,#0x20
00b7e554	mov x1,x22
00b7e558	bl 0x00c41b60
00b7e55c	mov w26,w0
00b7e560	cbnz w0,0x00b7e6c8
00b7e564	ldrh w8,[sp, #0x28]
00b7e568	orr w9,wzr,#0xffff
00b7e56c	cmp w8,w9
00b7e570	b.ne 0x00b7e57c
00b7e574	mov w8,#0x1
00b7e578	strh w8,[sp, #0x28]
00b7e57c	sxtw x28,w24
00b7e580	cmp x28,#0x0
00b7e584	asr x9,x28,#0x3f
00b7e588	mov x22,xzr
00b7e58c	add x1,x21,x23
00b7e590	cneg x10,x28,mi
00b7e594	orr w9,w9,#0x1
00b7e598	str x10,[sp, #0x10]
00b7e59c	str w9,[sp, #0xc]
00b7e5a0	cmp x22,x23
00b7e5a4	b.cs 0x00b7e71c
00b7e5a8	ldrh w10,[sp, #0x2a]
00b7e5ac	str x22,[sp, #0x18]
00b7e5b0	cbz x10,0x00b7e5d0
00b7e5b4	cmp w24,#0x2
00b7e5b8	b.ne 0x00b7e5dc
00b7e5bc	ldr x8,[sp, #0x20]
00b7e5c0	mov x22,x1
00b7e5c4	ldr x8,[x8]
00b7e5c8	and x25,x8,#0x1
00b7e5cc	b 0x00b7e628
00b7e5d0	mov x22,x1
00b7e5d4	mov x25,xzr
00b7e5d8	b 0x00b7e628
00b7e5dc	ldr x9,[sp, #0x20]
00b7e5e0	mov x11,xzr
00b7e5e4	sub x10,x10,#0x1
00b7e5e8	ldr x12,[x9, x10, LSL #0x3]
00b7e5ec	sub x10,x10,#0x1
00b7e5f0	cmn x10,#0x1
00b7e5f4	extr x11,x11,x12,#0x20
00b7e5f8	udiv x13,x11,x28
00b7e5fc	msub w11,w13,w28,w11
00b7e600	bfm x12,x11,#0x20,#0x1f
00b7e604	udiv x11,x12,x28
00b7e608	msub x11,x11,x28,x12
00b7e60c	b.ne 0x00b7e5e8
00b7e610	sxth w8,w8
00b7e614	cmp w8,#0x0
00b7e618	sub x9,x28,x11
00b7e61c	ccmp x11,#0x0,#0x4,lt
00b7e620	mov x22,x1
00b7e624	csel x25,x9,x11,ne
00b7e628	ldr x8,[sp, #0x10]
00b7e62c	add x0,sp,#0x20
00b7e630	add x2,sp,#0x20
00b7e634	add x3,sp,#0x30
00b7e638	str x8,[sp, #0x40]
00b7e63c	ldr w8,[sp, #0xc]
00b7e640	mov x1,xzr
00b7e644	strh w8,[sp, #0x38]
00b7e648	mov w8,#0x1
00b7e64c	strh w8,[sp, #0x3a]
00b7e650	add x8,sp,#0x40
00b7e654	str x8,[sp, #0x30]
00b7e658	bl 0x00c41b70
00b7e65c	mov w26,w0
00b7e660	cbnz w0,0x00b7e6c8
00b7e664	cmp x25,#0x9
00b7e668	b.hi 0x00b7e674
00b7e66c	add w8,w25,#0x30
00b7e670	b 0x00b7e678
00b7e674	add w8,w25,#0x37
00b7e678	mov x1,x22
00b7e67c	strb w8,[x1, #-0x1]!
00b7e680	ldp x22,x9,[sp, #0x18]
00b7e684	ldrh w8,[sp, #0x2a]
00b7e688	add x22,x22,#0x1
00b7e68c	cbz x8,0x00b7e6a8
00b7e690	add x10,x9,x8, LSL #0x3
00b7e694	ldur x10,[x10, #-0x8]
00b7e698	sub x8,x8,#0x1
00b7e69c	cbz x10,0x00b7e68c
00b7e6a0	ldrh w8,[sp, #0x28]
00b7e6a4	cbnz w8,0x00b7e5a0
00b7e6a8	mov x0,x21
00b7e6ac	mov x2,x22
00b7e6b0	bl 0x00c2ff60
00b7e6b4	add x21,x21,x22
00b7e6b8	strb wzr,[x21], #0x1
00b7e6bc	mov w26,wzr
00b7e6c0	sub x8,x21,x20
00b7e6c4	str x8,[x19]
00b7e6c8	ldr x0,[sp, #0x20]
00b7e6cc	cbz x0,0x00b7e6dc
00b7e6d0	ldrh w8,[sp, #0x2a]
00b7e6d4	lsl x1,x8,#0x3
00b7e6d8	bl 0x00c42230
00b7e6dc	mov w8,#0x1
00b7e6e0	str w8,[sp, #0x28]
00b7e6e4	str xzr,[sp, #0x20]
00b7e6e8	ldr x8,[x27, #0x28]
00b7e6ec	ldr x9,[sp, #0x48]
00b7e6f0	cmp x8,x9
00b7e6f4	b.ne 0x00b7e72c
00b7e6f8	mov w0,w26
00b7e6fc	ldp x29,x30,[sp, #0xa0]
00b7e700	ldp x20,x19,[sp, #0x90]
00b7e704	ldp x22,x21,[sp, #0x80]
00b7e708	ldp x24,x23,[sp, #0x70]
00b7e70c	ldp x26,x25,[sp, #0x60]
00b7e710	ldp x28,x27,[sp, #0x50]
00b7e714	add sp,sp,#0xb0
00b7e718	ret
00b7e71c	orr w26,wzr,#0xfffffff8
00b7e720	ldr x0,[sp, #0x20]
00b7e724	cbnz x0,0x00b7e6d0
00b7e728	b 0x00b7e6dc
00b7e72c	bl 0x00c2fec0
