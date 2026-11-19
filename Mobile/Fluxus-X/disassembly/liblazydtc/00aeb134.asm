; FUN_00aeb134 @ 00aeb134
00aeb134	sub sp,sp,#0xa0
00aeb138	stp x26,x25,[sp, #0x50]
00aeb13c	stp x24,x23,[sp, #0x60]
00aeb140	stp x22,x21,[sp, #0x70]
00aeb144	stp x20,x19,[sp, #0x80]
00aeb148	stp x29,x30,[sp, #0x90]
00aeb14c	mov x22,x0
00aeb150	ldr x0,[x0]
00aeb154	mov x21,x2
00aeb158	adrp x2,0xc7d000
00aeb15c	mov w20,w1
00aeb160	add x2,x2,#0xeb8
00aeb164	orr w1,wzr,#0xf
00aeb168	add x29,sp,#0x90
00aeb16c	mov x19,x3
00aeb170	bl 0x00c3b520
00aeb174	ldr x8,[x22]
00aeb178	mov x24,x0
00aeb17c	mov x0,x8
00aeb180	bl 0x00c3b650
00aeb184	adrp x26,0x2ab000
00aeb188	add x26,x26,#0x32c
00aeb18c	cmp x19,#0x0
00aeb190	csel x25,x26,x19,eq
00aeb194	str xzr,[sp, #0x48]
00aeb198	cbz x24,0x00aeb1d8
00aeb19c	mov x23,x0
00aeb1a0	cbz x0,0x00aeb1d8
00aeb1a4	cbz w20,0x00aeb228
00aeb1a8	cbz x21,0x00aeb228
00aeb1ac	bl 0x00c342a0
00aeb1b0	adrp x0,0x2d0000
00aeb1b4	adrp x2,0x2dc000
00aeb1b8	add x0,x0,#0x406
00aeb1bc	add x2,x2,#0x9d8
00aeb1c0	mov w1,#0x13f
00aeb1c4	bl 0x00c342b0
00aeb1c8	mov w1,#0x103
00aeb1cc	mov w0,#0x2c
00aeb1d0	movk w1,#0xc, LSL #16
00aeb1d4	b 0x00aeb200
00aeb1d8	bl 0x00c342a0
00aeb1dc	adrp x0,0x2d0000
00aeb1e0	adrp x2,0x2dc000
00aeb1e4	add x0,x0,#0x406
00aeb1e8	add x2,x2,#0x9d8
00aeb1ec	mov w1,#0x136
00aeb1f0	bl 0x00c342b0
00aeb1f4	mov w1,#0x106
00aeb1f8	mov w0,#0x2c
00aeb1fc	movk w1,#0x8, LSL #16
00aeb200	mov x2,xzr
00aeb204	bl 0x00c342c0
00aeb208	mov x0,xzr
00aeb20c	ldp x29,x30,[sp, #0x90]
00aeb210	ldp x20,x19,[sp, #0x80]
00aeb214	ldp x22,x21,[sp, #0x70]
00aeb218	ldp x24,x23,[sp, #0x60]
00aeb21c	ldp x26,x25,[sp, #0x50]
00aeb220	add sp,sp,#0xa0
00aeb224	ret
00aeb228	cbnz w20,0x00aeb240
00aeb22c	cbz x21,0x00aeb240
00aeb230	mov x0,x23
00aeb234	mov x1,x21
00aeb238	bl 0x00c3b620
00aeb23c	mov w20,w0
00aeb240	cbz w20,0x00aeb268
00aeb244	add x4,sp,#0x48
00aeb248	mov x0,x24
00aeb24c	mov x1,xzr
00aeb250	mov w2,w20
00aeb254	mov x3,x25
00aeb258	bl 0x00c3b580
00aeb25c	cbz w0,0x00aeb268
00aeb260	mov w8,wzr
00aeb264	b 0x00aeb310
00aeb268	adrp x8,0xc7d000
00aeb26c	add x8,x8,#0xe80
00aeb270	ldp q1,q0,[x8, #0x10]
00aeb274	ldr q2,[x8]
00aeb278	ldr x8,[x8, #0x30]
00aeb27c	str xzr,[sp, #0x8]
00aeb280	stp q1,q0,[sp, #0x20]
00aeb284	str q2,[sp, #0x10]
00aeb288	str x8,[sp, #0x40]
00aeb28c	ldrb w8,[x22, #0x28]
00aeb290	ldr x0,[x22]
00aeb294	mov w1,#0x16
00aeb298	add x2,sp,#0x8
00aeb29c	and w8,w8,#0xfe
00aeb2a0	add x4,sp,#0x10
00aeb2a4	mov w3,wzr
00aeb2a8	mov x5,x22
00aeb2ac	str w20,[x22, #0x8]
00aeb2b0	stp x21,x25,[x22, #0x10]
00aeb2b4	strb w8,[x22, #0x28]
00aeb2b8	bl 0x00c3b540
00aeb2bc	str x0,[sp, #0x48]
00aeb2c0	cbz x0,0x00aeb304
00aeb2c4	mov x4,x0
00aeb2c8	cbnz w20,0x00aeb2e0
00aeb2cc	mov x0,x23
00aeb2d0	mov x1,x21
00aeb2d4	bl 0x00c3b620
00aeb2d8	ldr x4,[sp, #0x48]
00aeb2dc	mov w20,w0
00aeb2e0	ldr x1,[sp, #0x8]
00aeb2e4	adrp x5,0xaeb000
00aeb2e8	adrp x6,0xaeb000
00aeb2ec	add x5,x5,#0xb84
00aeb2f0	add x6,x6,#0xba8
00aeb2f4	mov x0,x24
00aeb2f8	mov w2,w20
00aeb2fc	mov x3,x25
00aeb300	bl 0x00c3b590
00aeb304	ldrb w8,[x22, #0x28]
00aeb308	mvn w8,w8
00aeb30c	and w8,w8,#0x1
00aeb310	ldr x0,[sp, #0x48]
00aeb314	cmp w20,#0x0
00aeb318	ccmp x21,#0x0,#0x0,eq
00aeb31c	b.eq 0x00aeb20c
00aeb320	cbnz x0,0x00aeb20c
00aeb324	mov w9,#0x106
00aeb328	movk w9,#0x8, LSL #16
00aeb32c	cmp w8,#0x0
00aeb330	adrp x8,0x2bc000
00aeb334	add x8,x8,#0x452
00aeb338	add w10,w9,#0x6
00aeb33c	add w9,w9,#0x7
00aeb340	csel w25,w10,w9,ne
00aeb344	csel x24,x8,x26,ne
00aeb348	cbnz x21,0x00aeb360
00aeb34c	mov x0,x23
00aeb350	mov w1,w20
00aeb354	mov x2,xzr
00aeb358	bl 0x00c3b640
00aeb35c	mov x21,x0
00aeb360	bl 0x00c342a0
00aeb364	adrp x0,0x2d0000
00aeb368	adrp x2,0x2dc000
00aeb36c	add x0,x0,#0x406
00aeb370	add x2,x2,#0x9d8
00aeb374	mov w1,#0x17f
00aeb378	bl 0x00c342b0
00aeb37c	ldr x0,[x22]
00aeb380	bl 0x00c3b530
00aeb384	adrp x8,0x2cb000
00aeb388	add x8,x8,#0x889
00aeb38c	cmp x21,#0x0
00aeb390	csel x5,x8,x21,eq
00aeb394	cmp x19,#0x0
00aeb398	adrp x2,0x2a0000
00aeb39c	mov x4,x0
00aeb3a0	csel x7,x8,x19,eq
00aeb3a4	add x2,x2,#0xc07
00aeb3a8	mov w0,#0x2c
00aeb3ac	mov w1,w25
00aeb3b0	mov x3,x24
00aeb3b4	mov w6,w20
00aeb3b8	bl 0x00c342c0
00aeb3bc	ldr x0,[sp, #0x48]
00aeb3c0	b 0x00aeb20c
