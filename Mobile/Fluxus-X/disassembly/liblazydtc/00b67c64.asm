; FUN_00b67c64 @ 00b67c64
00b67c64	str x25,[sp, #-0x50]!
00b67c68	stp x24,x23,[sp, #0x10]
00b67c6c	stp x22,x21,[sp, #0x20]
00b67c70	stp x20,x19,[sp, #0x30]
00b67c74	stp x29,x30,[sp, #0x40]
00b67c78	ldr x8,[x0, #0x28]
00b67c7c	mov x21,x4
00b67c80	mov x23,x3
00b67c84	mov x19,x2
00b67c88	mov x20,x0
00b67c8c	cmn x8,#0x1
00b67c90	mov x22,x1
00b67c94	add x29,sp,#0x40
00b67c98	b.eq 0x00b67d08
00b67c9c	bl 0x00c41000
00b67ca0	cbz w0,0x00b67f64
00b67ca4	ldrb w9,[x20, #0x54]
00b67ca8	tbz w9,#0x2,0x00b67f60
00b67cac	cmp x22,x23
00b67cb0	b.ne 0x00b67f60
00b67cb4	mov w0,wzr
00b67cb8	subs x23,x21,#0x18
00b67cbc	mov x8,xzr
00b67cc0	b.cc 0x00b67f68
00b67cc4	tbnz w9,#0x0,0x00b67d84
00b67cc8	mov w8,#0x15
00b67ccc	and w8,w9,w8
00b67cd0	cmp w8,#0x14
00b67cd4	b.ne 0x00b67f60
00b67cd8	ldr x8,[x20, #0x10]
00b67cdc	ldr x9,[x22]
00b67ce0	add x1,x20,#0x55
00b67ce4	mov x0,x20
00b67ce8	add x8,x1,x8
00b67cec	stur x9,[x8, #-0x8]
00b67cf0	ldr x8,[x20, #0xf0]
00b67cf4	ldr x2,[x20, #0x10]
00b67cf8	ldr x8,[x8, #0x8]
00b67cfc	blr x8
00b67d00	cbnz w0,0x00b67e14
00b67d04	b 0x00b67f64
00b67d08	ldrb w8,[x20, #0x54]
00b67d0c	tbnz w8,#0x2,0x00b67d1c
00b67d10	mov x8,xzr
00b67d14	mov w0,wzr
00b67d18	b 0x00b67f78
00b67d1c	ldr w9,[x20, #0x50]
00b67d20	ldr x25,[x20, #0xf0]
00b67d24	cbz w9,0x00b67e64
00b67d28	cmp w9,#0x3
00b67d2c	b.eq 0x00b67d10
00b67d30	cmp w9,#0x1
00b67d34	b.ne 0x00b67d5c
00b67d38	add x24,x20,#0x55
00b67d3c	ldr x8,[x25, #0x8]
00b67d40	ldr x2,[x20, #0x10]
00b67d44	mov x0,x20
00b67d48	mov x1,x24
00b67d4c	blr x8
00b67d50	cbz w0,0x00b67f18
00b67d54	mov w8,#0x2
00b67d58	str w8,[x20, #0x50]
00b67d5c	cbz x23,0x00b67ebc
00b67d60	cbz x22,0x00b67ef4
00b67d64	ldr x8,[x25, #0x18]
00b67d68	mov x0,x20
00b67d6c	mov x1,x23
00b67d70	mov x2,x21
00b67d74	mov x3,x22
00b67d78	blr x8
00b67d7c	cbnz w0,0x00b67f0c
00b67d80	b 0x00b67f18
00b67d84	ldr x8,[x20, #0x30]
00b67d88	adds x8,x8,#0x1
00b67d8c	str x8,[x20, #0x30]
00b67d90	b.eq 0x00b67f20
00b67d94	mov w8,#0x14
00b67d98	bics wzr,w8,w9
00b67d9c	b.ne 0x00b67f60
00b67da0	ldr x8,[x20, #0xf0]
00b67da4	ldr x2,[x20, #0x10]
00b67da8	add x1,x20,#0x55
00b67dac	mov x0,x20
00b67db0	ldr x8,[x8, #0x8]
00b67db4	blr x8
00b67db8	cbz w0,0x00b67f64
00b67dbc	ldr x8,[x20, #0x10]
00b67dc0	mov w9,#0x8
00b67dc4	mov x0,x22
00b67dc8	cmp x8,#0x8
00b67dcc	add x10,x20,x8
00b67dd0	csel x2,x8,x9,cc
00b67dd4	add x8,x10,#0x55
00b67dd8	sub x1,x8,x2
00b67ddc	bl 0x00c2ffd0
00b67de0	ldr x9,[x20, #0x10]
00b67de4	mov x8,xzr
00b67de8	add x9,x20,x9
00b67dec	add x9,x9,#0x54
00b67df0	ldrb w10,[x9, x8]
00b67df4	add x11,x8,#0x8
00b67df8	cmp x11,#0x2
00b67dfc	add w10,w10,#0x1
00b67e00	strb w10,[x9, x8]
00b67e04	b.cc 0x00b67e14
00b67e08	tst w10,#0xff
00b67e0c	sub x8,x8,#0x1
00b67e10	b.eq 0x00b67df0
00b67e14	ldr x8,[x20, #0xf0]
00b67e18	mov w9,#0x2
00b67e1c	str w9,[x20, #0x50]
00b67e20	ldr x2,[x20, #0x28]
00b67e24	ldr x8,[x8, #0x28]
00b67e28	add x22,x22,#0x8
00b67e2c	add x6,x22,x23
00b67e30	add x1,x20,#0xd5
00b67e34	mov w7,#0x10
00b67e38	mov x0,x20
00b67e3c	mov x3,x22
00b67e40	mov x4,x23
00b67e44	mov x5,x22
00b67e48	blr x8
00b67e4c	ldrb w8,[x20, #0x54]
00b67e50	cbz w0,0x00b67f50
00b67e54	tst w8,#0x1
00b67e58	csel x8,x21,x23,ne
00b67e5c	mov w0,#0x1
00b67e60	b 0x00b67f68
00b67e64	tbz w8,#0x0,0x00b67d10
00b67e68	ldr x9,[x20, #0x10]
00b67e6c	cmp x9,#0xc
00b67e70	b.cc 0x00b67d10
00b67e74	mov x8,xzr
00b67e78	cmp w9,#0x1
00b67e7c	mov w0,wzr
00b67e80	b.lt 0x00b67f78
00b67e84	ldr x0,[x20, #0xe8]
00b67e88	add x24,x20,#0x55
00b67e8c	sxtw x2,w9
00b67e90	mov x1,x24
00b67e94	mov w3,wzr
00b67e98	bl 0x00c347b0
00b67e9c	cmp w0,#0x1
00b67ea0	b.lt 0x00b67d10
00b67ea4	ldrb w8,[x20, #0x54]
00b67ea8	mov w9,#0x1
00b67eac	str w9,[x20, #0x50]
00b67eb0	orr w8,w8,#0x8
00b67eb4	strb w8,[x20, #0x54]
00b67eb8	b 0x00b67d3c
00b67ebc	ldrb w8,[x20, #0x54]
00b67ec0	tbnz w8,#0x0,0x00b67ed0
00b67ec4	ldr x8,[x20, #0x18]
00b67ec8	cmn x8,#0x1
00b67ecc	b.eq 0x00b67d10
00b67ed0	ldr x8,[x25, #0x20]
00b67ed4	add x1,x20,#0xd5
00b67ed8	mov x0,x20
00b67edc	blr x8
00b67ee0	cbz w0,0x00b67f18
00b67ee4	mov x21,xzr
00b67ee8	orr w8,wzr,#0x3
00b67eec	str w8,[x20, #0x50]
00b67ef0	b 0x00b67f0c
00b67ef4	ldr x8,[x25, #0x10]
00b67ef8	mov x0,x20
00b67efc	mov x1,x23
00b67f00	mov x2,x21
00b67f04	blr x8
00b67f08	cbz w0,0x00b67f18
00b67f0c	mov w0,#0x1
00b67f10	mov x8,x21
00b67f14	b 0x00b67f78
00b67f18	mov x8,xzr
00b67f1c	b 0x00b67f78
00b67f20	bl 0x00c342a0
00b67f24	adrp x0,0x2ac000
00b67f28	adrp x2,0x2a8000
00b67f2c	add x0,x0,#0xc00
00b67f30	add x2,x2,#0xe68
00b67f34	mov w1,#0x216
00b67f38	bl 0x00c342b0
00b67f3c	mov w0,#0x39
00b67f40	orr w1,wzr,#0x7e
00b67f44	mov x2,xzr
00b67f48	bl 0x00c342c0
00b67f4c	b 0x00b67f60
00b67f50	tbnz w8,#0x0,0x00b67f60
00b67f54	mov x0,x22
00b67f58	mov x1,x23
00b67f5c	bl 0x00c34750
00b67f60	mov w0,wzr
00b67f64	mov x8,xzr
00b67f68	orr w9,wzr,#0x3
00b67f6c	mov x10,#-0x1
00b67f70	str w9,[x20, #0x50]
00b67f74	str x10,[x20, #0x28]
00b67f78	str x8,[x19]
00b67f7c	ldp x29,x30,[sp, #0x40]
00b67f80	ldp x20,x19,[sp, #0x30]
00b67f84	ldp x22,x21,[sp, #0x20]
00b67f88	ldp x24,x23,[sp, #0x10]
00b67f8c	ldr x25,[sp], #0x50
00b67f90	ret
