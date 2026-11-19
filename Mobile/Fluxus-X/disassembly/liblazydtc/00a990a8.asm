; ossl_err_load_CT_strings @ 00a990a8
00a990a8	stp x29,x30,[sp, #-0x10]!
00a990ac	mov w0,#0x6c
00a990b0	movk w0,#0x1900, LSL #16
00a990b4	mov x29,sp
00a990b8	bl 0x00c35520
00a990bc	cbnz x0,0x00a990cc
00a990c0	adrp x0,0xc6b000
00a990c4	add x0,x0,#0xee8
00a990c8	bl 0x00c35510
00a990cc	mov w0,#0x1
00a990d0	ldp x29,x30,[sp], #0x10
00a990d4	ret
