; mbedtls_ecp_copy @ 00b91c00
00b91c00	stp x20,x19,[sp, #-0x20]!
00b91c04	stp x29,x30,[sp, #0x10]
00b91c08	add x29,sp,#0x10
00b91c0c	mov x19,x1
00b91c10	mov x20,x0
00b91c14	bl 0x00c41b60
00b91c18	cbnz w0,0x00b91c2c
00b91c1c	add x0,x20,#0x10
00b91c20	add x1,x19,#0x10
00b91c24	bl 0x00c41b60
00b91c28	cbz w0,0x00b91c38
00b91c2c	ldp x29,x30,[sp, #0x10]
00b91c30	ldp x20,x19,[sp], #0x20
00b91c34	ret
00b91c38	ldp x29,x30,[sp, #0x10]
00b91c3c	add x0,x20,#0x20
00b91c40	add x1,x19,#0x20
00b91c44	ldp x20,x19,[sp], #0x20
00b91c48	b 0x00c41b60
