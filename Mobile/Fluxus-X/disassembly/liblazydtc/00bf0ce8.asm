; FUN_00bf0ce8 @ 00bf0ce8
00bf0ce8	paciasp
00bf0cec	sub sp,sp,#0x90
00bf0cf0	stp x29,x30,[sp, #0x30]
00bf0cf4	stp x28,x27,[sp, #0x40]
00bf0cf8	stp x26,x25,[sp, #0x50]
00bf0cfc	stp x24,x23,[sp, #0x60]
00bf0d00	stp x22,x21,[sp, #0x70]
00bf0d04	stp x20,x19,[sp, #0x80]
00bf0d08	add x29,sp,#0x30
00bf0d0c	ldp x24,x25,[x0]
00bf0d10	mov x19,x0
00bf0d14	ldrb w8,[x0]
00bf0d18	lsr x9,x8,#0x1
00bf0d1c	and x10,x24,#-0x2
00bf0d20	tst w8,#0x1
00bf0d24	sub x26,x10,#0x1
00bf0d28	mov w8,#0x4
00bf0d2c	csel x21,x9,x25,eq
00bf0d30	csel x8,x8,x26,eq
00bf0d34	subs x20,x2,x1
00bf0d38	b.eq 0x00bf0f30
00bf0d3c	ldr x23,[x19, #0x10]
00bf0d40	ands w11,w24,#0x1
00bf0d44	add x27,x19,#0x4
00bf0d48	ubfx x22,x24,#0x1,#0x7
00bf0d4c	asr x28,x20,#0x2
00bf0d50	csel x9,x27,x23,eq
00bf0d54	csel x10,x22,x25,eq
00bf0d58	cmp x1,x9
00bf0d5c	b.cc 0x00bf0da0
00bf0d60	add x9,x9,x10, LSL #0x2
00bf0d64	add x9,x9,#0x4
00bf0d68	cmp x1,x9
00bf0d6c	b.cs 0x00bf0da0
00bf0d70	orr x8,xzr,#0x3ffffffffffffff8
00bf0d74	cmp x28,x8
00bf0d78	b.cs 0x00bf0f58
00bf0d7c	cmp x28,#0x4
00bf0d80	str w11,[sp, #0x14]
00bf0d84	b.hi 0x00bf0e24
00bf0d88	lsr w8,w20,#0x1
00bf0d8c	add x9,sp,#0x18
00bf0d90	orr x21,x9,#0x4
00bf0d94	and w8,w8,#0xfe
00bf0d98	strb w8,[sp, #0x18]
00bf0d9c	b 0x00bf0e5c
00bf0da0	sub x9,x8,x21
00bf0da4	cmp x9,x28
00bf0da8	b.cs 0x00bf0de8
00bf0dac	add x9,x21,x28
00bf0db0	mov x0,x19
00bf0db4	mov x22,x1
00bf0db8	sub x2,x9,x8
00bf0dbc	mov x1,x8
00bf0dc0	mov x3,x21
00bf0dc4	mov x4,x21
00bf0dc8	mov x5,xzr
00bf0dcc	mov x6,xzr
00bf0dd0	bl 0x00c43d70
00bf0dd4	ldrb w8,[x19]
00bf0dd8	ldr x23,[x19, #0x10]
00bf0ddc	mov x1,x22
00bf0de0	str x21,[x19, #0x8]
00bf0de4	and w11,w8,#0x1
00bf0de8	cmp w11,#0x0
00bf0dec	mov x2,x20
00bf0df0	csel x8,x27,x23,eq
00bf0df4	add x22,x8,x21, LSL #0x2
00bf0df8	mov x0,x22
00bf0dfc	bl 0x00c2ff60
00bf0e00	str wzr,[x22, x20#0x0]
00bf0e04	add x8,x21,x28
00bf0e08	ldrb w9,[x19]
00bf0e0c	tbnz w9,#0x0,0x00bf0e1c
00bf0e10	lsl w8,w8,#0x1
00bf0e14	strb w8,[x19]
00bf0e18	b 0x00bf0f30
00bf0e1c	str x8,[x19, #0x8]
00bf0e20	b 0x00bf0f30
00bf0e24	orr x8,x28,#0x1
00bf0e28	mov w9,#0x8
00bf0e2c	str x27,[sp, #0x8]
00bf0e30	cmp x8,#0x5
00bf0e34	mov x21,x1
00bf0e38	csinc x27,x9,x8,eq
00bf0e3c	lsl x0,x27,#0x2
00bf0e40	bl 0x00c2fed0
00bf0e44	orr x8,x27,#0x1
00bf0e48	ldr x27,[sp, #0x8]
00bf0e4c	mov x1,x21
00bf0e50	mov x21,x0
00bf0e54	stp x28,x0,[sp, #0x20]
00bf0e58	str x8,[sp, #0x18]
00bf0e5c	mov x0,x21
00bf0e60	mov x2,x20
00bf0e64	bl 0x00c2ffd0
00bf0e68	str wzr,[x21, x20#0x0]
00bf0e6c	add x9,sp,#0x18
00bf0e70	ldrb w8,[sp, #0x18]
00bf0e74	ldp x11,x10,[sp, #0x20]
00bf0e78	orr x9,x9,#0x4
00bf0e7c	ands w21,w8,#0x1
00bf0e80	lsr x8,x8,#0x1
00bf0e84	csel x7,x9,x10,eq
00bf0e88	csel x6,x8,x11,eq
00bf0e8c	ldr w8,[sp, #0x14]
00bf0e90	cmp w8,#0x0
00bf0e94	mov w8,#0x4
00bf0e98	csel x1,x8,x26,eq
00bf0e9c	tst x24,#0x1
00bf0ea0	csel x20,x22,x25,eq
00bf0ea4	sub x8,x1,x20
00bf0ea8	cmp x8,x6
00bf0eac	b.cs 0x00bf0ed8
00bf0eb0	sub x8,x6,x1
00bf0eb4	add x2,x8,x20
00bf0eb8	mov x0,x19
00bf0ebc	mov x3,x20
00bf0ec0	mov x4,x20
00bf0ec4	mov x5,xzr
00bf0ec8	bl 0x00c43d40
00bf0ecc	ldrb w8,[sp, #0x18]
00bf0ed0	and w21,w8,#0x1
00bf0ed4	b 0x00bf0f18
00bf0ed8	cbz x6,0x00bf0f18
00bf0edc	tst x24,#0x1
00bf0ee0	lsl x2,x6,#0x2
00bf0ee4	mov x1,x7
00bf0ee8	csel x22,x27,x23,eq
00bf0eec	mov x23,x6
00bf0ef0	add x0,x22,x20, LSL #0x2
00bf0ef4	bl 0x00c2ff60
00bf0ef8	ldrb w9,[x19]
00bf0efc	add x8,x20,x23
00bf0f00	tbnz w9,#0x0,0x00bf0f10
00bf0f04	lsl w9,w8,#0x1
00bf0f08	strb w9,[x19]
00bf0f0c	b 0x00bf0f14
00bf0f10	str x8,[x19, #0x8]
00bf0f14	str wzr,[x22, x8, LSL #0x2]
00bf0f18	cbz w21,0x00bf0f30
00bf0f1c	ldr x8,[sp, #0x18]
00bf0f20	ldr x0,[sp, #0x28]
00bf0f24	lsl x8,x8,#0x2
00bf0f28	and x1,x8,#-0x8
00bf0f2c	bl 0x00c2fe80
00bf0f30	mov x0,x19
00bf0f34	ldp x20,x19,[sp, #0x80]
00bf0f38	ldp x22,x21,[sp, #0x70]
00bf0f3c	ldp x24,x23,[sp, #0x60]
00bf0f40	ldp x26,x25,[sp, #0x50]
00bf0f44	ldp x28,x27,[sp, #0x40]
00bf0f48	ldp x29,x30,[sp, #0x30]
00bf0f4c	add sp,sp,#0x90
00bf0f50	autiasp
00bf0f54	ret
00bf0f58	bl 0x00bc5610
