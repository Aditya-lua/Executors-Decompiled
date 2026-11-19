; d2i_X509_CRL_fp @ 00b15d80
00b15d80	stp x20,x19,[sp, #-0x20]!
00b15d84	stp x29,x30,[sp, #0x10]
00b15d88	add x29,sp,#0x10
00b15d8c	mov x19,x1
00b15d90	mov x20,x0
00b15d94	bl 0x00c3f5f0
00b15d98	ldp x29,x30,[sp, #0x10]
00b15d9c	mov x1,x20
00b15da0	mov x2,x19
00b15da4	ldp x20,x19,[sp], #0x20
00b15da8	b 0x00c37440
