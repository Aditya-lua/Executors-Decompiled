; ossl_err_load_ASYNC_strings @ 00a98ecc
00a98ecc	stp x29,x30,[sp, #-0x10]!
00a98ed0	mov w0,#0x65
00a98ed4	movk w0,#0x1980, LSL #16
00a98ed8	mov x29,sp
00a98edc	bl 0x00c35520
00a98ee0	cbnz x0,0x00a98ef0
00a98ee4	adrp x0,0xc6a000
00a98ee8	add x0,x0,#0xa38
00a98eec	bl 0x00c35510
00a98ef0	mov w0,#0x1
00a98ef4	ldp x29,x30,[sp], #0x10
00a98ef8	ret
