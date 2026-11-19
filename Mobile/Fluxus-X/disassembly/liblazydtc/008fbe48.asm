; cpr::CurlContainer<cpr::Parameter>::Add @ 008fbe48
008fbe48	sub sp,sp,#0x80
008fbe4c	stp x24,x23,[sp, #0x40]
008fbe50	stp x22,x21,[sp, #0x50]
008fbe54	stp x20,x19,[sp, #0x60]
008fbe58	stp x29,x30,[sp, #0x70]
008fbe5c	add x29,sp,#0x70
008fbe60	mrs x22,tpidr_el0
008fbe64	ldr x8,[x22, #0x28]
008fbe68	mov x19,x0
008fbe6c	str x8,[sp, #0x38]
008fbe70	ldr x8,[x1, #0x8]
008fbe74	cbz x8,0x008fbf28
008fbe78	ldr x20,[x1]
008fbe7c	add x9,sp,#0x8
008fbe80	add x8,x8,x8, LSL #0x1
008fbe84	add x21,x19,#0x8
008fbe88	add x23,x9,#0x18
008fbe8c	lsl x24,x8,#0x4
008fbe90	add x0,sp,#0x8
008fbe94	mov x1,x20
008fbe98	bl 0x00c30f30
008fbe9c	ldp x8,x9,[x19, #0x10]
008fbea0	cmp x8,x9
008fbea4	b.cs 0x008fbef0
008fbea8	ldr x9,[sp, #0x18]
008fbeac	str x9,[x8, #0x10]
008fbeb0	ldur q0,[sp, #0x8]
008fbeb4	str q0,[x8]
008fbeb8	stp xzr,xzr,[sp, #0x10]
008fbebc	str xzr,[sp, #0x8]
008fbec0	ldr x9,[x23, #0x10]
008fbec4	str x9,[x8, #0x28]
008fbec8	ldr q0,[x23]
008fbecc	stur q0,[x8, #0x18]
008fbed0	stp xzr,xzr,[x23, #0x8]
008fbed4	str xzr,[x23]
008fbed8	ldr x8,[x19, #0x10]
008fbedc	add x8,x8,#0x30
008fbee0	str x8,[x19, #0x10]
008fbee4	ldrb w8,[sp, #0x8]
008fbee8	tbnz w8,#0x0,0x008fbf14
008fbeec	b 0x008fbf1c
008fbef0	add x1,sp,#0x8
008fbef4	mov x0,x21
008fbef8	bl 0x00c30f90
008fbefc	ldrb w8,[sp, #0x20]
008fbf00	tbz w8,#0x0,0x008fbf0c
008fbf04	ldr x0,[sp, #0x30]
008fbf08	bl 0x00c301d0
008fbf0c	ldrb w8,[sp, #0x8]
008fbf10	tbz w8,#0x0,0x008fbf1c
008fbf14	ldr x0,[sp, #0x18]
008fbf18	bl 0x00c301d0
008fbf1c	subs x24,x24,#0x30
008fbf20	add x20,x20,#0x30
008fbf24	b.ne 0x008fbe90
008fbf28	ldr x8,[x22, #0x28]
008fbf2c	ldr x9,[sp, #0x38]
008fbf30	cmp x8,x9
008fbf34	b.ne 0x008fbf50
008fbf38	ldp x29,x30,[sp, #0x70]
008fbf3c	ldp x20,x19,[sp, #0x60]
008fbf40	ldp x22,x21,[sp, #0x50]
008fbf44	ldp x24,x23,[sp, #0x40]
008fbf48	add sp,sp,#0x80
008fbf4c	ret
008fbf50	bl 0x00c2fec0
