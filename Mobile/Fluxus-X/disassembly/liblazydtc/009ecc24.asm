; ASN1_OBJECT_free @ 009ecc24
009ecc24	stp x20,x19,[sp, #-0x20]!
009ecc28	stp x29,x30,[sp, #0x10]
009ecc2c	add x29,sp,#0x10
009ecc30	cbz x0,0x009ecc48
009ecc34	ldr w8,[x0, #0x20]
009ecc38	mov x19,x0
009ecc3c	tbnz w8,#0x2,0x009ecc54
009ecc40	tbnz w8,#0x3,0x009ecc88
009ecc44	tbnz w8,#0x0,0x009eccac
009ecc48	ldp x29,x30,[sp, #0x10]
009ecc4c	ldp x20,x19,[sp], #0x20
009ecc50	ret
009ecc54	ldr x0,[x19]
009ecc58	adrp x20,0x2b7000
009ecc5c	add x20,x20,#0x892
009ecc60	mov w2,#0x16e
009ecc64	mov x1,x20
009ecc68	bl 0x00c32310
009ecc6c	ldr x0,[x19, #0x8]
009ecc70	mov w2,#0x16f
009ecc74	mov x1,x20
009ecc78	bl 0x00c32310
009ecc7c	ldr w8,[x19, #0x20]
009ecc80	stp xzr,xzr,[x19]
009ecc84	tbz w8,#0x3,0x009ecc44
009ecc88	ldr x0,[x19, #0x18]
009ecc8c	adrp x1,0x2b7000
009ecc90	add x1,x1,#0x892
009ecc94	mov w2,#0x174
009ecc98	bl 0x00c32310
009ecc9c	ldr w8,[x19, #0x20]
009ecca0	str xzr,[x19, #0x18]
009ecca4	str wzr,[x19, #0x14]
009ecca8	tbz w8,#0x0,0x009ecc48
009eccac	ldp x29,x30,[sp, #0x10]
009eccb0	adrp x1,0x2b7000
009eccb4	add x1,x1,#0x892
009eccb8	mov w2,#0x179
009eccbc	mov x0,x19
009eccc0	ldp x20,x19,[sp], #0x20
009eccc4	b 0x00c32310
