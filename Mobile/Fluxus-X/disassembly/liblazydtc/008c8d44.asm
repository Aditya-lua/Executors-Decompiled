; FUN_008c8d44 @ 008c8d44
008c8d44	ldr x8,[x0, #0x50]
008c8d48	mov w9,#0x1
008c8d4c	ldr x11,[x8, #0x8]
008c8d50	ldr w13,[x8, #0x28]
008c8d54	sub x10,x8,#0x30
008c8d58	str w9,[x11]
008c8d5c	cmp w13,#0x0
008c8d60	str w9,[x11, #0xc]
008c8d64	cset w9,gt
008c8d68	add x11,x11,#0x10
008c8d6c	ldrsw x12,[x8, #0x20]
008c8d70	sub w9,w13,w9
008c8d74	cbz w12,0x008c8d98
008c8d78	ldr x13,[x0, #0x70]
008c8d7c	cmn w9,#0x1
008c8d80	add x12,x13,x12, LSL #0x4
008c8d84	b.eq 0x008c8db8
008c8d88	add x13,x12,w9, SXTW  #0x4
008c8d8c	cmp x12,x13
008c8d90	b.cc 0x008c8dc4
008c8d94	b 0x008c8de0
008c8d98	cmn w9,#0x1
008c8d9c	mov w12,w9
008c8da0	b.ne 0x008c8db0
008c8da4	ldp x12,x13,[x0, #0x68]
008c8da8	sub x12,x12,x13
008c8dac	lsr x12,x12,#0x4
008c8db0	add x14,x11,w12, SXTW  #0x4
008c8db4	b 0x008c8de4
008c8db8	ldr x13,[x0, #0x68]
008c8dbc	cmp x12,x13
008c8dc0	b.cs 0x008c8de0
008c8dc4	ldr q0,[x12], #0x10
008c8dc8	add x14,x11,#0x10
008c8dcc	cmp x12,x13
008c8dd0	str q0,[x11]
008c8dd4	mov x11,x14
008c8dd8	b.cc 0x008c8dc4
008c8ddc	b 0x008c8de4
008c8de0	mov x14,x11
008c8de4	ldur x11,[x8, #-0x20]
008c8de8	cmn w9,#0x1
008c8dec	str x10,[x0, #0x50]
008c8df0	str x11,[x0, #0x70]
008c8df4	b.eq 0x008c8dfc
008c8df8	ldur x14,[x8, #-0x18]
008c8dfc	str x14,[x0, #0x68]
008c8e00	ret
