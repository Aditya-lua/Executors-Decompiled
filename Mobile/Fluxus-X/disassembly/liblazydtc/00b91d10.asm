; mbedtls_ecp_point_read_string @ 00b91d10
00b91d10	str x21,[sp, #-0x30]!
00b91d14	stp x20,x19,[sp, #0x10]
00b91d18	stp x29,x30,[sp, #0x20]
00b91d1c	add x29,sp,#0x20
00b91d20	mov x20,x3
00b91d24	mov w21,w1
00b91d28	mov x19,x0
00b91d2c	bl 0x00c41cc0
00b91d30	cbnz w0,0x00b91d48
00b91d34	add x0,x19,#0x10
00b91d38	mov w1,w21
00b91d3c	mov x2,x20
00b91d40	bl 0x00c41cc0
00b91d44	cbz w0,0x00b91d58
00b91d48	ldp x29,x30,[sp, #0x20]
00b91d4c	ldp x20,x19,[sp, #0x10]
00b91d50	ldr x21,[sp], #0x30
00b91d54	ret
00b91d58	add x0,x19,#0x20
00b91d5c	ldp x29,x30,[sp, #0x20]
00b91d60	ldp x20,x19,[sp, #0x10]
00b91d64	mov w1,#0x1
00b91d68	ldr x21,[sp], #0x30
00b91d6c	b 0x00c41c40
