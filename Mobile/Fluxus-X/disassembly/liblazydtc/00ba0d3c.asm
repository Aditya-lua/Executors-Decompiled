; mbedtls_ecjpake_write_round_two @ 00ba0d3c
00ba0d3c	sub sp,sp,#0x110
00ba0d40	stp x28,x27,[sp, #0xb0]
00ba0d44	stp x26,x25,[sp, #0xc0]
00ba0d48	stp x24,x23,[sp, #0xd0]
00ba0d4c	stp x22,x21,[sp, #0xe0]
00ba0d50	stp x20,x19,[sp, #0xf0]
00ba0d54	stp x29,x30,[sp, #0x100]
00ba0d58	add x29,sp,#0x100
00ba0d5c	mrs x28,tpidr_el0
00ba0d60	ldr x8,[x28, #0x28]
00ba0d64	mov x24,x0
00ba0d68	add x0,sp,#0x60
00ba0d6c	mov x22,x5
00ba0d70	mov x21,x4
00ba0d74	mov x19,x3
00ba0d78	mov x25,x2
00ba0d7c	mov x20,x1
00ba0d80	stur x8,[x29, #-0x60]
00ba0d84	str x1,[sp, #0x18]
00ba0d88	bl 0x00c42760
00ba0d8c	add x0,sp,#0x30
00ba0d90	bl 0x00c42760
00ba0d94	add x0,sp,#0x20
00ba0d98	bl 0x00c41c00
00ba0d9c	sub x0,x29,#0x70
00ba0da0	add x23,x24,#0x8
00ba0da4	bl 0x00c41c00
00ba0da8	sub x0,x29,#0x70
00ba0dac	mov w1,#0x1
00ba0db0	bl 0x00c41c40
00ba0db4	mov w26,w0
00ba0db8	cbnz w0,0x00ba0e00
00ba0dbc	add x5,x24,#0x160
00ba0dc0	add x3,x24,#0x130
00ba0dc4	add x1,sp,#0x60
00ba0dc8	sub x2,x29,#0x70
00ba0dcc	sub x4,x29,#0x70
00ba0dd0	mov x0,x23
00ba0dd4	bl 0x00c42720
00ba0dd8	mov w26,w0
00ba0ddc	cbnz w0,0x00ba0e00
00ba0de0	add x5,x24,#0xd0
00ba0de4	add x1,sp,#0x60
00ba0de8	sub x2,x29,#0x70
00ba0dec	add x3,sp,#0x60
00ba0df0	sub x4,x29,#0x70
00ba0df4	mov x0,x23
00ba0df8	bl 0x00c42720
00ba0dfc	mov w26,w0
00ba0e00	sub x0,x29,#0x70
00ba0e04	bl 0x00c41bb0
00ba0e08	cbnz w26,0x00ba0f1c
00ba0e0c	add x2,x24,#0x1d0
00ba0e10	add x3,x24,#0x1e0
00ba0e14	add x4,x24,#0x70
00ba0e18	add x0,sp,#0x20
00ba0e1c	mov w1,#0x1
00ba0e20	mov x5,x21
00ba0e24	mov x6,x22
00ba0e28	bl 0x00ba0f6c
00ba0e2c	mov w26,w0
00ba0e30	cbnz w0,0x00ba0f1c
00ba0e34	add x1,sp,#0x30
00ba0e38	add x2,sp,#0x20
00ba0e3c	add x3,sp,#0x60
00ba0e40	mov x0,x23
00ba0e44	mov x4,x21
00ba0e48	mov x5,x22
00ba0e4c	bl 0x00c42700
00ba0e50	mov w26,w0
00ba0e54	cbnz w0,0x00ba0f1c
00ba0e58	ldr w8,[x24, #0xc8]
00ba0e5c	mov x27,x20
00ba0e60	cmp w8,#0x1
00ba0e64	b.ne 0x00ba0e94
00ba0e68	tbnz x25,#0x3f,0x00ba0ea0
00ba0e6c	sub x1,x29,#0x70
00ba0e70	mov x0,x23
00ba0e74	mov x2,x20
00ba0e78	mov x3,x25
00ba0e7c	bl 0x00c427d0
00ba0e80	mov w26,w0
00ba0e84	cbnz w0,0x00ba0f1c
00ba0e88	ldur x8,[x29, #-0x70]
00ba0e8c	add x27,x20,x8
00ba0e90	str x27,[sp, #0x18]
00ba0e94	add x25,x20,x25
00ba0e98	subs x5,x25,x27
00ba0e9c	b.cs 0x00ba0ea8
00ba0ea0	mov w26,#0xffffb100
00ba0ea4	b 0x00ba0f1c
00ba0ea8	ldr w2,[x24, #0xcc]
00ba0eac	add x1,sp,#0x30
00ba0eb0	sub x3,x29,#0x70
00ba0eb4	mov x0,x23
00ba0eb8	mov x4,x27
00ba0ebc	bl 0x00c427e0
00ba0ec0	mov w26,w0
00ba0ec4	cbnz w0,0x00ba0f1c
00ba0ec8	ldur x8,[x29, #-0x70]
00ba0ecc	adrp x9,0xcab000
00ba0ed0	add x9,x9,#0x448
00ba0ed4	add x3,sp,#0x60
00ba0ed8	add x8,x27,x8
00ba0edc	str x8,[sp, #0x18]
00ba0ee0	ldp w8,w2,[x24, #0xc8]
00ba0ee4	ldr w0,[x24]
00ba0ee8	add x4,sp,#0x20
00ba0eec	add x5,sp,#0x30
00ba0ef0	ldr x6,[x9, x8, LSL #0x3]
00ba0ef4	add x7,sp,#0x18
00ba0ef8	mov x1,x23
00ba0efc	stp x21,x22,[sp, #0x8]
00ba0f00	str x25,[sp]
00ba0f04	bl 0x00ba1078
00ba0f08	mov w26,w0
00ba0f0c	cbnz w0,0x00ba0f1c
00ba0f10	ldr x8,[sp, #0x18]
00ba0f14	sub x8,x8,x20
00ba0f18	str x8,[x19]
00ba0f1c	add x0,sp,#0x60
00ba0f20	bl 0x00c42750
00ba0f24	add x0,sp,#0x30
00ba0f28	bl 0x00c42750
00ba0f2c	add x0,sp,#0x20
00ba0f30	bl 0x00c41bb0
00ba0f34	ldr x8,[x28, #0x28]
00ba0f38	ldur x9,[x29, #-0x60]
00ba0f3c	cmp x8,x9
00ba0f40	b.ne 0x00ba0f68
00ba0f44	mov w0,w26
00ba0f48	ldp x29,x30,[sp, #0x100]
00ba0f4c	ldp x20,x19,[sp, #0xf0]
00ba0f50	ldp x22,x21,[sp, #0xe0]
00ba0f54	ldp x24,x23,[sp, #0xd0]
00ba0f58	ldp x26,x25,[sp, #0xc0]
00ba0f5c	ldp x28,x27,[sp, #0xb0]
00ba0f60	add sp,sp,#0x110
00ba0f64	ret
00ba0f68	bl 0x00c2fec0
