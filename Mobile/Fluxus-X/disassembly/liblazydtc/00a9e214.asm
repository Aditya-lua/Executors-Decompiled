; OSSL_PARAM_set_int32 @ 00a9e214
00a9e214	str x21,[sp, #-0x30]!
00a9e218	stp x20,x19,[sp, #0x10]
00a9e21c	mov w20,w1
00a9e220	stp x29,x30,[sp, #0x20]
00a9e224	add x29,sp,#0x20
00a9e228	str w1,[sp, #0xc]
00a9e22c	cbz x0,0x00a9e314
00a9e230	ldr w8,[x0, #0x8]
00a9e234	mov x19,x0
00a9e238	str xzr,[x0, #0x20]
00a9e23c	cmp w8,#0x1
00a9e240	b.ne 0x00a9e290
00a9e244	ldr x21,[x19, #0x10]
00a9e248	mov w8,#0x4
00a9e24c	str x8,[x19, #0x20]
00a9e250	cbz x21,0x00a9e310
00a9e254	ldr x2,[x19, #0x18]
00a9e258	cmp x2,#0x8
00a9e25c	b.eq 0x00a9e300
00a9e260	subs x8,x2,#0x4
00a9e264	b.eq 0x00a9e2c0
00a9e268	mov w9,#0x4
00a9e26c	cmp x2,#0x5
00a9e270	asr w1,w20,#0x1f
00a9e274	str x9,[x19, #0x20]
00a9e278	b.cc 0x00a9e324
00a9e27c	add x0,x21,#0x4
00a9e280	mov x2,x8
00a9e284	bl 0x00c301c0
00a9e288	str w20,[x21]
00a9e28c	b 0x00a9e37c
00a9e290	tbnz w20,#0x1f,0x00a9e2c8
00a9e294	cmp w8,#0x2
00a9e298	b.ne 0x00a9e2c8
00a9e29c	ldr x21,[x19, #0x10]
00a9e2a0	mov w8,#0x4
00a9e2a4	str x8,[x19, #0x20]
00a9e2a8	cbz x21,0x00a9e310
00a9e2ac	ldr x2,[x19, #0x18]
00a9e2b0	cmp x2,#0x8
00a9e2b4	b.eq 0x00a9e300
00a9e2b8	subs x8,x2,#0x4
00a9e2bc	b.ne 0x00a9e38c
00a9e2c0	str w20,[x21]
00a9e2c4	b 0x00a9e310
00a9e2c8	cmp w8,#0x3
00a9e2cc	mov w0,wzr
00a9e2d0	b.ne 0x00a9e314
00a9e2d4	ldr x8,[x19, #0x10]
00a9e2d8	mov w9,#0x8
00a9e2dc	str x9,[x19, #0x20]
00a9e2e0	cbz x8,0x00a9e310
00a9e2e4	ldr x9,[x19, #0x18]
00a9e2e8	mov w0,wzr
00a9e2ec	cmp x9,#0x8
00a9e2f0	b.ne 0x00a9e314
00a9e2f4	scvtf d0,w20
00a9e2f8	str d0,[x8]
00a9e2fc	b 0x00a9e310
00a9e300	mov w8,#0x8
00a9e304	sxtw x9,w20
00a9e308	str x8,[x19, #0x20]
00a9e30c	str x9,[x21]
00a9e310	mov w0,#0x1
00a9e314	ldp x29,x30,[sp, #0x20]
00a9e318	ldp x20,x19,[sp, #0x10]
00a9e31c	ldr x21,[sp], #0x30
00a9e320	ret
00a9e324	mov w8,#0x4
00a9e328	subs x9,x8,x2
00a9e32c	b.eq 0x00a9e358
00a9e330	add x8,sp,#0xc
00a9e334	mov x10,xzr
00a9e338	add x11,x8,x2
00a9e33c	mov w8,#0x4
00a9e340	ldrb w12,[x11, x10]
00a9e344	cmp w12,w1, UXTB 
00a9e348	b.ne 0x00a9e414
00a9e34c	add x10,x10,#0x1
00a9e350	cmp x10,x9
00a9e354	b.cc 0x00a9e340
00a9e358	add x8,sp,#0xc
00a9e35c	add x8,x8,x2
00a9e360	ldurb w8,[x8, #-0x1]
00a9e364	eor w8,w8,w1
00a9e368	sxtb w8,w8
00a9e36c	tbnz w8,#0x1f,0x00a9e410
00a9e370	add x1,sp,#0xc
00a9e374	mov x0,x21
00a9e378	bl 0x00c2ffd0
00a9e37c	ldr x8,[x19, #0x18]
00a9e380	mov w0,#0x1
00a9e384	str x8,[x19, #0x20]
00a9e388	b 0x00a9e314
00a9e38c	mov w9,#0x4
00a9e390	str x9,[x19, #0x20]
00a9e394	tbnz w20,#0x1f,0x00a9e404
00a9e398	cmp x2,#0x5
00a9e39c	b.cc 0x00a9e3b8
00a9e3a0	add x0,x21,#0x4
00a9e3a4	mov w1,wzr
00a9e3a8	mov x2,x8
00a9e3ac	bl 0x00c301c0
00a9e3b0	str w20,[x21]
00a9e3b4	b 0x00a9e3f4
00a9e3b8	mov w8,#0x4
00a9e3bc	subs x8,x8,x2
00a9e3c0	b.eq 0x00a9e3e8
00a9e3c4	add x9,sp,#0xc
00a9e3c8	mov x10,xzr
00a9e3cc	add x11,x9,x2
00a9e3d0	mov w9,#0x4
00a9e3d4	ldrb w12,[x11, x10]
00a9e3d8	cbnz w12,0x00a9e404
00a9e3dc	add x10,x10,#0x1
00a9e3e0	cmp x10,x8
00a9e3e4	b.cc 0x00a9e3d4
00a9e3e8	add x1,sp,#0xc
00a9e3ec	mov x0,x21
00a9e3f0	bl 0x00c2ffd0
00a9e3f4	ldr x9,[x19, #0x18]
00a9e3f8	mov w0,#0x1
00a9e3fc	str x9,[x19, #0x20]
00a9e400	b 0x00a9e314
00a9e404	mov w0,wzr
00a9e408	str x9,[x19, #0x20]
00a9e40c	b 0x00a9e314
00a9e410	mov w8,#0x4
00a9e414	mov w0,wzr
00a9e418	str x8,[x19, #0x20]
00a9e41c	b 0x00a9e314
