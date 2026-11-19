; CRYPTO_secure_malloc_done @ 00a9a0f8
00a9a0f8	adrp x8,0xd22000
00a9a0fc	ldr x8,[x8, #0x100]
00a9a100	mov w0,wzr
00a9a104	cbz x8,0x00a9a10c
00a9a108	ret
00a9a10c	stp x20,x19,[sp, #-0x20]!
00a9a110	adrp x20,0xd22000
00a9a114	add x20,x20,#0x108
00a9a118	ldr x0,[x20, #0x20]
00a9a11c	adrp x19,0x2d6000
00a9a120	add x19,x19,#0xc
00a9a124	mov w2,#0x244
00a9a128	mov x1,x19
00a9a12c	stp x29,x30,[sp, #0x10]
00a9a130	add x29,sp,#0x10
00a9a134	bl 0x00c32310
00a9a138	ldr x0,[x20, #0x38]
00a9a13c	mov w2,#0x245
00a9a140	mov x1,x19
00a9a144	bl 0x00c32310
00a9a148	ldr x0,[x20, #0x40]
00a9a14c	mov w2,#0x246
00a9a150	mov x1,x19
00a9a154	bl 0x00c32310
00a9a158	ldr x0,[x20]
00a9a15c	cmn x0,#0x1
00a9a160	b.eq 0x00a9a170
00a9a164	ldr x1,[x20, #0x8]
00a9a168	cbz x1,0x00a9a170
00a9a16c	bl 0x00c30b80
00a9a170	adrp x0,0xd22000
00a9a174	add x0,x0,#0x108
00a9a178	mov w2,#0x50
00a9a17c	mov w1,wzr
00a9a180	bl 0x00c301c0
00a9a184	adrp x19,0xd22000
00a9a188	ldr x0,[x19, #0xf8]
00a9a18c	adrp x8,0xd22000
00a9a190	strb wzr,[x8, #0xf0]
00a9a194	bl 0x00c34d40
00a9a198	ldp x29,x30,[sp, #0x10]
00a9a19c	mov w0,#0x1
00a9a1a0	str xzr,[x19, #0xf8]
00a9a1a4	ldp x20,x19,[sp], #0x20
00a9a1a8	ret
