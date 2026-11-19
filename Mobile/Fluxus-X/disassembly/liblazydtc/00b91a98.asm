; mbedtls_ecp_point_free @ 00b91a98
00b91a98	str x19,[sp, #-0x20]!
00b91a9c	stp x29,x30,[sp, #0x10]
00b91aa0	add x29,sp,#0x10
00b91aa4	mov x19,x0
00b91aa8	cbz x0,0x00b91acc
00b91aac	mov x0,x19
00b91ab0	bl 0x00c41bb0
00b91ab4	add x0,x19,#0x10
00b91ab8	bl 0x00c41bb0
00b91abc	ldp x29,x30,[sp, #0x10]
00b91ac0	add x0,x19,#0x20
00b91ac4	ldr x19,[sp], #0x20
00b91ac8	b 0x00c41bb0
00b91acc	ldp x29,x30,[sp, #0x10]
00b91ad0	ldr x19,[sp], #0x20
00b91ad4	ret
