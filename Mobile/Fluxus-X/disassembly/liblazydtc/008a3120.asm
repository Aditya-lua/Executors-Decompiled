; FUN_008a3120 @ 008a3120
008a3120	ldp x9,x8,[x0, #0x20]
008a3124	add x10,x9,x9, LSL #0x1
008a3128	cmp x8,x10, LSR #0x2
008a312c	b.cs 0x008a3134
008a3130	ret
008a3134	cbz x8,0x008a31d0
008a3138	ldr x8,[x1]
008a313c	mov x12,#0x2d69
008a3140	movk x12,#0xeb38, LSL #16
008a3144	lsl w10,w8,#0x3
008a3148	lsr x11,x8,#0x20
008a314c	movk x12,#0xea08, LSL #32
008a3150	movk x12,#0x9ddf, LSL #48
008a3154	add x10,x10,#0x8
008a3158	eor x10,x10,x11
008a315c	mul x10,x10,x12
008a3160	eor x11,x11,x10, LSR #0x2f
008a3164	eor x10,x11,x10
008a3168	mov x11,#0x959d
008a316c	mul x10,x10,x12
008a3170	movk x11,#0xb8f4, LSL #16
008a3174	movk x11,#0xd34f, LSL #32
008a3178	movk x11,#0x949d, LSL #48
008a317c	eor x10,x10,x10, LSR #0x2f
008a3180	mul x10,x10,x11
008a3184	ldrb w11,[x0, #0x30]
008a3188	lsr x11,x10,x11
008a318c	ldr x10,[x0, #0x18]
008a3190	lsr x12,x11,#0x6
008a3194	ldr x12,[x10, x12, LSL #0x3]
008a3198	lsr x12,x12,x11
008a319c	tbz w12,#0x0,0x008a31d0
008a31a0	ldr x12,[x0]
008a31a4	sub x9,x9,#0x1
008a31a8	lsl x13,x11,#0x4
008a31ac	ldr x13,[x12, x13#0x0]
008a31b0	cmp x13,x8
008a31b4	b.eq 0x008a3130
008a31b8	add x11,x11,#0x1
008a31bc	and x11,x11,x9
008a31c0	lsr x13,x11,#0x6
008a31c4	ldr x13,[x10, x13, LSL #0x3]
008a31c8	lsr x13,x13,x11
008a31cc	tbnz w13,#0x0,0x008a31a8
008a31d0	b 0x008a31d4
008a31d4	stp x29,x30,[sp, #-0x50]!
008a31d8	str x25,[sp, #0x10]
008a31dc	stp x24,x23,[sp, #0x20]
008a31e0	stp x22,x21,[sp, #0x30]
008a31e4	stp x20,x19,[sp, #0x40]
008a31e8	mov x29,sp
008a31ec	ldr x9,[x0, #0x20]
008a31f0	mov w8,#0x10
008a31f4	mov x19,x0
008a31f8	lsl x10,x9,#0x1
008a31fc	cmp x9,#0x0
008a3200	csel x23,x8,x10,eq
008a3204	cbz x23,0x008a3254
008a3208	cmp x23,#0x40
008a320c	mov w22,#0x40
008a3210	csel x8,x23,x22,hi
008a3214	lsr x24,x8,#0x6
008a3218	lsl x21,x24,#0x3
008a321c	mov x0,x21
008a3220	bl 0x00c2fed0
008a3224	mov w1,wzr
008a3228	mov x2,x21
008a322c	mov x20,x0
008a3230	bl 0x00c301c0
008a3234	lsl x0,x23,#0x4
008a3238	bl 0x00c2fed0
008a323c	rbit x8,x23
008a3240	clz x8,x8
008a3244	sub w25,w22,w8
008a3248	ldp x8,x21,[x19, #0x10]
008a324c	cbnz x8,0x008a326c
008a3250	b 0x008a33d0
008a3254	mov x24,xzr
008a3258	mov x20,xzr
008a325c	mov x0,xzr
008a3260	mov w25,#0x40
008a3264	ldp x8,x21,[x19, #0x10]
008a3268	cbz x8,0x008a33d0
008a326c	ldr x10,[x21]
008a3270	cbz x10,0x008a327c
008a3274	mov x9,xzr
008a3278	b 0x008a329c
008a327c	mov x9,xzr
008a3280	add x11,x21,#0x8
008a3284	sub x12,x8,#0x1
008a3288	cmp x12,x9
008a328c	b.eq 0x008a33d0
008a3290	ldr x10,[x11, x9, LSL #0x3]
008a3294	add x9,x9,#0x1
008a3298	cbz x10,0x008a3288
008a329c	rbit x12,x10
008a32a0	mov x11,#0x2d69
008a32a4	mov x15,#0x959d
008a32a8	movk x11,#0xeb38, LSL #16
008a32ac	movk x15,#0xb8f4, LSL #16
008a32b0	ldr x22,[x19]
008a32b4	clz x12,x12
008a32b8	movk x11,#0xea08, LSL #32
008a32bc	movk x15,#0xd34f, LSL #32
008a32c0	orr x17,x12,x9, LSL #0x6
008a32c4	movk x11,#0x9ddf, LSL #48
008a32c8	sub x12,x23,#0x1
008a32cc	and x13,x25,#0xff
008a32d0	add x14,x21,#0x8
008a32d4	movk x15,#0x949d, LSL #48
008a32d8	mov w16,#0x1
008a32dc	add x1,x22,x17, LSL #0x4
008a32e0	ldr x5,[x1]
008a32e4	lsl w2,w5,#0x3
008a32e8	lsr x3,x5,#0x20
008a32ec	add x2,x2,#0x8
008a32f0	eor x2,x2,x3
008a32f4	mul x2,x2,x11
008a32f8	eor x3,x3,x2, LSR #0x2f
008a32fc	eor x2,x3,x2
008a3300	mul x2,x2,x11
008a3304	eor x2,x2,x2, LSR #0x2f
008a3308	mul x2,x2,x15
008a330c	lsr x2,x2,x13
008a3310	lsr x3,x2,#0x6
008a3314	lsl x4,x16,x2
008a3318	ldr x6,[x20, x3, LSL #0x3]
008a331c	tst x4,x6
008a3320	b.eq 0x008a3360
008a3324	lsl x3,x2,#0x4
008a3328	ldr x3,[x0, x3#0x0]
008a332c	cmp x3,x5
008a3330	b.eq 0x008a3354
008a3334	add x2,x2,#0x1
008a3338	and x2,x2,x12
008a333c	lsr x3,x2,#0x6
008a3340	lsl x4,x16,x2
008a3344	ldr x6,[x20, x3, LSL #0x3]
008a3348	tst x6,x4
008a334c	b.ne 0x008a3324
008a3350	b 0x008a335c
008a3354	lsr x3,x2,#0x6
008a3358	lsl x4,x16,x2
008a335c	ldr x6,[x20, x3, LSL #0x3]
008a3360	orr x4,x6,x4
008a3364	str x4,[x20, x3, LSL #0x3]
008a3368	sub x3,x10,#0x1
008a336c	ldr q0,[x1]
008a3370	ands x10,x3,x10
008a3374	str q0,[x0,x2, lsl #4]
008a3378	b.ne 0x008a33a4
008a337c	add x10,x9,#0x1
008a3380	cmp x8,x10
008a3384	csinc x1,x8,x9,hi
008a3388	add x2,x9,#0x1
008a338c	cmp x2,x8
008a3390	b.cs 0x008a33c0
008a3394	ldr x10,[x14, x9, LSL #0x3]
008a3398	mov x9,x2
008a339c	cbz x10,0x008a3388
008a33a0	mov x9,x2
008a33a4	rbit x17,x10
008a33a8	clz x17,x17
008a33ac	orr x17,x17,x9, LSL #0x6
008a33b0	cbnz x10,0x008a32dc
008a33b4	cmp x9,x8
008a33b8	b.ne 0x008a32dc
008a33bc	b 0x008a33d4
008a33c0	mov x10,xzr
008a33c4	mov x9,x1
008a33c8	cbz x10,0x008a33b4
008a33cc	b 0x008a32dc
008a33d0	ldr x22,[x19]
008a33d4	stp x0,xzr,[x19]
008a33d8	mov x0,xzr
008a33dc	stp xzr,xzr,[x19, #0x10]
008a33e0	bl 0x00c301d0
008a33e4	mov x0,xzr
008a33e8	stp x24,x20,[x19, #0x10]
008a33ec	str x23,[x19, #0x8]
008a33f0	bl 0x00c301d0
008a33f4	mov x0,xzr
008a33f8	bl 0x00c301d0
008a33fc	str x23,[x19, #0x20]
008a3400	strb w25,[x19, #0x30]
008a3404	cbz x22,0x008a3424
008a3408	mov x0,x22
008a340c	bl 0x00c301d0
008a3410	mov x0,x21
008a3414	bl 0x00c301d0
008a3418	mov x0,xzr
008a341c	bl 0x00c301d0
008a3420	mov x21,xzr
008a3424	mov x0,x21
008a3428	ldp x20,x19,[sp, #0x40]
008a342c	ldr x25,[sp, #0x10]
008a3430	ldp x22,x21,[sp, #0x30]
008a3434	ldp x24,x23,[sp, #0x20]
008a3438	ldp x29,x30,[sp], #0x50
008a343c	b 0x00c301d0
