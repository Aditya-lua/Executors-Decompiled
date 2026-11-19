; FUN_00853d20 @ 00853d20
00853d20	sub sp,sp,#0xe0
00853d24	str d8,[sp, #0x70]
00853d28	stp x29,x30,[sp, #0x80]
00853d2c	stp x28,x27,[sp, #0x90]
00853d30	stp x26,x25,[sp, #0xa0]
00853d34	stp x24,x23,[sp, #0xb0]
00853d38	stp x22,x21,[sp, #0xc0]
00853d3c	stp x20,x19,[sp, #0xd0]
00853d40	add x29,sp,#0x80
00853d44	mrs x22,tpidr_el0
00853d48	mov x21,x8
00853d4c	mov x20,x0
00853d50	ldr x8,[x22, #0x28]
00853d54	mov x19,x0
00853d58	stur x8,[x29, #-0x18]
00853d5c	ldp q0,q1,[x0, #0x20]
00853d60	ldr d8,[x0, #0x10]
00853d64	ldp x8,x9,[x20, #0x60]!
00853d68	ldr w24,[x0, #0x18]
00853d6c	sub x23,x20,#0x20
00853d70	stp q0,q1,[sp, #0x20]
00853d74	ldur q0,[x20, #-0x20]
00853d78	subs x8,x9,x8
00853d7c	str q0,[sp, #0x10]
00853d80	b.eq 0x00853d8c
00853d84	ldur w9,[x9, #-0x4]
00853d88	b 0x00853d90
00853d8c	mov w9,#0x1
00853d90	asr x25,x8,#0x2
00853d94	ldrb w26,[x19, #0x58]
00853d98	mov x28,#0x3a00
00853d9c	mov w27,#0x1
00853da0	movk x28,#0x1, LSL #32
00853da4	mov w8,#0x1
00853da8	str w9,[sp, #0xc]
00853dac	ldr x9,[x19, #0x8]
00853db0	ldr w14,[x19, #0x10]
00853db4	cmp x9,x14
00853db8	b.ls 0x00853e18
00853dbc	ldr x10,[x19]
00853dc0	ldr w11,[x19, #0x14]
00853dc4	add w12,w14,#0x1
00853dc8	mov w13,w14
00853dcc	b 0x00853de8
00853dd0	add w13,w13,#0x1
00853dd4	mov w14,w12
00853dd8	str w12,[x19, #0x10]
00853ddc	add w12,w12,#0x1
00853de0	cmp x9,x14
00853de4	b.ls 0x00853e18
00853de8	ldrb w14,[x10, x14]
00853dec	cmp w14,#0x20
00853df0	b.hi 0x00853e18
00853df4	lsl x15,x27,x14
00853df8	tst x15,x28
00853dfc	b.ne 0x00853dd0
00853e00	cmp x14,#0xa
00853e04	b.ne 0x00853e18
00853e08	add w11,w11,#0x1
00853e0c	add w13,w13,#0x1
00853e10	stp w11,w12,[x19, #0x14]
00853e14	b 0x00853dd4
00853e18	tbz w8,#0x0,0x00853e24
00853e1c	ldur q0,[x19, #0x24]
00853e20	str q0,[x23]
00853e24	sub x8,x29,#0x38
00853e28	mov x0,x19
00853e2c	bl 0x00853648
00853e30	ldur q0,[x29, #-0x38]
00853e34	ldur q1,[x29, #-0x28]
00853e38	stp q0,q1,[x19, #0x20]
00853e3c	cbz w26,0x00853e54
00853e40	ldur w8,[x19, #0x20]
00853e44	and w8,w8,#0xfffffffe
00853e48	cmp w8,#0x11a
00853e4c	mov w8,wzr
00853e50	b.eq 0x00853dac
00853e54	ldp x9,x8,[x19, #0x60]
00853e58	ldr q2,[sp, #0x10]
00853e5c	ldp q0,q1,[x19, #0x20]
00853e60	str w24,[x19, #0x18]
00853e64	str d8,[x19, #0x10]
00853e68	sub x9,x8,x9
00853e6c	str q2,[x23]
00853e70	stp q0,q1,[x21]
00853e74	ldp q0,q1,[sp, #0x20]
00853e78	asr x9,x9,#0x2
00853e7c	cmp x9,x25
00853e80	stp q0,q1,[x19, #0x20]
00853e84	b.cs 0x00853e98
00853e88	add x1,sp,#0xc
00853e8c	mov x0,x20
00853e90	bl 0x00853edc
00853e94	b 0x00853ea4
00853e98	b.ls 0x00853ea4
00853e9c	sub x8,x8,#0x4
00853ea0	str x8,[x19, #0x68]
00853ea4	ldr x8,[x22, #0x28]
00853ea8	ldur x9,[x29, #-0x18]
00853eac	cmp x8,x9
00853eb0	b.ne 0x00853ed8
00853eb4	ldp x20,x19,[sp, #0xd0]
00853eb8	ldr d8,[sp, #0x70]
00853ebc	ldp x22,x21,[sp, #0xc0]
00853ec0	ldp x24,x23,[sp, #0xb0]
00853ec4	ldp x26,x25,[sp, #0xa0]
00853ec8	ldp x28,x27,[sp, #0x90]
00853ecc	ldp x29,x30,[sp, #0x80]
00853ed0	add sp,sp,#0xe0
00853ed4	ret
00853ed8	bl 0x00c2fec0
