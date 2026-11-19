; PKCS5_v2_scrypt_keyivgen @ 00a6a558
00a6a558	sub sp,sp,#0x20
00a6a55c	mov x7,xzr
00a6a560	stp x29,x30,[sp, #0x10]
00a6a564	add x29,sp,#0x10
00a6a568	str xzr,[sp]
00a6a56c	bl 0x00a6a2d4
00a6a570	ldp x29,x30,[sp, #0x10]
00a6a574	add sp,sp,#0x20
00a6a578	ret
