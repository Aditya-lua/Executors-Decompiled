; FUN_0086c2c8 @ 0086c2c8
0086c2c8	sub sp,sp,#0xa0
0086c2cc	stp x29,x30,[sp, #0x50]
0086c2d0	str x25,[sp, #0x60]
0086c2d4	stp x24,x23,[sp, #0x70]
0086c2d8	stp x22,x21,[sp, #0x80]
0086c2dc	stp x20,x19,[sp, #0x90]
0086c2e0	add x29,sp,#0x50
0086c2e4	mrs x25,tpidr_el0
0086c2e8	mov x20,x2
0086c2ec	mov x19,x0
0086c2f0	ldr x8,[x25, #0x28]
0086c2f4	mov x22,x1
0086c2f8	stur x8,[x29, #-0x8]
0086c2fc	ldrb w8,[x0, #0x68]
0086c300	cmp w8,#0x1
0086c304	b.ne 0x0086c334
0086c308	ldr x0,[x19, #0xe8]
0086c30c	mov w1,#0x38
0086c310	bl 0x0084e938
0086c314	mov x8,#-0x1
0086c318	add x1,sp,#0x18
0086c31c	mov x21,x0
0086c320	stp x8,x8,[sp, #0x18]
0086c324	stp xzr,xzr,[sp, #0x28]
0086c328	stp x8,x8,[sp, #0x38]
0086c32c	bl 0x00851ed0
0086c330	b 0x0086c338
0086c334	mov x21,xzr
0086c338	add x8,x21,#0x8
0086c33c	cmp x21,#0x0
0086c340	add x2,sp,#0x18
0086c344	csel x1,xzr,x8,eq
0086c348	mov x0,x19
0086c34c	stp xzr,xzr,[sp, #0x18]
0086c350	bl 0x0086c3dc
0086c354	mov x23,x0
0086c358	ldr x8,[sp, #0x20]
0086c35c	ldr x0,[x19, #0xe8]
0086c360	mov x24,x1
0086c364	mov w1,#0x38
0086c368	stp x22,x8,[sp, #0x8]
0086c36c	bl 0x0084e938
0086c370	add x1,sp,#0x8
0086c374	mov x2,x20
0086c378	mov x3,x23
0086c37c	mov x4,x24
0086c380	mov x22,x0
0086c384	bl 0x0084f6c8
0086c388	ldrb w8,[x19, #0x68]
0086c38c	cmp w8,#0x1
0086c390	b.ne 0x0086c3a8
0086c394	add x0,x19,#0x4b0
0086c398	add x1,sp,#0x8
0086c39c	str x22,[sp, #0x8]
0086c3a0	bl 0x00860fa0
0086c3a4	str x21,[x0]
0086c3a8	ldr x8,[x25, #0x28]
0086c3ac	ldur x9,[x29, #-0x8]
0086c3b0	cmp x8,x9
0086c3b4	b.ne 0x0086c3d8
0086c3b8	mov x0,x22
0086c3bc	ldp x20,x19,[sp, #0x90]
0086c3c0	ldr x25,[sp, #0x60]
0086c3c4	ldp x22,x21,[sp, #0x80]
0086c3c8	ldp x24,x23,[sp, #0x70]
0086c3cc	ldp x29,x30,[sp, #0x50]
0086c3d0	add sp,sp,#0xa0
0086c3d4	ret
0086c3d8	bl 0x00c2fec0
