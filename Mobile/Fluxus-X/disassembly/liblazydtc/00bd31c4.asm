; std::__ndk1::basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>>::operator>> @ 00bd31c4
00bd31c4	paciasp
00bd31c8	sub sp,sp,#0x40
00bd31cc	stp x29,x30,[sp, #0x10]
00bd31d0	stp x22,x21,[sp, #0x20]
00bd31d4	stp x20,x19,[sp, #0x30]
00bd31d8	add x29,sp,#0x10
00bd31dc	mov x19,x0
00bd31e0	mov x20,x1
00bd31e4	str xzr,[x0, #0x8]
00bd31e8	sub x0,x29,#0x4
00bd31ec	mov x1,x19
00bd31f0	mov w2,#0x1
00bd31f4	bl 0x00c44060
00bd31f8	ldurb w8,[x29, #-0x4]
00bd31fc	cmp w8,#0x1
00bd3200	b.ne 0x00bd3300
00bd3204	cbz x20,0x00bd32cc
00bd3208	add x21,x19,#0x28
00bd320c	mov x22,#0x7fffffffffffffff
00bd3210	b 0x00bd3234
00bd3214	ldr x8,[x19]
00bd3218	ldur x8,[x8, #-0x18]
00bd321c	ldr x0,[x21, x8#0x0]
00bd3220	ldp x8,x9,[x0, #0x18]
00bd3224	cmp x8,x9
00bd3228	b.eq 0x00bd32b4
00bd322c	add x8,x8,#0x4
00bd3230	str x8,[x0, #0x18]
00bd3234	ldr x8,[x19]
00bd3238	ldur x8,[x8, #-0x18]
00bd323c	ldr x0,[x21, x8#0x0]
00bd3240	ldp x8,x9,[x0, #0x18]
00bd3244	cmp x8,x9
00bd3248	b.eq 0x00bd3254
00bd324c	ldr w1,[x8]
00bd3250	b 0x00bd3264
00bd3254	ldr x8,[x0]
00bd3258	ldr x8,[x8, #0x48]
00bd325c	blr x8
00bd3260	mov w1,w0
00bd3264	cmn w1,#0x1
00bd3268	b.eq 0x00bd32c4
00bd326c	ldp x8,x9,[x20, #0x30]
00bd3270	cmp x8,x9
00bd3274	b.eq 0x00bd3284
00bd3278	str w1,[x8], #0x4
00bd327c	str x8,[x20, #0x30]
00bd3280	b 0x00bd329c
00bd3284	ldr x8,[x20]
00bd3288	ldr x8,[x8, #0x68]
00bd328c	mov x0,x20
00bd3290	blr x8
00bd3294	cmn w0,#0x1
00bd3298	b.eq 0x00bd32d4
00bd329c	ldr x8,[x19, #0x8]
00bd32a0	cmp x8,x22
00bd32a4	b.eq 0x00bd3214
00bd32a8	add x8,x8,#0x1
00bd32ac	str x8,[x19, #0x8]
00bd32b0	b 0x00bd3214
00bd32b4	ldr x8,[x0]
00bd32b8	ldr x8,[x8, #0x50]
00bd32bc	blr x8
00bd32c0	b 0x00bd3234
00bd32c4	mov w8,#0x2
00bd32c8	b 0x00bd32d8
00bd32cc	mov w20,#0x4
00bd32d0	b 0x00bd32e8
00bd32d4	mov w8,wzr
00bd32d8	ldr x9,[x19, #0x8]
00bd32dc	orr w10,w8,#0x4
00bd32e0	cmp x9,#0x0
00bd32e4	csel w20,w10,w8,eq
00bd32e8	ldr x8,[x19]
00bd32ec	ldur x8,[x8, #-0x18]
00bd32f0	add x0,x19,x8
00bd32f4	ldr w8,[x0, #0x20]
00bd32f8	orr w1,w8,w20
00bd32fc	bl 0x00c30130
00bd3300	mov x0,x19
00bd3304	ldp x20,x19,[sp, #0x30]
00bd3308	ldp x22,x21,[sp, #0x20]
00bd330c	ldp x29,x30,[sp, #0x10]
00bd3310	add sp,sp,#0x40
00bd3314	autiasp
00bd3318	ret
