; mbedtls_ecp_point_cmp @ 00b91cc4
00b91cc4	stp x20,x19,[sp, #-0x20]!
00b91cc8	stp x29,x30,[sp, #0x10]
00b91ccc	add x29,sp,#0x10
00b91cd0	mov x19,x1
00b91cd4	mov x20,x0
00b91cd8	bl 0x00c41b50
00b91cdc	cbnz w0,0x00b91d00
00b91ce0	add x0,x20,#0x10
00b91ce4	add x1,x19,#0x10
00b91ce8	bl 0x00c41b50
00b91cec	cbnz w0,0x00b91d00
00b91cf0	add x0,x20,#0x20
00b91cf4	add x1,x19,#0x20
00b91cf8	bl 0x00c41b50
00b91cfc	cbz w0,0x00b91d04
00b91d00	mov w0,#0xffffb080
00b91d04	ldp x29,x30,[sp, #0x10]
00b91d08	ldp x20,x19,[sp], #0x20
00b91d0c	ret
