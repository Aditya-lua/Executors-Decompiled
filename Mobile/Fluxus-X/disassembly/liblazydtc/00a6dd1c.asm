; EVP_PKEY_get1_DH @ 00a6dd1c
00a6dd1c	str x19,[sp, #-0x20]!
00a6dd20	stp x29,x30,[sp, #0x10]
00a6dd24	ldr w8,[x0]
00a6dd28	add x29,sp,#0x10
00a6dd2c	cmp w8,#0x1c
00a6dd30	b.eq 0x00a6dd3c
00a6dd34	cmp w8,#0x398
00a6dd38	b.ne 0x00a6dd54
00a6dd3c	bl 0x00a6d87c
00a6dd40	mov x19,x0
00a6dd44	cbz x0,0x00a6dd84
00a6dd48	mov x0,x19
00a6dd4c	bl 0x00c3a000
00a6dd50	b 0x00a6dd84
00a6dd54	bl 0x00c342a0
00a6dd58	adrp x0,0x2c1000
00a6dd5c	adrp x2,0x2d5000
00a6dd60	add x0,x0,#0xcf9
00a6dd64	add x2,x2,#0xd07
00a6dd68	mov w1,#0x3b4
00a6dd6c	bl 0x00c342b0
00a6dd70	orr w0,wzr,#0x6
00a6dd74	mov w1,#0x80
00a6dd78	mov x2,xzr
00a6dd7c	bl 0x00c342c0
00a6dd80	mov x19,xzr
00a6dd84	ldp x29,x30,[sp, #0x10]
00a6dd88	mov x0,x19
00a6dd8c	ldr x19,[sp], #0x20
00a6dd90	ret
