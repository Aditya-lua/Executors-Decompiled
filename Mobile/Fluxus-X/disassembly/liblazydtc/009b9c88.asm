; SSL_CONF_cmd @ 009b9c88
009b9c88	str x21,[sp, #-0x30]!
009b9c8c	stp x20,x19,[sp, #0x10]
009b9c90	stp x29,x30,[sp, #0x20]
009b9c94	add x29,sp,#0x20
009b9c98	str x1,[sp, #0x8]
009b9c9c	cbz x1,0x009b9d58
009b9ca0	add x1,sp,#0x8
009b9ca4	mov x21,x2
009b9ca8	mov x19,x0
009b9cac	bl 0x009b9ec0
009b9cb0	cbz w0,0x009b9d14
009b9cb4	ldr x1,[sp, #0x8]
009b9cb8	mov x0,x19
009b9cbc	bl 0x009b9fa4
009b9cc0	cbz x0,0x009b9d14
009b9cc4	ldrh w8,[x0, #0x1a]
009b9cc8	cmp w8,#0x4
009b9ccc	b.ne 0x009b9d9c
009b9cd0	adrp x8,0xc56000
009b9cd4	add x8,x8,#0x950
009b9cd8	sub x8,x0,x8
009b9cdc	asr x8,x8,#0x5
009b9ce0	cmp x8,#0x18
009b9ce4	b.cc 0x009b9dc0
009b9ce8	bl 0x00c342a0
009b9cec	adrp x0,0x2ad000
009b9cf0	adrp x2,0x2ad000
009b9cf4	add x0,x0,#0x7c2
009b9cf8	add x2,x2,#0x821
009b9cfc	mov w1,#0x36c
009b9d00	bl 0x00c342b0
009b9d04	mov w1,#0x103
009b9d08	mov w0,#0x14
009b9d0c	movk w1,#0xc, LSL #16
009b9d10	b 0x009b9d7c
009b9d14	ldrb w8,[x19]
009b9d18	tbz w8,#0x4,0x009b9d50
009b9d1c	bl 0x00c342a0
009b9d20	adrp x0,0x2ad000
009b9d24	adrp x2,0x2d7000
009b9d28	add x0,x0,#0x7c2
009b9d2c	add x2,x2,#0xa1d
009b9d30	mov w1,#0x39a
009b9d34	bl 0x00c342b0
009b9d38	ldr x3,[sp, #0x8]
009b9d3c	adrp x2,0x2a9000
009b9d40	add x2,x2,#0xdd9
009b9d44	mov w0,#0x14
009b9d48	mov w1,#0x182
009b9d4c	bl 0x00c342c0
009b9d50	orr w20,wzr,#0xfffffffe
009b9d54	b 0x009b9d88
009b9d58	bl 0x00c342a0
009b9d5c	adrp x0,0x2ad000
009b9d60	adrp x2,0x2d7000
009b9d64	add x0,x0,#0x7c2
009b9d68	add x2,x2,#0xa1d
009b9d6c	mov w1,#0x379
009b9d70	bl 0x00c342b0
009b9d74	mov w0,#0x14
009b9d78	mov w1,#0x181
009b9d7c	mov x2,xzr
009b9d80	bl 0x00c342c0
009b9d84	mov w20,wzr
009b9d88	mov w0,w20
009b9d8c	ldp x29,x30,[sp, #0x20]
009b9d90	ldp x20,x19,[sp, #0x10]
009b9d94	ldr x21,[sp], #0x30
009b9d98	ret
009b9d9c	cbz x21,0x009b9e04
009b9da0	ldr x8,[x0]
009b9da4	mov x0,x19
009b9da8	mov x1,x21
009b9dac	blr x8
009b9db0	cmp w0,#0x0
009b9db4	b.le 0x009b9e1c
009b9db8	mov w20,#0x2
009b9dbc	b 0x009b9d88
009b9dc0	ldr x10,[x19, #0x28]
009b9dc4	cbz x10,0x009b9e14
009b9dc8	adrp x9,0x74c000
009b9dcc	add x9,x9,#0x4c8
009b9dd0	add x8,x9,x8, LSL #0x4
009b9dd4	ldr w9,[x8, #0x8]
009b9dd8	ldr x8,[x8]
009b9ddc	mvn w12,w9
009b9de0	ands w11,w9,#0xf00
009b9de4	and w9,w12,#0x1
009b9de8	b.eq 0x009b9e74
009b9dec	cmp w11,#0x200
009b9df0	b.eq 0x009b9e84
009b9df4	cmp w11,#0x100
009b9df8	b.ne 0x009b9e14
009b9dfc	add x10,x19,#0x78
009b9e00	b 0x009b9e88
009b9e04	orr w20,wzr,#0xfffffffd
009b9e08	ldrb w8,[x19]
009b9e0c	tbz w8,#0x4,0x009b9d88
009b9e10	b 0x009b9e2c
009b9e14	mov w20,#0x1
009b9e18	b 0x009b9d88
009b9e1c	cmn w0,#0x2
009b9e20	csel w20,w0,wzr,eq
009b9e24	ldrb w8,[x19]
009b9e28	tbz w8,#0x4,0x009b9d88
009b9e2c	bl 0x00c342a0
009b9e30	adrp x0,0x2ad000
009b9e34	adrp x2,0x2d7000
009b9e38	add x0,x0,#0x7c2
009b9e3c	add x2,x2,#0xa1d
009b9e40	mov w1,#0x392
009b9e44	bl 0x00c342b0
009b9e48	ldr x3,[sp, #0x8]
009b9e4c	adrp x8,0x2c1000
009b9e50	add x8,x8,#0x6d4
009b9e54	cmp x21,#0x0
009b9e58	adrp x2,0x2cd000
009b9e5c	csel x4,x8,x21,eq
009b9e60	add x2,x2,#0x622
009b9e64	mov w0,#0x14
009b9e68	orr w1,wzr,#0x180
009b9e6c	bl 0x00c342c0
009b9e70	b 0x009b9d88
009b9e74	cbz w9,0x009b9eac
009b9e78	ldr x9,[x10]
009b9e7c	orr x8,x9,x8
009b9e80	b 0x009b9eb4
009b9e84	add x10,x19,#0x80
009b9e88	ldr x10,[x10]
009b9e8c	cmp w9,#0x0
009b9e90	mov w20,#0x1
009b9e94	ldr w11,[x10]
009b9e98	bic w9,w11,w8
009b9e9c	orr w8,w11,w8
009b9ea0	csel w8,w9,w8,eq
009b9ea4	str w8,[x10]
009b9ea8	b 0x009b9d88
009b9eac	ldr x9,[x10]
009b9eb0	bic x8,x9,x8
009b9eb4	str x8,[x10]
009b9eb8	mov w20,#0x1
009b9ebc	b 0x009b9d88
