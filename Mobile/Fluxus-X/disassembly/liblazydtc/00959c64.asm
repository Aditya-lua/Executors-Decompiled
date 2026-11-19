; FUN_00959c64 @ 00959c64
00959c64	sub sp,sp,#0xd0
00959c68	str x27,[sp, #0x70]
00959c6c	stp x26,x25,[sp, #0x80]
00959c70	stp x24,x23,[sp, #0x90]
00959c74	stp x22,x21,[sp, #0xa0]
00959c78	stp x20,x19,[sp, #0xb0]
00959c7c	stp x29,x30,[sp, #0xc0]
00959c80	add x29,sp,#0xc0
00959c84	mrs x27,tpidr_el0
00959c88	ldr x8,[x27, #0x28]
00959c8c	mov x21,x0
00959c90	mov x0,xzr
00959c94	mov x19,x4
00959c98	mov x20,x3
00959c9c	mov x24,x2
00959ca0	mov x25,x1
00959ca4	stur x8,[x29, #-0x58]
00959ca8	bl 0x00c30970
00959cac	adrp x9,0xcb4000
00959cb0	ldr w8,[x24, #0xc]
00959cb4	ldr x9,[x9, #0xdd0]
00959cb8	mov x26,x0
00959cbc	mov w0,#0x1
00959cc0	add w22,w8,#0x30
00959cc4	ldr x9,[x9]
00959cc8	mov x1,x22
00959ccc	blr x9
00959cd0	mov x23,x0
00959cd4	cbz x0,0x00959dd4
00959cd8	mov x9,#0x8000
00959cdc	movk x9,#0xd53e, LSL #16
00959ce0	ldr w10,[x24, #0xc]
00959ce4	mov w8,#0x9680
00959ce8	movk x9,#0xb1de, LSL #32
00959cec	movk w8,#0x98, LSL #16
00959cf0	movk x9,#0x19d, LSL #48
00959cf4	madd x8,x26,x8,x9
00959cf8	adrp x2,0x2c5000
00959cfc	add x0,x23,#0x10
00959d00	and w9,w8,#0x80
00959d04	ubfx w11,w8,#0x8,#0x8
00959d08	ubfx w12,w8,#0x10,#0x8
00959d0c	lsr w13,w8,#0x18
00959d10	ubfx x14,x8,#0x20,#0x8
00959d14	ubfx x15,x8,#0x28,#0x8
00959d18	ubfx x16,x8,#0x30,#0x8
00959d1c	add w1,w10,#0x20
00959d20	lsr x8,x8,#0x38
00959d24	add x2,x2,#0x255
00959d28	mov w3,#0x1
00959d2c	mov w4,#0x1
00959d30	mov w5,wzr
00959d34	mov w6,wzr
00959d38	mov w7,wzr
00959d3c	str w8,[sp, #0x50]
00959d40	str w16,[sp, #0x48]
00959d44	str w15,[sp, #0x40]
00959d48	str w14,[sp, #0x38]
00959d4c	str w13,[sp, #0x30]
00959d50	str w12,[sp, #0x28]
00959d54	str w11,[sp, #0x20]
00959d58	str w9,[sp, #0x18]
00959d5c	str wzr,[sp, #0x10]
00959d60	str wzr,[sp, #0x8]
00959d64	str wzr,[sp]
00959d68	bl 0x00c31b70
00959d6c	ldr x8,[x25]
00959d70	str x8,[x23, #0x20]
00959d74	ldr w2,[x24, #0xc]
00959d78	cbz w2,0x00959d88
00959d7c	ldr x1,[x24, #0x10]
00959d80	add x0,x23,#0x2c
00959d84	bl 0x00c2ffd0
00959d88	ldur x8,[x24, #0x4]
00959d8c	mov x3,x23
00959d90	adrp x0,0xcb4000
00959d94	mov w2,#0x10
00959d98	str x8,[x3, #0x8]!
00959d9c	ldr w8,[x24, #0xc]
00959da0	ldr x0,[x0, #0xe58]
00959da4	add x5,sp,#0x58
00959da8	mov x1,x21
00959dac	add w4,w8,#0x28
00959db0	bl 0x00923334
00959db4	mov w21,w0
00959db8	cbz w0,0x00959ddc
00959dbc	adrp x8,0xcc4000
00959dc0	add x8,x8,#0x678
00959dc4	mov x0,x23
00959dc8	ldr x8,[x8]
00959dcc	blr x8
00959dd0	b 0x00959dec
00959dd4	mov w21,#0x1b
00959dd8	b 0x00959dec
00959ddc	ldur q0,[sp, #0x58]
00959de0	str q0,[x23]
00959de4	str x23,[x20]
00959de8	str w22,[x19]
00959dec	ldr x8,[x27, #0x28]
00959df0	ldur x9,[x29, #-0x58]
00959df4	cmp x8,x9
00959df8	b.ne 0x00959e20
00959dfc	mov w0,w21
00959e00	ldp x29,x30,[sp, #0xc0]
00959e04	ldp x20,x19,[sp, #0xb0]
00959e08	ldp x22,x21,[sp, #0xa0]
00959e0c	ldp x24,x23,[sp, #0x90]
00959e10	ldp x26,x25,[sp, #0x80]
00959e14	ldr x27,[sp, #0x70]
00959e18	add sp,sp,#0xd0
00959e1c	ret
00959e20	bl 0x00c2fec0
