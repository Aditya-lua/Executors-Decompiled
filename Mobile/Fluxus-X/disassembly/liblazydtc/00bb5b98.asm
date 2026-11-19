; HUF_decompress4X_usingDTable @ 00bb5b98
00bb5b98	ldrb w8,[x4, #0x1]
00bb5b9c	cbz w8,0x00bb5ba4
00bb5ba0	b 0x00bb5ba8
00bb5ba4	b 0x00bb7c34
00bb5ba8	sub sp,sp,#0x1b0
00bb5bac	stp x29,x30,[sp, #0x150]
00bb5bb0	stp x28,x27,[sp, #0x160]
00bb5bb4	stp x26,x25,[sp, #0x170]
00bb5bb8	stp x24,x23,[sp, #0x180]
00bb5bbc	stp x22,x21,[sp, #0x190]
00bb5bc0	stp x20,x19,[sp, #0x1a0]
00bb5bc4	add x29,sp,#0x150
00bb5bc8	mrs x20,tpidr_el0
00bb5bcc	mov x22,x4
00bb5bd0	mov x24,x3
00bb5bd4	ldr x8,[x20, #0x28]
00bb5bd8	mov x19,x2
00bb5bdc	mov x21,x1
00bb5be0	mov x23,x0
00bb5be4	stur x8,[x29, #-0x10]
00bb5be8	tbnz w5,#0x5,0x00bb6288
00bb5bec	add x0,sp,#0xa8
00bb5bf0	mov x1,x23
00bb5bf4	mov x2,x21
00bb5bf8	mov x3,x19
00bb5bfc	mov x4,x24
00bb5c00	mov x5,x22
00bb5c04	add x25,sp,#0xa8
00bb5c08	bl 0x00bba0f0
00bb5c0c	sub x8,x0,#0x1
00bb5c10	cmn x8,#0x79
00bb5c14	b.hi 0x00bb6284
00bb5c18	bic x10,x21,x21, ASR #0x3f
00bb5c1c	add x9,x25,#0x40
00bb5c20	str x19,[sp, #0x60]
00bb5c24	ldp x26,x0,[sp, #0xc8]
00bb5c28	stp x9,x24,[sp, #0x78]
00bb5c2c	ldp x1,x2,[sp, #0xd8]
00bb5c30	add x9,x23,x10
00bb5c34	ldp x12,x13,[sp, #0x108]
00bb5c38	orr x4,xzr,#-0x3333333333333334
00bb5c3c	ldp x19,x24,[sp, #0xe8]
00bb5c40	add x8,x22,#0x4
00bb5c44	ldp x30,x28,[sp, #0xf8]
00bb5c48	movk x4,#0xcccd
00bb5c4c	ldp x14,x15,[sp, #0xa8]
00bb5c50	mov x7,x1
00bb5c54	ldp x17,x16,[sp, #0xb8]
00bb5c58	mov x27,x0
00bb5c5c	ldr x5,[sp, #0x118]
00bb5c60	str x9,[sp, #0x70]
00bb5c64	add x9,x25,#0x20
00bb5c68	mov x25,x2
00bb5c6c	stp x20,x22,[sp, #0x98]
00bb5c70	stp x23,x21,[sp, #0x88]
00bb5c74	str x9,[sp, #0x68]
00bb5c78	mov x9,#0x2493
00bb5c7c	sub x6,x14,x13
00bb5c80	sub x21,x0,x26
00bb5c84	movk x9,#0x9249, LSL #16
00bb5c88	umulh x21,x21,x4
00bb5c8c	sub x22,x1,x27
00bb5c90	movk x9,#0x4924, LSL #32
00bb5c94	sub x23,x5,x25
00bb5c98	movk x9,#0x2492, LSL #48
00bb5c9c	umulh x22,x22,x4
00bb5ca0	umulh x20,x6,x9
00bb5ca4	lsr x21,x21,#0x3
00bb5ca8	umulh x23,x23,x4
00bb5cac	lsr x22,x22,#0x3
00bb5cb0	sub x6,x6,x20
00bb5cb4	add x6,x20,x6, LSR #0x1
00bb5cb8	sub x20,x2,x7
00bb5cbc	umulh x20,x20,x4
00bb5cc0	lsr x6,x6,#0x2
00bb5cc4	cmp x6,x21
00bb5cc8	csel x6,x6,x21,cc
00bb5ccc	lsr x21,x23,#0x3
00bb5cd0	cmp x6,x22
00bb5cd4	lsr x20,x20,#0x3
00bb5cd8	csel x6,x6,x22,cc
00bb5cdc	cmp x6,x20
00bb5ce0	csel x6,x6,x20,cc
00bb5ce4	cmp x6,x21
00bb5ce8	csel x6,x6,x21,cc
00bb5cec	cmp x6,#0x0
00bb5cf0	ccmp x15,x14,#0x0,ne
00bb5cf4	ccmp x17,x15,#0x0,cs
00bb5cf8	ccmp x16,x17,#0x0,cs
00bb5cfc	b.cc 0x00bb5f64
00bb5d00	add x6,x6,x6, LSL #0x2
00bb5d04	add x6,x25,x6
00bb5d08	lsr x20,x19,#0x35
00bb5d0c	lsr x21,x24,#0x35
00bb5d10	lsr x22,x30,#0x35
00bb5d14	lsr x9,x28,#0x35
00bb5d18	ldr w20,[x12, x20, LSL #0x2]
00bb5d1c	strh w20,[x26]
00bb5d20	lsr x23,x20,#0x10
00bb5d24	add x20,x26,x20, LSR #0x18
00bb5d28	ldr w21,[x12, x21, LSL #0x2]
00bb5d2c	lsl x19,x19,x23
00bb5d30	strh w21,[x27]
00bb5d34	lsr x23,x21,#0x10
00bb5d38	add x21,x27,x21, LSR #0x18
00bb5d3c	ldr w22,[x12, x22, LSL #0x2]
00bb5d40	lsr x10,x19,#0x35
00bb5d44	lsl x23,x24,x23
00bb5d48	strh w22,[x7]
00bb5d4c	lsr x24,x22,#0x10
00bb5d50	add x7,x7,x22, LSR #0x18
00bb5d54	ldr w9,[x12, x9, LSL #0x2]
00bb5d58	lsr x26,x23,#0x35
00bb5d5c	lsl x24,x30,x24
00bb5d60	strh w9,[x25]
00bb5d64	lsr x27,x9,#0x10
00bb5d68	add x9,x25,x9, LSR #0x18
00bb5d6c	ldr w10,[x12, x10, LSL #0x2]
00bb5d70	lsr x30,x24,#0x35
00bb5d74	lsl x27,x28,x27
00bb5d78	strh w10,[x20]
00bb5d7c	lsr x22,x10,#0x10
00bb5d80	add x10,x20,x10, LSR #0x18
00bb5d84	ldr w26,[x12, x26, LSL #0x2]
00bb5d88	lsl x19,x19,x22
00bb5d8c	strh w26,[x21]
00bb5d90	lsr x22,x26,#0x10
00bb5d94	add x21,x21,x26, LSR #0x18
00bb5d98	ldr w28,[x12, x30, LSL #0x2]
00bb5d9c	lsr x30,x27,#0x35
00bb5da0	lsl x22,x23,x22
00bb5da4	strh w28,[x7]
00bb5da8	lsr x20,x28,#0x10
00bb5dac	add x7,x7,x28, LSR #0x18
00bb5db0	ldr w25,[x12, x30, LSL #0x2]
00bb5db4	lsr x30,x19,#0x35
00bb5db8	lsl x20,x24,x20
00bb5dbc	strh w25,[x9]
00bb5dc0	lsr x24,x25,#0x10
00bb5dc4	add x9,x9,x25, LSR #0x18
00bb5dc8	ldr w23,[x12, x30, LSL #0x2]
00bb5dcc	lsr x30,x22,#0x35
00bb5dd0	lsl x24,x27,x24
00bb5dd4	strh w23,[x10]
00bb5dd8	lsr x27,x23,#0x10
00bb5ddc	add x10,x10,x23, LSR #0x18
00bb5de0	ldr w26,[x12, x30, LSL #0x2]
00bb5de4	lsr x30,x20,#0x35
00bb5de8	lsl x19,x19,x27
00bb5dec	strh w26,[x21]
00bb5df0	lsr x25,x26,#0x10
00bb5df4	add x21,x21,x26, LSR #0x18
00bb5df8	ldr w28,[x12, x30, LSL #0x2]
00bb5dfc	lsr x30,x24,#0x35
00bb5e00	lsl x22,x22,x25
00bb5e04	strh w28,[x7]
00bb5e08	lsr x23,x28,#0x10
00bb5e0c	ldr w27,[x12, x30, LSL #0x2]
00bb5e10	lsr x30,x19,#0x35
00bb5e14	lsl x20,x20,x23
00bb5e18	strh w27,[x9]
00bb5e1c	lsr x23,x27,#0x10
00bb5e20	ldr w25,[x12, x30, LSL #0x2]
00bb5e24	lsr x30,x22,#0x35
00bb5e28	lsl x23,x24,x23
00bb5e2c	add x24,x7,x28, LSR #0x18
00bb5e30	strh w25,[x10]
00bb5e34	lsr x7,x25,#0x10
00bb5e38	add x10,x10,x25, LSR #0x18
00bb5e3c	ldr w26,[x12, x30, LSL #0x2]
00bb5e40	lsr x30,x20,#0x35
00bb5e44	lsl x11,x19,x7
00bb5e48	add x7,x9,x27, LSR #0x18
00bb5e4c	strh w26,[x21]
00bb5e50	lsr x9,x26,#0x10
00bb5e54	add x21,x21,x26, LSR #0x18
00bb5e58	ldr w28,[x12, x30, LSL #0x2]
00bb5e5c	lsr x30,x23,#0x35
00bb5e60	lsr x27,x11,#0x35
00bb5e64	lsl x9,x22,x9
00bb5e68	strh w28,[x24]
00bb5e6c	lsr x22,x28,#0x10
00bb5e70	ldr w19,[x12, x30, LSL #0x2]
00bb5e74	lsl x20,x20,x22
00bb5e78	strh w19,[x7]
00bb5e7c	lsr x22,x19,#0x10
00bb5e80	add x19,x7,x19, LSR #0x18
00bb5e84	ldr w25,[x12, x27, LSL #0x2]
00bb5e88	lsr x27,x9,#0x35
00bb5e8c	lsr x26,x20,#0x35
00bb5e90	lsl x22,x23,x22
00bb5e94	add x23,x24,x28, LSR #0x18
00bb5e98	strh w25,[x10]
00bb5e9c	ldr w27,[x12, x27, LSL #0x2]
00bb5ea0	lsr x28,x22,#0x35
00bb5ea4	strh w27,[x21]
00bb5ea8	ldr w24,[x12, x26, LSL #0x2]
00bb5eac	lsr x26,x25,#0x10
00bb5eb0	strh w24,[x23]
00bb5eb4	lsl x11,x11,x26
00bb5eb8	lsr x26,x27,#0x10
00bb5ebc	ldr w28,[x12, x28, LSL #0x2]
00bb5ec0	lsr x30,x24,#0x10
00bb5ec4	add x27,x21,x27, LSR #0x18
00bb5ec8	lsl x9,x9,x26
00bb5ecc	add x26,x10,x25, LSR #0x18
00bb5ed0	rbit x11,x11
00bb5ed4	lsr x3,x28,#0x10
00bb5ed8	lsl x10,x20,x30
00bb5edc	strh w28,[x19]
00bb5ee0	rbit x9,x9
00bb5ee4	clz x11,x11
00bb5ee8	add x25,x19,x28, LSR #0x18
00bb5eec	lsl x3,x22,x3
00bb5ef0	rbit x10,x10
00bb5ef4	sub x14,x14,x11, LSR #0x3
00bb5ef8	clz x9,x9
00bb5efc	and x11,x11,#0x7
00bb5f00	add x7,x23,x24, LSR #0x18
00bb5f04	rbit x3,x3
00bb5f08	sub x15,x15,x9, LSR #0x3
00bb5f0c	clz x10,x10
00bb5f10	sub x17,x17,x10, LSR #0x3
00bb5f14	ldr x19,[x14]
00bb5f18	and x9,x9,#0x7
00bb5f1c	clz x3,x3
00bb5f20	ldr x20,[x15]
00bb5f24	cmp x25,x6
00bb5f28	sub x16,x16,x3, LSR #0x3
00bb5f2c	ldr x21,[x17]
00bb5f30	orr x19,x19,#0x1
00bb5f34	orr x20,x20,#0x1
00bb5f38	lsl x19,x19,x11
00bb5f3c	and x11,x3,#0x7
00bb5f40	ldr x22,[x16]
00bb5f44	lsl x24,x20,x9
00bb5f48	and x9,x10,#0x7
00bb5f4c	orr x10,x21,#0x1
00bb5f50	orr x3,x22,#0x1
00bb5f54	lsl x30,x10,x9
00bb5f58	lsl x28,x3,x11
00bb5f5c	b.cc 0x00bb5d08
00bb5f60	b 0x00bb5c78
00bb5f64	ldp x23,x21,[sp, #0x88]
00bb5f68	mov x12,xzr
00bb5f6c	stp x19,x24,[sp, #0xe8]
00bb5f70	ldp x20,x22,[sp, #0x98]
00bb5f74	stp x26,x27,[sp, #0xc8]
00bb5f78	ldp x27,x26,[sp, #0x68]
00bb5f7c	add x9,x21,#0x3
00bb5f80	stp x7,x25,[sp, #0xd8]
00bb5f84	ldp x25,x24,[sp, #0x78]
00bb5f88	lsr x13,x9,#0x2
00bb5f8c	stp x14,x15,[sp, #0xa8]
00bb5f90	add x14,sp,#0xa8
00bb5f94	adrp x15,0x789000
00bb5f98	add x15,x15,#0x2b0
00bb5f9c	stp x17,x16,[sp, #0xb8]
00bb5fa0	add x16,x14,#0x78
00bb5fa4	mov x17,x23
00bb5fa8	stp x30,x28,[sp, #0xf8]
00bb5fac	sub x9,x26,x17
00bb5fb0	add x10,x17,x13
00bb5fb4	ldr x0,[x27, x12, LSL #0x3]
00bb5fb8	cmp x13,x9
00bb5fbc	csel x17,x26,x10,hi
00bb5fc0	cmp x0,x17
00bb5fc4	b.hi 0x00bb6958
00bb5fc8	ldr x9,[x16, x12, LSL #0x3]
00bb5fcc	ldr x1,[x14, x12, LSL #0x3]
00bb5fd0	sub x9,x9,#0x8
00bb5fd4	cmp x1,x9
00bb5fd8	b.cc 0x00bb6958
00bb5fdc	ldr x9,[x25, x12, LSL #0x3]
00bb5fe0	ldr x2,[sp, #0x110]
00bb5fe4	sub x6,x17,x0
00bb5fe8	ldr x5,[x1]
00bb5fec	cmp x6,#0x8
00bb5ff0	rbit x9,x9
00bb5ff4	add x3,x2,#0x8
00bb5ff8	clz x7,x9
00bb5ffc	b.cc 0x00bb611c
00bb6000	sub x6,x17,#0x9
00bb6004	mov x4,x0
00bb6008	cmp x1,x3
00bb600c	b.cs 0x00bb6038
00bb6010	cmp x1,x2
00bb6014	b.eq 0x00bb6150
00bb6018	lsr w9,w7,#0x3
00bb601c	sub w11,w1,w2
00bb6020	sub x10,x1,x9
00bb6024	cmp x10,x2
00bb6028	csel w5,w9,w11,cs
00bb602c	cset w19,cs
00bb6030	sub w7,w7,w5, LSL #0x3
00bb6034	b 0x00bb6044
00bb6038	lsr w5,w7,#0x3
00bb603c	and w7,w7,#0x7
00bb6040	mov w19,#0x1
00bb6044	sub x1,x1,w5, UXTW 
00bb6048	cmp x4,x6
00bb604c	ldr x5,[x1]
00bb6050	b.cs 0x00bb6150
00bb6054	cbz w19,0x00bb6150
00bb6058	lsl x9,x5,x7
00bb605c	lsr x9,x9,#0x35
00bb6060	add x9,x8,x9, LSL #0x2
00bb6064	ldrh w10,[x9]
00bb6068	strh w10,[x4]
00bb606c	ldrb w10,[x9, #0x2]
00bb6070	ldrb w9,[x9, #0x3]
00bb6074	add w10,w7,w10
00bb6078	add x9,x4,x9
00bb607c	lsl x11,x5,x10
00bb6080	lsr x11,x11,#0x35
00bb6084	add x11,x8,x11, LSL #0x2
00bb6088	ldrh w7,[x11]
00bb608c	strh w7,[x9]
00bb6090	ldrb w4,[x11, #0x2]
00bb6094	ldrb w11,[x11, #0x3]
00bb6098	add w10,w10,w4
00bb609c	add x9,x9,x11
00bb60a0	lsl x4,x5,x10
00bb60a4	lsr x4,x4,#0x35
00bb60a8	add x4,x8,x4, LSL #0x2
00bb60ac	ldrh w7,[x4]
00bb60b0	strh w7,[x9]
00bb60b4	ldrb w11,[x4, #0x2]
00bb60b8	ldrb w4,[x4, #0x3]
00bb60bc	add w10,w10,w11
00bb60c0	add x9,x9,x4
00bb60c4	lsl x11,x5,x10
00bb60c8	lsr x11,x11,#0x35
00bb60cc	add x11,x8,x11, LSL #0x2
00bb60d0	ldrh w7,[x11]
00bb60d4	strh w7,[x9]
00bb60d8	ldrb w4,[x11, #0x2]
00bb60dc	ldrb w11,[x11, #0x3]
00bb60e0	add w10,w10,w4
00bb60e4	add x9,x9,x11
00bb60e8	lsl x4,x5,x10
00bb60ec	lsr x4,x4,#0x35
00bb60f0	add x4,x8,x4, LSL #0x2
00bb60f4	ldrh w7,[x4]
00bb60f8	strh w7,[x9]
00bb60fc	ldrb w11,[x4, #0x2]
00bb6100	add w7,w10,w11
00bb6104	ldrb w10,[x4, #0x3]
00bb6108	cmp w7,#0x40
00bb610c	add x4,x9,x10
00bb6110	b.ls 0x00bb6008
00bb6114	mov x1,x15
00bb6118	b 0x00bb6150
00bb611c	cmp x1,x3
00bb6120	b.cs 0x00bb6160
00bb6124	cmp x1,x2
00bb6128	b.eq 0x00bb6170
00bb612c	lsr w9,w7,#0x3
00bb6130	sub w11,w1,w2
00bb6134	sub x10,x1,x9
00bb6138	cmp x10,x2
00bb613c	csel w9,w11,w9,cc
00bb6140	sub x1,x1,x9
00bb6144	sub w7,w7,w9, LSL #0x3
00bb6148	ldr x5,[x1]
00bb614c	b 0x00bb6170
00bb6150	sub x6,x17,x4
00bb6154	cmp x6,#0x2
00bb6158	b.cc 0x00bb623c
00bb615c	b 0x00bb617c
00bb6160	sub x1,x1,x7, LSR #0x3
00bb6164	and w7,w7,#0x7
00bb6168	ldr x5,[x1]
00bb616c	b 0x00bb6170
00bb6170	mov x4,x0
00bb6174	cmp x6,#0x2
00bb6178	b.cc 0x00bb623c
00bb617c	cmp w7,#0x40
00bb6180	sub x6,x17,#0x2
00bb6184	b.hi 0x00bb6208
00bb6188	cmp x1,x3
00bb618c	b.cs 0x00bb61b8
00bb6190	cmp x1,x2
00bb6194	b.eq 0x00bb6208
00bb6198	lsr w9,w7,#0x3
00bb619c	sub w11,w1,w2
00bb61a0	sub x10,x1,x9
00bb61a4	cmp x10,x2
00bb61a8	csel w5,w9,w11,cs
00bb61ac	cset w19,cs
00bb61b0	sub w7,w7,w5, LSL #0x3
00bb61b4	b 0x00bb61c4
00bb61b8	lsr w5,w7,#0x3
00bb61bc	and w7,w7,#0x7
00bb61c0	mov w19,#0x1
00bb61c4	sub x1,x1,w5, UXTW 
00bb61c8	cmp x4,x6
00bb61cc	ldr x5,[x1]
00bb61d0	b.hi 0x00bb6208
00bb61d4	tbz w19,#0x0,0x00bb6208
00bb61d8	lsl x9,x5,x7
00bb61dc	lsr x9,x9,#0x35
00bb61e0	add x9,x8,x9, LSL #0x2
00bb61e4	ldrh w10,[x9]
00bb61e8	strh w10,[x4]
00bb61ec	ldrb w10,[x9, #0x2]
00bb61f0	ldrb w9,[x9, #0x3]
00bb61f4	add w7,w7,w10
00bb61f8	add x4,x4,x9
00bb61fc	cmp w7,#0x40
00bb6200	b.ls 0x00bb6188
00bb6204	b 0x00bb6208
00bb6208	cmp x4,x6
00bb620c	b.hi 0x00bb623c
00bb6210	lsl x9,x5,x7
00bb6214	lsr x9,x9,#0x35
00bb6218	add x9,x8,x9, LSL #0x2
00bb621c	ldrh w10,[x9]
00bb6220	strh w10,[x4]
00bb6224	ldrb w10,[x9, #0x3]
00bb6228	ldrb w9,[x9, #0x2]
00bb622c	add x4,x4,x10
00bb6230	add w7,w7,w9
00bb6234	cmp x4,x6
00bb6238	b.ls 0x00bb6210
00bb623c	cmp x4,x17
00bb6240	b.cs 0x00bb6258
00bb6244	lsl x9,x5,x7
00bb6248	lsr x9,x9,#0x33
00bb624c	and x9,x9,#0x1ffc
00bb6250	ldrb w9,[x8, x9]
00bb6254	strb w9,[x4], #0x1
00bb6258	ldr x9,[x27, x12, LSL #0x3]
00bb625c	sub x10,x4,x0
00bb6260	add x9,x9,x10
00bb6264	str x9,[x27, x12, LSL #0x3]
00bb6268	cmp x9,x17
00bb626c	b.ne 0x00bb6958
00bb6270	add x12,x12,#0x1
00bb6274	cmp x12,#0x4
00bb6278	b.ne 0x00bb5fac
00bb627c	ldr x19,[sp, #0x60]
00bb6280	mov x0,x21
00bb6284	cbnz x0,0x00bb695c
00bb6288	cmp x21,#0x6
00bb628c	mov x0,#-0x14
00bb6290	b.cc 0x00bb695c
00bb6294	cmp x24,#0xa
00bb6298	b.cc 0x00bb695c
00bb629c	ldrh w10,[x19]
00bb62a0	ldrh w9,[x19, #0x2]
00bb62a4	ldrh w8,[x19, #0x4]
00bb62a8	add x11,x10,x9
00bb62ac	add x11,x11,x8
00bb62b0	add x11,x11,#0x6
00bb62b4	subs x2,x24,x11
00bb62b8	b.cc 0x00bb695c
00bb62bc	add x11,x21,#0x3
00bb62c0	add x24,x23,x21
00bb62c4	lsr x11,x11,#0x2
00bb62c8	add x3,x23,x11
00bb62cc	add x17,x3,x11
00bb62d0	add x16,x17,x11
00bb62d4	cmp x16,x24
00bb62d8	b.hi 0x00bb695c
00bb62dc	cbz w10,0x00bb64ec
00bb62e0	ldr w4,[x22], #0x4
00bb62e4	add x14,x19,#0x6
00bb62e8	mov x25,x23
00bb62ec	cmp w10,#0x8
00bb62f0	add x15,x14,x10
00bb62f4	b.cc 0x00bb6320
00bb62f8	ldurb w10,[x15, #-0x1]
00bb62fc	cbz w10,0x00bb64f4
00bb6300	mov x13,x15
00bb6304	clz w10,w10
00bb6308	mov w11,#0x8
00bb630c	ldr x26,[x13, #-0x8]!
00bb6310	eor w10,w10,#0x1f
00bb6314	sub w23,w11,w10
00bb6318	cbnz w9,0x00bb63ac
00bb631c	b 0x00bb64ec
00bb6320	ldrb w26,[x14]
00bb6324	cmp w10,#0x4
00bb6328	b.gt 0x00bb6348
00bb632c	cmp w10,#0x2
00bb6330	b.eq 0x00bb6388
00bb6334	cmp w10,#0x3
00bb6338	b.eq 0x00bb6380
00bb633c	cmp w10,#0x4
00bb6340	b.eq 0x00bb6378
00bb6344	b 0x00bb6390
00bb6348	cmp w10,#0x5
00bb634c	b.eq 0x00bb6370
00bb6350	cmp w10,#0x6
00bb6354	b.eq 0x00bb6368
00bb6358	cmp w10,#0x7
00bb635c	b.ne 0x00bb6390
00bb6360	ldrb w11,[x19, #0xc]
00bb6364	orr x26,x26,x11, LSL #0x30
00bb6368	ldrb w11,[x19, #0xb]
00bb636c	add x26,x26,x11, LSL #0x28
00bb6370	ldrb w11,[x19, #0xa]
00bb6374	add x26,x26,x11, LSL #0x20
00bb6378	ldrb w11,[x19, #0x9]
00bb637c	add x26,x26,x11, LSL #0x18
00bb6380	ldrb w11,[x19, #0x8]
00bb6384	add x26,x26,x11, LSL #0x10
00bb6388	ldrb w11,[x19, #0x7]
00bb638c	add x26,x26,x11, LSL #0x8
00bb6390	ldurb w11,[x15, #-0x1]
00bb6394	cbz w11,0x00bb695c
00bb6398	clz w11,w11
00bb639c	mov x13,x14
00bb63a0	sub w10,w11,w10, LSL #0x3
00bb63a4	add w23,w10,#0x29
00bb63a8	cbz w9,0x00bb64ec
00bb63ac	cmp w9,#0x8
00bb63b0	add x11,x15,x9
00bb63b4	b.cc 0x00bb63e4
00bb63b8	ldurb w9,[x11, #-0x1]
00bb63bc	cbz w9,0x00bb64f4
00bb63c0	mov x10,x11
00bb63c4	clz w9,w9
00bb63c8	ldr x0,[x10, #-0x8]!
00bb63cc	str x10,[sp, #0x48]
00bb63d0	eor w9,w9,#0x1f
00bb63d4	mov w10,#0x8
00bb63d8	str x0,[sp, #0x88]
00bb63dc	sub w27,w10,w9
00bb63e0	b 0x00bb64a0
00bb63e4	ldrb w10,[x15]
00bb63e8	cmp w9,#0x4
00bb63ec	str x10,[sp, #0x88]
00bb63f0	b.gt 0x00bb6410
00bb63f4	cmp w9,#0x2
00bb63f8	b.eq 0x00bb6438
00bb63fc	cmp w9,#0x3
00bb6400	b.eq 0x00bb6448
00bb6404	cmp w9,#0x4
00bb6408	b.eq 0x00bb6468
00bb640c	b 0x00bb6488
00bb6410	cmp w9,#0x5
00bb6414	b.eq 0x00bb6440
00bb6418	cmp w9,#0x6
00bb641c	b.eq 0x00bb6450
00bb6420	cmp w9,#0x7
00bb6424	b.ne 0x00bb6488
00bb6428	ldrb w10,[x15, #0x6]
00bb642c	ldr x0,[sp, #0x88]
00bb6430	orr x0,x0,x10, LSL #0x30
00bb6434	b 0x00bb6454
00bb6438	ldr x0,[sp, #0x88]
00bb643c	b 0x00bb647c
00bb6440	ldr x0,[sp, #0x88]
00bb6444	b 0x00bb645c
00bb6448	ldr x0,[sp, #0x88]
00bb644c	b 0x00bb6474
00bb6450	ldr x0,[sp, #0x88]
00bb6454	ldrb w10,[x15, #0x5]
00bb6458	add x0,x0,x10, LSL #0x28
00bb645c	ldrb w10,[x15, #0x4]
00bb6460	add x0,x0,x10, LSL #0x20
00bb6464	str x0,[sp, #0x88]
00bb6468	ldrb w10,[x15, #0x3]
00bb646c	ldr x0,[sp, #0x88]
00bb6470	add x0,x0,x10, LSL #0x18
00bb6474	ldrb w10,[x15, #0x2]
00bb6478	add x0,x0,x10, LSL #0x10
00bb647c	ldrb w10,[x15, #0x1]
00bb6480	add x0,x0,x10, LSL #0x8
00bb6484	str x0,[sp, #0x88]
00bb6488	ldurb w10,[x11, #-0x1]
00bb648c	cbz w10,0x00bb6958
00bb6490	clz w10,w10
00bb6494	str x15,[sp, #0x48]
00bb6498	sub w9,w10,w9, LSL #0x3
00bb649c	add w27,w9,#0x29
00bb64a0	cbz w8,0x00bb64ec
00bb64a4	cmp w8,#0x8
00bb64a8	add x1,x11,x8
00bb64ac	str x16,[sp, #0x50]
00bb64b0	b.cc 0x00bb64fc
00bb64b4	ldurb w8,[x1, #-0x1]
00bb64b8	cbz w8,0x00bb64f4
00bb64bc	mov x9,x1
00bb64c0	clz w8,w8
00bb64c4	str w4,[sp, #0x1c]
00bb64c8	ldr x10,[x9, #-0x8]!
00bb64cc	eor w8,w8,#0x1f
00bb64d0	str x19,[sp, #0x60]
00bb64d4	mov x19,x11
00bb64d8	stp x9,x10,[sp, #0x78]
00bb64dc	mov w9,#0x8
00bb64e0	stp x3,x17,[sp, #0x28]
00bb64e4	sub w28,w9,w8
00bb64e8	b 0x00bb6594
00bb64ec	mov x0,#-0x48
00bb64f0	b 0x00bb695c
00bb64f4	mov x0,#-0x1
00bb64f8	b 0x00bb695c
00bb64fc	ldrb w10,[x11]
00bb6500	cmp w8,#0x4
00bb6504	b.gt 0x00bb6524
00bb6508	cmp w8,#0x2
00bb650c	b.eq 0x00bb6564
00bb6510	cmp w8,#0x3
00bb6514	b.eq 0x00bb655c
00bb6518	cmp w8,#0x4
00bb651c	b.eq 0x00bb6554
00bb6520	b 0x00bb656c
00bb6524	cmp w8,#0x5
00bb6528	b.eq 0x00bb654c
00bb652c	cmp w8,#0x6
00bb6530	b.eq 0x00bb6544
00bb6534	cmp w8,#0x7
00bb6538	b.ne 0x00bb656c
00bb653c	ldrb w9,[x11, #0x6]
00bb6540	orr x10,x10,x9, LSL #0x30
00bb6544	ldrb w9,[x11, #0x5]
00bb6548	add x10,x10,x9, LSL #0x28
00bb654c	ldrb w9,[x11, #0x4]
00bb6550	add x10,x10,x9, LSL #0x20
00bb6554	ldrb w9,[x11, #0x3]
00bb6558	add x10,x10,x9, LSL #0x18
00bb655c	ldrb w9,[x11, #0x2]
00bb6560	add x10,x10,x9, LSL #0x10
00bb6564	ldrb w9,[x11, #0x1]
00bb6568	add x10,x10,x9, LSL #0x8
00bb656c	ldurb w9,[x1, #-0x1]
00bb6570	cbz w9,0x00bb6958
00bb6574	clz w9,w9
00bb6578	str x19,[sp, #0x60]
00bb657c	mov x19,x11
00bb6580	sub w8,w9,w8, LSL #0x3
00bb6584	str w4,[sp, #0x1c]
00bb6588	stp x3,x17,[sp, #0x28]
00bb658c	add w28,w8,#0x29
00bb6590	stp x11,x10,[sp, #0x78]
00bb6594	stp x15,x14,[sp, #0x38]
00bb6598	str x13,[sp, #0x20]
00bb659c	add x0,sp,#0xa8
00bb65a0	bl 0x00bb9fd0
00bb65a4	ldp x7,x3,[sp, #0x20]
00bb65a8	cmn x0,#0x78
00bb65ac	ldp x30,x11,[sp, #0x40]
00bb65b0	ldr x17,[sp, #0x50]
00bb65b4	ldp x10,x15,[sp, #0x30]
00bb65b8	ldr x12,[sp, #0x60]
00bb65bc	b.hi 0x00bb695c
00bb65c0	sub x9,x24,x17
00bb65c4	ldr w13,[sp, #0x1c]
00bb65c8	sub x8,x24,#0x7
00bb65cc	cmp x9,#0x8
00bb65d0	add x9,x12,#0xe
00bb65d4	mov x6,x24
00bb65d8	lsr w24,w13,#0x10
00bb65dc	stp x8,x9,[sp, #0x58]
00bb65e0	add x9,x15,#0x8
00bb65e4	str x9,[sp, #0x68]
00bb65e8	add x9,x19,#0x8
00bb65ec	str x22,[sp, #0xa0]
00bb65f0	str x9,[sp, #0x70]
00bb65f4	b.cc 0x00bb698c
00bb65f8	cmp x17,x8
00bb65fc	b.cs 0x00bb698c
00bb6600	ldr x0,[sp, #0xa8]
00bb6604	neg w9,w24
00bb6608	ldr w2,[sp, #0xb0]
00bb660c	ldr x14,[sp, #0xc8]
00bb6610	mov x8,x17
00bb6614	ldr x17,[sp, #0xb8]
00bb6618	mov x13,x7
00bb661c	and w1,w9,#0x3f
00bb6620	mov x16,x3
00bb6624	mov x12,x10
00bb6628	mov x9,x8
00bb662c	stp x19,x6,[sp, #0x8]
00bb6630	stp x21,x20,[sp, #0x90]
00bb6634	str w24,[sp, #0x4]
00bb6638	lsl x3,x26,x23
00bb663c	ldp x8,x10,[sp, #0x80]
00bb6640	mov x15,x11
00bb6644	ldr x11,[sp, #0xa0]
00bb6648	lsl x7,x0,x2
00bb664c	lsr x3,x3,x1
00bb6650	lsl x4,x10,x27
00bb6654	lsl x5,x8,x28
00bb6658	lsr x20,x7,x1
00bb665c	add x3,x11,x3, LSL #0x2
00bb6660	lsr x4,x4,x1
00bb6664	lsr x5,x5,x1
00bb6668	add x20,x11,x20, LSL #0x2
00bb666c	ldrh w6,[x3]
00bb6670	add x4,x11,x4, LSL #0x2
00bb6674	add x5,x11,x5, LSL #0x2
00bb6678	strh w6,[x25]
00bb667c	ldrb w6,[x3, #0x2]
00bb6680	ldrh w19,[x4]
00bb6684	ldrb w3,[x3, #0x3]
00bb6688	add w7,w23,w6
00bb668c	strh w19,[x16]
00bb6690	add x3,x25,x3
00bb6694	ldrb w6,[x4, #0x2]
00bb6698	ldrh w19,[x5]
00bb669c	lsl x21,x26,x7
00bb66a0	ldrb w22,[x4, #0x3]
00bb66a4	add w6,w27,w6
00bb66a8	strh w19,[x12]
00bb66ac	lsr x4,x21,x1
00bb66b0	ldrb w19,[x5, #0x2]
00bb66b4	ldrh w21,[x20]
00bb66b8	lsl x23,x10,x6
00bb66bc	add x27,x11,x4, LSL #0x2
00bb66c0	ldrb w24,[x5, #0x3]
00bb66c4	add w4,w28,w19
00bb66c8	strh w21,[x9]
00bb66cc	lsr x5,x23,x1
00bb66d0	ldrb w19,[x20, #0x2]
00bb66d4	ldrh w21,[x27]
00bb66d8	lsl x23,x8,x4
00bb66dc	add x28,x11,x5, LSL #0x2
00bb66e0	ldrb w20,[x20, #0x3]
00bb66e4	add x5,x16,x22
00bb66e8	add w2,w2,w19
00bb66ec	strh w21,[x3]
00bb66f0	lsr x19,x23,x1
00bb66f4	ldrb w21,[x27, #0x2]
00bb66f8	ldrh w23,[x28]
00bb66fc	lsl x30,x0,x2
00bb6700	add x19,x11,x19, LSL #0x2
00bb6704	ldrb w22,[x27, #0x3]
00bb6708	add w16,w7,w21
00bb670c	strh w23,[x5]
00bb6710	lsr x21,x30,x1
00bb6714	ldrb w23,[x28, #0x2]
00bb6718	ldrh w27,[x19]
00bb671c	lsl x30,x26,x16
00bb6720	add x7,x12,x24
00bb6724	add x21,x11,x21, LSL #0x2
00bb6728	ldrb w24,[x28, #0x3]
00bb672c	add w12,w6,w23
00bb6730	strh w27,[x7]
00bb6734	lsr x23,x30,x1
00bb6738	ldrb w27,[x19, #0x2]
00bb673c	ldrh w28,[x21]
00bb6740	lsl x30,x10,x12
00bb6744	add x6,x9,x20
00bb6748	add x20,x11,x23, LSL #0x2
00bb674c	ldrb w19,[x19, #0x3]
00bb6750	add w9,w4,w27
00bb6754	strh w28,[x6]
00bb6758	lsr x4,x30,x1
00bb675c	ldrb w23,[x21, #0x2]
00bb6760	ldrh w27,[x20]
00bb6764	lsl x28,x8,x9
00bb6768	add x3,x3,x22
00bb676c	add x22,x11,x4, LSL #0x2
00bb6770	ldrb w21,[x21, #0x3]
00bb6774	add w2,w2,w23
00bb6778	strh w27,[x3]
00bb677c	lsr x4,x28,x1
00bb6780	ldrh w23,[x22]
00bb6784	lsl x27,x0,x2
00bb6788	add x5,x5,x24
00bb678c	ldrb w24,[x20, #0x2]
00bb6790	add x28,x11,x4, LSL #0x2
00bb6794	ldrb w20,[x20, #0x3]
00bb6798	strh w23,[x5]
00bb679c	lsr x23,x27,x1
00bb67a0	add x4,x7,x19
00bb67a4	add w7,w16,w24
00bb67a8	ldrh w16,[x28]
00bb67ac	ldrb w19,[x22, #0x2]
00bb67b0	lsl x24,x26,x7
00bb67b4	add x23,x11,x23, LSL #0x2
00bb67b8	ldrb w27,[x22, #0x3]
00bb67bc	strh w16,[x4]
00bb67c0	add w19,w12,w19
00bb67c4	add x6,x6,x21
00bb67c8	lsr x12,x24,x1
00bb67cc	ldrh w16,[x23]
00bb67d0	ldrb w21,[x28, #0x2]
00bb67d4	lsl x24,x10,x19
00bb67d8	ldrb w28,[x28, #0x3]
00bb67dc	add x30,x11,x12, LSL #0x2
00bb67e0	strh w16,[x6]
00bb67e4	add w22,w9,w21
00bb67e8	lsr x9,x24,x1
00bb67ec	ldrb w16,[x23, #0x2]
00bb67f0	lsl x24,x8,x22
00bb67f4	ldrh w21,[x30]
00bb67f8	add x12,x3,x20
00bb67fc	ldrb w20,[x23, #0x3]
00bb6800	add x9,x11,x9, LSL #0x2
00bb6804	add w2,w2,w16
00bb6808	lsr x3,x24,x1
00bb680c	strh w21,[x12]
00bb6810	lsl x23,x0,x2
00bb6814	add x16,x5,x27
00bb6818	ldrh w21,[x9]
00bb681c	add x10,x11,x3, LSL #0x2
00bb6820	ldrb w8,[x30, #0x2]
00bb6824	ldrb w3,[x30, #0x3]
00bb6828	lsr x5,x23,x1
00bb682c	add x4,x4,x28
00bb6830	strh w21,[x16]
00bb6834	ldrh w23,[x10]
00bb6838	add x21,x11,x5, LSL #0x2
00bb683c	ldrb w27,[x9, #0x2]
00bb6840	ldrb w5,[x9, #0x3]
00bb6844	ldr x11,[sp, #0x60]
00bb6848	add x9,x6,x20
00bb684c	strh w23,[x4]
00bb6850	add w23,w7,w8
00bb6854	ldrh w20,[x21]
00bb6858	ldrb w24,[x10, #0x2]
00bb685c	ldrb w6,[x10, #0x3]
00bb6860	cmp x13,x11
00bb6864	strh w20,[x9]
00bb6868	b.cc 0x00bb6938
00bb686c	lsr w8,w23,#0x3
00bb6870	mov w7,wzr
00bb6874	and w23,w23,#0x7
00bb6878	sub x10,x13,x8
00bb687c	ldr x26,[x10]
00bb6880	mov x13,x10
00bb6884	ldr x8,[sp, #0x68]
00bb6888	ldrb w30,[x21, #0x2]
00bb688c	mov x11,x15
00bb6890	ldrb w21,[x21, #0x3]
00bb6894	add w27,w19,w27
00bb6898	cmp x15,x8
00bb689c	b.cc 0x00bb6940
00bb68a0	lsr w8,w27,#0x3
00bb68a4	mov w19,wzr
00bb68a8	and w27,w27,#0x7
00bb68ac	sub x11,x11,x8
00bb68b0	ldr x8,[x11]
00bb68b4	str x8,[sp, #0x88]
00bb68b8	ldp x8,x10,[sp, #0x70]
00bb68bc	add w28,w22,w24
00bb68c0	cmp x10,x8
00bb68c4	b.cc 0x00bb6948
00bb68c8	lsr w8,w28,#0x3
00bb68cc	mov w22,wzr
00bb68d0	and w28,w28,#0x7
00bb68d4	sub x10,x10,x8
00bb68d8	ldr x8,[x10]
00bb68dc	stp x10,x8,[sp, #0x78]
00bb68e0	cmp x17,x14
00bb68e4	add w2,w2,w30
00bb68e8	b.cc 0x00bb6950
00bb68ec	lsr w8,w2,#0x3
00bb68f0	mov w24,wzr
00bb68f4	and w2,w2,#0x7
00bb68f8	sub x17,x17,x8
00bb68fc	str x17,[sp, #0xb8]
00bb6900	ldr x0,[x17]
00bb6904	str x0,[sp, #0xa8]
00bb6908	ldr x8,[sp, #0x58]
00bb690c	add x9,x9,x21
00bb6910	add x25,x12,x3
00bb6914	add x16,x16,x5
00bb6918	add x12,x4,x6
00bb691c	cmp x9,x8
00bb6920	b.cs 0x00bb699c
00bb6924	orr w8,w19,w7
00bb6928	orr w8,w8,w22
00bb692c	orr w8,w8,w24
00bb6930	cbz w8,0x00bb6638
00bb6934	b 0x00bb699c
00bb6938	mov w7,#0x3
00bb693c	b 0x00bb6884
00bb6940	mov w19,#0x3
00bb6944	b 0x00bb68b8
00bb6948	mov w22,#0x3
00bb694c	b 0x00bb68e0
00bb6950	mov w24,#0x3
00bb6954	b 0x00bb6908
00bb6958	mov x0,#-0x14
00bb695c	ldr x8,[x20, #0x28]
00bb6960	ldur x9,[x29, #-0x10]
00bb6964	cmp x8,x9
00bb6968	b.ne 0x00bb7c08
00bb696c	ldp x20,x19,[sp, #0x1a0]
00bb6970	ldp x22,x21,[sp, #0x190]
00bb6974	ldp x24,x23,[sp, #0x180]
00bb6978	ldp x26,x25,[sp, #0x170]
00bb697c	ldp x28,x27,[sp, #0x160]
00bb6980	ldp x29,x30,[sp, #0x150]
00bb6984	add sp,sp,#0x1b0
00bb6988	ret
00bb698c	mov x9,x17
00bb6990	mov x12,x10
00bb6994	mov x16,x3
00bb6998	b 0x00bb69bc
00bb699c	ldp x21,x20,[sp, #0x90]
00bb69a0	mov x7,x13
00bb69a4	ldp x15,x30,[sp, #0x38]
00bb69a8	ldr w24,[sp, #0x4]
00bb69ac	ldp x19,x6,[sp, #0x8]
00bb69b0	ldr x17,[sp, #0x50]
00bb69b4	str w2,[sp, #0xb0]
00bb69b8	ldp x3,x10,[sp, #0x28]
00bb69bc	cmp x25,x3
00bb69c0	mov x0,#-0x14
00bb69c4	b.hi 0x00bb695c
00bb69c8	cmp x16,x10
00bb69cc	b.hi 0x00bb695c
00bb69d0	ldr x5,[sp, #0xa0]
00bb69d4	cmp x12,x17
00bb69d8	b.hi 0x00bb695c
00bb69dc	ldr w13,[sp, #0x1c]
00bb69e0	sub x8,x3,x25
00bb69e4	cmp x8,#0x8
00bb69e8	ubfx w14,w13,#0x10,#0x8
00bb69ec	str w14,[sp, #0x98]
00bb69f0	b.cc 0x00bb6b40
00bb69f4	ldr x22,[sp, #0x78]
00bb69f8	cmp w14,#0xc
00bb69fc	mov x14,x10
00bb6a00	b.cs 0x00bb6b90
00bb6a04	cmp w23,#0x40
00bb6a08	b.hi 0x00bb7ba0
00bb6a0c	neg w8,w24
00bb6a10	mov x0,x3
00bb6a14	sub x17,x3,#0x9
00bb6a18	and w1,w8,#0x3f
00bb6a1c	adrp x13,0x789000
00bb6a20	add x13,x13,#0x2b0
00bb6a24	ldr x8,[sp, #0x60]
00bb6a28	cmp x7,x8
00bb6a2c	b.cs 0x00bb6a5c
00bb6a30	ldr x4,[sp, #0x80]
00bb6a34	cmp x7,x30
00bb6a38	b.eq 0x00bb6cc8
00bb6a3c	lsr w8,w23,#0x3
00bb6a40	sub w2,w7,w30
00bb6a44	sub x10,x7,x8
00bb6a48	cmp x10,x30
00bb6a4c	csel w3,w8,w2,cs
00bb6a50	cset w2,cs
00bb6a54	sub w23,w23,w3, LSL #0x3
00bb6a58	b 0x00bb6a6c
00bb6a5c	ldr x4,[sp, #0x80]
00bb6a60	lsr w3,w23,#0x3
00bb6a64	and w23,w23,#0x7
00bb6a68	mov w2,#0x1
00bb6a6c	sub x7,x7,w3, UXTW 
00bb6a70	cmp x25,x17
00bb6a74	ldr x26,[x7]
00bb6a78	b.cs 0x00bb6cac
00bb6a7c	cbz w2,0x00bb6cac
00bb6a80	lsl x8,x26,x23
00bb6a84	lsr x8,x8,x1
00bb6a88	add x8,x5,x8, LSL #0x2
00bb6a8c	ldrh w10,[x8]
00bb6a90	strh w10,[x25]
00bb6a94	ldrb w10,[x8, #0x2]
00bb6a98	ldrb w8,[x8, #0x3]
00bb6a9c	add w10,w23,w10
00bb6aa0	add x8,x25,x8
00bb6aa4	lsl x2,x26,x10
00bb6aa8	lsr x2,x2,x1
00bb6aac	add x2,x5,x2, LSL #0x2
00bb6ab0	ldrh w3,[x2]
00bb6ab4	strh w3,[x8]
00bb6ab8	ldrb w3,[x2, #0x2]
00bb6abc	ldrb w2,[x2, #0x3]
00bb6ac0	add w10,w10,w3
00bb6ac4	add x8,x8,x2
00bb6ac8	lsl x3,x26,x10
00bb6acc	lsr x3,x3,x1
00bb6ad0	add x3,x5,x3, LSL #0x2
00bb6ad4	ldrh w4,[x3]
00bb6ad8	strh w4,[x8]
00bb6adc	ldrb w2,[x3, #0x2]
00bb6ae0	ldrb w3,[x3, #0x3]
00bb6ae4	add w10,w10,w2
00bb6ae8	add x8,x8,x3
00bb6aec	lsl x2,x26,x10
00bb6af0	lsr x2,x2,x1
00bb6af4	add x2,x5,x2, LSL #0x2
00bb6af8	ldrh w4,[x2]
00bb6afc	strh w4,[x8]
00bb6b00	ldrb w3,[x2, #0x2]
00bb6b04	ldrb w2,[x2, #0x3]
00bb6b08	add w10,w10,w3
00bb6b0c	add x8,x8,x2
00bb6b10	lsl x3,x26,x10
00bb6b14	lsr x3,x3,x1
00bb6b18	add x3,x5,x3, LSL #0x2
00bb6b1c	ldrh w4,[x3]
00bb6b20	strh w4,[x8]
00bb6b24	ldrb w2,[x3, #0x2]
00bb6b28	add w23,w10,w2
00bb6b2c	ldrb w10,[x3, #0x3]
00bb6b30	cmp w23,#0x40
00bb6b34	add x25,x8,x10
00bb6b38	b.ls 0x00bb6a24
00bb6b3c	b 0x00bb6ca4
00bb6b40	ldp x22,x4,[sp, #0x78]
00bb6b44	mov x0,x3
00bb6b48	mov x14,x10
00bb6b4c	cmp w23,#0x40
00bb6b50	b.hi 0x00bb7c0c
00bb6b54	ldr x8,[sp, #0x60]
00bb6b58	cmp x7,x8
00bb6b5c	b.cs 0x00bb6cb4
00bb6b60	cmp x7,x30
00bb6b64	b.eq 0x00bb6ccc
00bb6b68	lsr w8,w23,#0x3
00bb6b6c	sub w17,w7,w30
00bb6b70	sub x10,x7,x8
00bb6b74	cmp x10,x30
00bb6b78	csel w8,w17,w8,cc
00bb6b7c	ldr x17,[sp, #0x50]
00bb6b80	sub x7,x7,x8
00bb6b84	sub w23,w23,w8, LSL #0x3
00bb6b88	ldr x26,[x7]
00bb6b8c	b 0x00bb6cd0
00bb6b90	cmp w23,#0x40
00bb6b94	b.hi 0x00bb7ba0
00bb6b98	neg w8,w24
00bb6b9c	mov x0,x3
00bb6ba0	sub x17,x3,#0x7
00bb6ba4	and w1,w8,#0x3f
00bb6ba8	adrp x13,0x789000
00bb6bac	add x13,x13,#0x2b0
00bb6bb0	ldr x8,[sp, #0x60]
00bb6bb4	cmp x7,x8
00bb6bb8	b.cs 0x00bb6be8
00bb6bbc	ldr x4,[sp, #0x80]
00bb6bc0	cmp x7,x30
00bb6bc4	b.eq 0x00bb6cc8
00bb6bc8	lsr w8,w23,#0x3
00bb6bcc	sub w2,w7,w30
00bb6bd0	sub x10,x7,x8
00bb6bd4	cmp x10,x30
00bb6bd8	csel w3,w8,w2,cs
00bb6bdc	cset w2,cs
00bb6be0	sub w23,w23,w3, LSL #0x3
00bb6be4	b 0x00bb6bf8
00bb6be8	ldr x4,[sp, #0x80]
00bb6bec	lsr w3,w23,#0x3
00bb6bf0	and w23,w23,#0x7
00bb6bf4	mov w2,#0x1
00bb6bf8	sub x7,x7,w3, UXTW 
00bb6bfc	cmp x25,x17
00bb6c00	ldr x26,[x7]
00bb6c04	b.cs 0x00bb6cac
00bb6c08	cbz w2,0x00bb6cac
00bb6c0c	lsl x8,x26,x23
00bb6c10	lsr x8,x8,x1
00bb6c14	add x8,x5,x8, LSL #0x2
00bb6c18	ldrh w10,[x8]
00bb6c1c	strh w10,[x25]
00bb6c20	ldrb w10,[x8, #0x2]
00bb6c24	ldrb w8,[x8, #0x3]
00bb6c28	add w10,w23,w10
00bb6c2c	add x8,x25,x8
00bb6c30	lsl x2,x26,x10
00bb6c34	lsr x2,x2,x1
00bb6c38	add x2,x5,x2, LSL #0x2
00bb6c3c	ldrh w3,[x2]
00bb6c40	strh w3,[x8]
00bb6c44	ldrb w3,[x2, #0x2]
00bb6c48	ldrb w2,[x2, #0x3]
00bb6c4c	add w10,w10,w3
00bb6c50	add x8,x8,x2
00bb6c54	lsl x3,x26,x10
00bb6c58	lsr x3,x3,x1
00bb6c5c	add x3,x5,x3, LSL #0x2
00bb6c60	ldrh w4,[x3]
00bb6c64	strh w4,[x8]
00bb6c68	ldrb w2,[x3, #0x2]
00bb6c6c	ldrb w3,[x3, #0x3]
00bb6c70	add w10,w10,w2
00bb6c74	add x8,x8,x3
00bb6c78	lsl x2,x26,x10
00bb6c7c	lsr x2,x2,x1
00bb6c80	add x2,x5,x2, LSL #0x2
00bb6c84	ldrh w4,[x2]
00bb6c88	strh w4,[x8]
00bb6c8c	ldrb w3,[x2, #0x2]
00bb6c90	add w23,w10,w3
00bb6c94	ldrb w10,[x2, #0x3]
00bb6c98	cmp w23,#0x40
00bb6c9c	add x25,x8,x10
00bb6ca0	b.ls 0x00bb6bb0
00bb6ca4	mov x7,x13
00bb6ca8	b 0x00bb7bac
00bb6cac	ldr x17,[sp, #0x50]
00bb6cb0	b 0x00bb6cd0
00bb6cb4	lsr w8,w23,#0x3
00bb6cb8	and w23,w23,#0x7
00bb6cbc	sub x7,x7,x8
00bb6cc0	ldr x26,[x7]
00bb6cc4	b 0x00bb6cd0
00bb6cc8	ldr x17,[sp, #0x50]
00bb6ccc	mov x7,x30
00bb6cd0	sub x8,x0,x25
00bb6cd4	cmp x8,#0x2
00bb6cd8	b.cc 0x00bb6d8c
00bb6cdc	neg w8,w24
00bb6ce0	cmp w23,#0x40
00bb6ce4	mov x13,x0
00bb6ce8	sub x17,x0,#0x2
00bb6cec	and w0,w8,#0x3f
00bb6cf0	b.hi 0x00bb7bb8
00bb6cf4	adrp x1,0x789000
00bb6cf8	add x1,x1,#0x2b0
00bb6cfc	ldr x8,[sp, #0x60]
00bb6d00	cmp x7,x8
00bb6d04	b.cs 0x00bb6d30
00bb6d08	cmp x7,x30
00bb6d0c	b.eq 0x00bb6da0
00bb6d10	lsr w8,w23,#0x3
00bb6d14	sub w2,w7,w30
00bb6d18	sub x10,x7,x8
00bb6d1c	cmp x10,x30
00bb6d20	csel w3,w8,w2,cs
00bb6d24	cset w2,cs
00bb6d28	sub w23,w23,w3, LSL #0x3
00bb6d2c	b 0x00bb6d3c
00bb6d30	lsr w3,w23,#0x3
00bb6d34	and w23,w23,#0x7
00bb6d38	mov w2,#0x1
00bb6d3c	sub x7,x7,w3, UXTW 
00bb6d40	cmp x25,x17
00bb6d44	ldr x26,[x7]
00bb6d48	b.hi 0x00bb6d94
00bb6d4c	tbz w2,#0x0,0x00bb6d94
00bb6d50	lsl x8,x26,x23
00bb6d54	lsr x8,x8,x0
00bb6d58	add x8,x5,x8, LSL #0x2
00bb6d5c	ldrh w10,[x8]
00bb6d60	strh w10,[x25]
00bb6d64	ldrb w10,[x8, #0x2]
00bb6d68	ldrb w8,[x8, #0x3]
00bb6d6c	add w23,w23,w10
00bb6d70	add x25,x25,x8
00bb6d74	cmp w23,#0x40
00bb6d78	b.ls 0x00bb6cfc
00bb6d7c	mov x7,x1
00bb6d80	cmp x25,x17
00bb6d84	b.ls 0x00bb6dac
00bb6d88	b 0x00bb6dd8
00bb6d8c	mov x13,x0
00bb6d90	b 0x00bb6ddc
00bb6d94	cmp x25,x17
00bb6d98	b.ls 0x00bb6dac
00bb6d9c	b 0x00bb6dd8
00bb6da0	mov x7,x30
00bb6da4	cmp x25,x17
00bb6da8	b.hi 0x00bb6dd8
00bb6dac	lsl x8,x26,x23
00bb6db0	lsr x8,x8,x0
00bb6db4	add x8,x5,x8, LSL #0x2
00bb6db8	ldrh w10,[x8]
00bb6dbc	strh w10,[x25]
00bb6dc0	ldrb w10,[x8, #0x3]
00bb6dc4	ldrb w8,[x8, #0x2]
00bb6dc8	add x25,x25,x10
00bb6dcc	add w23,w23,w8
00bb6dd0	cmp x25,x17
00bb6dd4	b.ls 0x00bb6dac
00bb6dd8	ldr x17,[sp, #0x50]
00bb6ddc	mov w8,w23
00bb6de0	ldr x23,[sp, #0x88]
00bb6de4	cmp x25,x13
00bb6de8	b.cs 0x00bb6e24
00bb6dec	mov x10,x8
00bb6df0	lsl x8,x26,x8
00bb6df4	mov x26,x10
00bb6df8	neg w10,w24
00bb6dfc	lsr x8,x8,x10
00bb6e00	add x17,x5,x8, LSL #0x2
00bb6e04	ldrb w8,[x17]
00bb6e08	strb w8,[x25]
00bb6e0c	ldrb w8,[x17, #0x3]
00bb6e10	cmp w8,#0x1
00bb6e14	b.ne 0x00bb6e2c
00bb6e18	ldrb w8,[x17, #0x2]
00bb6e1c	add w26,w26,w8
00bb6e20	b 0x00bb6e48
00bb6e24	mov x26,x8
00bb6e28	b 0x00bb6e4c
00bb6e2c	cmp w26,#0x3f
00bb6e30	b.hi 0x00bb6e48
00bb6e34	ldrb w8,[x17, #0x2]
00bb6e38	mov w10,#0x40
00bb6e3c	add w8,w26,w8
00bb6e40	cmp w8,#0x40
00bb6e44	csel w26,w8,w10,cc
00bb6e48	ldr x17,[sp, #0x50]
00bb6e4c	sub x8,x14,x16
00bb6e50	cmp x8,#0x8
00bb6e54	b.cc 0x00bb6f94
00bb6e58	ldr w8,[sp, #0x98]
00bb6e5c	cmp w8,#0xc
00bb6e60	b.cs 0x00bb6fd8
00bb6e64	cmp w27,#0x40
00bb6e68	b.hi 0x00bb7bcc
00bb6e6c	neg w8,w24
00bb6e70	sub x17,x14,#0x9
00bb6e74	adrp x0,0x789000
00bb6e78	add x0,x0,#0x2b0
00bb6e7c	and w1,w8,#0x3f
00bb6e80	ldr x8,[sp, #0x68]
00bb6e84	cmp x11,x8
00bb6e88	b.cs 0x00bb6eb4
00bb6e8c	cmp x11,x15
00bb6e90	b.eq 0x00bb7108
00bb6e94	lsr w8,w27,#0x3
00bb6e98	sub w2,w11,w15
00bb6e9c	sub x10,x11,x8
00bb6ea0	cmp x10,x15
00bb6ea4	csel w3,w8,w2,cs
00bb6ea8	cset w2,cs
00bb6eac	sub w27,w27,w3, LSL #0x3
00bb6eb0	b 0x00bb6ec0
00bb6eb4	lsr w3,w27,#0x3
00bb6eb8	and w27,w27,#0x7
00bb6ebc	mov w2,#0x1
00bb6ec0	sub x11,x11,w3, UXTW 
00bb6ec4	cmp x16,x17
00bb6ec8	ldr x23,[x11]
00bb6ecc	b.cs 0x00bb70ec
00bb6ed0	cbz w2,0x00bb70ec
00bb6ed4	lsl x8,x23,x27
00bb6ed8	lsr x8,x8,x1
00bb6edc	add x8,x5,x8, LSL #0x2
00bb6ee0	ldrh w10,[x8]
00bb6ee4	strh w10,[x16]
00bb6ee8	ldrb w10,[x8, #0x2]
00bb6eec	ldrb w8,[x8, #0x3]
00bb6ef0	add w10,w27,w10
00bb6ef4	add x8,x16,x8
00bb6ef8	lsl x2,x23,x10
00bb6efc	lsr x2,x2,x1
00bb6f00	add x2,x5,x2, LSL #0x2
00bb6f04	ldrh w3,[x2]
00bb6f08	strh w3,[x8]
00bb6f0c	ldrb w16,[x2, #0x2]
00bb6f10	ldrb w2,[x2, #0x3]
00bb6f14	add w10,w10,w16
00bb6f18	add x8,x8,x2
00bb6f1c	lsl x16,x23,x10
00bb6f20	lsr x16,x16,x1
00bb6f24	add x16,x5,x16, LSL #0x2
00bb6f28	ldrh w3,[x16]
00bb6f2c	strh w3,[x8]
00bb6f30	ldrb w2,[x16, #0x2]
00bb6f34	ldrb w16,[x16, #0x3]
00bb6f38	add w10,w10,w2
00bb6f3c	add x8,x8,x16
00bb6f40	lsl x2,x23,x10
00bb6f44	lsr x2,x2,x1
00bb6f48	add x2,x5,x2, LSL #0x2
00bb6f4c	ldrh w3,[x2]
00bb6f50	strh w3,[x8]
00bb6f54	ldrb w16,[x2, #0x2]
00bb6f58	ldrb w2,[x2, #0x3]
00bb6f5c	add w10,w10,w16
00bb6f60	add x8,x8,x2
00bb6f64	lsl x16,x23,x10
00bb6f68	lsr x16,x16,x1
00bb6f6c	add x16,x5,x16, LSL #0x2
00bb6f70	ldrh w3,[x16]
00bb6f74	strh w3,[x8]
00bb6f78	ldrb w2,[x16, #0x2]
00bb6f7c	add w27,w10,w2
00bb6f80	ldrb w10,[x16, #0x3]
00bb6f84	cmp w27,#0x40
00bb6f88	add x16,x8,x10
00bb6f8c	b.ls 0x00bb6e80
00bb6f90	b 0x00bb70e0
00bb6f94	cmp w27,#0x40
00bb6f98	b.hi 0x00bb7bd0
00bb6f9c	ldr x8,[sp, #0x68]
00bb6fa0	cmp x11,x8
00bb6fa4	b.cs 0x00bb70f4
00bb6fa8	cmp x11,x15
00bb6fac	b.eq 0x00bb710c
00bb6fb0	lsr w8,w27,#0x3
00bb6fb4	sub w17,w11,w15
00bb6fb8	sub x10,x11,x8
00bb6fbc	cmp x10,x15
00bb6fc0	csel w8,w17,w8,cc
00bb6fc4	ldr x17,[sp, #0x50]
00bb6fc8	sub x11,x11,x8
00bb6fcc	sub w27,w27,w8, LSL #0x3
00bb6fd0	ldr x23,[x11]
00bb6fd4	b 0x00bb7110
00bb6fd8	cmp w27,#0x40
00bb6fdc	b.hi 0x00bb7bcc
00bb6fe0	neg w8,w24
00bb6fe4	sub x17,x14,#0x7
00bb6fe8	adrp x0,0x789000
00bb6fec	add x0,x0,#0x2b0
00bb6ff0	and w1,w8,#0x3f
00bb6ff4	ldr x8,[sp, #0x68]
00bb6ff8	cmp x11,x8
00bb6ffc	b.cs 0x00bb7028
00bb7000	cmp x11,x15
00bb7004	b.eq 0x00bb7108
00bb7008	lsr w8,w27,#0x3
00bb700c	sub w2,w11,w15
00bb7010	sub x10,x11,x8
00bb7014	cmp x10,x15
00bb7018	csel w3,w8,w2,cs
00bb701c	cset w2,cs
00bb7020	sub w27,w27,w3, LSL #0x3
00bb7024	b 0x00bb7034
00bb7028	lsr w3,w27,#0x3
00bb702c	and w27,w27,#0x7
00bb7030	mov w2,#0x1
00bb7034	sub x11,x11,w3, UXTW 
00bb7038	cmp x16,x17
00bb703c	ldr x23,[x11]
00bb7040	b.cs 0x00bb70ec
00bb7044	cbz w2,0x00bb70ec
00bb7048	lsl x8,x23,x27
00bb704c	lsr x8,x8,x1
00bb7050	add x8,x5,x8, LSL #0x2
00bb7054	ldrh w10,[x8]
00bb7058	strh w10,[x16]
00bb705c	ldrb w10,[x8, #0x2]
00bb7060	ldrb w8,[x8, #0x3]
00bb7064	add w10,w27,w10
00bb7068	add x8,x16,x8
00bb706c	lsl x2,x23,x10
00bb7070	lsr x2,x2,x1
00bb7074	add x2,x5,x2, LSL #0x2
00bb7078	ldrh w3,[x2]
00bb707c	strh w3,[x8]
00bb7080	ldrb w16,[x2, #0x2]
00bb7084	ldrb w2,[x2, #0x3]
00bb7088	add w10,w10,w16
00bb708c	add x8,x8,x2
00bb7090	lsl x16,x23,x10
00bb7094	lsr x16,x16,x1
00bb7098	add x16,x5,x16, LSL #0x2
00bb709c	ldrh w3,[x16]
00bb70a0	strh w3,[x8]
00bb70a4	ldrb w2,[x16, #0x2]
00bb70a8	ldrb w16,[x16, #0x3]
00bb70ac	add w10,w10,w2
00bb70b0	add x8,x8,x16
00bb70b4	lsl x2,x23,x10
00bb70b8	lsr x2,x2,x1
00bb70bc	add x2,x5,x2, LSL #0x2
00bb70c0	ldrh w3,[x2]
00bb70c4	strh w3,[x8]
00bb70c8	ldrb w16,[x2, #0x2]
00bb70cc	add w27,w10,w16
00bb70d0	ldrb w10,[x2, #0x3]
00bb70d4	cmp w27,#0x40
00bb70d8	add x16,x8,x10
00bb70dc	b.ls 0x00bb6ff4
00bb70e0	ldr x17,[sp, #0x50]
00bb70e4	mov x11,x0
00bb70e8	b 0x00bb7110
00bb70ec	ldr x17,[sp, #0x50]
00bb70f0	b 0x00bb7110
00bb70f4	lsr w8,w27,#0x3
00bb70f8	and w27,w27,#0x7
00bb70fc	sub x11,x11,x8
00bb7100	ldr x23,[x11]
00bb7104	b 0x00bb7110
00bb7108	ldr x17,[sp, #0x50]
00bb710c	mov x11,x15
00bb7110	sub x8,x14,x16
00bb7114	mov x10,x14
00bb7118	cmp x8,#0x2
00bb711c	b.cc 0x00bb71d0
00bb7120	neg w8,w24
00bb7124	cmp w27,#0x40
00bb7128	mov x14,x10
00bb712c	sub x17,x10,#0x2
00bb7130	and w0,w8,#0x3f
00bb7134	b.hi 0x00bb7bdc
00bb7138	adrp x1,0x789000
00bb713c	add x1,x1,#0x2b0
00bb7140	ldr x8,[sp, #0x68]
00bb7144	cmp x11,x8
00bb7148	b.cs 0x00bb7174
00bb714c	cmp x11,x15
00bb7150	b.eq 0x00bb71e4
00bb7154	lsr w8,w27,#0x3
00bb7158	sub w2,w11,w15
00bb715c	sub x10,x11,x8
00bb7160	cmp x10,x15
00bb7164	csel w3,w8,w2,cs
00bb7168	cset w2,cs
00bb716c	sub w27,w27,w3, LSL #0x3
00bb7170	b 0x00bb7180
00bb7174	lsr w3,w27,#0x3
00bb7178	and w27,w27,#0x7
00bb717c	mov w2,#0x1
00bb7180	sub x11,x11,w3, UXTW 
00bb7184	cmp x16,x17
00bb7188	ldr x23,[x11]
00bb718c	b.hi 0x00bb71d8
00bb7190	tbz w2,#0x0,0x00bb71d8
00bb7194	lsl x8,x23,x27
00bb7198	lsr x8,x8,x0
00bb719c	add x8,x5,x8, LSL #0x2
00bb71a0	ldrh w10,[x8]
00bb71a4	strh w10,[x16]
00bb71a8	ldrb w10,[x8, #0x2]
00bb71ac	ldrb w8,[x8, #0x3]
00bb71b0	add w27,w27,w10
00bb71b4	add x16,x16,x8
00bb71b8	cmp w27,#0x40
00bb71bc	b.ls 0x00bb7140
00bb71c0	mov x11,x1
00bb71c4	cmp x16,x17
00bb71c8	b.ls 0x00bb71f0
00bb71cc	b 0x00bb721c
00bb71d0	mov x14,x10
00bb71d4	b 0x00bb7220
00bb71d8	cmp x16,x17
00bb71dc	b.ls 0x00bb71f0
00bb71e0	b 0x00bb721c
00bb71e4	mov x11,x15
00bb71e8	cmp x16,x17
00bb71ec	b.hi 0x00bb721c
00bb71f0	lsl x8,x23,x27
00bb71f4	lsr x8,x8,x0
00bb71f8	add x8,x5,x8, LSL #0x2
00bb71fc	ldrh w10,[x8]
00bb7200	strh w10,[x16]
00bb7204	ldrb w10,[x8, #0x3]
00bb7208	ldrb w8,[x8, #0x2]
00bb720c	add x16,x16,x10
00bb7210	add w27,w27,w8
00bb7214	cmp x16,x17
00bb7218	b.ls 0x00bb71f0
00bb721c	ldr x17,[sp, #0x50]
00bb7220	cmp x16,x14
00bb7224	mov x2,x15
00bb7228	b.cs 0x00bb7260
00bb722c	lsl x8,x23,x27
00bb7230	neg w10,w24
00bb7234	ldr w13,[sp, #0x98]
00bb7238	lsr x8,x8,x10
00bb723c	add x15,x5,x8, LSL #0x2
00bb7240	ldrb w8,[x15]
00bb7244	strb w8,[x16]
00bb7248	ldrb w8,[x15, #0x3]
00bb724c	cmp w8,#0x1
00bb7250	b.ne 0x00bb7268
00bb7254	ldrb w8,[x15, #0x2]
00bb7258	add w27,w27,w8
00bb725c	b 0x00bb7284
00bb7260	ldr w13,[sp, #0x98]
00bb7264	b 0x00bb7288
00bb7268	cmp w27,#0x3f
00bb726c	b.hi 0x00bb7284
00bb7270	ldrb w8,[x15, #0x2]
00bb7274	mov w10,#0x40
00bb7278	add w8,w27,w8
00bb727c	cmp w8,#0x40
00bb7280	csel w27,w8,w10,cc
00bb7284	mov x15,x2
00bb7288	sub x8,x17,x12
00bb728c	cmp x8,#0x8
00bb7290	b.cc 0x00bb73cc
00bb7294	cmp w13,#0xc
00bb7298	b.cs 0x00bb7410
00bb729c	cmp w28,#0x40
00bb72a0	b.hi 0x00bb7bf0
00bb72a4	neg w8,w24
00bb72a8	sub x15,x17,#0x9
00bb72ac	adrp x16,0x789000
00bb72b0	add x16,x16,#0x2b0
00bb72b4	and w17,w8,#0x3f
00bb72b8	ldr x8,[sp, #0x70]
00bb72bc	cmp x22,x8
00bb72c0	b.cs 0x00bb72ec
00bb72c4	cmp x22,x19
00bb72c8	b.eq 0x00bb7538
00bb72cc	lsr w8,w28,#0x3
00bb72d0	sub w0,w22,w19
00bb72d4	sub x10,x22,x8
00bb72d8	cmp x10,x19
00bb72dc	csel w1,w8,w0,cs
00bb72e0	cset w0,cs
00bb72e4	sub w28,w28,w1, LSL #0x3
00bb72e8	b 0x00bb72f8
00bb72ec	lsr w1,w28,#0x3
00bb72f0	and w28,w28,#0x7
00bb72f4	mov w0,#0x1
00bb72f8	sub x22,x22,w1, UXTW 
00bb72fc	cmp x12,x15
00bb7300	ldr x4,[x22]
00bb7304	b.cs 0x00bb7520
00bb7308	cbz w0,0x00bb7520
00bb730c	lsl x8,x4,x28
00bb7310	lsr x8,x8,x17
00bb7314	add x8,x5,x8, LSL #0x2
00bb7318	ldrh w10,[x8]
00bb731c	strh w10,[x12]
00bb7320	ldrb w10,[x8, #0x2]
00bb7324	ldrb w8,[x8, #0x3]
00bb7328	add w10,w28,w10
00bb732c	add x8,x12,x8
00bb7330	lsl x0,x4,x10
00bb7334	lsr x0,x0,x17
00bb7338	add x0,x5,x0, LSL #0x2
00bb733c	ldrh w1,[x0]
00bb7340	strh w1,[x8]
00bb7344	ldrb w12,[x0, #0x2]
00bb7348	ldrb w0,[x0, #0x3]
00bb734c	add w10,w10,w12
00bb7350	add x8,x8,x0
00bb7354	lsl x12,x4,x10
00bb7358	lsr x12,x12,x17
00bb735c	add x12,x5,x12, LSL #0x2
00bb7360	ldrh w1,[x12]
00bb7364	strh w1,[x8]
00bb7368	ldrb w0,[x12, #0x2]
00bb736c	ldrb w12,[x12, #0x3]
00bb7370	add w10,w10,w0
00bb7374	add x8,x8,x12
00bb7378	lsl x0,x4,x10
00bb737c	lsr x0,x0,x17
00bb7380	add x0,x5,x0, LSL #0x2
00bb7384	ldrh w1,[x0]
00bb7388	strh w1,[x8]
00bb738c	ldrb w12,[x0, #0x2]
00bb7390	ldrb w0,[x0, #0x3]
00bb7394	add w10,w10,w12
00bb7398	add x8,x8,x0
00bb739c	lsl x12,x4,x10
00bb73a0	lsr x12,x12,x17
00bb73a4	add x12,x5,x12, LSL #0x2
00bb73a8	ldrh w1,[x12]
00bb73ac	strh w1,[x8]
00bb73b0	ldrb w0,[x12, #0x2]
00bb73b4	add w28,w10,w0
00bb73b8	ldrb w10,[x12, #0x3]
00bb73bc	cmp w28,#0x40
00bb73c0	add x12,x8,x10
00bb73c4	b.ls 0x00bb72b8
00bb73c8	b 0x00bb7518
00bb73cc	cmp w28,#0x40
00bb73d0	b.hi 0x00bb7c18
00bb73d4	ldr x8,[sp, #0x70]
00bb73d8	cmp x22,x8
00bb73dc	b.cs 0x00bb7524
00bb73e0	cmp x22,x19
00bb73e4	b.eq 0x00bb7b98
00bb73e8	lsr w8,w28,#0x3
00bb73ec	sub w15,w22,w19
00bb73f0	sub x10,x22,x8
00bb73f4	cmp x10,x19
00bb73f8	csel w8,w15,w8,cc
00bb73fc	mov x15,x2
00bb7400	sub x22,x22,x8
00bb7404	sub w28,w28,w8, LSL #0x3
00bb7408	ldr x4,[x22]
00bb740c	b 0x00bb7544
00bb7410	cmp w28,#0x40
00bb7414	b.hi 0x00bb7bf0
00bb7418	neg w8,w24
00bb741c	sub x15,x17,#0x7
00bb7420	adrp x16,0x789000
00bb7424	add x16,x16,#0x2b0
00bb7428	and w17,w8,#0x3f
00bb742c	ldr x8,[sp, #0x70]
00bb7430	cmp x22,x8
00bb7434	b.cs 0x00bb7460
00bb7438	cmp x22,x19
00bb743c	b.eq 0x00bb7538
00bb7440	lsr w8,w28,#0x3
00bb7444	sub w0,w22,w19
00bb7448	sub x10,x22,x8
00bb744c	cmp x10,x19
00bb7450	csel w1,w8,w0,cs
00bb7454	cset w0,cs
00bb7458	sub w28,w28,w1, LSL #0x3
00bb745c	b 0x00bb746c
00bb7460	lsr w1,w28,#0x3
00bb7464	and w28,w28,#0x7
00bb7468	mov w0,#0x1
00bb746c	sub x22,x22,w1, UXTW 
00bb7470	cmp x12,x15
00bb7474	ldr x4,[x22]
00bb7478	b.cs 0x00bb7520
00bb747c	cbz w0,0x00bb7520
00bb7480	lsl x8,x4,x28
00bb7484	lsr x8,x8,x17
00bb7488	add x8,x5,x8, LSL #0x2
00bb748c	ldrh w10,[x8]
00bb7490	strh w10,[x12]
00bb7494	ldrb w10,[x8, #0x2]
00bb7498	ldrb w8,[x8, #0x3]
00bb749c	add w10,w28,w10
00bb74a0	add x8,x12,x8
00bb74a4	lsl x0,x4,x10
00bb74a8	lsr x0,x0,x17
00bb74ac	add x0,x5,x0, LSL #0x2
00bb74b0	ldrh w1,[x0]
00bb74b4	strh w1,[x8]
00bb74b8	ldrb w12,[x0, #0x2]
00bb74bc	ldrb w0,[x0, #0x3]
00bb74c0	add w10,w10,w12
00bb74c4	add x8,x8,x0
00bb74c8	lsl x12,x4,x10
00bb74cc	lsr x12,x12,x17
00bb74d0	add x12,x5,x12, LSL #0x2
00bb74d4	ldrh w1,[x12]
00bb74d8	strh w1,[x8]
00bb74dc	ldrb w0,[x12, #0x2]
00bb74e0	ldrb w12,[x12, #0x3]
00bb74e4	add w10,w10,w0
00bb74e8	add x8,x8,x12
00bb74ec	lsl x0,x4,x10
00bb74f0	lsr x0,x0,x17
00bb74f4	add x0,x5,x0, LSL #0x2
00bb74f8	ldrh w1,[x0]
00bb74fc	strh w1,[x8]
00bb7500	ldrb w12,[x0, #0x2]
00bb7504	add w28,w10,w12
00bb7508	ldrb w10,[x0, #0x3]
00bb750c	cmp w28,#0x40
00bb7510	add x12,x8,x10
00bb7514	b.ls 0x00bb742c
00bb7518	mov x22,x16
00bb751c	b 0x00bb753c
00bb7520	b 0x00bb753c
00bb7524	lsr w8,w28,#0x3
00bb7528	and w28,w28,#0x7
00bb752c	sub x22,x22,x8
00bb7530	ldr x4,[x22]
00bb7534	b 0x00bb7544
00bb7538	mov x22,x19
00bb753c	ldr x17,[sp, #0x50]
00bb7540	mov x15,x2
00bb7544	sub x8,x17,x12
00bb7548	cmp x8,#0x2
00bb754c	b.cc 0x00bb75f4
00bb7550	neg w8,w24
00bb7554	cmp w28,#0x40
00bb7558	sub x15,x17,#0x2
00bb755c	and w16,w8,#0x3f
00bb7560	b.hi 0x00bb7bfc
00bb7564	adrp x17,0x789000
00bb7568	add x17,x17,#0x2b0
00bb756c	ldr x8,[sp, #0x70]
00bb7570	cmp x22,x8
00bb7574	b.cs 0x00bb75a0
00bb7578	cmp x22,x19
00bb757c	b.eq 0x00bb75fc
00bb7580	lsr w8,w28,#0x3
00bb7584	sub w0,w22,w19
00bb7588	sub x10,x22,x8
00bb758c	cmp x10,x19
00bb7590	csel w1,w8,w0,cs
00bb7594	cset w0,cs
00bb7598	sub w28,w28,w1, LSL #0x3
00bb759c	b 0x00bb75ac
00bb75a0	lsr w1,w28,#0x3
00bb75a4	and w28,w28,#0x7
00bb75a8	mov w0,#0x1
00bb75ac	sub x22,x22,w1, UXTW 
00bb75b0	cmp x12,x15
00bb75b4	ldr x4,[x22]
00bb75b8	b.hi 0x00bb75f8
00bb75bc	tbz w0,#0x0,0x00bb75f8
00bb75c0	lsl x8,x4,x28
00bb75c4	lsr x8,x8,x16
00bb75c8	add x8,x5,x8, LSL #0x2
00bb75cc	ldrh w10,[x8]
00bb75d0	strh w10,[x12]
00bb75d4	ldrb w10,[x8, #0x2]
00bb75d8	ldrb w8,[x8, #0x3]
00bb75dc	add w28,w28,w10
00bb75e0	add x12,x12,x8
00bb75e4	cmp w28,#0x40
00bb75e8	b.ls 0x00bb756c
00bb75ec	mov x22,x17
00bb75f0	b 0x00bb7600
00bb75f4	b 0x00bb763c
00bb75f8	b 0x00bb7600
00bb75fc	mov x22,x19
00bb7600	ldr x17,[sp, #0x50]
00bb7604	cmp x12,x15
00bb7608	b.hi 0x00bb7638
00bb760c	lsl x8,x4,x28
00bb7610	lsr x8,x8,x16
00bb7614	add x8,x5,x8, LSL #0x2
00bb7618	ldrh w10,[x8]
00bb761c	strh w10,[x12]
00bb7620	ldrb w10,[x8, #0x3]
00bb7624	ldrb w8,[x8, #0x2]
00bb7628	add x12,x12,x10
00bb762c	add w28,w28,w8
00bb7630	cmp x12,x15
00bb7634	b.ls 0x00bb760c
00bb7638	mov x15,x2
00bb763c	mov x0,x11
00bb7640	cmp x12,x17
00bb7644	b.cs 0x00bb767c
00bb7648	lsl x8,x4,x28
00bb764c	neg w10,w24
00bb7650	ldr x17,[sp, #0x58]
00bb7654	lsr x8,x8,x10
00bb7658	add x11,x5,x8, LSL #0x2
00bb765c	ldrb w8,[x11]
00bb7660	strb w8,[x12]
00bb7664	ldrb w8,[x11, #0x3]
00bb7668	cmp w8,#0x1
00bb766c	b.ne 0x00bb7860
00bb7670	ldrb w8,[x11, #0x2]
00bb7674	add w28,w28,w8
00bb7678	b 0x00bb7680
00bb767c	ldr x17,[sp, #0x58]
00bb7680	sub x8,x6,x9
00bb7684	cmp x8,#0x8
00bb7688	b.cc 0x00bb7808
00bb768c	ldr w11,[sp, #0xb0]
00bb7690	cmp w13,#0xc
00bb7694	b.cs 0x00bb7880
00bb7698	cmp w11,#0x40
00bb769c	b.hi 0x00bb79b8
00bb76a0	neg w8,w24
00bb76a4	sub x10,x6,#0x9
00bb76a8	and w12,w8,#0x3f
00bb76ac	ldr x14,[sp, #0xb8]
00bb76b0	ldr x8,[sp, #0xc8]
00bb76b4	cmp x14,x8
00bb76b8	b.cs 0x00bb76e8
00bb76bc	ldr x15,[sp, #0xc0]
00bb76c0	cmp x14,x15
00bb76c4	b.eq 0x00bb79f0
00bb76c8	lsr w8,w11,#0x3
00bb76cc	sub w17,w14,w15
00bb76d0	sub x16,x14,x8
00bb76d4	cmp x16,x15
00bb76d8	csel w8,w8,w17,cs
00bb76dc	cset w15,cs
00bb76e0	sub w11,w11,w8, LSL #0x3
00bb76e4	b 0x00bb76f4
00bb76e8	lsr w8,w11,#0x3
00bb76ec	and w11,w11,#0x7
00bb76f0	mov w15,#0x1
00bb76f4	sub x14,x14,x8
00bb76f8	str x14,[sp, #0xb8]
00bb76fc	str w11,[sp, #0xb0]
00bb7700	cmp x9,x10
00bb7704	ldr x14,[x14]
00bb7708	str x14,[sp, #0xa8]
00bb770c	b.cs 0x00bb79cc
00bb7710	cbz w15,0x00bb79cc
00bb7714	lsl x8,x14,x11
00bb7718	lsr x8,x8,x12
00bb771c	add x8,x5,x8, LSL #0x2
00bb7720	ldrh w14,[x8]
00bb7724	strh w14,[x9]
00bb7728	ldrb w14,[x8, #0x2]
00bb772c	ldr x15,[sp, #0xa8]
00bb7730	ldrb w8,[x8, #0x3]
00bb7734	add w11,w11,w14
00bb7738	add x8,x9,x8
00bb773c	lsl x14,x15,x11
00bb7740	str w11,[sp, #0xb0]
00bb7744	lsr x14,x14,x12
00bb7748	add x14,x5,x14, LSL #0x2
00bb774c	ldrh w15,[x14]
00bb7750	strh w15,[x8]
00bb7754	ldrb w9,[x14, #0x2]
00bb7758	ldr w11,[sp, #0xb0]
00bb775c	ldr x15,[sp, #0xa8]
00bb7760	ldrb w14,[x14, #0x3]
00bb7764	add w9,w11,w9
00bb7768	lsl x11,x15,x9
00bb776c	add x8,x8,x14
00bb7770	str w9,[sp, #0xb0]
00bb7774	lsr x11,x11,x12
00bb7778	add x11,x5,x11, LSL #0x2
00bb777c	ldrh w15,[x11]
00bb7780	strh w15,[x8]
00bb7784	ldrb w9,[x11, #0x2]
00bb7788	ldr w14,[sp, #0xb0]
00bb778c	ldr x15,[sp, #0xa8]
00bb7790	ldrb w11,[x11, #0x3]
00bb7794	add w9,w14,w9
00bb7798	lsl x14,x15,x9
00bb779c	add x8,x8,x11
00bb77a0	str w9,[sp, #0xb0]
00bb77a4	lsr x14,x14,x12
00bb77a8	add x14,x5,x14, LSL #0x2
00bb77ac	ldrh w15,[x14]
00bb77b0	strh w15,[x8]
00bb77b4	ldrb w9,[x14, #0x2]
00bb77b8	ldr w11,[sp, #0xb0]
00bb77bc	ldr x15,[sp, #0xa8]
00bb77c0	add w9,w11,w9
00bb77c4	lsl x11,x15,x9
00bb77c8	str w9,[sp, #0xb0]
00bb77cc	lsr x11,x11,x12
00bb77d0	add x15,x5,x11, LSL #0x2
00bb77d4	ldrb w11,[x14, #0x3]
00bb77d8	ldrh w14,[x15]
00bb77dc	add x8,x8,x11
00bb77e0	strh w14,[x8]
00bb77e4	ldrb w9,[x15, #0x2]
00bb77e8	ldr w11,[sp, #0xb0]
00bb77ec	add w11,w11,w9
00bb77f0	ldrb w9,[x15, #0x3]
00bb77f4	cmp w11,#0x40
00bb77f8	str w11,[sp, #0xb0]
00bb77fc	add x9,x8,x9
00bb7800	b.ls 0x00bb76ac
00bb7804	b 0x00bb79b8
00bb7808	ldr w11,[sp, #0xb0]
00bb780c	cmp w11,#0x41
00bb7810	b.cs 0x00bb7c24
00bb7814	ldr x10,[sp, #0xb8]
00bb7818	ldr x8,[sp, #0xc8]
00bb781c	cmp x10,x8
00bb7820	b.cs 0x00bb79d4
00bb7824	ldr x12,[sp, #0xc0]
00bb7828	cmp x10,x12
00bb782c	b.eq 0x00bb79f4
00bb7830	lsr x8,x11,#0x3
00bb7834	sub w15,w10,w12
00bb7838	sub x14,x10,x8
00bb783c	cmp x14,x12
00bb7840	csel w8,w15,w8,cc
00bb7844	mov x15,x2
00bb7848	sub w11,w11,w8, LSL #0x3
00bb784c	sub x10,x10,x8
00bb7850	str x10,[sp, #0xb8]
00bb7854	str w11,[sp, #0xb0]
00bb7858	ldr x8,[x10]
00bb785c	b 0x00bb79e8
00bb7860	cmp w28,#0x3f
00bb7864	b.hi 0x00bb7680
00bb7868	ldrb w8,[x11, #0x2]
00bb786c	mov w10,#0x40
00bb7870	add w8,w28,w8
00bb7874	cmp w8,#0x40
00bb7878	csel w28,w8,w10,cc
00bb787c	b 0x00bb7680
00bb7880	cmp w11,#0x40
00bb7884	b.hi 0x00bb79b8
00bb7888	neg w8,w24
00bb788c	and w12,w8,#0x3f
00bb7890	ldr x14,[sp, #0xb8]
00bb7894	ldr x8,[sp, #0xc8]
00bb7898	cmp x14,x8
00bb789c	b.cs 0x00bb78cc
00bb78a0	ldr x15,[sp, #0xc0]
00bb78a4	cmp x14,x15
00bb78a8	b.eq 0x00bb79f0
00bb78ac	lsr w8,w11,#0x3
00bb78b0	sub w16,w14,w15
00bb78b4	sub x10,x14,x8
00bb78b8	cmp x10,x15
00bb78bc	csel w8,w8,w16,cs
00bb78c0	cset w15,cs
00bb78c4	sub w11,w11,w8, LSL #0x3
00bb78c8	b 0x00bb78d8
00bb78cc	lsr w8,w11,#0x3
00bb78d0	and w11,w11,#0x7
00bb78d4	mov w15,#0x1
00bb78d8	sub x14,x14,x8
00bb78dc	str x14,[sp, #0xb8]
00bb78e0	str w11,[sp, #0xb0]
00bb78e4	cmp x9,x17
00bb78e8	ldr x14,[x14]
00bb78ec	str x14,[sp, #0xa8]
00bb78f0	b.cs 0x00bb79cc
00bb78f4	cbz w15,0x00bb79cc
00bb78f8	lsl x8,x14,x11
00bb78fc	lsr x8,x8,x12
00bb7900	add x8,x5,x8, LSL #0x2
00bb7904	ldrh w10,[x8]
00bb7908	strh w10,[x9]
00bb790c	ldrb w10,[x8, #0x2]
00bb7910	ldr x14,[sp, #0xa8]
00bb7914	ldrb w8,[x8, #0x3]
00bb7918	add w10,w11,w10
00bb791c	add x8,x9,x8
00bb7920	lsl x11,x14,x10
00bb7924	str w10,[sp, #0xb0]
00bb7928	lsr x11,x11,x12
00bb792c	add x11,x5,x11, LSL #0x2
00bb7930	ldrh w14,[x11]
00bb7934	strh w14,[x8]
00bb7938	ldrb w9,[x11, #0x2]
00bb793c	ldr w10,[sp, #0xb0]
00bb7940	ldr x14,[sp, #0xa8]
00bb7944	ldrb w11,[x11, #0x3]
00bb7948	add w9,w10,w9
00bb794c	lsl x10,x14,x9
00bb7950	add x8,x8,x11
00bb7954	str w9,[sp, #0xb0]
00bb7958	lsr x10,x10,x12
00bb795c	add x10,x5,x10, LSL #0x2
00bb7960	ldrh w14,[x10]
00bb7964	strh w14,[x8]
00bb7968	ldrb w9,[x10, #0x2]
00bb796c	ldr w11,[sp, #0xb0]
00bb7970	ldr x14,[sp, #0xa8]
00bb7974	ldrb w10,[x10, #0x3]
00bb7978	add w9,w11,w9
00bb797c	lsl x11,x14,x9
00bb7980	add x8,x8,x10
00bb7984	str w9,[sp, #0xb0]
00bb7988	lsr x11,x11,x12
00bb798c	add x14,x5,x11, LSL #0x2
00bb7990	ldrh w11,[x14]
00bb7994	strh w11,[x8]
00bb7998	ldrb w9,[x14, #0x2]
00bb799c	ldr w10,[sp, #0xb0]
00bb79a0	add w11,w10,w9
00bb79a4	ldrb w9,[x14, #0x3]
00bb79a8	cmp w11,#0x40
00bb79ac	str w11,[sp, #0xb0]
00bb79b0	add x9,x8,x9
00bb79b4	b.ls 0x00bb7890
00bb79b8	adrp x8,0x789000
00bb79bc	add x8,x8,#0x2b0
00bb79c0	mov x15,x2
00bb79c4	str x8,[sp, #0xb8]
00bb79c8	b 0x00bb79f4
00bb79cc	mov x15,x2
00bb79d0	b 0x00bb79f4
00bb79d4	sub x8,x10,x11, LSR #0x3
00bb79d8	and w11,w11,#0x7
00bb79dc	str w11,[sp, #0xb0]
00bb79e0	str x8,[sp, #0xb8]
00bb79e4	ldr x8,[x8]
00bb79e8	str x8,[sp, #0xa8]
00bb79ec	b 0x00bb79f4
00bb79f0	mov x15,x2
00bb79f4	sub x8,x6,x9
00bb79f8	cmp x8,#0x2
00bb79fc	b.cc 0x00bb7b04
00bb7a00	neg w8,w24
00bb7a04	cmp w11,#0x40
00bb7a08	sub x10,x6,#0x2
00bb7a0c	and w12,w8,#0x3f
00bb7a10	b.hi 0x00bb7ab0
00bb7a14	ldr x14,[sp, #0xb8]
00bb7a18	ldr x8,[sp, #0xc8]
00bb7a1c	cmp x14,x8
00bb7a20	b.cs 0x00bb7a50
00bb7a24	ldr x15,[sp, #0xc0]
00bb7a28	cmp x14,x15
00bb7a2c	b.eq 0x00bb7abc
00bb7a30	lsr w8,w11,#0x3
00bb7a34	sub w17,w14,w15
00bb7a38	sub x16,x14,x8
00bb7a3c	cmp x16,x15
00bb7a40	csel w8,w8,w17,cs
00bb7a44	cset w15,cs
00bb7a48	sub w11,w11,w8, LSL #0x3
00bb7a4c	b 0x00bb7a5c
00bb7a50	lsr w8,w11,#0x3
00bb7a54	and w11,w11,#0x7
00bb7a58	mov w15,#0x1
00bb7a5c	sub x14,x14,x8
00bb7a60	str x14,[sp, #0xb8]
00bb7a64	str w11,[sp, #0xb0]
00bb7a68	cmp x9,x10
00bb7a6c	ldr x14,[x14]
00bb7a70	str x14,[sp, #0xa8]
00bb7a74	b.hi 0x00bb7abc
00bb7a78	tbz w15,#0x0,0x00bb7abc
00bb7a7c	lsl x8,x14,x11
00bb7a80	lsr x8,x8,x12
00bb7a84	add x8,x5,x8, LSL #0x2
00bb7a88	ldrh w11,[x8]
00bb7a8c	strh w11,[x9]
00bb7a90	ldrb w11,[x8, #0x2]
00bb7a94	ldr w14,[sp, #0xb0]
00bb7a98	ldrb w8,[x8, #0x3]
00bb7a9c	add w11,w14,w11
00bb7aa0	add x9,x9,x8
00bb7aa4	cmp w11,#0x40
00bb7aa8	str w11,[sp, #0xb0]
00bb7aac	b.ls 0x00bb7a14
00bb7ab0	adrp x8,0x789000
00bb7ab4	add x8,x8,#0x2b0
00bb7ab8	str x8,[sp, #0xb8]
00bb7abc	cmp x9,x10
00bb7ac0	mov x15,x2
00bb7ac4	b.hi 0x00bb7b04
00bb7ac8	ldr x8,[sp, #0xa8]
00bb7acc	lsl x8,x8,x11
00bb7ad0	lsr x8,x8,x12
00bb7ad4	add x8,x5,x8, LSL #0x2
00bb7ad8	ldrh w11,[x8]
00bb7adc	strh w11,[x9]
00bb7ae0	ldrb w11,[x8, #0x3]
00bb7ae4	ldrb w8,[x8, #0x2]
00bb7ae8	ldr w14,[sp, #0xb0]
00bb7aec	add x9,x9,x11
00bb7af0	add w11,w14,w8
00bb7af4	cmp x9,x10
00bb7af8	str w11,[sp, #0xb0]
00bb7afc	b.ls 0x00bb7ac8
00bb7b00	b 0x00bb7b04
00bb7b04	cmp x9,x6
00bb7b08	b.cs 0x00bb7b64
00bb7b0c	ldr x8,[sp, #0xa8]
00bb7b10	neg w10,w24
00bb7b14	lsl x8,x8,x11
00bb7b18	lsr x8,x8,x10
00bb7b1c	add x8,x5,x8, LSL #0x2
00bb7b20	ldrb w10,[x8]
00bb7b24	strb w10,[x9]
00bb7b28	ldrb w9,[x8, #0x3]
00bb7b2c	cmp w9,#0x1
00bb7b30	b.ne 0x00bb7b44
00bb7b34	ldrb w8,[x8, #0x2]
00bb7b38	ldr w9,[sp, #0xb0]
00bb7b3c	add w11,w9,w8
00bb7b40	b 0x00bb7b64
00bb7b44	ldr w11,[sp, #0xb0]
00bb7b48	cmp w11,#0x3f
00bb7b4c	b.hi 0x00bb7b64
00bb7b50	ldrb w8,[x8, #0x2]
00bb7b54	mov w9,#0x40
00bb7b58	add w8,w11,w8
00bb7b5c	cmp w8,#0x40
00bb7b60	csel w11,w8,w9,cc
00bb7b64	ldp x8,x9,[sp, #0xb8]
00bb7b68	cmp w11,#0x40
00bb7b6c	ccmp x8,x9,#0x0,eq
00bb7b70	mov w8,#0x40
00bb7b74	ccmp w28,w8,#0x0,eq
00bb7b78	ccmp x22,x19,#0x0,eq
00bb7b7c	ccmp w27,w8,#0x0,eq
00bb7b80	ccmp x0,x15,#0x0,eq
00bb7b84	ccmp w26,w8,#0x0,eq
00bb7b88	mov x8,#-0x14
00bb7b8c	ccmp x7,x30,#0x0,eq
00bb7b90	csel x0,x8,x21,ne
00bb7b94	b 0x00bb695c
00bb7b98	mov x22,x19
00bb7b9c	b 0x00bb7544
00bb7ba0	mov x0,x3
00bb7ba4	adrp x7,0x789000
00bb7ba8	add x7,x7,#0x2b0
00bb7bac	ldr x17,[sp, #0x50]
00bb7bb0	ldr x4,[sp, #0x80]
00bb7bb4	b 0x00bb6cd0
00bb7bb8	adrp x7,0x789000
00bb7bbc	add x7,x7,#0x2b0
00bb7bc0	cmp x25,x17
00bb7bc4	b.ls 0x00bb6dac
00bb7bc8	b 0x00bb6dd8
00bb7bcc	ldr x17,[sp, #0x50]
00bb7bd0	adrp x11,0x789000
00bb7bd4	add x11,x11,#0x2b0
00bb7bd8	b 0x00bb7110
00bb7bdc	adrp x11,0x789000
00bb7be0	add x11,x11,#0x2b0
00bb7be4	cmp x16,x17
00bb7be8	b.ls 0x00bb71f0
00bb7bec	b 0x00bb721c
00bb7bf0	adrp x22,0x789000
00bb7bf4	add x22,x22,#0x2b0
00bb7bf8	b 0x00bb7540
00bb7bfc	adrp x22,0x789000
00bb7c00	add x22,x22,#0x2b0
00bb7c04	b 0x00bb7600
00bb7c08	bl 0x00c2fec0
00bb7c0c	adrp x7,0x789000
00bb7c10	add x7,x7,#0x2b0
00bb7c14	b 0x00bb6cd0
00bb7c18	adrp x22,0x789000
00bb7c1c	add x22,x22,#0x2b0
00bb7c20	b 0x00bb7544
00bb7c24	adrp x8,0x789000
00bb7c28	add x8,x8,#0x2b0
00bb7c2c	str x8,[sp, #0xb8]
00bb7c30	b 0x00bb79f4
00bb7c34	sub sp,sp,#0x1a0
00bb7c38	stp x29,x30,[sp, #0x140]
00bb7c3c	stp x28,x27,[sp, #0x150]
00bb7c40	stp x26,x25,[sp, #0x160]
00bb7c44	stp x24,x23,[sp, #0x170]
00bb7c48	stp x22,x21,[sp, #0x180]
00bb7c4c	stp x20,x19,[sp, #0x190]
00bb7c50	add x29,sp,#0x140
00bb7c54	mrs x24,tpidr_el0
00bb7c58	mov x22,x4
00bb7c5c	mov x23,x3
00bb7c60	ldr x8,[x24, #0x28]
00bb7c64	mov x21,x2
00bb7c68	mov x19,x1
00bb7c6c	mov x27,x0
00bb7c70	stur x8,[x29, #-0x10]
00bb7c74	tbnz w5,#0x5,0x00bb819c
00bb7c78	add x0,sp,#0x98
00bb7c7c	mov x1,x27
00bb7c80	mov x2,x19
00bb7c84	mov x3,x21
00bb7c88	mov x4,x23
00bb7c8c	mov x5,x22
00bb7c90	bl 0x00bba0f0
00bb7c94	sub x8,x0,#0x1
00bb7c98	cmn x8,#0x79
00bb7c9c	b.hi 0x00bb8198
00bb7ca0	ldp x17,x1,[sp, #0x100]
00bb7ca4	mov x0,#0x2493
00bb7ca8	ldp x8,x9,[sp, #0x98]
00bb7cac	movk x0,#0x9249, LSL #16
00bb7cb0	movk x0,#0x4924, LSL #32
00bb7cb4	ldr x10,[sp, #0xd0]
00bb7cb8	orr x2,xzr,#-0x3333333333333334
00bb7cbc	movk x0,#0x2492, LSL #48
00bb7cc0	movk x2,#0xcccd
00bb7cc4	sub x11,x8,x17
00bb7cc8	sub x13,x1,x10
00bb7ccc	umulh x12,x11,x0
00bb7cd0	ldp x7,x6,[sp, #0xe8]
00bb7cd4	ldp x16,x15,[sp, #0xa8]
00bb7cd8	umulh x13,x13,x2
00bb7cdc	sub x11,x11,x12
00bb7ce0	add x14,x12,x11, LSR #0x1
00bb7ce4	bic x12,x19,x19, ASR #0x3f
00bb7ce8	lsr x3,x13,#0x2
00bb7cec	ldp x13,x11,[sp, #0xc0]
00bb7cf0	lsr x4,x14,#0x2
00bb7cf4	stp x12,x27,[sp, #0x88]
00bb7cf8	ldr x14,[sp, #0xb8]
00bb7cfc	ldp x27,x26,[sp, #0xd8]
00bb7d00	cmp x3,x4
00bb7d04	csel x3,x3,x4,cc
00bb7d08	cbz x3,0x00bb7f80
00bb7d0c	add x4,x3,x3, LSL #0x2
00bb7d10	ldr x3,[sp, #0xf8]
00bb7d14	add x4,x10,x4
00bb7d18	cmp x9,x8
00bb7d1c	b.cc 0x00bb7f80
00bb7d20	cmp x16,x9
00bb7d24	b.cc 0x00bb7f80
00bb7d28	cmp x15,x16
00bb7d2c	b.cc 0x00bb7f80
00bb7d30	sub x5,x1,x10
00bb7d34	lsr x28,x27,#0x35
00bb7d38	lsr x25,x26,#0x35
00bb7d3c	lsr x20,x7,#0x35
00bb7d40	lsr x12,x6,#0x35
00bb7d44	sub x5,x5,#0x5
00bb7d48	ldrh w28,[x3, x28, LSL #0x1]
00bb7d4c	lsr w30,w28,#0x8
00bb7d50	lsl x27,x27,x28
00bb7d54	strb w30,[x14]
00bb7d58	ldrh w25,[x3, x25, LSL #0x1]
00bb7d5c	lsr w30,w25,#0x8
00bb7d60	lsl x25,x26,x25
00bb7d64	strb w30,[x13]
00bb7d68	ldrh w20,[x3, x20, LSL #0x1]
00bb7d6c	lsr w30,w20,#0x8
00bb7d70	lsl x7,x7,x20
00bb7d74	strb w30,[x11]
00bb7d78	lsr x30,x27,#0x35
00bb7d7c	ldrh w12,[x3, x12, LSL #0x1]
00bb7d80	lsr w28,w12,#0x8
00bb7d84	lsl x12,x6,x12
00bb7d88	strb w28,[x10]
00bb7d8c	ldrh w28,[x3, x30, LSL #0x1]
00bb7d90	lsr x30,x25,#0x35
00bb7d94	lsr w26,w28,#0x8
00bb7d98	lsl x27,x27,x28
00bb7d9c	strb w26,[x14, #0x1]
00bb7da0	ldrh w26,[x3, x30, LSL #0x1]
00bb7da4	lsr x30,x7,#0x35
00bb7da8	lsr w20,w26,#0x8
00bb7dac	lsl x25,x25,x26
00bb7db0	strb w20,[x13, #0x1]
00bb7db4	ldrh w20,[x3, x30, LSL #0x1]
00bb7db8	lsr x30,x12,#0x35
00bb7dbc	lsr w6,w20,#0x8
00bb7dc0	lsl x7,x7,x20
00bb7dc4	strb w6,[x11, #0x1]
00bb7dc8	ldrh w6,[x3, x30, LSL #0x1]
00bb7dcc	lsr x30,x27,#0x35
00bb7dd0	lsr w28,w6,#0x8
00bb7dd4	lsl x12,x12,x6
00bb7dd8	strb w28,[x10, #0x1]
00bb7ddc	ldrh w28,[x3, x30, LSL #0x1]
00bb7de0	lsr x30,x25,#0x35
00bb7de4	lsr w26,w28,#0x8
00bb7de8	lsl x27,x27,x28
00bb7dec	strb w26,[x14, #0x2]
00bb7df0	ldrh w26,[x3, x30, LSL #0x1]
00bb7df4	lsr x30,x7,#0x35
00bb7df8	lsr w20,w26,#0x8
00bb7dfc	lsl x25,x25,x26
00bb7e00	strb w20,[x13, #0x2]
00bb7e04	ldrh w20,[x3, x30, LSL #0x1]
00bb7e08	lsr x30,x12,#0x35
00bb7e0c	lsr w6,w20,#0x8
00bb7e10	lsl x7,x7,x20
00bb7e14	strb w6,[x11, #0x2]
00bb7e18	ldrh w6,[x3, x30, LSL #0x1]
00bb7e1c	lsr x30,x27,#0x35
00bb7e20	lsr w28,w6,#0x8
00bb7e24	lsl x12,x12,x6
00bb7e28	strb w28,[x10, #0x2]
00bb7e2c	ldrh w28,[x3, x30, LSL #0x1]
00bb7e30	lsr x30,x25,#0x35
00bb7e34	lsr w26,w28,#0x8
00bb7e38	lsl x27,x27,x28
00bb7e3c	strb w26,[x14, #0x3]
00bb7e40	ldrh w26,[x3, x30, LSL #0x1]
00bb7e44	lsr x30,x7,#0x35
00bb7e48	lsr w20,w26,#0x8
00bb7e4c	lsl x25,x25,x26
00bb7e50	strb w20,[x13, #0x3]
00bb7e54	ldrh w20,[x3, x30, LSL #0x1]
00bb7e58	lsr x30,x12,#0x35
00bb7e5c	lsr w6,w20,#0x8
00bb7e60	lsl x7,x7,x20
00bb7e64	strb w6,[x11, #0x3]
00bb7e68	ldrh w6,[x3, x30, LSL #0x1]
00bb7e6c	lsr x30,x27,#0x35
00bb7e70	lsr w28,w6,#0x8
00bb7e74	lsl x12,x12,x6
00bb7e78	strb w28,[x10, #0x3]
00bb7e7c	ldrh w28,[x3, x30, LSL #0x1]
00bb7e80	lsr x30,x25,#0x35
00bb7e84	lsr w26,w28,#0x8
00bb7e88	lsl x27,x27,x28
00bb7e8c	lsr x28,x12,#0x35
00bb7e90	strb w26,[x14, #0x4]
00bb7e94	add x14,x14,#0x5
00bb7e98	ldrh w26,[x3, x30, LSL #0x1]
00bb7e9c	lsr x30,x7,#0x35
00bb7ea0	lsr w20,w26,#0x8
00bb7ea4	lsl x25,x25,x26
00bb7ea8	strb w20,[x13, #0x4]
00bb7eac	rbit x25,x25
00bb7eb0	add x13,x13,#0x5
00bb7eb4	ldrh w20,[x3, x30, LSL #0x1]
00bb7eb8	clz x25,x25
00bb7ebc	lsr w6,w20,#0x8
00bb7ec0	sub x9,x9,x25, LSR #0x3
00bb7ec4	and x25,x25,#0x7
00bb7ec8	strb w6,[x11, #0x4]
00bb7ecc	lsl x6,x7,x20
00bb7ed0	rbit x20,x27
00bb7ed4	ldrh w7,[x3, x28, LSL #0x1]
00bb7ed8	add x11,x11,#0x5
00bb7edc	rbit x6,x6
00bb7ee0	clz x20,x20
00bb7ee4	lsl x12,x12,x7
00bb7ee8	lsr w7,w7,#0x8
00bb7eec	sub x8,x8,x20, LSR #0x3
00bb7ef0	clz x6,x6
00bb7ef4	and x20,x20,#0x7
00bb7ef8	rbit x12,x12
00bb7efc	sub x16,x16,x6, LSR #0x3
00bb7f00	strb w7,[x10, #0x4]
00bb7f04	ldr x7,[x8]
00bb7f08	ldr x26,[x9]
00bb7f0c	and x6,x6,#0x7
00bb7f10	clz x12,x12
00bb7f14	ldr x27,[x16]
00bb7f18	add x10,x10,#0x5
00bb7f1c	sub x15,x15,x12, LSR #0x3
00bb7f20	orr x7,x7,#0x1
00bb7f24	orr x26,x26,#0x1
00bb7f28	orr x28,x27,#0x1
00bb7f2c	lsl x27,x7,x20
00bb7f30	and x12,x12,#0x7
00bb7f34	ldr x30,[x15]
00bb7f38	lsl x7,x28,x6
00bb7f3c	lsl x26,x26,x25
00bb7f40	cmp x10,x4
00bb7f44	orr x6,x30,#0x1
00bb7f48	lsl x6,x6,x12
00bb7f4c	b.cc 0x00bb7d34
00bb7f50	sub x4,x8,x17
00bb7f54	umulh x5,x5,x2
00bb7f58	umulh x28,x4,x0
00bb7f5c	lsr x5,x5,#0x2
00bb7f60	sub x4,x4,x28
00bb7f64	add x4,x28,x4, LSR #0x1
00bb7f68	lsr x4,x4,#0x2
00bb7f6c	cmp x5,x4
00bb7f70	csel x5,x5,x4,cc
00bb7f74	add x4,x5,x5, LSL #0x2
00bb7f78	add x4,x10,x4
00bb7f7c	cbnz x5,0x00bb7d18
00bb7f80	stp x27,x26,[sp, #0xd8]
00bb7f84	mov x17,xzr
00bb7f88	stp x8,x9,[sp, #0x98]
00bb7f8c	ldp x9,x27,[sp, #0x88]
00bb7f90	stp x16,x15,[sp, #0xa8]
00bb7f94	add x15,sp,#0x98
00bb7f98	add x8,x22,#0x4
00bb7f9c	stp x14,x13,[sp, #0xb8]
00bb7fa0	add x13,x19,#0x3
00bb7fa4	add x12,x15,#0x40
00bb7fa8	add x14,x15,#0x20
00bb7fac	lsr x13,x13,#0x2
00bb7fb0	add x15,sp,#0x98
00bb7fb4	add x9,x27,x9
00bb7fb8	stp x11,x10,[sp, #0xc8]
00bb7fbc	add x11,x15,#0x78
00bb7fc0	mov x16,x27
00bb7fc4	stp x7,x6,[sp, #0xe8]
00bb7fc8	sub x10,x9,x16
00bb7fcc	add x16,x16,x13
00bb7fd0	cmp x13,x10
00bb7fd4	ldr x10,[x14, x17, LSL #0x3]
00bb7fd8	csel x16,x9,x16,hi
00bb7fdc	cmp x10,x16
00bb7fe0	b.hi 0x00bb87ec
00bb7fe4	ldr x0,[x11, x17, LSL #0x3]
00bb7fe8	ldr x1,[x15, x17, LSL #0x3]
00bb7fec	sub x0,x0,#0x8
00bb7ff0	cmp x1,x0
00bb7ff4	b.cc 0x00bb87ec
00bb7ff8	ldr x0,[x12, x17, LSL #0x3]
00bb7ffc	ldr x3,[sp, #0x100]
00bb8000	ldr x2,[x1]
00bb8004	rbit x4,x0
00bb8008	sub x0,x16,x10
00bb800c	add x5,x3,#0x8
00bb8010	cmp x0,#0x4
00bb8014	clz x6,x4
00bb8018	b.lt 0x00bb80f8
00bb801c	sub x7,x16,#0x3
00bb8020	mov x4,x10
00bb8024	cmp x1,x5
00bb8028	b.cs 0x00bb8054
00bb802c	cmp x1,x3
00bb8030	b.eq 0x00bb8128
00bb8034	lsr w2,w6,#0x3
00bb8038	sub w25,w1,w3
00bb803c	sub x20,x1,x2
00bb8040	cmp x20,x3
00bb8044	csel w2,w2,w25,cs
00bb8048	cset w25,cs
00bb804c	sub w6,w6,w2, LSL #0x3
00bb8050	b 0x00bb8060
00bb8054	lsr w2,w6,#0x3
00bb8058	and w6,w6,#0x7
00bb805c	mov w25,#0x1
00bb8060	sub x1,x1,w2, UXTW 
00bb8064	cmp x4,x7
00bb8068	ldr x2,[x1]
00bb806c	b.cs 0x00bb8128
00bb8070	cbz w25,0x00bb8128
00bb8074	lsl x20,x2,x6
00bb8078	lsr x20,x20,#0x35
00bb807c	add x20,x8,x20, LSL #0x1
00bb8080	ldrb w25,[x20]
00bb8084	ldrb w20,[x20, #0x1]
00bb8088	add w6,w6,w25
00bb808c	strb w20,[x4]
00bb8090	lsl x25,x2,x6
00bb8094	lsr x25,x25,#0x35
00bb8098	add x25,x8,x25, LSL #0x1
00bb809c	ldrb w20,[x25]
00bb80a0	ldrb w25,[x25, #0x1]
00bb80a4	add w6,w6,w20
00bb80a8	strb w25,[x4, #0x1]
00bb80ac	lsl x20,x2,x6
00bb80b0	lsr x20,x20,#0x35
00bb80b4	add x20,x8,x20, LSL #0x1
00bb80b8	ldrb w25,[x20]
00bb80bc	ldrb w20,[x20, #0x1]
00bb80c0	add w6,w6,w25
00bb80c4	strb w20,[x4, #0x2]
00bb80c8	lsl x25,x2,x6
00bb80cc	lsr x25,x25,#0x35
00bb80d0	add x25,x8,x25, LSL #0x1
00bb80d4	ldrb w20,[x25]
00bb80d8	ldrb w26,[x25, #0x1]
00bb80dc	add x25,x4,#0x4
00bb80e0	add w6,w6,w20
00bb80e4	strb w26,[x4, #0x3]
00bb80e8	mov x4,x25
00bb80ec	cmp w6,#0x40
00bb80f0	b.ls 0x00bb8024
00bb80f4	b 0x00bb8148
00bb80f8	cmp x1,x5
00bb80fc	b.cs 0x00bb8138
00bb8100	cmp x1,x3
00bb8104	b.eq 0x00bb8144
00bb8108	lsr w2,w6,#0x3
00bb810c	sub w5,w1,w3
00bb8110	sub x4,x1,x2
00bb8114	cmp x4,x3
00bb8118	csel w2,w5,w2,cc
00bb811c	sub x1,x1,x2
00bb8120	sub w6,w6,w2, LSL #0x3
00bb8124	b 0x00bb8140
00bb8128	mov x25,x4
00bb812c	cmp x25,x16
00bb8130	b.cc 0x00bb8150
00bb8134	b 0x00bb8178
00bb8138	sub x1,x1,x6, LSR #0x3
00bb813c	and w6,w6,#0x7
00bb8140	ldr x2,[x1]
00bb8144	mov x25,x10
00bb8148	cmp x25,x16
00bb814c	b.cs 0x00bb8178
00bb8150	lsl x10,x2,x6
00bb8154	lsr x10,x10,#0x35
00bb8158	add x10,x8,x10, LSL #0x1
00bb815c	ldrb w1,[x10, #0x1]
00bb8160	ldrb w10,[x10]
00bb8164	strb w1,[x25], #0x1
00bb8168	cmp x25,x16
00bb816c	add w6,w6,w10
00bb8170	b.ne 0x00bb8150
00bb8174	ldr x10,[x14, x17, LSL #0x3]
00bb8178	add x10,x10,x0
00bb817c	str x10,[x14, x17, LSL #0x3]
00bb8180	cmp x10,x16
00bb8184	b.ne 0x00bb87ec
00bb8188	add x17,x17,#0x1
00bb818c	cmp x17,#0x4
00bb8190	b.ne 0x00bb7fc8
00bb8194	mov x0,x19
00bb8198	cbnz x0,0x00bb87f0
00bb819c	cmp x19,#0x6
00bb81a0	mov x0,#-0x14
00bb81a4	b.cc 0x00bb87f0
00bb81a8	cmp x23,#0xa
00bb81ac	b.cc 0x00bb87f0
00bb81b0	ldrh w10,[x21]
00bb81b4	ldrh w9,[x21, #0x2]
00bb81b8	ldrh w8,[x21, #0x4]
00bb81bc	add x11,x10,x9
00bb81c0	add x11,x11,x8
00bb81c4	add x11,x11,#0x6
00bb81c8	subs x2,x23,x11
00bb81cc	b.cc 0x00bb87f0
00bb81d0	add x11,x19,#0x3
00bb81d4	mov x12,x27
00bb81d8	lsr x27,x11,#0x2
00bb81dc	add x13,x12,x19
00bb81e0	str x12,[sp, #0x90]
00bb81e4	add x3,x12,x27
00bb81e8	add x1,x3,x27
00bb81ec	add x16,x1,x27
00bb81f0	cmp x16,x13
00bb81f4	b.hi 0x00bb87f0
00bb81f8	cbz w10,0x00bb83d4
00bb81fc	add x17,x21,#0x6
00bb8200	ldrh w14,[x22, #0x2]
00bb8204	cmp w10,#0x8
00bb8208	add x12,x17,x10
00bb820c	b.cc 0x00bb8238
00bb8210	ldurb w10,[x12, #-0x1]
00bb8214	cbz w10,0x00bb83dc
00bb8218	mov x15,x12
00bb821c	clz w10,w10
00bb8220	mov w11,#0x8
00bb8224	ldr x26,[x15, #-0x8]!
00bb8228	eor w10,w10,#0x1f
00bb822c	sub w25,w11,w10
00bb8230	cbnz w9,0x00bb82c4
00bb8234	b 0x00bb83d4
00bb8238	ldrb w26,[x17]
00bb823c	cmp w10,#0x4
00bb8240	b.gt 0x00bb8260
00bb8244	cmp w10,#0x2
00bb8248	b.eq 0x00bb82a0
00bb824c	cmp w10,#0x3
00bb8250	b.eq 0x00bb8298
00bb8254	cmp w10,#0x4
00bb8258	b.eq 0x00bb8290
00bb825c	b 0x00bb82a8
00bb8260	cmp w10,#0x5
00bb8264	b.eq 0x00bb8288
00bb8268	cmp w10,#0x6
00bb826c	b.eq 0x00bb8280
00bb8270	cmp w10,#0x7
00bb8274	b.ne 0x00bb82a8
00bb8278	ldrb w11,[x21, #0xc]
00bb827c	orr x26,x26,x11, LSL #0x30
00bb8280	ldrb w11,[x21, #0xb]
00bb8284	add x26,x26,x11, LSL #0x28
00bb8288	ldrb w11,[x21, #0xa]
00bb828c	add x26,x26,x11, LSL #0x20
00bb8290	ldrb w11,[x21, #0x9]
00bb8294	add x26,x26,x11, LSL #0x18
00bb8298	ldrb w11,[x21, #0x8]
00bb829c	add x26,x26,x11, LSL #0x10
00bb82a0	ldrb w11,[x21, #0x7]
00bb82a4	add x26,x26,x11, LSL #0x8
00bb82a8	ldurb w11,[x12, #-0x1]
00bb82ac	cbz w11,0x00bb87f0
00bb82b0	clz w11,w11
00bb82b4	mov x15,x17
00bb82b8	sub w10,w11,w10, LSL #0x3
00bb82bc	add w25,w10,#0x29
00bb82c0	cbz w9,0x00bb83d4
00bb82c4	cmp w9,#0x8
00bb82c8	add x20,x12,x9
00bb82cc	b.cc 0x00bb82f8
00bb82d0	ldurb w9,[x20, #-0x1]
00bb82d4	cbz w9,0x00bb83dc
00bb82d8	mov x10,x20
00bb82dc	clz w9,w9
00bb82e0	ldr x0,[x10, #-0x8]!
00bb82e4	str x10,[sp, #0x78]
00bb82e8	eor w9,w9,#0x1f
00bb82ec	mov w10,#0x8
00bb82f0	sub w23,w10,w9
00bb82f4	b 0x00bb8380
00bb82f8	ldrb w0,[x12]
00bb82fc	cmp w9,#0x4
00bb8300	b.gt 0x00bb8320
00bb8304	cmp w9,#0x2
00bb8308	b.eq 0x00bb8360
00bb830c	cmp w9,#0x3
00bb8310	b.eq 0x00bb8358
00bb8314	cmp w9,#0x4
00bb8318	b.eq 0x00bb8350
00bb831c	b 0x00bb8368
00bb8320	cmp w9,#0x5
00bb8324	b.eq 0x00bb8348
00bb8328	cmp w9,#0x6
00bb832c	b.eq 0x00bb8340
00bb8330	cmp w9,#0x7
00bb8334	b.ne 0x00bb8368
00bb8338	ldrb w10,[x12, #0x6]
00bb833c	orr x0,x0,x10, LSL #0x30
00bb8340	ldrb w10,[x12, #0x5]
00bb8344	add x0,x0,x10, LSL #0x28
00bb8348	ldrb w10,[x12, #0x4]
00bb834c	add x0,x0,x10, LSL #0x20
00bb8350	ldrb w10,[x12, #0x3]
00bb8354	add x0,x0,x10, LSL #0x18
00bb8358	ldrb w10,[x12, #0x2]
00bb835c	add x0,x0,x10, LSL #0x10
00bb8360	ldrb w10,[x12, #0x1]
00bb8364	add x0,x0,x10, LSL #0x8
00bb8368	ldurb w10,[x20, #-0x1]
00bb836c	cbz w10,0x00bb87ec
00bb8370	clz w10,w10
00bb8374	str x12,[sp, #0x78]
00bb8378	sub w9,w10,w9, LSL #0x3
00bb837c	add w23,w9,#0x29
00bb8380	cbz w8,0x00bb83d4
00bb8384	str x1,[sp, #0x50]
00bb8388	cmp w8,#0x8
00bb838c	add x1,x20,x8
00bb8390	b.cc 0x00bb83e4
00bb8394	ldurb w8,[x1, #-0x1]
00bb8398	cbz w8,0x00bb83dc
00bb839c	mov x9,x1
00bb83a0	clz w8,w8
00bb83a4	stp x3,x16,[sp, #0x28]
00bb83a8	ldr x10,[x9, #-0x8]!
00bb83ac	str x9,[sp, #0x10]
00bb83b0	eor w8,w8,#0x1f
00bb83b4	mov w9,#0x8
00bb83b8	stp x12,x17,[sp, #0x40]
00bb83bc	str x15,[sp, #0x20]
00bb83c0	sub w28,w9,w8
00bb83c4	str w14,[sp, #0x1c]
00bb83c8	str x13,[sp, #0x38]
00bb83cc	stp x10,x0,[sp, #0x80]
00bb83d0	b 0x00bb84b8
00bb83d4	mov x0,#-0x48
00bb83d8	b 0x00bb87f0
00bb83dc	mov x0,#-0x1
00bb83e0	b 0x00bb87f0
00bb83e4	ldrb w9,[x20]
00bb83e8	cmp w8,#0x4
00bb83ec	str x9,[sp, #0x80]
00bb83f0	b.gt 0x00bb8410
00bb83f4	cmp w8,#0x2
00bb83f8	b.eq 0x00bb8438
00bb83fc	cmp w8,#0x3
00bb8400	b.eq 0x00bb8448
00bb8404	cmp w8,#0x4
00bb8408	b.eq 0x00bb8468
00bb840c	b 0x00bb8488
00bb8410	cmp w8,#0x5
00bb8414	b.eq 0x00bb8440
00bb8418	cmp w8,#0x6
00bb841c	b.eq 0x00bb8450
00bb8420	cmp w8,#0x7
00bb8424	b.ne 0x00bb8488
00bb8428	ldrb w9,[x20, #0x6]
00bb842c	ldr x10,[sp, #0x80]
00bb8430	orr x10,x10,x9, LSL #0x30
00bb8434	b 0x00bb8454
00bb8438	ldr x10,[sp, #0x80]
00bb843c	b 0x00bb847c
00bb8440	ldr x10,[sp, #0x80]
00bb8444	b 0x00bb845c
00bb8448	ldr x10,[sp, #0x80]
00bb844c	b 0x00bb8474
00bb8450	ldr x10,[sp, #0x80]
00bb8454	ldrb w9,[x20, #0x5]
00bb8458	add x10,x10,x9, LSL #0x28
00bb845c	ldrb w9,[x20, #0x4]
00bb8460	add x10,x10,x9, LSL #0x20
00bb8464	str x10,[sp, #0x80]
00bb8468	ldrb w9,[x20, #0x3]
00bb846c	ldr x10,[sp, #0x80]
00bb8470	add x10,x10,x9, LSL #0x18
00bb8474	ldrb w9,[x20, #0x2]
00bb8478	add x10,x10,x9, LSL #0x10
00bb847c	ldrb w9,[x20, #0x1]
00bb8480	add x10,x10,x9, LSL #0x8
00bb8484	str x10,[sp, #0x80]
00bb8488	ldurb w9,[x1, #-0x1]
00bb848c	cbz w9,0x00bb87ec
00bb8490	clz w9,w9
00bb8494	stp x3,x16,[sp, #0x28]
00bb8498	sub w8,w9,w8, LSL #0x3
00bb849c	str x0,[sp, #0x88]
00bb84a0	stp x12,x17,[sp, #0x40]
00bb84a4	add w28,w8,#0x29
00bb84a8	str x15,[sp, #0x20]
00bb84ac	str w14,[sp, #0x1c]
00bb84b0	str x13,[sp, #0x38]
00bb84b4	str x20,[sp, #0x10]
00bb84b8	add x0,sp,#0x98
00bb84bc	bl 0x00bb9fd0
00bb84c0	ldp x6,x5,[sp, #0x38]
00bb84c4	cmn x0,#0x78
00bb84c8	ldp x30,x13,[sp, #0x20]
00bb84cc	ldr x9,[sp, #0x30]
00bb84d0	ldr x17,[sp, #0x50]
00bb84d4	b.hi 0x00bb87f0
00bb84d8	sub x10,x6,x9
00bb84dc	sub x11,x6,#0x3
00bb84e0	add x8,x22,#0x4
00bb84e4	cmp x10,#0x8
00bb84e8	add x10,x21,#0xe
00bb84ec	stp x11,x10,[sp, #0x58]
00bb84f0	add x10,x5,#0x8
00bb84f4	str x10,[sp, #0x68]
00bb84f8	add x10,x20,#0x8
00bb84fc	str x10,[sp, #0x70]
00bb8500	b.cc 0x00bb8858
00bb8504	ldr x10,[sp, #0x10]
00bb8508	cmp x9,x11
00bb850c	b.cs 0x00bb8850
00bb8510	ldr w11,[sp, #0x1c]
00bb8514	ldp x2,x15,[sp, #0x90]
00bb8518	ldr w3,[sp, #0xa0]
00bb851c	ldr x16,[sp, #0xb8]
00bb8520	ldr x14,[sp, #0xa8]
00bb8524	neg w17,w11
00bb8528	lsl x11,x27,#0x1
00bb852c	str x20,[sp, #0x8]
00bb8530	and w17,w17,#0x3f
00bb8534	add x0,x11,x27
00bb8538	lsl x1,x26,x25
00bb853c	ldp x12,x13,[sp, #0x80]
00bb8540	lsl x20,x15,x3
00bb8544	mov x9,x30
00bb8548	lsr x1,x1,x17
00bb854c	lsl x4,x13,x23
00bb8550	lsl x7,x12,x28
00bb8554	add x5,x8,x1, LSL #0x1
00bb8558	mov x1,x2
00bb855c	lsr x4,x4,x17
00bb8560	ldrb w6,[x5, #0x1]
00bb8564	ldrb w5,[x5]
00bb8568	add x2,x8,x4, LSL #0x1
00bb856c	add x4,x1,x27
00bb8570	strb w6,[x1]
00bb8574	lsr x6,x7,x17
00bb8578	add w21,w25,w5
00bb857c	ldrb w7,[x2, #0x1]
00bb8580	ldrb w2,[x2]
00bb8584	lsl x22,x26,x21
00bb8588	add x6,x8,x6, LSL #0x1
00bb858c	add x5,x1,x11
00bb8590	strb w7,[x4]
00bb8594	lsr x7,x20,x17
00bb8598	add w23,w23,w2
00bb859c	ldrb w20,[x6, #0x1]
00bb85a0	ldrb w6,[x6]
00bb85a4	lsl x25,x13,x23
00bb85a8	add x7,x8,x7, LSL #0x1
00bb85ac	add x2,x1,x0
00bb85b0	strb w20,[x5]
00bb85b4	lsr x20,x22,x17
00bb85b8	add w6,w28,w6
00bb85bc	ldrb w22,[x7, #0x1]
00bb85c0	ldrb w7,[x7]
00bb85c4	lsl x28,x12,x6
00bb85c8	add x20,x8,x20, LSL #0x1
00bb85cc	strb w22,[x2]
00bb85d0	lsr x22,x25,x17
00bb85d4	add w3,w3,w7
00bb85d8	ldrb w25,[x20, #0x1]
00bb85dc	ldrb w20,[x20]
00bb85e0	add x7,x8,x22, LSL #0x1
00bb85e4	lsr x22,x28,x17
00bb85e8	lsl x28,x15,x3
00bb85ec	strb w25,[x1, #0x1]
00bb85f0	add w20,w21,w20
00bb85f4	ldrb w25,[x7, #0x1]
00bb85f8	add x21,x8,x22, LSL #0x1
00bb85fc	ldrb w7,[x7]
00bb8600	lsr x22,x28,x17
00bb8604	lsl x28,x26,x20
00bb8608	strb w25,[x4, #0x1]
00bb860c	add w7,w23,w7
00bb8610	ldrb w25,[x21, #0x1]
00bb8614	add x22,x8,x22, LSL #0x1
00bb8618	ldrb w21,[x21]
00bb861c	lsr x23,x28,x17
00bb8620	lsl x28,x13,x7
00bb8624	strb w25,[x5, #0x1]
00bb8628	add w6,w6,w21
00bb862c	ldrb w25,[x22, #0x1]
00bb8630	add x21,x8,x23, LSL #0x1
00bb8634	ldrb w22,[x22]
00bb8638	lsr x23,x28,x17
00bb863c	lsl x28,x12,x6
00bb8640	strb w25,[x2, #0x1]
00bb8644	add w3,w3,w22
00bb8648	ldrb w25,[x21, #0x1]
00bb864c	add x23,x8,x23, LSL #0x1
00bb8650	ldrb w21,[x21]
00bb8654	lsl x30,x15,x3
00bb8658	strb w25,[x1, #0x2]
00bb865c	lsr x25,x28,x17
00bb8660	add w22,w20,w21
00bb8664	ldrb w28,[x23, #0x1]
00bb8668	ldrb w21,[x23]
00bb866c	lsr x23,x30,x17
00bb8670	add x20,x8,x25, LSL #0x1
00bb8674	strb w28,[x4, #0x2]
00bb8678	lsl x28,x26,x22
00bb867c	add w7,w7,w21
00bb8680	ldrb w25,[x20, #0x1]
00bb8684	add x21,x8,x23, LSL #0x1
00bb8688	ldrb w20,[x20]
00bb868c	lsr x23,x28,x17
00bb8690	lsl x28,x13,x7
00bb8694	strb w25,[x5, #0x2]
00bb8698	add w6,w6,w20
00bb869c	ldrb w25,[x21, #0x1]
00bb86a0	add x20,x8,x23, LSL #0x1
00bb86a4	ldrb w21,[x21]
00bb86a8	lsr x23,x28,x17
00bb86ac	lsl x28,x12,x6
00bb86b0	strb w25,[x2, #0x2]
00bb86b4	add w3,w3,w21
00bb86b8	ldrb w25,[x20, #0x1]
00bb86bc	add x21,x8,x23, LSL #0x1
00bb86c0	ldrb w20,[x20]
00bb86c4	lsr x23,x28,x17
00bb86c8	lsl x28,x15,x3
00bb86cc	strb w25,[x1, #0x3]
00bb86d0	ldrb w25,[x21, #0x1]
00bb86d4	add x30,x8,x23, LSL #0x1
00bb86d8	ldrb w23,[x21]
00bb86dc	strb w25,[x4, #0x3]
00bb86e0	lsr x4,x28,x17
00bb86e4	ldrb w25,[x30, #0x1]
00bb86e8	ldrb w21,[x30]
00bb86ec	mov x30,x9
00bb86f0	add x4,x8,x4, LSL #0x1
00bb86f4	ldr x9,[sp, #0x60]
00bb86f8	strb w25,[x5, #0x3]
00bb86fc	add w25,w22,w20
00bb8700	ldrb w28,[x4, #0x1]
00bb8704	ldrb w5,[x4]
00bb8708	cmp x30,x9
00bb870c	strb w28,[x2, #0x3]
00bb8710	b.cc 0x00bb87cc
00bb8714	lsr w20,w25,#0x3
00bb8718	mov w4,wzr
00bb871c	and w25,w25,#0x7
00bb8720	sub x30,x30,x20
00bb8724	ldr x26,[x30]
00bb8728	ldr x9,[sp, #0x78]
00bb872c	ldr x12,[sp, #0x68]
00bb8730	add w23,w7,w23
00bb8734	cmp x9,x12
00bb8738	b.cc 0x00bb87d4
00bb873c	lsr w20,w23,#0x3
00bb8740	mov w7,wzr
00bb8744	and w23,w23,#0x7
00bb8748	sub x9,x9,x20
00bb874c	ldr x12,[x9]
00bb8750	str x12,[sp, #0x88]
00bb8754	ldr x12,[sp, #0x70]
00bb8758	add w28,w6,w21
00bb875c	cmp x10,x12
00bb8760	b.cc 0x00bb87dc
00bb8764	lsr w20,w28,#0x3
00bb8768	mov w6,wzr
00bb876c	and w28,w28,#0x7
00bb8770	sub x10,x10,x20
00bb8774	ldr x12,[x10]
00bb8778	str x12,[sp, #0x80]
00bb877c	cmp x14,x16
00bb8780	add w3,w3,w5
00bb8784	b.cc 0x00bb87e4
00bb8788	lsr w15,w3,#0x3
00bb878c	mov w5,wzr
00bb8790	and w3,w3,#0x7
00bb8794	sub x14,x14,x15
00bb8798	ldr x15,[x14]
00bb879c	str x15,[sp, #0x98]
00bb87a0	str x9,[sp, #0x78]
00bb87a4	ldr x9,[sp, #0x58]
00bb87a8	add x2,x2,#0x4
00bb87ac	cmp x2,x9
00bb87b0	b.cs 0x00bb8820
00bb87b4	orr w2,w7,w4
00bb87b8	orr w2,w2,w6
00bb87bc	orr w4,w2,w5
00bb87c0	add x2,x1,#0x4
00bb87c4	cbz w4,0x00bb8538
00bb87c8	b 0x00bb8820
00bb87cc	mov w4,#0x3
00bb87d0	b 0x00bb8728
00bb87d4	mov w7,#0x3
00bb87d8	b 0x00bb8754
00bb87dc	mov w6,#0x3
00bb87e0	b 0x00bb877c
00bb87e4	mov w5,#0x3
00bb87e8	b 0x00bb87a0
00bb87ec	mov x0,#-0x14
00bb87f0	ldr x8,[x24, #0x28]
00bb87f4	ldur x9,[x29, #-0x10]
00bb87f8	cmp x8,x9
00bb87fc	b.ne 0x00bb9068
00bb8800	ldp x20,x19,[sp, #0x190]
00bb8804	ldp x22,x21,[sp, #0x180]
00bb8808	ldp x24,x23,[sp, #0x170]
00bb880c	ldp x26,x25,[sp, #0x160]
00bb8810	ldp x28,x27,[sp, #0x150]
00bb8814	ldp x29,x30,[sp, #0x140]
00bb8818	add sp,sp,#0x1a0
00bb881c	ret
00bb8820	add x16,x1,#0x4
00bb8824	add x17,x11,x27
00bb8828	str x14,[sp, #0xa8]
00bb882c	ldp x6,x5,[sp, #0x38]
00bb8830	add x14,x16,x11
00bb8834	ldp x13,x9,[sp, #0x28]
00bb8838	add x11,x16,x17
00bb883c	ldr x20,[sp, #0x8]
00bb8840	ldr x17,[sp, #0x50]
00bb8844	add x15,x16,x27
00bb8848	str w3,[sp, #0xa0]
00bb884c	b 0x00bb886c
00bb8850	ldr x16,[sp, #0x90]
00bb8854	b 0x00bb8860
00bb8858	ldr x16,[sp, #0x90]
00bb885c	ldr x10,[sp, #0x10]
00bb8860	mov x11,x9
00bb8864	mov x14,x17
00bb8868	mov x15,x13
00bb886c	cmp x16,x13
00bb8870	mov x0,#-0x14
00bb8874	b.hi 0x00bb87f0
00bb8878	cmp x15,x17
00bb887c	b.hi 0x00bb87f0
00bb8880	cmp x14,x9
00bb8884	b.hi 0x00bb87f0
00bb8888	sub x17,x13,x16
00bb888c	mov x12,x13
00bb8890	cmp x17,#0x4
00bb8894	b.lt 0x00bb89ac
00bb8898	ldr w7,[sp, #0x1c]
00bb889c	ldr x21,[sp, #0x78]
00bb88a0	cmp w25,#0x40
00bb88a4	b.hi 0x00bb9014
00bb88a8	neg w0,w7
00bb88ac	sub x17,x12,#0x3
00bb88b0	mov x22,x10
00bb88b4	and w1,w0,#0x3f
00bb88b8	adrp x0,0x789000
00bb88bc	add x0,x0,#0x2b0
00bb88c0	ldr x10,[sp, #0x60]
00bb88c4	cmp x30,x10
00bb88c8	b.cs 0x00bb88f8
00bb88cc	ldr x10,[sp, #0x48]
00bb88d0	cmp x30,x10
00bb88d4	b.eq 0x00bb8a10
00bb88d8	lsr w2,w25,#0x3
00bb88dc	sub w4,w30,w10
00bb88e0	sub x3,x30,x2
00bb88e4	cmp x3,x10
00bb88e8	csel w3,w2,w4,cs
00bb88ec	cset w2,cs
00bb88f0	sub w25,w25,w3, LSL #0x3
00bb88f4	b 0x00bb8904
00bb88f8	lsr w3,w25,#0x3
00bb88fc	and w25,w25,#0x7
00bb8900	mov w2,#0x1
00bb8904	sub x30,x30,w3, UXTW 
00bb8908	cmp x16,x17
00bb890c	ldr x26,[x30]
00bb8910	b.cs 0x00bb89f8
00bb8914	cbz w2,0x00bb89f8
00bb8918	lsl x2,x26,x25
00bb891c	lsr x2,x2,x1
00bb8920	add x2,x8,x2, LSL #0x1
00bb8924	ldrb w3,[x2]
00bb8928	ldrb w2,[x2, #0x1]
00bb892c	add w3,w25,w3
00bb8930	strb w2,[x16]
00bb8934	lsl x4,x26,x3
00bb8938	lsr x4,x4,x1
00bb893c	add x4,x8,x4, LSL #0x1
00bb8940	ldrb w2,[x4]
00bb8944	ldrb w4,[x4, #0x1]
00bb8948	add w2,w3,w2
00bb894c	strb w4,[x16, #0x1]
00bb8950	lsl x3,x26,x2
00bb8954	lsr x3,x3,x1
00bb8958	add x3,x8,x3, LSL #0x1
00bb895c	ldrb w4,[x3]
00bb8960	ldrb w3,[x3, #0x1]
00bb8964	add w2,w2,w4
00bb8968	strb w3,[x16, #0x2]
00bb896c	lsl x4,x26,x2
00bb8970	lsr x4,x4,x1
00bb8974	add x4,x8,x4, LSL #0x1
00bb8978	ldrb w3,[x4]
00bb897c	ldrb w4,[x4, #0x1]
00bb8980	add w25,w2,w3
00bb8984	add x2,x16,#0x4
00bb8988	strb w4,[x16, #0x3]
00bb898c	cmp w25,#0x40
00bb8990	mov x16,x2
00bb8994	b.ls 0x00bb88c0
00bb8998	mov x30,x0
00bb899c	mov x16,x2
00bb89a0	cmp x16,x12
00bb89a4	b.cc 0x00bb8a20
00bb89a8	b 0x00bb8a70
00bb89ac	ldr w7,[sp, #0x1c]
00bb89b0	ldr x21,[sp, #0x78]
00bb89b4	cmp w25,#0x40
00bb89b8	b.hi 0x00bb9014
00bb89bc	ldr x13,[sp, #0x60]
00bb89c0	mov x22,x10
00bb89c4	cmp x30,x13
00bb89c8	b.cs 0x00bb89fc
00bb89cc	ldr x10,[sp, #0x48]
00bb89d0	cmp x30,x10
00bb89d4	b.eq 0x00bb8a60
00bb89d8	lsr w13,w25,#0x3
00bb89dc	sub w0,w30,w10
00bb89e0	sub x17,x30,x13
00bb89e4	cmp x17,x10
00bb89e8	csel w13,w0,w13,cc
00bb89ec	sub x30,x30,x13
00bb89f0	sub w25,w25,w13, LSL #0x3
00bb89f4	b 0x00bb8a08
00bb89f8	b 0x00bb8a14
00bb89fc	lsr w13,w25,#0x3
00bb8a00	and w25,w25,#0x7
00bb8a04	sub x30,x30,x13
00bb8a08	ldr x26,[x30]
00bb8a0c	b 0x00bb8a14
00bb8a10	mov x30,x10
00bb8a14	mov x2,x16
00bb8a18	cmp x16,x12
00bb8a1c	b.cs 0x00bb8a70
00bb8a20	ldr x4,[sp, #0x90]
00bb8a24	neg w13,w7
00bb8a28	and w17,w13,#0x3f
00bb8a2c	mov w13,w25
00bb8a30	add x0,x27,x4
00bb8a34	sub x0,x0,x2
00bb8a38	lsl x1,x26,x13
00bb8a3c	subs x0,x0,#0x1
00bb8a40	lsr x1,x1,x17
00bb8a44	add x1,x8,x1, LSL #0x1
00bb8a48	ldrb w2,[x1, #0x1]
00bb8a4c	ldrb w1,[x1]
00bb8a50	add w13,w13,w1
00bb8a54	strb w2,[x16], #0x1
00bb8a58	b.ne 0x00bb8a38
00bb8a5c	b 0x00bb8a78
00bb8a60	mov x2,x16
00bb8a64	mov x30,x10
00bb8a68	cmp x16,x12
00bb8a6c	b.cc 0x00bb8a20
00bb8a70	ldr x4,[sp, #0x90]
00bb8a74	mov w13,w25
00bb8a78	ldr x10,[sp, #0x50]
00bb8a7c	sub x16,x10,x15
00bb8a80	cmp x16,#0x4
00bb8a84	b.lt 0x00bb8b90
00bb8a88	ldr x25,[sp, #0x80]
00bb8a8c	cmp w23,#0x40
00bb8a90	b.hi 0x00bb9030
00bb8a94	neg w17,w7
00bb8a98	sub x16,x10,#0x3
00bb8a9c	and w0,w17,#0x3f
00bb8aa0	adrp x17,0x789000
00bb8aa4	add x17,x17,#0x2b0
00bb8aa8	ldr x10,[sp, #0x68]
00bb8aac	cmp x21,x10
00bb8ab0	b.cs 0x00bb8adc
00bb8ab4	cmp x21,x5
00bb8ab8	b.eq 0x00bb8bf0
00bb8abc	lsr w1,w23,#0x3
00bb8ac0	sub w3,w21,w5
00bb8ac4	sub x2,x21,x1
00bb8ac8	cmp x2,x5
00bb8acc	csel w2,w1,w3,cs
00bb8ad0	cset w1,cs
00bb8ad4	sub w23,w23,w2, LSL #0x3
00bb8ad8	b 0x00bb8ae8
00bb8adc	lsr w2,w23,#0x3
00bb8ae0	and w23,w23,#0x7
00bb8ae4	mov w1,#0x1
00bb8ae8	sub x21,x21,w2, UXTW 
00bb8aec	cmp x15,x16
00bb8af0	ldr x10,[x21]
00bb8af4	str x10,[sp, #0x88]
00bb8af8	b.cs 0x00bb8bd8
00bb8afc	cbz w1,0x00bb8bd8
00bb8b00	ldr x10,[sp, #0x88]
00bb8b04	lsl x1,x10,x23
00bb8b08	lsr x1,x1,x0
00bb8b0c	add x1,x8,x1, LSL #0x1
00bb8b10	ldrb w2,[x1]
00bb8b14	ldrb w1,[x1, #0x1]
00bb8b18	add w2,w23,w2
00bb8b1c	strb w1,[x15]
00bb8b20	lsl x3,x10,x2
00bb8b24	lsr x3,x3,x0
00bb8b28	add x3,x8,x3, LSL #0x1
00bb8b2c	ldrb w1,[x3]
00bb8b30	ldrb w3,[x3, #0x1]
00bb8b34	add w1,w2,w1
00bb8b38	strb w3,[x15, #0x1]
00bb8b3c	lsl x2,x10,x1
00bb8b40	lsr x2,x2,x0
00bb8b44	add x2,x8,x2, LSL #0x1
00bb8b48	ldrb w3,[x2]
00bb8b4c	ldrb w2,[x2, #0x1]
00bb8b50	add w1,w1,w3
00bb8b54	strb w2,[x15, #0x2]
00bb8b58	lsl x3,x10,x1
00bb8b5c	lsr x3,x3,x0
00bb8b60	add x3,x8,x3, LSL #0x1
00bb8b64	ldrb w2,[x3]
00bb8b68	ldrb w3,[x3, #0x1]
00bb8b6c	add w23,w1,w2
00bb8b70	add x1,x15,#0x4
00bb8b74	strb w3,[x15, #0x3]
00bb8b78	cmp w23,#0x40
00bb8b7c	mov x15,x1
00bb8b80	b.ls 0x00bb8aa8
00bb8b84	mov x21,x17
00bb8b88	mov x15,x1
00bb8b8c	b 0x00bb8bf4
00bb8b90	ldr x25,[sp, #0x80]
00bb8b94	cmp w23,#0x40
00bb8b98	b.hi 0x00bb9030
00bb8b9c	ldr x12,[sp, #0x68]
00bb8ba0	ldr x0,[sp, #0x88]
00bb8ba4	cmp x21,x12
00bb8ba8	b.cs 0x00bb8bdc
00bb8bac	cmp x21,x5
00bb8bb0	b.eq 0x00bb9004
00bb8bb4	lsr w12,w23,#0x3
00bb8bb8	sub w17,w21,w5
00bb8bbc	sub x16,x21,x12
00bb8bc0	cmp x16,x5
00bb8bc4	csel w12,w17,w12,cc
00bb8bc8	sub x21,x21,x12
00bb8bcc	sub w23,w23,w12, LSL #0x3
00bb8bd0	ldr x0,[x21]
00bb8bd4	b 0x00bb8bfc
00bb8bd8	b 0x00bb8bf4
00bb8bdc	lsr w12,w23,#0x3
00bb8be0	and w23,w23,#0x7
00bb8be4	sub x21,x21,x12
00bb8be8	ldr x0,[x21]
00bb8bec	b 0x00bb8bfc
00bb8bf0	mov x21,x5
00bb8bf4	ldr x10,[sp, #0x50]
00bb8bf8	ldr x0,[sp, #0x88]
00bb8bfc	cmp x15,x10
00bb8c00	b.cs 0x00bb8c34
00bb8c04	neg w12,w7
00bb8c08	and w12,w12,#0x3f
00bb8c0c	lsl x16,x0,x23
00bb8c10	lsr x16,x16,x12
00bb8c14	add x16,x8,x16, LSL #0x1
00bb8c18	ldrb w17,[x16, #0x1]
00bb8c1c	ldrb w16,[x16]
00bb8c20	strb w17,[x15], #0x1
00bb8c24	cmp x15,x10
00bb8c28	add w23,w23,w16
00bb8c2c	b.cc 0x00bb8c0c
00bb8c30	b 0x00bb8c34
00bb8c34	sub x12,x9,x14
00bb8c38	mov x16,x9
00bb8c3c	cmp x12,#0x4
00bb8c40	b.lt 0x00bb8d40
00bb8c44	cmp w28,#0x40
00bb8c48	b.hi 0x00bb9040
00bb8c4c	neg w15,w7
00bb8c50	ldr x10,[sp, #0x70]
00bb8c54	sub x12,x16,#0x3
00bb8c58	and w16,w15,#0x3f
00bb8c5c	adrp x15,0x789000
00bb8c60	add x15,x15,#0x2b0
00bb8c64	cmp x22,x10
00bb8c68	b.cs 0x00bb8c94
00bb8c6c	cmp x22,x20
00bb8c70	b.eq 0x00bb8d9c
00bb8c74	lsr w17,w28,#0x3
00bb8c78	sub w1,w22,w20
00bb8c7c	sub x0,x22,x17
00bb8c80	cmp x0,x20
00bb8c84	csel w0,w17,w1,cs
00bb8c88	cset w17,cs
00bb8c8c	sub w28,w28,w0, LSL #0x3
00bb8c90	b 0x00bb8ca0
00bb8c94	lsr w0,w28,#0x3
00bb8c98	and w28,w28,#0x7
00bb8c9c	mov w17,#0x1
00bb8ca0	sub x22,x22,w0, UXTW 
00bb8ca4	cmp x14,x12
00bb8ca8	ldr x25,[x22]
00bb8cac	b.cs 0x00bb8d84
00bb8cb0	cbz w17,0x00bb8d84
00bb8cb4	lsl x17,x25,x28
00bb8cb8	lsr x17,x17,x16
00bb8cbc	add x17,x8,x17, LSL #0x1
00bb8cc0	ldrb w0,[x17]
00bb8cc4	ldrb w17,[x17, #0x1]
00bb8cc8	add w0,w28,w0
00bb8ccc	strb w17,[x14]
00bb8cd0	lsl x1,x25,x0
00bb8cd4	lsr x1,x1,x16
00bb8cd8	add x1,x8,x1, LSL #0x1
00bb8cdc	ldrb w17,[x1]
00bb8ce0	ldrb w1,[x1, #0x1]
00bb8ce4	add w17,w0,w17
00bb8ce8	strb w1,[x14, #0x1]
00bb8cec	lsl x0,x25,x17
00bb8cf0	lsr x0,x0,x16
00bb8cf4	add x0,x8,x0, LSL #0x1
00bb8cf8	ldrb w1,[x0]
00bb8cfc	ldrb w0,[x0, #0x1]
00bb8d00	add w17,w17,w1
00bb8d04	strb w0,[x14, #0x2]
00bb8d08	lsl x1,x25,x17
00bb8d0c	lsr x1,x1,x16
00bb8d10	add x1,x8,x1, LSL #0x1
00bb8d14	ldrb w0,[x1]
00bb8d18	ldrb w1,[x1, #0x1]
00bb8d1c	add w28,w17,w0
00bb8d20	add x17,x14,#0x4
00bb8d24	strb w1,[x14, #0x3]
00bb8d28	cmp w28,#0x40
00bb8d2c	mov x14,x17
00bb8d30	b.ls 0x00bb8c64
00bb8d34	mov x22,x15
00bb8d38	mov x14,x17
00bb8d3c	b 0x00bb8da0
00bb8d40	cmp w28,#0x40
00bb8d44	b.hi 0x00bb9040
00bb8d48	ldr x9,[sp, #0x70]
00bb8d4c	cmp x22,x9
00bb8d50	ldr x9,[sp, #0x58]
00bb8d54	b.cs 0x00bb8d88
00bb8d58	cmp x22,x20
00bb8d5c	b.eq 0x00bb900c
00bb8d60	lsr w10,w28,#0x3
00bb8d64	sub w15,w22,w20
00bb8d68	sub x12,x22,x10
00bb8d6c	cmp x12,x20
00bb8d70	csel w10,w15,w10,cc
00bb8d74	sub x22,x22,x10
00bb8d78	sub w28,w28,w10, LSL #0x3
00bb8d7c	ldr x25,[x22]
00bb8d80	b 0x00bb8da8
00bb8d84	b 0x00bb8da0
00bb8d88	lsr w10,w28,#0x3
00bb8d8c	and w28,w28,#0x7
00bb8d90	sub x22,x22,x10
00bb8d94	ldr x25,[x22]
00bb8d98	b 0x00bb8da8
00bb8d9c	mov x22,x20
00bb8da0	mov x16,x9
00bb8da4	ldr x9,[sp, #0x58]
00bb8da8	cmp x14,x16
00bb8dac	b.cs 0x00bb8de0
00bb8db0	neg w10,w7
00bb8db4	and w10,w10,#0x3f
00bb8db8	lsl x12,x25,x28
00bb8dbc	lsr x12,x12,x10
00bb8dc0	add x12,x8,x12, LSL #0x1
00bb8dc4	ldrb w15,[x12, #0x1]
00bb8dc8	ldrb w12,[x12]
00bb8dcc	strb w15,[x14], #0x1
00bb8dd0	cmp x14,x16
00bb8dd4	add w28,w28,w12
00bb8dd8	b.cc 0x00bb8db8
00bb8ddc	b 0x00bb8de0
00bb8de0	sub x12,x6,x11
00bb8de4	ldr w10,[sp, #0xa0]
00bb8de8	cmp x12,#0x4
00bb8dec	b.lt 0x00bb8f14
00bb8df0	cmp w10,#0x40
00bb8df4	b.hi 0x00bb9050
00bb8df8	neg w12,w7
00bb8dfc	and w14,w12,#0x3f
00bb8e00	ldr x12,[sp, #0xa8]
00bb8e04	ldr x15,[sp, #0xb8]
00bb8e08	cmp x12,x15
00bb8e0c	b.cs 0x00bb8e40
00bb8e10	ldr x15,[sp, #0xb0]
00bb8e14	cmp x12,x15
00bb8e18	b.eq 0x00bb8f7c
00bb8e1c	lsr w16,w10,#0x3
00bb8e20	sub w0,w12,w15
00bb8e24	sub x17,x12,x16
00bb8e28	cmp x17,x15
00bb8e2c	csel w15,w16,w0,cs
00bb8e30	sub w10,w10,w15, LSL #0x3
00bb8e34	sub x12,x12,x15
00bb8e38	cset w15,cs
00bb8e3c	b 0x00bb8e50
00bb8e40	lsr w15,w10,#0x3
00bb8e44	and w10,w10,#0x7
00bb8e48	sub x12,x12,x15
00bb8e4c	mov w15,#0x1
00bb8e50	str x12,[sp, #0xa8]
00bb8e54	str w10,[sp, #0xa0]
00bb8e58	cmp x11,x9
00bb8e5c	ldr x16,[x12]
00bb8e60	str x16,[sp, #0x98]
00bb8e64	b.cs 0x00bb8f60
00bb8e68	cbz w15,0x00bb8f60
00bb8e6c	lsl x12,x16,x10
00bb8e70	lsr x12,x12,x14
00bb8e74	add x12,x8,x12, LSL #0x1
00bb8e78	ldrb w15,[x12, #0x1]
00bb8e7c	ldrb w12,[x12]
00bb8e80	strb w15,[x11]
00bb8e84	add w10,w10,w12
00bb8e88	ldr x15,[sp, #0x98]
00bb8e8c	lsl x12,x15,x10
00bb8e90	lsr x12,x12,x14
00bb8e94	add x12,x8,x12, LSL #0x1
00bb8e98	ldrb w15,[x12]
00bb8e9c	ldrb w12,[x12, #0x1]
00bb8ea0	add w10,w10,w15
00bb8ea4	str w10,[sp, #0xa0]
00bb8ea8	strb w12,[x11, #0x1]
00bb8eac	ldr x10,[sp, #0x98]
00bb8eb0	ldr w12,[sp, #0xa0]
00bb8eb4	lsl x10,x10,x12
00bb8eb8	lsr x10,x10,x14
00bb8ebc	add x10,x8,x10, LSL #0x1
00bb8ec0	ldrb w15,[x10]
00bb8ec4	ldrb w10,[x10, #0x1]
00bb8ec8	add w12,w12,w15
00bb8ecc	str w12,[sp, #0xa0]
00bb8ed0	strb w10,[x11, #0x2]
00bb8ed4	ldr x10,[sp, #0x98]
00bb8ed8	ldr w12,[sp, #0xa0]
00bb8edc	lsl x10,x10,x12
00bb8ee0	lsr x10,x10,x14
00bb8ee4	add x10,x8,x10, LSL #0x1
00bb8ee8	ldrb w15,[x10]
00bb8eec	ldrb w10,[x10, #0x1]
00bb8ef0	add w12,w12,w15
00bb8ef4	add x15,x11,#0x4
00bb8ef8	str w12,[sp, #0xa0]
00bb8efc	strb w10,[x11, #0x3]
00bb8f00	mov x11,x15
00bb8f04	ldr w10,[sp, #0xa0]
00bb8f08	cmp w10,#0x40
00bb8f0c	b.ls 0x00bb8e00
00bb8f10	b 0x00bb9054
00bb8f14	cmp w10,#0x41
00bb8f18	b.cs 0x00bb906c
00bb8f1c	ldr x12,[sp, #0xa8]
00bb8f20	ldr x9,[sp, #0xb8]
00bb8f24	cmp x12,x9
00bb8f28	b.cs 0x00bb8f64
00bb8f2c	ldr x9,[sp, #0xb0]
00bb8f30	cmp x12,x9
00bb8f34	b.eq 0x00bb8f7c
00bb8f38	lsr x14,x10,#0x3
00bb8f3c	sub w16,w12,w9
00bb8f40	sub x15,x12,x14
00bb8f44	cmp x15,x9
00bb8f48	csel w9,w16,w14,cc
00bb8f4c	sub w10,w10,w9, LSL #0x3
00bb8f50	sub x12,x12,x9
00bb8f54	str x12,[sp, #0xa8]
00bb8f58	str w10,[sp, #0xa0]
00bb8f5c	b 0x00bb8f74
00bb8f60	b 0x00bb8f7c
00bb8f64	sub x12,x12,x10, LSR #0x3
00bb8f68	and w10,w10,#0x7
00bb8f6c	str w10,[sp, #0xa0]
00bb8f70	str x12,[sp, #0xa8]
00bb8f74	ldr x9,[x12]
00bb8f78	str x9,[sp, #0x98]
00bb8f7c	cmp x11,x6
00bb8f80	b.cs 0x00bb8fcc
00bb8f84	neg w9,w7
00bb8f88	add x10,x19,x4
00bb8f8c	and w9,w9,#0x3f
00bb8f90	sub x10,x10,x11
00bb8f94	ldr x12,[sp, #0x98]
00bb8f98	ldr w14,[sp, #0xa0]
00bb8f9c	subs x10,x10,#0x1
00bb8fa0	lsl x12,x12,x14
00bb8fa4	lsr x12,x12,x9
00bb8fa8	add x12,x8,x12, LSL #0x1
00bb8fac	ldrb w15,[x12]
00bb8fb0	ldrb w12,[x12, #0x1]
00bb8fb4	add w14,w14,w15
00bb8fb8	str w14,[sp, #0xa0]
00bb8fbc	strb w12,[x11], #0x1
00bb8fc0	b.ne 0x00bb8f94
00bb8fc4	ldr x12,[sp, #0xa8]
00bb8fc8	ldr w10,[sp, #0xa0]
00bb8fcc	ldr x8,[sp, #0xb0]
00bb8fd0	cmp w10,#0x40
00bb8fd4	ccmp x12,x8,#0x0,eq
00bb8fd8	mov w8,#0x40
00bb8fdc	ccmp w28,w8,#0x0,eq
00bb8fe0	ccmp x22,x20,#0x0,eq
00bb8fe4	ccmp w23,w8,#0x0,eq
00bb8fe8	ccmp x21,x5,#0x0,eq
00bb8fec	ccmp w13,w8,#0x0,eq
00bb8ff0	ldr x8,[sp, #0x48]
00bb8ff4	ccmp x30,x8,#0x0,eq
00bb8ff8	mov x8,#-0x14
00bb8ffc	csel x0,x8,x19,ne
00bb9000	b 0x00bb87f0
00bb9004	mov x21,x5
00bb9008	b 0x00bb8bfc
00bb900c	mov x22,x20
00bb9010	b 0x00bb8da8
00bb9014	adrp x30,0x789000
00bb9018	add x30,x30,#0x2b0
00bb901c	mov x2,x16
00bb9020	mov x22,x10
00bb9024	cmp x16,x12
00bb9028	b.cc 0x00bb8a20
00bb902c	b 0x00bb8a70
00bb9030	ldr x0,[sp, #0x88]
00bb9034	adrp x21,0x789000
00bb9038	add x21,x21,#0x2b0
00bb903c	b 0x00bb8bfc
00bb9040	ldr x9,[sp, #0x58]
00bb9044	adrp x22,0x789000
00bb9048	add x22,x22,#0x2b0
00bb904c	b 0x00bb8da8
00bb9050	mov x15,x11
00bb9054	adrp x12,0x789000
00bb9058	add x12,x12,#0x2b0
00bb905c	mov x11,x15
00bb9060	str x12,[sp, #0xa8]
00bb9064	b 0x00bb8f7c
00bb9068	bl 0x00c2fec0
00bb906c	adrp x12,0x789000
00bb9070	add x12,x12,#0x2b0
00bb9074	str x12,[sp, #0xa8]
00bb9078	b 0x00bb8f7c
