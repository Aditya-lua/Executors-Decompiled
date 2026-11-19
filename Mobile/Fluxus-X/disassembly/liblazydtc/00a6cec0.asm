; EVP_PKEY_get_raw_private_key @ 00a6cec0
00a6cec0	sub sp,sp,#0x30
00a6cec4	stp x29,x30,[sp, #0x20]
00a6cec8	add x29,sp,#0x20
00a6cecc	stur x1,[x29, #-0x8]
00a6ced0	ldr x8,[x0, #0x60]
00a6ced4	cbz x8,0x00a6cf08
00a6ced8	cmp x1,#0x0
00a6cedc	sub x8,x29,#0x8
00a6cee0	csel x8,xzr,x8,eq
00a6cee4	stp x8,x2,[sp]
00a6cee8	adrp x2,0xa6c000
00a6ceec	mov w9,#0x1
00a6cef0	add x2,x2,#0xfa8
00a6cef4	mov w1,#0x1
00a6cef8	mov x3,sp
00a6cefc	str w9,[sp, #0x10]
00a6cf00	bl 0x00c3d300
00a6cf04	b 0x00a6cf9c
00a6cf08	ldr x8,[x0, #0x8]
00a6cf0c	cbz x8,0x00a6cf28
00a6cf10	ldr x8,[x8, #0x108]
00a6cf14	cbz x8,0x00a6cf44
00a6cf18	blr x8
00a6cf1c	cbz w0,0x00a6cf6c
00a6cf20	mov w0,#0x1
00a6cf24	b 0x00a6cf9c
00a6cf28	bl 0x00c342a0
00a6cf2c	adrp x0,0x2c1000
00a6cf30	adrp x2,0x2bd000
00a6cf34	add x0,x0,#0xcf9
00a6cf38	add x2,x2,#0xb41
00a6cf3c	mov w1,#0x235
00a6cf40	b 0x00a6cf5c
00a6cf44	bl 0x00c342a0
00a6cf48	adrp x0,0x2c1000
00a6cf4c	adrp x2,0x2bd000
00a6cf50	add x0,x0,#0xcf9
00a6cf54	add x2,x2,#0xb41
00a6cf58	mov w1,#0x23a
00a6cf5c	bl 0x00c342b0
00a6cf60	orr w0,wzr,#0x6
00a6cf64	mov w1,#0x96
00a6cf68	b 0x00a6cf90
00a6cf6c	bl 0x00c342a0
00a6cf70	adrp x0,0x2c1000
00a6cf74	adrp x2,0x2bd000
00a6cf78	add x0,x0,#0xcf9
00a6cf7c	add x2,x2,#0xb41
00a6cf80	mov w1,#0x23f
00a6cf84	bl 0x00c342b0
00a6cf88	orr w0,wzr,#0x6
00a6cf8c	mov w1,#0xb6
00a6cf90	mov x2,xzr
00a6cf94	bl 0x00c342c0
00a6cf98	mov w0,wzr
00a6cf9c	ldp x29,x30,[sp, #0x20]
00a6cfa0	add sp,sp,#0x30
00a6cfa4	ret
