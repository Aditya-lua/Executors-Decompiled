; DSA_generate_parameters_ex @ 00b4e1f8
00b4e1f8	sub sp,sp,#0x50
00b4e1fc	stp x24,x23,[sp, #0x10]
00b4e200	stp x22,x21,[sp, #0x20]
00b4e204	stp x20,x19,[sp, #0x30]
00b4e208	stp x29,x30,[sp, #0x40]
00b4e20c	ldr x8,[x0, #0xa0]
00b4e210	mov x22,x6
00b4e214	mov x19,x5
00b4e218	mov x20,x4
00b4e21c	ldr x7,[x8, #0x50]
00b4e220	mov w24,w3
00b4e224	mov x21,x0
00b4e228	mov w23,w1
00b4e22c	add x29,sp,#0x40
00b4e230	cbz x7,0x00b4e264
00b4e234	mov x0,x21
00b4e238	mov w1,w23
00b4e23c	mov w3,w24
00b4e240	mov x4,x20
00b4e244	mov x5,x19
00b4e248	mov x6,x22
00b4e24c	ldp x29,x30,[sp, #0x40]
00b4e250	ldp x20,x19,[sp, #0x30]
00b4e254	ldp x22,x21,[sp, #0x20]
00b4e258	ldp x24,x23,[sp, #0x10]
00b4e25c	add sp,sp,#0x50
00b4e260	br x7
00b4e264	cbz x2,0x00b4e284
00b4e268	sxtw x8,w24
00b4e26c	add x0,x21,#0x8
00b4e270	mov w3,#0xffffffff
00b4e274	mov x1,x2
00b4e278	mov x2,x8
00b4e27c	bl 0x00c39cf0
00b4e280	cbz w0,0x00b4e318
00b4e284	cmp w23,#0x7ff
00b4e288	b.gt 0x00b4e2d0
00b4e28c	cmp w24,#0x14
00b4e290	b.gt 0x00b4e2d0
00b4e294	ldr x0,[x21, #0xb8]
00b4e298	add x1,x21,#0x8
00b4e29c	sxtw x3,w23
00b4e2a0	mov w4,#0xa0
00b4e2a4	add x5,sp,#0x8
00b4e2a8	mov w2,wzr
00b4e2ac	mov x6,x22
00b4e2b0	bl 0x00c3dc70
00b4e2b4	cmp w0,#0x1
00b4e2b8	b.lt 0x00b4e2f8
00b4e2bc	ldr x8,[x21, #0xc0]
00b4e2c0	add x8,x8,#0x1
00b4e2c4	str x8,[x21, #0xc0]
00b4e2c8	cbnz x20,0x00b4e300
00b4e2cc	b 0x00b4e308
00b4e2d0	ldr x0,[x21, #0xb8]
00b4e2d4	add x1,x21,#0x8
00b4e2d8	sxtw x3,w23
00b4e2dc	add x5,sp,#0xc
00b4e2e0	mov w2,wzr
00b4e2e4	mov x4,xzr
00b4e2e8	mov x6,x22
00b4e2ec	bl 0x00c3dc80
00b4e2f0	cmp w0,#0x1
00b4e2f4	b.ge 0x00b4e2bc
00b4e2f8	cbz w0,0x00b4e318
00b4e2fc	cbz x20,0x00b4e308
00b4e300	ldr w8,[x21, #0x38]
00b4e304	str w8,[x20]
00b4e308	cbz x19,0x00b4e314
00b4e30c	ldrsw x8,[x21, #0x44]
00b4e310	str x8,[x19]
00b4e314	mov w0,#0x1
00b4e318	ldp x29,x30,[sp, #0x40]
00b4e31c	ldp x20,x19,[sp, #0x30]
00b4e320	ldp x22,x21,[sp, #0x20]
00b4e324	ldp x24,x23,[sp, #0x10]
00b4e328	add sp,sp,#0x50
00b4e32c	ret
