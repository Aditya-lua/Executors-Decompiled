; mbedtls_ecdsa_from_keypair @ 00b9c154
00b9c154	str x21,[sp, #-0x30]!
00b9c158	stp x20,x19,[sp, #0x10]
00b9c15c	stp x29,x30,[sp, #0x20]
00b9c160	add x29,sp,#0x20
00b9c164	mov x21,x1
00b9c168	mov x19,x0
00b9c16c	bl 0x00c426a0
00b9c170	mov w20,w0
00b9c174	cbnz w0,0x00b9c1a0
00b9c178	add x0,x19,#0xc0
00b9c17c	add x1,x21,#0xc0
00b9c180	bl 0x00c41b60
00b9c184	mov w20,w0
00b9c188	cbnz w0,0x00b9c1a0
00b9c18c	add x0,x19,#0xd0
00b9c190	add x1,x21,#0xd0
00b9c194	bl 0x00c42630
00b9c198	mov w20,w0
00b9c19c	cbz w0,0x00b9c1ac
00b9c1a0	cbz x19,0x00b9c1ac
00b9c1a4	mov x0,x19
00b9c1a8	bl 0x00c426e0
00b9c1ac	mov w0,w20
00b9c1b0	ldp x29,x30,[sp, #0x20]
00b9c1b4	ldp x20,x19,[sp, #0x10]
00b9c1b8	ldr x21,[sp], #0x30
00b9c1bc	ret
