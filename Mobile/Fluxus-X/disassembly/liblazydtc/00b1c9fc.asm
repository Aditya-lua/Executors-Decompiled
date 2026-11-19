; ossl_d2i_X509_PUBKEY_INTERNAL @ 00b1c9fc
00b1c9fc	str x21,[sp, #-0x30]!
00b1ca00	stp x20,x19,[sp, #0x10]
00b1ca04	mov x20,x1
00b1ca08	adrp x1,0x2bc000
00b1ca0c	mov x19,x2
00b1ca10	mov x21,x0
00b1ca14	add x1,x1,#0x79f
00b1ca18	orr w0,wzr,#0x30
00b1ca1c	mov w2,#0x47
00b1ca20	stp x29,x30,[sp, #0x20]
00b1ca24	add x29,sp,#0x20
00b1ca28	bl 0x00c34250
00b1ca2c	str x0,[sp, #0x8]
00b1ca30	cbz x0,0x00b1ca54
00b1ca34	adrp x3,0xc82000
00b1ca38	add x3,x3,#0x6c0
00b1ca3c	add x0,sp,#0x8
00b1ca40	mov x1,x21
00b1ca44	mov x2,x20
00b1ca48	mov x4,x19
00b1ca4c	mov x5,xzr
00b1ca50	bl 0x00c37a00
00b1ca54	ldp x29,x30,[sp, #0x20]
00b1ca58	ldp x20,x19,[sp, #0x10]
00b1ca5c	ldr x21,[sp], #0x30
00b1ca60	ret
