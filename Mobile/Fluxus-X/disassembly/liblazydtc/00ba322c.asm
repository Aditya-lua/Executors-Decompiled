; psa_get_and_lock_key_slot @ 00ba322c
00ba322c	sub sp,sp,#0x50
00ba3230	stp x22,x21,[sp, #0x20]
00ba3234	stp x20,x19,[sp, #0x30]
00ba3238	stp x29,x30,[sp, #0x40]
00ba323c	add x29,sp,#0x40
00ba3240	mrs x22,tpidr_el0
00ba3244	ldr x8,[x22, #0x28]
00ba3248	mov x19,x1
00ba324c	mov w20,w0
00ba3250	str x8,[sp, #0x18]
00ba3254	str xzr,[x1]
00ba3258	adrp x8,0xd26000
00ba325c	ldrb w8,[x8, #0x190]
00ba3260	cmp w8,#0x1
00ba3264	b.ne 0x00ba32f4
00ba3268	mov w0,w20
00ba326c	mov x1,x19
00ba3270	bl 0x00ba3388
00ba3274	cmn w0,#0x8c
00ba3278	b.ne 0x00ba32f8
00ba327c	mov x0,xzr
00ba3280	mov x1,x19
00ba3284	bl 0x00c431c0
00ba3288	cbnz w0,0x00ba32f8
00ba328c	ldr x21,[x19]
00ba3290	mov w8,#0x1
00ba3294	add x1,sp,#0x10
00ba3298	add x2,sp,#0x8
00ba329c	mov x0,x21
00ba32a0	str w20,[x21, #0x14]
00ba32a4	str w8,[x21, #0x4]
00ba32a8	stp xzr,xzr,[sp, #0x8]
00ba32ac	bl 0x00c43240
00ba32b0	mov w20,w0
00ba32b4	cbnz w0,0x00ba32c8
00ba32b8	ldp x2,x1,[sp, #0x8]
00ba32bc	mov x0,x21
00ba32c0	bl 0x00c42c00
00ba32c4	mov w20,w0
00ba32c8	ldp x1,x0,[sp, #0x8]
00ba32cc	bl 0x00c43230
00ba32d0	ldr x8,[x19]
00ba32d4	cbz w20,0x00ba331c
00ba32d8	mov x0,x8
00ba32dc	bl 0x00c42da0
00ba32e0	cmn w20,#0x8c
00ba32e4	mov w8,#0xffffff78
00ba32e8	csel w0,w8,w20,eq
00ba32ec	cbnz w0,0x00ba337c
00ba32f0	b 0x00ba32f8
00ba32f4	mov w0,#0xffffff77
00ba32f8	ldr x8,[x22, #0x28]
00ba32fc	ldr x9,[sp, #0x18]
00ba3300	cmp x8,x9
00ba3304	b.ne 0x00ba3384
00ba3308	ldp x29,x30,[sp, #0x40]
00ba330c	ldp x20,x19,[sp, #0x30]
00ba3310	ldp x22,x21,[sp, #0x20]
00ba3314	add sp,sp,#0x50
00ba3318	ret
00ba331c	ldr w9,[x8, #0x8]
00ba3320	tst w9,#0x3000
00ba3324	b.eq 0x00ba3340
00ba3328	lsr w10,w9,#0x2
00ba332c	and w11,w10,#0x400
00ba3330	orr w9,w11,w9
00ba3334	and w10,w10,#0x800
00ba3338	orr w9,w9,w10
00ba333c	str w9,[x8, #0x8]
00ba3340	ldr w9,[x8, #0x18]
00ba3344	cmp w9,#0x2
00ba3348	b.eq 0x00ba335c
00ba334c	cmp w9,#0x1
00ba3350	b.ne 0x00ba3378
00ba3354	mov w9,#0x2
00ba3358	str w9,[x8, #0x18]
00ba335c	ldr x9,[x8, #0x20]
00ba3360	cmn x9,#0x1
00ba3364	b.eq 0x00ba3378
00ba3368	add x9,x9,#0x1
00ba336c	mov w0,wzr
00ba3370	str x9,[x8, #0x20]
00ba3374	b 0x00ba32f8
00ba3378	mov w0,#0xffffff69
00ba337c	str xzr,[x19]
00ba3380	b 0x00ba32f8
00ba3384	bl 0x00c2fec0
