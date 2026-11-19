; std::__ndk1::__num_get<wchar_t>::__stage2_int_loop @ 00be30ac
00be30ac	paciasp
00be30b0	stp x29,x30,[sp, #-0x40]!
00be30b4	stp x24,x23,[sp, #0x10]
00be30b8	stp x22,x21,[sp, #0x20]
00be30bc	stp x20,x19,[sp, #0x30]
00be30c0	mov x29,sp
00be30c4	ldr x8,[x3]
00be30c8	ldr x19,[x29, #0x48]
00be30cc	cmp x8,x2
00be30d0	b.eq 0x00be3120
00be30d4	ldrb w8,[x6]
00be30d8	ldr x9,[x6, #0x8]
00be30dc	lsr x10,x8,#0x1
00be30e0	tst w8,#0x1
00be30e4	csel x8,x10,x9,eq
00be30e8	cmp w0,w5
00be30ec	b.ne 0x00be3134
00be30f0	cbz x8,0x00be3134
00be30f4	ldr x8,[x29, #0x40]
00be30f8	ldr x9,[x8]
00be30fc	sub x10,x9,x7
00be3100	cmp x10,#0x9f
00be3104	b.gt 0x00be31cc
00be3108	ldr w10,[x4]
00be310c	mov w0,wzr
00be3110	str w10,[x9], #0x4
00be3114	str x9,[x8]
00be3118	str wzr,[x4]
00be311c	b 0x00be3208
00be3120	ldr w9,[x19, #0x60]
00be3124	cmp w0,w9
00be3128	b.ne 0x00be3178
00be312c	mov w9,#0x2b
00be3130	b 0x00be3188
00be3134	mov w23,w1
00be3138	mov x20,x2
00be313c	mov w1,w0
00be3140	mov x0,x19
00be3144	mov w2,#0x1a
00be3148	mov x21,x3
00be314c	mov x22,x4
00be3150	add x24,x19,#0x68
00be3154	bl 0x00c43a60
00be3158	cmp x0,#0x0
00be315c	csel x8,x24,x0,eq
00be3160	sub x8,x8,x19
00be3164	asr x8,x8,#0x2
00be3168	cmp x8,#0x17
00be316c	b.le 0x00be31a0
00be3170	mov w0,#0xffffffff
00be3174	b 0x00be3208
00be3178	ldr w9,[x19, #0x64]
00be317c	cmp w0,w9
00be3180	b.ne 0x00be30d4
00be3184	mov w9,#0x2d
00be3188	add x10,x8,#0x1
00be318c	mov w0,wzr
00be3190	str x10,[x3]
00be3194	strb w9,[x8]
00be3198	str wzr,[x4]
00be319c	b 0x00be3208
00be31a0	cmp w23,#0x8
00be31a4	mov x9,x22
00be31a8	mov x10,x21
00be31ac	b.eq 0x00be31c0
00be31b0	cmp w23,#0x10
00be31b4	b.eq 0x00be31d4
00be31b8	cmp w23,#0xa
00be31bc	b.ne 0x00be31dc
00be31c0	cmp x8,w23, UXTW 
00be31c4	b.ge 0x00be3170
00be31c8	b 0x00be31dc
00be31cc	mov w0,wzr
00be31d0	b 0x00be3208
00be31d4	cmp x8,#0x16
00be31d8	b.ge 0x00be3220
00be31dc	adrp x11,0xcb5000
00be31e0	mov w0,wzr
00be31e4	ldr x11,[x11, #0xc08]
00be31e8	ldr x12,[x10]
00be31ec	ldrb w8,[x11, x8]
00be31f0	add x11,x12,#0x1
00be31f4	str x11,[x10]
00be31f8	strb w8,[x12]
00be31fc	ldr w8,[x9]
00be3200	add w8,w8,#0x1
00be3204	str w8,[x9]
00be3208	ldp x20,x19,[sp, #0x30]
00be320c	ldp x22,x21,[sp, #0x20]
00be3210	ldp x24,x23,[sp, #0x10]
00be3214	ldp x29,x30,[sp], #0x40
00be3218	autiasp
00be321c	ret
00be3220	ldr x11,[x10]
00be3224	mov w0,#0xffffffff
00be3228	subs x12,x11,x20
00be322c	b.eq 0x00be3208
00be3230	cmp x12,#0x2
00be3234	b.gt 0x00be3208
00be3238	ldurb w12,[x11, #-0x1]
00be323c	cmp w12,#0x30
00be3240	b.ne 0x00be3208
00be3244	adrp x12,0xcb5000
00be3248	mov w0,wzr
00be324c	ldr x12,[x12, #0xc08]
00be3250	str wzr,[x9]
00be3254	add x9,x11,#0x1
00be3258	ldrb w8,[x12, x8]
00be325c	str x9,[x10]
00be3260	strb w8,[x11]
00be3264	b 0x00be3208
