; EVP_PBE_scrypt @ 00a73f78
00a73f78	sub sp,sp,#0x30
00a73f7c	stp x29,x30,[sp, #0x20]
00a73f80	add x29,sp,#0x20
00a73f84	ldp x8,x9,[x29, #0x10]
00a73f88	stp xzr,xzr,[sp, #0x10]
00a73f8c	stp x8,x9,[sp]
00a73f90	bl 0x00a73d3c
00a73f94	ldp x29,x30,[sp, #0x20]
00a73f98	add sp,sp,#0x30
00a73f9c	ret
