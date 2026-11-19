; X509_VERIFY_PARAM_free @ 00b13d88
00b13d88	cbz x0,0x00b13e0c
00b13d8c	stp x20,x19,[sp, #-0x20]!
00b13d90	stp x29,x30,[sp, #0x10]
00b13d94	adrp x1,0xcb5000
00b13d98	mov x19,x0
00b13d9c	ldr x0,[x0, #0x30]
00b13da0	ldr x1,[x1, #0x320]
00b13da4	add x29,sp,#0x10
00b13da8	bl 0x00c32600
00b13dac	ldr x0,[x19, #0x38]
00b13db0	adrp x1,0xb13000
00b13db4	add x1,x1,#0xe10
00b13db8	bl 0x00c32600
00b13dbc	ldr x0,[x19, #0x48]
00b13dc0	adrp x20,0x2d8000
00b13dc4	add x20,x20,#0xa44
00b13dc8	mov w2,#0x68
00b13dcc	mov x1,x20
00b13dd0	bl 0x00c32310
00b13dd4	ldr x0,[x19, #0x50]
00b13dd8	mov w2,#0x69
00b13ddc	mov x1,x20
00b13de0	bl 0x00c32310
00b13de4	ldr x0,[x19, #0x60]
00b13de8	mov w2,#0x6a
00b13dec	mov x1,x20
00b13df0	bl 0x00c32310
00b13df4	ldp x29,x30,[sp, #0x10]
00b13df8	mov w2,#0x6b
00b13dfc	mov x0,x19
00b13e00	mov x1,x20
00b13e04	ldp x20,x19,[sp], #0x20
00b13e08	b 0x00c32310
00b13e0c	ret
