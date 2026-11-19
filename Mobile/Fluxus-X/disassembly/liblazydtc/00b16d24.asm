; i2d_PKCS8PrivateKeyInfo_bio @ 00b16d24
00b16d24	stp x20,x19,[sp, #-0x20]!
00b16d28	mov x20,x0
00b16d2c	mov x0,x1
00b16d30	stp x29,x30,[sp, #0x10]
00b16d34	add x29,sp,#0x10
00b16d38	bl 0x00c3d0c0
00b16d3c	cbz x0,0x00b16d68
00b16d40	mov x19,x0
00b16d44	adrp x0,0xcb5000
00b16d48	ldr x0,[x0, #0x380]
00b16d4c	mov x1,x20
00b16d50	mov x2,x19
00b16d54	bl 0x00c374f0
00b16d58	mov w20,w0
00b16d5c	mov x0,x19
00b16d60	bl 0x00c37d00
00b16d64	mov w0,w20
00b16d68	ldp x29,x30,[sp, #0x10]
00b16d6c	ldp x20,x19,[sp], #0x20
00b16d70	ret
