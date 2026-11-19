; FUN_00c15d60 @ 00c15d60
00c15d60	paciasp
00c15d64	stp x29,x30,[sp, #-0x30]!
00c15d68	str x21,[sp, #0x10]
00c15d6c	stp x20,x19,[sp, #0x20]
00c15d70	mov x29,sp
00c15d74	ldr x21,[x0, #0x1330]
00c15d78	mov x19,x1
00c15d7c	ldr x8,[x21, #0x8]
00c15d80	sub x9,x8,#0xfd0
00c15d84	cmn x9,#0xff1
00c15d88	b.hi 0x00c15dac
00c15d8c	mov x20,x0
00c15d90	mov w0,#0x1000
00c15d94	bl 0x00c308d0
00c15d98	cbz x0,0x00c15e08
00c15d9c	mov x8,xzr
00c15da0	stp x21,xzr,[x0]
00c15da4	mov x21,x0
00c15da8	str x0,[x20, #0x1330]
00c15dac	add x9,x8,#0x20
00c15db0	mov x0,x19
00c15db4	add x20,x21,x8
00c15db8	str x9,[x21, #0x8]
00c15dbc	bl 0x00c2ff50
00c15dc0	adrp x9,0xcb1000
00c15dc4	add x9,x9,#0x4c0
00c15dc8	mov w11,#0x540
00c15dcc	str x9,[x20, #0x10]!
00c15dd0	ldurh w9,[x20, #0x9]
00c15dd4	mov x8,x0
00c15dd8	mov w10,#0x8
00c15ddc	and w9,w9,#0xf000
00c15de0	strb w10,[x20, #0x8]
00c15de4	orr w9,w9,w11
00c15de8	stp x19,x8,[x20, #0x10]
00c15dec	sturh w9,[x20, #0x9]
00c15df0	mov x0,x20
00c15df4	ldp x20,x19,[sp, #0x20]
00c15df8	ldr x21,[sp, #0x10]
00c15dfc	ldp x29,x30,[sp], #0x30
00c15e00	autiasp
00c15e04	ret
00c15e08	bl 0x00c2fff0
