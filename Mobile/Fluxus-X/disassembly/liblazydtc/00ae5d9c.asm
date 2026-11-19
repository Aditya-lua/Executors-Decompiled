; ossl_sm4_decrypt @ 00ae5d9c
00ae5d9c	ldp w10,w11,[x0, #0x8]
00ae5da0	ldp w12,w9,[x0]
00ae5da4	ldp w13,w14,[x2, #0x78]
00ae5da8	adrp x8,0x775000
00ae5dac	eor w15,w11,w10
00ae5db0	rev w16,w15
00ae5db4	eor w15,w15,w9
00ae5db8	rev w15,w15
00ae5dbc	eor w14,w15,w14
00ae5dc0	add x8,x8,#0xfd0
00ae5dc4	lsr w15,w14,#0x18
00ae5dc8	eor w13,w16,w13
00ae5dcc	ubfx w16,w14,#0x10,#0x8
00ae5dd0	ldrb w15,[x8, w15, UXTW ]
00ae5dd4	ldrb w16,[x8, w16, UXTW ]
00ae5dd8	ubfx w17,w14,#0x8,#0x8
00ae5ddc	and w14,w14,#0xff
00ae5de0	ldrb w17,[x8, w17, UXTW ]
00ae5de4	ldrb w14,[x8, w14, UXTW ]
00ae5de8	lsl w18,w15,#0x18
00ae5dec	bfm w18,w16,#0x10,#0x7
00ae5df0	mov w16,w18
00ae5df4	bfm w16,w17,#0x18,#0x7
00ae5df8	rev w12,w12
00ae5dfc	orr w17,w16,w14
00ae5e00	lsr w15,w15,#0x6
00ae5e04	extr w14,w14,w16,#0x8
00ae5e08	eor w12,w17,w12
00ae5e0c	bfm w15,w17,#0x1e,#0x1d
00ae5e10	rev w3,w10
00ae5e14	eor w10,w12,w14
00ae5e18	extr w18,w17,w18,#0x16
00ae5e1c	eor w10,w10,w15
00ae5e20	extr w16,w17,w16,#0xe
00ae5e24	eor w10,w10,w18
00ae5e28	eor w10,w10,w16
00ae5e2c	rev w4,w11
00ae5e30	eor w11,w13,w10
00ae5e34	lsr w12,w11,#0x18
00ae5e38	ubfx w13,w11,#0x10,#0x8
00ae5e3c	ldrb w12,[x8, w12, UXTW ]
00ae5e40	ldrb w13,[x8, w13, UXTW ]
00ae5e44	ubfx w14,w11,#0x8,#0x8
00ae5e48	and w11,w11,#0xff
00ae5e4c	ldrb w14,[x8, w14, UXTW ]
00ae5e50	ldrb w11,[x8, w11, UXTW ]
00ae5e54	lsl w15,w12,#0x18
00ae5e58	bfm w15,w13,#0x10,#0x7
00ae5e5c	mov w13,w15
00ae5e60	bfm w13,w14,#0x18,#0x7
00ae5e64	rev w9,w9
00ae5e68	orr w14,w13,w11
00ae5e6c	lsr w12,w12,#0x6
00ae5e70	extr w11,w11,w13,#0x8
00ae5e74	eor w9,w14,w9
00ae5e78	ldp w17,w0,[x2, #0x70]
00ae5e7c	bfm w12,w14,#0x1e,#0x1d
00ae5e80	eor w9,w9,w11
00ae5e84	extr w15,w14,w15,#0x16
00ae5e88	eor w9,w9,w12
00ae5e8c	extr w13,w14,w13,#0xe
00ae5e90	eor w9,w9,w15
00ae5e94	eor w11,w9,w13
00ae5e98	eor w0,w0,w4
00ae5e9c	eor w9,w11,w10
00ae5ea0	eor w12,w0,w9
00ae5ea4	lsr w13,w12,#0x18
00ae5ea8	ubfx w14,w12,#0x10,#0x8
00ae5eac	ldrb w13,[x8, w13, UXTW ]
00ae5eb0	ldrb w14,[x8, w14, UXTW ]
00ae5eb4	ubfx w15,w12,#0x8,#0x8
00ae5eb8	and w12,w12,#0xff
00ae5ebc	ldrb w15,[x8, w15, UXTW ]
00ae5ec0	ldrb w12,[x8, w12, UXTW ]
00ae5ec4	lsl w16,w13,#0x18
00ae5ec8	bfm w16,w14,#0x10,#0x7
00ae5ecc	mov w14,w16
00ae5ed0	bfm w14,w15,#0x18,#0x7
00ae5ed4	lsr w13,w13,#0x6
00ae5ed8	orr w15,w14,w12
00ae5edc	extr w12,w12,w14,#0x8
00ae5ee0	bfm w13,w15,#0x1e,#0x1d
00ae5ee4	extr w16,w15,w16,#0x16
00ae5ee8	extr w14,w15,w14,#0xe
00ae5eec	eor w15,w15,w3
00ae5ef0	eor w12,w15,w12
00ae5ef4	eor w12,w12,w13
00ae5ef8	eor w12,w12,w16
00ae5efc	eor w9,w9,w17
00ae5f00	eor w12,w12,w14
00ae5f04	eor w9,w9,w12
00ae5f08	lsr w13,w9,#0x18
00ae5f0c	ubfx w14,w9,#0x10,#0x8
00ae5f10	ldrb w13,[x8, w13, UXTW ]
00ae5f14	ldrb w14,[x8, w14, UXTW ]
00ae5f18	ubfx w15,w9,#0x8,#0x8
00ae5f1c	and w9,w9,#0xff
00ae5f20	ldrb w15,[x8, w15, UXTW ]
00ae5f24	ldrb w9,[x8, w9, UXTW ]
00ae5f28	lsl w16,w13,#0x18
00ae5f2c	bfm w16,w14,#0x10,#0x7
00ae5f30	mov w14,w16
00ae5f34	bfm w14,w15,#0x18,#0x7
00ae5f38	lsr w13,w13,#0x6
00ae5f3c	orr w15,w14,w9
00ae5f40	extr w0,w9,w14,#0x8
00ae5f44	bfm w13,w15,#0x1e,#0x1d
00ae5f48	extr w16,w15,w16,#0x16
00ae5f4c	extr w14,w15,w14,#0xe
00ae5f50	eor w15,w15,w4
00ae5f54	eor w15,w15,w0
00ae5f58	eor w13,w15,w13
00ae5f5c	ldp w17,w18,[x2, #0x68]
00ae5f60	eor w13,w13,w16
00ae5f64	eor w13,w13,w14
00ae5f68	eor w14,w13,w12
00ae5f6c	eor w15,w14,w11
00ae5f70	adrp x9,0x776000
00ae5f74	eor w15,w15,w18
00ae5f78	add x9,x9,#0xd0
00ae5f7c	lsr w16,w15,#0x18
00ae5f80	ldr w16,[x9, w16, UXTW #0x2]
00ae5f84	eor w14,w14,w17
00ae5f88	ubfx w17,w15,#0x10,#0x8
00ae5f8c	ldr w17,[x9, w17, UXTW #0x2]
00ae5f90	eor w10,w16,w10
00ae5f94	ubfx w16,w15,#0x8,#0x8
00ae5f98	and w15,w15,#0xff
00ae5f9c	ldr w16,[x9, w16, UXTW #0x2]
00ae5fa0	ldr w15,[x9, w15, UXTW #0x2]
00ae5fa4	eor w10,w10,w17, ROR #0x8
00ae5fa8	ldp w18,w0,[x2, #0x60]
00ae5fac	eor w10,w10,w16, ROR #0x10
00ae5fb0	eor w10,w10,w15, ROR #0x18
00ae5fb4	eor w14,w14,w10
00ae5fb8	lsr w15,w14,#0x18
00ae5fbc	ubfx w16,w14,#0x10,#0x8
00ae5fc0	ldr w15,[x9, w15, UXTW #0x2]
00ae5fc4	ubfx w17,w14,#0x8,#0x8
00ae5fc8	ldr w16,[x9, w16, UXTW #0x2]
00ae5fcc	and w14,w14,#0xff
00ae5fd0	ldr w17,[x9, w17, UXTW #0x2]
00ae5fd4	ldr w14,[x9, w14, UXTW #0x2]
00ae5fd8	eor w11,w15,w11
00ae5fdc	eor w11,w11,w16, ROR #0x8
00ae5fe0	eor w11,w11,w17, ROR #0x10
00ae5fe4	eor w11,w11,w14, ROR #0x18
00ae5fe8	eor w0,w0,w13
00ae5fec	eor w14,w11,w10
00ae5ff0	eor w15,w0,w14
00ae5ff4	lsr w16,w15,#0x18
00ae5ff8	ubfx w17,w15,#0x10,#0x8
00ae5ffc	ldr w16,[x9, w16, UXTW #0x2]
00ae6000	eor w14,w18,w14
00ae6004	ubfx w18,w15,#0x8,#0x8
00ae6008	ldr w17,[x9, w17, UXTW #0x2]
00ae600c	and w15,w15,#0xff
00ae6010	ldr w18,[x9, w18, UXTW #0x2]
00ae6014	ldr w15,[x9, w15, UXTW #0x2]
00ae6018	eor w12,w16,w12
00ae601c	eor w12,w12,w17, ROR #0x8
00ae6020	eor w12,w12,w18, ROR #0x10
00ae6024	eor w12,w12,w15, ROR #0x18
00ae6028	eor w14,w14,w12
00ae602c	lsr w15,w14,#0x18
00ae6030	ubfx w17,w14,#0x10,#0x8
00ae6034	ldr w15,[x9, w15, UXTW #0x2]
00ae6038	ubfx w18,w14,#0x8,#0x8
00ae603c	ldr w17,[x9, w17, UXTW #0x2]
00ae6040	and w14,w14,#0xff
00ae6044	ldr w18,[x9, w18, UXTW #0x2]
00ae6048	ldr w14,[x9, w14, UXTW #0x2]
00ae604c	eor w13,w15,w13
00ae6050	eor w13,w13,w17, ROR #0x8
00ae6054	ldp w16,w0,[x2, #0x58]
00ae6058	eor w13,w13,w18, ROR #0x10
00ae605c	eor w13,w13,w14, ROR #0x18
00ae6060	eor w14,w13,w12
00ae6064	eor w15,w14,w11
00ae6068	eor w15,w15,w0
00ae606c	lsr w17,w15,#0x18
00ae6070	ldr w17,[x9, w17, UXTW #0x2]
00ae6074	eor w14,w14,w16
00ae6078	ubfx w16,w15,#0x10,#0x8
00ae607c	ldr w16,[x9, w16, UXTW #0x2]
00ae6080	eor w10,w17,w10
00ae6084	ubfx w17,w15,#0x8,#0x8
00ae6088	and w15,w15,#0xff
00ae608c	ldr w17,[x9, w17, UXTW #0x2]
00ae6090	ldr w15,[x9, w15, UXTW #0x2]
00ae6094	eor w10,w10,w16, ROR #0x8
00ae6098	ldp w18,w0,[x2, #0x50]
00ae609c	eor w10,w10,w17, ROR #0x10
00ae60a0	eor w10,w10,w15, ROR #0x18
00ae60a4	eor w14,w14,w10
00ae60a8	lsr w15,w14,#0x18
00ae60ac	ubfx w16,w14,#0x10,#0x8
00ae60b0	ldr w15,[x9, w15, UXTW #0x2]
00ae60b4	ubfx w17,w14,#0x8,#0x8
00ae60b8	ldr w16,[x9, w16, UXTW #0x2]
00ae60bc	and w14,w14,#0xff
00ae60c0	ldr w17,[x9, w17, UXTW #0x2]
00ae60c4	ldr w14,[x9, w14, UXTW #0x2]
00ae60c8	eor w11,w15,w11
00ae60cc	eor w11,w11,w16, ROR #0x8
00ae60d0	eor w11,w11,w17, ROR #0x10
00ae60d4	eor w11,w11,w14, ROR #0x18
00ae60d8	eor w0,w0,w13
00ae60dc	eor w14,w11,w10
00ae60e0	eor w15,w0,w14
00ae60e4	lsr w16,w15,#0x18
00ae60e8	ubfx w17,w15,#0x10,#0x8
00ae60ec	ldr w16,[x9, w16, UXTW #0x2]
00ae60f0	eor w14,w18,w14
00ae60f4	ubfx w18,w15,#0x8,#0x8
00ae60f8	ldr w17,[x9, w17, UXTW #0x2]
00ae60fc	and w15,w15,#0xff
00ae6100	ldr w18,[x9, w18, UXTW #0x2]
00ae6104	ldr w15,[x9, w15, UXTW #0x2]
00ae6108	eor w12,w16,w12
00ae610c	eor w12,w12,w17, ROR #0x8
00ae6110	eor w12,w12,w18, ROR #0x10
00ae6114	eor w12,w12,w15, ROR #0x18
00ae6118	eor w14,w14,w12
00ae611c	lsr w15,w14,#0x18
00ae6120	ubfx w17,w14,#0x10,#0x8
00ae6124	ldr w15,[x9, w15, UXTW #0x2]
00ae6128	ubfx w18,w14,#0x8,#0x8
00ae612c	ldr w17,[x9, w17, UXTW #0x2]
00ae6130	and w14,w14,#0xff
00ae6134	ldr w18,[x9, w18, UXTW #0x2]
00ae6138	ldr w14,[x9, w14, UXTW #0x2]
00ae613c	eor w13,w15,w13
00ae6140	eor w13,w13,w17, ROR #0x8
00ae6144	ldp w16,w0,[x2, #0x48]
00ae6148	eor w13,w13,w18, ROR #0x10
00ae614c	eor w13,w13,w14, ROR #0x18
00ae6150	eor w14,w13,w12
00ae6154	eor w15,w14,w11
00ae6158	eor w15,w15,w0
00ae615c	lsr w17,w15,#0x18
00ae6160	ldr w17,[x9, w17, UXTW #0x2]
00ae6164	eor w14,w14,w16
00ae6168	ubfx w16,w15,#0x10,#0x8
00ae616c	ldr w16,[x9, w16, UXTW #0x2]
00ae6170	eor w10,w17,w10
00ae6174	ubfx w17,w15,#0x8,#0x8
00ae6178	and w15,w15,#0xff
00ae617c	ldr w17,[x9, w17, UXTW #0x2]
00ae6180	ldr w15,[x9, w15, UXTW #0x2]
00ae6184	eor w10,w10,w16, ROR #0x8
00ae6188	ldp w18,w0,[x2, #0x40]
00ae618c	eor w10,w10,w17, ROR #0x10
00ae6190	eor w10,w10,w15, ROR #0x18
00ae6194	eor w14,w14,w10
00ae6198	lsr w15,w14,#0x18
00ae619c	ubfx w16,w14,#0x10,#0x8
00ae61a0	ldr w15,[x9, w15, UXTW #0x2]
00ae61a4	ubfx w17,w14,#0x8,#0x8
00ae61a8	ldr w16,[x9, w16, UXTW #0x2]
00ae61ac	and w14,w14,#0xff
00ae61b0	ldr w17,[x9, w17, UXTW #0x2]
00ae61b4	ldr w14,[x9, w14, UXTW #0x2]
00ae61b8	eor w11,w15,w11
00ae61bc	eor w11,w11,w16, ROR #0x8
00ae61c0	eor w11,w11,w17, ROR #0x10
00ae61c4	eor w11,w11,w14, ROR #0x18
00ae61c8	eor w0,w0,w13
00ae61cc	eor w14,w11,w10
00ae61d0	eor w15,w0,w14
00ae61d4	lsr w16,w15,#0x18
00ae61d8	ubfx w17,w15,#0x10,#0x8
00ae61dc	ldr w16,[x9, w16, UXTW #0x2]
00ae61e0	eor w14,w18,w14
00ae61e4	ubfx w18,w15,#0x8,#0x8
00ae61e8	ldr w17,[x9, w17, UXTW #0x2]
00ae61ec	and w15,w15,#0xff
00ae61f0	ldr w18,[x9, w18, UXTW #0x2]
00ae61f4	ldr w15,[x9, w15, UXTW #0x2]
00ae61f8	eor w12,w16,w12
00ae61fc	eor w12,w12,w17, ROR #0x8
00ae6200	eor w12,w12,w18, ROR #0x10
00ae6204	eor w12,w12,w15, ROR #0x18
00ae6208	eor w14,w14,w12
00ae620c	lsr w15,w14,#0x18
00ae6210	ubfx w17,w14,#0x10,#0x8
00ae6214	ldr w15,[x9, w15, UXTW #0x2]
00ae6218	ubfx w18,w14,#0x8,#0x8
00ae621c	ldr w17,[x9, w17, UXTW #0x2]
00ae6220	and w14,w14,#0xff
00ae6224	ldr w18,[x9, w18, UXTW #0x2]
00ae6228	ldr w14,[x9, w14, UXTW #0x2]
00ae622c	eor w13,w15,w13
00ae6230	eor w13,w13,w17, ROR #0x8
00ae6234	ldp w16,w0,[x2, #0x38]
00ae6238	eor w13,w13,w18, ROR #0x10
00ae623c	eor w13,w13,w14, ROR #0x18
00ae6240	eor w14,w13,w12
00ae6244	eor w15,w14,w11
00ae6248	eor w15,w15,w0
00ae624c	lsr w17,w15,#0x18
00ae6250	ldr w17,[x9, w17, UXTW #0x2]
00ae6254	eor w14,w14,w16
00ae6258	ubfx w16,w15,#0x10,#0x8
00ae625c	ldr w16,[x9, w16, UXTW #0x2]
00ae6260	eor w10,w17,w10
00ae6264	ubfx w17,w15,#0x8,#0x8
00ae6268	and w15,w15,#0xff
00ae626c	ldr w17,[x9, w17, UXTW #0x2]
00ae6270	ldr w15,[x9, w15, UXTW #0x2]
00ae6274	eor w10,w10,w16, ROR #0x8
00ae6278	ldp w18,w0,[x2, #0x30]
00ae627c	eor w10,w10,w17, ROR #0x10
00ae6280	eor w10,w10,w15, ROR #0x18
00ae6284	eor w14,w14,w10
00ae6288	lsr w15,w14,#0x18
00ae628c	ubfx w16,w14,#0x10,#0x8
00ae6290	ldr w15,[x9, w15, UXTW #0x2]
00ae6294	ubfx w17,w14,#0x8,#0x8
00ae6298	ldr w16,[x9, w16, UXTW #0x2]
00ae629c	and w14,w14,#0xff
00ae62a0	ldr w17,[x9, w17, UXTW #0x2]
00ae62a4	ldr w14,[x9, w14, UXTW #0x2]
00ae62a8	eor w11,w15,w11
00ae62ac	eor w11,w11,w16, ROR #0x8
00ae62b0	eor w11,w11,w17, ROR #0x10
00ae62b4	eor w11,w11,w14, ROR #0x18
00ae62b8	eor w0,w0,w13
00ae62bc	eor w14,w11,w10
00ae62c0	eor w15,w0,w14
00ae62c4	lsr w16,w15,#0x18
00ae62c8	ubfx w17,w15,#0x10,#0x8
00ae62cc	ldr w16,[x9, w16, UXTW #0x2]
00ae62d0	eor w14,w18,w14
00ae62d4	ubfx w18,w15,#0x8,#0x8
00ae62d8	ldr w17,[x9, w17, UXTW #0x2]
00ae62dc	and w15,w15,#0xff
00ae62e0	ldr w18,[x9, w18, UXTW #0x2]
00ae62e4	ldr w15,[x9, w15, UXTW #0x2]
00ae62e8	eor w12,w16,w12
00ae62ec	eor w12,w12,w17, ROR #0x8
00ae62f0	eor w12,w12,w18, ROR #0x10
00ae62f4	eor w12,w12,w15, ROR #0x18
00ae62f8	eor w14,w14,w12
00ae62fc	lsr w15,w14,#0x18
00ae6300	ubfx w17,w14,#0x10,#0x8
00ae6304	ldr w15,[x9, w15, UXTW #0x2]
00ae6308	ubfx w18,w14,#0x8,#0x8
00ae630c	ldr w17,[x9, w17, UXTW #0x2]
00ae6310	and w14,w14,#0xff
00ae6314	ldr w18,[x9, w18, UXTW #0x2]
00ae6318	ldr w14,[x9, w14, UXTW #0x2]
00ae631c	eor w13,w15,w13
00ae6320	eor w13,w13,w17, ROR #0x8
00ae6324	ldp w16,w0,[x2, #0x28]
00ae6328	eor w13,w13,w18, ROR #0x10
00ae632c	eor w13,w13,w14, ROR #0x18
00ae6330	eor w14,w13,w12
00ae6334	eor w15,w14,w11
00ae6338	eor w15,w15,w0
00ae633c	lsr w17,w15,#0x18
00ae6340	ldr w17,[x9, w17, UXTW #0x2]
00ae6344	eor w14,w14,w16
00ae6348	ubfx w16,w15,#0x10,#0x8
00ae634c	ldr w16,[x9, w16, UXTW #0x2]
00ae6350	eor w10,w17,w10
00ae6354	ubfx w17,w15,#0x8,#0x8
00ae6358	and w15,w15,#0xff
00ae635c	ldr w17,[x9, w17, UXTW #0x2]
00ae6360	ldr w15,[x9, w15, UXTW #0x2]
00ae6364	eor w10,w10,w16, ROR #0x8
00ae6368	ldp w18,w0,[x2, #0x20]
00ae636c	eor w10,w10,w17, ROR #0x10
00ae6370	eor w10,w10,w15, ROR #0x18
00ae6374	eor w14,w14,w10
00ae6378	lsr w15,w14,#0x18
00ae637c	ubfx w16,w14,#0x10,#0x8
00ae6380	ldr w15,[x9, w15, UXTW #0x2]
00ae6384	ubfx w17,w14,#0x8,#0x8
00ae6388	ldr w16,[x9, w16, UXTW #0x2]
00ae638c	and w14,w14,#0xff
00ae6390	ldr w17,[x9, w17, UXTW #0x2]
00ae6394	ldr w14,[x9, w14, UXTW #0x2]
00ae6398	eor w11,w15,w11
00ae639c	eor w11,w11,w16, ROR #0x8
00ae63a0	eor w11,w11,w17, ROR #0x10
00ae63a4	eor w11,w11,w14, ROR #0x18
00ae63a8	eor w0,w0,w13
00ae63ac	eor w14,w11,w10
00ae63b0	eor w15,w0,w14
00ae63b4	lsr w16,w15,#0x18
00ae63b8	ubfx w17,w15,#0x10,#0x8
00ae63bc	ldr w16,[x9, w16, UXTW #0x2]
00ae63c0	eor w14,w18,w14
00ae63c4	ubfx w18,w15,#0x8,#0x8
00ae63c8	ldr w17,[x9, w17, UXTW #0x2]
00ae63cc	and w15,w15,#0xff
00ae63d0	ldr w18,[x9, w18, UXTW #0x2]
00ae63d4	ldr w15,[x9, w15, UXTW #0x2]
00ae63d8	eor w12,w16,w12
00ae63dc	eor w12,w12,w17, ROR #0x8
00ae63e0	eor w12,w12,w18, ROR #0x10
00ae63e4	eor w15,w12,w15, ROR #0x18
00ae63e8	eor w12,w14,w15
00ae63ec	lsr w14,w12,#0x18
00ae63f0	ubfx w17,w12,#0x10,#0x8
00ae63f4	ldr w14,[x9, w14, UXTW #0x2]
00ae63f8	ubfx w18,w12,#0x8,#0x8
00ae63fc	ldr w17,[x9, w17, UXTW #0x2]
00ae6400	and w12,w12,#0xff
00ae6404	ldr w18,[x9, w18, UXTW #0x2]
00ae6408	ldr w12,[x9, w12, UXTW #0x2]
00ae640c	eor w13,w14,w13
00ae6410	eor w13,w13,w17, ROR #0x8
00ae6414	ldp w16,w0,[x2, #0x18]
00ae6418	eor w13,w13,w18, ROR #0x10
00ae641c	eor w12,w13,w12, ROR #0x18
00ae6420	eor w13,w12,w15
00ae6424	eor w14,w13,w11
00ae6428	eor w14,w14,w0
00ae642c	lsr w17,w14,#0x18
00ae6430	ldr w17,[x9, w17, UXTW #0x2]
00ae6434	eor w16,w13,w16
00ae6438	ubfx w13,w14,#0x10,#0x8
00ae643c	ldr w13,[x9, w13, UXTW #0x2]
00ae6440	eor w10,w17,w10
00ae6444	ubfx w17,w14,#0x8,#0x8
00ae6448	and w14,w14,#0xff
00ae644c	ldr w17,[x9, w17, UXTW #0x2]
00ae6450	ldr w14,[x9, w14, UXTW #0x2]
00ae6454	eor w10,w10,w13, ROR #0x8
00ae6458	ldp w18,w0,[x2, #0x10]
00ae645c	eor w10,w10,w17, ROR #0x10
00ae6460	eor w13,w10,w14, ROR #0x18
00ae6464	eor w10,w16,w13
00ae6468	lsr w14,w10,#0x18
00ae646c	ubfx w16,w10,#0x10,#0x8
00ae6470	ldr w14,[x9, w14, UXTW #0x2]
00ae6474	ubfx w17,w10,#0x8,#0x8
00ae6478	ldr w16,[x9, w16, UXTW #0x2]
00ae647c	and w10,w10,#0xff
00ae6480	ldr w17,[x9, w17, UXTW #0x2]
00ae6484	ldr w10,[x9, w10, UXTW #0x2]
00ae6488	eor w11,w14,w11
00ae648c	eor w11,w11,w16, ROR #0x8
00ae6490	eor w11,w11,w17, ROR #0x10
00ae6494	eor w10,w11,w10, ROR #0x18
00ae6498	eor w0,w0,w12
00ae649c	eor w11,w10,w13
00ae64a0	eor w14,w0,w11
00ae64a4	eor w16,w18,w11
00ae64a8	lsr w11,w14,#0x18
00ae64ac	ubfx w17,w14,#0x10,#0x8
00ae64b0	ldr w11,[x9, w11, UXTW #0x2]
00ae64b4	ubfx w18,w14,#0x8,#0x8
00ae64b8	ldr w17,[x9, w17, UXTW #0x2]
00ae64bc	and w14,w14,#0xff
00ae64c0	ldr w18,[x9, w18, UXTW #0x2]
00ae64c4	ldr w14,[x9, w14, UXTW #0x2]
00ae64c8	eor w11,w11,w15
00ae64cc	eor w11,w11,w17, ROR #0x8
00ae64d0	eor w11,w11,w18, ROR #0x10
00ae64d4	eor w11,w11,w14, ROR #0x18
00ae64d8	eor w14,w16,w11
00ae64dc	lsr w15,w14,#0x18
00ae64e0	ubfx w16,w14,#0x10,#0x8
00ae64e4	ldr w15,[x9, w15, UXTW #0x2]
00ae64e8	ubfx w17,w14,#0x8,#0x8
00ae64ec	ldr w16,[x9, w16, UXTW #0x2]
00ae64f0	and w14,w14,#0xff
00ae64f4	ldr w17,[x9, w17, UXTW #0x2]
00ae64f8	ldr w9,[x9, w14, UXTW #0x2]
00ae64fc	eor w12,w15,w12
00ae6500	eor w12,w12,w16, ROR #0x8
00ae6504	ldp w0,w3,[x2, #0x8]
00ae6508	eor w12,w12,w17, ROR #0x10
00ae650c	eor w9,w12,w9, ROR #0x18
00ae6510	ldp w14,w18,[x2]
00ae6514	eor w12,w9,w11
00ae6518	eor w16,w12,w10
00ae651c	eor w17,w12,w0
00ae6520	eor w12,w16,w3
00ae6524	lsr w16,w12,#0x18
00ae6528	eor w15,w18,w9
00ae652c	ubfx w18,w12,#0x10,#0x8
00ae6530	ldrb w16,[x8, w16, UXTW ]
00ae6534	ldrb w18,[x8, w18, UXTW ]
00ae6538	ubfx w0,w12,#0x8,#0x8
00ae653c	and w12,w12,#0xff
00ae6540	ldrb w0,[x8, w0, UXTW ]
00ae6544	ldrb w12,[x8, w12, UXTW ]
00ae6548	lsl w2,w16,#0x18
00ae654c	bfm w2,w18,#0x10,#0x7
00ae6550	mov w18,w2
00ae6554	bfm w18,w0,#0x18,#0x7
00ae6558	orr w0,w18,w12
00ae655c	lsr w16,w16,#0x6
00ae6560	extr w12,w12,w18,#0x8
00ae6564	eor w13,w0,w13
00ae6568	bfm w16,w0,#0x1e,#0x1d
00ae656c	eor w12,w13,w12
00ae6570	extr w2,w0,w2,#0x16
00ae6574	eor w12,w12,w16
00ae6578	extr w18,w0,w18,#0xe
00ae657c	eor w12,w12,w2
00ae6580	eor w12,w12,w18
00ae6584	eor w13,w17,w12
00ae6588	lsr w16,w12,#0x18
00ae658c	lsr w17,w12,#0x10
00ae6590	lsr w18,w12,#0x8
00ae6594	lsr w0,w13,#0x18
00ae6598	strb w16,[x1, #0xc]
00ae659c	strb w17,[x1, #0xd]
00ae65a0	strb w18,[x1, #0xe]
00ae65a4	ubfx w2,w13,#0x10,#0x8
00ae65a8	ldrb w17,[x8, w0, UXTW ]
00ae65ac	ldrb w18,[x8, w2, UXTW ]
00ae65b0	ubfx w16,w13,#0x8,#0x8
00ae65b4	and w13,w13,#0xff
00ae65b8	ldrb w16,[x8, w16, UXTW ]
00ae65bc	ldrb w13,[x8, w13, UXTW ]
00ae65c0	lsl w0,w17,#0x18
00ae65c4	bfm w0,w18,#0x10,#0x7
00ae65c8	mov w18,w0
00ae65cc	bfm w18,w16,#0x18,#0x7
00ae65d0	orr w16,w18,w13
00ae65d4	lsr w17,w17,#0x6
00ae65d8	extr w13,w13,w18,#0x8
00ae65dc	eor w10,w16,w10
00ae65e0	bfm w17,w16,#0x1e,#0x1d
00ae65e4	eor w10,w10,w13
00ae65e8	extr w0,w16,w0,#0x16
00ae65ec	eor w10,w10,w17
00ae65f0	extr w18,w16,w18,#0xe
00ae65f4	eor w10,w10,w0
00ae65f8	eor w10,w10,w18
00ae65fc	eor w13,w10,w12
00ae6600	lsr w16,w10,#0x18
00ae6604	lsr w17,w10,#0x10
00ae6608	lsr w18,w10,#0x8
00ae660c	strb w10,[x1, #0xb]
00ae6610	eor w10,w15,w13
00ae6614	eor w13,w13,w14
00ae6618	strb w16,[x1, #0x8]
00ae661c	strb w17,[x1, #0x9]
00ae6620	strb w18,[x1, #0xa]
00ae6624	lsr w14,w10,#0x18
00ae6628	ubfx w15,w10,#0x10,#0x8
00ae662c	ldrb w14,[x8, w14, UXTW ]
00ae6630	ldrb w15,[x8, w15, UXTW ]
00ae6634	ubfx w16,w10,#0x8,#0x8
00ae6638	and w10,w10,#0xff
00ae663c	ldrb w16,[x8, w16, UXTW ]
00ae6640	ldrb w10,[x8, w10, UXTW ]
00ae6644	lsl w17,w14,#0x18
00ae6648	bfm w17,w15,#0x10,#0x7
00ae664c	mov w15,w17
00ae6650	bfm w15,w16,#0x18,#0x7
00ae6654	orr w16,w15,w10
00ae6658	lsr w14,w14,#0x6
00ae665c	extr w10,w10,w15,#0x8
00ae6660	eor w11,w16,w11
00ae6664	bfm w14,w16,#0x1e,#0x1d
00ae6668	eor w10,w11,w10
00ae666c	extr w17,w16,w17,#0x16
00ae6670	eor w10,w10,w14
00ae6674	extr w15,w16,w15,#0xe
00ae6678	eor w10,w10,w17
00ae667c	eor w10,w10,w15
00ae6680	eor w11,w13,w10
00ae6684	lsr w13,w10,#0x18
00ae6688	lsr w14,w10,#0x10
00ae668c	lsr w15,w10,#0x8
00ae6690	strb w10,[x1, #0x7]
00ae6694	lsr w10,w11,#0x18
00ae6698	strb w13,[x1, #0x4]
00ae669c	strb w14,[x1, #0x5]
00ae66a0	strb w15,[x1, #0x6]
00ae66a4	ubfx w16,w11,#0x10,#0x8
00ae66a8	ldrb w10,[x8, w10, UXTW ]
00ae66ac	ldrb w13,[x8, w16, UXTW ]
00ae66b0	ubfx w17,w11,#0x8,#0x8
00ae66b4	and w11,w11,#0xff
00ae66b8	ldrb w14,[x8, w17, UXTW ]
00ae66bc	ldrb w8,[x8, w11, UXTW ]
00ae66c0	lsl w11,w10,#0x18
00ae66c4	bfm w11,w13,#0x10,#0x7
00ae66c8	mov w13,w11
00ae66cc	bfm w13,w14,#0x18,#0x7
00ae66d0	orr w14,w13,w8
00ae66d4	lsr w10,w10,#0x6
00ae66d8	extr w8,w8,w13,#0x8
00ae66dc	eor w9,w14,w9
00ae66e0	bfm w10,w14,#0x1e,#0x1d
00ae66e4	eor w8,w9,w8
00ae66e8	extr w11,w14,w11,#0x16
00ae66ec	eor w8,w8,w10
00ae66f0	extr w13,w14,w13,#0xe
00ae66f4	eor w8,w8,w11
00ae66f8	eor w8,w8,w13
00ae66fc	lsr w9,w8,#0x18
00ae6700	lsr w10,w8,#0x10
00ae6704	lsr w11,w8,#0x8
00ae6708	strb w8,[x1, #0x3]
00ae670c	strb w9,[x1]
00ae6710	strb w10,[x1, #0x1]
00ae6714	strb w11,[x1, #0x2]
00ae6718	strb w12,[x1, #0xf]
00ae671c	ret
