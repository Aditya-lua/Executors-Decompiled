; do_dtls1_write @ 009ca048
009ca048	sub sp,sp,#0xc0
009ca04c	stp x28,x27,[sp, #0x60]
009ca050	stp x26,x25,[sp, #0x70]
009ca054	stp x24,x23,[sp, #0x80]
009ca058	stp x22,x21,[sp, #0x90]
009ca05c	stp x20,x19,[sp, #0xa0]
009ca060	stp x29,x30,[sp, #0xb0]
009ca064	ldr x8,[x0, #0xcc8]
009ca068	mov x19,x0
009ca06c	add x29,sp,#0xb0
009ca070	cbz x8,0x009ca0cc
009ca074	bl 0x00c342a0
009ca078	adrp x0,0x2a3000
009ca07c	adrp x2,0x2a9000
009ca080	add x0,x0,#0xcf1
009ca084	add x2,x2,#0xece
009ca088	mov w1,#0x32a
009ca08c	bl 0x00c342b0
009ca090	mov w2,#0x103
009ca094	mov w1,#0x50
009ca098	movk w2,#0xc, LSL #16
009ca09c	mov x0,x19
009ca0a0	mov x3,xzr
009ca0a4	bl 0x00c34410
009ca0a8	mov w0,wzr
009ca0ac	ldp x29,x30,[sp, #0xb0]
009ca0b0	ldp x20,x19,[sp, #0xa0]
009ca0b4	ldp x22,x21,[sp, #0x90]
009ca0b8	ldp x24,x23,[sp, #0x80]
009ca0bc	ldp x26,x25,[sp, #0x70]
009ca0c0	ldp x28,x27,[sp, #0x60]
009ca0c4	add sp,sp,#0xc0
009ca0c8	ret
009ca0cc	ldr w8,[x19, #0x1a4]
009ca0d0	mov x20,x5
009ca0d4	mov w24,w4
009ca0d8	mov x21,x3
009ca0dc	mov x22,x2
009ca0e0	mov w23,w1
009ca0e4	cbz w8,0x009ca100
009ca0e8	ldr x8,[x19, #0x8]
009ca0ec	mov x0,x19
009ca0f0	ldr x8,[x8, #0x78]
009ca0f4	blr x8
009ca0f8	cmp w0,#0x1
009ca0fc	b.lt 0x009ca0ac
009ca100	cbnz x21,0x009ca10c
009ca104	mov w0,wzr
009ca108	cbz w24,0x009ca0ac
009ca10c	mov x0,x19
009ca110	bl 0x00c344c0
009ca114	mov w8,w0
009ca118	cmp x8,x21
009ca11c	b.cs 0x009ca148
009ca120	bl 0x00c342a0
009ca124	adrp x0,0x2a3000
009ca128	adrp x2,0x2a9000
009ca12c	add x0,x0,#0xcf1
009ca130	add x2,x2,#0xece
009ca134	mov w1,#0x33a
009ca138	bl 0x00c342b0
009ca13c	mov w1,#0x50
009ca140	mov w2,#0xc2
009ca144	b 0x009ca09c
009ca148	ldr x8,[x19, #0x918]
009ca14c	cbz x8,0x009ca1a0
009ca150	ldr x8,[x19, #0x878]
009ca154	cbz x8,0x009ca1a0
009ca158	ldr x0,[x19, #0x890]
009ca15c	bl 0x00c34c00
009ca160	cbz x0,0x009ca1a0
009ca164	ldr x0,[x19, #0x890]
009ca168	bl 0x00c34c00
009ca16c	bl 0x00c34c20
009ca170	mov w26,w0
009ca174	tbz w0,#0x1f,0x009ca1a4
009ca178	bl 0x00c342a0
009ca17c	adrp x0,0x2a3000
009ca180	adrp x2,0x2a9000
009ca184	add x0,x0,#0xcf1
009ca188	add x2,x2,#0xece
009ca18c	mov w1,#0x34b
009ca190	bl 0x00c342b0
009ca194	mov w1,#0x50
009ca198	mov w2,#0xc2
009ca19c	b 0x009ca4b8
009ca1a0	mov w26,wzr
009ca1a4	ldr x25,[x19, #0xca8]
009ca1a8	orr w9,wzr,#0x1ffff
009ca1ac	strb w23,[x25]
009ca1b0	str w23,[sp, #0x14]
009ca1b4	ldr x8,[x19, #0x8]
009ca1b8	ldr w8,[x8]
009ca1bc	cmp w8,w9
009ca1c0	b.ne 0x009ca1d0
009ca1c4	ldr w8,[x19, #0x9f8]
009ca1c8	cmp w8,#0x100
009ca1cc	b.ne 0x009ca1e8
009ca1d0	ldr w8,[x19]
009ca1d4	lsr w8,w8,#0x8
009ca1d8	strb w8,[x25, #0x1]
009ca1dc	ldr w8,[x19]
009ca1e0	strb w8,[x25, #0x2]
009ca1e4	b 0x009ca1f0
009ca1e8	orr w8,wzr,#0xfffe
009ca1ec	sturh w8,[x25, #0x1]
009ca1f0	ldr x0,[x19, #0x878]
009ca1f4	str x26,[sp, #0x8]
009ca1f8	cbz x0,0x009ca238
009ca1fc	bl 0x00c34b80
009ca200	bl 0x00c35290
009ca204	sub w8,w0,#0x6
009ca208	cmp w8,#0x2
009ca20c	b.cs 0x009ca218
009ca210	mov w8,#0x8
009ca214	b 0x009ca23c
009ca218	cmp w0,#0x2
009ca21c	b.ne 0x009ca238
009ca220	ldr x0,[x19, #0x878]
009ca224	bl 0x00c36300
009ca228	tbnz w0,#0x1f,0x009ca4cc
009ca22c	cmp w0,#0x2
009ca230	csel w8,wzr,w0,lt
009ca234	b 0x009ca23c
009ca238	mov w8,wzr
009ca23c	add x28,x25,#0xd
009ca240	sxtw x26,w8
009ca244	add x27,x28,x26
009ca248	stp x27,x22,[sp, #0x30]
009ca24c	str x21,[sp, #0x18]
009ca250	ldr x8,[x19, #0x868]
009ca254	cbz x8,0x009ca290
009ca258	add x1,sp,#0x10
009ca25c	mov x0,x19
009ca260	bl 0x00c36bb0
009ca264	cbnz w0,0x009ca2a4
009ca268	bl 0x00c342a0
009ca26c	adrp x0,0x2a3000
009ca270	adrp x2,0x2a9000
009ca274	add x0,x0,#0xcf1
009ca278	add x2,x2,#0xece
009ca27c	mov w1,#0x38a
009ca280	bl 0x00c342b0
009ca284	mov w1,#0x50
009ca288	mov w2,#0x8d
009ca28c	b 0x009ca4b8
009ca290	mov x0,x27
009ca294	mov x1,x22
009ca298	mov x2,x21
009ca29c	bl 0x00c2ffd0
009ca2a0	str x27,[sp, #0x38]
009ca2a4	ldr x27,[sp, #0x8]
009ca2a8	cbz w27,0x009ca2ec
009ca2ac	ldr x8,[x19, #0xa8]
009ca2b0	tbnz w8,#0xa,0x009ca2ec
009ca2b4	ldr x8,[x19, #0x8]
009ca2b8	ldr x9,[sp, #0x18]
009ca2bc	add x1,sp,#0x10
009ca2c0	mov w3,#0x1
009ca2c4	ldr x8,[x8, #0xc0]
009ca2c8	add x9,x9,x26
009ca2cc	add x2,x28,x9
009ca2d0	mov x0,x19
009ca2d4	ldr x8,[x8, #0x8]
009ca2d8	blr x8
009ca2dc	cbz w0,0x009ca424
009ca2e0	ldr x8,[sp, #0x18]
009ca2e4	add x8,x8,w27, SXTW 
009ca2e8	str x8,[sp, #0x18]
009ca2ec	stp x28,x28,[sp, #0x30]
009ca2f0	cbz w26,0x009ca300
009ca2f4	ldr x8,[sp, #0x18]
009ca2f8	add x8,x8,x26
009ca2fc	str x8,[sp, #0x18]
009ca300	ldr x8,[x19, #0x8]
009ca304	mov x26,x27
009ca308	sxtw x27,w27
009ca30c	add x1,sp,#0x10
009ca310	ldr x8,[x8, #0xc0]
009ca314	mov w2,#0x1
009ca318	mov w3,#0x1
009ca31c	mov x0,x19
009ca320	ldr x8,[x8]
009ca324	mov x4,xzr
009ca328	mov x5,x27
009ca32c	blr x8
009ca330	cmp w0,#0x0
009ca334	b.le 0x009ca410
009ca338	cbz w26,0x009ca378
009ca33c	ldr x8,[x19, #0xa8]
009ca340	tbz w8,#0xa,0x009ca378
009ca344	ldr x8,[x19, #0x8]
009ca348	ldr x9,[sp, #0x18]
009ca34c	add x1,sp,#0x10
009ca350	mov w3,#0x1
009ca354	ldr x8,[x8, #0xc0]
009ca358	add x2,x28,x9
009ca35c	mov x0,x19
009ca360	ldr x8,[x8, #0x8]
009ca364	blr x8
009ca368	cbz w0,0x009ca490
009ca36c	ldr x8,[sp, #0x18]
009ca370	add x8,x8,x27
009ca374	str x8,[sp, #0x18]
009ca378	ldr x8,[x19, #0x1d10]
009ca37c	ldrb w8,[x8, #0x3]
009ca380	strb w8,[x25, #0x3]
009ca384	ldr x8,[x19, #0x1d10]
009ca388	ldrb w8,[x8, #0x2]
009ca38c	strb w8,[x25, #0x4]
009ca390	ldrh w8,[x19, #0x1d06]
009ca394	sturh w8,[x25, #0x9]
009ca398	mov w8,#0x1d02
009ca39c	ldr w8,[x19, x8#0x0]
009ca3a0	stur w8,[x25, #0x5]
009ca3a4	ldr x8,[sp, #0x18]
009ca3a8	lsr x8,x8,#0x8
009ca3ac	strb w8,[x25, #0xb]
009ca3b0	ldr x8,[sp, #0x18]
009ca3b4	strb w8,[x25, #0xc]
009ca3b8	ldr x8,[x19, #0x4c0]
009ca3bc	cbz x8,0x009ca3e0
009ca3c0	ldr x6,[x19, #0x4c8]
009ca3c4	mov w0,#0x1
009ca3c8	mov w2,#0x100
009ca3cc	mov w4,#0xd
009ca3d0	mov w1,wzr
009ca3d4	mov x3,x25
009ca3d8	mov x5,x19
009ca3dc	blr x8
009ca3e0	ldr x8,[sp, #0x18]
009ca3e4	mov w9,#0x1d00
009ca3e8	add x0,x19,x9
009ca3ec	str w23,[sp, #0x14]
009ca3f0	add x8,x8,#0xd
009ca3f4	str x8,[sp, #0x18]
009ca3f8	bl 0x00c36bc0
009ca3fc	ldr x8,[sp, #0x18]
009ca400	cbz w24,0x009ca440
009ca404	str x8,[x20]
009ca408	mov w0,#0x1
009ca40c	b 0x009ca0ac
009ca410	mov x0,x19
009ca414	bl 0x00c35ce0
009ca418	cbz w0,0x009ca474
009ca41c	mov w0,#0xffffffff
009ca420	b 0x009ca0ac
009ca424	bl 0x00c342a0
009ca428	adrp x0,0x2a3000
009ca42c	adrp x2,0x2a9000
009ca430	add x0,x0,#0xcf1
009ca434	add x2,x2,#0xece
009ca438	mov w1,#0x39d
009ca43c	b 0x009ca4a8
009ca440	mov x0,x19
009ca444	mov w1,w23
009ca448	mov x2,x22
009ca44c	mov x3,x21
009ca450	mov x4,x20
009ca454	str x8,[x19, #0xcc8]
009ca458	str xzr,[x19, #0xcc0]
009ca45c	str x21,[x19, #0x1cd8]
009ca460	str x22,[x19, #0x1cf0]
009ca464	str w23,[x19, #0x1ce0]
009ca468	str x21,[x19, #0x1ce8]
009ca46c	bl 0x00c36bd0
009ca470	b 0x009ca0ac
009ca474	bl 0x00c342a0
009ca478	adrp x0,0x2a3000
009ca47c	adrp x2,0x2a9000
009ca480	add x0,x0,#0xcf1
009ca484	add x2,x2,#0xece
009ca488	mov w1,#0x3ac
009ca48c	b 0x009ca4a8
009ca490	bl 0x00c342a0
009ca494	adrp x0,0x2a3000
009ca498	adrp x2,0x2a9000
009ca49c	add x0,x0,#0xcf1
009ca4a0	add x2,x2,#0xece
009ca4a4	mov w1,#0x3b4
009ca4a8	bl 0x00c342b0
009ca4ac	mov w2,#0x103
009ca4b0	mov w1,#0x50
009ca4b4	movk w2,#0xc, LSL #16
009ca4b8	mov x0,x19
009ca4bc	mov x3,xzr
009ca4c0	bl 0x00c34410
009ca4c4	mov w0,#0xffffffff
009ca4c8	b 0x009ca0ac
009ca4cc	bl 0x00c342a0
009ca4d0	adrp x0,0x2a3000
009ca4d4	adrp x2,0x2a9000
009ca4d8	add x0,x0,#0xcf1
009ca4dc	add x2,x2,#0xece
009ca4e0	mov w1,#0x36e
009ca4e4	bl 0x00c342b0
009ca4e8	mov w1,#0x50
009ca4ec	mov w2,#0x112
009ca4f0	b 0x009ca4b8
