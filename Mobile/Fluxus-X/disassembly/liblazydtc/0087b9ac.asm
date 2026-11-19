; FUN_0087b9ac @ 0087b9ac
0087b9ac	stp x29,x30,[sp, #-0x30]!
0087b9b0	str x21,[sp, #0x10]
0087b9b4	stp x20,x19,[sp, #0x20]
0087b9b8	mov x29,sp
0087b9bc	ldr x21,[x0, #0x20]
0087b9c0	mov x19,x0
0087b9c4	mov x20,x1
0087b9c8	bl 0x0087337c
0087b9cc	mov x8,#0x7c15
0087b9d0	ldrb w9,[x19, #0x30]
0087b9d4	ldr x10,[x19, #0x18]
0087b9d8	movk x8,#0x7f4a, LSL #16
0087b9dc	movk x8,#0x79b9, LSL #32
0087b9e0	movk x8,#0x9e37, LSL #48
0087b9e4	mul x8,x0,x8
0087b9e8	lsr x8,x8,x9
0087b9ec	mov w9,#0x1
0087b9f0	lsr x17,x8,#0x6
0087b9f4	lsl x3,x9,x8
0087b9f8	ldr x9,[x19]
0087b9fc	ldr x2,[x10, x17, LSL #0x3]
0087ba00	tst x3,x2
0087ba04	b.eq 0x0087ba84
0087ba08	ldp x12,x13,[x20, #0x8]
0087ba0c	sub x16,x21,#0x1
0087ba10	ldp x14,x15,[x20, #0x18]
0087ba14	mov w0,#0x30
0087ba18	ldr w11,[x20]
0087ba1c	mov w1,#0x1
0087ba20	b 0x0087ba40
0087ba24	add x8,x8,#0x1
0087ba28	and x8,x8,x16
0087ba2c	lsr x17,x8,#0x6
0087ba30	lsl x3,x1,x8
0087ba34	ldr x2,[x10, x17, LSL #0x3]
0087ba38	tst x2,x3
0087ba3c	b.eq 0x0087ba84
0087ba40	madd x17,x8,x0,x9
0087ba44	ldr w2,[x17]
0087ba48	cmp w2,w11
0087ba4c	b.ne 0x0087ba24
0087ba50	ldr x2,[x17, #0x8]
0087ba54	cmp x2,x12
0087ba58	b.ne 0x0087ba24
0087ba5c	ldr x2,[x17, #0x10]
0087ba60	cmp x2,x13
0087ba64	b.ne 0x0087ba24
0087ba68	ldr x2,[x17, #0x18]
0087ba6c	cmp x2,x14
0087ba70	b.ne 0x0087ba24
0087ba74	ldr x17,[x17, #0x20]
0087ba78	cmp x17,x15
0087ba7c	b.ne 0x0087ba24
0087ba80	b 0x0087bab8
0087ba84	mov w11,#0x30
0087ba88	madd x9,x8,x11,x9
0087ba8c	orr x11,x2,x3
0087ba90	str x11,[x10, x17, LSL #0x3]
0087ba94	ldp q1,q0,[x20]
0087ba98	ldr x10,[x20, #0x20]
0087ba9c	str x10,[x9, #0x20]
0087baa0	stp q1,q0,[x9]
0087baa4	ldr x10,[x19, #0x28]
0087baa8	str wzr,[x9, #0x28]
0087baac	ldr x9,[x19]
0087bab0	add x10,x10,#0x1
0087bab4	str x10,[x19, #0x28]
0087bab8	mov w10,#0x30
0087babc	madd x0,x8,x10,x9
0087bac0	ldp x20,x19,[sp, #0x20]
0087bac4	ldr x21,[sp, #0x10]
0087bac8	ldp x29,x30,[sp], #0x30
0087bacc	ret
