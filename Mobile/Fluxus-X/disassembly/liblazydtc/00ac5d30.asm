; FUN_00ac5d30 @ 00ac5d30
00ac5d30	str x28,[sp, #-0x60]!
00ac5d34	stp x26,x25,[sp, #0x10]
00ac5d38	stp x24,x23,[sp, #0x20]
00ac5d3c	stp x22,x21,[sp, #0x30]
00ac5d40	stp x20,x19,[sp, #0x40]
00ac5d44	stp x29,x30,[sp, #0x50]
00ac5d48	add x29,sp,#0x50
00ac5d4c	sub sp,sp,#0x3f0
00ac5d50	ldr x25,[x1]
00ac5d54	mov w21,w3
00ac5d58	mov x20,x2
00ac5d5c	mov x19,x1
00ac5d60	stur x25,[x29, #-0x48]
00ac5d64	ldrb w24,[x25]
00ac5d68	mov x22,x0
00ac5d6c	sub w8,w24,#0x22
00ac5d70	cmp w8,#0xe
00ac5d74	b.hi 0x00ac60c8
00ac5d78	adrp x9,0x774000
00ac5d7c	add x9,x9,#0x6e8
00ac5d80	ldrsw x8,[x9, x8, LSL #0x2]
00ac5d84	add x8,x8,x9
00ac5d88	br x8
00ac5d8c	add x23,x25,#0x1
00ac5d90	stur x23,[x29, #-0x48]
00ac5d94	ldrb w9,[x25, #0x1]
00ac5d98	mov x8,xzr
00ac5d9c	mov w25,wzr
00ac5da0	cmp w9,#0x0
00ac5da4	cset w11,eq
00ac5da8	cbz w9,0x00ac5f50
00ac5dac	cmp w9,w24
00ac5db0	mov x26,x23
00ac5db4	b.eq 0x00ac5dfc
00ac5db8	mov w25,wzr
00ac5dbc	mov x8,xzr
00ac5dc0	add x10,sp,#0x8
00ac5dc4	mov x26,x23
00ac5dc8	cmp x8,#0x3e6
00ac5dcc	b.hi 0x00ac5de0
00ac5dd0	add x11,x8,#0x1
00ac5dd4	strb w9,[x10, x8]
00ac5dd8	mov x8,x11
00ac5ddc	b 0x00ac5de4
00ac5de0	mov w25,#0x1
00ac5de4	ldrb w9,[x26, #0x1]!
00ac5de8	cmp w9,#0x0
00ac5dec	cset w11,eq
00ac5df0	cbz w9,0x00ac5dfc
00ac5df4	cmp w9,w24
00ac5df8	b.ne 0x00ac5dc8
00ac5dfc	cbz w11,0x00ac5f58
00ac5e00	bl 0x00c342a0
00ac5e04	adrp x0,0x2d8000
00ac5e08	adrp x2,0x2ac000
00ac5e0c	add x0,x0,#0x6ba
00ac5e10	add x2,x2,#0x772
00ac5e14	mov w1,#0xd1
00ac5e18	bl 0x00c342b0
00ac5e1c	adrp x2,0x2c4000
00ac5e20	add x2,x2,#0x122
00ac5e24	mov w0,#0x37
00ac5e28	mov w1,#0x6a
00ac5e2c	mov w3,w24
00ac5e30	mov x4,x23
00ac5e34	bl 0x00c342c0
00ac5e38	mov w0,wzr
00ac5e3c	cbnz w0,0x00ac6088
00ac5e40	b 0x00ac621c
00ac5e44	add x8,x25,#0x1
00ac5e48	sub x0,x29,#0x48
00ac5e4c	mov x1,x20
00ac5e50	stur x8,[x29, #-0x48]
00ac5e54	bl 0x00ac70bc
00ac5e58	cbnz w0,0x00ac6088
00ac5e5c	b 0x00ac621c
00ac5e60	add x8,x25,#0x1
00ac5e64	sub x0,x29,#0x48
00ac5e68	mov x1,x20
00ac5e6c	stur x8,[x29, #-0x48]
00ac5e70	bl 0x00ac70bc
00ac5e74	ldr x8,[x20, #0x10]
00ac5e78	neg x8,x8
00ac5e7c	str x8,[x20, #0x10]
00ac5e80	cbnz w0,0x00ac6088
00ac5e84	b 0x00ac621c
00ac5e88	mov x23,x25
00ac5e8c	ldrb w0,[x23, #0x1]!
00ac5e90	cmp w0,#0x78
00ac5e94	b.ne 0x00ac5f9c
00ac5e98	mov x24,#0xe
00ac5e9c	mov x22,xzr
00ac5ea0	add x21,x25,#0x2
00ac5ea4	add x25,x25,#0x1
00ac5ea8	orr x23,xzr,#0x7fffffffffffffff
00ac5eac	movk x24,#0x8000, LSL #48
00ac5eb0	stur x21,[x29, #-0x48]
00ac5eb4	ldrb w0,[x25, #0x1]
00ac5eb8	bl 0x00c37770
00ac5ebc	ldrb w8,[x25, #0x1]
00ac5ec0	cbz w0,0x00ac5ecc
00ac5ec4	sub w8,w8,#0x30
00ac5ec8	b 0x00ac5ee8
00ac5ecc	mov w1,#0x10
00ac5ed0	mov w0,w8
00ac5ed4	bl 0x00c377c0
00ac5ed8	cbz w0,0x00ac61ac
00ac5edc	ldrb w0,[x25, #0x1]
00ac5ee0	bl 0x00c3de30
00ac5ee4	sub w8,w0,#0x57
00ac5ee8	sxtw x8,w8
00ac5eec	sub x9,x23,x8
00ac5ef0	sub x10,x24,x8
00ac5ef4	cmp x9,#0x0
00ac5ef8	csel x9,x10,x9,lt
00ac5efc	cmp x22,x9, ASR #0x4
00ac5f00	b.gt 0x00ac6094
00ac5f04	ldrb w0,[x25, #0x2]
00ac5f08	mov w1,#0x10
00ac5f0c	add x22,x8,x22, LSL #0x4
00ac5f10	bl 0x00c377c0
00ac5f14	add x25,x25,#0x1
00ac5f18	cbnz w0,0x00ac5eb4
00ac5f1c	ldrb w0,[x25, #0x1]
00ac5f20	mov w1,#0x8
00ac5f24	bl 0x00c377c0
00ac5f28	cbz w0,0x00ac61d4
00ac5f2c	ldrb w0,[x25, #0x1]!
00ac5f30	mov w1,#0x8
00ac5f34	bl 0x00c377c0
00ac5f38	cbnz w0,0x00ac5f2c
00ac5f3c	mov w0,#0x1
00ac5f40	stur x25,[x29, #-0x48]
00ac5f44	str w0,[x20, #0x4]
00ac5f48	str x22,[x20, #0x10]
00ac5f4c	b 0x00ac608c
00ac5f50	mov x26,x23
00ac5f54	cbnz w11,0x00ac5e00
00ac5f58	add x9,sp,#0x8
00ac5f5c	strb wzr,[x9, x8]
00ac5f60	cbz w25,0x00ac6050
00ac5f64	bl 0x00c342a0
00ac5f68	adrp x0,0x2d8000
00ac5f6c	adrp x2,0x2ac000
00ac5f70	add x0,x0,#0x6ba
00ac5f74	add x2,x2,#0x772
00ac5f78	mov w1,#0xd7
00ac5f7c	bl 0x00c342b0
00ac5f80	adrp x2,0x2b7000
00ac5f84	add x2,x2,#0x91b
00ac5f88	mov w0,#0x37
00ac5f8c	mov w1,#0x6d
00ac5f90	mov x3,x23
00ac5f94	bl 0x00c342c0
00ac5f98	b 0x00ac6064
00ac5f9c	bl 0x00c37770
00ac5fa0	cbz w0,0x00ac60c4
00ac5fa4	stur x23,[x29, #-0x48]
00ac5fa8	ldrb w0,[x23]
00ac5fac	mov x22,#0x2f
00ac5fb0	mov x24,#0x36
00ac5fb4	mov x21,xzr
00ac5fb8	movk x22,#0x8000, LSL #48
00ac5fbc	movk x24,#0x8000, LSL #48
00ac5fc0	and w8,w0,#0xfe
00ac5fc4	cmp w8,#0x38
00ac5fc8	b.eq 0x00ac6178
00ac5fcc	and w0,w0,#0xff
00ac5fd0	bl 0x00c37770
00ac5fd4	cbz w0,0x00ac6178
00ac5fd8	ldrb w8,[x25, #0x1]
00ac5fdc	sub x9,x22,x8
00ac5fe0	sub x10,x24,x8
00ac5fe4	cmp x9,#0x0
00ac5fe8	csel x9,x10,x9,lt
00ac5fec	cmp x21,x9, ASR #0x3
00ac5ff0	b.gt 0x00ac623c
00ac5ff4	ldrb w0,[x25, #0x2]
00ac5ff8	add x8,x8,x21, LSL #0x3
00ac5ffc	sub x21,x8,#0x30
00ac6000	bl 0x00c37770
00ac6004	mov w8,w0
00ac6008	ldrb w0,[x25, #0x2]
00ac600c	add x25,x25,#0x1
00ac6010	cbz w8,0x00ac6020
00ac6014	and w8,w0,#0xfe
00ac6018	cmp w8,#0x38
00ac601c	b.ne 0x00ac5fc0
00ac6020	mov w1,#0x8
00ac6024	bl 0x00c377c0
00ac6028	cbz w0,0x00ac6354
00ac602c	ldrb w0,[x25, #0x1]!
00ac6030	mov w1,#0x8
00ac6034	bl 0x00c377c0
00ac6038	cbnz w0,0x00ac602c
00ac603c	mov w0,#0x1
00ac6040	stur x25,[x29, #-0x48]
00ac6044	str w0,[x20, #0x4]
00ac6048	str x21,[x20, #0x10]
00ac604c	b 0x00ac608c
00ac6050	add x1,sp,#0x8
00ac6054	mov x0,x22
00ac6058	mov w2,w21
00ac605c	bl 0x00c3f890
00ac6060	str w0,[x20, #0x10]
00ac6064	ldrb w0,[x26, #0x1]!
00ac6068	mov w1,#0x8
00ac606c	bl 0x00c377c0
00ac6070	cbnz w0,0x00ac6064
00ac6074	cmp w25,#0x0
00ac6078	stur x26,[x29, #-0x48]
00ac607c	cset w0,eq
00ac6080	str wzr,[x20, #0x4]
00ac6084	cbz w0,0x00ac621c
00ac6088	ldur x25,[x29, #-0x48]
00ac608c	str x25,[x19]
00ac6090	b 0x00ac621c
00ac6094	bl 0x00c342a0
00ac6098	adrp x0,0x2d8000
00ac609c	adrp x2,0x2ce000
00ac60a0	add x0,x0,#0x6ba
00ac60a4	add x2,x2,#0x239
00ac60a8	mov w1,#0x90
00ac60ac	bl 0x00c342b0
00ac60b0	adrp x2,0x2a6000
00ac60b4	add x2,x2,#0x701
00ac60b8	mov w0,#0x37
00ac60bc	mov w1,#0x6c
00ac60c0	b 0x00ac6210
00ac60c4	ldrb w24,[x25]
00ac60c8	mov w0,w24
00ac60cc	bl 0x00c37770
00ac60d0	cbz w0,0x00ac60e4
00ac60d4	mov x0,x19
00ac60d8	mov x1,x20
00ac60dc	bl 0x00ac70bc
00ac60e0	b 0x00ac621c
00ac60e4	ldrb w0,[x25]
00ac60e8	orr w1,wzr,#0x3
00ac60ec	bl 0x00c377c0
00ac60f0	cbz w0,0x00ac621c
00ac60f4	ldr x23,[x19]
00ac60f8	ldrb w8,[x23]
00ac60fc	cbz w8,0x00ac6218
00ac6100	cmp w8,#0x2c
00ac6104	mov w0,wzr
00ac6108	b.eq 0x00ac621c
00ac610c	mov w1,#0x100
00ac6110	mov w0,w8
00ac6114	bl 0x00c377c0
00ac6118	cbz w0,0x00ac6270
00ac611c	mov w24,wzr
00ac6120	mov x25,xzr
00ac6124	add x26,sp,#0x8
00ac6128	ldrb w0,[x23]
00ac612c	mov w1,#0x8
00ac6130	bl 0x00c377c0
00ac6134	cbnz w0,0x00ac6278
00ac6138	ldrb w0,[x23]
00ac613c	cmp w0,#0x2c
00ac6140	b.eq 0x00ac6278
00ac6144	cmp x25,#0x3e6
00ac6148	b.hi 0x00ac6160
00ac614c	bl 0x00c3de30
00ac6150	add x8,x25,#0x1
00ac6154	strb w0,[x26, x25]
00ac6158	mov x25,x8
00ac615c	b 0x00ac6164
00ac6160	mov w24,#0x1
00ac6164	ldrb w0,[x23, #0x1]!
00ac6168	mov w1,#0x100
00ac616c	bl 0x00c377c0
00ac6170	cbnz w0,0x00ac6128
00ac6174	b 0x00ac6278
00ac6178	bl 0x00c342a0
00ac617c	adrp x0,0x2d8000
00ac6180	adrp x2,0x2a2000
00ac6184	add x0,x0,#0x6ba
00ac6188	add x2,x2,#0xbfd
00ac618c	mov w1,#0xaa
00ac6190	bl 0x00c342b0
00ac6194	adrp x2,0x2b7000
00ac6198	add x2,x2,#0x91b
00ac619c	mov w0,#0x37
00ac61a0	mov w1,#0x68
00ac61a4	mov x3,x23
00ac61a8	b 0x00ac6214
00ac61ac	bl 0x00c342a0
00ac61b0	adrp x0,0x2d8000
00ac61b4	adrp x2,0x2ce000
00ac61b8	add x0,x0,#0x6ba
00ac61bc	add x2,x2,#0x239
00ac61c0	mov w1,#0x8a
00ac61c4	bl 0x00c342b0
00ac61c8	adrp x2,0x2b6000
00ac61cc	add x2,x2,#0xc62
00ac61d0	b 0x00ac6208
00ac61d4	ldrb w8,[x25, #0x1]
00ac61d8	cbz w8,0x00ac5f2c
00ac61dc	cmp w8,#0x2c
00ac61e0	b.eq 0x00ac5f2c
00ac61e4	bl 0x00c342a0
00ac61e8	adrp x0,0x2d8000
00ac61ec	adrp x2,0x2ce000
00ac61f0	add x0,x0,#0x6ba
00ac61f4	add x2,x2,#0x239
00ac61f8	mov w1,#0x99
00ac61fc	bl 0x00c342b0
00ac6200	adrp x2,0x2b7000
00ac6204	add x2,x2,#0x91b
00ac6208	mov w0,#0x37
00ac620c	mov w1,#0x66
00ac6210	mov x3,x21
00ac6214	bl 0x00c342c0
00ac6218	mov w0,wzr
00ac621c	add sp,sp,#0x3f0
00ac6220	ldp x29,x30,[sp, #0x50]
00ac6224	ldp x20,x19,[sp, #0x40]
00ac6228	ldp x22,x21,[sp, #0x30]
00ac622c	ldp x24,x23,[sp, #0x20]
00ac6230	ldp x26,x25,[sp, #0x10]
00ac6234	ldr x28,[sp], #0x60
00ac6238	ret
00ac623c	bl 0x00c342a0
00ac6240	adrp x0,0x2d8000
00ac6244	adrp x2,0x2a2000
00ac6248	add x0,x0,#0x6ba
00ac624c	add x2,x2,#0xbfd
00ac6250	mov w1,#0xaf
00ac6254	bl 0x00c342b0
00ac6258	adrp x2,0x2a6000
00ac625c	add x2,x2,#0x701
00ac6260	mov w0,#0x37
00ac6264	mov w1,#0x6c
00ac6268	mov x3,x23
00ac626c	b 0x00ac6214
00ac6270	mov x25,xzr
00ac6274	mov w24,wzr
00ac6278	ldrb w0,[x23]
00ac627c	mov w1,#0x8
00ac6280	bl 0x00c377c0
00ac6284	cbz w0,0x00ac62cc
00ac6288	add x8,sp,#0x8
00ac628c	strb wzr,[x8, x25]
00ac6290	cbz w24,0x00ac6310
00ac6294	bl 0x00c342a0
00ac6298	adrp x0,0x2d8000
00ac629c	adrp x2,0x2ca000
00ac62a0	add x0,x0,#0x6ba
00ac62a4	add x2,x2,#0x2c2
00ac62a8	orr w1,wzr,#0xf8
00ac62ac	bl 0x00c342b0
00ac62b0	ldr x3,[x19]
00ac62b4	adrp x2,0x2b7000
00ac62b8	add x2,x2,#0x91b
00ac62bc	mov w0,#0x37
00ac62c0	mov w1,#0x6d
00ac62c4	bl 0x00c342c0
00ac62c8	b 0x00ac632c
00ac62cc	ldrb w8,[x23]
00ac62d0	cbz w8,0x00ac6288
00ac62d4	cmp w8,#0x2c
00ac62d8	b.eq 0x00ac6288
00ac62dc	bl 0x00c342a0
00ac62e0	adrp x0,0x2d8000
00ac62e4	adrp x2,0x2ca000
00ac62e8	add x0,x0,#0x6ba
00ac62ec	add x2,x2,#0x2c2
00ac62f0	mov w1,#0xf2
00ac62f4	bl 0x00c342b0
00ac62f8	adrp x2,0x2b7000
00ac62fc	add x2,x2,#0x91b
00ac6300	mov w0,#0x37
00ac6304	mov w1,#0x65
00ac6308	mov x3,x23
00ac630c	b 0x00ac6214
00ac6310	add x1,sp,#0x8
00ac6314	mov x0,x22
00ac6318	mov w2,w21
00ac631c	bl 0x00c3f890
00ac6320	cmp w0,#0x0
00ac6324	cset w24,eq
00ac6328	str w0,[x20, #0x10]
00ac632c	sub x21,x23,#0x1
00ac6330	ldrb w0,[x21, #0x1]!
00ac6334	mov w1,#0x8
00ac6338	bl 0x00c377c0
00ac633c	cbnz w0,0x00ac6330
00ac6340	cmp w24,#0x0
00ac6344	str x21,[x19]
00ac6348	str wzr,[x20, #0x4]
00ac634c	cset w0,eq
00ac6350	b 0x00ac621c
00ac6354	ldrb w8,[x25, #0x1]
00ac6358	cbz w8,0x00ac602c
00ac635c	cmp w8,#0x2c
00ac6360	b.eq 0x00ac602c
00ac6364	bl 0x00c342a0
00ac6368	adrp x0,0x2d8000
00ac636c	adrp x2,0x2a2000
00ac6370	add x0,x0,#0x6ba
00ac6374	add x2,x2,#0xbfd
00ac6378	mov w1,#0xb7
00ac637c	b 0x00ac6190
