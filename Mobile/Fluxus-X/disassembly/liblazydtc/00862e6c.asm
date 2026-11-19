; FUN_00862e6c @ 00862e6c
00862e6c	sub sp,sp,#0x80
00862e70	stp x29,x30,[sp, #0x40]
00862e74	stp x24,x23,[sp, #0x50]
00862e78	stp x22,x21,[sp, #0x60]
00862e7c	stp x20,x19,[sp, #0x70]
00862e80	add x29,sp,#0x40
00862e84	mrs x24,tpidr_el0
00862e88	mov x20,x1
00862e8c	sub x5,x29,#0x18
00862e90	ldr x8,[x24, #0x28]
00862e94	mov x4,x20
00862e98	mov x19,x0
00862e9c	stur x8,[x29, #-0x8]
00862ea0	ldur q0,[x0, #0x94]
00862ea4	ldr x21,[x0, #0xa8]
00862ea8	stp xzr,xzr,[x29, #-0x18]
00862eac	str q0,[sp, #0x10]
00862eb0	mov x3,x21
00862eb4	ldp x1,x2,[sp, #0x10]
00862eb8	bl 0x00861fcc
00862ebc	mov x22,x0
00862ec0	mov x0,x19
00862ec4	bl 0x00858f2c
00862ec8	lsr x8,x22,#0x20
00862ecc	ldr x0,[x19, #0xe8]
00862ed0	mov w1,#0x38
00862ed4	cmp x8,#0x0
00862ed8	mov w8,#0x4
00862edc	csel w22,w8,w22,eq
00862ee0	bl 0x0084e938
00862ee4	ldp x3,x4,[x29, #-0x18]
00862ee8	add x1,sp,#0x10
00862eec	mov w2,w22
00862ef0	mov x5,x21
00862ef4	mov x23,x0
00862ef8	bl 0x0084e9bc
00862efc	ldr x0,[x20]
00862f00	add x1,sp,#0x8
00862f04	str x23,[sp, #0x8]
00862f08	bl 0x00870bec
00862f0c	ldr x8,[x20, #0x10]
00862f10	ldrb w9,[x19, #0x68]
00862f14	add x8,x8,#0x1
00862f18	cmp w9,#0x1
00862f1c	str x8,[x20, #0x10]
00862f20	b.ne 0x00862f54
00862f24	ldr x0,[x19, #0xe8]
00862f28	mov w1,#0x8
00862f2c	bl 0x0084e938
00862f30	mov w1,#0x1
00862f34	mov x20,x0
00862f38	bl 0x00851d70
00862f3c	ldr x8,[sp, #0x8]
00862f40	add x0,x19,#0x4b0
00862f44	mov x1,sp
00862f48	str x8,[sp]
00862f4c	bl 0x00860fa0
00862f50	str x20,[x0]
00862f54	ldr x8,[x24, #0x28]
00862f58	ldur x9,[x29, #-0x8]
00862f5c	cmp x8,x9
00862f60	b.ne 0x00862f7c
00862f64	ldp x20,x19,[sp, #0x70]
00862f68	ldp x22,x21,[sp, #0x60]
00862f6c	ldp x24,x23,[sp, #0x50]
00862f70	ldp x29,x30,[sp, #0x40]
00862f74	add sp,sp,#0x80
00862f78	ret
00862f7c	bl 0x00c2fec0
