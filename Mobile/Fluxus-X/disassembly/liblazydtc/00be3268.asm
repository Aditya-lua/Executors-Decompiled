; std::__ndk1::__num_get<char>::__stage2_float_prep @ 00be3268
00be3268	paciasp
00be326c	sub sp,sp,#0x60
00be3270	stp x29,x30,[sp, #0x20]
00be3274	stp x24,x23,[sp, #0x30]
00be3278	stp x22,x21,[sp, #0x40]
00be327c	stp x20,x19,[sp, #0x50]
00be3280	add x29,sp,#0x20
00be3284	mov x19,x8
00be3288	mov x8,sp
00be328c	mov x20,x3
00be3290	mov x21,x2
00be3294	mov x22,x1
00be3298	bl 0x00c30070
00be329c	adrp x24,0xcb4000
00be32a0	ldr x24,[x24, #0x998]
00be32a4	ldr x23,[sp]
00be32a8	str x24,[sp, #0x8]
00be32ac	ldar x8,[x24]
00be32b0	cmn x8,#0x1
00be32b4	b.eq 0x00be32e0
00be32b8	add x8,sp,#0x8
00be32bc	sub x9,x29,#0x8
00be32c0	stur x8,[x29, #-0x8]
00be32c4	str x9,[sp, #0x10]
00be32c8	adrp x0,0xcb4000
00be32cc	nop
00be32d0	adr x2,0xc0bab0
00be32d4	ldr x0,[x0, #0x998]
00be32d8	add x1,sp,#0x10
00be32dc	bl 0x00c305d0
00be32e0	ldp x8,x10,[x23, #0x10]
00be32e4	ldrsw x9,[x24, #0x8]
00be32e8	sub x9,x9,#0x1
00be32ec	sub x10,x10,x8
00be32f0	cmp x9,x10, ASR #0x3
00be32f4	b.cs 0x00be33e0
00be32f8	ldr x0,[x8, x9, LSL #0x3]
00be32fc	cbz x0,0x00be33e0
00be3300	ldr x8,[x0]
00be3304	ldr x8,[x8, #0x40]
00be3308	adrp x1,0xcb5000
00be330c	mov x3,x22
00be3310	ldr x1,[x1, #0xc08]
00be3314	add x2,x1,#0x1c
00be3318	blr x8
00be331c	adrp x23,0xcb5000
00be3320	ldr x23,[x23, #0xc00]
00be3324	ldr x22,[sp]
00be3328	str x23,[sp, #0x8]
00be332c	ldar x8,[x23]
00be3330	cmn x8,#0x1
00be3334	b.eq 0x00be3360
00be3338	add x8,sp,#0x8
00be333c	sub x9,x29,#0x8
00be3340	stur x8,[x29, #-0x8]
00be3344	str x9,[sp, #0x10]
00be3348	adrp x0,0xcb5000
00be334c	nop
00be3350	adr x2,0xc0bab0
00be3354	ldr x0,[x0, #0xc00]
00be3358	add x1,sp,#0x10
00be335c	bl 0x00c305d0
00be3360	ldp x8,x10,[x22, #0x10]
00be3364	ldrsw x9,[x23, #0x8]
00be3368	sub x9,x9,#0x1
00be336c	sub x10,x10,x8
00be3370	cmp x9,x10, ASR #0x3
00be3374	b.cs 0x00be33e4
00be3378	ldr x22,[x8, x9, LSL #0x3]
00be337c	cbz x22,0x00be33e4
00be3380	ldr x8,[x22]
00be3384	ldr x8,[x8, #0x18]
00be3388	mov x0,x22
00be338c	blr x8
00be3390	strb w0,[x21]
00be3394	ldr x8,[x22]
00be3398	ldr x8,[x8, #0x20]
00be339c	mov x0,x22
00be33a0	blr x8
00be33a4	strb w0,[x20]
00be33a8	ldr x8,[x22]
00be33ac	ldr x9,[x8, #0x28]
00be33b0	mov x8,x19
00be33b4	mov x0,x22
00be33b8	blr x9
00be33bc	mov x0,sp
00be33c0	bl 0x00c30090
00be33c4	ldp x20,x19,[sp, #0x50]
00be33c8	ldp x22,x21,[sp, #0x40]
00be33cc	ldp x24,x23,[sp, #0x30]
00be33d0	ldp x29,x30,[sp, #0x20]
00be33d4	add sp,sp,#0x60
00be33d8	autiasp
00be33dc	ret
00be33e0	bl 0x00bd8968
00be33e4	bl 0x00bd8968
