; FUN_00c29ce0 @ 00c29ce0
00c29ce0	bti c
00c29ce4	nop
00c29ce8	adr x8,0xd27ea0
00c29cec	cmp x0,x8
00c29cf0	b.cc 0x00c29d08
00c29cf4	adrp x8,0xd28000
00c29cf8	add x8,x8,#0xa0
00c29cfc	cmp x0,x8
00c29d00	b.cs 0x00c29d08
00c29d04	b 0x00c29d0c
00c29d08	b 0x00c30960
00c29d0c	paciasp
00c29d10	stp x29,x30,[sp, #-0x20]!
00c29d14	stp x20,x19,[sp, #0x10]
00c29d18	mov x29,sp
00c29d1c	mov x19,x0
00c29d20	sub x20,x0,#0x4
00c29d24	nop
00c29d28	adr x0,0xd27e68
00c29d2c	bl 0x00c31ca0
00c29d30	adrp x8,0xd27000
00c29d34	ldr x9,[x8, #0xe90]
00c29d38	cbz x9,0x00c29d94
00c29d3c	adrp x10,0xd28000
00c29d40	add x10,x10,#0xa0
00c29d44	cmp x9,x10
00c29d48	b.eq 0x00c29d94
00c29d4c	mov x10,xzr
00c29d50	nop
00c29d54	adr x12,0xd27ea0
00c29d58	mov x11,x9
00c29d5c	ldrh w13,[x11, #0x2]
00c29d60	add x14,x11,x13, LSL #0x2
00c29d64	cmp x14,x20
00c29d68	b.eq 0x00c29db0
00c29d6c	ldurh w14,[x19, #-0x2]
00c29d70	add x15,x20,x14, LSL #0x2
00c29d74	cmp x15,x11
00c29d78	b.eq 0x00c29dc0
00c29d7c	ldrh w10,[x11]
00c29d80	add x13,x12,x10, LSL #0x2
00c29d84	cmp x10,#0x80
00c29d88	mov x10,x11
00c29d8c	mov x11,x13
00c29d90	b.ne 0x00c29d5c
00c29d94	nop
00c29d98	adr x10,0xd27ea0
00c29d9c	str x20,[x8, #0xe90]
00c29da0	sub w9,w9,w10
00c29da4	lsr w9,w9,#0x2
00c29da8	strh w9,[x20]
00c29dac	b 0x00c29df0
00c29db0	ldurh w8,[x19, #-0x2]
00c29db4	add w8,w8,w13
00c29db8	strh w8,[x11, #0x2]
00c29dbc	b 0x00c29df0
00c29dc0	add w9,w14,w13
00c29dc4	sturh w9,[x19, #-0x2]
00c29dc8	cbz x10,0x00c29de4
00c29dcc	nop
00c29dd0	adr x8,0xd27ea0
00c29dd4	sub w8,w20,w8
00c29dd8	lsr w8,w8,#0x2
00c29ddc	strh w8,[x10]
00c29de0	b 0x00c29df0
00c29de4	ldrh w9,[x11]
00c29de8	str x20,[x8, #0xe90]
00c29dec	strh w9,[x20]
00c29df0	nop
00c29df4	adr x0,0xd27e68
00c29df8	bl 0x00c31cb0
00c29dfc	ldp x20,x19,[sp, #0x10]
00c29e00	ldp x29,x30,[sp], #0x20
00c29e04	autiasp
00c29e08	ret
