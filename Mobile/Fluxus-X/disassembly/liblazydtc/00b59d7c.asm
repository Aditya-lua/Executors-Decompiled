; FUN_00b59d7c @ 00b59d7c
00b59d7c	stp x24,x23,[sp, #-0x40]!
00b59d80	stp x22,x21,[sp, #0x10]
00b59d84	stp x20,x19,[sp, #0x20]
00b59d88	stp x29,x30,[sp, #0x30]
00b59d8c	add x29,sp,#0x30
00b59d90	mov x24,x5
00b59d94	mov x19,x4
00b59d98	mov x20,x3
00b59d9c	mov w21,w2
00b59da0	mov w22,w1
00b59da4	mov x23,x0
00b59da8	bl 0x00c41000
00b59dac	cbz w0,0x00b59de8
00b59db0	mov x0,x23
00b59db4	mov x1,x24
00b59db8	bl 0x00b59e5c
00b59dbc	cbz w0,0x00b59de8
00b59dc0	mov w1,w22
00b59dc4	mov w2,w21
00b59dc8	mov x3,x20
00b59dcc	mov x4,x19
00b59dd0	ldp x29,x30,[sp, #0x30]
00b59dd4	ldp x20,x19,[sp, #0x20]
00b59dd8	ldp x22,x21,[sp, #0x10]
00b59ddc	mov x0,x23
00b59de0	ldp x24,x23,[sp], #0x40
00b59de4	b 0x00c417d0
00b59de8	ldp x29,x30,[sp, #0x30]
00b59dec	ldp x20,x19,[sp, #0x20]
00b59df0	ldp x22,x21,[sp, #0x10]
00b59df4	mov w0,wzr
00b59df8	ldp x24,x23,[sp], #0x40
00b59dfc	ret
