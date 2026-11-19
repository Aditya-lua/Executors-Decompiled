; ossl_err_load_PKCS12_strings @ 00abde20
00abde20	stp x29,x30,[sp, #-0x10]!
00abde24	mov w0,#0x64
00abde28	movk w0,#0x1180, LSL #16
00abde2c	mov x29,sp
00abde30	bl 0x00c35520
00abde34	cbnz x0,0x00abde44
00abde38	adrp x0,0xc7b000
00abde3c	add x0,x0,#0x650
00abde40	bl 0x00c35510
00abde44	mov w0,#0x1
00abde48	ldp x29,x30,[sp], #0x10
00abde4c	ret
