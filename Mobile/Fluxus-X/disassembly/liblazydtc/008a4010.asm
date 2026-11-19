; FUN_008a4010 @ 008a4010
008a4010	sub sp,sp,#0x190
008a4014	stp x29,x30,[sp, #0x160]
008a4018	str x28,[sp, #0x170]
008a401c	stp x20,x19,[sp, #0x180]
008a4020	add x29,sp,#0x160
008a4024	mrs x19,tpidr_el0
008a4028	ldr q0,[x29, #0x30]
008a402c	add x9,sp,#0x9
008a4030	ldr x8,[x19, #0x28]
008a4034	stur x8,[x29, #-0x8]
008a4038	adrp x8,0xc4c000
008a403c	add x8,x8,#0x4b8
008a4040	stur q0,[sp, #0x48]
008a4044	movi v0.2D,#0x0
008a4048	ldr x10,[x3]
008a404c	stp x8,x0,[sp, #0x8]
008a4050	ldr x8,[x29, #0x40]
008a4054	stp x1,x2,[sp, #0x18]
008a4058	str x8,[sp, #0x58]
008a405c	mov w8,#0x40
008a4060	stur q0,[x9, #0xff]
008a4064	add x9,sp,#0x8
008a4068	add x9,x9,#0x118
008a406c	stp x4,x5,[sp, #0x28]
008a4070	stp x6,x7,[sp, #0x38]
008a4074	stp q0,q0,[sp, #0x60]
008a4078	stur q0,[sp, #0x80]
008a407c	strb w8,[sp, #0x90]
008a4080	stur q0,[sp, #0x98]
008a4084	stur q0,[sp, #0xa8]
008a4088	stur q0,[sp, #0xb8]
008a408c	stur q0,[sp, #0xc8]
008a4090	str xzr,[sp, #0xd8]
008a4094	strb w8,[sp, #0xe0]
008a4098	stur q0,[sp, #0xe8]
008a409c	stur q0,[sp, #0xf8]
008a40a0	strb w8,[sp, #0x118]
008a40a4	stp q0,q0,[x9]
008a40a8	str q0,[x9, #0x20]
008a40ac	strb w8,[sp, #0x150]
008a40b0	ldr x8,[x10]
008a40b4	add x1,sp,#0x8
008a40b8	mov x0,x3
008a40bc	blr x8
008a40c0	add x0,sp,#0x8
008a40c4	bl 0x008a4118
008a40c8	ldr x8,[x19, #0x28]
008a40cc	ldur x9,[x29, #-0x8]
008a40d0	cmp x8,x9
008a40d4	b.ne 0x008a4114
008a40d8	ldp x20,x19,[sp, #0x180]
008a40dc	ldr x28,[sp, #0x170]
008a40e0	ldp x29,x30,[sp, #0x160]
008a40e4	add sp,sp,#0x190
008a40e8	ret
008a4114	bl 0x00c2fec0
