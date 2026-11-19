; FUN_00c2c114 @ 00c2c114
00c2c114	paciasp
00c2c118	sub sp,sp,#0xa0
00c2c11c	stp x29,x30,[sp, #0x50]
00c2c120	str x25,[sp, #0x60]
00c2c124	stp x24,x23,[sp, #0x70]
00c2c128	stp x22,x21,[sp, #0x80]
00c2c12c	stp x20,x19,[sp, #0x90]
00c2c130	add x29,sp,#0x50
00c2c134	mov x21,x1
00c2c138	mov x1,x0
00c2c13c	mov x20,x4
00c2c140	mov x0,x21
00c2c144	mov x19,x3
00c2c148	mov x22,x2
00c2c14c	bl 0x00c2c354
00c2c150	mov x0,x21
00c2c154	bl 0x00c2c578
00c2c158	cmp w0,#0x1
00c2c15c	b.lt 0x00c2c22c
00c2c160	mov w24,#0x1
00c2c164	mov w25,#0xfffffffe
00c2c168	b 0x00c2c19c
00c2c16c	mov x0,x21
00c2c170	bl 0x00c2c344
00c2c174	mov x23,x0
00c2c178	bl 0x00c2c334
00c2c17c	mov x8,x0
00c2c180	mov x0,x23
00c2c184	br x8
00c2c188	mov x0,x21
00c2c18c	bl 0x00c2c578
00c2c190	cmp w0,#0x0
00c2c194	sub w25,w25,#0x1
00c2c198	b.le 0x00c2c22c
00c2c19c	add x1,sp,#0x8
00c2c1a0	mov x0,x21
00c2c1a4	bl 0x00c2c58c
00c2c1a8	cbnz w0,0x00c2c248
00c2c1ac	ldr x2,[x22]
00c2c1b0	mov w0,#0x1
00c2c1b4	mov w1,#0xa
00c2c1b8	mov x3,x22
00c2c1bc	mov x4,x21
00c2c1c0	mov x5,x20
00c2c1c4	blr x19
00c2c1c8	cbnz w0,0x00c2c248
00c2c1cc	ldr x8,[sp, #0x20]
00c2c1d0	add w24,w24,#0x1
00c2c1d4	cbz x8,0x00c2c188
00c2c1d8	ldr x2,[x22]
00c2c1dc	mov w0,#0x1
00c2c1e0	mov w1,#0xa
00c2c1e4	mov x3,x22
00c2c1e8	mov x4,x21
00c2c1ec	blr x8
00c2c1f0	cmp w0,#0x8
00c2c1f4	b.eq 0x00c2c188
00c2c1f8	cmp w0,#0x7
00c2c1fc	b.ne 0x00c2c248
00c2c200	mov w16,#0x1
00c2c204	hint 0x28
00c2c208	cmp x16,#0x1
00c2c20c	b.eq 0x00c2c16c
00c2c210	cbz w24,0x00c2c16c
00c2c214	mov w8,w25
00c2c218	mov x9,xzr
00c2c21c	adds w8,w8,#0x1
00c2c220	sysl x9,0x3,0x7,0x7,0x1
00c2c224	b.cc 0x00c2c218
00c2c228	b 0x00c2c16c
00c2c22c	ldr x2,[x22]
00c2c230	mov w0,#0x1
00c2c234	mov w1,#0x1a
00c2c238	mov x3,x22
00c2c23c	mov x4,x21
00c2c240	mov x5,x20
00c2c244	blr x19
00c2c248	ldp x20,x19,[sp, #0x90]
00c2c24c	ldr x25,[sp, #0x60]
00c2c250	ldp x22,x21,[sp, #0x80]
00c2c254	ldp x24,x23,[sp, #0x70]
00c2c258	ldp x29,x30,[sp, #0x50]
00c2c25c	add sp,sp,#0xa0
00c2c260	autiasp
00c2c264	ret
