; PKCS7_dataInit @ 00abeef8
00abeef8	sub sp,sp,#0xe0
00abeefc	stp x29,x30,[sp, #0xd0]
00abef00	add x29,sp,#0xd0
00abef04	stp x28,x27,[sp, #0x80]
00abef08	stp x26,x25,[sp, #0x90]
00abef0c	stp x24,x23,[sp, #0xa0]
00abef10	stp x22,x21,[sp, #0xb0]
00abef14	stp x20,x19,[sp, #0xc0]
00abef18	stur xzr,[x29, #-0x60]
00abef1c	cbz x0,0x00abefc4
00abef20	mov x19,x1
00abef24	mov x20,x0
00abef28	bl 0x00c3f7f0
00abef2c	mov x22,x0
00abef30	bl 0x00c3f7d0
00abef34	mov x23,x0
00abef38	mov x0,x22
00abef3c	bl 0x00c3f7e0
00abef40	ldr x8,[x20, #0x20]
00abef44	cbz x8,0x00abefec
00abef48	mov x24,x0
00abef4c	ldr x0,[x20, #0x18]
00abef50	bl 0x00c37750
00abef54	sub w8,w0,#0x15
00abef58	cmp w8,#0x4
00abef5c	str wzr,[x20, #0x10]
00abef60	b.hi 0x00abf01c
00abef64	adrp x9,0x774000
00abef68	add x9,x9,#0x538
00abef6c	ldrsw x8,[x9, x8, LSL #0x2]
00abef70	mov x25,xzr
00abef74	mov x26,xzr
00abef78	mov x11,xzr
00abef7c	add x8,x8,x9
00abef80	mov x21,xzr
00abef84	mov x10,xzr
00abef88	mov x27,xzr
00abef8c	br x8
00abef90	ldr x8,[x20, #0x20]
00abef94	ldr x27,[x8, #0x28]
00abef98	ldr x26,[x8, #0x8]
00abef9c	ldr x0,[x27, #0x18]
00abefa0	bl 0x00c37750
00abefa4	cmp w0,#0x15
00abefa8	b.ne 0x00abf0b8
00abefac	ldr x10,[x27, #0x20]
00abefb0	mov x25,xzr
00abefb4	mov x11,xzr
00abefb8	mov x21,xzr
00abefbc	mov x27,xzr
00abefc0	b 0x00abf144
00abefc4	bl 0x00c342a0
00abefc8	adrp x0,0x29e000
00abefcc	adrp x2,0x2c0000
00abefd0	add x0,x0,#0x913
00abefd4	add x2,x2,#0x45d
00abefd8	mov w1,#0xe1
00abefdc	bl 0x00c342b0
00abefe0	mov w0,#0x21
00abefe4	mov w1,#0x8f
00abefe8	b 0x00abf010
00abefec	bl 0x00c342a0
00abeff0	adrp x0,0x29e000
00abeff4	adrp x2,0x2c0000
00abeff8	add x0,x0,#0x913
00abeffc	add x2,x2,#0x45d
00abf000	mov w1,#0xf3
00abf004	bl 0x00c342b0
00abf008	mov w0,#0x21
00abf00c	mov w1,#0x7a
00abf010	mov x2,xzr
00abf014	bl 0x00c342c0
00abf018	b 0x00abf494
00abf01c	bl 0x00c342a0
00abf020	adrp x0,0x29e000
00abf024	adrp x2,0x2c0000
00abf028	add x0,x0,#0x913
00abf02c	add x2,x2,#0x45d
00abf030	mov w1,#0x119
00abf034	bl 0x00c342b0
00abf038	mov w0,#0x21
00abf03c	orr w1,wzr,#0x70
00abf040	b 0x00abf46c
00abf044	ldr x9,[x20, #0x20]
00abf048	ldr x8,[x9, #0x10]
00abf04c	ldr x25,[x8, #0x18]
00abf050	cbz x25,0x00abf42c
00abf054	ldr x11,[x9, #0x8]
00abf058	mov x26,xzr
00abf05c	b 0x00abf078
00abf060	ldr x9,[x20, #0x20]
00abf064	ldr x8,[x9, #0x28]
00abf068	ldr x25,[x8, #0x18]
00abf06c	cbz x25,0x00abf448
00abf070	ldr x11,[x9, #0x30]
00abf074	ldr x26,[x9, #0x8]
00abf078	mov x10,xzr
00abf07c	ldr x21,[x8, #0x8]
00abf080	mov x27,xzr
00abf084	b 0x00abf144
00abf088	ldr x8,[x20, #0x20]
00abf08c	ldp x27,x21,[x8, #0x8]
00abf090	ldr x0,[x21, #0x18]
00abf094	bl 0x00c37750
00abf098	cmp w0,#0x15
00abf09c	b.ne 0x00abf0e8
00abf0a0	ldr x10,[x21, #0x20]
00abf0a4	mov x25,xzr
00abf0a8	mov x26,xzr
00abf0ac	mov x11,xzr
00abf0b0	mov x21,xzr
00abf0b4	b 0x00abf144
00abf0b8	ldr x0,[x27, #0x18]
00abf0bc	bl 0x00c37750
00abf0c0	sub w8,w0,#0x15
00abf0c4	cmp w8,#0x6
00abf0c8	b.cc 0x00abf118
00abf0cc	ldr x8,[x27, #0x20]
00abf0d0	cbz x8,0x00abf118
00abf0d4	ldr w9,[x8]
00abf0d8	cmp w9,#0x4
00abf0dc	b.ne 0x00abf118
00abf0e0	ldr x10,[x8, #0x8]
00abf0e4	b 0x00abefb0
00abf0e8	ldr x0,[x21, #0x18]
00abf0ec	bl 0x00c37750
00abf0f0	sub w8,w0,#0x15
00abf0f4	cmp w8,#0x6
00abf0f8	b.cc 0x00abf130
00abf0fc	ldr x8,[x21, #0x20]
00abf100	cbz x8,0x00abf130
00abf104	ldr w9,[x8]
00abf108	cmp w9,#0x4
00abf10c	b.ne 0x00abf130
00abf110	ldr x10,[x8, #0x8]
00abf114	b 0x00abf0a4
00abf118	mov x25,xzr
00abf11c	mov x11,xzr
00abf120	mov x21,xzr
00abf124	mov x10,xzr
00abf128	mov x27,xzr
00abf12c	b 0x00abf144
00abf130	mov x25,xzr
00abf134	mov x26,xzr
00abf138	mov x11,xzr
00abf13c	mov x21,xzr
00abf140	mov x10,xzr
00abf144	mov x0,x26
00abf148	stp x10,x11,[sp, #0x8]
00abf14c	bl 0x00c325e0
00abf150	cmp w0,#0x1
00abf154	b.lt 0x00abf190
00abf158	mov w28,wzr
00abf15c	mov x0,x26
00abf160	mov w1,w28
00abf164	bl 0x00c32610
00abf168	mov x1,x0
00abf16c	sub x0,x29,#0x60
00abf170	mov x2,x22
00abf174	bl 0x00abf620
00abf178	cbz w0,0x00abf474
00abf17c	mov x0,x26
00abf180	add w28,w28,#0x1
00abf184	bl 0x00c325e0
00abf188	cmp w28,w0
00abf18c	b.lt 0x00abf15c
00abf190	cbz x27,0x00abf1a8
00abf194	sub x0,x29,#0x60
00abf198	mov x1,x27
00abf19c	mov x2,x22
00abf1a0	bl 0x00abf620
00abf1a4	cbz w0,0x00abf474
00abf1a8	cbz x25,0x00abf504
00abf1ac	bl 0x00c3bfd0
00abf1b0	bl 0x00c32240
00abf1b4	mov x22,x0
00abf1b8	cbz x0,0x00abf3f4
00abf1bc	mov w1,#0x81
00abf1c0	add x3,sp,#0x18
00abf1c4	mov x0,x22
00abf1c8	mov x2,xzr
00abf1cc	bl 0x00c321a0
00abf1d0	mov x0,x25
00abf1d4	bl 0x00c34bd0
00abf1d8	mov w26,w0
00abf1dc	mov x0,x25
00abf1e0	bl 0x00c34bc0
00abf1e4	mov w27,w0
00abf1e8	mov x0,x25
00abf1ec	bl 0x00c3cf00
00abf1f0	bl 0x00c37740
00abf1f4	cmp w27,#0x1
00abf1f8	str x0,[x21]
00abf1fc	b.lt 0x00abf21c
00abf200	sxtw x2,w27
00abf204	add x1,sp,#0x20
00abf208	mov x0,x23
00abf20c	mov w3,wzr
00abf210	bl 0x00c347b0
00abf214	cmp w0,#0x1
00abf218	b.lt 0x00abf618
00abf21c	bl 0x00c35250
00abf220	mov x0,x25
00abf224	bl 0x00c3cef0
00abf228	mov x1,x0
00abf22c	mov x0,x23
00abf230	mov x2,x24
00abf234	bl 0x00c35260
00abf238	mov x23,x0
00abf23c	bl 0x00c35240
00abf240	ldr x0,[sp, #0x18]
00abf244	cmp x23,#0x0
00abf248	csel x1,x25,x23,eq
00abf24c	mov w5,#0x1
00abf250	mov x2,xzr
00abf254	mov x3,xzr
00abf258	mov x4,xzr
00abf25c	bl 0x00c34be0
00abf260	cmp w0,#0x1
00abf264	b.lt 0x00abf47c
00abf268	mov x0,x23
00abf26c	bl 0x00c357d0
00abf270	ldr x0,[sp, #0x18]
00abf274	add x1,sp,#0x30
00abf278	bl 0x00c3ccb0
00abf27c	cmp w0,#0x1
00abf280	b.lt 0x00abf618
00abf284	ldr x0,[sp, #0x18]
00abf288	add x3,sp,#0x30
00abf28c	add x4,sp,#0x20
00abf290	mov w5,#0x1
00abf294	mov x1,xzr
00abf298	mov x2,xzr
00abf29c	bl 0x00c34be0
00abf2a0	cmp w0,#0x1
00abf2a4	b.lt 0x00abf618
00abf2a8	ldr x25,[sp, #0x10]
00abf2ac	cmp w27,#0x1
00abf2b0	b.lt 0x00abf2dc
00abf2b4	ldr x1,[x21, #0x8]
00abf2b8	cbnz x1,0x00abf2cc
00abf2bc	bl 0x00c37a40
00abf2c0	mov x1,x0
00abf2c4	str x0,[x21, #0x8]
00abf2c8	cbz x0,0x00abf618
00abf2cc	ldr x0,[sp, #0x18]
00abf2d0	bl 0x00c3cf20
00abf2d4	cmp w0,#0x1
00abf2d8	b.lt 0x00abf618
00abf2dc	mov x0,x25
00abf2e0	bl 0x00c325e0
00abf2e4	cmp w0,#0x0
00abf2e8	b.le 0x00abf4bc
00abf2ec	adrp x21,0x29e000
00abf2f0	mov w24,wzr
00abf2f4	sxtw x23,w26
00abf2f8	add x21,x21,#0x913
00abf2fc	mov x0,x25
00abf300	mov w1,w24
00abf304	bl 0x00c32610
00abf308	mov x27,x0
00abf30c	ldr x0,[x0, #0x20]
00abf310	ldr x28,[x27, #0x28]
00abf314	bl 0x00c32cb0
00abf318	cbz x0,0x00abf618
00abf31c	mov x26,x0
00abf320	mov x0,x28
00abf324	bl 0x00c3f7d0
00abf328	mov x25,x0
00abf32c	mov x0,x28
00abf330	bl 0x00c3f7e0
00abf334	mov x2,x0
00abf338	mov x0,x25
00abf33c	mov x1,x26
00abf340	bl 0x00c34640
00abf344	cbz x0,0x00abf618
00abf348	mov x26,x0
00abf34c	bl 0x00c37130
00abf350	cmp w0,#0x1
00abf354	b.lt 0x00abf4e4
00abf358	sub x2,x29,#0x58
00abf35c	add x3,sp,#0x30
00abf360	mov x0,x26
00abf364	mov x1,xzr
00abf368	mov x4,x23
00abf36c	bl 0x00c37120
00abf370	cmp w0,#0x1
00abf374	b.lt 0x00abf4e4
00abf378	ldur x0,[x29, #-0x58]
00abf37c	mov w2,#0x85
00abf380	mov x1,x21
00abf384	bl 0x00c32320
00abf388	cbz x0,0x00abf5b0
00abf38c	mov x28,x0
00abf390	sub x2,x29,#0x58
00abf394	add x3,sp,#0x30
00abf398	mov x0,x26
00abf39c	mov x1,x28
00abf3a0	mov x4,x23
00abf3a4	bl 0x00c37120
00abf3a8	cmp w0,#0x1
00abf3ac	b.lt 0x00abf5fc
00abf3b0	ldr x0,[x27, #0x18]
00abf3b4	ldur w2,[x29, #-0x58]
00abf3b8	mov x1,x28
00abf3bc	bl 0x00c37be0
00abf3c0	mov x0,x26
00abf3c4	bl 0x00c34620
00abf3c8	mov w2,#0x96
00abf3cc	mov x0,xzr
00abf3d0	mov x1,x21
00abf3d4	bl 0x00c32310
00abf3d8	ldr x25,[sp, #0x10]
00abf3dc	add w24,w24,#0x1
00abf3e0	mov x0,x25
00abf3e4	bl 0x00c325e0
00abf3e8	cmp w24,w0
00abf3ec	b.lt 0x00abf2fc
00abf3f0	b 0x00abf4c0
00abf3f4	bl 0x00c342a0
00abf3f8	adrp x0,0x29e000
00abf3fc	adrp x2,0x2c0000
00abf400	add x0,x0,#0x913
00abf404	add x2,x2,#0x45d
00abf408	mov w1,#0x12b
00abf40c	bl 0x00c342b0
00abf410	mov w1,#0x20
00abf414	mov w0,#0x21
00abf418	movk w1,#0x8, LSL #16
00abf41c	mov x2,xzr
00abf420	bl 0x00c342c0
00abf424	mov x23,xzr
00abf428	b 0x00abf47c
00abf42c	bl 0x00c342a0
00abf430	adrp x0,0x29e000
00abf434	adrp x2,0x2c0000
00abf438	add x0,x0,#0x913
00abf43c	add x2,x2,#0x45d
00abf440	mov w1,#0x10e
00abf444	b 0x00abf460
00abf448	bl 0x00c342a0
00abf44c	adrp x0,0x29e000
00abf450	adrp x2,0x2c0000
00abf454	add x0,x0,#0x913
00abf458	add x2,x2,#0x45d
00abf45c	mov w1,#0x105
00abf460	bl 0x00c342b0
00abf464	mov w0,#0x21
00abf468	mov w1,#0x74
00abf46c	mov x2,xzr
00abf470	bl 0x00c342c0
00abf474	mov x23,xzr
00abf478	mov x22,xzr
00abf47c	mov x0,x23
00abf480	bl 0x00c357d0
00abf484	ldur x0,[x29, #-0x60]
00abf488	bl 0x00c355e0
00abf48c	mov x0,x22
00abf490	bl 0x00c355e0
00abf494	mov x19,xzr
00abf498	mov x0,x19
00abf49c	ldp x29,x30,[sp, #0xd0]
00abf4a0	ldp x20,x19,[sp, #0xc0]
00abf4a4	ldp x22,x21,[sp, #0xb0]
00abf4a8	ldp x24,x23,[sp, #0xa0]
00abf4ac	ldp x26,x25,[sp, #0x90]
00abf4b0	ldp x28,x27,[sp, #0x80]
00abf4b4	add sp,sp,#0xe0
00abf4b8	ret
00abf4bc	sxtw x23,w26
00abf4c0	add x0,sp,#0x30
00abf4c4	mov x1,x23
00abf4c8	bl 0x00c34750
00abf4cc	ldur x0,[x29, #-0x60]
00abf4d0	cbz x0,0x00abf500
00abf4d4	mov x1,x22
00abf4d8	bl 0x00c35640
00abf4dc	cbnz x19,0x00abf508
00abf4e0	b 0x00abf524
00abf4e4	mov x0,x26
00abf4e8	bl 0x00c34620
00abf4ec	adrp x1,0x29e000
00abf4f0	add x1,x1,#0x913
00abf4f4	mov w2,#0x96
00abf4f8	mov x0,xzr
00abf4fc	b 0x00abf614
00abf500	stur x22,[x29, #-0x60]
00abf504	cbz x19,0x00abf524
00abf508	ldur x20,[x29, #-0x60]
00abf50c	cbz x20,0x00abf5a8
00abf510	mov x0,x20
00abf514	mov x1,x19
00abf518	bl 0x00c35640
00abf51c	mov x19,x20
00abf520	b 0x00abf498
00abf524	ldr x0,[x20, #0x18]
00abf528	bl 0x00c37750
00abf52c	cmp w0,#0x16
00abf530	b.ne 0x00abf558
00abf534	mov w1,#0x2
00abf538	mov x0,x20
00abf53c	mov x2,xzr
00abf540	mov x3,xzr
00abf544	bl 0x00c3f770
00abf548	cbz x0,0x00abf558
00abf54c	bl 0x00c38840
00abf550	bl 0x00c32240
00abf554	b 0x00abf574
00abf558	ldr x8,[sp, #0x8]
00abf55c	cbz x8,0x00abf580
00abf560	ldr w1,[x8]
00abf564	cmp w1,#0x1
00abf568	b.lt 0x00abf580
00abf56c	ldr x0,[x8, #0x8]
00abf570	bl 0x00c31a50
00abf574	mov x19,x0
00abf578	cbnz x0,0x00abf508
00abf57c	b 0x00abf474
00abf580	bl 0x00c32280
00abf584	bl 0x00c32240
00abf588	cbz x0,0x00abf474
00abf58c	mov w1,#0x82
00abf590	mov x2,xzr
00abf594	mov x3,xzr
00abf598	mov x19,x0
00abf59c	bl 0x00c321a0
00abf5a0	ldur x20,[x29, #-0x60]
00abf5a4	cbnz x20,0x00abf510
00abf5a8	stur x19,[x29, #-0x60]
00abf5ac	b 0x00abf498
00abf5b0	bl 0x00c342a0
00abf5b4	adrp x19,0x29e000
00abf5b8	add x19,x19,#0x913
00abf5bc	adrp x2,0x2b6000
00abf5c0	add x2,x2,#0x33e
00abf5c4	mov w1,#0x88
00abf5c8	mov x0,x19
00abf5cc	bl 0x00c342b0
00abf5d0	mov w1,#0x100
00abf5d4	mov w0,#0x21
00abf5d8	movk w1,#0xc, LSL #16
00abf5dc	mov x2,xzr
00abf5e0	bl 0x00c342c0
00abf5e4	mov x0,x26
00abf5e8	bl 0x00c34620
00abf5ec	mov w2,#0x96
00abf5f0	mov x0,xzr
00abf5f4	mov x1,x19
00abf5f8	b 0x00abf614
00abf5fc	mov x0,x26
00abf600	bl 0x00c34620
00abf604	adrp x1,0x29e000
00abf608	add x1,x1,#0x913
00abf60c	mov w2,#0x96
00abf610	mov x0,x28
00abf614	bl 0x00c32310
00abf618	mov x23,xzr
00abf61c	b 0x00abf47c
