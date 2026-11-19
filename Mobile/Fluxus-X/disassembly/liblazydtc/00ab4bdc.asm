; PEM_write_RSAPublicKey @ 00ab4bdc
00ab4bdc	sub sp,sp,#0x20
00ab4be0	stp x29,x30,[sp, #0x10]
00ab4be4	mov x2,x0
00ab4be8	adrp x0,0xcb5000
00ab4bec	ldr x0,[x0, #0x730]
00ab4bf0	mov x3,x1
00ab4bf4	adrp x1,0x2d2000
00ab4bf8	add x1,x1,#0x1f2
00ab4bfc	mov x4,xzr
00ab4c00	mov x5,xzr
00ab4c04	mov w6,wzr
00ab4c08	mov x7,xzr
00ab4c0c	add x29,sp,#0x10
00ab4c10	str xzr,[sp]
00ab4c14	bl 0x00c36060
00ab4c18	ldp x29,x30,[sp, #0x10]
00ab4c1c	add sp,sp,#0x20
00ab4c20	ret
