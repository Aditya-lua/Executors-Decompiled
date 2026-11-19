; X509_PURPOSE_cleanup @ 00b02b7c
00b02b7c	str x19,[sp, #-0x20]!
00b02b80	adrp x19,0xd22000
00b02b84	ldr x0,[x19, #0x7e0]
00b02b88	adrp x1,0xb02000
00b02b8c	add x1,x1,#0xbac
00b02b90	stp x29,x30,[sp, #0x10]
00b02b94	add x29,sp,#0x10
00b02b98	bl 0x00c32600
00b02b9c	ldp x29,x30,[sp, #0x10]
00b02ba0	str xzr,[x19, #0x7e0]
00b02ba4	ldr x19,[sp], #0x20
00b02ba8	ret
