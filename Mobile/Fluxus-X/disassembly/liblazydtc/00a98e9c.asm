; ossl_err_load_ASN1_strings @ 00a98e9c
00a98e9c	stp x29,x30,[sp, #-0x10]!
00a98ea0	mov w0,#0xab
00a98ea4	movk w0,#0x680, LSL #16
00a98ea8	mov x29,sp
00a98eac	bl 0x00c35520
00a98eb0	cbnz x0,0x00a98ec0
00a98eb4	adrp x0,0xc6a000
00a98eb8	add x0,x0,#0x2f8
00a98ebc	bl 0x00c35510
00a98ec0	mov w0,#0x1
00a98ec4	ldp x29,x30,[sp], #0x10
00a98ec8	ret
