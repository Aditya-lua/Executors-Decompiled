; ossl_err_load_COMP_strings @ 00a98fe8
00a98fe8	stp x29,x30,[sp, #-0x10]!
00a98fec	mov w0,#0x63
00a98ff0	movk w0,#0x1480, LSL #16
00a98ff4	mov x29,sp
00a98ff8	bl 0x00c35520
00a98ffc	cbnz x0,0x00a9900c
00a99000	adrp x0,0xc6b000
00a99004	add x0,x0,#0xa18
00a99008	bl 0x00c35510
00a9900c	mov w0,#0x1
00a99010	ldp x29,x30,[sp], #0x10
00a99014	ret
