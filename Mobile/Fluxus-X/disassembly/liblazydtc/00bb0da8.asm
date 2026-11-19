; FUN_00bb0da8 @ 00bb0da8
00bb0da8	stp x29,x30,[sp, #-0x20]!
00bb0dac	stp x20,x19,[sp, #0x10]
00bb0db0	mov x29,sp
00bb0db4	mov w19,#0x7600
00bb0db8	mov x8,x0
00bb0dbc	ldr w9,[x0, x19#0x0]
00bb0dc0	cmn w9,#0x1
00bb0dc4	b.eq 0x00bb0ddc
00bb0dc8	cmp w9,#0x1
00bb0dcc	b.ne 0x00bb0de4
00bb0dd0	ldr x0,[x8, #0x75f0]
00bb0dd4	str wzr,[x8, x19#0x0]
00bb0dd8	b 0x00bb0e04
00bb0ddc	ldr x0,[x8, #0x75f0]
00bb0de0	b 0x00bb0e04
00bb0de4	ldr x0,[x8, #0x75e8]
00bb0de8	mov x20,x8
00bb0dec	bl 0x00c435b0
00bb0df0	movi v0.2D,#0x0
00bb0df4	mov w8,#0x75e8
00bb0df8	mov x0,xzr
00bb0dfc	str wzr,[x20, x19#0x0]
00bb0e00	str q0,[x20,x8]
00bb0e04	ldp x20,x19,[sp, #0x10]
00bb0e08	ldp x29,x30,[sp], #0x20
00bb0e0c	ret
