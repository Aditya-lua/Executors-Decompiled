; FUN_00c0e1e0 @ 00c0e1e0
00c0e1e0	paciasp
00c0e1e4	sub sp,sp,#0x80
00c0e1e8	stp x29,x30,[sp, #0x60]
00c0e1ec	stp x20,x19,[sp, #0x70]
00c0e1f0	add x29,sp,#0x60
00c0e1f4	ldr x8,[x0, #0x8]
00c0e1f8	ldr x9,[x1, #0x8]
00c0e1fc	cmp x8,x9
00c0e200	b.eq 0x00c0e294
00c0e204	adrp x8,0xcb5000
00c0e208	mov x19,x2
00c0e20c	adrp x2,0xcb5000
00c0e210	ldr x8,[x8, #0xeb8]
00c0e214	ldr x2,[x2, #0xec0]
00c0e218	mov x20,x0
00c0e21c	mov x0,x1
00c0e220	mov x3,xzr
00c0e224	mov x1,x8
00c0e228	bl 0x00c44820
00c0e22c	cbz x0,0x00c0e298
00c0e230	ldr x2,[x19]
00c0e234	cbz x2,0x00c0e2ac
00c0e238	movi v0.2D,#0x0
00c0e23c	mov x8,#-0x1
00c0e240	str xzr,[sp, #0x58]
00c0e244	stp x20,x8,[sp, #0x18]
00c0e248	mov w8,#0x1
00c0e24c	add x1,sp,#0x8
00c0e250	strb w8,[sp, #0x57]
00c0e254	mov w3,#0x1
00c0e258	stp x0,xzr,[sp, #0x8]
00c0e25c	stur q0,[sp, #0x47]
00c0e260	stur q0,[sp, #0x28]
00c0e264	stur q0,[sp, #0x38]
00c0e268	str w8,[sp, #0x50]
00c0e26c	ldr x8,[x0]
00c0e270	ldr x8,[x8, #0x38]
00c0e274	blr x8
00c0e278	ldr w8,[sp, #0x38]
00c0e27c	cmp w8,#0x1
00c0e280	cset w0,eq
00c0e284	b.ne 0x00c0e298
00c0e288	ldr x8,[sp, #0x28]
00c0e28c	str x8,[x19]
00c0e290	b 0x00c0e298
00c0e294	mov w0,#0x1
00c0e298	ldp x20,x19,[sp, #0x70]
00c0e29c	ldp x29,x30,[sp, #0x60]
00c0e2a0	add sp,sp,#0x80
00c0e2a4	autiasp
00c0e2a8	ret
00c0e2ac	adrp x0,0x29f000
00c0e2b0	add x0,x0,#0x357
00c0e2b4	adrp x1,0x2a9000
00c0e2b8	add x1,x1,#0xa0
00c0e2bc	adrp x3,0x2ae000
00c0e2c0	add x3,x3,#0xe5c
00c0e2c4	mov w2,#0x1e7
00c0e2c8	bl 0x00c0de94
