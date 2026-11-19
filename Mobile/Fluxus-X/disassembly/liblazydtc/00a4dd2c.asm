; OSSL_DECODER_export @ 00a4dd2c
00a4dd2c	cbz x0,0x00a4dd48
00a4dd30	cbz x1,0x00a4dd48
00a4dd34	cbz x3,0x00a4dd48
00a4dd38	cbz x4,0x00a4dd48
00a4dd3c	ldp x8,x0,[x0]
00a4dd40	ldr x5,[x8, #0x78]
00a4dd44	br x5
00a4dd48	stp x29,x30,[sp, #-0x10]!
00a4dd4c	mov x29,sp
00a4dd50	bl 0x00c342a0
00a4dd54	adrp x0,0x2bd000
00a4dd58	adrp x2,0x2a5000
00a4dd5c	add x0,x0,#0x9db
00a4dd60	add x2,x2,#0xeaa
00a4dd64	mov w1,#0x277
00a4dd68	bl 0x00c342b0
00a4dd6c	mov w1,#0x102
00a4dd70	orr w0,wzr,#0x3c
00a4dd74	movk w1,#0xc, LSL #16
00a4dd78	mov x2,xzr
00a4dd7c	bl 0x00c342c0
00a4dd80	mov w0,wzr
00a4dd84	ldp x29,x30,[sp], #0x10
00a4dd88	ret
