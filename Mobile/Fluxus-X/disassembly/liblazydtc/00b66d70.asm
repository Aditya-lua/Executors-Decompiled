; FUN_00b66d70 @ 00b66d70
00b66d70	str x25,[sp, #-0x50]!
00b66d74	stp x24,x23,[sp, #0x10]
00b66d78	stp x22,x21,[sp, #0x20]
00b66d7c	stp x20,x19,[sp, #0x30]
00b66d80	stp x29,x30,[sp, #0x40]
00b66d84	ldrb w8,[x0]
00b66d88	mov x20,x0
00b66d8c	mov w0,wzr
00b66d90	add x29,sp,#0x40
00b66d94	tbz w8,#0x1,0x00b66ff4
00b66d98	ldr x9,[x20, #0x20]
00b66d9c	mov x21,x4
00b66da0	mov x22,x3
00b66da4	mov x19,x2
00b66da8	mov x24,x1
00b66dac	cmn x9,#0x1
00b66db0	b.eq 0x00b66df4
00b66db4	bl 0x00c41000
00b66db8	cmp x24,x22
00b66dbc	b.ne 0x00b66e10
00b66dc0	cbz x22,0x00b66e10
00b66dc4	mov w8,w0
00b66dc8	mov x23,xzr
00b66dcc	mov w0,wzr
00b66dd0	cbz w8,0x00b66ff0
00b66dd4	ldr x8,[x20, #0x10]
00b66dd8	add x9,x8,#0x8
00b66ddc	cmp x9,x21
00b66de0	b.hi 0x00b66e10
00b66de4	ldrb w9,[x20]
00b66de8	tbnz w9,#0x0,0x00b66e8c
00b66dec	ldr x9,[x22]
00b66df0	b 0x00b66e98
00b66df4	ldr x25,[x20, #0x90]
00b66df8	cbz x24,0x00b66e0c
00b66dfc	mov x23,xzr
00b66e00	cbnz x22,0x00b66e0c
00b66e04	mov w0,#0x1
00b66e08	b 0x00b66ff0
00b66e0c	tbnz w8,#0x2,0x00b66e1c
00b66e10	mov x23,xzr
00b66e14	mov w0,wzr
00b66e18	b 0x00b66ff0
00b66e1c	cbz x24,0x00b66f28
00b66e20	tbnz w8,#0x4,0x00b66e54
00b66e24	ldr x8,[x20, #0x8]
00b66e28	ldr x9,[x25, #0x8]
00b66e2c	orr w10,wzr,#0xf
00b66e30	add x1,x20,#0x30
00b66e34	sub x2,x10,x8
00b66e38	mov x0,x20
00b66e3c	mov x3,x21
00b66e40	blr x9
00b66e44	cbz w0,0x00b66fec
00b66e48	ldrb w8,[x20]
00b66e4c	orr w8,w8,#0x10
00b66e50	strb w8,[x20]
00b66e54	tbnz w8,#0x0,0x00b66f84
00b66e58	tbz w8,#0x3,0x00b66e10
00b66e5c	ldr x8,[x25, #0x20]
00b66e60	ldr x5,[x20, #0x10]
00b66e64	add x4,x20,#0x40
00b66e68	mov x0,x20
00b66e6c	mov x1,x22
00b66e70	mov x2,x24
00b66e74	mov x3,x21
00b66e78	blr x8
00b66e7c	cbz w0,0x00b66fec
00b66e80	ldrb w8,[x20]
00b66e84	and w8,w8,#0xffffffe3
00b66e88	b 0x00b66fe0
00b66e8c	ldr x9,[x20, #0x40]
00b66e90	str x9,[x22]
00b66e94	ldr x8,[x20, #0x10]
00b66e98	ldr x10,[x20, #0x90]
00b66e9c	stur x9,[x20, #0x34]
00b66ea0	ldr x11,[x20, #0x8]
00b66ea4	sub x9,x21,#0x8
00b66ea8	ldr x10,[x10, #0x8]
00b66eac	sub x23,x9,x8
00b66eb0	orr w8,wzr,#0xf
00b66eb4	add x1,x20,#0x30
00b66eb8	sub x2,x8,x11
00b66ebc	mov x0,x20
00b66ec0	mov x3,x23
00b66ec4	blr x10
00b66ec8	cbz w0,0x00b66fec
00b66ecc	ldrb w8,[x20]
00b66ed0	ldr x9,[x20, #0x90]
00b66ed4	ldr x2,[x20, #0x20]
00b66ed8	add x1,x20,#0x40
00b66edc	orr w8,w8,#0x10
00b66ee0	strb w8,[x20]
00b66ee4	ldr x8,[x9, #0x10]
00b66ee8	mov x0,x20
00b66eec	blr x8
00b66ef0	cbz w0,0x00b66fec
00b66ef4	ldrb w9,[x20]
00b66ef8	ldr x8,[x20, #0x90]
00b66efc	add x1,x22,#0x8
00b66f00	tbnz w9,#0x0,0x00b66f54
00b66f04	ldr x8,[x8, #0x20]
00b66f08	ldr x5,[x20, #0x10]
00b66f0c	add x4,x1,x23
00b66f10	mov x0,x20
00b66f14	mov x2,x1
00b66f18	mov x3,x23
00b66f1c	blr x8
00b66f20	cbnz w0,0x00b66e04
00b66f24	b 0x00b66fec
00b66f28	cbz x22,0x00b66fb4
00b66f2c	cbz x21,0x00b66f34
00b66f30	tbz w8,#0x4,0x00b66e10
00b66f34	ldr x8,[x25, #0x10]
00b66f38	mov x0,x20
00b66f3c	mov x1,x22
00b66f40	mov x2,x21
00b66f44	blr x8
00b66f48	mov x23,x21
00b66f4c	cbnz w0,0x00b66e04
00b66f50	b 0x00b66fec
00b66f54	ldr x8,[x8, #0x18]
00b66f58	ldr x5,[x20, #0x10]
00b66f5c	add x4,x1,x23
00b66f60	mov x0,x20
00b66f64	mov x2,x1
00b66f68	mov x3,x23
00b66f6c	blr x8
00b66f70	cbz w0,0x00b66fec
00b66f74	ldr x8,[x20, #0x10]
00b66f78	add x8,x23,x8
00b66f7c	add x23,x8,#0x8
00b66f80	b 0x00b66e04
00b66f84	ldr x8,[x25, #0x18]
00b66f88	mov x0,x20
00b66f8c	mov x1,x22
00b66f90	mov x2,x24
00b66f94	mov x3,x21
00b66f98	mov x4,xzr
00b66f9c	mov x5,xzr
00b66fa0	blr x8
00b66fa4	cbz w0,0x00b66fec
00b66fa8	ldrb w8,[x20]
00b66fac	orr w8,w8,#0x8
00b66fb0	b 0x00b66fe0
00b66fb4	ldr x8,[x20, #0x8]
00b66fb8	ldr x9,[x25, #0x8]
00b66fbc	orr w10,wzr,#0xf
00b66fc0	add x1,x20,#0x30
00b66fc4	sub x2,x10,x8
00b66fc8	mov x0,x20
00b66fcc	mov x3,x21
00b66fd0	blr x9
00b66fd4	cbz w0,0x00b66fec
00b66fd8	ldrb w8,[x20]
00b66fdc	orr w8,w8,#0x10
00b66fe0	mov x23,x21
00b66fe4	strb w8,[x20]
00b66fe8	b 0x00b66e04
00b66fec	mov x23,xzr
00b66ff0	str x23,[x19]
00b66ff4	ldp x29,x30,[sp, #0x40]
00b66ff8	ldp x20,x19,[sp, #0x30]
00b66ffc	ldp x22,x21,[sp, #0x20]
00b67000	ldp x24,x23,[sp, #0x10]
00b67004	ldr x25,[sp], #0x50
00b67008	ret
