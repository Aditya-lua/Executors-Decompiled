; WebSocketHandshakeKeyGen::generate @ 0099e180
0099e180	sub sp,sp,#0xf0
0099e184	str x21,[sp, #0xc0]
0099e188	stp x20,x19,[sp, #0xd0]
0099e18c	stp x29,x30,[sp, #0xe0]
0099e190	add x29,sp,#0xe0
0099e194	mrs x20,tpidr_el0
0099e198	ldr x8,[x20, #0x28]
0099e19c	movi v0.2D,#0x0
0099e1a0	mov x19,x1
0099e1a4	orr w2,wzr,#0x18
0099e1a8	stur x8,[x29, #-0x28]
0099e1ac	sturb wzr,[x29, #-0x30]
0099e1b0	stur xzr,[x29, #-0x38]
0099e1b4	stur q0,[x29, #-0x48]
0099e1b8	ldrb w8,[x0]
0099e1bc	ldr x9,[x0, #0x10]
0099e1c0	tst w8,#0x1
0099e1c4	csinc x1,x9,x0,ne
0099e1c8	sub x0,x29,#0x48
0099e1cc	bl 0x00c30ba0
0099e1d0	adrp x8,0x74a000
0099e1d4	add x8,x8,#0xb68
0099e1d8	ldp q0,q1,[x8]
0099e1dc	ldp q3,q2,[x8, #0x20]
0099e1e0	adrp x8,0x74a000
0099e1e4	add x8,x8,#0xb54
0099e1e8	stp q0,q1,[sp, #0x40]
0099e1ec	ldr w9,[x8, #0x10]
0099e1f0	ldr q0,[x8]
0099e1f4	ldp w8,w10,[x29, #-0x48]
0099e1f8	sub x0,x29,#0x60
0099e1fc	stur w9,[x29, #-0x50]
0099e200	add x1,sp,#0x40
0099e204	rev w8,w8
0099e208	str w8,[sp, #0x40]
0099e20c	ldp w9,w8,[x29, #-0x40]
0099e210	rev w10,w10
0099e214	str w10,[sp, #0x44]
0099e218	stp q3,q2,[sp, #0x60]
0099e21c	rev w9,w9
0099e220	str w9,[sp, #0x48]
0099e224	ldp w10,w9,[x29, #-0x38]
0099e228	rev w8,w8
0099e22c	str w8,[sp, #0x4c]
0099e230	sturb wzr,[x29, #-0x30]
0099e234	rev w8,w10
0099e238	rev w9,w9
0099e23c	stur q0,[x29, #-0x60]
0099e240	stp w8,w9,[sp, #0x50]
0099e244	sub x21,x29,#0x60
0099e248	bl 0x00c33b50
0099e24c	movi v0.2D,#0x0
0099e250	orr x8,xzr,#0x1e000000000
0099e254	sub x0,x29,#0x60
0099e258	mov x1,sp
0099e25c	stp q0,q0,[sp, #0x10]
0099e260	str q0,[sp]
0099e264	stp xzr,x8,[sp, #0x30]
0099e268	bl 0x00c33b50
0099e26c	ldur w9,[x29, #-0x60]
0099e270	mov x8,xzr
0099e274	sturb w9,[x29, #-0x5d]
0099e278	lsr w11,w9,#0x8
0099e27c	lsr w12,w9,#0x10
0099e280	lsr w10,w9,#0x18
0099e284	ldur w9,[x29, #-0x5c]
0099e288	sturb w11,[x29, #-0x5e]
0099e28c	sturb w12,[x29, #-0x5f]
0099e290	sturb w10,[x29, #-0x60]
0099e294	lsr w11,w9,#0x8
0099e298	sturb w9,[x29, #-0x59]
0099e29c	sturb w11,[x29, #-0x5a]
0099e2a0	lsr w11,w9,#0x10
0099e2a4	lsr w9,w9,#0x18
0099e2a8	sturb w9,[x29, #-0x5c]
0099e2ac	ldur w9,[x29, #-0x58]
0099e2b0	sturb w11,[x29, #-0x5b]
0099e2b4	lsr w11,w9,#0x8
0099e2b8	sturb w9,[x29, #-0x55]
0099e2bc	sturb w11,[x29, #-0x56]
0099e2c0	lsr w11,w9,#0x10
0099e2c4	lsr w9,w9,#0x18
0099e2c8	sturb w9,[x29, #-0x58]
0099e2cc	ldur w9,[x29, #-0x54]
0099e2d0	sturb w11,[x29, #-0x57]
0099e2d4	lsr w11,w9,#0x8
0099e2d8	sturb w9,[x29, #-0x51]
0099e2dc	sturb w11,[x29, #-0x52]
0099e2e0	lsr w11,w9,#0x10
0099e2e4	lsr w9,w9,#0x18
0099e2e8	sturb w9,[x29, #-0x54]
0099e2ec	ldur w9,[x29, #-0x50]
0099e2f0	sturb w11,[x29, #-0x53]
0099e2f4	lsr w11,w9,#0x8
0099e2f8	sturb w9,[x29, #-0x4d]
0099e2fc	sturb w11,[x29, #-0x4e]
0099e300	lsr w11,w9,#0x10
0099e304	lsr w9,w9,#0x18
0099e308	sturb w9,[x29, #-0x50]
0099e30c	adrp x9,0x2c0000
0099e310	sturb w11,[x29, #-0x4f]
0099e314	add x9,x9,#0xfc9
0099e318	mov x11,x19
0099e31c	b 0x0099e328
0099e320	ldrb w10,[x10, #0x3]
0099e324	add x11,x11,#0x4
0099e328	ubfx w10,w10,#0x2,#0x6
0099e32c	ldrb w12,[x9, w10, UXTW ]
0099e330	add x10,x21,x8
0099e334	add x8,x8,#0x3
0099e338	cmp x8,#0x11
0099e33c	strb w12,[x11]
0099e340	ldrb w12,[x10, #0x1]
0099e344	ldrb w13,[x10]
0099e348	lsr w12,w12,#0x4
0099e34c	bfm w12,w13,#0x1c,#0x1
0099e350	ldrb w12,[x9, w12, UXTW ]
0099e354	strb w12,[x11, #0x1]
0099e358	ldrb w12,[x10, #0x2]
0099e35c	ldrb w13,[x10, #0x1]
0099e360	lsr w12,w12,#0x6
0099e364	bfm w12,w13,#0x1e,#0x3
0099e368	ldrb w12,[x9, w12, UXTW ]
0099e36c	strb w12,[x11, #0x2]
0099e370	ldrb w12,[x10, #0x2]
0099e374	and x12,x12,#0x3f
0099e378	ldrb w12,[x9, x12]
0099e37c	strb w12,[x11, #0x3]
0099e380	b.ls 0x0099e320
0099e384	ldurb w8,[x29, #-0x4e]
0099e388	lsr w10,w8,#0x2
0099e38c	ldrb w10,[x9, w10, UXTW ]
0099e390	strb w10,[x19, #0x18]
0099e394	ldurb w10,[x29, #-0x4d]
0099e398	lsr w11,w10,#0x4
0099e39c	ubfiz w10,w10,#0x2,#0x4
0099e3a0	bfm w11,w8,#0x1c,#0x1
0099e3a4	ldrb w8,[x9, w10, UXTW ]
0099e3a8	ldrb w9,[x9, w11, UXTW ]
0099e3ac	mov w10,#0x3d
0099e3b0	strb w10,[x19, #0x1b]
0099e3b4	strb w8,[x19, #0x1a]
0099e3b8	strb w9,[x19, #0x19]
0099e3bc	ldr x8,[x20, #0x28]
0099e3c0	ldur x9,[x29, #-0x28]
0099e3c4	cmp x8,x9
0099e3c8	b.ne 0x0099e3e0
0099e3cc	ldp x29,x30,[sp, #0xe0]
0099e3d0	ldp x20,x19,[sp, #0xd0]
0099e3d4	ldr x21,[sp, #0xc0]
0099e3d8	add sp,sp,#0xf0
0099e3dc	ret
0099e3e0	bl 0x00c2fec0
