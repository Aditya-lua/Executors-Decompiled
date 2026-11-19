; EVP_PKEY_export @ 00a74c6c
00a74c6c	sub sp,sp,#0x20
00a74c70	stp x29,x30,[sp, #0x10]
00a74c74	add x29,sp,#0x10
00a74c78	cbz x0,0x00a74c98
00a74c7c	ldr w8,[x0]
00a74c80	cbz w8,0x00a74c8c
00a74c84	ldr x8,[x0, #0x60]
00a74c88	cbz x8,0x00a74cd0
00a74c8c	ldp x29,x30,[sp, #0x10]
00a74c90	add sp,sp,#0x20
00a74c94	b 0x00c3d300
00a74c98	bl 0x00c342a0
00a74c9c	adrp x0,0x2d9000
00a74ca0	adrp x2,0x2c7000
00a74ca4	add x0,x0,#0xd3a
00a74ca8	add x2,x2,#0xa54
00a74cac	mov w1,#0x1ba
00a74cb0	bl 0x00c342b0
00a74cb4	mov w1,#0x102
00a74cb8	orr w0,wzr,#0x6
00a74cbc	movk w1,#0xc, LSL #16
00a74cc0	mov x2,xzr
00a74cc4	bl 0x00c342c0
00a74cc8	mov w0,wzr
00a74ccc	b 0x00a74cf4
00a74cd0	stp x2,x3,[sp]
00a74cd4	ldr x8,[x0, #0x8]
00a74cd8	adrp x2,0xa74000
00a74cdc	add x2,x2,#0xd2c
00a74ce0	mov x1,sp
00a74ce4	ldr x8,[x8, #0x120]
00a74ce8	mov x3,xzr
00a74cec	mov x4,xzr
00a74cf0	blr x8
00a74cf4	ldp x29,x30,[sp, #0x10]
00a74cf8	add sp,sp,#0x20
00a74cfc	ret
