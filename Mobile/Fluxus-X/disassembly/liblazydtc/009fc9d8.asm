; BIO_get_line @ 009fc9d8
009fc9d8	sub sp,sp,#0x40
009fc9dc	stp x22,x21,[sp, #0x10]
009fc9e0	stp x20,x19,[sp, #0x20]
009fc9e4	stp x29,x30,[sp, #0x30]
009fc9e8	add x29,sp,#0x30
009fc9ec	cbz x1,0x009fca60
009fc9f0	mov w22,w2
009fc9f4	cmp w2,#0x0
009fc9f8	b.le 0x009fca7c
009fc9fc	mov x19,x1
009fca00	mov x20,x0
009fca04	strb wzr,[x1]
009fca08	cbz x0,0x009fcaa4
009fca0c	ldr w8,[x20, #0x28]
009fca10	cbz w8,0x009fcaf0
009fca14	mov w8,wzr
009fca18	mov x21,x19
009fca1c	subs w22,w22,#0x1
009fca20	b.le 0x009fcb18
009fca24	mov w2,#0x1
009fca28	add x3,sp,#0x8
009fca2c	mov x0,x20
009fca30	mov x1,x21
009fca34	bl 0x009fc050
009fca38	ldr w8,[sp, #0x8]
009fca3c	cmp w0,#0x0
009fca40	csel w8,w8,w0,gt
009fca44	cmp w8,#0x0
009fca48	b.le 0x009fcb2c
009fca4c	ldrb w9,[x21], #0x1
009fca50	cmp w9,#0xa
009fca54	b.ne 0x009fca1c
009fca58	strb wzr,[x21]
009fca5c	b 0x009fcb4c
009fca60	bl 0x00c342a0
009fca64	adrp x0,0x2b2000
009fca68	adrp x2,0x2c3000
009fca6c	add x0,x0,#0x42
009fca70	add x2,x2,#0x71a
009fca74	orr w1,wzr,#0x1fc
009fca78	b 0x009fcabc
009fca7c	bl 0x00c342a0
009fca80	adrp x0,0x2b2000
009fca84	adrp x2,0x2c3000
009fca88	add x0,x0,#0x42
009fca8c	add x2,x2,#0x71a
009fca90	mov w1,#0x200
009fca94	bl 0x00c342b0
009fca98	mov w0,#0x20
009fca9c	mov w1,#0x7d
009fcaa0	b 0x009fcacc
009fcaa4	bl 0x00c342a0
009fcaa8	adrp x0,0x2b2000
009fcaac	adrp x2,0x2c3000
009fcab0	add x0,x0,#0x42
009fcab4	add x2,x2,#0x71a
009fcab8	mov w1,#0x206
009fcabc	bl 0x00c342b0
009fcac0	mov w1,#0x102
009fcac4	mov w0,#0x20
009fcac8	movk w1,#0xc, LSL #16
009fcacc	mov x2,xzr
009fcad0	bl 0x00c342c0
009fcad4	mov w22,#0xffffffff
009fcad8	mov w0,w22
009fcadc	ldp x29,x30,[sp, #0x30]
009fcae0	ldp x20,x19,[sp, #0x20]
009fcae4	ldp x22,x21,[sp, #0x10]
009fcae8	add sp,sp,#0x40
009fcaec	ret
009fcaf0	bl 0x00c342a0
009fcaf4	adrp x0,0x2b2000
009fcaf8	adrp x2,0x2c3000
009fcafc	add x0,x0,#0x42
009fcb00	add x2,x2,#0x71a
009fcb04	mov w1,#0x20a
009fcb08	bl 0x00c342b0
009fcb0c	mov w0,#0x20
009fcb10	orr w1,wzr,#0x78
009fcb14	b 0x009fcacc
009fcb18	cmp w8,#0x1
009fcb1c	strb wzr,[x21]
009fcb20	b.ge 0x009fcb4c
009fcb24	mov x22,xzr
009fcb28	b 0x009fcb34
009fcb2c	strb wzr,[x21]
009fcb30	sxtw x22,w8
009fcb34	mov w1,#0x2
009fcb38	mov x0,x20
009fcb3c	mov x2,xzr
009fcb40	mov x3,xzr
009fcb44	bl 0x009fcb54
009fcb48	cbz w0,0x009fcad8
009fcb4c	sub x22,x21,x19
009fcb50	b 0x009fcad8
