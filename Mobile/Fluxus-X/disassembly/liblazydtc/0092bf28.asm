; FUN_0092bf28 @ 0092bf28
0092bf28	sub sp,sp,#0x160
0092bf2c	stp x28,x27,[sp, #0x100]
0092bf30	stp x26,x25,[sp, #0x110]
0092bf34	stp x24,x23,[sp, #0x120]
0092bf38	stp x22,x21,[sp, #0x130]
0092bf3c	stp x20,x19,[sp, #0x140]
0092bf40	stp x29,x30,[sp, #0x150]
0092bf44	add x29,sp,#0x150
0092bf48	mrs x28,tpidr_el0
0092bf4c	ldr x8,[x28, #0x28]
0092bf50	mov w23,w6
0092bf54	mov w20,w5
0092bf58	mov x21,x4
0092bf5c	mov w25,w3
0092bf60	mov w22,w2
0092bf64	mov x24,x1
0092bf68	mov x19,x0
0092bf6c	str x8,[sp, #0x20]
0092bf70	cbz x0,0x0092bffc
0092bf74	ldr w8,[x19]
0092bf78	mov w9,#0xab1e
0092bf7c	movk w9,#0xb, LSL #16
0092bf80	cmp w8,w9
0092bf84	b.ne 0x0092bffc
0092bf88	ldrb w8,[x19, #0x231]
0092bf8c	tbnz w8,#0x2,0x0092c034
0092bf90	tbnz w25,#0x1f,0x0092c03c
0092bf94	add x0,sp,#0x28
0092bf98	add x1,sp,#0x80
0092bf9c	mov w2,#0xa
0092bfa0	sub x26,x29,#0x80
0092bfa4	bl 0x00934a74
0092bfa8	movi v0.2D,#0x0
0092bfac	stp q0,q0,[x26]
0092bfb0	ldr x26,[x19, #0x8]
0092bfb4	cbz x26,0x0092bfdc
0092bfb8	sub x1,x29,#0x80
0092bfbc	mov x0,x26
0092bfc0	bl 0x0092bcf8
0092bfc4	add x0,sp,#0x28
0092bfc8	sub x1,x29,#0x80
0092bfcc	bl 0x00934ba4
0092bfd0	cbnz w0,0x0092bfec
0092bfd4	ldr x26,[x26, #0x10]
0092bfd8	cbnz x26,0x0092bfb8
0092bfdc	add x0,x19,#0x158
0092bfe0	add x1,sp,#0x28
0092bfe4	bl 0x00910d9c
0092bfe8	cbz w0,0x0092c044
0092bfec	orr w21,wzr,#0x3
0092bff0	add x0,sp,#0x28
0092bff4	bl 0x00934a90
0092bff8	b 0x0092c000
0092bffc	mov w21,#0x1
0092c000	ldr x8,[x28, #0x28]
0092c004	ldr x9,[sp, #0x20]
0092c008	cmp x8,x9
0092c00c	b.ne 0x0092c31c
0092c010	mov w0,w21
0092c014	ldp x29,x30,[sp, #0x150]
0092c018	ldp x20,x19,[sp, #0x140]
0092c01c	ldp x22,x21,[sp, #0x130]
0092c020	ldp x24,x23,[sp, #0x120]
0092c024	ldp x26,x25,[sp, #0x110]
0092c028	ldp x28,x27,[sp, #0x100]
0092c02c	add sp,sp,#0x160
0092c030	ret
0092c034	mov w21,#0x8
0092c038	b 0x0092c000
0092c03c	mov w21,#0xa
0092c040	b 0x0092c000
0092c044	ldr w8,[sp, #0x30]
0092c048	str x8,[sp, #0x10]
0092c04c	mov w8,w22
0092c050	str x8,[sp, #0x18]
0092c054	cbz w22,0x0092c08c
0092c058	mov x26,xzr
0092c05c	add x27,x24,#0x4
0092c060	ldrh w8,[x27]
0092c064	ldur w1,[x27, #-0x4]
0092c068	add x0,sp,#0x28
0092c06c	and w2,w8,#0x7
0092c070	bl 0x00934ad0
0092c074	cbnz w0,0x0092bfec
0092c078	ldr x8,[sp, #0x18]
0092c07c	add x26,x26,#0x1
0092c080	add x27,x27,#0x8
0092c084	cmp x26,x8
0092c088	b.cc 0x0092c060
0092c08c	tbz w23,#0x0,0x0092c0ac
0092c090	ldr w1,[x19, #0x220]
0092c094	cmn w1,#0x1
0092c098	b.eq 0x0092c0ac
0092c09c	add x0,sp,#0x28
0092c0a0	mov w2,#0x1
0092c0a4	bl 0x00934ad0
0092c0a8	cbnz w0,0x0092bfec
0092c0ac	ldrb w8,[x19, #0x231]
0092c0b0	mov w26,#0xab1e
0092c0b4	mov x9,xzr
0092c0b8	movk w26,#0xb, LSL #16
0092c0bc	tbnz w8,#0x4,0x0092c130
0092c0c0	ldr x8,[x19, #0xd0]
0092c0c4	cbz x8,0x0092c12c
0092c0c8	bl 0x00941cb8
0092c0cc	ldr x2,[x19, #0xd0]
0092c0d0	mov x27,x0
0092c0d4	str x1,[sp, #0x8]
0092c0d8	mov x0,xzr
0092c0dc	mov x1,xzr
0092c0e0	bl 0x00941308
0092c0e4	str x0,[x19, #0xd0]
0092c0e8	ldr x8,[x0, #0x20]
0092c0ec	mov x9,xzr
0092c0f0	cmp x8,x27
0092c0f4	b.lt 0x0092c130
0092c0f8	b.gt 0x0092c110
0092c0fc	ldr w9,[x0, #0x28]
0092c100	ldr x10,[sp, #0x8]
0092c104	cmp w9,w10
0092c108	mov x9,xzr
0092c10c	b.le 0x0092c130
0092c110	ldr x1,[x0, #0x28]
0092c114	ldr x3,[sp, #0x8]
0092c118	mov x0,x8
0092c11c	mov x2,x27
0092c120	bl 0x00941dc4
0092c124	mov x9,x0
0092c128	b 0x0092c130
0092c12c	mov x9,#-0x1
0092c130	ldr w1,[sp, #0x30]
0092c134	cmp x9,w25, SXTW 
0092c138	mov x8,#-0x1
0092c13c	ccmp x9,x8,#0x4,lt
0092c140	csel w27,w9,w25,gt
0092c144	cbz w1,0x0092c24c
0092c148	ldr x0,[sp, #0x28]
0092c14c	sxtw x2,w27
0092c150	bl 0x0093475c
0092c154	mov w25,w0
0092c158	tbnz w0,#0x1f,0x0092c2f4
0092c15c	cbz w25,0x0092c250
0092c160	ldr x15,[sp, #0x10]
0092c164	cbz w22,0x0092c1ec
0092c168	ldr x8,[sp, #0x28]
0092c16c	cmp w22,#0x3
0092c170	mov x9,xzr
0092c174	b.cc 0x0092c1bc
0092c178	ldr x9,[sp, #0x18]
0092c17c	add x10,x8,x15, LSL #0x3
0092c180	add x10,x10,#0xe
0092c184	add x11,x24,#0xe
0092c188	and x9,x9,#0xfffffffe
0092c18c	mov x12,x9
0092c190	ldurh w13,[x10, #-0x8]
0092c194	ldrh w14,[x10], #0x10
0092c198	subs x12,x12,#0x2
0092c19c	and w13,w13,#0x7
0092c1a0	and w14,w14,#0x7
0092c1a4	sturh w13,[x11, #-0x8]
0092c1a8	strh w14,[x11], #0x10
0092c1ac	b.ne 0x0092c190
0092c1b0	ldr x10,[sp, #0x18]
0092c1b4	cmp x9,x10
0092c1b8	b.eq 0x0092c1ec
0092c1bc	ldr x10,[sp, #0x18]
0092c1c0	add x12,x9,x15
0092c1c4	add x11,x24,x9, LSL #0x3
0092c1c8	add x8,x8,x12, LSL #0x3
0092c1cc	sub x10,x10,x9
0092c1d0	add x9,x11,#0x6
0092c1d4	add x8,x8,#0x6
0092c1d8	ldrh w11,[x8], #0x8
0092c1dc	subs x10,x10,#0x1
0092c1e0	and w11,w11,#0x7
0092c1e4	strh w11,[x9], #0x8
0092c1e8	b.ne 0x0092c1d8
0092c1ec	tbz w23,#0x0,0x0092c250
0092c1f0	ldr w0,[x19, #0x220]
0092c1f4	cmn w0,#0x1
0092c1f8	b.eq 0x0092c250
0092c1fc	ldr x8,[sp, #0x28]
0092c200	add w9,w15,w22
0092c204	add x8,x8,w9, UXTW  #0x3
0092c208	ldrb w8,[x8, #0x6]
0092c20c	tbnz w8,#0x0,0x0092c218
0092c210	b 0x0092c250
0092c214	ldr w0,[x19, #0x220]
0092c218	add x1,sp,#0x40
0092c21c	mov w2,#0x40
0092c220	bl 0x00c31ef0
0092c224	cmp x0,#0x0
0092c228	b.gt 0x0092c214
0092c22c	tbz x0,#0x3f,0x0092c240
0092c230	bl 0x00c30710
0092c234	ldr w8,[x0]
0092c238	cmp w8,#0x4
0092c23c	b.eq 0x0092c214
0092c240	sub w25,w25,#0x1
0092c244	cbnz x21,0x0092c254
0092c248	b 0x0092c258
0092c24c	mov w25,wzr
0092c250	cbz x21,0x0092c258
0092c254	str w25,[x21]
0092c258	ldr w8,[sp, #0x30]
0092c25c	cbnz w8,0x0092c314
0092c260	mov w21,wzr
0092c264	tbz w20,#0x0,0x0092bff0
0092c268	ldr w8,[x19]
0092c26c	mov w21,wzr
0092c270	cmp w8,w26
0092c274	b.ne 0x0092bff0
0092c278	ldrb w8,[x19, #0x231]
0092c27c	mov w9,#0x14
0092c280	mov w21,wzr
0092c284	tst w8,w9
0092c288	b.ne 0x0092bff0
0092c28c	ldr x8,[x19, #0xd0]
0092c290	cbz x8,0x0092c2fc
0092c294	bl 0x00941cb8
0092c298	ldr x2,[x19, #0xd0]
0092c29c	mov x20,x0
0092c2a0	mov x22,x1
0092c2a4	mov x0,xzr
0092c2a8	mov x1,xzr
0092c2ac	bl 0x00941308
0092c2b0	str x0,[x19, #0xd0]
0092c2b4	ldr x8,[x0, #0x20]
0092c2b8	mov w21,wzr
0092c2bc	cmp x8,x20
0092c2c0	b.lt 0x0092bff0
0092c2c4	b.gt 0x0092c2d8
0092c2c8	ldr w9,[x0, #0x28]
0092c2cc	mov w21,wzr
0092c2d0	cmp w9,w22
0092c2d4	b.le 0x0092bff0
0092c2d8	ldr x1,[x0, #0x28]
0092c2dc	mov x0,x8
0092c2e0	mov x2,x20
0092c2e4	mov x3,x22
0092c2e8	bl 0x00941dc4
0092c2ec	cbnz x0,0x0092c300
0092c2f0	b 0x0092c314
0092c2f4	orr w21,wzr,#0xc
0092c2f8	b 0x0092bff0
0092c2fc	mov x0,#-0x1
0092c300	sxtw x8,w27
0092c304	cmp x0,#0x0
0092c308	ccmp x0,x8,#0x0,ge
0092c30c	csel x0,x8,x0,gt
0092c310	bl 0x009344cc
0092c314	mov w21,wzr
0092c318	b 0x0092bff0
0092c31c	bl 0x00c2fec0
