; X509_REQ_check_private_key @ 00b0c0d0
00b0c0d0	stp x20,x19,[sp, #-0x20]!
00b0c0d4	mov x20,x1
00b0c0d8	stp x29,x30,[sp, #0x10]
00b0c0dc	add x29,sp,#0x10
00b0c0e0	cbz x0,0x00b0c0f4
00b0c0e4	ldr x0,[x0, #0x28]
00b0c0e8	bl 0x00c39930
00b0c0ec	mov x19,x0
00b0c0f0	b 0x00b0c0f8
00b0c0f4	mov x19,xzr
00b0c0f8	mov x0,x19
00b0c0fc	mov x1,x20
00b0c100	bl 0x00c35f70
00b0c104	add w8,w0,#0x2
00b0c108	cmp w8,#0x3
00b0c10c	b.hi 0x00b0c1a0
00b0c110	adrp x9,0x77b000
00b0c114	add x9,x9,#0x7d4
00b0c118	ldrsw x8,[x9, x8, LSL #0x2]
00b0c11c	add x8,x8,x9
00b0c120	br x8
00b0c124	bl 0x00c342a0
00b0c128	adrp x0,0x2a4000
00b0c12c	adrp x2,0x2ae000
00b0c130	add x0,x0,#0xaf5
00b0c134	add x2,x2,#0x7d4
00b0c138	mov w1,#0x63
00b0c13c	bl 0x00c342b0
00b0c140	mov w0,#0xb
00b0c144	mov w1,#0x75
00b0c148	b 0x00b0c198
00b0c14c	bl 0x00c342a0
00b0c150	adrp x0,0x2a4000
00b0c154	adrp x2,0x2ae000
00b0c158	add x0,x0,#0xaf5
00b0c15c	add x2,x2,#0x7d4
00b0c160	orr w1,wzr,#0x60
00b0c164	bl 0x00c342b0
00b0c168	mov w0,#0xb
00b0c16c	mov w1,#0x73
00b0c170	b 0x00b0c198
00b0c174	bl 0x00c342a0
00b0c178	adrp x0,0x2a4000
00b0c17c	adrp x2,0x2ae000
00b0c180	add x0,x0,#0xaf5
00b0c184	add x2,x2,#0x7d4
00b0c188	mov w1,#0x5d
00b0c18c	bl 0x00c342b0
00b0c190	mov w0,#0xb
00b0c194	mov w1,#0x74
00b0c198	mov x2,xzr
00b0c19c	bl 0x00c342c0
00b0c1a0	mov w20,wzr
00b0c1a4	b 0x00b0c1ac
00b0c1a8	mov w20,#0x1
00b0c1ac	mov x0,x19
00b0c1b0	bl 0x00c32450
00b0c1b4	ldp x29,x30,[sp, #0x10]
00b0c1b8	mov w0,w20
00b0c1bc	ldp x20,x19,[sp], #0x20
00b0c1c0	ret
