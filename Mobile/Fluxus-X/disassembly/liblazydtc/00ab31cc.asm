; FUN_00ab31cc @ 00ab31cc
00ab31cc	sub sp,sp,#0xb0
00ab31d0	stp x20,x19,[sp, #0x90]
00ab31d4	mov x20,x0
00ab31d8	stp x22,x21,[sp, #0x80]
00ab31dc	stp x29,x30,[sp, #0xa0]
00ab31e0	add x29,sp,#0xa0
00ab31e4	cbz x1,0x00ab3294
00ab31e8	ldr x2,[x1]
00ab31ec	mov x21,x1
00ab31f0	add x0,sp,#0x4c
00ab31f4	mov w1,#0x32
00ab31f8	mov w3,wzr
00ab31fc	bl 0x00c32500
00ab3200	bl 0x00c35250
00ab3204	add x1,sp,#0x4c
00ab3208	mov x0,xzr
00ab320c	mov x2,xzr
00ab3210	bl 0x00c357f0
00ab3214	mov x19,x0
00ab3218	cbnz x0,0x00ab322c
00ab321c	add x0,sp,#0x4c
00ab3220	bl 0x00c35310
00ab3224	mov x19,x0
00ab3228	cbz x0,0x00ab3314
00ab322c	bl 0x00c35240
00ab3230	mov x0,x19
00ab3234	bl 0x00c34c20
00ab3238	mov w22,w0
00ab323c	tbnz w0,#0x1f,0x00ab32ec
00ab3240	ldr w8,[x21, #0x10]
00ab3244	cmp w8,w22
00ab3248	b.ne 0x00ab328c
00ab324c	ldr w8,[x21, #0x28]
00ab3250	cmp w8,w22
00ab3254	b.ne 0x00ab328c
00ab3258	mov x0,x20
00ab325c	bl 0x00c32d20
00ab3260	add x2,sp,#0xc
00ab3264	mov x1,x19
00ab3268	mov x3,xzr
00ab326c	bl 0x00c3f040
00ab3270	cbz w0,0x00ab3344
00ab3274	ldr x1,[x21, #0x18]
00ab3278	sxtw x22,w22
00ab327c	add x0,sp,#0xc
00ab3280	mov x2,x22
00ab3284	bl 0x00c300b0
00ab3288	cbz w0,0x00ab3368
00ab328c	mov w20,wzr
00ab3290	b 0x00ab3348
00ab3294	mov x0,x2
00ab3298	mov x19,x2
00ab329c	bl 0x00c325e0
00ab32a0	cmp w0,#0x1
00ab32a4	b.lt 0x00ab32e4
00ab32a8	mov w21,wzr
00ab32ac	mov x0,x19
00ab32b0	mov w1,w21
00ab32b4	bl 0x00c32610
00ab32b8	ldr x1,[x0]
00ab32bc	mov x0,x20
00ab32c0	mov x2,xzr
00ab32c4	bl 0x00ab31cc
00ab32c8	cmp w0,#0x0
00ab32cc	b.le 0x00ab3354
00ab32d0	mov x0,x19
00ab32d4	add w21,w21,#0x1
00ab32d8	bl 0x00c325e0
00ab32dc	cmp w21,w0
00ab32e0	b.lt 0x00ab32ac
00ab32e4	mov w0,#0x1
00ab32e8	b 0x00ab3354
00ab32ec	bl 0x00c342a0
00ab32f0	adrp x0,0x2d2000
00ab32f4	adrp x2,0x2bc000
00ab32f8	add x0,x0,#0x1db
00ab32fc	add x2,x2,#0x2ce
00ab3300	mov w1,#0x14c
00ab3304	bl 0x00c342b0
00ab3308	mov w0,#0x27
00ab330c	mov w1,#0x6b
00ab3310	b 0x00ab333c
00ab3314	bl 0x00c35ed0
00ab3318	bl 0x00c342a0
00ab331c	adrp x0,0x2d2000
00ab3320	adrp x2,0x2bc000
00ab3324	add x0,x0,#0x1db
00ab3328	add x2,x2,#0x2ce
00ab332c	mov w1,#0x145
00ab3330	bl 0x00c342b0
00ab3334	mov w0,#0x27
00ab3338	mov w1,#0x77
00ab333c	mov x2,xzr
00ab3340	bl 0x00c342c0
00ab3344	mov w20,#0xffffffff
00ab3348	mov x0,x19
00ab334c	bl 0x00c35800
00ab3350	mov w0,w20
00ab3354	ldp x29,x30,[sp, #0xa0]
00ab3358	ldp x20,x19,[sp, #0x90]
00ab335c	ldp x22,x21,[sp, #0x80]
00ab3360	add sp,sp,#0xb0
00ab3364	ret
00ab3368	add x2,sp,#0xc
00ab336c	mov x0,x20
00ab3370	mov x1,x19
00ab3374	mov x3,xzr
00ab3378	bl 0x00c3f130
00ab337c	cbz w0,0x00ab339c
00ab3380	ldr x1,[x21, #0x30]
00ab3384	add x0,sp,#0xc
00ab3388	mov x2,x22
00ab338c	bl 0x00c300b0
00ab3390	cmp w0,#0x0
00ab3394	cset w20,eq
00ab3398	b 0x00ab3348
00ab339c	bl 0x00c342a0
00ab33a0	adrp x0,0x2d2000
00ab33a4	adrp x2,0x2bc000
00ab33a8	add x0,x0,#0x1db
00ab33ac	add x2,x2,#0x2ce
00ab33b0	mov w1,#0x15c
00ab33b4	bl 0x00c342b0
00ab33b8	mov w0,#0x27
00ab33bc	mov w1,#0x66
00ab33c0	b 0x00ab333c
