; FUN_008a0018 @ 008a0018
008a0018	stp x29,x30,[sp, #-0x50]!
008a001c	str x25,[sp, #0x10]
008a0020	stp x24,x23,[sp, #0x20]
008a0024	stp x22,x21,[sp, #0x30]
008a0028	stp x20,x19,[sp, #0x40]
008a002c	mov x29,sp
008a0030	ldp x8,x9,[x0, #0x8]
008a0034	mov x19,x0
008a0038	mov x21,x1
008a003c	cmp x8,x9
008a0040	b.cs 0x008a0064
008a0044	ldp q2,q0,[x21, #0x10]
008a0048	ldr x9,[x21, #0x30]
008a004c	ldr q1,[x21]
008a0050	add x21,x8,#0x38
008a0054	str x9,[x8, #0x30]
008a0058	stp q2,q0,[x8, #0x10]
008a005c	str q1,[x8]
008a0060	b 0x008a0134
008a0064	ldr x20,[x19]
008a0068	mov x11,#0x6db7
008a006c	mov x10,#0x1
008a0070	movk x11,#0xb6db, LSL #16
008a0074	sub x23,x8,x20
008a0078	movk x11,#0xdb6d, LSL #32
008a007c	asr x8,x23,#0x3
008a0080	movk x11,#0x6db6, LSL #48
008a0084	madd x10,x8,x11,x10
008a0088	mov x8,#0x2492
008a008c	movk x8,#0x9249, LSL #16
008a0090	movk x8,#0x4924, LSL #32
008a0094	movk x8,#0x492, LSL #48
008a0098	cmp x10,x8
008a009c	b.hi 0x008a0150
008a00a0	sub x22,x9,x20
008a00a4	mov x12,#0x9249
008a00a8	asr x9,x22,#0x3
008a00ac	movk x12,#0x4924, LSL #16
008a00b0	movk x12,#0x2492, LSL #32
008a00b4	mul x9,x9,x11
008a00b8	movk x12,#0x249, LSL #48
008a00bc	lsl x11,x9,#0x1
008a00c0	cmp x11,x10
008a00c4	csel x10,x11,x10,hi
008a00c8	cmp x9,x12
008a00cc	csel x9,x10,x8,cc
008a00d0	cmp x9,x8
008a00d4	b.hi 0x008a0154
008a00d8	lsl x8,x9,#0x6
008a00dc	sub x24,x8,x9, LSL #0x3
008a00e0	mov x0,x24
008a00e4	bl 0x00c2fed0
008a00e8	ldp q0,q1,[x21]
008a00ec	add x8,x0,x23
008a00f0	ldr q2,[x21, #0x20]
008a00f4	ldr x9,[x21, #0x30]
008a00f8	mov x1,x20
008a00fc	mov x2,x23
008a0100	mov x25,x0
008a0104	add x24,x0,x24
008a0108	stp q0,q1,[x8]
008a010c	add x21,x8,#0x38
008a0110	str q2,[x8, #0x20]
008a0114	str x9,[x8, #0x30]
008a0118	bl 0x00c2ffd0
008a011c	stp x25,x21,[x19]
008a0120	str x24,[x19, #0x10]
008a0124	cbz x20,0x008a0134
008a0128	mov x0,x20
008a012c	mov x1,x22
008a0130	bl 0x00c2fe80
008a0134	str x21,[x19, #0x8]
008a0138	ldp x20,x19,[sp, #0x40]
008a013c	ldr x25,[sp, #0x10]
008a0140	ldp x22,x21,[sp, #0x30]
008a0144	ldp x24,x23,[sp, #0x20]
008a0148	ldp x29,x30,[sp], #0x50
008a014c	ret
008a0150	bl 0x008a0158
008a0154	bl 0x007fe1b8
