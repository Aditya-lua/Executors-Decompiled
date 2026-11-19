; blake3_hash_many_portable @ 008e3238
008e3238	sub sp,sp,#0xb0
008e323c	stp x29,x30,[sp, #0x50]
008e3240	stp x28,x27,[sp, #0x60]
008e3244	stp x26,x25,[sp, #0x70]
008e3248	stp x24,x23,[sp, #0x80]
008e324c	stp x22,x21,[sp, #0x90]
008e3250	stp x20,x19,[sp, #0xa0]
008e3254	add x29,sp,#0x50
008e3258	mrs x8,tpidr_el0
008e325c	str x8,[sp, #0x8]
008e3260	ldr x8,[x8, #0x28]
008e3264	stur x8,[x29, #-0x8]
008e3268	cbz x1,0x008e3350
008e326c	ldrb w8,[x29, #0x60]
008e3270	ldr x27,[x29, #0x68]
008e3274	orr w9,w7,w6
008e3278	mov w19,w6
008e327c	mov x20,x1
008e3280	mov x21,x4
008e3284	mov x22,x3
008e3288	mov x26,x2
008e328c	mov x24,x0
008e3290	and x10,x5,#0x1
008e3294	str w9,[sp, #0x14]
008e3298	orr w9,w9,w8
008e329c	orr w28,w6,w8
008e32a0	str x10,[sp, #0x18]
008e32a4	str w9,[sp, #0x10]
008e32a8	b 0x008e32dc
008e32ac	ldp w8,w9,[sp, #0x20]
008e32b0	ldur q0,[sp, #0x28]
008e32b4	ldr x10,[sp, #0x18]
008e32b8	subs x20,x20,#0x1
008e32bc	add x24,x24,#0x8
008e32c0	stp w8,w9,[x27]
008e32c4	add x21,x21,x10
008e32c8	ldp w8,w9,[sp, #0x38]
008e32cc	stur q0,[x27, #0x8]
008e32d0	stp w8,w9,[x27, #0x18]
008e32d4	add x27,x27,#0x20
008e32d8	b.eq 0x008e3350
008e32dc	ldp q0,q1,[x22]
008e32e0	ldr x25,[x24]
008e32e4	stp q0,q1,[sp, #0x20]
008e32e8	cbz x26,0x008e32ac
008e32ec	ldp w9,w8,[sp, #0x10]
008e32f0	cmp x26,#0x1
008e32f4	add x0,sp,#0x20
008e32f8	mov x1,x25
008e32fc	mov w2,#0x40
008e3300	mov x3,x21
008e3304	csel w4,w8,w9,ne
008e3308	bl 0x00c30b00
008e330c	add x25,x25,#0x40
008e3310	mov x23,x26
008e3314	b 0x008e3338
008e3318	mov w4,w28
008e331c	add x0,sp,#0x20
008e3320	mov x1,x25
008e3324	mov w2,#0x40
008e3328	mov x3,x21
008e332c	bl 0x00c30b00
008e3330	add x25,x25,#0x40
008e3334	sub x23,x23,#0x1
008e3338	cmp x23,#0x2
008e333c	b.eq 0x008e3318
008e3340	cmp x23,#0x1
008e3344	mov w4,w19
008e3348	b.ne 0x008e331c
008e334c	b 0x008e32ac
008e3350	ldr x8,[sp, #0x8]
008e3354	ldr x8,[x8, #0x28]
008e3358	ldur x9,[x29, #-0x8]
008e335c	cmp x8,x9
008e3360	b.ne 0x008e3384
008e3364	ldp x20,x19,[sp, #0xa0]
008e3368	ldp x22,x21,[sp, #0x90]
008e336c	ldp x24,x23,[sp, #0x80]
008e3370	ldp x26,x25,[sp, #0x70]
008e3374	ldp x28,x27,[sp, #0x60]
008e3378	ldp x29,x30,[sp, #0x50]
008e337c	add sp,sp,#0xb0
008e3380	ret
008e3384	bl 0x00c2fec0
