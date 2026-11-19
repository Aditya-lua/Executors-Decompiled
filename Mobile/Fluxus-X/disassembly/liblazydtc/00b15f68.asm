; d2i_X509_REQ_fp @ 00b15f68
00b15f68	stp x20,x19,[sp, #-0x20]!
00b15f6c	stp x29,x30,[sp, #0x10]
00b15f70	add x29,sp,#0x10
00b15f74	mov x19,x1
00b15f78	mov x20,x0
00b15f7c	bl 0x00c40f00
00b15f80	ldp x29,x30,[sp, #0x10]
00b15f84	mov x1,x20
00b15f88	mov x2,x19
00b15f8c	ldp x20,x19,[sp], #0x20
00b15f90	b 0x00c37440
