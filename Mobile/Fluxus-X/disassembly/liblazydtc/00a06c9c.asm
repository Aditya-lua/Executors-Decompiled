; bn_sqr_comba8 @ 00a06c9c
00a06c9c	str x21,[sp, #-0x20]!
00a06ca0	stp x20,x19,[sp, #0x10]
00a06ca4	ldr x9,[x1]
00a06ca8	mov w8,#0x2
00a06cac	and x10,x9,#0xffffffff
00a06cb0	lsr x9,x9,#0x20
00a06cb4	mul x11,x10,x9
00a06cb8	mul x10,x10,x10
00a06cbc	adds x10,x10,x11, LSL #0x21
00a06cc0	str x10,[x0]
00a06cc4	ldp x10,x12,[x1]
00a06cc8	mul x9,x9,x9
00a06ccc	add x9,x9,x11, LSR #0x1f
00a06cd0	cinc x9,x9,cs
00a06cd4	and x11,x12,#0xffffffff
00a06cd8	lsr x12,x12,#0x20
00a06cdc	and x13,x10,#0xffffffff
00a06ce0	lsr x10,x10,#0x20
00a06ce4	mul x14,x10,x11
00a06ce8	mul x11,x13,x11
00a06cec	mul x13,x13,x12
00a06cf0	mul x10,x10,x12
00a06cf4	adds x12,x14,x13
00a06cf8	cset w13,cs
00a06cfc	add x10,x10,x12, LSR #0x20
00a06d00	adds x11,x11,x12, LSL #0x20
00a06d04	add x10,x10,x13, LSL #0x20
00a06d08	cinc x10,x10,cs
00a06d0c	adds x9,x9,x11
00a06d10	cinc x12,x10,cs
00a06d14	adds x9,x9,x11
00a06d18	str x9,[x0, #0x8]
00a06d1c	cinc x10,x10,cs
00a06d20	ldp x9,x11,[x1]
00a06d24	adds x10,x12,x10
00a06d28	ldr x12,[x1, #0x10]
00a06d2c	cset w13,cs
00a06d30	and x14,x11,#0xffffffff
00a06d34	lsr x11,x11,#0x20
00a06d38	and x15,x12,#0xffffffff
00a06d3c	lsr x12,x12,#0x20
00a06d40	and x16,x9,#0xffffffff
00a06d44	lsr x9,x9,#0x20
00a06d48	mul x17,x14,x11
00a06d4c	mul x14,x14,x14
00a06d50	mul x11,x11,x11
00a06d54	mul x18,x9,x15
00a06d58	mul x15,x16,x15
00a06d5c	mul x16,x16,x12
00a06d60	mul x9,x9,x12
00a06d64	add x11,x11,x17, LSR #0x1f
00a06d68	adds x12,x14,x17, LSL #0x21
00a06d6c	cinc x11,x11,cs
00a06d70	adds x10,x10,x12
00a06d74	cinc x11,x11,cs
00a06d78	adds x12,x18,x16
00a06d7c	cset w14,cs
00a06d80	add x9,x9,x12, LSR #0x20
00a06d84	adds x15,x15,x12, LSL #0x20
00a06d88	add x9,x9,x14, LSL #0x20
00a06d8c	cinc x9,x9,cs
00a06d90	adds x10,x10,x15
00a06d94	cinc x12,x9,cs
00a06d98	adds x11,x11,x13
00a06d9c	cset w13,cs
00a06da0	csinc x14,x8,xzr,cs
00a06da4	adds x11,x11,x12
00a06da8	csel x12,x13,x14,cc
00a06dac	adds x10,x10,x15
00a06db0	cinc x9,x9,cs
00a06db4	str x10,[x0, #0x10]
00a06db8	adds x9,x11,x9
00a06dbc	ldp x10,x11,[x1, #0x10]
00a06dc0	ldp x13,x14,[x1]
00a06dc4	cinc x12,x12,cs
00a06dc8	and x15,x11,#0xffffffff
00a06dcc	lsr x11,x11,#0x20
00a06dd0	and x16,x13,#0xffffffff
00a06dd4	lsr x13,x13,#0x20
00a06dd8	and x17,x10,#0xffffffff
00a06ddc	lsr x10,x10,#0x20
00a06de0	and x18,x14,#0xffffffff
00a06de4	lsr x14,x14,#0x20
00a06de8	mul x2,x13,x15
00a06dec	mul x15,x16,x15
00a06df0	mul x16,x16,x11
00a06df4	mul x11,x13,x11
00a06df8	mul x13,x14,x17
00a06dfc	mul x17,x18,x17
00a06e00	mul x18,x18,x10
00a06e04	mul x10,x14,x10
00a06e08	adds x14,x2,x16
00a06e0c	cset w16,cs
00a06e10	add x11,x11,x14, LSR #0x20
00a06e14	adds x15,x15,x14, LSL #0x20
00a06e18	add x11,x11,x16, LSL #0x20
00a06e1c	cinc x11,x11,cs
00a06e20	adds x9,x9,x15
00a06e24	cinc x14,x11,cs
00a06e28	adds x9,x9,x15
00a06e2c	cinc x11,x11,cs
00a06e30	adds x12,x12,x14
00a06e34	cset w14,cs
00a06e38	csinc x15,x8,xzr,cs
00a06e3c	adds x11,x12,x11
00a06e40	csel x12,x14,x15,cc
00a06e44	adds x13,x13,x18
00a06e48	cset w14,cs
00a06e4c	add x10,x10,x13, LSR #0x20
00a06e50	adds x15,x17,x13, LSL #0x20
00a06e54	add x10,x10,x14, LSL #0x20
00a06e58	cinc x10,x10,cs
00a06e5c	adds x9,x9,x15
00a06e60	cinc x13,x10,cs
00a06e64	adds x11,x11,x13
00a06e68	cinc x12,x12,cs
00a06e6c	adds x9,x9,x15
00a06e70	cinc x10,x10,cs
00a06e74	str x9,[x0, #0x18]
00a06e78	adds x9,x11,x10
00a06e7c	ldp x10,x11,[x1, #0x10]
00a06e80	ldp x13,x14,[x1]
00a06e84	ldr x15,[x1, #0x20]
00a06e88	cinc x12,x12,cs
00a06e8c	and x16,x10,#0xffffffff
00a06e90	lsr x10,x10,#0x20
00a06e94	and x17,x11,#0xffffffff
00a06e98	lsr x11,x11,#0x20
00a06e9c	and x18,x14,#0xffffffff
00a06ea0	lsr x14,x14,#0x20
00a06ea4	and x2,x15,#0xffffffff
00a06ea8	lsr x15,x15,#0x20
00a06eac	and x3,x13,#0xffffffff
00a06eb0	lsr x13,x13,#0x20
00a06eb4	mul x4,x16,x10
00a06eb8	mul x16,x16,x16
00a06ebc	mul x10,x10,x10
00a06ec0	mul x5,x14,x17
00a06ec4	mul x17,x18,x17
00a06ec8	mul x18,x18,x11
00a06ecc	mul x11,x14,x11
00a06ed0	mul x14,x13,x2
00a06ed4	mul x2,x3,x2
00a06ed8	mul x3,x3,x15
00a06edc	mul x13,x13,x15
00a06ee0	add x10,x10,x4, LSR #0x1f
00a06ee4	adds x15,x16,x4, LSL #0x21
00a06ee8	cinc x10,x10,cs
00a06eec	adds x9,x9,x15
00a06ef0	cinc x10,x10,cs
00a06ef4	adds x15,x5,x18
00a06ef8	cset w16,cs
00a06efc	add x11,x11,x15, LSR #0x20
00a06f00	adds x17,x17,x15, LSL #0x20
00a06f04	add x11,x11,x16, LSL #0x20
00a06f08	cinc x11,x11,cs
00a06f0c	adds x9,x9,x17
00a06f10	cinc x15,x11,cs
00a06f14	adds x10,x12,x10
00a06f18	cset w12,cs
00a06f1c	csinc x16,x8,xzr,cs
00a06f20	adds x10,x10,x15
00a06f24	csel x12,x12,x16,cc
00a06f28	adds x9,x9,x17
00a06f2c	cinc x11,x11,cs
00a06f30	adds x10,x10,x11
00a06f34	cinc x11,x12,cs
00a06f38	adds x12,x14,x3
00a06f3c	cset w14,cs
00a06f40	adds x15,x2,x12, LSL #0x20
00a06f44	add x12,x13,x12, LSR #0x20
00a06f48	add x12,x12,x14, LSL #0x20
00a06f4c	cinc x12,x12,cs
00a06f50	adds x9,x9,x15
00a06f54	cinc x13,x12,cs
00a06f58	adds x10,x10,x13
00a06f5c	cinc x11,x11,cs
00a06f60	adds x9,x9,x15
00a06f64	cinc x12,x12,cs
00a06f68	str x9,[x0, #0x20]
00a06f6c	adds x9,x10,x12
00a06f70	ldp x10,x12,[x1, #0x20]
00a06f74	ldp x13,x14,[x1]
00a06f78	ldp x15,x16,[x1, #0x10]
00a06f7c	cinc x11,x11,cs
00a06f80	and x17,x12,#0xffffffff
00a06f84	lsr x12,x12,#0x20
00a06f88	and x18,x13,#0xffffffff
00a06f8c	lsr x13,x13,#0x20
00a06f90	and x2,x10,#0xffffffff
00a06f94	lsr x10,x10,#0x20
00a06f98	and x3,x14,#0xffffffff
00a06f9c	lsr x14,x14,#0x20
00a06fa0	and x4,x16,#0xffffffff
00a06fa4	lsr x16,x16,#0x20
00a06fa8	and x5,x15,#0xffffffff
00a06fac	lsr x15,x15,#0x20
00a06fb0	mul x6,x13,x17
00a06fb4	mul x17,x18,x17
00a06fb8	mul x18,x18,x12
00a06fbc	mul x12,x13,x12
00a06fc0	mul x13,x14,x2
00a06fc4	mul x2,x3,x2
00a06fc8	mul x3,x3,x10
00a06fcc	mul x10,x14,x10
00a06fd0	mul x14,x15,x4
00a06fd4	mul x4,x5,x4
00a06fd8	mul x5,x5,x16
00a06fdc	mul x15,x15,x16
00a06fe0	adds x16,x6,x18
00a06fe4	cset w18,cs
00a06fe8	add x12,x12,x16, LSR #0x20
00a06fec	adds x17,x17,x16, LSL #0x20
00a06ff0	add x12,x12,x18, LSL #0x20
00a06ff4	cinc x12,x12,cs
00a06ff8	adds x9,x9,x17
00a06ffc	cinc x16,x12,cs
00a07000	adds x9,x9,x17
00a07004	cinc x12,x12,cs
00a07008	adds x11,x11,x16
00a0700c	cset w16,cs
00a07010	csinc x17,x8,xzr,cs
00a07014	adds x11,x11,x12
00a07018	csel x12,x16,x17,cc
00a0701c	adds x13,x13,x3
00a07020	cset w16,cs
00a07024	add x10,x10,x13, LSR #0x20
00a07028	adds x17,x2,x13, LSL #0x20
00a0702c	add x10,x10,x16, LSL #0x20
00a07030	cinc x10,x10,cs
00a07034	adds x9,x9,x17
00a07038	cinc x13,x10,cs
00a0703c	adds x11,x11,x13
00a07040	cinc x12,x12,cs
00a07044	adds x9,x9,x17
00a07048	cinc x10,x10,cs
00a0704c	adds x10,x11,x10
00a07050	cinc x11,x12,cs
00a07054	adds x12,x14,x5
00a07058	cset w13,cs
00a0705c	adds x14,x4,x12, LSL #0x20
00a07060	add x12,x15,x12, LSR #0x20
00a07064	add x12,x12,x13, LSL #0x20
00a07068	cinc x12,x12,cs
00a0706c	adds x9,x9,x14
00a07070	cinc x13,x12,cs
00a07074	adds x10,x10,x13
00a07078	cinc x11,x11,cs
00a0707c	adds x9,x9,x14
00a07080	cinc x12,x12,cs
00a07084	str x9,[x0, #0x28]
00a07088	adds x9,x10,x12
00a0708c	ldp x10,x12,[x1, #0x10]
00a07090	ldp x13,x14,[x1, #0x20]
00a07094	ldp x15,x16,[x1]
00a07098	ldr x17,[x1, #0x30]
00a0709c	and x18,x12,#0xffffffff
00a070a0	lsr x12,x12,#0x20
00a070a4	and x2,x13,#0xffffffff
00a070a8	lsr x13,x13,#0x20
00a070ac	and x3,x10,#0xffffffff
00a070b0	lsr x10,x10,#0x20
00a070b4	and x4,x14,#0xffffffff
00a070b8	lsr x14,x14,#0x20
00a070bc	and x5,x16,#0xffffffff
00a070c0	lsr x16,x16,#0x20
00a070c4	and x6,x17,#0xffffffff
00a070c8	lsr x17,x17,#0x20
00a070cc	and x7,x15,#0xffffffff
00a070d0	lsr x15,x15,#0x20
00a070d4	mul x19,x18,x12
00a070d8	mul x18,x18,x18
00a070dc	mul x12,x12,x12
00a070e0	cinc x11,x11,cs
00a070e4	mul x20,x10,x2
00a070e8	mul x2,x3,x2
00a070ec	mul x3,x3,x13
00a070f0	mul x10,x10,x13
00a070f4	mul x13,x16,x4
00a070f8	mul x4,x5,x4
00a070fc	mul x5,x5,x14
00a07100	mul x14,x16,x14
00a07104	mul x16,x15,x6
00a07108	mul x6,x7,x6
00a0710c	mul x7,x7,x17
00a07110	mul x15,x15,x17
00a07114	add x12,x12,x19, LSR #0x1f
00a07118	adds x17,x18,x19, LSL #0x21
00a0711c	cinc x12,x12,cs
00a07120	adds x9,x9,x17
00a07124	cinc x12,x12,cs
00a07128	adds x17,x20,x3
00a0712c	cset w18,cs
00a07130	add x10,x10,x17, LSR #0x20
00a07134	adds x2,x2,x17, LSL #0x20
00a07138	add x10,x10,x18, LSL #0x20
00a0713c	cinc x10,x10,cs
00a07140	adds x9,x9,x2
00a07144	cinc x17,x10,cs
00a07148	adds x11,x11,x12
00a0714c	cset w12,cs
00a07150	csinc x18,x8,xzr,cs
00a07154	adds x11,x11,x17
00a07158	csel x12,x12,x18,cc
00a0715c	adds x9,x9,x2
00a07160	cinc x10,x10,cs
00a07164	adds x10,x11,x10
00a07168	cinc x11,x12,cs
00a0716c	adds x12,x13,x5
00a07170	cset w13,cs
00a07174	adds x17,x4,x12, LSL #0x20
00a07178	add x12,x14,x12, LSR #0x20
00a0717c	add x12,x12,x13, LSL #0x20
00a07180	cinc x12,x12,cs
00a07184	adds x9,x9,x17
00a07188	cinc x13,x12,cs
00a0718c	adds x10,x10,x13
00a07190	cinc x11,x11,cs
00a07194	adds x9,x9,x17
00a07198	cinc x12,x12,cs
00a0719c	adds x10,x10,x12
00a071a0	cinc x11,x11,cs
00a071a4	adds x12,x16,x7
00a071a8	cset w13,cs
00a071ac	adds x14,x6,x12, LSL #0x20
00a071b0	add x12,x15,x12, LSR #0x20
00a071b4	add x12,x12,x13, LSL #0x20
00a071b8	cinc x12,x12,cs
00a071bc	adds x9,x9,x14
00a071c0	cinc x13,x12,cs
00a071c4	adds x13,x10,x13
00a071c8	cinc x10,x11,cs
00a071cc	adds x9,x9,x14
00a071d0	cinc x11,x12,cs
00a071d4	str x9,[x0, #0x30]
00a071d8	adds x9,x13,x11
00a071dc	ldp x11,x12,[x1, #0x30]
00a071e0	ldp x13,x14,[x1]
00a071e4	ldp x15,x16,[x1, #0x20]
00a071e8	ldp x17,x18,[x1, #0x10]
00a071ec	and x2,x12,#0xffffffff
00a071f0	lsr x12,x12,#0x20
00a071f4	and x3,x13,#0xffffffff
00a071f8	lsr x13,x13,#0x20
00a071fc	and x4,x11,#0xffffffff
00a07200	lsr x11,x11,#0x20
00a07204	and x5,x14,#0xffffffff
00a07208	lsr x14,x14,#0x20
00a0720c	and x6,x16,#0xffffffff
00a07210	lsr x16,x16,#0x20
00a07214	and x7,x17,#0xffffffff
00a07218	lsr x17,x17,#0x20
00a0721c	and x19,x15,#0xffffffff
00a07220	lsr x15,x15,#0x20
00a07224	and x20,x18,#0xffffffff
00a07228	lsr x18,x18,#0x20
00a0722c	mul x21,x13,x2
00a07230	mul x2,x3,x2
00a07234	mul x3,x3,x12
00a07238	mul x12,x13,x12
00a0723c	mul x13,x14,x4
00a07240	mul x4,x5,x4
00a07244	mul x5,x5,x11
00a07248	mul x11,x14,x11
00a0724c	mul x14,x17,x6
00a07250	mul x6,x7,x6
00a07254	mul x7,x7,x16
00a07258	mul x16,x17,x16
00a0725c	mul x17,x18,x19
00a07260	mul x19,x20,x19
00a07264	mul x20,x20,x15
00a07268	mul x15,x18,x15
00a0726c	cinc x10,x10,cs
00a07270	adds x18,x21,x3
00a07274	cset w3,cs
00a07278	add x12,x12,x18, LSR #0x20
00a0727c	adds x2,x2,x18, LSL #0x20
00a07280	add x12,x12,x3, LSL #0x20
00a07284	cinc x12,x12,cs
00a07288	adds x9,x9,x2
00a0728c	cinc x18,x12,cs
00a07290	adds x9,x9,x2
00a07294	cinc x12,x12,cs
00a07298	adds x10,x10,x18
00a0729c	cset w18,cs
00a072a0	csinc x2,x8,xzr,cs
00a072a4	adds x10,x10,x12
00a072a8	csel x12,x18,x2,cc
00a072ac	adds x13,x13,x5
00a072b0	cset w18,cs
00a072b4	add x11,x11,x13, LSR #0x20
00a072b8	adds x2,x4,x13, LSL #0x20
00a072bc	add x11,x11,x18, LSL #0x20
00a072c0	cinc x11,x11,cs
00a072c4	adds x9,x9,x2
00a072c8	cinc x13,x11,cs
00a072cc	adds x10,x10,x13
00a072d0	cinc x12,x12,cs
00a072d4	adds x9,x9,x2
00a072d8	cinc x11,x11,cs
00a072dc	adds x10,x10,x11
00a072e0	cinc x11,x12,cs
00a072e4	adds x12,x14,x7
00a072e8	cset w13,cs
00a072ec	adds x14,x6,x12, LSL #0x20
00a072f0	add x12,x16,x12, LSR #0x20
00a072f4	add x12,x12,x13, LSL #0x20
00a072f8	cinc x12,x12,cs
00a072fc	adds x9,x9,x14
00a07300	cinc x13,x12,cs
00a07304	adds x10,x10,x13
00a07308	cinc x11,x11,cs
00a0730c	adds x9,x9,x14
00a07310	cinc x12,x12,cs
00a07314	adds x10,x10,x12
00a07318	cinc x11,x11,cs
00a0731c	adds x12,x17,x20
00a07320	cset w13,cs
00a07324	adds x14,x19,x12, LSL #0x20
00a07328	add x12,x15,x12, LSR #0x20
00a0732c	add x12,x12,x13, LSL #0x20
00a07330	cinc x12,x12,cs
00a07334	adds x9,x9,x14
00a07338	cinc x13,x12,cs
00a0733c	adds x10,x10,x13
00a07340	cinc x11,x11,cs
00a07344	adds x9,x9,x14
00a07348	cinc x12,x12,cs
00a0734c	str x9,[x0, #0x38]
00a07350	adds x9,x10,x12
00a07354	ldp x10,x12,[x1, #0x18]
00a07358	ldp x13,x14,[x1, #0x28]
00a0735c	ldp x15,x16,[x1, #0x8]
00a07360	ldr x17,[x1, #0x38]
00a07364	and x18,x12,#0xffffffff
00a07368	lsr x12,x12,#0x20
00a0736c	and x2,x13,#0xffffffff
00a07370	lsr x13,x13,#0x20
00a07374	and x3,x10,#0xffffffff
00a07378	lsr x10,x10,#0x20
00a0737c	and x4,x14,#0xffffffff
00a07380	lsr x14,x14,#0x20
00a07384	and x5,x16,#0xffffffff
00a07388	lsr x16,x16,#0x20
00a0738c	and x6,x17,#0xffffffff
00a07390	lsr x17,x17,#0x20
00a07394	and x7,x15,#0xffffffff
00a07398	lsr x15,x15,#0x20
00a0739c	mul x19,x10,x2
00a073a0	mul x2,x3,x2
00a073a4	mul x3,x3,x13
00a073a8	mul x10,x10,x13
00a073ac	mul x13,x16,x4
00a073b0	mul x4,x5,x4
00a073b4	mul x5,x5,x14
00a073b8	mul x14,x16,x14
00a073bc	mul x16,x15,x6
00a073c0	mul x6,x7,x6
00a073c4	mul x7,x7,x17
00a073c8	mul x15,x15,x17
00a073cc	mul x17,x18,x12
00a073d0	mul x18,x18,x18
00a073d4	mul x12,x12,x12
00a073d8	cinc x11,x11,cs
00a073dc	add x12,x12,x17, LSR #0x1f
00a073e0	adds x17,x18,x17, LSL #0x21
00a073e4	cinc x12,x12,cs
00a073e8	adds x9,x9,x17
00a073ec	cinc x12,x12,cs
00a073f0	adds x17,x19,x3
00a073f4	cset w18,cs
00a073f8	add x10,x10,x17, LSR #0x20
00a073fc	adds x2,x2,x17, LSL #0x20
00a07400	add x10,x10,x18, LSL #0x20
00a07404	cinc x10,x10,cs
00a07408	adds x9,x9,x2
00a0740c	cinc x17,x10,cs
00a07410	adds x11,x11,x12
00a07414	cset w12,cs
00a07418	csinc x18,x8,xzr,cs
00a0741c	adds x11,x11,x17
00a07420	csel x12,x12,x18,cc
00a07424	adds x9,x9,x2
00a07428	cinc x10,x10,cs
00a0742c	adds x10,x11,x10
00a07430	cinc x11,x12,cs
00a07434	adds x12,x13,x5
00a07438	cset w13,cs
00a0743c	adds x17,x4,x12, LSL #0x20
00a07440	add x12,x14,x12, LSR #0x20
00a07444	add x12,x12,x13, LSL #0x20
00a07448	cinc x12,x12,cs
00a0744c	adds x9,x9,x17
00a07450	cinc x13,x12,cs
00a07454	adds x10,x10,x13
00a07458	cinc x11,x11,cs
00a0745c	adds x9,x9,x17
00a07460	cinc x12,x12,cs
00a07464	adds x10,x10,x12
00a07468	cinc x11,x11,cs
00a0746c	adds x12,x16,x7
00a07470	cset w13,cs
00a07474	adds x14,x6,x12, LSL #0x20
00a07478	add x12,x15,x12, LSR #0x20
00a0747c	add x12,x12,x13, LSL #0x20
00a07480	cinc x12,x12,cs
00a07484	adds x9,x9,x14
00a07488	cinc x13,x12,cs
00a0748c	adds x10,x10,x13
00a07490	cinc x11,x11,cs
00a07494	adds x9,x9,x14
00a07498	cinc x12,x12,cs
00a0749c	str x9,[x0, #0x40]
00a074a0	adds x9,x10,x12
00a074a4	ldp x10,x12,[x1, #0x30]
00a074a8	ldp x13,x14,[x1, #0x10]
00a074ac	ldp x15,x16,[x1, #0x20]
00a074b0	cinc x11,x11,cs
00a074b4	and x17,x12,#0xffffffff
00a074b8	lsr x12,x12,#0x20
00a074bc	and x18,x13,#0xffffffff
00a074c0	lsr x13,x13,#0x20
00a074c4	and x2,x10,#0xffffffff
00a074c8	lsr x10,x10,#0x20
00a074cc	and x3,x14,#0xffffffff
00a074d0	lsr x14,x14,#0x20
00a074d4	and x4,x16,#0xffffffff
00a074d8	lsr x16,x16,#0x20
00a074dc	and x5,x15,#0xffffffff
00a074e0	lsr x15,x15,#0x20
00a074e4	mul x6,x13,x17
00a074e8	mul x17,x18,x17
00a074ec	mul x18,x18,x12
00a074f0	mul x12,x13,x12
00a074f4	mul x13,x14,x2
00a074f8	mul x2,x3,x2
00a074fc	mul x3,x3,x10
00a07500	mul x10,x14,x10
00a07504	mul x14,x15,x4
00a07508	mul x4,x5,x4
00a0750c	mul x5,x5,x16
00a07510	mul x15,x15,x16
00a07514	adds x16,x6,x18
00a07518	cset w18,cs
00a0751c	add x12,x12,x16, LSR #0x20
00a07520	adds x17,x17,x16, LSL #0x20
00a07524	add x12,x12,x18, LSL #0x20
00a07528	cinc x12,x12,cs
00a0752c	adds x9,x9,x17
00a07530	cinc x16,x12,cs
00a07534	adds x9,x9,x17
00a07538	cinc x12,x12,cs
00a0753c	adds x11,x11,x16
00a07540	cset w16,cs
00a07544	csinc x17,x8,xzr,cs
00a07548	adds x11,x11,x12
00a0754c	csel x12,x16,x17,cc
00a07550	adds x13,x13,x3
00a07554	cset w16,cs
00a07558	add x10,x10,x13, LSR #0x20
00a0755c	adds x17,x2,x13, LSL #0x20
00a07560	add x10,x10,x16, LSL #0x20
00a07564	cinc x10,x10,cs
00a07568	adds x9,x9,x17
00a0756c	cinc x13,x10,cs
00a07570	adds x11,x11,x13
00a07574	cinc x12,x12,cs
00a07578	adds x9,x9,x17
00a0757c	cinc x10,x10,cs
00a07580	adds x10,x11,x10
00a07584	cinc x11,x12,cs
00a07588	adds x12,x14,x5
00a0758c	cset w13,cs
00a07590	adds x14,x4,x12, LSL #0x20
00a07594	add x12,x15,x12, LSR #0x20
00a07598	add x12,x12,x13, LSL #0x20
00a0759c	cinc x12,x12,cs
00a075a0	adds x9,x9,x14
00a075a4	cinc x13,x12,cs
00a075a8	adds x10,x10,x13
00a075ac	cinc x11,x11,cs
00a075b0	adds x9,x9,x14
00a075b4	cinc x12,x12,cs
00a075b8	str x9,[x0, #0x48]
00a075bc	adds x9,x10,x12
00a075c0	ldp x10,x12,[x1, #0x28]
00a075c4	ldp x13,x14,[x1, #0x18]
00a075c8	ldr x15,[x1, #0x38]
00a075cc	cinc x11,x11,cs
00a075d0	and x16,x10,#0xffffffff
00a075d4	lsr x10,x10,#0x20
00a075d8	and x17,x12,#0xffffffff
00a075dc	lsr x12,x12,#0x20
00a075e0	and x18,x14,#0xffffffff
00a075e4	lsr x14,x14,#0x20
00a075e8	and x2,x15,#0xffffffff
00a075ec	lsr x15,x15,#0x20
00a075f0	and x3,x13,#0xffffffff
00a075f4	lsr x13,x13,#0x20
00a075f8	mul x4,x14,x17
00a075fc	mul x17,x18,x17
00a07600	mul x18,x18,x12
00a07604	mul x12,x14,x12
00a07608	mul x14,x13,x2
00a0760c	mul x2,x3,x2
00a07610	mul x3,x3,x15
00a07614	mul x13,x13,x15
00a07618	mul x15,x16,x10
00a0761c	mul x16,x16,x16
00a07620	mul x10,x10,x10
00a07624	add x10,x10,x15, LSR #0x1f
00a07628	adds x15,x16,x15, LSL #0x21
00a0762c	cinc x10,x10,cs
00a07630	adds x9,x9,x15
00a07634	cinc x10,x10,cs
00a07638	adds x15,x4,x18
00a0763c	cset w16,cs
00a07640	add x12,x12,x15, LSR #0x20
00a07644	adds x17,x17,x15, LSL #0x20
00a07648	add x12,x12,x16, LSL #0x20
00a0764c	cinc x12,x12,cs
00a07650	adds x9,x9,x17
00a07654	cinc x15,x12,cs
00a07658	adds x10,x11,x10
00a0765c	cset w11,cs
00a07660	csinc x16,x8,xzr,cs
00a07664	adds x10,x10,x15
00a07668	csel x11,x11,x16,cc
00a0766c	adds x9,x9,x17
00a07670	cinc x12,x12,cs
00a07674	adds x10,x10,x12
00a07678	cinc x11,x11,cs
00a0767c	adds x12,x14,x3
00a07680	cset w14,cs
00a07684	adds x15,x2,x12, LSL #0x20
00a07688	add x12,x13,x12, LSR #0x20
00a0768c	add x12,x12,x14, LSL #0x20
00a07690	cinc x12,x12,cs
00a07694	adds x9,x9,x15
00a07698	cinc x13,x12,cs
00a0769c	adds x10,x10,x13
00a076a0	cinc x11,x11,cs
00a076a4	adds x9,x9,x15
00a076a8	cinc x12,x12,cs
00a076ac	str x9,[x0, #0x50]
00a076b0	ldp x9,x13,[x1, #0x30]
00a076b4	adds x10,x10,x12
00a076b8	ldp x12,x14,[x1, #0x20]
00a076bc	cinc x11,x11,cs
00a076c0	and x15,x13,#0xffffffff
00a076c4	lsr x13,x13,#0x20
00a076c8	and x16,x12,#0xffffffff
00a076cc	lsr x12,x12,#0x20
00a076d0	and x17,x9,#0xffffffff
00a076d4	lsr x9,x9,#0x20
00a076d8	and x18,x14,#0xffffffff
00a076dc	lsr x14,x14,#0x20
00a076e0	mul x2,x12,x15
00a076e4	mul x15,x16,x15
00a076e8	mul x16,x16,x13
00a076ec	mul x12,x12,x13
00a076f0	mul x13,x14,x17
00a076f4	mul x17,x18,x17
00a076f8	mul x18,x18,x9
00a076fc	mul x9,x14,x9
00a07700	adds x14,x2,x16
00a07704	cset w16,cs
00a07708	add x12,x12,x14, LSR #0x20
00a0770c	adds x15,x15,x14, LSL #0x20
00a07710	add x12,x12,x16, LSL #0x20
00a07714	cinc x12,x12,cs
00a07718	adds x10,x10,x15
00a0771c	cinc x14,x12,cs
00a07720	adds x10,x10,x15
00a07724	cinc x12,x12,cs
00a07728	adds x11,x11,x14
00a0772c	cset w14,cs
00a07730	csinc x15,x8,xzr,cs
00a07734	adds x11,x11,x12
00a07738	csel x12,x14,x15,cc
00a0773c	adds x13,x13,x18
00a07740	cset w14,cs
00a07744	add x9,x9,x13, LSR #0x20
00a07748	adds x15,x17,x13, LSL #0x20
00a0774c	add x9,x9,x14, LSL #0x20
00a07750	cinc x9,x9,cs
00a07754	adds x10,x10,x15
00a07758	cinc x13,x9,cs
00a0775c	adds x11,x11,x13
00a07760	cinc x12,x12,cs
00a07764	adds x10,x10,x15
00a07768	cinc x9,x9,cs
00a0776c	str x10,[x0, #0x58]
00a07770	ldp x10,x13,[x1, #0x28]
00a07774	adds x9,x11,x9
00a07778	ldr x11,[x1, #0x38]
00a0777c	cinc x12,x12,cs
00a07780	and x14,x13,#0xffffffff
00a07784	lsr x13,x13,#0x20
00a07788	and x15,x11,#0xffffffff
00a0778c	lsr x11,x11,#0x20
00a07790	and x16,x10,#0xffffffff
00a07794	lsr x10,x10,#0x20
00a07798	mul x17,x10,x15
00a0779c	mul x15,x16,x15
00a077a0	mul x16,x16,x11
00a077a4	mul x10,x10,x11
00a077a8	mul x11,x14,x13
00a077ac	mul x14,x14,x14
00a077b0	mul x13,x13,x13
00a077b4	add x13,x13,x11, LSR #0x1f
00a077b8	adds x11,x14,x11, LSL #0x21
00a077bc	cinc x13,x13,cs
00a077c0	adds x9,x9,x11
00a077c4	cinc x11,x13,cs
00a077c8	adds x13,x17,x16
00a077cc	cset w14,cs
00a077d0	add x10,x10,x13, LSR #0x20
00a077d4	adds x15,x15,x13, LSL #0x20
00a077d8	add x10,x10,x14, LSL #0x20
00a077dc	cinc x10,x10,cs
00a077e0	adds x9,x9,x15
00a077e4	cinc x13,x10,cs
00a077e8	adds x11,x12,x11
00a077ec	cset w12,cs
00a077f0	csinc x8,x8,xzr,cs
00a077f4	adds x11,x11,x13
00a077f8	csel x8,x12,x8,cc
00a077fc	adds x9,x9,x15
00a07800	str x9,[x0, #0x60]
00a07804	ldp x9,x12,[x1, #0x30]
00a07808	cinc x10,x10,cs
00a0780c	adds x10,x11,x10
00a07810	cinc x8,x8,cs
00a07814	and x11,x12,#0xffffffff
00a07818	lsr x12,x12,#0x20
00a0781c	and x13,x9,#0xffffffff
00a07820	lsr x9,x9,#0x20
00a07824	mul x14,x9,x11
00a07828	mul x11,x13,x11
00a0782c	mul x13,x13,x12
00a07830	mul x9,x9,x12
00a07834	adds x12,x14,x13
00a07838	cset w13,cs
00a0783c	add x9,x9,x12, LSR #0x20
00a07840	adds x11,x11,x12, LSL #0x20
00a07844	add x9,x9,x13, LSL #0x20
00a07848	cinc x9,x9,cs
00a0784c	adds x10,x10,x11
00a07850	cinc x12,x9,cs
00a07854	adds x10,x10,x11
00a07858	str x10,[x0, #0x68]
00a0785c	ldr x10,[x1, #0x38]
00a07860	cinc x9,x9,cs
00a07864	and x11,x10,#0xffffffff
00a07868	lsr x10,x10,#0x20
00a0786c	mul x13,x11,x10
00a07870	mul x11,x11,x11
00a07874	mul x10,x10,x10
00a07878	add x10,x10,x13, LSR #0x1f
00a0787c	adds x11,x11,x13, LSL #0x21
00a07880	cinc x10,x10,cs
00a07884	adds x8,x8,x12
00a07888	cinc x10,x10,cs
00a0788c	adds x8,x8,x9
00a07890	cinc x9,x10,cs
00a07894	adds x8,x8,x11
00a07898	cinc x9,x9,cs
00a0789c	stp x8,x9,[x0, #0x70]
00a078a0	ldp x20,x19,[sp, #0x10]
00a078a4	ldr x21,[sp], #0x20
00a078a8	ret
