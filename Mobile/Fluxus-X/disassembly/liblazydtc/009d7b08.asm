; tls_parse_ctos_cookie @ 009d7b08
009d7b08	str x28,[sp, #-0x60]!
009d7b0c	stp x26,x25,[sp, #0x10]
009d7b10	stp x24,x23,[sp, #0x20]
009d7b14	stp x22,x21,[sp, #0x30]
009d7b18	stp x20,x19,[sp, #0x40]
009d7b1c	stp x29,x30,[sp, #0x50]
009d7b20	add x29,sp,#0x50
009d7b24	sub sp,sp,#0x1, LSL #12
009d7b28	sub sp,sp,#0x140
009d7b2c	ldr x8,[x0, #0x9a8]
009d7b30	ldr x8,[x8, #0xe8]
009d7b34	cbz x8,0x009d7b44
009d7b38	ldrb w8,[x0, #0xa9]
009d7b3c	mov x19,x0
009d7b40	tbnz w8,#0x3,0x009d7b4c
009d7b44	mov w0,#0x1
009d7b48	b 0x009d7bd4
009d7b4c	ldr x8,[x1, #0x8]
009d7b50	subs x8,x8,#0x2
009d7b54	b.cc 0x009d7ba0
009d7b58	ldr x25,[x1]
009d7b5c	ldrb w9,[x25]
009d7b60	ldrb w20,[x25, #0x1]
009d7b64	bfm x20,x9,#0x38,#0x7
009d7b68	cmp x8,x20
009d7b6c	b.ne 0x009d7ba0
009d7b70	add x21,x25,#0x2
009d7b74	subs x23,x20,#0x20
009d7b78	add x8,x21,x20
009d7b7c	stp x8,xzr,[x1]
009d7b80	b.cs 0x009d7bf8
009d7b84	bl 0x00c342a0
009d7b88	adrp x0,0x2d7000
009d7b8c	adrp x2,0x2d5000
009d7b90	add x0,x0,#0xae0
009d7b94	add x2,x2,#0x996
009d7b98	mov w1,#0x2cd
009d7b9c	b 0x009d7bb8
009d7ba0	bl 0x00c342a0
009d7ba4	adrp x0,0x2d7000
009d7ba8	adrp x2,0x2d5000
009d7bac	add x0,x0,#0xae0
009d7bb0	add x2,x2,#0x996
009d7bb4	mov w1,#0x2c4
009d7bb8	bl 0x00c342b0
009d7bbc	mov w1,#0x32
009d7bc0	mov w2,#0x9f
009d7bc4	mov x0,x19
009d7bc8	mov x3,xzr
009d7bcc	bl 0x00c34410
009d7bd0	mov w0,wzr
009d7bd4	add sp,sp,#0x1, LSL #12
009d7bd8	add sp,sp,#0x140
009d7bdc	ldp x29,x30,[sp, #0x50]
009d7be0	ldp x20,x19,[sp, #0x40]
009d7be4	ldp x22,x21,[sp, #0x30]
009d7be8	ldp x24,x23,[sp, #0x20]
009d7bec	ldp x26,x25,[sp, #0x10]
009d7bf0	ldr x28,[sp], #0x60
009d7bf4	ret
009d7bf8	bl 0x00c31fa0
009d7bfc	ldr x8,[x19, #0x9a8]
009d7c00	ldr x9,[x19, #0xb88]
009d7c04	mov x22,x0
009d7c08	adrp x1,0x2c3000
009d7c0c	ldr x0,[x8]
009d7c10	ldr x2,[x8, #0x440]
009d7c14	add x3,x9,#0x2d8
009d7c18	add x1,x1,#0x5d3
009d7c1c	mov w4,#0x20
009d7c20	bl 0x00c36250
009d7c24	mov x24,x0
009d7c28	cbz x22,0x009d7ce4
009d7c2c	cbz x24,0x009d7ce4
009d7c30	mov w8,#0x20
009d7c34	stur x8,[x29, #-0x48]
009d7c38	ldr x8,[x19, #0x9a8]
009d7c3c	adrp x2,0x2a9000
009d7c40	add x2,x2,#0xb18
009d7c44	mov x0,x22
009d7c48	ldr x3,[x8]
009d7c4c	ldr x4,[x8, #0x440]
009d7c50	mov x1,xzr
009d7c54	mov x5,x24
009d7c58	mov x6,xzr
009d7c5c	bl 0x00c361d0
009d7c60	cmp w0,#0x1
009d7c64	b.lt 0x009d7d24
009d7c68	sub x1,x29,#0xa8
009d7c6c	sub x2,x29,#0x48
009d7c70	mov x0,x22
009d7c74	mov x3,x21
009d7c78	mov x4,x23
009d7c7c	bl 0x00c36fb0
009d7c80	cmp w0,#0x1
009d7c84	b.lt 0x009d7d24
009d7c88	ldur x8,[x29, #-0x48]
009d7c8c	cmp x8,#0x20
009d7c90	b.ne 0x009d7d24
009d7c94	mov x0,x22
009d7c98	add x23,x21,x23
009d7c9c	bl 0x00c31f90
009d7ca0	mov x0,x24
009d7ca4	bl 0x00c32450
009d7ca8	sub x0,x29,#0xa8
009d7cac	mov w2,#0x20
009d7cb0	mov x1,x23
009d7cb4	bl 0x00c362f0
009d7cb8	cbz w0,0x009d7d60
009d7cbc	bl 0x00c342a0
009d7cc0	adrp x0,0x2d7000
009d7cc4	adrp x2,0x2d5000
009d7cc8	add x0,x0,#0xae0
009d7ccc	add x2,x2,#0x996
009d7cd0	mov w1,#0x2ef
009d7cd4	bl 0x00c342b0
009d7cd8	mov w1,#0x2f
009d7cdc	mov w2,#0x134
009d7ce0	b 0x009d7bc4
009d7ce4	mov x0,x22
009d7ce8	bl 0x00c31f90
009d7cec	mov x0,x24
009d7cf0	bl 0x00c32450
009d7cf4	bl 0x00c342a0
009d7cf8	adrp x0,0x2d7000
009d7cfc	adrp x2,0x2d5000
009d7d00	add x0,x0,#0xae0
009d7d04	add x2,x2,#0x996
009d7d08	mov w1,#0x2db
009d7d0c	bl 0x00c342b0
009d7d10	mov w8,#0x103
009d7d14	movk w8,#0xc, LSL #16
009d7d18	sub w2,w8,#0x3
009d7d1c	mov w1,#0x50
009d7d20	b 0x009d7bc4
009d7d24	mov x0,x22
009d7d28	bl 0x00c31f90
009d7d2c	mov x0,x24
009d7d30	bl 0x00c32450
009d7d34	bl 0x00c342a0
009d7d38	adrp x0,0x2d7000
009d7d3c	adrp x2,0x2d5000
009d7d40	add x0,x0,#0xae0
009d7d44	add x2,x2,#0x996
009d7d48	mov w1,#0x2e7
009d7d4c	bl 0x00c342b0
009d7d50	mov w2,#0x103
009d7d54	mov w1,#0x50
009d7d58	movk w2,#0xc, LSL #16
009d7d5c	b 0x009d7bc4
009d7d60	ldrb w8,[x25, #0x2]
009d7d64	ldrb w9,[x25, #0x3]
009d7d68	bfm w9,w8,#0x18,#0x7
009d7d6c	cmp w9,#0x1
009d7d70	b.ne 0x009d7b44
009d7d74	ldrb w8,[x25, #0x4]
009d7d78	ldrb w9,[x25, #0x5]
009d7d7c	bfm w9,w8,#0x18,#0x7
009d7d80	cmp w9,#0x304
009d7d84	b.ne 0x009d7de4
009d7d88	ldrb w8,[x25, #0x6]
009d7d8c	ldrb w9,[x25, #0x7]
009d7d90	ldrh w10,[x19, #0x4ae]
009d7d94	bfm w9,w8,#0x18,#0x7
009d7d98	cmp w9,w10
009d7d9c	b.ne 0x009d7dbc
009d7da0	ldr x22,[x19, #0x2e0]
009d7da4	add x1,x25,#0x8
009d7da8	mov x0,x19
009d7dac	mov w2,wzr
009d7db0	bl 0x00c35420
009d7db4	cmp x22,x0
009d7db8	b.eq 0x009d7e0c
009d7dbc	bl 0x00c342a0
009d7dc0	adrp x0,0x2d7000
009d7dc4	adrp x2,0x2d5000
009d7dc8	add x0,x0,#0xae0
009d7dcc	add x2,x2,#0x996
009d7dd0	mov w1,#0x31c
009d7dd4	bl 0x00c342b0
009d7dd8	mov w1,#0x2f
009d7ddc	mov w2,#0xba
009d7de0	b 0x009d7bc4
009d7de4	bl 0x00c342a0
009d7de8	adrp x0,0x2d7000
009d7dec	adrp x2,0x2d5000
009d7df0	add x0,x0,#0xae0
009d7df4	add x2,x2,#0x996
009d7df8	mov w1,#0x307
009d7dfc	bl 0x00c342b0
009d7e00	mov w1,#0x2f
009d7e04	mov w2,#0x74
009d7e08	b 0x009d7bc4
009d7e0c	ldrb w9,[x25, #0x13]
009d7e10	ldrb w8,[x25, #0x14]
009d7e14	bfm x8,x9,#0x38,#0x7
009d7e18	sub x9,x20,#0x13
009d7e1c	subs x9,x9,x8
009d7e20	b.cc 0x009d8084
009d7e24	b.eq 0x009d8084
009d7e28	add x22,x25,#0x15
009d7e2c	add x26,x22,x8
009d7e30	ldrb w23,[x26]
009d7e34	sub x9,x9,#0x1
009d7e38	subs x9,x9,x23
009d7e3c	b.cc 0x009d8084
009d7e40	cmp x9,#0x20
009d7e44	b.ne 0x009d8084
009d7e48	str x8,[sp]
009d7e4c	ldur x8,[x25, #0xb]
009d7e50	ldrb w24,[x25, #0xa]
009d7e54	mov x0,xzr
009d7e58	rev x25,x8
009d7e5c	bl 0x00c30970
009d7e60	subs x8,x0,x25
009d7e64	mov w0,#0x1
009d7e68	b.cc 0x009d7bd4
009d7e6c	cmp x8,#0x258
009d7e70	b.hi 0x009d7bd4
009d7e74	ldr x8,[x19, #0x9a8]
009d7e78	add x1,x26,#0x1
009d7e7c	mov x0,x19
009d7e80	mov x2,x23
009d7e84	ldr x8,[x8, #0xe8]
009d7e88	blr x8
009d7e8c	cbz w0,0x009d80c4
009d7e90	sub x0,x29,#0x88
009d7e94	add x1,sp,#0x1c
009d7e98	mov w2,#0x10cc
009d7e9c	mov x3,xzr
009d7ea0	bl 0x00c34380
009d7ea4	cbz w0,0x009d80e0
009d7ea8	sub x0,x29,#0x88
009d7eac	mov w1,#0x2
009d7eb0	mov w2,#0x1
009d7eb4	bl 0x00c343a0
009d7eb8	cbz w0,0x009d80a0
009d7ebc	sub x0,x29,#0x88
009d7ec0	orr w1,wzr,#0x3
009d7ec4	bl 0x00c343b0
009d7ec8	cbz w0,0x009d80a0
009d7ecc	sub x0,x29,#0x88
009d7ed0	mov w1,#0x303
009d7ed4	mov w2,#0x2
009d7ed8	bl 0x00c343a0
009d7edc	cbz w0,0x009d80a0
009d7ee0	adrp x1,0xcb5000
009d7ee4	ldr x1,[x1, #0x1e0]
009d7ee8	sub x0,x29,#0x88
009d7eec	mov w2,#0x20
009d7ef0	bl 0x00c34390
009d7ef4	cbz w0,0x009d80a0
009d7ef8	ldr x2,[x19, #0x960]
009d7efc	add x1,x19,#0x940
009d7f00	sub x0,x29,#0x88
009d7f04	mov w3,#0x1
009d7f08	bl 0x00c36f70
009d7f0c	cbz w0,0x009d80a0
009d7f10	ldr x8,[x19, #0x8]
009d7f14	ldr x0,[x19, #0x2e0]
009d7f18	sub x1,x29,#0x88
009d7f1c	add x2,sp,#0x8
009d7f20	ldr x8,[x8, #0x98]
009d7f24	blr x8
009d7f28	cbz w0,0x009d80a0
009d7f2c	sub x0,x29,#0x88
009d7f30	mov w2,#0x1
009d7f34	mov x1,xzr
009d7f38	bl 0x00c343a0
009d7f3c	cbz w0,0x009d80a0
009d7f40	sub x0,x29,#0x88
009d7f44	mov w1,#0x2
009d7f48	bl 0x00c343b0
009d7f4c	cbz w0,0x009d80a0
009d7f50	sub x0,x29,#0x88
009d7f54	mov w1,#0x2b
009d7f58	mov w2,#0x2
009d7f5c	bl 0x00c343a0
009d7f60	cbz w0,0x009d80fc
009d7f64	sub x0,x29,#0x88
009d7f68	mov w1,#0x2
009d7f6c	bl 0x00c343b0
009d7f70	cbz w0,0x009d80fc
009d7f74	ldrsw x1,[x19]
009d7f78	sub x0,x29,#0x88
009d7f7c	mov w2,#0x2
009d7f80	bl 0x00c343a0
009d7f84	cbz w0,0x009d80fc
009d7f88	sub x0,x29,#0x88
009d7f8c	bl 0x00c34350
009d7f90	cbz w0,0x009d80fc
009d7f94	cbz w24,0x009d7fdc
009d7f98	sub x0,x29,#0x88
009d7f9c	mov w1,#0x33
009d7fa0	mov w2,#0x2
009d7fa4	bl 0x00c343a0
009d7fa8	cbz w0,0x009d8120
009d7fac	sub x0,x29,#0x88
009d7fb0	mov w1,#0x2
009d7fb4	bl 0x00c343b0
009d7fb8	cbz w0,0x009d8120
009d7fbc	ldrh w1,[x19, #0x4ae]
009d7fc0	sub x0,x29,#0x88
009d7fc4	mov w2,#0x2
009d7fc8	bl 0x00c343a0
009d7fcc	cbz w0,0x009d8120
009d7fd0	sub x0,x29,#0x88
009d7fd4	bl 0x00c34350
009d7fd8	cbz w0,0x009d8120
009d7fdc	sub x0,x29,#0x88
009d7fe0	mov w1,#0x2c
009d7fe4	mov w2,#0x2
009d7fe8	bl 0x00c343a0
009d7fec	cbz w0,0x009d8144
009d7ff0	sub x0,x29,#0x88
009d7ff4	mov w1,#0x2
009d7ff8	bl 0x00c343b0
009d7ffc	cbz w0,0x009d8144
009d8000	sub x0,x29,#0x88
009d8004	mov w3,#0x2
009d8008	mov x1,x21
009d800c	mov x2,x20
009d8010	bl 0x00c36f70
009d8014	cbz w0,0x009d8144
009d8018	sub x0,x29,#0x88
009d801c	bl 0x00c34350
009d8020	cbz w0,0x009d8144
009d8024	sub x0,x29,#0x88
009d8028	bl 0x00c34350
009d802c	cbz w0,0x009d8144
009d8030	sub x0,x29,#0x88
009d8034	bl 0x00c34350
009d8038	cbz w0,0x009d8144
009d803c	sub x0,x29,#0x88
009d8040	add x1,sp,#0x10
009d8044	bl 0x00c34370
009d8048	cbz w0,0x009d8144
009d804c	sub x0,x29,#0x88
009d8050	bl 0x00c34360
009d8054	cbz w0,0x009d8144
009d8058	ldr x4,[sp, #0x10]
009d805c	ldr x2,[sp]
009d8060	add x3,sp,#0x1c
009d8064	mov x0,x19
009d8068	mov x1,x22
009d806c	bl 0x00c36fc0
009d8070	cbz w0,0x009d7bd4
009d8074	mov w0,#0x1
009d8078	str w0,[x19, #0x8e8]
009d807c	str w0,[x19, #0xb48]
009d8080	b 0x009d7bd4
009d8084	bl 0x00c342a0
009d8088	adrp x0,0x2d7000
009d808c	adrp x2,0x2d5000
009d8090	add x0,x0,#0xae0
009d8094	add x2,x2,#0x996
009d8098	mov w1,#0x325
009d809c	b 0x009d7bb8
009d80a0	sub x0,x29,#0x88
009d80a4	bl 0x00c34340
009d80a8	bl 0x00c342a0
009d80ac	adrp x0,0x2d7000
009d80b0	adrp x2,0x2d5000
009d80b4	add x0,x0,#0xae0
009d80b8	add x2,x2,#0x996
009d80bc	mov w1,#0x34b
009d80c0	b 0x009d7d4c
009d80c4	bl 0x00c342a0
009d80c8	adrp x0,0x2d7000
009d80cc	adrp x2,0x2d5000
009d80d0	add x0,x0,#0xae0
009d80d4	add x2,x2,#0x996
009d80d8	mov w1,#0x333
009d80dc	b 0x009d7cd4
009d80e0	bl 0x00c342a0
009d80e4	adrp x0,0x2d7000
009d80e8	adrp x2,0x2d5000
009d80ec	add x0,x0,#0xae0
009d80f0	add x2,x2,#0x996
009d80f4	mov w1,#0x33d
009d80f8	b 0x009d7d4c
009d80fc	sub x0,x29,#0x88
009d8100	bl 0x00c34340
009d8104	bl 0x00c342a0
009d8108	adrp x0,0x2d7000
009d810c	adrp x2,0x2d5000
009d8110	add x0,x0,#0xae0
009d8114	add x2,x2,#0x996
009d8118	mov w1,#0x353
009d811c	b 0x009d7d4c
009d8120	sub x0,x29,#0x88
009d8124	bl 0x00c34340
009d8128	bl 0x00c342a0
009d812c	adrp x0,0x2d7000
009d8130	adrp x2,0x2d5000
009d8134	add x0,x0,#0xae0
009d8138	add x2,x2,#0x996
009d813c	mov w1,#0x35c
009d8140	b 0x009d7d4c
009d8144	sub x0,x29,#0x88
009d8148	bl 0x00c34340
009d814c	bl 0x00c342a0
009d8150	adrp x0,0x2d7000
009d8154	adrp x2,0x2d5000
009d8158	add x0,x0,#0xae0
009d815c	add x2,x2,#0x996
009d8160	mov w1,#0x369
009d8164	b 0x009d7d4c
