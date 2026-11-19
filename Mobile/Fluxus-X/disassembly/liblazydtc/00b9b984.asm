; mbedtls_ecdsa_sign @ 00b9b984
00b9b984	sub sp,sp,#0x30
00b9b988	stp x29,x30,[sp, #0x20]
00b9b98c	add x29,sp,#0x20
00b9b990	stp x6,x7,[sp]
00b9b994	bl 0x00c42540
00b9b998	ldp x29,x30,[sp, #0x20]
00b9b99c	add sp,sp,#0x30
00b9b9a0	ret
