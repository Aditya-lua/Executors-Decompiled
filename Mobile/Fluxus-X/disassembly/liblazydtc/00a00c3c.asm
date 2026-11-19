; FUN_00a00c3c @ 00a00c3c
00a00c3c	stp x22,x21,[sp, #-0x30]!
00a00c40	stp x20,x19,[sp, #0x10]
00a00c44	stp x29,x30,[sp, #0x20]
00a00c48	ldr w8,[x0, #0x30]
00a00c4c	ldr x22,[x0, #0x40]
00a00c50	mov w9,#0x8
00a00c54	sub w14,w1,#0x1
00a00c58	tst w8,#0x200
00a00c5c	cset w10,eq
00a00c60	csel x11,xzr,x9,eq
00a00c64	ldr x9,[x22, w10, UXTW #0x3]
00a00c68	ldr x10,[x22, x11#0x0]
00a00c6c	add x29,sp,#0x20
00a00c70	ldr x12,[x9, #0x8]
00a00c74	ldr x11,[x10, #0x8]
00a00c78	subs x13,x12,x11
00a00c7c	csel x13,xzr,x13,eq
00a00c80	cmp w14,#0x84
00a00c84	b.hi 0x00a00cb0
00a00c88	adrp x15,0x74e000
00a00c8c	add x15,x15,#0x6d8
00a00c90	ldrsw x16,[x15, x14, LSL #0x2]
00a00c94	ldr x14,[x9]
00a00c98	mov x19,x3
00a00c9c	mov x20,x0
00a00ca0	add x15,x16,x15
00a00ca4	mov x21,x2
00a00ca8	mov x0,x13
00a00cac	br x15
00a00cb0	mov x0,xzr
00a00cb4	b 0x00a00e04
00a00cb8	ldr x19,[x22]
00a00cbc	ldr x0,[x19, #0x8]
00a00cc0	cbz x0,0x00a00e00
00a00cc4	tbnz w8,#0x9,0x00a00e14
00a00cc8	tbnz w8,#0xa,0x00a00d48
00a00ccc	ldr x2,[x19, #0x10]
00a00cd0	mov w1,wzr
00a00cd4	bl 0x00c301c0
00a00cd8	str xzr,[x19]
00a00cdc	ldr x19,[x22]
00a00ce0	b 0x00a00d48
00a00ce4	cmp x14,#0x0
00a00ce8	cset w0,eq
00a00cec	b 0x00a00e04
00a00cf0	cbz x19,0x00a00d00
00a00cf4	str x12,[x19]
00a00cf8	mov x0,x14
00a00cfc	b 0x00a00e04
00a00d00	mov x0,x14
00a00d04	b 0x00a00e04
00a00d08	ldrsw x0,[x20, #0x2c]
00a00d0c	b 0x00a00e04
00a00d10	str w21,[x20, #0x2c]
00a00d14	mov w0,#0x1
00a00d18	b 0x00a00e04
00a00d1c	ldr w9,[x20, #0x2c]
00a00d20	cbz w9,0x00a00d40
00a00d24	ldr w9,[x20, #0x28]
00a00d28	cbz w9,0x00a00d40
00a00d2c	cbz x22,0x00a00d40
00a00d30	ldr x0,[x22]
00a00d34	tbz w8,#0x9,0x00a00d3c
00a00d38	str xzr,[x0, #0x8]
00a00d3c	bl 0x00c35660
00a00d40	str w21,[x20, #0x2c]
00a00d44	str x19,[x22]
00a00d48	ldr x8,[x22, #0x8]
00a00d4c	ldr q0,[x19, #0x10]
00a00d50	mov w0,#0x1
00a00d54	str q0,[x8, #0x10]
00a00d58	ldr q0,[x19]
00a00d5c	str q0,[x8]
00a00d60	b 0x00a00e04
00a00d64	cbz x19,0x00a00e00
00a00d68	tbnz w8,#0x9,0x00a00da8
00a00d6c	ldr w8,[x20, #0x28]
00a00d70	cbz w8,0x00a00da8
00a00d74	cbz x22,0x00a00da8
00a00d78	ldp x9,x8,[x22]
00a00d7c	ldr x1,[x8, #0x8]
00a00d80	ldr x0,[x9, #0x8]
00a00d84	cmp x1,x0
00a00d88	b.eq 0x00a00da8
00a00d8c	ldr x2,[x8]
00a00d90	bl 0x00c2ff60
00a00d94	ldp x9,x8,[x22]
00a00d98	ldr x10,[x8]
00a00d9c	ldr x11,[x9, #0x8]
00a00da0	str x10,[x9]
00a00da4	str x11,[x8, #0x8]
00a00da8	ldr x8,[x22]
00a00dac	mov w0,#0x1
00a00db0	str x8,[x19]
00a00db4	b 0x00a00e04
00a00db8	mov x0,#-0x1
00a00dbc	tbnz x21,#0x3f,0x00a00e04
00a00dc0	add x8,x13,x14
00a00dc4	cmp x8,x21
00a00dc8	b.lt 0x00a00e04
00a00dcc	add x8,x11,x21
00a00dd0	cmp x21,#0x0
00a00dd4	csel x8,x11,x8,eq
00a00dd8	str x8,[x9, #0x8]
00a00ddc	ldr x8,[x10]
00a00de0	mov x0,x21
00a00de4	sub x8,x8,x21
00a00de8	str x8,[x9]
00a00dec	ldr x8,[x10, #0x10]
00a00df0	sub x8,x8,x21
00a00df4	str x8,[x9, #0x10]
00a00df8	b 0x00a00e04
00a00dfc	str w21,[x20, #0x38]
00a00e00	mov w0,#0x1
00a00e04	ldp x29,x30,[sp, #0x20]
00a00e08	ldp x20,x19,[sp, #0x10]
00a00e0c	ldp x22,x21,[sp], #0x30
00a00e10	ret
00a00e14	ldr x8,[x22, #0x8]
00a00e18	mov w0,#0x1
00a00e1c	ldr q0,[x8, #0x10]
00a00e20	str q0,[x19, #0x10]
00a00e24	ldr q0,[x8]
00a00e28	str q0,[x19]
00a00e2c	b 0x00a00e04
