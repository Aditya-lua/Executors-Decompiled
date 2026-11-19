; FUN_00879e34 @ 00879e34
00879e34	sub sp,sp,#0x70
00879e38	stp x29,x30,[sp, #0x30]
00879e3c	str x23,[sp, #0x40]
00879e40	stp x22,x21,[sp, #0x50]
00879e44	stp x20,x19,[sp, #0x60]
00879e48	add x29,sp,#0x30
00879e4c	mrs x21,tpidr_el0
00879e50	mov x11,#0x6db7
00879e54	mov x9,#0x1
00879e58	ldr x8,[x21, #0x28]
00879e5c	movk x11,#0xb6db, LSL #16
00879e60	movk x11,#0xdb6d, LSL #32
00879e64	stur x8,[x29, #-0x8]
00879e68	movk x11,#0x6db6, LSL #48
00879e6c	ldp x10,x8,[x0]
00879e70	sub x23,x8,x10
00879e74	asr x8,x23,#0x3
00879e78	madd x9,x8,x11,x9
00879e7c	mov x8,#0x2492
00879e80	movk x8,#0x9249, LSL #16
00879e84	movk x8,#0x4924, LSL #32
00879e88	movk x8,#0x492, LSL #48
00879e8c	cmp x9,x8
00879e90	b.hi 0x00879ff0
00879e94	mov x12,x0
00879e98	mov x19,x0
00879e9c	mov x20,x1
00879ea0	ldr x13,[x12, #0x10]!
00879ea4	str x12,[sp, #0x20]
00879ea8	sub x10,x13,x10
00879eac	mov x13,#0x9249
00879eb0	asr x10,x10,#0x3
00879eb4	movk x13,#0x4924, LSL #16
00879eb8	movk x13,#0x2492, LSL #32
00879ebc	mul x10,x10,x11
00879ec0	movk x13,#0x249, LSL #48
00879ec4	lsl x11,x10,#0x1
00879ec8	cmp x11,x9
00879ecc	csel x9,x11,x9,hi
00879ed0	cmp x10,x13
00879ed4	csel x22,x9,x8,cc
00879ed8	cbz x22,0x00879ef4
00879edc	cmp x22,x8
00879ee0	b.hi 0x0087a004
00879ee4	lsl x8,x22,#0x6
00879ee8	sub x0,x8,x22, LSL #0x3
00879eec	bl 0x00c2fed0
00879ef0	b 0x00879ef8
00879ef4	mov x0,xzr
00879ef8	ldrh w10,[x20, #0x4]
00879efc	add x8,x0,x23
00879f00	ldr w9,[x20]
00879f04	ldur q0,[x20, #0x8]
00879f08	stp x0,x8,[sp]
00879f0c	strh w10,[x8, #0x4]
00879f10	mov w10,#0x38
00879f14	str w9,[x8]
00879f18	ldr x9,[x20, #0x18]
00879f1c	nop
00879f20	madd x10,x22,x10,x0
00879f24	stur q0,[x8, #0x8]
00879f28	ldr q0,[x20, #0x20]
00879f2c	str x9,[x8, #0x18]
00879f30	ldr x9,[x20, #0x30]
00879f34	str q0,[x8, #0x20]
00879f38	str x9,[x8, #0x30]
00879f3c	add x8,x8,#0x38
00879f40	stp xzr,xzr,[x20, #0x8]
00879f44	stp xzr,xzr,[x20, #0x28]
00879f48	stp xzr,xzr,[x20, #0x18]
00879f4c	stp x8,x10,[sp, #0x10]
00879f50	mov x1,sp
00879f54	mov x0,x19
00879f58	bl 0x0087a040
00879f5c	ldp x20,x22,[sp, #0x8]
00879f60	ldr x19,[x19, #0x8]
00879f64	b 0x00879f6c
00879f68	ldr x22,[sp, #0x10]
00879f6c	cmp x20,x22
00879f70	b.eq 0x00879fb0
00879f74	ldur x0,[x22, #-0x18]
00879f78	sub x8,x22,#0x38
00879f7c	str x8,[sp, #0x10]
00879f80	cbz x0,0x00879f94
00879f84	ldur x8,[x22, #-0x8]
00879f88	stur x0,[x22, #-0x10]
00879f8c	sub x1,x8,x0
00879f90	bl 0x00c2fe80
00879f94	ldur x0,[x22, #-0x30]
00879f98	cbz x0,0x00879f68
00879f9c	ldur x8,[x22, #-0x20]
00879fa0	stur x0,[x22, #-0x28]
00879fa4	sub x1,x8,x0
00879fa8	bl 0x00c2fe80
00879fac	b 0x00879f68
00879fb0	ldr x0,[sp]
00879fb4	cbz x0,0x00879fc4
00879fb8	ldr x8,[sp, #0x18]
00879fbc	sub x1,x8,x0
00879fc0	bl 0x00c2fe80
00879fc4	ldr x8,[x21, #0x28]
00879fc8	ldur x9,[x29, #-0x8]
00879fcc	cmp x8,x9
00879fd0	b.ne 0x0087a03c
00879fd4	mov x0,x19
00879fd8	ldp x20,x19,[sp, #0x60]
00879fdc	ldr x23,[sp, #0x40]
00879fe0	ldp x22,x21,[sp, #0x50]
00879fe4	ldp x29,x30,[sp, #0x30]
00879fe8	add sp,sp,#0x70
00879fec	ret
00879ff0	ldr x8,[x21, #0x28]
00879ff4	ldur x9,[x29, #-0x8]
00879ff8	cmp x8,x9
00879ffc	b.ne 0x0087a03c
0087a000	bl 0x0087a200
0087a004	ldr x8,[x21, #0x28]
0087a008	ldur x9,[x29, #-0x8]
0087a00c	cmp x8,x9
0087a010	b.ne 0x0087a03c
0087a014	bl 0x007fe1b8
0087a03c	bl 0x00c2fec0
