; ossl_err_load_X509V3_strings @ 00b07d70
00b07d70	stp x29,x30,[sp, #-0x10]!
00b07d74	mov w0,#0x76
00b07d78	movk w0,#0x1100, LSL #16
00b07d7c	mov x29,sp
00b07d80	bl 0x00c35520
00b07d84	cbnz x0,0x00b07d94
00b07d88	adrp x0,0xc81000
00b07d8c	add x0,x0,#0x1f0
00b07d90	bl 0x00c35510
00b07d94	mov w0,#0x1
00b07d98	ldp x29,x30,[sp], #0x10
00b07d9c	ret
