; ssl_generate_master_secret @ 009a9d08
009a9d08	str x27,[sp, #-0x60]!
009a9d0c	stp x26,x25,[sp, #0x10]
009a9d10	stp x24,x23,[sp, #0x20]
009a9d14	stp x22,x21,[sp, #0x30]
009a9d18	stp x20,x19,[sp, #0x40]
009a9d1c	stp x29,x30,[sp, #0x50]
009a9d20	ldr x8,[x0, #0x2e0]
009a9d24	mov w22,w3
009a9d28	mov x20,x2
009a9d2c	mov x19,x0
009a9d30	ldr w27,[x8, #0x1c]
009a9d34	mov w8,#0x1c8
009a9d38	mov x21,x1
009a9d3c	add x29,sp,#0x50
009a9d40	tst x27,x8
009a9d44	b.eq 0x009a9da0
009a9d48	ldr x25,[x19, #0x378]
009a9d4c	tst x27,#0x8
009a9d50	adrp x1,0x2a3000
009a9d54	add x1,x1,#0xa43
009a9d58	csel x20,x25,x20,ne
009a9d5c	add x8,x25,x20
009a9d60	add x23,x8,#0x4
009a9d64	mov w2,#0x120b
009a9d68	mov x0,x23
009a9d6c	bl 0x00c32320
009a9d70	cbz x0,0x009a9dfc
009a9d74	lsr x8,x20,#0x8
009a9d78	add x26,x0,#0x2
009a9d7c	mov x24,x0
009a9d80	strb w20,[x0, #0x1]
009a9d84	strb w8,[x0]
009a9d88	mov x0,x26
009a9d8c	tbz w27,#0x3,0x009a9e4c
009a9d90	mov w1,wzr
009a9d94	mov x2,x20
009a9d98	bl 0x00c301c0
009a9d9c	b 0x009a9e58
009a9da0	ldr x8,[x19, #0x8]
009a9da4	ldr x9,[x19, #0x918]
009a9da8	mov x0,x19
009a9dac	mov x2,x21
009a9db0	ldr x8,[x8, #0xc0]
009a9db4	add x1,x9,#0x50
009a9db8	add x4,x9,#0x8
009a9dbc	mov x3,x20
009a9dc0	ldr x8,[x8, #0x18]
009a9dc4	blr x8
009a9dc8	cbz w0,0x009a9dfc
009a9dcc	mov w23,#0x1
009a9dd0	cbnz x21,0x009a9e04
009a9dd4	ldr w8,[x19, #0x38]
009a9dd8	cbz w8,0x009a9e28
009a9ddc	mov w0,w23
009a9de0	ldp x29,x30,[sp, #0x50]
009a9de4	ldp x20,x19,[sp, #0x40]
009a9de8	ldp x22,x21,[sp, #0x30]
009a9dec	ldp x24,x23,[sp, #0x20]
009a9df0	ldp x26,x25,[sp, #0x10]
009a9df4	ldr x27,[sp], #0x60
009a9df8	ret
009a9dfc	mov w23,wzr
009a9e00	cbz x21,0x009a9dd4
009a9e04	cbz w22,0x009a9e34
009a9e08	adrp x2,0x2a3000
009a9e0c	add x2,x2,#0xa43
009a9e10	mov w3,#0x1234
009a9e14	mov x0,x21
009a9e18	mov x1,x20
009a9e1c	bl 0x00c345e0
009a9e20	ldr w8,[x19, #0x38]
009a9e24	cbnz w8,0x009a9ddc
009a9e28	str xzr,[x19, #0x368]
009a9e2c	str xzr,[x19, #0x360]
009a9e30	b 0x009a9ddc
009a9e34	mov x0,x21
009a9e38	mov x1,x20
009a9e3c	bl 0x00c34750
009a9e40	ldr w8,[x19, #0x38]
009a9e44	cbnz w8,0x009a9ddc
009a9e48	b 0x009a9e28
009a9e4c	mov x1,x21
009a9e50	mov x2,x20
009a9e54	bl 0x00c2ffd0
009a9e58	add x8,x26,x20
009a9e5c	lsr x9,x25,#0x8
009a9e60	strb w9,[x8]
009a9e64	strb w25,[x8, #0x1]
009a9e68	ldr x1,[x19, #0x370]
009a9e6c	add x0,x8,#0x2
009a9e70	mov x2,x25
009a9e74	bl 0x00c2ffd0
009a9e78	ldr x0,[x19, #0x370]
009a9e7c	adrp x2,0x2a3000
009a9e80	add x2,x2,#0xa43
009a9e84	mov w3,#0x1218
009a9e88	mov x1,x25
009a9e8c	bl 0x00c345e0
009a9e90	ldr x8,[x19, #0x8]
009a9e94	str xzr,[x19, #0x378]
009a9e98	str xzr,[x19, #0x370]
009a9e9c	ldr x9,[x19, #0x918]
009a9ea0	ldr x8,[x8, #0xc0]
009a9ea4	mov x0,x19
009a9ea8	mov x2,x24
009a9eac	add x1,x9,#0x50
009a9eb0	ldr x8,[x8, #0x18]
009a9eb4	add x4,x9,#0x8
009a9eb8	mov x3,x23
009a9ebc	blr x8
009a9ec0	adrp x2,0x2a3000
009a9ec4	add x2,x2,#0xa43
009a9ec8	cbz w0,0x009a9ee8
009a9ecc	mov w3,#0x1222
009a9ed0	mov x0,x24
009a9ed4	mov x1,x23
009a9ed8	bl 0x00c345e0
009a9edc	mov w23,#0x1
009a9ee0	cbnz x21,0x009a9e04
009a9ee4	b 0x009a9dd4
009a9ee8	mov w3,#0x121e
009a9eec	mov x0,x24
009a9ef0	mov x1,x23
009a9ef4	bl 0x00c345e0
009a9ef8	mov w23,wzr
009a9efc	cbnz x21,0x009a9e04
009a9f00	b 0x009a9dd4
