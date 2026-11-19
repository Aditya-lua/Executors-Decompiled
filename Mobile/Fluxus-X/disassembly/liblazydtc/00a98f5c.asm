; ossl_err_load_BUF_strings @ 00a98f5c
00a98f5c	stp x29,x30,[sp, #-0x10]!
00a98f60	mov x0,xzr
00a98f64	mov x29,sp
00a98f68	bl 0x00c35520
00a98f6c	cbnz x0,0x00a98f7c
00a98f70	adrp x0,0x76e000
00a98f74	add x0,x0,#0x868
00a98f78	bl 0x00c35510
00a98f7c	mov w0,#0x1
00a98f80	ldp x29,x30,[sp], #0x10
00a98f84	ret
