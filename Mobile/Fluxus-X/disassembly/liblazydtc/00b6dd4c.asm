; mbedtls_aes_xts_free @ 00b6dd4c
00b6dd4c	str x19,[sp, #-0x20]!
00b6dd50	stp x29,x30,[sp, #0x10]
00b6dd54	add x29,sp,#0x10
00b6dd58	mov x19,x0
00b6dd5c	cbz x0,0x00b6dd80
00b6dd60	mov w1,#0x120
00b6dd64	mov x0,x19
00b6dd68	bl 0x00c42220
00b6dd6c	ldp x29,x30,[sp, #0x10]
00b6dd70	add x0,x19,#0x120
00b6dd74	mov w1,#0x120
00b6dd78	ldr x19,[sp], #0x20
00b6dd7c	b 0x00c42220
00b6dd80	ldp x29,x30,[sp, #0x10]
00b6dd84	ldr x19,[sp], #0x20
00b6dd88	ret
