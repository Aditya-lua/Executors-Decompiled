; mbedtls_ecp_is_zero @ 00b91ca0
00b91ca0	stp x29,x30,[sp, #-0x10]!
00b91ca4	mov x29,sp
00b91ca8	add x0,x0,#0x20
00b91cac	mov x1,xzr
00b91cb0	bl 0x00c41b40
00b91cb4	cmp w0,#0x0
00b91cb8	cset w0,eq
00b91cbc	ldp x29,x30,[sp], #0x10
00b91cc0	ret
