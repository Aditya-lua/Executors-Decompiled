; PKCS5_v2_PBKDF2_keyivgen @ 00a6ba9c
00a6ba9c	sub sp,sp,#0x20
00a6baa0	mov x7,xzr
00a6baa4	stp x29,x30,[sp, #0x10]
00a6baa8	add x29,sp,#0x10
00a6baac	str xzr,[sp]
00a6bab0	bl 0x00a6b770
00a6bab4	ldp x29,x30,[sp, #0x10]
00a6bab8	add sp,sp,#0x20
00a6babc	ret
