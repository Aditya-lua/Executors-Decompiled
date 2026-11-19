; ossl_err_load_BIO_strings @ 00a98efc
00a98efc	stp x29,x30,[sp, #-0x10]!
00a98f00	mov w0,#0x64
00a98f04	movk w0,#0x1000, LSL #16
00a98f08	mov x29,sp
00a98f0c	bl 0x00c35520
00a98f10	cbnz x0,0x00a98f20
00a98f14	adrp x0,0xc6a000
00a98f18	add x0,x0,#0xa88
00a98f1c	bl 0x00c35510
00a98f20	mov w0,#0x1
00a98f24	ldp x29,x30,[sp], #0x10
00a98f28	ret
