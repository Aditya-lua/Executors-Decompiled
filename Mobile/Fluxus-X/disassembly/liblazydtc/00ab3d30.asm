; ossl_err_load_PEM_strings @ 00ab3d30
00ab3d30	stp x29,x30,[sp, #-0x10]!
00ab3d34	mov w0,#0x64
00ab3d38	movk w0,#0x480, LSL #16
00ab3d3c	mov x29,sp
00ab3d40	bl 0x00c35520
00ab3d44	cbnz x0,0x00ab3d54
00ab3d48	adrp x0,0xc7a000
00ab3d4c	add x0,x0,#0xca8
00ab3d50	bl 0x00c35510
00ab3d54	mov w0,#0x1
00ab3d58	ldp x29,x30,[sp], #0x10
00ab3d5c	ret
