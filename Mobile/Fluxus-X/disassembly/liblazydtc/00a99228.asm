; ossl_err_load_HTTP_strings @ 00a99228
00a99228	stp x29,x30,[sp, #-0x10]!
00a9922c	mov w0,#0x6c
00a99230	movk w0,#0x1e80, LSL #16
00a99234	mov x29,sp
00a99238	bl 0x00c35520
00a9923c	cbnz x0,0x00a9924c
00a99240	adrp x0,0xc6d000
00a99244	add x0,x0,#0x2a8
00a99248	bl 0x00c35510
00a9924c	mov w0,#0x1
00a99250	ldp x29,x30,[sp], #0x10
00a99254	ret
