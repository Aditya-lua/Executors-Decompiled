; ossl_bio_prov_init_bio_method @ 00b1fd28
00b1fd28	str x19,[sp, #-0x20]!
00b1fd2c	adrp x1,0x2bd000
00b1fd30	add x1,x1,#0xbfa
00b1fd34	mov w0,#0x419
00b1fd38	stp x29,x30,[sp, #0x10]
00b1fd3c	add x29,sp,#0x10
00b1fd40	bl 0x00c321e0
00b1fd44	mov x19,x0
00b1fd48	cbz x0,0x00b1fdd8
00b1fd4c	adrp x1,0xb1f000
00b1fd50	add x1,x1,#0xdf4
00b1fd54	mov x0,x19
00b1fd58	bl 0x00c38700
00b1fd5c	cbz w0,0x00b1fdd8
00b1fd60	adrp x1,0xb1f000
00b1fd64	add x1,x1,#0xe50
00b1fd68	mov x0,x19
00b1fd6c	bl 0x00c386f0
00b1fd70	cbz w0,0x00b1fdd8
00b1fd74	adrp x1,0xb1f000
00b1fd78	add x1,x1,#0xeac
00b1fd7c	mov x0,x19
00b1fd80	bl 0x00c386e0
00b1fd84	cbz w0,0x00b1fdd8
00b1fd88	adrp x1,0xb1f000
00b1fd8c	add x1,x1,#0xeec
00b1fd90	mov x0,x19
00b1fd94	bl 0x00c386d0
00b1fd98	cbz w0,0x00b1fdd8
00b1fd9c	adrp x1,0xb1f000
00b1fda0	add x1,x1,#0xf34
00b1fda4	mov x0,x19
00b1fda8	bl 0x00c32200
00b1fdac	cbz w0,0x00b1fdd8
00b1fdb0	adrp x1,0xb1f000
00b1fdb4	add x1,x1,#0xf8c
00b1fdb8	mov x0,x19
00b1fdbc	bl 0x00c321f0
00b1fdc0	cbz w0,0x00b1fdd8
00b1fdc4	adrp x1,0xb1f000
00b1fdc8	add x1,x1,#0xfa8
00b1fdcc	mov x0,x19
00b1fdd0	bl 0x00c32210
00b1fdd4	cbnz w0,0x00b1fde4
00b1fdd8	mov x0,x19
00b1fddc	bl 0x00c321d0
00b1fde0	mov x19,xzr
00b1fde4	ldp x29,x30,[sp, #0x10]
00b1fde8	mov x0,x19
00b1fdec	ldr x19,[sp], #0x20
00b1fdf0	ret
