; SSL_new @ 009b1c98
009b1c98	str x21,[sp, #-0x30]!
009b1c9c	stp x20,x19,[sp, #0x10]
009b1ca0	stp x29,x30,[sp, #0x20]
009b1ca4	add x29,sp,#0x20
009b1ca8	cbz x0,0x009b201c
009b1cac	ldr x8,[x0, #0x8]
009b1cb0	mov x20,x0
009b1cb4	cbz x8,0x009b2044
009b1cb8	adrp x1,0x2c5000
009b1cbc	add x1,x1,#0x652
009b1cc0	mov w0,#0x1db8
009b1cc4	mov w2,#0x2bc
009b1cc8	bl 0x00c34250
009b1ccc	mov x19,x0
009b1cd0	cbz x0,0x009b2084
009b1cd4	add x8,x19,#0x9e0
009b1cd8	mov w9,#0x1
009b1cdc	stlr w9,[x8]
009b1ce0	bl 0x00c34d50
009b1ce4	str x0,[x19, #0x1d68]
009b1ce8	cbz x0,0x009b206c
009b1cec	add x0,x19,#0xc58
009b1cf0	mov x1,x19
009b1cf4	bl 0x00c358e0
009b1cf8	ldr x8,[x20, #0x138]
009b1cfc	str x8,[x19, #0x9e8]
009b1d00	ldr x8,[x20, #0x3b0]
009b1d04	str x8,[x19, #0x518]
009b1d08	ldr w8,[x20, #0x148]
009b1d0c	str w8,[x19, #0x9f8]
009b1d10	ldr x8,[x20, #0x140]
009b1d14	str x8,[x19, #0x9f0]
009b1d18	ldr x8,[x20, #0x150]
009b1d1c	str x8,[x19, #0xa00]
009b1d20	ldr x8,[x20, #0x3d8]
009b1d24	str x8,[x19, #0x1d40]
009b1d28	ldr x8,[x20, #0x410]
009b1d2c	str x8,[x19, #0x1d70]
009b1d30	ldr w8,[x20, #0x428]
009b1d34	str w8,[x19, #0xbac]
009b1d38	ldr x0,[x20, #0x20]
009b1d3c	bl 0x00c35330
009b1d40	str x0,[x19, #0x538]
009b1d44	cbz x0,0x009b2084
009b1d48	ldr x0,[x20, #0x158]
009b1d4c	bl 0x00c35110
009b1d50	str x0,[x19, #0x898]
009b1d54	cbz x0,0x009b2084
009b1d58	ldr w8,[x20, #0x160]
009b1d5c	str w8,[x19, #0xc60]
009b1d60	add x8,x20,#0x168
009b1d64	ldr q0,[x8]
009b1d68	str q0,[x19, #0x4c0]
009b1d6c	ldr w8,[x20, #0x178]
009b1d70	str w8,[x19, #0x968]
009b1d74	ldr x8,[x20, #0x3c0]
009b1d78	str x8,[x19, #0xc50]
009b1d7c	ldr q0,[x20, #0x3e0]
009b1d80	str q0,[x19, #0x1d50]
009b1d84	ldr x8,[x20, #0x3f0]
009b1d88	str x8,[x19, #0x1d60]
009b1d8c	ldr x8,[x20, #0x180]
009b1d90	cmp x8,#0x20
009b1d94	str x8,[x19, #0x8f0]
009b1d98	b.hi 0x009b2084
009b1d9c	add x8,x20,#0x198
009b1da0	ldr q0,[x8]
009b1da4	add x9,x19,#0x908
009b1da8	add x8,x20,#0x188
009b1dac	str q0,[x9]
009b1db0	ldr q0,[x8]
009b1db4	add x8,x19,#0x8f8
009b1db8	str q0,[x8]
009b1dbc	ldr x8,[x20, #0x1a8]
009b1dc0	str x8,[x19, #0x970]
009b1dc4	ldr x8,[x20, #0x1b0]
009b1dc8	str x8,[x19, #0x938]
009b1dcc	bl 0x00c35be0
009b1dd0	str x0,[x19, #0x4d8]
009b1dd4	cbz x0,0x009b2084
009b1dd8	ldr x1,[x20, #0x1b8]
009b1ddc	bl 0x00c35bd0
009b1de0	ldr w8,[x20, #0x1c0]
009b1de4	str w8,[x19, #0x40]
009b1de8	ldrb w8,[x20, #0x264]
009b1dec	strb w8,[x19, #0xb4c]
009b1df0	ldr q0,[x20, #0x1e0]
009b1df4	str q0,[x19, #0xa10]
009b1df8	ldr x8,[x20, #0x1f0]
009b1dfc	cmp x8,#0x2
009b1e00	str x8,[x19, #0xa20]
009b1e04	b.cc 0x009b1e10
009b1e08	mov w8,#0x1
009b1e0c	str w8,[x19, #0xc60]
009b1e10	ldr x1,[x20, #0x1f8]
009b1e14	cbz x1,0x009b1e20
009b1e18	mov x0,x19
009b1e1c	bl 0x00c35ab0
009b1e20	add x8,x20,#0xa4
009b1e24	ldxr w9,[x8]
009b1e28	add w9,w9,#0x1
009b1e2c	stxr w10,w9,[x8]
009b1e30	cbnz w10,0x009b1e24
009b1e34	add x9,x19,#0xa48
009b1e38	movi v0.2D,#0x0
009b1e3c	str x20,[x19, #0x9a8]
009b1e40	str wzr,[x19, #0xa98]
009b1e44	str q0,[x9]
009b1e48	ldr w9,[x20, #0x260]
009b1e4c	add x10,x19,#0xa74
009b1e50	add x11,x19,#0xa8c
009b1e54	add x12,x19,#0xa84
009b1e58	str w9,[x19, #0xa60]
009b1e5c	str xzr,[x11]
009b1e60	str xzr,[x12]
009b1e64	str q0,[x10]
009b1e68	str wzr,[x19, #0xa94]
009b1e6c	ldxr w9,[x8]
009b1e70	add w9,w9,#0x1
009b1e74	stxr w10,w9,[x8]
009b1e78	cbnz w10,0x009b1e6c
009b1e7c	str x20,[x19, #0xb88]
009b1e80	ldr x0,[x20, #0x270]
009b1e84	cbz x0,0x009b1eac
009b1e88	ldr x1,[x20, #0x268]
009b1e8c	adrp x2,0x2c5000
009b1e90	add x2,x2,#0x652
009b1e94	mov w3,#0x315
009b1e98	bl 0x00c345f0
009b1e9c	str x0,[x19, #0xaa8]
009b1ea0	cbz x0,0x009b20d4
009b1ea4	ldr x8,[x20, #0x268]
009b1ea8	str x8,[x19, #0xaa0]
009b1eac	ldr x0,[x20, #0x280]
009b1eb0	cbz x0,0x009b1edc
009b1eb4	ldr x8,[x20, #0x278]
009b1eb8	adrp x2,0x2c5000
009b1ebc	add x2,x2,#0x652
009b1ec0	mov w3,#0x321
009b1ec4	lsl x1,x8,#0x1
009b1ec8	bl 0x00c345f0
009b1ecc	str x0,[x19, #0xac8]
009b1ed0	cbz x0,0x009b20dc
009b1ed4	ldr x8,[x20, #0x278]
009b1ed8	str x8,[x19, #0xac0]
009b1edc	ldr x8,[x19, #0x9a8]
009b1ee0	str xzr,[x19, #0xb18]
009b1ee4	ldr x9,[x8, #0x2a8]
009b1ee8	cbz x9,0x009b1f24
009b1eec	ldr x0,[x8, #0x2b0]
009b1ef0	adrp x1,0x2c5000
009b1ef4	add x1,x1,#0x652
009b1ef8	mov w2,#0x32e
009b1efc	bl 0x00c32320
009b1f00	str x0,[x19, #0xb08]
009b1f04	cbz x0,0x009b20e4
009b1f08	ldr x8,[x19, #0x9a8]
009b1f0c	ldr x1,[x8, #0x2a8]
009b1f10	ldr x2,[x8, #0x2b0]
009b1f14	bl 0x00c2ffd0
009b1f18	ldr x8,[x19, #0x9a8]
009b1f1c	ldr x8,[x8, #0x2b0]
009b1f20	str x8,[x19, #0xb10]
009b1f24	movi v0.2D,#0x0
009b1f28	str q0,[x19, #0x9b0]
009b1f2c	ldur q0,[x20, #0xb8]
009b1f30	mov w8,#0x1d18
009b1f34	mov w9,#0xffffffff
009b1f38	mov x0,x19
009b1f3c	str q0,[x19,x8]
009b1f40	ldr x8,[x20, #0x8]
009b1f44	str w9,[x19, #0xba4]
009b1f48	add x9,x20,#0x418
009b1f4c	str x8,[x19, #0x8]
009b1f50	ldr q0,[x9]
009b1f54	mov w9,#0x1d88
009b1f58	str q0,[x19,x9]
009b1f5c	ldr x8,[x8, #0x10]
009b1f60	blr x8
009b1f64	cbz w0,0x009b2084
009b1f68	ldr x8,[x20, #0x8]
009b1f6c	adrp x9,0xcb5000
009b1f70	mov x0,x19
009b1f74	ldr x8,[x8, #0x28]
009b1f78	ldr x9,[x9, #0x138]
009b1f7c	cmp x8,x9
009b1f80	cset w8,ne
009b1f84	str w8,[x19, #0x38]
009b1f88	bl 0x009b1998
009b1f8c	cbz w0,0x009b2084
009b1f90	add x2,x19,#0x9c0
009b1f94	mov w0,wzr
009b1f98	mov x1,x19
009b1f9c	bl 0x00c356e0
009b1fa0	cbz w0,0x009b2084
009b1fa4	add x8,x20,#0x2f8
009b1fa8	ldr q0,[x8]
009b1fac	add x8,x19,#0x988
009b1fb0	add x9,x20,#0x308
009b1fb4	str q0,[x8]
009b1fb8	ldr q0,[x9]
009b1fbc	add x8,x19,#0x998
009b1fc0	str q0,[x8]
009b1fc4	ldr q0,[x20, #0x430]
009b1fc8	mov w8,#0x1d98
009b1fcc	str q0,[x19,x8]
009b1fd0	str xzr,[x19, #0x1d28]
009b1fd4	ldp x21,x20,[x20, #0x1d0]
009b1fd8	cbz x21,0x009b210c
009b1fdc	ldr x0,[x19, #0x9a8]
009b1fe0	mov w1,#0x12
009b1fe4	bl 0x00c359a0
009b1fe8	cbz w0,0x009b20ec
009b1fec	bl 0x00c342a0
009b1ff0	adrp x0,0x2c5000
009b1ff4	adrp x2,0x2b1000
009b1ff8	add x0,x0,#0x652
009b1ffc	add x2,x2,#0xf19
009b2000	mov w1,#0x1439
009b2004	bl 0x00c342b0
009b2008	mov w0,#0x14
009b200c	mov w1,#0xce
009b2010	mov x2,xzr
009b2014	bl 0x00c342c0
009b2018	b 0x009b2084
009b201c	bl 0x00c342a0
009b2020	adrp x0,0x2c5000
009b2024	adrp x2,0x2ab000
009b2028	add x0,x0,#0x652
009b202c	add x2,x2,#0xcaa
009b2030	mov w1,#0x2b4
009b2034	bl 0x00c342b0
009b2038	mov w0,#0x14
009b203c	mov w1,#0xc3
009b2040	b 0x009b20b4
009b2044	bl 0x00c342a0
009b2048	adrp x0,0x2c5000
009b204c	adrp x2,0x2ab000
009b2050	add x0,x0,#0x652
009b2054	add x2,x2,#0xcaa
009b2058	mov w1,#0x2b8
009b205c	bl 0x00c342b0
009b2060	mov w0,#0x14
009b2064	mov w1,#0xe4
009b2068	b 0x009b20b4
009b206c	adrp x1,0x2c5000
009b2070	add x1,x1,#0x652
009b2074	mov w2,#0x2c3
009b2078	mov x0,x19
009b207c	bl 0x00c32310
009b2080	mov x19,xzr
009b2084	mov x0,x19
009b2088	bl 0x009b21d8
009b208c	bl 0x00c342a0
009b2090	adrp x0,0x2c5000
009b2094	adrp x2,0x2ab000
009b2098	add x0,x0,#0x652
009b209c	add x2,x2,#0xcaa
009b20a0	mov w1,#0x364
009b20a4	bl 0x00c342b0
009b20a8	mov w1,#0x100
009b20ac	mov w0,#0x14
009b20b0	movk w1,#0xc, LSL #16
009b20b4	mov x2,xzr
009b20b8	bl 0x00c342c0
009b20bc	mov x19,xzr
009b20c0	mov x0,x19
009b20c4	ldp x29,x30,[sp, #0x20]
009b20c8	ldp x20,x19,[sp, #0x10]
009b20cc	ldr x21,[sp], #0x30
009b20d0	ret
009b20d4	str xzr,[x19, #0xaa0]
009b20d8	b 0x009b2084
009b20dc	str xzr,[x19, #0xac0]
009b20e0	b 0x009b2084
009b20e4	str xzr,[x19, #0xb10]
009b20e8	b 0x009b2084
009b20ec	ldr x8,[x19, #0x8]
009b20f0	mov w1,#0x41
009b20f4	mov w2,#0x1
009b20f8	mov x0,x19
009b20fc	ldr x8,[x8, #0x80]
009b2100	mov x3,xzr
009b2104	blr x8
009b2108	cbz x0,0x009b2084
009b210c	str x21,[x19, #0xb68]
009b2110	str x20,[x19, #0xb70]
009b2114	b 0x009b20c0
