; FUN_0080c088 @ 0080c088
0080c088	sub sp,sp,#0x40
0080c08c	stp x29,x30,[sp, #0x10]
0080c090	stp x22,x21,[sp, #0x20]
0080c094	stp x20,x19,[sp, #0x30]
0080c098	add x29,sp,#0x10
0080c09c	mrs x22,tpidr_el0
0080c0a0	mov x21,x2
0080c0a4	mov x19,x1
0080c0a8	ldr x8,[x22, #0x28]
0080c0ac	mov x20,x0
0080c0b0	str x8,[sp, #0x8]
0080c0b4	ldrb w8,[x2, #0xf]
0080c0b8	cmp w8,#0x1
0080c0bc	b.ne 0x0080c120
0080c0c0	ldr s0,[x21, #0x8]
0080c0c4	adrp x8,0x29a000
0080c0c8	adrp x9,0x29b000
0080c0cc	ldr d1,[x8, #0x420]
0080c0d0	ldr d2,[x21]
0080c0d4	ldr d3,[x9, #0x9a0]
0080c0d8	uxtl v0.8H,v0.8B
0080c0dc	ldrb w8,[x21, #0xc]
0080c0e0	mov w9,#0x6b
0080c0e4	ldrb w10,[x21, #0xd]
0080c0e8	mov w11,#0x1d
0080c0ec	strb wzr,[x21, #0xf]
0080c0f0	eor w8,w8,w9
0080c0f4	ldrb w9,[x21, #0xe]
0080c0f8	eor v0.8B,v0.8B,v1.8B
0080c0fc	eor v1.8B,v2.8B,v3.8B
0080c100	eor w10,w10,w11
0080c104	strb w8,[x21, #0xc]
0080c108	eor w8,w9,#0x1
0080c10c	strb w10,[x21, #0xd]
0080c110	uzp1 v0.8B,v0.8B,v0.8B
0080c114	strb w8,[x21, #0xe]
0080c118	str d1,[x21]
0080c11c	str s0,[x21, #0x8]
0080c120	mov x0,x20
0080c124	mov x1,x19
0080c128	mov x2,x21
0080c12c	mov w3,wzr
0080c130	mov x4,xzr
0080c134	bl 0x008ac76c
0080c138	mov x0,x20
0080c13c	mov w1,#0xffffffff
0080c140	bl 0x008aa2e4
0080c144	ldr x8,[x0]
0080c148	adrp x0,0xd1b000
0080c14c	add x0,x0,#0x520
0080c150	mov x1,sp
0080c154	mov x2,sp
0080c158	str x8,[sp]
0080c15c	bl 0x00807f14
0080c160	adrp x0,0xcca000
0080c164	add x0,x0,#0x848
0080c168	mov x1,sp
0080c16c	mov x2,sp
0080c170	str x19,[sp]
0080c174	bl 0x0080837c
0080c178	mov x0,x20
0080c17c	mov w1,#0xffffd8ee
0080c180	mov x2,x21
0080c184	bl 0x008ad800
0080c188	ldr x8,[x22, #0x28]
0080c18c	ldr x9,[sp, #0x8]
0080c190	cmp x8,x9
0080c194	b.ne 0x0080c1ac
0080c198	ldp x20,x19,[sp, #0x30]
0080c19c	ldp x22,x21,[sp, #0x20]
0080c1a0	ldp x29,x30,[sp, #0x10]
0080c1a4	add sp,sp,#0x40
0080c1a8	ret
0080c1ac	bl 0x00c2fec0
