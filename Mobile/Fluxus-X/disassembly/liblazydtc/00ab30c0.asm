; FUN_00ab30c0 @ 00ab30c0
00ab30c0	sub sp,sp,#0x70
00ab30c4	stp x24,x23,[sp, #0x30]
00ab30c8	stp x22,x21,[sp, #0x40]
00ab30cc	stp x20,x19,[sp, #0x50]
00ab30d0	stp x29,x30,[sp, #0x60]
00ab30d4	ldr w8,[x1]
00ab30d8	mov x19,x0
00ab30dc	str x25,[sp, #0x20]
00ab30e0	add x29,sp,#0x60
00ab30e4	cbz w8,0x00ab319c
00ab30e8	ldr x8,[x1, #0x8]
00ab30ec	mov x23,xzr
00ab30f0	ldr w9,[x8]
00ab30f4	cmp w9,#0x14
00ab30f8	b.ne 0x00ab31ac
00ab30fc	ldr x20,[x8, #0x8]
00ab3100	mov x0,x19
00ab3104	bl 0x00c325e0
00ab3108	cmp w0,#0x1
00ab310c	b.lt 0x00ab3194
00ab3110	adrp x22,0x2d1000
00ab3114	mov w21,wzr
00ab3118	add x22,x22,#0x42e
00ab311c	mov x0,x19
00ab3120	mov w1,w21
00ab3124	bl 0x00c32610
00ab3128	cbz x0,0x00ab3180
00ab312c	mov x23,x0
00ab3130	ldr x0,[x0, #0x170]
00ab3134	ldr x2,[x23, #0x178]
00ab3138	mov x1,x22
00ab313c	bl 0x00c357f0
00ab3140	cbz x0,0x00ab3194
00ab3144	mov x24,x0
00ab3148	add x2,sp,#0xc
00ab314c	mov x0,x23
00ab3150	mov x1,x24
00ab3154	mov x3,xzr
00ab3158	bl 0x00c3f130
00ab315c	mov w25,w0
00ab3160	mov x0,x24
00ab3164	bl 0x00c35800
00ab3168	cbz w25,0x00ab3194
00ab316c	add x1,sp,#0xc
00ab3170	mov w2,#0x14
00ab3174	mov x0,x20
00ab3178	bl 0x00c300b0
00ab317c	cbz w0,0x00ab31ac
00ab3180	mov x0,x19
00ab3184	add w21,w21,#0x1
00ab3188	bl 0x00c325e0
00ab318c	cmp w21,w0
00ab3190	b.lt 0x00ab311c
00ab3194	mov x23,xzr
00ab3198	b 0x00ab31ac
00ab319c	ldr x1,[x1, #0x8]
00ab31a0	mov x0,x19
00ab31a4	bl 0x00c3f110
00ab31a8	mov x23,x0
00ab31ac	mov x0,x23
00ab31b0	ldp x29,x30,[sp, #0x60]
00ab31b4	ldp x20,x19,[sp, #0x50]
00ab31b8	ldp x22,x21,[sp, #0x40]
00ab31bc	ldp x24,x23,[sp, #0x30]
00ab31c0	ldr x25,[sp, #0x20]
00ab31c4	add sp,sp,#0x70
00ab31c8	ret
