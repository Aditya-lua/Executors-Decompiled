; FUN_00932998 @ 00932998
00932998	sub sp,sp,#0x50
0093299c	stp x22,x21,[sp, #0x20]
009329a0	stp x20,x19,[sp, #0x30]
009329a4	stp x29,x30,[sp, #0x40]
009329a8	add x29,sp,#0x40
009329ac	mrs x21,tpidr_el0
009329b0	ldr x8,[x21, #0x28]
009329b4	adrp x22,0xcc4000
009329b8	add x22,x22,#0x678
009329bc	mov x19,x0
009329c0	str x8,[sp, #0x18]
009329c4	stp xzr,xzr,[sp, #0x8]
009329c8	ldr x8,[x22]
009329cc	ldr x0,[x0, #0xc8]
009329d0	mov x20,x1
009329d4	blr x8
009329d8	str xzr,[x19, #0xc8]
009329dc	ldr x8,[x22]
009329e0	ldr x0,[x19, #0xc0]
009329e4	blr x8
009329e8	mov x0,x20
009329ec	str xzr,[x19, #0xc0]
009329f0	bl 0x00935190
009329f4	ldrb w8,[x19, #0xdb]
009329f8	tbz w8,#0x1,0x00932a04
009329fc	add x0,x19,#0x68
00932a00	bl 0x00924348
00932a04	mov x0,x20
00932a08	bl 0x00912a70
00932a0c	mov x8,#-0x1
00932a10	stp xzr,xzr,[x19, #0x10]
00932a14	ldur w9,[x19, #0xd9]
00932a18	stp x8,x8,[x19]
00932a1c	ldur q0,[sp, #0x8]
00932a20	mov w8,#0xffff8042
00932a24	and w8,w9,w8
00932a28	add x10,x20,#0xa82
00932a2c	str wzr,[x19, #0x4c]
00932a30	str xzr,[x19, #0x50]
00932a34	strb wzr,[x19, #0xd8]
00932a38	stp xzr,xzr,[x19, #0x38]
00932a3c	str xzr,[x19, #0x30]
00932a40	stp xzr,xzr,[x19, #0xb8]
00932a44	str xzr,[x19, #0xb0]
00932a48	stur w8,[x19, #0xd9]
00932a4c	str q0,[x19, #0x20]
00932a50	ldr w8,[x10]
00932a54	mov w10,#0x42
00932a58	movk w10,#0xfffa, LSL #16
00932a5c	and w9,w9,w10
00932a60	lsr w8,w8,#0xc
00932a64	and w8,w8,#0x8000
00932a68	orr w8,w8,w9
00932a6c	stur w8,[x19, #0xd9]
00932a70	ldr x8,[x21, #0x28]
00932a74	ldr x9,[sp, #0x18]
00932a78	cmp x8,x9
00932a7c	b.ne 0x00932a94
00932a80	ldp x29,x30,[sp, #0x40]
00932a84	ldp x20,x19,[sp, #0x30]
00932a88	ldp x22,x21,[sp, #0x20]
00932a8c	add sp,sp,#0x50
00932a90	ret
00932a94	bl 0x00c2fec0
