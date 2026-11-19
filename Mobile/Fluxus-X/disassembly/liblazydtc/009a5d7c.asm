; ix::SocketTLSOptions::getDescription @ 009a5d7c
009a5d7c	sub sp,sp,#0x1a0
009a5d80	stp x28,x27,[sp, #0x140]
009a5d84	stp x26,x25,[sp, #0x150]
009a5d88	stp x24,x23,[sp, #0x160]
009a5d8c	stp x22,x21,[sp, #0x170]
009a5d90	stp x20,x19,[sp, #0x180]
009a5d94	stp x29,x30,[sp, #0x190]
009a5d98	add x29,sp,#0x190
009a5d9c	mov x21,x8
009a5da0	adrp x27,0xcb4000
009a5da4	adrp x8,0xcb4000
009a5da8	mrs x28,tpidr_el0
009a5dac	ldr x27,[x27, #0xc90]
009a5db0	ldr x8,[x8, #0xc88]
009a5db4	ldr x9,[x28, #0x28]
009a5db8	add x20,sp,#0x10
009a5dbc	movi v0.2D,#0x0
009a5dc0	add x10,x8,#0x18
009a5dc4	mov x23,x0
009a5dc8	add x19,x20,#0x80
009a5dcc	add x25,x27,#0x40
009a5dd0	mov v0.D[0x0],x10
009a5dd4	add x22,x20,#0x18
009a5dd8	add x8,x8,#0x40
009a5ddc	stur x9,[x29, #-0x60]
009a5de0	str x25,[sp, #0x20]
009a5de4	str x8,[sp, #0x90]
009a5de8	str q0,[sp, #0x10]
009a5dec	mov x0,x19
009a5df0	mov x1,x22
009a5df4	bl 0x00c30100
009a5df8	str xzr,[sp, #0x118]
009a5dfc	adrp x11,0xcb4000
009a5e00	ldr x11,[x11, #0xa08]
009a5e04	mov w8,#0xffffffff
009a5e08	add x24,x20,#0x10
009a5e0c	fmov d0,x25
009a5e10	str w8,[sp, #0x120]
009a5e14	add x8,x11,#0x10
009a5e18	add x20,x20,#0x20
009a5e1c	add x9,x27,#0x18
009a5e20	add x10,x27,#0x68
009a5e24	mov v0.D[0x1],x8
009a5e28	mov x0,x20
009a5e2c	str x9,[sp, #0x10]
009a5e30	str x10,[sp, #0x90]
009a5e34	str q0,[sp, #0x20]
009a5e38	bl 0x00c30480
009a5e3c	movi v0.2D,#0x0
009a5e40	stur q0,[sp, #0x58]
009a5e44	stur q0,[sp, #0x48]
009a5e48	stur q0,[sp, #0x38]
009a5e4c	adrp x9,0xcb4000
009a5e50	ldr x9,[x9, #0xa00]
009a5e54	orr w8,wzr,#0x18
009a5e58	stur q0,[sp, #0x78]
009a5e5c	stur q0,[sp, #0x68]
009a5e60	add x9,x9,#0x10
009a5e64	str x9,[sp, #0x28]
009a5e68	str w8,[sp, #0x88]
009a5e6c	adrp x1,0x2af000
009a5e70	add x1,x1,#0x806
009a5e74	orr w2,wzr,#0xc
009a5e78	mov x0,x24
009a5e7c	bl 0x00c30e90
009a5e80	ldr x8,[x0]
009a5e84	mov x25,x0
009a5e88	ldur x8,[x8, #-0x18]
009a5e8c	add x0,x0,x8
009a5e90	add x8,sp,#0x8
009a5e94	bl 0x00c30070
009a5e98	adrp x1,0xcb4000
009a5e9c	ldr x1,[x1, #0x998]
009a5ea0	add x0,sp,#0x8
009a5ea4	bl 0x00c30080
009a5ea8	ldr x8,[x0]
009a5eac	ldr x8,[x8, #0x38]
009a5eb0	mov w1,#0xa
009a5eb4	blr x8
009a5eb8	mov w26,w0
009a5ebc	add x0,sp,#0x8
009a5ec0	bl 0x00c30090
009a5ec4	mov x0,x25
009a5ec8	mov w1,w26
009a5ecc	bl 0x00c31510
009a5ed0	mov x0,x25
009a5ed4	bl 0x00c30e50
009a5ed8	adrp x1,0x29d000
009a5edc	add x1,x1,#0xace
009a5ee0	mov w2,#0xd
009a5ee4	mov x0,x24
009a5ee8	bl 0x00c30e90
009a5eec	ldrb w8,[x23]
009a5ef0	ldp x10,x9,[x23, #0x8]
009a5ef4	tst w8,#0x1
009a5ef8	lsr w11,w8,#0x1
009a5efc	csinc x1,x9,x23,ne
009a5f00	csel x2,x11,x10,eq
009a5f04	bl 0x00c30e90
009a5f08	ldr x8,[x0]
009a5f0c	mov x25,x0
009a5f10	ldur x8,[x8, #-0x18]
009a5f14	add x0,x0,x8
009a5f18	add x8,sp,#0x8
009a5f1c	bl 0x00c30070
009a5f20	adrp x1,0xcb4000
009a5f24	ldr x1,[x1, #0x998]
009a5f28	add x0,sp,#0x8
009a5f2c	bl 0x00c30080
009a5f30	ldr x8,[x0]
009a5f34	ldr x8,[x8, #0x38]
009a5f38	mov w1,#0xa
009a5f3c	blr x8
009a5f40	mov w26,w0
009a5f44	add x0,sp,#0x8
009a5f48	bl 0x00c30090
009a5f4c	mov x0,x25
009a5f50	mov w1,w26
009a5f54	bl 0x00c31510
009a5f58	mov x0,x25
009a5f5c	bl 0x00c30e50
009a5f60	adrp x1,0x2d3000
009a5f64	add x1,x1,#0x425
009a5f68	mov w2,#0xd
009a5f6c	mov x0,x24
009a5f70	bl 0x00c30e90
009a5f74	ldrb w8,[x23, #0x18]
009a5f78	ldp x9,x10,[x23, #0x20]
009a5f7c	add x11,x23,#0x19
009a5f80	tst w8,#0x1
009a5f84	lsr w12,w8,#0x1
009a5f88	csel x1,x11,x10,eq
009a5f8c	csel x2,x12,x9,eq
009a5f90	bl 0x00c30e90
009a5f94	ldr x8,[x0]
009a5f98	mov x25,x0
009a5f9c	ldur x8,[x8, #-0x18]
009a5fa0	add x0,x0,x8
009a5fa4	add x8,sp,#0x8
009a5fa8	bl 0x00c30070
009a5fac	adrp x1,0xcb4000
009a5fb0	ldr x1,[x1, #0x998]
009a5fb4	add x0,sp,#0x8
009a5fb8	bl 0x00c30080
009a5fbc	ldr x8,[x0]
009a5fc0	ldr x8,[x8, #0x38]
009a5fc4	mov w1,#0xa
009a5fc8	blr x8
009a5fcc	mov w26,w0
009a5fd0	add x0,sp,#0x8
009a5fd4	bl 0x00c30090
009a5fd8	mov x0,x25
009a5fdc	mov w1,w26
009a5fe0	bl 0x00c31510
009a5fe4	mov x0,x25
009a5fe8	bl 0x00c30e50
009a5fec	adrp x1,0x2b3000
009a5ff0	add x1,x1,#0xad6
009a5ff4	mov w2,#0xd
009a5ff8	mov x0,x24
009a5ffc	bl 0x00c30e90
009a6000	ldrb w8,[x23, #0x30]
009a6004	ldp x9,x10,[x23, #0x38]
009a6008	add x11,x23,#0x31
009a600c	tst w8,#0x1
009a6010	lsr w12,w8,#0x1
009a6014	csel x1,x11,x10,eq
009a6018	csel x2,x12,x9,eq
009a601c	bl 0x00c30e90
009a6020	ldr x8,[x0]
009a6024	mov x25,x0
009a6028	ldur x8,[x8, #-0x18]
009a602c	add x0,x0,x8
009a6030	add x8,sp,#0x8
009a6034	bl 0x00c30070
009a6038	adrp x1,0xcb4000
009a603c	ldr x1,[x1, #0x998]
009a6040	add x0,sp,#0x8
009a6044	bl 0x00c30080
009a6048	ldr x8,[x0]
009a604c	ldr x8,[x8, #0x38]
009a6050	mov w1,#0xa
009a6054	blr x8
009a6058	mov w26,w0
009a605c	add x0,sp,#0x8
009a6060	bl 0x00c30090
009a6064	mov x0,x25
009a6068	mov w1,w26
009a606c	bl 0x00c31510
009a6070	mov x0,x25
009a6074	bl 0x00c30e50
009a6078	adrp x1,0x2a9000
009a607c	add x1,x1,#0xb0a
009a6080	mov w2,#0xd
009a6084	mov x0,x24
009a6088	bl 0x00c30e90
009a608c	ldrb w8,[x23, #0x48]
009a6090	ldp x9,x10,[x23, #0x50]
009a6094	add x11,x23,#0x49
009a6098	tst w8,#0x1
009a609c	lsr w12,w8,#0x1
009a60a0	csel x1,x11,x10,eq
009a60a4	csel x2,x12,x9,eq
009a60a8	bl 0x00c30e90
009a60ac	ldr x8,[x0]
009a60b0	mov x25,x0
009a60b4	ldur x8,[x8, #-0x18]
009a60b8	add x0,x0,x8
009a60bc	add x8,sp,#0x8
009a60c0	bl 0x00c30070
009a60c4	adrp x1,0xcb4000
009a60c8	ldr x1,[x1, #0x998]
009a60cc	add x0,sp,#0x8
009a60d0	bl 0x00c30080
009a60d4	ldr x8,[x0]
009a60d8	ldr x8,[x8, #0x38]
009a60dc	mov w1,#0xa
009a60e0	blr x8
009a60e4	mov w26,w0
009a60e8	add x0,sp,#0x8
009a60ec	bl 0x00c30090
009a60f0	mov x0,x25
009a60f4	mov w1,w26
009a60f8	bl 0x00c31510
009a60fc	mov x0,x25
009a6100	bl 0x00c30e50
009a6104	adrp x1,0x2b1000
009a6108	add x1,x1,#0xbc1
009a610c	mov w2,#0xd
009a6110	mov x0,x24
009a6114	bl 0x00c30e90
009a6118	ldrb w1,[x23, #0x60]
009a611c	bl 0x00c33730
009a6120	ldr x8,[x0]
009a6124	mov x23,x0
009a6128	ldur x8,[x8, #-0x18]
009a612c	add x0,x0,x8
009a6130	add x8,sp,#0x8
009a6134	bl 0x00c30070
009a6138	adrp x1,0xcb4000
009a613c	ldr x1,[x1, #0x998]
009a6140	add x0,sp,#0x8
009a6144	bl 0x00c30080
009a6148	ldr x8,[x0]
009a614c	ldr x8,[x8, #0x38]
009a6150	mov w1,#0xa
009a6154	blr x8
009a6158	mov w24,w0
009a615c	add x0,sp,#0x8
009a6160	bl 0x00c30090
009a6164	mov x0,x23
009a6168	mov w1,w24
009a616c	bl 0x00c31510
009a6170	mov x0,x23
009a6174	bl 0x00c30e50
009a6178	mov x8,x21
009a617c	mov x0,x22
009a6180	bl 0x00c30e20
009a6184	adrp x11,0xcb4000
009a6188	add x8,x27,#0x18
009a618c	ldr x11,[x11, #0xa00]
009a6190	str x8,[sp, #0x10]
009a6194	ldrb w8,[sp, #0x68]
009a6198	add x9,x27,#0x68
009a619c	add x10,x27,#0x40
009a61a0	add x11,x11,#0x10
009a61a4	str x9,[sp, #0x90]
009a61a8	stp x10,x11,[sp, #0x20]
009a61ac	tbz w8,#0x0,0x009a61b8
009a61b0	ldr x0,[sp, #0x78]
009a61b4	bl 0x00c301d0
009a61b8	adrp x8,0xcb4000
009a61bc	ldr x8,[x8, #0xa08]
009a61c0	mov x0,x20
009a61c4	add x8,x8,#0x10
009a61c8	str x8,[sp, #0x28]
009a61cc	bl 0x00c30090
009a61d0	mov x0,x19
009a61d4	bl 0x00c30ee0
009a61d8	ldr x8,[x28, #0x28]
009a61dc	ldur x9,[x29, #-0x60]
009a61e0	cmp x8,x9
009a61e4	b.ne 0x009a6208
009a61e8	ldp x29,x30,[sp, #0x190]
009a61ec	ldp x20,x19,[sp, #0x180]
009a61f0	ldp x22,x21,[sp, #0x170]
009a61f4	ldp x24,x23,[sp, #0x160]
009a61f8	ldp x26,x25,[sp, #0x150]
009a61fc	ldp x28,x27,[sp, #0x140]
009a6200	add sp,sp,#0x1a0
009a6204	ret
009a6208	bl 0x00c2fec0
