; mbedtls_gcm_finish @ 00b77ce0
00b77ce0	sub sp,sp,#0x70
00b77ce4	stp x26,x25,[sp, #0x20]
00b77ce8	stp x24,x23,[sp, #0x30]
00b77cec	stp x22,x21,[sp, #0x40]
00b77cf0	stp x20,x19,[sp, #0x50]
00b77cf4	stp x29,x30,[sp, #0x60]
00b77cf8	add x29,sp,#0x60
00b77cfc	mrs x23,tpidr_el0
00b77d00	ldr x8,[x23, #0x28]
00b77d04	mov x19,x5
00b77d08	mov x20,x0
00b77d0c	mov x21,x4
00b77d10	str x8,[sp, #0x18]
00b77d14	str xzr,[x3]
00b77d18	ldp x22,x24,[x0, #0x160]
00b77d1c	cbnz x22,0x00b77d38
00b77d20	and x8,x24,#0xf
00b77d24	cbz x8,0x00b77d38
00b77d28	add x1,x20,#0x190
00b77d2c	mov x0,x20
00b77d30	mov x2,x1
00b77d34	bl 0x00b773c8
00b77d38	sub x8,x19,#0x4
00b77d3c	cmp x8,#0xc
00b77d40	b.ls 0x00b77d4c
00b77d44	mov w0,#0xffffffec
00b77d48	b 0x00b77eb0
00b77d4c	ldrb w8,[x20, #0x160]
00b77d50	lsl x25,x22,#0x3
00b77d54	lsl x26,x24,#0x3
00b77d58	tst w8,#0xf
00b77d5c	b.eq 0x00b77d70
00b77d60	add x1,x20,#0x190
00b77d64	mov x0,x20
00b77d68	mov x2,x1
00b77d6c	bl 0x00b773c8
00b77d70	add x1,x20,#0x170
00b77d74	mov x0,x21
00b77d78	mov x2,x19
00b77d7c	bl 0x00c2ffd0
00b77d80	orr x8,x26,x25
00b77d84	cbz x8,0x00b77eac
00b77d88	lsr x8,x24,#0x1d
00b77d8c	lsr x10,x22,#0x1d
00b77d90	rev w9,w26
00b77d94	rev w11,w25
00b77d98	rev w8,w8
00b77d9c	rev w10,w10
00b77da0	stp w8,w9,[sp]
00b77da4	stp w10,w11,[sp, #0x8]
00b77da8	ldr q0,[sp]
00b77dac	ldr q1,[x20, #0x190]
00b77db0	add x22,x20,#0x190
00b77db4	mov x0,x20
00b77db8	mov x1,x22
00b77dbc	eor v0.16B,v0.16B,v1.16B
00b77dc0	mov x2,x22
00b77dc4	str q0,[x20, #0x190]
00b77dc8	bl 0x00b773c8
00b77dcc	cmp x19,#0x10
00b77dd0	mov x8,xzr
00b77dd4	b.cc 0x00b77e00
00b77dd8	mov x9,xzr
00b77ddc	ldr q0,[x21,x9]
00b77de0	ldr q1,[x22,x9]
00b77de4	add x8,x9,#0x10
00b77de8	add x10,x9,#0x20
00b77dec	cmp x10,x19
00b77df0	eor v0.16B,v1.16B,v0.16B
00b77df4	str q0,[x21,x9]
00b77df8	mov x9,x8
00b77dfc	b.ls 0x00b77ddc
00b77e00	cmp x8,x19
00b77e04	mov w0,wzr
00b77e08	b.cs 0x00b77eb0
00b77e0c	sub x9,x19,x8
00b77e10	cmp x9,#0x1f
00b77e14	b.ls 0x00b77e84
00b77e18	add x10,x20,x19
00b77e1c	add x12,x21,x8
00b77e20	add x10,x10,#0x190
00b77e24	cmp x12,x10
00b77e28	add x11,x20,x8
00b77e2c	b.cs 0x00b77e40
00b77e30	add x10,x21,x19
00b77e34	add x13,x11,#0x190
00b77e38	cmp x13,x10
00b77e3c	b.cc 0x00b77e84
00b77e40	and x10,x9,#-0x20
00b77e44	add x11,x11,#0x1a0
00b77e48	add x8,x8,x10
00b77e4c	add x12,x12,#0x10
00b77e50	mov x13,x10
00b77e54	ldp q0,q1,[x12, #-0x10]
00b77e58	ldp q2,q3,[x11, #-0x10]
00b77e5c	subs x13,x13,#0x20
00b77e60	add x11,x11,#0x20
00b77e64	eor v0.16B,v2.16B,v0.16B
00b77e68	eor v1.16B,v3.16B,v1.16B
00b77e6c	stp q0,q1,[x12, #-0x10]
00b77e70	add x12,x12,#0x20
00b77e74	b.ne 0x00b77e54
00b77e78	cmp x9,x10
00b77e7c	mov w0,wzr
00b77e80	b.eq 0x00b77eb0
00b77e84	add x10,x20,x8
00b77e88	sub x9,x19,x8
00b77e8c	add x10,x10,#0x190
00b77e90	add x8,x21,x8
00b77e94	ldrb w11,[x8]
00b77e98	ldrb w12,[x10], #0x1
00b77e9c	subs x9,x9,#0x1
00b77ea0	eor w11,w12,w11
00b77ea4	strb w11,[x8], #0x1
00b77ea8	b.ne 0x00b77e94
00b77eac	mov w0,wzr
00b77eb0	ldr x8,[x23, #0x28]
00b77eb4	ldr x9,[sp, #0x18]
00b77eb8	cmp x8,x9
00b77ebc	b.ne 0x00b77edc
00b77ec0	ldp x29,x30,[sp, #0x60]
00b77ec4	ldp x20,x19,[sp, #0x50]
00b77ec8	ldp x22,x21,[sp, #0x40]
00b77ecc	ldp x24,x23,[sp, #0x30]
00b77ed0	ldp x26,x25,[sp, #0x20]
00b77ed4	add sp,sp,#0x70
00b77ed8	ret
00b77edc	bl 0x00c2fec0
