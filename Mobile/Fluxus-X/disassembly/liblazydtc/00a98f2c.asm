; ossl_err_load_BN_strings @ 00a98f2c
00a98f2c	stp x29,x30,[sp, #-0x10]!
00a98f30	mov w0,#0x64
00a98f34	movk w0,#0x180, LSL #16
00a98f38	mov x29,sp
00a98f3c	bl 0x00c35520
00a98f40	cbnz x0,0x00a98f50
00a98f44	adrp x0,0xc6a000
00a98f48	add x0,x0,#0xd08
00a98f4c	bl 0x00c35510
00a98f50	mov w0,#0x1
00a98f54	ldp x29,x30,[sp], #0x10
00a98f58	ret
