; FUN_0095c03c @ 0095c03c
0095c03c	sub sp,sp,#0x60
0095c040	stp x22,x21,[sp, #0x30]
0095c044	stp x20,x19,[sp, #0x40]
0095c048	stp x29,x30,[sp, #0x50]
0095c04c	add x29,sp,#0x50
0095c050	mrs x22,tpidr_el0
0095c054	ldr x8,[x22, #0x28]
0095c058	movi v0.2D,#0x0
0095c05c	adrp x9,0xcb4000
0095c060	mov x19,x0
0095c064	str x8,[sp, #0x28]
0095c068	ldr x8,[x0, #0x1a0]
0095c06c	ldr x21,[x0, #0x20]
0095c070	stur q0,[sp, #0x18]
0095c074	stur q0,[sp, #0x8]
0095c078	ldr x8,[x8, #0x10]
0095c07c	ldr x8,[x8]
0095c080	ldr x9,[x9, #0xdf0]
0095c084	mov x10,x8
0095c088	ldr x9,[x9]
0095c08c	ldrb w11,[x10], #0x1
0095c090	cmp w11,#0x3c
0095c094	csel x0,x10,x8,eq
0095c098	blr x9
0095c09c	mov x20,x0
0095c0a0	cbz x0,0x0095c114
0095c0a4	mov x0,x20
0095c0a8	bl 0x00c2ff50
0095c0ac	cbz x0,0x0095c0c4
0095c0b0	sub x8,x0,#0x1
0095c0b4	ldrb w9,[x20, x8]
0095c0b8	cmp w9,#0x3e
0095c0bc	b.ne 0x0095c0c4
0095c0c0	strb wzr,[x20, x8]
0095c0c4	mov w1,#0x40
0095c0c8	mov x0,x20
0095c0cc	bl 0x00c30890
0095c0d0	str x0,[sp, #0x18]
0095c0d4	cbz x0,0x0095c11c
0095c0d8	strb wzr,[x0]
0095c0dc	ldr x8,[sp, #0x18]
0095c0e0	add x0,sp,#0x8
0095c0e4	add x8,x8,#0x1
0095c0e8	str x8,[sp, #0x18]
0095c0ec	bl 0x0095c6d4
0095c0f0	ldr x4,[sp, #0x18]
0095c0f4	add x1,x21,#0x428
0095c0f8	cbz x4,0x0095c120
0095c0fc	adrp x2,0x2a7000
0095c100	add x2,x2,#0x587
0095c104	mov x0,x19
0095c108	mov x3,x20
0095c10c	bl 0x009453ec
0095c110	b 0x0095c134
0095c114	mov w21,#0x1b
0095c118	b 0x0095c15c
0095c11c	add x1,x21,#0x428
0095c120	adrp x2,0x2a9000
0095c124	add x2,x2,#0x8ca
0095c128	mov x0,x19
0095c12c	mov x3,x20
0095c130	bl 0x009453ec
0095c134	adrp x8,0xcc4000
0095c138	add x8,x8,#0x678
0095c13c	mov w21,w0
0095c140	mov x0,x20
0095c144	ldr x8,[x8]
0095c148	blr x8
0095c14c	cbnz w21,0x0095c15c
0095c150	ldr x8,[x19, #0x20]
0095c154	mov w9,#0x9
0095c158	str w9,[x8, #0x4e8]
0095c15c	ldr x8,[x22, #0x28]
0095c160	ldr x9,[sp, #0x28]
0095c164	cmp x8,x9
0095c168	b.ne 0x0095c184
0095c16c	mov w0,w21
0095c170	ldp x29,x30,[sp, #0x50]
0095c174	ldp x20,x19,[sp, #0x40]
0095c178	ldp x22,x21,[sp, #0x30]
0095c17c	add sp,sp,#0x60
0095c180	ret
0095c184	bl 0x00c2fec0
