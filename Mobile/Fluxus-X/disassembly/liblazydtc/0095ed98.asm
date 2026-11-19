; FUN_0095ed98 @ 0095ed98
0095ed98	sub sp,sp,#0x170
0095ed9c	str x28,[sp, #0x110]
0095eda0	stp x26,x25,[sp, #0x120]
0095eda4	stp x24,x23,[sp, #0x130]
0095eda8	stp x22,x21,[sp, #0x140]
0095edac	stp x20,x19,[sp, #0x150]
0095edb0	stp x29,x30,[sp, #0x160]
0095edb4	add x29,sp,#0x160
0095edb8	mrs x23,tpidr_el0
0095edbc	ldr x8,[x23, #0x28]
0095edc0	adrp x25,0xcc4000
0095edc4	add x25,x25,#0x690
0095edc8	mov x19,x0
0095edcc	stur x8,[x29, #-0x58]
0095edd0	ldr x21,[x0, #0x20]
0095edd4	ldr x8,[x25]
0095edd8	mov x20,x1
0095eddc	mov w0,#0x1
0095ede0	mov w1,#0x158
0095ede4	blr x8
0095ede8	mov x22,x0
0095edec	str x0,[x21, #0x428]
0095edf0	cbz x0,0x0095eee4
0095edf4	ldr x8,[x19, #0x308]
0095edf8	ldr x9,[x22, #0x148]
0095edfc	mov w10,#0x200
0095ee00	cmp x8,#0x0
0095ee04	csel w24,w10,w8,eq
0095ee08	cmp w24,#0x200
0095ee0c	csel w26,w24,w10,gt
0095ee10	cbnz x9,0x0095ee2c
0095ee14	ldr x8,[x25]
0095ee18	add w1,w26,#0x4
0095ee1c	mov w0,#0x1
0095ee20	blr x8
0095ee24	str x0,[x22, #0x148]
0095ee28	cbz x0,0x0095eee4
0095ee2c	ldr x8,[x22, #0x150]
0095ee30	cbnz x8,0x0095ee4c
0095ee34	ldr x8,[x25]
0095ee38	add w1,w26,#0x4
0095ee3c	mov w0,#0x1
0095ee40	blr x8
0095ee44	str x0,[x22, #0x150]
0095ee48	cbz x0,0x0095eee4
0095ee4c	mov w1,#0x1
0095ee50	mov x0,x21
0095ee54	mov w25,#0x1
0095ee58	bl 0x00908c4c
0095ee5c	str x19,[x22, #0x10]
0095ee60	ldr w10,[x21, #0x220]
0095ee64	mov w8,#0xffffff9c
0095ee68	mov w9,#0x200
0095ee6c	str wzr,[x22]
0095ee70	str w8,[x22, #0x8]
0095ee74	str w9,[x22, #0x13c]
0095ee78	str w10,[x22, #0x18]
0095ee7c	str w24,[x22, #0x140]
0095ee80	ldr x8,[x21, #0x38]
0095ee84	mov x0,x22
0095ee88	ldr w8,[x8]
0095ee8c	strh w8,[x22, #0x30]
0095ee90	bl 0x0095f5d8
0095ee94	ldrb w8,[x21, #0x3a2]
0095ee98	tbnz w8,#0x5,0x0095eef8
0095ee9c	ldr x8,[x21, #0x38]
0095eea0	ldr w0,[x22, #0x18]
0095eea4	add x1,x22,#0x30
0095eea8	ldr w2,[x8, #0xc]
0095eeac	bl 0x00c31be0
0095eeb0	cbz w0,0x0095eeec
0095eeb4	bl 0x00c30710
0095eeb8	ldr w0,[x0]
0095eebc	add x1,sp,#0x8
0095eec0	mov w2,#0x100
0095eec4	bl 0x00941a94
0095eec8	adrp x1,0x2c5000
0095eecc	mov x2,x0
0095eed0	add x1,x1,#0x294
0095eed4	mov x0,x19
0095eed8	bl 0x00904b80
0095eedc	orr w0,wzr,#0x7
0095eee0	b 0x0095ef08
0095eee4	mov w0,#0x1b
0095eee8	b 0x0095ef08
0095eeec	ldr x8,[x21, #0x3a0]
0095eef0	orr x8,x8,#0x200000
0095eef4	str x8,[x21, #0x3a0]
0095eef8	mov x0,x19
0095eefc	bl 0x00931de4
0095ef00	mov w0,wzr
0095ef04	strb w25,[x20]
0095ef08	ldr x8,[x23, #0x28]
0095ef0c	ldur x9,[x29, #-0x58]
0095ef10	cmp x8,x9
0095ef14	b.ne 0x0095ef38
0095ef18	ldp x29,x30,[sp, #0x160]
0095ef1c	ldp x20,x19,[sp, #0x150]
0095ef20	ldp x22,x21,[sp, #0x140]
0095ef24	ldp x24,x23,[sp, #0x130]
0095ef28	ldp x26,x25,[sp, #0x120]
0095ef2c	ldr x28,[sp, #0x110]
0095ef30	add sp,sp,#0x170
0095ef34	ret
0095ef38	bl 0x00c2fec0
