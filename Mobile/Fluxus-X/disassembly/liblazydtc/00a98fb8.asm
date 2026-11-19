; ossl_err_load_CMS_strings @ 00a98fb8
00a98fb8	stp x29,x30,[sp, #-0x10]!
00a98fbc	mov w0,#0x63
00a98fc0	movk w0,#0x1700, LSL #16
00a98fc4	mov x29,sp
00a98fc8	bl 0x00c35520
00a98fcc	cbnz x0,0x00a98fdc
00a98fd0	adrp x0,0xc6b000
00a98fd4	add x0,x0,#0x408
00a98fd8	bl 0x00c35510
00a98fdc	mov w0,#0x1
00a98fe0	ldp x29,x30,[sp], #0x10
00a98fe4	ret
