; std::__ndk1::__time_get_storage<wchar_t>::init @ 00c06b78
00c06b78	paciasp
00c06b7c	stp x29,x30,[sp, #-0x60]!
00c06b80	stp x28,x27,[sp, #0x10]
00c06b84	stp x26,x25,[sp, #0x20]
00c06b88	stp x24,x23,[sp, #0x30]
00c06b8c	stp x22,x21,[sp, #0x40]
00c06b90	stp x20,x19,[sp, #0x50]
00c06b94	mov x29,sp
00c06b98	sub sp,sp,#0x270
00c06b9c	movi v0.2D,#0x0
00c06ba0	add x26,sp,#0x3c
00c06ba4	mov x19,x0
00c06ba8	mov x25,xzr
00c06bac	sub x27,x29,#0xa4
00c06bb0	add x28,x0,#0x8
00c06bb4	add x20,x26,#0x10
00c06bb8	mov w21,#0x18
00c06bbc	mov w22,#0x4
00c06bc0	str x1,[sp, #0x8]
00c06bc4	stur xzr,[x29, #-0x10]
00c06bc8	str xzr,[sp, #0x30]
00c06bcc	stp q0,q0,[x29, #-0x30]
00c06bd0	stur q0,[x29, #-0x40]
00c06bd4	b 0x00c06bec
00c06bd8	lsl w8,w23,#0x1
00c06bdc	strb w8,[x24]
00c06be0	add x25,x25,#0x1
00c06be4	cmp x25,#0x7
00c06be8	b.eq 0x00c06ea0
00c06bec	ldr x4,[x19]
00c06bf0	sub x0,x29,#0xa4
00c06bf4	sub x3,x29,#0x40
00c06bf8	mov w1,#0x64
00c06bfc	adrp x2,0x2c0000
00c06c00	add x2,x2,#0xc64
00c06c04	stur w25,[x29, #-0x28]
00c06c08	bl 0x00c43b60
00c06c0c	ldr x0,[x19]
00c06c10	stp x27,xzr,[sp, #0x28]
00c06c14	bl 0x00c43880
00c06c18	mov x24,x0
00c06c1c	str x0,[sp, #0x10]
00c06c20	add x0,sp,#0x3c
00c06c24	add x1,sp,#0x28
00c06c28	add x3,sp,#0x30
00c06c2c	mov w2,#0x64
00c06c30	bl 0x00c43af0
00c06c34	mov x23,x0
00c06c38	cbz x24,0x00c06c44
00c06c3c	mov x0,x24
00c06c40	bl 0x00c43880
00c06c44	add x8,x23,#0x1
00c06c48	cmp x8,#0x1
00c06c4c	b.ls 0x00c075d4
00c06c50	madd x24,x25,x21,x28
00c06c54	ldr x9,[x24]
00c06c58	ldrb w8,[x24]
00c06c5c	and x10,x9,#-0x2
00c06c60	tst w8,#0x1
00c06c64	and w8,w9,#0xff
00c06c68	sub x10,x10,#0x1
00c06c6c	csel x1,x22,x10,eq
00c06c70	subs x2,x23,x1
00c06c74	b.ls 0x00c06ca4
00c06c78	ldr x10,[x24, #0x8]
00c06c7c	ubfx x9,x9,#0x1,#0x7
00c06c80	tst w8,#0x1
00c06c84	mov x0,x24
00c06c88	mov x4,xzr
00c06c8c	mov x6,xzr
00c06c90	csel x3,x9,x10,eq
00c06c94	mov x5,x3
00c06c98	bl 0x00c43d70
00c06c9c	ldrb w8,[x24]
00c06ca0	str xzr,[x24, #0x8]
00c06ca4	ldr x10,[x24, #0x10]
00c06ca8	sub x9,x23,#0x1
00c06cac	add x11,x24,#0x4
00c06cb0	tst w8,#0x1
00c06cb4	and x9,x9,#0x3fffffffffffffff
00c06cb8	add x8,sp,#0x3c
00c06cbc	csel x12,x11,x10,eq
00c06cc0	cmp x9,#0x7
00c06cc4	b.cc 0x00c06d18
00c06cc8	sub x10,x12,x8
00c06ccc	cmp x10,#0x20
00c06cd0	b.cc 0x00c06d18
00c06cd4	add x10,x9,#0x1
00c06cd8	mov x14,x20
00c06cdc	and x11,x10,#0x7ffffffffffffff8
00c06ce0	lsl x8,x11,#0x2
00c06ce4	mov x13,x11
00c06ce8	add x9,x12,x8
00c06cec	add x8,x26,x8
00c06cf0	add x12,x12,#0x10
00c06cf4	ldp q0,q1,[x14, #-0x10]
00c06cf8	subs x13,x13,#0x8
00c06cfc	add x14,x14,#0x20
00c06d00	stp q0,q1,[x12, #-0x10]
00c06d04	add x12,x12,#0x20
00c06d08	b.ne 0x00c06cf4
00c06d0c	cmp x10,x11
00c06d10	mov x12,x9
00c06d14	b.eq 0x00c06d30
00c06d18	add x10,x26,x23, LSL #0x2
00c06d1c	mov x9,x12
00c06d20	ldr w11,[x8], #0x4
00c06d24	cmp x8,x10
00c06d28	str w11,[x9], #0x4
00c06d2c	b.ne 0x00c06d20
00c06d30	str wzr,[x9]
00c06d34	ldrb w8,[x24]
00c06d38	tbnz w8,#0x0,0x00c06d48
00c06d3c	lsl w8,w23,#0x1
00c06d40	strb w8,[x24]
00c06d44	b 0x00c06d4c
00c06d48	str x23,[x24, #0x8]
00c06d4c	ldr x4,[x19]
00c06d50	sub x0,x29,#0xa4
00c06d54	sub x3,x29,#0x40
00c06d58	mov w1,#0x64
00c06d5c	adrp x2,0x2b5000
00c06d60	add x2,x2,#0xa9
00c06d64	bl 0x00c43b60
00c06d68	ldr x0,[x19]
00c06d6c	stp x27,xzr,[sp, #0x28]
00c06d70	bl 0x00c43880
00c06d74	mov x24,x0
00c06d78	str x0,[sp, #0x10]
00c06d7c	add x0,sp,#0x3c
00c06d80	add x1,sp,#0x28
00c06d84	add x3,sp,#0x30
00c06d88	mov w2,#0x64
00c06d8c	bl 0x00c43af0
00c06d90	mov x23,x0
00c06d94	cbz x24,0x00c06da0
00c06d98	mov x0,x24
00c06d9c	bl 0x00c43880
00c06da0	add x8,x23,#0x1
00c06da4	cmp x8,#0x1
00c06da8	b.ls 0x00c075d4
00c06dac	madd x24,x25,x21,x28
00c06db0	ldrb w8,[x24, #0xa8]!
00c06db4	ldr x9,[x24]
00c06db8	and x10,x9,#-0x2
00c06dbc	tst w8,#0x1
00c06dc0	and w8,w9,#0xff
00c06dc4	sub x10,x10,#0x1
00c06dc8	csel x1,x22,x10,eq
00c06dcc	subs x2,x23,x1
00c06dd0	b.ls 0x00c06e00
00c06dd4	ldr x10,[x24, #0x8]
00c06dd8	ubfx x9,x9,#0x1,#0x7
00c06ddc	tst w8,#0x1
00c06de0	mov x0,x24
00c06de4	mov x4,xzr
00c06de8	mov x6,xzr
00c06dec	csel x3,x9,x10,eq
00c06df0	mov x5,x3
00c06df4	bl 0x00c43d70
00c06df8	ldrb w8,[x24]
00c06dfc	str xzr,[x24, #0x8]
00c06e00	ldr x10,[x24, #0x10]
00c06e04	sub x9,x23,#0x1
00c06e08	add x11,x24,#0x4
00c06e0c	tst w8,#0x1
00c06e10	and x9,x9,#0x3fffffffffffffff
00c06e14	add x8,sp,#0x3c
00c06e18	csel x12,x11,x10,eq
00c06e1c	cmp x9,#0x7
00c06e20	b.cc 0x00c06e74
00c06e24	sub x10,x12,x8
00c06e28	cmp x10,#0x20
00c06e2c	b.cc 0x00c06e74
00c06e30	add x10,x9,#0x1
00c06e34	mov x14,x20
00c06e38	and x11,x10,#0x7ffffffffffffff8
00c06e3c	lsl x8,x11,#0x2
00c06e40	mov x13,x11
00c06e44	add x9,x12,x8
00c06e48	add x8,x26,x8
00c06e4c	add x12,x12,#0x10
00c06e50	ldp q0,q1,[x14, #-0x10]
00c06e54	subs x13,x13,#0x8
00c06e58	add x14,x14,#0x20
00c06e5c	stp q0,q1,[x12, #-0x10]
00c06e60	add x12,x12,#0x20
00c06e64	b.ne 0x00c06e50
00c06e68	cmp x10,x11
00c06e6c	mov x12,x9
00c06e70	b.eq 0x00c06e8c
00c06e74	add x10,x26,x23, LSL #0x2
00c06e78	mov x9,x12
00c06e7c	ldr w11,[x8], #0x4
00c06e80	cmp x8,x10
00c06e84	str w11,[x9], #0x4
00c06e88	b.ne 0x00c06e7c
00c06e8c	str wzr,[x9]
00c06e90	ldrb w8,[x24]
00c06e94	tbz w8,#0x0,0x00c06bd8
00c06e98	str x23,[x24, #0x8]
00c06e9c	b 0x00c06be0
00c06ea0	add x27,sp,#0x3c
00c06ea4	mov x25,xzr
00c06ea8	add x26,x19,#0x158
00c06eac	add x28,x27,#0x10
00c06eb0	sub x20,x29,#0xa4
00c06eb4	mov w21,#0x18
00c06eb8	mov w22,#0x4
00c06ebc	b 0x00c06ed4
00c06ec0	lsl w8,w23,#0x1
00c06ec4	strb w8,[x24]
00c06ec8	add x25,x25,#0x1
00c06ecc	cmp x25,#0xc
00c06ed0	b.eq 0x00c0718c
00c06ed4	ldr x4,[x19]
00c06ed8	sub x0,x29,#0xa4
00c06edc	sub x3,x29,#0x40
00c06ee0	mov w1,#0x64
00c06ee4	adrp x2,0x2ba000
00c06ee8	add x2,x2,#0xc87
00c06eec	stur w25,[x29, #-0x30]
00c06ef0	bl 0x00c43b60
00c06ef4	ldr x0,[x19]
00c06ef8	stp x20,xzr,[sp, #0x28]
00c06efc	bl 0x00c43880
00c06f00	mov x24,x0
00c06f04	str x0,[sp, #0x10]
00c06f08	add x0,sp,#0x3c
00c06f0c	add x1,sp,#0x28
00c06f10	add x3,sp,#0x30
00c06f14	mov w2,#0x64
00c06f18	bl 0x00c43af0
00c06f1c	mov x23,x0
00c06f20	cbz x24,0x00c06f2c
00c06f24	mov x0,x24
00c06f28	bl 0x00c43880
00c06f2c	add x8,x23,#0x1
00c06f30	cmp x8,#0x1
00c06f34	b.ls 0x00c075d4
00c06f38	madd x24,x25,x21,x26
00c06f3c	ldr x9,[x24]
00c06f40	ldrb w8,[x24]
00c06f44	and x10,x9,#-0x2
00c06f48	tst w8,#0x1
00c06f4c	and w8,w9,#0xff
00c06f50	sub x10,x10,#0x1
00c06f54	csel x1,x22,x10,eq
00c06f58	subs x2,x23,x1
00c06f5c	b.ls 0x00c06f8c
00c06f60	ldr x10,[x24, #0x8]
00c06f64	ubfx x9,x9,#0x1,#0x7
00c06f68	tst w8,#0x1
00c06f6c	mov x0,x24
00c06f70	mov x4,xzr
00c06f74	mov x6,xzr
00c06f78	csel x3,x9,x10,eq
00c06f7c	mov x5,x3
00c06f80	bl 0x00c43d70
00c06f84	ldrb w8,[x24]
00c06f88	str xzr,[x24, #0x8]
00c06f8c	ldr x10,[x24, #0x10]
00c06f90	sub x9,x23,#0x1
00c06f94	add x11,x24,#0x4
00c06f98	tst w8,#0x1
00c06f9c	and x9,x9,#0x3fffffffffffffff
00c06fa0	add x8,sp,#0x3c
00c06fa4	csel x12,x11,x10,eq
00c06fa8	cmp x9,#0x7
00c06fac	b.cc 0x00c07000
00c06fb0	sub x10,x12,x8
00c06fb4	cmp x10,#0x20
00c06fb8	b.cc 0x00c07000
00c06fbc	add x10,x9,#0x1
00c06fc0	mov x14,x28
00c06fc4	and x11,x10,#0x7ffffffffffffff8
00c06fc8	lsl x8,x11,#0x2
00c06fcc	mov x13,x11
00c06fd0	add x9,x12,x8
00c06fd4	add x8,x27,x8
00c06fd8	add x12,x12,#0x10
00c06fdc	ldp q0,q1,[x14, #-0x10]
00c06fe0	subs x13,x13,#0x8
00c06fe4	add x14,x14,#0x20
00c06fe8	stp q0,q1,[x12, #-0x10]
00c06fec	add x12,x12,#0x20
00c06ff0	b.ne 0x00c06fdc
00c06ff4	cmp x10,x11
00c06ff8	mov x12,x9
00c06ffc	b.eq 0x00c07018
00c07000	add x10,x27,x23, LSL #0x2
00c07004	mov x9,x12
00c07008	ldr w11,[x8], #0x4
00c0700c	cmp x8,x10
00c07010	str w11,[x9], #0x4
00c07014	b.ne 0x00c07008
00c07018	str wzr,[x9]
00c0701c	ldrb w8,[x24]
00c07020	tbnz w8,#0x0,0x00c07030
00c07024	lsl w8,w23,#0x1
00c07028	strb w8,[x24]
00c0702c	b 0x00c07034
00c07030	str x23,[x24, #0x8]
00c07034	ldr x4,[x19]
00c07038	sub x0,x29,#0xa4
00c0703c	sub x3,x29,#0x40
00c07040	mov w1,#0x64
00c07044	adrp x2,0x2a6000
00c07048	add x2,x2,#0xf35
00c0704c	bl 0x00c43b60
00c07050	ldr x0,[x19]
00c07054	stp x20,xzr,[sp, #0x28]
00c07058	bl 0x00c43880
00c0705c	mov x24,x0
00c07060	str x0,[sp, #0x10]
00c07064	add x0,sp,#0x3c
00c07068	add x1,sp,#0x28
00c0706c	add x3,sp,#0x30
00c07070	mov w2,#0x64
00c07074	bl 0x00c43af0
00c07078	mov x23,x0
00c0707c	cbz x24,0x00c07088
00c07080	mov x0,x24
00c07084	bl 0x00c43880
00c07088	add x8,x23,#0x1
00c0708c	cmp x8,#0x1
00c07090	b.ls 0x00c075d4
00c07094	madd x8,x25,x21,x26
00c07098	ldr x9,[x8, #0x120]
00c0709c	ldrb w10,[x8, #0x120]
00c070a0	add x24,x8,#0x120
00c070a4	and x11,x9,#-0x2
00c070a8	tst w10,#0x1
00c070ac	and w8,w9,#0xff
00c070b0	sub x11,x11,#0x1
00c070b4	csel x1,x22,x11,eq
00c070b8	subs x2,x23,x1
00c070bc	b.ls 0x00c070ec
00c070c0	ldr x10,[x24, #0x8]
00c070c4	ubfx x9,x9,#0x1,#0x7
00c070c8	tst w8,#0x1
00c070cc	mov x0,x24
00c070d0	mov x4,xzr
00c070d4	mov x6,xzr
00c070d8	csel x3,x9,x10,eq
00c070dc	mov x5,x3
00c070e0	bl 0x00c43d70
00c070e4	ldrb w8,[x24]
00c070e8	str xzr,[x24, #0x8]
00c070ec	ldr x10,[x24, #0x10]
00c070f0	sub x9,x23,#0x1
00c070f4	add x11,x24,#0x4
00c070f8	tst w8,#0x1
00c070fc	and x9,x9,#0x3fffffffffffffff
00c07100	add x8,sp,#0x3c
00c07104	csel x12,x11,x10,eq
00c07108	cmp x9,#0x7
00c0710c	b.cc 0x00c07160
00c07110	sub x10,x12,x8
00c07114	cmp x10,#0x20
00c07118	b.cc 0x00c07160
00c0711c	add x10,x9,#0x1
00c07120	mov x14,x28
00c07124	and x11,x10,#0x7ffffffffffffff8
00c07128	lsl x8,x11,#0x2
00c0712c	mov x13,x11
00c07130	add x9,x12,x8
00c07134	add x8,x27,x8
00c07138	add x12,x12,#0x10
00c0713c	ldp q0,q1,[x14, #-0x10]
00c07140	subs x13,x13,#0x8
00c07144	add x14,x14,#0x20
00c07148	stp q0,q1,[x12, #-0x10]
00c0714c	add x12,x12,#0x20
00c07150	b.ne 0x00c0713c
00c07154	cmp x10,x11
00c07158	mov x12,x9
00c0715c	b.eq 0x00c07178
00c07160	add x10,x27,x23, LSL #0x2
00c07164	mov x9,x12
00c07168	ldr w11,[x8], #0x4
00c0716c	cmp x8,x10
00c07170	str w11,[x9], #0x4
00c07174	b.ne 0x00c07168
00c07178	str wzr,[x9]
00c0717c	ldrb w8,[x24]
00c07180	tbz w8,#0x0,0x00c06ec0
00c07184	str x23,[x24, #0x8]
00c07188	b 0x00c06ec8
00c0718c	ldr x4,[x19]
00c07190	mov w8,#0x1
00c07194	adrp x2,0x2ab000
00c07198	add x2,x2,#0x219
00c0719c	sub x0,x29,#0xa4
00c071a0	sub x3,x29,#0x40
00c071a4	mov w1,#0x64
00c071a8	stur w8,[x29, #-0x38]
00c071ac	sub x20,x29,#0xa4
00c071b0	bl 0x00c43b60
00c071b4	ldr x0,[x19]
00c071b8	stp x20,xzr,[sp, #0x28]
00c071bc	bl 0x00c43880
00c071c0	mov x22,x0
00c071c4	str x0,[sp, #0x10]
00c071c8	add x0,sp,#0x3c
00c071cc	add x1,sp,#0x28
00c071d0	add x3,sp,#0x30
00c071d4	mov w2,#0x64
00c071d8	bl 0x00c43af0
00c071dc	mov x21,x0
00c071e0	cbz x22,0x00c071ec
00c071e4	mov x0,x22
00c071e8	bl 0x00c43880
00c071ec	cmn x21,#0x1
00c071f0	b.eq 0x00c075d4
00c071f4	ldr x8,[x19, #0x398]
00c071f8	ldrb w9,[x19, #0x398]
00c071fc	and x10,x8,#-0x2
00c07200	tst w9,#0x1
00c07204	mov w9,#0x4
00c07208	sub x10,x10,#0x1
00c0720c	csel x1,x9,x10,eq
00c07210	and w9,w8,#0xff
00c07214	subs x2,x21,x1
00c07218	b.ls 0x00c0725c
00c0721c	ldr x10,[x19, #0x3a0]
00c07220	ubfx x8,x8,#0x1,#0x7
00c07224	tst w9,#0x1
00c07228	add x0,x19,#0x398
00c0722c	mov x4,xzr
00c07230	mov x6,xzr
00c07234	csel x3,x8,x10,eq
00c07238	mov x5,x3
00c0723c	bl 0x00c43d70
00c07240	ldrb w8,[x19, #0x398]
00c07244	ldr x9,[x19, #0x3a8]
00c07248	add x10,x19,#0x39c
00c0724c	str xzr,[x19, #0x3a0]
00c07250	tst w8,#0x1
00c07254	csel x12,x10,x9,eq
00c07258	b 0x00c07274
00c0725c	ldr x8,[x19, #0x3a8]
00c07260	add x10,x19,#0x39c
00c07264	tst w9,#0x1
00c07268	csel x12,x10,x8,eq
00c0726c	mov x9,x12
00c07270	cbz x21,0x00c072f8
00c07274	sub x8,x21,#0x1
00c07278	and x9,x8,#0x3fffffffffffffff
00c0727c	add x8,sp,#0x3c
00c07280	cmp x9,#0x7
00c07284	b.cc 0x00c072dc
00c07288	sub x10,x12,x8
00c0728c	cmp x10,#0x20
00c07290	b.cc 0x00c072dc
00c07294	add x10,x9,#0x1
00c07298	add x13,sp,#0x3c
00c0729c	and x11,x10,#0x7ffffffffffffff8
00c072a0	lsl x8,x11,#0x2
00c072a4	mov x14,x11
00c072a8	add x9,x12,x8
00c072ac	add x8,x13,x8
00c072b0	add x13,x13,#0x10
00c072b4	add x12,x12,#0x10
00c072b8	ldp q0,q1,[x13, #-0x10]
00c072bc	subs x14,x14,#0x8
00c072c0	add x13,x13,#0x20
00c072c4	stp q0,q1,[x12, #-0x10]
00c072c8	add x12,x12,#0x20
00c072cc	b.ne 0x00c072b8
00c072d0	cmp x10,x11
00c072d4	b.ne 0x00c072e0
00c072d8	b 0x00c072f8
00c072dc	mov x9,x12
00c072e0	add x10,sp,#0x3c
00c072e4	add x10,x10,x21, LSL #0x2
00c072e8	ldr w11,[x8], #0x4
00c072ec	cmp x8,x10
00c072f0	str w11,[x9], #0x4
00c072f4	b.ne 0x00c072e8
00c072f8	str wzr,[x9]
00c072fc	ldrb w8,[x19, #0x398]
00c07300	tbnz w8,#0x0,0x00c07310
00c07304	lsl w8,w21,#0x1
00c07308	strb w8,[x19, #0x398]
00c0730c	b 0x00c07314
00c07310	str x21,[x19, #0x3a0]
00c07314	ldr x4,[x19]
00c07318	mov w8,#0xd
00c0731c	adrp x2,0x2ab000
00c07320	add x2,x2,#0x219
00c07324	sub x0,x29,#0xa4
00c07328	sub x3,x29,#0x40
00c0732c	mov w1,#0x64
00c07330	stur w8,[x29, #-0x38]
00c07334	sub x20,x29,#0xa4
00c07338	bl 0x00c43b60
00c0733c	ldr x0,[x19]
00c07340	stp x20,xzr,[sp, #0x28]
00c07344	bl 0x00c43880
00c07348	mov x22,x0
00c0734c	str x0,[sp, #0x10]
00c07350	add x0,sp,#0x3c
00c07354	add x1,sp,#0x28
00c07358	add x3,sp,#0x30
00c0735c	mov w2,#0x64
00c07360	bl 0x00c43af0
00c07364	mov x21,x0
00c07368	cbz x22,0x00c07374
00c0736c	mov x0,x22
00c07370	bl 0x00c43880
00c07374	cmn x21,#0x1
00c07378	b.eq 0x00c075d4
00c0737c	ldr x8,[x19, #0x3b0]
00c07380	ldrb w9,[x19, #0x3b0]
00c07384	and x10,x8,#-0x2
00c07388	tst w9,#0x1
00c0738c	mov w9,#0x4
00c07390	sub x10,x10,#0x1
00c07394	csel x1,x9,x10,eq
00c07398	and w9,w8,#0xff
00c0739c	subs x2,x21,x1
00c073a0	b.ls 0x00c073e4
00c073a4	ldr x10,[x19, #0x3b8]
00c073a8	ubfx x8,x8,#0x1,#0x7
00c073ac	tst w9,#0x1
00c073b0	add x0,x19,#0x3b0
00c073b4	mov x4,xzr
00c073b8	mov x6,xzr
00c073bc	csel x3,x8,x10,eq
00c073c0	mov x5,x3
00c073c4	bl 0x00c43d70
00c073c8	ldrb w8,[x19, #0x3b0]
00c073cc	ldr x9,[x19, #0x3c0]
00c073d0	add x10,x19,#0x3b4
00c073d4	str xzr,[x19, #0x3b8]
00c073d8	tst w8,#0x1
00c073dc	csel x12,x10,x9,eq
00c073e0	b 0x00c073fc
00c073e4	ldr x8,[x19, #0x3c0]
00c073e8	add x10,x19,#0x3b4
00c073ec	tst w9,#0x1
00c073f0	csel x12,x10,x8,eq
00c073f4	mov x9,x12
00c073f8	cbz x21,0x00c07480
00c073fc	sub x8,x21,#0x1
00c07400	and x9,x8,#0x3fffffffffffffff
00c07404	add x8,sp,#0x3c
00c07408	cmp x9,#0x7
00c0740c	b.cc 0x00c07464
00c07410	sub x10,x12,x8
00c07414	cmp x10,#0x20
00c07418	b.cc 0x00c07464
00c0741c	add x10,x9,#0x1
00c07420	add x13,sp,#0x3c
00c07424	and x11,x10,#0x7ffffffffffffff8
00c07428	lsl x8,x11,#0x2
00c0742c	mov x14,x11
00c07430	add x9,x12,x8
00c07434	add x8,x13,x8
00c07438	add x13,x13,#0x10
00c0743c	add x12,x12,#0x10
00c07440	ldp q0,q1,[x13, #-0x10]
00c07444	subs x14,x14,#0x8
00c07448	add x13,x13,#0x20
00c0744c	stp q0,q1,[x12, #-0x10]
00c07450	add x12,x12,#0x20
00c07454	b.ne 0x00c07440
00c07458	cmp x10,x11
00c0745c	b.ne 0x00c07468
00c07460	b 0x00c07480
00c07464	mov x9,x12
00c07468	add x10,sp,#0x3c
00c0746c	add x10,x10,x21, LSL #0x2
00c07470	ldr w11,[x8], #0x4
00c07474	cmp x8,x10
00c07478	str w11,[x9], #0x4
00c0747c	b.ne 0x00c07470
00c07480	str wzr,[x9]
00c07484	ldrb w8,[x19, #0x3b0]
00c07488	tbnz w8,#0x0,0x00c07498
00c0748c	lsl w8,w21,#0x1
00c07490	strb w8,[x19, #0x3b0]
00c07494	b 0x00c0749c
00c07498	str x21,[x19, #0x3b8]
00c0749c	ldr x21,[sp, #0x8]
00c074a0	add x8,sp,#0x10
00c074a4	mov x0,x19
00c074a8	mov w1,#0x63
00c074ac	mov x2,x21
00c074b0	bl 0x00c446a0
00c074b4	ldrb w8,[x19, #0x3c8]
00c074b8	add x20,x19,#0x3c8
00c074bc	tbz w8,#0x0,0x00c074d4
00c074c0	ldr x8,[x19, #0x3c8]
00c074c4	ldr x0,[x19, #0x3d8]
00c074c8	lsl x8,x8,#0x2
00c074cc	and x1,x8,#-0x8
00c074d0	bl 0x00c2fe80
00c074d4	ldr x8,[sp, #0x20]
00c074d8	ldr q0,[sp, #0x10]
00c074dc	mov x0,x19
00c074e0	mov w1,#0x72
00c074e4	mov x2,x21
00c074e8	str x8,[x20, #0x10]
00c074ec	add x8,sp,#0x10
00c074f0	str q0,[x20]
00c074f4	bl 0x00c446a0
00c074f8	ldrb w8,[x19, #0x3e0]
00c074fc	add x20,x19,#0x3e0
00c07500	tbz w8,#0x0,0x00c07518
00c07504	ldr x8,[x19, #0x3e0]
00c07508	ldr x0,[x19, #0x3f0]
00c0750c	lsl x8,x8,#0x2
00c07510	and x1,x8,#-0x8
00c07514	bl 0x00c2fe80
00c07518	ldr x8,[sp, #0x20]
00c0751c	ldr q0,[sp, #0x10]
00c07520	mov x0,x19
00c07524	mov w1,#0x78
00c07528	mov x2,x21
00c0752c	str x8,[x20, #0x10]
00c07530	add x8,sp,#0x10
00c07534	str q0,[x20]
00c07538	bl 0x00c446a0
00c0753c	ldrb w8,[x19, #0x3f8]
00c07540	add x20,x19,#0x3f8
00c07544	tbz w8,#0x0,0x00c0755c
00c07548	ldr x8,[x19, #0x3f8]
00c0754c	ldr x0,[x19, #0x408]
00c07550	lsl x8,x8,#0x2
00c07554	and x1,x8,#-0x8
00c07558	bl 0x00c2fe80
00c0755c	ldr x8,[sp, #0x20]
00c07560	ldr q0,[sp, #0x10]
00c07564	mov x0,x19
00c07568	mov w1,#0x58
00c0756c	mov x2,x21
00c07570	str x8,[x20, #0x10]
00c07574	add x8,sp,#0x10
00c07578	str q0,[x20]
00c0757c	bl 0x00c446a0
00c07580	ldrb w8,[x19, #0x410]
00c07584	add x20,x19,#0x410
00c07588	tbz w8,#0x0,0x00c075a0
00c0758c	ldr x8,[x19, #0x410]
00c07590	ldr x0,[x19, #0x420]
00c07594	lsl x8,x8,#0x2
00c07598	and x1,x8,#-0x8
00c0759c	bl 0x00c2fe80
00c075a0	ldr q0,[sp, #0x10]
00c075a4	ldr x8,[sp, #0x20]
00c075a8	str q0,[x20]
00c075ac	str x8,[x20, #0x10]
00c075b0	add sp,sp,#0x270
00c075b4	ldp x20,x19,[sp, #0x50]
00c075b8	ldp x22,x21,[sp, #0x40]
00c075bc	ldp x24,x23,[sp, #0x30]
00c075c0	ldp x26,x25,[sp, #0x20]
00c075c4	ldp x28,x27,[sp, #0x10]
00c075c8	ldp x29,x30,[sp], #0x60
00c075cc	autiasp
00c075d0	ret
00c075d4	adrp x0,0x29f000
00c075d8	add x0,x0,#0x109
00c075dc	bl 0x00c43d00
00c075e0	bl 0x007fe114
