; mbedtls_aria_crypt_cfb128 @ 00b70ed4
00b70ed4	str x25,[sp, #-0x50]!
00b70ed8	stp x24,x23,[sp, #0x10]
00b70edc	stp x22,x21,[sp, #0x20]
00b70ee0	stp x20,x19,[sp, #0x30]
00b70ee4	stp x29,x30,[sp, #0x40]
00b70ee8	add x29,sp,#0x40
00b70eec	mov x20,x6
00b70ef0	mov x21,x5
00b70ef4	mov x22,x4
00b70ef8	mov x19,x3
00b70efc	mov x23,x2
00b70f00	cmp w1,#0x1
00b70f04	mov x24,x0
00b70f08	b.hi 0x00b70f18
00b70f0c	ldr x25,[x19]
00b70f10	cmp x25,#0xf
00b70f14	b.ls 0x00b70f20
00b70f18	mov w0,#0xffffffa4
00b70f1c	b 0x00b70fa8
00b70f20	cbz w1,0x00b70f64
00b70f24	cbz x23,0x00b70fa0
00b70f28	cbnz x25,0x00b70f3c
00b70f2c	mov x0,x24
00b70f30	mov x1,x22
00b70f34	mov x2,x22
00b70f38	bl 0x00c419e0
00b70f3c	ldrb w8,[x22, x25]
00b70f40	ldrb w9,[x21], #0x1
00b70f44	add w10,w25,#0x1
00b70f48	subs x23,x23,#0x1
00b70f4c	eor w8,w9,w8
00b70f50	strb w8,[x20], #0x1
00b70f54	strb w8,[x22, x25]
00b70f58	and x25,x10,#0xf
00b70f5c	b.ne 0x00b70f28
00b70f60	b 0x00b70fa0
00b70f64	cbz x23,0x00b70fa0
00b70f68	cbnz x25,0x00b70f7c
00b70f6c	mov x0,x24
00b70f70	mov x1,x22
00b70f74	mov x2,x22
00b70f78	bl 0x00c419e0
00b70f7c	ldrb w8,[x21], #0x1
00b70f80	ldrb w9,[x22, x25]
00b70f84	add w10,w25,#0x1
00b70f88	subs x23,x23,#0x1
00b70f8c	eor w9,w9,w8
00b70f90	strb w9,[x20], #0x1
00b70f94	strb w8,[x22, x25]
00b70f98	and x25,x10,#0xf
00b70f9c	b.ne 0x00b70f68
00b70fa0	mov w0,wzr
00b70fa4	str x25,[x19]
00b70fa8	ldp x29,x30,[sp, #0x40]
00b70fac	ldp x20,x19,[sp, #0x30]
00b70fb0	ldp x22,x21,[sp, #0x20]
00b70fb4	ldp x24,x23,[sp, #0x10]
00b70fb8	ldr x25,[sp], #0x50
00b70fbc	ret
