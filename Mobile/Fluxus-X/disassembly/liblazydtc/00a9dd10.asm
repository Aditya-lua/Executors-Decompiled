; ossl_param_build_set_octet_string @ 00a9dd10
00a9dd10	stp x20,x19,[sp, #-0x20]!
00a9dd14	mov x19,x4
00a9dd18	mov x20,x3
00a9dd1c	stp x29,x30,[sp, #0x10]
00a9dd20	add x29,sp,#0x10
00a9dd24	cbz x0,0x00a9dd40
00a9dd28	ldp x29,x30,[sp, #0x10]
00a9dd2c	mov x1,x2
00a9dd30	mov x2,x20
00a9dd34	mov x3,x19
00a9dd38	ldp x20,x19,[sp], #0x20
00a9dd3c	b 0x00c3a8f0
00a9dd40	mov x0,x1
00a9dd44	mov x1,x2
00a9dd48	bl 0x00c3e8c0
00a9dd4c	cbz x0,0x00a9dd64
00a9dd50	ldp x29,x30,[sp, #0x10]
00a9dd54	mov x1,x20
00a9dd58	mov x2,x19
00a9dd5c	ldp x20,x19,[sp], #0x20
00a9dd60	b 0x00c3dab0
00a9dd64	ldp x29,x30,[sp, #0x10]
00a9dd68	mov w0,#0x1
00a9dd6c	ldp x20,x19,[sp], #0x20
00a9dd70	ret
