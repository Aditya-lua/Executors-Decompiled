; FUN_0086b9c0 @ 0086b9c0
0086b9c0	sub sp,sp,#0x90
0086b9c4	stp x29,x30,[sp, #0x50]
0086b9c8	stp x24,x23,[sp, #0x60]
0086b9cc	stp x22,x21,[sp, #0x70]
0086b9d0	stp x20,x19,[sp, #0x80]
0086b9d4	add x29,sp,#0x50
0086b9d8	mrs x24,tpidr_el0
0086b9dc	mov x22,x0
0086b9e0	mov x20,x2
0086b9e4	ldr x8,[x24, #0x28]
0086b9e8	mov x21,x1
0086b9ec	mov x19,x0
0086b9f0	stur x8,[x29, #-0x8]
0086b9f4	ldr x23,[x22, #0x94]!
0086b9f8	stur x23,[x29, #-0x10]
0086b9fc	bl 0x00858f2c
0086ba00	ldr w8,[x19, #0x90]
0086ba04	cmp w8,#0x119
0086ba08	b.ne 0x0086ba28
0086ba0c	ldr q0,[x22]
0086ba10	ldr x23,[x19, #0xa8]
0086ba14	mov x0,x19
0086ba18	stur q0,[sp, #0x30]
0086ba1c	bl 0x00858f2c
0086ba20	str x23,[sp, #0x28]
0086ba24	b 0x0086ba84
0086ba28	adrp x1,0x2b8000
0086ba2c	add x1,x1,#0xe31
0086ba30	mov x0,x19
0086ba34	bl 0x0086e040
0086ba38	ldr w8,[x19, #0x90]
0086ba3c	sub w8,w8,#0x123
0086ba40	cmp w8,#0x14
0086ba44	b.hi 0x0086ba74
0086ba48	ldr w8,[x19, #0x94]
0086ba4c	cmp w8,w23
0086ba50	b.ne 0x0086ba74
0086ba54	ldr x23,[x19, #0xa8]
0086ba58	ldr q0,[x22]
0086ba5c	add x8,sp,#0x28
0086ba60	mov x0,x19
0086ba64	str x23,[sp, #0x28]
0086ba68	stur q0,[x8, #0x8]
0086ba6c	bl 0x00858f2c
0086ba70	b 0x0086ba84
0086ba74	ldr x23,[x19, #0x138]
0086ba78	ldur x8,[x19, #0x94]
0086ba7c	stp x23,x8,[sp, #0x28]
0086ba80	str x8,[sp, #0x38]
0086ba84	ldrb w8,[x19, #0x178]
0086ba88	ldr x9,[sp, #0x38]
0086ba8c	mov w22,wzr
0086ba90	ldr x0,[x19, #0xe8]
0086ba94	cmp w8,#0x1
0086ba98	stp x21,x9,[sp, #0x8]
0086ba9c	add x21,sp,#0x28
0086baa0	b.ne 0x0086bac8
0086baa4	cbz x23,0x0086bac8
0086baa8	ldrb w8,[x23]
0086baac	cmp w8,#0x5f
0086bab0	b.ne 0x0086bac4
0086bab4	ldrb w8,[x23, #0x1]
0086bab8	cmp w8,#0x5f
0086babc	cset w22,ne
0086bac0	b 0x0086bac8
0086bac4	mov w22,wzr
0086bac8	mov w1,#0x50
0086bacc	bl 0x0084e938
0086bad0	add x1,sp,#0x8
0086bad4	add x3,sp,#0x28
0086bad8	add x4,x21,#0x8
0086badc	sub x5,x29,#0x10
0086bae0	mov x2,x20
0086bae4	mov w6,#0x3a
0086bae8	mov w7,w22
0086baec	mov x23,x0
0086baf0	bl 0x0084eea4
0086baf4	ldrb w8,[x19, #0x68]
0086baf8	cmp w8,#0x1
0086bafc	b.ne 0x0086bb24
0086bb00	ldr x0,[x19, #0xe8]
0086bb04	mov w1,#0x30
0086bb08	bl 0x0084e938
0086bb0c	mov x20,x0
0086bb10	mov x8,#-0x1
0086bb14	stp xzr,xzr,[x0, #0x10]
0086bb18	stp x8,x8,[x0]
0086bb1c	stp x8,x8,[x0, #0x20]
0086bb20	b 0x0086bb28
0086bb24	mov x20,xzr
0086bb28	ldr w8,[x19, #0x90]
0086bb2c	cmp w8,#0x3c
0086bb30	b.ne 0x0086bb68
0086bb34	add x8,sp,#0x8
0086bb38	add x0,x19,#0x70
0086bb3c	bl 0x00853d20
0086bb40	ldr w8,[sp, #0x8]
0086bb44	cmp w8,#0x3c
0086bb48	b.ne 0x0086bb68
0086bb4c	mov x0,x19
0086bb50	mov x1,x20
0086bb54	mov x2,xzr
0086bb58	bl 0x0086c3dc
0086bb5c	mov x21,x0
0086bb60	mov x22,x1
0086bb64	b 0x0086bb70
0086bb68	mov x21,xzr
0086bb6c	mov x22,xzr
0086bb70	mov x0,x19
0086bb74	mov x1,x23
0086bb78	mov w2,#0x1
0086bb7c	bl 0x0086bcac
0086bb80	ldrb w8,[x19, #0x68]
0086bb84	cmp w8,#0x1
0086bb88	b.ne 0x0086bc50
0086bb8c	ldr x8,[x19, #0x4d8]
0086bb90	cbz x8,0x0086bc50
0086bb94	lsl w8,w0,#0x3
0086bb98	mov x10,#0x2d69
0086bb9c	lsr x9,x0,#0x20
0086bba0	movk x10,#0xeb38, LSL #16
0086bba4	add x8,x8,#0x8
0086bba8	movk x10,#0xea08, LSL #32
0086bbac	eor x8,x8,x9
0086bbb0	movk x10,#0x9ddf, LSL #48
0086bbb4	mul x8,x8,x10
0086bbb8	eor x9,x9,x8, LSR #0x2f
0086bbbc	eor x8,x9,x8
0086bbc0	mov x9,#0x959d
0086bbc4	mul x8,x8,x10
0086bbc8	movk x9,#0xb8f4, LSL #16
0086bbcc	movk x9,#0xd34f, LSL #32
0086bbd0	movk x9,#0x949d, LSL #48
0086bbd4	eor x8,x8,x8, LSR #0x2f
0086bbd8	mul x8,x8,x9
0086bbdc	ldrb w9,[x19, #0x4e0]
0086bbe0	lsr x8,x8,x9
0086bbe4	ldr x9,[x19, #0x4c8]
0086bbe8	lsr x10,x8,#0x6
0086bbec	ldr x10,[x9, x10, LSL #0x3]
0086bbf0	lsr x10,x10,x8
0086bbf4	tbz w10,#0x0,0x0086bc50
0086bbf8	ldr x11,[x19, #0x4d0]
0086bbfc	ldr x10,[x19, #0x4b0]
0086bc00	sub x11,x11,#0x1
0086bc04	lsl x12,x8,#0x4
0086bc08	ldr x12,[x10, x12#0x0]
0086bc0c	cmp x12,x0
0086bc10	b.eq 0x0086bc30
0086bc14	add x8,x8,#0x1
0086bc18	and x8,x8,x11
0086bc1c	lsr x12,x8,#0x6
0086bc20	ldr x12,[x9, x12, LSL #0x3]
0086bc24	lsr x12,x12,x8
0086bc28	tbnz w12,#0x0,0x0086bc04
0086bc2c	b 0x0086bc50
0086bc30	add x8,x10,x8, LSL #0x4
0086bc34	adrp x9,0xd1e000
0086bc38	ldr w9,[x9, #0x970]
0086bc3c	ldr x8,[x8, #0x8]
0086bc40	ldr w10,[x8]
0086bc44	cmp w10,w9
0086bc48	csel x8,x8,xzr,eq
0086bc4c	str x20,[x8, #0x28]
0086bc50	adrp x8,0xd1b000
0086bc54	ldr w9,[x0, #0x8]
0086bc58	ldr w8,[x8, #0x40]
0086bc5c	cmp w9,w8
0086bc60	csel x8,x0,xzr,eq
0086bc64	cbz x8,0x0086bc70
0086bc68	cbz x22,0x0086bc70
0086bc6c	stp x21,x22,[x8, #0x28]
0086bc70	ldr x8,[x24, #0x28]
0086bc74	ldur x9,[x29, #-0x8]
0086bc78	cmp x8,x9
0086bc7c	b.ne 0x0086bc98
0086bc80	ldp x20,x19,[sp, #0x80]
0086bc84	ldp x22,x21,[sp, #0x70]
0086bc88	ldp x24,x23,[sp, #0x60]
0086bc8c	ldp x29,x30,[sp, #0x50]
0086bc90	add sp,sp,#0x90
0086bc94	ret
0086bc98	bl 0x00c2fec0
