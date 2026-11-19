; PEM_write_PKCS8 @ 00ab96a4
00ab96a4	sub sp,sp,#0x20
00ab96a8	stp x29,x30,[sp, #0x10]
00ab96ac	mov x2,x0
00ab96b0	adrp x0,0xcb5000
00ab96b4	ldr x0,[x0, #0x3a0]
00ab96b8	mov x3,x1
00ab96bc	adrp x1,0x2c6000
00ab96c0	add x1,x1,#0xd0
00ab96c4	mov x4,xzr
00ab96c8	mov x5,xzr
00ab96cc	mov w6,wzr
00ab96d0	mov x7,xzr
00ab96d4	add x29,sp,#0x10
00ab96d8	str xzr,[sp]
00ab96dc	bl 0x00c36060
00ab96e0	ldp x29,x30,[sp, #0x10]
00ab96e4	add sp,sp,#0x20
00ab96e8	ret
