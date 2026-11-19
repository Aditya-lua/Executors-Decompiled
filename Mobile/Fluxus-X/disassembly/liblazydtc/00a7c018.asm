; EVP_PKEY_sign @ 00a7c018
00a7c018	str x23,[sp, #-0x40]!
00a7c01c	stp x22,x21,[sp, #0x10]
00a7c020	stp x20,x19,[sp, #0x20]
00a7c024	stp x29,x30,[sp, #0x30]
00a7c028	add x29,sp,#0x30
00a7c02c	cbz x0,0x00a7c070
00a7c030	ldr w8,[x0]
00a7c034	mov x23,x0
00a7c038	cmp w8,#0x10
00a7c03c	b.ne 0x00a7c09c
00a7c040	ldr x0,[x23, #0x30]
00a7c044	mov x19,x4
00a7c048	mov x20,x3
00a7c04c	mov x21,x2
00a7c050	mov x22,x1
00a7c054	cbz x0,0x00a7c0e0
00a7c058	ldr x8,[x23, #0x28]
00a7c05c	ldr x6,[x8, #0x40]
00a7c060	cbz x6,0x00a7c120
00a7c064	cbz x22,0x00a7c170
00a7c068	ldr x3,[x21]
00a7c06c	b 0x00a7c174
00a7c070	bl 0x00c342a0
00a7c074	adrp x0,0x2d1000
00a7c078	adrp x2,0x2d7000
00a7c07c	add x0,x0,#0xaf6
00a7c080	add x2,x2,#0xfc4
00a7c084	mov w1,#0x27d
00a7c088	bl 0x00c342b0
00a7c08c	mov w1,#0x102
00a7c090	orr w0,wzr,#0x6
00a7c094	movk w1,#0xc, LSL #16
00a7c098	b 0x00a7c0c0
00a7c09c	bl 0x00c342a0
00a7c0a0	adrp x0,0x2d1000
00a7c0a4	adrp x2,0x2d7000
00a7c0a8	add x0,x0,#0xaf6
00a7c0ac	add x2,x2,#0xfc4
00a7c0b0	mov w1,#0x282
00a7c0b4	bl 0x00c342b0
00a7c0b8	orr w0,wzr,#0x6
00a7c0bc	mov w1,#0x97
00a7c0c0	mov x2,xzr
00a7c0c4	bl 0x00c342c0
00a7c0c8	mov w0,#0xffffffff
00a7c0cc	ldp x29,x30,[sp, #0x30]
00a7c0d0	ldp x20,x19,[sp, #0x20]
00a7c0d4	ldp x22,x21,[sp, #0x10]
00a7c0d8	ldr x23,[sp], #0x40
00a7c0dc	ret
00a7c0e0	ldr x8,[x23, #0x78]
00a7c0e4	cbz x8,0x00a7c13c
00a7c0e8	ldr x5,[x8, #0x48]
00a7c0ec	cbz x5,0x00a7c13c
00a7c0f0	ldrb w8,[x8, #0x4]
00a7c0f4	tbnz w8,#0x1,0x00a7c198
00a7c0f8	mov x1,x22
00a7c0fc	mov x2,x21
00a7c100	mov x3,x20
00a7c104	mov x4,x19
00a7c108	ldp x29,x30,[sp, #0x30]
00a7c10c	ldp x20,x19,[sp, #0x20]
00a7c110	ldp x22,x21,[sp, #0x10]
00a7c114	mov x0,x23
00a7c118	ldr x23,[sp], #0x40
00a7c11c	br x5
00a7c120	bl 0x00c342a0
00a7c124	adrp x0,0x2d1000
00a7c128	adrp x2,0x2d7000
00a7c12c	add x0,x0,#0xaf6
00a7c130	add x2,x2,#0xfc4
00a7c134	mov w1,#0x28a
00a7c138	b 0x00a7c154
00a7c13c	bl 0x00c342a0
00a7c140	adrp x0,0x2d1000
00a7c144	adrp x2,0x2d7000
00a7c148	add x0,x0,#0xaf6
00a7c14c	add x2,x2,#0xfc4
00a7c150	mov w1,#0x295
00a7c154	bl 0x00c342b0
00a7c158	orr w0,wzr,#0x6
00a7c15c	mov w1,#0x96
00a7c160	mov x2,xzr
00a7c164	bl 0x00c342c0
00a7c168	orr w0,wzr,#0xfffffffe
00a7c16c	b 0x00a7c0cc
00a7c170	mov x3,xzr
00a7c174	mov x1,x22
00a7c178	mov x2,x21
00a7c17c	mov x4,x20
00a7c180	mov x5,x19
00a7c184	ldp x29,x30,[sp, #0x30]
00a7c188	ldp x20,x19,[sp, #0x20]
00a7c18c	ldp x22,x21,[sp, #0x10]
00a7c190	ldr x23,[sp], #0x40
00a7c194	br x6
00a7c198	ldr x0,[x23, #0x88]
00a7c19c	bl 0x00c36440
00a7c1a0	cbz w0,0x00a7c1e0
00a7c1a4	sxtw x8,w0
00a7c1a8	cbz x22,0x00a7c214
00a7c1ac	ldr x9,[x21]
00a7c1b0	cmp x9,x8
00a7c1b4	b.cs 0x00a7c220
00a7c1b8	bl 0x00c342a0
00a7c1bc	adrp x0,0x2d1000
00a7c1c0	adrp x2,0x2d7000
00a7c1c4	add x0,x0,#0xaf6
00a7c1c8	add x2,x2,#0xfc4
00a7c1cc	mov w1,#0x299
00a7c1d0	bl 0x00c342b0
00a7c1d4	orr w0,wzr,#0x6
00a7c1d8	mov w1,#0x9b
00a7c1dc	b 0x00a7c204
00a7c1e0	bl 0x00c342a0
00a7c1e4	adrp x0,0x2d1000
00a7c1e8	adrp x2,0x2d7000
00a7c1ec	add x0,x0,#0xaf6
00a7c1f0	add x2,x2,#0xfc4
00a7c1f4	mov w1,#0x299
00a7c1f8	bl 0x00c342b0
00a7c1fc	orr w0,wzr,#0x6
00a7c200	mov w1,#0xa3
00a7c204	mov x2,xzr
00a7c208	bl 0x00c342c0
00a7c20c	mov w0,wzr
00a7c210	b 0x00a7c0cc
00a7c214	mov w0,#0x1
00a7c218	str x8,[x21]
00a7c21c	b 0x00a7c0cc
00a7c220	ldr x8,[x23, #0x78]
00a7c224	ldr x5,[x8, #0x48]
00a7c228	b 0x00a7c0f8
