; ossl_rsa_pss_params_30_is_unrestricted @ 00ad8e48
00ad8e48	cbz x0,0x00ad8e74
00ad8e4c	stp x29,x30,[sp, #-0x10]!
00ad8e50	adrp x1,0xd22000
00ad8e54	add x1,x1,#0x220
00ad8e58	mov w2,#0x14
00ad8e5c	mov x29,sp
00ad8e60	bl 0x00c300b0
00ad8e64	cmp w0,#0x0
00ad8e68	cset w0,eq
00ad8e6c	ldp x29,x30,[sp], #0x10
00ad8e70	ret
00ad8e74	mov w0,#0x1
00ad8e78	ret
