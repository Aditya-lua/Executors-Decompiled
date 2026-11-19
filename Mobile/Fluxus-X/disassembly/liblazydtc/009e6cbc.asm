; ossl_statem_server_post_work @ 009e6cbc
009e6cbc	sub sp,sp,#0x30
009e6cc0	stp x20,x19,[sp, #0x10]
009e6cc4	stp x29,x30,[sp, #0x20]
009e6cc8	ldr w8,[x0, #0x5c]
009e6ccc	add x29,sp,#0x20
009e6cd0	str xzr,[x0, #0x98]
009e6cd4	sub w8,w8,#0x13
009e6cd8	cmp w8,#0x17
009e6cdc	b.hi 0x009e6f9c
009e6ce0	adrp x9,0x74d000
009e6ce4	add x9,x9,#0xb74
009e6ce8	ldrsw x8,[x9, x8, LSL #0x2]
009e6cec	mov x19,x0
009e6cf0	add x8,x8,x9
009e6cf4	br x8
009e6cf8	mov x0,x19
009e6cfc	bl 0x00c35e60
009e6d00	cmp w0,#0x1
009e6d04	b.ne 0x009e6ee0
009e6d08	mov x0,x19
009e6d0c	bl 0x00c345d0
009e6d10	cbnz w0,0x009e6f9c
009e6d14	b 0x009e6fa0
009e6d18	mov x0,x19
009e6d1c	bl 0x00c35e60
009e6d20	cmp w0,#0x1
009e6d24	b.ne 0x009e6ee0
009e6d28	ldr w8,[x19]
009e6d2c	cmp w8,#0x100
009e6d30	b.eq 0x009e6d40
009e6d34	mov x0,x19
009e6d38	bl 0x00c345d0
009e6d3c	cbz w0,0x009e6fa0
009e6d40	mov w8,#0x1
009e6d44	str w8,[x19, #0xa08]
009e6d48	b 0x009e6f9c
009e6d4c	ldr x8,[x19, #0x8]
009e6d50	ldr x9,[x8, #0xc0]
009e6d54	ldrb w9,[x9, #0x60]
009e6d58	tbnz w9,#0x3,0x009e6f9c
009e6d5c	ldr w8,[x8]
009e6d60	cmp w8,#0x304
009e6d64	b.lt 0x009e6f9c
009e6d68	cmp w8,#0x10, LSL #12
009e6d6c	b.eq 0x009e6f9c
009e6d70	ldr w9,[x19, #0x8e8]
009e6d74	ldr x8,[x19, #0x9e8]
009e6d78	cmp w9,#0x1
009e6d7c	b.ne 0x009e6eb8
009e6d80	tbnz w8,#0x14,0x009e6f9c
009e6d84	b 0x009e6d94
009e6d88	ldr w8,[x19, #0xba8]
009e6d8c	cmp w8,#0x3
009e6d90	b.ne 0x009e6f9c
009e6d94	mov x0,x19
009e6d98	bl 0x00c35e60
009e6d9c	cmp w0,#0x1
009e6da0	b.eq 0x009e6f9c
009e6da4	b 0x009e6ee0
009e6da8	bl 0x00c30710
009e6dac	str wzr,[x0]
009e6db0	ldr x8,[x19, #0x8]
009e6db4	ldr x9,[x8, #0xc0]
009e6db8	ldrb w9,[x9, #0x60]
009e6dbc	tbnz w9,#0x3,0x009e6f9c
009e6dc0	ldr w8,[x8]
009e6dc4	cmp w8,#0x304
009e6dc8	b.lt 0x009e6f9c
009e6dcc	cmp w8,#0x10, LSL #12
009e6dd0	b.eq 0x009e6f9c
009e6dd4	mov x20,x0
009e6dd8	mov x0,x19
009e6ddc	bl 0x00c35e60
009e6de0	cmp w0,#0x1
009e6de4	b.eq 0x009e6f9c
009e6de8	mov x0,x19
009e6dec	mov w1,wzr
009e6df0	bl 0x00c32910
009e6df4	cmp w0,#0x5
009e6df8	b.ne 0x009e6ee0
009e6dfc	ldr w8,[x20]
009e6e00	cmp w8,#0x68
009e6e04	b.eq 0x009e6e10
009e6e08	cmp w8,#0x20
009e6e0c	b.ne 0x009e6ee0
009e6e10	mov w8,#0x1
009e6e14	str w8,[x19, #0x28]
009e6e18	b 0x009e6f9c
009e6e1c	mov x0,x19
009e6e20	bl 0x00c35e60
009e6e24	cmp w0,#0x1
009e6e28	b.ne 0x009e6ee0
009e6e2c	ldr x9,[x19, #0x8]
009e6e30	ldr x8,[x9, #0xc0]
009e6e34	ldrb w10,[x8, #0x60]
009e6e38	tbnz w10,#0x3,0x009e6f9c
009e6e3c	ldr w9,[x9]
009e6e40	cmp w9,#0x304
009e6e44	b.lt 0x009e6f9c
009e6e48	cmp w9,#0x10, LSL #12
009e6e4c	b.eq 0x009e6f9c
009e6e50	ldr x8,[x8, #0x18]
009e6e54	add x1,x19,#0x5c4
009e6e58	add x2,x19,#0x584
009e6e5c	add x4,sp,#0x8
009e6e60	mov x0,x19
009e6e64	mov x3,xzr
009e6e68	blr x8
009e6e6c	cbz w0,0x009e6e8c
009e6e70	ldr x8,[x19, #0x8]
009e6e74	mov w1,#0x122
009e6e78	mov x0,x19
009e6e7c	ldr x8,[x8, #0xc0]
009e6e80	ldr x8,[x8, #0x20]
009e6e84	blr x8
009e6e88	cbnz w0,0x009e6f9c
009e6e8c	mov w0,wzr
009e6e90	b 0x009e6fa0
009e6e94	mov x0,x19
009e6e98	bl 0x00c35e60
009e6e9c	cmp w0,#0x1
009e6ea0	b.ne 0x009e6ee0
009e6ea4	mov w1,#0x1
009e6ea8	mov x0,x19
009e6eac	bl 0x00c36860
009e6eb0	cbnz w0,0x009e6f9c
009e6eb4	b 0x009e6fa0
009e6eb8	tbz w8,#0x14,0x009e6ec8
009e6ebc	ldr w8,[x19, #0x8e8]
009e6ec0	cmp w8,#0x2
009e6ec4	b.ne 0x009e6f9c
009e6ec8	ldr w8,[x19, #0x8e8]
009e6ecc	cmp w8,#0x1
009e6ed0	b.ne 0x009e6ee8
009e6ed4	mov x0,x19
009e6ed8	bl 0x00c35e60
009e6edc	cbnz w0,0x009e6f9c
009e6ee0	orr w0,wzr,#0x3
009e6ee4	b 0x009e6fa0
009e6ee8	ldr x9,[x19, #0x8]
009e6eec	ldr x8,[x9, #0xc0]
009e6ef0	ldrb w10,[x8, #0x60]
009e6ef4	tbnz w10,#0x3,0x009e6f6c
009e6ef8	ldr w9,[x9]
009e6efc	cmp w9,#0x304
009e6f00	b.lt 0x009e6f6c
009e6f04	cmp w9,#0x10, LSL #12
009e6f08	b.eq 0x009e6f6c
009e6f0c	ldr x8,[x8, #0x10]
009e6f10	mov x0,x19
009e6f14	blr x8
009e6f18	cbz w0,0x009e6fa0
009e6f1c	ldr x8,[x19, #0x8]
009e6f20	mov w1,#0xa2
009e6f24	mov x0,x19
009e6f28	ldr x8,[x8, #0xc0]
009e6f2c	ldr x8,[x8, #0x20]
009e6f30	blr x8
009e6f34	cbz w0,0x009e6fa0
009e6f38	ldr w8,[x19, #0xb30]
009e6f3c	cmp w8,#0x2
009e6f40	b.eq 0x009e6f60
009e6f44	ldr x8,[x19, #0x8]
009e6f48	mov w1,#0xa1
009e6f4c	mov x0,x19
009e6f50	ldr x8,[x8, #0xc0]
009e6f54	ldr x8,[x8, #0x20]
009e6f58	blr x8
009e6f5c	cbz w0,0x009e6fa0
009e6f60	mov w8,#0x1
009e6f64	str w8,[x19, #0x80]
009e6f68	b 0x009e6f9c
009e6f6c	ldr x8,[x8, #0x20]
009e6f70	mov w1,#0x22
009e6f74	mov x0,x19
009e6f78	blr x8
009e6f7c	cbz w0,0x009e6fa0
009e6f80	ldr x8,[x19, #0x8]
009e6f84	ldr x8,[x8, #0xc0]
009e6f88	ldrb w8,[x8, #0x60]
009e6f8c	tbz w8,#0x3,0x009e6f9c
009e6f90	mov w1,#0x2
009e6f94	mov x0,x19
009e6f98	bl 0x00c36b80
009e6f9c	mov w0,#0x2
009e6fa0	ldp x29,x30,[sp, #0x20]
009e6fa4	ldp x20,x19,[sp, #0x10]
009e6fa8	add sp,sp,#0x30
009e6fac	ret
