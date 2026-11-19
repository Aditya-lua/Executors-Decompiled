; ossl_err_load_X509_strings @ 00b0a03c
00b0a03c	stp x29,x30,[sp, #-0x10]!
00b0a040	mov w0,#0x6e
00b0a044	movk w0,#0x580, LSL #16
00b0a048	mov x29,sp
00b0a04c	bl 0x00c35520
00b0a050	cbnz x0,0x00b0a060
00b0a054	adrp x0,0xc81000
00b0a058	add x0,x0,#0x640
00b0a05c	bl 0x00c35510
00b0a060	mov w0,#0x1
00b0a064	ldp x29,x30,[sp], #0x10
00b0a068	ret
