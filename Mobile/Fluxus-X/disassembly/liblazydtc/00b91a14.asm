; mbedtls_ecp_keypair_init @ 00b91a14
00b91a14	str x19,[sp, #-0x20]!
00b91a18	stp x29,x30,[sp, #0x10]
00b91a1c	add x29,sp,#0x10
00b91a20	mov x19,x0
00b91a24	str wzr,[x0], #0x8
00b91a28	bl 0x00c41c00
00b91a2c	add x0,x19,#0x18
00b91a30	bl 0x00c41c00
00b91a34	add x0,x19,#0x28
00b91a38	bl 0x00c41c00
00b91a3c	add x0,x19,#0x38
00b91a40	bl 0x00c41c00
00b91a44	add x0,x19,#0x48
00b91a48	bl 0x00c41c00
00b91a4c	add x0,x19,#0x58
00b91a50	bl 0x00c41c00
00b91a54	add x0,x19,#0x68
00b91a58	bl 0x00c41c00
00b91a5c	add x0,x19,#0xc0
00b91a60	stp xzr,xzr,[x19, #0x78]
00b91a64	str wzr,[x19, #0x88]
00b91a68	stp xzr,xzr,[x19, #0xb0]
00b91a6c	stp xzr,xzr,[x19, #0xa0]
00b91a70	stp xzr,xzr,[x19, #0x90]
00b91a74	bl 0x00c41c00
00b91a78	add x0,x19,#0xd0
00b91a7c	bl 0x00c41c00
00b91a80	add x0,x19,#0xe0
00b91a84	bl 0x00c41c00
00b91a88	ldp x29,x30,[sp, #0x10]
00b91a8c	add x0,x19,#0xf0
00b91a90	ldr x19,[sp], #0x20
00b91a94	b 0x00c41c00
