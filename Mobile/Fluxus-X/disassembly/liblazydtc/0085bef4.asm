; FUN_0085bef4 @ 0085bef4
0085bef4	sub sp,sp,#0xc0
0085bef8	stp x29,x30,[sp, #0x70]
0085befc	stp x26,x25,[sp, #0x80]
0085bf00	stp x24,x23,[sp, #0x90]
0085bf04	stp x22,x21,[sp, #0xa0]
0085bf08	stp x20,x19,[sp, #0xb0]
0085bf0c	add x29,sp,#0x70
0085bf10	mrs x24,tpidr_el0
0085bf14	mov x19,x0
0085bf18	ldr x8,[x24, #0x28]
0085bf1c	stur x8,[x29, #-0x8]
0085bf20	ldur q0,[x0, #0x94]
0085bf24	str q0,[sp]
0085bf28	bl 0x00858f2c
0085bf2c	ldr x8,[x19, #0x2a8]
0085bf30	ldr x9,[x19, #0x2a0]
0085bf34	ldr x10,[x19, #0x458]
0085bf38	ldr x11,[x19, #0x450]
0085bf3c	stur xzr,[x29, #-0x10]
0085bf40	sub x8,x8,x9
0085bf44	add x9,x19,#0x2a0
0085bf48	str xzr,[sp, #0x48]
0085bf4c	asr x8,x8,#0x3
0085bf50	sub x10,x10,x11
0085bf54	add x11,x19,#0x450
0085bf58	stp x9,x8,[x29, #-0x20]
0085bf5c	ldr w8,[x19, #0x90]
0085bf60	asr x9,x10,#0x3
0085bf64	stp x11,x9,[sp, #0x38]
0085bf68	sub w9,w8,#0x126
0085bf6c	cmp w9,#0x10
0085bf70	b.hi 0x0085c03c
0085bf74	mov w10,#0x1
0085bf78	lsl w9,w10,w9
0085bf7c	mov w10,#0x7
0085bf80	movk w10,#0x1, LSL #16
0085bf84	tst w9,w10
0085bf88	b.eq 0x0085c03c
0085bf8c	mov x22,x19
0085bf90	ldr q0,[sp]
0085bf94	mov x20,xzr
0085bf98	ldr x8,[x22, #0xe8]!
0085bf9c	mov x0,xzr
0085bfa0	str q0,[sp, #0x20]
0085bfa4	stp x0,x20,[sp, #0x10]
0085bfa8	mov x0,x8
0085bfac	mov w1,#0x30
0085bfb0	bl 0x0084e938
0085bfb4	add x1,sp,#0x20
0085bfb8	add x2,sp,#0x10
0085bfbc	mov x20,x0
0085bfc0	bl 0x0084fd10
0085bfc4	ldrb w8,[x19, #0x68]
0085bfc8	cmp w8,#0x1
0085bfcc	b.ne 0x0085c120
0085bfd0	ldr x21,[sp, #0x48]
0085bfd4	ldr x22,[x22]
0085bfd8	cbz x21,0x0085c0ec
0085bfdc	ldp x8,x26,[sp, #0x38]
0085bfe0	lsl x1,x21,#0x3
0085bfe4	ldr x25,[x8]
0085bfe8	mov x0,x22
0085bfec	bl 0x0084e938
0085bff0	mov x23,x0
0085bff4	cmp x21,#0x8
0085bff8	b.cc 0x0085c010
0085bffc	lsl x8,x26,#0x3
0085c000	add x10,x8,x25
0085c004	sub x8,x23,x10
0085c008	cmp x8,#0x20
0085c00c	b.cs 0x0085c204
0085c010	mov x8,xzr
0085c014	lsl x10,x8,#0x3
0085c018	sub x8,x21,x8
0085c01c	add x9,x10,x26, LSL #0x3
0085c020	add x10,x23,x10
0085c024	add x9,x25,x9
0085c028	ldr x11,[x9], #0x8
0085c02c	subs x8,x8,#0x1
0085c030	str x11,[x10], #0x8
0085c034	b.ne 0x0085c028
0085c038	b 0x0085c0f0
0085c03c	cbz w8,0x0085bf8c
0085c040	cmp w8,#0x3b
0085c044	b.eq 0x0085bf8c
0085c048	ldrb w8,[x19, #0x68]
0085c04c	cmp w8,#0x0
0085c050	add x8,sp,#0x38
0085c054	csel x2,x8,xzr,ne
0085c058	sub x1,x29,#0x20
0085c05c	mov x0,x19
0085c060	bl 0x00861848
0085c064	ldur x20,[x29, #-0x10]
0085c068	cbz x20,0x0085bf8c
0085c06c	ldp x8,x21,[x29, #-0x20]
0085c070	mov x22,x19
0085c074	ldr q0,[sp]
0085c078	ldr x0,[x22, #0xe8]!
0085c07c	lsl x1,x20,#0x3
0085c080	ldr x9,[x8, #0x8]
0085c084	ldur x9,[x9, #-0x8]
0085c088	str d0,[sp, #0x20]
0085c08c	ldur x9,[x9, #0x14]
0085c090	str x9,[sp, #0x28]
0085c094	ldr x23,[x8]
0085c098	mov x25,x0
0085c09c	bl 0x0084e938
0085c0a0	cmp x20,#0x8
0085c0a4	mov x8,x25
0085c0a8	b.cc 0x0085c0c0
0085c0ac	lsl x9,x21,#0x3
0085c0b0	add x11,x9,x23
0085c0b4	sub x9,x0,x11
0085c0b8	cmp x9,#0x20
0085c0bc	b.cs 0x0085c238
0085c0c0	mov x9,xzr
0085c0c4	lsl x11,x9,#0x3
0085c0c8	sub x9,x20,x9
0085c0cc	add x10,x11,x21, LSL #0x3
0085c0d0	add x11,x0,x11
0085c0d4	add x10,x23,x10
0085c0d8	ldr x12,[x10], #0x8
0085c0dc	subs x9,x9,#0x1
0085c0e0	str x12,[x11], #0x8
0085c0e4	b.ne 0x0085c0d8
0085c0e8	b 0x0085bfa4
0085c0ec	mov x23,xzr
0085c0f0	mov x0,x22
0085c0f4	mov w1,#0x18
0085c0f8	bl 0x0084e938
0085c0fc	mov x1,x23
0085c100	mov x2,x21
0085c104	mov x22,x0
0085c108	bl 0x00851f20
0085c10c	str x20,[sp, #0x20]
0085c110	add x0,x19,#0x4b0
0085c114	add x1,sp,#0x20
0085c118	bl 0x00860fa0
0085c11c	str x22,[x0]
0085c120	adrp x8,0xd1e000
0085c124	ldrb w8,[x8, #0xc40]
0085c128	cmp w8,#0x1
0085c12c	b.ne 0x0085c164
0085c130	ldp x9,x8,[x19, #0x158]
0085c134	sub x8,x8,x9
0085c138	cmp x8,#0x8
0085c13c	b.ne 0x0085c164
0085c140	ldr x8,[x19, #0x228]
0085c144	cbz x8,0x0085c15c
0085c148	adrp x2,0x2a1000
0085c14c	add x2,x2,#0x4c7
0085c150	add x1,x20,#0xc
0085c154	mov x0,x19
0085c158	bl 0x00860ecc
0085c15c	mov w8,#0x1
0085c160	strb w8,[x19, #0x238]
0085c164	ldp x22,x9,[sp, #0x38]
0085c168	ldp x10,x8,[x22]
0085c16c	add x19,x10,x9, LSL #0x3
0085c170	cmp x19,x8
0085c174	b.eq 0x0085c19c
0085c178	sub x9,x8,x19
0085c17c	add x1,x19,x9
0085c180	subs x21,x8,x1
0085c184	b.eq 0x0085c194
0085c188	mov x0,x19
0085c18c	mov x2,x21
0085c190	bl 0x00c2ff60
0085c194	add x8,x19,x21
0085c198	str x8,[x22, #0x8]
0085c19c	ldp x22,x9,[x29, #-0x20]
0085c1a0	ldp x10,x8,[x22]
0085c1a4	add x19,x10,x9, LSL #0x3
0085c1a8	cmp x19,x8
0085c1ac	b.eq 0x0085c1d4
0085c1b0	sub x9,x8,x19
0085c1b4	add x1,x19,x9
0085c1b8	subs x21,x8,x1
0085c1bc	b.eq 0x0085c1cc
0085c1c0	mov x0,x19
0085c1c4	mov x2,x21
0085c1c8	bl 0x00c2ff60
0085c1cc	add x8,x19,x21
0085c1d0	str x8,[x22, #0x8]
0085c1d4	ldr x8,[x24, #0x28]
0085c1d8	ldur x9,[x29, #-0x8]
0085c1dc	cmp x8,x9
0085c1e0	b.ne 0x0085c308
0085c1e4	mov x0,x20
0085c1e8	ldp x20,x19,[sp, #0xb0]
0085c1ec	ldp x22,x21,[sp, #0xa0]
0085c1f0	ldp x24,x23,[sp, #0x90]
0085c1f4	ldp x26,x25,[sp, #0x80]
0085c1f8	ldp x29,x30,[sp, #0x70]
0085c1fc	add sp,sp,#0xc0
0085c200	ret
0085c204	and x8,x21,#-0x4
0085c208	add x9,x23,#0x10
0085c20c	add x10,x10,#0x10
0085c210	mov x11,x8
0085c214	ldp q0,q1,[x10, #-0x10]
0085c218	subs x11,x11,#0x4
0085c21c	add x10,x10,#0x20
0085c220	stp q0,q1,[x9, #-0x10]
0085c224	add x9,x9,#0x20
0085c228	b.ne 0x0085c214
0085c22c	cmp x21,x8
0085c230	b.eq 0x0085c0f0
0085c234	b 0x0085c014
0085c238	and x9,x20,#-0x4
0085c23c	add x10,x0,#0x10
0085c240	add x11,x11,#0x10
0085c244	mov x12,x9
0085c248	ldp q0,q1,[x11, #-0x10]
0085c24c	subs x12,x12,#0x4
0085c250	add x11,x11,#0x20
0085c254	stp q0,q1,[x10, #-0x10]
0085c258	add x10,x10,#0x20
0085c25c	b.ne 0x0085c248
0085c260	cmp x20,x9
0085c264	b.eq 0x0085bfa4
0085c268	b 0x0085c0c4
0085c308	bl 0x00c2fec0
