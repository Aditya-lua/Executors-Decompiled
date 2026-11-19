; mbedtls_aes_setkey_dec @ 00b6e374
00b6e374	sub sp,sp,#0x170
00b6e378	stp x28,x23,[sp, #0x130]
00b6e37c	stp x22,x21,[sp, #0x140]
00b6e380	stp x20,x19,[sp, #0x150]
00b6e384	stp x29,x30,[sp, #0x160]
00b6e388	add x29,sp,#0x160
00b6e38c	mrs x22,tpidr_el0
00b6e390	ldr x8,[x22, #0x28]
00b6e394	mov w19,w2
00b6e398	mov x21,x1
00b6e39c	mov x20,x0
00b6e3a0	add x0,sp,#0x8
00b6e3a4	mov w2,#0x120
00b6e3a8	mov w1,wzr
00b6e3ac	stur x8,[x29, #-0x38]
00b6e3b0	add x23,sp,#0x8
00b6e3b4	bl 0x00c301c0
00b6e3b8	add x0,sp,#0x8
00b6e3bc	mov x1,x21
00b6e3c0	mov w2,w19
00b6e3c4	str xzr,[x20, #0x8]
00b6e3c8	bl 0x00c41940
00b6e3cc	mov w19,w0
00b6e3d0	cbnz w0,0x00b6e5b0
00b6e3d4	ldrsw x10,[sp, #0x8]
00b6e3d8	add x9,x20,#0x20
00b6e3dc	str w10,[x20]
00b6e3e0	ldr x13,[sp, #0x10]
00b6e3e4	cmp w10,#0x2
00b6e3e8	add x8,x23,x13, LSL #0x2
00b6e3ec	add x8,x8,x10, LSL #0x4
00b6e3f0	ldr q0,[x8, #0x10]
00b6e3f4	str q0,[x20, #0x10]
00b6e3f8	b.lt 0x00b6e594
00b6e3fc	mvn w12,w10
00b6e400	orr w15,wzr,#0xfffffffd
00b6e404	cmn w12,#0x3
00b6e408	lsl x14,x10,#0x2
00b6e40c	csinv w15,w15,w10,le
00b6e410	add w11,w10,#0x1
00b6e414	add x13,x13,x14
00b6e418	add w10,w10,w15
00b6e41c	lsl x13,x13,#0x2
00b6e420	add w10,w10,#0x1
00b6e424	add x13,x13,#0x10
00b6e428	lsl x10,x10,#0x4
00b6e42c	add x17,sp,#0x8
00b6e430	add x18,x20,x10
00b6e434	sub x10,x13,x10
00b6e438	adrp x12,0xd23000
00b6e43c	adrp x14,0xd23000
00b6e440	adrp x15,0xd23000
00b6e444	adrp x16,0xd24000
00b6e448	add x10,x17,x10
00b6e44c	adrp x17,0xd24000
00b6e450	add x12,x12,#0x908
00b6e454	add x14,x14,#0xa08
00b6e458	add x15,x15,#0xe08
00b6e45c	add x16,x16,#0x208
00b6e460	add x13,x18,#0x30
00b6e464	add x17,x17,#0x608
00b6e468	ldr w18,[x8]
00b6e46c	sub w11,w11,#0x1
00b6e470	cmp w11,#0x2
00b6e474	and x0,x18,#0xff
00b6e478	ubfx w1,w18,#0x8,#0x8
00b6e47c	ubfx w2,w18,#0x10,#0x8
00b6e480	ldrb w0,[x12, x0]
00b6e484	ldrb w1,[x12, w1, UXTW ]
00b6e488	ubfx x18,x18,#0x18,#0x8
00b6e48c	ldrb w2,[x12, w2, UXTW ]
00b6e490	ldrb w18,[x12, w18, UXTW ]
00b6e494	ldr w0,[x14, x0, LSL #0x2]
00b6e498	ldr w1,[x15, x1, LSL #0x2]
00b6e49c	ldr w2,[x16, x2, LSL #0x2]
00b6e4a0	ldr w18,[x17, x18, LSL #0x2]
00b6e4a4	eor w0,w1,w0
00b6e4a8	eor w0,w0,w2
00b6e4ac	eor w18,w0,w18
00b6e4b0	str w18,[x9]
00b6e4b4	ldr w18,[x8, #0x4]
00b6e4b8	and x0,x18,#0xff
00b6e4bc	ubfx w1,w18,#0x8,#0x8
00b6e4c0	ubfx w2,w18,#0x10,#0x8
00b6e4c4	ldrb w0,[x12, x0]
00b6e4c8	ldrb w1,[x12, w1, UXTW ]
00b6e4cc	ubfx x18,x18,#0x18,#0x8
00b6e4d0	ldrb w2,[x12, w2, UXTW ]
00b6e4d4	ldrb w18,[x12, w18, UXTW ]
00b6e4d8	ldr w0,[x14, x0, LSL #0x2]
00b6e4dc	ldr w1,[x15, x1, LSL #0x2]
00b6e4e0	ldr w2,[x16, x2, LSL #0x2]
00b6e4e4	ldr w18,[x17, x18, LSL #0x2]
00b6e4e8	eor w0,w1,w0
00b6e4ec	eor w0,w0,w2
00b6e4f0	eor w18,w0,w18
00b6e4f4	str w18,[x9, #0x4]
00b6e4f8	ldr w18,[x8, #0x8]
00b6e4fc	and x0,x18,#0xff
00b6e500	ubfx w1,w18,#0x8,#0x8
00b6e504	ubfx w2,w18,#0x10,#0x8
00b6e508	ldrb w0,[x12, x0]
00b6e50c	ldrb w1,[x12, w1, UXTW ]
00b6e510	ubfx x18,x18,#0x18,#0x8
00b6e514	ldrb w2,[x12, w2, UXTW ]
00b6e518	ldrb w18,[x12, w18, UXTW ]
00b6e51c	ldr w0,[x14, x0, LSL #0x2]
00b6e520	ldr w1,[x15, x1, LSL #0x2]
00b6e524	ldr w2,[x16, x2, LSL #0x2]
00b6e528	ldr w18,[x17, x18, LSL #0x2]
00b6e52c	eor w0,w1,w0
00b6e530	eor w0,w0,w2
00b6e534	eor w18,w0,w18
00b6e538	str w18,[x9, #0x8]
00b6e53c	ldr w18,[x8, #0xc]
00b6e540	sub x8,x8,#0x10
00b6e544	and x0,x18,#0xff
00b6e548	ubfx w1,w18,#0x8,#0x8
00b6e54c	ldrb w0,[x12, x0]
00b6e550	ldrb w1,[x12, w1, UXTW ]
00b6e554	ubfx w2,w18,#0x10,#0x8
00b6e558	ubfx x18,x18,#0x18,#0x8
00b6e55c	ldr w0,[x14, x0, LSL #0x2]
00b6e560	ldr w1,[x15, x1, LSL #0x2]
00b6e564	ldrb w2,[x12, w2, UXTW ]
00b6e568	ldrb w18,[x12, w18, UXTW ]
00b6e56c	eor w0,w1,w0
00b6e570	ldr w1,[x16, x2, LSL #0x2]
00b6e574	ldr w18,[x17, x18, LSL #0x2]
00b6e578	eor w0,w0,w1
00b6e57c	eor w18,w0,w18
00b6e580	str w18,[x9, #0xc]
00b6e584	add x9,x9,#0x10
00b6e588	b.gt 0x00b6e468
00b6e58c	mov x9,x13
00b6e590	b 0x00b6e598
00b6e594	add x10,x8,#0x20
00b6e598	ldr w8,[x8]
00b6e59c	str w8,[x9]
00b6e5a0	ldur x8,[x10, #-0x1c]
00b6e5a4	stur x8,[x9, #0x4]
00b6e5a8	ldur w8,[x10, #-0x14]
00b6e5ac	str w8,[x9, #0xc]
00b6e5b0	add x0,sp,#0x8
00b6e5b4	mov w1,#0x120
00b6e5b8	bl 0x00c42220
00b6e5bc	ldr x8,[x22, #0x28]
00b6e5c0	ldur x9,[x29, #-0x38]
00b6e5c4	cmp x8,x9
00b6e5c8	b.ne 0x00b6e5e8
00b6e5cc	mov w0,w19
00b6e5d0	ldp x29,x30,[sp, #0x160]
00b6e5d4	ldp x20,x19,[sp, #0x150]
00b6e5d8	ldp x22,x21,[sp, #0x140]
00b6e5dc	ldp x28,x23,[sp, #0x130]
00b6e5e0	add sp,sp,#0x170
00b6e5e4	ret
00b6e5e8	bl 0x00c2fec0
