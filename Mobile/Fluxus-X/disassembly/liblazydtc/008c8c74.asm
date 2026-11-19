; FUN_008c8c74 @ 008c8c74
008c8c74	ldr x8,[x0, #0x50]
008c8c78	ldr x10,[x0, #0x68]
008c8c7c	ldr w9,[x8, #0x28]
008c8c80	ldr x12,[x8, #0x8]
008c8c84	cmp w9,#0x0
008c8c88	ccmp x1,x10,#0x2,ne
008c8c8c	b.cs 0x008c8cb0
008c8c90	add x11,x1,#0x10
008c8c94	ldur q0,[x11, #-0x10]
008c8c98	subs w9,w9,#0x1
008c8c9c	str q0,[x12], #0x10
008c8ca0	b.eq 0x008c8cb0
008c8ca4	cmp x11,x10
008c8ca8	add x11,x11,#0x10
008c8cac	b.cc 0x008c8c94
008c8cb0	cmp w9,#0x1
008c8cb4	sub x10,x8,#0x30
008c8cb8	b.lt 0x008c8cc8
008c8cbc	b.ne 0x008c8cd0
008c8cc0	mov x11,x12
008c8cc4	b 0x008c8d00
008c8cc8	mov x11,x12
008c8ccc	b 0x008c8d20
008c8cd0	mov w13,w9
008c8cd4	and x14,x13,#0x7ffffffe
008c8cd8	add x11,x12,x14, LSL #0x4
008c8cdc	sub w9,w9,w14
008c8ce0	add x12,x12,#0x1c
008c8ce4	mov x15,x14
008c8ce8	subs x15,x15,#0x2
008c8cec	stur wzr,[x12, #-0x10]
008c8cf0	str wzr,[x12], #0x20
008c8cf4	b.ne 0x008c8ce8
008c8cf8	cmp x14,x13
008c8cfc	b.eq 0x008c8d20
008c8d00	add w9,w9,#0x1
008c8d04	mov x12,x11
008c8d08	sub w9,w9,#0x1
008c8d0c	add x11,x12,#0x10
008c8d10	str wzr,[x12, #0xc]
008c8d14	cmp w9,#0x1
008c8d18	mov x12,x11
008c8d1c	b.hi 0x008c8d08
008c8d20	ldr w9,[x8, #0x28]
008c8d24	ldur x12,[x8, #-0x20]
008c8d28	str x10,[x0, #0x50]
008c8d2c	cmn w9,#0x1
008c8d30	str x12,[x0, #0x70]
008c8d34	b.eq 0x008c8d3c
008c8d38	ldur x11,[x8, #-0x18]
008c8d3c	str x11,[x0, #0x68]
008c8d40	ret
