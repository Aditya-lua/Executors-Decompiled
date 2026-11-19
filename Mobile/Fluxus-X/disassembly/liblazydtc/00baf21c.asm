; mbedtls_sha3_finish @ 00baf21c
00baf21c	str x21,[sp, #-0x30]!
00baf220	stp x20,x19,[sp, #0x10]
00baf224	stp x29,x30,[sp, #0x20]
00baf228	add x29,sp,#0x20
00baf22c	ldrh w21,[x0, #0xcc]
00baf230	mov x19,x0
00baf234	mov x20,x1
00baf238	cbz x21,0x00baf24c
00baf23c	cmp x21,x2
00baf240	b.ls 0x00baf250
00baf244	mov w20,#0xffffff8a
00baf248	b 0x00baf310
00baf24c	mov x21,x2
00baf250	ldr w8,[x19, #0xc8]
00baf254	orr w11,wzr,#0x6
00baf258	mov x0,x19
00baf25c	and x9,x8,#0xfffffff8
00baf260	ldr x10,[x19, x9#0x0]
00baf264	ubfiz w8,w8,#0x3,#0x3
00baf268	lsl x8,x11,x8
00baf26c	mov w11,#0x80
00baf270	eor x8,x8,x10
00baf274	str x8,[x19, x9#0x0]
00baf278	ldrh w8,[x19, #0xce]
00baf27c	sub w9,w8,#0x1
00baf280	asr w9,w9,#0x3
00baf284	sbfiz x9,x9,#0x3,#0x20
00baf288	lsl w8,w8,#0x3
00baf28c	ldr x10,[x19, x9#0x0]
00baf290	add w8,w8,#0x38
00baf294	and w8,w8,#0x38
00baf298	lsl x8,x11,x8
00baf29c	eor x8,x8,x10
00baf2a0	str x8,[x19, x9#0x0]
00baf2a4	bl 0x00baee68
00baf2a8	str wzr,[x19, #0xc8]
00baf2ac	cbz x21,0x00baf30c
00baf2b0	mov w9,#0x1
00baf2b4	mov w8,wzr
00baf2b8	sub x21,x9,x21
00baf2bc	b 0x00baf2c8
00baf2c0	ldr w8,[x19, #0xc8]
00baf2c4	add x21,x21,#0x1
00baf2c8	and w9,w8,#0xfffffff8
00baf2cc	ldr x9,[x19, w9, UXTW #0x0]
00baf2d0	ubfiz w8,w8,#0x3,#0x3
00baf2d4	lsr x8,x9,x8
00baf2d8	strb w8,[x20], #0x1
00baf2dc	ldr w8,[x19, #0xc8]
00baf2e0	ldrh w9,[x19, #0xce]
00baf2e4	add w8,w8,#0x1
00baf2e8	udiv w10,w8,w9
00baf2ec	msub w8,w10,w9,w8
00baf2f0	str w8,[x19, #0xc8]
00baf2f4	cbz w8,0x00baf300
00baf2f8	cbnz x21,0x00baf2c0
00baf2fc	b 0x00baf30c
00baf300	mov x0,x19
00baf304	bl 0x00baee68
00baf308	cbnz x21,0x00baf2c0
00baf30c	mov w20,wzr
00baf310	mov w1,#0xd0
00baf314	mov x0,x19
00baf318	bl 0x00c42220
00baf31c	mov w0,w20
00baf320	ldp x29,x30,[sp, #0x20]
00baf324	ldp x20,x19,[sp, #0x10]
00baf328	ldr x21,[sp], #0x30
00baf32c	ret
