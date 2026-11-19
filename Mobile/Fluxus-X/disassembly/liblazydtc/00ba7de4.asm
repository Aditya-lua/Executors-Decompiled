; mbedtls_rsa_rsaes_pkcs1_v15_decrypt @ 00ba7de4
00ba7de4	stp x28,x27,[sp, #-0x60]!
00ba7de8	stp x26,x25,[sp, #0x10]
00ba7dec	stp x24,x23,[sp, #0x20]
00ba7df0	stp x22,x21,[sp, #0x30]
00ba7df4	stp x20,x19,[sp, #0x40]
00ba7df8	stp x29,x30,[sp, #0x50]
00ba7dfc	add x29,sp,#0x50
00ba7e00	sub sp,sp,#0x420
00ba7e04	mrs x25,tpidr_el0
00ba7e08	ldr x9,[x25, #0x28]
00ba7e0c	mov x21,x6
00ba7e10	mov x20,x5
00ba7e14	mov x8,x4
00ba7e18	stur x9,[x29, #-0x60]
00ba7e1c	ldr w9,[x0, #0xe0]
00ba7e20	mov x19,x3
00ba7e24	mov w22,#0xffffbf80
00ba7e28	cbnz w9,0x00ba7fbc
00ba7e2c	ldr x24,[x0, #0x8]
00ba7e30	sub x9,x24,#0x10
00ba7e34	cmp x9,#0x3f0
00ba7e38	b.hi 0x00ba7fbc
00ba7e3c	add x4,sp,#0x10
00ba7e40	mov x3,x8
00ba7e44	add x23,sp,#0x10
00ba7e48	bl 0x00c43460
00ba7e4c	mov w22,w0
00ba7e50	cbnz w0,0x00ba7fb0
00ba7e54	ldrb w10,[sp, #0x10]
00ba7e58	str x20,[sp, #0x8]
00ba7e5c	mov w13,#0x2
00ba7e60	mov x9,xzr
00ba7e64	neg x11,x10
00ba7e68	orr x10,x11,x10
00ba7e6c	asr x10,x10,#0x3f
00ba7e70	ldrb w11,[sp, #0x11]
00ba7e74	mov x8,xzr
00ba7e78	sub x2,x24,#0xb
00ba7e7c	orr x12,x23,#0x2
00ba7e80	eor x11,x13,x11
00ba7e84	neg x13,x11
00ba7e88	orr x11,x13,x11
00ba7e8c	asr x11,x11,#0x3f
00ba7e90	sub x13,x24,#0x2
00ba7e94	ldrb w15,[x12], #0x1
00ba7e98	mov x14,xzr
00ba7e9c	subs x13,x13,#0x1
00ba7ea0	eor x14,x14,x15
00ba7ea4	neg x15,x14
00ba7ea8	orr x14,x15,x14
00ba7eac	asr x14,x14,#0x3f
00ba7eb0	orn x9,x9,x14
00ba7eb4	mvn w14,w9
00ba7eb8	and x14,x14,#0x1
00ba7ebc	add x8,x14,x8
00ba7ec0	b.ne 0x00ba7e94
00ba7ec4	cmp x2,x21
00ba7ec8	orr x10,x11,x10
00ba7ecc	mov w11,#0x8
00ba7ed0	mov x12,x8
00ba7ed4	orn x9,x10,x9
00ba7ed8	csel x23,x2,x21,cc
00ba7edc	eor x10,x11,x12
00ba7ee0	sub x12,x12,x11
00ba7ee4	bic x12,x12,x10
00ba7ee8	and x10,x10,x11
00ba7eec	orr x10,x12,x10
00ba7ef0	asr x12,x10,#0x3f
00ba7ef4	sub w13,w24,#0x3
00ba7ef8	orr x9,x9,x12
00ba7efc	and x26,x23,#0xffffffff
00ba7f00	sub w8,w13,w8
00ba7f04	mov x10,x26
00ba7f08	mov x11,x9
00ba7f0c	and x10,x10,x11
00ba7f10	mvn x11,x11
00ba7f14	and x11,x11,x8
00ba7f18	orr x11,x10,x11
00ba7f1c	mov x27,x23
00ba7f20	and x28,x11,#0xffffffff
00ba7f24	mov w14,#0x4400
00ba7f28	eor x8,x28,x27
00ba7f2c	sub x27,x27,x28
00ba7f30	bic x27,x27,x8
00ba7f34	and x8,x8,x28
00ba7f38	orr x8,x27,x8
00ba7f3c	asr x27,x8,#0x3f
00ba7f40	mov w15,#0x4100
00ba7f44	and x8,x27,x14
00ba7f48	add x20,sp,#0x10
00ba7f4c	orr x0,x27,x9
00ba7f50	and x15,x15,x9
00ba7f54	mvn x9,x9
00ba7f58	and x9,x9,x8
00ba7f5c	orr x9,x15,x9
00ba7f60	add x1,x20,#0xb
00ba7f64	neg w22,w9
00ba7f68	bl 0x00c42410
00ba7f6c	and x26,x26,x27
00ba7f70	mvn x27,x27
00ba7f74	and x27,x27,x28
00ba7f78	orr x27,x26,x27
00ba7f7c	add x8,x20,x24
00ba7f80	and x26,x27,#0xffffffff
00ba7f84	sub x24,x8,x23
00ba7f88	sub x2,x23,x26
00ba7f8c	mov x0,x24
00ba7f90	mov x1,x23
00ba7f94	bl 0x00c42400
00ba7f98	cbz x21,0x00ba7fac
00ba7f9c	ldr x0,[sp, #0x8]
00ba7fa0	mov x1,x24
00ba7fa4	mov x2,x23
00ba7fa8	bl 0x00c2ffd0
00ba7fac	str x26,[x19]
00ba7fb0	add x0,sp,#0x10
00ba7fb4	mov w1,#0x400
00ba7fb8	bl 0x00c42220
00ba7fbc	ldr x8,[x25, #0x28]
00ba7fc0	ldur x9,[x29, #-0x60]
00ba7fc4	cmp x8,x9
00ba7fc8	b.ne 0x00ba7ff0
00ba7fcc	mov w0,w22
00ba7fd0	add sp,sp,#0x420
00ba7fd4	ldp x29,x30,[sp, #0x50]
00ba7fd8	ldp x20,x19,[sp, #0x40]
00ba7fdc	ldp x22,x21,[sp, #0x30]
00ba7fe0	ldp x24,x23,[sp, #0x20]
00ba7fe4	ldp x26,x25,[sp, #0x10]
00ba7fe8	ldp x28,x27,[sp], #0x60
00ba7fec	ret
00ba7ff0	bl 0x00c2fec0
