; FUN_00925d80 @ 00925d80
00925d80	cbz x1,0x00925e00
00925d84	ldr x9,[x0, #0x18]
00925d88	cbz x9,0x00925e00
00925d8c	ldr x8,[x0]
00925d90	cmp x8,x1
00925d94	b.eq 0x00925db8
00925d98	ldr x8,[x1, #0x8]
00925d9c	cbz x8,0x00925da8
00925da0	ldr x10,[x1, #0x10]
00925da4	str x10,[x8, #0x10]
00925da8	ldr x10,[x1, #0x10]
00925dac	cbz x10,0x00925dcc
00925db0	str x8,[x10, #0x8]
00925db4	b 0x00925dd8
00925db8	ldr x8,[x1, #0x10]
00925dbc	str x8,[x0]
00925dc0	cbz x8,0x00925dd4
00925dc4	str xzr,[x8, #0x8]
00925dc8	b 0x00925dd8
00925dcc	str x8,[x0, #0x8]
00925dd0	b 0x00925dd8
00925dd4	str xzr,[x0, #0x8]
00925dd8	ldr x8,[x1]
00925ddc	stp xzr,xzr,[x1, #0x8]
00925de0	str xzr,[x1]
00925de4	ldr x3,[x0, #0x10]
00925de8	sub x9,x9,#0x1
00925dec	str x9,[x0, #0x18]
00925df0	cbz x3,0x00925e00
00925df4	mov x0,x2
00925df8	mov x1,x8
00925dfc	br x3
00925e00	ret
