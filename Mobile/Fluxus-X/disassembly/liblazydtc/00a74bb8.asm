; EVP_PKEY_todata @ 00a74bb8
00a74bb8	sub sp,sp,#0x20
00a74bbc	stp x29,x30,[sp, #0x10]
00a74bc0	add x29,sp,#0x10
00a74bc4	cbz x2,0x00a74bf4
00a74bc8	cbz x0,0x00a74bfc
00a74bcc	ldr w8,[x0]
00a74bd0	mov x3,x2
00a74bd4	cbz w8,0x00a74be0
00a74bd8	ldr x8,[x0, #0x60]
00a74bdc	cbz x8,0x00a74c34
00a74be0	ldp x29,x30,[sp, #0x10]
00a74be4	adrp x2,0xa74000
00a74be8	add x2,x2,#0xd00
00a74bec	add sp,sp,#0x20
00a74bf0	b 0x00c3d300
00a74bf4	mov w0,wzr
00a74bf8	b 0x00a74c60
00a74bfc	bl 0x00c342a0
00a74c00	adrp x0,0x2d9000
00a74c04	adrp x2,0x2c7000
00a74c08	add x0,x0,#0xd3a
00a74c0c	add x2,x2,#0xa54
00a74c10	mov w1,#0x1ba
00a74c14	bl 0x00c342b0
00a74c18	mov w1,#0x102
00a74c1c	orr w0,wzr,#0x6
00a74c20	movk w1,#0xc, LSL #16
00a74c24	mov x2,xzr
00a74c28	bl 0x00c342c0
00a74c2c	mov w0,wzr
00a74c30	b 0x00a74c60
00a74c34	adrp x8,0xa74000
00a74c38	add x8,x8,#0xd00
00a74c3c	stp x8,x3,[sp]
00a74c40	ldr x8,[x0, #0x8]
00a74c44	adrp x2,0xa74000
00a74c48	add x2,x2,#0xd2c
00a74c4c	mov x1,sp
00a74c50	ldr x8,[x8, #0x120]
00a74c54	mov x3,xzr
00a74c58	mov x4,xzr
00a74c5c	blr x8
00a74c60	ldp x29,x30,[sp, #0x10]
00a74c64	add sp,sp,#0x20
00a74c68	ret
