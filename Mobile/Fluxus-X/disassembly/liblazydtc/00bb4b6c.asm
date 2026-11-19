; HUF_readDTableX2_wksp @ 00bb4b6c
00bb4b6c	sub sp,sp,#0x150
00bb4b70	stp x29,x30,[sp, #0xf0]
00bb4b74	stp x28,x27,[sp, #0x100]
00bb4b78	stp x26,x25,[sp, #0x110]
00bb4b7c	stp x24,x23,[sp, #0x120]
00bb4b80	stp x22,x21,[sp, #0x130]
00bb4b84	stp x20,x19,[sp, #0x140]
00bb4b88	add x29,sp,#0xf0
00bb4b8c	mrs x20,tpidr_el0
00bb4b90	ldr x8,[x20, #0x28]
00bb4b94	cmp x4,#0x84c
00bb4b98	stur x8,[x29, #-0x10]
00bb4b9c	b.cs 0x00bb4ba8
00bb4ba0	mov x0,#-0x1
00bb4ba4	b 0x00bb50dc
00bb4ba8	mov x8,x0
00bb4bac	movi v0.2D,#0x0
00bb4bb0	ldr w25,[x8], #0x4
00bb4bb4	stur x8,[x29, #-0x28]
00bb4bb8	and w19,w25,#0xff
00bb4bbc	cmp w19,#0xc
00bb4bc0	stp q0,q0,[x3, #0x280]
00bb4bc4	stp q0,q0,[x3, #0x2a0]
00bb4bc8	stp q0,q0,[x3, #0x2c0]
00bb4bcc	str q0,[x3, #0x270]
00bb4bd0	b.ls 0x00bb4bdc
00bb4bd4	mov x0,#-0x2c
00bb4bd8	b 0x00bb50dc
00bb4bdc	add x22,x3,#0x270
00bb4be0	add x23,x3,#0x3e0
00bb4be4	mov x9,x3
00bb4be8	mov x6,x2
00bb4bec	mov x21,x0
00bb4bf0	str w5,[sp, #0x8]
00bb4bf4	mov w8,#0x36c
00bb4bf8	sub x3,x29,#0x18
00bb4bfc	sub x4,x29,#0x14
00bb4c00	add x7,x9,#0x4e0
00bb4c04	mov x0,x23
00bb4c08	mov x5,x1
00bb4c0c	mov w1,#0x100
00bb4c10	mov x2,x22
00bb4c14	mov x24,x9
00bb4c18	str x8,[sp]
00bb4c1c	bl 0x00c43730
00bb4c20	cmn x0,#0x78
00bb4c24	b.hi 0x00bb50dc
00bb4c28	ldur w3,[x29, #-0x14]
00bb4c2c	cmp w3,w19
00bb4c30	b.hi 0x00bb4bd4
00bb4c34	cmp w3,#0xc
00bb4c38	add x8,x24,#0x2a4
00bb4c3c	mov x2,x24
00bb4c40	ccmp w19,#0xc,#0x0,cc
00bb4c44	str x8,[sp, #0x60]
00bb4c48	add w8,w3,#0x1
00bb4c4c	add x10,x24,#0x2a8
00bb4c50	cset w11,eq
00bb4c54	str w8,[sp, #0x6c]
00bb4c58	mov w8,#0xffffffff
00bb4c5c	mov w9,w3
00bb4c60	str x0,[sp, #0x18]
00bb4c64	ldr w12,[x22, w9, UXTW #0x2]
00bb4c68	sub w9,w9,#0x1
00bb4c6c	add w8,w8,#0x1
00bb4c70	cbz w12,0x00bb4c64
00bb4c74	cmp w11,#0x0
00bb4c78	mov w11,#0xb
00bb4c7c	add w4,w9,#0x2
00bb4c80	csel w22,w11,w19,ne
00bb4c84	cmp w4,#0x2
00bb4c88	b.cc 0x00bb4cb8
00bb4c8c	mov w13,wzr
00bb4c90	add x11,x2,#0x274
00bb4c94	sub x12,x4,#0x1
00bb4c98	ldr w14,[x11]
00bb4c9c	subs x12,x12,#0x1
00bb4ca0	str w13,[x11, #0x38]
00bb4ca4	add x11,x11,#0x4
00bb4ca8	add w14,w14,w13
00bb4cac	mov w13,w14
00bb4cb0	b.ne 0x00bb4c98
00bb4cb4	b 0x00bb4cbc
00bb4cb8	mov w14,wzr
00bb4cbc	ldur w11,[x29, #-0x18]
00bb4cc0	str w14,[x10]
00bb4cc4	str w14,[x10, w4, UXTW #0x2]
00bb4cc8	cbz w11,0x00bb4cf4
00bb4ccc	mov x12,xzr
00bb4cd0	add x13,x2,#0x2e0
00bb4cd4	ldrb w14,[x23, x12]
00bb4cd8	ldr w15,[x10, x14, LSL #0x2]
00bb4cdc	strb w12,[x13, x15]
00bb4ce0	add x12,x12,#0x1
00bb4ce4	add w15,w15,#0x1
00bb4ce8	cmp x11,x12
00bb4cec	str w15,[x10, x14, LSL #0x2]
00bb4cf0	b.ne 0x00bb4cd4
00bb4cf4	cmp w4,#0x2
00bb4cf8	str w25,[sp, #0x24]
00bb4cfc	str x20,[sp, #0x28]
00bb4d00	str wzr,[x10]
00bb4d04	b.cc 0x00bb4d34
00bb4d08	mov w10,wzr
00bb4d0c	sub w11,w22,w3
00bb4d10	sub x12,x4,#0x1
00bb4d14	mov x13,x2
00bb4d18	str w10,[x13, #0x4]!
00bb4d1c	ldr w14,[x13, #0x270]
00bb4d20	subs x12,x12,#0x1
00bb4d24	lsl w14,w14,w11
00bb4d28	add w11,w11,#0x1
00bb4d2c	add w10,w14,w10
00bb4d30	b.ne 0x00bb4d18
00bb4d34	add w11,w8,#0x1
00bb4d38	sub w10,w22,w8
00bb4d3c	add w9,w9,#0x1
00bb4d40	cmp w11,w10
00bb4d44	str w11,[sp, #0x5c]
00bb4d48	stur w9,[x29, #-0x3c]
00bb4d4c	b.cs 0x00bb4e1c
00bb4d50	add w8,w8,#0x1
00bb4d54	mov w11,#0x34
00bb4d58	sub x12,x4,#0x1
00bb4d5c	umull x13,w8,w11
00bb4d60	and x14,x12,#-0x8
00bb4d64	mov x9,xzr
00bb4d68	orr x15,x14,#0x1
00bb4d6c	mov x16,x8
00bb4d70	b 0x00bb4d88
00bb4d74	add x16,x16,#0x1
00bb4d78	add x9,x9,#0x1
00bb4d7c	add x13,x13,#0x34
00bb4d80	cmp w10,w16
00bb4d84	b.eq 0x00bb4e1c
00bb4d88	cmp w4,#0x2
00bb4d8c	b.cc 0x00bb4d74
00bb4d90	cmp x12,#0x8
00bb4d94	b.cc 0x00bb4df4
00bb4d98	add x17,x9,x8
00bb4d9c	mov w0,#0x1
00bb4da0	mul x17,x17,x11
00bb4da4	cmp x17,#0x20
00bb4da8	b.cc 0x00bb4df8
00bb4dac	dup v0.4S,w16
00bb4db0	mov x17,x14
00bb4db4	mov x0,x2
00bb4db8	neg v0.4S,v0.4S
00bb4dbc	ldur q1,[x0, #0x4]
00bb4dc0	ldur q2,[x0, #0x14]
00bb4dc4	add x1,x0,x13
00bb4dc8	subs x17,x17,#0x8
00bb4dcc	add x0,x0,#0x20
00bb4dd0	ushl v1.4S,v1.4S,v0.4S
00bb4dd4	ushl v2.4S,v2.4S,v0.4S
00bb4dd8	stur q1,[x1, #0x4]
00bb4ddc	stur q2,[x1, #0x14]
00bb4de0	b.ne 0x00bb4dbc
00bb4de4	cmp x12,x14
00bb4de8	mov x0,x15
00bb4dec	b.eq 0x00bb4d74
00bb4df0	b 0x00bb4df8
00bb4df4	mov w0,#0x1
00bb4df8	add x17,x2,x0, LSL #0x2
00bb4dfc	sub x0,x4,x0
00bb4e00	ldr w1,[x17]
00bb4e04	subs x0,x0,#0x1
00bb4e08	lsr w1,w1,w16
00bb4e0c	str w1,[x17, x13#0x0]
00bb4e10	add x17,x17,#0x4
00bb4e14	b.ne 0x00bb4e00
00bb4e18	b 0x00bb4d74
00bb4e1c	ldur w8,[x29, #-0x3c]
00bb4e20	str x2,[sp, #0x50]
00bb4e24	str x21,[sp, #0x30]
00bb4e28	cmp w8,#0x1
00bb4e2c	b.lt 0x00bb50b8
00bb4e30	mov w8,#0x1
00bb4e34	str x4,[sp, #0x70]
00bb4e38	orr w9,w8,w3, LSL #0x1
00bb4e3c	ldr x8,[sp, #0x50]
00bb4e40	add x25,x8,#0x2e0
00bb4e44	ldr w8,[sp, #0x6c]
00bb4e48	stur w9,[x29, #-0x5c]
00bb4e4c	sub w9,w9,w22
00bb4e50	sub w8,w8,w22
00bb4e54	str w8,[sp, #0x3c]
00bb4e58	ldr x8,[sp, #0x30]
00bb4e5c	add x10,x8,#0x44
00bb4e60	add x8,x8,#0x14
00bb4e64	stp x10,x8,[sp, #0x40]
00bb4e68	mov w8,#0x1
00bb4e6c	b 0x00bb4ec0
00bb4e70	ldr x9,[sp, #0x50]
00bb4e74	add x1,x25,x28
00bb4e78	add x2,x25,x14
00bb4e7c	mov w4,w22
00bb4e80	mov w5,wzr
00bb4e84	mov w6,#0x1
00bb4e88	ldr w8,[x9, x8, LSL #0x2]
00bb4e8c	ldur x9,[x29, #-0x28]
00bb4e90	add x0,x9,x8, LSL #0x2
00bb4e94	bl 0x00bb91ac
00bb4e98	ldp w3,w8,[x29, #-0x60]
00bb4e9c	ldr x4,[sp, #0x70]
00bb4ea0	ldur x9,[x29, #-0x70]
00bb4ea4	sub w8,w8,#0x1
00bb4ea8	cmp x9,x4
00bb4eac	sub w3,w3,#0x1
00bb4eb0	stur w8,[x29, #-0x5c]
00bb4eb4	mov x8,x9
00bb4eb8	ldur w9,[x29, #-0x64]
00bb4ebc	b.eq 0x00bb50b8
00bb4ec0	ldr w10,[sp, #0x6c]
00bb4ec4	ldr x11,[sp, #0x60]
00bb4ec8	add x12,x8,#0x1
00bb4ecc	stur w3,[x29, #-0x60]
00bb4ed0	sub w3,w10,w8
00bb4ed4	subs w10,w9,#0x1
00bb4ed8	ldrsw x28,[x11, x8, LSL #0x2]
00bb4edc	ldrsw x14,[x11, x12, LSL #0x2]
00bb4ee0	ldr w11,[sp, #0x5c]
00bb4ee4	stur w10,[x29, #-0x64]
00bb4ee8	sub w10,w22,w3
00bb4eec	csinc w9,w9,wzr,gt
00bb4ef0	stur x12,[x29, #-0x70]
00bb4ef4	cmp w10,w11
00bb4ef8	b.cc 0x00bb4e70
00bb4efc	cmp w28,w14
00bb4f00	b.eq 0x00bb4e98
00bb4f04	ldur w11,[x29, #-0x60]
00bb4f08	mov w13,#0x34
00bb4f0c	stur x14,[x29, #-0x30]
00bb4f10	umull x19,w11,w13
00bb4f14	ldr x11,[sp, #0x50]
00bb4f18	add x12,x11,w9, UXTW  #0x2
00bb4f1c	ldr w26,[x11, x8, LSL #0x2]
00bb4f20	mov w8,#0x1000000
00bb4f24	stur x12,[x29, #-0x48]
00bb4f28	mov w12,#0x1
00bb4f2c	lsl w16,w12,w10
00bb4f30	umaddl x12,w3,w13,x11
00bb4f34	add w11,w8,w3, LSL #0x10
00bb4f38	ldur w8,[x29, #-0x5c]
00bb4f3c	ldr w10,[sp, #0x3c]
00bb4f40	sub w8,w8,w9
00bb4f44	add w10,w3,w10
00bb4f48	str x12,[sp, #0x78]
00bb4f4c	stp w8,w11,[x29, #-0x50]
00bb4f50	ldr x8,[sp, #0x70]
00bb4f54	cmp w10,#0x1
00bb4f58	stp w10,w16,[x29, #-0x38]
00bb4f5c	sub x8,x8,x9
00bb4f60	stur x8,[x29, #-0x58]
00bb4f64	csinc w8,w10,wzr,gt
00bb4f68	stur x8,[x29, #-0x20]
00bb4f6c	b 0x00bb4f88
00bb4f70	ldur x14,[x29, #-0x30]
00bb4f74	ldur w16,[x29, #-0x34]
00bb4f78	add x28,x28,#0x1
00bb4f7c	cmp w14,w28
00bb4f80	add w26,w26,w16
00bb4f84	b.eq 0x00bb4e98
00bb4f88	ldur w8,[x29, #-0x38]
00bb4f8c	sbfiz x10,x26,#0x2,#0x20
00bb4f90	ldrb w23,[x25, x28]
00bb4f94	cmp w8,#0x2
00bb4f98	ldur x8,[x29, #-0x28]
00bb4f9c	add x27,x8,x10
00bb4fa0	b.lt 0x00bb505c
00bb4fa4	ldur w8,[x29, #-0x4c]
00bb4fa8	cmp w16,#0x2
00bb4fac	orr w8,w8,w23
00bb4fb0	orr x8,x8,x8, LSL #0x20
00bb4fb4	b.eq 0x00bb4fc8
00bb4fb8	cmp w16,#0x4
00bb4fbc	b.ne 0x00bb4fd0
00bb4fc0	stp x8,x8,[x27]
00bb4fc4	b 0x00bb505c
00bb4fc8	str x8,[x27]
00bb4fcc	b 0x00bb505c
00bb4fd0	ldr x9,[sp, #0x78]
00bb4fd4	ldur x11,[x29, #-0x20]
00bb4fd8	ldr w9,[x9, x11, LSL #0x2]
00bb4fdc	cmp w9,#0x1
00bb4fe0	b.lt 0x00bb505c
00bb4fe4	cmp w9,#0x19
00bb4fe8	b.cs 0x00bb4ff4
00bb4fec	mov x11,xzr
00bb4ff0	b 0x00bb503c
00bb4ff4	sub x11,x9,#0x1
00bb4ff8	dup v0.2D,x8
00bb4ffc	ldr x14,[sp, #0x40]
00bb5000	lsr x11,x11,#0x3
00bb5004	add x14,x14,x10
00bb5008	add x12,x11,#0x1
00bb500c	and x13,x12,#0x3ffffffffffffffc
00bb5010	lsl x11,x13,#0x3
00bb5014	mov x15,x13
00bb5018	stp q0,q0,[x14, #-0x40]
00bb501c	subs x15,x15,#0x4
00bb5020	stp q0,q0,[x14, #-0x20]
00bb5024	stp q0,q0,[x14]
00bb5028	stp q0,q0,[x14, #0x20]
00bb502c	add x14,x14,#0x80
00bb5030	b.ne 0x00bb5018
00bb5034	cmp x12,x13
00bb5038	b.eq 0x00bb505c
00bb503c	add x10,x10,x11, LSL #0x2
00bb5040	ldr x12,[sp, #0x48]
00bb5044	add x10,x12,x10
00bb5048	add x11,x11,#0x8
00bb504c	stp x8,x8,[x10, #-0x10]
00bb5050	cmp x11,x9
00bb5054	stp x8,x8,[x10], #0x20
00bb5058	b.cc 0x00bb5048
00bb505c	ldur w8,[x29, #-0x3c]
00bb5060	ldur x9,[x29, #-0x20]
00bb5064	cmp w9,w8
00bb5068	b.gt 0x00bb4f70
00bb506c	ldur x20,[x29, #-0x58]
00bb5070	ldur w24,[x29, #-0x50]
00bb5074	ldur x21,[x29, #-0x48]
00bb5078	ldr w8,[x21, x19#0x0]
00bb507c	ldrsw x9,[x21, #0x2a4]
00bb5080	mov w3,w24
00bb5084	ldrsw x10,[x21, #0x2a8]
00bb5088	mov w4,w22
00bb508c	mov w5,w23
00bb5090	add x0,x27,x8, LSL #0x2
00bb5094	add x1,x25,x9
00bb5098	mov w6,#0x2
00bb509c	add x2,x25,x10
00bb50a0	bl 0x00bb91ac
00bb50a4	subs x20,x20,#0x1
00bb50a8	add x21,x21,#0x4
00bb50ac	sub w24,w24,#0x1
00bb50b0	b.ne 0x00bb5078
00bb50b4	b 0x00bb4f70
00bb50b8	ldp x20,x10,[sp, #0x28]
00bb50bc	mov w8,#0x1
00bb50c0	ldr w9,[sp, #0x24]
00bb50c4	ldr x0,[sp, #0x18]
00bb50c8	strb w9,[x10]
00bb50cc	lsr w9,w9,#0x18
00bb50d0	strb w8,[x10, #0x1]
00bb50d4	strb w22,[x10, #0x2]
00bb50d8	strb w9,[x10, #0x3]
00bb50dc	ldr x8,[x20, #0x28]
00bb50e0	ldur x9,[x29, #-0x10]
00bb50e4	cmp x8,x9
00bb50e8	b.ne 0x00bb510c
00bb50ec	ldp x20,x19,[sp, #0x140]
00bb50f0	ldp x22,x21,[sp, #0x130]
00bb50f4	ldp x24,x23,[sp, #0x120]
00bb50f8	ldp x26,x25,[sp, #0x110]
00bb50fc	ldp x28,x27,[sp, #0x100]
00bb5100	ldp x29,x30,[sp, #0xf0]
00bb5104	add sp,sp,#0x150
00bb5108	ret
00bb510c	bl 0x00c2fec0
