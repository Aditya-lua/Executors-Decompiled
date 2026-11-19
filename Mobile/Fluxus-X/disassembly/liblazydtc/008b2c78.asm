; FUN_008b2c78 @ 008b2c78
008b2c78	stp x29,x30,[sp, #-0x40]!
008b2c7c	stp x24,x23,[sp, #0x10]
008b2c80	stp x22,x21,[sp, #0x20]
008b2c84	stp x20,x19,[sp, #0x30]
008b2c88	mov x29,sp
008b2c8c	ldr x8,[x0, #0x70]
008b2c90	ldrb w2,[x0, #0x4]
008b2c94	mov w1,#0x28
008b2c98	mov w3,#0xc
008b2c9c	mov w4,wzr
008b2ca0	mov x19,x0
008b2ca4	ldr x22,[x8]
008b2ca8	mov w21,#0xc
008b2cac	bl 0x008b78d0
008b2cb0	movi v0.2D,#0x0
008b2cb4	str xzr,[x0, #0x20]
008b2cb8	mov x20,x0
008b2cbc	stp q0,q0,[x0]
008b2cc0	ldr x8,[x19, #0x60]
008b2cc4	ldrb w2,[x19, #0x4]
008b2cc8	strb w21,[x0]
008b2ccc	str x22,[x0, #0x10]
008b2cd0	ldrb w8,[x8, #0x2]
008b2cd4	strb w2,[x0, #0x1]
008b2cd8	and w8,w8,#0x3
008b2cdc	strb w8,[x0, #0x2]
008b2ce0	ldr w8,[x22, #0x58]
008b2ce4	mov x0,x19
008b2ce8	lsl x1,x8,#0x4
008b2cec	bl 0x008b7610
008b2cf0	ldr w8,[x22, #0x58]
008b2cf4	str x0,[x20, #0x20]
008b2cf8	str w8,[x20, #0x18]
008b2cfc	cbz w8,0x008b2d4c
008b2d00	cmp w8,#0x1
008b2d04	b.ne 0x008b2d10
008b2d08	mov x9,xzr
008b2d0c	b 0x008b2d34
008b2d10	and x9,x8,#0xfffffffe
008b2d14	add x10,x0,#0x1c
008b2d18	mov x11,x9
008b2d1c	subs x11,x11,#0x2
008b2d20	stur wzr,[x10, #-0x10]
008b2d24	str wzr,[x10], #0x20
008b2d28	b.ne 0x008b2d1c
008b2d2c	cmp x9,x8
008b2d30	b.eq 0x008b2d4c
008b2d34	add x10,x0,x9, LSL #0x4
008b2d38	sub x8,x8,x9
008b2d3c	add x10,x10,#0xc
008b2d40	subs x8,x8,#0x1
008b2d44	str wzr,[x10], #0x10
008b2d48	b.ne 0x008b2d40
008b2d4c	adrp x1,0x2c0000
008b2d50	add x1,x1,#0xe42
008b2d54	mov x0,x19
008b2d58	mov w2,#0x6
008b2d5c	bl 0x008b9ff8
008b2d60	ldr x8,[x22, #0x38]
008b2d64	mov x1,x0
008b2d68	mov x0,x8
008b2d6c	bl 0x008bb440
008b2d70	ldp x9,x8,[x19, #0x68]
008b2d74	ldr d0,[x0]
008b2d78	ldr w10,[x22, #0x58]
008b2d7c	ldr x24,[x22, #0x28]
008b2d80	fcvtzu w12,d0
008b2d84	sub x23,x9,x8
008b2d88	str x20,[x9]
008b2d8c	lsr x22,x23,#0x4
008b2d90	ldr x11,[x19, #0x68]
008b2d94	ldr x13,[x19, #0x48]
008b2d98	str w21,[x9, #0xc]
008b2d9c	add w8,w22,#0x1
008b2da0	add x1,x11,#0x10
008b2da4	sub w21,w12,w10
008b2da8	lsl w11,w8,#0x4
008b2dac	sub x13,x13,x1
008b2db0	str x1,[x19, #0x68]
008b2db4	cmp x13,w11, SXTW 
008b2db8	b.gt 0x008b2dcc
008b2dbc	mov x0,x19
008b2dc0	mov w1,w8
008b2dc4	bl 0x008b41e4
008b2dc8	ldr x1,[x19, #0x68]
008b2dcc	add x8,x1,#0x10
008b2dd0	cmp w22,#0x2
008b2dd4	str x8,[x19, #0x68]
008b2dd8	ldr q0,[x24,w21, uxtw #4]
008b2ddc	str q0,[x1]
008b2de0	ldr x8,[x19, #0x68]
008b2de4	add x9,x8,#0x10
008b2de8	str x9,[x19, #0x68]
008b2dec	mov w9,#0xc
008b2df0	str x20,[x8]
008b2df4	str w9,[x8, #0xc]
008b2df8	b.lt 0x008b2e28
008b2dfc	ubfx x8,x23,#0x4,#0x1f
008b2e00	mov w9,#0x10
008b2e04	sub x8,x8,#0x1
008b2e08	ldp x10,x11,[x19, #0x68]
008b2e0c	subs x8,x8,#0x1
008b2e10	add x12,x10,#0x10
008b2e14	str x12,[x19, #0x68]
008b2e18	ldr q0,[x11,x9]
008b2e1c	add x9,x9,#0x10
008b2e20	str q0,[x10]
008b2e24	b.ne 0x008b2e08
008b2e28	mov x0,x19
008b2e2c	mov w2,wzr
008b2e30	bl 0x008b465c
008b2e34	mov w0,#0x1
008b2e38	ldp x20,x19,[sp, #0x30]
008b2e3c	ldp x22,x21,[sp, #0x20]
008b2e40	ldp x24,x23,[sp, #0x10]
008b2e44	ldp x29,x30,[sp], #0x40
008b2e48	ret
