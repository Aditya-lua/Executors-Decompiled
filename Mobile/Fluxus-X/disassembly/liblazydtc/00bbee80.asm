; FUN_00bbee80 @ 00bbee80
00bbee80	sub sp,sp,#0x140
00bbee84	stp x29,x30,[sp, #0xe0]
00bbee88	stp x28,x27,[sp, #0xf0]
00bbee8c	stp x26,x25,[sp, #0x100]
00bbee90	stp x24,x23,[sp, #0x110]
00bbee94	stp x22,x21,[sp, #0x120]
00bbee98	stp x20,x19,[sp, #0x130]
00bbee9c	add x29,sp,#0xe0
00bbeea0	mrs x21,tpidr_el0
00bbeea4	mov w9,#0x683c
00bbeea8	mov w22,w5
00bbeeac	ldr x8,[x21, #0x28]
00bbeeb0	add x5,x0,x9
00bbeeb4	mov x20,x1
00bbeeb8	stur x8,[x29, #-0x10]
00bbeebc	ldr w8,[x5, #0xe64]
00bbeec0	cbz w8,0x00bbeecc
00bbeec4	ldr x17,[x0, #0x7690]
00bbeec8	b 0x00bbeed4
00bbeecc	bic x8,x2,x2, ASR #0x3f
00bbeed0	add x17,x20,x8
00bbeed4	ldr x1,[x0, #0x75a8]
00bbeed8	ldr x8,[x0, #0x75c8]
00bbeedc	add x8,x1,x8
00bbeee0	stur x1,[x29, #-0x30]
00bbeee4	stur x8,[x29, #-0x40]
00bbeee8	cbz w22,0x00bbef40
00bbeeec	ldr x1,[x0, #0x74c8]
00bbeef0	ldr x10,[x0, #0x74d0]
00bbeef4	mov w8,#0x1
00bbeef8	ldr x9,[x0, #0x74d8]
00bbeefc	str w8,[x5, #0xcf8]
00bbef00	stp x9,x10,[sp, #0x60]
00bbef04	cbz x4,0x00bbf05c
00bbef08	ldp w26,w23,[x5]
00bbef0c	ldr w2,[x5, #0x8]
00bbef10	subs x10,x4,#0x8
00bbef14	b.cc 0x00bbef78
00bbef18	ldr x9,[x3, x10#0x0]
00bbef1c	lsr x8,x9,#0x38
00bbef20	cbz x8,0x00bbf05c
00bbef24	cmn x4,#0x78
00bbef28	b.hi 0x00bbf05c
00bbef2c	clz w8,w8
00bbef30	mov w11,#0x8
00bbef34	eor w8,w8,#0x1f
00bbef38	sub w11,w11,w8
00bbef3c	b 0x00bbf004
00bbef40	mov x27,x20
00bbef44	ldur x8,[x29, #-0x40]
00bbef48	sub x19,x8,x1
00bbef4c	sub x8,x17,x27
00bbef50	cmp x19,x8
00bbef54	b.ls 0x00bbef60
00bbef58	mov x0,#-0x46
00bbef5c	b 0x00bbf7c8
00bbef60	cbz x27,0x00bbf100
00bbef64	mov x0,x27
00bbef68	mov x2,x19
00bbef6c	bl 0x00c2ffd0
00bbef70	add x8,x27,x19
00bbef74	b 0x00bbf104
00bbef78	ldrb w9,[x3]
00bbef7c	cmp x4,#0x4
00bbef80	b.gt 0x00bbefa0
00bbef84	cmp x4,#0x2
00bbef88	b.eq 0x00bbefe0
00bbef8c	cmp x4,#0x3
00bbef90	b.eq 0x00bbefd8
00bbef94	cmp x4,#0x4
00bbef98	b.eq 0x00bbefd0
00bbef9c	b 0x00bbefe8
00bbefa0	cmp x4,#0x5
00bbefa4	b.eq 0x00bbefc8
00bbefa8	cmp x4,#0x6
00bbefac	b.eq 0x00bbefc0
00bbefb0	cmp x4,#0x7
00bbefb4	b.ne 0x00bbefe8
00bbefb8	ldrb w8,[x3, #0x6]
00bbefbc	orr x9,x9,x8, LSL #0x30
00bbefc0	ldrb w8,[x3, #0x5]
00bbefc4	add x9,x9,x8, LSL #0x28
00bbefc8	ldrb w8,[x3, #0x4]
00bbefcc	add x9,x9,x8, LSL #0x20
00bbefd0	ldrb w8,[x3, #0x3]
00bbefd4	add x9,x9,x8, LSL #0x18
00bbefd8	ldrb w8,[x3, #0x2]
00bbefdc	add x9,x9,x8, LSL #0x10
00bbefe0	ldrb w8,[x3, #0x1]
00bbefe4	add x9,x9,x8, LSL #0x8
00bbefe8	add x8,x3,x4
00bbefec	ldurb w8,[x8, #-0x1]
00bbeff0	cbz w8,0x00bbf05c
00bbeff4	clz w8,w8
00bbeff8	mov x10,xzr
00bbeffc	sub w8,w8,w4, LSL #0x3
00bbf000	add w11,w8,#0x29
00bbf004	ldr x8,[x0]
00bbf008	ldr w13,[x8, #0x4]
00bbf00c	add w12,w13,w11
00bbf010	adrp x11,0x789000
00bbf014	add x11,x11,#0xa30
00bbf018	ldr w11,[x11, x13, LSL #0x2]
00bbf01c	cmp w12,#0x40
00bbf020	neg w13,w12
00bbf024	b.hi 0x00bbf10c
00bbf028	cmp x10,#0x8
00bbf02c	add x14,x3,x10
00bbf030	b.ge 0x00bbf064
00bbf034	mov x28,x3
00bbf038	mov x16,x9
00bbf03c	cbz x10,0x00bbf074
00bbf040	lsr w15,w12,#0x3
00bbf044	sub x16,x14,x15
00bbf048	cmp x16,x3
00bbf04c	csel w10,w10,w15,cc
00bbf050	sub x28,x14,x10
00bbf054	sub w12,w12,w10, LSL #0x3
00bbf058	b 0x00bbf070
00bbf05c	mov x0,#-0x14
00bbf060	b 0x00bbf7c8
00bbf064	lsr w10,w12,#0x3
00bbf068	and w12,w12,#0x7
00bbf06c	sub x28,x14,x10
00bbf070	ldr x16,[x28]
00bbf074	ldr x10,[x0, #0x10]
00bbf078	mov x6,x16
00bbf07c	add x4,x3,#0x8
00bbf080	stp x21,x20,[sp, #0x18]
00bbf084	ldr w14,[x10, #0x4]
00bbf088	str x17,[sp, #0x28]
00bbf08c	str x5,[sp, #0x10]
00bbf090	add w15,w14,w12
00bbf094	lsr x12,x9,x13
00bbf098	str x2,[sp, #0x58]
00bbf09c	neg w9,w15
00bbf0a0	cmp w15,#0x40
00bbf0a4	lsr x13,x16,x9
00bbf0a8	adrp x9,0x789000
00bbf0ac	add x9,x9,#0xa30
00bbf0b0	ldr w14,[x9, x14, LSL #0x2]
00bbf0b4	b.hi 0x00bbf11c
00bbf0b8	cmp x28,x4
00bbf0bc	b.cs 0x00bbf0ec
00bbf0c0	cmp x28,x3
00bbf0c4	b.eq 0x00bbf124
00bbf0c8	lsr w9,w15,#0x3
00bbf0cc	sub w17,w28,w3
00bbf0d0	sub x16,x28,x9
00bbf0d4	cmp x16,x3
00bbf0d8	csel w9,w17,w9,cc
00bbf0dc	sub x28,x28,x9
00bbf0e0	sub w15,w15,w9, LSL #0x3
00bbf0e4	ldr x20,[x28]
00bbf0e8	b 0x00bbf128
00bbf0ec	lsr w9,w15,#0x3
00bbf0f0	and w15,w15,#0x7
00bbf0f4	sub x28,x28,x9
00bbf0f8	ldr x20,[x28]
00bbf0fc	b 0x00bbf128
00bbf100	mov x8,xzr
00bbf104	sub x0,x8,x20
00bbf108	b 0x00bbf7c8
00bbf10c	adrp x28,0x789000
00bbf110	add x28,x28,#0xab0
00bbf114	mov x16,x9
00bbf118	b 0x00bbf074
00bbf11c	adrp x28,0x789000
00bbf120	add x28,x28,#0xab0
00bbf124	mov x20,x6
00bbf128	ldr x9,[x0, #0x8]
00bbf12c	adrp x17,0x789000
00bbf130	add x17,x17,#0xa30
00bbf134	and x6,x13,x14
00bbf138	mov x21,x1
00bbf13c	stp x3,x4,[sp, #0x30]
00bbf140	ldr w16,[x9, #0x4]
00bbf144	add w24,w16,w15
00bbf148	ldr w16,[x17, x16, LSL #0x2]
00bbf14c	and x17,x12,x11
00bbf150	neg w15,w24
00bbf154	cmp w24,#0x40
00bbf158	lsr x15,x20,x15
00bbf15c	and x25,x15,x16
00bbf160	b.hi 0x00bbf804
00bbf164	cmp x28,x4
00bbf168	b.cs 0x00bbf194
00bbf16c	cmp x28,x3
00bbf170	b.eq 0x00bbf1a4
00bbf174	lsr w11,w24,#0x3
00bbf178	sub w13,w28,w3
00bbf17c	sub x12,x28,x11
00bbf180	cmp x12,x3
00bbf184	csel w11,w13,w11,cc
00bbf188	sub x28,x28,x11
00bbf18c	sub w24,w24,w11, LSL #0x3
00bbf190	b 0x00bbf1a0
00bbf194	lsr w11,w24,#0x3
00bbf198	and w24,w24,#0x7
00bbf19c	sub x28,x28,x11
00bbf1a0	ldr x20,[x28]
00bbf1a4	add x1,x8,#0x8
00bbf1a8	ldr x8,[sp, #0x28]
00bbf1ac	ldr x27,[sp, #0x20]
00bbf1b0	add x2,x10,#0x8
00bbf1b4	add x3,x9,#0x8
00bbf1b8	add x9,x21,#0x10
00bbf1bc	sub x8,x8,#0x20
00bbf1c0	stp x2,x1,[sp, #0x48]
00bbf1c4	stur x8,[x29, #-0x48]
00bbf1c8	add x8,x21,#0x18
00bbf1cc	stp x8,x9,[sp]
00bbf1d0	str x3,[sp, #0x40]
00bbf1d4	add x9,x2,x6, LSL #0x3
00bbf1d8	add x10,x1,x17, LSL #0x3
00bbf1dc	ldrb w12,[x9, #0x2]
00bbf1e0	ldr w8,[x10, #0x4]
00bbf1e4	ldr w11,[x9, #0x4]
00bbf1e8	cmp w12,#0x2
00bbf1ec	b.cc 0x00bbf214
00bbf1f0	lsl x13,x20,x24
00bbf1f4	neg w14,w12
00bbf1f8	str x23,[sp, #0x58]
00bbf1fc	mov x23,x26
00bbf200	add w24,w24,w12
00bbf204	lsr x13,x13,x14
00bbf208	add x11,x13,x11
00bbf20c	mov x26,x11
00bbf210	b 0x00bbf228
00bbf214	cmp w8,#0x0
00bbf218	cbnz w12,0x00bbf5f4
00bbf21c	csel x11,x26,x23,eq
00bbf220	csel x26,x23,x26,eq
00bbf224	mov x23,x11
00bbf228	add x11,x3,x25, LSL #0x3
00bbf22c	ldrb w14,[x11, #0x2]
00bbf230	ldr w5,[x11, #0x4]
00bbf234	cbz w14,0x00bbf250
00bbf238	lsl x13,x20,x24
00bbf23c	neg w15,w14
00bbf240	add w24,w24,w14
00bbf244	lsr x13,x13,x15
00bbf248	add x5,x13,x5
00bbf24c	b 0x00bbf250
00bbf250	ldrb w13,[x10, #0x2]
00bbf254	add w14,w14,w13
00bbf258	add w12,w14,w12
00bbf25c	and w12,w12,#0xff
00bbf260	cmp w12,#0x1f
00bbf264	b.cs 0x00bbf524
00bbf268	cbz w13,0x00bbf280
00bbf26c	lsl x12,x20,x24
00bbf270	neg w14,w13
00bbf274	add w24,w24,w13
00bbf278	lsr x12,x12,x14
00bbf27c	add x8,x12,x8
00bbf280	cmp w22,#0x1
00bbf284	b.ne 0x00bbf290
00bbf288	stur x24,[x29, #-0x38]
00bbf28c	b 0x00bbf354
00bbf290	ldrb w12,[x10, #0x3]
00bbf294	ldrb w13,[x11, #0x3]
00bbf298	adrp x0,0x789000
00bbf29c	add x0,x0,#0xa30
00bbf2a0	ldrb w15,[x9, #0x3]
00bbf2a4	ldrh w10,[x10]
00bbf2a8	add w14,w24,w12
00bbf2ac	ldr w12,[x0, w12, UXTW #0x2]
00bbf2b0	ldrh w11,[x11]
00bbf2b4	neg w16,w14
00bbf2b8	add w14,w14,w13
00bbf2bc	ldr w13,[x0, w13, UXTW #0x2]
00bbf2c0	lsr x16,x20,x16
00bbf2c4	add w4,w14,w15
00bbf2c8	neg w17,w14
00bbf2cc	lsr x14,x20,x17
00bbf2d0	ldr w15,[x0, w15, UXTW #0x2]
00bbf2d4	ldrh w9,[x9]
00bbf2d8	and x12,x16,x12
00bbf2dc	neg w16,w4
00bbf2e0	cmp w4,#0x40
00bbf2e4	lsr x16,x20,x16
00bbf2e8	and x13,x14,x13
00bbf2ec	add x17,x12,x10
00bbf2f0	add x25,x13,x11
00bbf2f4	and x14,x16,x15
00bbf2f8	add x6,x14,x9
00bbf2fc	b.hi 0x00bbf618
00bbf300	ldr x9,[sp, #0x38]
00bbf304	cmp x28,x9
00bbf308	b.cs 0x00bbf340
00bbf30c	ldr x12,[sp, #0x30]
00bbf310	cmp x28,x12
00bbf314	b.eq 0x00bbf338
00bbf318	lsr w9,w4,#0x3
00bbf31c	sub w11,w28,w12
00bbf320	sub x10,x28,x9
00bbf324	cmp x10,x12
00bbf328	csel w9,w11,w9,cc
00bbf32c	sub x28,x28,x9
00bbf330	sub w4,w4,w9, LSL #0x3
00bbf334	ldr x20,[x28]
00bbf338	stur x4,[x29, #-0x38]
00bbf33c	b 0x00bbf354
00bbf340	lsr w9,w4,#0x3
00bbf344	and w4,w4,#0x7
00bbf348	stur x4,[x29, #-0x38]
00bbf34c	sub x28,x28,x9
00bbf350	ldr x20,[x28]
00bbf354	ldur x11,[x29, #-0x30]
00bbf358	ldur x12,[x29, #-0x40]
00bbf35c	add x19,x27,x8
00bbf360	sub x9,x19,x26
00bbf364	add x10,x11,x8
00bbf368	prfm PLDL1KEEP,[x9]
00bbf36c	cmp x10,x12
00bbf370	b.hi 0x00bbf4e0
00bbf374	add x0,x8,x5
00bbf378	ldur x13,[x29, #-0x48]
00bbf37c	add x12,x27,x0
00bbf380	cmp x12,x13
00bbf384	b.hi 0x00bbf4e0
00bbf388	ldr q0,[x11]
00bbf38c	subs x8,x8,#0x10
00bbf390	str q0,[x27]
00bbf394	b.hi 0x00bbf568
00bbf398	sub x24,x19,x21
00bbf39c	stur x10,[x29, #-0x30]
00bbf3a0	cmp x26,x24
00bbf3a4	b.ls 0x00bbf440
00bbf3a8	ldr x8,[sp, #0x68]
00bbf3ac	sub x8,x19,x8
00bbf3b0	cmp x26,x8
00bbf3b4	b.hi 0x00bbf7f8
00bbf3b8	str x20,[sp, #0x70]
00bbf3bc	mov w20,w22
00bbf3c0	mov x22,x26
00bbf3c4	mov x26,x23
00bbf3c8	mov x23,x21
00bbf3cc	sub x21,x9,x21
00bbf3d0	ldr x9,[sp, #0x60]
00bbf3d4	stp x0,x27,[x29, #-0x68]
00bbf3d8	mov x27,x17
00bbf3dc	stp x6,x25,[x29, #-0x58]
00bbf3e0	add x1,x9,x21
00bbf3e4	add x8,x1,x5
00bbf3e8	cmp x8,x9
00bbf3ec	b.ls 0x00bbf48c
00bbf3f0	neg x2,x21
00bbf3f4	mov x0,x19
00bbf3f8	mov x25,x5
00bbf3fc	bl 0x00c2ff60
00bbf400	mov x17,x27
00bbf404	ldp x27,x6,[x29, #-0x60]
00bbf408	ldp x2,x1,[sp, #0x48]
00bbf40c	mov x5,x25
00bbf410	sub x19,x19,x21
00bbf414	add x12,x21,x25
00bbf418	mov x9,x23
00bbf41c	mov x21,x23
00bbf420	mov x23,x26
00bbf424	mov x26,x22
00bbf428	mov w22,w20
00bbf42c	ldr x20,[sp, #0x70]
00bbf430	ldur x25,[x29, #-0x50]
00bbf434	ldr x3,[sp, #0x40]
00bbf438	ldur x0,[x29, #-0x68]
00bbf43c	b 0x00bbf444
00bbf440	mov x12,x5
00bbf444	cmp x26,#0x10
00bbf448	b.cc 0x00bbf5a0
00bbf44c	ldr q0,[x9]
00bbf450	cmp x12,#0x11
00bbf454	str q0,[x19]
00bbf458	b.cc 0x00bbf484
00bbf45c	add x8,x19,x12
00bbf460	add x10,x19,#0x10
00bbf464	add x9,x9,#0x20
00bbf468	ldur q0,[x9, #-0x10]
00bbf46c	str q0,[x10]
00bbf470	ldr q0,[x9], #0x20
00bbf474	str q0,[x10, #0x10]
00bbf478	add x10,x10,#0x20
00bbf47c	cmp x10,x8
00bbf480	b.cc 0x00bbf468
00bbf484	ldur x24,[x29, #-0x38]
00bbf488	b 0x00bbf4c8
00bbf48c	mov x0,x19
00bbf490	mov x2,x5
00bbf494	bl 0x00c2ff60
00bbf498	mov x17,x27
00bbf49c	ldp x27,x6,[x29, #-0x60]
00bbf4a0	ldp x2,x1,[sp, #0x48]
00bbf4a4	mov x21,x23
00bbf4a8	mov x23,x26
00bbf4ac	mov x26,x22
00bbf4b0	mov w22,w20
00bbf4b4	ldr x20,[sp, #0x70]
00bbf4b8	ldur x25,[x29, #-0x50]
00bbf4bc	ldr x3,[sp, #0x40]
00bbf4c0	ldur x24,[x29, #-0x38]
00bbf4c4	ldur x0,[x29, #-0x68]
00bbf4c8	cmn x0,#0x78
00bbf4cc	b.hi 0x00bbf7c4
00bbf4d0	subs w22,w22,#0x1
00bbf4d4	add x27,x27,x0
00bbf4d8	b.ne 0x00bbf1d4
00bbf4dc	b 0x00bbf78c
00bbf4e0	mov x24,x6
00bbf4e4	ldp x7,x6,[sp, #0x60]
00bbf4e8	ldr x1,[sp, #0x28]
00bbf4ec	ldur x4,[x29, #-0x40]
00bbf4f0	sub x2,x29,#0x28
00bbf4f4	stp x8,x5,[x29, #-0x28]
00bbf4f8	sub x3,x29,#0x30
00bbf4fc	mov x0,x27
00bbf500	mov x5,x21
00bbf504	stur x26,[x29, #-0x18]
00bbf508	mov x19,x17
00bbf50c	bl 0x00bbf92c
00bbf510	ldp x3,x2,[sp, #0x40]
00bbf514	mov x17,x19
00bbf518	ldr x1,[sp, #0x50]
00bbf51c	mov x6,x24
00bbf520	b 0x00bbf484
00bbf524	cmp w24,#0x40
00bbf528	b.hi 0x00bbf780
00bbf52c	ldr x12,[sp, #0x38]
00bbf530	cmp x28,x12
00bbf534	b.cs 0x00bbf628
00bbf538	ldr x16,[sp, #0x30]
00bbf53c	cmp x28,x16
00bbf540	b.eq 0x00bbf268
00bbf544	lsr w12,w24,#0x3
00bbf548	sub w15,w28,w16
00bbf54c	sub x14,x28,x12
00bbf550	cmp x14,x16
00bbf554	csel w12,w15,w12,cc
00bbf558	sub x28,x28,x12
00bbf55c	sub w24,w24,w12, LSL #0x3
00bbf560	ldr x20,[x28]
00bbf564	b 0x00bbf268
00bbf568	ldr q0,[x11, #0x10]
00bbf56c	cmp x8,#0x11
00bbf570	str q0,[x27, #0x10]
00bbf574	b.cc 0x00bbf398
00bbf578	add x8,x27,#0x20
00bbf57c	add x11,x11,#0x30
00bbf580	ldur q0,[x11, #-0x10]
00bbf584	str q0,[x8]
00bbf588	ldr q0,[x11], #0x20
00bbf58c	str q0,[x8, #0x10]
00bbf590	add x8,x8,#0x20
00bbf594	cmp x8,x19
00bbf598	b.cc 0x00bbf580
00bbf59c	b 0x00bbf398
00bbf5a0	cmp x26,#0x7
00bbf5a4	b.hi 0x00bbf63c
00bbf5a8	ldrb w8,[x9]
00bbf5ac	adrp x10,0x364000
00bbf5b0	add x10,x10,#0xd10
00bbf5b4	ldrsw x10,[x10, x26, LSL #0x2]
00bbf5b8	strb w8,[x19]
00bbf5bc	ldrb w8,[x9, #0x1]
00bbf5c0	strb w8,[x19, #0x1]
00bbf5c4	ldrb w8,[x9, #0x2]
00bbf5c8	strb w8,[x19, #0x2]
00bbf5cc	ldrb w8,[x9, #0x3]
00bbf5d0	strb w8,[x19, #0x3]
00bbf5d4	adrp x8,0x364000
00bbf5d8	add x8,x8,#0xe10
00bbf5dc	ldr w8,[x8, x26, LSL #0x2]
00bbf5e0	add x8,x9,x8
00bbf5e4	ldr w9,[x8]
00bbf5e8	str w9,[x19, #0x4]
00bbf5ec	sub x9,x8,x10
00bbf5f0	b 0x00bbf644
00bbf5f4	lsl x13,x20,x24
00bbf5f8	cinc w11,w11,eq
00bbf5fc	add x11,x11,x13, LSR #0x3f
00bbf600	cmp x11,#0x1
00bbf604	b.eq 0x00bbf754
00bbf608	cmp x11,#0x3
00bbf60c	b.ne 0x00bbf740
00bbf610	sub x11,x26,#0x1
00bbf614	b 0x00bbf74c
00bbf618	stur x4,[x29, #-0x38]
00bbf61c	adrp x28,0x789000
00bbf620	add x28,x28,#0xab0
00bbf624	b 0x00bbf354
00bbf628	lsr w12,w24,#0x3
00bbf62c	and w24,w24,#0x7
00bbf630	sub x28,x28,x12
00bbf634	ldr x20,[x28]
00bbf638	b 0x00bbf268
00bbf63c	ldr x8,[x9]
00bbf640	str x8,[x19]
00bbf644	cmp x12,#0x9
00bbf648	b.cc 0x00bbf484
00bbf64c	add x11,x9,#0x8
00bbf650	add x10,x19,#0x8
00bbf654	add x8,x19,x12
00bbf658	sub x13,x10,x11
00bbf65c	cmp x13,#0xf
00bbf660	b.gt 0x00bbf704
00bbf664	cmp x26,x24
00bbf668	add x12,x5,x21
00bbf66c	ldr x15,[sp, #0x8]
00bbf670	csel x14,x26,x24,cc
00bbf674	add x12,x12,x14
00bbf678	csel x14,x26,x24,hi
00bbf67c	add x12,x12,x14
00bbf680	add x15,x15,x14
00bbf684	sub x12,x12,x26
00bbf688	cmp x12,x15
00bbf68c	csel x12,x12,x15,hi
00bbf690	add x15,x14,x21
00bbf694	sub x12,x12,x15
00bbf698	sub x12,x12,#0x9
00bbf69c	cmp x12,#0x18
00bbf6a0	b.cc 0x00bbf768
00bbf6a4	ldur x24,[x29, #-0x38]
00bbf6a8	cmp x13,#0x20
00bbf6ac	b.cc 0x00bbf76c
00bbf6b0	lsr x12,x12,#0x3
00bbf6b4	ldr x16,[sp]
00bbf6b8	sub x14,x14,x27
00bbf6bc	add x9,x9,#0x18
00bbf6c0	add x12,x12,#0x1
00bbf6c4	add x16,x27,x16
00bbf6c8	and x13,x12,#0x3ffffffffffffffc
00bbf6cc	add x14,x16,x14
00bbf6d0	lsl x15,x13,#0x3
00bbf6d4	add x10,x10,x15
00bbf6d8	add x11,x11,x15
00bbf6dc	mov x15,x13
00bbf6e0	ldp q0,q1,[x9, #-0x10]
00bbf6e4	subs x15,x15,#0x4
00bbf6e8	add x9,x9,#0x20
00bbf6ec	stp q0,q1,[x14, #-0x10]
00bbf6f0	add x14,x14,#0x20
00bbf6f4	b.ne 0x00bbf6e0
00bbf6f8	cmp x12,x13
00bbf6fc	b.ne 0x00bbf76c
00bbf700	b 0x00bbf4c8
00bbf704	sub x12,x12,#0x8
00bbf708	ldr q0,[x11]
00bbf70c	cmp x12,#0x11
00bbf710	str q0,[x10]
00bbf714	b.cc 0x00bbf484
00bbf718	add x10,x19,#0x18
00bbf71c	add x9,x9,#0x28
00bbf720	ldur q0,[x9, #-0x10]
00bbf724	str q0,[x10]
00bbf728	ldr q0,[x9], #0x20
00bbf72c	str q0,[x10, #0x10]
00bbf730	add x10,x10,#0x20
00bbf734	cmp x10,x8
00bbf738	b.cc 0x00bbf720
00bbf73c	b 0x00bbf484
00bbf740	cmp x11,#0x0
00bbf744	ldr x11,[sp, #0x58]
00bbf748	csel x11,x26,x11,eq
00bbf74c	str x23,[sp, #0x58]
00bbf750	mov x23,x11
00bbf754	cmp x23,#0x0
00bbf758	add w24,w24,#0x1
00bbf75c	csinv x11,x23,xzr,ne
00bbf760	mov x23,x26
00bbf764	b 0x00bbf20c
00bbf768	ldur x24,[x29, #-0x38]
00bbf76c	ldr x9,[x11], #0x8
00bbf770	str x9,[x10], #0x8
00bbf774	cmp x10,x8
00bbf778	b.cc 0x00bbf76c
00bbf77c	b 0x00bbf4c8
00bbf780	adrp x28,0x789000
00bbf784	add x28,x28,#0xab0
00bbf788	b 0x00bbf268
00bbf78c	ldr x8,[sp, #0x30]
00bbf790	mov x0,#-0x14
00bbf794	cmp x28,x8
00bbf798	b.ne 0x00bbf7c4
00bbf79c	ldr x21,[sp, #0x18]
00bbf7a0	cmp w24,#0x40
00bbf7a4	b.ne 0x00bbf7c8
00bbf7a8	ldp x20,x17,[sp, #0x20]
00bbf7ac	ldr x8,[sp, #0x10]
00bbf7b0	ldur x1,[x29, #-0x30]
00bbf7b4	ldr x9,[sp, #0x58]
00bbf7b8	stp w26,w23,[x8]
00bbf7bc	str w9,[x8, #0x8]
00bbf7c0	b 0x00bbef44
00bbf7c4	ldr x21,[sp, #0x18]
00bbf7c8	ldr x8,[x21, #0x28]
00bbf7cc	ldur x9,[x29, #-0x10]
00bbf7d0	cmp x8,x9
00bbf7d4	b.ne 0x00bbf810
00bbf7d8	ldp x20,x19,[sp, #0x130]
00bbf7dc	ldp x22,x21,[sp, #0x120]
00bbf7e0	ldp x24,x23,[sp, #0x110]
00bbf7e4	ldp x26,x25,[sp, #0x100]
00bbf7e8	ldp x28,x27,[sp, #0xf0]
00bbf7ec	ldp x29,x30,[sp, #0xe0]
00bbf7f0	add sp,sp,#0x140
00bbf7f4	ret
00bbf7f8	ldr x21,[sp, #0x18]
00bbf7fc	mov x0,#-0x14
00bbf800	b 0x00bbf7c8
00bbf804	adrp x28,0x789000
00bbf808	add x28,x28,#0xab0
00bbf80c	b 0x00bbf1a4
00bbf810	bl 0x00c2fec0
