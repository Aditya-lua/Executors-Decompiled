; FUN_008b7d74 @ 008b7d74
008b7d74	stp x29,x30,[sp, #-0x40]!
008b7d78	stp x24,x23,[sp, #0x10]
008b7d7c	stp x22,x21,[sp, #0x20]
008b7d80	stp x20,x19,[sp, #0x30]
008b7d84	mov x29,sp
008b7d88	ldr x23,[x0, #0x60]
008b7d8c	mov w20,w3
008b7d90	mov x19,x2
008b7d94	ldr x8,[x23, #0x650]
008b7d98	cbnz x8,0x008b7eb0
008b7d9c	sub x8,x19,#0x1
008b7da0	cmp x8,#0x3ff
008b7da4	b.hi 0x008b7dbc
008b7da8	adrp x8,0xd1f000
008b7dac	add x8,x8,#0x638
008b7db0	add x8,x8,x19
008b7db4	ldrsb w10,[x8, #0xa0]
008b7db8	b 0x008b7dc0
008b7dbc	mov w10,#0xffffffff
008b7dc0	strb wzr,[x1]
008b7dc4	adrp x8,0xd1f000
008b7dc8	ldr x9,[x0, #0x60]
008b7dcc	ldr x12,[x4, #0x28]
008b7dd0	ldrb w8,[x8, #0x618]
008b7dd4	add x11,x9,#0x1f0
008b7dd8	cbnz x12,0x008b7df8
008b7ddc	ldr w13,[x4, #0x30]
008b7de0	tbz w13,#0x1f,0x008b7df8
008b7de4	ldr x13,[x11, w10, SXTW #0x3]
008b7de8	str x13,[x4, #0x18]
008b7dec	cbz x13,0x008b7df4
008b7df0	str x4,[x13, #0x10]
008b7df4	str x4,[x11, w10, SXTW #0x3]
008b7df8	ldr w13,[x4, #0x34]
008b7dfc	str x12,[x1, #0x8]
008b7e00	str x1,[x4, #0x28]
008b7e04	subs w12,w13,#0x1
008b7e08	str w12,[x4, #0x34]
008b7e0c	b.ne 0x008b7e78
008b7e10	ldp x13,x12,[x4, #0x10]
008b7e14	cbz x12,0x008b7e1c
008b7e18	str x13,[x12, #0x10]
008b7e1c	cbz x13,0x008b7e28
008b7e20	str x12,[x13, #0x18]
008b7e24	b 0x008b7e3c
008b7e28	and w10,w10,#0xff
008b7e2c	ldr x13,[x11, w10, UXTW #0x3]
008b7e30	cmp x13,x4
008b7e34	b.ne 0x008b7e3c
008b7e38	str x12,[x11, w10, UXTW #0x3]
008b7e3c	ldp x12,x11,[x4]
008b7e40	ldr x10,[x0, #0x60]
008b7e44	cbz x11,0x008b7e4c
008b7e48	str x12,[x11]
008b7e4c	cbz x12,0x008b7e58
008b7e50	str x11,[x12, #0x8]
008b7e54	b 0x008b7e64
008b7e58	ldr x12,[x9, #0x330]
008b7e5c	cmp x12,x4
008b7e60	b.eq 0x008b7ea8
008b7e64	ldp x8,x0,[x10, #0x48]
008b7e68	ldrsw x2,[x4, #0x20]
008b7e6c	mov x1,x4
008b7e70	mov x3,xzr
008b7e74	blr x8
008b7e78	add x8,x23,w20, UXTB  #0x3
008b7e7c	ldr x9,[x23, #0x10]
008b7e80	ldr x10,[x8, #0x3848]
008b7e84	sub x9,x9,x19
008b7e88	str x9,[x23, #0x10]
008b7e8c	sub x9,x10,x19
008b7e90	str x9,[x8, #0x3848]
008b7e94	ldp x20,x19,[sp, #0x30]
008b7e98	ldp x22,x21,[sp, #0x20]
008b7e9c	ldp x24,x23,[sp, #0x10]
008b7ea0	ldp x29,x30,[sp], #0x40
008b7ea4	ret
008b7ea8	str x11,[x9, #0x330]
008b7eac	b 0x008b7e64
008b7eb0	mov x21,x0
008b7eb4	mov x22,x1
008b7eb8	mov x24,x4
008b7ebc	blr x8
008b7ec0	mov x1,x22
008b7ec4	mov x0,x21
008b7ec8	mov x4,x24
008b7ecc	b 0x008b7d9c
