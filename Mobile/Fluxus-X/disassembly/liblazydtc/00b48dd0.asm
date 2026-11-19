; FUN_00b48dd0 @ 00b48dd0
00b48dd0	str x23,[sp, #-0x40]!
00b48dd4	stp x22,x21,[sp, #0x10]
00b48dd8	stp x20,x19,[sp, #0x20]
00b48ddc	stp x29,x30,[sp, #0x30]
00b48de0	mov x19,x0
00b48de4	ldr x0,[x0]
00b48de8	add x29,sp,#0x30
00b48dec	mov x20,x1
00b48df0	bl 0x00c41210
00b48df4	cbz x20,0x00b48f94
00b48df8	mov x2,x0
00b48dfc	add x0,x19,#0x8
00b48e00	mov x1,x20
00b48e04	bl 0x00c41150
00b48e08	cbz w0,0x00b48f98
00b48e0c	adrp x1,0x2c5000
00b48e10	add x1,x1,#0x67e
00b48e14	mov x0,x20
00b48e18	bl 0x00c36530
00b48e1c	cbz x0,0x00b48e64
00b48e20	mov x22,x19
00b48e24	mov x21,x0
00b48e28	ldr x0,[x22, #0x20]!
00b48e2c	adrp x2,0x2cc000
00b48e30	add x2,x2,#0x73f
00b48e34	mov w3,#0x5d
00b48e38	mov x23,x22
00b48e3c	ldr x1,[x23, #0x8]!
00b48e40	bl 0x00c345e0
00b48e44	mov x0,x21
00b48e48	mov x1,x22
00b48e4c	mov x2,xzr
00b48e50	mov x3,x23
00b48e54	str xzr,[x23]
00b48e58	str xzr,[x22]
00b48e5c	bl 0x00c3ace0
00b48e60	cbz w0,0x00b48f98
00b48e64	adrp x1,0x2b3000
00b48e68	add x1,x1,#0xe
00b48e6c	mov x0,x20
00b48e70	bl 0x00c36530
00b48e74	cbz x0,0x00b48ebc
00b48e78	mov x22,x19
00b48e7c	mov x21,x0
00b48e80	ldr x0,[x22, #0x30]!
00b48e84	adrp x2,0x2cc000
00b48e88	add x2,x2,#0x73f
00b48e8c	mov w3,#0x5d
00b48e90	mov x23,x22
00b48e94	ldr x1,[x23, #0x8]!
00b48e98	bl 0x00c345e0
00b48e9c	mov x0,x21
00b48ea0	mov x1,x22
00b48ea4	mov x2,xzr
00b48ea8	mov x3,x23
00b48eac	str xzr,[x23]
00b48eb0	str xzr,[x22]
00b48eb4	bl 0x00c3ace0
00b48eb8	cbz w0,0x00b48f98
00b48ebc	adrp x1,0x2c7000
00b48ec0	add x1,x1,#0x67e
00b48ec4	mov x0,x20
00b48ec8	bl 0x00c36530
00b48ecc	cbz x0,0x00b48f14
00b48ed0	mov x22,x19
00b48ed4	mov x21,x0
00b48ed8	ldr x0,[x22, #0x48]!
00b48edc	adrp x2,0x2cc000
00b48ee0	add x2,x2,#0x73f
00b48ee4	mov w3,#0x5d
00b48ee8	mov x23,x22
00b48eec	ldr x1,[x23, #0x8]!
00b48ef0	bl 0x00c345e0
00b48ef4	mov x0,x21
00b48ef8	mov x1,x22
00b48efc	mov x2,xzr
00b48f00	mov x3,x23
00b48f04	str xzr,[x23]
00b48f08	str xzr,[x22]
00b48f0c	bl 0x00c3ace0
00b48f10	cbz w0,0x00b48f98
00b48f14	adrp x1,0x2ce000
00b48f18	add x1,x1,#0xcd9
00b48f1c	mov x0,x20
00b48f20	bl 0x00c36530
00b48f24	cbz x0,0x00b48f94
00b48f28	add x1,sp,#0x8
00b48f2c	mov x20,x0
00b48f30	bl 0x00c3b420
00b48f34	cbz w0,0x00b48f88
00b48f38	ldr x8,[sp, #0x8]
00b48f3c	cbz x8,0x00b48f88
00b48f40	ldr x9,[x20, #0x18]
00b48f44	cmp x9,#0x1
00b48f48	b.ne 0x00b48f88
00b48f4c	ldrb w8,[x8]
00b48f50	sub w9,w8,#0x41
00b48f54	cmp w9,#0x6
00b48f58	b.cc 0x00b48f90
00b48f5c	bl 0x00c342a0
00b48f60	adrp x0,0x2cc000
00b48f64	adrp x2,0x2b3000
00b48f68	add x0,x0,#0x73f
00b48f6c	add x2,x2,#0x16
00b48f70	mov w1,#0xab
00b48f74	bl 0x00c342b0
00b48f78	mov w0,#0x39
00b48f7c	mov w1,#0x8a
00b48f80	mov x2,xzr
00b48f84	bl 0x00c342c0
00b48f88	mov w0,wzr
00b48f8c	b 0x00b48f98
00b48f90	strb w8,[x19, #0x40]
00b48f94	mov w0,#0x1
00b48f98	ldp x29,x30,[sp, #0x30]
00b48f9c	ldp x20,x19,[sp, #0x20]
00b48fa0	ldp x22,x21,[sp, #0x10]
00b48fa4	ldr x23,[sp], #0x40
00b48fa8	ret
