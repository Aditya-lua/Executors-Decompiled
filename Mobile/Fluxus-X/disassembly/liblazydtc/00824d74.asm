; FUN_00824d74 @ 00824d74
00824d74	stp x29,x30,[sp, #-0x40]!
00824d78	stp x28,x23,[sp, #0x10]
00824d7c	stp x22,x21,[sp, #0x20]
00824d80	stp x20,x19,[sp, #0x30]
00824d84	mov x29,sp
00824d88	sub sp,sp,#0x2c0
00824d8c	mrs x23,tpidr_el0
00824d90	mov x19,x8
00824d94	mov x22,x0
00824d98	ldr x8,[x23, #0x28]
00824d9c	mov x0,sp
00824da0	mov x20,x2
00824da4	mov x21,x1
00824da8	stur x8,[x29, #-0x8]
00824dac	bl 0x00c304b0
00824db0	mov x0,sp
00824db4	mov x1,x22
00824db8	bl 0x00c304c0
00824dbc	mov x0,sp
00824dc0	mov x1,x21
00824dc4	bl 0x00c304d0
00824dc8	mov x0,sp
00824dcc	mov x1,x20
00824dd0	bl 0x00c304e0
00824dd4	mov x0,sp
00824dd8	mov x8,x19
00824ddc	bl 0x00c30550
00824de0	mov x0,sp
00824de4	bl 0x00826308
00824de8	ldr x8,[x23, #0x28]
00824dec	ldur x9,[x29, #-0x8]
00824df0	cmp x8,x9
00824df4	b.ne 0x00824e34
00824df8	add sp,sp,#0x2c0
00824dfc	ldp x20,x19,[sp, #0x30]
00824e00	ldp x22,x21,[sp, #0x20]
00824e04	ldp x28,x23,[sp, #0x10]
00824e08	ldp x29,x30,[sp], #0x40
00824e0c	ret
00824e34	bl 0x00c2fec0
