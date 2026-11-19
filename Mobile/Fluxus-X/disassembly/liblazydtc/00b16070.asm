; i2d_RSAPrivateKey_fp @ 00b16070
00b16070	stp x20,x19,[sp, #-0x20]!
00b16074	stp x29,x30,[sp, #0x10]
00b16078	add x29,sp,#0x10
00b1607c	mov x19,x1
00b16080	mov x20,x0
00b16084	bl 0x00c3fc20
00b16088	ldp x29,x30,[sp, #0x10]
00b1608c	mov x1,x20
00b16090	mov x2,x19
00b16094	ldp x20,x19,[sp], #0x20
00b16098	b 0x00c37520
