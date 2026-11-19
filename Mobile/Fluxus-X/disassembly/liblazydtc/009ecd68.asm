; ASN1_PRINTABLE_type @ 009ecd68
009ecd68	str x23,[sp, #-0x40]!
009ecd6c	stp x22,x21,[sp, #0x10]
009ecd70	stp x20,x19,[sp, #0x20]
009ecd74	stp x29,x30,[sp, #0x30]
009ecd78	add x29,sp,#0x30
009ecd7c	cbz x0,0x009ecdf8
009ecd80	mov x19,x0
009ecd84	tbnz w1,#0x1f,0x009ecd94
009ecd88	cmp w1,#0x1
009ecd8c	b.ge 0x009ecda8
009ecd90	b 0x009ecdf8
009ecd94	mov x0,x19
009ecd98	bl 0x00c2ff50
009ecd9c	mov x1,x0
009ecda0	cmp w1,#0x1
009ecda4	b.lt 0x009ecdf8
009ecda8	mov w22,wzr
009ecdac	mov w21,wzr
009ecdb0	add w23,w1,#0x1
009ecdb4	ldrb w20,[x19], #0x1
009ecdb8	mov w1,#0x800
009ecdbc	mov w0,w20
009ecdc0	bl 0x00c377c0
009ecdc4	cmp w0,#0x0
009ecdc8	sub w23,w23,#0x1
009ecdcc	csinc w21,w21,wzr,ne
009ecdd0	tst w20,#0x80
009ecdd4	csinc w22,w22,wzr,eq
009ecdd8	cmp w23,#0x1
009ecddc	b.gt 0x009ecdb4
009ecde0	cbz w22,0x009ecdec
009ecde4	mov w0,#0x14
009ecde8	b 0x009ecdfc
009ecdec	cbz w21,0x009ecdf8
009ecdf0	mov w0,#0x16
009ecdf4	b 0x009ecdfc
009ecdf8	mov w0,#0x13
009ecdfc	ldp x29,x30,[sp, #0x30]
009ece00	ldp x20,x19,[sp, #0x20]
009ece04	ldp x22,x21,[sp, #0x10]
009ece08	ldr x23,[sp], #0x40
009ece0c	ret
