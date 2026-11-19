; mbedtls_chachapoly_init @ 00b6cf78
00b6cf78	str x19,[sp, #-0x20]!
00b6cf7c	stp x29,x30,[sp, #0x10]
00b6cf80	add x29,sp,#0x10
00b6cf84	mov x19,x0
00b6cf88	bl 0x00c42080
00b6cf8c	add x0,x19,#0x88
00b6cf90	bl 0x00c42270
00b6cf94	stp xzr,xzr,[x19, #0xd8]
00b6cf98	str xzr,[x19, #0xe8]
00b6cf9c	ldp x29,x30,[sp, #0x10]
00b6cfa0	ldr x19,[sp], #0x20
00b6cfa4	ret
