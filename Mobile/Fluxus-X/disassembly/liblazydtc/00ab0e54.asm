; ossl_err_load_OCSP_strings @ 00ab0e54
00ab0e54	stp x29,x30,[sp, #-0x10]!
00ab0e58	mov w0,#0x65
00ab0e5c	movk w0,#0x1380, LSL #16
00ab0e60	mov x29,sp
00ab0e64	bl 0x00c35520
00ab0e68	cbnz x0,0x00ab0e78
00ab0e6c	adrp x0,0xc7a000
00ab0e70	add x0,x0,#0x948
00ab0e74	bl 0x00c35510
00ab0e78	mov w0,#0x1
00ab0e7c	ldp x29,x30,[sp], #0x10
00ab0e80	ret
