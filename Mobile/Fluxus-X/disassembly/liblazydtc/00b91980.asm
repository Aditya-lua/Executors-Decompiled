; mbedtls_ecp_point_init @ 00b91980
00b91980	str x19,[sp, #-0x20]!
00b91984	stp x29,x30,[sp, #0x10]
00b91988	add x29,sp,#0x10
00b9198c	mov x19,x0
00b91990	bl 0x00c41c00
00b91994	add x0,x19,#0x10
00b91998	bl 0x00c41c00
00b9199c	ldp x29,x30,[sp, #0x10]
00b919a0	add x0,x19,#0x20
00b919a4	ldr x19,[sp], #0x20
00b919a8	b 0x00c41c00
