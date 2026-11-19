; ossl_x509_set0_libctx @ 00b1eb14
00b1eb14	stp x20,x19,[sp, #-0x20]!
00b1eb18	stp x29,x30,[sp, #0x10]
00b1eb1c	add x29,sp,#0x10
00b1eb20	cbz x0,0x00b1eb68
00b1eb24	mov x19,x0
00b1eb28	ldr x0,[x0, #0x178]
00b1eb2c	str x1,[x19, #0x170]
00b1eb30	adrp x1,0x29e000
00b1eb34	mov x20,x2
00b1eb38	add x1,x1,#0xcf5
00b1eb3c	mov w2,#0x96
00b1eb40	bl 0x00c32310
00b1eb44	str xzr,[x19, #0x178]
00b1eb48	cbz x20,0x00b1eb68
00b1eb4c	adrp x1,0x29e000
00b1eb50	add x1,x1,#0xcf5
00b1eb54	mov w2,#0x99
00b1eb58	mov x0,x20
00b1eb5c	bl 0x00c34600
00b1eb60	str x0,[x19, #0x178]
00b1eb64	cbz x0,0x00b1eb6c
00b1eb68	mov w0,#0x1
00b1eb6c	ldp x29,x30,[sp, #0x10]
00b1eb70	ldp x20,x19,[sp], #0x20
00b1eb74	ret
