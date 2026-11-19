; FUN_0085c30c @ 0085c30c
0085c30c	sub sp,sp,#0x70
0085c310	stp x29,x30,[sp, #0x40]
0085c314	str x21,[sp, #0x50]
0085c318	stp x20,x19,[sp, #0x60]
0085c31c	add x29,sp,#0x40
0085c320	mrs x21,tpidr_el0
0085c324	mov x19,x0
0085c328	ldr x8,[x21, #0x28]
0085c32c	stur x8,[x29, #-0x8]
0085c330	ldur q0,[x0, #0x94]
0085c334	str q0,[sp, #0x20]
0085c338	bl 0x00858f2c
0085c33c	ldr x8,[x19, #0x160]
0085c340	ldur w8,[x8, #-0x4]
0085c344	cbz w8,0x0085c364
0085c348	ldr x0,[x19, #0xe8]
0085c34c	mov w1,#0x20
0085c350	bl 0x0084e938
0085c354	add x1,sp,#0x20
0085c358	mov x19,x0
0085c35c	bl 0x0084fc78
0085c360	b 0x0085c3b8
0085c364	ldr x0,[x19, #0xe8]
0085c368	mov w1,#0x20
0085c36c	stp xzr,xzr,[sp, #0x10]
0085c370	bl 0x0084e938
0085c374	add x1,sp,#0x20
0085c378	mov x20,x0
0085c37c	bl 0x0084fc78
0085c380	ldr x0,[x19, #0xe8]
0085c384	mov w1,#0x8
0085c388	bl 0x0084e938
0085c38c	mov w8,#0x1
0085c390	str x20,[x0]
0085c394	adrp x4,0x29d000
0085c398	add x4,x4,#0x417
0085c39c	stp x0,x8,[sp]
0085c3a0	add x1,sp,#0x20
0085c3a4	add x2,sp,#0x10
0085c3a8	mov x3,sp
0085c3ac	mov x0,x19
0085c3b0	bl 0x0085e984
0085c3b4	mov x19,x0
0085c3b8	ldr x8,[x21, #0x28]
0085c3bc	ldur x9,[x29, #-0x8]
0085c3c0	cmp x8,x9
0085c3c4	b.ne 0x0085c3e0
0085c3c8	mov x0,x19
0085c3cc	ldp x20,x19,[sp, #0x60]
0085c3d0	ldr x21,[sp, #0x50]
0085c3d4	ldp x29,x30,[sp, #0x40]
0085c3d8	add sp,sp,#0x70
0085c3dc	ret
0085c3e0	bl 0x00c2fec0
