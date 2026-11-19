; FUN_008b30a8 @ 008b30a8
008b30a8	sub sp,sp,#0x70
008b30ac	stp x29,x30,[sp, #0x10]
008b30b0	stp x28,x27,[sp, #0x20]
008b30b4	stp x26,x25,[sp, #0x30]
008b30b8	stp x24,x23,[sp, #0x40]
008b30bc	stp x22,x21,[sp, #0x50]
008b30c0	stp x20,x19,[sp, #0x60]
008b30c4	add x29,sp,#0x10
008b30c8	ldr x8,[x0, #0x50]
008b30cc	ldr w10,[x2, #0xc]
008b30d0	mov x19,x1
008b30d4	ldr x8,[x8]
008b30d8	cmp w10,#0xb
008b30dc	ldr x9,[x8, #0xc0]
008b30e0	ldr x8,[x8, #0x28]
008b30e4	add x21,x9,w3, UXTW  #0x4
008b30e8	ldr w9,[x21, #0x4]!
008b30ec	lsl x9,x9,#0x4
008b30f0	ldr x20,[x8, x9#0x0]
008b30f4	b.ne 0x008b3230
008b30f8	ldr x23,[x2]
008b30fc	ldr w9,[x21, #0x4]
008b3100	ldr w8,[x23, #0x18]
008b3104	cmp w9,w8
008b3108	b.ne 0x008b3118
008b310c	ldr w27,[x21, #0x8]
008b3110	cbnz w27,0x008b3140
008b3114	b 0x008b3230
008b3118	cbz w8,0x008b322c
008b311c	ldrb w8,[x23, #0x6a]
008b3120	tbnz w8,#0x0,0x008b312c
008b3124	ldr w8,[x23, #0x60]
008b3128	cbz w8,0x008b3268
008b312c	mov w27,wzr
008b3130	str w27,[x21, #0x8]
008b3134	ldr w8,[x23, #0x18]
008b3138	str w8,[x21, #0x4]
008b313c	cbz w27,0x008b3230
008b3140	ldrb w2,[x0, #0x4]
008b3144	mov w1,#0x28
008b3148	mov w3,#0xc
008b314c	mov w4,wzr
008b3150	mov x22,x0
008b3154	mov w24,#0xc
008b3158	bl 0x008b78d0
008b315c	movi v0.2D,#0x0
008b3160	str xzr,[x0, #0x20]
008b3164	mov x21,x0
008b3168	stp q0,q0,[x0]
008b316c	ldr x8,[x22, #0x60]
008b3170	ldr w9,[x23, #0x58]
008b3174	ldrb w2,[x22, #0x4]
008b3178	strb w24,[x0]
008b317c	ldrb w8,[x8, #0x2]
008b3180	lsl x1,x9,#0x4
008b3184	strb w2,[x0, #0x1]
008b3188	str x23,[x0, #0x10]
008b318c	and w8,w8,#0x3
008b3190	strb w8,[x0, #0x2]
008b3194	mov x0,x22
008b3198	bl 0x008b7610
008b319c	ldr w8,[x23, #0x58]
008b31a0	cmp w27,#0x2
008b31a4	str x0,[x21, #0x20]
008b31a8	str w8,[x21, #0x18]
008b31ac	b.ne 0x008b31e8
008b31b0	cbz w8,0x008b3224
008b31b4	mov x8,xzr
008b31b8	mov x9,xzr
008b31bc	mov w10,#0x3
008b31c0	ldr x11,[x21, #0x20]
008b31c4	add x9,x9,#0x1
008b31c8	add x11,x11,x8
008b31cc	add x8,x8,#0x10
008b31d0	str xzr,[x11]
008b31d4	ldr w12,[x23, #0x58]
008b31d8	str w10,[x11, #0xc]
008b31dc	cmp x9,x12
008b31e0	b.cc 0x008b31c0
008b31e4	b 0x008b3224
008b31e8	cbz w8,0x008b3224
008b31ec	mov x22,xzr
008b31f0	mov x24,xzr
008b31f4	ldr x8,[x23, #0x40]
008b31f8	mov x0,x20
008b31fc	ldr x1,[x8, x24, LSL #0x3]
008b3200	bl 0x008bb440
008b3204	ldr x8,[x21, #0x20]
008b3208	ldr q0,[x0]
008b320c	add x24,x24,#0x1
008b3210	str q0,[x8,x22]
008b3214	add x22,x22,#0x10
008b3218	ldr w8,[x23, #0x58]
008b321c	cmp x24,x8
008b3220	b.cc 0x008b31f4
008b3224	mov w8,#0xc
008b3228	b 0x008b3240
008b322c	stp wzr,wzr,[x21, #0x4]
008b3230	mov x1,x20
008b3234	bl 0x008bd16c
008b3238	mov x21,x0
008b323c	mov w8,#0x6
008b3240	str x21,[x19]
008b3244	str w8,[x19, #0xc]
008b3248	ldp x20,x19,[sp, #0x60]
008b324c	ldp x22,x21,[sp, #0x50]
008b3250	ldp x24,x23,[sp, #0x40]
008b3254	ldp x26,x25,[sp, #0x30]
008b3258	ldp x28,x27,[sp, #0x20]
008b325c	ldp x29,x30,[sp, #0x10]
008b3260	add sp,sp,#0x70
008b3264	ret
008b3268	ldrb w8,[x20, #0x5]
008b326c	cmp w8,#0x1f
008b3270	b.ne 0x008b328c
008b3274	mov w22,wzr
008b3278	ldr w8,[x23, #0x58]
008b327c	cmp w22,w8
008b3280	mov w8,#0x1
008b3284	cinc w27,w8,eq
008b3288	b 0x008b3130
008b328c	mov x24,xzr
008b3290	mov w22,wzr
008b3294	mov w10,#0x1
008b3298	mov w9,#0x1
008b329c	lsl x27,x24,#0x5
008b32a0	stur w9,[x29, #-0x4]
008b32a4	b 0x008b32c4
008b32a8	ldrb w8,[x20, #0x5]
008b32ac	mov w10,#0x1
008b32b0	lsl w9,w10,w8
008b32b4	add x24,x24,#0x1
008b32b8	add x27,x27,#0x20
008b32bc	cmp x24,w9, SXTW 
008b32c0	b.ge 0x008b3364
008b32c4	ldr x26,[x20, #0x28]
008b32c8	add x28,x26,x27
008b32cc	ldr w9,[x28, #0x1c]
008b32d0	ands w9,w9,#0xf
008b32d4	b.eq 0x008b32b0
008b32d8	cmp w9,#0x5
008b32dc	b.ne 0x008b312c
008b32e0	add x8,x26,x27
008b32e4	mov x25,x0
008b32e8	ldr x0,[x23, #0x38]
008b32ec	ldr x1,[x8, #0x10]
008b32f0	bl 0x008bb440
008b32f4	ldr w8,[x0, #0xc]
008b32f8	cmp w8,#0x3
008b32fc	b.ne 0x008b3374
008b3300	ldr d0,[x0]
008b3304	ldr w9,[x23, #0x58]
008b3308	mov x0,x25
008b330c	fcvtzu w8,d0
008b3310	cmp w9,w8
008b3314	b.ls 0x008b312c
008b3318	add x8,x26,x27
008b331c	add w22,w22,#0x1
008b3320	ldr w8,[x8, #0xc]
008b3324	cmp w8,#0x3
008b3328	b.ne 0x008b3340
008b332c	ldr d0,[x28]
008b3330	fcmp d0,#0.0
008b3334	b.ne 0x008b3340
008b3338	fmov x8,d0
008b333c	tbz x8,#0x3f,0x008b32a8
008b3340	ldrb w8,[x20, #0x5]
008b3344	mov w27,#0x1
008b3348	add x24,x24,#0x1
008b334c	mov w10,#0x1
008b3350	lsl w9,w27,w8
008b3354	cmp x24,w9, SXTW 
008b3358	mov w9,wzr
008b335c	b.lt 0x008b329c
008b3360	b 0x008b3130
008b3364	ldur w8,[x29, #-0x4]
008b3368	tbnz w8,#0x0,0x008b3278
008b336c	mov w27,#0x1
008b3370	b 0x008b3130
008b3374	mov w27,wzr
008b3378	mov x0,x25
008b337c	b 0x008b3130
