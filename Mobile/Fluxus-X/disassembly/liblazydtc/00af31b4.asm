; X509_signature_print @ 00af31b4
00af31b4	str x21,[sp, #-0x30]!
00af31b8	mov x21,x1
00af31bc	adrp x1,0x2a6000
00af31c0	adrp x3,0x2ab000
00af31c4	stp x20,x19,[sp, #0x10]
00af31c8	mov x19,x2
00af31cc	add x1,x1,#0x7fc
00af31d0	add x3,x3,#0x32c
00af31d4	mov w2,#0x4
00af31d8	stp x29,x30,[sp, #0x20]
00af31dc	add x29,sp,#0x20
00af31e0	mov x20,x0
00af31e4	bl 0x00c32250
00af31e8	cmp w0,#0x1
00af31ec	b.lt 0x00af327c
00af31f0	ldr x1,[x21]
00af31f4	mov x0,x20
00af31f8	bl 0x00c32da0
00af31fc	cmp w0,#0x1
00af3200	b.lt 0x00af327c
00af3204	cbz x19,0x00af322c
00af3208	adrp x1,0x2ba000
00af320c	adrp x3,0x2ab000
00af3210	add x1,x1,#0x758
00af3214	add x3,x3,#0x32c
00af3218	mov w2,#0x4
00af321c	mov x0,x20
00af3220	bl 0x00c32250
00af3224	cmp w0,#0x1
00af3228	b.lt 0x00af327c
00af322c	ldr x0,[x21]
00af3230	bl 0x00c37750
00af3234	cbz w0,0x00af3290
00af3238	add x1,sp,#0x8
00af323c	add x2,sp,#0xc
00af3240	bl 0x00c3ebe0
00af3244	cbz w0,0x00af3290
00af3248	ldr w1,[sp, #0xc]
00af324c	mov x0,xzr
00af3250	bl 0x00c37b20
00af3254	cbz x0,0x00af3290
00af3258	ldr x8,[x0, #0xa0]
00af325c	cbz x8,0x00af3290
00af3260	mov w3,#0x8
00af3264	mov x0,x20
00af3268	mov x1,x21
00af326c	mov x2,x19
00af3270	mov x4,xzr
00af3274	blr x8
00af3278	b 0x00af3280
00af327c	mov w0,wzr
00af3280	ldp x29,x30,[sp, #0x20]
00af3284	ldp x20,x19,[sp, #0x10]
00af3288	ldr x21,[sp], #0x30
00af328c	ret
00af3290	adrp x1,0x2c4000
00af3294	add x1,x1,#0xdae
00af3298	mov w2,#0x1
00af329c	mov x0,x20
00af32a0	bl 0x00c34240
00af32a4	cmp w0,#0x1
00af32a8	cset w0,eq
00af32ac	b.ne 0x00af3280
00af32b0	cbz x19,0x00af3280
00af32b4	mov w2,#0x8
00af32b8	mov x0,x20
00af32bc	mov x1,x19
00af32c0	bl 0x00af32c8
00af32c4	b 0x00af3280
