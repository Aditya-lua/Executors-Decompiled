; SSL_set_rfd @ 009b3e38
009b3e38	str x21,[sp, #-0x30]!
009b3e3c	stp x20,x19,[sp, #0x10]
009b3e40	stp x29,x30,[sp, #0x20]
009b3e44	mov x19,x0
009b3e48	ldr x0,[x0, #0x20]
009b3e4c	mov w20,w1
009b3e50	add x29,sp,#0x20
009b3e54	cbz x0,0x009b3e68
009b3e58	bl 0x00c35620
009b3e5c	mov x21,x0
009b3e60	cbnz x21,0x009b3e70
009b3e64	b 0x009b3ea8
009b3e68	ldr x21,[x19, #0x18]
009b3e6c	cbz x21,0x009b3ea8
009b3e70	mov x0,x21
009b3e74	bl 0x00c35610
009b3e78	cmp w0,#0x505
009b3e7c	b.ne 0x009b3ea8
009b3e80	mov w1,#0x69
009b3e84	mov x0,x21
009b3e88	mov x2,xzr
009b3e8c	mov x3,xzr
009b3e90	bl 0x00c321a0
009b3e94	cmp w0,w20
009b3e98	b.ne 0x009b3ea8
009b3e9c	mov x0,x21
009b3ea0	bl 0x00c322d0
009b3ea4	b 0x009b3ec8
009b3ea8	bl 0x00c35650
009b3eac	bl 0x00c32240
009b3eb0	cbz x0,0x009b3edc
009b3eb4	mov w1,#0x68
009b3eb8	mov x2,xzr
009b3ebc	mov w3,w20
009b3ec0	mov x21,x0
009b3ec4	bl 0x00c35600
009b3ec8	ldr x0,[x19, #0x10]
009b3ecc	bl 0x00c355e0
009b3ed0	mov w0,#0x1
009b3ed4	str x21,[x19, #0x10]
009b3ed8	b 0x009b3f10
009b3edc	bl 0x00c342a0
009b3ee0	adrp x0,0x2c5000
009b3ee4	adrp x2,0x2c3000
009b3ee8	add x0,x0,#0x652
009b3eec	add x2,x2,#0x576
009b3ef0	mov w1,#0x5b6
009b3ef4	bl 0x00c342b0
009b3ef8	mov w1,#0x7
009b3efc	mov w0,#0x14
009b3f00	movk w1,#0x8, LSL #16
009b3f04	mov x2,xzr
009b3f08	bl 0x00c342c0
009b3f0c	mov w0,wzr
009b3f10	ldp x29,x30,[sp, #0x20]
009b3f14	ldp x20,x19,[sp, #0x10]
009b3f18	ldr x21,[sp], #0x30
009b3f1c	ret
