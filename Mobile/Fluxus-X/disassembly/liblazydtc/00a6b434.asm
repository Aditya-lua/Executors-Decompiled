; PKCS5_PBKDF2_HMAC @ 00a6b434
00a6b434	sub sp,sp,#0x20
00a6b438	stp x29,x30,[sp, #0x10]
00a6b43c	add x29,sp,#0x10
00a6b440	stp xzr,xzr,[sp]
00a6b444	bl 0x00a6b228
00a6b448	ldp x29,x30,[sp, #0x10]
00a6b44c	add sp,sp,#0x20
00a6b450	ret
