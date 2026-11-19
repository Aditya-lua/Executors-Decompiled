; i2d_X509_REQ_fp @ 00b15f94
00b15f94	stp x20,x19,[sp, #-0x20]!
00b15f98	stp x29,x30,[sp, #0x10]
00b15f9c	add x29,sp,#0x10
00b15fa0	mov x19,x1
00b15fa4	mov x20,x0
00b15fa8	bl 0x00c40f00
00b15fac	ldp x29,x30,[sp, #0x10]
00b15fb0	mov x1,x20
00b15fb4	mov x2,x19
00b15fb8	ldp x20,x19,[sp], #0x20
00b15fbc	b 0x00c37520
