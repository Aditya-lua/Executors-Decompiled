; FUN_00873d04 @ 00873d04
00873d04	sub sp,sp,#0xc0
00873d08	stp x29,x30,[sp, #0x90]
00873d0c	stp x22,x21,[sp, #0xa0]
00873d10	stp x20,x19,[sp, #0xb0]
00873d14	add x29,sp,#0x90
00873d18	mrs x22,tpidr_el0
00873d1c	mov x19,x0
00873d20	movi v0.2D,#0x0
00873d24	ldr x8,[x22, #0x28]
00873d28	stur x8,[x29, #-0x8]
00873d2c	ldp x21,x20,[x0, #0x8]!
00873d30	ldr x8,[x0, #0x10]
00873d34	str wzr,[sp, #0x20]
00873d38	stp q0,q0,[sp]
00873d3c	cmp x20,x8
00873d40	stur q0,[sp, #0x28]
00873d44	stur q0,[sp, #0x38]
00873d48	stur q0,[sp, #0x48]
00873d4c	stur q0,[sp, #0x58]
00873d50	strb w1,[sp, #0x19]
00873d54	stur q0,[sp, #0x68]
00873d58	stur q0,[sp, #0x78]
00873d5c	strb w2,[sp, #0x1b]
00873d60	b.cs 0x00873d7c
00873d64	mov x1,sp
00873d68	mov x0,x20
00873d6c	bl 0x00879ac0
00873d70	add x0,x20,#0x88
00873d74	str x0,[x19, #0x10]
00873d78	b 0x00873d84
00873d7c	mov x1,sp
00873d80	bl 0x0087987c
00873d84	sub x8,x20,x21
00873d88	orr x9,xzr,#-0xf0f0f0f0f0f0f10
00873d8c	str x0,[x19, #0x10]
00873d90	asr x8,x8,#0x3
00873d94	movk x9,#0xf0f1
00873d98	strb wzr,[x19, #0xf0]
00873d9c	str wzr,[x19, #0x1a0]
00873da0	mul x20,x8,x9
00873da4	ldrb w8,[sp, #0x70]
00873da8	str w20,[x19, #0x20]
00873dac	tbz w8,#0x0,0x00873dc0
00873db0	ldr x8,[sp, #0x70]
00873db4	ldr x0,[sp, #0x80]
00873db8	and x1,x8,#-0x2
00873dbc	bl 0x00c2fe80
00873dc0	ldr x0,[sp, #0x58]
00873dc4	cbz x0,0x00873dd8
00873dc8	ldr x8,[sp, #0x68]
00873dcc	str x0,[sp, #0x60]
00873dd0	sub x1,x8,x0
00873dd4	bl 0x00c2fe80
00873dd8	ldrb w8,[sp, #0x40]
00873ddc	tbnz w8,#0x0,0x00873e28
00873de0	ldrb w8,[sp, #0x28]
00873de4	tbnz w8,#0x0,0x00873e40
00873de8	ldrb w8,[sp]
00873dec	tbz w8,#0x0,0x00873e00
00873df0	ldr x8,[sp]
00873df4	ldr x0,[sp, #0x10]
00873df8	and x1,x8,#-0x2
00873dfc	bl 0x00c2fe80
00873e00	ldr x8,[x22, #0x28]
00873e04	ldur x9,[x29, #-0x8]
00873e08	cmp x8,x9
00873e0c	b.ne 0x00873e8c
00873e10	mov w0,w20
00873e14	ldp x20,x19,[sp, #0xb0]
00873e18	ldp x22,x21,[sp, #0xa0]
00873e1c	ldp x29,x30,[sp, #0x90]
00873e20	add sp,sp,#0xc0
00873e24	ret
00873e28	ldr x8,[sp, #0x40]
00873e2c	ldr x0,[sp, #0x50]
00873e30	and x1,x8,#-0x2
00873e34	bl 0x00c2fe80
00873e38	ldrb w8,[sp, #0x28]
00873e3c	tbz w8,#0x0,0x00873de8
00873e40	ldr x8,[sp, #0x28]
00873e44	ldr x0,[sp, #0x38]
00873e48	and x1,x8,#-0x2
00873e4c	bl 0x00c2fe80
00873e50	ldrb w8,[sp]
00873e54	tbnz w8,#0x0,0x00873df0
00873e58	b 0x00873e00
00873e8c	bl 0x00c2fec0
