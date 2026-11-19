; BF_ofb64_encrypt @ 00a8e224
00a8e224	sub sp,sp,#0x70
00a8e228	stp x26,x25,[sp, #0x20]
00a8e22c	stp x24,x23,[sp, #0x30]
00a8e230	stp x22,x21,[sp, #0x40]
00a8e234	stp x20,x19,[sp, #0x50]
00a8e238	stp x29,x30,[sp, #0x60]
00a8e23c	ldrb w8,[x4]
00a8e240	ldrb w12,[x4, #0x4]
00a8e244	ldrb w9,[x4, #0x1]
00a8e248	ldrb w13,[x4, #0x5]
00a8e24c	ldrb w10,[x4, #0x2]
00a8e250	ldrb w14,[x4, #0x6]
00a8e254	ldrb w11,[x4, #0x3]
00a8e258	ldrb w15,[x4, #0x7]
00a8e25c	ldr w25,[x5]
00a8e260	lsl w16,w8,#0x18
00a8e264	lsl w17,w12,#0x18
00a8e268	bfm w16,w9,#0x10,#0x7
00a8e26c	bfm w17,w13,#0x10,#0x7
00a8e270	bfm w16,w10,#0x18,#0x7
00a8e274	bfm w17,w14,#0x18,#0x7
00a8e278	mov x19,x5
00a8e27c	strb w8,[sp, #0x18]
00a8e280	strb w9,[sp, #0x19]
00a8e284	orr w8,w16,w11
00a8e288	orr w9,w17,w15
00a8e28c	str x27,[sp, #0x10]
00a8e290	add x29,sp,#0x60
00a8e294	strb w10,[sp, #0x1a]
00a8e298	strb w11,[sp, #0x1b]
00a8e29c	strb w12,[sp, #0x1c]
00a8e2a0	strb w13,[sp, #0x1d]
00a8e2a4	strb w14,[sp, #0x1e]
00a8e2a8	stp w8,w9,[sp, #0x8]
00a8e2ac	strb w15,[sp, #0x1f]
00a8e2b0	cbz x2,0x00a8e380
00a8e2b4	mov x20,x4
00a8e2b8	mov x21,x3
00a8e2bc	mov x22,x2
00a8e2c0	mov x23,x1
00a8e2c4	mov x24,x0
00a8e2c8	mov w26,wzr
00a8e2cc	add x27,sp,#0x18
00a8e2d0	sub x22,x22,#0x1
00a8e2d4	cbnz w25,0x00a8e324
00a8e2d8	add x0,sp,#0x8
00a8e2dc	mov x1,x21
00a8e2e0	bl 0x00c38420
00a8e2e4	ldp w8,w9,[sp, #0x8]
00a8e2e8	add w26,w26,#0x1
00a8e2ec	lsr w10,w8,#0x18
00a8e2f0	strb w10,[sp, #0x18]
00a8e2f4	lsr w10,w8,#0x10
00a8e2f8	strb w10,[sp, #0x19]
00a8e2fc	lsr w10,w8,#0x8
00a8e300	strb w8,[sp, #0x1b]
00a8e304	lsr w8,w9,#0x18
00a8e308	strb w8,[sp, #0x1c]
00a8e30c	lsr w8,w9,#0x10
00a8e310	strb w8,[sp, #0x1d]
00a8e314	lsr w8,w9,#0x8
00a8e318	strb w10,[sp, #0x1a]
00a8e31c	strb w8,[sp, #0x1e]
00a8e320	strb w9,[sp, #0x1f]
00a8e324	ldrb w8,[x24], #0x1
00a8e328	ldrb w9,[x27, w25, SXTW ]
00a8e32c	add w10,w25,#0x1
00a8e330	and w25,w10,#0x7
00a8e334	eor w8,w9,w8
00a8e338	strb w8,[x23], #0x1
00a8e33c	cbnz x22,0x00a8e2d0
00a8e340	cbz w26,0x00a8e380
00a8e344	ldp w8,w9,[sp, #0x8]
00a8e348	lsr w10,w8,#0x18
00a8e34c	strb w10,[x20]
00a8e350	lsr w10,w8,#0x10
00a8e354	strb w8,[x20, #0x3]
00a8e358	lsr w8,w8,#0x8
00a8e35c	strb w10,[x20, #0x1]
00a8e360	lsr w10,w9,#0x18
00a8e364	strb w8,[x20, #0x2]
00a8e368	lsr w8,w9,#0x10
00a8e36c	strb w10,[x20, #0x4]
00a8e370	lsr w10,w9,#0x8
00a8e374	strb w8,[x20, #0x5]
00a8e378	strb w10,[x20, #0x6]
00a8e37c	strb w9,[x20, #0x7]
00a8e380	str w25,[x19]
00a8e384	ldp x29,x30,[sp, #0x60]
00a8e388	ldp x20,x19,[sp, #0x50]
00a8e38c	ldp x22,x21,[sp, #0x40]
00a8e390	ldp x24,x23,[sp, #0x30]
00a8e394	ldp x26,x25,[sp, #0x20]
00a8e398	ldr x27,[sp, #0x10]
00a8e39c	add sp,sp,#0x70
00a8e3a0	ret
