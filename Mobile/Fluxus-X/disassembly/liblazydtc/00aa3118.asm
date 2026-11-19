; ossl_provider_add_to_store @ 00aa3118
00aa3118	sub sp,sp,#0x140
00aa311c	stp x24,x23,[sp, #0x100]
00aa3120	stp x20,x19,[sp, #0x120]
00aa3124	mov w23,w2
00aa3128	mov x20,x1
00aa312c	mov x19,x0
00aa3130	mov x0,sp
00aa3134	orr w2,wzr,#0xe0
00aa3138	mov w1,wzr
00aa313c	str x28,[sp, #0xe0]
00aa3140	stp x26,x25,[sp, #0xf0]
00aa3144	stp x22,x21,[sp, #0x110]
00aa3148	stp x29,x30,[sp, #0x130]
00aa314c	add x29,sp,#0x130
00aa3150	bl 0x00c301c0
00aa3154	cbz x20,0x00aa315c
00aa3158	str xzr,[x20]
00aa315c	ldr x0,[x19, #0x50]
00aa3160	adrp x2,0xc6d000
00aa3164	add x2,x2,#0x4c8
00aa3168	mov w1,#0x1
00aa316c	bl 0x00c3b520
00aa3170	cbz x0,0x00aa3230
00aa3174	mov x22,x0
00aa3178	ldr x0,[x0, #0x20]
00aa317c	bl 0x00c356a0
00aa3180	cbz w0,0x00aa3318
00aa3184	ldr x8,[x19, #0x28]
00aa3188	mov x1,sp
00aa318c	str x8,[sp, #0x28]
00aa3190	ldr x0,[x22, #0x8]
00aa3194	bl 0x00c34760
00aa3198	ldr x8,[x22, #0x8]
00aa319c	mov w21,w0
00aa31a0	cmn w0,#0x1
00aa31a4	b.eq 0x00aa3260
00aa31a8	mov x0,x8
00aa31ac	mov w1,w21
00aa31b0	bl 0x00c32610
00aa31b4	mov x24,x0
00aa31b8	ldr x0,[x22, #0x20]
00aa31bc	bl 0x00c35690
00aa31c0	cbz x20,0x00aa31fc
00aa31c4	add x8,x24,#0x10
00aa31c8	ldxr w22,[x8]
00aa31cc	add w9,w22,#0x1
00aa31d0	stxr w10,w9,[x8]
00aa31d4	cbnz w10,0x00aa31c8
00aa31d8	ldrb w8,[x24, #0xc8]
00aa31dc	tbz w8,#0x0,0x00aa31f0
00aa31e0	mov x0,x24
00aa31e4	mov w1,wzr
00aa31e8	bl 0x00c3eb90
00aa31ec	cbz w0,0x00aa32dc
00aa31f0	cmn w22,#0x1
00aa31f4	b.eq 0x00aa32e4
00aa31f8	str x24,[x20]
00aa31fc	tbnz w21,#0x1f,0x00aa3228
00aa3200	cbz x19,0x00aa3220
00aa3204	mov w1,#0x1
00aa3208	mov x0,x19
00aa320c	mov w2,wzr
00aa3210	bl 0x00aa3c88
00aa3214	cbnz w0,0x00aa3220
00aa3218	mov x0,x19
00aa321c	bl 0x00aa3e00
00aa3220	mov x0,x19
00aa3224	bl 0x00aa2c44
00aa3228	mov w0,#0x1
00aa322c	b 0x00aa3318
00aa3230	bl 0x00c342a0
00aa3234	adrp x0,0x2aa000
00aa3238	adrp x2,0x2bb000
00aa323c	add x0,x0,#0x4b5
00aa3240	add x2,x2,#0xf7d
00aa3244	mov w1,#0x156
00aa3248	bl 0x00c342b0
00aa324c	mov w8,#0x100
00aa3250	movk w8,#0xc, LSL #16
00aa3254	add w1,w8,#0x3
00aa3258	orr w0,wzr,#0xf
00aa325c	b 0x00aa330c
00aa3260	mov x0,x8
00aa3264	mov x1,x19
00aa3268	bl 0x00c347a0
00aa326c	cbz w0,0x00aa3344
00aa3270	str x22,[x19, #0x58]
00aa3274	ldr x0,[x22, #0x10]
00aa3278	bl 0x00c325e0
00aa327c	cmp w0,#0x1
00aa3280	b.lt 0x00aa32c0
00aa3284	mov w24,w0
00aa3288	mov w25,wzr
00aa328c	mov w26,#0x1
00aa3290	ldr x0,[x22, #0x10]
00aa3294	mov w1,w25
00aa3298	bl 0x00c32610
00aa329c	ldr x8,[x0, #0x8]
00aa32a0	ldr x1,[x0, #0x20]
00aa32a4	mov x0,x19
00aa32a8	blr x8
00aa32ac	add w25,w25,#0x1
00aa32b0	cmp w24,w25
00aa32b4	and w26,w0,w26
00aa32b8	b.ne 0x00aa3290
00aa32bc	cbz w26,0x00aa3338
00aa32c0	mov x24,x19
00aa32c4	cbnz w23,0x00aa31b8
00aa32c8	ldrb w8,[x22, #0x48]
00aa32cc	mov x24,x19
00aa32d0	and w8,w8,#0xfe
00aa32d4	strb w8,[x22, #0x48]
00aa32d8	b 0x00aa31b8
00aa32dc	mov x0,x24
00aa32e0	bl 0x00aa2c44
00aa32e4	bl 0x00c342a0
00aa32e8	adrp x0,0x2aa000
00aa32ec	adrp x2,0x2a0000
00aa32f0	add x0,x0,#0x4b5
00aa32f4	add x2,x2,#0x674
00aa32f8	mov w1,#0x291
00aa32fc	bl 0x00c342b0
00aa3300	mov w1,#0x100
00aa3304	orr w0,wzr,#0xf
00aa3308	movk w1,#0xc, LSL #16
00aa330c	mov x2,xzr
00aa3310	bl 0x00c342c0
00aa3314	mov w0,wzr
00aa3318	ldp x29,x30,[sp, #0x130]
00aa331c	ldp x20,x19,[sp, #0x120]
00aa3320	ldp x22,x21,[sp, #0x110]
00aa3324	ldp x24,x23,[sp, #0x100]
00aa3328	ldp x26,x25,[sp, #0xf0]
00aa332c	ldr x28,[sp, #0xe0]
00aa3330	add sp,sp,#0x140
00aa3334	ret
00aa3338	ldr x0,[x22, #0x8]
00aa333c	mov x1,x19
00aa3340	bl 0x00c39610
00aa3344	ldr x0,[x22, #0x20]
00aa3348	bl 0x00c35690
00aa334c	b 0x00aa3314
