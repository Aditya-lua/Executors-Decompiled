; ossl_err_load_RSA_strings @ 00ad12fc
00ad12fc	stp x29,x30,[sp, #-0x10]!
00ad1300	mov w0,#0x64
00ad1304	movk w0,#0x200, LSL #16
00ad1308	mov x29,sp
00ad130c	bl 0x00c35520
00ad1310	cbnz x0,0x00ad1320
00ad1314	adrp x0,0xc7d000
00ad1318	add x0,x0,#0x358
00ad131c	bl 0x00c35510
00ad1320	mov w0,#0x1
00ad1324	ldp x29,x30,[sp], #0x10
00ad1328	ret
