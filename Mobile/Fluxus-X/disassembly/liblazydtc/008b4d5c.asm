; FUN_008b4d5c @ 008b4d5c
008b4d5c	stp x29,x30,[sp, #-0x40]!
008b4d60	str x23,[sp, #0x10]
008b4d64	stp x22,x21,[sp, #0x20]
008b4d68	stp x20,x19,[sp, #0x30]
008b4d6c	mov x29,sp
008b4d70	mov w19,w1
008b4d74	ldrb w8,[x0, #0x4]
008b4d78	mov x20,x3
008b4d7c	sbfiz x9,x19,#0x4,#0x20
008b4d80	mov x22,x2
008b4d84	mov w3,#0x7
008b4d88	mov w2,w8
008b4d8c	mov w4,wzr
008b4d90	mov x21,x0
008b4d94	add x1,x9,#0x20
008b4d98	mov w23,#0x7
008b4d9c	bl 0x008b78d0
008b4da0	ldr x8,[x21, #0x60]
008b4da4	ldrb w9,[x21, #0x4]
008b4da8	cmp w19,#0x1
008b4dac	ldrb w10,[x20, #0x5]
008b4db0	strb w23,[x0]
008b4db4	ldrb w8,[x8, #0x2]
008b4db8	strb wzr,[x0, #0x6]
008b4dbc	strb w19,[x0, #0x5]
008b4dc0	and w8,w8,#0x3
008b4dc4	strb w9,[x0, #0x1]
008b4dc8	strb w10,[x0, #0x4]
008b4dcc	strb w8,[x0, #0x2]
008b4dd0	strb wzr,[x0, #0x3]
008b4dd4	stp x22,x20,[x0, #0x10]
008b4dd8	b.lt 0x008b4e2c
008b4ddc	cmp w19,#0x1
008b4de0	mov w8,w19
008b4de4	b.ne 0x008b4df0
008b4de8	mov x9,xzr
008b4dec	b 0x008b4e14
008b4df0	and x9,x8,#0x7ffffffe
008b4df4	add x10,x0,#0x3c
008b4df8	mov x11,x9
008b4dfc	subs x11,x11,#0x2
008b4e00	stur wzr,[x10, #-0x10]
008b4e04	str wzr,[x10], #0x20
008b4e08	b.ne 0x008b4dfc
008b4e0c	cmp x9,x8
008b4e10	b.eq 0x008b4e2c
008b4e14	add x10,x0,x9, LSL #0x4
008b4e18	sub x8,x8,x9
008b4e1c	add x10,x10,#0x2c
008b4e20	subs x8,x8,#0x1
008b4e24	str wzr,[x10], #0x10
008b4e28	b.ne 0x008b4e20
008b4e2c	ldp x20,x19,[sp, #0x30]
008b4e30	ldr x23,[sp, #0x10]
008b4e34	ldp x22,x21,[sp, #0x20]
008b4e38	ldp x29,x30,[sp], #0x40
008b4e3c	ret
