; FUN_00b2c188 @ 00b2c188
00b2c188	stp x20,x19,[sp, #-0x20]!
00b2c18c	stp x29,x30,[sp, #0x10]
00b2c190	add x29,sp,#0x10
00b2c194	mov x19,x0
00b2c198	bl 0x00c41000
00b2c19c	cbz w0,0x00b2c1ec
00b2c1a0	adrp x1,0x2a8000
00b2c1a4	add x1,x1,#0xc45
00b2c1a8	mov w0,#0x140
00b2c1ac	mov w2,#0x2e
00b2c1b0	bl 0x00c34250
00b2c1b4	mov x20,x0
00b2c1b8	cbz x0,0x00b2c1f0
00b2c1bc	mov w0,#0x80
00b2c1c0	bl 0x00c41540
00b2c1c4	mov x6,x0
00b2c1c8	mov w1,#0x80
00b2c1cc	mov w2,#0x80
00b2c1d0	mov w4,#0x1
00b2c1d4	mov x0,x20
00b2c1d8	mov x3,xzr
00b2c1dc	mov x5,xzr
00b2c1e0	mov x7,x19
00b2c1e4	bl 0x00c41280
00b2c1e8	b 0x00b2c1f0
00b2c1ec	mov x20,xzr
00b2c1f0	ldp x29,x30,[sp, #0x10]
00b2c1f4	mov x0,x20
00b2c1f8	ldp x20,x19,[sp], #0x20
00b2c1fc	ret
