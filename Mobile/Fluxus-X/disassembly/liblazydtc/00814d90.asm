; FUN_00814d90 @ 00814d90
00814d90	stp x29,x30,[sp, #-0x30]!
00814d94	stp x22,x21,[sp, #0x10]
00814d98	stp x20,x19,[sp, #0x20]
00814d9c	mov x29,sp
00814da0	mov x20,x0
00814da4	mov x19,x8
00814da8	stp xzr,xzr,[x8]
00814dac	str xzr,[x8, #0x10]
00814db0	cbz x0,0x00814de4
00814db4	tbnz x20,#0x3f,0x00814efc
00814db8	mov x0,x20
00814dbc	bl 0x00c2fed0
00814dc0	add x22,x0,x20
00814dc4	mov w1,wzr
00814dc8	mov x2,x20
00814dcc	mov x21,x0
00814dd0	str x0,[x19]
00814dd4	str x22,[x19, #0x10]
00814dd8	bl 0x00c301c0
00814ddc	str x22,[x19, #0x8]
00814de0	b 0x00814de8
00814de4	mov x21,xzr
00814de8	adrp x22,0xd1b000
00814dec	ldrb w8,[x22, #0xff0]
00814df0	tbnz w8,#0x0,0x00814ed8
00814df4	adrp x0,0xd1b000
00814df8	add x0,x0,#0xb58
00814dfc	bl 0x00c30350
00814e00	adrp x0,0xd1b000
00814e04	add x0,x0,#0xe98
00814e08	bl 0x00c30360
00814e0c	adrp x8,0xd1c000
00814e10	add x8,x8,#0x10
00814e14	ldarb w9,[x8]
00814e18	adrp x8,0xd1c000
00814e1c	add x8,x8,#0x0
00814e20	tbz w9,#0x0,0x00814f00
00814e24	adrp x9,0xd1c000
00814e28	ldrb w9,[x9, #0xf]
00814e2c	cmp w9,#0x1
00814e30	b.ne 0x00814e94
00814e34	ldr s0,[x8, #0x8]
00814e38	adrp x9,0x29b000
00814e3c	adrp x10,0x29a000
00814e40	ldr d1,[x9, #0xe0]
00814e44	ldr d2,[x8]
00814e48	ldr d3,[x10, #0x8d8]
00814e4c	uxtl v0.8H,v0.8B
00814e50	ldrb w9,[x8, #0xc]
00814e54	ldrb w10,[x8, #0xd]
00814e58	mov w11,#0x2d
00814e5c	strb wzr,[x8, #0xf]
00814e60	eor w10,w10,w11
00814e64	ldrb w11,[x8, #0xe]
00814e68	eor w9,w9,#0xfffffffd
00814e6c	eor v0.8B,v0.8B,v1.8B
00814e70	eor v1.8B,v2.8B,v3.8B
00814e74	strb w9,[x8, #0xc]
00814e78	mov w9,#0x91
00814e7c	strb w10,[x8, #0xd]
00814e80	eor w9,w11,w9
00814e84	uzp1 v0.8B,v0.8B,v0.8B
00814e88	strb w9,[x8, #0xe]
00814e8c	str d1,[x8]
00814e90	str s0,[x8, #0x8]
00814e94	adrp x21,0xd1c000
00814e98	add x21,x21,#0x0
00814e9c	mov w1,#0x10
00814ea0	mov x0,x21
00814ea4	bl 0x00c30370
00814ea8	mov x4,x0
00814eac	adrp x1,0xcb4000
00814eb0	adrp x0,0xd1b000
00814eb4	add x0,x0,#0xe98
00814eb8	ldr x1,[x1, #0x9f0]
00814ebc	adrp x2,0xd1b000
00814ec0	add x2,x2,#0xb58
00814ec4	mov x3,x21
00814ec8	bl 0x00c30390
00814ecc	ldr x21,[x19]
00814ed0	mov w8,#0x1
00814ed4	strb w8,[x22, #0xff0]
00814ed8	adrp x0,0xd1b000
00814edc	add x0,x0,#0xe98
00814ee0	mov x1,x21
00814ee4	mov x2,x20
00814ee8	bl 0x00c303a0
00814eec	ldp x20,x19,[sp, #0x20]
00814ef0	ldp x22,x21,[sp, #0x10]
00814ef4	ldp x29,x30,[sp], #0x30
00814ef8	ret
00814efc	bl 0x0080734c
00814f00	adrp x0,0xd1c000
00814f04	add x0,x0,#0x10
00814f08	mov x21,x8
00814f0c	bl 0x00c2fe90
00814f10	mov x8,x21
00814f14	cbz w0,0x00814e24
00814f18	adrp x9,0x29d000
00814f1c	nop
00814f20	adr x0,0x814fb4
00814f24	ldr q0,[x9, #0x220]
00814f28	adrp x2,0xc48000
00814f2c	add x2,x2,#0x880
00814f30	mov x1,x21
00814f34	str q0,[x8]
00814f38	bl 0x00c2fe70
00814f3c	adrp x0,0xd1c000
00814f40	add x0,x0,#0x10
00814f44	bl 0x00c2fea0
00814f48	mov x8,x21
00814f4c	b 0x00814e24
