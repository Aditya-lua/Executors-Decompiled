; BN_swap @ 00a01d7c
00a01d7c	ldr x8,[x1]
00a01d80	ldr w9,[x1, #0x14]
00a01d84	ldp x10,x11,[x0]
00a01d88	ldp w12,w13,[x0, #0x10]
00a01d8c	str x8,[x0]
00a01d90	ldr x8,[x1, #0x8]
00a01d94	and w14,w9,#0xe
00a01d98	bfxil w14,w13,#0x0,#0x1
00a01d9c	and w13,w13,#0xe
00a01da0	str x8,[x0, #0x8]
00a01da4	ldr w8,[x1, #0x10]
00a01da8	bfxil w13,w9,#0x0,#0x1
00a01dac	str w8,[x0, #0x10]
00a01db0	stp x10,x11,[x1]
00a01db4	str w12,[x1, #0x10]
00a01db8	str w14,[x0, #0x14]
00a01dbc	str w13,[x1, #0x14]
00a01dc0	ret
