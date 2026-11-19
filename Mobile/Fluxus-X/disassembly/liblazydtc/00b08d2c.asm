; X509_ATTRIBUTE_get0_type @ 00b08d2c
00b08d2c	cbz x0,0x00b08d44
00b08d30	stp x29,x30,[sp, #-0x10]!
00b08d34	ldr x0,[x0, #0x8]
00b08d38	mov x29,sp
00b08d3c	bl 0x00c32610
00b08d40	ldp x29,x30,[sp], #0x10
00b08d44	ret
