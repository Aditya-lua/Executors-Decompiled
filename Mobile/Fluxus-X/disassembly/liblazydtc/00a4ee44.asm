; ossl_decoder_parsed_properties @ 00a4ee44
00a4ee44	cbz x0,0x00a4ee50
00a4ee48	ldr x0,[x0, #0x20]
00a4ee4c	ret
00a4ee50	stp x29,x30,[sp, #-0x10]!
00a4ee54	mov x29,sp
00a4ee58	bl 0x00c342a0
00a4ee5c	adrp x0,0x2db000
00a4ee60	adrp x2,0x2a5000
00a4ee64	add x0,x0,#0xf32
00a4ee68	add x2,x2,#0xeda
00a4ee6c	mov w1,#0x20b
00a4ee70	bl 0x00c342b0
00a4ee74	mov w1,#0x102
00a4ee78	orr w0,wzr,#0x3c
00a4ee7c	movk w1,#0xc, LSL #16
00a4ee80	mov x2,xzr
00a4ee84	bl 0x00c342c0
00a4ee88	mov x0,xzr
00a4ee8c	ldp x29,x30,[sp], #0x10
00a4ee90	ret
