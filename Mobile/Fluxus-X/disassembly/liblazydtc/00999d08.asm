; ix::WebSocketTransport::sendCloseFrame @ 00999d08
00999d08	sub sp,sp,#0xb0
00999d0c	str x21,[sp, #0x80]
00999d10	stp x20,x19,[sp, #0x90]
00999d14	stp x29,x30,[sp, #0xa0]
00999d18	add x29,sp,#0xa0
00999d1c	adrp x8,0xcb5000
00999d20	mrs x20,tpidr_el0
00999d24	ldr x8,[x8, #0x98]
00999d28	mov x19,x0
00999d2c	ldrh w8,[x8]
00999d30	ldr x9,[x20, #0x28]
00999d34	cmp w8,w1, UXTH 
00999d38	stur x9,[x29, #-0x28]
00999d3c	b.ne 0x00999d7c
00999d40	add x8,sp,#0x28
00999d44	orr x8,x8,#0x1
00999d48	stp xzr,xzr,[sp, #0x28]
00999d4c	str xzr,[sp, #0x38]
00999d50	stp x8,xzr,[sp, #0x18]
00999d54	str xzr,[sp, #0x60]
00999d58	mov x8,sp
00999d5c	mov w1,#0x8
00999d60	add x2,sp,#0x18
00999d64	add x4,sp,#0x40
00999d68	mov x0,x19
00999d6c	mov w3,wzr
00999d70	add x21,sp,#0x40
00999d74	bl 0x00c33f00
00999d78	b 0x00999e04
00999d7c	lsr w8,w1,#0x8
00999d80	mov w9,#0x4
00999d84	stp xzr,xzr,[sp, #0x28]
00999d88	str xzr,[sp, #0x38]
00999d8c	strb w9,[sp, #0x28]
00999d90	strb w8,[sp, #0x29]
00999d94	strb w1,[sp, #0x2a]
00999d98	strb wzr,[sp, #0x2b]
00999d9c	ldrb w8,[x2]
00999da0	ldp x9,x10,[x2, #0x8]
00999da4	add x21,sp,#0x28
00999da8	tst w8,#0x1
00999dac	lsr w11,w8,#0x1
00999db0	csinc x1,x10,x2,ne
00999db4	csel x2,x11,x9,eq
00999db8	add x0,sp,#0x28
00999dbc	bl 0x00c308c0
00999dc0	ldrb w8,[sp, #0x28]
00999dc4	ldp x11,x10,[sp, #0x30]
00999dc8	orr x9,x21,#0x1
00999dcc	str xzr,[sp, #0x60]
00999dd0	tst w8,#0x1
00999dd4	lsr w8,w8,#0x1
00999dd8	csel x9,x9,x10,eq
00999ddc	csel x8,x8,x11,eq
00999de0	stp x9,x8,[sp, #0x18]
00999de4	mov x8,sp
00999de8	mov w1,#0x8
00999dec	add x2,sp,#0x18
00999df0	add x4,sp,#0x40
00999df4	mov x0,x19
00999df8	mov w3,wzr
00999dfc	add x21,sp,#0x40
00999e00	bl 0x00c33f00
00999e04	ldr x0,[sp, #0x60]
00999e08	cmp x21,x0
00999e0c	b.eq 0x00999e20
00999e10	cbz x0,0x00999e2c
00999e14	ldr x8,[x0]
00999e18	ldr x8,[x8, #0x28]
00999e1c	b 0x00999e28
00999e20	ldr x8,[x0]
00999e24	ldr x8,[x8, #0x20]
00999e28	blr x8
00999e2c	ldrb w8,[sp, #0x28]
00999e30	tbz w8,#0x0,0x00999e3c
00999e34	ldr x0,[sp, #0x38]
00999e38	bl 0x00c301d0
00999e3c	ldr x8,[x20, #0x28]
00999e40	ldur x9,[x29, #-0x28]
00999e44	cmp x8,x9
00999e48	b.ne 0x00999e60
00999e4c	ldp x29,x30,[sp, #0xa0]
00999e50	ldp x20,x19,[sp, #0x90]
00999e54	ldr x21,[sp, #0x80]
00999e58	add sp,sp,#0xb0
00999e5c	ret
00999e60	bl 0x00c2fec0
