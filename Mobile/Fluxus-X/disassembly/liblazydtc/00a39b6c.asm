; ossl_ec_GFp_simple_point_finish @ 00a39b6c
00a39b6c	str x19,[sp, #-0x20]!
00a39b70	stp x29,x30,[sp, #0x10]
00a39b74	mov x19,x0
00a39b78	ldr x0,[x0, #0x10]
00a39b7c	add x29,sp,#0x10
00a39b80	bl 0x00c36290
00a39b84	ldr x0,[x19, #0x18]
00a39b88	bl 0x00c36290
00a39b8c	ldr x0,[x19, #0x20]
00a39b90	ldp x29,x30,[sp, #0x10]
00a39b94	ldr x19,[sp], #0x20
00a39b98	b 0x00c36290
