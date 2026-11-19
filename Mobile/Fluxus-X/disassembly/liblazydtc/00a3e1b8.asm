; ossl_ecx_key_new @ 00a3e1b8
00a3e1b8	str x23,[sp, #-0x40]!
00a3e1bc	stp x22,x21,[sp, #0x10]
00a3e1c0	mov w21,w1
00a3e1c4	adrp x1,0x2b9000
00a3e1c8	mov w22,w2
00a3e1cc	mov x23,x0
00a3e1d0	add x1,x1,#0xcc5
00a3e1d4	orr w0,wzr,#0x70
00a3e1d8	mov w2,#0x11
00a3e1dc	stp x20,x19,[sp, #0x20]
00a3e1e0	stp x29,x30,[sp, #0x30]
00a3e1e4	add x29,sp,#0x30
00a3e1e8	mov x20,x3
00a3e1ec	bl 0x00c34250
00a3e1f0	mov x19,x0
00a3e1f4	cbz x0,0x00a3e2a4
00a3e1f8	ldrb w8,[x19, #0x10]
00a3e1fc	cmp w21,#0x3
00a3e200	str x23,[x19]
00a3e204	bfxil w8,w22,#0x0,#0x1
00a3e208	strb w8,[x19, #0x10]
00a3e20c	b.hi 0x00a3e220
00a3e210	adrp x8,0x364000
00a3e214	add x8,x8,#0xeb0
00a3e218	ldr x8,[x8, w21, SXTW #0x3]
00a3e21c	str x8,[x19, #0x58]
00a3e220	add x8,x19,#0x64
00a3e224	mov w9,#0x1
00a3e228	str w21,[x19, #0x60]
00a3e22c	stlr w9,[x8]
00a3e230	cbz x20,0x00a3e250
00a3e234	adrp x1,0x2b9000
00a3e238	add x1,x1,#0xcc5
00a3e23c	mov w2,#0x2a
00a3e240	mov x0,x20
00a3e244	bl 0x00c34600
00a3e248	str x0,[x19, #0x8]
00a3e24c	cbz x0,0x00a3e25c
00a3e250	bl 0x00c34d50
00a3e254	str x0,[x19, #0x68]
00a3e258	cbnz x0,0x00a3e2a4
00a3e25c	bl 0x00c342a0
00a3e260	adrp x20,0x2b9000
00a3e264	add x20,x20,#0xcc5
00a3e268	adrp x2,0x2bb000
00a3e26c	add x2,x2,#0xb74
00a3e270	mov w1,#0x34
00a3e274	mov x0,x20
00a3e278	bl 0x00c342b0
00a3e27c	mov w1,#0x100
00a3e280	mov w0,#0x10
00a3e284	movk w1,#0xc, LSL #16
00a3e288	mov x2,xzr
00a3e28c	bl 0x00c342c0
00a3e290	mov w2,#0x35
00a3e294	mov x0,x19
00a3e298	mov x1,x20
00a3e29c	bl 0x00c32310
00a3e2a0	mov x19,xzr
00a3e2a4	mov x0,x19
00a3e2a8	ldp x29,x30,[sp, #0x30]
00a3e2ac	ldp x20,x19,[sp, #0x20]
00a3e2b0	ldp x22,x21,[sp, #0x10]
00a3e2b4	ldr x23,[sp], #0x40
00a3e2b8	ret
