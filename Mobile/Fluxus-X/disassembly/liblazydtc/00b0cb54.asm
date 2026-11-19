; X509_check_trust @ 00b0cb54
00b0cb54	sub sp,sp,#0x60
00b0cb58	stp x20,x19,[sp, #0x40]
00b0cb5c	mov w19,w2
00b0cb60	mov x20,x0
00b0cb64	stp x22,x21,[sp, #0x30]
00b0cb68	stp x29,x30,[sp, #0x50]
00b0cb6c	add x29,sp,#0x50
00b0cb70	cbz w1,0x00b0cba8
00b0cb74	sub w8,w1,#0x1
00b0cb78	mov w21,w1
00b0cb7c	cmp w8,#0x7
00b0cb80	b.hi 0x00b0cbc8
00b0cb84	adrp x9,0xcc9000
00b0cb88	add x9,x9,#0xbf8
00b0cb8c	mov w10,#0x28
00b0cb90	smaddl x0,w8,w10,x9
00b0cb94	ldr x8,[x0, #0x8]
00b0cb98	mov x1,x20
00b0cb9c	mov w2,w19
00b0cba0	blr x8
00b0cba4	b 0x00b0cc1c
00b0cba8	orr w2,w19,#0x8
00b0cbac	mov x1,x20
00b0cbb0	ldp x29,x30,[sp, #0x50]
00b0cbb4	ldp x20,x19,[sp, #0x40]
00b0cbb8	ldp x22,x21,[sp, #0x30]
00b0cbbc	mov w0,#0x38e
00b0cbc0	add sp,sp,#0x60
00b0cbc4	b 0x00b0cc30
00b0cbc8	adrp x22,0xd22000
00b0cbcc	ldr x0,[x22, #0x7e8]
00b0cbd0	cbz x0,0x00b0cc04
00b0cbd4	add x1,sp,#0x8
00b0cbd8	str w21,[sp, #0x8]
00b0cbdc	bl 0x00c34760
00b0cbe0	tbnz w0,#0x1f,0x00b0cc04
00b0cbe4	mov w1,w0
00b0cbe8	add w8,w0,#0x8
00b0cbec	tbnz w8,#0x1f,0x00b0cc04
00b0cbf0	cmp w8,#0x7
00b0cbf4	b.le 0x00b0cb84
00b0cbf8	ldr x0,[x22, #0x7e8]
00b0cbfc	bl 0x00c32610
00b0cc00	b 0x00b0cb94
00b0cc04	adrp x8,0xcc9000
00b0cc08	ldr x8,[x8, #0xbf0]
00b0cc0c	mov w0,w21
00b0cc10	mov x1,x20
00b0cc14	mov w2,w19
00b0cc18	blr x8
00b0cc1c	ldp x29,x30,[sp, #0x50]
00b0cc20	ldp x20,x19,[sp, #0x40]
00b0cc24	ldp x22,x21,[sp, #0x30]
00b0cc28	add sp,sp,#0x60
00b0cc2c	ret
