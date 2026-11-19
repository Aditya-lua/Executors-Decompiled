; ossl_x509_init_sig_info @ 00b0c9a0
00b0c9a0	str x21,[sp, #-0x30]!
00b0c9a4	adrp x8,0x29c000
00b0c9a8	ldr q0,[x8, #0x680]
00b0c9ac	stp x20,x19,[sp, #0x10]
00b0c9b0	mov x20,x0
00b0c9b4	stp x29,x30,[sp, #0x20]
00b0c9b8	str q0,[x20, #0xb0]!
00b0c9bc	mov x21,x20
00b0c9c0	mov x19,x0
00b0c9c4	ldr x0,[x21, #-0x28]!
00b0c9c8	add x29,sp,#0x20
00b0c9cc	bl 0x00c37750
00b0c9d0	add x1,sp,#0x8
00b0c9d4	add x2,sp,#0xc
00b0c9d8	bl 0x00c3ebe0
00b0c9dc	cbz w0,0x00b0ca10
00b0c9e0	ldr w1,[sp, #0xc]
00b0c9e4	cbz w1,0x00b0ca10
00b0c9e8	ldr w0,[sp, #0x8]
00b0c9ec	cmp w0,#0x3f
00b0c9f0	stp w0,w1,[x19, #0xb0]
00b0c9f4	b.gt 0x00b0ca44
00b0c9f8	cbz w0,0x00b0ca60
00b0c9fc	cmp w0,#0x4
00b0ca00	b.ne 0x00b0cabc
00b0ca04	mov w8,#0x27
00b0ca08	str w8,[x19, #0xb8]
00b0ca0c	b 0x00b0caf8
00b0ca10	bl 0x00c342a0
00b0ca14	adrp x0,0x2ce000
00b0ca18	adrp x2,0x2cc000
00b0ca1c	add x0,x0,#0x554
00b0ca20	add x2,x2,#0x1ea
00b0ca24	mov w1,#0xd1
00b0ca28	bl 0x00c342b0
00b0ca2c	mov w0,#0xb
00b0ca30	mov w1,#0x90
00b0ca34	mov x2,xzr
00b0ca38	bl 0x00c342c0
00b0ca3c	mov w0,wzr
00b0ca40	b 0x00b0cb08
00b0ca44	cmp w0,#0x40
00b0ca48	b.eq 0x00b0cab0
00b0ca4c	cmp w0,#0x329
00b0ca50	b.ne 0x00b0cabc
00b0ca54	mov w8,#0x69
00b0ca58	str w8,[x19, #0xb8]
00b0ca5c	b 0x00b0caf8
00b0ca60	mov x0,xzr
00b0ca64	bl 0x00c37b20
00b0ca68	cbz x0,0x00b0ca88
00b0ca6c	ldr x8,[x0, #0xd8]
00b0ca70	cbz x8,0x00b0ca88
00b0ca74	sub x2,x20,#0x18
00b0ca78	mov x0,x20
00b0ca7c	mov x1,x21
00b0ca80	blr x8
00b0ca84	cbnz w0,0x00b0cad4
00b0ca88	bl 0x00c342a0
00b0ca8c	adrp x0,0x2ce000
00b0ca90	adrp x2,0x2cc000
00b0ca94	add x0,x0,#0x554
00b0ca98	add x2,x2,#0x1ea
00b0ca9c	mov w1,#0xdd
00b0caa0	bl 0x00c342b0
00b0caa4	mov w0,#0xb
00b0caa8	mov w1,#0x8e
00b0caac	b 0x00b0ca34
00b0cab0	orr w8,wzr,#0x3f
00b0cab4	str w8,[x19, #0xb8]
00b0cab8	b 0x00b0caec
00b0cabc	bl 0x00c324f0
00b0cac0	bl 0x00c35310
00b0cac4	cbz x0,0x00b0cb18
00b0cac8	bl 0x00c34c20
00b0cacc	lsl w8,w0,#0x2
00b0cad0	str w8,[x19, #0xb8]
00b0cad4	ldr w8,[sp, #0x8]
00b0cad8	sub w9,w8,#0x2a0
00b0cadc	cmp w9,#0x3
00b0cae0	b.cc 0x00b0caec
00b0cae4	cmp w8,#0x40
00b0cae8	b.ne 0x00b0caf8
00b0caec	ldr w8,[x19, #0xbc]
00b0caf0	orr w8,w8,#0x2
00b0caf4	str w8,[x19, #0xbc]
00b0caf8	ldr w8,[x19, #0xbc]
00b0cafc	mov w0,#0x1
00b0cb00	orr w8,w8,#0x1
00b0cb04	str w8,[x19, #0xbc]
00b0cb08	ldp x29,x30,[sp, #0x20]
00b0cb0c	ldp x20,x19,[sp, #0x10]
00b0cb10	ldr x21,[sp], #0x30
00b0cb14	ret
00b0cb18	bl 0x00c342a0
00b0cb1c	adrp x0,0x2ce000
00b0cb20	adrp x2,0x2cc000
00b0cb24	add x0,x0,#0x554
00b0cb28	add x2,x2,#0x1ea
00b0cb2c	orr w1,wzr,#0xff
00b0cb30	bl 0x00c342b0
00b0cb34	mov w0,#0xb
00b0cb38	mov w1,#0x8d
00b0cb3c	b 0x00b0ca34
