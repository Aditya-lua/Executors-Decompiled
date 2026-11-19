; EVP_RAND_nonce @ 00aca14c
00aca14c	sub sp,sp,#0xb0
00aca150	stp x22,x21,[sp, #0x80]
00aca154	stp x20,x19,[sp, #0x90]
00aca158	stp x29,x30,[sp, #0xa0]
00aca15c	ldr x8,[x0]
00aca160	mov x20,x2
00aca164	mov x19,x0
00aca168	mov x21,x1
00aca16c	ldr x8,[x8, #0x78]
00aca170	add x29,sp,#0xa0
00aca174	cbz x8,0x00aca184
00aca178	ldr x0,[x19, #0x8]
00aca17c	blr x8
00aca180	cbz w0,0x00aca210
00aca184	add x0,sp,#0x30
00aca188	mov w2,#0x50
00aca18c	mov w1,wzr
00aca190	bl 0x00c301c0
00aca194	adrp x0,0x29e000
00aca198	add x0,x0,#0x95d
00aca19c	mov x8,sp
00aca1a0	add x1,sp,#0x2c
00aca1a4	str wzr,[sp, #0x2c]
00aca1a8	bl 0x00c37340
00aca1ac	ldr x8,[sp, #0x20]
00aca1b0	ldp q1,q0,[sp]
00aca1b4	add x1,sp,#0x30
00aca1b8	str x8,[sp, #0x50]
00aca1bc	stp q1,q0,[sp, #0x30]
00aca1c0	ldp x8,x0,[x19]
00aca1c4	ldr x8,[x8, #0xa8]
00aca1c8	blr x8
00aca1cc	ldr x8,[x19]
00aca1d0	ldr w9,[sp, #0x2c]
00aca1d4	cmp w0,#0x0
00aca1d8	ldr x8,[x8, #0x68]
00aca1dc	csel w22,wzr,w9,eq
00aca1e0	cbz x8,0x00aca208
00aca1e4	ldr x0,[x19, #0x8]
00aca1e8	mov x1,x21
00aca1ec	mov w2,w22
00aca1f0	mov x3,x20
00aca1f4	mov x4,x20
00aca1f8	blr x8
00aca1fc	cbz x0,0x00aca218
00aca200	mov w20,#0x1
00aca204	b 0x00aca23c
00aca208	mov w20,wzr
00aca20c	b 0x00aca23c
00aca210	mov w20,wzr
00aca214	b 0x00aca250
00aca218	mov x0,x19
00aca21c	mov x1,x21
00aca220	mov x2,x20
00aca224	mov w3,w22
00aca228	mov w4,wzr
00aca22c	mov x5,xzr
00aca230	mov x6,xzr
00aca234	bl 0x00ac9e68
00aca238	mov w20,w0
00aca23c	ldr x8,[x19]
00aca240	ldr x8,[x8, #0x80]
00aca244	cbz x8,0x00aca250
00aca248	ldr x0,[x19, #0x8]
00aca24c	blr x8
00aca250	mov w0,w20
00aca254	ldp x29,x30,[sp, #0xa0]
00aca258	ldp x20,x19,[sp, #0x90]
00aca25c	ldp x22,x21,[sp, #0x80]
00aca260	add sp,sp,#0xb0
00aca264	ret
