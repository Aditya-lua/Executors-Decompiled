; FUN_0085b258 @ 0085b258
0085b258	sub sp,sp,#0x80
0085b25c	stp x29,x30,[sp, #0x20]
0085b260	stp x28,x27,[sp, #0x30]
0085b264	stp x26,x25,[sp, #0x40]
0085b268	stp x24,x23,[sp, #0x50]
0085b26c	stp x22,x21,[sp, #0x60]
0085b270	stp x20,x19,[sp, #0x70]
0085b274	add x29,sp,#0x20
0085b278	mrs x25,tpidr_el0
0085b27c	mov x19,x0
0085b280	ldr x8,[x25, #0x28]
0085b284	stur x8,[x29, #-0x8]
0085b288	ldur x24,[x0, #0x94]
0085b28c	ldr w21,[x0, #0x90]
0085b290	bl 0x00858f2c
0085b294	ldr x8,[x19, #0x160]
0085b298	ldp x11,x10,[x19, #0x1b8]
0085b29c	mov x0,x19
0085b2a0	ldur w9,[x8, #-0x4]
0085b2a4	sub x23,x10,x11
0085b2a8	add w9,w9,#0x1
0085b2ac	stur w9,[x8, #-0x4]
0085b2b0	bl 0x00859498
0085b2b4	ldr x8,[x19, #0x160]
0085b2b8	mov x20,x0
0085b2bc	add x2,sp,#0x8
0085b2c0	mov x0,x19
0085b2c4	mov w1,#0x136
0085b2c8	ldur w9,[x8, #-0x4]
0085b2cc	sub w9,w9,#0x1
0085b2d0	stur w9,[x8, #-0x4]
0085b2d4	str w21,[sp, #0x8]
0085b2d8	stur x24,[sp, #0xc]
0085b2dc	bl 0x00861094
0085b2e0	ands w8,w0,#0x1
0085b2e4	mov w22,w0
0085b2e8	mov x0,x19
0085b2ec	strb w8,[x20, #0x30]
0085b2f0	mov w1,wzr
0085b2f4	ldr x8,[x19, #0xb0]
0085b2f8	csinv x21,x8,xzr,ne
0085b2fc	bl 0x0086060c
0085b300	ldp x9,x8,[x19, #0x1b8]
0085b304	ubfx x26,x23,#0x3,#0x20
0085b308	mov x23,x0
0085b30c	sub x8,x8,x9
0085b310	asr x8,x8,#0x3
0085b314	cmp x8,x26
0085b318	b.ls 0x0085b354
0085b31c	ldr x9,[x19, #0x1b8]
0085b320	add x0,x19,#0x180
0085b324	sub x28,x8,#0x1
0085b328	add x9,x9,x8, LSL #0x3
0085b32c	ldur x1,[x9, #-0x8]
0085b330	ldr x27,[x1, #0x18]
0085b334	bl 0x0086e18c
0085b338	cmp x28,x26
0085b33c	mov x8,x28
0085b340	str x27,[x0]
0085b344	b.hi 0x0085b31c
0085b348	ldp x9,x8,[x19, #0x1b8]
0085b34c	sub x8,x8,x9
0085b350	asr x8,x8,#0x3
0085b354	subs x1,x26,x8
0085b358	b.ls 0x0085b368
0085b35c	add x0,x19,#0x1b8
0085b360	bl 0x00870174
0085b364	b 0x0085b374
0085b368	b.cs 0x0085b374
0085b36c	add x8,x9,x26, LSL #0x3
0085b370	str x8,[x19, #0x1c0]
0085b374	ldur x8,[x23, #0x14]
0085b378	ldr x0,[x19, #0xe8]
0085b37c	mov w1,#0x38
0085b380	stp x24,x8,[sp, #0x8]
0085b384	bl 0x0084e938
0085b388	add x1,sp,#0x8
0085b38c	and w4,w22,#0x1
0085b390	mov x2,x23
0085b394	mov x3,x20
0085b398	mov x24,x0
0085b39c	bl 0x0084fbd4
0085b3a0	ldrb w8,[x19, #0x68]
0085b3a4	cmp w8,#0x1
0085b3a8	b.ne 0x0085b3d8
0085b3ac	ldr x0,[x19, #0xe8]
0085b3b0	mov w1,#0xc
0085b3b4	bl 0x0084e938
0085b3b8	mov x1,x21
0085b3bc	mov x20,x0
0085b3c0	bl 0x00851f0c
0085b3c4	add x0,x19,#0x4b0
0085b3c8	add x1,sp,#0x8
0085b3cc	str x24,[sp, #0x8]
0085b3d0	bl 0x00860fa0
0085b3d4	str x20,[x0]
0085b3d8	ldr x8,[x25, #0x28]
0085b3dc	ldur x9,[x29, #-0x8]
0085b3e0	cmp x8,x9
0085b3e4	b.ne 0x0085b40c
0085b3e8	mov x0,x24
0085b3ec	ldp x20,x19,[sp, #0x70]
0085b3f0	ldp x22,x21,[sp, #0x60]
0085b3f4	ldp x24,x23,[sp, #0x50]
0085b3f8	ldp x26,x25,[sp, #0x40]
0085b3fc	ldp x28,x27,[sp, #0x30]
0085b400	ldp x29,x30,[sp, #0x20]
0085b404	add sp,sp,#0x80
0085b408	ret
0085b40c	bl 0x00c2fec0
