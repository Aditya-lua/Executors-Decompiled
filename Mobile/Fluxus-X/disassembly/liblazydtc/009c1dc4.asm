; FUN_009c1dc4 @ 009c1dc4
009c1dc4	stp x20,x19,[sp, #-0x20]!
009c1dc8	cmn w1,#0x1
009c1dcc	mov x19,x0
009c1dd0	stp x29,x30,[sp, #0x10]
009c1dd4	add x29,sp,#0x10
009c1dd8	b.eq 0x009c1e38
009c1ddc	cmp w1,#0x8
009c1de0	mov x0,xzr
009c1de4	b.hi 0x009c1ed4
009c1de8	ldr x8,[x19, #0x8]
009c1dec	ldr x8,[x8, #0xc0]
009c1df0	ldr w8,[x8, #0x60]
009c1df4	and w8,w8,#0x2
009c1df8	orr w8,w8,w1
009c1dfc	cbz w8,0x009c1eb0
009c1e00	adrp x8,0x74c000
009c1e04	add x8,x8,#0xdc8
009c1e08	ldrh w1,[x8, w1, SXTW #0x1]
009c1e0c	mov x0,x19
009c1e10	bl 0x009c21e4
009c1e14	cbz x0,0x009c1ed4
009c1e18	ldr w8,[x0, #0xc]
009c1e1c	mov x20,x0
009c1e20	cbz w8,0x009c1eb8
009c1e24	ldr x0,[x19, #0x9a8]
009c1e28	ldr w1,[x20, #0x10]
009c1e2c	bl 0x00c34a20
009c1e30	cbnz x0,0x009c1eb8
009c1e34	b 0x009c1ed4
009c1e38	ldr w8,[x19, #0x38]
009c1e3c	cbz w8,0x009c1ee0
009c1e40	mov x0,xzr
009c1e44	bl 0x00c35130
009c1e48	cbz x0,0x009c1e64
009c1e4c	ldr x8,[x19, #0x2e0]
009c1e50	ldr w9,[x0, #0x4]
009c1e54	mov w1,wzr
009c1e58	ldr w8,[x8, #0x20]
009c1e5c	tst w8,w9
009c1e60	b.ne 0x009c1ddc
009c1e64	mov w0,#0x1
009c1e68	bl 0x00c35130
009c1e6c	cbz x0,0x009c1f00
009c1e70	ldr x8,[x19, #0x2e0]
009c1e74	ldr w9,[x0, #0x4]
009c1e78	ldr w8,[x8, #0x20]
009c1e7c	tst w8,w9
009c1e80	b.eq 0x009c1f00
009c1e84	mov w1,#0x1
009c1e88	cmp w1,#0x4
009c1e8c	b.eq 0x009c1f2c
009c1e90	cmp w1,#0x5
009c1e94	b.ne 0x009c1ddc
009c1e98	ldr x8,[x19, #0x898]
009c1e9c	ldr x8,[x8, #0x118]
009c1ea0	cmp x8,#0x0
009c1ea4	mov w8,#0x5
009c1ea8	cinc w1,w8,ne
009c1eac	b 0x009c1de8
009c1eb0	adrp x20,0xc58000
009c1eb4	add x20,x20,#0x180
009c1eb8	mov w1,#0xb
009c1ebc	movk w1,#0x5, LSL #16
009c1ec0	mov x0,x19
009c1ec4	mov x2,x20
009c1ec8	bl 0x009c3c60
009c1ecc	cmp w0,#0x0
009c1ed0	csel x0,xzr,x20,eq
009c1ed4	ldp x29,x30,[sp, #0x10]
009c1ed8	ldp x20,x19,[sp], #0x20
009c1edc	ret
009c1ee0	ldr x8,[x19, #0x898]
009c1ee4	ldr x9,[x8], #0x20
009c1ee8	sub x8,x9,x8
009c1eec	mov w9,#0xcccd
009c1ef0	lsr x8,x8,#0x3
009c1ef4	movk w9,#0xcccc, LSL #16
009c1ef8	mul w1,w8,w9
009c1efc	b 0x009c1ddc
009c1f00	mov w0,#0x2
009c1f04	bl 0x00c35130
009c1f08	cbz x0,0x009c1f44
009c1f0c	ldr x8,[x19, #0x2e0]
009c1f10	ldr w9,[x0, #0x4]
009c1f14	ldr w8,[x8, #0x20]
009c1f18	tst w8,w9
009c1f1c	b.eq 0x009c1f44
009c1f20	mov w1,#0x2
009c1f24	cmp w1,#0x4
009c1f28	b.ne 0x009c1e90
009c1f2c	ldr x8,[x19, #0x2e0]
009c1f30	ldr w8,[x8, #0x20]
009c1f34	cmp w8,#0x20
009c1f38	b.ne 0x009c1fa4
009c1f3c	mov w1,#0x4
009c1f40	b 0x009c1de8
009c1f44	orr w0,wzr,#0x3
009c1f48	bl 0x00c35130
009c1f4c	cbz x0,0x009c1f74
009c1f50	ldr x8,[x19, #0x2e0]
009c1f54	ldr w9,[x0, #0x4]
009c1f58	ldr w8,[x8, #0x20]
009c1f5c	tst w8,w9
009c1f60	b.eq 0x009c1f74
009c1f64	orr w1,wzr,#0x3
009c1f68	cmp w1,#0x4
009c1f6c	b.ne 0x009c1e90
009c1f70	b 0x009c1f2c
009c1f74	mov w0,#0x4
009c1f78	bl 0x00c35130
009c1f7c	cbz x0,0x009c1fb8
009c1f80	ldr x8,[x19, #0x2e0]
009c1f84	ldr w9,[x0, #0x4]
009c1f88	ldr w8,[x8, #0x20]
009c1f8c	tst w8,w9
009c1f90	b.eq 0x009c1fb8
009c1f94	mov w1,#0x4
009c1f98	cmp w1,#0x4
009c1f9c	b.ne 0x009c1e90
009c1fa0	b 0x009c1f2c
009c1fa4	ldr x8,[x19, #0x898]
009c1fa8	ldr x9,[x8, #0x118]
009c1fac	cbz x9,0x009c2018
009c1fb0	orr w1,wzr,#0x6
009c1fb4	b 0x009c1de8
009c1fb8	mov w0,#0x5
009c1fbc	bl 0x00c35130
009c1fc0	cbz x0,0x009c1fe8
009c1fc4	ldr x8,[x19, #0x2e0]
009c1fc8	ldr w9,[x0, #0x4]
009c1fcc	ldr w8,[x8, #0x20]
009c1fd0	tst w8,w9
009c1fd4	b.eq 0x009c1fe8
009c1fd8	mov w1,#0x5
009c1fdc	cmp w1,#0x4
009c1fe0	b.ne 0x009c1e90
009c1fe4	b 0x009c1f2c
009c1fe8	orr w0,wzr,#0x6
009c1fec	bl 0x00c35130
009c1ff0	cbz x0,0x009c202c
009c1ff4	ldr x8,[x19, #0x2e0]
009c1ff8	ldr w9,[x0, #0x4]
009c1ffc	ldr w8,[x8, #0x20]
009c2000	tst w8,w9
009c2004	b.eq 0x009c202c
009c2008	orr w1,wzr,#0x6
009c200c	cmp w1,#0x4
009c2010	b.ne 0x009c1e90
009c2014	b 0x009c1f2c
009c2018	ldr x8,[x8, #0xf0]
009c201c	cmp x8,#0x0
009c2020	mov w8,#0x4
009c2024	cinc w1,w8,ne
009c2028	b 0x009c1de8
009c202c	orr w0,wzr,#0x7
009c2030	bl 0x00c35130
009c2034	cbz x0,0x009c205c
009c2038	ldr x8,[x19, #0x2e0]
009c203c	ldr w9,[x0, #0x4]
009c2040	ldr w8,[x8, #0x20]
009c2044	tst w8,w9
009c2048	b.eq 0x009c205c
009c204c	orr w1,wzr,#0x7
009c2050	cmp w1,#0x4
009c2054	b.ne 0x009c1e90
009c2058	b 0x009c1f2c
009c205c	mov w0,#0x8
009c2060	mov w20,#0x8
009c2064	bl 0x00c35130
009c2068	cbz x0,0x009c208c
009c206c	ldr x8,[x19, #0x2e0]
009c2070	ldr w9,[x0, #0x4]
009c2074	ldr w8,[x8, #0x20]
009c2078	tst w8,w9
009c207c	csinv w1,w20,wzr,ne
009c2080	cmp w1,#0x4
009c2084	b.ne 0x009c1e90
009c2088	b 0x009c1f2c
009c208c	mov w1,#0xffffffff
009c2090	cmp w1,#0x4
009c2094	b.ne 0x009c1e90
009c2098	b 0x009c1f2c
