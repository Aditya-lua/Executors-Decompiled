; d2i_X509_bio @ 00b15d28
00b15d28	stp x20,x19,[sp, #-0x20]!
00b15d2c	stp x29,x30,[sp, #0x10]
00b15d30	add x29,sp,#0x10
00b15d34	mov x19,x1
00b15d38	mov x20,x0
00b15d3c	bl 0x00c36190
00b15d40	ldp x29,x30,[sp, #0x10]
00b15d44	mov x1,x20
00b15d48	mov x2,x19
00b15d4c	ldp x20,x19,[sp], #0x20
00b15d50	b 0x00c37420
