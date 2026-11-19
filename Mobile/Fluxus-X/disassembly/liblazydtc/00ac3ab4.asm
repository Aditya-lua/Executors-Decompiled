; ossl_err_load_PKCS7_strings @ 00ac3ab4
00ac3ab4	stp x29,x30,[sp, #-0x10]!
00ac3ab8	mov w0,#0x75
00ac3abc	movk w0,#0x1080, LSL #16
00ac3ac0	mov x29,sp
00ac3ac4	bl 0x00c35520
00ac3ac8	cbnz x0,0x00ac3ad8
00ac3acc	adrp x0,0xc7c000
00ac3ad0	add x0,x0,#0x400
00ac3ad4	bl 0x00c35510
00ac3ad8	mov w0,#0x1
00ac3adc	ldp x29,x30,[sp], #0x10
00ac3ae0	ret
