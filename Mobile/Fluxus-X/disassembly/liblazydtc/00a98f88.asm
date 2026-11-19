; ossl_err_load_CMP_strings @ 00a98f88
00a98f88	stp x29,x30,[sp, #-0x10]!
00a98f8c	mov w0,#0x8b
00a98f90	movk w0,#0x1d00, LSL #16
00a98f94	mov x29,sp
00a98f98	bl 0x00c35520
00a98f9c	cbnz x0,0x00a98fac
00a98fa0	adrp x0,0xc6a000
00a98fa4	add x0,x0,#0xe78
00a98fa8	bl 0x00c35510
00a98fac	mov w0,#0x1
00a98fb0	ldp x29,x30,[sp], #0x10
00a98fb4	ret
