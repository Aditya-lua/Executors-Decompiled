; tls13_final_finish_mac @ 009c6dac
009c6dac	sub sp,sp,#0x150
009c6db0	str x28,[sp, #0x100]
009c6db4	stp x24,x23,[sp, #0x110]
009c6db8	stp x22,x21,[sp, #0x120]
009c6dbc	stp x20,x19,[sp, #0x130]
009c6dc0	stp x29,x30,[sp, #0x140]
009c6dc4	add x29,sp,#0x140
009c6dc8	mov x20,x3
009c6dcc	mov x23,x1
009c6dd0	mov x19,x0
009c6dd4	bl 0x00c34a10
009c6dd8	mov x22,x0
009c6ddc	bl 0x00c36230
009c6de0	stur xzr,[x29, #-0x38]
009c6de4	cbz x22,0x009c6ebc
009c6de8	ldr x8,[x19, #0x9a8]
009c6dec	mov x21,x0
009c6df0	add x24,sp,#0x20
009c6df4	ldr x1,[x8, #0x440]
009c6df8	cbz x1,0x009c6e24
009c6dfc	adrp x0,0x2d3000
009c6e00	add x0,x0,#0x7c2
009c6e04	sub x8,x29,#0x80
009c6e08	mov x2,xzr
009c6e0c	add x24,x24,#0x28
009c6e10	bl 0x00c36280
009c6e14	ldur x8,[x29, #-0x60]
009c6e18	ldp q1,q0,[x29, #-0x80]
009c6e1c	str x8,[sp, #0x40]
009c6e20	stp q1,q0,[sp, #0x20]
009c6e24	sub x8,x29,#0x80
009c6e28	bl 0x00c34c40
009c6e2c	ldur x8,[x29, #-0x60]
009c6e30	ldp q0,q1,[x29, #-0x80]
009c6e34	sub x1,x29,#0x80
009c6e38	mov w2,#0x40
009c6e3c	add x3,sp,#0x78
009c6e40	mov x0,x19
009c6e44	str x8,[x24, #0x20]
009c6e48	stp q0,q1,[x24]
009c6e4c	bl 0x00c35dc0
009c6e50	cbz w0,0x009c6f44
009c6e54	ldr x8,[x19, #0x8]
009c6e58	ldr x8,[x8, #0xc0]
009c6e5c	ldr x8,[x8, #0x40]
009c6e60	cmp x8,x23
009c6e64	b.eq 0x009c6ec4
009c6e68	ldr x8,[x19, #0x240]
009c6e6c	cbz x8,0x009c6ecc
009c6e70	ldr x8,[x19, #0x2c8]
009c6e74	cbz x8,0x009c6ecc
009c6e78	ldr x8,[sp, #0x78]
009c6e7c	adrp x3,0x74c000
009c6e80	add x2,x19,#0x744
009c6e84	mov w9,#0x1
009c6e88	add x3,x3,#0xe2a
009c6e8c	mov w4,#0x8
009c6e90	add x7,sp,#0x80
009c6e94	mov x0,x19
009c6e98	mov x1,x22
009c6e9c	mov x5,xzr
009c6ea0	mov x6,xzr
009c6ea4	add x23,sp,#0x80
009c6ea8	str w9,[sp, #0x8]
009c6eac	str x8,[sp]
009c6eb0	bl 0x009c6600
009c6eb4	cbnz w0,0x009c6ed0
009c6eb8	b 0x009c6f44
009c6ebc	mov x0,xzr
009c6ec0	b 0x009c6f54
009c6ec4	add x23,x19,#0x684
009c6ec8	b 0x009c6ed0
009c6ecc	add x23,x19,#0x644
009c6ed0	ldr x8,[x19, #0x9a8]
009c6ed4	ldr x6,[sp, #0x78]
009c6ed8	adrp x1,0x2c3000
009c6edc	mov w9,#0x80
009c6ee0	ldr x0,[x8]
009c6ee4	ldr x2,[x8, #0x440]
009c6ee8	sub x8,x29,#0x38
009c6eec	add x1,x1,#0x5d3
009c6ef0	add x4,sp,#0x20
009c6ef4	sub x7,x29,#0x80
009c6ef8	mov x3,x21
009c6efc	mov x5,x23
009c6f00	stp x9,x8,[sp, #0x10]
009c6f04	stp x6,x20,[sp]
009c6f08	bl 0x00c36810
009c6f0c	cbnz x0,0x009c6f44
009c6f10	bl 0x00c342a0
009c6f14	adrp x0,0x2b5000
009c6f18	adrp x2,0x2bd000
009c6f1c	add x0,x0,#0x997
009c6f20	add x2,x2,#0x666
009c6f24	mov w1,#0x12b
009c6f28	bl 0x00c342b0
009c6f2c	mov w2,#0x103
009c6f30	mov w1,#0x50
009c6f34	movk w2,#0xc, LSL #16
009c6f38	mov x0,x19
009c6f3c	mov x3,xzr
009c6f40	bl 0x00c34410
009c6f44	add x0,sp,#0x80
009c6f48	mov w1,#0x40
009c6f4c	bl 0x00c34750
009c6f50	ldur x0,[x29, #-0x38]
009c6f54	ldp x29,x30,[sp, #0x140]
009c6f58	ldp x20,x19,[sp, #0x130]
009c6f5c	ldp x22,x21,[sp, #0x120]
009c6f60	ldp x24,x23,[sp, #0x110]
009c6f64	ldr x28,[sp, #0x100]
009c6f68	add sp,sp,#0x150
009c6f6c	ret
