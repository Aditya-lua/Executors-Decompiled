; FUN_00858d50 @ 00858d50
00858d50	stp x29,x30,[sp, #-0x30]!
00858d54	stp x22,x21,[sp, #0x10]
00858d58	stp x20,x19,[sp, #0x20]
00858d5c	mov x29,sp
00858d60	ldr x8,[x0, #0x10]
00858d64	ldr x9,[x0]
00858d68	mov x21,x1
00858d6c	mov x20,x2
00858d70	mov x19,x0
00858d74	sub x1,x8,x9
00858d78	mov x0,x9
00858d7c	cmp x21,x1, ASR #0x2
00858d80	b.ls 0x00858e3c
00858d84	cbz x0,0x00858d9c
00858d88	str x0,[x19, #0x8]
00858d8c	bl 0x00c2fe80
00858d90	mov x8,xzr
00858d94	stp xzr,xzr,[x19]
00858d98	str xzr,[x19, #0x10]
00858d9c	lsr x9,x21,#0x3e
00858da0	cbnz x9,0x00858f28
00858da4	asr x9,x8,#0x1
00858da8	orr x10,xzr,#0x7ffffffffffffffc
00858dac	cmp x9,x21
00858db0	csel x9,x9,x21,hi
00858db4	cmp x8,x10
00858db8	mov x8,#0x3fffffffffffffff
00858dbc	csel x8,x9,x8,cc
00858dc0	lsr x9,x8,#0x3e
00858dc4	cbnz x9,0x00858f28
00858dc8	lsl x22,x8,#0x2
00858dcc	mov x0,x22
00858dd0	bl 0x00c2fed0
00858dd4	sub x8,x21,#0x1
00858dd8	add x10,x0,x22
00858ddc	ldr w9,[x20]
00858de0	and x11,x8,#0x3fffffffffffffff
00858de4	add x8,x0,x21, LSL #0x2
00858de8	str x10,[x19, #0x10]
00858dec	cmp x11,#0x7
00858df0	mov x10,x0
00858df4	str x0,[x19]
00858df8	b.cc 0x00858e2c
00858dfc	add x11,x11,#0x1
00858e00	dup v0.4S,w9
00858e04	add x13,x0,#0x10
00858e08	and x12,x11,#0x7ffffffffffffff8
00858e0c	add x10,x0,x12, LSL #0x2
00858e10	mov x14,x12
00858e14	subs x14,x14,#0x8
00858e18	stp q0,q0,[x13, #-0x10]
00858e1c	add x13,x13,#0x20
00858e20	b.ne 0x00858e14
00858e24	cmp x11,x12
00858e28	b.eq 0x00858f14
00858e2c	str w9,[x10], #0x4
00858e30	cmp x10,x8
00858e34	b.ne 0x00858e2c
00858e38	b 0x00858f14
00858e3c	ldr x8,[x19, #0x8]
00858e40	sub x10,x8,x9
00858e44	asr x11,x10,#0x2
00858e48	cmp x11,x21
00858e4c	csel x14,x11,x21,cc
00858e50	cbz x14,0x00858ea0
00858e54	ldr w12,[x20]
00858e58	cmp x14,#0x8
00858e5c	mov x13,x14
00858e60	b.cc 0x00858e94
00858e64	and x15,x14,#-0x8
00858e68	dup v0.4S,w12
00858e6c	and x13,x14,#0x7
00858e70	add x0,x9,x15, LSL #0x2
00858e74	add x16,x9,#0x10
00858e78	mov x17,x15
00858e7c	subs x17,x17,#0x8
00858e80	stp q0,q0,[x16, #-0x10]
00858e84	add x16,x16,#0x20
00858e88	b.ne 0x00858e7c
00858e8c	cmp x14,x15
00858e90	b.eq 0x00858ea0
00858e94	subs x13,x13,#0x1
00858e98	str w12,[x0], #0x4
00858e9c	b.ne 0x00858e94
00858ea0	subs x11,x21,x11
00858ea4	b.ls 0x00858f10
00858ea8	lsl x9,x21,#0x2
00858eac	sub x9,x9,x10
00858eb0	ldr w10,[x20]
00858eb4	sub x12,x9,#0x4
00858eb8	add x9,x8,x11, LSL #0x2
00858ebc	mov x11,x8
00858ec0	cmp x12,#0x1c
00858ec4	b.cc 0x00858efc
00858ec8	lsr x11,x12,#0x2
00858ecc	dup v0.4S,w10
00858ed0	add x12,x11,#0x1
00858ed4	and x13,x12,#0x7ffffffffffffff8
00858ed8	add x11,x8,x13, LSL #0x2
00858edc	add x8,x8,#0x10
00858ee0	mov x14,x13
00858ee4	subs x14,x14,#0x8
00858ee8	stp q0,q0,[x8, #-0x10]
00858eec	add x8,x8,#0x20
00858ef0	b.ne 0x00858ee4
00858ef4	cmp x12,x13
00858ef8	b.eq 0x00858f08
00858efc	str w10,[x11], #0x4
00858f00	cmp x11,x9
00858f04	b.ne 0x00858efc
00858f08	str x9,[x19, #0x8]
00858f0c	b 0x00858f18
00858f10	add x8,x9,x21, LSL #0x2
00858f14	str x8,[x19, #0x8]
00858f18	ldp x20,x19,[sp, #0x20]
00858f1c	ldp x22,x21,[sp, #0x10]
00858f20	ldp x29,x30,[sp], #0x30
00858f24	ret
00858f28	bl 0x0086f7b4
