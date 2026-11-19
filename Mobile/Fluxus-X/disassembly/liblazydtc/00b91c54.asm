; mbedtls_ecp_set_zero @ 00b91c54
00b91c54	str x19,[sp, #-0x20]!
00b91c58	stp x29,x30,[sp, #0x10]
00b91c5c	add x29,sp,#0x10
00b91c60	mov w1,#0x1
00b91c64	mov x19,x0
00b91c68	bl 0x00c41c40
00b91c6c	cbnz w0,0x00b91c80
00b91c70	add x0,x19,#0x10
00b91c74	mov w1,#0x1
00b91c78	bl 0x00c41c40
00b91c7c	cbz w0,0x00b91c8c
00b91c80	ldp x29,x30,[sp, #0x10]
00b91c84	ldr x19,[sp], #0x20
00b91c88	ret
00b91c8c	ldp x29,x30,[sp, #0x10]
00b91c90	add x0,x19,#0x20
00b91c94	mov x1,xzr
00b91c98	ldr x19,[sp], #0x20
00b91c9c	b 0x00c41c40
