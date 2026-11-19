; RSA_padding_check_PKCS1_OAEP @ 00ad5400
00ad5400	sub sp,sp,#0x20
00ad5404	mov x7,xzr
00ad5408	stp x29,x30,[sp, #0x10]
00ad540c	add x29,sp,#0x10
00ad5410	str xzr,[sp]
00ad5414	bl 0x00ad5424
00ad5418	ldp x29,x30,[sp, #0x10]
00ad541c	add sp,sp,#0x20
00ad5420	ret
