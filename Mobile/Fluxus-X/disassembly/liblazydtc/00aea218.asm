; OSSL_STORE_INFO_new @ 00aea218
00aea218	stp x20,x19,[sp, #-0x20]!
00aea21c	mov x19,x1
00aea220	adrp x1,0x2c2000
00aea224	mov w20,w0
00aea228	add x1,x1,#0x3bd
00aea22c	orr w0,wzr,#0x18
00aea230	mov w2,#0x220
00aea234	stp x29,x30,[sp, #0x10]
00aea238	add x29,sp,#0x10
00aea23c	bl 0x00c34250
00aea240	cbz x0,0x00aea24c
00aea244	str w20,[x0]
00aea248	str x19,[x0, #0x8]
00aea24c	ldp x29,x30,[sp, #0x10]
00aea250	ldp x20,x19,[sp], #0x20
00aea254	ret
