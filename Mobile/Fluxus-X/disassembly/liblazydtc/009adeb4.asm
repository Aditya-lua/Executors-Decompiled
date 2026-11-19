; ssl_load_ciphers @ 009adeb4
009adeb4	sub sp,sp,#0x40
009adeb8	stp x22,x21,[sp, #0x10]
009adebc	adrp x22,0x74b000
009adec0	stp x20,x19,[sp, #0x20]
009adec4	mov x19,x0
009adec8	mov x20,xzr
009adecc	add x21,x0,#0x480
009aded0	add x22,x22,#0xe5c
009aded4	stp x29,x30,[sp, #0x30]
009aded8	add x29,sp,#0x30
009adedc	str wzr,[x0, #0x640]
009adee0	add x8,x22,x20
009adee4	ldr w1,[x8, #0x4]
009adee8	cbz w1,0x009adf10
009adeec	ldr x0,[x19]
009adef0	ldr x2,[x19, #0x440]
009adef4	bl 0x00c353f0
009adef8	str x0,[x21, x20#0x0]
009adefc	cbnz x0,0x009adf10
009adf00	ldr w8,[x22, x20#0x0]
009adf04	ldr w9,[x19, #0x640]
009adf08	orr w8,w9,w8
009adf0c	str w8,[x19, #0x640]
009adf10	add x20,x20,#0x8
009adf14	cmp x20,#0xc0
009adf18	b.ne 0x009adee0
009adf1c	adrp x8,0x74b000
009adf20	add x8,x8,#0xf1c
009adf24	mov x20,xzr
009adf28	add x21,x8,#0x4
009adf2c	str wzr,[x19, #0x644]
009adf30	ldr x0,[x19]
009adf34	ldr w1,[x21]
009adf38	ldr x2,[x19, #0x440]
009adf3c	bl 0x00c34ca0
009adf40	add x8,x19,x20, LSL #0x3
009adf44	str x0,[x8, #0x540]
009adf48	cbz x0,0x009adf64
009adf4c	bl 0x00c34c20
009adf50	tbnz w0,#0x1f,0x009adfb0
009adf54	sxtw x8,w0
009adf58	add x9,x19,x20, LSL #0x3
009adf5c	str x8,[x9, #0x5b0]
009adf60	b 0x009adf74
009adf64	ldur w8,[x21, #-0x4]
009adf68	ldr w9,[x19, #0x644]
009adf6c	orr w8,w9,w8
009adf70	str w8,[x19, #0x644]
009adf74	add x20,x20,#0x1
009adf78	cmp x20,#0xe
009adf7c	add x21,x21,#0x8
009adf80	b.cc 0x009adf30
009adf84	movi d0,#0x0
009adf88	str d0,[x19, #0x648]
009adf8c	bl 0x00c35250
009adf90	ldr x0,[x19]
009adf94	ldr x2,[x19, #0x440]
009adf98	adrp x1,0x2c7000
009adf9c	add x1,x1,#0x4e5
009adfa0	bl 0x00c352e0
009adfa4	cbz x0,0x009adfb8
009adfa8	bl 0x00c352f0
009adfac	b 0x009adfc4
009adfb0	mov w0,wzr
009adfb4	b 0x009ae3b0
009adfb8	ldr w8,[x19, #0x64c]
009adfbc	orr w8,w8,#0x2
009adfc0	str w8,[x19, #0x64c]
009adfc4	ldr x0,[x19]
009adfc8	ldr x2,[x19, #0x440]
009adfcc	adrp x1,0x2a3000
009adfd0	add x1,x1,#0xa5a
009adfd4	bl 0x00c352a0
009adfd8	cbz x0,0x009adfe4
009adfdc	bl 0x00c352b0
009adfe0	b 0x009adff4
009adfe4	ldr w8,[x19, #0x648]
009adfe8	mov w9,#0x102
009adfec	orr w8,w8,w9
009adff0	str w8,[x19, #0x648]
009adff4	ldr x0,[x19]
009adff8	ldr x2,[x19, #0x440]
009adffc	adrp x1,0x2a5000
009ae000	add x1,x1,#0x910
009ae004	bl 0x00c352a0
009ae008	cbz x0,0x009ae014
009ae00c	bl 0x00c352b0
009ae010	b 0x009ae024
009ae014	ldr w8,[x19, #0x648]
009ae018	mov w9,#0x84
009ae01c	orr w8,w8,w9
009ae020	str w8,[x19, #0x648]
009ae024	ldr x0,[x19]
009ae028	ldr x2,[x19, #0x440]
009ae02c	adrp x1,0x2c9000
009ae030	add x1,x1,#0x32d
009ae034	bl 0x00c352e0
009ae038	cbz x0,0x009ae044
009ae03c	bl 0x00c352f0
009ae040	b 0x009ae050
009ae044	ldr w8,[x19, #0x64c]
009ae048	orr w8,w8,#0x8
009ae04c	str w8,[x19, #0x64c]
009ae050	bl 0x00c35240
009ae054	adrp x9,0x74b000
009ae058	add x9,x9,#0xf8c
009ae05c	ldp q0,q1,[x9]
009ae060	ldr q2,[x9, #0x20]
009ae064	ldr x9,[x9, #0x30]
009ae068	adrp x1,0x2db000
009ae06c	add x8,x19,#0x448
009ae070	add x10,x19,#0x458
009ae074	add x11,x19,#0x468
009ae078	add x1,x1,#0x98d
009ae07c	add x0,sp,#0x8
009ae080	mov w2,#0xffffffff
009ae084	str q0,[x8]
009ae088	str q1,[x10]
009ae08c	str q2,[x11]
009ae090	str x9,[x19, #0x478]
009ae094	str xzr,[sp, #0x8]
009ae098	str wzr,[sp, #0x4]
009ae09c	bl 0x00c352c0
009ae0a0	cbz x0,0x009ae0cc
009ae0a4	mov x5,x0
009ae0a8	add x0,sp,#0x4
009ae0ac	mov x1,xzr
009ae0b0	mov x2,xzr
009ae0b4	mov x3,xzr
009ae0b8	mov x4,xzr
009ae0bc	bl 0x00c352d0
009ae0c0	cmp w0,#0x0
009ae0c4	b.gt 0x009ae0cc
009ae0c8	str wzr,[sp, #0x4]
009ae0cc	ldr x0,[sp, #0x8]
009ae0d0	bl 0x00c35460
009ae0d4	ldr w8,[sp, #0x4]
009ae0d8	str w8,[x19, #0x454]
009ae0dc	cbz w8,0x009ae0ec
009ae0e0	mov w8,#0x20
009ae0e4	str x8,[x19, #0x5c8]
009ae0e8	b 0x009ae0f8
009ae0ec	ldr w8,[x19, #0x644]
009ae0f0	orr w8,w8,#0x8
009ae0f4	str w8,[x19, #0x644]
009ae0f8	adrp x1,0x2cd000
009ae0fc	add x1,x1,#0x527
009ae100	add x0,sp,#0x8
009ae104	mov w2,#0xffffffff
009ae108	str xzr,[sp, #0x8]
009ae10c	str wzr,[sp, #0x4]
009ae110	bl 0x00c352c0
009ae114	cbz x0,0x009ae140
009ae118	mov x5,x0
009ae11c	add x0,sp,#0x4
009ae120	mov x1,xzr
009ae124	mov x2,xzr
009ae128	mov x3,xzr
009ae12c	mov x4,xzr
009ae130	bl 0x00c352d0
009ae134	cmp w0,#0x0
009ae138	b.gt 0x009ae140
009ae13c	str wzr,[sp, #0x4]
009ae140	ldr x0,[sp, #0x8]
009ae144	bl 0x00c35460
009ae148	ldr w8,[sp, #0x4]
009ae14c	str w8,[x19, #0x464]
009ae150	cbz w8,0x009ae160
009ae154	mov w8,#0x20
009ae158	str x8,[x19, #0x5e8]
009ae15c	b 0x009ae16c
009ae160	ldr w8,[x19, #0x644]
009ae164	orr w8,w8,#0x100
009ae168	str w8,[x19, #0x644]
009ae16c	adrp x1,0x2a3000
009ae170	add x1,x1,#0xb41
009ae174	add x0,sp,#0x8
009ae178	mov w2,#0xffffffff
009ae17c	str xzr,[sp, #0x8]
009ae180	str wzr,[sp, #0x4]
009ae184	bl 0x00c352c0
009ae188	cbz x0,0x009ae1b4
009ae18c	mov x5,x0
009ae190	add x0,sp,#0x4
009ae194	mov x1,xzr
009ae198	mov x2,xzr
009ae19c	mov x3,xzr
009ae1a0	mov x4,xzr
009ae1a4	bl 0x00c352d0
009ae1a8	cmp w0,#0x0
009ae1ac	b.gt 0x009ae1b4
009ae1b0	str wzr,[sp, #0x4]
009ae1b4	ldr x0,[sp, #0x8]
009ae1b8	bl 0x00c35460
009ae1bc	ldr w8,[sp, #0x4]
009ae1c0	str w8,[x19, #0x478]
009ae1c4	cbz w8,0x009ae1d4
009ae1c8	mov w8,#0x20
009ae1cc	str x8,[x19, #0x610]
009ae1d0	b 0x009ae1e0
009ae1d4	ldr w8,[x19, #0x644]
009ae1d8	orr w8,w8,#0x400
009ae1dc	str w8,[x19, #0x644]
009ae1e0	adrp x1,0x2c9000
009ae1e4	add x1,x1,#0x333
009ae1e8	add x0,sp,#0x8
009ae1ec	mov w2,#0xffffffff
009ae1f0	str xzr,[sp, #0x8]
009ae1f4	str wzr,[sp, #0x4]
009ae1f8	bl 0x00c352c0
009ae1fc	cbz x0,0x009ae228
009ae200	mov x5,x0
009ae204	add x0,sp,#0x4
009ae208	mov x1,xzr
009ae20c	mov x2,xzr
009ae210	mov x3,xzr
009ae214	mov x4,xzr
009ae218	bl 0x00c352d0
009ae21c	cmp w0,#0x0
009ae220	b.gt 0x009ae228
009ae224	str wzr,[sp, #0x4]
009ae228	ldr x0,[sp, #0x8]
009ae22c	bl 0x00c35460
009ae230	ldr w8,[sp, #0x4]
009ae234	str w8,[x19, #0x47c]
009ae238	cbz w8,0x009ae248
009ae23c	mov w8,#0x20
009ae240	str x8,[x19, #0x618]
009ae244	b 0x009ae254
009ae248	ldr w8,[x19, #0x644]
009ae24c	orr w8,w8,#0x800
009ae250	str w8,[x19, #0x644]
009ae254	adrp x1,0x2cf000
009ae258	add x1,x1,#0x641
009ae25c	add x0,sp,#0x8
009ae260	mov w2,#0xffffffff
009ae264	str xzr,[sp, #0x8]
009ae268	str wzr,[sp, #0x4]
009ae26c	bl 0x00c352c0
009ae270	cbz x0,0x009ae29c
009ae274	mov x5,x0
009ae278	add x0,sp,#0x4
009ae27c	mov x1,xzr
009ae280	mov x2,xzr
009ae284	mov x3,xzr
009ae288	mov x4,xzr
009ae28c	bl 0x00c352d0
009ae290	cmp w0,#0x0
009ae294	b.gt 0x009ae29c
009ae298	str wzr,[sp, #0x4]
009ae29c	ldr x0,[sp, #0x8]
009ae2a0	bl 0x00c35460
009ae2a4	ldr w8,[sp, #0x4]
009ae2a8	cbnz w8,0x009ae2bc
009ae2ac	ldr w8,[x19, #0x64c]
009ae2b0	mov w9,#0xa0
009ae2b4	orr w8,w8,w9
009ae2b8	str w8,[x19, #0x64c]
009ae2bc	adrp x1,0x2d3000
009ae2c0	add x1,x1,#0x542
009ae2c4	add x0,sp,#0x8
009ae2c8	mov w2,#0xffffffff
009ae2cc	str xzr,[sp, #0x8]
009ae2d0	str wzr,[sp, #0x4]
009ae2d4	bl 0x00c352c0
009ae2d8	cbz x0,0x009ae304
009ae2dc	mov x5,x0
009ae2e0	add x0,sp,#0x4
009ae2e4	mov x1,xzr
009ae2e8	mov x2,xzr
009ae2ec	mov x3,xzr
009ae2f0	mov x4,xzr
009ae2f4	bl 0x00c352d0
009ae2f8	cmp w0,#0x0
009ae2fc	b.gt 0x009ae304
009ae300	str wzr,[sp, #0x4]
009ae304	ldr x0,[sp, #0x8]
009ae308	bl 0x00c35460
009ae30c	ldr w8,[sp, #0x4]
009ae310	cbnz w8,0x009ae320
009ae314	ldr w8,[x19, #0x64c]
009ae318	orr w8,w8,#0x80
009ae31c	str w8,[x19, #0x64c]
009ae320	adrp x1,0x2c9000
009ae324	add x1,x1,#0x342
009ae328	add x0,sp,#0x8
009ae32c	mov w2,#0xffffffff
009ae330	str xzr,[sp, #0x8]
009ae334	str wzr,[sp, #0x4]
009ae338	bl 0x00c352c0
009ae33c	cbz x0,0x009ae368
009ae340	mov x5,x0
009ae344	add x0,sp,#0x4
009ae348	mov x1,xzr
009ae34c	mov x2,xzr
009ae350	mov x3,xzr
009ae354	mov x4,xzr
009ae358	bl 0x00c352d0
009ae35c	cmp w0,#0x0
009ae360	b.gt 0x009ae368
009ae364	str wzr,[sp, #0x4]
009ae368	ldr x0,[sp, #0x8]
009ae36c	bl 0x00c35460
009ae370	ldr w9,[sp, #0x4]
009ae374	ldr w8,[x19, #0x64c]
009ae378	cbnz w9,0x009ae384
009ae37c	orr w8,w8,#0x80
009ae380	str w8,[x19, #0x64c]
009ae384	mov w9,#0xa0
009ae388	bics wzr,w9,w8
009ae38c	b.ne 0x009ae39c
009ae390	ldr w9,[x19, #0x648]
009ae394	orr w9,w9,#0x10
009ae398	str w9,[x19, #0x648]
009ae39c	tbz w8,#0x7,0x009ae3ac
009ae3a0	ldr w8,[x19, #0x648]
009ae3a4	orr w8,w8,#0x200
009ae3a8	str w8,[x19, #0x648]
009ae3ac	mov w0,#0x1
009ae3b0	ldp x29,x30,[sp, #0x30]
009ae3b4	ldp x20,x19,[sp, #0x20]
009ae3b8	ldp x22,x21,[sp, #0x10]
009ae3bc	add sp,sp,#0x40
009ae3c0	ret
