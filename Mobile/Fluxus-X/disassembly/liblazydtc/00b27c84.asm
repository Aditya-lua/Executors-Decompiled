; FUN_00b27c84 @ 00b27c84
00b27c84	stp x20,x19,[sp, #-0x20]!
00b27c88	stp x29,x30,[sp, #0x10]
00b27c8c	add x29,sp,#0x10
00b27c90	mov x19,x0
00b27c94	bl 0x00c41000
00b27c98	cbz w0,0x00b27ce8
00b27c9c	adrp x1,0x2c6000
00b27ca0	add x1,x1,#0x599
00b27ca4	mov w0,#0x1d8
00b27ca8	mov w2,#0x2e
00b27cac	bl 0x00c34250
00b27cb0	mov x20,x0
00b27cb4	cbz x0,0x00b27cec
00b27cb8	mov w0,#0x100
00b27cbc	bl 0x00c41410
00b27cc0	mov x6,x0
00b27cc4	mov w1,#0x100
00b27cc8	mov w2,#0x80
00b27ccc	mov w4,#0x1
00b27cd0	mov x0,x20
00b27cd4	mov x3,xzr
00b27cd8	mov x5,xzr
00b27cdc	mov x7,x19
00b27ce0	bl 0x00c41280
00b27ce4	b 0x00b27cec
00b27ce8	mov x20,xzr
00b27cec	ldp x29,x30,[sp, #0x10]
00b27cf0	mov x0,x20
00b27cf4	ldp x20,x19,[sp], #0x20
00b27cf8	ret
