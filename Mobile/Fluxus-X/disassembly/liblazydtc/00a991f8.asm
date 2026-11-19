; ossl_err_load_EVP_strings @ 00a991f8
00a991f8	stp x29,x30,[sp, #-0x10]!
00a991fc	mov w0,#0x8f
00a99200	movk w0,#0x300, LSL #16
00a99204	mov x29,sp
00a99208	bl 0x00c35520
00a9920c	cbnz x0,0x00a9921c
00a99210	adrp x0,0xc6c000
00a99214	add x0,x0,#0xbc8
00a99218	bl 0x00c35510
00a9921c	mov w0,#0x1
00a99220	ldp x29,x30,[sp], #0x10
00a99224	ret
