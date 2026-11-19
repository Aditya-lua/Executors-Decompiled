; ossl_dsa_sign_int @ 00a22104
00a22104	sub sp,sp,#0x50
00a22108	stp x20,x19,[sp, #0x30]
00a2210c	mov x20,x5
00a22110	mov x19,x4
00a22114	stp x23,x3,[sp, #0x10]
00a22118	stp x22,x21,[sp, #0x20]
00a2211c	stp x29,x30,[sp, #0x40]
00a22120	add x29,sp,#0x40
00a22124	cbz x3,0x00a221a0
00a22128	ldr x8,[x20, #0xb8]
00a2212c	mov w21,w2
00a22130	mov x22,x1
00a22134	cbz x8,0x00a22148
00a22138	ldr x23,[x20, #0xa0]
00a2213c	bl 0x00c3a2d0
00a22140	cmp x23,x0
00a22144	b.eq 0x00a221c0
00a22148	ldr x8,[x20, #0xa0]
00a2214c	mov x0,x22
00a22150	mov w1,w21
00a22154	mov x2,x20
00a22158	ldr x8,[x8, #0x8]
00a2215c	blr x8
00a22160	mov x20,x0
00a22164	cbz x0,0x00a221d8
00a22168	add x1,sp,#0x18
00a2216c	mov x0,x20
00a22170	bl 0x00a21f44
00a22174	str w0,[x19]
00a22178	ldr x0,[x20]
00a2217c	bl 0x00c322e0
00a22180	ldr x0,[x20, #0x8]
00a22184	bl 0x00c322e0
00a22188	adrp x1,0x2a3000
00a2218c	add x1,x1,#0xecc
00a22190	orr w2,wzr,#0x30
00a22194	mov x0,x20
00a22198	bl 0x00c32310
00a2219c	b 0x00a221ec
00a221a0	ldr x8,[x20, #0x10]
00a221a4	cbz x8,0x00a221e4
00a221a8	mov x0,sp
00a221ac	mov x1,xzr
00a221b0	stp x8,x8,[sp]
00a221b4	bl 0x00a21f44
00a221b8	bic w8,w0,w0, ASR #0x1f
00a221bc	b 0x00a221e8
00a221c0	mov x0,x22
00a221c4	mov w1,w21
00a221c8	mov x2,x20
00a221cc	bl 0x00c3a360
00a221d0	mov x20,x0
00a221d4	cbnz x0,0x00a22168
00a221d8	mov w0,wzr
00a221dc	str wzr,[x19]
00a221e0	b 0x00a221f0
00a221e4	mov w8,#0xffffffff
00a221e8	str w8,[x19]
00a221ec	mov w0,#0x1
00a221f0	ldp x29,x30,[sp, #0x40]
00a221f4	ldp x20,x19,[sp, #0x30]
00a221f8	ldp x22,x21,[sp, #0x20]
00a221fc	ldr x23,[sp, #0x10]
00a22200	add sp,sp,#0x50
00a22204	ret
