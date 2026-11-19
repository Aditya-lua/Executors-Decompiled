; mbedtls_ecdsa_genkey @ 00b9c0fc
00b9c0fc	str x21,[sp, #-0x30]!
00b9c100	stp x20,x19,[sp, #0x10]
00b9c104	stp x29,x30,[sp, #0x20]
00b9c108	add x29,sp,#0x20
00b9c10c	mov x19,x3
00b9c110	mov x20,x2
00b9c114	mov x21,x0
00b9c118	bl 0x00c42800
00b9c11c	cbz w0,0x00b9c130
00b9c120	ldp x29,x30,[sp, #0x20]
00b9c124	ldp x20,x19,[sp, #0x10]
00b9c128	ldr x21,[sp], #0x30
00b9c12c	ret
00b9c130	mov x3,x20
00b9c134	mov x4,x19
00b9c138	ldp x29,x30,[sp, #0x20]
00b9c13c	ldp x20,x19,[sp, #0x10]
00b9c140	add x1,x21,#0xc0
00b9c144	add x2,x21,#0xd0
00b9c148	mov x0,x21
00b9c14c	ldr x21,[sp], #0x30
00b9c150	b 0x00c42660
