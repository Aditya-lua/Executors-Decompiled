; PKCS12_SAFEBAG_create_pkcs8_encrypt @ 00abcd20
00abcd20	sub sp,sp,#0x20
00abcd24	mov x7,xzr
00abcd28	stp x29,x30,[sp, #0x10]
00abcd2c	add x29,sp,#0x10
00abcd30	str xzr,[sp]
00abcd34	bl 0x00abcbe4
00abcd38	ldp x29,x30,[sp, #0x10]
00abcd3c	add sp,sp,#0x20
00abcd40	ret
