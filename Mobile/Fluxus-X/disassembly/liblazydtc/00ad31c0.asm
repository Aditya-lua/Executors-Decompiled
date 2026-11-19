; ossl_rsa_multip_calc_product @ 00ad31c0
00ad31c0	stp x26,x25,[sp, #-0x50]!
00ad31c4	stp x24,x23,[sp, #0x10]
00ad31c8	stp x22,x21,[sp, #0x20]
00ad31cc	stp x20,x19,[sp, #0x30]
00ad31d0	stp x29,x30,[sp, #0x40]
00ad31d4	mov x20,x0
00ad31d8	ldr x0,[x0, #0x88]
00ad31dc	add x29,sp,#0x40
00ad31e0	bl 0x00c325e0
00ad31e4	cmp w0,#0x1
00ad31e8	b.lt 0x00ad3260
00ad31ec	mov w21,w0
00ad31f0	bl 0x00c38a50
00ad31f4	mov x19,x0
00ad31f8	cbz x0,0x00ad3264
00ad31fc	mov w22,wzr
00ad3200	add x23,x20,#0x48
00ad3204	add x26,x20,#0x40
00ad3208	ldr x0,[x20, #0x88]
00ad320c	ldr x24,[x26]
00ad3210	ldr x25,[x23]
00ad3214	mov w1,w22
00ad3218	bl 0x00c32610
00ad321c	mov x26,x0
00ad3220	mov x23,x0
00ad3224	ldr x0,[x26, #0x18]!
00ad3228	cbnz x0,0x00ad3238
00ad322c	bl 0x00c38d90
00ad3230	str x0,[x26]
00ad3234	cbz x0,0x00ad3264
00ad3238	mov x1,x24
00ad323c	mov x2,x25
00ad3240	mov x3,x19
00ad3244	bl 0x00c39060
00ad3248	cbz w0,0x00ad3264
00ad324c	add w22,w22,#0x1
00ad3250	cmp w22,w21
00ad3254	b.lt 0x00ad3208
00ad3258	mov w20,#0x1
00ad325c	b 0x00ad3268
00ad3260	mov x19,xzr
00ad3264	mov w20,wzr
00ad3268	mov x0,x19
00ad326c	bl 0x00c38a30
00ad3270	mov w0,w20
00ad3274	ldp x29,x30,[sp, #0x40]
00ad3278	ldp x20,x19,[sp, #0x30]
00ad327c	ldp x22,x21,[sp, #0x20]
00ad3280	ldp x24,x23,[sp, #0x10]
00ad3284	ldp x26,x25,[sp], #0x50
00ad3288	ret
