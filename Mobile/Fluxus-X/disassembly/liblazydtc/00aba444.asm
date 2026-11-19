; PKCS12_PBE_keyivgen @ 00aba444
00aba444	sub sp,sp,#0x20
00aba448	mov x7,xzr
00aba44c	stp x29,x30,[sp, #0x10]
00aba450	add x29,sp,#0x10
00aba454	str xzr,[sp]
00aba458	bl 0x00aba234
00aba45c	ldp x29,x30,[sp, #0x10]
00aba460	add sp,sp,#0x20
00aba464	ret
