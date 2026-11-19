; FUN_0086eda4 @ 0086eda4
0086eda4	sub sp,sp,#0x80
0086eda8	stp x29,x30,[sp, #0x30]
0086edac	str x25,[sp, #0x40]
0086edb0	stp x24,x23,[sp, #0x50]
0086edb4	stp x22,x21,[sp, #0x60]
0086edb8	stp x20,x19,[sp, #0x70]
0086edbc	add x29,sp,#0x30
0086edc0	mrs x24,tpidr_el0
0086edc4	orr x11,xzr,#-0x3333333333333334
0086edc8	mov x9,#0x1
0086edcc	ldr x8,[x24, #0x28]
0086edd0	movk x11,#0xcccd
0086edd4	stur x8,[x29, #-0x8]
0086edd8	ldp x10,x8,[x0]
0086eddc	sub x22,x8,x10
0086ede0	asr x8,x22,#0x3
0086ede4	madd x9,x8,x11,x9
0086ede8	orr x8,xzr,#0x6666666666666666
0086edec	movk x8,#0x666, LSL #48
0086edf0	cmp x9,x8
0086edf4	b.hi 0x0086ef50
0086edf8	mov x12,x0
0086edfc	mov x20,x2
0086ee00	mov x19,x0
0086ee04	ldr x13,[x12, #0x10]!
0086ee08	mov x21,x1
0086ee0c	str x12,[sp, #0x20]
0086ee10	sub x10,x13,x10
0086ee14	orr x13,xzr,#0x3333333333333333
0086ee18	asr x10,x10,#0x3
0086ee1c	movk x13,#0x333, LSL #48
0086ee20	mul x10,x10,x11
0086ee24	lsl x11,x10,#0x1
0086ee28	cmp x11,x9
0086ee2c	csel x9,x11,x9,hi
0086ee30	cmp x10,x13
0086ee34	csel x23,x9,x8,cc
0086ee38	cbz x23,0x0086ee54
0086ee3c	cmp x23,x8
0086ee40	b.hi 0x0086ef78
0086ee44	add x8,x23,x23, LSL #0x2
0086ee48	lsl x0,x8,#0x3
0086ee4c	bl 0x00c2fed0
0086ee50	b 0x0086ee58
0086ee54	mov x0,xzr
0086ee58	mov w8,#0x28
0086ee5c	add x25,x0,x22
0086ee60	ldr q0,[x21]
0086ee64	nop
0086ee68	madd x8,x23,x8,x0
0086ee6c	stp x0,x25,[sp]
0086ee70	mov x0,x20
0086ee74	str q0,[x25]
0086ee78	stp x25,x8,[sp, #0x10]
0086ee7c	bl 0x00c2ff50
0086ee80	cmn x0,#0x8
0086ee84	b.cs 0x0086ef64
0086ee88	mov x21,x0
0086ee8c	cmp x0,#0x17
0086ee90	b.cs 0x0086eea8
0086ee94	lsl w8,w21,#0x1
0086ee98	add x22,x25,#0x11
0086ee9c	strb w8,[x25, #0x10]
0086eea0	cbnz x21,0x0086eed0
0086eea4	b 0x0086eee0
0086eea8	orr x8,x21,#0x7
0086eeac	mov w9,#0x1a
0086eeb0	cmp x8,#0x17
0086eeb4	csinc x23,x9,x8,eq
0086eeb8	mov x0,x23
0086eebc	bl 0x00c2fed0
0086eec0	orr x8,x23,#0x1
0086eec4	mov x22,x0
0086eec8	stp x21,x0,[x25, #0x18]
0086eecc	str x8,[x25, #0x10]
0086eed0	mov x0,x22
0086eed4	mov x1,x20
0086eed8	mov x2,x21
0086eedc	bl 0x00c2ff60
0086eee0	strb wzr,[x22, x21]
0086eee4	ldp x1,x8,[x19]
0086eee8	ldp x10,x9,[sp, #0x8]
0086eeec	sub x2,x8,x1
0086eef0	sub x21,x10,x2
0086eef4	add x20,x9,#0x28
0086eef8	mov x0,x21
0086eefc	bl 0x00c2ffd0
0086ef00	ldr x0,[x19]
0086ef04	ldr x9,[sp, #0x18]
0086ef08	ldr x8,[x19, #0x10]
0086ef0c	stp x21,x20,[x19]
0086ef10	str x9,[x19, #0x10]
0086ef14	cbz x0,0x0086ef20
0086ef18	sub x1,x8,x0
0086ef1c	bl 0x00c2fe80
0086ef20	ldr x8,[x24, #0x28]
0086ef24	ldur x9,[x29, #-0x8]
0086ef28	cmp x8,x9
0086ef2c	b.ne 0x0086efb0
0086ef30	mov x0,x20
0086ef34	ldp x20,x19,[sp, #0x70]
0086ef38	ldr x25,[sp, #0x40]
0086ef3c	ldp x22,x21,[sp, #0x60]
0086ef40	ldp x24,x23,[sp, #0x50]
0086ef44	ldp x29,x30,[sp, #0x30]
0086ef48	add sp,sp,#0x80
0086ef4c	ret
0086ef50	ldr x8,[x24, #0x28]
0086ef54	ldur x9,[x29, #-0x8]
0086ef58	cmp x8,x9
0086ef5c	b.ne 0x0086efb0
0086ef60	bl 0x0086ecc0
0086ef64	ldr x8,[x24, #0x28]
0086ef68	ldur x9,[x29, #-0x8]
0086ef6c	cmp x8,x9
0086ef70	b.ne 0x0086efb0
0086ef74	bl 0x007fe124
0086ef78	ldr x8,[x24, #0x28]
0086ef7c	ldur x9,[x29, #-0x8]
0086ef80	cmp x8,x9
0086ef84	b.ne 0x0086efb0
0086ef88	bl 0x007fe1b8
0086efb0	bl 0x00c2fec0
