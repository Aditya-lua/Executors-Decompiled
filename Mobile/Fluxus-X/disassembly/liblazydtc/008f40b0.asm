; cpr::Parameter::Parameter @ 008f40b0
008f40b0	stp x24,x23,[sp, #-0x40]!
008f40b4	stp x22,x21,[sp, #0x10]
008f40b8	stp x20,x19,[sp, #0x20]
008f40bc	stp x29,x30,[sp, #0x30]
008f40c0	add x29,sp,#0x30
008f40c4	stp xzr,xzr,[x0, #0x8]
008f40c8	str xzr,[x0]
008f40cc	ldrb w8,[x1]
008f40d0	mov x20,x1
008f40d4	mov x19,x0
008f40d8	tbnz w8,#0x0,0x008f40f0
008f40dc	ldr x8,[x20, #0x10]
008f40e0	str x8,[x19, #0x10]
008f40e4	ldr q0,[x20]
008f40e8	str q0,[x19]
008f40ec	b 0x008f4150
008f40f0	ldr x21,[x20, #0x8]
008f40f4	cmn x21,#0x10
008f40f8	b.cs 0x008f41ec
008f40fc	ldr x22,[x20, #0x10]
008f4100	cmp x21,#0x17
008f4104	b.cs 0x008f411c
008f4108	lsl w8,w21,#0x1
008f410c	mov x23,x19
008f4110	strb w8,[x23], #0x1
008f4114	cbnz x21,0x008f413c
008f4118	b 0x008f414c
008f411c	add x8,x21,#0x10
008f4120	and x24,x8,#-0x10
008f4124	mov x0,x24
008f4128	bl 0x00c2fed0
008f412c	orr x8,x24,#0x1
008f4130	mov x23,x0
008f4134	stp x21,x0,[x19, #0x8]
008f4138	str x8,[x19]
008f413c	mov x0,x23
008f4140	mov x1,x22
008f4144	mov x2,x21
008f4148	bl 0x00c2ffd0
008f414c	strb wzr,[x23, x21]
008f4150	mov x21,x19
008f4154	str xzr,[x21, #0x18]!
008f4158	stp xzr,xzr,[x21, #0x8]
008f415c	mov x8,x20
008f4160	ldrb w9,[x8, #0x18]!
008f4164	tbnz w9,#0x0,0x008f417c
008f4168	ldr x9,[x8, #0x10]
008f416c	str x9,[x21, #0x10]
008f4170	ldr q0,[x8]
008f4174	str q0,[x21]
008f4178	b 0x008f41d8
008f417c	ldr x22,[x20, #0x20]
008f4180	cmn x22,#0x10
008f4184	b.cs 0x008f41f4
008f4188	ldr x20,[x20, #0x28]
008f418c	cmp x22,#0x17
008f4190	b.cs 0x008f41a4
008f4194	lsl w8,w22,#0x1
008f4198	strb w8,[x21], #0x1
008f419c	cbnz x22,0x008f41c4
008f41a0	b 0x008f41d4
008f41a4	add x8,x22,#0x10
008f41a8	and x23,x8,#-0x10
008f41ac	mov x0,x23
008f41b0	bl 0x00c2fed0
008f41b4	orr x8,x23,#0x1
008f41b8	mov x21,x0
008f41bc	stp x22,x0,[x19, #0x20]
008f41c0	str x8,[x19, #0x18]
008f41c4	mov x0,x21
008f41c8	mov x1,x20
008f41cc	mov x2,x22
008f41d0	bl 0x00c2ffd0
008f41d4	strb wzr,[x21, x22]
008f41d8	ldp x29,x30,[sp, #0x30]
008f41dc	ldp x20,x19,[sp, #0x20]
008f41e0	ldp x22,x21,[sp, #0x10]
008f41e4	ldp x24,x23,[sp], #0x40
008f41e8	ret
008f41ec	mov x0,x19
008f41f0	bl 0x00c30ce0
008f41f4	mov x0,x21
008f41f8	bl 0x00c30ce0
