; ossl_pkcs7_resolve_libctx @ 00ac3128
00ac3128	str x25,[sp, #-0x50]!
00ac312c	add x8,x0,#0x28
00ac3130	cmp x0,#0x0
00ac3134	csel x25,xzr,x8,eq
00ac3138	stp x24,x23,[sp, #0x10]
00ac313c	stp x22,x21,[sp, #0x20]
00ac3140	stp x20,x19,[sp, #0x30]
00ac3144	stp x29,x30,[sp, #0x40]
00ac3148	add x29,sp,#0x40
00ac314c	cbz x0,0x00ac32c0
00ac3150	ldr x8,[x0, #0x20]
00ac3154	mov x23,x0
00ac3158	cbz x8,0x00ac32c0
00ac315c	ldr x0,[x23, #0x18]
00ac3160	ldp x19,x20,[x25]
00ac3164	bl 0x00c37750
00ac3168	cmp w0,#0x18
00ac316c	b.ne 0x00ac31d8
00ac3170	ldr x8,[x23, #0x20]
00ac3174	ldr x21,[x8, #0x30]
00ac3178	cbz x8,0x00ac31f4
00ac317c	ldr x0,[x23, #0x18]
00ac3180	bl 0x00c37750
00ac3184	cmp w0,#0x16
00ac3188	b.eq 0x00ac319c
00ac318c	ldr x0,[x23, #0x18]
00ac3190	bl 0x00c37750
00ac3194	cmp w0,#0x18
00ac3198	b.ne 0x00ac32e8
00ac319c	ldr x8,[x23, #0x20]
00ac31a0	ldr x22,[x8, #0x20]
00ac31a4	cbz x8,0x00ac31fc
00ac31a8	ldr x0,[x23, #0x18]
00ac31ac	bl 0x00c37750
00ac31b0	cmp w0,#0x16
00ac31b4	b.eq 0x00ac31cc
00ac31b8	ldr x0,[x23, #0x18]
00ac31bc	bl 0x00c37750
00ac31c0	cmp w0,#0x18
00ac31c4	mov x24,xzr
00ac31c8	b.ne 0x00ac3200
00ac31cc	ldr x8,[x23, #0x20]
00ac31d0	ldr x24,[x8, #0x10]
00ac31d4	b 0x00ac3200
00ac31d8	ldr x0,[x23, #0x18]
00ac31dc	bl 0x00c37750
00ac31e0	cmp w0,#0x17
00ac31e4	b.ne 0x00ac32d8
00ac31e8	ldr x8,[x23, #0x20]
00ac31ec	ldr x21,[x8, #0x8]
00ac31f0	cbnz x8,0x00ac317c
00ac31f4	mov x22,xzr
00ac31f8	cbnz x8,0x00ac31a8
00ac31fc	mov x24,xzr
00ac3200	mov x0,x24
00ac3204	bl 0x00c325e0
00ac3208	cmp w0,#0x1
00ac320c	b.lt 0x00ac3240
00ac3210	mov w23,wzr
00ac3214	mov x0,x24
00ac3218	mov w1,w23
00ac321c	bl 0x00c32610
00ac3220	mov x1,x19
00ac3224	mov x2,x20
00ac3228	bl 0x00c3f820
00ac322c	mov x0,x24
00ac3230	add w23,w23,#0x1
00ac3234	bl 0x00c325e0
00ac3238	cmp w23,w0
00ac323c	b.lt 0x00ac3214
00ac3240	mov x0,x21
00ac3244	bl 0x00c325e0
00ac3248	cmp w0,#0x1
00ac324c	b.lt 0x00ac3284
00ac3250	mov w23,wzr
00ac3254	mov x0,x21
00ac3258	mov w1,w23
00ac325c	bl 0x00c32610
00ac3260	ldr x0,[x0, #0x20]
00ac3264	mov x1,x19
00ac3268	mov x2,x20
00ac326c	bl 0x00c3f820
00ac3270	mov x0,x21
00ac3274	add w23,w23,#0x1
00ac3278	bl 0x00c325e0
00ac327c	cmp w23,w0
00ac3280	b.lt 0x00ac3254
00ac3284	mov x0,x22
00ac3288	bl 0x00c325e0
00ac328c	cmp w0,#0x1
00ac3290	b.lt 0x00ac32c0
00ac3294	mov w19,wzr
00ac3298	mov x0,x22
00ac329c	mov w1,w19
00ac32a0	bl 0x00c32610
00ac32a4	cbz x0,0x00ac32ac
00ac32a8	str x25,[x0, #0x40]
00ac32ac	mov x0,x22
00ac32b0	add w19,w19,#0x1
00ac32b4	bl 0x00c325e0
00ac32b8	cmp w19,w0
00ac32bc	b.lt 0x00ac3298
00ac32c0	ldp x29,x30,[sp, #0x40]
00ac32c4	ldp x20,x19,[sp, #0x30]
00ac32c8	ldp x22,x21,[sp, #0x20]
00ac32cc	ldp x24,x23,[sp, #0x10]
00ac32d0	ldr x25,[sp], #0x50
00ac32d4	ret
00ac32d8	ldr x8,[x23, #0x20]
00ac32dc	mov x21,xzr
00ac32e0	cbnz x8,0x00ac317c
00ac32e4	b 0x00ac31f4
00ac32e8	ldr x8,[x23, #0x20]
00ac32ec	mov x22,xzr
00ac32f0	cbnz x8,0x00ac31a8
00ac32f4	b 0x00ac31fc
