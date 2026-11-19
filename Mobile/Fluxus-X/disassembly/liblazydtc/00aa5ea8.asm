; MD4_Final @ 00aa5ea8
00aa5ea8	str x21,[sp, #-0x30]!
00aa5eac	stp x20,x19,[sp, #0x10]
00aa5eb0	stp x29,x30,[sp, #0x20]
00aa5eb4	ldr w8,[x1, #0x58]
00aa5eb8	add x21,x1,#0x18
00aa5ebc	mov w9,#0x80
00aa5ec0	mov x20,x1
00aa5ec4	mov x19,x0
00aa5ec8	strb w9,[x21, x8]
00aa5ecc	cmp w8,#0x38
00aa5ed0	add x9,x8,#0x1
00aa5ed4	add x29,sp,#0x20
00aa5ed8	b.cc 0x00aa5f04
00aa5edc	add x0,x21,x9
00aa5ee0	orr w9,wzr,#0x3f
00aa5ee4	sub x2,x9,x8
00aa5ee8	mov w1,wzr
00aa5eec	bl 0x00c301c0
00aa5ef0	mov w2,#0x1
00aa5ef4	mov x0,x20
00aa5ef8	mov x1,x21
00aa5efc	bl 0x00aa5918
00aa5f00	mov x9,xzr
00aa5f04	orr w8,wzr,#0x38
00aa5f08	add x0,x21,x9
00aa5f0c	sub x2,x8,x9
00aa5f10	mov w1,wzr
00aa5f14	bl 0x00c301c0
00aa5f18	ldp w8,w9,[x20, #0x10]
00aa5f1c	mov w2,#0x1
00aa5f20	mov x0,x20
00aa5f24	mov x1,x21
00aa5f28	lsr w10,w8,#0x8
00aa5f2c	strb w10,[x20, #0x51]
00aa5f30	lsr w10,w8,#0x10
00aa5f34	strb w8,[x20, #0x50]
00aa5f38	lsr w8,w8,#0x18
00aa5f3c	strb w8,[x20, #0x53]
00aa5f40	lsr w8,w9,#0x8
00aa5f44	strb w9,[x20, #0x54]
00aa5f48	strb w8,[x20, #0x55]
00aa5f4c	lsr w8,w9,#0x10
00aa5f50	lsr w9,w9,#0x18
00aa5f54	strb w10,[x20, #0x52]
00aa5f58	strb w8,[x20, #0x56]
00aa5f5c	strb w9,[x20, #0x57]
00aa5f60	bl 0x00aa5918
00aa5f64	mov w1,#0x40
00aa5f68	mov x0,x21
00aa5f6c	str wzr,[x20, #0x58]
00aa5f70	bl 0x00c34750
00aa5f74	ldr w8,[x20]
00aa5f78	mov w0,#0x1
00aa5f7c	lsr w9,w8,#0x8
00aa5f80	strb w8,[x19]
00aa5f84	strb w9,[x19, #0x1]
00aa5f88	lsr w9,w8,#0x10
00aa5f8c	lsr w8,w8,#0x18
00aa5f90	strb w9,[x19, #0x2]
00aa5f94	strb w8,[x19, #0x3]
00aa5f98	ldr w8,[x20, #0x4]
00aa5f9c	lsr w9,w8,#0x8
00aa5fa0	strb w8,[x19, #0x4]
00aa5fa4	strb w9,[x19, #0x5]
00aa5fa8	lsr w9,w8,#0x10
00aa5fac	lsr w8,w8,#0x18
00aa5fb0	strb w9,[x19, #0x6]
00aa5fb4	strb w8,[x19, #0x7]
00aa5fb8	ldr w8,[x20, #0x8]
00aa5fbc	lsr w9,w8,#0x8
00aa5fc0	strb w8,[x19, #0x8]
00aa5fc4	strb w9,[x19, #0x9]
00aa5fc8	lsr w9,w8,#0x10
00aa5fcc	lsr w8,w8,#0x18
00aa5fd0	strb w9,[x19, #0xa]
00aa5fd4	strb w8,[x19, #0xb]
00aa5fd8	ldr w8,[x20, #0xc]
00aa5fdc	lsr w9,w8,#0x8
00aa5fe0	strb w8,[x19, #0xc]
00aa5fe4	strb w9,[x19, #0xd]
00aa5fe8	lsr w9,w8,#0x10
00aa5fec	lsr w8,w8,#0x18
00aa5ff0	strb w9,[x19, #0xe]
00aa5ff4	strb w8,[x19, #0xf]
00aa5ff8	ldp x29,x30,[sp, #0x20]
00aa5ffc	ldp x20,x19,[sp, #0x10]
00aa6000	ldr x21,[sp], #0x30
00aa6004	ret
