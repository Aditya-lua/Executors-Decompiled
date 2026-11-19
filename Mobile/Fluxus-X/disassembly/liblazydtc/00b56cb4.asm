; FUN_00b56cb4 @ 00b56cb4
00b56cb4	stp x26,x25,[sp, #-0x50]!
00b56cb8	stp x24,x23,[sp, #0x10]
00b56cbc	stp x22,x21,[sp, #0x20]
00b56cc0	stp x20,x19,[sp, #0x30]
00b56cc4	stp x29,x30,[sp, #0x40]
00b56cc8	add x29,sp,#0x40
00b56ccc	cbz x1,0x00b56e0c
00b56cd0	ldr x26,[x0, #0xf8]
00b56cd4	mov x21,x3
00b56cd8	movi v0.2D,#0x0
00b56cdc	mov x25,x0
00b56ce0	mov x3,x26
00b56ce4	str q0,[x3, #0x34]!
00b56ce8	ldr x0,[x26]
00b56cec	mov x22,x5
00b56cf0	mov x19,x4
00b56cf4	mov x23,x2
00b56cf8	mov x24,x1
00b56cfc	mov w5,#0xffffffff
00b56d00	mov x1,xzr
00b56d04	mov x2,xzr
00b56d08	mov x4,xzr
00b56d0c	mov x20,x6
00b56d10	stur q0,[x26, #0x54]
00b56d14	stur q0,[x26, #0x44]
00b56d18	bl 0x00c34be0
00b56d1c	cbz w0,0x00b56e10
00b56d20	ldrb w8,[x26, #0x63]
00b56d24	ldrb w9,[x26, #0x62]
00b56d28	ldrb w10,[x26, #0x61]
00b56d2c	mov x0,x25
00b56d30	add w8,w8,#0x1
00b56d34	strb w8,[x26, #0x63]
00b56d38	add w8,w9,w8, LSR #0x8
00b56d3c	ldrb w9,[x26, #0x60]
00b56d40	strb w8,[x26, #0x62]
00b56d44	add w8,w10,w8, LSR #0x8
00b56d48	ldrb w10,[x26, #0x5f]
00b56d4c	strb w8,[x26, #0x61]
00b56d50	add w8,w9,w8, LSR #0x8
00b56d54	ldrb w9,[x26, #0x5e]
00b56d58	strb w8,[x26, #0x60]
00b56d5c	add w8,w10,w8, LSR #0x8
00b56d60	ldrb w10,[x26, #0x5d]
00b56d64	strb w8,[x26, #0x5f]
00b56d68	add w8,w9,w8, LSR #0x8
00b56d6c	ldrb w9,[x26, #0x5c]
00b56d70	strb w8,[x26, #0x5e]
00b56d74	add w8,w10,w8, LSR #0x8
00b56d78	ldrb w10,[x26, #0x5b]
00b56d7c	strb w8,[x26, #0x5d]
00b56d80	add w8,w9,w8, LSR #0x8
00b56d84	ldrb w9,[x26, #0x5a]
00b56d88	strb w8,[x26, #0x5c]
00b56d8c	add w8,w10,w8, LSR #0x8
00b56d90	ldrb w10,[x26, #0x59]
00b56d94	strb w8,[x26, #0x5b]
00b56d98	add w8,w9,w8, LSR #0x8
00b56d9c	ldrb w9,[x26, #0x58]
00b56da0	strb w8,[x26, #0x5a]
00b56da4	add w8,w10,w8, LSR #0x8
00b56da8	ldrb w10,[x26, #0x57]
00b56dac	strb w8,[x26, #0x59]
00b56db0	add w8,w9,w8, LSR #0x8
00b56db4	ldrb w9,[x26, #0x56]
00b56db8	strb w8,[x26, #0x58]
00b56dbc	add w8,w10,w8, LSR #0x8
00b56dc0	ldrb w10,[x26, #0x55]
00b56dc4	strb w8,[x26, #0x57]
00b56dc8	add w8,w9,w8, LSR #0x8
00b56dcc	ldrb w9,[x26, #0x54]
00b56dd0	strb w8,[x26, #0x56]
00b56dd4	add w8,w10,w8, LSR #0x8
00b56dd8	strb w8,[x26, #0x55]
00b56ddc	add w8,w9,w8, LSR #0x8
00b56de0	mov x1,x24
00b56de4	mov x2,x23
00b56de8	mov x3,x22
00b56dec	mov x4,x20
00b56df0	mov x5,x21
00b56df4	mov x6,x19
00b56df8	strb w8,[x26, #0x54]
00b56dfc	bl 0x00b57484
00b56e00	cmp w0,#0x0
00b56e04	cset w0,ne
00b56e08	b 0x00b56e10
00b56e0c	mov w0,wzr
00b56e10	ldp x29,x30,[sp, #0x40]
00b56e14	ldp x20,x19,[sp, #0x30]
00b56e18	ldp x22,x21,[sp, #0x20]
00b56e1c	ldp x24,x23,[sp, #0x10]
00b56e20	ldp x26,x25,[sp], #0x50
00b56e24	ret
