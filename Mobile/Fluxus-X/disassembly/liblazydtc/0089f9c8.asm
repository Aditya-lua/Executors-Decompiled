; FUN_0089f9c8 @ 0089f9c8
0089f9c8	sub sp,sp,#0x80
0089f9cc	stp x29,x30,[sp, #0x40]
0089f9d0	stp x24,x23,[sp, #0x50]
0089f9d4	stp x22,x21,[sp, #0x60]
0089f9d8	stp x20,x19,[sp, #0x70]
0089f9dc	add x29,sp,#0x40
0089f9e0	mrs x22,tpidr_el0
0089f9e4	mov x11,#0x6db7
0089f9e8	mov x9,#0x1
0089f9ec	ldr x8,[x22, #0x28]
0089f9f0	movk x11,#0xb6db, LSL #16
0089f9f4	movk x11,#0xdb6d, LSL #32
0089f9f8	stur x8,[x29, #-0x8]
0089f9fc	movk x11,#0x6db6, LSL #48
0089fa00	ldp x10,x8,[x0]
0089fa04	sub x24,x8,x10
0089fa08	asr x8,x24,#0x3
0089fa0c	madd x9,x8,x11,x9
0089fa10	mov x8,#0x2492
0089fa14	movk x8,#0x9249, LSL #16
0089fa18	movk x8,#0x4924, LSL #32
0089fa1c	movk x8,#0x492, LSL #48
0089fa20	cmp x9,x8
0089fa24	b.hi 0x0089fb54
0089fa28	mov x20,x0
0089fa2c	mov x19,x0
0089fa30	mov x21,x1
0089fa34	ldr x12,[x20, #0x10]!
0089fa38	str x20,[sp, #0x30]
0089fa3c	sub x10,x12,x10
0089fa40	mov x12,#0x9249
0089fa44	asr x10,x10,#0x3
0089fa48	movk x12,#0x4924, LSL #16
0089fa4c	movk x12,#0x2492, LSL #32
0089fa50	mul x10,x10,x11
0089fa54	movk x12,#0x249, LSL #48
0089fa58	lsl x11,x10,#0x1
0089fa5c	cmp x11,x9
0089fa60	csel x9,x11,x9,hi
0089fa64	cmp x10,x12
0089fa68	csel x23,x9,x8,cc
0089fa6c	cbz x23,0x0089fa88
0089fa70	cmp x23,x8
0089fa74	b.hi 0x0089fb68
0089fa78	lsl x8,x23,#0x6
0089fa7c	sub x0,x8,x23, LSL #0x3
0089fa80	bl 0x00c2fed0
0089fa84	b 0x0089fa8c
0089fa88	mov x0,xzr
0089fa8c	ldr x9,[x21]
0089fa90	add x8,x0,x24
0089fa94	ldur q0,[x21, #0x8]
0089fa98	ldr x10,[x21, #0x18]
0089fa9c	stp xzr,xzr,[x21, #0x10]
0089faa0	str x9,[x8]
0089faa4	ldrb w9,[x21, #0x30]
0089faa8	stur q0,[x8, #0x8]
0089faac	ldr q0,[x21, #0x20]
0089fab0	strb w9,[x8, #0x30]
0089fab4	mov w9,#0x38
0089fab8	stp xzr,xzr,[x21]
0089fabc	nop
0089fac0	madd x9,x23,x9,x0
0089fac4	stp xzr,xzr,[x21, #0x20]
0089fac8	ldp x1,x2,[x19]
0089facc	str x10,[x8, #0x18]
0089fad0	mov w10,#0x40
0089fad4	stp x0,x8,[sp, #0x10]
0089fad8	strb w10,[x21, #0x30]
0089fadc	add x10,x8,#0x38
0089fae0	sub x11,x1,x2
0089fae4	str q0,[x8, #0x20]
0089fae8	add x21,x8,x11
0089faec	stp x10,x9,[sp, #0x20]
0089faf0	mov x0,x20
0089faf4	mov x3,x21
0089faf8	bl 0x0089fc60
0089fafc	ldr q0,[sp, #0x20]
0089fb00	ldr x8,[x19]
0089fb04	add x0,sp,#0x10
0089fb08	ldr x9,[x19, #0x10]
0089fb0c	str x21,[x19]
0089fb10	str q0,[sp]
0089fb14	stur q0,[x19, #0x8]
0089fb18	stp x8,x9,[sp, #0x20]
0089fb1c	stp x8,x8,[sp, #0x10]
0089fb20	bl 0x0089fba4
0089fb24	ldr x8,[x22, #0x28]
0089fb28	ldur x9,[x29, #-0x8]
0089fb2c	cmp x8,x9
0089fb30	b.ne 0x0089fba0
0089fb34	ldr q0,[sp]
0089fb38	fmov x0,d0
0089fb3c	ldp x20,x19,[sp, #0x70]
0089fb40	ldp x22,x21,[sp, #0x60]
0089fb44	ldp x24,x23,[sp, #0x50]
0089fb48	ldp x29,x30,[sp, #0x40]
0089fb4c	add sp,sp,#0x80
0089fb50	ret
0089fb54	ldr x8,[x22, #0x28]
0089fb58	ldur x9,[x29, #-0x8]
0089fb5c	cmp x8,x9
0089fb60	b.ne 0x0089fba0
0089fb64	bl 0x0089fc4c
0089fb68	ldr x8,[x22, #0x28]
0089fb6c	ldur x9,[x29, #-0x8]
0089fb70	cmp x8,x9
0089fb74	b.ne 0x0089fba0
0089fb78	bl 0x007fe1b8
0089fba0	bl 0x00c2fec0
