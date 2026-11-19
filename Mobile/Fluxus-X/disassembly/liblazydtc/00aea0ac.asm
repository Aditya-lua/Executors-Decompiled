; OSSL_STORE_INFO_free @ 00aea0ac
00aea0ac	cbz x0,0x00aea0f0
00aea0b0	stp x20,x19,[sp, #-0x20]!
00aea0b4	stp x29,x30,[sp, #0x10]
00aea0b8	ldr w8,[x0]
00aea0bc	mov x19,x0
00aea0c0	add x29,sp,#0x10
00aea0c4	sub w8,w8,#0x1
00aea0c8	cmp w8,#0x5
00aea0cc	b.hi 0x00aea134
00aea0d0	adrp x9,0x777000
00aea0d4	add x9,x9,#0x1b8
00aea0d8	ldrsw x8,[x9, x8, LSL #0x2]
00aea0dc	add x8,x8,x9
00aea0e0	br x8
00aea0e4	ldr x0,[x19, #0x8]
00aea0e8	bl 0x00c32450
00aea0ec	b 0x00aea134
00aea0f0	ret
00aea0f4	ldr x0,[x19, #0x8]
00aea0f8	adrp x20,0x2c2000
00aea0fc	add x20,x20,#0x3bd
00aea100	mov w2,#0x306
00aea104	mov x1,x20
00aea108	bl 0x00c32310
00aea10c	ldr x0,[x19, #0x10]
00aea110	mov w2,#0x307
00aea114	mov x1,x20
00aea118	bl 0x00c32310
00aea11c	b 0x00aea134
00aea120	ldr x0,[x19, #0x8]
00aea124	bl 0x00c31a90
00aea128	b 0x00aea134
00aea12c	ldr x0,[x19, #0x8]
00aea130	bl 0x00c382b0
00aea134	ldp x29,x30,[sp, #0x10]
00aea138	adrp x1,0x2c2000
00aea13c	add x1,x1,#0x3bd
00aea140	mov w2,#0x319
00aea144	mov x0,x19
00aea148	ldp x20,x19,[sp], #0x20
00aea14c	b 0x00c32310
