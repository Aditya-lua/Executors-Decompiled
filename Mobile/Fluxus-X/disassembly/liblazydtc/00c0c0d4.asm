; FUN_00c0c0d4 @ 00c0c0d4
00c0c0d4	paciasp
00c0c0d8	stp x29,x30,[sp, #-0x50]!
00c0c0dc	str x25,[sp, #0x10]
00c0c0e0	stp x24,x23,[sp, #0x20]
00c0c0e4	stp x22,x21,[sp, #0x30]
00c0c0e8	stp x20,x19,[sp, #0x40]
00c0c0ec	mov x29,sp
00c0c0f0	cmp x0,x1
00c0c0f4	mov x19,x2
00c0c0f8	b.eq 0x00c0c184
00c0c0fc	mov w22,w3
00c0c100	mov x20,x1
00c0c104	mov x23,x0
00c0c108	bl 0x00c30710
00c0c10c	ldr w24,[x0]
00c0c110	str wzr,[x0]
00c0c114	adrp x8,0xd27000
00c0c118	add x8,x8,#0xf8
00c0c11c	mov x21,x0
00c0c120	adrp x25,0xd27000
00c0c124	ldarb w8,[x8]
00c0c128	tbz w8,#0x0,0x00c0c1ac
00c0c12c	ldr x3,[x25, #0xf0]
00c0c130	add x1,x29,#0x18
00c0c134	mov x0,x23
00c0c138	mov w2,w22
00c0c13c	bl 0x00c43930
00c0c140	ldr w8,[x21]
00c0c144	cbz w8,0x00c0c174
00c0c148	ldr x9,[x29, #0x18]
00c0c14c	cmp x9,x20
00c0c150	b.ne 0x00c0c184
00c0c154	cmp w8,#0x22
00c0c158	b.ne 0x00c0c190
00c0c15c	mov w8,#0x4
00c0c160	cmp x0,#0x0
00c0c164	mov x9,#0x7fffffffffffffff
00c0c168	str w8,[x19]
00c0c16c	cinv x0,x9,le
00c0c170	b 0x00c0c190
00c0c174	ldr x8,[x29, #0x18]
00c0c178	str w24,[x21]
00c0c17c	cmp x8,x20
00c0c180	b.eq 0x00c0c190
00c0c184	mov x0,xzr
00c0c188	mov w8,#0x4
00c0c18c	str w8,[x19]
00c0c190	ldp x20,x19,[sp, #0x40]
00c0c194	ldr x25,[sp, #0x10]
00c0c198	ldp x22,x21,[sp, #0x30]
00c0c19c	ldp x24,x23,[sp, #0x20]
00c0c1a0	ldp x29,x30,[sp], #0x50
00c0c1a4	autiasp
00c0c1a8	ret
00c0c1ac	adrp x0,0xd27000
00c0c1b0	add x0,x0,#0xf8
00c0c1b4	bl 0x00c2fe90
00c0c1b8	cbz w0,0x00c0c12c
00c0c1bc	adrp x1,0x2c6000
00c0c1c0	add x1,x1,#0xbfc
00c0c1c4	mov w0,#0x1fbf
00c0c1c8	mov x2,xzr
00c0c1cc	bl 0x00c43890
00c0c1d0	str x0,[x25, #0xf0]
00c0c1d4	adrp x0,0xd27000
00c0c1d8	add x0,x0,#0xf8
00c0c1dc	bl 0x00c2fea0
00c0c1e0	b 0x00c0c12c
