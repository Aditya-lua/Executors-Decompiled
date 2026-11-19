; OSSL_LIB_CTX_new @ 00a80e34
00a80e34	str x19,[sp, #-0x20]!
00a80e38	adrp x1,0x2aa000
00a80e3c	add x1,x1,#0x296
00a80e40	mov w0,#0x1c8
00a80e44	orr w2,wzr,#0xc0
00a80e48	stp x29,x30,[sp, #0x10]
00a80e4c	add x29,sp,#0x10
00a80e50	bl 0x00c34250
00a80e54	mov x19,x0
00a80e58	cbz x0,0x00a80e80
00a80e5c	mov x0,x19
00a80e60	bl 0x00a80e90
00a80e64	cbnz w0,0x00a80e80
00a80e68	adrp x1,0x2aa000
00a80e6c	add x1,x1,#0x296
00a80e70	mov w2,#0xc3
00a80e74	mov x0,x19
00a80e78	bl 0x00c32310
00a80e7c	mov x19,xzr
00a80e80	ldp x29,x30,[sp, #0x10]
00a80e84	mov x0,x19
00a80e88	ldr x19,[sp], #0x20
00a80e8c	ret
