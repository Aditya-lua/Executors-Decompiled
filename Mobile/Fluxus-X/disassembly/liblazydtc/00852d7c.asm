; FUN_00852d7c @ 00852d7c
00852d7c	stp x29,x30,[sp, #-0x30]!
00852d80	stp x22,x21,[sp, #0x10]
00852d84	stp x20,x19,[sp, #0x20]
00852d88	mov x29,sp
00852d8c	mov x19,x0
00852d90	mov x0,x1
00852d94	mov x21,x1
00852d98	bl 0x00c2ff50
00852d9c	cmn x0,#0x8
00852da0	b.cs 0x00852e0c
00852da4	mov x20,x0
00852da8	cmp x0,#0x17
00852dac	b.cs 0x00852dc0
00852db0	lsl w8,w20,#0x1
00852db4	strb w8,[x19], #0x1
00852db8	cbnz x20,0x00852de8
00852dbc	b 0x00852df8
00852dc0	orr x8,x20,#0x7
00852dc4	mov w9,#0x1a
00852dc8	cmp x8,#0x17
00852dcc	csinc x22,x9,x8,eq
00852dd0	mov x0,x22
00852dd4	bl 0x00c2fed0
00852dd8	orr x8,x22,#0x1
00852ddc	stp x20,x0,[x19, #0x8]
00852de0	str x8,[x19]
00852de4	mov x19,x0
00852de8	mov x0,x19
00852dec	mov x1,x21
00852df0	mov x2,x20
00852df4	bl 0x00c2ff60
00852df8	strb wzr,[x19, x20]
00852dfc	ldp x20,x19,[sp, #0x20]
00852e00	ldp x22,x21,[sp, #0x10]
00852e04	ldp x29,x30,[sp], #0x30
00852e08	ret
00852e0c	bl 0x007fe124
