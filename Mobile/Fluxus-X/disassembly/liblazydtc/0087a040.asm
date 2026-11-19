; FUN_0087a040 @ 0087a040
0087a040	stp x29,x30,[sp, #-0x40]!
0087a044	str x23,[sp, #0x10]
0087a048	stp x22,x21,[sp, #0x20]
0087a04c	stp x20,x19,[sp, #0x30]
0087a050	mov x29,sp
0087a054	ldp x21,x23,[x0]
0087a058	mov x19,x1
0087a05c	ldr x8,[x1, #0x8]
0087a060	mov x20,x0
0087a064	sub x9,x21,x23
0087a068	cmp x23,x21
0087a06c	add x22,x8,x9
0087a070	b.eq 0x0087a124
0087a074	mov x8,x22
0087a078	mov x9,x21
0087a07c	ldrh w10,[x9, #0x4]
0087a080	ldr w11,[x9]
0087a084	stp xzr,xzr,[x8, #0x10]
0087a088	str xzr,[x8, #0x8]
0087a08c	strh w10,[x8, #0x4]
0087a090	str w11,[x8]
0087a094	ldur q0,[x9, #0x8]
0087a098	stur q0,[x8, #0x8]
0087a09c	ldr x10,[x9, #0x18]
0087a0a0	str x10,[x8, #0x18]
0087a0a4	stp xzr,xzr,[x9, #0x8]
0087a0a8	str xzr,[x9, #0x18]
0087a0ac	stp xzr,xzr,[x8, #0x20]
0087a0b0	str xzr,[x8, #0x30]
0087a0b4	ldr q0,[x9, #0x20]
0087a0b8	str q0,[x8, #0x20]
0087a0bc	ldr x10,[x9, #0x30]
0087a0c0	str x10,[x8, #0x30]
0087a0c4	add x8,x8,#0x38
0087a0c8	stp xzr,xzr,[x9, #0x20]
0087a0cc	str xzr,[x9, #0x30]
0087a0d0	add x9,x9,#0x38
0087a0d4	cmp x9,x23
0087a0d8	b.ne 0x0087a07c
0087a0dc	b 0x0087a0ec
0087a0e0	add x21,x21,#0x38
0087a0e4	cmp x21,x23
0087a0e8	b.eq 0x0087a120
0087a0ec	ldr x0,[x21, #0x20]
0087a0f0	cbz x0,0x0087a104
0087a0f4	ldr x8,[x21, #0x30]
0087a0f8	str x0,[x21, #0x28]
0087a0fc	sub x1,x8,x0
0087a100	bl 0x00c2fe80
0087a104	ldr x0,[x21, #0x8]
0087a108	cbz x0,0x0087a0e0
0087a10c	ldr x8,[x21, #0x18]
0087a110	str x0,[x21, #0x10]
0087a114	sub x1,x8,x0
0087a118	bl 0x00c2fe80
0087a11c	b 0x0087a0e0
0087a120	ldr x21,[x20]
0087a124	str x22,[x19, #0x8]
0087a128	stp x22,x21,[x20]
0087a12c	ldr x8,[x19, #0x10]
0087a130	str x21,[x19, #0x8]
0087a134	ldr x9,[x20, #0x8]
0087a138	str x8,[x20, #0x8]
0087a13c	ldr x8,[x19, #0x18]
0087a140	str x9,[x19, #0x10]
0087a144	ldr x9,[x20, #0x10]
0087a148	str x8,[x20, #0x10]
0087a14c	ldr x8,[x19, #0x8]
0087a150	str x9,[x19, #0x18]
0087a154	str x8,[x19]
0087a158	ldp x20,x19,[sp, #0x30]
0087a15c	ldr x23,[sp, #0x10]
0087a160	ldp x22,x21,[sp, #0x20]
0087a164	ldp x29,x30,[sp], #0x40
0087a168	ret
