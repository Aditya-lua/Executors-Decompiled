; FUN_00c12c94 @ 00c12c94
00c12c94	paciasp
00c12c98	stp x29,x30,[sp, #-0x50]!
00c12c9c	str x25,[sp, #0x10]
00c12ca0	stp x24,x23,[sp, #0x20]
00c12ca4	stp x22,x21,[sp, #0x30]
00c12ca8	stp x20,x19,[sp, #0x40]
00c12cac	mov x29,sp
00c12cb0	ldp x8,x9,[x0]
00c12cb4	mov x19,x0
00c12cb8	subs x10,x9,x8
00c12cbc	b.eq 0x00c12ccc
00c12cc0	ldrb w11,[x8]
00c12cc4	sub w11,w11,#0x4a
00c12cc8	b 0x00c12cd0
00c12ccc	mov w11,#0xffffffb6
00c12cd0	ror w11,w11,#0x1
00c12cd4	cmp w11,#0x4
00c12cd8	b.gt 0x00c12d14
00c12cdc	cbz w11,0x00c12d5c
00c12ce0	cmp w11,#0x1
00c12ce4	b.ne 0x00c12fa0
00c12ce8	cmp x10,#0x2
00c12cec	b.cc 0x00c12e40
00c12cf0	ldrb w9,[x8, #0x1]
00c12cf4	cmp w9,#0x5a
00c12cf8	b.ne 0x00c12e40
00c12cfc	add x8,x8,#0x2
00c12d00	mov x0,x19
00c12d04	str x8,[x19]
00c12d08	bl 0x00c10038
00c12d0c	cbnz x0,0x00c12d38
00c12d10	b 0x00c12eec
00c12d14	cmp w11,#0x5
00c12d18	b.eq 0x00c12e1c
00c12d1c	cmp w11,#0x7
00c12d20	b.ne 0x00c12fa0
00c12d24	add x8,x8,#0x1
00c12d28	mov x0,x19
00c12d2c	str x8,[x19]
00c12d30	bl 0x00c16098
00c12d34	cbz x0,0x00c12eec
00c12d38	ldp x8,x9,[x19]
00c12d3c	cmp x8,x9
00c12d40	b.eq 0x00c12e60
00c12d44	ldrb w9,[x8]
00c12d48	cmp w9,#0x45
00c12d4c	b.ne 0x00c12e60
00c12d50	add x8,x8,#0x1
00c12d54	str x8,[x19]
00c12d58	b 0x00c12eec
00c12d5c	ldp x11,x10,[x19, #0x10]
00c12d60	add x8,x8,#0x1
00c12d64	add x24,x19,#0x28
00c12d68	str x8,[x19]
00c12d6c	sub x10,x10,x11
00c12d70	asr x20,x10,#0x3
00c12d74	b 0x00c12da8
00c12d78	mov x0,x22
00c12d7c	bl 0x00c30950
00c12d80	str x0,[x19, #0x10]
00c12d84	cbz x0,0x00c12fc0
00c12d88	asr x8,x21,#0x2
00c12d8c	add x23,x0,x21
00c12d90	add x8,x0,x8, LSL #0x3
00c12d94	mov x0,x25
00c12d98	str x8,[x19, #0x20]
00c12d9c	ldp x8,x9,[x19]
00c12da0	str x0,[x23], #0x8
00c12da4	str x23,[x19, #0x18]
00c12da8	cmp x8,x9
00c12dac	b.eq 0x00c12dbc
00c12db0	ldrb w9,[x8]
00c12db4	cmp w9,#0x45
00c12db8	b.eq 0x00c12e68
00c12dbc	mov x0,x19
00c12dc0	bl 0x00c12c94
00c12dc4	cbz x0,0x00c12eec
00c12dc8	ldp x23,x8,[x19, #0x18]
00c12dcc	cmp x23,x8
00c12dd0	b.ne 0x00c12d9c
00c12dd4	ldr x22,[x19, #0x10]
00c12dd8	mov x25,x0
00c12ddc	sub x21,x23,x22
00c12de0	cmp x22,x24
00c12de4	lsl x1,x21,#0x1
00c12de8	b.ne 0x00c12d78
00c12dec	mov x0,x1
00c12df0	bl 0x00c308d0
00c12df4	cbz x0,0x00c12fc4
00c12df8	cmp x23,x24
00c12dfc	b.eq 0x00c12e14
00c12e00	mov x1,x22
00c12e04	mov x2,x21
00c12e08	mov x23,x0
00c12e0c	bl 0x00c2ff60
00c12e10	mov x0,x23
00c12e14	str x0,[x19, #0x10]
00c12e18	b 0x00c12d88
00c12e1c	cmp x9,x8
00c12e20	b.eq 0x00c12fa0
00c12e24	ldrb w9,[x8]
00c12e28	cmp w9,#0x54
00c12e2c	b.ne 0x00c12fa0
00c12e30	cmp x10,#0x2
00c12e34	b.cc 0x00c12f08
00c12e38	ldrb w1,[x8, #0x1]
00c12e3c	b 0x00c12f0c
00c12e40	mov x0,x19
00c12e44	ldp x20,x19,[sp, #0x40]
00c12e48	ldr x25,[sp, #0x10]
00c12e4c	ldp x22,x21,[sp, #0x30]
00c12e50	ldp x24,x23,[sp, #0x20]
00c12e54	ldp x29,x30,[sp], #0x50
00c12e58	autiasp
00c12e5c	b 0x00c17a90
00c12e60	mov x0,xzr
00c12e64	b 0x00c12eec
00c12e68	add x8,x8,#0x1
00c12e6c	mov x0,x19
00c12e70	mov x1,x20
00c12e74	str x8,[x19]
00c12e78	bl 0x00c13140
00c12e7c	ldr x22,[x19, #0x1330]
00c12e80	mov x20,x0
00c12e84	mov x21,x1
00c12e88	ldr x8,[x22, #0x8]
00c12e8c	sub x9,x8,#0xfd0
00c12e90	cmn x9,#0xff1
00c12e94	b.hi 0x00c12eb4
00c12e98	mov w0,#0x1000
00c12e9c	bl 0x00c308d0
00c12ea0	cbz x0,0x00c12fc8
00c12ea4	mov x8,xzr
00c12ea8	stp x22,xzr,[x0]
00c12eac	mov x22,x0
00c12eb0	str x0,[x19, #0x1330]
00c12eb4	add x9,x8,#0x20
00c12eb8	add x0,x22,x8
00c12ebc	adrp x8,0xcb3000
00c12ec0	add x8,x8,#0x638
00c12ec4	str x9,[x22, #0x8]
00c12ec8	mov w9,#0x29
00c12ecc	str x8,[x0, #0x10]!
00c12ed0	ldurh w8,[x0, #0x9]
00c12ed4	mov w10,#0x540
00c12ed8	and w8,w8,#0xf000
00c12edc	strb w9,[x0, #0x8]
00c12ee0	orr w8,w8,w10
00c12ee4	stp x20,x21,[x0, #0x10]
00c12ee8	sturh w8,[x0, #0x9]
00c12eec	ldp x20,x19,[sp, #0x40]
00c12ef0	ldr x25,[sp, #0x10]
00c12ef4	ldp x22,x21,[sp, #0x30]
00c12ef8	ldp x24,x23,[sp, #0x20]
00c12efc	ldp x29,x30,[sp], #0x50
00c12f00	autiasp
00c12f04	ret
00c12f08	mov w1,wzr
00c12f0c	adrp x20,0x2a9000
00c12f10	add x20,x20,#0xfe
00c12f14	mov w2,#0x5
00c12f18	mov x0,x20
00c12f1c	bl 0x00c300a0
00c12f20	cbz x0,0x00c12fa0
00c12f24	sub x8,x0,x20
00c12f28	cmn x8,#0x1
00c12f2c	b.eq 0x00c12fa0
00c12f30	mov x0,x19
00c12f34	mov x1,xzr
00c12f38	bl 0x00c1ddc8
00c12f3c	cbz x0,0x00c12eec
00c12f40	mov x20,x0
00c12f44	mov x0,x19
00c12f48	bl 0x00c12c94
00c12f4c	cbz x0,0x00c12eec
00c12f50	ldr x22,[x19, #0x1330]
00c12f54	mov x21,x0
00c12f58	ldr x8,[x22, #0x8]
00c12f5c	sub x9,x8,#0xfd0
00c12f60	cmn x9,#0xff1
00c12f64	b.hi 0x00c12f84
00c12f68	mov w0,#0x1000
00c12f6c	bl 0x00c308d0
00c12f70	cbz x0,0x00c12fc8
00c12f74	mov x8,xzr
00c12f78	stp x22,xzr,[x0]
00c12f7c	mov x22,x0
00c12f80	str x0,[x19, #0x1330]
00c12f84	add x9,x8,#0x20
00c12f88	add x0,x22,x8
00c12f8c	adrp x8,0xcb3000
00c12f90	add x8,x8,#0x6b0
00c12f94	str x9,[x22, #0x8]
00c12f98	mov w9,#0x22
00c12f9c	b 0x00c12ecc
00c12fa0	mov x0,x19
00c12fa4	ldp x20,x19,[sp, #0x40]
00c12fa8	ldr x25,[sp, #0x10]
00c12fac	ldp x22,x21,[sp, #0x30]
00c12fb0	ldp x24,x23,[sp, #0x20]
00c12fb4	ldp x29,x30,[sp], #0x50
00c12fb8	autiasp
00c12fbc	b 0x00c10bfc
00c12fc0	bl 0x00c30b40
00c12fc4	bl 0x00c30b40
00c12fc8	bl 0x00c2fff0
