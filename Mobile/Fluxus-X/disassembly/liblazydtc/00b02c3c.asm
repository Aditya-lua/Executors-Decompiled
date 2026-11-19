; X509_supported_extension @ 00b02c3c
00b02c3c	sub sp,sp,#0x20
00b02c40	stp x29,x30,[sp, #0x10]
00b02c44	add x29,sp,#0x10
00b02c48	bl 0x00c32b70
00b02c4c	bl 0x00c37750
00b02c50	stur w0,[x29, #-0x4]
00b02c54	cbz w0,0x00b02c80
00b02c58	adrp x1,0x77b000
00b02c5c	adrp x4,0xb03000
00b02c60	add x1,x1,#0x71c
00b02c64	add x4,x4,#0x718
00b02c68	sub x0,x29,#0x4
00b02c6c	orr w2,wzr,#0xf
00b02c70	mov w3,#0x4
00b02c74	bl 0x00c35830
00b02c78	cmp x0,#0x0
00b02c7c	cset w0,ne
00b02c80	ldp x29,x30,[sp, #0x10]
00b02c84	add sp,sp,#0x20
00b02c88	ret
