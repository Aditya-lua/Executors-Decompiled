; FUN_0089c2cc @ 0089c2cc
0089c2cc	sub sp,sp,#0x110
0089c2d0	stp x29,x30,[sp, #0xe0]
0089c2d4	stp x28,x21,[sp, #0xf0]
0089c2d8	stp x20,x19,[sp, #0x100]
0089c2dc	add x29,sp,#0xe0
0089c2e0	mrs x19,tpidr_el0
0089c2e4	movi v0.2D,#0x0
0089c2e8	ldr x10,[x29, #0x40]
0089c2ec	ldr x8,[x19, #0x28]
0089c2f0	ldr x12,[x29, #0x48]
0089c2f4	adrp x20,0xc4b000
0089c2f8	add x20,x20,#0xe10
0089c2fc	add x21,sp,#0x10
0089c300	mov w11,#0x40
0089c304	stur x8,[x29, #-0x8]
0089c308	ldr x8,[x29, #0x30]
0089c30c	ldr x9,[x2, #0x28]
0089c310	stp x20,x0,[sp, #0x10]
0089c314	stp x6,x8,[sp, #0x40]
0089c318	ldr x8,[x29, #0x38]
0089c31c	stp x1,x2,[sp, #0x20]
0089c320	stp xzr,x8,[sp, #0x80]
0089c324	ldr x8,[x0, #0x28]
0089c328	str x3,[sp, #0x30]
0089c32c	orr x8,x8,x9
0089c330	ldr x9,[x7]
0089c334	strb w4,[sp, #0x38]
0089c338	cmp x8,#0x0
0089c33c	strb w5,[sp, #0x39]
0089c340	cset w8,eq
0089c344	stp xzr,xzr,[sp, #0x70]
0089c348	str xzr,[sp, #0x60]
0089c34c	str xzr,[sp, #0x50]
0089c350	str xzr,[sp, #0x58]
0089c354	stp q0,q0,[x21, #0x80]
0089c358	str q0,[x21, #0xa0]
0089c35c	strb w11,[sp, #0xc0]
0089c360	stp x10,x12,[sp, #0xc8]
0089c364	strb w8,[sp, #0x68]
0089c368	ldr x8,[x9]
0089c36c	add x1,sp,#0x10
0089c370	mov x0,x7
0089c374	blr x8
0089c378	ldr x0,[sp, #0x90]
0089c37c	add x21,x21,#0x40
0089c380	str x20,[sp, #0x10]
0089c384	cbz x0,0x0089c3b4
0089c388	bl 0x00c301d0
0089c38c	ldr x0,[sp, #0xa8]
0089c390	str xzr,[sp, #0x90]
0089c394	bl 0x00c301d0
0089c398	mov x0,xzr
0089c39c	stp xzr,xzr,[sp, #0x98]
0089c3a0	str xzr,[sp, #0xa8]
0089c3a4	bl 0x00c301d0
0089c3a8	mov w8,#0x40
0089c3ac	str xzr,[sp, #0xb0]
0089c3b0	strb w8,[sp, #0xc0]
0089c3b4	ldr x0,[sp, #0xa8]
0089c3b8	bl 0x00c301d0
0089c3bc	ldr x0,[sp, #0x70]
0089c3c0	cbz x0,0x0089c3d4
0089c3c4	ldr x8,[sp, #0x80]
0089c3c8	str x0,[sp, #0x78]
0089c3cc	sub x1,x8,x0
0089c3d0	bl 0x00c2fe80
0089c3d4	add x0,sp,#0x8
0089c3d8	str x21,[sp, #0x8]
0089c3dc	bl 0x0089cf40
0089c3e0	ldr x8,[x19, #0x28]
0089c3e4	ldur x9,[x29, #-0x8]
0089c3e8	cmp x8,x9
0089c3ec	b.ne 0x0089c42c
0089c3f0	ldp x20,x19,[sp, #0x100]
0089c3f4	ldp x28,x21,[sp, #0xf0]
0089c3f8	ldp x29,x30,[sp, #0xe0]
0089c3fc	add sp,sp,#0x110
0089c400	ret
0089c42c	bl 0x00c2fec0
