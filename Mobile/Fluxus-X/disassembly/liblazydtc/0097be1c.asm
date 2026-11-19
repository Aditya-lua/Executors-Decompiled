; ix::HttpServer::handleConnection @ 0097be1c
0097be1c	sub sp,sp,#0x110
0097be20	stp x28,x25,[sp, #0xc0]
0097be24	stp x24,x23,[sp, #0xd0]
0097be28	stp x22,x21,[sp, #0xe0]
0097be2c	stp x20,x19,[sp, #0xf0]
0097be30	stp x29,x30,[sp, #0x100]
0097be34	add x29,sp,#0x100
0097be38	mrs x24,tpidr_el0
0097be3c	ldr x8,[x24, #0x28]
0097be40	mov x21,x0
0097be44	mov x22,x1
0097be48	mov x20,x2
0097be4c	stur x8,[x29, #-0x48]
0097be50	ldr w9,[x0, #0x320]
0097be54	add x8,sp,#0x80
0097be58	mov x0,x1
0097be5c	mov w1,w9
0097be60	bl 0x00c32f30
0097be64	ldrb w8,[sp, #0x80]
0097be68	cbz w8,0x0097c234
0097be6c	ldp x23,x19,[sp, #0xa0]
0097be70	cbz x19,0x0097be88
0097be74	add x8,x19,#0x8
0097be78	ldxr x9,[x8]
0097be7c	add x9,x9,#0x1
0097be80	stxr w10,x9,[x8]
0097be84	cbnz w10,0x0097be78
0097be88	mov x9,#0x7055
0097be8c	movk x9,#0x7267, LSL #16
0097be90	movk x9,#0x6461, LSL #32
0097be94	orr w8,wzr,#0xe
0097be98	movk x9,#0x65, LSL #48
0097be9c	add x0,x23,#0x60
0097bea0	add x10,sp,#0x68
0097bea4	stp xzr,xzr,[sp, #0x68]
0097bea8	str xzr,[sp, #0x78]
0097beac	strb w8,[sp, #0x68]
0097beb0	stur x9,[sp, #0x69]
0097beb4	str x10,[sp, #0x30]
0097beb8	adrp x2,0x749000
0097bebc	add x2,x2,#0x7e2
0097bec0	add x1,sp,#0x68
0097bec4	add x3,sp,#0x30
0097bec8	sub x4,x29,#0x50
0097becc	bl 0x00c32fb0
0097bed0	mov x8,x0
0097bed4	ldrb w9,[x8, #0x38]!
0097bed8	ldr x10,[x0, #0x40]
0097bedc	mov w25,wzr
0097bee0	lsr w11,w9,#0x1
0097bee4	tst w9,#0x1
0097bee8	csel x10,x11,x10,eq
0097beec	cmp x10,#0x9
0097bef0	b.ne 0x0097c0ac
0097bef4	ldr x10,[x0, #0x48]
0097bef8	tst w9,#0x1
0097befc	adrp x1,0x29d000
0097bf00	add x1,x1,#0xa29
0097bf04	csinc x0,x10,x8,ne
0097bf08	mov w2,#0x9
0097bf0c	bl 0x00c300b0
0097bf10	cmp w0,#0x0
0097bf14	cset w25,eq
0097bf18	ldrb w8,[sp, #0x68]
0097bf1c	tbz w8,#0x0,0x0097c0b4
0097bf20	ldr x0,[sp, #0x78]
0097bf24	bl 0x00c301d0
0097bf28	cbnz w25,0x0097c0b8
0097bf2c	stp x23,x19,[sp, #0x20]
0097bf30	cbz x19,0x0097bf48
0097bf34	add x8,x19,#0x8
0097bf38	ldxr x9,[x8]
0097bf3c	add x9,x9,#0x1
0097bf40	stxr w10,x9,[x8]
0097bf44	cbnz w10,0x0097bf38
0097bf48	ldr x8,[x20]
0097bf4c	str x8,[sp, #0x10]
0097bf50	ldr x8,[x20, #0x8]
0097bf54	str x8,[sp, #0x18]
0097bf58	cbz x8,0x0097bf70
0097bf5c	add x8,x8,#0x8
0097bf60	ldxr x9,[x8]
0097bf64	add x9,x9,#0x1
0097bf68	stxr w10,x9,[x8]
0097bf6c	cbnz w10,0x0097bf60
0097bf70	ldr x0,[x21, #0x310]
0097bf74	cbz x0,0x0097c2c0
0097bf78	ldr x8,[x0]
0097bf7c	ldr x9,[x8, #0x30]
0097bf80	add x8,sp,#0x30
0097bf84	add x1,sp,#0x20
0097bf88	add x2,sp,#0x10
0097bf8c	blr x9
0097bf90	ldr x23,[sp, #0x18]
0097bf94	cbz x23,0x0097bfc8
0097bf98	add x8,x23,#0x8
0097bf9c	ldaxr x9,[x8]
0097bfa0	sub x10,x9,#0x1
0097bfa4	stlxr w11,x10,[x8]
0097bfa8	cbnz w11,0x0097bf9c
0097bfac	cbnz x9,0x0097bfc8
0097bfb0	ldr x8,[x23]
0097bfb4	mov x0,x23
0097bfb8	ldr x8,[x8, #0x10]
0097bfbc	blr x8
0097bfc0	mov x0,x23
0097bfc4	bl 0x00c2ff00
0097bfc8	ldr x23,[sp, #0x28]
0097bfcc	cbz x23,0x0097c000
0097bfd0	add x8,x23,#0x8
0097bfd4	ldaxr x9,[x8]
0097bfd8	sub x10,x9,#0x1
0097bfdc	stlxr w11,x10,[x8]
0097bfe0	cbnz w11,0x0097bfd4
0097bfe4	cbnz x9,0x0097c000
0097bfe8	ldr x8,[x23]
0097bfec	mov x0,x23
0097bff0	ldr x8,[x8, #0x10]
0097bff4	blr x8
0097bff8	mov x0,x23
0097bffc	bl 0x00c2ff00
0097c000	ldp x9,x8,[sp, #0x30]
0097c004	stp x9,x8,[sp]
0097c008	cbz x8,0x0097c020
0097c00c	add x8,x8,#0x8
0097c010	ldxr x9,[x8]
0097c014	add x9,x9,#0x1
0097c018	stxr w10,x9,[x8]
0097c01c	cbnz w10,0x0097c010
0097c020	mov x0,sp
0097c024	mov x1,x22
0097c028	bl 0x00c32f40
0097c02c	ldr x23,[sp, #0x8]
0097c030	mov w22,w0
0097c034	cbz x23,0x0097c050
0097c038	add x8,x23,#0x8
0097c03c	ldaxr x9,[x8]
0097c040	sub x10,x9,#0x1
0097c044	stlxr w11,x10,[x8]
0097c048	cbnz w11,0x0097c03c
0097c04c	cbz x9,0x0097c1ac
0097c050	tbnz w22,#0x0,0x0097c1c8
0097c054	adrp x9,0x2c9000
0097c058	add x9,x9,#0x227
0097c05c	ldr q0,[x9]
0097c060	mov w9,#0x6e6f
0097c064	mov w8,#0x28
0097c068	movk w9,#0x6573, LSL #16
0097c06c	stp xzr,xzr,[sp, #0x68]
0097c070	str xzr,[sp, #0x78]
0097c074	strb w8,[sp, #0x68]
0097c078	stur w9,[sp, #0x79]
0097c07c	stur q0,[sp, #0x69]
0097c080	strb wzr,[sp, #0x7d]
0097c084	add x1,sp,#0x68
0097c088	mov x0,x21
0097c08c	bl 0x00c33360
0097c090	ldrb w8,[sp, #0x68]
0097c094	tbz w8,#0x0,0x0097c1c8
0097c098	ldr x0,[sp, #0x78]
0097c09c	bl 0x00c301d0
0097c0a0	ldr x21,[sp, #0x38]
0097c0a4	cbnz x21,0x0097c1d0
0097c0a8	b 0x0097c200
0097c0ac	ldrb w8,[sp, #0x68]
0097c0b0	tbnz w8,#0x0,0x0097bf20
0097c0b4	cbz w25,0x0097bf2c
0097c0b8	ldr x8,[x22]
0097c0bc	str xzr,[x22]
0097c0c0	str x8,[sp, #0x60]
0097c0c4	ldr x8,[x20]
0097c0c8	str x8,[sp, #0x50]
0097c0cc	ldr x8,[x20, #0x8]
0097c0d0	str x8,[sp, #0x58]
0097c0d4	cbz x8,0x0097c0ec
0097c0d8	add x8,x8,#0x8
0097c0dc	ldxr x9,[x8]
0097c0e0	add x9,x9,#0x1
0097c0e4	stxr w10,x9,[x8]
0097c0e8	cbnz w10,0x0097c0dc
0097c0ec	stp x23,x19,[sp, #0x40]
0097c0f0	cbz x19,0x0097c108
0097c0f4	add x8,x19,#0x8
0097c0f8	ldxr x9,[x8]
0097c0fc	add x9,x9,#0x1
0097c100	stxr w10,x9,[x8]
0097c104	cbnz w10,0x0097c0f8
0097c108	add x1,sp,#0x60
0097c10c	add x2,sp,#0x50
0097c110	add x3,sp,#0x40
0097c114	mov x0,x21
0097c118	bl 0x00c33370
0097c11c	ldr x21,[sp, #0x48]
0097c120	cbz x21,0x0097c154
0097c124	add x8,x21,#0x8
0097c128	ldaxr x9,[x8]
0097c12c	sub x10,x9,#0x1
0097c130	stlxr w11,x10,[x8]
0097c134	cbnz w11,0x0097c128
0097c138	cbnz x9,0x0097c154
0097c13c	ldr x8,[x21]
0097c140	mov x0,x21
0097c144	ldr x8,[x8, #0x10]
0097c148	blr x8
0097c14c	mov x0,x21
0097c150	bl 0x00c2ff00
0097c154	ldr x21,[sp, #0x58]
0097c158	cbz x21,0x0097c18c
0097c15c	add x8,x21,#0x8
0097c160	ldaxr x9,[x8]
0097c164	sub x10,x9,#0x1
0097c168	stlxr w11,x10,[x8]
0097c16c	cbnz w11,0x0097c160
0097c170	cbnz x9,0x0097c18c
0097c174	ldr x8,[x21]
0097c178	mov x0,x21
0097c17c	ldr x8,[x8, #0x10]
0097c180	blr x8
0097c184	mov x0,x21
0097c188	bl 0x00c2ff00
0097c18c	ldr x0,[sp, #0x60]
0097c190	str xzr,[sp, #0x60]
0097c194	cbz x0,0x0097c200
0097c198	ldr x8,[x0]
0097c19c	ldr x8,[x8, #0x8]
0097c1a0	blr x8
0097c1a4	cbnz x19,0x0097c204
0097c1a8	b 0x0097c234
0097c1ac	ldr x8,[x23]
0097c1b0	mov x0,x23
0097c1b4	ldr x8,[x8, #0x10]
0097c1b8	blr x8
0097c1bc	mov x0,x23
0097c1c0	bl 0x00c2ff00
0097c1c4	tbz w22,#0x0,0x0097c054
0097c1c8	ldr x21,[sp, #0x38]
0097c1cc	cbz x21,0x0097c200
0097c1d0	add x8,x21,#0x8
0097c1d4	ldaxr x9,[x8]
0097c1d8	sub x10,x9,#0x1
0097c1dc	stlxr w11,x10,[x8]
0097c1e0	cbnz w11,0x0097c1d4
0097c1e4	cbnz x9,0x0097c200
0097c1e8	ldr x8,[x21]
0097c1ec	mov x0,x21
0097c1f0	ldr x8,[x8, #0x10]
0097c1f4	blr x8
0097c1f8	mov x0,x21
0097c1fc	bl 0x00c2ff00
0097c200	cbz x19,0x0097c234
0097c204	add x8,x19,#0x8
0097c208	ldaxr x9,[x8]
0097c20c	sub x10,x9,#0x1
0097c210	stlxr w11,x10,[x8]
0097c214	cbnz w11,0x0097c208
0097c218	cbnz x9,0x0097c234
0097c21c	ldr x8,[x19]
0097c220	mov x0,x19
0097c224	ldr x8,[x8, #0x10]
0097c228	blr x8
0097c22c	mov x0,x19
0097c230	bl 0x00c2ff00
0097c234	ldr x0,[x20]
0097c238	bl 0x00c32e50
0097c23c	ldr x19,[sp, #0xa8]
0097c240	cbz x19,0x0097c25c
0097c244	add x8,x19,#0x8
0097c248	ldaxr x9,[x8]
0097c24c	sub x10,x9,#0x1
0097c250	stlxr w11,x10,[x8]
0097c254	cbnz w11,0x0097c248
0097c258	cbz x9,0x0097c298
0097c25c	ldrb w8,[sp, #0x88]
0097c260	tbz w8,#0x0,0x0097c26c
0097c264	ldr x0,[sp, #0x98]
0097c268	bl 0x00c301d0
0097c26c	ldr x8,[x24, #0x28]
0097c270	ldur x9,[x29, #-0x48]
0097c274	cmp x8,x9
0097c278	b.ne 0x0097c2bc
0097c27c	ldp x29,x30,[sp, #0x100]
0097c280	ldp x20,x19,[sp, #0xf0]
0097c284	ldp x22,x21,[sp, #0xe0]
0097c288	ldp x24,x23,[sp, #0xd0]
0097c28c	ldp x28,x25,[sp, #0xc0]
0097c290	add sp,sp,#0x110
0097c294	ret
0097c298	ldr x8,[x19]
0097c29c	mov x0,x19
0097c2a0	ldr x8,[x8, #0x10]
0097c2a4	blr x8
0097c2a8	mov x0,x19
0097c2ac	bl 0x00c2ff00
0097c2b0	ldrb w8,[sp, #0x88]
0097c2b4	tbnz w8,#0x0,0x0097c264
0097c2b8	b 0x0097c26c
0097c2bc	bl 0x00c2fec0
0097c2c0	mov w0,#0x8
0097c2c4	bl 0x00c30000
0097c2c8	adrp x8,0xcb4000
0097c2cc	ldr x8,[x8, #0xb50]
0097c2d0	add x8,x8,#0x10
0097c2d4	str x8,[x0]
0097c2d8	adrp x1,0xcb4000
0097c2dc	adrp x2,0xcb4000
0097c2e0	ldr x1,[x1, #0xb58]
0097c2e4	ldr x2,[x2, #0xb38]
0097c2e8	bl 0x00c30020
