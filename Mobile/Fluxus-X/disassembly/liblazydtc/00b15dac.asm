; i2d_X509_CRL_fp @ 00b15dac
00b15dac	stp x20,x19,[sp, #-0x20]!
00b15db0	stp x29,x30,[sp, #0x10]
00b15db4	add x29,sp,#0x10
00b15db8	mov x19,x1
00b15dbc	mov x20,x0
00b15dc0	bl 0x00c3f5f0
00b15dc4	ldp x29,x30,[sp, #0x10]
00b15dc8	mov x1,x20
00b15dcc	mov x2,x19
00b15dd0	ldp x20,x19,[sp], #0x20
00b15dd4	b 0x00c37520
