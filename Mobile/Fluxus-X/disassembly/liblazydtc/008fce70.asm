; cpr::Files::Files @ 008fce70
008fce70	sub sp,sp,#0x90
008fce74	stp x28,x27,[sp, #0x30]
008fce78	stp x26,x25,[sp, #0x40]
008fce7c	stp x24,x23,[sp, #0x50]
008fce80	stp x22,x21,[sp, #0x60]
008fce84	stp x20,x19,[sp, #0x70]
008fce88	stp x29,x30,[sp, #0x80]
008fce8c	add x29,sp,#0x80
008fce90	mrs x25,tpidr_el0
008fce94	ldr x8,[x25, #0x28]
008fce98	mov x19,x0
008fce9c	str x8,[sp, #0x28]
008fcea0	stp xzr,xzr,[x0, #0x8]
008fcea4	str xzr,[x0]
008fcea8	ldr x9,[x1, #0x8]
008fceac	cbz x9,0x008fcfc8
008fceb0	add x10,sp,#0x10
008fceb4	ldr x20,[x1]
008fceb8	orr x10,x10,#0x1
008fcebc	str x10,[sp, #0x8]
008fcec0	orr w10,wzr,#0x18
008fcec4	mul x9,x9,x10
008fcec8	mov x8,xzr
008fcecc	mov x28,xzr
008fced0	mov x26,xzr
008fced4	sub x27,x9,#0x18
008fced8	cmp x26,x8
008fcedc	b.cs 0x008fcf20
008fcee0	b 0x008fcefc
008fcee4	ldp x28,x8,[x19, #0x8]
008fcee8	add x20,x20,#0x18
008fceec	sub x27,x27,#0x18
008fcef0	mov x26,x28
008fcef4	cmp x26,x8
008fcef8	b.cs 0x008fcf20
008fcefc	stp xzr,xzr,[sp, #0x18]
008fcf00	str xzr,[sp, #0x10]
008fcf04	ldrb w8,[x20]
008fcf08	tbnz w8,#0x0,0x008fcf34
008fcf0c	ldr x8,[x20, #0x10]
008fcf10	str x8,[sp, #0x20]
008fcf14	ldr q0,[x20]
008fcf18	str q0,[sp, #0x10]
008fcf1c	b 0x008fcf94
008fcf20	mov x0,x19
008fcf24	mov x1,x20
008fcf28	bl 0x00c310b0
008fcf2c	cbnz x27,0x008fcee4
008fcf30	b 0x008fcfc8
008fcf34	ldr x21,[x20, #0x8]
008fcf38	cmn x21,#0x10
008fcf3c	b.cs 0x008fcff8
008fcf40	ldr x22,[x20, #0x10]
008fcf44	cmp x21,#0x17
008fcf48	b.cs 0x008fcf60
008fcf4c	ldr x23,[sp, #0x8]
008fcf50	lsl w8,w21,#0x1
008fcf54	strb w8,[sp, #0x10]
008fcf58	cbnz x21,0x008fcf80
008fcf5c	b 0x008fcf90
008fcf60	add x8,x21,#0x10
008fcf64	and x24,x8,#-0x10
008fcf68	mov x0,x24
008fcf6c	bl 0x00c2fed0
008fcf70	orr x8,x24,#0x1
008fcf74	mov x23,x0
008fcf78	stp x21,x0,[sp, #0x18]
008fcf7c	str x8,[sp, #0x10]
008fcf80	mov x0,x23
008fcf84	mov x1,x22
008fcf88	mov x2,x21
008fcf8c	bl 0x00c2ffd0
008fcf90	strb wzr,[x23, x21]
008fcf94	ldr x8,[sp, #0x20]
008fcf98	str x8,[x28, #0x10]
008fcf9c	ldr q0,[sp, #0x10]
008fcfa0	str q0,[x28]
008fcfa4	str xzr,[x26, #0x18]
008fcfa8	strb wzr,[x28, #0x1f]
008fcfac	sturh wzr,[x28, #0x1d]
008fcfb0	stur wzr,[x28, #0x19]
008fcfb4	stp xzr,xzr,[x26, #0x20]
008fcfb8	ldr x8,[x19, #0x8]
008fcfbc	add x8,x8,#0x30
008fcfc0	str x8,[x19, #0x8]
008fcfc4	cbnz x27,0x008fcee4
008fcfc8	ldr x8,[x25, #0x28]
008fcfcc	ldr x9,[sp, #0x28]
008fcfd0	cmp x8,x9
008fcfd4	b.ne 0x008fd000
008fcfd8	ldp x29,x30,[sp, #0x80]
008fcfdc	ldp x20,x19,[sp, #0x70]
008fcfe0	ldp x22,x21,[sp, #0x60]
008fcfe4	ldp x24,x23,[sp, #0x50]
008fcfe8	ldp x26,x25,[sp, #0x40]
008fcfec	ldp x28,x27,[sp, #0x30]
008fcff0	add sp,sp,#0x90
008fcff4	ret
008fcff8	add x0,sp,#0x10
008fcffc	bl 0x00c30ce0
008fd000	bl 0x00c2fec0
