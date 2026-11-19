; LZ4_compress_forceExtDict @ 008d59b0
008d59b0	sub sp,sp,#0x120
008d59b4	stp x29,x30,[sp, #0xc0]
008d59b8	stp x28,x27,[sp, #0xd0]
008d59bc	stp x26,x25,[sp, #0xe0]
008d59c0	stp x24,x23,[sp, #0xf0]
008d59c4	stp x22,x21,[sp, #0x100]
008d59c8	stp x20,x19,[sp, #0x110]
008d59cc	add x29,sp,#0xc0
008d59d0	add x23,x0,#0x4, LSL #12
008d59d4	mov w9,#0x80000000
008d59d8	stur x0,[x29, #-0x10]
008d59dc	ldr w4,[x23, #0x10]
008d59e0	add w8,w4,w3
008d59e4	cmp w8,w9
008d59e8	b.ls 0x008d5a4c
008d59ec	sub w8,w4,#0x10, LSL #12
008d59f0	ldur x10,[x29, #-0x10]
008d59f4	ldr w9,[x23, #0x18]
008d59f8	dup v0.4S,w8
008d59fc	mov w11,#0x1000
008d5a00	ldr x8,[x10, #0x4000]
008d5a04	add x10,x10,#0x10
008d5a08	ldp q1,q2,[x10, #-0x10]
008d5a0c	subs x11,x11,#0x8
008d5a10	uqsub v1.4S,v1.4S,v0.4S
008d5a14	uqsub v2.4S,v2.4S,v0.4S
008d5a18	stp q1,q2,[x10, #-0x10]
008d5a1c	add x10,x10,#0x20
008d5a20	b.ne 0x008d5a08
008d5a24	ldr w10,[x23, #0x18]
008d5a28	mov w4,#0x10000
008d5a2c	add x9,x8,x9
008d5a30	str w4,[x23, #0x10]
008d5a34	cmp w10,#0x10, LSL #12
008d5a38	csel w8,w10,w4,cc
008d5a3c	ldur x10,[x29, #-0x10]
008d5a40	sub x9,x9,x8
008d5a44	str x9,[x10, #0x4000]
008d5a48	b 0x008d5a50
008d5a4c	ldr w8,[x23, #0x18]
008d5a50	lsr w9,w8,#0x10
008d5a54	stur x1,[x29, #-0x18]
008d5a58	cbnz w9,0x008d5b44
008d5a5c	subs w5,w4,w8
008d5a60	b.ls 0x008d5b44
008d5a64	mov w9,#0x7e000000
008d5a68	cmp w3,w9
008d5a6c	b.hi 0x008d5b50
008d5a70	cbz w3,0x008d5c28
008d5a74	ldur x9,[x29, #-0x10]
008d5a78	mov w10,w4
008d5a7c	mov w13,w3
008d5a80	add w11,w4,w3
008d5a84	str x13,[sp, #0x50]
008d5a88	add x13,x1,x13
008d5a8c	ldr x6,[x9, #0x4000]
008d5a90	mov x24,x2
008d5a94	mov x30,x1
008d5a98	stp x13,x23,[x29, #-0x58]
008d5a9c	add x9,x6,w8, UXTW 
008d5aa0	add w8,w8,w3
008d5aa4	cmp x6,#0x0
008d5aa8	str w8,[x23, #0x18]
008d5aac	mov w8,#0x2
008d5ab0	sub x12,x9,x10
008d5ab4	stur w3,[x29, #-0x44]
008d5ab8	csel x26,xzr,x12,eq
008d5abc	cmp w3,#0xd
008d5ac0	stp w11,w8,[x23, #0x10]
008d5ac4	b.cc 0x008d6aa4
008d5ac8	mov x11,x1
008d5acc	mov x25,#0xbb000000
008d5ad0	sub x27,x1,x10
008d5ad4	ldr x8,[x11], #0x8
008d5ad8	movk x25,#0xbcdc, LSL #32
008d5adc	movk x25,#0xcf1b, LSL #48
008d5ae0	str x11,[sp, #0x60]
008d5ae4	ldur x10,[x29, #-0x58]
008d5ae8	mul x11,x8,x25
008d5aec	cmp x6,#0x0
008d5af0	add x23,x1,#0x1
008d5af4	sub x20,x10,#0xb
008d5af8	sub x8,x10,#0x5
008d5afc	sub x3,x10,#0xc
008d5b00	sub x12,x10,#0x8
008d5b04	sub x10,x10,#0x6
008d5b08	csel x9,xzr,x9,eq
008d5b0c	stp x10,x12,[sp, #0x8]
008d5b10	add w19,w4,#0x1
008d5b14	mov w7,#0xffff
008d5b18	stp x2,x9,[x29, #-0x30]
008d5b1c	ldur x9,[x29, #-0x10]
008d5b20	mov x30,x1
008d5b24	lsr x10,x11,#0x32
008d5b28	stur x8,[x29, #-0x20]
008d5b2c	add x8,x1,#0x2
008d5b30	mov x24,x2
008d5b34	stp x27,x20,[x29, #-0x40]
008d5b38	and x10,x10,#0x3ffc
008d5b3c	str w4,[x9, x10#0x0]
008d5b40	b 0x008d5c4c
008d5b44	mov w9,#0x7e000000
008d5b48	cmp w3,w9
008d5b4c	b.ls 0x008d5b58
008d5b50	mov w0,wzr
008d5b54	b 0x008d6b54
008d5b58	cbz w3,0x008d5c28
008d5b5c	ldur x9,[x29, #-0x10]
008d5b60	mov w10,w4
008d5b64	mov w13,w3
008d5b68	add w11,w4,w3
008d5b6c	str x13,[sp, #0x50]
008d5b70	add x13,x1,x13
008d5b74	ldr x5,[x9, #0x4000]
008d5b78	stur w3,[x29, #-0x44]
008d5b7c	mov x28,x2
008d5b80	stp x13,x23,[x29, #-0x58]
008d5b84	add x9,x5,w8, UXTW 
008d5b88	add w8,w8,w3
008d5b8c	cmp x5,#0x0
008d5b90	str w8,[x23, #0x18]
008d5b94	mov w8,#0x2
008d5b98	sub x12,x9,x10
008d5b9c	stp w11,w8,[x23, #0x10]
008d5ba0	csel x6,xzr,x12,eq
008d5ba4	cmp w3,#0xd
008d5ba8	mov x3,x1
008d5bac	stur x2,[x29, #-0x30]
008d5bb0	b.cs 0x008d6320
008d5bb4	ldur x8,[x29, #-0x58]
008d5bb8	sub x24,x8,x3
008d5bbc	subs x8,x24,#0xf
008d5bc0	b.cc 0x008d6a68
008d5bc4	mov w9,#0xf0
008d5bc8	mov x0,x28
008d5bcc	cmp x8,#0xff
008d5bd0	strb w9,[x0], #0x1
008d5bd4	b.cc 0x008d5c1c
008d5bd8	ldr x8,[sp, #0x50]
008d5bdc	mov x20,x3
008d5be0	add x8,x1,x8
008d5be4	mov w1,#0xff
008d5be8	sub x8,x8,x3
008d5bec	sub x19,x8,#0x10e
008d5bf0	orr x8,xzr,#-0x7f7f7f7f7f7f7f80
008d5bf4	movk x8,#0x8081
008d5bf8	umulh x8,x19,x8
008d5bfc	lsr x21,x8,#0x7
008d5c00	add x2,x21,#0x1
008d5c04	bl 0x00c301c0
008d5c08	sub x8,x21,x21, LSL #0x8
008d5c0c	add x9,x28,x21
008d5c10	mov x3,x20
008d5c14	add x0,x9,#0x2
008d5c18	add x8,x8,x19
008d5c1c	strb w8,[x0]
008d5c20	mov x28,x0
008d5c24	b 0x008d6a70
008d5c28	strb wzr,[x2]
008d5c2c	mov w0,#0x1
008d5c30	b 0x008d6b54
008d5c34	add x8,x30,#0x2
008d5c38	add x23,x30,#0x1
008d5c3c	ldur x2,[x29, #-0x30]
008d5c40	cmp x8,x20
008d5c44	sub w19,w23,w27
008d5c48	b.hi 0x008d6aa4
008d5c4c	ldur x11,[x30, #0x1]
008d5c50	mov w9,#0x1
008d5c54	mov w10,#0x41
008d5c58	b 0x008d5c78
008d5c5c	add x8,x12,x9
008d5c60	lsr x9,x10,#0x6
008d5c64	add x10,x10,#0x1
008d5c68	cmp x8,x20
008d5c6c	sub w19,w12,w27
008d5c70	mov x23,x12
008d5c74	b.hi 0x008d6aa4
008d5c78	mul x11,x11,x25
008d5c7c	ldur x14,[x29, #-0x10]
008d5c80	mov x12,x8
008d5c84	lsr x11,x11,#0x32
008d5c88	and x13,x11,#0x3ffc
008d5c8c	ldr x11,[x12]
008d5c90	ldr w21,[x14, x13#0x0]
008d5c94	str w19,[x14, x13#0x0]
008d5c98	add w8,w21,w7
008d5c9c	cmp w21,w5
008d5ca0	ccmp w8,w19,#0x0,cs
008d5ca4	b.cc 0x008d5c5c
008d5ca8	cmp w21,w4
008d5cac	ldr w14,[x23]
008d5cb0	csel x8,x26,x27,cc
008d5cb4	ldr w13,[x8, x21#0x0]
008d5cb8	cmp w13,w14
008d5cbc	b.ne 0x008d5c5c
008d5cc0	cmp w21,w4
008d5cc4	add x22,x8,x21
008d5cc8	csel x28,x6,x1,cc
008d5ccc	cmp x22,x28
008d5cd0	b.ls 0x008d5ce4
008d5cd4	ldurb w9,[x23, #-0x1]
008d5cd8	ldurb w10,[x22, #-0x1]
008d5cdc	cmp w9,w10
008d5ce0	b.eq 0x008d62e0
008d5ce4	sub x10,x23,x30
008d5ce8	add x0,x24,#0x1
008d5cec	subs w8,w10,#0xf
008d5cf0	b.cc 0x008d5d78
008d5cf4	cmp w8,#0xff
008d5cf8	mov w9,#0xf0
008d5cfc	strb w9,[x24]
008d5d00	b.cc 0x008d5d70
008d5d04	sub w8,w23,w30
008d5d08	mov w1,#0xff
008d5d0c	str w4,[sp, #0x5c]
008d5d10	sub w9,w8,#0x10e
008d5d14	mov w8,#0x8081
008d5d18	str w5,[sp, #0x48]
008d5d1c	movk w8,#0x8080, LSL #16
008d5d20	str w9,[sp, #0x20]
008d5d24	umull x8,w9,w8
008d5d28	stp x3,x6,[sp, #0x38]
008d5d2c	stp x10,x30,[sp, #0x28]
008d5d30	lsr x8,x8,#0x27
008d5d34	add x2,x8,#0x1
008d5d38	str x8,[sp, #0x18]
008d5d3c	bl 0x00c301c0
008d5d40	ldr x9,[sp, #0x18]
008d5d44	ldp x10,x30,[sp, #0x28]
008d5d48	ldp x3,x6,[sp, #0x38]
008d5d4c	mov w7,#0xffff
008d5d50	sub w8,w9,w9, LSL #0x8
008d5d54	ldr w11,[sp, #0x20]
008d5d58	add x9,x24,x9
008d5d5c	ldr w5,[sp, #0x48]
008d5d60	ldr w4,[sp, #0x5c]
008d5d64	add x0,x9,#0x2
008d5d68	ldur x1,[x29, #-0x18]
008d5d6c	add w8,w11,w8
008d5d70	strb w8,[x0], #0x1
008d5d74	b 0x008d5d80
008d5d78	lsl w8,w10,#0x4
008d5d7c	strb w8,[x24]
008d5d80	mov w8,w10
008d5d84	mov w9,#0x8
008d5d88	cmp x8,#0x8
008d5d8c	csel x9,x8,x9,hi
008d5d90	cmp x8,#0x19
008d5d94	add x8,x0,x8
008d5d98	b.cc 0x008d5df4
008d5d9c	sub x10,x0,x30
008d5da0	cmp x10,#0x20
008d5da4	b.cc 0x008d5df4
008d5da8	sub x9,x9,#0x1
008d5dac	add x13,x0,#0x10
008d5db0	add x14,x30,#0x10
008d5db4	lsr x9,x9,#0x3
008d5db8	add x11,x9,#0x1
008d5dbc	and x12,x11,#0x3ffffffffffffffc
008d5dc0	lsl x10,x12,#0x3
008d5dc4	mov x15,x12
008d5dc8	add x9,x30,x10
008d5dcc	add x10,x0,x10
008d5dd0	ldp q0,q1,[x14, #-0x10]
008d5dd4	subs x15,x15,#0x4
008d5dd8	add x14,x14,#0x20
008d5ddc	stp q0,q1,[x13, #-0x10]
008d5de0	add x13,x13,#0x20
008d5de4	b.ne 0x008d5dd0
008d5de8	cmp x11,x12
008d5dec	b.ne 0x008d5dfc
008d5df0	b 0x008d5e0c
008d5df4	mov x9,x30
008d5df8	mov x10,x0
008d5dfc	ldr x11,[x9], #0x8
008d5e00	str x11,[x10], #0x8
008d5e04	cmp x10,x8
008d5e08	b.cc 0x008d5dfc
008d5e0c	sub w10,w19,w21
008d5e10	mov x9,x24
008d5e14	mov x30,x23
008d5e18	mov x24,x8
008d5e1c	cmp x28,x6
008d5e20	strh w10,[x24], #0x2
008d5e24	b.eq 0x008d5efc
008d5e28	add x10,x30,#0x4
008d5e2c	add x12,x22,#0x4
008d5e30	cmp x10,x3
008d5e34	b.cs 0x008d62c0
008d5e38	ldr x11,[x12]
008d5e3c	ldr x12,[x10]
008d5e40	cmp x11,x12
008d5e44	b.ne 0x008d5fdc
008d5e48	add x11,x30,#0xc
008d5e4c	add x12,x22,#0xc
008d5e50	cmp x11,x3
008d5e54	b.cs 0x008d5e84
008d5e58	sub w13,w11,w30
008d5e5c	sub w13,w13,#0x4
008d5e60	ldr x14,[x12]
008d5e64	ldr x15,[x11]
008d5e68	cmp x14,x15
008d5e6c	b.ne 0x008d5ff0
008d5e70	add x11,x11,#0x8
008d5e74	add x12,x12,#0x8
008d5e78	add w13,w13,#0x8
008d5e7c	cmp x11,x3
008d5e80	b.cc 0x008d5e60
008d5e84	ldr x13,[sp, #0x10]
008d5e88	cmp x11,x13
008d5e8c	b.cs 0x008d5eac
008d5e90	ldr w13,[x12]
008d5e94	ldr w14,[x11]
008d5e98	cmp w13,w14
008d5e9c	add x13,x11,#0x4
008d5ea0	add x14,x12,#0x4
008d5ea4	csel x12,x12,x14,ne
008d5ea8	csel x11,x11,x13,ne
008d5eac	ldr x13,[sp, #0x8]
008d5eb0	cmp x11,x13
008d5eb4	b.cs 0x008d5ed4
008d5eb8	ldrh w13,[x12]
008d5ebc	ldrh w14,[x11]
008d5ec0	cmp w13,w14
008d5ec4	add x13,x11,#0x2
008d5ec8	add x14,x12,#0x2
008d5ecc	csel x12,x12,x14,ne
008d5ed0	csel x11,x11,x13,ne
008d5ed4	ldur x13,[x29, #-0x20]
008d5ed8	cmp x11,x13
008d5edc	b.cs 0x008d5ef4
008d5ee0	mov x13,x11
008d5ee4	ldrb w12,[x12]
008d5ee8	ldrb w14,[x13], #0x1
008d5eec	cmp w12,w14
008d5ef0	csel x11,x11,x13,ne
008d5ef4	sub w11,w11,w10
008d5ef8	b 0x008d6004
008d5efc	ldp x10,x11,[x29, #-0x28]
008d5f00	add x13,x22,#0x4
008d5f04	sub x10,x10,x22
008d5f08	add x10,x30,x10
008d5f0c	cmp x10,x11
008d5f10	csel x10,x11,x10,hi
008d5f14	add x11,x30,#0x4
008d5f18	sub x14,x10,#0x7
008d5f1c	cmp x11,x14
008d5f20	b.cs 0x008d62d0
008d5f24	ldr x12,[x13]
008d5f28	ldr x13,[x11]
008d5f2c	cmp x12,x13
008d5f30	b.ne 0x008d6010
008d5f34	add x12,x30,#0xc
008d5f38	add x13,x22,#0xc
008d5f3c	cmp x12,x14
008d5f40	b.cs 0x008d5f70
008d5f44	sub w15,w12,w30
008d5f48	sub w15,w15,#0x4
008d5f4c	ldr x16,[x13]
008d5f50	ldr x17,[x12]
008d5f54	cmp x16,x17
008d5f58	b.ne 0x008d6024
008d5f5c	add x12,x12,#0x8
008d5f60	add x13,x13,#0x8
008d5f64	add w15,w15,#0x8
008d5f68	cmp x12,x14
008d5f6c	b.cc 0x008d5f4c
008d5f70	sub x14,x10,#0x3
008d5f74	cmp x12,x14
008d5f78	b.cs 0x008d5f94
008d5f7c	ldr w14,[x13]
008d5f80	ldr w15,[x12]
008d5f84	cmp w14,w15
008d5f88	b.ne 0x008d5f94
008d5f8c	add x12,x12,#0x4
008d5f90	add x13,x13,#0x4
008d5f94	sub x14,x10,#0x1
008d5f98	cmp x12,x14
008d5f9c	b.cs 0x008d5fb8
008d5fa0	ldrh w14,[x13]
008d5fa4	ldrh w15,[x12]
008d5fa8	cmp w14,w15
008d5fac	b.ne 0x008d5fb8
008d5fb0	add x12,x12,#0x2
008d5fb4	add x13,x13,#0x2
008d5fb8	cmp x12,x10
008d5fbc	b.cs 0x008d5fd4
008d5fc0	mov x14,x12
008d5fc4	ldrb w13,[x13]
008d5fc8	ldrb w15,[x14], #0x1
008d5fcc	cmp w13,w15
008d5fd0	csel x12,x12,x14,ne
008d5fd4	sub w11,w12,w11
008d5fd8	b 0x008d6038
008d5fdc	eor x10,x12,x11
008d5fe0	rbit x10,x10
008d5fe4	clz x10,x10
008d5fe8	lsr w11,w10,#0x3
008d5fec	b 0x008d6004
008d5ff0	eor x10,x15,x14
008d5ff4	rbit x10,x10
008d5ff8	clz x10,x10
008d5ffc	lsr x10,x10,#0x3
008d6000	add w11,w10,w13
008d6004	add x10,x30,w11, UXTW 
008d6008	add x30,x10,#0x4
008d600c	b 0x008d6164
008d6010	eor x11,x13,x12
008d6014	rbit x11,x11
008d6018	clz x11,x11
008d601c	lsr w11,w11,#0x3
008d6020	b 0x008d6038
008d6024	eor x11,x17,x16
008d6028	rbit x11,x11
008d602c	clz x11,x11
008d6030	lsr x11,x11,#0x3
008d6034	add w11,w11,w15
008d6038	add x12,x30,w11, UXTW 
008d603c	add x12,x12,#0x4
008d6040	cmp x12,x10
008d6044	b.eq 0x008d6050
008d6048	mov x30,x12
008d604c	b 0x008d6164
008d6050	cmp x10,x3
008d6054	mov x14,x1
008d6058	mov x13,x10
008d605c	b.cs 0x008d6078
008d6060	ldr x13,[x1]
008d6064	ldr x14,[x10]
008d6068	cmp x13,x14
008d606c	b.ne 0x008d6134
008d6070	ldr x14,[sp, #0x60]
008d6074	add x13,x10,#0x8
008d6078	cmp x13,x3
008d607c	b.cs 0x008d60bc
008d6080	ldp x15,x16,[x29, #-0x28]
008d6084	add x15,x15,x30
008d6088	sub x15,x15,x22
008d608c	cmp x15,x16
008d6090	csel x15,x15,x16,cc
008d6094	sub w15,w13,w15
008d6098	ldr x16,[x14]
008d609c	ldr x17,[x13]
008d60a0	cmp x16,x17
008d60a4	b.ne 0x008d6148
008d60a8	add x13,x13,#0x8
008d60ac	add x14,x14,#0x8
008d60b0	add w15,w15,#0x8
008d60b4	cmp x13,x3
008d60b8	b.cc 0x008d6098
008d60bc	ldr x15,[sp, #0x10]
008d60c0	cmp x13,x15
008d60c4	b.cs 0x008d60e4
008d60c8	ldr w15,[x14]
008d60cc	ldr w16,[x13]
008d60d0	cmp w15,w16
008d60d4	add x15,x13,#0x4
008d60d8	add x16,x14,#0x4
008d60dc	csel x14,x14,x16,ne
008d60e0	csel x13,x13,x15,ne
008d60e4	ldr x15,[sp, #0x8]
008d60e8	cmp x13,x15
008d60ec	b.cs 0x008d610c
008d60f0	ldrh w15,[x14]
008d60f4	ldrh w16,[x13]
008d60f8	cmp w15,w16
008d60fc	add x15,x13,#0x2
008d6100	add x16,x14,#0x2
008d6104	csel x14,x14,x16,ne
008d6108	csel x13,x13,x15,ne
008d610c	ldur x15,[x29, #-0x20]
008d6110	cmp x13,x15
008d6114	b.cs 0x008d612c
008d6118	mov x15,x13
008d611c	ldrb w14,[x14]
008d6120	ldrb w16,[x15], #0x1
008d6124	cmp w14,w16
008d6128	csel x13,x13,x15,ne
008d612c	sub w10,w13,w10
008d6130	b 0x008d615c
008d6134	eor x10,x14,x13
008d6138	rbit x10,x10
008d613c	clz x10,x10
008d6140	lsr w10,w10,#0x3
008d6144	b 0x008d615c
008d6148	eor x10,x17,x16
008d614c	rbit x10,x10
008d6150	clz x10,x10
008d6154	lsr x10,x10,#0x3
008d6158	add w10,w10,w15
008d615c	add x30,x12,w10, UXTW 
008d6160	add w11,w10,w11
008d6164	ldrb w12,[x9]
008d6168	subs w10,w11,#0xf
008d616c	b.cc 0x008d6230
008d6170	add w12,w12,#0xf
008d6174	cmp w10,#0x3fc
008d6178	strb w12,[x9]
008d617c	mov w9,#0xffffffff
008d6180	str w9,[x24]
008d6184	b.cc 0x008d6208
008d6188	mov w9,#0x8081
008d618c	sub w19,w11,#0x40b
008d6190	add x24,x8,#0x6
008d6194	movk w9,#0x8080, LSL #16
008d6198	mov x0,x24
008d619c	mov w1,#0xff
008d61a0	umull x9,w19,w9
008d61a4	mov w23,w4
008d61a8	mov w28,w5
008d61ac	mov x25,x26
008d61b0	mov x26,x6
008d61b4	mov x20,x3
008d61b8	mov x27,x30
008d61bc	lsr x21,x9,#0x29
008d61c0	lsl w22,w21,#0x2
008d61c4	add x2,x22,#0x4
008d61c8	bl 0x00c301c0
008d61cc	mov w8,#0x3fc
008d61d0	mov x30,x27
008d61d4	mov x3,x20
008d61d8	mov x6,x26
008d61dc	mov x26,x25
008d61e0	mov x25,#0xbb000000
008d61e4	ldp x27,x20,[x29, #-0x40]
008d61e8	msub w10,w21,w8,w19
008d61ec	movk x25,#0xbcdc, LSL #32
008d61f0	ldur x1,[x29, #-0x18]
008d61f4	mov w7,#0xffff
008d61f8	movk x25,#0xcf1b, LSL #48
008d61fc	mov w5,w28
008d6200	mov w4,w23
008d6204	add x24,x24,x22
008d6208	and w8,w10,#0xffff
008d620c	mov w9,#0x8081
008d6210	mul w8,w8,w9
008d6214	lsr w8,w8,#0x17
008d6218	add x24,x24,x8
008d621c	add w8,w10,w8
008d6220	strb w8,[x24], #0x1
008d6224	cmp x30,x20
008d6228	b.cc 0x008d6240
008d622c	b 0x008d6aa0
008d6230	add w8,w12,w11
008d6234	strb w8,[x9]
008d6238	cmp x30,x20
008d623c	b.cs 0x008d6aa0
008d6240	mov x8,x30
008d6244	ldr x10,[x30]
008d6248	ldur x13,[x29, #-0x10]
008d624c	ldr x9,[x8, #-0x2]!
008d6250	mul x10,x10,x25
008d6254	sub w8,w8,w27
008d6258	mul x9,x9,x25
008d625c	lsr x10,x10,#0x32
008d6260	lsr x9,x9,#0x32
008d6264	and x11,x10,#0x3ffc
008d6268	sub w10,w30,w27
008d626c	and x9,x9,#0x3ffc
008d6270	str w8,[x13, x9#0x0]
008d6274	ldr w9,[x13, x11#0x0]
008d6278	str w10,[x13, x11#0x0]
008d627c	cmp w9,w4
008d6280	add w12,w9,w7
008d6284	csel x8,x26,x27,cc
008d6288	csel x28,x6,x1,cc
008d628c	cmp w9,w5
008d6290	ccmp w12,w10,#0x0,cs
008d6294	b.cc 0x008d5c34
008d6298	add x22,x8,x9
008d629c	ldr w11,[x30]
008d62a0	ldr w8,[x22]
008d62a4	cmp w8,w11
008d62a8	b.ne 0x008d5c34
008d62ac	mov x8,x24
008d62b0	sub w10,w10,w9
008d62b4	mov x9,x24
008d62b8	strb wzr,[x8], #0x1
008d62bc	b 0x008d5e18
008d62c0	mov x11,x10
008d62c4	cmp x11,x3
008d62c8	b.cc 0x008d5e58
008d62cc	b 0x008d5e84
008d62d0	mov x12,x11
008d62d4	cmp x12,x14
008d62d8	b.cc 0x008d5f44
008d62dc	b 0x008d5f70
008d62e0	add x8,x8,x21
008d62e4	sub x9,x8,#0x1
008d62e8	sub x8,x23,#0x1
008d62ec	mov x22,x9
008d62f0	cmp x9,x28
008d62f4	mov x23,x8
008d62f8	b.ls 0x008d5ce4
008d62fc	cmp x23,x30
008d6300	b.ls 0x008d5ce4
008d6304	mov x8,x23
008d6308	mov x9,x22
008d630c	ldrb w10,[x8, #-0x1]!
008d6310	ldrb w11,[x9, #-0x1]!
008d6314	cmp w10,w11
008d6318	b.eq 0x008d62ec
008d631c	b 0x008d5ce4
008d6320	mov x11,x1
008d6324	mov x19,#0xbb000000
008d6328	sub x27,x1,x10
008d632c	ldr x8,[x11], #0x8
008d6330	movk x19,#0xbcdc, LSL #32
008d6334	movk x19,#0xcf1b, LSL #48
008d6338	str x11,[sp, #0x60]
008d633c	ldur x10,[x29, #-0x58]
008d6340	mul x11,x8,x19
008d6344	cmp x5,#0x0
008d6348	ldur x28,[x29, #-0x30]
008d634c	sub x21,x10,#0xb
008d6350	sub x8,x10,#0x5
008d6354	sub x20,x10,#0xc
008d6358	sub x12,x10,#0x8
008d635c	sub x10,x10,#0x6
008d6360	csel x9,xzr,x9,eq
008d6364	stp x10,x12,[sp, #0x10]
008d6368	add x23,x1,#0x1
008d636c	add w25,w4,#0x1
008d6370	stur x9,[x29, #-0x28]
008d6374	ldur x9,[x29, #-0x10]
008d6378	mov w2,#0xffff
008d637c	lsr x10,x11,#0x32
008d6380	stur x8,[x29, #-0x20]
008d6384	add x8,x1,#0x2
008d6388	mov x3,x1
008d638c	stp x21,x20,[x29, #-0x40]
008d6390	and x10,x10,#0x3ffc
008d6394	str w4,[x9, x10#0x0]
008d6398	b 0x008d63b0
008d639c	add x8,x3,#0x2
008d63a0	add x23,x3,#0x1
008d63a4	cmp x8,x21
008d63a8	sub w25,w23,w27
008d63ac	b.hi 0x008d5bb4
008d63b0	ldur x11,[x3, #0x1]
008d63b4	mov w9,#0x1
008d63b8	mov w10,#0x41
008d63bc	b 0x008d63dc
008d63c0	add x8,x12,x9
008d63c4	lsr x9,x10,#0x6
008d63c8	add x10,x10,#0x1
008d63cc	cmp x8,x21
008d63d0	sub w25,w12,w27
008d63d4	mov x23,x12
008d63d8	b.hi 0x008d5bb4
008d63dc	mul x11,x11,x19
008d63e0	ldur x14,[x29, #-0x10]
008d63e4	mov x12,x8
008d63e8	lsr x11,x11,#0x32
008d63ec	and x13,x11,#0x3ffc
008d63f0	ldr x11,[x12]
008d63f4	ldr w26,[x14, x13#0x0]
008d63f8	str w25,[x14, x13#0x0]
008d63fc	add w8,w26,w2
008d6400	cmp w8,w25
008d6404	b.cc 0x008d63c0
008d6408	cmp w26,w4
008d640c	ldr w14,[x23]
008d6410	csel x8,x6,x27,cc
008d6414	ldr w13,[x8, x26#0x0]
008d6418	cmp w13,w14
008d641c	b.ne 0x008d63c0
008d6420	cmp w26,w4
008d6424	add x24,x8,x26
008d6428	csel x22,x5,x1,cc
008d642c	cmp x24,x22
008d6430	b.ls 0x008d6444
008d6434	ldurb w9,[x23, #-0x1]
008d6438	ldurb w10,[x24, #-0x1]
008d643c	cmp w9,w10
008d6440	b.eq 0x008d6a28
008d6444	sub x10,x23,x3
008d6448	add x0,x28,#0x1
008d644c	subs w8,w10,#0xf
008d6450	b.cc 0x008d64d0
008d6454	cmp w8,#0xff
008d6458	mov w9,#0xf0
008d645c	strb w9,[x28]
008d6460	b.cc 0x008d64c8
008d6464	sub w8,w23,w3
008d6468	mov w1,#0xff
008d646c	str w4,[sp, #0x5c]
008d6470	sub w9,w8,#0x10e
008d6474	mov w8,#0x8081
008d6478	stp x6,x5,[sp, #0x40]
008d647c	movk w8,#0x8080, LSL #16
008d6480	str w9,[sp, #0x28]
008d6484	umull x8,w9,w8
008d6488	stp x10,x3,[sp, #0x30]
008d648c	lsr x8,x8,#0x27
008d6490	add x2,x8,#0x1
008d6494	str x8,[sp, #0x20]
008d6498	bl 0x00c301c0
008d649c	ldr x9,[sp, #0x20]
008d64a0	ldp x10,x3,[sp, #0x30]
008d64a4	ldp x6,x5,[sp, #0x40]
008d64a8	mov w2,#0xffff
008d64ac	sub w8,w9,w9, LSL #0x8
008d64b0	ldr w11,[sp, #0x28]
008d64b4	add x9,x28,x9
008d64b8	ldr w4,[sp, #0x5c]
008d64bc	ldur x1,[x29, #-0x18]
008d64c0	add x0,x9,#0x2
008d64c4	add w8,w11,w8
008d64c8	strb w8,[x0], #0x1
008d64cc	b 0x008d64d8
008d64d0	lsl w8,w10,#0x4
008d64d4	strb w8,[x28]
008d64d8	mov w8,w10
008d64dc	mov w9,#0x8
008d64e0	cmp x8,#0x8
008d64e4	csel x9,x8,x9,hi
008d64e8	cmp x8,#0x19
008d64ec	add x8,x0,x8
008d64f0	b.cc 0x008d654c
008d64f4	sub x10,x0,x3
008d64f8	cmp x10,#0x20
008d64fc	b.cc 0x008d654c
008d6500	sub x9,x9,#0x1
008d6504	add x13,x0,#0x10
008d6508	add x14,x3,#0x10
008d650c	lsr x9,x9,#0x3
008d6510	add x11,x9,#0x1
008d6514	and x12,x11,#0x3ffffffffffffffc
008d6518	lsl x10,x12,#0x3
008d651c	mov x15,x12
008d6520	add x9,x3,x10
008d6524	add x10,x0,x10
008d6528	ldp q0,q1,[x14, #-0x10]
008d652c	subs x15,x15,#0x4
008d6530	add x14,x14,#0x20
008d6534	stp q0,q1,[x13, #-0x10]
008d6538	add x13,x13,#0x20
008d653c	b.ne 0x008d6528
008d6540	cmp x11,x12
008d6544	b.ne 0x008d6554
008d6548	b 0x008d6564
008d654c	mov x9,x3
008d6550	mov x10,x0
008d6554	ldr x11,[x9], #0x8
008d6558	str x11,[x10], #0x8
008d655c	cmp x10,x8
008d6560	b.cc 0x008d6554
008d6564	sub w10,w25,w26
008d6568	mov x9,x28
008d656c	mov x3,x23
008d6570	mov x28,x8
008d6574	cmp x22,x5
008d6578	strh w10,[x28], #0x2
008d657c	b.eq 0x008d6654
008d6580	add x10,x3,#0x4
008d6584	add x12,x24,#0x4
008d6588	cmp x10,x20
008d658c	b.cs 0x008d6a08
008d6590	ldr x11,[x12]
008d6594	ldr x12,[x10]
008d6598	cmp x11,x12
008d659c	b.ne 0x008d6734
008d65a0	add x11,x3,#0xc
008d65a4	add x12,x24,#0xc
008d65a8	cmp x11,x20
008d65ac	b.cs 0x008d65dc
008d65b0	sub w13,w11,w3
008d65b4	sub w13,w13,#0x4
008d65b8	ldr x14,[x12]
008d65bc	ldr x15,[x11]
008d65c0	cmp x14,x15
008d65c4	b.ne 0x008d6748
008d65c8	add x11,x11,#0x8
008d65cc	add x12,x12,#0x8
008d65d0	add w13,w13,#0x8
008d65d4	cmp x11,x20
008d65d8	b.cc 0x008d65b8
008d65dc	ldr x13,[sp, #0x18]
008d65e0	cmp x11,x13
008d65e4	b.cs 0x008d6604
008d65e8	ldr w13,[x12]
008d65ec	ldr w14,[x11]
008d65f0	cmp w13,w14
008d65f4	add x13,x11,#0x4
008d65f8	add x14,x12,#0x4
008d65fc	csel x12,x12,x14,ne
008d6600	csel x11,x11,x13,ne
008d6604	ldr x13,[sp, #0x10]
008d6608	cmp x11,x13
008d660c	b.cs 0x008d662c
008d6610	ldrh w13,[x12]
008d6614	ldrh w14,[x11]
008d6618	cmp w13,w14
008d661c	add x13,x11,#0x2
008d6620	add x14,x12,#0x2
008d6624	csel x12,x12,x14,ne
008d6628	csel x11,x11,x13,ne
008d662c	ldur x13,[x29, #-0x20]
008d6630	cmp x11,x13
008d6634	b.cs 0x008d664c
008d6638	mov x13,x11
008d663c	ldrb w12,[x12]
008d6640	ldrb w14,[x13], #0x1
008d6644	cmp w12,w14
008d6648	csel x11,x11,x13,ne
008d664c	sub w11,w11,w10
008d6650	b 0x008d675c
008d6654	ldp x10,x11,[x29, #-0x28]
008d6658	add x13,x24,#0x4
008d665c	sub x10,x10,x24
008d6660	add x10,x3,x10
008d6664	cmp x10,x11
008d6668	csel x10,x11,x10,hi
008d666c	add x11,x3,#0x4
008d6670	sub x14,x10,#0x7
008d6674	cmp x11,x14
008d6678	b.cs 0x008d6a18
008d667c	ldr x12,[x13]
008d6680	ldr x13,[x11]
008d6684	cmp x12,x13
008d6688	b.ne 0x008d6768
008d668c	add x12,x3,#0xc
008d6690	add x13,x24,#0xc
008d6694	cmp x12,x14
008d6698	b.cs 0x008d66c8
008d669c	sub w15,w12,w3
008d66a0	sub w15,w15,#0x4
008d66a4	ldr x16,[x13]
008d66a8	ldr x17,[x12]
008d66ac	cmp x16,x17
008d66b0	b.ne 0x008d677c
008d66b4	add x12,x12,#0x8
008d66b8	add x13,x13,#0x8
008d66bc	add w15,w15,#0x8
008d66c0	cmp x12,x14
008d66c4	b.cc 0x008d66a4
008d66c8	sub x14,x10,#0x3
008d66cc	cmp x12,x14
008d66d0	b.cs 0x008d66ec
008d66d4	ldr w14,[x13]
008d66d8	ldr w15,[x12]
008d66dc	cmp w14,w15
008d66e0	b.ne 0x008d66ec
008d66e4	add x12,x12,#0x4
008d66e8	add x13,x13,#0x4
008d66ec	sub x14,x10,#0x1
008d66f0	cmp x12,x14
008d66f4	b.cs 0x008d6710
008d66f8	ldrh w14,[x13]
008d66fc	ldrh w15,[x12]
008d6700	cmp w14,w15
008d6704	b.ne 0x008d6710
008d6708	add x12,x12,#0x2
008d670c	add x13,x13,#0x2
008d6710	cmp x12,x10
008d6714	b.cs 0x008d672c
008d6718	mov x14,x12
008d671c	ldrb w13,[x13]
008d6720	ldrb w15,[x14], #0x1
008d6724	cmp w13,w15
008d6728	csel x12,x12,x14,ne
008d672c	sub w11,w12,w11
008d6730	b 0x008d6790
008d6734	eor x10,x12,x11
008d6738	rbit x10,x10
008d673c	clz x10,x10
008d6740	lsr w11,w10,#0x3
008d6744	b 0x008d675c
008d6748	eor x10,x15,x14
008d674c	rbit x10,x10
008d6750	clz x10,x10
008d6754	lsr x10,x10,#0x3
008d6758	add w11,w10,w13
008d675c	add x10,x3,w11, UXTW 
008d6760	add x3,x10,#0x4
008d6764	b 0x008d68bc
008d6768	eor x11,x13,x12
008d676c	rbit x11,x11
008d6770	clz x11,x11
008d6774	lsr w11,w11,#0x3
008d6778	b 0x008d6790
008d677c	eor x11,x17,x16
008d6780	rbit x11,x11
008d6784	clz x11,x11
008d6788	lsr x11,x11,#0x3
008d678c	add w11,w11,w15
008d6790	add x12,x3,w11, UXTW 
008d6794	add x12,x12,#0x4
008d6798	cmp x12,x10
008d679c	b.eq 0x008d67a8
008d67a0	mov x3,x12
008d67a4	b 0x008d68bc
008d67a8	cmp x10,x20
008d67ac	mov x14,x1
008d67b0	mov x13,x10
008d67b4	b.cs 0x008d67d0
008d67b8	ldr x13,[x1]
008d67bc	ldr x14,[x10]
008d67c0	cmp x13,x14
008d67c4	b.ne 0x008d688c
008d67c8	ldr x14,[sp, #0x60]
008d67cc	add x13,x10,#0x8
008d67d0	cmp x13,x20
008d67d4	b.cs 0x008d6814
008d67d8	ldp x15,x16,[x29, #-0x28]
008d67dc	add x15,x15,x3
008d67e0	sub x15,x15,x24
008d67e4	cmp x15,x16
008d67e8	csel x15,x15,x16,cc
008d67ec	sub w15,w13,w15
008d67f0	ldr x16,[x14]
008d67f4	ldr x17,[x13]
008d67f8	cmp x16,x17
008d67fc	b.ne 0x008d68a0
008d6800	add x13,x13,#0x8
008d6804	add x14,x14,#0x8
008d6808	add w15,w15,#0x8
008d680c	cmp x13,x20
008d6810	b.cc 0x008d67f0
008d6814	ldr x15,[sp, #0x18]
008d6818	cmp x13,x15
008d681c	b.cs 0x008d683c
008d6820	ldr w15,[x14]
008d6824	ldr w16,[x13]
008d6828	cmp w15,w16
008d682c	add x15,x13,#0x4
008d6830	add x16,x14,#0x4
008d6834	csel x14,x14,x16,ne
008d6838	csel x13,x13,x15,ne
008d683c	ldr x15,[sp, #0x10]
008d6840	cmp x13,x15
008d6844	b.cs 0x008d6864
008d6848	ldrh w15,[x14]
008d684c	ldrh w16,[x13]
008d6850	cmp w15,w16
008d6854	add x15,x13,#0x2
008d6858	add x16,x14,#0x2
008d685c	csel x14,x14,x16,ne
008d6860	csel x13,x13,x15,ne
008d6864	ldur x15,[x29, #-0x20]
008d6868	cmp x13,x15
008d686c	b.cs 0x008d6884
008d6870	mov x15,x13
008d6874	ldrb w14,[x14]
008d6878	ldrb w16,[x15], #0x1
008d687c	cmp w14,w16
008d6880	csel x13,x13,x15,ne
008d6884	sub w10,w13,w10
008d6888	b 0x008d68b4
008d688c	eor x10,x14,x13
008d6890	rbit x10,x10
008d6894	clz x10,x10
008d6898	lsr w10,w10,#0x3
008d689c	b 0x008d68b4
008d68a0	eor x10,x17,x16
008d68a4	rbit x10,x10
008d68a8	clz x10,x10
008d68ac	lsr x10,x10,#0x3
008d68b0	add w10,w10,w15
008d68b4	add x3,x12,w10, UXTW 
008d68b8	add w11,w10,w11
008d68bc	ldrb w12,[x9]
008d68c0	subs w10,w11,#0xf
008d68c4	b.cc 0x008d697c
008d68c8	add w12,w12,#0xf
008d68cc	cmp w10,#0x3fc
008d68d0	strb w12,[x9]
008d68d4	mov w9,#0xffffffff
008d68d8	str w9,[x28]
008d68dc	b.cc 0x008d6954
008d68e0	mov w9,#0x8081
008d68e4	sub w22,w11,#0x40b
008d68e8	add x24,x8,#0x6
008d68ec	movk w9,#0x8080, LSL #16
008d68f0	mov x0,x24
008d68f4	mov w1,#0xff
008d68f8	umull x9,w22,w9
008d68fc	mov w26,w4
008d6900	mov x28,x5
008d6904	mov x21,x27
008d6908	mov x27,x19
008d690c	mov x19,x6
008d6910	mov x20,x3
008d6914	lsr x23,x9,#0x29
008d6918	lsl w25,w23,#0x2
008d691c	add x2,x25,#0x4
008d6920	bl 0x00c301c0
008d6924	mov w8,#0x3fc
008d6928	mov x3,x20
008d692c	mov x6,x19
008d6930	mov x19,x27
008d6934	mov x27,x21
008d6938	msub w10,w23,w8,w22
008d693c	ldp x21,x20,[x29, #-0x40]
008d6940	ldur x1,[x29, #-0x18]
008d6944	mov w2,#0xffff
008d6948	mov x5,x28
008d694c	mov w4,w26
008d6950	add x28,x24,x25
008d6954	and w8,w10,#0xffff
008d6958	mov w9,#0x8081
008d695c	mul w8,w8,w9
008d6960	lsr w8,w8,#0x17
008d6964	add x28,x28,x8
008d6968	add w8,w10,w8
008d696c	strb w8,[x28], #0x1
008d6970	cmp x3,x21
008d6974	b.cc 0x008d698c
008d6978	b 0x008d5bb4
008d697c	add w8,w12,w11
008d6980	strb w8,[x9]
008d6984	cmp x3,x21
008d6988	b.cs 0x008d5bb4
008d698c	mov x8,x3
008d6990	ldr x10,[x3]
008d6994	ldur x13,[x29, #-0x10]
008d6998	ldr x9,[x8, #-0x2]!
008d699c	mul x10,x10,x19
008d69a0	sub w8,w8,w27
008d69a4	mul x9,x9,x19
008d69a8	lsr x10,x10,#0x32
008d69ac	lsr x9,x9,#0x32
008d69b0	and x11,x10,#0x3ffc
008d69b4	sub w10,w3,w27
008d69b8	and x9,x9,#0x3ffc
008d69bc	str w8,[x13, x9#0x0]
008d69c0	ldr w9,[x13, x11#0x0]
008d69c4	str w10,[x13, x11#0x0]
008d69c8	cmp w9,w4
008d69cc	add w12,w9,w2
008d69d0	csel x8,x6,x27,cc
008d69d4	csel x22,x5,x1,cc
008d69d8	cmp w12,w10
008d69dc	b.cc 0x008d639c
008d69e0	add x24,x8,x9
008d69e4	ldr w11,[x3]
008d69e8	ldr w8,[x24]
008d69ec	cmp w8,w11
008d69f0	b.ne 0x008d639c
008d69f4	mov x8,x28
008d69f8	sub w10,w10,w9
008d69fc	mov x9,x28
008d6a00	strb wzr,[x8], #0x1
008d6a04	b 0x008d6570
008d6a08	mov x11,x10
008d6a0c	cmp x11,x20
008d6a10	b.cc 0x008d65b0
008d6a14	b 0x008d65dc
008d6a18	mov x12,x11
008d6a1c	cmp x12,x14
008d6a20	b.cc 0x008d669c
008d6a24	b 0x008d66c8
008d6a28	add x8,x8,x26
008d6a2c	sub x9,x8,#0x1
008d6a30	sub x8,x23,#0x1
008d6a34	mov x24,x9
008d6a38	cmp x9,x22
008d6a3c	mov x23,x8
008d6a40	b.ls 0x008d6444
008d6a44	cmp x23,x3
008d6a48	b.ls 0x008d6444
008d6a4c	mov x8,x23
008d6a50	mov x9,x24
008d6a54	ldrb w10,[x8, #-0x1]!
008d6a58	ldrb w11,[x9, #-0x1]!
008d6a5c	cmp w10,w11
008d6a60	b.eq 0x008d6a34
008d6a64	b 0x008d6444
008d6a68	lsl w8,w24,#0x4
008d6a6c	strb w8,[x28]
008d6a70	add x25,x28,#0x1
008d6a74	ldur w19,[x29, #-0x44]
008d6a78	ldur x23,[x29, #-0x50]
008d6a7c	mov x0,x25
008d6a80	mov x1,x3
008d6a84	mov x2,x24
008d6a88	bl 0x00c2ffd0
008d6a8c	ldur x9,[x29, #-0x30]
008d6a90	add w8,w25,w24
008d6a94	mov w3,w19
008d6a98	sub w0,w8,w9
008d6a9c	b 0x008d6b50
008d6aa0	ldur x2,[x29, #-0x30]
008d6aa4	ldur x8,[x29, #-0x58]
008d6aa8	sub x19,x8,x30
008d6aac	subs x8,x19,#0xf
008d6ab0	b.cc 0x008d6b1c
008d6ab4	mov w9,#0xf0
008d6ab8	mov x0,x24
008d6abc	cmp x8,#0xff
008d6ac0	mov x26,x2
008d6ac4	strb w9,[x0], #0x1
008d6ac8	b.cc 0x008d6b10
008d6acc	ldr x8,[sp, #0x50]
008d6ad0	mov x20,x30
008d6ad4	add x8,x1,x8
008d6ad8	mov w1,#0xff
008d6adc	sub x8,x8,x30
008d6ae0	sub x21,x8,#0x10e
008d6ae4	orr x8,xzr,#-0x7f7f7f7f7f7f7f80
008d6ae8	movk x8,#0x8081
008d6aec	umulh x8,x21,x8
008d6af0	lsr x22,x8,#0x7
008d6af4	add x2,x22,#0x1
008d6af8	bl 0x00c301c0
008d6afc	sub x8,x22,x22, LSL #0x8
008d6b00	add x9,x24,x22
008d6b04	mov x30,x20
008d6b08	add x0,x9,#0x2
008d6b0c	add x8,x8,x21
008d6b10	strb w8,[x0]
008d6b14	mov x24,x0
008d6b18	b 0x008d6b28
008d6b1c	lsl w8,w19,#0x4
008d6b20	mov x26,x2
008d6b24	strb w8,[x24]
008d6b28	add x21,x24,#0x1
008d6b2c	ldur w22,[x29, #-0x44]
008d6b30	ldur x23,[x29, #-0x50]
008d6b34	mov x0,x21
008d6b38	mov x1,x30
008d6b3c	mov x2,x19
008d6b40	bl 0x00c2ffd0
008d6b44	add w8,w21,w19
008d6b48	mov w3,w22
008d6b4c	sub w0,w8,w26
008d6b50	ldur x1,[x29, #-0x18]
008d6b54	ldur x8,[x29, #-0x10]
008d6b58	str x1,[x8, #0x4000]
008d6b5c	str w3,[x23, #0x18]
008d6b60	ldp x20,x19,[sp, #0x110]
008d6b64	ldp x22,x21,[sp, #0x100]
008d6b68	ldp x24,x23,[sp, #0xf0]
008d6b6c	ldp x26,x25,[sp, #0xe0]
008d6b70	ldp x28,x27,[sp, #0xd0]
008d6b74	ldp x29,x30,[sp, #0xc0]
008d6b78	add sp,sp,#0x120
008d6b7c	ret
