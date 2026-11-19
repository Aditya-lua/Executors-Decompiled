; i2d_PKCS8PrivateKeyInfo_fp @ 00b16ac0
00b16ac0	stp x20,x19,[sp, #-0x20]!
00b16ac4	mov x20,x0
00b16ac8	mov x0,x1
00b16acc	stp x29,x30,[sp, #0x10]
00b16ad0	add x29,sp,#0x10
00b16ad4	bl 0x00c3d0c0
00b16ad8	cbz x0,0x00b16b04
00b16adc	mov x19,x0
00b16ae0	adrp x0,0xcb5000
00b16ae4	ldr x0,[x0, #0x380]
00b16ae8	mov x1,x20
00b16aec	mov x2,x19
00b16af0	bl 0x00c37500
00b16af4	mov w20,w0
00b16af8	mov x0,x19
00b16afc	bl 0x00c37d00
00b16b00	mov w0,w20
00b16b04	ldp x29,x30,[sp, #0x10]
00b16b08	ldp x20,x19,[sp], #0x20
00b16b0c	ret
